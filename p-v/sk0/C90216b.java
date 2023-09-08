package sk0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.UUID;
import p206nj.C11171e;

/* renamed from: sk0.b */
public class C90216b {
    /* renamed from: a */
    public static byte[] m112932a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        Log.m105921e("MicroMsg.Ble.BleHelper", "data is null", new Object[0]);
        return new byte[0];
    }

    /* renamed from: b */
    public static boolean m112933b() {
        if (m112935d() == null) {
            return false;
        }
        return m112935d().isEnabled();
    }

    /* renamed from: c */
    public static boolean m112934c() {
        return !C11171e.m11044a(18) && MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* renamed from: d */
    public static synchronized BluetoothAdapter m112935d() {
        synchronized (C90216b.class) {
            BluetoothManager e = m112936e();
            if (e != null) {
                BluetoothAdapter adapter = e.getAdapter();
                return adapter;
            }
            Log.m105921e("MicroMsg.Ble.BleHelper", "BluetoothManager is null err", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized BluetoothManager m112936e() {
        BluetoothManager bluetoothManager;
        synchronized (C90216b.class) {
            bluetoothManager = (BluetoothManager) MMApplicationContext.getContext().getSystemService("bluetooth");
        }
        return bluetoothManager;
    }

    /* renamed from: f */
    public static boolean m112937f(String str) {
        try {
            UUID.fromString(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
