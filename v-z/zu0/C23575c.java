package zu0;

import com.tencent.p014mm.lan_cs.Client;
import com.tencent.p014mm.lan_cs.Server;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gv0.C20842c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zu0.c */
public class C23575c implements C20842c.C20843b {

    /* renamed from: i */
    public static final byte[] f67575i = "GSMW".getBytes();

    /* renamed from: a */
    public volatile AtomicInteger f67576a = new AtomicInteger(0);

    /* renamed from: b */
    public String f67577b;

    /* renamed from: c */
    public int f67578c;

    /* renamed from: d */
    public String f67579d;

    /* renamed from: e */
    public String f67580e;

    /* renamed from: f */
    public int f67581f;

    /* renamed from: g */
    public MMHandler f67582g = null;

    /* renamed from: h */
    public C23577c f67583h;

    /* renamed from: zu0.c$b */
    public class C23576b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f67584d;

        /* renamed from: e */
        public final /* synthetic */ int f67585e;

        /* renamed from: f */
        public final /* synthetic */ int f67586f;

        /* renamed from: g */
        public final /* synthetic */ byte[] f67587g;

        public C23576b(C23575c cVar, boolean z, int i, int i2, byte[] bArr) {
            this.f67584d = z;
            this.f67585e = i;
            this.f67586f = i2;
            this.f67587g = bArr;
        }

