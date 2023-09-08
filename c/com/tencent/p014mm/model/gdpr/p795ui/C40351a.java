package com.tencent.p014mm.model.gdpr.p795ui;

import com.tencent.p014mm.model.gdpr.p795ui.MPGdprPolicyUI;

/* renamed from: com.tencent.mm.model.gdpr.ui.a */
public class C40351a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f108445d;

    /* renamed from: e */
    public final /* synthetic */ MPGdprPolicyUI.C40349b f108446e;

    public C40351a(MPGdprPolicyUI.C40349b bVar, String str) {
        this.f108446e = bVar;
        this.f108445d = str;
    }

    public void run() {
        MPGdprPolicyUI.this.setMMTitle(this.f108445d);
    }
}
