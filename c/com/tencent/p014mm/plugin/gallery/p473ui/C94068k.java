package com.tencent.p014mm.plugin.gallery.p473ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.gallery.p473ui.ImageFolderMgrView;

/* renamed from: com.tencent.mm.plugin.gallery.ui.k */
public class C94068k implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ImageFolderMgrView f271606a;

    public C94068k(ImageFolderMgrView imageFolderMgrView) {
        this.f271606a = imageFolderMgrView;
    }

    public void onAnimationEnd(Animation animation) {
        this.f271606a.f271354e.setVisibility(8);
        ImageFolderMgrView imageFolderMgrView = this.f271606a;
        imageFolderMgrView.f271358i = false;
        imageFolderMgrView.f271359j = false;
        ImageFolderMgrView.C94005d dVar = imageFolderMgrView.f271363q;
        if (dVar != null) {
            ((AlbumPreviewUI.C93989c) dVar).mo128962a(false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
