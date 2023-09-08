package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.view.ViewParent;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.s */
public final class C56746s extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C59670o2, Boolean> f162652d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56746s(C32226l<? super C59670o2, Boolean> lVar) {
        super(1);
        this.f162652d = lVar;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        if (this.f162652d.invoke(o2Var).booleanValue()) {
            boolean z = o2Var.getParentView() instanceof FinderVideoLayout;
            boolean isPlaying = o2Var.isPlaying();
            o2Var.setVideoViewFocused(false);
            if (z) {
                ViewParent parentView = o2Var.getParentView();
                C87412m.m108592e(parentView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
                int i = FinderVideoLayout.f161844x0;
                ((FinderVideoLayout) parentView).mo79540B(false);
            }
            if (isPlaying) {
                o2Var.pause();
            }
        }
        return Boolean.FALSE;
    }
}
