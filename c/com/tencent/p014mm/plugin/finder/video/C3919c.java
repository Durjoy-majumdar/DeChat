package com.tencent.p014mm.plugin.finder.video;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.plugin.finder.video.c */
public final class C3919c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeImageView f17595d;

    /* renamed from: e */
    public final /* synthetic */ FinderFullSeekBarLayout f17596e;

    public C3919c(WeImageView weImageView, FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f17595d = weImageView;
        this.f17596e = finderFullSeekBarLayout;
    }

    public final void run() {
        this.f17595d.setIconColor(this.f17596e.getContext().getResources().getColor(C0966R.color.f3585yj));
    }
}
