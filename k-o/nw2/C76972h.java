package nw2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentInputView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: nw2.h */
public final class C76972h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ StoryCommentInputView f224910d;

    /* renamed from: e */
    public final /* synthetic */ int f224911e;

    public C76972h(StoryCommentInputView storyCommentInputView, int i) {
        this.f224910d = storyCommentInputView;
        this.f224911e = i;
    }

    public final void run() {
        RecyclerView.LayoutManager layoutManager = this.f224910d.f281851o.getLayoutManager();
        C87412m.m108591d(layoutManager);
        int i = this.f224911e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
