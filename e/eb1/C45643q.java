package eb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ob0.C11385n;
import ob0.C117747y;
import p550hn.C108250b;

/* renamed from: eb1.q */
public class C45643q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f123430d;

    /* renamed from: e */
    public final /* synthetic */ C45645r f123431e;

    /* renamed from: eb1.q$a */
    public class C45644a implements C11385n {
        public C45644a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105919d("MicroMsg.NetSceneFaceRsaBase", "hy: summerauth dkcert getcert type:%d ret [%d,%d]", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                C45645r rVar = C45643q.this.f123431e;
                rVar.mo71157j1(rVar.dispatcher(), C45643q.this.f123431e.f123434e);
                return;
            }
            Log.m105920e("MicroMsg.NetSceneFaceRsaBase", "hy: do scene err in rsa when get cert. clear ticket");
            C45645r.f123433f = null;
            C45645r rVar2 = C45643q.this.f123431e;
            rVar2.getClass();
            rVar2.mo71160m1(C45645r.f123433f);
            C45645r rVar3 = C45643q.this.f123431e;
            rVar3.f123434e.onSceneEnd(i, i2, "", rVar3);
        }
    }

    public C45643q(C45645r rVar, int i) {
        this.f123431e = rVar;
        this.f123430d = i;
    }

    public void run() {
        ((C108250b) C86312j.m106911c(C108250b.class)).mo158635EX(this.f123430d).doScene(this.f123431e.dispatcher(), new C45644a());
    }
}
