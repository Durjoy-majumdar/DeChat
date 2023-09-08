package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import ob0.C117747y;
import p206nj.C76861g;

/* renamed from: hd0.a1 */
public class C98389a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f288453d;

    /* renamed from: e */
    public final /* synthetic */ int f288454e;

    /* renamed from: f */
    public final /* synthetic */ int f288455f;

    /* renamed from: g */
    public final /* synthetic */ C98447z0 f288456g;

    public C98389a1(C98447z0 z0Var, C117747y yVar, int i, int i2) {
        this.f288456g = z0Var;
        this.f288453d = yVar;
        this.f288454e = i;
        this.f288455f = i2;
    }

    public void run() {
        String str;
        int i;
        C98447z0.f288750y++;
        String str2 = null;
        if (this.f288453d.getType() == 150) {
            C98447z0 z0Var = this.f288456g;
            z0Var.f288760p = false;
            C98404n nVar = (C98404n) this.f288453d;
            str = nVar.f288511f;
            i = nVar.f288520r;
            z0Var.f288765u = null;
        } else if (this.f288453d.getType() != 149) {
            Log.m105920e("MicroMsg.VideoService", "onSceneEnd Error SceneType:" + this.f288453d.getType());
            C98447z0.f288750y = C98447z0.f288750y + -1;
            return;
        } else if (this.f288454e == 4 && this.f288455f == 102 && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ignore_c2c_retry_upload_video_error, true)) {
            Log.m105924i("MicroMsg.VideoService", "upload video returns 102 code, waiting for the retried response");
            C98447z0.f288750y--;
            return;
        } else {
            C98447z0 z0Var2 = this.f288456g;
            z0Var2.f288761q = false;
            z0Var2.f288766v = null;
            C117747y yVar = this.f288453d;
            if (yVar instanceof C98415q) {
                C98415q qVar = (C98415q) yVar;
                str = qVar.f288619f;
                i = qVar.f288622i;
            } else {
                if (yVar instanceof C98432t) {
                    str2 = ((C98432t) yVar).f288668f;
                } else if (yVar instanceof C98433u) {
                    str2 = ((C98433u) yVar).f288677f;
                } else if (yVar instanceof C98435v) {
                    str2 = ((C98435v) yVar).f288700f;
                }
                str = str2;
                i = 0;
            }
        }
        long j = 0;
        if (!(str == null || ((HashMap) this.f288456g.f288759o).get(str) == null)) {
            j = ((C76861g.C47263a) ((HashMap) this.f288456g.f288759o).get(str)).mo72288a();
            ((HashMap) this.f288456g.f288759o).remove(str);
        }
        Log.m105918d("MicroMsg.VideoService", "onSceneEnd SceneType:" + this.f288453d.getType() + " errtype:" + this.f288454e + " errCode:" + this.f288455f + " retCode:" + i + " file:" + str + " time:" + j + " scene = " + this.f288453d);
        int i2 = this.f288454e;
        if (i2 == 3 && i != 0) {
            C98447z0 z0Var3 = this.f288456g;
            z0Var3.f288763s--;
        } else if (i2 != 0) {
            this.f288456g.f288763s = 0;
        }
        Log.m105918d("MicroMsg.VideoService", "onSceneEnd  inCnt:" + C98447z0.f288750y + " stop:" + this.f288456g.f288763s + " running:" + this.f288456g.f288762r + " recving:" + this.f288456g.f288760p + " sending:" + this.f288456g.f288761q);
        C98447z0 z0Var4 = this.f288456g;
        if (z0Var4.f288763s > 0) {
            C98447z0.m127870a(z0Var4);
        } else if (!z0Var4.f288761q && !z0Var4.f288760p) {
            z0Var4.mo137785b();
        }
        C98447z0.f288750y--;
    }

    public String toString() {
        return super.toString() + "|onSceneEnd";
    }
}
