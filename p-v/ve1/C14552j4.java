package ve1;

import android.widget.TextView;
import cm1.C0764p0;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.j4 */
public final class C14552j4 extends C60896i<C0764p0> {

    /* renamed from: e */
    public final String f40328e;

    public C14552j4(String str) {
        C87412m.m108594g(str, "city");
        this.f40328e = str;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d9u;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0764p0 p0Var = (C0764p0) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(p0Var, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.ohg);
        String str = p0Var.f1803d.f186730e;
        textView.setText(str == null || str.length() == 0 ? this.f40328e : p0Var.f1803d.f186730e);
        oVar.f44854d.postDelayed(new C14544i4(this, oVar, i), 300);
    }
}
