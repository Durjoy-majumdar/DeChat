package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import android.view.animation.Animation;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.gallery.k0 */
public class C97079k0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284789a;

    public C97079k0(ImageGalleryUI imageGalleryUI) {
        this.f284789a = imageGalleryUI;
    }

    public void onAnimationEnd(Animation animation) {
        ImageGalleryUI imageGalleryUI = this.f284789a;
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135780n8();
        if (imageGalleryUI.f284486y0.getVisibility() == 0) {
            this.f284789a.mo135722E8();
            ImageGalleryUI imageGalleryUI2 = this.f284789a;
            imageGalleryUI2.mo135780n8();
            View view = imageGalleryUI2.f284414Z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$54", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$54", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f284789a.mo135753X8(false);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
