package p911ml;

import fy3.C32226l;
import gy3.C87413o;
import p465cl.C92426d;
import rx3.C13598b0;
import u60.C65234n;

/* renamed from: ml.e */
public final class C99913e extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99911d f292769d;

    /* renamed from: e */
    public final /* synthetic */ String f292770e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99913e(C99911d dVar, String str) {
        super(1);
        this.f292769d = dVar;
        this.f292770e = str;
    }

    public Object invoke(Object obj) {
        ((Boolean) obj).booleanValue();
        C92426d.f264475a.mo126427a(this.f292769d.f292762f);
        this.f292769d.mo11853b(C65234n.OK);
        C76778b.f224582a.mo107030a(this.f292769d.f292764h, true, this.f292770e);
        return C13598b0.f38549a;
    }
}
