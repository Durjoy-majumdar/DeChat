package com.tencent.liteav.audio.route;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.List;

/* renamed from: com.tencent.liteav.audio.route.n */
public final class C17092n extends BroadcastReceiver {

    /* renamed from: a */
    public final Context f46080a;

    /* renamed from: b */
    public C17094b f46081b = null;

    /* renamed from: c */
    private final C17093a f46082c;

    /* renamed from: com.tencent.liteav.audio.route.n$a */
    public static class C17093a {
        public void onBluetoothConnectionChanged(boolean z) {
        }

        public void onBluetoothSCOConnected(boolean z) {
        }

        public void onWiredHeadsetConnectionChanged(boolean z) {
        }
    }

    /* renamed from: com.tencent.liteav.audio.route.n$b */
    public static class C17094b implements BluetoothProfile.ServiceListener {

        /* renamed from: a */
        public final BluetoothAdapter f46083a;

        /* renamed from: b */
        public BluetoothProfile f46084b = null;

        /* renamed from: c */
        public final Object f46085c = new Object();

        /* renamed from: d */
        private final Context f46086d;

        public C17094b(Context context) {
            this.f46086d = context;
            BluetoothAdapter c = m16882c();
            this.f46083a = c;
            if (c != null) {
                try {
                    c.getProfileProxy(context, this, 1);
                } catch (Throwable th) {
                    Log.m97549w("AudioSystemBroadcastReceiver", "getProfileProxy " + th.getMessage(), new Object[0]);
                }
            } else {
                Log.m97547i("AudioSystemBroadcastReceiver", "bluetooth adapter is null", new Object[0]);
            }
        }

        /* renamed from: c */
        private static BluetoothAdapter m16882c() {
            try {
                return BluetoothAdapter.getDefaultAdapter();
            } catch (Throwable th) {
                Log.m97549w("AudioSystemBroadcastReceiver", "getDefaultAdapter exception " + th.getMessage(), new Object[0]);
                return null;
            }
        }

        /* renamed from: d */
        private List<BluetoothDevice> m16883d() {
            try {
                return this.f46084b.getConnectedDevices();
            } catch (Throwable th) {
                Log.m97549w("AudioSystemBroadcastReceiver", "getConnectedDevices exception " + th.getMessage(), new Object[0]);
                return null;
            }
        }

