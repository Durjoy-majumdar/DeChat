package com.tencent.p014mm.plugin.appbrand.performance;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84501c3;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84524e3;
import com.tencent.p014mm.plugin.appbrand.performance.C84001g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86493v0;
import js0.C88024r;
import p1039tb.C90388a;
import p224ra.C89909e;
import p963fc.C86812g;
import wi0.C38158d;

/* renamed from: com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager */
public class AppBrandPerformanceManager {

    /* renamed from: a */
    public static final SparseArray<C83989b> f245206a = new SparseArray<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask */
    public static class SetAppPerformanceModeTask extends MainProcessTask {
        public static final Parcelable.Creator<SetAppPerformanceModeTask> CREATOR = new C83987a();

        /* renamed from: f */
        public String f245207f;

        /* renamed from: g */
        public boolean f245208g;

        /* renamed from: com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask$a */
        public class C83987a implements Parcelable.Creator<SetAppPerformanceModeTask> {
            public Object createFromParcel(Parcel parcel) {
                SetAppPerformanceModeTask setAppPerformanceModeTask = new SetAppPerformanceModeTask((C83988a) null);
                setAppPerformanceModeTask.mo1551g(parcel);
                return setAppPerformanceModeTask;
            }

            public Object[] newArray(int i) {
                return new SetAppPerformanceModeTask[i];
            }
        }

        public SetAppPerformanceModeTask() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f245207f = parcel.readString();
            this.f245208g = parcel.readByte() != 0;
        }

