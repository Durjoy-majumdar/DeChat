package com.tencent.p014mm.plugin.component.editor;

import android.app.ProgressDialog;

/* renamed from: com.tencent.mm.plugin.component.editor.g */
public class C93073g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditorUI f268121d;

    public C93073g(EditorUI editorUI) {
        this.f268121d = editorUI;
    }

    public void run() {
        ProgressDialog progressDialog = this.f268121d.f268060y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f268121d.f268060y = null;
        }
    }
}
