package com.tencent.p014mm.plugin.finder.video;

import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.video.e */
public final class C56538e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f161977d;

    /* renamed from: e */
    public final /* synthetic */ FinderLivePlayView f161978e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56538e(boolean z, FinderLivePlayView finderLivePlayView) {
        super(0);
        this.f161977d = z;
        this.f161978e = finderLivePlayView;
    }

    public Object invoke() {
        float f = !this.f161977d ? 1.0f : 0.0f;
        ImageView imageView = this.f161978e.f161677n;
        if (!C87412m.m108588a(imageView != null ? Float.valueOf(imageView.getAlpha()) : null, f)) {
            FinderLivePlayView finderLivePlayView = this.f161978e;
            finderLivePlayView.mo79410L("set coverImage alpha:" + f);
            ImageView imageView2 = this.f161978e.f161677n;
            if (imageView2 != null) {
                imageView2.setAlpha(f);
            }
        }
        return C13598b0.f38549a;
    }
}
