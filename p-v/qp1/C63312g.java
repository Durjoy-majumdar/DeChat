package qp1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import op1.C62080b;
import rx3.C13598b0;
import sp1.C64100l0;
import sx3.C64197v;

/* renamed from: qp1.g */
public final class C63312g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63313h f179647d;

    /* renamed from: e */
    public final /* synthetic */ long f179648e;

    /* renamed from: f */
    public final /* synthetic */ String f179649f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63312g(C63313h hVar, long j, String str) {
        super(0);
        this.f179647d = hVar;
        this.f179648e = j;
        this.f179649f = str;
    }

    public Object invoke() {
        C64100l0 l0Var = this.f179647d.f179652c;
        if (l0Var != null) {
            long j = this.f179648e;
            String str = this.f179649f;
            C87412m.m108594g(str, "wording");
            C62080b bVar = l0Var.f181755q;
            bVar.getClass();
            Iterator<C62080b.C62081a> it = bVar.f176506e.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C62080b.C62081a next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C62080b.C62081a aVar = next;
                    if (aVar.f176512a.f181347t == j) {
                        Log.m105924i("FinderLiveShoppingEditAdapter", "updateProductRecommendWording index:" + i + ",product:" + aVar.f176512a.f181348u + '(' + aVar.f176512a.f181347t + ") from:" + aVar.f176512a.f181346s.f183162G + " to " + str);
                        aVar.f176512a.f181346s.f183162G = str;
                        bVar.notifyItemChanged(i);
                        break;
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
