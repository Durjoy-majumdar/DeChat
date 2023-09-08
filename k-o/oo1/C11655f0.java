package oo1;

import android.view.View;
import er1.C7776a;
import er1.C7788c1;
import er1.C7802g1;
import gy3.C87412m;
import oo1.C11614d0;
import te3.C49359f1;
import te3.C51559uk1;
import zp3.C23555k;

/* renamed from: oo1.f0 */
public final class C11655f0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C11614d0.C11618c f34162a;

    public C11655f0(C11614d0.C11618c cVar) {
        this.f34162a = cVar;
    }

    /* renamed from: a */
    public long mo52a(View view) {
        C87412m.m108594g(view, "view");
        String str = this.f34162a.f34065a.f132122h;
        return str != null ? (long) str.hashCode() : 0 + ((long) view.hashCode());
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C51559uk1 a;
        C87412m.m108594g(view, "view");
        if (z && (a = C7802g1.m7949a(this.f34162a.f34065a)) != null) {
            C11614d0.C11618c cVar = this.f34162a;
            C49359f1 f1Var = a.f142912z;
            boolean z2 = false;
            if (f1Var != null && (!C7776a.m7931a(f1Var))) {
                z2 = true;
            }
            if (z2) {
                C7788c1 c1Var = C7788c1.f26289a;
                String str = a.f142894e;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                String str3 = cVar.f34065a.f132122h;
                if (str3 != null) {
                    str2 = str3;
                }
                c1Var.mo8899b(str, str2, true);
            }
        }
    }
}
