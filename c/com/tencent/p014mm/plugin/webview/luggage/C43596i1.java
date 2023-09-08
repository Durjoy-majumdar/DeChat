package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.LuggageWebViewLongClickHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import lp3.C88631d;
import te3.C51216sa2;

/* renamed from: com.tencent.mm.plugin.webview.luggage.i1 */
public class C43596i1 implements C88631d.C88632b<C51216sa2> {

    /* renamed from: a */
    public final /* synthetic */ LuggageWebViewLongClickHelper.QBarLogicTask f117840a;

    public C43596i1(LuggageWebViewLongClickHelper.QBarLogicTask qBarLogicTask) {
        this.f117840a = qBarLogicTask;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        C51216sa2 sa22 = (C51216sa2) obj;
        Bundle bundle = new Bundle();
        if (sa22 == null) {
            bundle.putInt("key_resp_ret", -1);
            this.f117840a.f117790d.mo894a(bundle);
            return;
        }
        try {
            byte[] byteArray = sa22.toByteArray();
            Log.m105925i("MicroMsg.QBarLogicTask", "response bytes len = %d ", Integer.valueOf(byteArray.length));
            bundle.putInt("key_resp_ret", 0);
            bundle.putByteArray("key_resp_item_bytes", byteArray);
            this.f117840a.f117790d.mo894a(bundle);
        } catch (IOException e) {
            Log.m105920e("MicroMsg.QBarLogicTask", e.getMessage());
        }
    }
}
