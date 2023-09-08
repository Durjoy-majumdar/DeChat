package nn2;

import ad3.C67027a;
import android.content.Context;
import android.os.Looper;
import bd3.C39760a;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ShakeMessageStorageNotifyEvent;
import com.tencent.p014mm.plugin.shake.model.ShakeMgrImpl;
import com.tencent.p014mm.plugin.shake.p103ui.C71184a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import ln2.C34315b;
import p772yx.C79165b;
import p823sg.C90193h;
import qn2.C22119d;
import qn2.C77376f;
import sn2.C36747b0;
import wc3.C102425b0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: nn2.m */
public class C76942m extends C86301e implements C79165b, C34315b {

    /* renamed from: d */
    public C47289g f224851d;

    /* renamed from: e */
    public C34936i f224852e;

    /* renamed from: f */
    public C77376f f224853f;

    /* renamed from: g */
    public C22119d f224854g;

    /* renamed from: h */
    public C36747b0 f224855h;

    /* renamed from: i */
    public MMHandler f224856i = new MMHandler(Looper.getMainLooper());

    /* renamed from: j */
    public C39760a f224857j = new C76943a(this);

    /* renamed from: n */
    public C44668u3.C44669a f224858n = new C47290c(this);

    /* renamed from: o */
    public C30783v3.C30784a f224859o = new C76945d(this);

    /* renamed from: p */
    public ShakeMgrImpl f224860p = new ShakeMgrImpl();

    /* renamed from: nn2.m$c */
    public class C47290c implements C44668u3.C44669a {
        public C47290c(C76942m mVar) {
        }

        /* renamed from: J1 */
        public void mo69732J1(C44668u3 u3Var, C72996z1 z1Var) {
            if (u3Var != null && z1Var != null && z1Var.mo62920o3()) {
                C76942m.zx0().mo72326qq(z1Var.getUsername());
            }
        }

        /* renamed from: K4 */
        public int mo69733K4(C72996z1 z1Var, boolean z) {
            return 0;
        }

        public C72996z1 get(String str) {
            return null;
        }
    }

    /* renamed from: nn2.m$a */
    public class C76943a extends C39760a {
        public C76943a(C76942m mVar) {
        }

        /* renamed from: a */
        public IEvent mo62400a(String str) {
            ShakeMessageStorageNotifyEvent shakeMessageStorageNotifyEvent = new ShakeMessageStorageNotifyEvent();
            shakeMessageStorageNotifyEvent.f193932d.f193933a = str;
            return shakeMessageStorageNotifyEvent;
        }

        /* renamed from: b */
        public MStorage mo62401b() {
            return C76942m.Ax0();
        }
    }

    /* renamed from: nn2.m$b */
    public class C76944b implements Runnable {
        public C76944b(C76942m mVar) {
        }

        public void run() {
            if (C97625j3.m125811a()) {
                Util.deleteOutOfDateFile(C97625j3.m125812b().mo105893h(), "Sk", FrequentLimiter.WEEK_MILLS);
            }
        }

        public String toString() {
            return super.toString() + "|onAccountPostReset";
        }
    }

    /* renamed from: nn2.m$d */
    public class C76945d implements C30783v3.C30784a {
        public C76945d(C76942m mVar) {
        }

        /* renamed from: A */
        public void mo57653A(C72976h2 h2Var, C30783v3 v3Var) {
            if (h2Var != null) {
                String username = h2Var.getUsername();
                int i = C72996z1.f214113Y1;
                if (username != null && username.equalsIgnoreCase("pc_share")) {
                    h2Var.setUsername("");
                }
            }
        }
    }

    public static C34936i Ax0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224852e == null) {
            vx0().f224852e = new C34936i(C97625j3.m125812b().mo105909x());
        }
        return vx0().f224852e;
    }

    public static C36747b0 Bx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224855h == null) {
            vx0().f224855h = new C36747b0(C97625j3.m125812b().mo105909x());
        }
        return vx0().f224855h;
    }

    public static C76942m vx0() {
        return (C76942m) C86312j.m106911c(C76942m.class);
    }

    public static String wx0(String str, String str2) {
        if (!C97625j3.m125811a() || Util.isNullOrNil(str)) {
            return "";
        }
        return String.format("%s/Sk%s_%s", new Object[]{C97625j3.m125812b().mo105893h(), str2, C90193h.m112878f(str.getBytes())});
    }

    public static C22119d xx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224854g == null) {
            vx0().f224854g = new C22119d();
        }
        return vx0().f224854g;
    }

    public static C77376f yx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224853f == null) {
            vx0().f224853f = new C77376f();
        }
        return vx0().f224853f;
    }

    public static C47289g zx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224851d == null) {
            vx0().f224851d = new C47289g(C97625j3.m125812b().mo105909x());
        }
        return vx0().f224851d;
    }

    public C102425b0 ag0() {
        return this.f224860p;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C30783v3 w = C97625j3.m125812b().mo105908w();
        ((C44660i2) w).f121080f.add(this.f224859o, (Looper) null);
        C97625j3.m125812b().mo105907v().mo69701h3(this.f224858n);
        C86709a0.m107525e().postToWorker(new C76944b(this));
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C30783v3 w = C97625j3.m125812b().mo105908w();
        ((C44660i2) w).f121080f.remove(this.f224859o);
        C97625j3.m125812b().mo105907v().mo69666O3(this.f224858n);
    }

    /* renamed from: r */
    public C67027a mo59555r(Context context, String str) {
        return new C71184a(context);
    }
}
