package p172io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C39623j;
import p172io.flutter.embedding.android.ExclusiveAppComponent;

/* renamed from: io.flutter.embedding.engine.plugins.activity.ActivityControlSurface */
public interface ActivityControlSurface {
    void attachToActivity(ExclusiveAppComponent<Activity> exclusiveAppComponent, C39623j jVar);

    void detachFromActivity();

    void detachFromActivityForConfigChanges();

    boolean onActivityResult(int i, int i2, Intent intent);

    void onNewIntent(Intent intent);

    boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void onRestoreInstanceState(Bundle bundle);

    void onSaveInstanceState(Bundle bundle);

    void onUserLeaveHint();
}
