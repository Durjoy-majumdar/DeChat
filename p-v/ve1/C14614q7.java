package ve1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0728e2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import sx3.C110818d0;
import up1.C27696y;

/* renamed from: ve1.q7 */
public final class C14614q7 extends C60896i<C0728e2> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aoc;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0728e2 e2Var = (C0728e2) cVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(e2Var, "item");
        View D = oVar.mo85812D(C0966R.C0970id.i3u);
        LinkedList<String> linkedList = e2Var.f1742d.f183178f;
        C87412m.m108593f(linkedList, "item.productInfo.img_urls");
        Object O = C110818d0.m150917O(linkedList, 0);
        if (!(D == null || O == null)) {
            C39818r rVar = C39818r.f106831a;
            ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11870V().mo85957c(new C11984n0((String) O, C27696y.THUMB_IMAGE), (ImageView) D, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.COMMON));
        }
        String a0 = C58739j4.f168176a.mo83699a0(e2Var.f1742d.f183181i);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.i3y);
        if (textView != null) {
            textView.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.e88, new Object[]{a0}));
        }
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.i3f);
        if (textView2 != null) {
            textView2.setText(e2Var.f1742d.f183177e);
        }
        C39818r rVar2 = C39818r.f106831a;
        Context context = oVar.f173499A;
        C87412m.m108593f(context, "holder.context");
        if (((FinderProfileUiStyleUIC) rVar2.mo62443b(context).mo75002a(FinderProfileUiStyleUIC.class)).mo3861i0()) {
            View D2 = oVar.mo85812D(C0966R.C0970id.muk);
            if (D2 != null) {
                D2.setBackgroundResource(C0966R.color.f2949a6);
            }
            TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.i3f);
            if (textView3 != null) {
                textView3.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9_Night_Mode));
            }
            TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.i3y);
            if (textView4 != null) {
                textView4.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9_Night_Mode));
            }
        } else {
            View D3 = oVar.mo85812D(C0966R.C0970id.muk);
            if (D3 != null) {
                D3.setBackgroundResource(C0966R.color.al6);
            }
            TextView textView5 = (TextView) oVar.mo85812D(C0966R.C0970id.i3f);
            if (textView5 != null) {
                textView5.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            }
            TextView textView6 = (TextView) oVar.mo85812D(C0966R.C0970id.i3y);
            if (textView6 != null) {
                textView6.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_0_Alpha_0_9));
            }
        }
        View D4 = oVar.mo85812D(C0966R.C0970id.i6x);
        if (D4 != null) {
            D4.setTag(C0966R.C0970id.d5i, e2Var.f1742d.f183177e);
            D4.setTag(C0966R.C0970id.d5f, a0);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.i3y);
        if (textView != null) {
            C58739j4.f168176a.mo83703c0(textView, false);
        }
    }
}
