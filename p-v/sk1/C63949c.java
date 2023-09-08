package sk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import pl1.C11978e0;
import te3.C50169kr1;

/* renamed from: sk1.c */
public final class C63949c extends C60896i<C63950d> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.acq;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        C60905o oVar2 = oVar;
        int i3 = i;
        C63950d dVar = (C63950d) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(dVar, "item");
        View D = oVar2.mo85812D(C0966R.C0970id.krm);
        View D2 = oVar2.mo85812D(C0966R.C0970id.agz);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        int i4 = 8;
        aVar.mo10233c(8);
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i3 == 0) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ViewGroup.LayoutParams layoutParams = D2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (i3 == oVar2.f173500B.getItemCount() - 1) {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(4);
            View view = D2;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view2 = D2;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/convert/GameSelectConvert", "initLines", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3760da));
            }
        }
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.eo6);
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.eku);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.eio);
        C50169kr1 kr12 = dVar.f181276d.f140523e;
        String str3 = "";
        if (kr12 == null || (str = kr12.f137002e) == null) {
            str = str3;
        }
        textView.setText(str);
        C50169kr1 kr13 = dVar.f181276d.f140523e;
        boolean z2 = true;
        if (kr13 == null || kr13.f137014t != 1) {
            z2 = false;
        }
        if (z2) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        if (!z) {
            C50169kr1 kr14 = dVar.f181276d.f140523e;
            if (!(kr14 == null || (str2 = kr14.f137003f) == null)) {
                str3 = str2;
            }
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C60200t1.C60201a.m70370h((C60200t1) c, str3, imageView, (C11978e0.C11979a) null, 4, (Object) null);
        }
        oVar2.f44854d.setTag(C0966R.C0970id.d4_, textView.getText());
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
