package com.tencent.p014mm.p136ui.conversation;

import android.app.ProgressDialog;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C97625j3;
import eb0.z3$$g;

/* renamed from: com.tencent.mm.ui.conversation.f */
public class C44985f implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ PBool f122034d;

    /* renamed from: e */
    public final /* synthetic */ ProgressDialog f122035e;

    /* renamed from: f */
    public final /* synthetic */ String f122036f;

    public C44985f(PBool pBool, ProgressDialog progressDialog, String str) {
        this.f122034d = pBool;
        this.f122035e = progressDialog;
        this.f122036f = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f122035e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24603b() {
        /*
            r1 = this;
            com.tencent.mm.pointers.PBool r0 = r1.f122034d
            boolean r0 = r0.value
            if (r0 != 0) goto L_0x0013
            android.app.ProgressDialog r0 = r1.f122035e
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.C44985f.mo24603b():boolean");
    }

    /* renamed from: c */
    public void mo24604c() {
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f122036f);
        z1Var.setType(z1Var.getType() & -3);
        if (z1Var.mo62927s3()) {
            C45628s0.m50803u0(z1Var.getUsername(), false);
        } else {
            C97625j3.m125812b().mo105907v().mo69719p3(this.f122036f, z1Var);
        }
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(this.f122036f);
        C68111c.m80513e().mo93621c(this.f122036f);
        ProgressDialog progressDialog = this.f122035e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
