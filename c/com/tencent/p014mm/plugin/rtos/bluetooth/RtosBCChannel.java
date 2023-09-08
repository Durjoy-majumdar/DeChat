package com.tencent.p014mm.plugin.rtos.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d81.C45288e;
import gy3.C87412m;
import ik2.C21096a;
import ik2.C21097b;
import ik2.C21098c;
import ik2.C21104d;
import ik2.C87748e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import p385u2.C111105a;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel */
public final class RtosBCChannel implements C21096a, C21098c.C21101b {

    /* renamed from: a */
    public final Context f53330a;

    /* renamed from: b */
    public BluetoothAdapter f53331b;

    /* renamed from: c */
    public C21098c f53332c;

    /* renamed from: d */
    public String f53333d = "";

    /* renamed from: e */
    public C21104d f53334e;

    /* renamed from: f */
    public long f53335f;

    /* renamed from: g */
    public C18990a f53336g = new C18990a(this);

    /* renamed from: h */
    public boolean f53337h;

    /* renamed from: i */
    public boolean f53338i;

    /* renamed from: j */
    public final C21097b f53339j = new C21097b();

    /* renamed from: k */
    public BroadcastReceiver f53340k;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/rtos/bluetooth/RtosBCChannel$RtosBCReceiver;", "Landroid/content/BroadcastReceiver;", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel$RtosBCReceiver */
    public static final class RtosBCReceiver extends BroadcastReceiver {

        /* renamed from: a */
        public WeakReference<RtosBCChannel> f53341a;

        public RtosBCReceiver(RtosBCChannel rtosBCChannel) {
            C87412m.m108594g(rtosBCChannel, "rtosBCChannel");
            this.f53341a = new WeakReference<>(rtosBCChannel);
        }

