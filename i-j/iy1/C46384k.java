package iy1;

import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import gy3.C87412m;

/* renamed from: iy1.k */
public final class C46384k implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ PostCommentDialogUI f124979a;

    public C46384k(PostCommentDialogUI postCommentDialogUI) {
        this.f124979a = postCommentDialogUI;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        this.f124979a.mo65908N7(String.valueOf(str));
    }

    /* renamed from: c */
    public void mo64628c() {
        MMEditText mMEditText = this.f124979a.f113142e;
        if (mMEditText == null) {
            C87412m.m108603p("gameCommentInputTxt");
            throw null;
        } else if (mMEditText.getInputConnection() != null) {
            MMEditText mMEditText2 = this.f124979a.f113142e;
            if (mMEditText2 != null) {
                mMEditText2.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
                MMEditText mMEditText3 = this.f124979a.f113142e;
                if (mMEditText3 != null) {
                    mMEditText3.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
                } else {
                    C87412m.m108603p("gameCommentInputTxt");
                    throw null;
                }
            } else {
                C87412m.m108603p("gameCommentInputTxt");
                throw null;
            }
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
