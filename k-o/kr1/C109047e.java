package kr1;

import fy3.C32226l;
import gy3.C87413o;
import is3.C108485b;
import ks3.C109054b;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: kr1.e */
public final class C109047e extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108485b f326583d;

    /* renamed from: e */
    public final /* synthetic */ C109039b f326584e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109047e(C108485b bVar, C109039b bVar2) {
        super(1);
        this.f326583d = bVar;
        this.f326584e = bVar2;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C108485b bVar = this.f326583d;
        if (bVar != null) {
            bVar.reload();
        }
        C109039b bVar2 = this.f326584e;
        bVar2.f326572q = intValue;
        bVar2.mo160164b().putInt("beauty_suit", this.f326584e.f326572q);
        C109039b bVar3 = this.f326584e;
        for (C109054b bVar4 : (Iterable) ((C36570n) this.f326584e.f326575t).getValue()) {
            int i = bVar4.f326602a;
            bVar3.mo160169h(i, bVar3.mo160163a(bVar3.f326572q, i));
        }
        this.f326584e.mo160168g();
        return C13598b0.f38549a;
    }
}
