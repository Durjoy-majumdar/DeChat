package p146e2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Locale;
import p1163y1.C112355a;

/* renamed from: e2.b */
public final class C107158b extends C87413o implements C32224a<C112355a> {

    /* renamed from: d */
    public final /* synthetic */ C107159c f320729d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107158b(C107159c cVar) {
        super(0);
        this.f320729d = cVar;
    }

    public Object invoke() {
        Locale textLocale = this.f320729d.f320730a.f320742g.getTextLocale();
        C87412m.m108593f(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return new C112355a(textLocale, this.f320729d.f320733d.mo163670e());
    }
}
