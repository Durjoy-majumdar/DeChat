package com.tencent.p014mm.plugin.component.editor;

import android.app.ProgressDialog;
import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.component.editor.m */
public class C93079m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ EditorUI f268126d;

    public C93079m(EditorUI editorUI) {
        this.f268126d = editorUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        ProgressDialog progressDialog = this.f268126d.f268060y;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f268126d.f268060y = null;
        }
    }
}
