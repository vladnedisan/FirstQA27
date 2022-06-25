public class LogicalOperations {

    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals(" FastTrackIT ") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals(" FastTrackIT ") && number >= 4) {
            return (number + textInput);
        }
        return "Number or text is not in range";
    }

    public String TextComparison(String textInput) {
        if (textInput.equals(" FastTrackIT ")) {
            return ("Learning text comparison");
        } else
            return "Got to try some more";
    }

    public String BiggerSnow(int number2) {
        if (number2 > 8 || number2 == 6) {
            return ("The amount of snow this winter was(cm):" + number2);
        } else
            return ("The forecast snow is(cm)" + number2);
    }

    public String BiggerNumber(int number3) {
        if (number3 > 3 && number3 != 4) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (number3 == 4) {
            return ("The number is equal to 4");
        } else if (number3 < 3) {
        }
        return ("The number is lower than 3");
    }

    public String ReturnNumber(int returnNr) {
        switch (returnNr) {
            case 1:
                return "The number is 1";
            case 2:
                return "The number is 2";
            case 3:
                return "The number is 3";
            case 4:
                return "The number is 4";
            case 5:
                return "The number is 5";
            case 6:
                return "The number is 6";
            case 7:
                return "The number is 7";
            case 8:
                return "The number is 8";
            case 9:
                return "The number is 9";
            case 10:
                return "The number is 10";
            default:
                return "The number is not in the required range";
        }
    }

    public boolean isNumberEven(int num) {

        if (num % 2 == 0) {
            return true;
        } else
            return false;
    }

    public boolean isEligibleToVote(int age) {
        if (age > 18) {
            return true;
        } else
            return false;
    }

    public int GreatNumber7(int num11, int num12, int num13) {
        int max = num11;

        if (num12 > max) {
            max = num12;
        }

        if (num13 > max) {
            max = num13;
        }

        return max;
    }
}
