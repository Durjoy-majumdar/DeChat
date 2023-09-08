package com.tencent.p014mm.plugin.finder.storage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import er1.C7878t0;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import os1.C11744g;
import te3.C64273c21;
import up1.C14367u0;

/* renamed from: com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig */
public final class FinderLbsStaggeredConfig extends C14367u0 {

    /* renamed from: a */
    public final MMActivity f16719a;

    /* renamed from: b */
    public final int f16720b = 2;

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig$a */
    public static final class C3627a extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            int dimension2 = (int) view.getContext().getResources().getDimension(C0966R.dimen.a66);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams2).mo17429e() % 2 == 0) {
                rect.left = dimension;
                rect.right = dimension2;
                rect.bottom = dimension2;
                rect.top = dimension2;
                return;
            }
            rect.left = dimension2;
            rect.right = dimension;
            rect.bottom = dimension2;
            rect.top = dimension2;
        }
    }

    public FinderLbsStaggeredConfig(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        this.f16719a = mMActivity;
    }

    /* renamed from: f */
    public static final void m3799f(FinderLbsStaggeredConfig finderLbsStaggeredConfig, C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C60905o oVar2 = oVar;
        finderLbsStaggeredConfig.getClass();
        View D = oVar2.mo85812D(C0966R.C0970id.da7);
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.fnu);
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.fnp);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        String str = baseFinderFeed.mo3513o().getFeedObject().recommendReason;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        int i = baseFinderFeed.mo3513o().getFeedObject().recommendReasonType;
        if (i != 1) {
            switch (i) {
                case 9:
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Context context = oVar2.f173499A;
                    imageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_me, context.getResources().getColor(C0966R.color.f2975b6)));
                    imageView.setVisibility(0);
                    break;
                case 10:
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    C117292a.m165358d(D, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Context context2 = oVar2.f173499A;
                    imageView.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.finder_icons_filled_topic, context2.getResources().getColor(C0966R.color.f2975b6)));
                    imageView.setVisibility(0);
                    break;
                case 11:
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    C117292a.m165358d(D, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Context context3 = oVar2.f173499A;
                    imageView.setImageDrawable(C74933u4.m89768e(context3, C0966R.raw.finder_icons_filled_sight, context3.getResources().getColor(C0966R.color.f2975b6)));
                    imageView.setVisibility(0);
                    break;
                case 12:
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(0);
                    C117292a.m165358d(D, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Context context4 = oVar2.f173499A;
                    imageView.setImageDrawable(C74933u4.m89768e(context4, C0966R.raw.finder_filled_fire, context4.getResources().getColor(C0966R.color.f2975b6)));
                    imageView.setVisibility(0);
                    break;
                case 13:
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(0);
                    C117292a.m165358d(D, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Context context5 = oVar2.f173499A;
                    imageView.setImageDrawable(C74933u4.m89768e(context5, C0966R.raw.finder_icons_filled_food, context5.getResources().getColor(C0966R.color.f2975b6)));
                    imageView.setVisibility(0);
                    break;
            }
        } else {
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            C117292a.m165358d(D, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Context context6 = oVar2.f173499A;
            imageView.setImageDrawable(C74933u4.m89768e(context6, C0966R.raw.icons_filled_location, context6.getResources().getColor(C0966R.color.f2975b6)));
            imageView.setVisibility(0);
        }
        if (baseFinderFeed.mo3513o().isLiveFeed()) {
            C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
            if (liveInfo != null && liveInfo.f182394f == 1) {
                C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
                int i2 = liveInfo2 != null ? liveInfo2.f182403q : 0;
                if (i2 > 0) {
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(0);
                    C117292a.m165358d(D, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(D, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(8);
                    textView.setText(oVar2.f173499A.getString(C0966R.string.dvm, new Object[]{C7878t0.m8034c(2, i2)}));
                    return;
                }
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(8);
            View view2 = D;
            C117292a.m165358d(view2, aVar10.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig", "bindConvert", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new FinderLbsStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }

    /* renamed from: c */
    public RecyclerView.C0129l mo3665c() {
        return new C3627a();
    }

    /* renamed from: d */
    public RecyclerView.LayoutManager mo3666d(Context context) {
        C87412m.m108594g(context, "context");
        FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new FinderStaggeredGridLayoutManager(this.f16720b, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    /* renamed from: e */
    public RecyclerView.C16623q mo3667e(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        return ((C11744g) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C11744g.class)).f34391f;
    }
}
