package n33;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.component.UIComponent;
import java.util.HashSet;

/* renamed from: n33.a */
public interface C109681a {
    void dealContentView(View view);

    void finish();

    int getForceOrientation();

    int getLayoutId();

    void importUIComponents(HashSet<Class<? extends UIComponent>> hashSet);

    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    void onNewIntent(Intent intent);

    void onPause();

    void onPostResume();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onResume();

    void onStart();

    void onStop();

    void onSwipeBackFinish();

    void onTrimMemory(int i);

    boolean onUserLeaveHint();
}