        /* renamed from: j */
        public void mo1553j() {
            C38158d h1 = ((C90388a) C89909e.m112436a(C90388a.class)).mo56838h1();
            h1.mo61552B9(this.f245207f + "_PerformancePanelEnabled", this.f245208g ? "1" : "0");
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f245207f);
            parcel.writeByte(this.f245208g ? (byte) 1 : 0);
        }

        public SetAppPerformanceModeTask(C83988a aVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$b */
    public static class C83989b implements Runnable {

        /* renamed from: d */
        public final C86812g f245209d;

        /* renamed from: e */
        public final String f245210e;

        /* renamed from: f */
        public volatile double f245211f = 0.0d;

        /* renamed from: g */
        public volatile int f245212g = 4;

        /* renamed from: h */
        public volatile boolean f245213h = true;

        /* renamed from: i */
        public volatile boolean f245214i = false;

        /* renamed from: j */
        public volatile boolean f245215j = false;

        /* renamed from: n */
        public C84000f f245216n;

        /* renamed from: o */
        public C84001g f245217o;

        /* renamed from: p */
        public C83231l.C83234d f245218p = new C83991b();

        /* renamed from: com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$b$a */
        public class C83990a implements C84001g.C84002a {
            public C83990a() {
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$b$b */
        public class C83991b extends C83231l.C83234d {
            public C83991b() {
            }

            /* renamed from: c */
            public void mo109497c() {
                C83989b.this.mo116637h();
            }

            /* renamed from: e */
            public void mo74049e(C83231l.C83235e eVar) {
                C83989b bVar = C83989b.this;
                bVar.f245214i = true;
                C84001g gVar = bVar.f245217o;
                if (gVar != null) {
                    gVar.mo116645b();
                }
            }

            /* renamed from: f */
            public void mo109498f() {
                C83989b bVar = C83989b.this;
                bVar.f245214i = false;
                C84001g gVar = bVar.f245217o;
                if (gVar != null) {
                    gVar.mo116644a();
                }
            }
        }

        public C83989b(C86812g gVar) {
            this.f245209d = gVar;
            this.f245210e = gVar.f238147j;
            this.f245216n = new C84000f(Process.myPid());
            this.f245215j = false;
        }

        /* renamed from: a */
        public void mo116630a() {
        }

        /* renamed from: b */
        public void mo116631b() {
        }

        /* renamed from: c */
        public void mo116632c() {
        }

        /* renamed from: d */
        public void mo116633d() {
        }

        /* renamed from: e */
        public void mo116634e() {
        }

        /* renamed from: f */
        public void mo116635f() {
            int selfMemInMB = Util.getSelfMemInMB(MMApplicationContext.getContext());
            C86812g gVar = this.f245209d;
            AppBrandPerformanceManager.m103496e(gVar, 102, selfMemInMB + "m");
            C83997d.m103519b(this.f245210e, "Hardware", "MEMORY", (double) selfMemInMB);
        }

        /* renamed from: g */
        public void mo116636g() {
            if (!this.f245215j) {
                C83990a aVar = new C83990a();
                C84001g gVar = new C84001g();
                this.f245217o = gVar;
                gVar.f245251g = 100;
                gVar.f245253i = aVar;
            }
            this.f245213h = true;
            C88024r.m109571a().postToWorker(this);
            C83231l.m102140a(this.f245210e, this.f245218p);
            C84001g gVar2 = this.f245217o;
            if (gVar2 != null) {
                gVar2.mo116644a();
            }
        }

        /* renamed from: h */
        public void mo116637h() {
            this.f245213h = false;
            C83231l.m102144e(this.f245210e, this.f245218p);
            C84001g gVar = this.f245217o;
            if (gVar != null) {
                gVar.mo116645b();
            }
            C84000f fVar = this.f245216n;
            if (fVar != null) {
                fVar.close();
            }
        }

        public void run() {
            if (!this.f245209d.mo113064k0()) {
                if (this.f245213h && !this.f245214i) {
                    double b = this.f245216n.mo116642b();
                    AppBrandPerformanceManager.m103496e(this.f245209d, 101, ((int) b) + "%");
                    C83997d.m103519b(this.f245210e, "Hardware", "CPU", b);
                    mo116635f();
                    mo116634e();
                    mo116631b();
                    mo116630a();
                    mo116633d();
                    mo116632c();
                    this.f245212g++;
                    if (this.f245212g >= 4) {
                        this.f245212g = 0;
                        AppBrandSysConfigLU o1 = this.f245209d.mo113051d0();
                        if (o1 != null) {
                            if (o1.f261073s == 1) {
                                GetStorageSizeTask getStorageSizeTask = new GetStorageSizeTask();
                                getStorageSizeTask.f242656f = this.f245210e;
                                getStorageSizeTask.f242658h = new C83993b(this, getStorageSizeTask);
                                getStorageSizeTask.mo114395c();
                            } else {
                                AppBrandPerformanceManager.m103496e(this.f245209d, 401, Util.getSizeKB((long) ((C90388a) C89909e.m112436a(C90388a.class)).mo56837dI(this.f245210e, o1.f261073s, o1.f261075u).mo56589Bk(this.f245210e)));
                            }
                        }
                    }
                }
                if (this.f245213h) {
                    C88024r.m109571a().mo122468a(this, 1000);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m103492a(String str) {
        Log.m105919d("MicroMsg.AppBrandPerformanceManager", "disablePanel for AppId %s", str);
        SetAppPerformanceModeTask setAppPerformanceModeTask = new SetAppPerformanceModeTask((C83988a) null);
        setAppPerformanceModeTask.f245207f = str;
        setAppPerformanceModeTask.f245208g = false;
        setAppPerformanceModeTask.mo114395c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (p206nj.C88955f.m111058b() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandPerformanceTracer", "dumpToFile error, SDCard is unavailable.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6 = new com.tencent.p014mm.vfs.C86009m1(android.os.Environment.getExternalStorageDirectory().getAbsolutePath() + "/tencent/MicroMsg/appbrand/trace/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        if (r6.mo119967g() != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        r6.mo119987x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r11 = new com.tencent.p014mm.vfs.C45115u1(new com.tencent.p014mm.vfs.C86009m1(r6, java.lang.String.format("trace_%s_%d", new java.lang.Object[]{r11, java.lang.Long.valueOf(com.tencent.p014mm.plugin.appbrand.performance.C83997d.f245230a)})), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r11.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.AppBrandPerformanceTracer", "dump file error: " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        if (r2 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00eb, code lost:
        r0 = r11;
        r11 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ed, code lost:
        if (r11 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6 A[SYNTHETIC, Splitter:B:46:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ef A[SYNTHETIC, Splitter:B:52:0x00ef] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m103493b(p963fc.C86812g r11) {
        /*
            boolean r0 = m103497f(r11)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r11 = r11.f238147j
            java.util.List<com.tencent.mm.plugin.appbrand.performance.d$a> r0 = com.tencent.p014mm.plugin.appbrand.performance.C83997d.f245231b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List<com.tencent.mm.plugin.appbrand.performance.d$a> r2 = com.tencent.p014mm.plugin.appbrand.performance.C83997d.f245231b
            monitor-enter(r2)
            int r3 = r2.size()     // Catch:{ all -> 0x00f3 }
            r4 = 1
            if (r3 != 0) goto L_0x001e
            monitor-exit(r2)     // Catch:{ all -> 0x00f3 }
            goto L_0x00ea
        L_0x001e:
            java.lang.String r3 = "MicroMsg.AppBrandPerformanceTracer"
            java.lang.String r5 = "dumpTrace events size: %d"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00f3 }
            int r7 = r2.size()     // Catch:{ all -> 0x00f3 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00f3 }
            r6[r1] = r7     // Catch:{ all -> 0x00f3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r5, r6)     // Catch:{ all -> 0x00f3 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x00f3 }
        L_0x0035:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00f3 }
            if (r5 == 0) goto L_0x0060
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00f3 }
            com.tencent.mm.plugin.appbrand.performance.d$a r5 = (com.tencent.p014mm.plugin.appbrand.performance.C83997d.C83998a) r5     // Catch:{ all -> 0x00f3 }
            java.lang.String r6 = r5.f245232a     // Catch:{ all -> 0x00f3 }
            boolean r6 = r6.equals(r11)     // Catch:{ all -> 0x00f3 }
            if (r6 != 0) goto L_0x004a
            goto L_0x0035
        L_0x004a:
            long r6 = r5.f245236e     // Catch:{ all -> 0x00f3 }
            long r8 = com.tencent.p014mm.plugin.appbrand.performance.C83997d.f245230a     // Catch:{ all -> 0x00f3 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0053
            goto L_0x0035
        L_0x0053:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f3 }
            r0.append(r5)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = "\n"
            r0.append(r5)     // Catch:{ all -> 0x00f3 }
            goto L_0x0035
        L_0x0060:
            java.util.List<com.tencent.mm.plugin.appbrand.performance.d$a> r3 = com.tencent.p014mm.plugin.appbrand.performance.C83997d.f245231b     // Catch:{ all -> 0x00f3 }
            r3.clear()     // Catch:{ all -> 0x00f3 }
            monitor-exit(r2)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r0.toString()
            boolean r2 = p206nj.C88955f.m111058b()
            java.lang.String r3 = "MicroMsg.AppBrandPerformanceTracer"
            if (r2 != 0) goto L_0x0079
            java.lang.String r11 = "dumpToFile error, SDCard is unavailable."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)
            goto L_0x00e9
        L_0x0079:
            r2 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ce }
            r5.<init>()     // Catch:{ Exception -> 0x00ce }
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00ce }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x00ce }
            r5.append(r6)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r6 = "/tencent/MicroMsg/appbrand/trace/"
            r5.append(r6)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00ce }
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00ce }
            r6.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x00ce }
            boolean r5 = r6.mo119967g()     // Catch:{ Exception -> 0x00ce }
            if (r5 != 0) goto L_0x00a1
            r6.mo119987x()     // Catch:{ Exception -> 0x00ce }
        L_0x00a1:
            java.lang.String r5 = "trace_%s_%d"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00ce }
            r7[r1] = r11     // Catch:{ Exception -> 0x00ce }
            long r8 = com.tencent.p014mm.plugin.appbrand.performance.C83997d.f245230a     // Catch:{ Exception -> 0x00ce }
            java.lang.Long r11 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x00ce }
            r7[r4] = r11     // Catch:{ Exception -> 0x00ce }
            java.lang.String r11 = java.lang.String.format(r5, r7)     // Catch:{ Exception -> 0x00ce }
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00ce }
            r5.<init>((com.tencent.p014mm.vfs.C86009m1) r6, (java.lang.String) r11)     // Catch:{ Exception -> 0x00ce }
            com.tencent.mm.vfs.u1 r11 = new com.tencent.mm.vfs.u1     // Catch:{ Exception -> 0x00ce }
            r11.<init>((com.tencent.p014mm.vfs.C86009m1) r5, (boolean) r4)     // Catch:{ Exception -> 0x00ce }
            r11.write(r0)     // Catch:{ Exception -> 0x00c9, all -> 0x00c7 }
            r11.close()     // Catch:{ Exception -> 0x00c5 }
        L_0x00c5:
            r1 = 1
            goto L_0x00e9
        L_0x00c7:
            r0 = move-exception
            goto L_0x00ed
        L_0x00c9:
            r0 = move-exception
            r2 = r11
            goto L_0x00d0
        L_0x00cc:
            r11 = move-exception
            goto L_0x00eb
        L_0x00ce:
            r11 = move-exception
            r0 = r11
        L_0x00d0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r11.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = "dump file error: "
            r11.append(r4)     // Catch:{ all -> 0x00cc }
            r11.append(r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00cc }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r11)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00e9
            r2.close()     // Catch:{ Exception -> 0x00e9 }
        L_0x00e9:
            r4 = r1
        L_0x00ea:
            return r4
        L_0x00eb:
            r0 = r11
            r11 = r2
        L_0x00ed:
            if (r11 == 0) goto L_0x00f2
            r11.close()     // Catch:{ Exception -> 0x00f2 }
        L_0x00f2:
            throw r0
        L_0x00f3:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00f3 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.performance.AppBrandPerformanceManager.m103493b(fc.g):boolean");
    }

    /* renamed from: c */
    public static void m103494c(String str) {
        Log.m105919d("MicroMsg.AppBrandPerformanceManager", "enablePanel for AppId %s", str);
        SetAppPerformanceModeTask setAppPerformanceModeTask = new SetAppPerformanceModeTask((C83988a) null);
        setAppPerformanceModeTask.f245207f = str;
        setAppPerformanceModeTask.f245208g = true;
        setAppPerformanceModeTask.mo114395c();
    }

    /* renamed from: d */
    public static void m103495d(C86812g gVar, int i, long j) {
        m103496e(gVar, i, String.format("%d ms", new Object[]{Long.valueOf(j)}));
    }

    /* renamed from: e */
    public static void m103496e(C86812g gVar, int i, String str) {
        String str2 = gVar.f238147j;
        C84524e3 e3Var = gVar.f251966d1;
        if (e3Var == null) {
            C86493v0 d = C86493v0.m107224d();
            d.mo120947c(str2.hashCode() + "performance_data", true).mo120962i(String.valueOf(i), str);
            return;
        }
        C88024r.m109572b(new C84501c3(e3Var, i, str));
    }

    /* renamed from: f */
    public static boolean m103497f(C86812g gVar) {
        C83992a aVar = (C83992a) gVar.mo113018M(C83992a.class);
        return aVar != null && aVar.f245221d;
    }

    /* renamed from: g */
    public static void m103498g(String str) {
        Log.m105919d("MicroMsg.AppBrandPerformanceManager", "stopMonitoring, appId: %s", str);
        int hashCode = str.hashCode();
        SparseArray<C83989b> sparseArray = f245206a;
        C83989b bVar = sparseArray.get(hashCode);
        if (bVar != null) {
            sparseArray.remove(hashCode);
            bVar.mo116637h();
        }
    }
}
