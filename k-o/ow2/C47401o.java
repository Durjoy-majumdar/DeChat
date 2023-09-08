package ow2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ow2.o */
public final class C47401o extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f127179d;

    public C47401o(StoryGalleryView storyGalleryView) {
        this.f127179d = storyGalleryView;
    }

    public void onAnimationStart(Animator animator) {
        View view = this.f127179d.f282062F;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$fadeInMaskView$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$fadeInMaskView$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
