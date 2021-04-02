package co.com.choucairempleos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchJobsPage {
    public static final Target KEYWORDS = Target.the("Writer Keywords").located(By.id("search_keywords"));
    public static final Target LOCATION = Target.the("").located(By.id("search_location"));
    public static final Target SEARCH_JOB = Target.the("").located(By.xpath("//div[@class=\"search_submit\"]/input"));
    public static final Target SELECT_JOBS = Target.the("").located(By.xpath("//html/body/div[2]/div[3]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/ul/li/a/div[1]/h3"));
    public static final Target VERIFY_JOBS = Target.the("").located(By.xpath("//header[@class=\"entry-header\"]/h1"));

}
