package zf1;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.FlowTextMixView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.plugin.finder.view.SimpleTouchableLayout;
import com.tencent.p014mm.view.HardTouchableLayout;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: zf1.m */
public final class C16155m {

    /* renamed from: a */
    public static final C16155m f43352a = new C16155m();

    /* renamed from: a */
    public final void mo14720a(C60905o oVar) {
        C60905o oVar2 = oVar;
        C87412m.m108594g(oVar2, "holder");
        Context context = oVar2.f173499A;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((FlowTextMixView) oVar2.f44854d.findViewById(C0966R.C0970id.eam)).setMaxWidth(((Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels);
        int color = oVar2.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_5);
        ViewGroup viewGroup = (ViewGroup) oVar2.mo85812D(C0966R.C0970id.e6u);
        View D = oVar2.mo85812D(C0966R.C0970id.edb);
        if (D != null) {
            View findViewById = D.findViewById(C0966R.C0970id.ji4);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = D.findViewById(C0966R.C0970id.bjq);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = D.findViewById(C0966R.C0970id.k07);
            if (findViewById3 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById4 = D.findViewById(C0966R.C0970id.a2s);
            findViewById4.setEnabled(false);
            ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3706by);
            marginLayoutParams.setMarginEnd(0);
            marginLayoutParams.rightMargin = 0;
            findViewById4.setLayoutParams(marginLayoutParams);
            ((TextView) D.findViewById(C0966R.C0970id.fnp)).setTextColor(color);
            ((WeImageView) D.findViewById(C0966R.C0970id.f1x)).setIconColor(color);
            View D2 = oVar2.mo85812D(C0966R.C0970id.a27);
            if (D2 != null) {
                D2.setEnabled(false);
            }
            if (D2 != null) {
                D2.setClickable(false);
            }
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.bh6);
            if (textView != null) {
                textView.setEnabled(false);
            }
            if (textView != null) {
                textView.setClickable(false);
            }
            if (textView != null) {
                textView.setTextColor(color);
            }
            View findViewById5 = viewGroup != null ? viewGroup.findViewById(C0966R.C0970id.a2r) : null;
            if (findViewById5 != null) {
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(4);
                View view4 = findViewById5;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        View D3 = oVar2.mo85812D(C0966R.C0970id.eh4);
        if (D3 != null && (D3 instanceof FinderFullSeekBarLayout)) {
            ((FinderFullSeekBarLayout) D3).setHidePrivateLike(true);
        }
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.fpi);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.egm);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        View D4 = oVar2.mo85812D(C0966R.C0970id.ec5);
        if (D4 != null) {
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view5 = D4;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View D5 = oVar2.mo85812D(C0966R.C0970id.ieh);
        if (D5 != null) {
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view6 = D5;
            C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById6 = oVar2.f44854d.findViewById(C0966R.C0970id.ec5);
        if (findViewById6 != null) {
            C9556a aVar7 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar7.mo10233c(8);
            View view7 = findViewById6;
            C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/gallery/FinderGalleryUILogic", "bindGalleryTimelineUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        NeatTextView neatTextView = (NeatTextView) oVar2.mo85812D(C0966R.C0970id.ki5);
        if (neatTextView != null) {
            neatTextView.setMaxLines(1);
        }
        if (neatTextView != null) {
            neatTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (neatTextView != null) {
            neatTextView.setTextColor(color);
        }
        float dimension = oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3766df);
        if (neatTextView != null) {
            int i = (int) dimension;
            neatTextView.setPadding(neatTextView.getPaddingLeft(), i, neatTextView.getPaddingRight(), i);
        }
        View D6 = oVar2.mo85812D(C0966R.C0970id.cym);
        ViewGroup.LayoutParams layoutParams2 = D6.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.bottomMargin = (int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3706by);
        layoutParams3.rightMargin = (int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3753d4);
        layoutParams3.setMarginEnd((int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3753d4));
        D6.setLayoutParams(layoutParams3);
        View view8 = oVar2.f44854d;
        SimpleTouchableLayout simpleTouchableLayout = view8 instanceof SimpleTouchableLayout ? (SimpleTouchableLayout) view8 : null;
        if (simpleTouchableLayout != null) {
            simpleTouchableLayout.setOnDoubleClickListener((SimpleTouchableLayout.C4004a) null);
            simpleTouchableLayout.setOnLongClickListener((SimpleTouchableLayout.C4006c) null);
        }
        FinderMediaLayout finderMediaLayout = (FinderMediaLayout) oVar2.mo85812D(C0966R.C0970id.ol_);
        if (finderMediaLayout != null) {
            finderMediaLayout.setOnDoubleClickListener((HardTouchableLayout.C7074a) null);
            finderMediaLayout.setOnLongClickListener((HardTouchableLayout.C7076c) null);
        }
    }
}
