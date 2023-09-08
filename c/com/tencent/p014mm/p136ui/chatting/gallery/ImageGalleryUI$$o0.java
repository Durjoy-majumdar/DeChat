package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$o0 */
public class ImageGalleryUI$$o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f284528d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284529e;

    public ImageGalleryUI$$o0(ImageGalleryUI imageGalleryUI, C72963f4 f4Var) {
        this.f284529e = imageGalleryUI;
        this.f284528d = f4Var;
    }

    public void run() {
        Log.m105924i("MicroMsg.ImageGalleryUI", "mScanButtonStatusManager TYPE_DETECT_TRANSLATION_FOCUS,STATUS_SHOW post");
        ImageGalleryUI imageGalleryUI = this.f284529e;
        C72963f4 f4Var = this.f284528d;
        boolean z = f4Var != null && f4Var.mo101016t3();
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135738Q7(5, z);
        this.f284529e.f284393S.setVisibility(0);
    }
}
