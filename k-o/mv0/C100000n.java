package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import nv0.C61906d;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: mv0.n */
public class C100000n implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C99996l f292991d;

    public C100000n(C99996l lVar) {
        this.f292991d = lVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C61906d dVar = (C61906d) yVar;
        Log.m105925i("MicroMsg.RecoverPCServer", "onSceneEnd %s, %d, %d", dVar.f176009x, Integer.valueOf(i), Integer.valueOf(i2));
        synchronized (this.f292991d.f292974f) {
            this.f292991d.f292977i.remove(dVar.f176009x);
            Log.m105925i("MicroMsg.RecoverPCServer", "onSceneEnd left: size:%d", Integer.valueOf(this.f292991d.f292977i.size()));
            if (this.f292991d.f292977i.size() <= 10) {
                this.f292991d.f292974f.notifyAll();
            }
        }
        C99996l lVar = this.f292991d;
        int i3 = lVar.f292987v + 1;
        lVar.f292987v = i3;
        if (i3 % 300 == 0) {
            lVar.mo139342e();
        }
        this.f292991d.mo139341d();
    }
}
