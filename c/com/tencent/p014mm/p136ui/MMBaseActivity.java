package com.tencent.p014mm.p136ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.WindowManager;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.AndroidOSafety;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C88989a;
import p1067yj.C91461a;

@C88989a(3)
/* renamed from: com.tencent.mm.ui.MMBaseActivity */
public class MMBaseActivity extends HellActivity {

    /* renamed from: d */
    public boolean f249920d;

    public final Resources getOriginalResources() {
        return super.getResources();
    }

    public Resources getResources() {
        return (getAssets() == null || MMApplicationContext.getResources() == null) ? super.getResources() : MMApplicationContext.getResources();
    }

    public Object getSystemService(String str) {
        Object systemService = super.getSystemService(str);
        return (getAssets() == null || !"layout_inflater".equals(str)) ? systemService : C85868k2.m106138c((LayoutInflater) systemService);
    }

    public WindowManager getWindowManager() {
        if (!isDestroyed()) {
            return super.getWindowManager();
        }
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 2 && stackTrace[1].getMethodName().equals("handleDestroyActivity")) {
                return C91461a.m114761a(super.getWindowManager());
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.MMBaseActivity", th.getMessage());
        }
        return super.getWindowManager();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        this.f249920d = true;
        super.onPause();
    }

    public void onResume() {
        this.f249920d = false;
        super.onResume();
    }

    public void setRequestedOrientation(int i) {
        if (!AndroidOSafety.safety(this, i)) {
            Log.m105921e("MicroMsg.MMBaseActivity", "AndroidOSafety.safety false ignore setRequestedOrientation %s for activity %s", Integer.valueOf(i), this);
            return;
        }
        Log.m105919d("MicroMsg.MMBaseActivity", "setRequestedOrientation %s, %s", this, Integer.valueOf(i));
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.MMBaseActivity", th, "AndroidOSafety.safety uncaught", new Object[0]);
        }
    }

    public void startActivities(Intent[] intentArr) {
        super.startActivities(intentArr);
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        if (!C85927s.m106240a(this, this.f249920d, intentArr, bundle)) {
            super.startActivities(intentArr, bundle);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!C85927s.m106240a(this, this.f249920d, new Intent[]{intent}, Integer.valueOf(i), bundle)) {
            super.startActivityForResult(intent, i, bundle);
        }
    }
}
