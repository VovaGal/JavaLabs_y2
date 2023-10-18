public class Orders {

    private String[][] info = {{"shoe", "dog", "poo"},
            {"Moscow", "London", "Bristol"},
            {"80$", "100$", "20000$"}};

    public String[][] getInfo() {
        return info.clone();
    }
}
