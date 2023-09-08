package mv0;

import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import gv0.C20842c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import p823sg.C90196p;
import te3.C64844xz;

/* renamed from: mv0.b */
public class C88850b implements C20842c.C20843b {

    /* renamed from: k */
    public static final byte[] f256278k = "GSMW".getBytes();

    /* renamed from: a */
    public Boolean f256279a = Boolean.FALSE;

    /* renamed from: b */
    public ServerSocket f256280b = null;

    /* renamed from: c */
    public Socket f256281c = null;

    /* renamed from: d */
    public MMHandler f256282d = null;

    /* renamed from: e */
    public MMHandler f256283e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public DataOutputStream f256284f = null;

    /* renamed from: g */
    public Object f256285g = new Object();

    /* renamed from: h */
    public int f256286h = 0;

    /* renamed from: i */
    public int f256287i = 0;

    /* renamed from: j */
    public long f256288j = 0;

    /* renamed from: mv0.b$a */
    public class C88851a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f256289d;

        /* renamed from: e */
        public final /* synthetic */ List f256290e;

        public C88851a(int i, List list) {
            this.f256289d = i;
            this.f256290e = list;
        }

        public void run() {
            int i = this.f256289d;
            String str = null;
            if (i == 0) {
                C88850b bVar = C88850b.this;
                int intValue = ((C64844xz) this.f256290e.get(0)).f186423e.getFirst().intValue();
                bVar.getClass();
                int i2 = ((intValue >> 8) & 255) | ((intValue & 255) << 8);
                Log.m105925i("MicroMsg.BakOldJavaEngine", "doListen port:%d", Integer.valueOf(i2));
                bVar.f256280b = null;
                try {
                    Log.m105924i("MicroMsg.BakOldJavaEngine", "ip:" + InetAddress.getLocalHost().getHostAddress());
                } catch (Exception e) {
                    try {
                        Log.printErrStackTrace("MicroMsg.BakOldJavaEngine", e, "getHostAddress", new Object[0]);
                    } catch (IOException e2) {
                        Log.m105921e("MicroMsg.BakOldJavaEngine", "doListen %s", e2);
                        bVar.mo123239e();
                        bVar.mo123238d(true, 0, 10005, ("doListenErr " + e2).getBytes());
                        return;
                    }
                }
                Log.m105924i("MicroMsg.BakOldJavaEngine", "before init ");
                bVar.f256280b = new ServerSocket(i2);
                Log.m105924i("MicroMsg.BakOldJavaEngine", "before accept server:  " + bVar.f256280b.toString());
                Socket accept = bVar.f256280b.accept();
                bVar.f256281c = accept;
                accept.setKeepAlive(true);
                Log.m105924i("MicroMsg.BakOldJavaEngine", "after accept client:  " + bVar.f256281c.toString());
                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(bVar.f256281c.getInputStream()));
                bVar.f256284f = new DataOutputStream(new BufferedOutputStream(bVar.f256281c.getOutputStream()));
                bVar.f256279a = Boolean.FALSE;
                bVar.mo123238d(true, 0, 10001, (byte[]) null);
                while (!bVar.f256279a.booleanValue()) {
                    bVar.mo123240f(dataInputStream);
                }
            } else if (i == 1) {
                int wiFiIpAddress = ConnectivityCompat.Companion.getWiFiIpAddress();
                DhcpInfo dhcpInfo = ((WifiManager) MMApplicationContext.getContext().getSystemService("wifi")).getDhcpInfo();
                if (dhcpInfo != null) {
                    int i3 = dhcpInfo.netmask;
                    String str2 = (wiFiIpAddress & 255) + "." + ((wiFiIpAddress >> 8) & 255) + "." + ((wiFiIpAddress >> 16) & 255) + "." + ((wiFiIpAddress >> 24) & 255);
                    Log.m105921e("MicroMsg.BakOldJavaEngine", "localip:%s, mask:%d", str2, Integer.valueOf(i3));
                    int i4 = 0;
                    for (C64844xz xzVar : this.f256290e) {
                        Log.m105925i("MicroMsg.BakOldJavaEngine", "try ip:%s", xzVar.f186422d);
                        String str3 = xzVar.f186422d;
                        if (str3 != null) {
                            String[] split = str3.split("\\.");
                            if (split.length < 4) {
                                continue;
                            } else {
                                int d = C90196p.m112887d(new byte[]{(byte) (Util.getInt(split[0], 0) & 255), (byte) (Util.getInt(split[1], 0) & 255), (byte) (Util.getInt(split[2], 0) & 255), (byte) (Util.getInt(split[3], 0) & 255)});
                                if ((i3 & d) == (i3 & wiFiIpAddress)) {
                                    C88850b.m110931c(C88850b.this, xzVar.f186422d, xzVar.f186423e.getFirst().intValue());
                                    return;
                                } else if ((d & 65535) == (65535 & wiFiIpAddress)) {
                                    str = xzVar.f186422d;
                                    i4 = xzVar.f186423e.getFirst().intValue();
                                }
                            }
                        }
                    }
                    if (str != null) {
                        Log.m105929w("MicroMsg.BakOldJavaEngine", "try to connect to secondary:%s, port:%d", str, Integer.valueOf(i4));
                        C88850b.m110931c(C88850b.this, str, i4);
                        return;
                    }
                    C88850b.this.mo123238d(true, 0, 10009, String.format("not match ip mask:%d, localip:%s", new Object[]{Integer.valueOf(i3), str2}).getBytes());
                    Log.m105921e("MicroMsg.BakOldJavaEngine", "not match ip mask:%d, localip:%s", Integer.valueOf(i3), str2);
                }
            }
        }
    }

    /* renamed from: mv0.b$b */
    public class C88852b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f256292d;

        /* renamed from: e */
        public final /* synthetic */ int f256293e;

        /* renamed from: f */
        public final /* synthetic */ int f256294f;

        /* renamed from: g */
        public final /* synthetic */ byte[] f256295g;

        public C88852b(C88850b bVar, boolean z, int i, int i2, byte[] bArr) {
            this.f256292d = z;
            this.f256293e = i;
            this.f256294f = i2;
            this.f256295g = bArr;
        }

        public void run() {
            C20842c.m22880l1(this.f256292d, this.f256293e, this.f256294f, this.f256295g);
        }
    }

    /* renamed from: mv0.b$c */
    public class C88853c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ byte[] f256296d;

        public C88853c(int i, byte[] bArr) {
            this.f256296d = bArr;
        }

        public void run() {
            C88850b bVar = C88850b.this;
            byte[] bArr = this.f256296d;
            if (bVar.f256279a.booleanValue()) {
                Log.m105920e("MicroMsg.BakOldJavaEngine", "engine has stop");
            } else {
                bVar.f256282d.post(new C88854c(bVar, bArr));
            }
        }
    }

    public C88850b() {
        MMHandler mMHandler = this.f256282d;
        if (mMHandler == null || mMHandler.isQuit()) {
            this.f256282d = new MMHandler("BackupJavaEngine_handler");
        }
    }

    /* renamed from: c */
    public static void m110931c(C88850b bVar, String str, int i) {
        bVar.getClass();
        int i2 = ((i >> 8) & 255) | ((i & 255) << 8);
        Log.m105925i("MicroMsg.BakOldJavaEngine", "doConnect serverIp:%s, port:%d", str, Integer.valueOf(i2));
        try {
            InetAddress byName = InetAddress.getByName(str);
            Log.m105924i("MicroMsg.BakOldJavaEngine", "TCP  Connecting...");
            Socket socket = new Socket(byName, i2);
            bVar.f256281c = socket;
            socket.setKeepAlive(true);
            Log.m105924i("MicroMsg.BakOldJavaEngine", "TCP connected" + bVar.f256281c.toString());
            bVar.f256284f = new DataOutputStream(new BufferedOutputStream(bVar.f256281c.getOutputStream()));
            DataInputStream dataInputStream = new DataInputStream(bVar.f256281c.getInputStream());
            bVar.f256279a = Boolean.FALSE;
            bVar.mo123238d(true, 0, 10002, (byte[]) null);
            while (!bVar.f256279a.booleanValue()) {
                bVar.mo123240f(dataInputStream);
            }
        } catch (IOException e) {
            Log.m105921e("MicroMsg.BakOldJavaEngine", "doConnect %s", e);
            bVar.mo123239e();
            bVar.mo123238d(true, 0, 10004, ("doConnect " + e).getBytes());
        }
    }

    /* renamed from: a */
    public void mo32548a(int i, byte[] bArr, int i2) {
        if (this.f256282d == null) {
            this.f256283e.postDelayed(new C88853c(i, bArr), 200);
        } else if (this.f256279a.booleanValue()) {
            Log.m105920e("MicroMsg.BakOldJavaEngine", "engine has stop");
        } else {
            this.f256282d.post(new C88854c(this, bArr));
        }
    }

    /* renamed from: b */
    public int mo32549b(int i, byte[] bArr, int i2) {
        return 0;
    }

    /* renamed from: d */
    public final void mo123238d(boolean z, int i, int i2, byte[] bArr) {
        this.f256283e.post(new C88852b(this, z, i, i2, bArr));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001c */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123239e() {
        /*
            r2 = this;
            r0 = 0
            r2.f256286h = r0
            r2.f256287i = r0
            r0 = 0
            r2.f256288j = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.f256279a = r0
            java.lang.Object r0 = r2.f256285g     // Catch:{ Exception -> 0x001c }
            monitor-enter(r0)     // Catch:{ Exception -> 0x001c }
            java.io.DataOutputStream r1 = r2.f256284f     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            java.net.Socket r0 = r2.f256281c     // Catch:{ Exception -> 0x0023 }
            if (r0 == 0) goto L_0x0023
            r0.close()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mv0.C88850b.mo123239e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123240f(java.io.DataInputStream r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r2 = "MicroMsg.BakOldJavaEngine"
        L_0x0004:
            r3 = 1
            r4 = 0
            java.lang.Boolean r0 = r1.f256279a     // Catch:{ Exception -> 0x0141 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0141 }
            r5 = 2
            r6 = 3
            r7 = 10007(0x2717, float:1.4023E-41)
            if (r0 != 0) goto L_0x007c
            int r0 = r1.f256286h     // Catch:{ Exception -> 0x0141 }
            r8 = 4
            if (r0 == r8) goto L_0x007c
            byte r0 = r20.readByte()     // Catch:{ Exception -> 0x0141 }
            byte[] r8 = f256278k     // Catch:{ Exception -> 0x0141 }
            int r9 = r1.f256286h     // Catch:{ Exception -> 0x0141 }
            byte r10 = r8[r9]     // Catch:{ Exception -> 0x0141 }
            if (r10 != r0) goto L_0x0028
            int r9 = r9 + 1
            r1.f256286h = r9     // Catch:{ Exception -> 0x0141 }
            goto L_0x0004
        L_0x0028:
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x0141 }
            long r11 = r1.f256288j     // Catch:{ Exception -> 0x0141 }
            long r11 = r9 - r11
            int r13 = r1.f256287i     // Catch:{ Exception -> 0x0141 }
            long r14 = (long) r13     // Catch:{ Exception -> 0x0141 }
            long r14 = r14 - r11
            r11 = 10
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 >= 0) goto L_0x0047
            if (r13 >= 0) goto L_0x003e
            r1.f256287i = r4     // Catch:{ Exception -> 0x0141 }
        L_0x003e:
            int r11 = r1.f256287i     // Catch:{ Exception -> 0x0141 }
            int r11 = r11 + r3
            r1.f256287i = r11     // Catch:{ Exception -> 0x0141 }
            r1.f256288j = r9     // Catch:{ Exception -> 0x0141 }
            r9 = 0
            goto L_0x0048
        L_0x0047:
            r9 = 1
        L_0x0048:
            if (r9 != 0) goto L_0x0079
            java.lang.String r9 = "GSMW in the %dth step error:expect:%02X, butGet:%02X"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0141 }
            int r10 = r1.f256286h     // Catch:{ Exception -> 0x0141 }
            int r10 = r10 + r3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0141 }
            r6[r4] = r10     // Catch:{ Exception -> 0x0141 }
            int r10 = r1.f256286h     // Catch:{ Exception -> 0x0141 }
            byte r8 = r8[r10]     // Catch:{ Exception -> 0x0141 }
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0141 }
            r6[r3] = r8     // Catch:{ Exception -> 0x0141 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0141 }
            r6[r5] = r0     // Catch:{ Exception -> 0x0141 }
            java.lang.String r0 = java.lang.String.format(r9, r6)     // Catch:{ Exception -> 0x0141 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x0141 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0141 }
            r1.mo123238d(r3, r4, r7, r0)     // Catch:{ Exception -> 0x0141 }
        L_0x0079:
            r1.f256286h = r4     // Catch:{ Exception -> 0x0141 }
            goto L_0x0004
        L_0x007c:
            r1.f256286h = r4     // Catch:{ Exception -> 0x0141 }
            int r0 = r20.readInt()     // Catch:{ Exception -> 0x0141 }
            short r10 = r20.readShort()     // Catch:{ Exception -> 0x0141 }
            short r15 = r20.readShort()     // Catch:{ Exception -> 0x0141 }
            int r12 = r20.readInt()     // Catch:{ Exception -> 0x0141 }
            r8 = 16777216(0x1000000, float:2.3509887E-38)
            if (r12 <= r8) goto L_0x00af
            java.lang.String r0 = "loopRead size to large:%d"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0141 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0141 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0141 }
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ Exception -> 0x0141 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x0141 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0141 }
            r1.f256279a = r5     // Catch:{ Exception -> 0x0141 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0141 }
            r1.mo123238d(r3, r4, r7, r0)     // Catch:{ Exception -> 0x0141 }
            return
        L_0x00af:
            int r13 = r20.readInt()     // Catch:{ Exception -> 0x0141 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141 }
            r8.<init>()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r9 = "read buf size:"
            r8.append(r9)     // Catch:{ Exception -> 0x0141 }
            r8.append(r12)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0141 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)     // Catch:{ Exception -> 0x0141 }
            int r8 = r12 + -20
            byte[] r14 = new byte[r8]     // Catch:{ Exception -> 0x0141 }
            r9 = 0
        L_0x00cd:
            if (r9 >= r8) goto L_0x00e4
            int r11 = r8 - r9
            r5 = r20
            int r11 = r5.read(r14, r9, r11)     // Catch:{ Exception -> 0x013f }
            r6 = -1
            if (r11 != r6) goto L_0x00e0
            r17 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r17)     // Catch:{ InterruptedException -> 0x00e1 }
            goto L_0x00e1
        L_0x00e0:
            int r9 = r9 + r11
        L_0x00e1:
            r5 = 2
            r6 = 3
            goto L_0x00cd
        L_0x00e4:
            r5 = r20
            com.tencent.mm.pointers.PByteArray r6 = new com.tencent.mm.pointers.PByteArray     // Catch:{ Exception -> 0x013f }
            r6.<init>()     // Catch:{ Exception -> 0x013f }
            byte[] r8 = f256278k     // Catch:{ Exception -> 0x013f }
            r9 = r0
            r11 = r15
            r17 = r15
            r15 = r6
            int r8 = kv0.C88308a.m110075a(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x013f }
            java.lang.String r9 = "summerbak loopRead unpack ret[%d]"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x013f }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x013f }
            r10[r4] = r11     // Catch:{ Exception -> 0x013f }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r10)     // Catch:{ Exception -> 0x013f }
            if (r8 == 0) goto L_0x011b
            byte[] r0 = r6.value     // Catch:{ Exception -> 0x013f }
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = ""
            goto L_0x0113
        L_0x010d:
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x013f }
            r6.<init>(r0)     // Catch:{ Exception -> 0x013f }
            r0 = r6
        L_0x0113:
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x013f }
            r1.mo123238d(r3, r4, r7, r0)     // Catch:{ Exception -> 0x013f }
            goto L_0x0178
        L_0x011b:
            java.lang.String r7 = "summerbak loopRead unpack ret[%d], seq[%d], type[%d]"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x013f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x013f }
            r9[r4] = r8     // Catch:{ Exception -> 0x013f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x013f }
            r9[r3] = r8     // Catch:{ Exception -> 0x013f }
            java.lang.Short r8 = java.lang.Short.valueOf(r17)     // Catch:{ Exception -> 0x013f }
            r10 = 2
            r9[r10] = r8     // Catch:{ Exception -> 0x013f }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r7, r9)     // Catch:{ Exception -> 0x013f }
            byte[] r6 = r6.value     // Catch:{ Exception -> 0x013f }
            r7 = r17
            r1.mo123238d(r4, r0, r7, r6)     // Catch:{ Exception -> 0x013f }
            goto L_0x0178
        L_0x013f:
            r0 = move-exception
            goto L_0x0144
        L_0x0141:
            r0 = move-exception
            r5 = r20
        L_0x0144:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r0
            java.lang.String r7 = "loopRead %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r7, r6)
            r20.close()     // Catch:{ IOException -> 0x0151 }
            goto L_0x0152
        L_0x0151:
        L_0x0152:
            java.lang.Boolean r2 = r1.f256279a
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0175
            r2 = 10006(0x2716, float:1.4021E-41)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "read_error "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            byte[] r0 = r0.getBytes()
            r1.mo123238d(r3, r4, r2, r0)
        L_0x0175:
            r19.mo123239e()
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mv0.C88850b.mo123240f(java.io.DataInputStream):void");
    }

    /* renamed from: g */
    public void mo123241g(int i, List<C64844xz> list) {
        Log.m105925i("MicroMsg.BakOldJavaEngine", "connect type:%d", Integer.valueOf(i));
        MMHandler mMHandler = this.f256282d;
        if (mMHandler == null || mMHandler.isQuit()) {
            this.f256282d = new MMHandler("BackupJavaEngine_handler");
        }
        ThreadPool.post(new C88851a(i, list), "BackupJavaEngine_connect");
    }

    /* renamed from: h */
    public void mo123242h() {
        Log.m105924i("MicroMsg.BakOldJavaEngine", "close connect");
        mo123239e();
        mo123238d(true, 0, 10003, (byte[]) null);
    }
}
