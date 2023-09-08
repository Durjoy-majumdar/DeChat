package ow2;

import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ow2.t */
public final class C47402t extends C87413o implements C32227p<Integer, View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryGalleryView f127180d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47402t(StoryGalleryView storyGalleryView) {
        super(2);
        this.f127180d = storyGalleryView;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        View view = (View) obj2;
        C87412m.m108594g(view, "child");
        StoryGalleryView.m123650t(this.f127180d, intValue, view);
        return C13598b0.f38549a;
    }
}
