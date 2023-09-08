package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Queue;
import kj2.C117407d;
import qe3.C101130q0;
import sf0.C36667o0;
import sf0.C90188n0;
import te3.C101865x33;
import te3.ie4;

public class e0$$h implements C118010i {

    /* renamed from: d */
    public int f352743d;

    /* renamed from: e */
    public long f352744e;

    /* renamed from: f */
    public C101865x33 f352745f;

    /* renamed from: g */
    public final /* synthetic */ C118002e0 f352746g;

    public e0$$h(C118002e0 e0Var, C101130q0 q0Var, int i, long j) {
        this.f352746g = e0Var;
        this.f352745f = q0Var == null ? null : q0Var.f296025a;
        this.f352744e = j;
        this.f352743d = i;
    }

    /* renamed from: G0 */
    public boolean mo72839G0(Queue<C118010i> queue) {
        if (this.f352745f == null) {
            C117407d.INSTANCE.idkeyStat(99, 40, 1, false);
            Log.m105921e("MicroMsg.SyncService", "%s run resp == null", this);
            return false;
        } else if (10018 == C90188n0.f258950r) {
            Log.m105921e("MicroMsg.SyncService", "%s Give up for test", this);
            return false;
        } else {
            if (C118002e0.m166423b(this.f352746g)) {
                ie4 ie4 = new ie4();
                ie4.f354052n = 1;
                ie4.f354046e = true;
                ie4.f354045d = this.f352745f;
                ie4.f354053o = this.f352743d;
                ie4.f354054p = this.f352744e;
                this.f352746g.f352712h.mo182781b(ie4, this);
            } else {
                new e0$$e(this.f352746g, this, true, this.f352745f, new e0$$h$$b(this), (e0$$c) null);
            }
            C36667o0 o0Var = this.f352746g.f352705a;
            e0$$h$$a e0__h__a = new e0$$h$$a(this);
            o0Var.getClass();
            o0Var.mo60790a(e0__h__a, 100, true);
            C117407d.INSTANCE.idkeyStat(99, 21, 1, false);
            return true;
        }
    }

    public String toString() {
        return "NotifyData[" + hashCode() + "]";
    }
}
