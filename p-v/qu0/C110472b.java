package qu0;

import com.tencent.p014mm.sdk.platformtools.Log;
import pu0.C110248b;

/* renamed from: qu0.b */
public final class C110472b {

    /* renamed from: a */
    public static final C110472b f330365a = new C110472b();

    /* renamed from: b */
    public static boolean f330366b = false;

    /* renamed from: c */
    public static int f330367c = -1;

    /* renamed from: d */
    public static boolean f330368d = true;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m150370c(android.media.AudioManager r13) {
        /*
            java.lang.String r0 = "audioManager"
            gy3.C87412m.m108594g(r13, r0)
            qu0.b r7 = f330365a
            boolean r0 = r7.mo161950a()
            r8 = -1
            if (r0 != 0) goto L_0x000f
            return r8
        L_0x000f:
            boolean r0 = f330368d
            if (r0 != 0) goto L_0x0014
            return r8
        L_0x0014:
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            pu0.b$a r10 = pu0.C110248b.f329777h
            java.lang.String r1 = r10.mo161662g()
            r11 = 0
            r0[r11] = r1
            java.lang.String r12 = "MicroMsg.BluetoothUtil"
            java.lang.String r1 = "dkbt begin tryStartBluetooth %s"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r12, r1, r0)
            boolean r0 = r13.isBluetoothScoAvailableOffCall()
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "start bluetooth failed by isBluetoothScoAvailableOffCall false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
        L_0x0033:
            r0 = 0
            goto L_0x0074
        L_0x0035:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher.isCalling()
            if (r0 == 0) goto L_0x003c
            goto L_0x0033
        L_0x003c:
            boolean r0 = r13.isBluetoothScoOn()
            if (r0 != 0) goto L_0x0073
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.tencent.mm.sdk.platformtools.MMStack r1 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r0[r11] = r1
            java.lang.String r1 = "BluetoothUtil am.isBluetoothScoOn is false and startBluetoothSco, stack: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
            java.lang.String r1 = "com/tencent/mm/plugin/audio/util/BluetoothUtil"
            java.lang.String r2 = "doStartBluetooth"
            java.lang.String r3 = "(Landroid/media/AudioManager;)Z"
            java.lang.String r4 = "android/media/AudioManager_EXEC_"
            java.lang.String r5 = "startBluetoothSco"
            java.lang.String r6 = "()V"
            r0 = r13
            j20.C117292a.m165357c(r0, r1, r2, r3, r4, r5, r6)
            r13.startBluetoothSco()
            java.lang.String r1 = "com/tencent/mm/plugin/audio/util/BluetoothUtil"
            java.lang.String r2 = "doStartBluetooth"
            java.lang.String r3 = "(Landroid/media/AudioManager;)Z"
            java.lang.String r4 = "android/media/AudioManager_EXEC_"
            java.lang.String r5 = "startBluetoothSco"
            java.lang.String r6 = "()V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0073:
            r0 = 1
        L_0x0074:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r10.mo161662g()
            r1[r11] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1[r9] = r2
            java.lang.String r2 = "dkbt end tryStartBluetooth %s ret:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            if (r0 != 0) goto L_0x008b
            return r8
        L_0x008b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "dkbt  tryStartBluetooth "
            r1.append(r2)
            java.lang.String r2 = r10.mo161662g()
            r1.append(r2)
            java.lang.String r2 = " ret:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r0)
            boolean r0 = r7.mo161951b()
            if (r0 == 0) goto L_0x00b6
            r13.setBluetoothScoOn(r9)
            f330366b = r9
        L_0x00b6:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1[r11] = r2
            java.lang.String r2 = "isBluetoothOn: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qu0.C110472b.m150370c(android.media.AudioManager):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ Exception -> 0x0097 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161950a() {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.BluetoothUtil"
            r1 = 0
            r2 = 1
            android.bluetooth.BluetoothAdapter r3 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0020 }
            int r3 = r3.getProfileConnectionState(r2)     // Catch:{ Exception -> 0x0020 }
            java.lang.String r4 = "isConnectHeadset getProfileConnectionState: %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0020 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0020 }
            r5[r1] = r6     // Catch:{ Exception -> 0x0020 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)     // Catch:{ Exception -> 0x0020 }
            r4 = 2
            if (r3 != r4) goto L_0x001e
            r3 = 1
            goto L_0x0026
        L_0x001e:
            r3 = 0
            goto L_0x0026
        L_0x0020:
            java.lang.String r3 = "dkbt exception in isConnectDevice()"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ Exception -> 0x0097 }
            goto L_0x001e
        L_0x0026:
            if (r3 != 0) goto L_0x003d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
            r2.<init>()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r4 = "dkbt isConnectHeadset() = "
            r2.append(r4)     // Catch:{ Exception -> 0x0097 }
            r2.append(r3)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0097 }
            return r1
        L_0x003d:
            android.bluetooth.BluetoothAdapter r3 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0097 }
            if (r3 != 0) goto L_0x0049
            java.lang.String r2 = "dkbt BluetoothAdapter.getDefaultAdapter() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ Exception -> 0x0097 }
            return r1
        L_0x0049:
            boolean r4 = r3.isEnabled()     // Catch:{ Exception -> 0x0097 }
            if (r4 != 0) goto L_0x0055
            java.lang.String r2 = "dkbt !adp.isEnabled()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0097 }
            return r1
        L_0x0055:
            java.util.Set r3 = r3.getBondedDevices()     // Catch:{ Exception -> 0x0097 }
            if (r3 == 0) goto L_0x0091
            int r4 = r3.size()     // Catch:{ Exception -> 0x0097 }
            if (r4 != 0) goto L_0x0062
            goto L_0x0091
        L_0x0062:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0097 }
        L_0x0066:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0097 }
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4     // Catch:{ Exception -> 0x0097 }
            int r4 = r4.getBondState()     // Catch:{ Exception -> 0x0097 }
            r5 = 12
            if (r4 != r5) goto L_0x0066
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            if (r3 != 0) goto L_0x0085
            java.lang.String r2 = "dkbt hasBond == false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0097 }
            return r1
        L_0x0085:
            java.lang.String r3 = "alvinluo isBluetoothCanUse: %b"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0097 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0097 }
            r4[r1] = r5     // Catch:{ Exception -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ Exception -> 0x0097 }
            return r2
        L_0x0091:
            java.lang.String r2 = "dkbt setDev == null || setDev.size() == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ Exception -> 0x0097 }
            return r1
        L_0x0097:
            r2 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qu0.C110472b.mo161950a():boolean");
    }

    /* renamed from: b */
    public final boolean mo161951b() {
        C110248b.C110249a aVar = C110248b.f329777h;
        boolean isBluetoothScoOn = aVar.mo161657b().f329358h.isBluetoothScoOn();
        boolean isBluetoothA2dpOn = aVar.mo161657b().f329358h.isBluetoothA2dpOn();
        Log.m105925i("MicroMsg.BluetoothUtil", "isBluetoothScoOn: %s isBluetoothA2dpOn: %s, isBluetoothCanUse: %s", Boolean.valueOf(isBluetoothScoOn), Boolean.valueOf(isBluetoothA2dpOn), Boolean.valueOf(mo161950a()));
        return isBluetoothScoOn || isBluetoothA2dpOn;
    }
}
