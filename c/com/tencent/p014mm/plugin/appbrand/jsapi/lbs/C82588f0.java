package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import android.bluetooth.BluetoothAdapter;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p1210qc.C118170a;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.f0 */
public class C82588f0 extends C118170a {

    /* renamed from: s */
    public static volatile Boolean f241713s;

    static {
        try {
            Log.m105925i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable open:%b", Boolean.valueOf(BluetoothAdapter.getDefaultAdapter().isEnabled()));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TencentLocationManagerWxImp", e, "", new Object[0]);
            Log.m105924i("MicroMsg.TencentLocationManagerWxImp", "printBluetoothEnable fail");
        }
        try {
            boolean isGpsEnable = LocationUtil.isGpsEnable();
            boolean isNetworkProviderEnable = LocationUtil.isNetworkProviderEnable();
            Log.m105924i("MicroMsg.TencentLocationManagerWxImp", "isGPSEnable " + isGpsEnable + ", isNetworkEnable:" + isNetworkProviderEnable);
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.TencentLocationManagerWxImp", e2, "", new Object[0]);
        }
        Log.m105925i("MicroMsg.TencentLocationManagerWxImp", "Imei:%s", C87203t.m108270f(true));
    }
}
