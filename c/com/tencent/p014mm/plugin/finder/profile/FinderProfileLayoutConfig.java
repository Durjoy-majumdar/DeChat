package com.tencent.p014mm.plugin.finder.profile;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import kg3.C76577a;
import os1.C11744g;
import up1.C14367u0;

/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig */
public final class FinderProfileLayoutConfig extends C14367u0 {

    /* renamed from: a */
    public final Activity f16110a;

    /* renamed from: b */
    public final boolean f16111b;

    /* renamed from: c */
    public final boolean f16112c;

    /* renamed from: d */
    public final boolean f16113d;

    /* renamed from: e */
    public final int f16114e;

    /* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig$a */
    public static final class C3422a extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileLayoutConfig f16115d;

        public C3422a(FinderProfileLayoutConfig finderProfileLayoutConfig) {
            this.f16115d = finderProfileLayoutConfig;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int b = C76577a.m92151b(this.f16115d.f16110a, 1) / 2;
            rect.left = b;
            rect.right = b;
            rect.bottom = b;
            rect.top = b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig$b */
    public static final class C3423b extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int dimension = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3766df);
            int dimension2 = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3703bv);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            if (((GridLayoutManager.LayoutParams) layoutParams).f44673h % 2 == 0) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        if (up1.C37521f.f99443k7.mo60266n().intValue() == 1) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FinderProfileLayoutConfig(android.app.Activity r2, boolean r3, int r4, boolean r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r2, r0)
            r1.<init>()
            r1.f16110a = r2
            r1.f16111b = r3
            r1.f16112c = r5
            r2 = 1
            if (r4 != 0) goto L_0x0027
            if (r5 != 0) goto L_0x0028
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99443k7
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            r1.f16113d = r2
            if (r2 == 0) goto L_0x002e
            r2 = 3
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r1.f16114e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.FinderProfileLayoutConfig.<init>(android.app.Activity, boolean, int, boolean):void");
    }

    /* renamed from: b */
    public C9500j mo3010b(C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        return new FinderProfileLayoutConfig$getItemConvertFactory$1(this, lVar);
    }

    /* renamed from: c */
    public RecyclerView.C0129l mo3665c() {
        return this.f16114e == 3 ? new C3422a(this) : new C3423b();
    }

    /* renamed from: d */
    public RecyclerView.LayoutManager mo3666d(Context context) {
        C87412m.m108594g(context, "context");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.f16114e);
        gridLayoutManager.setItemPrefetchEnabled(true);
        return gridLayoutManager;
    }

    /* renamed from: e */
    public RecyclerView.C16623q mo3667e(MMActivity mMActivity) {
        Class cls = C11744g.class;
        C87412m.m108594g(mMActivity, "context");
        return this.f16113d ? ((C11744g) C39818r.f106831a.mo62444c(mMActivity).mo75002a(cls)).f34392g : ((C11744g) C39818r.f106831a.mo62444c(mMActivity).mo75002a(cls)).f34391f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderProfileLayoutConfig(Activity activity, boolean z, int i, boolean z2, int i2, C8480h hVar) {
        this(activity, z, i, (i2 & 8) != 0 ? false : z2);
    }
}
