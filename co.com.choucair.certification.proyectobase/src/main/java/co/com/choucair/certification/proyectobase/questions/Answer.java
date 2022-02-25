package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage.NAME_COURSE;

public class Answer implements Question<Boolean> {

    private  String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nameCourse= Text.of(NAME_COURSE).answeredBy(actor);

        return question.equals(nameCourse);
    }
}
