public class HelloApp {

    public static void main(String[] args) {

        String name;

        // Default case
        if (args.length == 0) {
            name = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String arg : args) {
                nameBuilder.append(arg).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                name = "";
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}