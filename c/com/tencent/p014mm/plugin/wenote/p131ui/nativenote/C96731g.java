package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.DialogInterface;
import bb3.C92226g;
import xa3.C102595k;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.g */
public class C96731g implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C92226g f283373d;

    /* renamed from: e */
    public final /* synthetic */ C102595k f283374e;

    /* renamed from: f */
    public final /* synthetic */ NoteEditorUI f283375f;

    public C96731g(NoteEditorUI noteEditorUI, C92226g gVar, C102595k kVar) {
        this.f283375f = noteEditorUI;
        this.f283373d = gVar;
        this.f283374e = kVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C92226g gVar = this.f283373d;
        gVar.f263973p = true;
        gVar.interrupt();
        this.f283374e.f302087v = true;
        this.f283375f.mo134937e8(true, 100);
        this.f283375f.mo134936d8(1, 0);
    }
}
