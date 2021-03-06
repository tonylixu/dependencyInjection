import com.google.inject.Inject;

/**
 * Created by txu on 2016-04-25.
 */
public class Chef
{
    private final FortuneService fortuneService;

    @Inject
    public Chef(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    public void makeFortuneCookie()
    {
        new FortuneCookie(fortuneService.randomFortune());
    }
}
