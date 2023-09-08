package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$d */
public class NoteEditorUI$d0$b$$d implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI.C96692d0.C96694b f283323d;

    public NoteEditorUI$d0$b$$d(NoteEditorUI.C96692d0.C96694b bVar) {
        this.f283323d = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C89779i0 i0Var = NoteEditorUI.this.f283249g1;
        if (i0Var != null) {
            i0Var.dismiss();
            NoteEditorUI.this.f283249g1 = null;
        }
    }
}
