package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.ViewParent;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import gr1.C59670o2;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.q */
public final class C56744q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59670o2 f162649d;

    public C56744q(C59670o2 o2Var) {
        this.f162649d = o2Var;
    }

    public final void run() {
        ViewParent parentView = this.f162649d.getParentView();
        FinderVideoLayout finderVideoLayout = parentView instanceof FinderVideoLayout ? (FinderVideoLayout) parentView : null;
        if (finderVideoLayout != null) {
            finderVideoLayout.getRetryBtn().performClick();
        }
    }
}
