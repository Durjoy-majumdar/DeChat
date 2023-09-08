package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.view.f1 */
public final class C56607f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MMFragmentActivity f162295d;

    /* renamed from: e */
    public final /* synthetic */ View f162296e;

    /* renamed from: f */
    public final /* synthetic */ FinderCommentDrawer f162297f;

    /* renamed from: g */
    public final /* synthetic */ FrameLayout.LayoutParams f162298g;

    /* renamed from: h */
    public final /* synthetic */ FinderCommentDrawer.C56550a f162299h;

    /* renamed from: i */
    public final /* synthetic */ boolean f162300i;

    public C56607f1(MMFragmentActivity mMFragmentActivity, View view, FinderCommentDrawer finderCommentDrawer, FrameLayout.LayoutParams layoutParams, FinderCommentDrawer.C56550a aVar, boolean z) {
        this.f162295d = mMFragmentActivity;
        this.f162296e = view;
        this.f162297f = finderCommentDrawer;
        this.f162298g = layoutParams;
        this.f162299h = aVar;
        this.f162300i = z;
    }

    public final void run() {
        int e = C75044y4.m89993e(this.f162295d);
        Log.m105924i("Finder.CommentDrawer", "[initView] bottomMargin= " + e);
        View view = this.f162296e;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) view).addView(this.f162297f, this.f162298g);
        this.f162299h.mo79737a(this.f162295d, this.f162297f.getHeaderLayout(), this.f162300i);
        this.f162299h.mo79738b(this.f162295d, this.f162297f.getCenterLayout());
        this.f162299h.mo79739c(this.f162295d, this.f162297f.getFooterLayout(), this.f162300i);
        this.f162299h.mo79740d(this.f162295d, this.f162297f.getLoadingLayout());
    }
}
