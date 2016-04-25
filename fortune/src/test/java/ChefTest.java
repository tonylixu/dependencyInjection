import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by txu on 2016-04-25.
 */
public class ChefTest
{
    @Test
    public void makeFortuneCookie()
    {
        FortuneServiceMock mock = new FortuneServiceMock();
        Chef chef = new Chef(mock);
        chef.makeFortuneCookie();
        assertTrue(mock.calledOnce());

    }

    class FortuneServiceMock implements FortuneService
    {
        private int invocationCount;

        public String randomFortune()
        {
            invocationCount++;
            return "MOCK";
        }

        public boolean calledOnce()
        {
            return invocationCount == 1;
        }
    }
}
