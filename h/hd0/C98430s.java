package hd0;

import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import p206nj.C76861g;

/* renamed from: hd0.s */
public class C98430s implements C92834j {

    /* renamed from: a */
    public final /* synthetic */ C98415q f288664a;

    /* renamed from: hd0.s$a */
    public class C98431a implements Runnable {
        public C98431a() {
        }

        public void run() {
            C98415q qVar = C98430s.this.f288664a;
            qVar.f288627q = false;
            C98408n0 n0Var = qVar.f288624n;
            n0Var.f288562i = 104;
            n0Var.f288563j = Util.nowSecond();
            C98430s.this.f288664a.f288624n.f288564k = Util.nowSecond();
            C98408n0 n0Var2 = C98430s.this.f288664a.f288624n;
            n0Var2.f288557d = 0;
            n0Var2.f288548P = 1800;
            Log.m105925i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", C98430s.this.f288664a.mo137749p1(), Boolean.valueOf(C98430s.this.f288664a.f288627q), Boolean.valueOf(C98429r0.m127808N(n0Var2)), Long.valueOf(C98430s.this.f288664a.f288624n.f288563j));
            C98415q qVar2 = C98430s.this.f288664a;
            qVar2.doScene(qVar2.dispatcher(), C98430s.this.f288664a.f288617d);
        }
    }

    public C98430s(C98415q qVar) {
        this.f288664a = qVar;
    }

    /* renamed from: a */
    public void mo127120a(int i, int i2) {
        if (i == 4 && i2 == 102) {
            C86709a0.m107525e().postToWorker(new C98431a());
            return;
        }
        C98384a.m127689a(this.f288664a.f288624n, 0);
        C98415q qVar = this.f288664a;
        qVar.f288624n = C98429r0.m127818i(qVar.f288619f);
        C98415q qVar2 = this.f288664a;
        C98408n0 n0Var = qVar2.f288624n;
        if (n0Var != null && n0Var.f288562i == 105) {
            qVar2.f288622i = 0 - (C76861g.m92658a() + 10000);
        }
        C98415q qVar3 = this.f288664a;
        qVar3.f288617d.onSceneEnd(i, i2, "", qVar3);
    }
}
