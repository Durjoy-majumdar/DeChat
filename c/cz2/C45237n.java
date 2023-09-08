package cz2;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39691c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import qy2.C63347a;
import qz2.C47914d;
import rz2.C48201c;

/* renamed from: cz2.n */
public final class C45237n extends C60896i<C47914d> {

    /* renamed from: e */
    public final C45241s f122580e;

    public C45237n(C45241s sVar) {
        C87412m.m108594g(sVar, "onItemClickListener");
        this.f122580e = sVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d3c;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C47914d dVar = (C47914d) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(dVar, "item");
        ((TextView) oVar.mo85812D(C0966R.C0970id.kww)).setText(dVar.f128569d);
        C39691c.m42340S(IStatusIconHelperKt.m39109a(), (ImageView) oVar.mo85812D(C0966R.C0970id.f66), dVar.f128570e, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
        oVar.f44854d.setOnClickListener(new C45236m(dVar, this));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
