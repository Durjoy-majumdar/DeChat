package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.animation.Animation;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.h1 */
public class C18744h1 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ExdeviceRankListHeaderView f52455a;

    public C18744h1(ExdeviceRankListHeaderView exdeviceRankListHeaderView) {
        this.f52455a = exdeviceRankListHeaderView;
    }

    public void onAnimationEnd(Animation animation) {
        this.f52455a.f52441h.reset();
        MMHandlerThread.postToMainThreadDelayed(this.f52455a.f52442i, 4000);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        this.f52455a.f52438e.setVisibility(0);
    }
}
