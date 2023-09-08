package p375qh;

import android.media.AudioRecord;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import java.util.concurrent.Future;
import lu3.C88656g;
import p331dj.C20460b;
import zt3.C119157j;

/* renamed from: qh.h */
public class C22090h extends C110394i {

    /* renamed from: d */
    public boolean f62468d;

    /* renamed from: e */
    public int f62469e;

    /* renamed from: f */
    public int f62470f = 0;

    /* renamed from: g */
    public int f62471g = 12800;

    /* renamed from: h */
    public boolean f62472h = false;

    /* renamed from: i */
    public HandlerThread f62473i;

    /* renamed from: j */
    public MMHandler f62474j;

    /* renamed from: k */
    public AudioRecord f62475k;

    /* renamed from: l */
    public C22093c f62476l;

    /* renamed from: m */
    public C20460b f62477m;

    /* renamed from: n */
    public C89658b f62478n;

    /* renamed from: o */
    public final Object f62479o;

    /* renamed from: p */
    public final byte[] f62480p;

    /* renamed from: q */
    public final Object f62481q;

    /* renamed from: r */
    public Future<?> f62482r;

    /* renamed from: s */
    public boolean f62483s;

    /* renamed from: qh.h$a */
    public class C22091a implements C22094d {
        public C22091a() {
        }
    }

    /* renamed from: qh.h$b */
    public class C22092b implements Runnable {

        /* renamed from: d */
        public int f62485d;

        /* renamed from: e */
        public byte[] f62486e;

        public C22092b() {
            int i = C22090h.this.f62469e;
            this.f62485d = i;
            this.f62486e = new byte[(i * 2)];
        }

        public void run() {
            int i;
            int a;
            int b;
            C22090h.this.getClass();
            int i2 = 8;
            C22090h hVar = C22090h.this;
            synchronized (hVar.f62479o) {
                C20460b bVar = hVar.f62477m;
                i = bVar != null ? bVar.f57492a : -1;
            }
            int i3 = (int) (((double) i) * 0.8d);
            C22090h hVar2 = C22090h.this;
            int i4 = hVar2.f62469e;
            if (i3 < i4 * 8) {
                i3 = i4 * 8;
            }
            synchronized (hVar2.f62479o) {
                C20460b bVar2 = hVar2.f62477m;
                a = bVar2 != null ? bVar2.mo32009a() : -1;
            }
            if (a <= i3) {
                i2 = 1;
            }
            for (int i5 = 0; i5 < i2; i5++) {
                C22090h hVar3 = C22090h.this;
                byte[] bArr = this.f62486e;
                int i6 = this.f62485d;
                synchronized (hVar3.f62479o) {
                    C20460b bVar3 = hVar3.f62477m;
                    b = bVar3 != null ? bVar3.mo32010b(bArr, i6) : -1;
                }
                C89658b bVar4 = C22090h.this.f62478n;
                if (bVar4 != null && b == 0) {
                    bVar4.mo35508a(this.f62486e, this.f62485d);
                }
            }
        }
    }

    /* renamed from: qh.h$c */
    public final class C22093c implements C88656g {

        /* renamed from: d */
        public volatile C22094d f62488d;

        public C22093c() {
        }

