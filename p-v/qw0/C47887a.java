package qw0;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C45288e;

/* renamed from: qw0.a */
public final class C47887a {
    @Deprecated
    /* renamed from: a */
    public static long m53194a(String str) {
        return C45288e.m50137h(str);
    }

    /* renamed from: b */
    public static boolean m53195b(Context context) {
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKUtil", "isBLESupported, ret = %b", Boolean.valueOf(hasSystemFeature));
        return hasSystemFeature;
    }

    /* renamed from: c */
    public static boolean m53196c() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        boolean isEnabled = defaultAdapter.isEnabled();
        Log.m105925i("MicroMsg.exdevice.BluetoothSDKUtil", "isBluetoothOpen: %b", Boolean.valueOf(isEnabled));
        return isEnabled;
    }

    @Deprecated
    /* renamed from: d */
    public static String m53197d(long j) {
        return C45288e.m50135f(j);
    }
}
