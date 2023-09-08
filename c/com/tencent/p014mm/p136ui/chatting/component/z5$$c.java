package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import com.tencent.p014mm.pluginsdk.model.C96790t0;

/* renamed from: com.tencent.mm.ui.chatting.component.z5$$c */
public class z5$$c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C96790t0 f216304d;

    public z5$$c(C73669z5 z5Var, C96790t0 t0Var) {
        this.f216304d = t0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C96790t0 t0Var = this.f216304d;
        t0Var.f283549t = true;
        t0Var.interrupt();
    }
}
