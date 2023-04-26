import java.time.LocalDate;

    public class Person {
        public void sayHello(){
            System.out.println("Hello!");
        }

        public void saySomething(String message){

        }

        public static void main(String[] args) {
            Person person = new Person();
            person.sayHello();
        }
}
