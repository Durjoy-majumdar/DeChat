package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.animation.Animation;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.z */
public class C72936z implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ FileSelectorFolderView f212562a;

    public C72936z(FileSelectorFolderView fileSelectorFolderView) {
        this.f212562a = fileSelectorFolderView;
    }

    public void onAnimationEnd(Animation animation) {
        FileSelectorFolderView fileSelectorFolderView = this.f212562a;
        fileSelectorFolderView.f212495g = true;
        fileSelectorFolderView.f212496h = false;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
