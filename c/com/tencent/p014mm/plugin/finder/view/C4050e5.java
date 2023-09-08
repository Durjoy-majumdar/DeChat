package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.e5 */
public final class C4050e5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderTagView f18151d;

    public C4050e5(FinderTagView finderTagView) {
        this.f18151d = finderTagView;
    }

    public final void run() {
        FinderTagView finderTagView = this.f18151d;
        if (!finderTagView.f17953n) {
            int size = ((ArrayList) finderTagView.getTagLayout().f162129d).size();
            this.f18151d.getFoldedView().clear();
            for (int i = 1; i < size; i++) {
                Object obj = ((ArrayList) this.f18151d.getTagLayout().f162129d).get(i);
                C87412m.m108593f(obj, "tagLayout.mAllViews[i]");
                FinderTagView finderTagView2 = this.f18151d;
                for (View add : (Iterable) obj) {
                    finderTagView2.getFoldedView().add(add);
                }
            }
            ArrayList<View> foldedView = this.f18151d.getFoldedView();
            FinderTagView finderTagView3 = this.f18151d;
            for (View removeView : foldedView) {
                finderTagView3.getTagLayout().removeView(removeView);
            }
            this.f18151d.setFolded(true);
            this.f18151d.mo4715b();
            C32224a<C13598b0> onFlodListener = this.f18151d.getOnFlodListener();
            if (onFlodListener != null) {
                onFlodListener.invoke();
            }
        }
    }
}
