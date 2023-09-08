package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.f */
public class C116100f extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C116102h f348427a;

    public C116100f(C116102h hVar) {
        this.f348427a = hVar;
    }

    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(C116102h.f348429g);
        Log.m105925i("MicroMsg.FacebookLoginUI", "data = %s, action = %s.", stringExtra, intent.getAction());
        Bundle bundle = new Bundle();
        if (C116102h.f348435m.equals(intent.getAction()) && stringExtra != null && stringExtra.startsWith("fb290293790992170://authorize")) {
            Bundle e = C116102h.m163385e(stringExtra);
            bundle.putString("access_token", e.getString("access_token"));
            try {
                bundle.putLong("data_access_expiration_time", Long.parseLong(e.getString("data_access_expiration_time")) * 1000);
                Log.m105925i("MicroMsg.FacebookLoginUI", "DATAACCESSEXPIRATIONTIME = %s", Long.valueOf(bundle.getLong("data_access_expiration_time")));
            } catch (Exception unused) {
            }
            bundle.putString("expires_in", e.getString("expires_in"));
            bundle.putString("service_disabled", e.getString("service_disabled"));
            C116102h.C116103a aVar = this.f348427a.f348444e;
            if (aVar != null) {
                ((C116101g) aVar).mo1391b(bundle);
            }
        }
    }
}
