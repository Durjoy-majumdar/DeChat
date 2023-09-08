package kr1;

import fy3.C32226l;
import gy3.C87413o;
import is3.C108486c;

/* renamed from: kr1.g */
public final class C109049g extends C87413o implements C32226l<Integer, Integer> {

    /* renamed from: d */
    public final /* synthetic */ C109039b f326587d;

    /* renamed from: e */
    public final /* synthetic */ C108486c f326588e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109049g(C109039b bVar, C108486c cVar) {
        super(1);
        this.f326587d = bVar;
        this.f326588e = cVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C109039b bVar = this.f326587d;
        C108486c cVar = this.f326588e;
        return Integer.valueOf(bVar.mo160165c(cVar != null ? cVar.getSuit() : 0, intValue));
    }
}
