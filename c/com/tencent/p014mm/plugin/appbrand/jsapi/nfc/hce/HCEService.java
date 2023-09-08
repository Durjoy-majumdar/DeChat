package com.tencent.p014mm.plugin.appbrand.jsapi.nfc.hce;

import android.content.Intent;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import wl0.C53186j;
import wl0.C91030h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService */
public class HCEService extends HostApduService {

    /* renamed from: d */
    public String f242297d = null;

    public void onCreate() {
        super.onCreate();
        Log.m105924i("MicroMsg.HCEService", "alvinluo HCEService onCreate");
    }

    public void onDeactivated(int i) {
        Log.m105925i("MicroMsg.HCEService", "alvinluo HCEService onDeactivated reason: %d", Integer.valueOf(i));
        C91030h hVar = C91030h.f261169n;
        hVar.f261175f = false;
        hVar.f261176g = false;
        Bundle bundle = new Bundle();
        bundle.putInt("key_on_deactivated_reason", i);
        C91030h.f261169n.mo125087f(this.f242297d, 41, bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.HCEService", "alvinluo HCEService onDestroy");
        C91030h.f261169n.mo125088g();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.m105924i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand");
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105925i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand start: %d", Long.valueOf(currentTimeMillis));
        if (intent == null) {
            return super.onStartCommand(intent, i, i2);
        }
        try {
            C91030h hVar = C91030h.f261169n;
            hVar.getClass();
            Log.m105924i("MicroMsg.HCEServiceMgr", "alvinluo setHceService");
            hVar.f261180k = this;
            hVar.f261179j = (ResultReceiver) intent.getParcelableExtra("HCE_Result_Receiver");
            this.f242297d = intent.getStringExtra("key_appid");
            C91030h.f261169n.mo125083b(intent);
            C91030h hVar2 = C91030h.f261169n;
            String str = this.f242297d;
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_aid_list");
            hVar2.f261170a = str;
            hVar2.f261171b = stringArrayListExtra;
            C91030h.f261169n.mo125086e();
            C91030h.f261169n.f261173d = false;
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m105925i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand end: %d, total: %d", Long.valueOf(currentTimeMillis2), Long.valueOf(currentTimeMillis2 - currentTimeMillis));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.HCEService", e, "under dos attack(?): invalid key_result_receiver", new Object[0]);
        }
        return super.onStartCommand(intent, i, i2);
    }

    public byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        Log.m105925i("MicroMsg.HCEService", "alvinluo HCECOMMAND processCommandApdu, received command from system: %s", C53186j.m59593a(bArr));
        byte[] encode = Base64.encode(bArr, 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("key_apdu_command", new String(encode, StandardCharsets.UTF_8));
        C91030h.f261169n.mo125084c(31, this.f242297d, bundle2);
        return null;
    }
}
