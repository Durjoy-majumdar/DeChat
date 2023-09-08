package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.gallery.j0 */
public class C97075j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284782d;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.j0$a */
    public class C97076a implements Animation.AnimationListener {
        public C97076a() {
        }

        public void onAnimationEnd(Animation animation) {
            if (C97075j0.this.f284782d.f284365J.getVisibility() == 0) {
                View view = C97075j0.this.f284782d.f284365J;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53$1", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C97075j0.this.f284782d.mo135753X8(false);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public C97075j0(ImageGalleryUI imageGalleryUI) {
        this.f284782d = imageGalleryUI;
    }

    public void run() {
        this.f284782d.mo135753X8(false);
        Animation a8 = this.f284782d.mo135758a8(1000);
        a8.setAnimationListener(new C97076a());
        Display display = this.f284782d.getContentView().getDisplay();
        if (!(display == null || display.getRotation() == 0 || display.getRotation() == 2)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f284782d.f284400U0.getLayoutParams();
            layoutParams.addRule(1, C0966R.C0970id.m8v);
            this.f284782d.f284400U0.setLayoutParams(layoutParams);
        }
        this.f284782d.f284359H.setVisibility(8);
        this.f284782d.f284362I.setVisibility(8);
        View view = this.f284782d.f284365J;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$53", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f284782d.f284365J.startAnimation(a8);
    }
}
