package nw2;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentInputView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import fy3.C32227p;
import j20.C117292a;
import jw2.C99069d;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: nw2.g */
public final class C100223g implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ StoryCommentInputView f293649a;

    public C100223g(StoryCommentInputView storyCommentInputView) {
        this.f293649a = storyCommentInputView;
    }

    /* renamed from: a */
    public void mo64626a() {
        if (this.f293649a.f281859w) {
            C99069d.f290418a.mo138412a(9);
            Editable text = this.f293649a.f281846g.getText();
            if (text != null) {
                StoryCommentInputView storyCommentInputView = this.f293649a;
                StoryCommentInputView.m123618a(storyCommentInputView);
                storyCommentInputView.f281846g.setText((CharSequence) null);
                storyCommentInputView.f281845f.setVisibility(8);
                View view = storyCommentInputView.f281854r;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$initSmileyPanel$1", "performSend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/StoryCommentInputView$initSmileyPanel$1", "performSend", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C32227p<String, Boolean, C13598b0> commentInputCallback = storyCommentInputView.getCommentInputCallback();
                if (commentInputCallback != null) {
                    commentInputCallback.invoke(text.toString(), Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        this.f293649a.f281846g.mo98046o(str);
    }

    /* renamed from: c */
    public void mo64628c() {
        InputConnection inputConnection = this.f293649a.f281846g.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new KeyEvent(0, 67));
        }
        InputConnection inputConnection2 = this.f293649a.f281846g.getInputConnection();
        if (inputConnection2 != null) {
            inputConnection2.sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
