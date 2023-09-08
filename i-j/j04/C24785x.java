package j04;

import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import sx3.C64186f0;
import xy3.C26566c;
import xz3.C26607p;

/* renamed from: j04.x */
public final class C24785x extends C87413o implements C32224a<List<? extends C26566c>> {

    /* renamed from: d */
    public final /* synthetic */ C24779w f70685d;

    /* renamed from: e */
    public final /* synthetic */ C26607p f70686e;

    /* renamed from: f */
    public final /* synthetic */ C24733b f70687f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24785x(C24779w wVar, C26607p pVar, C24733b bVar) {
        super(0);
        this.f70685d = wVar;
        this.f70686e = pVar;
        this.f70687f = bVar;
    }

    public Object invoke() {
        List<C26566c> list;
        C24779w wVar = this.f70685d;
        C24736c0 a = wVar.mo51756a(wVar.f70665a.f70645c);
        if (a != null) {
            list = this.f70685d.f70665a.f70643a.f70626e.mo51717d(a, this.f70686e, this.f70687f);
        } else {
            list = null;
        }
        return list == null ? C64186f0.f181907d : list;
    }
}
