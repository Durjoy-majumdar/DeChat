package kr1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import is3.C108485b;
import is3.C108486c;
import kr1.C109039b;
import ks3.C109054b;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: kr1.j */
public final class C109051j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108486c f326590d;

    /* renamed from: e */
    public final /* synthetic */ C109039b f326591e;

    /* renamed from: f */
    public final /* synthetic */ C108485b f326592f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109051j(C108486c cVar, C109039b bVar, C108485b bVar2) {
        super(0);
        this.f326590d = cVar;
        this.f326591e = bVar;
        this.f326592f = bVar2;
    }

    public Object invoke() {
        C109039b.C109042c cVar = C109039b.f326557v;
        StringBuilder sb = new StringBuilder();
        sb.append("#detailsView.onRequestReset suit=");
        C108486c cVar2 = this.f326590d;
        sb.append(cVar2 != null ? Integer.valueOf(cVar2.getSuit()) : null);
        Log.m105924i("MicroMsg.FinderRecordBeautifyPlugin", sb.toString());
        C109039b bVar = this.f326591e;
        for (C109054b bVar2 : (Iterable) ((C36570n) this.f326591e.f326575t).getValue()) {
            bVar.mo160164b().remove(bVar.mo160166d(bVar.f326572q, bVar2.f326602a));
            int i = bVar2.f326602a;
            bVar.mo160169h(i, bVar.mo160165c(bVar.f326572q, i));
        }
        C108485b bVar3 = this.f326592f;
        if (bVar3 != null) {
            bVar3.reload();
        }
        this.f326591e.mo160168g();
        return C13598b0.f38549a;
    }
}
