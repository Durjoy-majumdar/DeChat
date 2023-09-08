package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import com.tencent.p014mm.pointers.PBool;
import eb0.z3$$g;

/* renamed from: com.tencent.mm.ui.conversation.h */
public class C74691h implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ PBool f219585d;

    /* renamed from: e */
    public final /* synthetic */ ProgressDialog f219586e;

    public C74691h(PBool pBool, ProgressDialog progressDialog) {
        this.f219585d = pBool;
        this.f219586e = progressDialog;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f219585d.value;
    }

    /* renamed from: c */
    public void mo24604c() {
        ProgressDialog progressDialog = this.f219586e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
