package y71;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashMap;

/* renamed from: y71.n */
public final class C112396n {

    /* renamed from: c */
    public static C112396n f336524c;

    /* renamed from: a */
    public final HashMap<Long, Integer> f336525a = new HashMap<>();

    /* renamed from: b */
    public MMHandler f336526b = new MMHandler("MMExDevicePushCore");

    /* renamed from: b */
    public static C112396n m153349b() {
        if (f336524c == null) {
            f336524c = new C112396n();
        }
        return f336524c;
    }

    /* renamed from: a */
    public int mo164107a(long j) {
        if (this.f336525a.containsKey(Long.valueOf(j))) {
            return this.f336525a.get(Long.valueOf(j)).intValue();
        }
        Log.m105921e("MicroMsg.exdevice.MMExDevicePushCore", "getBluetoothVersionByDeviceId Failed!!! Cannot find BLuetoothVersion by DeviceInfo(%d)", Long.valueOf(j));
        return -1;
    }

    /* renamed from: c */
    public void mo164108c(long j, int i) {
        Log.m105925i("MicroMsg.exdevice.MMExDevicePushCore", "insertDeviceIdAndBluetoothVersion aDeviceId = %d, aBluetoothVersion = %d", Long.valueOf(j), Integer.valueOf(i));
        this.f336525a.put(Long.valueOf(j), Integer.valueOf(i));
    }
}
