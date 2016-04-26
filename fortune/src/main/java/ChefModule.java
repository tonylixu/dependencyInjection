import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;

/**
 * Created by txu on 2016-04-26.
 */
public class ChefModule implements Module
{
    public void configure(Binder binder)
    {
        // Bind FortuneService to FortuneServiceImpl in singleton scope
        binder.bind(FortuneService.class)
                .to(FortuneServiceImpl.class)
                .in(Scopes.SINGLETON);
    }
}
