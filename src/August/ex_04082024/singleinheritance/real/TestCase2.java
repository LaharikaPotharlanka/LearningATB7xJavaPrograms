package August.ex_04082024.singleinheritance.real;

public class TestCase2 extends BaseTest {
    void testCase2(){
        startBrowser();// BaseTest
        getDataFromSQL(); // GrandBaseTest
        System.out.println(gold); // GrandBaseTest
        // Here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}
//Testcase2->TestCase->BaseTest->GrandBaseTest
//Staring Browser!!
//MYSQL Connected
//3
//Closing Browser!!