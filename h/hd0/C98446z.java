package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import p206nj.C76861g;

/* renamed from: hd0.z */
public class C98446z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f288748d;

    /* renamed from: e */
    public final /* synthetic */ C98385a0 f288749e;

    public C98446z(C98385a0 a0Var, long j) {
        this.f288749e = a0Var;
        this.f288748d = j;
    }

    public void run() {
        C98385a0.f288432k++;
        C98385a0 a0Var = this.f288749e;
        a0Var.f288437e = false;
        a0Var.f288440h = "";
        long j = this.f288748d;
        long j2 = 0;
        if (j > 0) {
            if (((HashMap) a0Var.f288434b).get(Long.valueOf(j)) != null) {
                j2 = ((C76861g.C47263a) ((HashMap) this.f288749e.f288434b).get(Long.valueOf(this.f288748d))).mo72288a();
            }
        }
        Log.m105918d("MicroMsg.SightMassSendService", "onJobEnd ok massSendId:" + this.f288748d + " time:" + j2 + " inCnt:" + C98385a0.f288432k + " stop:" + this.f288749e.f288439g + " running:" + this.f288749e.f288438f + " sending:" + this.f288749e.f288437e);
        C98385a0 a0Var2 = this.f288749e;
        if (a0Var2.f288439g > 0) {
            C98385a0.m127690a(a0Var2);
        } else if (!a0Var2.f288437e) {
            a0Var2.mo137671b();
        }
        C98385a0.f288432k--;
    }

    public String toString() {
        return super.toString() + "|onSceneEnd";
    }
}
