package com.tencent.p014mm.plugin.appbrand.jsapi.nfc.p946rw.logic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/nfc/rw/logic/AbsNFCDiscoverable$sysNfcSwitchToggleListener$1", "Landroid/content/BroadcastReceiver;", "luggage-commons-jsapi-nfc-ext_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.logic.AbsNFCDiscoverable$sysNfcSwitchToggleListener$1 */
public final class AbsNFCDiscoverable$sysNfcSwitchToggleListener$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ AbsNFCDiscoverable f242309a;

    public AbsNFCDiscoverable$sysNfcSwitchToggleListener$1(AbsNFCDiscoverable absNFCDiscoverable) {
        this.f242309a = absNFCDiscoverable;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", -1);
            AbsNFCDiscoverable absNFCDiscoverable = this.f242309a;
            if (-1 == intExtra) {
                Log.m105928w("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, state is invalid");
                return;
            }
            boolean z = 3 == intExtra;
            Log.m105924i("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, isNFCEnabled: " + z);
            if (!z) {
                absNFCDiscoverable.f242305d.set(false);
                absNFCDiscoverable.f242306e = false;
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.AppBrand.AbsNFCDiscoverable", "onReceive#sysNfcSwitchToggleListener, state is null");
    }
}
