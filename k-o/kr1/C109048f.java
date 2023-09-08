package kr1;

import fy3.C32226l;
import gy3.C87413o;
import is3.C108486c;

/* renamed from: kr1.f */
public final class C109048f extends C87413o implements C32226l<Integer, Integer> {

    /* renamed from: d */
    public final /* synthetic */ C109039b f326585d;

    /* renamed from: e */
    public final /* synthetic */ C108486c f326586e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109048f(C109039b bVar, C108486c cVar) {
        super(1);
        this.f326585d = bVar;
        this.f326586e = cVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C109039b bVar = this.f326585d;
        C108486c cVar = this.f326586e;
        return Integer.valueOf(bVar.mo160163a(cVar != null ? cVar.getSuit() : 0, intValue));
    }
}
