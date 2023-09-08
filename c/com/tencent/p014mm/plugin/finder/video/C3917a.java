package com.tencent.p014mm.plugin.finder.video;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.plugin.finder.video.a */
public final class C3917a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeImageView f17591d;

    /* renamed from: e */
    public final /* synthetic */ FinderFullSeekBarLayout f17592e;

    public C3917a(WeImageView weImageView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f17591d = weImageView;
        this.f17592e = finderFullSeekBarLayout;
    }

    public final void run() {
        this.f17591d.setIconColor(this.f17592e.getContext().getResources().getColor(C0966R.color.Red_90));
    }
}
