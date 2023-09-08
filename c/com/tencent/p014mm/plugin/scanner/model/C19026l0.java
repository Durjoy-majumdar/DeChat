package com.tencent.p014mm.plugin.scanner.model;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: com.tencent.mm.plugin.scanner.model.l0 */
public final class C19026l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f53479d;

    public C19026l0(String str) {
        this.f53479d = str;
    }

    public final void run() {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor putInt2;
        SharedPreferences.Editor putInt3;
        SharedPreferences.Editor remove;
        SharedPreferences.Editor putInt4;
        if (this.f53479d.length() > 0) {
            C19021i0 i0Var = C19021i0.f53455a;
            Integer a = C19021i0.m20096a(i0Var, this.f53479d, "(.*close=[0-9]+)", "close");
            MultiProcessMMKV multiProcessMMKV = C19021i0.f53459e;
            if (multiProcessMMKV != null) {
                SharedPreferences.Editor putBoolean = multiProcessMMKV.putBoolean("scan_config_disable_scan_product", a != null && a.intValue() > 0);
                if (putBoolean != null) {
                    putBoolean.apply();
                }
            }
            Integer a2 = C19021i0.m20096a(i0Var, this.f53479d, "(time_interval=[0-9]+)", "time_interval");
            if (a2 == null || a2.intValue() < 1000) {
                MultiProcessMMKV multiProcessMMKV2 = C19021i0.f53459e;
                if (!(multiProcessMMKV2 == null || (remove = multiProcessMMKV2.remove("scan_config_request_time_interval")) == null)) {
                    remove.apply();
                }
            } else {
                MultiProcessMMKV multiProcessMMKV3 = C19021i0.f53459e;
                if (!(multiProcessMMKV3 == null || (putInt4 = multiProcessMMKV3.putInt("scan_config_request_time_interval", a2.intValue())) == null)) {
                    putInt4.apply();
                }
            }
            Integer a3 = C19021i0.m20096a(i0Var, this.f53479d, "(upload_timeout=[0-9]+)", "upload_timeout");
            if (a3 == null || a3.intValue() < 5000) {
                MultiProcessMMKV multiProcessMMKV4 = C19021i0.f53459e;
                if (multiProcessMMKV4 != null) {
                    multiProcessMMKV4.remove("scan_config_upload_timeout");
                }
            } else {
                MultiProcessMMKV multiProcessMMKV5 = C19021i0.f53459e;
                if (!(multiProcessMMKV5 == null || (putInt3 = multiProcessMMKV5.putInt("scan_config_upload_timeout", a3.intValue())) == null)) {
                    putInt3.apply();
                }
            }
            Integer a4 = C19021i0.m20096a(i0Var, this.f53479d, "(retrieval_timeout=[0-9]+)", "retrieval_timeout");
            if (a4 == null || a4.intValue() < 5000) {
                MultiProcessMMKV multiProcessMMKV6 = C19021i0.f53459e;
                if (multiProcessMMKV6 != null) {
                    multiProcessMMKV6.remove("scan_config_retrieval_timeout");
                }
            } else {
                MultiProcessMMKV multiProcessMMKV7 = C19021i0.f53459e;
                if (!(multiProcessMMKV7 == null || (putInt2 = multiProcessMMKV7.putInt("scan_config_retrieval_timeout", a4.intValue())) == null)) {
                    putInt2.apply();
                }
            }
            Integer a5 = C19021i0.m20096a(i0Var, this.f53479d, "(wait_max_frame=[0-9]+)", "wait_max_frame");
            if (a5 != null) {
                MultiProcessMMKV multiProcessMMKV8 = C19021i0.f53459e;
                if (!(multiProcessMMKV8 == null || (putInt = multiProcessMMKV8.putInt("scan_config_server_detect_frame_count", a5.intValue())) == null)) {
                    putInt.apply();
                }
            } else {
                MultiProcessMMKV multiProcessMMKV9 = C19021i0.f53459e;
                if (multiProcessMMKV9 != null) {
                    multiProcessMMKV9.remove("scan_config_server_detect_frame_count");
                }
            }
            Log.m105925i("MicroMsg.ScanFastFocusEngineManager", "updateScanProductServerConfig closeScanProduct: %s, requestInterval: %s, uploadTimeout: %s, retrievalTimeout: %s, serverDetectFrame: %s", a, a2, a3, a4, a5);
        }
    }
}