        public void onReceive(Context context, Intent intent) {
            C18990a aVar;
            String action = intent != null ? intent.getAction() : null;
            RtosBCChannel rtosBCChannel = this.f53341a.get();
            if (rtosBCChannel != null && action != null) {
                switch (action.hashCode()) {
                    case -1530327060:
                        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
                            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_STATE_CHANGED------ from " + intExtra2 + " -> " + intExtra);
                            if (intExtra2 == 11 && intExtra == 12) {
                                C18990a aVar2 = rtosBCChannel.f53336g;
                                aVar2.sendMessage(aVar2.obtainMessage(7));
                            }
                            if (intExtra2 == 13 && intExtra == 10) {
                                C18990a aVar3 = rtosBCChannel.f53336g;
                                aVar3.sendMessage(aVar3.obtainMessage(8));
                                return;
                            }
                            return;
                        }
                        return;
                    case -301431627:
                        if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            C87412m.m108591d(bluetoothDevice);
                            String address = bluetoothDevice.getAddress();
                            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_ACL_CONNECTED------ device name = " + bluetoothDevice.getName() + ", device Mac = " + address);
                            if (C112551y.m153809i(rtosBCChannel.f53333d, address, true) && !rtosBCChannel.f53338i && !rtosBCChannel.f53337h && rtosBCChannel.mo24199o()) {
                                C21097b bVar = rtosBCChannel.f53339j;
                                bVar.f59653a = 0;
                                bVar.f59654b = 1000;
                                rtosBCChannel.mo24197m();
                                return;
                            }
                            return;
                        }
                        return;
                    case 1821585647:
                        if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            C87412m.m108591d(bluetoothDevice2);
                            String address2 = bluetoothDevice2.getAddress();
                            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_ACL_DISCONNECTED------ device name = " + bluetoothDevice2.getName() + ", device Mac = " + address2);
                            return;
                        }
                        return;
                    case 2116862345:
                        if (action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                            BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                            C87412m.m108591d(bluetoothDevice3);
                            String address3 = bluetoothDevice3.getAddress();
                            int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10);
                            int intExtra4 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "------ACTION_BOND_STATE_CHANGED------ device name = " + bluetoothDevice3.getName() + ", device Mac = " + address3 + ", from " + intExtra3 + " -> " + intExtra4);
                            if (C112551y.m153809i(rtosBCChannel.f53333d, address3, true) && intExtra3 == 12 && intExtra4 == 10 && (aVar = rtosBCChannel.f53336g) != null) {
                                aVar.sendMessage(aVar.obtainMessage(3));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel$a */
    public static final class C18990a extends MMHandler {

        /* renamed from: a */
        public final WeakReference<RtosBCChannel> f53342a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18990a(RtosBCChannel rtosBCChannel) {
            super("MicroMsg.Rtos.RtosBCChannel");
            C87412m.m108594g(rtosBCChannel, "channel");
            this.f53342a = new WeakReference<>(rtosBCChannel);
        }

        public void handleMessage(Message message) {
            C21098c.C21099a aVar;
            C21104d dVar;
            C87412m.m108594g(message, "msg");
            RtosBCChannel rtosBCChannel = this.f53342a.get();
            if (rtosBCChannel != null) {
                Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "handleMessage " + message.what);
                boolean z = true;
                switch (message.what) {
                    case 1:
                        if (rtosBCChannel.f53338i) {
                            C21098c cVar = rtosBCChannel.f53332c;
                            if (cVar != null && (aVar = cVar.f59658b) != null) {
                                try {
                                    Log.m105924i("MicroMsg.Rtos.RtosBluetoothThreads", "cancel connect");
                                    BluetoothSocket bluetoothSocket = aVar.f59663c;
                                    if (bluetoothSocket != null) {
                                        bluetoothSocket.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException e) {
                                    Log.m105921e("MicroMsg.Rtos.RtosBluetoothThreads", "socket close failed (%s)", e.toString());
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            Log.m105928w("MicroMsg.Rtos.RtosBCChannel", "not connecting,ignore cancel");
                            return;
                        }
                    case 2:
                        if (rtosBCChannel.f53333d.length() <= 0) {
                            z = false;
                        }
                        if (z) {
                            rtosBCChannel.mo24197m();
                            return;
                        }
                        return;
                    case 3:
                        C21104d dVar2 = rtosBCChannel.f53334e;
                        if (dVar2 != null) {
                            dVar2.mo32874d(false);
                            return;
                        }
                        return;
                    case 4:
                        byte[] bArr = (byte[]) message.obj;
                        if (bArr != null && (dVar = rtosBCChannel.f53334e) != null) {
                            dVar.mo32873c(bArr, bArr.length);
                            return;
                        }
                        return;
                    case 5:
                        C21104d dVar3 = rtosBCChannel.f53334e;
                        if (dVar3 != null) {
                            dVar3.mo32875e();
                            return;
                        }
                        return;
                    case 6:
                        C21104d dVar4 = rtosBCChannel.f53334e;
                        if (dVar4 != null) {
                            dVar4.mo32872b();
                            return;
                        }
                        return;
                    case 7:
                        C21104d dVar5 = rtosBCChannel.f53334e;
                        if (dVar5 != null) {
                            dVar5.mo32871a();
                            return;
                        }
                        return;
                    case 8:
                        C21104d dVar6 = rtosBCChannel.f53334e;
                        if (dVar6 != null) {
                            dVar6.mo32876f();
                        }
                        C21098c cVar2 = rtosBCChannel.f53332c;
                        if (cVar2 != null) {
                            cVar2.mo32866a();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public RtosBCChannel(Context context) {
        C87412m.m108594g(context, "mContext");
        this.f53330a = context;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        C87412m.m108593f(defaultAdapter, "getDefaultAdapter()");
        this.f53331b = defaultAdapter;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        if (this.f53340k == null) {
            RtosBCReceiver rtosBCReceiver = new RtosBCReceiver(this);
            this.f53340k = rtosBCReceiver;
            context.registerReceiver(rtosBCReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public void mo24181a(String str) {
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "channel onError, " + str);
    }

    /* renamed from: b */
    public void mo24182b() {
        BroadcastReceiver broadcastReceiver = this.f53340k;
        if (broadcastReceiver != null) {
            this.f53330a.unregisterReceiver(broadcastReceiver);
            this.f53340k = null;
        }
    }

    /* renamed from: c */
    public void mo24183c() {
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "onDisconnected");
        boolean z = false;
        this.f53338i = false;
        this.f53337h = false;
        C18990a aVar = this.f53336g;
        aVar.sendMessage(aVar.obtainMessage(6));
        if (mo24199o() && !this.f53336g.hasMessages(2)) {
            C18990a aVar2 = this.f53336g;
            Message obtainMessage = aVar2.obtainMessage(2);
            C21097b bVar = this.f53339j;
            long j = bVar.f59653a + bVar.f59654b;
            bVar.f59653a = j;
            long j2 = 30000;
            if (((long) 11000) <= j && j < 30000) {
                z = true;
            }
            if (z) {
                bVar.f59654b = 3000;
                bVar.f59655c = 8000;
            }
            if (j >= 30000) {
                Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "enter long delay reconnect strategy");
                bVar.f59653a = 30000;
                bVar.f59654b = 0;
            } else {
                Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "reconnect delay " + bVar.f59653a);
                j2 = bVar.f59653a;
            }
            aVar2.sendMessageDelayed(obtainMessage, j2);
        }
    }

    public void close() {
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "close");
        mo24196l();
        this.f53335f = 0;
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "uninit");
        C21098c cVar = this.f53332c;
        if (cVar != null) {
            cVar.mo32866a();
        }
    }

    /* renamed from: d */
    public boolean mo24185d(String str) {
        C87412m.m108594g(str, TPDownloadProxyEnum.USER_MAC);
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "checkDeviceBonded " + str);
        if (str.length() == 0) {
            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "checkDeviceBonded mac is empty");
            return false;
        }
        if (Build.VERSION.SDK_INT < 31 || C111105a.m151499a(this.f53330a, "android.permission.BLUETOOTH_CONNECT") == 0) {
            Set<BluetoothDevice> bondedDevices = this.f53331b.getBondedDevices();
            if (bondedDevices != null) {
                for (BluetoothDevice next : bondedDevices) {
                    C87412m.m108591d(next);
                    if (C112551y.m153809i(next.getAddress(), str, true)) {
                        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "device " + str + " was bonded!");
                        return true;
                    }
                }
            } else {
                Log.m105928w("MicroMsg.Rtos.RtosBCChannel", "bondedDevices is null");
            }
        }
        Log.m105928w("MicroMsg.Rtos.RtosBCChannel", "no bondedDevices");
        return false;
    }

    public void disconnect() {
        C21098c cVar = this.f53332c;
        if (cVar != null) {
            cVar.mo32866a();
        }
    }

    /* renamed from: e */
    public void mo24187e(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("recv--------, data size = ");
        sb.append(bArr != null ? Integer.valueOf(bArr.length) : null);
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", sb.toString());
        C18990a aVar = this.f53336g;
        aVar.sendMessage(aVar.obtainMessage(4, bArr));
    }

    /* renamed from: f */
    public String mo24188f(String str) {
        Set<BluetoothDevice> bondedDevices;
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "convertMac " + str);
        boolean z = false;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            }
        }
        if (z) {
            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "sha256 is empty");
            return "";
        }
        Pattern compile = Pattern.compile("(?i)(([a-f0-9]{2}:){5})[a-f0-9]{2}");
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(str, "input");
        if (compile.matcher(str).find()) {
            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", str + " ---> " + str);
            return str;
        } else if ((Build.VERSION.SDK_INT >= 31 && C111105a.m151499a(this.f53330a, "android.permission.BLUETOOTH_CONNECT") != 0) || (bondedDevices = this.f53331b.getBondedDevices()) == null) {
            return str;
        } else {
            for (BluetoothDevice next : bondedDevices) {
                C87412m.m108591d(next);
                String address = next.getAddress();
                C87412m.m108593f(address, "device!!.address");
                Locale locale = Locale.getDefault();
                C87412m.m108593f(locale, "getDefault()");
                String upperCase = address.toUpperCase(locale);
                C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase(locale)");
                if (str.length() == 32) {
                    String substring = C87748e.f254041a.mo122150a(upperCase).substring(32);
                    C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                    if (C112551y.m153809i(substring, str, true)) {
                        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", str + " ---> " + next.getAddress());
                        String address2 = next.getAddress();
                        C87412m.m108593f(address2, "device.address");
                        return address2;
                    }
                } else {
                    C87748e.C87749a aVar = C87748e.f254041a;
                    String address3 = next.getAddress();
                    C87412m.m108593f(address3, "device.address");
                    Locale locale2 = Locale.getDefault();
                    C87412m.m108593f(locale2, "getDefault()");
                    String upperCase2 = address3.toUpperCase(locale2);
                    C87412m.m108593f(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    if (C112551y.m153809i(aVar.mo122150a(upperCase2), str, true)) {
                        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", str + " ---> " + next.getAddress());
                        String address4 = next.getAddress();
                        C87412m.m108593f(address4, "device.address");
                        return address4;
                    }
                }
            }
            return str;
        }
    }

    /* renamed from: g */
    public void mo24189g(byte[] bArr) {
        C21098c.C21103d dVar;
        C87412m.m108594g(bArr, "byteArray");
        C21098c cVar = this.f53332c;
        if (cVar != null && (dVar = cVar.f59660d) != null) {
            if (dVar.f59673g == null) {
                Log.m105920e("MicroMsg.Rtos.SendThread", "Send thread has been close. Send data abort");
                return;
            }
            synchronized (dVar.f59676j) {
                dVar.f59674h.add(bArr);
                dVar.f59676j.notify();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: h */
    public void mo24190h(boolean z, int i) {
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "--------send, data size = " + i + ", result = " + z);
    }

    /* renamed from: i */
    public boolean mo24191i() {
        return this.f53331b.isEnabled();
    }

    /* renamed from: i0 */
    public void mo24192i0() {
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "onConnected");
        this.f53338i = false;
        this.f53337h = true;
        C21097b bVar = this.f53339j;
        bVar.f59653a = 0;
        bVar.f59654b = 1000;
        C18990a aVar = this.f53336g;
        aVar.sendMessage(aVar.obtainMessage(5));
    }

    public boolean init(String str) {
        C87412m.m108594g(str, TPDownloadProxyEnum.USER_MAC);
        if (this.f53333d.length() > 0) {
            Log.m105928w("MicroMsg.Rtos.RtosBCChannel", "try init mac but not null");
            return true;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        C87412m.m108593f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        this.f53333d = upperCase;
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "BC channel init with mac " + this.f53333d);
        C21097b bVar = this.f53339j;
        bVar.f59653a = 0;
        bVar.f59654b = 1000;
        this.f53332c = new C21098c(this.f53333d, this);
        this.f53335f = C45288e.m50137h(this.f53333d);
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "channel is " + this.f53335f);
        return this.f53335f != 0;
    }

    /* renamed from: j */
    public void mo24194j(C21104d dVar) {
        C87412m.m108594g(dVar, "callback");
        this.f53334e = dVar;
    }

    /* renamed from: k */
    public void mo24195k() {
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "onConnecting");
        this.f53338i = true;
        this.f53337h = false;
    }

    /* renamed from: l */
    public void mo24196l() {
        Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "clear");
        this.f53333d = "";
        this.f53334e = null;
        this.f53336g.removeMessages(1);
        this.f53336g.removeMessages(2);
        C21097b bVar = this.f53339j;
        bVar.f59653a = 0;
        bVar.f59654b = 1000;
    }

    /* renamed from: m */
    public void mo24197m() {
        if (this.f53333d.length() == 0) {
            Log.m105928w("MicroMsg.Rtos.RtosBCChannel", "device mac is empty");
        } else if (this.f53337h || this.f53338i) {
            Log.m105928w("MicroMsg.Rtos.RtosBCChannel", "Remoto device is aready connect or connecting, just leave");
        } else {
            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "begin establish socket");
            this.f53338i = true;
            this.f53336g.removeMessages(1);
            this.f53336g.removeMessages(2);
            if (Build.VERSION.SDK_INT < 31 || C111105a.m151499a(this.f53330a, "android.permission.BLUETOOTH_SCAN") == 0) {
                this.f53331b.cancelDiscovery();
            }
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.f53333d);
            C21098c cVar = this.f53332c;
            if (cVar != null) {
                C87412m.m108593f(remoteDevice, TPReportKeys.Common.COMMON_DEVICE_NAME);
                C21098c.C21099a aVar = cVar.f59658b;
                if (aVar != null) {
                    aVar.mo32867a();
                }
                cVar.f59658b = null;
                C21098c.C21099a aVar2 = new C21098c.C21099a(cVar, remoteDevice);
                cVar.f59658b = aVar2;
                Log.m105924i("MicroMsg.Rtos.RtosBluetoothThreads", "------connect------");
                MMHandler mMHandler = aVar2.f59664d;
                if (!mMHandler.sendMessage(mMHandler.obtainMessage(0))) {
                    Log.m105921e("MicroMsg.Rtos.RtosBluetoothThreads", "sendMessage = %d failed!!!", 0);
                    aVar2.f59661a.f59657a.mo24183c();
                }
            }
            if (this.f53339j.f59655c > 0) {
                C18990a aVar3 = this.f53336g;
                aVar3.sendMessageDelayed(aVar3.obtainMessage(1), this.f53339j.f59655c);
            }
        }
    }

    /* renamed from: n */
    public String mo24198n() {
        Set<BluetoothDevice> bondedDevices;
        if (this.f53333d.length() == 0) {
            Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "getDeviceName mac is empty");
            return "";
        }
        if ((Build.VERSION.SDK_INT < 31 || C111105a.m151499a(this.f53330a, "android.permission.BLUETOOTH_CONNECT") == 0) && (bondedDevices = this.f53331b.getBondedDevices()) != null) {
            Iterator<BluetoothDevice> it = bondedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BluetoothDevice next = it.next();
                C87412m.m108591d(next);
                if (C112551y.m153809i(next.getAddress(), this.f53333d, true)) {
                    Log.m105924i("MicroMsg.Rtos.RtosBCChannel", "device " + this.f53333d + " name is " + next.getName());
                    if (next.getName() != null) {
                        String name = next.getName();
                        C87412m.m108593f(name, "device.name");
                        return name;
                    }
                }
            }
        }
        return "";
    }

    /* renamed from: o */
    public boolean mo24199o() {
        return mo24185d(this.f53333d);
    }
}
