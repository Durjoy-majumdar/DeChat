package wg1;

import cj1.C54785k6;
import cl1.C54994o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qk1.C63267v2;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: wg1.e3 */
public final class C65996e3 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C65982b3 f189745d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65996e3(C65982b3 b3Var) {
        super(1);
        this.f189745d = b3Var;
    }

    public Object invoke(Object obj) {
        C32226l<? super Integer, C13598b0> lVar;
        int intValue = ((Number) obj).intValue();
        Class cls = C54994o1.class;
        Log.m105920e("FinderLiveVisitorMusicSingSongPresenter", "showMusic loadMoreData incrementNum:" + intValue + '!');
        if (intValue <= 0) {
            C66009f4 f4Var = this.f189745d.f189712h;
            if (f4Var != null) {
                f4Var.mo90039h(true);
            }
            C63267v2 v2Var = this.f189745d.f189713i;
            if (v2Var != null) {
                v2Var.f179551f.clear();
                v2Var.notifyDataSetChanged();
            }
        } else {
            C65982b3 b3Var = this.f189745d;
            C66009f4 f4Var2 = b3Var.f189712h;
            if (f4Var2 != null) {
                f4Var2.mo90037f(((C54994o1) b3Var.f189709e.mo71262a(cls)).f154399f.f153479b);
            }
            C63267v2 v2Var2 = this.f189745d.f189713i;
            if (v2Var2 != null) {
                v2Var2.f179551f.clear();
                v2Var2.f179551f.addAll(((C54994o1) v2Var2.f179549d.mo71262a(cls)).f154399f.f153479b);
                CharSequence value = ((C54994o1) v2Var2.f179549d.mo71262a(cls)).f154401h.getValue();
                if (!(value == null || value.length() == 0)) {
                    String value2 = ((C54994o1) v2Var2.f179549d.mo71262a(cls)).f154401h.getValue();
                    if (value2 == null) {
                        value2 = "";
                    }
                    int i = 0;
                    for (T next : v2Var2.f179551f) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            if (C87412m.m108589b(((C54785k6) next).f153566a, value2) && (lVar = v2Var2.f179556n) != null) {
                                lVar.invoke(Integer.valueOf(i));
                            }
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                C54785k6 k6Var = (C54785k6) C110818d0.m150916N(v2Var2.f179551f);
                if (k6Var != null && k6Var.f153568c == 4) {
                    v2Var2.f179551f.getFirst().getClass();
                    v2Var2.f179557o = 1;
                } else {
                    v2Var2.f179557o = 0;
                }
                v2Var2.notifyDataSetChanged();
            }
        }
        return C13598b0.f38549a;
    }
}
