package nw0;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import mw0.C47108k;

/* renamed from: nw0.c */
public class C89094c {

    /* renamed from: a */
    public static HashMap<String, Long> f256752a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<String, Long> f256753b;

    static {
        HashMap<String, Long> hashMap = new HashMap<>();
        f256753b = hashMap;
        HashMap<String, String> hashMap2 = C47108k.f126586a;
        hashMap.put("0000fea1-0000-1000-8000-00805f9b34fb", 1L);
        f256753b.put("0000fea2-0000-1000-8000-00805f9b34fb", 1L);
        f256753b.put("0000feb1-0000-1000-8000-00805f9b34fb", 16L);
        f256753b.put("0000feb2-0000-1000-8000-00805f9b34fb", 16L);
        f256753b.put("0000feb3-0000-1000-8000-00805f9b34fb", 16L);
        f256753b.put("0000feb4-0000-1000-8000-00805f9b34fb", 16L);
        f256752a.put("0000fee7-0000-1000-8000-00805f9b34fb", 0L);
        f256752a.put("0000181d-0000-1000-8000-00805f9b34fb", 2L);
        f256752a.put("0000180d-0000-1000-8000-00805f9b34fb", 4L);
        f256752a.put("00001810-0000-1000-8000-00805f9b34fb", 8L);
    }

    /* renamed from: a */
    public static long m111363a(BluetoothGattService bluetoothGattService) {
        long j = 0;
        if (bluetoothGattService == null) {
            Log.m105920e("nw0.c", "service is null");
            return 0;
        }
        String uuid = bluetoothGattService.getUuid().toString();
        HashMap<String, String> hashMap = C47108k.f126586a;
        if (!uuid.equalsIgnoreCase("0000fee7-0000-1000-8000-00805f9b34fb") || bluetoothGattService.getCharacteristic(UUID.fromString("0000fea1-0000-1000-8000-00805f9b34fb")) == null) {
            Long l = f256752a.get(uuid);
            if (l != null) {
                j = l.longValue();
            }
            Log.m105919d("nw0.c", "service uuid = %s, profileType = %d", uuid, Long.valueOf(j));
            return j;
        }
        List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
        long j2 = 0;
        for (int i = 0; i < characteristics.size(); i++) {
            Long l2 = f256753b.get(characteristics.get(i).getUuid().toString());
            j2 |= l2 == null ? 0 : l2.longValue();
        }
        Log.m105919d("nw0.c", "wechat service, profileType = %d", Long.valueOf(j2));
        return j2;
    }

    /* renamed from: b */
    public static String m111364b(long j) {
        for (String next : f256752a.keySet()) {
            if (f256752a.get(next).longValue() == j) {
                return next;
            }
        }
        if (!f256753b.containsValue(Long.valueOf(j))) {
            return null;
        }
        HashMap<String, String> hashMap = C47108k.f126586a;
        return "0000fee7-0000-1000-8000-00805f9b34fb";
    }
}
