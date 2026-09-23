import com.microsoft.playwright.*;

public class Login_Revision {

    public static void main(String[] args) {

        try(Playwright obj_Playwright = Playwright.create()) {

            Browser obj_Browser = obj_Playwright.chromium()
                    .launch(new BrowserType.LaunchOptions().setHeadless(false));

            BrowserContext obj_Context = obj_Browser.newContext();

            Page obj_Page = obj_Context.newPage();

            obj_Page.navigate("file:///c%3A/Users/CCST/Desktop/Playwright/PlaywrightMaterial/login.html");

            Locator obj_username = obj_Page.locator("#username");
            obj_username.fill("admin");

            Locator obj_password = obj_Page.locator("#password");
            obj_password.fill("admin");

            Thread.sleep(2000);

            Locator obj_Signin = obj_Page.locator("//button[@data-testid = 'submit-btn']");
            obj_Signin.click();



            obj_Browser.close();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
