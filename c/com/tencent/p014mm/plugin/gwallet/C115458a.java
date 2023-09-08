package com.tencent.p014mm.plugin.gwallet;

import a02.C112700b;
import a02.C112708e;
import android.content.Intent;
import com.tencent.p014mm.plugin.gwallet.GWalletUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.gwallet.a */
public class C115458a implements C112700b.C112703c {

    /* renamed from: a */
    public final /* synthetic */ boolean f346163a;

    /* renamed from: b */
    public final /* synthetic */ GWalletUI.C115456b f346164b;

    public C115458a(GWalletUI.C115456b bVar, boolean z) {
        this.f346164b = bVar;
        this.f346163a = z;
    }

    /* renamed from: a */
    public void mo164438a(C112708e eVar, Intent intent) {
        Log.m105918d("MicroMsg.GWalletUI", "Purchase finished: " + eVar + ", purchase: " + intent);
        Intent intent2 = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_RESPONSE");
        if (this.f346163a) {
            intent2.putExtra("RESPONSE_CODE", 100000001);
        } else {
            intent2.putExtra("RESPONSE_CODE", 0);
        }
        GWalletUI.m162309E7(GWalletUI.this, -1, intent2);
    }
}
