package co.com.choucairempleos.task;

import co.com.choucairempleos.model.DataUser;
import static co.com.choucairempleos.userinterface.SearchJobsPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class SearchJobs implements Task {

    private DataUser dataKeywords;

    public SearchJobs(DataUser dataKeywords) {
        this.dataKeywords = dataKeywords;
    }

    public static SearchJobs withKeywords(DataUser dataKeywords) {
        return Tasks.instrumented(SearchJobs.class, dataKeywords);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(dataKeywords.getKeywords()).into(KEYWORDS),
                Enter.theValue(dataKeywords.getCity()).into(LOCATION),
                Click.on(SEARCH_JOB),
                Click.on(SELECT_JOBS)
        );

    }
}
