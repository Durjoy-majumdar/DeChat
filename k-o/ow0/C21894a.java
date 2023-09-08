package ow0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d81.C45288e;
import j20.C117292a;
import java.util.HashMap;
import java.util.UUID;
import junit.framework.Assert;

/* renamed from: ow0.a */
public class C21894a {

    /* renamed from: i */
    public static final UUID f61914i = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");

    /* renamed from: j */
    public static final UUID f61915j = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");

    /* renamed from: a */
    public C21897c f61916a;

    /* renamed from: b */
    public BluetoothAdapter f61917b;

    /* renamed from: c */
    public HashMap<Long, C21899b> f61918c = new HashMap<>();

    /* renamed from: d */
    public Context f61919d;

    /* renamed from: e */
    public MMHandler f61920e;

    /* renamed from: f */
    public Runnable f61921f;

    /* renamed from: g */
    public boolean f61922g = false;

    /* renamed from: h */
    public final BroadcastReceiver f61923h = new C21895a();

    /* renamed from: ow0.a$a */
    public class C21895a extends BroadcastReceiver {
        public C21895a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                Log.m105924i("MicroMsg.exdevice.BluetoothChatManager", "------onReceive------ action  = " + action);
                if ("android.bluetooth.device.action.FOUND".equals(action)) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice.getBondState() != 12) {
                        C21894a.this.f61916a.mo34929b(bluetoothDevice.getAddress(), bluetoothDevice.getName());
                    }
                } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                    C21894a.this.f61916a.mo34930c();
                } else if ("android.bluetooth.adapter.action.SCAN_MODE_CHANGED".equals(action)) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.SCAN_MODE", -1);
                    if (intExtra == 20 || intExtra == 21) {
                        C21894a.this.f61916a.getClass();
                    } else if (intExtra == 23) {
                        C21894a.this.f61916a.getClass();
                    }
                } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    String address = bluetoothDevice2.getAddress();
                    if (C21894a.this.f61918c.containsKey(Long.valueOf(C45288e.m50137h(address)))) {
                        Log.m105925i("MicroMsg.exdevice.BluetoothChatManager", "------ACTION_ACL_DISCONNECTED------ device name = %s, device Mac = %s", bluetoothDevice2.getName(), address);
                        C21897c cVar = C21894a.this.f61916a;
                        if (cVar != null) {
                            cVar.mo34928a(C45288e.m50137h(address), false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ow0.a$b */
    public class C21896b implements Runnable {
        public C21896b() {
        }

        public void run() {
            if (C21894a.this.f61917b.isDiscovering()) {
                C21894a.this.f61917b.cancelDiscovery();
            }
        }
    }

    /* renamed from: ow0.a$c */
    public static abstract class C21897c {
        /* renamed from: a */
        public abstract void mo34928a(long j, boolean z);

        /* renamed from: b */
        public abstract void mo34929b(String str, String str2);

        /* renamed from: c */
        public abstract void mo34930c();

        /* renamed from: d */
        public abstract void mo34931d(long j, int i, String str);

        /* renamed from: e */
        public abstract void mo34932e(long j, byte[] bArr);

        /* renamed from: f */
        public abstract void mo34933f(long j, boolean z);

        /* renamed from: g */
        public abstract void mo34934g(long j, long j2, long j3);
    }

    /* renamed from: ow0.a$d */
    public final class C21898d implements Runnable {

        /* renamed from: d */
        public long f61926d;

        /* renamed from: e */
        public long f61927e;

        public C21898d(long j, long j2) {
            this.f61926d = j;
            this.f61927e = j2;
        }

        public void run() {
            C21894a aVar = C21894a.this;
            long j = this.f61926d;
            aVar.getClass();
            C21899b bVar = new C21899b(j);
            C21899b remove = aVar.f61918c.remove(Long.valueOf(j));
            if (remove != null) {
                remove.mo34937b();
            }
            aVar.f61918c.put(Long.valueOf(j), bVar);
            C21897c cVar = C21894a.this.f61916a;
            if (cVar != null) {
                cVar.mo34934g(j, this.f61926d, this.f61927e);
            }
        }
    }

    public C21894a(MMHandler mMHandler) {
        this.f61920e = new MMHandler(mMHandler.getSerialTag());
        this.f61921f = new C21896b();
    }

    /* renamed from: a */
    public boolean mo34918a(long j, boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.exdevice.BluetoothChatManager", "connect, session id = %d, secure = %s", Long.valueOf(j), String.valueOf(z));
        Assert.assertTrue(this.f61922g);
        if (!mo34922e()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return false;
        }
        C21899b bVar = this.f61918c.get(Long.valueOf(j));
        if (bVar != null) {
            z2 = true;
        }
        Assert.assertTrue(z2);
        return bVar.mo34936a(this, z);
    }

    /* renamed from: b */
    public void mo34919b(long j, long j2) {
        Log.m105924i("MicroMsg.exdevice.BluetoothChatManager", "createSession");
        Assert.assertTrue(this.f61922g);
        if (!mo34922e()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
        } else {
            Assert.assertTrue(this.f61920e.post(new C21898d(j, j2)));
        }
    }

    /* renamed from: c */
    public void mo34920c(long j) {
        boolean z = true;
        Log.m105925i("MicroMsg.exdevice.BluetoothChatManager", "------destroySession------ sessionId = %d", Long.valueOf(j));
        Assert.assertTrue(this.f61922g);
        if (!mo34922e()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return;
        }
        C21899b remove = this.f61918c.remove(Long.valueOf(j));
        if (remove == null) {
            z = false;
        }
        Assert.assertTrue(z);
        remove.mo34937b();
    }

    /* renamed from: d */
    public void mo34921d(Context context, C21897c cVar) {
        Log.m105924i("MicroMsg.exdevice.BluetoothChatManager", "------init------");
        Assert.assertNotNull(context);
        Assert.assertNotNull(cVar);
        if (!this.f61922g) {
            this.f61922g = true;
            this.f61916a = cVar;
            this.f61919d = context;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            intentFilter.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            this.f61919d.registerReceiver(this.f61923h, intentFilter);
            this.f61917b = BluetoothAdapter.getDefaultAdapter();
        }
    }

    /* renamed from: e */
    public boolean mo34922e() {
        Assert.assertTrue(this.f61922g);
        return this.f61917b != null;
    }

    /* renamed from: f */
    public boolean mo34923f(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("scanDevices");
        sb.append(z ? "true" : "false");
        Log.m105924i("MicroMsg.exdevice.BluetoothChatManager", sb.toString());
        Assert.assertTrue(this.f61922g);
        if (!mo34922e()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return false;
        } else if (!z) {
            return mo34924g();
        } else {
            if (this.f61917b.isDiscovering() && !mo34924g()) {
                return false;
            }
            Log.m105924i("MicroMsg.exdevice.BluetoothChatManager", "[BluetoothTrace] start scan");
            Log.printErrStackTrace("MicroMsg.exdevice.BluetoothChatManager", new Throwable(), "[BluetoothTrace] startDiscovery stacktrace", new Object[0]);
            if (!((Boolean) C117292a.m165363i(this.f61917b, "com/tencent/mm/plugin/bluetooth/sdk/classic/BluetoothChatManager", "scanDevices", "(Z)Z", "android/bluetooth/BluetoothAdapter", "startDiscovery", "()Z")).booleanValue()) {
                Log.m105920e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.startDiscovery() Failed");
                return false;
            }
            this.f61920e.postDelayed(this.f61921f, 10000);
            return true;
        }
    }

    /* renamed from: g */
    public final boolean mo34924g() {
        if (!this.f61917b.isDiscovering()) {
            return true;
        }
        if (!this.f61917b.cancelDiscovery()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothChatManager", "mAdapter.cancelDiscovery Failed!!!");
            return false;
        }
        this.f61920e.removeCallbacks(this.f61921f);
        return true;
    }

    /* renamed from: h */
    public boolean mo34925h(long j, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.BluetoothChatManager", "writeData to: " + j);
        Assert.assertTrue(this.f61922g);
        boolean z = false;
        if (!mo34922e()) {
            Log.m105920e("MicroMsg.exdevice.BluetoothChatManager", "BC Unsupport!!!");
            return false;
        }
        C21899b bVar = this.f61918c.get(Long.valueOf(j));
        if (bVar != null) {
            z = true;
        }
        Assert.assertTrue(z);
        return bVar.mo34939d(bArr);
    }
}
