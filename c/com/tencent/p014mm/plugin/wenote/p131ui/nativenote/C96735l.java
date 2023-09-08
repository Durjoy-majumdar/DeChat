package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.l */
public class C96735l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI f283379d;

    public C96735l(NoteEditorUI noteEditorUI) {
        this.f283379d = noteEditorUI;
    }

    public void run() {
        this.f283379d.mo134923R7(2);
        Log.m105924i("MicroMsg.Note.NoteEditorUI", "current thread = " + Thread.currentThread().getName() + ", call goBack upload note success");
    }
}
