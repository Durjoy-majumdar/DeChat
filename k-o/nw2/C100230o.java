package nw2;

import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nw2.o */
public final class C100230o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ StoryMsgView f293656d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100230o(StoryMsgView storyMsgView) {
        super(0);
        this.f293656d = storyMsgView;
    }

    public Object invoke() {
        if (this.f293656d.getCommentInputView().getInputType() != -1) {
            this.f293656d.getCommentInputView().mo134274b();
        } else {
            this.f293656d.mo134305a();
        }
        return C13598b0.f38549a;
    }
}
