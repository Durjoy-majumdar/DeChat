package ow2;

import com.tencent.p014mm.plugin.story.p108ui.view.gallery.GalleryHorizontalControlView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32228q;
import gy3.C87413o;
import iw2.C98862q;
import rx3.C13598b0;

/* renamed from: ow2.q */
public final class C100599q extends C87413o implements C32228q<Integer, Integer, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f294748d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100599q(StoryGalleryView storyGalleryView) {
        super(3);
        this.f294748d = storyGalleryView;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        StoryGalleryView storyGalleryView = this.f294748d;
        boolean z = intValue == 3;
        storyGalleryView.f282058B = z;
        storyGalleryView.f282099y.setScrollEnable(!z);
        StoryGalleryView storyGalleryView2 = this.f294748d;
        storyGalleryView2.f282064H = intValue == 1;
        MMHandlerThread.removeRunnable(storyGalleryView2.f282066J.f222181j);
        StoryGalleryView storyGalleryView3 = this.f294748d;
        storyGalleryView3.f282066J.f222180i = true ^ storyGalleryView3.f282058B;
        C98862q qVar = storyGalleryView3.f282057A;
        if (qVar != null) {
            qVar.mo138195h(intValue, intValue2, booleanValue);
        }
        if (intValue == 3) {
            this.f294748d.f282068L.setVisibility(4);
            GalleryHorizontalControlView galleryHorizontalControlView = this.f294748d.f282090q;
            if (galleryHorizontalControlView != null) {
                galleryHorizontalControlView.setVisibility(4);
            }
        } else {
            this.f294748d.f282068L.setVisibility(0);
            GalleryHorizontalControlView galleryHorizontalControlView2 = this.f294748d.f282090q;
            if (galleryHorizontalControlView2 != null) {
                galleryHorizontalControlView2.setVisibility(0);
            }
        }
        return C13598b0.f38549a;
    }
}
