import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by txu on 2016-04-19.
 */
public class AddModule implements Module
{
    public void configure(Binder binder)
    {
        binder.bind(Add.class).to(SimpleAdd.class);
    }
}