package com.tencent.p014mm.plugin.appbrand.report;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.ipc.C81969o;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C86484b;
import f40.C86709a0;
import ii0.C87732a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ki0.C33909b;
import te3.j55;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport */
public class AppBrandIDKeyBatchReport {

    /* renamed from: a */
    public static final long f245520a = TimeUnit.SECONDS.toMillis(30);

    @C81969o
    /* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask */
    public static final class IDKeyBatchReportTask extends MainProcessTask {
        public static final Parcelable.Creator<IDKeyBatchReportTask> CREATOR = new C84095a();

        /* renamed from: f */
        public int f245521f;

        /* renamed from: g */
        public int f245522g;

        /* renamed from: h */
        public String f245523h;

        /* renamed from: i */
        public int f245524i;

        /* renamed from: j */
        public j55 f245525j;

        /* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask$a */
        public class C84095a implements Parcelable.Creator<IDKeyBatchReportTask> {
            public Object createFromParcel(Parcel parcel) {
                return new IDKeyBatchReportTask(parcel);
            }

            public Object[] newArray(int i) {
                return new IDKeyBatchReportTask[i];
            }
        }

        public IDKeyBatchReportTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f245521f = parcel.readInt();
            this.f245522g = parcel.readInt();
            this.f245523h = parcel.readString();
            this.f245524i = parcel.readInt();
            if (3 == this.f245521f) {
                try {
                    j55 j55 = new j55();
                    this.f245525j = j55;
                    j55.parseFrom(parcel.createByteArray());
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandIDKeyBatchReport", "parse WxaAppRecord from parcel, e = %s", e);
                    this.f245525j = null;
                }
            }
        }

        /* renamed from: j */
        public void mo1553j() {
            int i = this.f245521f;
            if (1 == i) {
                if (!Util.isNullOrNil(this.f245523h) && C86709a0.m107523b().f251765p) {
                    Pair<Boolean, Integer> jo = ((C33909b) C81161g2.Bx0(C33909b.class)).mo59361jo("appId", this.f245523h, 5, this.f245524i);
                    if (((Boolean) jo.first).booleanValue()) {
                        Log.m105925i("MicroMsg.AppBrandIDKeyBatchReport", "report blocked by appid(%s) scene(%d) ", this.f245523h, Integer.valueOf(this.f245524i));
                        C87732a.INSTANCE.mo122144a(((Integer) jo.second).intValue(), 167);
                        return;
                    }
                }
                C84097b.m103641a(0);
                C84097b.m103642b();
            } else if (2 == i) {
                C84097b.m103645e();
            } else if (3 == i) {
                j55 j55 = this.f245525j;
                ReentrantReadWriteLock reentrantReadWriteLock = C84097b.f245527a;
                if (j55 != null) {
                    ((C119157j) C119157j.f356862d).mo183876g(new C84118j(j55), "MicroMsg.AppBrandIDKeyBatchReport");
                }
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f245521f);
            parcel.writeInt(this.f245522g);
            parcel.writeString(this.f245523h);
            parcel.writeInt(this.f245524i);
            if (3 == this.f245521f) {
                try {
                    parcel.writeByteArray(this.f245525j.toByteArray());
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.AppBrandIDKeyBatchReport", "write WxaAppRecord to parcel, e = %s", e);
                }
            }
        }

