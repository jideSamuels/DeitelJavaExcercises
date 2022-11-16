package chapterFour;

public class TestDriller {
    public int jambPractice(int numberOfCopies) {
        int amount = 0;

        if (numberOfCopies >= 1 && numberOfCopies <= 4) {
            amount = numberOfCopies * 2000;

        } else if (numberOfCopies >= 5 && numberOfCopies <= 9) {
            amount = numberOfCopies * 1900;
        } else if (numberOfCopies >= 10 && numberOfCopies <= 29) {
            amount = numberOfCopies * 1600;
        } else if (numberOfCopies >= 30 && numberOfCopies <= 49) {
            amount = numberOfCopies * 1500;
        } else if (numberOfCopies >= 50 && numberOfCopies <= 99) {
            amount = numberOfCopies * 1300;
        }else if (numberOfCopies >= 100 && numberOfCopies <= 199) {
            amount = numberOfCopies * 1200;
        }else if (numberOfCopies >= 200 && numberOfCopies <= 499) {
            amount = numberOfCopies * 1100;
        }else if (numberOfCopies >= 500) {
            amount = numberOfCopies * 1000;
        }

        return amount;
    }
}
