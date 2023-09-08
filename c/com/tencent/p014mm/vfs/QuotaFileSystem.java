package com.tencent.p014mm.vfs;

import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.stubs.logger.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.QuotaFileSystem */
public class QuotaFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<QuotaFileSystem> CREATOR = new C116235a();

    /* renamed from: e */
    public final FileSystem f348800e;

    /* renamed from: f */
    public final long f348801f;

    /* renamed from: g */
    public final long f348802g;

    /* renamed from: h */
    public final long f348803h;

    /* renamed from: i */
    public final boolean f348804i;

    /* renamed from: j */
    public final C116330v f348805j;

    /* renamed from: com.tencent.mm.vfs.QuotaFileSystem$a */
    public class C116235a implements Parcelable.Creator<QuotaFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new QuotaFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new QuotaFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.QuotaFileSystem$b */
    public static final class C116236b {

        /* renamed from: a */
        public final C86001b0 f348806a;

        /* renamed from: b */
        public int f348807b = 0;

        public C116236b(C86001b0 b0Var) {
            this.f348806a = b0Var;
        }

        public String toString() {
            return "children: " + this.f348807b + " [" + this.f348806a + "]";
        }
    }

    /* renamed from: com.tencent.mm.vfs.QuotaFileSystem$c */
    public class C116237c extends C116309m implements Handler.Callback {

        /* renamed from: e */
        public final FileSystem.C85995c f348808e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348809f;

        /* renamed from: g */
        public final long f348810g;

        /* renamed from: h */
        public final long f348811h;

        /* renamed from: i */
        public final long f348812i;

        /* renamed from: j */
        public final boolean f348813j;

        /* renamed from: n */
        public final Object f348814n = new Object();

        /* renamed from: o */
        public HashMap<String, Long> f348815o;

        /* renamed from: p */
        public final Handler f348816p;

        public C116237c(FileSystem.C85995c cVar, long j, long j2, long j3, boolean z, Map<String, Object> map) {
            super(QuotaFileSystem.this, map);
            this.f348808e = cVar;
            this.f348809f = Collections.singletonList(cVar);
            this.f348810g = j;
            this.f348811h = j2;
            this.f348812i = j3;
            this.f348813j = z;
            if (z) {
                this.f348815o = new HashMap<>();
                this.f348816p = new Handler(C116281f0.C116289i.f348994a.f348971r.getLooper(), this);
                return;
            }
            this.f348815o = null;
            this.f348816p = null;
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348809f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348808e;
        }

        /* renamed from: N */
        public final void mo177722N(String str, boolean z) {
            boolean isEmpty;
            if (this.f348813j) {
                if (z) {
                    synchronized (this.f348814n) {
                        this.f348815o.remove(str);
                    }
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (this.f348814n) {
                    isEmpty = this.f348815o.isEmpty();
                    this.f348815o.put(str, Long.valueOf(currentTimeMillis));
                }
                if (isEmpty) {
                    this.f348816p.sendMessageDelayed(Message.obtain(), 60000);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:125:0x030f  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x0337  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119928a(android.os.CancellationSignal r22) {
            /*
                r21 = this;
                r1 = r21
                r2 = 3
                r3 = 6
                r4 = 1
                r5 = 0
                r8 = 0
                r10 = 2
                com.tencent.mm.vfs.FileSystem$c r0 = r1.f348808e     // Catch:{ Exception -> 0x0305 }
                int r0 = r0.mo119936f()     // Catch:{ Exception -> 0x0305 }
                r11 = r0 & 1
                if (r11 != 0) goto L_0x002d
                java.lang.String r0 = "VFS.QuotaFileSystem"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0305 }
                r11.<init>()     // Catch:{ Exception -> 0x0305 }
                java.lang.String r12 = "No quota operation can be done on read-only file system: "
                r11.append(r12)     // Catch:{ Exception -> 0x0305 }
                com.tencent.mm.vfs.FileSystem$c r12 = r1.f348808e     // Catch:{ Exception -> 0x0305 }
                r11.append(r12)     // Catch:{ Exception -> 0x0305 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0305 }
                com.tencent.stubs.logger.Log.m106513w(r0, r11)     // Catch:{ Exception -> 0x0305 }
                goto L_0x02fa
            L_0x002d:
                r11 = r0 & 4
                if (r11 != 0) goto L_0x004b
                java.lang.String r0 = "VFS.QuotaFileSystem"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0305 }
                r11.<init>()     // Catch:{ Exception -> 0x0305 }
                java.lang.String r12 = "No quota operation can be done on non-listable file system: "
                r11.append(r12)     // Catch:{ Exception -> 0x0305 }
                com.tencent.mm.vfs.FileSystem$c r12 = r1.f348808e     // Catch:{ Exception -> 0x0305 }
                r11.append(r12)     // Catch:{ Exception -> 0x0305 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0305 }
                com.tencent.stubs.logger.Log.m106513w(r0, r11)     // Catch:{ Exception -> 0x0305 }
                goto L_0x02fa
            L_0x004b:
                r22.throwIfCanceled()     // Catch:{ Exception -> 0x0305 }
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0305 }
                java.lang.String r12 = "destination"
                r11[r8] = r12     // Catch:{ Exception -> 0x0305 }
                com.tencent.mm.vfs.FileSystem$c r12 = r1.f348808e     // Catch:{ Exception -> 0x0305 }
                r11[r4] = r12     // Catch:{ Exception -> 0x0305 }
                r1.mo177781F(r4, r11)     // Catch:{ Exception -> 0x0305 }
                boolean r11 = r1.f348813j     // Catch:{ Exception -> 0x0305 }
                if (r11 == 0) goto L_0x00a8
                java.lang.Object r11 = r1.f348814n     // Catch:{ Exception -> 0x0305 }
                monitor-enter(r11)     // Catch:{ Exception -> 0x0305 }
                java.util.HashMap<java.lang.String, java.lang.Long> r13 = r1.f348815o     // Catch:{ all -> 0x00a5 }
                boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x00a5 }
                if (r13 != 0) goto L_0x0074
                java.util.HashMap<java.lang.String, java.lang.Long> r13 = r1.f348815o     // Catch:{ all -> 0x00a5 }
                java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x00a5 }
                r14.<init>()     // Catch:{ all -> 0x00a5 }
                r1.f348815o = r14     // Catch:{ all -> 0x00a5 }
                goto L_0x0075
            L_0x0074:
                r13 = 0
            L_0x0075:
                monitor-exit(r11)     // Catch:{ all -> 0x00a5 }
                if (r13 == 0) goto L_0x00a8
                java.util.Set r11 = r13.entrySet()     // Catch:{ Exception -> 0x0305 }
                java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0305 }
            L_0x0080:
                boolean r13 = r11.hasNext()     // Catch:{ Exception -> 0x0305 }
                if (r13 == 0) goto L_0x00a8
                java.lang.Object r13 = r11.next()     // Catch:{ Exception -> 0x0305 }
                java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ Exception -> 0x0305 }
                r22.throwIfCanceled()     // Catch:{ Exception -> 0x0305 }
                com.tencent.mm.vfs.FileSystem$c r14 = r1.f348808e     // Catch:{ Exception -> 0x0305 }
                java.lang.Object r15 = r13.getKey()     // Catch:{ Exception -> 0x0305 }
                java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0305 }
                java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x0305 }
                java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x0305 }
                long r12 = r13.longValue()     // Catch:{ Exception -> 0x0305 }
                r14.mo119935e(r15, r12)     // Catch:{ Exception -> 0x0305 }
                goto L_0x0080
            L_0x00a5:
                r0 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00a5 }
                throw r0     // Catch:{ Exception -> 0x0305 }
            L_0x00a8:
                r22.throwIfCanceled()     // Catch:{ Exception -> 0x0305 }
                java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ Exception -> 0x0305 }
                r11.<init>()     // Catch:{ Exception -> 0x0305 }
                com.tencent.mm.vfs.FileSystem$c r12 = r1.f348808e     // Catch:{ Exception -> 0x0305 }
                java.lang.String r13 = ""
                java.lang.Iterable r12 = com.tencent.p014mm.vfs.C116299g2.m163859o(r12, r13)     // Catch:{ Exception -> 0x0305 }
                if (r12 != 0) goto L_0x00d9
                java.lang.String r0 = "VFS.QuotaFileSystem"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0305 }
                r11.<init>()     // Catch:{ Exception -> 0x0305 }
                java.lang.String r12 = "Unable to list files in FS: "
                r11.append(r12)     // Catch:{ Exception -> 0x0305 }
                java.lang.String r12 = r21.toString()     // Catch:{ Exception -> 0x0305 }
                r11.append(r12)     // Catch:{ Exception -> 0x0305 }
                java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0305 }
                com.tencent.stubs.logger.Log.m106497e(r0, r11)     // Catch:{ Exception -> 0x0305 }
                goto L_0x02fa
            L_0x00d6:
                r9 = r5
                goto L_0x0308
            L_0x00d9:
                qp3.a r12 = (qp3.C118196a) r12     // Catch:{ Exception -> 0x0305 }
                java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x0305 }
                r13 = r5
                r15 = 0
                r16 = 0
            L_0x00e3:
                r17 = r12
                qp3.b r17 = (qp3.C118197b) r17     // Catch:{ Exception -> 0x0300 }
                boolean r18 = r17.hasNext()     // Catch:{ Exception -> 0x0300 }
                if (r18 == 0) goto L_0x010f
                java.lang.Object r17 = r17.next()     // Catch:{ Exception -> 0x0300 }
                r7 = r17
                com.tencent.mm.vfs.b0 r7 = (com.tencent.p014mm.vfs.C86001b0) r7     // Catch:{ Exception -> 0x0300 }
                r22.throwIfCanceled()     // Catch:{ Exception -> 0x0300 }
                long r9 = r7.f250474d     // Catch:{ Exception -> 0x0300 }
                int r19 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r19 >= 0) goto L_0x0100
                long r9 = r7.f250473c     // Catch:{ Exception -> 0x0300 }
            L_0x0100:
                long r13 = r13 + r9
                boolean r9 = r7.f250476f     // Catch:{ Exception -> 0x0300 }
                if (r9 == 0) goto L_0x0108
                int r16 = r16 + 1
                goto L_0x010a
            L_0x0108:
                int r15 = r15 + 1
            L_0x010a:
                r11.add(r7)     // Catch:{ Exception -> 0x0300 }
                r10 = 2
                goto L_0x00e3
            L_0x010f:
                java.lang.String r7 = "VFS.QuotaFileSystem"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0300 }
                r9.<init>()     // Catch:{ Exception -> 0x0300 }
                java.lang.String r10 = "Total size: "
                r9.append(r10)     // Catch:{ Exception -> 0x0300 }
                r9.append(r13)     // Catch:{ Exception -> 0x0300 }
                java.lang.String r10 = ", Cleaning threshold: "
                r9.append(r10)     // Catch:{ Exception -> 0x0300 }
                long r5 = r1.f348811h     // Catch:{ Exception -> 0x0300 }
                r9.append(r5)     // Catch:{ Exception -> 0x0300 }
                java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x0300 }
                com.tencent.stubs.logger.Log.m106505i(r7, r5)     // Catch:{ Exception -> 0x0300 }
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0300 }
                java.lang.String r6 = "fileCount"
                r5[r8] = r6     // Catch:{ Exception -> 0x0300 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0300 }
                r5[r4] = r6     // Catch:{ Exception -> 0x0300 }
                java.lang.String r6 = "dirCount"
                r7 = 2
                r5[r7] = r6     // Catch:{ Exception -> 0x0300 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0300 }
                r5[r2] = r6     // Catch:{ Exception -> 0x0300 }
                java.lang.String r6 = "totalSize"
                r7 = 4
                r5[r7] = r6     // Catch:{ Exception -> 0x0300 }
                java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0300 }
                r7 = 5
                r5[r7] = r6     // Catch:{ Exception -> 0x0300 }
                r6 = 2
                r1.mo177781F(r6, r5)     // Catch:{ Exception -> 0x0300 }
                long r5 = r1.f348811h     // Catch:{ Exception -> 0x0300 }
                int r7 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r7 > 0) goto L_0x018b
                java.lang.String r0 = "VFS.QuotaFileSystem"
                java.lang.String r5 = "Threshold not reached, skip cleaning."
                com.tencent.stubs.logger.Log.m106505i(r0, r5)     // Catch:{ Exception -> 0x0300 }
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0300 }
                java.lang.String r5 = "fileCount"
                r0[r8] = r5     // Catch:{ Exception -> 0x0300 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0300 }
                r0[r4] = r5     // Catch:{ Exception -> 0x0300 }
                java.lang.String r5 = "dirCount"
                r6 = 2
                r0[r6] = r5     // Catch:{ Exception -> 0x0300 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x0300 }
                r0[r2] = r5     // Catch:{ Exception -> 0x0300 }
                java.lang.String r5 = "totalSize"
                r6 = 4
                r0[r6] = r5     // Catch:{ Exception -> 0x0300 }
                java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0300 }
                r6 = 5
                r0[r6] = r5     // Catch:{ Exception -> 0x0300 }
                r1.mo177781F(r3, r0)     // Catch:{ Exception -> 0x0300 }
                goto L_0x02fa
            L_0x018b:
                r0 = r0 & 8
                if (r0 == 0) goto L_0x01dd
                java.util.HashMap r12 = new java.util.HashMap     // Catch:{ Exception -> 0x0300 }
                r12.<init>()     // Catch:{ Exception -> 0x0300 }
                java.util.Iterator r0 = r11.iterator()     // Catch:{ Exception -> 0x0300 }
            L_0x0198:
                boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x0300 }
                if (r5 == 0) goto L_0x01d9
                java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.b0 r5 = (com.tencent.p014mm.vfs.C86001b0) r5     // Catch:{ Exception -> 0x0300 }
                boolean r6 = r5.f250476f     // Catch:{ Exception -> 0x0300 }
                if (r6 == 0) goto L_0x01ba
                java.lang.String r6 = r5.f250471a     // Catch:{ Exception -> 0x0300 }
                boolean r6 = r12.containsKey(r6)     // Catch:{ Exception -> 0x0300 }
                if (r6 != 0) goto L_0x01ba
                java.lang.String r6 = r5.f250471a     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.QuotaFileSystem$b r7 = new com.tencent.mm.vfs.QuotaFileSystem$b     // Catch:{ Exception -> 0x0300 }
                r7.<init>(r5)     // Catch:{ Exception -> 0x0300 }
                r12.put(r6, r7)     // Catch:{ Exception -> 0x0300 }
            L_0x01ba:
                java.lang.String r6 = r5.f250471a     // Catch:{ Exception -> 0x0300 }
                java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163852h(r6)     // Catch:{ Exception -> 0x0300 }
                if (r6 != 0) goto L_0x01c3
                goto L_0x0198
            L_0x01c3:
                java.lang.Object r7 = r12.get(r6)     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.QuotaFileSystem$b r7 = (com.tencent.p014mm.vfs.QuotaFileSystem.C116236b) r7     // Catch:{ Exception -> 0x0300 }
                if (r7 != 0) goto L_0x01d3
                com.tencent.mm.vfs.QuotaFileSystem$b r7 = new com.tencent.mm.vfs.QuotaFileSystem$b     // Catch:{ Exception -> 0x0300 }
                r7.<init>(r5)     // Catch:{ Exception -> 0x0300 }
                r12.put(r6, r7)     // Catch:{ Exception -> 0x0300 }
            L_0x01d3:
                int r5 = r7.f348807b     // Catch:{ Exception -> 0x0300 }
                int r5 = r5 + r4
                r7.f348807b = r5     // Catch:{ Exception -> 0x0300 }
                goto L_0x0198
            L_0x01d9:
                r22.throwIfCanceled()     // Catch:{ Exception -> 0x0300 }
                goto L_0x01de
            L_0x01dd:
                r12 = 0
            L_0x01de:
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0300 }
                int r5 = r11.size()     // Catch:{ Exception -> 0x0300 }
                r0.<init>(r5)     // Catch:{ Exception -> 0x0300 }
                java.util.Iterator r5 = r11.iterator()     // Catch:{ Exception -> 0x0300 }
            L_0x01eb:
                boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0300 }
                if (r6 == 0) goto L_0x01ff
                java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.b0 r6 = (com.tencent.p014mm.vfs.C86001b0) r6     // Catch:{ Exception -> 0x0300 }
                boolean r7 = r6.f250476f     // Catch:{ Exception -> 0x0300 }
                if (r7 != 0) goto L_0x01eb
                r0.add(r6)     // Catch:{ Exception -> 0x0300 }
                goto L_0x01eb
            L_0x01ff:
                com.tencent.mm.vfs.s0 r5 = new com.tencent.mm.vfs.s0     // Catch:{ Exception -> 0x0300 }
                r5.<init>(r1)     // Catch:{ Exception -> 0x0300 }
                java.util.Collections.sort(r0, r5)     // Catch:{ Exception -> 0x0300 }
                int r5 = r0.size()     // Catch:{ Exception -> 0x0300 }
                int r5 = r5 - r4
            L_0x020c:
                long r6 = r1.f348810g     // Catch:{ Exception -> 0x0300 }
                int r9 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r9 <= 0) goto L_0x026f
                if (r5 < 0) goto L_0x026f
                r22.throwIfCanceled()     // Catch:{ Exception -> 0x0300 }
                int r6 = r5 + -1
                java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.b0 r5 = (com.tencent.p014mm.vfs.C86001b0) r5     // Catch:{ Exception -> 0x0300 }
                java.lang.String r7 = r5.f250471a     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.FileSystem$c r9 = r1.f348808e     // Catch:{ Exception -> 0x0300 }
                boolean r9 = r9.mo119933c(r7)     // Catch:{ Exception -> 0x0300 }
                if (r9 == 0) goto L_0x0236
                long r9 = r5.f250474d     // Catch:{ Exception -> 0x0300 }
                r19 = 0
                int r11 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
                if (r11 >= 0) goto L_0x0233
                long r9 = r5.f250473c     // Catch:{ Exception -> 0x0300 }
            L_0x0233:
                long r13 = r13 - r9
                int r15 = r15 + -1
            L_0x0236:
                if (r12 == 0) goto L_0x026d
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163852h(r7)     // Catch:{ Exception -> 0x0300 }
            L_0x023c:
                if (r5 == 0) goto L_0x026d
                java.lang.Object r7 = r12.get(r5)     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.QuotaFileSystem$b r7 = (com.tencent.p014mm.vfs.QuotaFileSystem.C116236b) r7     // Catch:{ Exception -> 0x0300 }
                if (r7 != 0) goto L_0x0247
                goto L_0x026d
            L_0x0247:
                int r9 = r7.f348807b     // Catch:{ Exception -> 0x0300 }
                int r9 = r9 - r4
                r7.f348807b = r9     // Catch:{ Exception -> 0x0300 }
                if (r9 != 0) goto L_0x026d
                com.tencent.mm.vfs.FileSystem$c r9 = r1.f348808e     // Catch:{ Exception -> 0x0300 }
                boolean r9 = r9.mo119942o(r5, r8)     // Catch:{ Exception -> 0x0300 }
                if (r9 == 0) goto L_0x026d
                com.tencent.mm.vfs.b0 r7 = r7.f348806a     // Catch:{ Exception -> 0x0300 }
                long r9 = r7.f250474d     // Catch:{ Exception -> 0x0300 }
                r19 = 0
                int r11 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
                if (r11 >= 0) goto L_0x0262
                long r9 = r7.f250473c     // Catch:{ Exception -> 0x0300 }
            L_0x0262:
                long r13 = r13 - r9
                int r16 = r16 + -1
                r12.remove(r5)     // Catch:{ Exception -> 0x0300 }
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163852h(r5)     // Catch:{ Exception -> 0x0300 }
                goto L_0x023c
            L_0x026d:
                r5 = r6
                goto L_0x020c
            L_0x026f:
                if (r12 == 0) goto L_0x02ab
                java.util.Collection r0 = r12.values()     // Catch:{ Exception -> 0x0300 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0300 }
            L_0x0279:
                boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x0300 }
                if (r5 == 0) goto L_0x02ab
                java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.QuotaFileSystem$b r5 = (com.tencent.p014mm.vfs.QuotaFileSystem.C116236b) r5     // Catch:{ Exception -> 0x0300 }
                int r6 = r5.f348807b     // Catch:{ Exception -> 0x0300 }
                if (r6 != 0) goto L_0x02a8
                r22.throwIfCanceled()     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.FileSystem$c r6 = r1.f348808e     // Catch:{ Exception -> 0x0300 }
                com.tencent.mm.vfs.b0 r7 = r5.f348806a     // Catch:{ Exception -> 0x0300 }
                java.lang.String r7 = r7.f250471a     // Catch:{ Exception -> 0x0300 }
                boolean r6 = r6.mo119942o(r7, r8)     // Catch:{ Exception -> 0x0300 }
                if (r6 == 0) goto L_0x02a8
                com.tencent.mm.vfs.b0 r5 = r5.f348806a     // Catch:{ Exception -> 0x0300 }
                long r6 = r5.f250474d     // Catch:{ Exception -> 0x0300 }
                r9 = 0
                int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r11 >= 0) goto L_0x02a4
                long r6 = r5.f250473c     // Catch:{ Exception -> 0x0300 }
            L_0x02a4:
                long r13 = r13 - r6
                int r16 = r16 + -1
                goto L_0x0279
            L_0x02a8:
                r9 = 0
                goto L_0x0279
            L_0x02ab:
                r5 = r13
                r7 = r16
                java.lang.String r0 = "VFS.QuotaFileSystem"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02fe }
                r9.<init>()     // Catch:{ Exception -> 0x02fe }
                java.lang.String r10 = "Maintenance done. files: "
                r9.append(r10)     // Catch:{ Exception -> 0x02fe }
                r9.append(r15)     // Catch:{ Exception -> 0x02fe }
                java.lang.String r10 = ", dirs: "
                r9.append(r10)     // Catch:{ Exception -> 0x02fe }
                r9.append(r7)     // Catch:{ Exception -> 0x02fe }
                java.lang.String r10 = ", totalSize: "
                r9.append(r10)     // Catch:{ Exception -> 0x02fe }
                r9.append(r5)     // Catch:{ Exception -> 0x02fe }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02fe }
                com.tencent.stubs.logger.Log.m106505i(r0, r9)     // Catch:{ Exception -> 0x02fe }
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x02fe }
                java.lang.String r9 = "fileCount"
                r0[r8] = r9     // Catch:{ Exception -> 0x02fe }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x02fe }
                r0[r4] = r9     // Catch:{ Exception -> 0x02fe }
                java.lang.String r9 = "dirCount"
                r10 = 2
                r0[r10] = r9     // Catch:{ Exception -> 0x02fe }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x02fe }
                r0[r2] = r9     // Catch:{ Exception -> 0x02fe }
                java.lang.String r9 = "totalSize"
                r10 = 4
                r0[r10] = r9     // Catch:{ Exception -> 0x02fe }
                java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x02fe }
                r10 = 5
                r0[r10] = r9     // Catch:{ Exception -> 0x02fe }
                r1.mo177781F(r2, r0)     // Catch:{ Exception -> 0x02fe }
            L_0x02fa:
                super.mo119928a(r22)
                return
            L_0x02fe:
                r0 = move-exception
                goto L_0x030b
            L_0x0300:
                r0 = move-exception
                r5 = r13
                r7 = r16
                goto L_0x030b
            L_0x0305:
                r0 = move-exception
                goto L_0x00d6
            L_0x0308:
                r5 = r9
                r7 = 0
                r15 = 0
            L_0x030b:
                boolean r9 = r0 instanceof android.os.OperationCanceledException
                if (r9 == 0) goto L_0x0337
                java.lang.String r9 = "VFS.QuotaFileSystem"
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "Maintenance cancelled. files: "
                r10.append(r11)
                r10.append(r15)
                java.lang.String r11 = ", dirs: "
                r10.append(r11)
                r10.append(r7)
                java.lang.String r11 = ", totalSize: "
                r10.append(r11)
                r10.append(r5)
                java.lang.String r10 = r10.toString()
                com.tencent.stubs.logger.Log.m106505i(r9, r10)
                r9 = 4
                goto L_0x033f
            L_0x0337:
                java.lang.String r9 = "VFS.QuotaFileSystem"
                java.lang.String r10 = "Maintenance failed."
                com.tencent.stubs.logger.Log.m106499e((java.lang.String) r9, (java.lang.Throwable) r0, (java.lang.String) r10)
                r9 = 5
            L_0x033f:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r10 = "fileCount"
                r3[r8] = r10
                java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
                r3[r4] = r8
                java.lang.String r4 = "dirCount"
                r8 = 2
                r3[r8] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                r3[r2] = r4
                java.lang.String r2 = "totalSize"
                r4 = 4
                r3[r4] = r2
                java.lang.Long r2 = java.lang.Long.valueOf(r5)
                r4 = 5
                r3[r4] = r2
                r1.mo177781F(r9, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.QuotaFileSystem.C116237c.mo119928a(android.os.CancellationSignal):void");
        }

        /* renamed from: b */
        public WritableByteChannel mo119932b(String str, boolean z) {
            WritableByteChannel b = this.f348808e.mo119932b(str, z);
            mo177722N(str, true);
            return b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116237c)) {
                return false;
            }
            C116237c cVar = (C116237c) obj;
            if (!this.f348808e.equals(cVar.f348808e)) {
                return false;
            }
            long j = this.f348810g;
            QuotaFileSystem quotaFileSystem = QuotaFileSystem.this;
            return j == quotaFileSystem.f348801f && this.f348811h == quotaFileSystem.f348802g && this.f348813j == quotaFileSystem.f348804i;
        }

        /* renamed from: h */
        public ReadableByteChannel mo119938h(String str) {
            ReadableByteChannel h = this.f348808e.mo119938h(str);
            mo177722N(str, false);
            return h;
        }

        public boolean handleMessage(Message message) {
            HashMap<String, Long> hashMap;
            synchronized (this.f348814n) {
                if (!this.f348815o.isEmpty()) {
                    hashMap = this.f348815o;
                    this.f348815o = new HashMap<>();
                } else {
                    hashMap = null;
                }
            }
            if (hashMap == null) {
                return true;
            }
            for (Map.Entry next : hashMap.entrySet()) {
                this.f348808e.mo119935e((String) next.getKey(), ((Long) next.getValue()).longValue());
            }
            Log.m106493d("VFS.QuotaFileSystem", "Flush access time cache entries: " + hashMap.size());
            return true;
        }

        public int hashCode() {
            int hashCode = C116237c.class.hashCode();
            Object[] objArr = {this.f348808e, Long.valueOf(this.f348810g), Long.valueOf(this.f348811h), Boolean.valueOf(this.f348813j)};
            Pattern pattern = C116299g2.f349012a;
            return hashCode ^ Arrays.deepHashCode(objArr);
        }

        /* renamed from: i */
        public ParcelFileDescriptor mo119939i(String str, String str2) {
            ParcelFileDescriptor i = this.f348808e.mo119939i(str, str2);
            mo177722N(str, str2.contains("w"));
            return i;
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            OutputStream m = this.f348808e.mo119941m(str, z);
            mo177722N(str, true);
            return m;
        }

        public InputStream openRead(String str) {
            InputStream openRead = this.f348808e.openRead(str);
            mo177722N(str, false);
            return openRead;
        }

        public String toString() {
            return "quota(" + C116299g2.m163850f(this.f348810g) + " / " + C116299g2.m163850f(this.f348811h) + ") <- " + this.f348808e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return QuotaFileSystem.this;
        }
    }

    public QuotaFileSystem(FileSystem fileSystem, long j, long j2, long j3, boolean z, String str) {
        C116330v vVar;
        this.f348800e = fileSystem;
        this.f348801f = j;
        this.f348802g = j2;
        this.f348803h = j3;
        this.f348804i = z;
        if (str == null) {
            vVar = null;
        } else {
            vVar = new C116330v(str);
        }
        this.f348805j = vVar;
        if (j2 < j) {
            throw new IllegalArgumentException("Cleaning threshold must not less than target size.");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof QuotaFileSystem)) {
            return false;
        }
        QuotaFileSystem quotaFileSystem = (QuotaFileSystem) obj;
        return this.f348800e.equals(quotaFileSystem.f348800e) && this.f348801f == quotaFileSystem.f348801f && this.f348802g == quotaFileSystem.f348802g && this.f348804i == quotaFileSystem.f348804i;
    }

    public int hashCode() {
        int hashCode = QuotaFileSystem.class.hashCode();
        Object[] objArr = {this.f348800e, Long.valueOf(this.f348801f), Long.valueOf(this.f348802g), Long.valueOf(this.f348803h), Boolean.valueOf(this.f348804i)};
        Pattern pattern = C116299g2.f349012a;
        return hashCode ^ Arrays.deepHashCode(objArr);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("quota(");
        C116330v vVar = this.f348805j;
        if (vVar == null) {
            str = C116299g2.m163850f(this.f348801f) + " / " + C116299g2.m163850f(this.f348802g);
        } else {
            str = vVar.toString();
        }
        sb.append(str);
        sb.append(") <- ");
        sb.append(this.f348800e);
        return sb.toString();
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        String[] strArr;
        long j = this.f348801f;
        long j2 = this.f348802g;
        long j3 = this.f348803h;
        boolean z = this.f348804i;
        C116330v vVar = this.f348805j;
        if (vVar != null) {
            String a = vVar.mo177821a(map);
            if (a == null) {
                Pattern pattern = C116299g2.f349012a;
                strArr = new String[0];
            } else {
                strArr = C116299g2.f349013b.split(a);
            }
            int length = strArr.length;
            if (length != 0) {
                if (length != 1) {
                    if (length != 2) {
                        if (length != 3) {
                            String str = strArr[3];
                            int i = this.f348804i;
                            if (str != null) {
                                try {
                                    i = Integer.parseInt(str);
                                } catch (NumberFormatException unused) {
                                }
                            }
                            z = i != 0;
                        }
                        j3 = C116299g2.m163857m(strArr[2], this.f348803h);
                    }
                    j2 = C116299g2.m163856l(strArr[1], this.f348802g);
                }
                j = C116299g2.m163856l(strArr[0], this.f348801f);
            }
        }
        return new C116237c((FileSystem.C85995c) this.f348800e.mo177578v(map), j, j2, j3, z, map);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, QuotaFileSystem.class, 3);
        parcel.writeParcelable(this.f348800e, i);
        parcel.writeLong(this.f348801f);
        parcel.writeLong(this.f348802g);
        parcel.writeLong(this.f348803h);
        parcel.writeByte(this.f348804i ? (byte) 1 : 0);
    }

    public QuotaFileSystem(Parcel parcel) {
        C116330v vVar;
        C116299g2.m163845a(parcel, QuotaFileSystem.class, 3);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348800e = fileSystem;
        if (fileSystem != null) {
            long readLong = parcel.readLong();
            this.f348801f = readLong;
            long readLong2 = parcel.readLong();
            this.f348802g = readLong2;
            this.f348803h = parcel.readLong();
            this.f348804i = parcel.readByte() != 0;
            String readString = parcel.readString();
            if (readString == null) {
                vVar = null;
            } else {
                vVar = new C116330v(readString);
            }
            this.f348805j = vVar;
            if (readLong2 < readLong) {
                throw new IllegalArgumentException("Cleaning threshold must not less than target size.");
            }
            return;
        }
        throw new IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
