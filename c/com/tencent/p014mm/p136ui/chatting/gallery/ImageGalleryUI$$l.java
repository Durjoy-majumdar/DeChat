package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import tk2.C101903a;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$l */
public class ImageGalleryUI$$l implements MMViewPager.C19704d {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284519a;

    public ImageGalleryUI$$l(ImageGalleryUI imageGalleryUI) {
        this.f284519a = imageGalleryUI;
    }

    /* renamed from: a */
    public boolean mo26054a(MotionEvent motionEvent) {
        C101903a aVar = this.f284519a.f284420b2;
        if (aVar != null) {
            return aVar.onDoubleTap(motionEvent);
        }
        return false;
    }
}
