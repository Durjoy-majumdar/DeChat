package ow2;

import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import fy3.C32227p;
import gy3.C87413o;
import iw2.C98862q;
import rx3.C13598b0;

/* renamed from: ow2.r */
public final class C100600r extends C87413o implements C32227p<Integer, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f294749d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100600r(StoryGalleryView storyGalleryView) {
        super(2);
        this.f294749d = storyGalleryView;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C98862q qVar = this.f294749d.f282057A;
        if (qVar != null) {
            qVar.mo138195h(3, intValue, booleanValue);
        }
        return C13598b0.f38549a;
    }
}
