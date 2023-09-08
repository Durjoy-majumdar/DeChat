package ow2;

import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ow2.s */
public final class C100601s extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f294750d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100601s(StoryGalleryView storyGalleryView) {
        super(1);
        this.f294750d = storyGalleryView;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        StoryGalleryView storyGalleryView = this.f294750d;
        boolean z = false;
        boolean z2 = intValue == 3;
        storyGalleryView.f282058B = z2;
        storyGalleryView.f282099y.setScrollEnable(!z2);
        StoryGalleryView storyGalleryView2 = this.f294750d;
        if (intValue == 1) {
            z = true;
        }
        storyGalleryView2.f282064H = z;
        MMHandlerThread.removeRunnable(storyGalleryView2.f282066J.f222181j);
        StoryGalleryView storyGalleryView3 = this.f294750d;
        storyGalleryView3.f282066J.f222180i = !storyGalleryView3.f282058B;
        return C13598b0.f38549a;
    }
}
