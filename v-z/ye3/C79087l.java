package ye3;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.BackupCoreResetEvent;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C75592q0;
import eb0.C75593t5;
import f40.C75678h;
import f40.C75681p0;
import f40.C86709a0;
import f40.C86723g;
import gy3.C87412m;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p154fy.C45844i;
import p154fy.C87119d;
import p154fy.C87121j;
import p214om.C11502f;
import rx3.C13598b0;

/* renamed from: ye3.l */
public final class C79087l {

    /* renamed from: a */
    public C11385n f232230a;

    /* renamed from: b */
    public C11385n f232231b;

    /* renamed from: c */
    public C11385n f232232c;

    /* renamed from: d */
    public MTimerHandler f232233d;

    /* renamed from: e */
    public MTimerHandler f232234e;

    /* renamed from: f */
    public ProgressDialog f232235f;

    /* renamed from: ye3.l$a */
    public static final class C79088a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C79087l f232236d;

        /* renamed from: ye3.l$a$a */
        public static final class C79089a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C79087l f232237d;

            public C79089a(C79087l lVar) {
                this.f232237d = lVar;
            }

            public final void run() {
                C86709a0.m107524d().mo123470p(282, this.f232237d.f232230a);
                this.f232237d.f232231b = null;
            }
        }

        public C79088a(C79087l lVar) {
            this.f232236d = lVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String s = C75592q0.m90789s();
            if (C75593t5.f222075c.mo105940c(s)) {
                C75593t5.f222075c.mo105946i(s, "last_logout_no_pwd_ticket", "");
            }
            MMHandlerThread.postToMainThread(new C79089a(this.f232236d));
        }
    }

    /* renamed from: a */
    public static final void m95638a(C79087l lVar) {
        lVar.getClass();
        if (!C86709a0.m107523b().mo121120t() || BuildInfo.EX_DEVICE_LOGIN || !C85875k4.m106210y() || C75592q0.m90795y()) {
            lVar.mo109027b();
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C79085j(lVar), false);
            lVar.f232234e = mTimerHandler;
            mTimerHandler.startTimer(3000);
            lVar.f232235f = C76879j.m92723Q(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.a3h), MMApplicationContext.getContext().getString(C0966R.string.ddc), true, true, new C79086k(lVar));
            return;
        }
        C89137b0 d = C86709a0.m107524d();
        C79081g gVar = new C79081g(lVar);
        lVar.f232230a = gVar;
        C13598b0 b0Var = C13598b0.f38549a;
        d.mo123455a(281, gVar);
        C45844i iI = ((C87121j) C86312j.m106911c(C87121j.class)).mo71218iI(2);
        C89137b0 d2 = C86709a0.m107524d();
        C87412m.m108592e(iI, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d2.mo123460f((C117747y) iI);
        lVar.mo109027b();
        MTimerHandler mTimerHandler2 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C79083h(iI, lVar), false);
        lVar.f232233d = mTimerHandler2;
        mTimerHandler2.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        lVar.f232235f = C76879j.m92723Q(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.a3h), MMApplicationContext.getContext().getString(C0966R.string.li7), true, true, new C79084i(iI, lVar));
    }

    /* renamed from: b */
    public final void mo109027b() {
        C89137b0 d = C86709a0.m107524d();
        C79088a aVar = new C79088a(this);
        this.f232231b = aVar;
        C13598b0 b0Var = C13598b0.f38549a;
        d.mo123455a(282, aVar);
        C87119d lB = ((C87121j) C86312j.m106911c(C87121j.class)).mo71220lB(0);
        C89137b0 d2 = C86709a0.m107524d();
        C87412m.m108592e(lB, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d2.mo123460f((C117747y) lB);
    }

    /* renamed from: c */
    public final void mo109028c() {
        Class cls = C11502f.class;
        Log.m105924i("MicroMsg.ChangeQQLoginType.LogoutHelper", "logout mm");
        ((C11502f) C86312j.m106911c(cls)).mo11461Sr().fq0();
        LogoutEvent logoutEvent = new LogoutEvent();
        LogoutEvent.C28774a aVar = logoutEvent.f78863d;
        aVar.getClass();
        aVar.f78864a = 0;
        logoutEvent.publish();
        BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f78724d.f78725a = true;
        backupProcessMgrExitEvent.publish();
        MMEntryLock.unlock("show_whatsnew");
        C75681p0.m90934a(MMApplicationContext.getContext(), true);
        C85405m.m105415e(8);
        C86723g k = C86709a0.m107529k();
        k.f251779b.mo123460f(new C75576f4(new C75678h(k), "reset accinfo"));
        new BackupCoreResetEvent().publish();
        MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("Intro_Switch", true);
        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93183p(intent, MMApplicationContext.getContext());
    }
}
