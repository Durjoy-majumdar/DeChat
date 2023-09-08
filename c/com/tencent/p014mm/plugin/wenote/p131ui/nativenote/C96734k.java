package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.app.ProgressDialog;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.k */
public class C96734k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI f283378d;

    public C96734k(NoteEditorUI noteEditorUI) {
        this.f283378d = noteEditorUI;
    }

    public void run() {
        ProgressDialog progressDialog = this.f283378d.f283215H;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f283378d.f283215H = null;
        }
    }
}
