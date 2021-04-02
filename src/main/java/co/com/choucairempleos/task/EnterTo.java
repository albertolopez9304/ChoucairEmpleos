package co.com.choucairempleos.task;

import static co.com.choucairempleos.userinterface.EnterToMenuPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterTo implements Task {
    private EnterTo enterTo;
    public static EnterTo theMenu() {
        return Tasks.instrumented(EnterTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ENTERMENUJOBS));

    }
}
