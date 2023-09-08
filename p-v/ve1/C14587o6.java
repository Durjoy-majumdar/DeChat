package ve1;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0784u1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
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
import kg3.C76577a;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C51124rl1;
import up1.C27696y;

/* renamed from: ve1.o6 */
public final class C14587o6 extends C60896i<C0784u1> {

    /* renamed from: e */
    public final boolean f40411e;

    public C14587o6(boolean z) {
        this.f40411e = z;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.amq;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C0784u1 u1Var = (C0784u1) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(u1Var, "item");
        u1Var.f1835e = i;
        C51124rl1 rl12 = u1Var.f1834d;
        if (rl12.f141004j != 4 || TextUtils.isEmpty(rl12.f141005n)) {
            View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.ftz);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.m_7);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ImageView imageView = (ImageView) oVar2.f44854d.findViewById(C0966R.C0970id.m_7);
            View findViewById3 = oVar2.f44854d.findViewById(C0966R.C0970id.ftz);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderNearbyLiveFollowDividerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderNearbyLiveFollowPlacedDivider;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(0);
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(u1Var.f1834d.f141005n, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
        }
        View findViewById4 = oVar2.f44854d.findViewById(C0966R.C0970id.haf);
        C87412m.m108593f(findViewById4, "holder.itemView.findView…R.id.nearby_live_divider)");
        if (this.f40411e) {
            findViewById4.setBackgroundColor(findViewById4.getResources().getColor(C0966R.color.f2947a4));
        } else {
            findViewById4.setBackgroundColor(findViewById4.getResources().getColor(C0966R.color.BW_100));
        }
        View findViewById5 = oVar2.f44854d.findViewById(C0966R.C0970id.hah);
        C87412m.m108593f(findViewById5, "holder.itemView.findViewById(R.id.nearby_live_tv)");
        TextView textView = (TextView) findViewById5;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        if (this.f40411e) {
            textView.setTextColor(textView.getResources().getColor(C0966R.color.BW_0_Alpha_0_9_Night_Mode));
            textView.setTextSize(0, ((float) C76577a.m92155f(textView.getContext(), C0966R.dimen.a6j)) * C76577a.m92165p(textView.getContext()));
        }
        if (!TextUtils.isEmpty(u1Var.f1834d.f140999e)) {
            oVar2.mo85815G(C0966R.C0970id.hah, u1Var.f1834d.f140999e);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
