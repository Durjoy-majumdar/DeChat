package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.contact.ModRemarkNameUI;
import com.tencent.p014mm.p136ui.widget.MMEditText;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.t0 */
public class C72927t0 {

    /* renamed from: a */
    public static InputFilter[] f212544a = {new InputFilter.LengthFilter(50)};

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.t0$a */
    public static class C72928a implements TextWatcher {

        /* renamed from: d */
        public MMEditText.C74950c f212545d = null;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            MMEditText.C74950c cVar = this.f212545d;
            if (cVar != null) {
                ModRemarkNameUI.C74399e eVar = (ModRemarkNameUI.C74399e) cVar;
                if (ModRemarkNameUI.this.f218662d.getText().toString().trim().length() > 0) {
                    ModRemarkNameUI.this.enableOptionMenu(true);
                }
            }
        }
    }
}
