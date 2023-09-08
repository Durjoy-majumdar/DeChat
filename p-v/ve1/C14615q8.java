package ve1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: ve1.q8 */
public final class C14615q8 extends C60896i<C9493c> {

    /* renamed from: e */
    public int f40453e = 1;

    /* renamed from: f */
    public int f40454f;

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359789ar1;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(cVar, "item");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View findViewById = oVar.f44854d.findViewById(C0966R.C0970id.fol);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = this.f40453e;
        layoutParams2.height = this.f40454f;
        findViewById.setLayoutParams(layoutParams2);
    }
}
