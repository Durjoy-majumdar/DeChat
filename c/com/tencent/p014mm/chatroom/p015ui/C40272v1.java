package com.tencent.p014mm.chatroom.p015ui;

import android.app.ProgressDialog;
import eb0.z3$$g;

/* renamed from: com.tencent.mm.chatroom.ui.v1 */
public class C40272v1 implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ ProgressDialog f108288d;

    /* renamed from: e */
    public final /* synthetic */ RoomInfoDetailUI f108289e;

    public C40272v1(RoomInfoDetailUI roomInfoDetailUI, ProgressDialog progressDialog) {
        this.f108289e = roomInfoDetailUI;
        this.f108288d = progressDialog;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f108289e.f108148q;
    }

    /* renamed from: c */
    public void mo24604c() {
        ProgressDialog progressDialog = this.f108288d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
