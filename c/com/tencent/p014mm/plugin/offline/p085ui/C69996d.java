package com.tencent.p014mm.plugin.offline.p085ui;

import android.view.View;
import b63.C67204s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import de3.C45335p;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.offline.ui.d */
public class C69996d implements C45335p {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f202008a;

    /* renamed from: b */
    public final /* synthetic */ C67204s f202009b;

    public C69996d(OfflineAlertView offlineAlertView, View.OnClickListener onClickListener, C67204s sVar) {
        this.f202008a = onClickListener;
        this.f202009b = sVar;
    }

    /* renamed from: a */
    public Object mo22792a(C53155r0 r0Var) {
        return null;
    }

    /* renamed from: b */
    public Object mo22793b(C53155r0 r0Var) {
        if (r0Var != null && r0Var.f148312c.trim().startsWith("weixin://wcpay/fqf/opentinyapp")) {
            this.f202008a.onClick((View) null);
            C115669n.INSTANCE.mo160131h(18930, Integer.valueOf(this.f202009b.f192941a), 3);
        }
        return null;
    }
}
