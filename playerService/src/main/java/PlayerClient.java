import com.google.inject.*;
import com.google.inject.name.Named;

@Singleton
public class PlayerClient
{
    @Named("Good")
    @Inject
    Player player;

    public static void main(String[] args)
    {
        PlayerModule module = new PlayerModule();
        Injector injector = Guice.createInjector(new Module[]{module});

        PlayerClient player_client = injector.getInstance(PlayerClient.class);
        player_client.player.bat();
        player_client.player.bowl();
    }
}