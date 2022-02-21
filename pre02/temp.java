//define the variables
    int guess;
    int difference;
    Scanner in = new Scanner(System.in);

    //prompt the user for a Celcius temp with one decimal place
    System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is? ");
    System.out.print("Type a number: ");
    guess = in.nextInt();

    //difference calculation
    difference = number - guess;
    System.out.println(difference);