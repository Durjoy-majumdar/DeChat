package p219pm;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.voip.p475ui.C106469p0;
import com.tencent.p014mm.plugin.voip.p475ui.VoipViewFragment;
import com.tencent.p014mm.plugin.voip.widget.BaseSmallView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import f40.C86709a0;
import fw0.C87107w;
import g40.C87133d;
import gv2.C98249r;
import kj2.C117407d;
import l33.C109247e;
import lb0.C88394b;
import lg3.C88496e;
import lg3.C88497f;
import p151er.C58677l;
import p646pn.C110234e;
import p90.C100687b;
import v82.C111423c1;

/* renamed from: pm.l */
public class C89368l implements C87133d {
    /* renamed from: gV */
    public void mo62227gV(ApplicationLike applicationLike, int i) {
        Log.m105925i("MicroMsg.LegacyAppStatus", "onTrimMemory, level = %d, process = %s", Integer.valueOf(i), MMApplicationContext.getProcessName());
        C100687b b = C100687b.m131711b();
        b.getClass();
        Log.m105924i("MicroMsg.CacheInvoke", "CacheInvoke onTrimMemory");
        for (C100687b.C100692b onTrimMemory : b.f295008b.values()) {
            onTrimMemory.onTrimMemory(i);
        }
    }

    /* renamed from: kY */
    public void mo62228kY(ApplicationLike applicationLike) {
    }

    public void qs0(ApplicationLike applicationLike, Configuration configuration) {
        boolean z;
        BaseSmallView baseSmallView;
        Class cls = C110234e.class;
        if (C85875k4.m106149F() && C85875k4.m106146C()) {
            XWebSdk.setForceDarkMode(C85875k4.m106144A(configuration));
            MMWebView.m49943Y(C85875k4.m106144A(configuration));
            if (MMApplicationContext.isMainProcess()) {
                int i = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getInt("uimode_change", 0);
                int i2 = configuration.uiMode;
                if (i == 0) {
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt("uimode_change", i2);
                }
                Log.m105925i("MicroMsg.MMUIModeManager", "dancy test uimode change, mUimode:%s,mCurrentUimode:%s", Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 0 || i == i2) {
                    z = false;
                } else {
                    Log.m105924i("MicroMsg.MMUIModeManager", "uiModeChange true !! reStart!!!");
                    MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putInt("uimode_change", i2);
                    int i3 = (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || C85875k4.m106146C()) ? C85875k4.m106149F() ? 1 : 2 : 0;
                    C117407d.INSTANCE.mo160131h(18893, 2, Integer.valueOf(C85875k4.m106144A(configuration) ? 1 : 0), 2, Integer.valueOf(i3), Integer.valueOf(C85875k4.m106146C() ? 1 : 0));
                    Log.m105925i("MicroMsg.MMUIModeManager", "dark mode change kvReport logID:%s , action: %s, isDark:%s, mode:%s", 18893, 2, Boolean.valueOf(C85875k4.m106144A(configuration)), Integer.valueOf(i3));
                    z = true;
                }
                if (z) {
                    Log.m105925i("MicroMsg.PluginBigBallOfMud", "dancy test uiModeChange true, uimode:%s", Integer.valueOf(configuration.uiMode));
                    C98249r.m126977f();
                    String str = C88394b.f255384g;
                    ((C88394b.C88401f) C88394b.C88418q.f255427a.f255390e).mo122809a();
                    if (((C110234e) C86312j.m106911c(cls)).mo161399pY() != null) {
                        ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149131l();
                        ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149146v();
                        if (C86709a0.m107522a()) {
                            VoipViewFragment voipViewFragment = C109247e.wx0().f317987a;
                            if (!(voipViewFragment == null || (baseSmallView = voipViewFragment.f317950d) == null)) {
                                C106469p0 p0Var = (C106469p0) baseSmallView;
                                p0Var.f318016n.setBackground(C74933u4.m89768e(p0Var.getContext(), C0966R.C0969drawable.b0y, p0Var.getResources().getColor(C0966R.color.f2929c)));
                            }
                            C111423c1 c1Var = C105851w0.Cx0().f333586d;
                            if (c1Var != null) {
                                c1Var.mo163091o();
                            }
                        }
                    }
                    if (C86709a0.m107528h().f251724a.f251792d) {
                        ((C58677l) C86312j.m106911c(C58677l.class)).mo75411O2();
                    }
                }
                C88497f.m110370c(configuration, C85875k4.m106211z());
                if (MMApplicationContext.getContext().getResources() != null) {
                    MMApplicationContext.getContext().getResources().getConfiguration().updateFrom(configuration);
                }
            }
        }
        Resources resources = MMApplicationContext.getResources();
        if (resources instanceof C88496e) {
            ((C88496e) resources).mo122950g(configuration);
        }
    }

    /* renamed from: zA */
    public void mo62230zA(ApplicationLike applicationLike) {
        Log.m105925i("MicroMsg.PluginBigBallOfMud", "onTerminate(%s)", MMApplicationContext.getProcessName());
        MMAppMgr mMAppMgr = C87107w.f252708f;
        Context context = MMApplicationContext.getContext();
        MMAppMgr.Receiver receiver = mMAppMgr.f214419c;
        if (receiver != null) {
            context.unregisterReceiver(receiver);
        }
    }
}
