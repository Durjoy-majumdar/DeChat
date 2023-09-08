package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.n4 */
public class C71257n4 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ SnsEditText f206202d;

    public C71257n4(SnsEditText snsEditText) {
        this.f206202d = snsEditText;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.f206202d.f206139H = charSequence.length();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            if (this.f206202d.f206138G) {
                if (charSequence != null) {
                    if (charSequence.length() >= Integer.MAX_VALUE) {
                        int length = charSequence.length();
                        SnsEditText snsEditText = this.f206202d;
                        if (length - snsEditText.f206139H > Integer.MAX_VALUE) {
                            snsEditText.f206137F = charSequence.length() - this.f206202d.f206139H;
                            return;
                        }
                        return;
                    }
                }
                this.f206202d.f206137F = 0;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsEditText", e, "", new Object[0]);
        }
    }
}
