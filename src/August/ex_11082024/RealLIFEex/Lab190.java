package August.ex_11082024.RealLIFEex;

public class Lab190 {
    public static void main(String[] args) {
        Chrome c = new Chrome();
        String s = c.openBrowser("Chrome");
        System.out.println(s);
        c.closeBrowser("Chrome");

        Firefox f = new Firefox();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takeScreenShot();
    }
}
//Open the Chrome .....,         // This is code releted to chrome only
//
//Chrome
//Open the FIREFOX .....,         // This is code releted to FIREFOX only
//
//Closing the FIREFOX .....,         // This is code releted to FIREFOX only
//
//Ok Taking ScreenShot