        public void run() {
            C20842c.m22880l1(this.f67584d, this.f67585e, this.f67586f, this.f67587g);
        }
    }

    /* renamed from: zu0.c$c */
    public interface C23577c {
    }

    /* renamed from: zu0.c$a */
    public class C23578a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f67588d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f67589e;

        /* renamed from: f */
        public final /* synthetic */ int f67590f;

        /* renamed from: g */
        public final /* synthetic */ long f67591g;

        public C23578a(int i, byte[] bArr, int i2, long j) {
            this.f67588d = i;
            this.f67589e = bArr;
            this.f67590f = i2;
            this.f67591g = j;
        }

        public void run() {
            int i;
            long nowMilliSecond = Util.nowMilliSecond();
            if (C23575c.this.f67576a.get() == 0) {
                Log.m105929w("MicroMsg.BackupCEngine", "sendImp err mode!! seq:%d", Integer.valueOf(this.f67588d));
                return;
            }
            if (C23575c.this.f67576a.get() == 1) {
                C23575c cVar = C23575c.this;
                i = Server.Java2C.send(cVar.f67577b, cVar.f67578c, this.f67589e);
            } else if (C23575c.this.f67576a.get() == 2) {
                C23575c cVar2 = C23575c.this;
                i = Client.Java2C.send(cVar2.f67577b, cVar2.f67578c, this.f67589e);
            } else {
                i = 0;
            }
            C20842c.m22878j1(Util.getLength(this.f67589e));
            Log.m105925i("MicroMsg.BackupCEngine", "send result[%d], seq[%d], buff[%d], mode[%d], type[%d], time[%d,%d]", Integer.valueOf(i), Integer.valueOf(this.f67588d), Integer.valueOf(Util.getLength(this.f67589e)), Integer.valueOf(C23575c.this.f67576a.get()), Integer.valueOf(this.f67590f), Long.valueOf(Util.milliSecondsToNow(this.f67591g)), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
        }
    }

    /* renamed from: zu0.c$d */
    public class C23579d implements Server.C55202a {
        public C23579d() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01e2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m28147c(zu0.C23575c r19, byte[] r20) {
        /*
            r1 = r19
            r19.getClass()
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r3 = r20
            r2.<init>(r3)
            r0.<init>(r2)
            r2 = 4
            byte[] r3 = new byte[r2]
            r0.read(r3)
            byte[] r4 = f67575i
            boolean r3 = java.util.Arrays.equals(r4, r3)
            if (r3 != 0) goto L_0x0021
            goto L_0x0239
        L_0x0021:
            int r3 = r0.readInt()
            short r5 = r0.readShort()
            short r11 = r0.readShort()
            int r6 = r0.readInt()
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.String r8 = "MicroMsg.BackupCEngine"
            r9 = 10007(0x2717, float:1.4023E-41)
            r12 = 1
            r13 = 0
            if (r6 <= r7) goto L_0x0055
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0[r13] = r2
            java.lang.String r2 = "loopRead size too large, size:%d"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            byte[] r0 = r0.getBytes()
            r1.mo37035d(r12, r3, r9, r0)
            goto L_0x0239
        L_0x0055:
            int r7 = r0.readInt()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r10[r13] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r10[r12] = r14
            java.lang.Short r14 = java.lang.Short.valueOf(r5)
            r15 = 2
            r10[r15] = r14
            java.lang.Short r14 = java.lang.Short.valueOf(r11)
            r16 = 3
            r10[r16] = r14
            java.lang.String r14 = "read buf size[%d], seq[%d], version[%d], type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r10)
            int r10 = r6 + -20
            byte[] r14 = new byte[r10]
            int r0 = r0.read(r14)
            if (r0 == r10) goto L_0x0088
            goto L_0x0239
        L_0x0088:
            if (r3 != 0) goto L_0x0091
            java.lang.String r0 = "error: seq not 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x0239
        L_0x0091:
            com.tencent.mm.pointers.PByteArray r8 = new com.tencent.mm.pointers.PByteArray
            r8.<init>()
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getLength((byte[]) r14)
            gv0.C20842c.m22878j1(r0)
            gv0.o r9 = gv0.C20842c.f58882p
            r17 = r3
            long r2 = (long) r0
            r18 = r14
            long r13 = r9.f58942d
            long r13 = r13 + r2
            r9.f58942d = r13
            int r0 = gv0.C20842c.f58880n
            java.lang.String r2 = "MicroMsg.BackupPacker"
            java.lang.String r3 = ""
            if (r5 == r12) goto L_0x00ce
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Short r4 = java.lang.Short.valueOf(r5)
            r5 = 0
            r0[r5] = r4
            java.lang.String r4 = "unpack failed, getVersion[%d]"
            java.lang.String r0 = java.lang.String.format(r4, r0)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            byte[] r0 = r0.getBytes()
            r8.value = r0
            r0 = -1
            r5 = -1
            goto L_0x01ca
        L_0x00ce:
            if (r0 != r12) goto L_0x01b8
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x012b }
            r0.<init>()     // Catch:{ IOException -> 0x012b }
            r0.write(r4)     // Catch:{ IOException -> 0x012b }
            byte[] r4 = p823sg.C90196p.m112888e(r17)     // Catch:{ IOException -> 0x012b }
            r0.write(r4)     // Catch:{ IOException -> 0x012b }
            byte[] r4 = new byte[r15]     // Catch:{ IOException -> 0x012b }
            int r9 = r5 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9     // Catch:{ IOException -> 0x012b }
            r13 = 0
            r4[r13] = r9     // Catch:{ IOException -> 0x012b }
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ IOException -> 0x012b }
            r4[r12] = r5     // Catch:{ IOException -> 0x012b }
            r0.write(r4)     // Catch:{ IOException -> 0x012b }
            byte[] r4 = new byte[r15]     // Catch:{ IOException -> 0x012b }
            int r5 = r11 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ IOException -> 0x012b }
            r9 = 0
            r4[r9] = r5     // Catch:{ IOException -> 0x012b }
            r5 = r11 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5     // Catch:{ IOException -> 0x012b }
            r4[r12] = r5     // Catch:{ IOException -> 0x012b }
            r0.write(r4)     // Catch:{ IOException -> 0x012b }
            byte[] r4 = p823sg.C90196p.m112888e(r6)     // Catch:{ IOException -> 0x012b }
            r0.write(r4)     // Catch:{ IOException -> 0x012b }
            r4 = 0
            byte[] r5 = p823sg.C90196p.m112888e(r4)     // Catch:{ IOException -> 0x012b }
            r0.write(r5)     // Catch:{ IOException -> 0x012b }
            r4 = r18
            r0.write(r4)     // Catch:{ IOException -> 0x0129 }
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x0129 }
            r5.<init>()     // Catch:{ IOException -> 0x0129 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0129 }
            r5.update(r0)     // Catch:{ IOException -> 0x0129 }
            long r13 = r5.getValue()     // Catch:{ IOException -> 0x0129 }
            int r0 = (int) r13
            goto L_0x0137
        L_0x0129:
            r0 = move-exception
            goto L_0x012e
        L_0x012b:
            r0 = move-exception
            r4 = r18
        L_0x012e:
            r5 = 0
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r5 = "BackupPacker getCheckSum error."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r9)
            r0 = 0
        L_0x0137:
            if (r7 == r0) goto L_0x01ba
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32
            r5.<init>()
            r5.update(r4)
            r9 = 100
            if (r10 <= r9) goto L_0x0148
            int r9 = r10 + -100
            goto L_0x0149
        L_0x0148:
            r9 = 0
        L_0x0149:
            r13 = r3
        L_0x014a:
            if (r9 >= r10) goto L_0x016b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            byte r13 = r4[r9]
            r13 = r13 & 255(0xff, float:3.57E-43)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r14.append(r13)
            java.lang.String r13 = " "
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            int r9 = r9 + 1
            goto L_0x014a
        L_0x016b:
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r9 = 0
            r4[r9] = r13
            java.lang.String r10 = "dumpErr errBuf:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r10, r4)
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r4[r15] = r0
            java.lang.Short r0 = java.lang.Short.valueOf(r11)
            r4[r16] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r6 = 4
            r4[r6] = r0
            r0 = 5
            long r5 = r5.getValue()
            int r6 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4[r0] = r5
            r0 = 6
            r4[r0] = r13
            java.lang.String r0 = "unpack failed, calcSum[%d], checkSum[%d], seq[%d], type[%d], size[%d], crc[%d], last 100 bytes:%s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            byte[] r0 = r0.getBytes()
            r8.value = r0
            r5 = -2
            goto L_0x01ca
        L_0x01b8:
            r4 = r18
        L_0x01ba:
            if (r11 == r12) goto L_0x01c6
            if (r11 != r15) goto L_0x01bf
            goto L_0x01c6
        L_0x01bf:
            byte[] r0 = yu0.C102910f.f303739h
            byte[] r14 = p823sg.C90194m.m112881b(r4, r0)
            goto L_0x01c7
        L_0x01c6:
            r14 = r4
        L_0x01c7:
            r8.value = r14
            r5 = 0
        L_0x01ca:
            if (r5 == 0) goto L_0x01e2
            byte[] r0 = r8.value
            if (r0 != 0) goto L_0x01d1
            goto L_0x01d6
        L_0x01d1:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L_0x01d6:
            byte[] r0 = r3.getBytes()
            r2 = r17
            r3 = 10007(0x2717, float:1.4023E-41)
            r1.mo37035d(r12, r2, r3, r0)
            goto L_0x0239
        L_0x01e2:
            r2 = r17
            zu0.c$c r0 = r1.f67583h
            if (r0 == 0) goto L_0x0233
            byte[] r1 = r8.value
            r3 = r0
            av0.b$o r3 = (av0.C16690b.C16705o) r3
        L_0x01ed:
            r7 = 0
            av0.b r6 = av0.C16690b.this
            boolean r0 = r6.f45139p
            java.lang.String r4 = "MicroMsg.BackupMoveRecoverServer"
            if (r0 != 0) goto L_0x021d
            java.util.concurrent.LinkedBlockingQueue r0 = r3.f45168a     // Catch:{ Exception -> 0x020c }
            av0.b$q r13 = new av0.b$q     // Catch:{ Exception -> 0x020c }
            r5 = r13
            r8 = r2
            r9 = r11
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x020c }
            r5 = 500(0x1f4, double:2.47E-321)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x020c }
            boolean r0 = r0.offer(r13, r5, r7)     // Catch:{ Exception -> 0x020c }
            if (r0 == 0) goto L_0x01ed
            goto L_0x021d
        L_0x020c:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.String r0 = r0.getMessage()
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = "startSendRequestSessionResponse onBackupMoveRecoverDatapushCallback e:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r5)
            goto L_0x01ed
        L_0x021d:
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.util.concurrent.LinkedBlockingQueue r1 = r3.f45168a
            int r1 = r1.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "startSendRequestSessionResponse offer datapushQueue, datapushQueue size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            goto L_0x0239
        L_0x0233:
            r6 = 0
            byte[] r0 = r8.value
            r1.mo37035d(r6, r2, r11, r0)
        L_0x0239:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C23575c.m28147c(zu0.c, byte[]):void");
    }

    /* renamed from: a */
    public void mo32548a(int i, byte[] bArr, int i2) {
        long nowMilliSecond = Util.nowMilliSecond();
        MMHandler mMHandler = this.f67582g;
        if (mMHandler == null || mMHandler.isQuit()) {
            this.f67582g = new MMHandler("BackupCEngine_sendHandler");
            Log.m105929w("MicroMsg.BackupCEngine", "BackupCEngine send seq:%d", Integer.valueOf(i));
        }
        this.f67582g.post(new C23578a(i, bArr, i2, nowMilliSecond));
    }

    /* renamed from: b */
    public int mo32549b(int i, byte[] bArr, int i2) {
        int i3;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f67576a.get() == 1) {
            i3 = Server.Java2C.send(this.f67577b, this.f67578c, bArr);
        } else if (this.f67576a.get() == 2) {
            i3 = Client.Java2C.send(this.f67577b, this.f67578c, bArr);
            C20842c.m22878j1(Util.getLength(bArr));
        } else {
            i3 = 0;
        }
        Log.m105925i("MicroMsg.BackupCEngine", "send result[%d], seq[%d], buff[%d], mode[%d], type[%d], time[%d]", Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(Util.getLength(bArr)), Integer.valueOf(this.f67576a.get()), Integer.valueOf(i2), Long.valueOf(Util.milliSecondsToNow(currentTimeMillis)));
        return i3;
    }

    /* renamed from: d */
    public final void mo37035d(boolean z, int i, int i2, byte[] bArr) {
        MMHandlerThread.postToMainThread(new C23576b(this, z, i, i2, bArr));
    }

    /* renamed from: e */
    public void mo37036e() {
        Log.m105925i("MicroMsg.BackupCEngine", "BackupCEngine stop. %s", Util.getStack().toString());
        MMHandler mMHandler = this.f67582g;
        if (mMHandler != null) {
            mMHandler.removeCallbacks((Runnable) null);
        }
        if (this.f67576a.get() == 1) {
            Server.Java2C.stop();
            C20842c.C20845d dVar = C20842c.f58886t;
            if (dVar != null) {
                dVar.mo17681a();
            }
            this.f67576a.set(0);
        } else if (this.f67576a.get() == 2) {
            Client.Java2C.disconnect();
            C20842c.C20845d dVar2 = C20842c.f58886t;
            if (dVar2 != null) {
                dVar2.mo17681a();
            }
            this.f67576a.set(0);
        }
    }
}
