package ob0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;

public class b0$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f256831d;

    /* renamed from: e */
    public final /* synthetic */ C89137b0 f256832e;

    public b0$$f(C89137b0 b0Var, C117747y yVar) {
        this.f256832e = b0Var;
        this.f256831d = yVar;
    }

    public void run() {
        int i;
        C114770g gVar;
        C89137b0 b0Var = this.f256832e;
        C117747y yVar = this.f256831d;
        b0Var.getClass();
        yVar.setOnSceneEnd(b0Var);
        int i2 = 0;
        if (yVar.isCanceled() || (gVar = b0Var.f256809d) == null) {
            i = 0;
        } else {
            i = yVar.doScene(gVar, b0Var);
            if (i >= 0) {
                Object[] objArr = new Object[7];
                objArr[0] = Integer.valueOf(yVar.getType());
                objArr[1] = Integer.valueOf(yVar.hashCode());
                objArr[2] = Integer.valueOf(yVar.getMMReqRespHash());
                objArr[3] = Integer.valueOf(b0Var.f256811f.size());
                objArr[4] = Integer.valueOf(b0Var.f256812g.size());
                objArr[5] = Integer.valueOf(i);
                C114770g gVar2 = b0Var.f256809d;
                objArr[6] = Integer.valueOf(gVar2 == null ? 0 : gVar2.hashCode());
                Log.m105925i("MicroMsg.NetSceneQueue", "On doscene  mmcgi type:%d hash[%d,%d] run:%d wait:%d ret:%d autoauth:%d", objArr);
                yVar.setHasCallbackToQueue(false);
                return;
            }
        }
        Object[] objArr2 = new Object[8];
        objArr2[0] = Integer.valueOf(yVar.getType());
        objArr2[1] = Integer.valueOf(yVar.hashCode());
        objArr2[2] = Integer.valueOf(yVar.getMMReqRespHash());
        objArr2[3] = Boolean.valueOf(yVar.isCanceled());
        objArr2[4] = Integer.valueOf(b0Var.f256811f.size());
        objArr2[5] = Integer.valueOf(b0Var.f256812g.size());
        objArr2[6] = Integer.valueOf(i);
        C114770g gVar3 = b0Var.f256809d;
        if (gVar3 != null) {
            i2 = gVar3.hashCode();
        }
        objArr2[7] = Integer.valueOf(i2);
        Log.m105929w("MicroMsg.NetSceneQueue", "doscene mmcgi Failed type:%d hash[%d,%d] cancel[%b] run:%d wait:%d ret:%d autoauth:%d", objArr2);
        yVar.setOnSceneEnd((C11385n) null);
        synchronized (b0Var.f256817o) {
            b0Var.f256811f.remove(yVar);
        }
        if (!yVar.isCanceled()) {
            b0Var.f256814i.post(new b0$$a(b0Var, yVar));
        }
    }

    public String toString() {
        return super.toString() + "|doSceneImp_" + this.f256831d + "_type=" + this.f256831d.getType();
    }
}
