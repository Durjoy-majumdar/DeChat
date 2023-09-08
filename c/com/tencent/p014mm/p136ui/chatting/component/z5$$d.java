package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.tencent.mm.ui.chatting.component.z5$$d */
public class z5$$d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Intent f216305d;

    /* renamed from: e */
    public final /* synthetic */ String f216306e;

    /* renamed from: f */
    public final /* synthetic */ C73669z5 f216307f;

    public z5$$d(C73669z5 z5Var, Intent intent, String str) {
        this.f216307f = z5Var;
        this.f216305d = intent;
        this.f216306e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f216307f.mo102706Y5(this.f216305d, this.f216306e);
    }
}
