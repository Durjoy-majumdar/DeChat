package com.tencent.p014mm.plugin.finder.storage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import dq1.C7461a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C9500j;
import os1.C11744g;
import up1.C14367u0;

/* renamed from: com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig */
public class FinderStaggeredConfig extends C14367u0 {

    /* renamed from: a */
    public final int f16723a;

    /* renamed from: b */
    public final C7461a f16724b;

    /* renamed from: c */
    public final int f16725c;

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig$a */
    public static final class C3630a {
        public C3630a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderStaggeredConfig$b */
    public static final class C3631b extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(rect);
            arrayList.add(view);
            arrayList.add(recyclerView);
            arrayList.add(wVar);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$1", "com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$androidx/recyclerview/widget/RecyclerView$ItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", this, array);
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3766df);
            int dimension2 = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i) {
                rect.left = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.top = 0;
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams2).mo17429e() % 2 == 0) {
                    rect.left = dimension;
                    rect.right = dimension2;
                    rect.bottom = dimension2;
                    rect.top = dimension2;
                } else {
                    rect.left = dimension2;
                    rect.right = dimension;
                    rect.bottom = dimension2;
                    rect.top = dimension2;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$1", "com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$androidx/recyclerview/widget/RecyclerView$ItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V");
        }
    }

    static {
        new C3630a((C8480h) null);
    }

    public FinderStaggeredConfig(int i, C7461a aVar) {
        C87412m.m108594g(aVar, "itemViewConfig");
        this.f16723a = i;
        this.f16724b = aVar;
        this.f16725c = 2;
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new FinderStaggeredConfig$getItemConvertFactory$1(this, lVar);
    }

    /* renamed from: c */
    public RecyclerView.C0129l mo3665c() {
        return new C3631b();
    }

    /* renamed from: d */
    public RecyclerView.LayoutManager mo3666d(Context context) {
        C87412m.m108594g(context, "context");
        FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new FinderStaggeredGridLayoutManager(mo4004f(), 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    /* renamed from: e */
    public RecyclerView.C16623q mo3667e(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "context");
        return ((C11744g) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C11744g.class)).f34391f;
    }

    /* renamed from: f */
    public int mo4004f() {
        return this.f16725c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FinderStaggeredConfig(int r1, dq1.C7461a r2, int r3, gy3.C8480h r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0005
            r1 = -1
        L_0x0005:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0011
            dq1.a r2 = new dq1.a
            r2.<init>()
            r3 = 0
            r2.f25670b = r3
        L_0x0011:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig.<init>(int, dq1.a, int, gy3.h):void");
    }
}
