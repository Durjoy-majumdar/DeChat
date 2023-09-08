package com.tencent.p014mm.p136ui;

import android.app.ProgressDialog;
import di3.C86312j;
import eb0.z3$$g;
import p248ug.C65347o0;

/* renamed from: com.tencent.mm.ui.r3 */
public class C45038r3 implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f122144d;

    /* renamed from: e */
    public final /* synthetic */ SingleChatInfoUI f122145e;

    public C45038r3(SingleChatInfoUI singleChatInfoUI, ProgressDialog progressDialog) {
        this.f122145e = singleChatInfoUI;
        this.f122144d = progressDialog;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return SingleChatInfoUI.f121192y;
    }

    /* renamed from: c */
    public void mo24604c() {
        ProgressDialog progressDialog = this.f122144d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89078iG(this.f122145e.f121200n);
        }
    }
}
