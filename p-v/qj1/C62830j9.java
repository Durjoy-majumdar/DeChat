package qj1;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;

/* renamed from: qj1.j9 */
public final class C62830j9 implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ C62949r8 f178322a;

    public C62830j9(C62949r8 r8Var) {
        this.f178322a = r8Var;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        C62949r8 r8Var = this.f178322a;
        MMEditText mMEditText = r8Var.f178647v;
        if (mMEditText != null) {
            if (C45078p0.m49926e(mMEditText.getText() + str, C45078p0.C45079a.MODE_CHINESE_AS_2) <= r8Var.f178644s) {
                mMEditText.mo98046o(str);
            }
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        InputConnection inputConnection;
        InputConnection inputConnection2;
        MMEditText mMEditText = this.f178322a.f178647v;
        if (!(mMEditText == null || (inputConnection2 = mMEditText.getInputConnection()) == null)) {
            inputConnection2.sendKeyEvent(new KeyEvent(0, 67));
        }
        MMEditText mMEditText2 = this.f178322a.f178647v;
        if (mMEditText2 != null && (inputConnection = mMEditText2.getInputConnection()) != null) {
            inputConnection.sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
