package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Message;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.o */
public class C18033o implements C32226l<SubscribeMsgRequestResult, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f49837d;

    public C18033o(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f49837d = appBrandAuthorizeUI;
    }

    public Object invoke(Object obj) {
        Message.obtain(this.f49837d.f49748Q, 2, (SubscribeMsgRequestResult) obj).sendToTarget();
        return null;
    }
}
