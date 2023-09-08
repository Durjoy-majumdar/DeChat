package com.tencent.p014mm.plugin.appbrand.widget.sms;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import pt0.C110246a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.sms.VerifyCodeEditText */
public class VerifyCodeEditText extends AppCompatEditText implements C110246a {
    public VerifyCodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: i */
    public InputConnection mo148821i() {
        return super.onCreateInputConnection(new EditorInfo());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
