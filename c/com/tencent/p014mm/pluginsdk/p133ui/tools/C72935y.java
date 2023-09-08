package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.y */
public class C72935y implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ FileSelectorFolderView f212561a;

    public C72935y(FileSelectorFolderView fileSelectorFolderView) {
        this.f212561a = fileSelectorFolderView;
    }

    public void onAnimationEnd(Animation animation) {
        this.f212561a.f212492d.setVisibility(8);
        FileSelectorFolderView fileSelectorFolderView = this.f212561a;
        fileSelectorFolderView.f212495g = false;
        fileSelectorFolderView.f212496h = false;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
