package com.tencent.p014mm.plugin.gallery.p473ui;

import android.view.animation.Animation;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.plugin.gallery.p473ui.ImageFolderMgrView;

/* renamed from: com.tencent.mm.plugin.gallery.ui.j */
public class C94067j implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ImageFolderMgrView f271605a;

    public C94067j(ImageFolderMgrView imageFolderMgrView) {
        this.f271605a = imageFolderMgrView;
    }

    public void onAnimationEnd(Animation animation) {
        ImageFolderMgrView imageFolderMgrView = this.f271605a;
        imageFolderMgrView.f271358i = true;
        imageFolderMgrView.f271359j = false;
        ImageFolderMgrView.C94005d dVar = imageFolderMgrView.f271363q;
        if (dVar != null) {
            ((AlbumPreviewUI.C93989c) dVar).mo128962a(true);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
