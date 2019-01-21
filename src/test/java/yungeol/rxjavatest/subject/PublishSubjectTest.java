package yungeol.rxjavatest.subject;

import io.reactivex.subjects.PublishSubject;
import org.junit.Test;

public class PublishSubjectTest {
    @Test
    public void test() {
        PublishSubject publishSubject = PublishSubject.create();
        publishSubject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        publishSubject.onNext("1");
        publishSubject.onNext("2");
        publishSubject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        publishSubject.onNext("3");
        publishSubject.onComplete();
    }
}
