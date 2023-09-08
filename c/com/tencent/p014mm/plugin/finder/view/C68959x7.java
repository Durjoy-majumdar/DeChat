package com.tencent.p014mm.plugin.finder.view;

import android.view.KeyEvent;
import android.widget.TextView;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.finder.view.x7 */
public final class C68959x7 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ SignatureEditText f198164d;

    public C68959x7(SignatureEditText signatureEditText) {
        this.f198164d = signatureEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (!(keyEvent != null && keyEvent.getKeyCode() == 66) || this.f198164d.getAllowEmptyLine()) {
            return false;
        }
        int selectionEnd = this.f198164d.getSelectionEnd();
        if (selectionEnd >= this.f198164d.getOriginText().length()) {
            return selectionEnd == this.f198164d.getOriginText().length() && C112550d0.m153799i0((String) C110818d0.m150923U(C112550d0.m153773I(this.f198164d.getOriginText()))).toString().length() == 0;
        }
        if (selectionEnd <= 0) {
            return true;
        }
        return !(this.f198164d.getText().charAt(selectionEnd - 1) != 10 && this.f198164d.getText().charAt(selectionEnd) != 10);
    }
}
