package com.tencent.p014mm.splash;

import android.os.Bundle;
import android.os.Handler;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.legacy.app.C80972r;
import com.tencent.p014mm.legacy.app.WeChatSplash;
import com.tencent.p014mm.legacy.app.WeChatSplashStartup;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xlog.app.XLogSetup;
import eb0.C7624i3;
import f40.C86709a0;
import j40.C87829b;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.splash.SplashActivity */
public class SplashActivity extends HellActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f249817e = 0;

    /* renamed from: d */
    public boolean f249818d = false;

    /* renamed from: com.tencent.mm.splash.SplashActivity$a */
    public class C85774a implements Runnable {
        public C85774a() {
        }

        public void run() {
            SplashActivity splashActivity = SplashActivity.this;
            int i = SplashActivity.f249817e;
            splashActivity.mo119622E7();
        }
    }

    /* renamed from: com.tencent.mm.splash.SplashActivity$b */
    public class C85775b implements Runnable {
        public C85775b() {
        }

        public void run() {
            SplashActivity.this.finish();
            SplashActivity splashActivity = SplashActivity.this;
            int i = SplashActivity.f249817e;
            splashActivity.overridePendingTransition(C0966R.C0968anim.f2516f6, C0966R.C0968anim.f2515f5);
        }
    }

    /* renamed from: com.tencent.mm.splash.SplashActivity$c */
    public class C85776c implements Runnable {
        public C85776c(SplashActivity splashActivity) {
        }

        public void run() {
            C85781g.f249827e = null;
        }
    }

    /* renamed from: E7 */
    public final void mo119622E7() {
        C85781g.m105955c("WxSplash.SplashActivity", "Call requestPermissions.", new Object[0]);
        ((WeChatSplashStartup.C80946c) C85781g.f249827e).f237805a.getClass();
        Log.m105924i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "ingore check permission on init");
        mo119624G7();
    }

    /* renamed from: F7 */
    public void mo119623F7() {
        C85779d dVar = C85781g.f249827e;
        if (dVar != null) {
            C85774a aVar = new C85774a();
            WeChatSplashStartup.C80946c cVar = (WeChatSplashStartup.C80946c) dVar;
            cVar.getClass();
            if (!(((!C86709a0.m107523b().mo121115m() && C7624i3.f25910c.mo19a("login_user_name", "").equals("")) && ChannelUtil.shouldShowGprsAlert) ? MMAppMgr.m85990j(this, new C80972r(cVar, aVar)) : false)) {
                mo119622E7();
            } else {
                C85781g.m105955c("WxSplash.SplashActivity", "Waiting for GPRS permission permit.", new Object[0]);
            }
        } else {
            C85781g.m105955c("WxSplash.SplashActivity", "permissions delegate is null, call splash finish directly.", new Object[0]);
            mo119624G7();
        }
    }

    /* renamed from: G7 */
    public final void mo119624G7() {
        C85781g.m105955c("WxSplash.SplashActivity", "Call splashFinished.", new Object[0]);
        if (!this.f249818d) {
            this.f249818d = true;
            C85781g.m105955c("WxSplash.SplashActivity", "this.isFinishing() = %s.", Boolean.valueOf(isFinishing()));
            if (!isFinishing()) {
                setResult(-100);
                int intExtra = getIntent().getIntExtra("hashcode", 0);
                C85781g.m105955c("WxSplash.SplashActivity", "target hashcode = %s.", Integer.valueOf(intExtra));
                Iterator<SplashHackActivity> it = C85781g.f249823a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SplashHackActivity next = it.next();
                    int hashCode = next.hashCode();
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(hashCode);
                    objArr[1] = Boolean.valueOf(intExtra == hashCode);
                    C85781g.m105955c("WxSplash.SplashActivity", "compare hashcode = %s, result: %s.", objArr);
                    if (intExtra == hashCode) {
                        C85781g.m105960h(next);
                        break;
                    }
                }
                new Handler().postDelayed(new C85775b(), 50);
            } else {
                onBackPressed();
            }
            new Handler().postDelayed(new C85776c(this), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }

    public void onCreate(Bundle bundle) {
        C87829b bVar;
        super.onCreate(bundle);
        ((HashSet) C85781g.f249830h).add(this);
        C85781g.m105955c("WxSplash.SplashActivity", "onCreate", new Object[0]);
        if (!C85781g.f249831i) {
            C85781g.m105955c("WxSplash.SplashActivity", "no need splash, finish", new Object[0]);
            mo119623F7();
        }
        if (C85781g.f249836n != null && (bVar = WeChatSplash.f237800a) != null && bVar.mo71804b()) {
            File file = new File(getFilesDir(), ".launched");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Throwable unused) {
                }
                XLogSetup.realSetupXlog();
            }
        }
    }

    public void onDestroy() {
        ((HashSet) C85781g.f249830h).remove(this);
        C85781g.m105955c("WxSplash.SplashActivity", "onDestroy", new Object[0]);
        super.onDestroy();
    }

    public void onPause() {
        C85781g.m105955c("WxSplash.SplashActivity", "onPause", new Object[0]);
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C85779d dVar = C85781g.f249827e;
        if (dVar != null) {
            ((WeChatSplashStartup.C80946c) dVar).f237805a.mo104635a(this, i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        C85781g.m105955c("WxSplash.SplashActivity", "onResume", new Object[0]);
    }
}
