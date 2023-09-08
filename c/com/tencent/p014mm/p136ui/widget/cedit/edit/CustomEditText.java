package com.tencent.p014mm.p136ui.widget.cedit.edit;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.cedit.move.ArrowKeyMovementMethod;
import mo3.C109633a;

/* renamed from: com.tencent.mm.ui.widget.cedit.edit.CustomEditText */
public class CustomEditText extends CustomTextView {
    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, C0966R.style.f8572ni);
    }

    public CharSequence getAccessibilityClassName() {
        return CustomEditText.class.getName();
    }

    public boolean getDefaultEditable() {
        return true;
    }

    public C109633a getDefaultMovementMethod() {
        return ArrowKeyMovementMethod.getInstance();
    }

    public boolean getFreezesText() {
        return true;
    }

    /* renamed from: m0 */
    public void mo153965m0(CharSequence charSequence, TextView.BufferType bufferType) {
        super.mo153965m0(charSequence, TextView.BufferType.EDITABLE);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            return;
        }
        throw new IllegalArgumentException("EditText cannot use the ellipsize mode TextUtils.TruncateAt.MARQUEE");
    }

    public void setSelection(int i) {
        Selection.setSelection(getText(), i);
    }

    /* renamed from: t0 */
    public boolean mo153967t0() {
        return false;
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public Editable getText() {
        CharSequence text = super.getText();
        if (text == null) {
            return null;
        }
        if (text instanceof Editable) {
            return (Editable) super.getText();
        }
        super.mo153965m0(text, TextView.BufferType.EDITABLE);
        return (Editable) super.getText();
    }
}