        /* renamed from: e */
        private boolean m16884e() {
            try {
                return this.f46083a.isEnabled();
            } catch (Throwable th) {
                Log.m97549w("AudioSystemBroadcastReceiver", "isEnabled exception " + th.getMessage(), new Object[0]);
                return false;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(2:15|16)(1:17)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028 A[Catch:{ Exception -> 0x004a }, DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002a A[Catch:{ Exception -> 0x004a }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo19339a() {
            /*
                r6 = this;
                android.bluetooth.BluetoothAdapter r0 = r6.f46083a
                r1 = 0
                if (r0 == 0) goto L_0x0069
                boolean r0 = r6.m16884e()
                if (r0 != 0) goto L_0x000c
                goto L_0x0069
            L_0x000c:
                r0 = 0
                java.lang.Object r2 = r6.f46085c
                monitor-enter(r2)
                android.bluetooth.BluetoothProfile r3 = r6.f46084b     // Catch:{ all -> 0x0066 }
                if (r3 != 0) goto L_0x0033
                java.lang.String r3 = "AudioSystemBroadcastReceiver"
                java.lang.String r4 = "mBluetoothHeadsetProfile is null ,wait for 1000ms"
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x0024 }
                com.tencent.liteav.base.Log.m97547i(r3, r4, r5)     // Catch:{ InterruptedException -> 0x0024 }
                java.lang.Object r3 = r6.f46085c     // Catch:{ InterruptedException -> 0x0024 }
                r4 = 1000(0x3e8, double:4.94E-321)
                r3.wait(r4)     // Catch:{ InterruptedException -> 0x0024 }
            L_0x0024:
                android.bluetooth.BluetoothProfile r3 = r6.f46084b     // Catch:{ all -> 0x0066 }
                if (r3 != 0) goto L_0x002a
                monitor-exit(r2)     // Catch:{ all -> 0x0066 }
                return r1
            L_0x002a:
                java.lang.String r3 = "AudioSystemBroadcastReceiver"
                java.lang.String r4 = "mBluetoothHeadsetProfile service is connected now"
                java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x0066 }
                com.tencent.liteav.base.Log.m97547i(r3, r4, r5)     // Catch:{ all -> 0x0066 }
            L_0x0033:
                android.content.Context r3 = r6.f46086d     // Catch:{ Exception -> 0x004a }
                boolean r3 = com.tencent.liteav.audio.route.C17092n.m16881a((android.content.Context) r3)     // Catch:{ Exception -> 0x004a }
                if (r3 == 0) goto L_0x003f
                java.util.List r0 = r6.m16883d()     // Catch:{ Exception -> 0x004a }
            L_0x003f:
                if (r0 == 0) goto L_0x0064
                int r0 = r0.size()     // Catch:{ Exception -> 0x004a }
                if (r0 <= 0) goto L_0x0064
                r0 = 1
                r1 = 1
                goto L_0x0064
            L_0x004a:
                r0 = move-exception
                java.lang.String r3 = "AudioSystemBroadcastReceiver"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
                java.lang.String r5 = "get connected bluetooth devices failed."
                r4.<init>(r5)     // Catch:{ all -> 0x0066 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0066 }
                r4.append(r0)     // Catch:{ all -> 0x0066 }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0066 }
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0066 }
                com.tencent.liteav.base.Log.m97546e(r3, r0, r4)     // Catch:{ all -> 0x0066 }
            L_0x0064:
                monitor-exit(r2)     // Catch:{ all -> 0x0066 }
                return r1
            L_0x0066:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0066 }
                throw r0
            L_0x0069:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.route.C17092n.C17094b.mo19339a():boolean");
        }

        /* renamed from: b */
        public final void mo19340b() {
            try {
                this.f46083a.closeProfileProxy(1, this.f46084b);
            } catch (Throwable th) {
                Log.m97549w("AudioSystemBroadcastReceiver", "closeProfileProxy exception " + th.getMessage(), new Object[0]);
            }
        }

        public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            BluetoothProfile bluetoothProfile2;
            if (i == 1) {
                synchronized (this.f46085c) {
                    if (!(this.f46083a == null || (bluetoothProfile2 = this.f46084b) == null)) {
                        Log.m97547i("AudioSystemBroadcastReceiver", "BluetoohHeadset proxy changed from %s to %s", bluetoothProfile2, bluetoothProfile);
                        mo19340b();
                        this.f46084b = null;
                    }
                    this.f46084b = bluetoothProfile;
                    this.f46085c.notifyAll();
                }
            }
        }

        public final void onServiceDisconnected(int i) {
            if (i == 1) {
                synchronized (this.f46085c) {
                    if (!(this.f46083a == null || this.f46084b == null)) {
                        mo19340b();
                        this.f46084b = null;
                    }
                }
            }
        }
    }

    public C17092n(Context context, C17093a aVar) {
        this.f46080a = context;
        this.f46082c = aVar;
    }

    /* renamed from: a */
    private static int m16879a(Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception e) {
            LiteavLog.m16898e("AudioSystemBroadcastReceiver", "getIntentIntExtra ".concat(String.valueOf(e)));
            return i;
        }
    }

    /* renamed from: a */
    private static String m16880a(int i) {
        switch (i) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "unknown";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            java.lang.String r0 = "AudioSystemBroadcastReceiver"
            r1 = 0
            if (r11 == 0) goto L_0x00fd
            if (r10 != 0) goto L_0x0009
            goto L_0x00fd
        L_0x0009:
            java.lang.String r10 = r11.getAction()
            if (r10 != 0) goto L_0x0010
            return
        L_0x0010:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r10
            java.lang.String r4 = "receive Action: %s"
            com.tencent.liteav.base.Log.m97547i(r0, r4, r3)
            int r3 = r10.hashCode()
            r4 = 3
            r5 = 2
            r6 = -1
            switch(r3) {
                case -1676458352: goto L_0x0047;
                case -1530327060: goto L_0x003c;
                case -1435586571: goto L_0x0031;
                case 545516589: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r3 = -1
            goto L_0x0051
        L_0x0026:
            java.lang.String r3 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            r3 = 3
            goto L_0x0051
        L_0x0031:
            java.lang.String r3 = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x003a
            goto L_0x0024
        L_0x003a:
            r3 = 2
            goto L_0x0051
        L_0x003c:
            java.lang.String r3 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0045
            goto L_0x0024
        L_0x0045:
            r3 = 1
            goto L_0x0051
        L_0x0047:
            java.lang.String r3 = "android.intent.action.HEADSET_PLUG"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L_0x0050
            goto L_0x0024
        L_0x0050:
            r3 = 0
        L_0x0051:
            java.lang.String r7 = "android.bluetooth.profile.extra.STATE"
            r8 = 10
            switch(r3) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00bb;
                case 2: goto L_0x0097;
                case 3: goto L_0x0062;
                default: goto L_0x0058;
            }
        L_0x0058:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r1] = r10
            java.lang.String r10 = "ignore unknow Action: %s"
            com.tencent.liteav.base.Log.m97549w(r0, r10, r11)
            return
        L_0x0062:
            int r10 = m16879a(r11, r7, r6)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            if (r10 == 0) goto L_0x007d
            if (r10 == r2) goto L_0x007a
            if (r10 == r5) goto L_0x0077
            if (r10 == r4) goto L_0x0074
            java.lang.String r3 = "unknown"
            goto L_0x007f
        L_0x0074:
            java.lang.String r3 = "STATE_DISCONNECTING"
            goto L_0x007f
        L_0x0077:
            java.lang.String r3 = "STATE_CONNECTED"
            goto L_0x007f
        L_0x007a:
            java.lang.String r3 = "STATE_CONNECTING"
            goto L_0x007f
        L_0x007d:
            java.lang.String r3 = "STATE_DISCONNECTED"
        L_0x007f:
            r11[r1] = r3
            java.lang.String r3 = "receive bluetooth headset connection state changed: %s"
            com.tencent.liteav.base.Log.m97547i(r0, r3, r11)
            if (r10 == 0) goto L_0x0091
            if (r10 == r5) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            com.tencent.liteav.audio.route.n$a r10 = r9.f46082c
            r10.onBluetoothConnectionChanged(r2)
        L_0x0090:
            return
        L_0x0091:
            com.tencent.liteav.audio.route.n$a r10 = r9.f46082c
            r10.onBluetoothConnectionChanged(r1)
            return
        L_0x0097:
            int r10 = m16879a(r11, r7, r8)
            r11 = 12
            if (r10 != r11) goto L_0x00ac
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "receive bluetooth audio state changed to STATE_AUDIO_CONNECTED"
            com.tencent.liteav.base.Log.m97547i(r0, r11, r10)
            com.tencent.liteav.audio.route.n$a r10 = r9.f46082c
            r10.onBluetoothSCOConnected(r2)
            return
        L_0x00ac:
            if (r10 != r8) goto L_0x00ba
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "receive bluetooth audio state changed to STATE_AUDIO_DISCONNECTED"
            com.tencent.liteav.base.Log.m97547i(r0, r11, r10)
            com.tencent.liteav.audio.route.n$a r10 = r9.f46082c
            r10.onBluetoothSCOConnected(r1)
        L_0x00ba:
            return
        L_0x00bb:
            java.lang.String r10 = "android.bluetooth.adapter.extra.STATE"
            int r10 = m16879a(r11, r10, r1)
            java.lang.String r3 = "android.bluetooth.adapter.extra.PREVIOUS_STATE"
            int r11 = m16879a(r11, r3, r1)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r4 = m16880a((int) r10)
            r3[r1] = r4
            java.lang.String r11 = m16880a((int) r11)
            r3[r2] = r11
            java.lang.String r11 = "receive ACTION_STATE_CHANGED, EXTRA_STATE: %s, EXTRA_PREVIOUS_STATE: %s"
            com.tencent.liteav.base.Log.m97547i(r0, r11, r3)
            if (r10 != r8) goto L_0x00e1
            com.tencent.liteav.audio.route.n$a r10 = r9.f46082c
            r10.onBluetoothConnectionChanged(r1)
        L_0x00e1:
            return
        L_0x00e2:
            java.lang.String r10 = "state"
            int r10 = m16879a(r11, r10, r6)
            if (r10 != r6) goto L_0x00f4
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "unknown headset state, ignore..."
            com.tencent.liteav.base.Log.m97546e(r0, r11, r10)
            return
        L_0x00f4:
            com.tencent.liteav.audio.route.n$a r11 = r9.f46082c
            if (r10 == 0) goto L_0x00f9
            r1 = 1
        L_0x00f9:
            r11.onWiredHeadsetConnectionChanged(r1)
            return
        L_0x00fd:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "onReceive intent or context is null!"
            com.tencent.liteav.base.Log.m97546e(r0, r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.audio.route.C17092n.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m16881a(Context context) {
        if (context == null || LiteavSystemInfo.getSystemOSVersionInt() < 31 || context.checkPermission("android.permission.BLUETOOTH_CONNECT", Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }
}
