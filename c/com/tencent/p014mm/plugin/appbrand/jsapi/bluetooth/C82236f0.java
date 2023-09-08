package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;
import kotlin.Metadata;
import sx3.C64175a0;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "data", "Landroid/os/Bundle;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f0 */
final class C82236f0<InputType, ResultType> implements C80916r {

    /* renamed from: a */
    public static final C82236f0<InputType, ResultType> f241136a = new C82236f0<>();

    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z = false;
        if (bundle == null) {
            Log.m105928w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount#MainProcess, data is null");
            return new IPCBoolean(false);
        }
        bundle.setClassLoader(WCBluetoothBackgroundApp.class.getClassLoader());
        WCBluetoothBackgroundApp wCBluetoothBackgroundApp = (WCBluetoothBackgroundApp) bundle.getParcelable("app");
        if (wCBluetoothBackgroundApp == null) {
            Log.m105928w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount#MainProcess, app is null");
            return new IPCBoolean(false);
        }
        int i = bundle.getInt("maxCount");
        HashSet<WCBluetoothBackgroundApp> hashSet = C82227c0.f241106b;
        C64175a0.m75511s(hashSet, C82224b0.f241099d);
        boolean z2 = true;
        if (hashSet.contains(wCBluetoothBackgroundApp)) {
            Log.m105924i("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "canIEnableBackgroundSupport, backgroundApps contains me");
        } else {
            if (i >= hashSet.size() + 1) {
                z = true;
            }
            Log.m105924i("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "canIEnableBackgroundSupport, can: " + z);
            z2 = z;
        }
        return new IPCBoolean(z2);
    }
}
