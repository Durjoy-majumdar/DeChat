package p915ol;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ol.d */
public class C77017d implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ EmojiPanelInputComponent f225003a;

    public C77017d(EmojiPanelInputComponent emojiPanelInputComponent) {
        this.f225003a = emojiPanelInputComponent;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        try {
            this.f225003a.f195274h.mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EmojiPanelInputComponent", e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        InputConnection inputConnection = this.f225003a.f195274h.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new KeyEvent(0, 67));
            inputConnection.sendKeyEvent(new KeyEvent(1, 67));
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
