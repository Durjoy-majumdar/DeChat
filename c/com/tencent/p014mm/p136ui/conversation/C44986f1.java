package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import eb0.z3$$g;

/* renamed from: com.tencent.mm.ui.conversation.f1 */
public class C44986f1 implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f122037d;

    /* renamed from: e */
    public final /* synthetic */ NewBizConversationUI f122038e;

    public C44986f1(NewBizConversationUI newBizConversationUI, ProgressDialog progressDialog) {
        this.f122038e = newBizConversationUI;
        this.f122037d = progressDialog;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f122038e.f121825u;
    }

    /* renamed from: c */
    public void mo24604c() {
        ProgressDialog progressDialog = this.f122037d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
