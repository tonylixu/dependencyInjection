import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by txu on 2016-04-25.
 */
public class FortuneServiceImpl implements FortuneService
{
    private static final List<String> MESSAGES =
            Arrays.asList(
                    "Today you will have some refreshing juice.",
                    "Larry just bought your company."
            );

    public String randomFortune()
    {
        return MESSAGES.get(new Random().nextInt(MESSAGES.size()));
    }
}
