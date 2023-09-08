package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI$d0$b$$f */
public class NoteEditorUI$d0$b$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI.C96692d0.C96694b f283325d;

    public NoteEditorUI$d0$b$$f(NoteEditorUI.C96692d0.C96694b bVar) {
        this.f283325d = bVar;
    }

    public void run() {
        NoteEditorUI noteEditorUI = NoteEditorUI.this;
        C76701a.makeText((Context) noteEditorUI, (CharSequence) noteEditorUI.getString(C0966R.string.j6h), 0).show();
    }
}
