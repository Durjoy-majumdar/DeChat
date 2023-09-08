package com.tencent.p014mm.plugin.finder.live.plugin;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import rx3.C13601g;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.e */
public final class C41463e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveBoxCommentPlugin f111653d;

    public C41463e(FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
        this.f111653d = finderLiveBoxCommentPlugin;
    }

    public final void onGlobalLayout() {
        boolean z;
        FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin = this.f111653d;
        if (finderLiveBoxCommentPlugin.mo64542Z0().isShown()) {
            C13601g<Rect> gVar = FinderLiveBoxCommentPlugin.f111629B;
            C13601g<Rect> gVar2 = FinderLiveBoxCommentPlugin.f111629B;
            if (((Rect) ((C36570n) gVar2).getValue()).right > 0 && ((Rect) ((C36570n) gVar2).getValue()).bottom > 0) {
                Rect rect = new Rect();
                this.f111653d.mo64542Z0().getGlobalVisibleRect(rect);
                z = this.f111653d.mo64542Z0().isShown() && rect.intersect((Rect) ((C36570n) gVar2).getValue());
                finderLiveBoxCommentPlugin.mo64549g1(z);
            }
        }
        z = this.f111653d.mo64542Z0().isShown();
        finderLiveBoxCommentPlugin.mo64549g1(z);
    }
}
