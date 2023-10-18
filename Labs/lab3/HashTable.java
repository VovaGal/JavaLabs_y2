import java.util.Enumeration;
import static java.util.Objects.hash;

public class HashTable {
    public static void main(String[] args) {

    }

    private HashNode[] buckets; /// each node or orderNum-clientInfo pair is inside a bucket
    private int numOfBuckets; /// capacity
    private int size; /// number of orderNum clientInfo pairs
    public HashTable() {
        this(10); /// default capacity
    }
    public HashTable(int capacity) {
        this.numOfBuckets = capacity;
        buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private class HashNode {
        private Integer orderNum;
        private String clientInfo;
        private HashNode next;

        public HashNode(Integer orderNum, String clientInfo) {
            this.orderNum = orderNum;
            this.clientInfo = clientInfo;
        }
    } /// sets each bucket

    public String get(Integer orderNum) {
        if (orderNum == null) {
            throw new IllegalArgumentException("orderNum is null");
        }
        int bucketIndex = getBucketIndex(orderNum);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.orderNum.equals(orderNum)) {
                return head.clientInfo;
            }
            head = head.next;
        }

        return null;
    }

    private int getBucketIndex(Integer orderNum) {
        return orderNum % numOfBuckets; /// convert order number to bucket length == buckets.length
    }
    public void put(Integer orderNum, String clientInfo) {
        if (orderNum == null || clientInfo == null) {
            throw new IllegalArgumentException("orderNum or clientInfo is null");
        }
        int bucketIndex = getBucketIndex(orderNum);
        HashNode head = buckets[bucketIndex];
        while (head != null) {
            if (head.orderNum.equals(orderNum)) {
                head.clientInfo = clientInfo;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(orderNum, clientInfo); /// (orderNum, clientInfo) -> null
        node.next = head;
        buckets[bucketIndex] = node;
    }
    public String remove(Integer orderNum) {
        if (orderNum == null) {
            throw new IllegalArgumentException("orderNum is already null");
        }

        int bucketIndex = getBucketIndex(orderNum);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;

        while (head != null) {
            if (head.orderNum.equals(orderNum)) {
                break;
            }
            previous = head;
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            buckets[bucketIndex] = head.next;
        }

        return head.clientInfo;
    }
    public int size() {
        return size;
    } /// return number of orderNum-clientInfo items in table
    public boolean isEmpty()
    {
        return size == 0;
    } /// true if no orderNum-clientInfo mappings
}

