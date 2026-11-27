package org.example.Questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.example.Pages.HomePage;

public class LoginExitoso {
    public static Question<Boolean> isTitleVisible(){
        return actor -> Visibility.of(HomePage.LOGGED_IN_AS).answeredBy(actor);
    }
}
