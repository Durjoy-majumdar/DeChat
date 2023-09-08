package l33;

import android.content.Context;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106348g0;
import com.tencent.p014mm.plugin.voip.model.C106350h0;
import com.tencent.p014mm.plugin.voip.model.C106355l;
import com.tencent.p014mm.plugin.voip.model.C106357m;
import com.tencent.p014mm.plugin.voip.model.C106400y;
import com.tencent.p014mm.plugin.voip.p475ui.C106453j0;
import com.tencent.p014mm.plugin.voip.p475ui.VoipAutomatedTestSetupShell;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75583h3;
import eb0.C75592q0;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import java.util.concurrent.FutureTask;
import n90.C11143d;
import n90.C88906c;
import n90.C88907e;
import p149ej.C107276c;
import p149ej.C7663a;
import p149ej.C86523b;
import p645pj.C77091b;
import p787ai.C79547b;
import v33.C111383b;
import w80.C111744e;
import w80.C111748f;
import y33.C112393b;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: l33.e */
public class C109247e extends C86301e {

    /* renamed from: d */
    public final C106350h0[] f327078d = {null};

    /* renamed from: e */
    public final C111383b[] f327079e = {null};

    /* renamed from: f */
    public final C106453j0[] f327080f = {null};

    /* renamed from: g */
    public C111744e f327081g;

    /* renamed from: h */
    public C114668z.C104589a f327082h = new C109248a(this);

    /* renamed from: l33.e$a */
    public class C109248a extends C114668z.C104589a {

        /* renamed from: l33.e$a$a */
        public class C109249a implements Runnable {

            /* renamed from: l33.e$a$a$a */
            public class C109250a implements Runnable {
                public C109250a(C109249a aVar) {
                }

                public void run() {
                    C106350h0 xx02 = C109247e.xx0();
                    if (xx02.f317355x.f329506b) {
                        Log.m105924i("MicroMsg.Voip.VoipService", "no allow to show main ui");
                        xx02.mo152587A();
                        return;
                    }
                    C112393b bVar = xx02.f317344m;
                    if (bVar != null) {
                        Log.m105924i("MicroMsg.Voip.VoipService", "on voip resume");
                        String str = bVar.f336522c;
                        boolean z = bVar.f336520a;
                        boolean z2 = bVar.f336521b;
                        long j = bVar.f336523d;
                        xx02.mo152587A();
                        xx02.mo152595I(MMApplicationContext.getContext(), str, j, z, z2, true);
                        return;
                    }
                    Log.m105924i("MicroMsg.Voip.VoipService", "do not need voip resume");
                }
            }

            public C109249a(C109248a aVar) {
            }

            public void run() {
                ((C119157j) C119157j.f356862d).mo183895z(new C109250a(this));
            }
        }

