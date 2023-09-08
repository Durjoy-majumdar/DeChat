package ty0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75699i1;
import f62.C75700k0;
import gy3.C87412m;
import p285zh.C119114c;
import ry0.C48097a;
import sf0.C48374j0;
import te3.C51771w2;
import te3.C77949j3;

/* renamed from: ty0.c */
public abstract class C37302c<SESSION> extends C48097a {

    /* renamed from: f */
    public final String f98672f = "BasePrivateMsgReceiveHandler";

    /* renamed from: g */
    public final C37303a f98673g = new C37303a(this);

    /* renamed from: ty0.c$a */
    public static final class C37303a implements C75699i1 {

        /* renamed from: a */
        public final /* synthetic */ C37302c<SESSION> f98674a;

        public C37303a(C37302c<SESSION> cVar) {
            this.f98674a = cVar;
        }

        /* renamed from: a */
        public void mo58465a() {
            Log.m105924i(this.f98674a.mo61034t0(), "flushNotifyAllMsg");
        }

        /* renamed from: b */
        public void mo58466b(C72963f4 f4Var, C77949j3 j3Var) {
            String t0 = this.f98674a.mo61034t0();
            Log.m105924i(t0, "[notifyNewMsg] msg=" + f4Var + " addMsg=" + j3Var);
            C119114c.m167921f("newMsgByp");
        }
    }

    /* renamed from: E0 */
    public boolean mo61031E0(C51771w2 w2Var) {
        C87412m.m108594g(w2Var, "rawBypMsg");
        String str = w2Var.f143819e;
        if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(str, w2Var.f143818d.f227638r).getMsgId() == 0) {
            return false;
        }
        Log.m105924i(mo61034t0(), "msg already exist");
        return true;
    }

    /* renamed from: H0 */
    public abstract void mo55696H0(SESSION session, String str);

    /* renamed from: N0 */
    public abstract boolean mo55697N0(SESSION session, C51771w2 w2Var);

    /* renamed from: Q */
    public C75699i1 mo58464Q() {
        return this.f98673g;
    }

    /* renamed from: d */
    public boolean mo61032d(C51771w2 w2Var) {
        C87412m.m108594g(w2Var, "rawBypMsg");
        if (mo61031E0(w2Var)) {
            return false;
        }
        String str = w2Var.f143819e;
        C87412m.m108593f(str, "sessionId");
        Object g0 = mo55700g0(str);
        if (!mo55697N0(g0, w2Var)) {
            return true;
        }
        String str2 = w2Var.f143819e;
        C87412m.m108593f(str2, "rawBypMsg.msg_session_id");
        mo55696H0(g0, str2);
        return true;
    }

    /* renamed from: g0 */
    public abstract SESSION mo55700g0(String str);

    /* renamed from: j0 */
    public String mo55701j0(C51771w2 w2Var) {
        C87412m.m108594g(w2Var, "rawBypMsg");
        String g = C48374j0.m53718g(w2Var.f143818d.f227628e);
        String g2 = C48374j0.m53718g(w2Var.f143818d.f227629f);
        if (w2Var.f143822h) {
            C87412m.m108593f(g, "fromUser");
            return g;
        }
        C87412m.m108593f(g2, "toUser");
        return g2;
    }

    /* renamed from: n0 */
    public String mo61033n0(C51771w2 w2Var) {
        C87412m.m108594g(w2Var, "rawBypMsg");
        String g = C48374j0.m53718g(w2Var.f143818d.f227628e);
        String g2 = C48374j0.m53718g(w2Var.f143818d.f227629f);
        if (w2Var.f143822h) {
            C87412m.m108593f(g2, "toUser");
            return g2;
        }
        C87412m.m108593f(g, "fromUser");
        return g;
    }

    /* renamed from: t0 */
    public String mo61034t0() {
        return this.f98672f;
    }
}
