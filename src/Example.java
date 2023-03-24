public class Example {
    public static void main(String[] args) {
//        Box box = new Box("water");
//        box.container = 213;
//        System.out.println(box.getValue());

        Box<String> box = new Box<>("Wow, this is string");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<Integer> box1 = new Box<>(12);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

//        box.container = 123; // error
        Box<Boolean> box2 = new Box<>(true);
        System.out.println(box2.getValue());

        box.performSomeTask();
        box1.performSomeTask();
    }
}
