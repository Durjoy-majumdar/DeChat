package bl3;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* renamed from: bl3.g */
public interface C16795g {
    void onActivityResult(int i, int i2, Intent intent);

    boolean onBackPressed();

    void onBeforeFinish(Intent intent);

    void onConfigurationChanged(Configuration configuration);

    void onCreateAfter(Bundle bundle);

    void onCreateBefore(Bundle bundle);

    void onDestroy();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    boolean onKeyUp(int i, KeyEvent keyEvent);

    void onNewIntent(Intent intent);

    void onPause();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onRestoreInstanceState(Bundle bundle);

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();
}