        public String getKey() {
            return "RecordModeAsyncRead_record";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0089, code lost:
            r0 = new byte[r1.f62469e];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x008d, code lost:
            r1 = r11.f62489e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
            if (2 != r1.f62470f) goto L_0x01ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0093, code lost:
            r1 = r1.f62480p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r11.f62489e.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
            r1 = r11.f62489e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
            if (r1.f62475k != null) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a2, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.RecordModeAsyncRead", "mAudioRecord is null, so stop record.");
            r3 = r11.f62489e.f62481q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            r11.f62489e.f62470f = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
            if (r1.f62468d == false) goto L_0x00c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
            r0 = new byte[r1.f62469e];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
            r1.f330261c++;
            new p206nj.C76861g.C47263a();
            r1 = r11.f62489e;
            r1 = r1.f62475k.read(r0, 0, r1.f62469e);
            r3 = r11.f62489e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
            if (2 == r3.f62470f) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00db, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.RecordModeAsyncRead", "record mode has not been running and break");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e4, code lost:
            r3 = r3.f330259a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e6, code lost:
            if (r3 == null) goto L_0x00ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
            ((p375qh.C110390f.C110391a) r3).mo161910a(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f1, code lost:
            if (r11.f62489e.f62469e == r1) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.RecordModeAsyncRead", "read len " + r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
            if (r1 >= r11.f62489e.f62469e) goto L_0x011b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x010f, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.RecordModeAsyncRead", "read too fast? sleep 10 ms");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            java.lang.Thread.sleep(10);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                java.lang.String r0 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r1 = "RecordThread started. frameSize:%d"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                qh.h r4 = p375qh.C22090h.this
                int r4 = r4.f62469e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
                r0 = -123456789(0xfffffffff8a432eb, float:-2.6642794E34)
                qh.h r1 = p375qh.C22090h.this
                int r1 = r1.f330260b
                if (r0 == r1) goto L_0x0040
                java.lang.String r0 = "MicroMsg.RecordModeAsyncRead"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "set priority to "
                r1.append(r3)
                qh.h r3 = p375qh.C22090h.this
                int r3 = r3.f330260b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                qh.h r0 = p375qh.C22090h.this
                int r0 = r0.f330260b
                android.os.Process.setThreadPriority(r0)
            L_0x0040:
                qh.h r0 = p375qh.C22090h.this
                java.lang.Object r0 = r0.f62481q
                monitor-enter(r0)
                java.lang.String r1 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r3 = "RecordRunnable#run lock[%s] mStatusLock[%s]"
                r4 = 2
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x025b }
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x025b }
                long r7 = r7.getId()     // Catch:{ all -> 0x025b }
                java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x025b }
                r6[r5] = r7     // Catch:{ all -> 0x025b }
                qh.h r7 = p375qh.C22090h.this     // Catch:{ all -> 0x025b }
                java.lang.Object r7 = r7.f62481q     // Catch:{ all -> 0x025b }
                r6[r2] = r7     // Catch:{ all -> 0x025b }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r6)     // Catch:{ all -> 0x025b }
                qh.h r1 = p375qh.C22090h.this     // Catch:{ all -> 0x025b }
                int r3 = r1.f62470f     // Catch:{ all -> 0x025b }
                if (r2 == r3) goto L_0x0086
                java.lang.String r1 = "MicroMsg.RecordModeAsyncRead"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x025b }
                r2.<init>()     // Catch:{ all -> 0x025b }
                java.lang.String r3 = "status is not inited, now status: "
                r2.append(r3)     // Catch:{ all -> 0x025b }
                qh.h r3 = p375qh.C22090h.this     // Catch:{ all -> 0x025b }
                int r3 = r3.f62470f     // Catch:{ all -> 0x025b }
                r2.append(r3)     // Catch:{ all -> 0x025b }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x025b }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)     // Catch:{ all -> 0x025b }
                monitor-exit(r0)     // Catch:{ all -> 0x025b }
                return
            L_0x0086:
                r1.f62470f = r4     // Catch:{ all -> 0x025b }
                monitor-exit(r0)     // Catch:{ all -> 0x025b }
                int r0 = r1.f62469e
                byte[] r0 = new byte[r0]
            L_0x008d:
                qh.h r1 = p375qh.C22090h.this
                int r3 = r1.f62470f
                if (r4 != r3) goto L_0x01ed
                byte[] r1 = r1.f62480p
                monitor-enter(r1)
                qh.h r3 = p375qh.C22090h.this     // Catch:{ all -> 0x01ea }
                r3.getClass()     // Catch:{ all -> 0x01ea }
                monitor-exit(r1)     // Catch:{ all -> 0x01ea }
                qh.h r1 = p375qh.C22090h.this
                android.media.AudioRecord r3 = r1.f62475k
                if (r3 != 0) goto L_0x00b9
                java.lang.String r0 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r1 = "mAudioRecord is null, so stop record."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                qh.h r0 = p375qh.C22090h.this
                java.lang.Object r3 = r0.f62481q
                monitor-enter(r3)
                qh.h r0 = p375qh.C22090h.this     // Catch:{ all -> 0x00b6 }
                r1 = 3
                r0.f62470f = r1     // Catch:{ all -> 0x00b6 }
                monitor-exit(r3)     // Catch:{ all -> 0x00b6 }
                goto L_0x01ed
            L_0x00b6:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x00b6 }
                throw r0
            L_0x00b9:
                boolean r3 = r1.f62468d
                if (r3 == 0) goto L_0x00c1
                int r0 = r1.f62469e
                byte[] r0 = new byte[r0]
            L_0x00c1:
                int r3 = r1.f330261c
                int r3 = r3 + r2
                r1.f330261c = r3
                nj.g$a r1 = new nj.g$a
                r1.<init>()
                qh.h r1 = p375qh.C22090h.this
                android.media.AudioRecord r3 = r1.f62475k
                int r1 = r1.f62469e
                int r1 = r3.read(r0, r5, r1)
                qh.h r3 = p375qh.C22090h.this
                int r6 = r3.f62470f
                if (r4 == r6) goto L_0x00e4
                java.lang.String r0 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r1 = "record mode has not been running and break"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                goto L_0x01ed
            L_0x00e4:
                qh.i$a r3 = r3.f330259a
                if (r3 == 0) goto L_0x00ed
                qh.f$a r3 = (p375qh.C110390f.C110391a) r3
                r3.mo161910a(r1, r0)
            L_0x00ed:
                qh.h r3 = p375qh.C22090h.this
                int r3 = r3.f62469e
                if (r3 == r1) goto L_0x0109
                java.lang.String r3 = "MicroMsg.RecordModeAsyncRead"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "read len "
                r6.append(r7)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            L_0x0109:
                qh.h r3 = p375qh.C22090h.this
                int r3 = r3.f62469e
                if (r1 >= r3) goto L_0x011b
                java.lang.String r3 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r6 = "read too fast? sleep 10 ms"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
                r6 = 10
                java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x011b }
            L_0x011b:
                qh.h r3 = p375qh.C22090h.this
                qh.b r6 = r3.f62478n
                if (r6 == 0) goto L_0x008d
                if (r1 <= 0) goto L_0x008d
                int r7 = r0.length
                if (r1 <= r7) goto L_0x0127
                int r1 = r0.length
            L_0x0127:
                dj.b r7 = r3.f62477m
                if (r7 == 0) goto L_0x01cc
                boolean r3 = r3.f62472h
                if (r3 == 0) goto L_0x0132
                java.util.Arrays.fill(r0, r5, r1, r5)
            L_0x0132:
                qh.h r3 = p375qh.C22090h.this
                dj.b r3 = r3.f62477m
                r6 = -1
                if (r1 <= 0) goto L_0x01a8
                int r7 = r3.f57495d
                int r8 = r3.f57496e
                if (r7 != r8) goto L_0x0142
                int r9 = r3.f57492a
                goto L_0x015d
            L_0x0142:
                int r9 = r8 + 1
                int r10 = r3.f57492a
                int r9 = r9 % r10
                if (r9 != r7) goto L_0x014b
                r9 = 0
                goto L_0x015d
            L_0x014b:
                if (r7 >= r8) goto L_0x0152
                int r9 = r8 - r7
                r3.f57493b = r9
                goto L_0x0159
            L_0x0152:
                if (r7 <= r8) goto L_0x0159
                int r9 = r8 + r10
                int r9 = r9 - r7
                r3.f57493b = r9
            L_0x0159:
                int r9 = r3.f57493b
                int r9 = r10 - r9
            L_0x015d:
                if (r1 <= r9) goto L_0x0160
                goto L_0x01ab
            L_0x0160:
                int r9 = r8 + r1
                int r10 = r3.f57492a
                int r9 = r9 % r10
                if (r9 != r7) goto L_0x0168
                goto L_0x01ab
            L_0x0168:
                if (r7 >= r8) goto L_0x0199
                int r10 = r10 - r8
                if (r1 > r10) goto L_0x017b
                byte[] r6 = r3.f57494c
                java.lang.System.arraycopy(r0, r5, r6, r8, r1)
                int r6 = r3.f57496e
                int r6 = r6 + r1
                int r1 = r3.f57492a
                int r6 = r6 % r1
                r3.f57496e = r6
                goto L_0x01a6
            L_0x017b:
                byte[] r6 = r3.f57494c
                java.lang.System.arraycopy(r0, r5, r6, r8, r10)
                int r6 = r3.f57492a
                int r7 = r3.f57496e
                int r6 = r6 - r7
                byte[] r7 = r3.f57494c
                int r8 = r1 - r6
                java.lang.System.arraycopy(r0, r6, r7, r5, r8)
                int r6 = r3.f57492a
                int r7 = r3.f57496e
                int r7 = r6 - r7
                int r1 = r1 - r7
                r3.f57496e = r1
                int r1 = r1 % r6
                r3.f57496e = r1
                goto L_0x01a6
            L_0x0199:
                byte[] r6 = r3.f57494c
                java.lang.System.arraycopy(r0, r5, r6, r8, r1)
                int r6 = r3.f57496e
                int r6 = r6 + r1
                int r1 = r3.f57492a
                int r6 = r6 % r1
                r3.f57496e = r6
            L_0x01a6:
                r6 = 0
                goto L_0x01ab
            L_0x01a8:
                r3.getClass()
            L_0x01ab:
                if (r6 == 0) goto L_0x008d
                java.lang.String r1 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r3 = "WriteToBuffer Failed, ret:%d AudioBuffer length: %d"
                java.lang.Object[] r7 = new java.lang.Object[r4]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7[r5] = r6
                qh.h r6 = p375qh.C22090h.this
                dj.b r6 = r6.f62477m
                int r6 = r6.mo32009a()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7[r2] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r7)
                goto L_0x008d
            L_0x01cc:
                if (r6 == 0) goto L_0x008d
                boolean r3 = r3.f62472h
                if (r3 == 0) goto L_0x01d5
                java.util.Arrays.fill(r0, r5, r1, r5)
            L_0x01d5:
                qh.h r3 = p375qh.C22090h.this
                int r6 = r3.f62470f
                if (r4 == r6) goto L_0x01e3
                java.lang.String r0 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r1 = "record mode has not been running and break, do not callback "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                goto L_0x01ed
            L_0x01e3:
                qh.b r3 = r3.f62478n
                r3.mo35508a(r0, r1)
                goto L_0x008d
            L_0x01ea:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x01ea }
                throw r0
            L_0x01ed:
                qh.h$d r0 = r11.f62488d
                if (r0 == 0) goto L_0x0253
                qh.h$d r0 = r11.f62488d
                qh.h$a r0 = (p375qh.C22090h.C22091a) r0
                qh.h r1 = p375qh.C22090h.this
                qh.h$c r1 = r1.f62476l
                r2 = 0
                r1.f62488d = r2
                qh.h r1 = p375qh.C22090h.this
                com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f62474j
                if (r1 == 0) goto L_0x0210
                r1.removeCallbacksAndMessages(r2)
                qh.h r1 = p375qh.C22090h.this
                com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f62474j
                r1.quitSafely()
                qh.h r1 = p375qh.C22090h.this
                r1.f62474j = r2
            L_0x0210:
                qh.h r1 = p375qh.C22090h.this
                android.os.HandlerThread r1 = r1.f62473i
                if (r1 == 0) goto L_0x021d
                r1.quitSafely()
                qh.h r1 = p375qh.C22090h.this
                r1.f62473i = r2
            L_0x021d:
                java.lang.String r1 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r3 = "finish stopRecord"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                qh.h r1 = p375qh.C22090h.this
                dj.b r3 = r1.f62477m
                if (r3 == 0) goto L_0x0253
                java.util.concurrent.Future<?> r1 = r1.f62482r
                if (r1 == 0) goto L_0x0235
                r1.cancel(r5)
                qh.h r1 = p375qh.C22090h.this
                r1.f62482r = r2
            L_0x0235:
                qh.h r1 = p375qh.C22090h.this
                dj.b r3 = r1.f62477m
                r3.f57492a = r5
                r3.f57493b = r5
                r3.f57495d = r5
                r3.f57496e = r5
                r3.f57494c = r2
                java.lang.Object r1 = r1.f62479o
                monitor-enter(r1)
                qh.h r0 = p375qh.C22090h.this     // Catch:{ all -> 0x0250 }
                r0.f62477m = r2     // Catch:{ all -> 0x0250 }
                r0.f62478n = r2     // Catch:{ all -> 0x0250 }
                monitor-exit(r1)     // Catch:{ all -> 0x0250 }
                r0.f62477m = r2
                goto L_0x0253
            L_0x0250:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0250 }
                throw r0
            L_0x0253:
                java.lang.String r0 = "MicroMsg.RecordModeAsyncRead"
                java.lang.String r1 = "RecordThread exited."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                return
            L_0x025b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x025b }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p375qh.C22090h.C22093c.run():void");
        }
    }

    /* renamed from: qh.h$d */
    public interface C22094d {
    }

    public C22090h(AudioRecord audioRecord, boolean z, int i, C89658b bVar, boolean z2) {
        int i2 = C58834h.f168432b;
        this.f62473i = C97749e.m126093a("RecordModeAsyncRead_record", 5);
        this.f62476l = new C22093c();
        this.f62477m = null;
        this.f62479o = new Object();
        this.f62480p = new byte[0];
        this.f62481q = new Object();
        this.f62482r = null;
        this.f62475k = audioRecord;
        this.f62468d = z;
        this.f62469e = i;
        this.f62478n = bVar;
        this.f62483s = z2;
    }

    /* renamed from: a */
    public boolean mo35180a() {
        int i;
        boolean z;
        Log.m105924i("MicroMsg.RecordModeAsyncRead", JsApiStartRecordVoice.NAME);
        synchronized (this.f62481q) {
            this.f62470f = 1;
        }
        Log.m105925i("MicroMsg.RecordModeAsyncRead", "[startRecord] dumpRunningTask:%s", ((C119157j) C119157j.f356863e).mo183874e());
        this.f62473i.start();
        MMHandler mMHandler = new MMHandler(this.f62473i.getLooper());
        this.f62474j = mMHandler;
        mMHandler.post(this.f62476l);
        this.f62474j.setLogging(false);
        if (true == this.f62483s) {
            this.f62477m = new C20460b();
            this.f62471g = this.f62469e * 20;
            Log.m105924i("MicroMsg.RecordModeAsyncRead", "audioBuffer init mAudioBufferSize: " + this.f62471g);
            C20460b bVar = this.f62477m;
            int i2 = this.f62471g;
            bVar.getClass();
            if (i2 <= 0) {
                i = -1;
            } else {
                bVar.f57494c = new byte[i2];
                bVar.f57492a = i2;
                i = 0;
            }
            if (i != 0) {
                Log.m105920e("MicroMsg.RecordModeAsyncRead", "audioBuffer init failed, error code = " + i);
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                Log.m105920e("MicroMsg.RecordModeAsyncRead", "initAudioBuffer failed");
                return false;
            } else if (this.f62482r != null) {
                Log.m105920e("MicroMsg.RecordModeAsyncRead", "startRecord failed : last record is NOT stopped now");
                return false;
            } else {
                this.f62482r = ((C119157j) C119157j.f356862d).mo183873d(new C22092b(), 60, 20);
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo35181b() {
        Log.m105924i("MicroMsg.RecordModeAsyncRead", JsApiStopRecordVoice.NAME);
        synchronized (this.f62481q) {
            this.f62470f = 3;
            this.f62476l.f62488d = new C22091a();
        }
        synchronized (this.f62480p) {
            this.f62480p.notify();
        }
    }

    /* renamed from: c */
    public void mo35182c(boolean z) {
        this.f62472h = z;
    }
}
