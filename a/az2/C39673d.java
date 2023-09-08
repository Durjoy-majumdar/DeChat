package az2;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import qz2.C47917h;

/* renamed from: az2.d */
public final class C39673d extends C60896i<C47917h> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.c_1;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47917h hVar = (C47917h) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(hVar, "item");
        ((TextView) oVar.mo85812D(C0966R.C0970id.kx7)).setText(hVar.f128575d);
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.fcs);
        ((TextView) oVar.mo85812D(C0966R.C0970id.f359440kx0)).setOnClickListener(new C39671c(hVar));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
