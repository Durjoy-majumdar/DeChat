package i81;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import i81.C87679g;
import j20.C117293c;
import java.util.List;
import java.util.UUID;
import p269xe.C91177a;
import rx3.C13598b0;

/* renamed from: i81.e */
public final class C87677e implements C117293c {
    /* renamed from: a */
    public Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        C87679g.C87680a aVar;
        Context context;
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        Object obj2 = obj;
        Object[] objArr2 = objArr;
        Log.m105918d("MicroMsg.SensitiveApiCallPatch", "hook call " + str8 + " from " + str6 + '#' + str7);
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        C87679g.C87680a aVar2 = C87679g.f253958a;
        C87412m.m108593f(applicationContext, "gContext");
        if (C87679g.C87680a.m109073a(aVar2, applicationContext)) {
            aVar = aVar2;
            context = applicationContext;
            C91177a.m114419c("bluetooth", str, str2, str3, str4, str5, obj, objArr);
        } else {
            aVar = aVar2;
            context = applicationContext;
        }
        Integer num = null;
        if (str8 == null) {
            return null;
        }
        int hashCode = str4.hashCode();
        boolean z = false;
        if (hashCode == -2129330689) {
            Object[] objArr3 = objArr;
            Context context2 = context;
            if (!str8.equals("startScan")) {
                return null;
            }
            C87412m.m108592e(obj2, "null cannot be cast to non-null type android.bluetooth.le.BluetoothLeScanner");
            BluetoothLeScanner bluetoothLeScanner = (BluetoothLeScanner) obj2;
            if (C87679g.C87680a.m109073a(aVar, context2)) {
                if (objArr3 != null) {
                    num = Integer.valueOf(objArr3.length);
                }
                if (num != null && num.intValue() == 1) {
                    Object obj3 = objArr3[0];
                    C87412m.m108592e(obj3, "null cannot be cast to non-null type android.bluetooth.le.ScanCallback");
                    bluetoothLeScanner.startScan((ScanCallback) obj3);
                    return C13598b0.f38549a;
                } else if (num != null && num.intValue() == 3) {
                    if (objArr3[2] instanceof PendingIntent) {
                        Object obj4 = objArr3[1];
                        C87412m.m108592e(obj4, "null cannot be cast to non-null type android.bluetooth.le.ScanSettings");
                        Object obj5 = objArr3[2];
                        C87412m.m108592e(obj5, "null cannot be cast to non-null type android.app.PendingIntent");
                        return Integer.valueOf(bluetoothLeScanner.startScan((List) objArr3[0], (ScanSettings) obj4, (PendingIntent) obj5));
                    }
                    Object obj6 = objArr3[1];
                    C87412m.m108592e(obj6, "null cannot be cast to non-null type android.bluetooth.le.ScanSettings");
                    Object obj7 = objArr3[2];
                    C87412m.m108592e(obj7, "null cannot be cast to non-null type android.bluetooth.le.ScanCallback");
                    bluetoothLeScanner.startScan((List) objArr3[0], (ScanSettings) obj6, (ScanCallback) obj7);
                    return C13598b0.f38549a;
                }
            } else {
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
            }
            return 3;
        } else if (hashCode != -2081340776) {
            if (hashCode != -475549842 || !str8.equals("startDiscovery")) {
                return null;
            }
            C87412m.m108592e(obj2, "null cannot be cast to non-null type android.bluetooth.BluetoothAdapter");
            BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) obj2;
            if (C87679g.C87680a.m109073a(aVar, context)) {
                z = bluetoothAdapter.startDiscovery();
            } else {
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
            }
            return Boolean.valueOf(z);
        } else if (!str8.equals("startLeScan")) {
            return null;
        } else {
            C87412m.m108592e(obj2, "null cannot be cast to non-null type android.bluetooth.BluetoothAdapter");
            BluetoothAdapter bluetoothAdapter2 = (BluetoothAdapter) obj2;
            if (C87679g.C87680a.m109073a(aVar, context)) {
                Object[] objArr4 = objArr;
                if (objArr4 != null) {
                    num = Integer.valueOf(objArr4.length);
                }
                if (num != null && num.intValue() == 1) {
                    return Boolean.valueOf(bluetoothAdapter2.startLeScan((BluetoothAdapter.LeScanCallback) objArr4[0]));
                }
                if (num != null && num.intValue() == 2) {
                    return Boolean.valueOf(bluetoothAdapter2.startLeScan((UUID[]) objArr4[0], (BluetoothAdapter.LeScanCallback) objArr4[1]));
                }
            } else {
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
            }
            return Boolean.FALSE;
        }
    }
}
