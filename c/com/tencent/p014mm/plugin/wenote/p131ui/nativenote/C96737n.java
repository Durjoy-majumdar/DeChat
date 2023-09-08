package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.DialogInterface;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.n */
public class C96737n implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI f283381d;

    public C96737n(NoteEditorUI noteEditorUI) {
        this.f283381d = noteEditorUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C89779i0 i0Var = this.f283381d.f283249g1;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f283381d.f283249g1 = null;
        }
    }
}
