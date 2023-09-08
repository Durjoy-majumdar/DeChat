package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$b */
public final /* synthetic */ class NoteEditorUI$d0$b$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI.C96692d0.C96694b f283320d;

    /* renamed from: e */
    public final /* synthetic */ C89779i0 f283321e;

    public /* synthetic */ NoteEditorUI$d0$b$$b(NoteEditorUI.C96692d0.C96694b bVar, C89779i0 i0Var) {
        this.f283320d = bVar;
        this.f283321e = i0Var;
    }

    public final void run() {
        NoteEditorUI.C96692d0.C96694b bVar = this.f283320d;
        C89779i0 i0Var = this.f283321e;
        NoteEditorUI noteEditorUI = NoteEditorUI.this;
        int i = NoteEditorUI.f283207p1;
        noteEditorUI.f270015g.f295031p = true;
        i0Var.dismiss();
        NoteEditorUI noteEditorUI2 = NoteEditorUI.this;
        noteEditorUI2.f283234V0 = true;
        Log.m105925i("MicroMsg.Note.NoteEditorUI", "do del, local id %d", Long.valueOf(noteEditorUI2.f283270x));
        NoteEditorUI.this.finish();
    }
}
