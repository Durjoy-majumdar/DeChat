package d60;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: d60.j0 */
public final class C58168j0 implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ C58152h0 f166605a;

    public C58168j0(C58152h0 h0Var) {
        this.f166605a = h0Var;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        MMEditText mMEditText = this.f166605a.f166581o;
        if (mMEditText != null) {
            mMEditText.mo98046o(str);
        }
        if (this.f166605a.f166575f.getLiveRole() == 0) {
            Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickEmojiComment");
            C115669n.INSTANCE.mo175913w(1381, 9, 1);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        InputConnection inputConnection;
        InputConnection inputConnection2;
        MMEditText mMEditText = this.f166605a.f166581o;
        if (!(mMEditText == null || (inputConnection2 = mMEditText.getInputConnection()) == null)) {
            inputConnection2.sendKeyEvent(new KeyEvent(0, 67));
        }
        MMEditText mMEditText2 = this.f166605a.f166581o;
        if (mMEditText2 != null && (inputConnection = mMEditText2.getInputConnection()) != null) {
            inputConnection.sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
