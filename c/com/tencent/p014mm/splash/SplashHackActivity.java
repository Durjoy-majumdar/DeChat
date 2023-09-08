package com.tencent.p014mm.splash;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.legacy.app.WeChatSplashStartup;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.splash.SplashHackActivity */
class SplashHackActivity extends HellActivity {

    /* renamed from: d */
    public String f249821d;

    /* renamed from: e */
    public PendingIntent f249822e;

    public SplashHackActivity() {
        this((PendingIntent) null);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 100) {
            finish();
            C85781g.m105955c("WxSplash.SplashHackActivity", "unknown request code.", new Object[0]);
        } else if (i2 != -100) {
            C85781g.m105955c("WxSplash.SplashHackActivity", "Back pressed", new Object[0]);
            if (Build.VERSION.SDK_INT >= 31) {
                finish();
            } else {
                onBackPressed();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f249822e != null) {
            C85781g.m105955c("WxSplash.SplashHackActivity", "early redirection", new Object[0]);
            try {
                this.f249822e.send();
                finish();
                return;
            } catch (PendingIntent.CanceledException unused) {
                C85781g.m105955c("WxSplash.SplashHackActivity", "Failed to redirect", new Object[0]);
                this.f249822e = null;
            }
        }
        C85781g.m105955c("WxSplash.SplashHackActivity", "onCreate", new Object[0]);
        setVisible(false);
        Intent intent = new Intent(this, C85781g.f249837o);
        intent.putExtra("hashcode", hashCode());
        startActivityForResult(intent, 100);
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        if (this.f249822e != null) {
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/splash/SplashHackActivity", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/splash/SplashHackActivity", "onDestroy", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
        C85781g.m105955c("WxSplash.SplashHackActivity", "onDestroy", new Object[0]);
        ArrayList<SplashHackActivity> arrayList = C85781g.f249823a;
        arrayList.remove(this);
        setVisible(true);
        arrayList.remove(this);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        boolean z = false;
        C85781g.m105955c("WxSplash.SplashHackActivity", "onNewIntent.", new Object[0]);
        C85779d dVar = C85781g.f249827e;
        if (dVar != null) {
            ((WeChatSplashStartup.C80946c) dVar).getClass();
            if (intent != null && IntentUtil.getIntExtra(intent, "absolutely_exit_pid", 0) == Process.myPid()) {
                Log.m105924i("MicroMsg.WeChatSplashStartup", "handle exit intent.");
                z = true;
                MMAppMgr.m85988h(IntentUtil.getBooleanExtra(intent, "kill_service", true));
            }
            if (z) {
                finish();
            }
        }
    }

    public void onPause() {
        C85781g.m105955c("WxSplash.SplashHackActivity", "onPause", new Object[0]);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C85781g.m105955c("WxSplash.SplashHackActivity", "onResume", new Object[0]);
    }

    public SplashHackActivity(PendingIntent pendingIntent) {
        this.f249822e = pendingIntent;
    }
}
