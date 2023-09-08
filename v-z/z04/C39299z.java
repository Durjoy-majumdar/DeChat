package z04;

import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13604l;

/* renamed from: z04.z */
public final class C39299z extends C87413o implements C32227p<CharSequence, Integer, C13604l<? extends Integer, ? extends Integer>> {

    /* renamed from: d */
    public final /* synthetic */ char[] f105668d;

    /* renamed from: e */
    public final /* synthetic */ boolean f105669e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39299z(char[] cArr, boolean z) {
        super(2);
        this.f105668d = cArr;
        this.f105669e = z;
    }

    public Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        C87412m.m108594g(charSequence, "$this$$receiver");
        int F = C112550d0.m153770F(charSequence, this.f105668d, intValue, this.f105669e);
        if (F < 0) {
            return null;
        }
        return new C13604l(Integer.valueOf(F), 1);
    }
}
