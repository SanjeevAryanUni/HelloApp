public class HelloApp {

    public static void main(String[] args) {

        String name;

        // If no arguments → default
        if (args.length == 0) {
            name = "World";
        } else {
            // Combine all names using comma
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}