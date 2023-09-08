package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.gallery.view.FullScreenStatusMaskView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$b */
public final /* synthetic */ class ImageGalleryUI$$b implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f216402d;

    public /* synthetic */ ImageGalleryUI$$b(ImageGalleryUI imageGalleryUI) {
        this.f216402d = imageGalleryUI;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ImageGalleryUI imageGalleryUI = this.f216402d;
        if (imageGalleryUI.f284374M) {
            int[] iArr = new int[2];
            imageGalleryUI.f284353F.getLocationInWindow(iArr);
            FullScreenStatusMaskView fullScreenStatusMaskView = imageGalleryUI.f284371L;
            fullScreenStatusMaskView.getClass();
            int i9 = iArr[0];
            if (i9 != 0 || iArr[1] != 0) {
                fullScreenStatusMaskView.f216440f.setX((float) i9);
                fullScreenStatusMaskView.f216440f.setY((float) iArr[1]);
                View view2 = fullScreenStatusMaskView.f216440f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/view/FullScreenStatusMaskView", "updateBtnLocation", "([I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/gallery/view/FullScreenStatusMaskView", "updateBtnLocation", "([I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
