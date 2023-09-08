package nw2;

import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nw2.j */
public final class C100225j extends C87413o implements C32226l<View, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryCommentView f293651d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100225j(StoryCommentView storyCommentView) {
        super(1);
        this.f293651d = storyCommentView;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
        StoryCommentView.m123623b(this.f293651d, false);
        return C13598b0.f38549a;
    }
}
