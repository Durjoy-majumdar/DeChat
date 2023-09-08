package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import com.tencent.p014mm.pointers.PBool;
import eb0.z3$$g;

/* renamed from: com.tencent.mm.ui.conversation.e */
public class C44983e implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ PBool f122031d;

    /* renamed from: e */
    public final /* synthetic */ ProgressDialog f122032e;

    public C44983e(PBool pBool, ProgressDialog progressDialog) {
        this.f122031d = pBool;
        this.f122032e = progressDialog;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f122032e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24603b() {
        /*
            r1 = this;
            com.tencent.mm.pointers.PBool r0 = r1.f122031d
            boolean r0 = r0.value
            if (r0 != 0) goto L_0x0013
            android.app.ProgressDialog r0 = r1.f122032e
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C44983e.mo24603b():boolean");
    }

    /* renamed from: c */
    public void mo24604c() {
        ProgressDialog progressDialog = this.f122032e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