        public IDKeyBatchReportTask(Parcel parcel) {
            mo1551g(parcel);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$a */
    public static final class C84096a {

        /* renamed from: a */
        public static final byte[] f245526a = new byte[0];
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$b */
    public static final class C84097b {

        /* renamed from: a */
        public static final ReentrantReadWriteLock f245527a = new ReentrantReadWriteLock();

        /* renamed from: b */
        public static volatile MTimerHandler f245528b = null;

        /* renamed from: c */
        public static volatile MTimerHandler f245529c = null;

        /* renamed from: d */
        public static volatile int f245530d;

        /* renamed from: a */
        public static void m103641a(int i) {
            long j;
            long j2;
            Log.m105925i("MicroMsg.AppBrandIDKeyBatchReport", "startTimeCount duration:%d", Integer.valueOf(i));
            if (i <= 0) {
                j2 = 1;
                j = AppBrandIDKeyBatchReport.f245520a;
            } else {
                j2 = (long) i;
                j = AppBrandIDKeyBatchReport.f245520a;
            }
            m103645e();
            f245528b = new MTimerHandler("MicroMsg.AppBrandIDKeyBatchReport", (MTimerHandler.CallBack) new C84114h(), true);
            f245528b.startTimer(j * j2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
            f245527a.readLock().unlock();
            m103644d();
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0157  */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m103642b() {
            /*
                java.lang.String r0 = "MicroMsg.AppBrandIDKeyBatchReport"
                java.lang.String r1 = "readReportData()"
                java.util.concurrent.locks.ReentrantReadWriteLock r2 = f245527a
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r2.readLock()
                r3.lock()
                r3 = 1
                r4 = 0
                r5 = 0
                com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.m103635a()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r6.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                boolean r7 = r6.mo119967g()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                if (r7 != 0) goto L_0x002c
                java.lang.String r6 = "reportFile not exist!"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r6)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r2.readLock()
                goto L_0x00b7
            L_0x002c:
                java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r2.<init>()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                long r6 = r6.mo119980r()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r8 = 0
            L_0x0036:
                java.lang.String r9 = com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.m103635a()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r10 = 4
                byte[] r9 = com.tencent.p014mm.vfs.C86013q1.m106433O(r9, r8, r10)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                if (r9 != 0) goto L_0x0048
                java.lang.String r2 = "preData is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                goto L_0x00b1
            L_0x0048:
                java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r10.<init>(r9)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                java.io.DataInputStream r9 = new java.io.DataInputStream     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r9.<init>(r10)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                int r9 = r9.readInt()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                java.lang.String r10 = com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.m103635a()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                int r11 = r8 + 4
                byte[] r10 = com.tencent.p014mm.vfs.C86013q1.m106433O(r10, r11, r9)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r10)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                if (r11 == 0) goto L_0x0067
                goto L_0x007d
            L_0x0067:
                te3.j55 r11 = new te3.j55     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r11.<init>()     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                pe3.a r10 = r11.parseFrom(r10)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                te3.j55 r10 = (te3.j55) r10     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                r2.add(r10)     // Catch:{ Exception -> 0x009d, OutOfMemoryError -> 0x008d }
                int r9 = r9 + 4
                int r8 = r8 + r9
                long r9 = (long) r8
                int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x0036
            L_0x007d:
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = f245527a
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
                r1.unlock()
                m103644d()
                goto L_0x00be
            L_0x008a:
                r0 = move-exception
                goto L_0x0184
            L_0x008d:
                r2 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x008a }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r1, r6)     // Catch:{ all -> 0x008a }
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = f245527a
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
                r1.unlock()
                goto L_0x00bd
            L_0x009d:
                r2 = move-exception
                java.lang.String r6 = "read file error %s"
                java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x008a }
                java.lang.String r8 = r2.getMessage()     // Catch:{ all -> 0x008a }
                r7[r5] = r8     // Catch:{ all -> 0x008a }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r7)     // Catch:{ all -> 0x008a }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x008a }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r1, r6)     // Catch:{ all -> 0x008a }
            L_0x00b1:
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = f245527a
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            L_0x00b7:
                r1.unlock()
                m103644d()
            L_0x00bd:
                r2 = r4
            L_0x00be:
                java.lang.Object[] r1 = new java.lang.Object[r3]
                if (r2 != 0) goto L_0x00c4
                r6 = -1
                goto L_0x00c8
            L_0x00c4:
                int r6 = r2.size()
            L_0x00c8:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r1[r5] = r6
                java.lang.String r6 = "reportToSvr, data.size=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r6, r1)
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
                if (r1 == 0) goto L_0x00dc
                r3 = 0
                goto L_0x0155
            L_0x00dc:
                ob0.c$b r1 = new ob0.c$b
                r1.<init>()
                te3.c55 r6 = new te3.c55
                r6.<init>()
                r1.f127066a = r6
                te3.d55 r6 = new te3.d55
                r6.<init>()
                r1.f127067b = r6
                java.lang.String r6 = "/cgi-bin/mmbiz-bin/wxausrevent/wxaappidkeybatchreport"
                r1.f127068c = r6
                r6 = 1009(0x3f1, float:1.414E-42)
                r1.f127069d = r6
                r1.f127070e = r5
                r1.f127071f = r5
                ob0.c r1 = r1.mo72403a()
                te3.wr3 r6 = new te3.wr3
                r6.<init>()
                java.lang.String r7 = android.os.Build.MANUFACTURER
                r6.f259934d = r7
                r7 = 2
                r6.f259935e = r7
                java.lang.String r7 = qe3.C89625d.f257837c
                r6.f259936f = r7
                java.lang.String r7 = qe3.C89625d.f257836b
                r6.f259937g = r7
                android.content.res.Resources r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r7 = r7.widthPixels
                r6.f259938h = r7
                android.content.res.Resources r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r7 = r7.heightPixels
                r6.f259939i = r7
                java.lang.String r7 = qe3.C89625d.f257839e
                r6.f259940j = r7
                java.lang.String r7 = p156gj.C87200o.f252873f
                r6.f259941n = r7
                android.content.res.Resources r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                android.content.res.Configuration r7 = r7.getConfiguration()
                java.util.Locale r7 = r7.locale
                java.lang.String r7 = r7.getLanguage()
                r6.f259942o = r7
                ob0.c$c r7 = r1.f127055a
                pe3.a r7 = r7.f127080a
                te3.c55 r7 = (te3.c55) r7
                r7.f259440e = r6
                r7.f259439d = r2
                com.tencent.mm.plugin.appbrand.report.i r6 = new com.tencent.mm.plugin.appbrand.report.i
                r6.<init>(r2)
                ob0.C89144l0.m111429e(r1, r6, r3)
            L_0x0155:
                if (r3 == 0) goto L_0x0183
                int r1 = f245530d
                if (r1 > 0) goto L_0x0160
                r1 = 5
                long r6 = com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.f245520a
                goto L_0x0165
            L_0x0160:
                int r1 = r1 + 5
                long r1 = (long) r1
                long r6 = com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.f245520a
            L_0x0165:
                long r6 = r6 * r1
                com.tencent.mm.sdk.platformtools.MTimerHandler r1 = f245529c
                if (r1 == 0) goto L_0x0172
                com.tencent.mm.sdk.platformtools.MTimerHandler r1 = f245529c
                r1.stopTimer()
                f245529c = r4
            L_0x0172:
                com.tencent.mm.sdk.platformtools.MTimerHandler r1 = new com.tencent.mm.sdk.platformtools.MTimerHandler
                com.tencent.mm.plugin.appbrand.report.g r2 = new com.tencent.mm.plugin.appbrand.report.g
                r2.<init>()
                r1.<init>((java.lang.String) r0, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r2, (boolean) r5)
                f245529c = r1
                com.tencent.mm.sdk.platformtools.MTimerHandler r0 = f245529c
                r0.startTimer(r6)
            L_0x0183:
                return
            L_0x0184:
                java.util.concurrent.locks.ReentrantReadWriteLock r1 = f245527a
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
                r1.unlock()
                m103644d()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.AppBrandIDKeyBatchReport.C84097b.m103642b():void");
        }

        /* renamed from: c */
        public static void m103643c(j55 j55) {
            ReentrantReadWriteLock.WriteLock writeLock;
            Log.m105925i("MicroMsg.AppBrandIDKeyBatchReport", "writeReportData type:%d", Integer.valueOf(j55.f259611d));
            ReentrantReadWriteLock reentrantReadWriteLock = f245527a;
            reentrantReadWriteLock.writeLock().lock();
            try {
                byte[] byteArray = j55.toByteArray();
                Uri n = C116299g2.m163858n(AppBrandIDKeyBatchReport.m103636b());
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0 f0Var = C116281f0.C116289i.f348994a;
                C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                    if (l2.mo177810a()) {
                        l2.f348991a.mo119937g(l2.f348992b);
                    }
                }
                C86009m1 m1Var = new C86009m1(AppBrandIDKeyBatchReport.m103635a());
                if (!m1Var.mo119967g()) {
                    m1Var.mo119964e();
                }
                int length = byteArray.length;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new DataOutputStream(byteArrayOutputStream).writeInt(length);
                C86013q1.m106440a(AppBrandIDKeyBatchReport.m103635a(), byteArrayOutputStream.toByteArray());
                C86013q1.m106440a(AppBrandIDKeyBatchReport.m103635a(), byteArray);
                writeLock = reentrantReadWriteLock.writeLock();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandIDKeyBatchReport", "appendToFile exception:%s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", e, "", new Object[0]);
                writeLock = f245527a.writeLock();
            } catch (Throwable th) {
                f245527a.writeLock().unlock();
                throw th;
            }
            writeLock.unlock();
        }

        /* renamed from: d */
        public static void m103644d() {
            f245527a.writeLock().lock();
            try {
                C86013q1.m106447h(AppBrandIDKeyBatchReport.m103635a());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandIDKeyBatchReport", e, "removeFile()", new Object[0]);
            }
            f245527a.writeLock().unlock();
        }

        /* renamed from: e */
        public static void m103645e() {
            if (f245528b != null) {
                f245528b.stopTimer();
                f245528b = null;
            }
        }
    }

    /* renamed from: a */
    public static String m103635a() {
        return m103636b() + "WxaAppRecord";
    }

    /* renamed from: b */
    public static String m103636b() {
        if (C86709a0.m107522a()) {
            String str = C86709a0.m107535s().f251807e;
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            String str2 = str + "appbrand/report/";
            FilePathGenerator.checkMkdir(str2);
            return str2;
        }
        throw new C86484b();
    }

    /* renamed from: c */
    public static void m103637c(String str, int i) {
        IDKeyBatchReportTask iDKeyBatchReportTask = new IDKeyBatchReportTask();
        iDKeyBatchReportTask.f245521f = 1;
        iDKeyBatchReportTask.f245523h = str;
        iDKeyBatchReportTask.f245524i = i;
        iDKeyBatchReportTask.mo114395c();
    }

    /* renamed from: d */
    public static void m103638d(j55 j55) {
        if (j55 != null) {
            if (MMApplicationContext.isMMProcess()) {
                ReentrantReadWriteLock reentrantReadWriteLock = C84097b.f245527a;
                ((C119157j) C119157j.f356862d).mo183876g(new C84118j(j55), "MicroMsg.AppBrandIDKeyBatchReport");
                return;
            }
            synchronized (C84096a.f245526a) {
                IDKeyBatchReportTask iDKeyBatchReportTask = new IDKeyBatchReportTask();
                iDKeyBatchReportTask.f245525j = j55;
                iDKeyBatchReportTask.f245521f = 3;
                iDKeyBatchReportTask.mo114395c();
            }
        }
    }
}
