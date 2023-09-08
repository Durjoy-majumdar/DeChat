package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.DialogInterface;
import di3.C86312j;
import java.util.Map;
import p158gt.C8451i;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$j */
public class MsgHandler$$j implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ String f22798d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f22799e;

    public MsgHandler$$j(MsgHandler msgHandler, String str) {
        this.f22799e = msgHandler;
        this.f22798d = str;
    }

    public void onCancel(DialogInterface dialogInterface) {
        ((C8451i) C86312j.m106911c(C8451i.class)).mo9372SO(this.f22798d);
        MsgHandler msgHandler = this.f22799e;
        msgHandler.mo7210k5(msgHandler.f22698e, "send_app_msg:cancel", (Map<String, Object>) null);
    }
}
