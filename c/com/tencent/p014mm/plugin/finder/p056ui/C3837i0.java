package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.i0 */
public final class C3837i0 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ FinderCreateContactUI f17374d;

    public C3837i0(FinderCreateContactUI finderCreateContactUI) {
        this.f17374d = finderCreateContactUI;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (5 != i) {
            return false;
        }
        EditText editText = this.f17374d.f16844s;
        if (editText != null) {
            editText.clearFocus();
            return false;
        }
        C87412m.m108603p("nickEdt");
        throw null;
    }
}
