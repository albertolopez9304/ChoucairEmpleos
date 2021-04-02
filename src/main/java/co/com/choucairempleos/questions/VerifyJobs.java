package co.com.choucairempleos.questions;

import co.com.choucairempleos.userinterface.SearchJobsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyJobs implements Question<Boolean> {

    private String keyword;

    public VerifyJobs(String keyword) {
        this.keyword = keyword;
    }

    public static VerifyJobs with(String keywords) {
        return new VerifyJobs(keywords);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String expectedJobs = Text.of(SearchJobsPage.VERIFY_JOBS).viewedBy(actor).asString();
        System.out.println(keyword);
        System.out.println(expectedJobs);


        return (expectedJobs.equals(keyword));
    }
}
