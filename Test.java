import java.util.*;
import java.io.*;

class Test {

    static int randomIndex(int arrayLen) {
        int rnd = new Random().nextInt(arrayLen);
        return rnd;
    }

    static void appopener(String input) {
        Runtime runtime = Runtime.getRuntime();

        try {
            runtime.exec(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("  Welcome to SmartChat");
        System.out.println("========================\n");

        String[] greetMethods = { "Hi", "Hii", "Hello", "Hey", "Hie", "Hola", "Holla", "Salute" };

        String[] jokesMethod = { "What do kids play when their mom is using the phone? Bored games.",
                "What do you call an ant who fights crime? A vigilANTe!",
                "Why are snails slow? Because they’re carrying a house on their back.",
                "What’s the smartest insect? A spelling bee!",
                "What does a storm cloud wear under his raincoat? Thunderwear",
                "What is fast, loud and crunchy? A rocket chip.",
                "How does the ocean say hi? It waves!",
                "What do you call a couple of chimpanzees sharing an Amazon account? PRIME-mates.",
                "Why did the teddy bear say no to dessert? Because she was stuffed.",
                "Why did the soccer player take so long to eat dinner? Because he thought he couldn’t use his hands.",
                "Name the kind of tree you can hold in your hand? A palm tree!",
                "What do birds give out on Halloween? Tweets.",
                "What has ears but cannot hear? A cornfield.",
                "What’s a cat’s favorite dessert? A bowl full of mice-cream.",
                "Where did the music teacher leave her keys? In the piano!",
                "What did the policeman say to his hungry stomach? Freeze. You’re under a vest.",
                "What did the left eye say to the right eye? Between us, something smells!",
                "What do you call a guy who’s really loud? Mike.",
                "Why do birds fly south in the winter? It’s faster than walking!",
                "What did the lava say to his girlfriend? I lava you!",
                "Why did the student eat his homework? Because the teacher told him it was a piece of cake.",
                "What did Yoda say when he saw himself in 4k? HDMI.",
                "Which superhero hits home runs? Batman!",
                "What’s Thanos’ favorite app on his phone? Snapchat.",
                "Sandy’s mum has four kids; North, West, East. What is the name of the fourth child? Sandy, obviously!",
                "What is a room with no walls? A mushroom.",
                "Why did the blue jay get in trouble at school? For tweeting on a test!",
                "What social event do spiders love to attend? Webbings.",
                "What did one pickle say to the other? Dill with it.",
                "What is brown, hairy and wears sunglasses? A coconut on vacation.",
                "Why is a football stadium always cold? It has lots of fans!",
                "What did one math book say to the other? I’ve got so many problems.",
                "What did the Dalmatian say after lunch? That hit the spot!",
                "What do you call two bananas on the floor? Slippers.",
                "Why did the chicken cross the playground? To get to the other slide.",
                "Why do ducks have feathers on their tails? To cover their buttquacks.",
                "How does a vampire start a letter? Tomb it may concern…",
                "A plane crashed in the jungle and every single person died. Who survived? Married couples.",
                "What kind of math do birds love? Owl-gebra!",
                "Why can’t you ever tell a joke around glass? It could crack up.",
                "What do you call a Star Wars droid that takes the long way around? R2 detour.",
                "How do you stop an astronaut’s baby from crying? You rocket.",
                "Why did the scarecrow win a Nobel prize? Because she was outstanding in her field.",
                "How do you know when a bike is thinking? You can see their wheels turning.",
                "Why was 6 afraid of 7? Because 7,8,9.",
                "What goes up and down but doesn’t move? The staircase.",
                "What kind of shoes do frogs love? Open-toad!",
                "How did the baby tell his mom he had a wet diaper? He sent her a pee-mail.",
                "What is a witch’s favorite subject in school? Spelling.",
                "What’s brown and sticky? A stick." };

        while (true) {
            System.out.print("How can i help you? ");
            String str = sc.nextLine();
            str = str.toLowerCase();

            switch (str) {
                case "hello":
                case "hey":
                case "hi":
                case "hie":
                case "hola":
                    System.out.println(greetMethods[randomIndex(greetMethods.length)]);
                    break;
                case "how are you":
                    System.out.println("I'm fine!");
                    break;
                case "addtion of numbers":
                case "addtion of number":
                case "add numbers":
                case "add":
                case "plus":
                    System.out.println("Okay\nEnter the two numbers");
                    Integer a1 = sc.nextInt();
                    Integer a2 = sc.nextInt();
                    Integer ans1 = a1 + a2;
                    System.out.println("The addition is:" + ans1);
                    break;
                case "subtraction of numbers":
                case "subtraction of number":
                case "subtract numbers":
                case "subtract":
                case "sub":
                case "minus":
                    System.out.println("Okay\nEnter the two numbers");
                    Integer s1 = sc.nextInt();
                    Integer s2 = sc.nextInt();
                    if (s1 > s2) {
                        Integer subans1 = s1 - s2;
                        System.out.println("The subtraction of numbers :" + subans1);
                        break;
                    } else {
                        Integer subans1 = s2 - s1;
                        System.out.println("The subtraction of numbers :" + subans1);
                        break;
                    }

                case "jokes":
                case "tell me a joke":
                case "make me laugh":
                case "im sad":
                case "i'm sad":
                    System.out.println(jokesMethod[randomIndex(jokesMethod.length)]);
                    break;
                case "exit":
                case "quit":
                case "close":
                case "shut down":
                    System.out.println("Byee !!");
                    java.lang.System.exit(0);
                    break;

                case "run":
                case "run apps":
                case "run app":
                case "start apps":
                case "start app":
                    System.out.println("Enter the name of app:");
                    String appName = sc.nextLine();
                    appopener(appName);
                    break;

                default:
                    System.out.println("Sorry i didnt got that one!");
                    break;
            }
        }
    }

}