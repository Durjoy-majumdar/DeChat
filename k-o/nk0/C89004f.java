package nk0;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import qk0.C89689d;
import qk0.C89690e;
import qk0.C89692g;
import qk0.C89693h;
import qk0.C89694i;
import sk0.C90216b;

/* renamed from: nk0.f */
public class C89004f {

    /* renamed from: a */
    public final Context f256595a;

    /* renamed from: b */
    public Map<String, C89007g> f256596b;

    /* renamed from: c */
    public volatile C89694i f256597c = null;

    /* renamed from: d */
    public volatile C89693h f256598d = null;

    /* renamed from: e */
    public volatile C89692g f256599e = null;

    /* renamed from: nk0.f$a */
    public interface C89005a {

        /* renamed from: a */
        public static final C89005a f256600a = new C89006a();

        /* renamed from: nk0.f$a$a */
        public class C89006a implements C89005a {
        }
    }

    public C89004f(Context context) {
        this.f256595a = context;
    }

    /* renamed from: a */
    public final List<C89689d> mo123373a() {
        ArrayList arrayList = new ArrayList();
        Map<String, C89007g> map = this.f256596b;
        if (map == null) {
            Log.m105929w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevices, connectWorkers is null", new Object[0]);
            return arrayList;
        }
        for (C89007g next : map.values()) {
            BluetoothGatt bluetoothGatt = next.f256605e;
            if (bluetoothGatt != null) {
                arrayList.add(new C89689d(Util.nullAsNil(bluetoothGatt.getDevice().getName()), next.f256603c));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<C89689d> mo123374b(List<String> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            return mo123373a();
        }
        ArrayList arrayList = new ArrayList();
        Map<String, C89007g> map = this.f256596b;
        if (map == null) {
            Log.m105929w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevices, connectWorkers is null", new Object[0]);
            return arrayList;
        }
        for (C89007g next : map.values()) {
            BluetoothGatt bluetoothGatt = next.f256605e;
            if (bluetoothGatt != null) {
                List<C89690e> m = next.mo123378m();
                if (m != null) {
                    ArrayList<C89690e> arrayList2 = (ArrayList) m;
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        for (C89690e eVar : arrayList2) {
                            if (eVar.f257966b) {
                                arrayList3.add(eVar.f257965a);
                            }
                        }
                        Iterator<String> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            String next2 = it.next();
                            Iterator it4 = arrayList3.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (Objects.equals(next2, (String) it4.next())) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (z) {
                            arrayList.add(new C89689d(Util.nullAsNil(bluetoothGatt.getDevice().getName()), next.f256603c));
                        }
                    }
                }
                Log.m105929w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevices, services is empty", new Object[0]);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List<C89689d> mo123375c(C89005a aVar) {
        ArrayList arrayList = new ArrayList();
        BluetoothManager e = C90216b.m112936e();
        if (e == null) {
            Log.m105929w("MicroMsg.Ble.BleConnectMgr", "getConnectedBleDevicesSysImpl, bluetoothManager is null", new Object[0]);
            return arrayList;
        }
        for (BluetoothDevice next : e.getConnectedDevices(7)) {
            aVar.getClass();
            arrayList.add(new C89689d(next.getName(), next.getAddress()));
        }
        return arrayList;
    }
}
