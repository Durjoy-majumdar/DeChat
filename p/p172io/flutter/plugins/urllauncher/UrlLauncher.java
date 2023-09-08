package p172io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import j20.C117292a;
import k20.C9556a;

/* renamed from: io.flutter.plugins.urllauncher.UrlLauncher */
class UrlLauncher {
    private static final String TAG = "UrlLauncher";
    private byte _hellAccFlag_;
    private Activity activity;
    private final Context applicationContext;

    /* renamed from: io.flutter.plugins.urllauncher.UrlLauncher$LaunchStatus */
    public enum LaunchStatus {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    public UrlLauncher(Context context, Activity activity2) {
        this.applicationContext = context;
        this.activity = activity2;
    }

    public boolean canLaunch(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.applicationContext.getPackageManager());
        if (resolveActivity == null) {
            return false;
        }
        resolveActivity.toShortString();
        return !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    public void closeWebView() {
        this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
    }

    public LaunchStatus launch(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return LaunchStatus.NO_ACTIVITY;
        }
        Intent createIntent = z ? WebViewActivity.createIntent(activity2, str, z2, z3, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle);
        try {
            Activity activity3 = this.activity;
            C9556a aVar = new C9556a();
            aVar.mo10233c(createIntent);
            C117292a.m165358d(activity3, aVar.mo10232b(), "io/flutter/plugins/urllauncher/UrlLauncher", "launch", "(Ljava/lang/String;Landroid/os/Bundle;ZZZ)Lio/flutter/plugins/urllauncher/UrlLauncher$LaunchStatus;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity3.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity3, "io/flutter/plugins/urllauncher/UrlLauncher", "launch", "(Ljava/lang/String;Landroid/os/Bundle;ZZZ)Lio/flutter/plugins/urllauncher/UrlLauncher$LaunchStatus;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return LaunchStatus.OK;
        } catch (ActivityNotFoundException unused) {
            return LaunchStatus.ACTIVITY_NOT_FOUND;
        }
    }

    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }
}
