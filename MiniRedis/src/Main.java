import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedisCore redis = new RedisCore();
        ExpiryManager expiry = new ExpiryManager();
        Scanner sc = new Scanner(System.in);

        System.out.println("MiniRedis Started! Type EXIT to quit.");

        while (true) {
            System.out.print("redis> ");
            String[] input = sc.nextLine().trim().split(" ");

            if (input[0].equalsIgnoreCase("EXIT")) {
                System.out.println("Exiting MiniRedis...");
                break;
            }

            switch (input[0].toUpperCase()) {
                case "SET":
                    if (input.length < 3) {
                        System.out.println("Usage: SET key value");
                        break;
                    }
                    redis.set(input[1], input[2]);
                    System.out.println("OK");
                    break;

                case "GET":
                    if (expiry.isExpired(input[1])) {
                        redis.del(input[1]);
                        System.out.println("(nil)");
                    } else {
                        System.out.println(redis.get(input[1]));
                    }
                    break;

                // You can add more commands like DEL, TTL, etc.
                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }

        sc.close();
    }
}


