public class Button implements Clickable {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void click() {
        System.out.println("Нажать кнопку " + name);
    }
}
