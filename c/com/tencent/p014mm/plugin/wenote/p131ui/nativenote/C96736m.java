package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import java.util.TimerTask;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.m */
public class C96736m extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI f283380d;

    public C96736m(NoteEditorUI noteEditorUI) {
        this.f283380d = noteEditorUI;
    }

    public void run() {
        NoteEditorUI noteEditorUI = this.f283380d;
        int i = NoteEditorUI.f283207p1;
        noteEditorUI.getClass();
        noteEditorUI.runOnUiThread(new C96735l(noteEditorUI));
    }
}
