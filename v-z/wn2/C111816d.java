package wn2;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: wn2.d */
public class C111816d extends C111814b {
    public C111816d(C111818f fVar) {
    }

    /* renamed from: a */
    public Intent mo163518a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity"));
        intent.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
        return intent;
    }
}
