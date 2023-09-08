package cz2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusRecentStatusView;
import fy3.C32224a;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import qz2.C36226f;
import rx3.C13598b0;

/* renamed from: cz2.p */
public final class C45240p extends C60896i<C36226f> {

    /* renamed from: e */
    public final C45242t f122583e;

    /* renamed from: f */
    public final C32224a<C13598b0> f122584f;

    public C45240p(C45242t tVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(tVar, "mOnItemClickListener");
        this.f122583e = tVar;
        this.f122584f = aVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d3d;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C36226f) cVar, "item");
        TextStatusRecentStatusView textStatusRecentStatusView = (TextStatusRecentStatusView) oVar.mo85812D(C0966R.C0970id.np4);
        textStatusRecentStatusView.setOnItemClickListener(this.f122583e);
        textStatusRecentStatusView.setOnRemoveListener(this.f122584f);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
