package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import di3.C86312j;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.ui.chatting.v2 */
public class C6803v2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f24355d;

    /* renamed from: e */
    public final /* synthetic */ C73843s2 f24356e;

    public C6803v2(C73843s2 s2Var, Intent intent) {
        this.f24356e = s2Var;
        this.f24355d = intent;
    }

    public void run() {
        Context context = this.f24356e.f216687b;
        ((C79138l) C86312j.m106911c(C79138l.class)).Dm0(context, this.f24355d, context.getString(C0966R.string.b5q), (C44580q1) null, (Bundle) null);
    }
}
