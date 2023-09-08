package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import tk2.C22543c;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$q0 */
public class ImageGalleryUI$$q0 implements C22543c {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284534a;

    public ImageGalleryUI$$q0(ImageGalleryUI imageGalleryUI) {
        this.f284534a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo35638a(DialogInterface dialogInterface) {
    }

    /* renamed from: b */
    public void mo35639b(long j) {
        ImageGalleryUI imageGalleryUI = this.f284534a;
        imageGalleryUI.f284475v = false;
        MMViewPager mMViewPager = imageGalleryUI.f284450n;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(false);
            imageGalleryUI.f284450n.setSingleMode(true);
        }
    }

    /* renamed from: c */
    public void mo35640c(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.ImageGalleryUI", "alvinluo dealWithImageOcr onDialogShow");
        ImageGalleryUI imageGalleryUI = this.f284534a;
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135769f9(false);
    }

    /* renamed from: d */
    public void mo35641d(DialogInterface dialogInterface) {
        ImageGalleryUI imageGalleryUI = this.f284534a;
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135729L8();
    }

    public void onError(int i, int i2) {
        ImageGalleryUI imageGalleryUI = this.f284534a;
        int i3 = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135729L8();
        this.f284534a.mo135769f9(false);
    }
}
