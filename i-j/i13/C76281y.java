package i13;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;

/* renamed from: i13.y */
public final class C76281y implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ C76259g f223469a;

    public C76281y(C76259g gVar) {
        this.f223469a = gVar;
    }

    /* renamed from: a */
    public void mo64626a() {
        C76259g.m91668F(this.f223469a);
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        MMEditText mMEditText = this.f223469a.f223426n;
        if (mMEditText != null) {
            mMEditText.mo98046o(str);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        InputConnection inputConnection;
        InputConnection inputConnection2;
        MMEditText mMEditText = this.f223469a.f223426n;
        if (!(mMEditText == null || (inputConnection2 = mMEditText.getInputConnection()) == null)) {
            inputConnection2.sendKeyEvent(new KeyEvent(0, 67));
        }
        MMEditText mMEditText2 = this.f223469a.f223426n;
        if (mMEditText2 != null && (inputConnection = mMEditText2.getInputConnection()) != null) {
            inputConnection.sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
