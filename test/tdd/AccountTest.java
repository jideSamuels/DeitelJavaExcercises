package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest(){
        // given
        Account deborahAccount = new Account();

        // when i deposit 5000
        deborahAccount.deposit(5000);

        // check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();

        assertEquals(5000, deborahAccountBalance);

    }

    @Test
    public void depositTwiceTest(){
        // given there is an account
        Account deborahAccount = new Account();
        // given that initial balance is 4000
        deborahAccount.deposit( 4000);
        // when i deposit 2000
        deborahAccount.deposit( 2000);
        // check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals( 6000, deborahAccountBalance);
    }

    @Test
        public void depositNegative(){
        // given there is an account
        Account deborahAccount = new Account();
        // given that initial balance is 4000
        deborahAccount.deposit( 4000);
        // when i deposit 2000
        deborahAccount.deposit( -2000);
        // check that balance is 4000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals( 4000, deborahAccountBalance);
    }

    @Test
        public void withdrawalAmountTest() {
        Account deborahAccount = new Account();
        // given that initial balance is 4000
        deborahAccount.deposit(4000);
        // when i withdraw 2000
        deborahAccount.withraw(2000);
        // check that my balance is 2000
        int balance = deborahAccount.getBalance();
        assertEquals(2000, balance);
    }


}
