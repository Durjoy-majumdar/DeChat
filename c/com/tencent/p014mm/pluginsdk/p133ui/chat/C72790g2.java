package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.g2 */
public class C72790g2 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ VoiceInputPanel f212151d;

    public C72790g2(VoiceInputPanel voiceInputPanel) {
        this.f212151d = voiceInputPanel;
    }

    public void afterTextChanged(Editable editable) {
        if (this.f212151d.f55085T.size() < 2 || ((this.f212151d.f55095j.getText() != null && this.f212151d.f55095j.getText().length() > 0) || (this.f212151d.f55095j.getHint() != null && this.f212151d.f55095j.getHint().length() > 0))) {
            this.f212151d.f55093h.setVisibility(8);
        } else {
            this.f212151d.f55093h.setVisibility(0);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
