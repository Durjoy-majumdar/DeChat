package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import ob0.C89132b;

/* renamed from: com.tencent.mm.ui.chatting.component.e4 */
public class C44820e4 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f121635d;

    /* renamed from: e */
    public final /* synthetic */ C89132b f121636e;

    public C44820e4(C73452c4 c4Var, C72963f4 f4Var, C89132b bVar) {
        this.f121635d = f4Var;
        this.f121636e = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105925i("MicroMsg.RemittanceRevokeComponent", "cancel revoke msg:%d", Long.valueOf(this.f121635d.getMsgId()));
        this.f121636e.mo85581g();
    }
}
