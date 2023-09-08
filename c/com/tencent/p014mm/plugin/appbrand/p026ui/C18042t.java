package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Message;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.t */
public class C18042t implements C32226l<SubscribeMsgSettingData, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeUI f49855d;

    public C18042t(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f49855d = appBrandAuthorizeUI;
    }

    public Object invoke(Object obj) {
        Message.obtain(this.f49855d.f49748Q, 1, (SubscribeMsgSettingData) obj).sendToTarget();
        return null;
    }
}
