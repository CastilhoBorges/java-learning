package exceptions;

public class Exceptions {
    public static void main(String[] args) {
        try {
            Integer age = 17;
            String response = Exceptions.validateAge(age);
            System.out.println(response);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally Block");
        }
    }

    static String validateAge(Integer age) throws IllegalArgumentException {
        if (age == null) {
            throw new IllegalArgumentException("Age cannot be null.");
        }
        if (age < 18) {
            throw new IllegalArgumentException(age + " is under 18.");
        }
        return "Age is 18 or over.";
    }
}
