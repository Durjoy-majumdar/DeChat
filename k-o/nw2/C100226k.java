package nw2;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgInputView;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import fy3.C32227p;
import jw2.C99069d;
import rx3.C13598b0;

/* renamed from: nw2.k */
public final class C100226k implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ StoryMsgInputView f293652a;

    public C100226k(StoryMsgInputView storyMsgInputView) {
        this.f293652a = storyMsgInputView;
    }

    /* renamed from: a */
    public void mo64626a() {
        if (this.f293652a.f281940s) {
            C99069d.f290418a.mo138412a(9);
            Editable text = this.f293652a.f281931g.getText();
            if (text != null) {
                StoryMsgInputView storyMsgInputView = this.f293652a;
                storyMsgInputView.mo134275c();
                storyMsgInputView.f281931g.setText((CharSequence) null);
                storyMsgInputView.f281930f.setVisibility(8);
                C32227p<String, Boolean, C13598b0> commentInputCallback = storyMsgInputView.getCommentInputCallback();
                if (commentInputCallback != null) {
                    commentInputCallback.invoke(text.toString(), Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        this.f293652a.f281931g.mo98046o(str);
    }

    /* renamed from: c */
    public void mo64628c() {
        InputConnection inputConnection = this.f293652a.f281931g.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new KeyEvent(0, 67));
        }
        InputConnection inputConnection2 = this.f293652a.f281931g.getInputConnection();
        if (inputConnection2 != null) {
            inputConnection2.sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
