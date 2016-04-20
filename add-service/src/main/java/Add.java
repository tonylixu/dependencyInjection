import com.google.inject.ImplementedBy;

/**
 * Created by txu on 2016-04-19.
 */
@ImplementedBy(CrazyAdd.class)
public interface Add
{
    public int add(int a, int b);
}
