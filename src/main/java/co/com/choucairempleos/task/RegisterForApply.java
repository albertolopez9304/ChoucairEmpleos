package co.com.choucairempleos.task;

import co.com.choucairempleos.model.ApplyForJobsData;
import static co.com.choucairempleos.userinterface.RegisterForApplyPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class RegisterForApply implements Task {

    private ApplyForJobsData applyForJobsData;

    public RegisterForApply(ApplyForJobsData applyForJobsData) {this.applyForJobsData = applyForJobsData;}


    public static RegisterForApply onThePageWith(ApplyForJobsData applyForJobsData) {
        return Tasks.instrumented(RegisterForApply.class, applyForJobsData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SCROLL),
                Click.on(APPLY_FOR_JOB),
                Enter.theValue(applyForJobsData.getName()).into(FULL_NAME),
                Enter.theValue(applyForJobsData.getEmail()).into(EMAIL),
                Enter.theValue(applyForJobsData.getPhone()).into(PHONE),
                Enter.theValue(applyForJobsData.getFormalStudies()).into(FORMAL_STUDIES),
                Enter.theValue(applyForJobsData.getCertifiedExperience()).into(EXPERIENCE),
                Enter.theValue(applyForJobsData.getKnowAutomation()).into(KNOW_AUTOMATION),
                Enter.theValue(applyForJobsData.getWageAspiration()).into(SALARY),
                Enter.theValue(applyForJobsData.getTimeAvailability()).into(AVAILABILITY),
                Enter.theValue(applyForJobsData.getAdditionalMessage()).into(MESSAGE),
                Scroll.to(AVAILABILITY),
                Click.on(SEND_APLICATION)
    );

    }
}
