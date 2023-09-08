package com.tencent.p014mm.plugin.voip.p475ui;

import android.view.KeyEvent;
import android.widget.TextView;
import p1054vg.C102190i;

/* renamed from: com.tencent.mm.plugin.voip.ui.c */
public final class C106441c implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ C106442d f317972d;

    /* renamed from: e */
    public final /* synthetic */ int f317973e;

    public C106441c(C106442d dVar, int i) {
        this.f317972d = dVar;
        this.f317973e = i;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5 && i != 6) {
            return false;
        }
        this.f317972d.f317974e.invoke(Integer.valueOf(this.f317973e), Integer.valueOf(C102190i.m134653a(textView.getText().toString(), 0)));
        return true;
    }
}
