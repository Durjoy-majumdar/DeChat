package nw2;

import com.tencent.p014mm.plugin.story.p108ui.view.CommentsContainer;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nw2.i */
public final class C100224i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryCommentView f293650d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100224i(StoryCommentView storyCommentView) {
        super(0);
        this.f293650d = storyCommentView;
    }

    public Object invoke() {
        int[] iArr = StoryCommentView.f281874N;
        Log.m105924i("MicroMsg.StoryCommentView", "itemContainer.onLoop callback currState:" + this.f293650d.f281902u + ", itemContainer.isPause:" + this.f293650d.f281888d.f206305i + ' ' + this.f293650d.f281888d);
        StoryCommentView storyCommentView = this.f293650d;
        CommentsContainer.m83735d(storyCommentView.f281888d, storyCommentView.f281900s.f288074g, false, 2, (Object) null);
        StoryCommentView storyCommentView2 = this.f293650d;
        if (storyCommentView2.f281902u == 2) {
            CommentsContainer commentsContainer = storyCommentView2.f281888d;
            if (!commentsContainer.f206305i) {
                commentsContainer.setOnLoop((C32224a<C13598b0>) null);
                this.f293650d.f281888d.mo98098a();
                this.f293650d.f281888d.mo98099b();
            }
        }
        return C13598b0.f38549a;
    }
}
