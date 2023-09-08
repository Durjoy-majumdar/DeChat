package com.tencent.p014mm.plugin.game.model;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.game.model.e */
public class C42050e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f113294d;

    /* renamed from: e */
    public final /* synthetic */ C44561j f113295e;

    /* renamed from: f */
    public final /* synthetic */ WXMediaMessage f113296f;

    /* renamed from: g */
    public final /* synthetic */ C44580q1 f113297g;

    public C42050e(Context context, C44561j jVar, WXMediaMessage wXMediaMessage, C44580q1 q1Var) {
        this.f113294d = context;
        this.f113295e = jVar;
        this.f113296f = wXMediaMessage;
        this.f113297g = q1Var;
    }

    public void run() {
        Context context = this.f113294d;
        C44561j jVar = this.f113295e;
        ((C79138l) C86312j.m106911c(C79138l.class)).yw0(context, jVar.field_packageName, this.f113296f, jVar.field_appId, jVar.field_openId, 0, this.f113297g, (Bundle) null);
    }
}
