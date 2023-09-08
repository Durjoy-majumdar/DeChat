package com.tencent.p014mm.legacy.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import com.tencent.p014mm.app.C80600i0;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.booter.C80824k0;
import com.tencent.p014mm.plugin.expansions.C85178q;
import com.tencent.p014mm.plugin.sandbox.SubCoreSandBox;
import com.tencent.p014mm.sdk.crash.ICrashReporter;
import com.tencent.p014mm.sdk.platformtools.AndroidOSafety;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.tinker.entry.ApplicationLifeCycle;
import com.tencent.tinker.entry.ApplicationLike;
import j40.C87829b;
import p206nj.C88957l;
import zt3.C119154h;

/* renamed from: com.tencent.mm.legacy.app.MMHotpotDotDotWrapper */
public class MMHotpotDotDotWrapper implements ApplicationLifeCycle {
    private static final String TAG = "MicroMsg.MMHotpotDotDotWrapper";
    private final Application mApp;
    private final ApplicationLike mAppLike;
    private final String mCurrentProcessName;
    private final long mProcessInitTimestamp = System.currentTimeMillis();
    private C87829b profile = null;

    /* renamed from: com.tencent.mm.legacy.app.MMHotpotDotDotWrapper$a */
    public class C80939a implements ICrashReporter.ICrashExpansionDelegate {
        public C80939a(MMHotpotDotDotWrapper mMHotpotDotDotWrapper) {
        }

        public String getLastObbErrorInfo() {
            return C85178q.m105039c();
        }

        public String getObbInfo() {
            byte[] bArr = C85178q.f248171a;
            return null;
        }

        public boolean isInstalled(String str) {
            byte[] bArr = C85178q.f248171a;
            return true;
        }

        public boolean needObbRes() {
            byte[] bArr = C85178q.f248171a;
            return false;
        }
    }

    public MMHotpotDotDotWrapper(ApplicationLike applicationLike, String str) {
        this.mApp = applicationLike.getApplication();
        this.mAppLike = applicationLike;
        this.mCurrentProcessName = str;
    }

    public void onBaseContextAttached(Context context) {
        AndroidOSafety.replaceTargetVersion(context.getApplicationInfo());
        C87829b bVar = new C87829b(this.mCurrentProcessName, this.mApp, this.mAppLike);
        this.profile = bVar;
        bVar.f124992e.f124993a = this.mProcessInitTimestamp;
        VFSStrategy.m163774b(bVar);
        C88957l.m111079o("stlport_shared", context.getClassLoader());
        C88957l.m111079o("c++_shared", context.getClassLoader());
        C88957l.m111079o("wechatxlog", context.getClassLoader());
        C87829b bVar2 = this.profile;
        bVar2.f254268g = C80814d.m98665b(bVar2.f124990c);
        this.profile.f254268g.mo112570e("HOTPOT..");
        Log.m105925i(TAG, "Process %s startup", this.profile.f124988a);
        C119154h.m168040a(this.profile.f124990c, new C80824k0());
        C80600i0.m98224l(new SubCoreSandBox(), new C80939a(this), this.profile.f124988a);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87829b bVar = this.profile;
        if (bVar != null) {
            bVar.mo122283e(configuration);
        }
    }

    public void onCreate() {
        C87829b bVar = this.profile;
        if (bVar != null) {
            bVar.mo122284f();
        }
    }

    public void onLowMemory() {
        C87829b bVar = this.profile;
        if (bVar != null) {
            bVar.mo122285g();
        }
    }

    public void onTerminate() {
        C87829b bVar = this.profile;
        if (bVar != null) {
            bVar.mo122286h();
        }
    }

    public void onTrimMemory(int i) {
        C87829b bVar = this.profile;
        if (bVar != null) {
            bVar.mo122287i(i);
        }
    }
}
