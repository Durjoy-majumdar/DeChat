package dp1;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import ef1.C58553c;
import ef1.C58556f;
import ef1.C7637b;
import ef1.C7647p;
import er1.C58784w3;
import gy3.C87412m;
import pe1.C35464c;
import rx3.C13604l;
import up1.C37521f;

/* renamed from: dp1.h0 */
public final class C7439h0 extends C58556f {

    /* renamed from: s */
    public final boolean f25629s;

    public C7439h0(C58553c cVar) {
        super(cVar);
        new Rect();
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C35464c<Integer> cVar2 = C37521f.f99315W0;
        boolean z = true;
        if (cVar2.mo60266n().intValue() != 1) {
            fVar.getClass();
            if (cVar2.mo60266n().intValue() != 2) {
                z = false;
            }
        }
        this.f25629s = z;
    }

    /* renamed from: b */
    public C7637b mo8587b(RecyclerView recyclerView, int i) {
        int i2;
        C87412m.m108594g(recyclerView, "recyclerView");
        C7647p pVar = (C7647p) mo8588g(i);
        C58784w3 w3Var = C58784w3.f168295a;
        C13604l<Integer, Integer> w0 = w3Var.mo83974w0(recyclerView, this.f25629s);
        int intValue = ((Number) w0.f38555d).intValue();
        int intValue2 = ((Number) w0.f38556e).intValue();
        pVar.f25973e = intValue;
        pVar.f25974f = intValue2;
        pVar.f25976h = w3Var.mo83903U(intValue, intValue2, recyclerView);
        int i3 = this.f167611e;
        int i4 = pVar.f25973e;
        if (!(i3 == i4 && this.f167612f == pVar.f25974f)) {
            if (i3 == Integer.MAX_VALUE || (i2 = this.f167612f) == Integer.MAX_VALUE) {
                i2 = pVar.f25974f;
            } else {
                if (i4 < i3) {
                    i3 = i4;
                }
                int i5 = pVar.f25974f;
                if (i5 > i2) {
                    i2 = i5;
                }
                i4 = i3;
            }
            pVar.f25975g = w3Var.mo83903U(i4, i2, recyclerView);
        }
        this.f167611e = pVar.f25973e;
        this.f167612f = pVar.f25974f;
        return pVar;
    }

    /* renamed from: g */
    public C7637b mo8588g(int i) {
        return new C7647p(i);
    }
}
