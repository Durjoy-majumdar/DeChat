package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import android.view.KeyEvent;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.v0 */
public class C44364v0 implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ MPSmileyFooter f120232a;

    public C44364v0(MPSmileyFooter mPSmileyFooter) {
        this.f120232a = mPSmileyFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        try {
            this.f120232a.f119809h.mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsUploadSayFooter", e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        this.f120232a.f119809h.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
        this.f120232a.f119809h.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
