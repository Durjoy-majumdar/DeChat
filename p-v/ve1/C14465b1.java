package ve1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0787w;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import up1.C27696y;

/* renamed from: ve1.b1 */
public final class C14465b1 extends C60896i<C0787w> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cyy;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0787w wVar = (C0787w) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(wVar, "item");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f358066n81);
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = oVar.f173499A;
        String str = wVar.f1843d.f138635d;
        if (str == null) {
            str = "";
        }
        textView.setText(hVar.mo107057T1(context, str));
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.f358065n80);
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> K1 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11865K1();
        C62345f fVar = new C62345f(wVar.f1843d.f138636e, (C27696y) null, 2, (C8480h) null);
        C87412m.m108593f(imageView, "avatarIv");
        K1.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        View D = oVar.mo85812D(C0966R.C0970id.nts);
        int i3 = wVar.f1843d.f138639h == 1 ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view = D;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFavConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedFav;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