        public C109248a(C109247e eVar) {
        }

        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                C86718e.m107551r();
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    C79547b.f233255g.mo109607a(new C109249a(this));
                }
            }
        }
    }

    /* renamed from: l33.e$b */
    public class C109251b implements Runnable {
        public C109251b() {
        }

        public void run() {
            synchronized (C109247e.this.f327080f) {
                C106453j0 j0Var = C109247e.this.f327080f[0];
                if (j0Var != null) {
                    j0Var.mo153005a(true);
                    C109247e.this.f327080f[0] = null;
                }
            }
        }
    }

    public static C111383b vx0() {
        if (C86709a0.m107522a()) {
            C111383b[] bVarArr = ((C109247e) C86312j.m106911c(C109247e.class)).f327079e;
            if (bVarArr[0] == null) {
                synchronized (bVarArr) {
                    if (bVarArr[0] == null) {
                        bVarArr[0] = new C111383b();
                    }
                }
            }
            return bVarArr[0];
        }
        throw new C86484b();
    }

    public static C106453j0 wx0() {
        if (C86709a0.m107522a()) {
            C106453j0[] j0VarArr = ((C109247e) C86312j.m106911c(C109247e.class)).f327080f;
            if (j0VarArr[0] == null) {
                synchronized (j0VarArr) {
                    if (j0VarArr[0] == null) {
                        j0VarArr[0] = new C106453j0();
                    }
                }
            }
            return j0VarArr[0];
        }
        throw new C86484b();
    }

    public static C106350h0 xx0() {
        if (C86709a0.m107522a()) {
            C106350h0[] h0VarArr = ((C109247e) C86312j.m106911c(C109247e.class)).f327078d;
            if (h0VarArr[0] == null) {
                synchronized (h0VarArr) {
                    if (h0VarArr[0] == null) {
                        h0VarArr[0] = new C106350h0();
                    }
                }
            }
            return h0VarArr[0];
        }
        throw new C86484b();
    }

    public static void yx0(boolean z) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, Boolean.valueOf(z));
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    public static boolean zx0() {
        return (C75592q0.m90781k() & 137438953472L) == 0;
    }

    public void onAccountInitialized(Context context) {
        String str;
        super.onAccountInitialized(context);
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, (Object) null);
        boolean z = false;
        if (!C106357m.m143310c() && f != null && !((Boolean) f).booleanValue()) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_VOIP_STATUS_VIDEO_MODE_BOOLEAN;
            Boolean bool = Boolean.FALSE;
            boolean booleanValue = ((Boolean) i.mo119685f(aVar, bool)).booleanValue();
            boolean booleanValue2 = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOIP_STATUS_OUT_CALL_BOOLEAN, bool)).booleanValue();
            long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOIP_STATUS_BEFORE_TIME_LONG, 0)).longValue();
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOIP_STATUS_TO_USER_STRING, (Object) null);
            Log.m105925i("MicroMsg.SubCoreVoip", "voip message need push is %s,%s,%s,%s", Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2), Long.valueOf(longValue), str2);
            if (booleanValue) {
                int i2 = C72963f4.f212661I1;
                str = "voip_content_video";
            } else {
                int i3 = C72963f4.f212661I1;
                str = "voip_content_voice";
            }
            C106348g0.m143243d(str2, str, booleanValue2 ? 1 : 0, 6, MMApplicationContext.getContext().getString(C0966R.string.f361524ki2));
            yx0(true);
        }
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: ");
        ((C119157j) C119157j.f356862d).mo183875f(C106355l.f317384d);
        C107276c cVar = C107276c.f320945a;
        C107276c.f320947c = true;
        Log.m105924i("MicroMsg.PluginCamera", "initCameraNumbers start, useMMKVCache : true");
        C107276c.f320948d = new FutureTask<>(C7663a.f26016d);
        ((C119157j) C119157j.f356862d).mo183875f(C86523b.f251371d);
        C88906c.f256403a = new FutureTask<>(C11143d.f32919d);
        ((C119157j) C119157j.f356862d).mo183875f(C88907e.f256404d);
        ((C119157j) C119157j.f356862d).mo183875f(new C109252f(this));
        xx0().getClass();
        C111744e eVar = new C111744e();
        this.f327081g = eVar;
        eVar.mo163475a();
        this.f327082h.alive();
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(40);
        C85801v1 i4 = C86709a0.m107535s().mo121142i();
        Boolean bool2 = Boolean.TRUE;
        boolean booleanValue3 = ((Boolean) i4.mo119684e(73217, bool2)).booleanValue();
        boolean booleanValue4 = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(73218, bool2)).booleanValue();
        boolean b = C77091b.m93020b();
        C85801v1 i5 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_VOIP_MSG_SOUND_DIFF_STAT_BOOLEAN_SYNC;
        boolean booleanValue5 = ((Boolean) i5.mo119685f(aVar2, Boolean.FALSE)).booleanValue();
        Log.m105925i("MicroMsg.SubCoreVoip", "voipSound: %s, voipAudioSound: %s, msgSound: %s, hasReport: %s", Boolean.valueOf(booleanValue3), Boolean.valueOf(booleanValue4), Boolean.valueOf(b), Boolean.valueOf(booleanValue5));
        if (!booleanValue5) {
            if (booleanValue3 || booleanValue4) {
                z = true;
            }
            if (z != b) {
                if (z && !b) {
                    C115669n.INSTANCE.idkeyStat(500, 13, 1, false);
                } else if (!z && b) {
                    C115669n.INSTANCE.idkeyStat(500, 14, 1, false);
                }
            }
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, bool2);
        }
        VoipAutomatedTestSetupShell voipAutomatedTestSetupShell = VoipAutomatedTestSetupShell.f82264a;
        if (WeChatEnvironment.hasDebugger()) {
            Log.m105924i("MicroMsg.VoipAutomatedTestSetupShell", "setup");
            VoipAutomatedTestSetupShell.f82268e.alive();
        }
        C75583h3.m90714a(1);
    }

    public void onAccountReleased(Context context) {
        boolean z;
        MMHandler mMHandler;
        MMHandler mMHandler2;
        super.onAccountReleased(context);
        synchronized (this.f327080f) {
            z = false;
            if (this.f327080f[0] != null) {
                MMHandlerThread.postToMainThread(new C109251b());
            }
        }
        C111744e eVar = this.f327081g;
        if (eVar != null) {
            MMHandler mMHandler3 = eVar.f334657c;
            if (mMHandler3 != null) {
                mMHandler3.removeCallbacksAndMessages((Object) null);
            }
            MMHandler mMHandler4 = eVar.f334657c;
            if (mMHandler4 != null && !mMHandler4.isQuit()) {
                z = true;
            }
            if (z && (mMHandler2 = eVar.f334657c) != null) {
                mMHandler2.post(new C111748f(eVar));
            }
        }
        C106400y yVar = xx0().f317332a.f317396a.f317450A;
        if (!(yVar == null || (mMHandler = yVar.f317724q) == null)) {
            mMHandler.quitSafely();
            yVar.f317724q = null;
        }
        this.f327082h.dead();
        xx0().mo152600N();
        VoipAutomatedTestSetupShell voipAutomatedTestSetupShell = VoipAutomatedTestSetupShell.f82264a;
        Log.m105924i("MicroMsg.VoipAutomatedTestSetupShell", "destroy");
        VoipAutomatedTestSetupShell.f82268e.dead();
    }
}
