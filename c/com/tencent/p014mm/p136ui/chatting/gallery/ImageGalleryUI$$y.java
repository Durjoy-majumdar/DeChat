package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import gk3.C98162q;
import nj3.C11182m0;
import nj3.C76874e0;
import p200lx.C46900z;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y */
public class ImageGalleryUI$$y implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284557d;

    public ImageGalleryUI$$y(ImageGalleryUI imageGalleryUI) {
        this.f284557d = imageGalleryUI;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        ImageGalleryUI imageGalleryUI = this.f284557d;
        int i = ImageGalleryUI.f284337S2;
        if (imageGalleryUI.mo135792x8(2)) {
            ImageGalleryUI imageGalleryUI2 = this.f284557d;
            if (imageGalleryUI2.mo135747U8(imageGalleryUI2.f284451n1.f287785a)) {
                ImageGalleryUI imageGalleryUI3 = this.f284557d;
                C46900z zVar = imageGalleryUI3.f284401U1;
                C98162q qVar = imageGalleryUI3.f284451n1;
                ((ScanCodeSheetItemLogic) zVar).mo67074e(qVar.f287785a, qVar.f287786b, imageGalleryUI3.f284448m1, e0Var, 3);
            }
        }
    }
}
