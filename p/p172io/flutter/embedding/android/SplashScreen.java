package p172io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

@Deprecated
/* renamed from: io.flutter.embedding.android.SplashScreen */
public interface SplashScreen {
    View createSplashView(Context context, Bundle bundle);

    boolean doesSplashViewRememberItsTransition();

    Bundle saveSplashScreenState();

    void transitionToFlutter(Runnable runnable);
}
