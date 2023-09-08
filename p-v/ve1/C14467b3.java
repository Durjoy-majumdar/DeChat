package ve1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0726e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8808v4;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ve1.b3 */
public final class C14467b3 extends C60896i<C0726e> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aqd;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0726e) cVar, "item");
        View D = oVar.mo85812D(C0966R.C0970id.f358372eq3);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedNoMreFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedFooterNoMoreData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedNoMreFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedFooterNoMoreData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int dimension = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3743cv);
        int color = oVar.f173499A.getResources().getColor(C0966R.color.f3583yg);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.is_);
        textView.setTextColor(color);
        oVar.f44854d.setPadding(0, dimension, 0, dimension);
        textView.setText(oVar.f173499A.getString(C0966R.string.dab));
        ((WeImageView) oVar.mo85812D(C0966R.C0970id.f358372eq3)).setIconColor(color);
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            View D2 = oVar.mo85812D(C0966R.C0970id.f358372eq3);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = D2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedNoMreFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedFooterNoMoreData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedNoMreFooterConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FeedFooterNoMoreData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        oVar.f44854d.setOnClickListener(new C14455a3(oVar));
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
