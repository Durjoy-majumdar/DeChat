package com.tencent.p014mm.plugin.ext.p043ui;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ext.ui.RedirectToQrCodeStubUI */
public class RedirectToQrCodeStubUI extends HellActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.RedirectToQrCodeStubUI", "hy: start to handle qrcode string");
        String stringExtra = getIntent().getStringExtra("K_STR");
        int intExtra = getIntent().getIntExtra("K_TYPE", -1);
        int intExtra2 = getIntent().getIntExtra("K_VERSION", -1);
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264650b = this;
        aVar.f264649a = stringExtra;
        aVar.f264651c = intExtra;
        aVar.f264652d = intExtra2;
        aVar.f264657i = 47;
        dealQBarStrEvent.publish();
        finish();
    }
}
