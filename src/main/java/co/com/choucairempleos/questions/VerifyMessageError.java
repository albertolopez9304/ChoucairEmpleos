package co.com.choucairempleos.questions;

import co.com.choucairempleos.userinterface.RegisterForApplyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyMessageError implements Question<Boolean> {

    private String messageFailed;

    public VerifyMessageError(String messageFailed) {
        this.messageFailed = messageFailed;
    }

    public static VerifyMessageError with(String messageFailed) {
        return new VerifyMessageError(messageFailed);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String expectedMessageFailed = Text.of(RegisterForApplyPage.CV_IS_REQUIRED).viewedBy(actor).asString();

        return (expectedMessageFailed.equals(messageFailed));
    }
}
