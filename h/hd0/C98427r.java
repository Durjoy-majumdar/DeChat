package hd0;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: hd0.r */
public class C98427r implements C92834j {

    /* renamed from: a */
    public final /* synthetic */ C98415q f288662a;

    /* renamed from: hd0.r$a */
    public class C98428a implements Runnable {
        public C98428a() {
        }

        public void run() {
            C98415q qVar = C98427r.this.f288662a;
            qVar.f288627q = false;
            C98408n0 n0Var = qVar.f288624n;
            n0Var.f288562i = 104;
            n0Var.f288563j = Util.nowSecond();
            C98427r.this.f288662a.f288624n.f288564k = Util.nowSecond();
            C98408n0 n0Var2 = C98427r.this.f288662a.f288624n;
            n0Var2.f288557d = 0;
            n0Var2.f288548P = 1800;
            Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", C98427r.this.f288662a.mo137749p1(), Boolean.valueOf(C98427r.this.f288662a.f288627q), Boolean.valueOf(C98429r0.m127808N(n0Var2)), Long.valueOf(C98427r.this.f288662a.f288624n.f288563j));
            C98415q qVar2 = C98427r.this.f288662a;
            qVar2.doScene(qVar2.dispatcher(), C98427r.this.f288662a.f288617d);
        }
    }

    public C98427r(C98415q qVar) {
        this.f288662a = qVar;
    }

    /* renamed from: a */
    public void mo127120a(int i, int i2) {
        if (i == 4 && i2 == 102) {
            C86709a0.m107525e().postToWorker(new C98428a());
            return;
        }
        C98415q qVar = this.f288662a;
        qVar.f288617d.onSceneEnd(i, i2, "", qVar);
    }
}
