package cz2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b03.C39691c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import lz2.C34452l;
import qy2.C63347a;
import rz2.C48201c;

/* renamed from: cz2.v */
public final class C45244v extends C60896i<C34452l> {

    /* renamed from: e */
    public final C45242t f122587e;

    public C45244v(C45242t tVar) {
        this.f122587e = tVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d3f;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C34452l lVar = (C34452l) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(lVar, "item");
        View D = oVar2.mo85812D(C0966R.C0970id.c7p);
        int i3 = i == 0 ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/RecentStatusInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/RecentStatusInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C39691c a = IStatusIconHelperKt.m39109a();
        String str = lVar.f92747d;
        ((TextView) oVar2.mo85812D(C0966R.C0970id.nqr)).setText(lVar.f92748e);
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.nnv);
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(0);
            imageView.setLayoutParams(layoutParams2);
        }
        C39691c.m42340S(a, imageView, str, (C63347a.C47893d) null, (C63347a.C47891b) null, (C48201c) null, false, false, 124, (Object) null);
        oVar2.f44854d.setOnClickListener(new C45243u(this, lVar));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
