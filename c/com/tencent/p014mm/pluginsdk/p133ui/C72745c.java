package com.tencent.p014mm.pluginsdk.p133ui;

import android.view.KeyEvent;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.c */
public class C72745c implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ VoiceInputFooter f211684a;

    public C72745c(VoiceInputFooter voiceInputFooter) {
        this.f211684a = voiceInputFooter;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        try {
            this.f211684a.f55010q.mo98046o(str);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoiceInputFooter", e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        this.f211684a.f55010q.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
        this.f211684a.f55010q.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
