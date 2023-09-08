package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.DialogInterface;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.r */
public class C115574r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RealTimeLocationUI f346632d;

    public C115574r(RealTimeLocationUI realTimeLocationUI) {
        this.f346632d = realTimeLocationUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f346632d.f346463W.mo183521d(false);
        this.f346632d.f346465X.mo183163f();
        this.f346632d.f346465X.mo183158a(2);
        this.f346632d.f346468Z.mo183508c();
        this.f346632d.f271948d.finish();
    }
}
