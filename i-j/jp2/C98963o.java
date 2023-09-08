package jp2;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import os2.C100417r0;
import p166hy.C98567o0;
import pe3.C89349b;
import vr2.C102236a0;

/* renamed from: jp2.o */
public class C98963o implements C98958h {

    /* renamed from: a */
    public HashMap<String, Long> f290121a = new HashMap<>();

    /* renamed from: b */
    public HashSet<Long> f290122b = new HashSet<>();

    /* renamed from: c */
    public Map<String, Long> f290123c = new HashMap();

    /* renamed from: d */
    public Map<String, Integer> f290124d = new HashMap();

    /* renamed from: e */
    public Map<String, C98955d> f290125e = new HashMap();

    /* renamed from: f */
    public HashSet<Long> f290126f = new HashSet<>();

    /* renamed from: g */
    public Map<Long, C98973p> f290127g = new HashMap();

    /* renamed from: h */
    public Map<Long, C98973p> f290128h = new HashMap();

    /* renamed from: i */
    public Map<String, C98957g> f290129i = new HashMap();

    /* renamed from: j */
    public Map<String, C98972i> f290130j = new HashMap();

    /* renamed from: k */
    public int f290131k = 0;

    /* renamed from: l */
    public Map<String, Integer> f290132l = new HashMap();

    /* renamed from: m */
    public int f290133m = 0;

    /* renamed from: n */
    public View f290134n = null;

    /* renamed from: o */
    public Activity f290135o;

    /* renamed from: p */
    public Map<Long, Integer> f290136p = new HashMap();

    /* renamed from: q */
    public Map<Long, Integer> f290137q = new HashMap();

    /* renamed from: r */
    public HashSet<String> f290138r = new HashSet<>();

    /* renamed from: s */
    public boolean f290139s = false;

    /* renamed from: t */
    public int f290140t = -1;

    /* renamed from: jp2.o$a */
    public class C98964a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f290141d;

        /* renamed from: e */
        public final /* synthetic */ boolean f290142e;

        public C98964a(long j, boolean z) {
            this.f290141d = j;
            this.f290142e = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0085  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                java.lang.String r0 = "run"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                jp2.o r2 = jp2.C98963o.this
                long r3 = r12.f290141d
                boolean r2 = r2.mo138309p(r3)
                if (r2 == 0) goto L_0x0093
                jp2.o r2 = jp2.C98963o.this
                long r3 = r12.f290141d
                boolean r5 = r12.f290142e
                r2.getClass()
                java.lang.String r6 = "addVideoCountImpl"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                java.lang.String r8 = "timeline"
                if (r5 == 0) goto L_0x004a
                java.util.Map<java.lang.Long, jp2.p> r9 = r2.f290128h
                java.lang.Long r10 = java.lang.Long.valueOf(r3)
                java.util.HashMap r9 = (java.util.HashMap) r9
                boolean r9 = r9.containsKey(r10)
                if (r9 == 0) goto L_0x0044
                java.util.Map<java.lang.Long, jp2.p> r8 = r2.f290128h
                java.lang.Long r9 = java.lang.Long.valueOf(r3)
                java.util.HashMap r8 = (java.util.HashMap) r8
                java.lang.Object r8 = r8.get(r9)
                jp2.p r8 = (jp2.C98973p) r8
                goto L_0x006d
            L_0x0044:
                jp2.p r9 = new jp2.p
                r9.<init>(r8)
                goto L_0x006c
            L_0x004a:
                java.util.Map<java.lang.Long, jp2.p> r9 = r2.f290127g
                java.lang.Long r10 = java.lang.Long.valueOf(r3)
                java.util.HashMap r9 = (java.util.HashMap) r9
                boolean r9 = r9.containsKey(r10)
                if (r9 == 0) goto L_0x0067
                java.util.Map<java.lang.Long, jp2.p> r8 = r2.f290127g
                java.lang.Long r9 = java.lang.Long.valueOf(r3)
                java.util.HashMap r8 = (java.util.HashMap) r8
                java.lang.Object r8 = r8.get(r9)
                jp2.p r8 = (jp2.C98973p) r8
                goto L_0x006d
            L_0x0067:
                jp2.p r9 = new jp2.p
                r9.<init>(r8)
            L_0x006c:
                r8 = r9
            L_0x006d:
                r9 = 1
                r8.f290177b = r9
                kp2.b r10 = r8.f290185j
                int r11 = r10.f290740b
                int r11 = r11 + r9
                r10.f290740b = r11
                if (r5 == 0) goto L_0x0085
                java.util.Map<java.lang.Long, jp2.p> r2 = r2.f290128h
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.util.HashMap r2 = (java.util.HashMap) r2
                r2.put(r3, r8)
                goto L_0x0090
            L_0x0085:
                java.util.Map<java.lang.Long, jp2.p> r2 = r2.f290127g
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.util.HashMap r2 = (java.util.HashMap) r2
                r2.put(r3, r8)
            L_0x0090:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            L_0x0093:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp2.C98963o.C98964a.run():void");
        }
    }

    /* renamed from: jp2.o$b */
    public class C98965b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f290144d;

        /* renamed from: e */
        public final /* synthetic */ int f290145e;

        /* renamed from: f */
        public final /* synthetic */ boolean f290146f;

        /* renamed from: g */
        public final /* synthetic */ boolean f290147g;

        public C98965b(long j, int i, boolean z, boolean z2) {
            this.f290144d = j;
            this.f290145e = i;
            this.f290146f = z;
            this.f290147g = z2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$2");
            C98963o.this.mo138293H(this.f290144d, this.f290145e, this.f290146f, this.f290147g);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$2");
        }
    }

    /* renamed from: jp2.o$c */
    public class C98966c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f290149d;

        /* renamed from: e */
        public final /* synthetic */ long f290150e;

        public C98966c(long j, long j2) {
            this.f290149d = j;
            this.f290150e = j2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$3");
            if (C98963o.this.mo138309p(this.f290149d)) {
                C98963o oVar = C98963o.this;
                long j = this.f290150e;
                oVar.getClass();
                SnsMethodCalculate.markStartTimeMs("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                if (oVar.f290126f.contains(Long.valueOf(j))) {
                    SnsMethodCalculate.markEndTimeMs("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                } else {
                    oVar.f290126f.add(Long.valueOf(j));
                    SnsMethodCalculate.markEndTimeMs("addPlay3sImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$3");
        }
    }

    /* renamed from: jp2.o$d */
    public class C98967d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f290152d;

        /* renamed from: e */
        public final /* synthetic */ long f290153e;

        /* renamed from: f */
        public final /* synthetic */ boolean f290154f;

        public C98967d(long j, long j2, boolean z) {
            this.f290152d = j;
            this.f290153e = j2;
            this.f290154f = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                java.lang.String r1 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                jp2.o r3 = jp2.C98963o.this
                long r4 = r0.f290152d
                boolean r3 = r3.mo138309p(r4)
                if (r3 == 0) goto L_0x009a
                jp2.o r3 = jp2.C98963o.this
                long r4 = r0.f290152d
                long r6 = r0.f290153e
                boolean r8 = r0.f290154f
                r3.getClass()
                java.lang.String r9 = "updatePlayStartTimeImpl"
                java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                java.lang.String r11 = "timeline"
                if (r8 == 0) goto L_0x004f
                java.util.Map<java.lang.Long, jp2.p> r12 = r3.f290128h
                java.lang.Long r13 = java.lang.Long.valueOf(r4)
                java.util.HashMap r12 = (java.util.HashMap) r12
                boolean r12 = r12.containsKey(r13)
                if (r12 == 0) goto L_0x0049
                java.util.Map<java.lang.Long, jp2.p> r11 = r3.f290128h
                java.lang.Long r12 = java.lang.Long.valueOf(r4)
                java.util.HashMap r11 = (java.util.HashMap) r11
                java.lang.Object r11 = r11.get(r12)
                jp2.p r11 = (jp2.C98973p) r11
                goto L_0x0072
            L_0x0049:
                jp2.p r12 = new jp2.p
                r12.<init>(r11)
                goto L_0x0071
            L_0x004f:
                java.util.Map<java.lang.Long, jp2.p> r12 = r3.f290127g
                java.lang.Long r13 = java.lang.Long.valueOf(r4)
                java.util.HashMap r12 = (java.util.HashMap) r12
                boolean r12 = r12.containsKey(r13)
                if (r12 == 0) goto L_0x006c
                java.util.Map<java.lang.Long, jp2.p> r11 = r3.f290127g
                java.lang.Long r12 = java.lang.Long.valueOf(r4)
                java.util.HashMap r11 = (java.util.HashMap) r11
                java.lang.Object r11 = r11.get(r12)
                jp2.p r11 = (jp2.C98973p) r11
                goto L_0x0072
            L_0x006c:
                jp2.p r12 = new jp2.p
                r12.<init>(r11)
            L_0x0071:
                r11 = r12
            L_0x0072:
                kp2.b r12 = r11.f290185j
                long r13 = r12.f290745g
                r15 = 0
                int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r17 != 0) goto L_0x007e
                r12.f290745g = r6
            L_0x007e:
                if (r8 == 0) goto L_0x008c
                java.util.Map<java.lang.Long, jp2.p> r3 = r3.f290128h
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                java.util.HashMap r3 = (java.util.HashMap) r3
                r3.put(r4, r11)
                goto L_0x0097
            L_0x008c:
                java.util.Map<java.lang.Long, jp2.p> r3 = r3.f290127g
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                java.util.HashMap r3 = (java.util.HashMap) r3
                r3.put(r4, r11)
            L_0x0097:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            L_0x009a:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jp2.C98963o.C98967d.run():void");
        }
    }

    /* renamed from: jp2.o$e */
    public class C98968e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f290156d;

        public C98968e(C98963o oVar, Map map) {
            this.f290156d = map;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$5");
            for (String str : this.f290156d.keySet()) {
                AdSnsInfo qq = C94866e1.zx0().mo139865qq(C100417r0.m131424m(str));
                if (qq != null) {
                    SnsInfo convertToSnsInfo = qq.convertToSnsInfo();
                    qq.setExposures();
                    int i = 0;
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    if (this.f290156d.containsKey(str)) {
                        currentTimeMillis = ((Integer) this.f290156d.get(str)).intValue();
                        i = 1;
                    }
                    if (qq.field_exposureTime <= 0) {
                        qq.field_exposureTime = currentTimeMillis;
                        Log.m105924i("MicroMsg.SnsAdStatistic", "update Ad ExposureTime, snsId=" + C102236a0.m134765q0(qq.field_snsId) + ", exposuretime=" + currentTimeMillis + "， sys.currentTimeMis=" + System.currentTimeMillis() + ", type=" + i);
                    }
                    if (convertToSnsInfo != null) {
                        convertToSnsInfo.setExposures();
                    }
                    C94866e1.Yx0().yu0(convertToSnsInfo.field_snsId, convertToSnsInfo);
                    C94866e1.zx0().mo139863bD(qq.field_snsId, qq);
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$5");
        }
    }

    /* renamed from: jp2.o$f */
    public class C98969f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f290157d;

        public C98969f(long j) {
            this.f290157d = j;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$6");
            C98973p pVar = (C98973p) ((HashMap) C98963o.this.f290127g).get(Long.valueOf(this.f290157d));
            if (pVar != null) {
                SnsMethodCalculate.markStartTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
                pVar.mo138328a();
                SnsMethodCalculate.markEndTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$6");
        }
    }

    /* renamed from: jp2.o$g */
    public class C98970g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f290159d;

        public C98970g(long j) {
            this.f290159d = j;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$7");
            C98973p pVar = (C98973p) ((HashMap) C98963o.this.f290127g).get(Long.valueOf(this.f290159d));
            if (pVar != null) {
                C98963o oVar = C98963o.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                oVar.getClass();
                SnsMethodCalculate.markStartTimeMs("isFinishing", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                Activity activity = oVar.f290135o;
                boolean z = activity != null && activity.isFinishing();
                Log.m105924i("MicroMsg.SnsAdStatistic", "isFinishing:" + z);
                SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                if (!z) {
                    synchronized (pVar) {
                        SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
                        if (pVar.f290185j.f290745g > 0 && pVar.f290189n == 0) {
                            pVar.f290189n = Util.currentTicks();
                            String str = pVar.f290176a;
                            Log.m105924i(str, "onPausePlay, pauseBeginTime=" + pVar.f290189n);
                        }
                        SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$7");
        }
    }

    /* renamed from: jp2.o$h */
    public class C98971h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f290161d;

        /* renamed from: e */
        public final /* synthetic */ long f290162e;

        public C98971h(long j, long j2) {
            this.f290161d = j;
            this.f290162e = j2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$8");
            C98973p pVar = C98963o.this.f290127g.get(Long.valueOf(this.f290161d));
            if (pVar != null) {
                pVar.f290190o = this.f290162e;
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$8");
        }
    }

    /* renamed from: jp2.o$i */
    public static class C98972i {

        /* renamed from: a */
        public long f290164a;

        /* renamed from: b */
        public long f290165b;

        /* renamed from: c */
        public String f290166c;

        /* renamed from: d */
        public int f290167d;

        /* renamed from: e */
        public int f290168e;

        /* renamed from: f */
        public long f290169f;

        /* renamed from: g */
        public int f290170g;

        /* renamed from: h */
        public long f290171h;

        /* renamed from: i */
        public long f290172i;

        /* renamed from: j */
        public long f290173j;

        /* renamed from: k */
        public long f290174k;

        /* renamed from: l */
        public long f290175l;

        public C98972i(long j, long j2, String str, int i, String str2, int i2, long j3, int i3) {
            this.f290164a = j;
            this.f290165b = j;
            this.f290166c = str;
            this.f290167d = i;
            this.f290169f = j3;
            this.f290168e = i2;
            this.f290170g = i3;
        }
    }

    static {
        new HashMap();
    }

    public C98963o(int i) {
        this.f290131k = i;
        try {
            this.f290139s = ((C98567o0) C86312j.m106911c(C98567o0.class)).mo137597wZ();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: A */
    public void mo138286A(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        mo138287B(j, j2, false);
        SnsMethodCalculate.markEndTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: B */
    public void mo138287B(long j, long j2, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        MMHandlerThread.postToMainThread(new C98967d(j, j2, z));
        SnsMethodCalculate.markEndTimeMs("updatePlayStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: C */
    public void mo138288C(long j, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        mo138289D(j, i, z, false);
        SnsMethodCalculate.markEndTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: D */
    public void mo138289D(long j, int i, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        MMHandlerThread.postToMainThread(new C98965b(j, i, z, z2));
        SnsMethodCalculate.markEndTimeMs("updateVideo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: E */
    public void mo138290E(long j, boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        mo138291F(j, z, i, false);
        SnsMethodCalculate.markEndTimeMs("updateVideoAutoPlayImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138291F(long r6, boolean r8, int r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = "updateVideoAutoPlayImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "timeline"
            if (r10 == 0) goto L_0x0030
            java.util.Map<java.lang.Long, jp2.p> r3 = r5.f290128h
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x002a
            java.util.Map<java.lang.Long, jp2.p> r2 = r5.f290128h
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r3)
            jp2.p r2 = (jp2.C98973p) r2
            goto L_0x0053
        L_0x002a:
            jp2.p r3 = new jp2.p
            r3.<init>(r2)
            goto L_0x0052
        L_0x0030:
            java.util.Map<java.lang.Long, jp2.p> r3 = r5.f290127g
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x004d
            java.util.Map<java.lang.Long, jp2.p> r2 = r5.f290127g
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r3)
            jp2.p r2 = (jp2.C98973p) r2
            goto L_0x0053
        L_0x004d:
            jp2.p r3 = new jp2.p
            r3.<init>(r2)
        L_0x0052:
            r2 = r3
        L_0x0053:
            if (r8 == 0) goto L_0x005b
            kp2.b r8 = r2.f290185j
            r3 = 2
            r8.f290743e = r3
            goto L_0x0060
        L_0x005b:
            kp2.b r8 = r2.f290185j
            r3 = 1
            r8.f290743e = r3
        L_0x0060:
            kp2.b r8 = r2.f290185j
            r8.f290744f = r9
            if (r10 == 0) goto L_0x0072
            java.util.Map<java.lang.Long, jp2.p> r8 = r5.f290128h
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.util.HashMap r8 = (java.util.HashMap) r8
            r8.put(r6, r2)
            goto L_0x007d
        L_0x0072:
            java.util.Map<java.lang.Long, jp2.p> r8 = r5.f290127g
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.util.HashMap r8 = (java.util.HashMap) r8
            r8.put(r6, r2)
        L_0x007d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jp2.C98963o.mo138291F(long, boolean, int, boolean):void");
    }

    /* renamed from: G */
    public void mo138292G(long j, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        mo138293H(j, i, z, false);
        SnsMethodCalculate.markEndTimeMs("updateVideoImpl", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138293H(long r8, int r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            java.lang.String r0 = "updateVideoImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "timeline"
            if (r12 == 0) goto L_0x0030
            java.util.Map<java.lang.Long, jp2.p> r3 = r7.f290128h
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x002a
            java.util.Map<java.lang.Long, jp2.p> r2 = r7.f290128h
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r3)
            jp2.p r2 = (jp2.C98973p) r2
            goto L_0x0053
        L_0x002a:
            jp2.p r3 = new jp2.p
            r3.<init>(r2)
            goto L_0x0052
        L_0x0030:
            java.util.Map<java.lang.Long, jp2.p> r3 = r7.f290127g
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x004d
            java.util.Map<java.lang.Long, jp2.p> r2 = r7.f290127g
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r3)
            jp2.p r2 = (jp2.C98973p) r2
            goto L_0x0053
        L_0x004d:
            jp2.p r3 = new jp2.p
            r3.<init>(r2)
        L_0x0052:
            r2 = r3
        L_0x0053:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "updateVideoImpl, snsId="
            r3.append(r4)
            java.lang.String r4 = vr2.C102236a0.m134765q0(r8)
            r3.append(r4)
            java.lang.String r4 = ", duration="
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = ", downloadDone="
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.SnsAdStatistic"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r3)
            if (r10 <= 0) goto L_0x0095
            r2.getClass()
            java.lang.String r3 = "setDuration"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            long r5 = (long) r10
            r2.f290187l = r5
            kp2.b r5 = r2.f290185j
            r5.f290742d = r10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0095:
            r2.f290177b = r11
            if (r12 == 0) goto L_0x00a5
            java.util.Map<java.lang.Long, jp2.p> r10 = r7.f290128h
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r8, r2)
            goto L_0x00b0
        L_0x00a5:
            java.util.Map<java.lang.Long, jp2.p> r10 = r7.f290127g
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r8, r2)
        L_0x00b0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jp2.C98963o.mo138293H(long, int, boolean, boolean):void");
    }

    /* renamed from: a */
    public void mo138294a(String str, C98957g gVar) {
        SnsMethodCalculate.markStartTimeMs("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (gVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    ((HashMap) this.f290129i).put(str, gVar);
                    SnsMethodCalculate.markEndTimeMs("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                    return;
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdStatistic", "addAdRemovedListener exp= " + th.toString());
            }
        }
        Log.m105918d("MicroMsg.SnsAdStatistic", "the key or listener is null");
        SnsMethodCalculate.markEndTimeMs("addAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: b */
    public void mo138295b(long j) {
        SnsMethodCalculate.markStartTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        mo138296c(j, false);
        SnsMethodCalculate.markEndTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: c */
    public void mo138296c(long j, boolean z) {
        SnsMethodCalculate.markStartTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        MMHandlerThread.postToMainThread(new C98964a(j, z));
        SnsMethodCalculate.markEndTimeMs("addIdCount", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: d */
    public void mo138297d(long j) {
        int i;
        SnsMethodCalculate.markStartTimeMs("addLikeTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (((HashMap) this.f290136p).containsKey(Long.valueOf(j))) {
            i = ((Integer) ((HashMap) this.f290136p).get(Long.valueOf(j))).intValue();
        } else {
            i = 0;
        }
        ((HashMap) this.f290136p).put(Long.valueOf(j), Integer.valueOf(i + 1));
        SnsMethodCalculate.markEndTimeMs("addLikeTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: e */
    public void mo138298e(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("addPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        MMHandlerThread.postToMainThread(new C98966c(j, j2));
        SnsMethodCalculate.markEndTimeMs("addPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: f */
    public void mo138299f(long j) {
        int i;
        SnsMethodCalculate.markStartTimeMs("addTurnClickTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (((HashMap) this.f290137q).containsKey(Long.valueOf(j))) {
            i = ((Integer) ((HashMap) this.f290137q).get(Long.valueOf(j))).intValue();
        } else {
            i = 0;
        }
        ((HashMap) this.f290137q).put(Long.valueOf(j), Integer.valueOf(i + 1));
        SnsMethodCalculate.markEndTimeMs("addTurnClickTimes", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: g */
    public void mo138300g() {
        SnsMethodCalculate.markStartTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        mo138301h(false);
        SnsMethodCalculate.markEndTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: h */
    public void mo138301h(boolean z) {
        SnsMethodCalculate.markStartTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        Log.m105924i("MicroMsg.SnsAdStatistic", "-checkAd, isScroolIdle=" + z);
        for (Map.Entry value : ((HashMap) this.f290125e).entrySet()) {
            C98955d dVar = (C98955d) value.getValue();
            if (dVar != null) {
                int i = C94866e1.f274866V;
                dVar.mo138282a(z);
                if (!Util.isNullOrNil(dVar.f290079H)) {
                    if (((HashMap) this.f290130j).get(dVar.f290079H) != null) {
                        C98972i iVar = (C98972i) ((HashMap) this.f290130j).get(dVar.f290079H);
                        SnsMethodCalculate.markStartTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        boolean z2 = true;
                        if (dVar.f290078G != 1) {
                            z2 = false;
                        }
                        SnsMethodCalculate.markEndTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (z2 && iVar.f290171h == 0) {
                            iVar.f290171h = Util.currentTicks();
                            Log.m105918d("MicroMsg.SnsAdStatistic", "--feedFullVisibleTime begin, id=" + dVar.f290079H);
                        } else if (!z2) {
                            long j = iVar.f290171h;
                            if (j > 0) {
                                long ticksToNow = Util.ticksToNow(j);
                                iVar.f290173j += ticksToNow;
                                iVar.f290171h = 0;
                                Log.m105918d("MicroMsg.SnsAdStatistic", "--feedFullVisibleTime end, duration=" + ticksToNow + ", total=" + iVar.f290173j);
                            }
                        }
                        SnsMethodCalculate.markStartTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        boolean z3 = dVar.f290081J;
                        SnsMethodCalculate.markEndTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (z3 && iVar.f290175l == 0) {
                            iVar.f290175l = Util.currentTicks();
                            Log.m105918d("MicroMsg.SnsAdStatistic", "--feedHalfVisibleTime begin, id=" + dVar.f290079H);
                        } else if (!z3) {
                            long j2 = iVar.f290175l;
                            if (j2 > 0) {
                                long ticksToNow2 = Util.ticksToNow(j2);
                                iVar.f290174k += ticksToNow2;
                                iVar.f290175l = 0;
                                Log.m105918d("MicroMsg.SnsAdStatistic", "--feedHalfVisibleTime end, duration=" + ticksToNow2 + ", total=" + iVar.f290174k);
                            }
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkAd", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: i */
    public void mo138302i() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        Log.m105924i("MicroMsg.SnsAdStatistic", "--clear--");
        Iterator it = new HashSet(((HashMap) this.f290130j).keySet()).iterator();
        while (it.hasNext()) {
            C98972i iVar = (C98972i) ((HashMap) this.f290130j).get((String) it.next());
            mo138312s(iVar.f290167d, iVar.f290166c, iVar.f290169f, iVar.f290170g);
        }
        C94866e1.my0().post(new C98968e(this, new HashMap(this.f290132l)));
        ((HashMap) this.f290130j).clear();
        ((HashMap) this.f290132l).clear();
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: j */
    public void mo138303j(long j, boolean z) {
        C98973p pVar;
        C98973p pVar2;
        SnsMethodCalculate.markStartTimeMs("endPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (z) {
            if (((HashMap) this.f290128h).containsKey(Long.valueOf(j))) {
                pVar2 = (C98973p) ((HashMap) this.f290128h).get(Long.valueOf(j));
                pVar2.mo138332e(0);
            } else {
                pVar2 = new C98973p("timeline");
            }
            ((HashMap) this.f290128h).put(Long.valueOf(j), pVar2);
        } else {
            if (((HashMap) this.f290127g).containsKey(Long.valueOf(j))) {
                pVar = (C98973p) ((HashMap) this.f290127g).get(Long.valueOf(j));
                pVar.mo138332e(0);
            } else {
                pVar = new C98973p("timeline");
            }
            ((HashMap) this.f290127g).put(Long.valueOf(j), pVar);
        }
        SnsMethodCalculate.markEndTimeMs("endPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: k */
    public final ADInfo mo138304k(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        } else if (this.f290131k == 2) {
            ADInfo atAdInfo = snsInfo.getAtAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return atAdInfo;
        } else {
            ADInfo adInfo = snsInfo.getAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return adInfo;
        }
    }

    /* renamed from: l */
    public long mo138305l(long j) {
        SnsMethodCalculate.markStartTimeMs("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        try {
            C98973p pVar = this.f290127g.get(Long.valueOf(j));
            if (pVar != null) {
                long j2 = pVar.f290190o;
                SnsMethodCalculate.markEndTimeMs("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return j2;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdStatistic", "getCurPlayTime exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return 0;
    }

    /* renamed from: m */
    public long mo138306m(String str, int i) {
        long j;
        SnsMethodCalculate.markStartTimeMs("getExposureStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        C98955d dVar = (C98955d) ((HashMap) this.f290125e).get(str);
        if (dVar != null) {
            SnsMethodCalculate.markStartTimeMs("getZeroStartTime", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            j = dVar.f290100s;
            SnsMethodCalculate.markEndTimeMs("getZeroStartTime", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        } else {
            j = 0;
        }
        Log.m105924i("MicroMsg.SnsAdStatistic", "getExposureStartTime, localId=" + str + ", clkPos=" + i + ", time=" + j);
        SnsMethodCalculate.markEndTimeMs("getExposureStartTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return j;
    }

    /* renamed from: n */
    public final C89349b mo138307n(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        } else if (this.f290131k == 2) {
            C89349b atFriendRemindInfoSelfInfo = snsInfo.getAdSnsInfo().getAtFriendRemindInfoSelfInfo();
            SnsMethodCalculate.markEndTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return atFriendRemindInfoSelfInfo;
        } else {
            C89349b timelineRemindInfoSelfInfo = snsInfo.getAdSnsInfo().getTimelineRemindInfoSelfInfo();
            SnsMethodCalculate.markEndTimeMs("getRemindSelfInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return timelineRemindInfoSelfInfo;
        }
    }

    /* renamed from: o */
    public final C89349b mo138308o(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        } else if (this.f290131k == 2) {
            C89349b atFriendRemindInfoSourceInfo = snsInfo.getAdSnsInfo().getAtFriendRemindInfoSourceInfo();
            SnsMethodCalculate.markEndTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return atFriendRemindInfoSourceInfo;
        } else {
            C89349b timelineRemindInfoSourceInfo = snsInfo.getAdSnsInfo().getTimelineRemindInfoSourceInfo();
            SnsMethodCalculate.markEndTimeMs("getRemindSourceInfo", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return timelineRemindInfoSourceInfo;
        }
    }

    /* renamed from: p */
    public boolean mo138309p(long j) {
        SnsMethodCalculate.markStartTimeMs("isOnScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        boolean contains = this.f290122b.contains(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("isOnScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return contains;
    }

    /* renamed from: q */
    public boolean mo138310q(long j) {
        SnsMethodCalculate.markStartTimeMs("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        if (this.f290126f.contains(Long.valueOf(j))) {
            SnsMethodCalculate.markEndTimeMs("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isPlay3s", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:187:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x034e  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138311r(int r43, java.lang.String r44, boolean r45, android.view.View r46, long r47, com.tencent.p014mm.protocal.protobuf.SnsObject r49, int r50, int r51) {
        /*
            r42 = this;
            r1 = r42
            r15 = r43
            r14 = r44
            r13 = r50
            java.lang.String r12 = "onAdAdded"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
            java.util.HashSet<java.lang.Long> r0 = r1.f290122b
            java.lang.Long r2 = java.lang.Long.valueOf(r47)
            r0.add(r2)
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.f290121a
            java.lang.Long r2 = java.lang.Long.valueOf(r47)
            r0.put(r14, r2)
            int r0 = r1.f290140t
            r2 = -1
            if (r0 != r2) goto L_0x003d
            java.lang.String r0 = "getStatusBarHeight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r11)
            android.app.Activity r3 = r1.f290135o
            if (r3 != 0) goto L_0x0034
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
            goto L_0x003b
        L_0x0034:
            int r2 = com.tencent.p014mm.p136ui.C85875k4.m106200p(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r11)
        L_0x003b:
            r1.f290140t = r2
        L_0x003d:
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r0.mo139798DN(r14)
            java.lang.String r9 = "MicroMsg.SnsAdStatistic"
            if (r10 != 0) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "snsinfo not found! skip onAdAdded logic!, snsId="
            r0.append(r2)
            java.lang.String r2 = vr2.C102236a0.m134765q0(r47)
            r0.append(r2)
            java.lang.String r2 = ", localId="
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
            return
        L_0x006e:
            java.util.Map<java.lang.String, jp2.d> r0 = r1.f290125e
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r14)
            jp2.d r0 = (jp2.C98955d) r0
            com.tencent.mm.plugin.sns.storage.ADInfo r8 = r1.mo138304k(r10)
            java.lang.String r7 = ""
            if (r8 == 0) goto L_0x0084
            java.lang.String r2 = r8.viewId
            r5 = r2
            goto L_0x0085
        L_0x0084:
            r5 = r7
        L_0x0085:
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.model.AdViewStatic"
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0119
            if (r46 == 0) goto L_0x0119
            jp2.d r0 = new jp2.d
            int r2 = r1.f290133m
            r16 = r9
            android.view.View r9 = r1.f290134n
            r17 = r11
            int r11 = r1.f290140t
            com.tencent.mm.plugin.sns.storage.ADXml r18 = r10.getAdXml()
            boolean r15 = r1.f290139s
            r19 = r2
            r2 = r0
            r3 = r8
            r31 = 0
            r4 = r44
            r32 = r5
            r1 = r6
            r5 = r47
            r33 = r7
            r7 = r46
            r34 = r8
            r8 = r19
            r35 = r16
            r46 = r10
            r10 = r11
            r36 = r17
            r11 = r51
            r37 = r12
            r12 = r49
            r13 = r43
            r14 = r18
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r2 = "onAdd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            long r3 = java.lang.System.currentTimeMillis()
            r0.f290100s = r3
            com.tencent.mm.sdk.platformtools.MMHandler r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            jp2.c r4 = new jp2.c
            r4.<init>(r0)
            r3.post(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r14 = r1
            r1 = r42
            java.util.Map<java.lang.String, jp2.d> r2 = r1.f290125e
            java.util.HashMap r2 = (java.util.HashMap) r2
            r15 = r44
            r2.put(r15, r0)
            java.util.Map<java.lang.Long, java.lang.Integer> r2 = r1.f290136p
            java.lang.Long r3 = java.lang.Long.valueOf(r47)
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L_0x0117
            java.util.Map<java.lang.Long, java.lang.Integer> r2 = r1.f290136p
            java.lang.Long r3 = java.lang.Long.valueOf(r47)
            int r4 = r46.getLikeFlag()
            r13 = 1
            if (r4 != r13) goto L_0x010c
            r4 = 1
            goto L_0x010d
        L_0x010c:
            r4 = 0
        L_0x010d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r3, r4)
            goto L_0x012c
        L_0x0117:
            r13 = 1
            goto L_0x012c
        L_0x0119:
            r32 = r5
            r33 = r7
            r34 = r8
            r35 = r9
            r46 = r10
            r36 = r11
            r37 = r12
            r15 = r14
            r13 = 1
            r31 = 0
            r14 = r6
        L_0x012c:
            r11 = r0
            java.lang.String r12 = "timeline"
            r10 = 11
            r9 = r50
            if (r9 != r10) goto L_0x0177
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r46.getTimeLine()
            te3.j00 r0 = r0.ContentObj
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h
            int r0 = r0.size()
            if (r0 <= r13) goto L_0x0177
            java.util.Map<java.lang.Long, jp2.p> r0 = r1.f290128h
            java.lang.Long r2 = java.lang.Long.valueOf(r47)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0161
            java.util.Map<java.lang.Long, jp2.p> r0 = r1.f290128h
            java.lang.Long r2 = java.lang.Long.valueOf(r47)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            jp2.p r0 = (jp2.C98973p) r0
            goto L_0x0166
        L_0x0161:
            jp2.p r0 = new jp2.p
            r0.<init>(r12)
        L_0x0166:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r0.f290179d = r2
            java.util.Map<java.lang.Long, jp2.p> r2 = r1.f290128h
            java.lang.Long r3 = java.lang.Long.valueOf(r47)
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r3, r0)
        L_0x0177:
            java.util.HashSet<java.lang.String> r0 = r1.f290138r
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L_0x028a
            java.util.HashSet<java.lang.String> r0 = r1.f290138r
            r0.add(r15)
            java.lang.String r2 = "onAddAppear"
            r7 = r36
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r7)
            java.util.HashSet<java.lang.String> r0 = lo2.C99520a0.f291755a
            java.lang.String r0 = "checkPreloadWeAppEnvForTimeLine"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            zt3.t r4 = zt3.C119157j.f356862d
            lo2.y r5 = new lo2.y
            r6 = r46
            r5.<init>(r6)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183875f(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            int r0 = r1.f290131k     // Catch:{ all -> 0x01bc }
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r6.getAdInfo(r0)     // Catch:{ all -> 0x01bc }
            com.tencent.mm.protocal.protobuf.SnsObject r3 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r6)     // Catch:{ all -> 0x01bc }
            long r4 = r6.field_snsId     // Catch:{ all -> 0x01bc }
            java.lang.String r4 = vr2.C102236a0.m134765q0(r4)     // Catch:{ all -> 0x01bc }
            jq2.C98995n.m128907c(r13, r4, r0, r3)     // Catch:{ all -> 0x01bc }
            r5 = r35
            goto L_0x01c6
        L_0x01bc:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r5 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x01c6:
            jo2.a r0 = jo2.C98951a.f290046b
            java.lang.String r0 = "instance"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            jo2.a r4 = jo2.C98951a.f290046b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            int r0 = r1.f290131k
            r4.getClass()
            java.lang.String r10 = "publish"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r3)
            ko2.c r4 = r4.f290047a     // Catch:{ all -> 0x0201 }
            r4.getClass()     // Catch:{ all -> 0x0201 }
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)     // Catch:{ all -> 0x0201 }
            java.lang.String r8 = "offerTask"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r13)     // Catch:{ all -> 0x0201 }
            ko2.c$b r9 = new ko2.c$b     // Catch:{ all -> 0x0201 }
            r9.<init>((com.tencent.p014mm.plugin.sns.storage.SnsInfo) r6, (int) r0)     // Catch:{ all -> 0x0201 }
            ko2.c$b r0 = r4.mo138522a(r9)     // Catch:{ all -> 0x0201 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r13)     // Catch:{ all -> 0x0201 }
            r4.mo138523b(r0)     // Catch:{ all -> 0x0201 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)     // Catch:{ all -> 0x0201 }
        L_0x0201:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r3)
            int r0 = r1.f290131k
            java.util.List<java.lang.String> r3 = lo2.C99544i0.f291799a
            java.lang.String r3 = "reqFinderFeedsObjectId"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r6.getAdInfo(r0)     // Catch:{ all -> 0x0261 }
            if (r0 == 0) goto L_0x025f
            boolean r8 = r0.preloadFinderFeed     // Catch:{ all -> 0x0261 }
            if (r8 == 0) goto L_0x025f
            com.tencent.mm.plugin.sns.storage.ADXml r8 = r6.getAdXml()     // Catch:{ all -> 0x0261 }
            long r9 = r6.field_snsId     // Catch:{ all -> 0x0261 }
            java.lang.String r9 = vr2.C102236a0.m134765q0(r9)     // Catch:{ all -> 0x0261 }
            java.lang.String r10 = r0.uxInfo     // Catch:{ all -> 0x0261 }
            r13 = 3
            java.lang.String r9 = lo2.C99542h0.m129912j(r10, r9, r13)     // Catch:{ all -> 0x025d }
            lo2.C99544i0.m129919f(r8, r9)     // Catch:{ all -> 0x025d }
            java.lang.String r8 = "doReqFinderFeedsObjectId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)     // Catch:{ all -> 0x025d }
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r10 = r0.adClickActionInfoList     // Catch:{ all -> 0x025d }
            boolean r10 = rq2.C101425k.m133097a(r10)     // Catch:{ all -> 0x025d }
            if (r10 == 0) goto L_0x023f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)     // Catch:{ all -> 0x025d }
            goto L_0x026c
        L_0x023f:
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r0 = r0.adClickActionInfoList     // Catch:{ all -> 0x025d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x025d }
        L_0x0245:
            boolean r10 = r0.hasNext()     // Catch:{ all -> 0x025d }
            if (r10 == 0) goto L_0x0259
            java.lang.Object r10 = r0.next()     // Catch:{ all -> 0x025d }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo) r10     // Catch:{ all -> 0x025d }
            if (r10 == 0) goto L_0x0245
            java.lang.String r10 = r10.f273646d0     // Catch:{ all -> 0x025d }
            lo2.C99544i0.m129922i(r10, r9)     // Catch:{ all -> 0x025d }
            goto L_0x0245
        L_0x0259:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)     // Catch:{ all -> 0x025d }
            goto L_0x026c
        L_0x025d:
            r0 = move-exception
            goto L_0x0263
        L_0x025f:
            r13 = 3
            goto L_0x026c
        L_0x0261:
            r0 = move-exception
            r13 = 3
        L_0x0263:
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "FinderAdPreloadHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x026c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            int r0 = r1.f290131k
            java.lang.String r3 = "preloadFinderInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            zt3.t r8 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0283 }
            lo2.k0 r9 = new lo2.k0     // Catch:{ all -> 0x0283 }
            r9.<init>(r6, r0)     // Catch:{ all -> 0x0283 }
            zt3.j r8 = (zt3.C119157j) r8     // Catch:{ all -> 0x0283 }
            r8.mo183875f(r9)     // Catch:{ all -> 0x0283 }
        L_0x0283:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r7)
            goto L_0x0291
        L_0x028a:
            r6 = r46
            r5 = r35
            r7 = r36
            r13 = 3
        L_0x0291:
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.f290123c
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r15)
            if (r0 == 0) goto L_0x033e
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.f290123c
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r15)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            r8 = 1200000(0x124f80, double:5.92879E-318)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x031d
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f290124d
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r15)
            if (r0 == 0) goto L_0x02cd
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f290124d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r4 = r0.intValue()
            goto L_0x02ce
        L_0x02cd:
            r4 = 0
        L_0x02ce:
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r4 < r0) goto L_0x0309
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1612(0x64c, float:2.259E-42)
            r6 = 96
            r0.mo175911u(r4, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "passed localid "
            r0.append(r4)
            r0.append(r15)
            java.lang.String r4 = " viewid "
            r0.append(r4)
            r10 = r32
            r0.append(r10)
            java.lang.String r4 = " passedTime: "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r9 = r37
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
            return
        L_0x0309:
            r10 = r32
            r9 = r37
            r16 = 1
            int r4 = r4 + 1
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f290124d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r15, r2)
            goto L_0x0344
        L_0x031d:
            r10 = r32
            r9 = r37
            r16 = 1
            java.util.Map<java.lang.String, java.lang.Long> r0 = r1.f290123c
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r15, r2)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f290124d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r31)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r15, r2)
            goto L_0x0344
        L_0x033e:
            r10 = r32
            r9 = r37
            r16 = 1
        L_0x0344:
            java.util.Map<java.lang.String, jp2.o$i> r0 = r1.f290130j
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r15)
            if (r0 != 0) goto L_0x05eb
            java.util.Map<java.lang.String, jp2.o$i> r0 = r1.f290130j
            jp2.o$i r8 = new jp2.o$i
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r17 = java.lang.System.currentTimeMillis()
            r2 = r8
            r49 = r6
            r19 = r14
            r14 = r5
            r5 = r17
            r38 = r7
            r7 = r44
            r13 = r8
            r17 = 3
            r8 = r43
            r39 = r9
            r9 = r10
            r20 = r10
            r10 = r50
            r40 = r11
            r41 = r12
            r11 = r47
            r35 = r14
            r14 = r13
            r13 = r51
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r13)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r15, r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onAdAdded "
            r0.append(r2)
            r2 = r43
            r0.append(r2)
            java.lang.String r3 = " "
            r0.append(r3)
            r0.append(r15)
            java.lang.String r3 = "  isExposure: "
            r0.append(r3)
            r3 = r45
            r0.append(r3)
            java.lang.String r3 = ", snsId="
            r0.append(r3)
            java.lang.String r4 = vr2.C102236a0.m134765q0(r47)
            r0.append(r4)
            java.lang.String r4 = ", expoureScene="
            r0.append(r4)
            r4 = r51
            r0.append(r4)
            java.lang.String r5 = ", isImproveUI="
            r0.append(r5)
            boolean r5 = r1.f290139s
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r5 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r0 = 19
            r6 = 9
            r7 = 6
            r8 = r50
            if (r8 == r6) goto L_0x044c
            r9 = 13
            if (r8 == r9) goto L_0x044c
            boolean r9 = nu2.C100202d.m130999b(r50)
            if (r9 != 0) goto L_0x044c
            r9 = 34
            if (r8 == r9) goto L_0x044c
            if (r8 != r0) goto L_0x03ea
            goto L_0x044c
        L_0x03ea:
            r9 = 11
            if (r8 != r9) goto L_0x044a
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r49.getTimeLine()
            te3.j00 r10 = r10.ContentObj
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x044a
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r49.getTimeLine()
            te3.j00 r10 = r10.ContentObj
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            te3.kv2 r10 = (te3.C101804kv2) r10
            int r10 = r10.f298690e
            if (r10 != r7) goto L_0x0448
            java.util.Map<java.lang.Long, jp2.p> r10 = r1.f290127g
            java.lang.Long r12 = java.lang.Long.valueOf(r47)
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r12)
            if (r10 == 0) goto L_0x042c
            java.util.Map<java.lang.Long, jp2.p> r10 = r1.f290127g
            java.lang.Long r12 = java.lang.Long.valueOf(r47)
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r12)
            jp2.p r10 = (jp2.C98973p) r10
            goto L_0x0433
        L_0x042c:
            jp2.p r10 = new jp2.p
            r12 = r41
            r10.<init>(r12)
        L_0x0433:
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r10.f290179d = r12
            r13 = 1
            r10.f290184i = r13
            java.util.Map<java.lang.Long, jp2.p> r12 = r1.f290127g
            java.lang.Long r14 = java.lang.Long.valueOf(r47)
            java.util.HashMap r12 = (java.util.HashMap) r12
            r12.put(r14, r10)
            goto L_0x0485
        L_0x0448:
            r13 = 1
            goto L_0x0485
        L_0x044a:
            r11 = 0
            goto L_0x0448
        L_0x044c:
            r12 = r41
            r9 = 11
            r11 = 0
            r13 = 1
            java.util.Map<java.lang.Long, jp2.p> r10 = r1.f290127g
            java.lang.Long r14 = java.lang.Long.valueOf(r47)
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r14)
            if (r10 == 0) goto L_0x046f
            java.util.Map<java.lang.Long, jp2.p> r10 = r1.f290127g
            java.lang.Long r12 = java.lang.Long.valueOf(r47)
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r12)
            jp2.p r10 = (jp2.C98973p) r10
            goto L_0x0474
        L_0x046f:
            jp2.p r10 = new jp2.p
            r10.<init>(r12)
        L_0x0474:
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r10.f290179d = r6
            java.util.Map<java.lang.Long, jp2.p> r6 = r1.f290127g
            java.lang.Long r7 = java.lang.Long.valueOf(r47)
            java.util.HashMap r6 = (java.util.HashMap) r6
            r6.put(r7, r10)
        L_0x0485:
            java.util.Map<java.lang.String, java.lang.Integer> r6 = r1.f290132l
            java.util.HashMap r6 = (java.util.HashMap) r6
            boolean r6 = r6.containsKey(r15)
            if (r6 != 0) goto L_0x04c9
            long r6 = java.lang.System.currentTimeMillis()
            r21 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r21
            int r7 = (int) r6
            java.util.Map<java.lang.String, java.lang.Integer> r6 = r1.f290132l
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r6 = (java.util.HashMap) r6
            r6.put(r15, r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "exposures item "
            r6.append(r10)
            r6.append(r15)
            r6.append(r3)
            java.lang.String r3 = vr2.C102236a0.m134765q0(r47)
            r6.append(r3)
            java.lang.String r3 = ", time="
            r6.append(r3)
            r6.append(r7)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
        L_0x04c9:
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r49.getAdXml()
            com.tencent.mm.protocal.protobuf.TimeLineObject r6 = r49.getTimeLine()
            r7 = 0
            r10 = r40
            if (r10 == 0) goto L_0x04dc
            int r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.f274866V
            te3.l2 r7 = r10.mo138284c()
        L_0x04dc:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r12 = r49.getAdSnsInfo()
            int r14 = r1.f290131k
            if (r14 != 0) goto L_0x04f7
            int r14 = r12.field_exposureCount
            int r14 = r14 + r13
            r12.field_exposureCount = r14
            os2.j r15 = com.tencent.p014mm.plugin.sns.model.C94866e1.zx0()
            java.lang.String[] r9 = new java.lang.String[r11]
            r15.update(r12, (java.lang.String[]) r9)
            r22 = r14
            r9 = r34
            goto L_0x04fb
        L_0x04f7:
            r9 = r34
            r22 = 0
        L_0x04fb:
            if (r9 != 0) goto L_0x0500
            r29 = r33
            goto L_0x0504
        L_0x0500:
            java.lang.String r12 = r9.waidPkg
            r29 = r12
        L_0x0504:
            jp2.b r12 = new jp2.b
            r12.<init>()
            r12.f290065a = r2
            r2 = r49
            r12.f290066b = r2
            if (r10 == 0) goto L_0x051e
            java.lang.String r14 = "getAdContentHeight"
            r15 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            int r10 = r10.f290088g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            goto L_0x051f
        L_0x051e:
            r10 = 0
        L_0x051f:
            r12.f290067c = r10
            if (r9 == 0) goto L_0x053f
            boolean r10 = r9.isWeapp()
            if (r10 == 0) goto L_0x053f
            boolean r10 = r2.isFullCardAd()
            if (r10 != 0) goto L_0x053f
            boolean r10 = r2.isSlideFullCardAd()
            if (r10 != 0) goto L_0x053f
            com.tencent.mm.plugin.sns.storage.ADInfo$b r9 = r9.actionExtWeApp
            java.lang.String r9 = r9.f275645a
            boolean r9 = lo2.C88617x.m110483a(r9)
            r12.f290070f = r9
        L_0x053f:
            boolean r9 = r3.isLinkAd()
            if (r9 == 0) goto L_0x0547
            r0 = 3
            goto L_0x0593
        L_0x0547:
            boolean r9 = r2.isTurnCardAd()
            if (r9 == 0) goto L_0x054f
            r0 = 6
            goto L_0x0593
        L_0x054f:
            boolean r9 = r2.isCardAd()
            if (r9 != 0) goto L_0x0582
            boolean r9 = r2.isFullCardAd()
            if (r9 == 0) goto L_0x055c
            goto L_0x0582
        L_0x055c:
            boolean r6 = r2.isFinderTopicCardAd()
            if (r6 == 0) goto L_0x0565
            r0 = 9
            goto L_0x0593
        L_0x0565:
            boolean r6 = r3.isSlideFullCard()
            if (r6 == 0) goto L_0x056e
            r0 = 10
            goto L_0x0593
        L_0x056e:
            r6 = 9
            if (r8 == r6) goto L_0x0580
            if (r8 != r0) goto L_0x0575
            goto L_0x0580
        L_0x0575:
            boolean r0 = r3.isCombinedGridAD()
            if (r0 == 0) goto L_0x057e
            r0 = 11
            goto L_0x0593
        L_0x057e:
            r0 = 1
            goto L_0x0593
        L_0x0580:
            r0 = 2
            goto L_0x0593
        L_0x0582:
            if (r6 == 0) goto L_0x0592
            te3.j00 r0 = r6.ContentObj
            int r0 = r0.f298424e
            r3 = 15
            if (r0 != r3) goto L_0x0592
            int r0 = r6.sightFolded
            if (r0 == r13) goto L_0x0592
            r0 = 5
            goto L_0x0593
        L_0x0592:
            r0 = 4
        L_0x0593:
            jp2.j r3 = new jp2.j
            r13 = r3
            r16 = 1
            int r23 = r2.getAdRecSrc()
            pe3.b r27 = r1.mo138308o(r2)
            pe3.b r28 = r1.mo138307n(r2)
            r17 = 0
            r18 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            java.lang.String r21 = ""
            r14 = r20
            r15 = r51
            r19 = r7
            r20 = r0
            r30 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123460f(r3)
            boolean r0 = vr2.C102260r.m134873m()     // Catch:{ all -> 0x05de }
            if (r0 == 0) goto L_0x05e6
            com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo r0 = new com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo     // Catch:{ all -> 0x05de }
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r2.getAdXml()     // Catch:{ all -> 0x05de }
            java.lang.String r2 = r2.xml     // Catch:{ all -> 0x05de }
            r0.<init>(r2)     // Catch:{ all -> 0x05de }
            wo2.C102471g.m135256b(r0)     // Catch:{ all -> 0x05de }
            goto L_0x05e6
        L_0x05de:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r3 = r33
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r3, r2)
        L_0x05e6:
            r3 = r38
            r2 = r39
            goto L_0x05ed
        L_0x05eb:
            r3 = r7
            r2 = r9
        L_0x05ed:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jp2.C98963o.mo138311r(int, java.lang.String, boolean, android.view.View, long, com.tencent.mm.protocal.protobuf.SnsObject, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:185:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x07c1  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x089c  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x089f  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x08ae  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x096e A[Catch:{ all -> 0x0972 }] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138312s(int r45, java.lang.String r46, long r47, int r49) {
        /*
            r44 = this;
            r1 = r44
            r2 = r45
            r3 = r46
            java.lang.String r4 = "onAdRemoved"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.f290121a
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x002b
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r1.f290121a
            java.lang.Object r0 = r0.remove(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            java.util.HashSet<java.lang.Long> r0 = r1.f290122b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0.remove(r6)
        L_0x002b:
            java.util.Map<java.lang.String, jp2.d> r0 = r1.f290125e
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r3)
            r6 = r0
            jp2.d r6 = (jp2.C98955d) r6
            r0 = 0
            java.lang.String r7 = "MicroMsg.SnsAdStatistic"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ad.model.AdViewStatic"
            r13 = 1
            r14 = 0
            if (r6 == 0) goto L_0x0351
            int r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.f274866V
            java.lang.String r0 = "onRemove"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r8 = "onRemove, set isHalf=false, isFull=false, isImproveUI="
            r15.append(r8)
            boolean r8 = r6.f290080I
            r15.append(r8)
            java.lang.String r8 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r8)
            r6.f290077F = r13
            long r10 = java.lang.System.currentTimeMillis()
            r6.f290101t = r10
            r6.f290078G = r14
            boolean r10 = r6.f290080I
            if (r10 == 0) goto L_0x009e
            long r10 = r6.f290103v
            r17 = 0
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 <= 0) goto L_0x0085
            long r10 = r6.f290105x
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 != 0) goto L_0x0085
            long r10 = java.lang.System.currentTimeMillis()
            r6.f290105x = r10
            java.lang.String r10 = "--set old half_endTopTime"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r10)
        L_0x0085:
            long r10 = r6.f290106y
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 <= 0) goto L_0x009c
            long r10 = r6.f290107z
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 != 0) goto L_0x009c
            long r10 = java.lang.System.currentTimeMillis()
            r6.f290107z = r10
            java.lang.String r10 = "--set old full_endTopTime"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r10)
        L_0x009c:
            r6.f290081J = r14
        L_0x009e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            r44.mo138300g()
            java.lang.String r0 = "report"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            int r10 = r6.f290097p
            if (r10 >= 0) goto L_0x00b2
            r8 = 2
            r6.f290075D = r8
            goto L_0x00b5
        L_0x00b2:
            r8 = 2
            r6.f290075D = r13
        L_0x00b5:
            int r10 = r6.f290099r
            if (r10 >= 0) goto L_0x00bc
            r6.f290076E = r8
            goto L_0x00be
        L_0x00bc:
            r6.f290076E = r13
        L_0x00be:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = r9
            long r8 = r6.f290095n
            java.lang.String r8 = vr2.C102236a0.m134765q0(r8)
            r11.append(r8)
            java.lang.String r8 = ","
            r11.append(r8)
            java.lang.String r9 = r11.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r6.f290094m
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r11 = r6.f290075D
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r11 = r6.f290076E
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r11 = r6.f290072A
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r11 = r6.f290073B
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r11 = r6.f290074C
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            long r14 = r6.f290100s
            r9.append(r14)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            long r14 = r6.f290101t
            r9.append(r14)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r10.append(r9)
            long r14 = r6.f290103v
            java.lang.String r9 = ", hash="
            java.lang.String r11 = "MicroMsg.AdViewStatic"
            r17 = 0
            int r20 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r20 <= 0) goto L_0x01c2
            long r14 = r6.f290105x
            int r20 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r20 != 0) goto L_0x01c2
            long r14 = java.lang.System.currentTimeMillis()
            r6.f290105x = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "halfExposure old 2, end:"
            r14.append(r15)
            r20 = r14
            long r13 = r6.f290105x
            r21 = r4
            r22 = r5
            long r4 = r6.f290103v
            long r13 = r13 - r4
            r4 = r20
            r4.append(r13)
            r4.append(r9)
            int r5 = r6.hashCode()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r4)
            goto L_0x01c6
        L_0x01c2:
            r21 = r4
            r22 = r5
        L_0x01c6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r13 = r6.f290103v
            r4.append(r13)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r10.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r13 = r6.f290105x
            r4.append(r13)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            r10.append(r4)
            long r4 = r6.f290106y
            r13 = 0
            int r17 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r17 <= 0) goto L_0x0225
            long r4 = r6.f290107z
            int r20 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r20 != 0) goto L_0x0225
            long r4 = java.lang.System.currentTimeMillis()
            r6.f290107z = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "fullExposure old 2, end:"
            r4.append(r5)
            long r13 = r6.f290107z
            long r2 = r6.f290106y
            long r13 = r13 - r2
            r4.append(r13)
            r4.append(r9)
            int r2 = r6.hashCode()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r2)
        L_0x0225:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r6.f290106y
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r10.append(r2)
            long r2 = r6.f290107z
            r10.append(r2)
            long r2 = r6.f290095n
            jp2.C98962n.m128837b(r2, r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "report "
            r2.append(r3)
            java.lang.String r3 = r10.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            te3.i2 r2 = new te3.i2
            r2.<init>()
            long r3 = r6.f290106y
            r2.f298380p = r3
            long r3 = r6.f290107z
            r2.f298381q = r3
            int r3 = r6.f290075D
            r2.f298371d = r3
            int r3 = r6.f290076E
            r2.f298372e = r3
            int r3 = r6.f290072A
            float r3 = (float) r3
            r2.f298373f = r3
            int r3 = r6.f290073B
            float r3 = (float) r3
            r2.f298374g = r3
            int r3 = r6.f290074C
            float r3 = (float) r3
            r2.f298375h = r3
            long r3 = r6.f290103v
            r2.f298378n = r3
            long r3 = r6.f290105x
            r2.f298379o = r3
            long r3 = r6.f290100s
            r2.f298376i = r3
            long r3 = r6.f290101t
            r2.f298377j = r3
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r6.f290096o
            r4 = 12010(0x2eea, float:1.683E-41)
            r5 = 14648(0x3938, float:2.0526E-41)
            if (r3 == 0) goto L_0x02b0
            boolean r3 = r3.isRecExpAd()
            if (r3 == 0) goto L_0x02b0
            jp2.q r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Zx0()
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r13 = r10.toString()
            r14 = 0
            r9[r14] = r13
            r3.mo59225h(r5, r9)
            goto L_0x02c1
        L_0x02b0:
            r8 = 1
            r14 = 0
            jp2.q r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Zx0()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r8 = r10.toString()
            r9[r14] = r8
            r3.mo59225h(r4, r9)
        L_0x02c1:
            r3 = 730(0x2da, float:1.023E-42)
            ad0.C91998s.m115550d(r3)
            long r13 = r6.f290095n
            vr2.C102236a0.m134765q0(r13)
            com.tencent.mm.autogen.events.NotifyExposeAdEvent r3 = new com.tencent.mm.autogen.events.NotifyExposeAdEvent
            r3.<init>()
            com.tencent.mm.autogen.events.NotifyExposeAdEvent$a r9 = r3.f264940d
            int r13 = r6.f290083b
            r9.f264941a = r13
            r3.publish()
            boolean r3 = sf0.C90188n0.f258915I
            if (r3 == 0) goto L_0x0339
            java.util.Random r3 = new java.util.Random
            long r13 = java.lang.System.currentTimeMillis()
            r3.<init>(r13)
            r9 = 2000(0x7d0, float:2.803E-42)
            int r3 = r3.nextInt(r9)
            r9 = 10
            int r3 = r3 + r9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "run on test kv "
            r13.append(r14)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            r13 = 0
        L_0x0305:
            if (r13 >= r3) goto L_0x033b
            com.tencent.mm.plugin.sns.storage.ADXml r11 = r6.f290096o
            if (r11 == 0) goto L_0x0323
            boolean r11 = r11.isRecExpAd()
            if (r11 == 0) goto L_0x0323
            jp2.q r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Zx0()
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.String r16 = r10.toString()
            r8 = 0
            r15[r8] = r16
            r11.mo59225h(r5, r15)
            goto L_0x0336
        L_0x0323:
            r8 = 0
            r14 = 1
            jp2.q r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Zx0()
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = r15
            java.lang.String r16 = r10.toString()
            r14[r8] = r16
            r8 = r11
            r8.mo59225h(r4, r14)
        L_0x0336:
            int r13 = r13 + 1
            goto L_0x0305
        L_0x0339:
            r9 = 10
        L_0x033b:
            r3 = r12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            te3.l2 r0 = r6.mo138284c()
            java.util.Map<java.lang.String, jp2.d> r4 = r1.f290125e
            java.util.HashMap r4 = (java.util.HashMap) r4
            r5 = r46
            r4.remove(r5)
            r29 = r0
            r28 = r2
            goto L_0x035d
        L_0x0351:
            r21 = r4
            r22 = r5
            r5 = r3
            r3 = r9
            r9 = 10
            r28 = r0
            r29 = r28
        L_0x035d:
            java.util.HashSet<java.lang.String> r0 = r1.f290138r
            r0.remove(r5)
            os2.e0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r0.mo139798DN(r5)
            java.lang.String r4 = ""
            r13 = 9
            if (r2 == 0) goto L_0x0517
            java.util.Map<java.lang.Long, jp2.p> r14 = r1.f290128h
            long r8 = r2.field_snsId
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.HashMap r14 = (java.util.HashMap) r14
            boolean r8 = r14.containsKey(r8)
            if (r8 == 0) goto L_0x04f1
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r2.getTimeLine()
            te3.j00 r8 = r8.ContentObj
            int r8 = r8.f298424e
            r9 = 27
            if (r8 != r9) goto L_0x04f1
            int r8 = r2.field_likeFlag
            r9 = 1
            if (r8 != r9) goto L_0x0393
            r8 = 2
            goto L_0x0394
        L_0x0393:
            r8 = 1
        L_0x0394:
            java.util.Map<java.lang.Long, java.lang.Integer> r9 = r1.f290137q
            long r10 = r2.field_snsId
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.util.HashMap r9 = (java.util.HashMap) r9
            boolean r9 = r9.containsKey(r10)
            if (r9 == 0) goto L_0x03ba
            java.util.Map<java.lang.Long, java.lang.Integer> r9 = r1.f290137q
            long r10 = r2.field_snsId
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r11 = r9.intValue()
            r9 = r11
            goto L_0x03bb
        L_0x03ba:
            r9 = 0
        L_0x03bb:
            java.util.Map<java.lang.Long, java.lang.Integer> r10 = r1.f290136p
            long r14 = r2.field_snsId
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r14)
            if (r10 == 0) goto L_0x03e0
            java.util.Map<java.lang.Long, java.lang.Integer> r10 = r1.f290136p
            long r14 = r2.field_snsId
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r14)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            goto L_0x03e1
        L_0x03e0:
            r10 = 0
        L_0x03e1:
            java.util.Map<java.lang.Long, jp2.p> r14 = r1.f290128h
            long r0 = r2.field_snsId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.Object r0 = r14.remove(r0)
            jp2.p r0 = (jp2.C98973p) r0
            if (r0 == 0) goto L_0x040f
            r1 = 0
            r0.mo138332e(r1)
            r0.mo138333f()
            int r1 = r0.f290183h
            long r14 = (long) r1
            int r1 = r0.f290182g
            long r11 = (long) r1
            long r0 = r0.f290187l
            r30 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r30
            r27 = r8
            r42 = r0
            r0 = r14
            r14 = r11
            r11 = r42
            goto L_0x0417
        L_0x040f:
            r27 = r8
            r0 = 0
            r11 = 0
            r14 = 0
        L_0x0417:
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r31 = r11
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r2.getTimeLine()
            java.lang.String r11 = r11.f283893Id
            r13.append(r11)
            r13.append(r4)
            java.lang.String r11 = r13.toString()
            r12 = 0
            r8[r12] = r11
            r12 = r31
            java.lang.String r26 = r2.getUxinfo()
            r23 = 1
            r8[r23] = r26
            r11 = r14
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = r49
            r13.append(r14)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r19 = 2
            r8[r19] = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            r13.append(r4)
            java.lang.String r9 = r13.toString()
            r13 = 3
            r8[r13] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r10 = 4
            r8[r10] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = r9.toString()
            r1 = 5
            r8[r1] = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r9 = 6
            r8[r9] = r0
            r0 = 7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r9 = r31
            r11.append(r9)
            r11.append(r4)
            java.lang.String r9 = r11.toString()
            r8[r0] = r9
            r0 = 8
            int r9 = r2.field_likeFlag
            r10 = 1
            if (r9 != r10) goto L_0x04b9
            java.lang.String r9 = "1"
            goto L_0x04bb
        L_0x04b9:
            java.lang.String r9 = "0"
        L_0x04bb:
            r8[r0] = r9
            java.lang.String r0 = "%s,%s,%s,%s,%s,%s,%s,%s,%s"
            java.lang.String r0 = java.lang.String.format(r0, r8)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 15155(0x3b33, float:2.1237E-41)
            r8.kvStat(r9, r0)
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r9 = 0
            r8[r9] = r0
            java.lang.String r0 = "15155, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r8)
            r8 = r44
            java.util.HashSet<java.lang.Long> r0 = r8.f290126f
            long r9 = r2.field_snsId
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r0.remove(r9)
            java.util.HashSet<java.lang.Long> r0 = r8.f290126f
            long r9 = r2.field_snsId
            r25 = 1
            long r9 = r9 + r25
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r0.remove(r9)
            goto L_0x04fa
        L_0x04f1:
            r14 = r49
            r8 = r1
            r1 = 5
            r13 = 3
            r19 = 2
            r27 = 0
        L_0x04fa:
            java.util.Map<java.lang.Long, java.lang.Integer> r0 = r8.f290137q
            long r9 = r2.field_snsId
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.remove(r9)
            java.util.Map<java.lang.Long, java.lang.Integer> r0 = r8.f290136p
            long r9 = r2.field_snsId
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.remove(r9)
            r36 = r27
            goto L_0x0520
        L_0x0517:
            r14 = r49
            r8 = r1
            r1 = 5
            r13 = 3
            r19 = 2
            r36 = 0
        L_0x0520:
            java.util.Map<java.lang.String, jp2.o$i> r0 = r8.f290130j
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r5)
            java.lang.String r9 = ", snsId="
            java.lang.String r10 = " "
            if (r0 == 0) goto L_0x0994
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r8.mo138304k(r2)
            if (r0 == 0) goto L_0x053c
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r8.mo138304k(r2)
            java.lang.String r0 = r0.viewId
            r12 = r0
            goto L_0x053d
        L_0x053c:
            r12 = r4
        L_0x053d:
            java.util.Map<java.lang.String, jp2.o$i> r0 = r8.f290130j
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r5)
            r1 = r0
            jp2.o$i r1 = (jp2.C98963o.C98972i) r1
            java.util.Map<java.lang.String, java.lang.Long> r0 = r8.f290123c
            long r25 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Long r11 = java.lang.Long.valueOf(r25)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r5, r11)
            if (r1 != 0) goto L_0x0561
            r11 = r21
            r13 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            return
        L_0x0561:
            r11 = r21
            r13 = r22
            long r14 = r1.f290164a
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r14)
            r22 = r3
            r26 = r4
            long r3 = r1.f290165b
            r17 = 0
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            r18 = r11
            r17 = r12
            if (r0 <= 0) goto L_0x0584
            long r11 = r1.f290172i
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            long r11 = r11 + r3
            r1.f290172i = r11
        L_0x0584:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "onAdRemoved "
            r0.append(r3)
            r3 = r45
            r0.append(r3)
            r0.append(r10)
            r0.append(r5)
            r0.append(r10)
            r0.append(r14)
            r0.append(r9)
            java.lang.String r4 = vr2.C102236a0.m134765q0(r47)
            r0.append(r4)
            java.lang.String r4 = ", snsInfo==null?"
            r0.append(r4)
            if (r2 != 0) goto L_0x05b3
            r11 = 1
            goto L_0x05b4
        L_0x05b3:
            r11 = 0
        L_0x05b4:
            r0.append(r11)
            java.lang.String r4 = ", isImproveUI="
            r0.append(r4)
            boolean r4 = r8.f290139s
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            if (r2 != 0) goto L_0x05d0
            r4 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r13)
            return
        L_0x05d0:
            r4 = r18
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r2.getTimeLine()
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r2.getAdXml()
            boolean r10 = r9.isLinkAd()
            if (r10 == 0) goto L_0x05f2
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r31 = r5
            r30 = 3
            goto L_0x0896
        L_0x05f2:
            boolean r10 = r2.isTurnCardAd()
            if (r10 == 0) goto L_0x062d
            java.util.Map<java.lang.Long, jp2.p> r0 = r8.f290127g
            long r9 = r1.f290169f
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r9)
            jp2.p r0 = (jp2.C98973p) r0
            if (r0 == 0) goto L_0x0619
            int r9 = r2.getLikeFlag()
            if (r9 != 0) goto L_0x0614
            r9 = 0
            r0.mo138332e(r9)
        L_0x0614:
            java.lang.String r0 = r0.mo138331d()
            goto L_0x061b
        L_0x0619:
            r0 = r26
        L_0x061b:
            r31 = r0
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r30 = 6
            goto L_0x0896
        L_0x062d:
            boolean r10 = r2.isCardAd()
            if (r10 != 0) goto L_0x0704
            boolean r10 = r2.isFullCardAd()
            if (r10 == 0) goto L_0x063b
            goto L_0x0704
        L_0x063b:
            boolean r0 = r2.isFinderTopicCardAd()
            if (r0 == 0) goto L_0x0653
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r31 = r5
            r30 = 9
            goto L_0x0896
        L_0x0653:
            boolean r0 = r9.isSlideFullCard()
            if (r0 == 0) goto L_0x066b
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r31 = r5
            r30 = 10
            goto L_0x0896
        L_0x066b:
            int r0 = r1.f290168e
            r10 = 9
            if (r0 == r10) goto L_0x06ca
            r10 = 19
            if (r0 != r10) goto L_0x0676
            goto L_0x06ca
        L_0x0676:
            boolean r0 = r9.isCombinedGridAD()
            if (r0 == 0) goto L_0x06b8
            java.util.Map<java.lang.Long, jp2.p> r0 = r8.f290127g
            long r9 = r1.f290169f
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r9)
            jp2.p r0 = (jp2.C98973p) r0
            if (r0 == 0) goto L_0x0697
            r9 = 0
            r0.mo138332e(r9)
            java.lang.String r0 = r0.mo138331d()
            goto L_0x0699
        L_0x0697:
            r0 = r26
        L_0x0699:
            java.util.HashSet<java.lang.Long> r9 = r8.f290126f
            long r11 = r1.f290169f
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            r9.remove(r10)
            r9 = 11
            r31 = r0
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r30 = 11
            goto L_0x0896
        L_0x06b8:
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r31 = r5
            r30 = 1
            goto L_0x0896
        L_0x06ca:
            java.util.Map<java.lang.Long, jp2.p> r0 = r8.f290127g
            long r9 = r1.f290169f
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r9)
            jp2.p r0 = (jp2.C98973p) r0
            if (r0 == 0) goto L_0x06e5
            r9 = 0
            r0.mo138332e(r9)
            java.lang.String r0 = r0.mo138331d()
            goto L_0x06e7
        L_0x06e5:
            r0 = r26
        L_0x06e7:
            java.util.HashSet<java.lang.Long> r9 = r8.f290126f
            long r11 = r1.f290169f
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            r9.remove(r10)
            r31 = r0
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r30 = 2
            goto L_0x0896
        L_0x0704:
            if (r0 == 0) goto L_0x0886
            te3.j00 r9 = r0.ContentObj
            int r9 = r9.f298424e
            r10 = 15
            if (r9 != r10) goto L_0x0886
            int r0 = r0.sightFolded
            r9 = 1
            if (r0 == r9) goto L_0x0886
            r9 = r14
            java.util.Map<java.lang.Long, jp2.p> r0 = r8.f290127g
            long r11 = r1.f290169f
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.remove(r11)
            jp2.p r0 = (jp2.C98973p) r0
            if (r0 == 0) goto L_0x072f
            r11 = 0
            r0.mo138332e(r11)
            java.lang.String r12 = r0.mo138331d()
            goto L_0x0732
        L_0x072f:
            r11 = 0
            r12 = r26
        L_0x0732:
            java.util.HashSet<java.lang.Long> r14 = r8.f290126f
            r47 = r12
            long r11 = r1.f290169f
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r14.remove(r11)
            boolean r11 = r2.isLongPressGestureAd()
            if (r11 == 0) goto L_0x0875
            if (r0 == 0) goto L_0x07b3
            java.util.LinkedList<kp2.b> r11 = r0.f290186k
            if (r11 == 0) goto L_0x07b3
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x07b3
            java.util.LinkedList<kp2.b> r11 = r0.f290186k     // Catch:{ Exception -> 0x0793 }
            int r11 = r11.size()     // Catch:{ Exception -> 0x0793 }
            r12 = 1
            int r11 = r11 - r12
            java.util.LinkedList<kp2.b> r14 = r0.f290186k     // Catch:{ Exception -> 0x0793 }
            java.lang.Object r14 = r14.get(r11)     // Catch:{ Exception -> 0x0793 }
            kp2.b r14 = (kp2.C99158b) r14     // Catch:{ Exception -> 0x0793 }
            int r15 = r14.f290740b     // Catch:{ Exception -> 0x0793 }
            int r14 = r14.f290741c     // Catch:{ Exception -> 0x0791 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x078d }
            r12.<init>()     // Catch:{ Exception -> 0x078d }
            r16 = r14
            java.lang.String r14 = "longPressGestureAd, playitems.size="
            r12.append(r14)     // Catch:{ Exception -> 0x078b }
            java.util.LinkedList<kp2.b> r0 = r0.f290186k     // Catch:{ Exception -> 0x078b }
            int r0 = r0.size()     // Catch:{ Exception -> 0x078b }
            r12.append(r0)     // Catch:{ Exception -> 0x078b }
            java.lang.String r0 = ", lastIdx="
            r12.append(r0)     // Catch:{ Exception -> 0x078b }
            r12.append(r11)     // Catch:{ Exception -> 0x078b }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x078b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)     // Catch:{ Exception -> 0x078b }
            goto L_0x07b0
        L_0x078b:
            r0 = move-exception
            goto L_0x0797
        L_0x078d:
            r0 = move-exception
            r16 = r14
            goto L_0x0797
        L_0x0791:
            r0 = move-exception
            goto L_0x0795
        L_0x0793:
            r0 = move-exception
            r15 = 0
        L_0x0795:
            r16 = 0
        L_0x0797:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "longPressGestureAd, reportVideoPlay exp="
            r11.append(r12)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x07b0:
            r0 = r16
            goto L_0x07bb
        L_0x07b3:
            java.lang.String r0 = "longPressGestureAd, advideo.playitems is Empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            r0 = 0
            r15 = 0
        L_0x07bb:
            int r11 = r8.f290131k
            if (r11 != 0) goto L_0x07c1
            r11 = 1
            goto L_0x07c2
        L_0x07c1:
            r11 = 2
        L_0x07c2:
            java.lang.String r12 = "timeline_fullcard_longpress_exposure"
            java.lang.String r14 = "SnsAdPressGestureCtrl"
            r21 = r4
            java.lang.String r4 = "reportVideoPlay"
            r16 = r13
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r13)
            r18 = r9
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x0852 }
            r9.<init>()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r10 = "snsid"
            r41 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x084c }
            r7.<init>()     // Catch:{ Exception -> 0x084c }
            r24 = r6
            long r5 = r2.field_snsId     // Catch:{ Exception -> 0x084a }
            r7.append(r5)     // Catch:{ Exception -> 0x084a }
            r5 = r26
            r7.append(r5)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x0848 }
            r9.put(r10, r6)     // Catch:{ Exception -> 0x0848 }
            com.tencent.mm.plugin.sns.storage.ADInfo r6 = r2.getAdInfo()     // Catch:{ Exception -> 0x0848 }
            java.lang.String r6 = r6.uxInfo     // Catch:{ Exception -> 0x0848 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r7 = "uxinfo"
            r9.put(r7, r6)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r6 = "scene"
            r9.put(r6, r11)     // Catch:{ Exception -> 0x0848 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0848 }
            r6.<init>()     // Catch:{ Exception -> 0x0848 }
            java.lang.String r7 = "playCount"
            r6.put(r7, r15)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r7 = "playTotalTime"
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r0 = "extInfo"
            r9.put(r0, r6)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x0848 }
            vr2.C102260r.m134858a(r12, r0)     // Catch:{ Exception -> 0x0848 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0848 }
            r6.<init>()     // Catch:{ Exception -> 0x0848 }
            java.lang.String r7 = "reportVideoPlay, content="
            r6.append(r7)     // Catch:{ Exception -> 0x0848 }
            r6.append(r0)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r0 = ", channel="
            r6.append(r0)     // Catch:{ Exception -> 0x0848 }
            r6.append(r12)     // Catch:{ Exception -> 0x0848 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0848 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ Exception -> 0x0848 }
            goto L_0x0871
        L_0x0848:
            r0 = move-exception
            goto L_0x0858
        L_0x084a:
            r0 = move-exception
            goto L_0x084f
        L_0x084c:
            r0 = move-exception
            r24 = r6
        L_0x084f:
            r5 = r26
            goto L_0x0858
        L_0x0852:
            r0 = move-exception
            r24 = r6
            r41 = r7
            goto L_0x084f
        L_0x0858:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "reportVideoPlay, exp="
            r6.append(r7)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x0871:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r13)
            goto L_0x0881
        L_0x0875:
            r21 = r4
            r24 = r6
            r41 = r7
            r18 = r9
            r16 = r13
            r5 = r26
        L_0x0881:
            r31 = r47
            r30 = 5
            goto L_0x0896
        L_0x0886:
            r21 = r4
            r24 = r6
            r41 = r7
            r16 = r13
            r18 = r14
            r5 = r26
            r31 = r5
            r30 = 4
        L_0x0896:
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r8.mo138304k(r2)
            if (r0 != 0) goto L_0x089f
            r39 = r5
            goto L_0x08a3
        L_0x089f:
            java.lang.String r4 = r0.waidPkg
            r39 = r4
        L_0x08a3:
            jp2.b r4 = new jp2.b
            r4.<init>()
            r4.f290065a = r3
            r4.f290066b = r2
            if (r24 == 0) goto L_0x08bd
            java.lang.String r3 = "getAdContentHeight"
            r5 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            r6 = r24
            int r14 = r6.f290088g
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            goto L_0x08be
        L_0x08bd:
            r14 = 0
        L_0x08be:
            r4.f290067c = r14
            long r5 = r1.f290173j
            r4.f290069e = r5
            long r5 = r1.f290174k
            r4.f290068d = r5
            if (r0 == 0) goto L_0x08e6
            boolean r3 = r0.isWeapp()
            if (r3 == 0) goto L_0x08e6
            boolean r3 = r2.isFullCardAd()
            if (r3 != 0) goto L_0x08e6
            boolean r3 = r2.isSlideFullCardAd()
            if (r3 != 0) goto L_0x08e6
            com.tencent.mm.plugin.sns.storage.ADInfo$b r0 = r0.actionExtWeApp
            java.lang.String r0 = r0.f275645a
            boolean r0 = lo2.C88617x.m110483a(r0)
            r4.f290070f = r0
        L_0x08e6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "feedFullVisibleTime result="
            r0.append(r3)
            long r5 = r1.f290173j
            r0.append(r5)
            java.lang.String r3 = ", id="
            r0.append(r3)
            r5 = r46
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6 = r41
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "feedHalfVisibleTime result="
            r0.append(r7)
            long r9 = r1.f290174k
            r0.append(r9)
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            jp2.j r0 = new jp2.j
            r23 = r0
            r26 = 2
            r9 = r18
            int r3 = (int) r9
            r27 = r3
            r32 = -1
            int r33 = r2.getAdRecSrc()
            long r9 = r1.f290172i
            int r3 = (int) r9
            r34 = r3
            long r9 = r1.f290173j
            int r1 = (int) r9
            r35 = r1
            pe3.b r37 = r8.mo138308o(r2)
            pe3.b r38 = r8.mo138307n(r2)
            r24 = r17
            r25 = r49
            r40 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            f40.C86709a0.m107528h()
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            r1.mo123460f(r0)
            java.lang.String r1 = "removeAndCallSnsAdRemovedListener"
            r4 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            java.lang.String r0 = vr2.C102236a0.m134728W(r2)     // Catch:{ all -> 0x0972 }
            jp2.g r2 = r8.mo138317x(r0)     // Catch:{ all -> 0x0972 }
            if (r2 == 0) goto L_0x098b
            r2.mo133425d(r0)     // Catch:{ all -> 0x0972 }
            goto L_0x098b
        L_0x0972:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "callSnsAdRemovedListener exp= "
            r2.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x098b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            r1 = r21
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            return
        L_0x0994:
            r3 = r45
            r6 = r7
            r1 = r21
            r4 = r22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "can not find onAdRemoved "
            r0.append(r2)
            r0.append(r3)
            r0.append(r10)
            r0.append(r5)
            r0.append(r9)
            java.lang.String r2 = vr2.C102236a0.m134765q0(r47)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jp2.C98963o.mo138312s(int, java.lang.String, long, int):void");
    }

    /* renamed from: t */
    public void mo138313t() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        for (String str : ((HashMap) this.f290130j).keySet()) {
            C98972i iVar = (C98972i) ((HashMap) this.f290130j).get(str);
            Log.m105924i("MicroMsg.SnsAdStatistic", "onPause Key " + str);
            iVar.f290172i = iVar.f290172i + Util.ticksToNow(iVar.f290165b);
            iVar.f290165b = 0;
            C98973p pVar = (C98973p) ((HashMap) this.f290127g).get(Long.valueOf(iVar.f290169f));
            if (pVar != null) {
                pVar.mo138329b();
            }
            C98973p pVar2 = (C98973p) ((HashMap) this.f290128h).get(Long.valueOf(iVar.f290169f));
            if (pVar2 != null) {
                pVar2.mo138329b();
            }
        }
        for (Map.Entry value : ((HashMap) this.f290125e).entrySet()) {
            C98955d dVar = (C98955d) value.getValue();
            if (dVar != null) {
                int i = C94866e1.f274866V;
                dVar.mo138282a(false);
                if (!Util.isNullOrNil(dVar.f290079H)) {
                    if (((HashMap) this.f290130j).get(dVar.f290079H) != null) {
                        C98972i iVar2 = (C98972i) ((HashMap) this.f290130j).get(dVar.f290079H);
                        long j = iVar2.f290171h;
                        if (j > 0) {
                            long ticksToNow = Util.ticksToNow(j);
                            iVar2.f290173j += ticksToNow;
                            iVar2.f290171h = 0;
                            Log.m105918d("MicroMsg.SnsAdStatistic", "feedFullVisibleTime end by pause, duration=" + ticksToNow + ", total=" + iVar2.f290173j + ", id=" + dVar.f290079H);
                        }
                        long j2 = iVar2.f290175l;
                        if (j2 > 0) {
                            long ticksToNow2 = Util.ticksToNow(j2);
                            iVar2.f290174k += ticksToNow2;
                            iVar2.f290175l = 0;
                            Log.m105918d("MicroMsg.SnsAdStatistic", "--feedHalfVisibleTime, end by pause, duration=" + ticksToNow2 + ", total=" + iVar2.f290174k + ", id=" + dVar.f290079H);
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: u */
    public void mo138314u(long j) {
        SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        MMHandlerThread.postToMainThread(new C98970g(j));
        SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: v */
    public void mo138315v() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        long currentTicks = Util.currentTicks();
        for (String str : ((HashMap) this.f290130j).keySet()) {
            C98972i iVar = (C98972i) ((HashMap) this.f290130j).get(str);
            Log.m105924i("MicroMsg.SnsAdStatistic", "onResume Key " + str);
            iVar.f290165b = currentTicks;
            C98973p pVar = (C98973p) ((HashMap) this.f290127g).get(Long.valueOf(iVar.f290169f));
            if (pVar != null) {
                pVar.mo138330c();
            }
            C98973p pVar2 = (C98973p) ((HashMap) this.f290128h).get(Long.valueOf(iVar.f290169f));
            if (pVar2 != null) {
                pVar2.mo138330c();
            }
        }
        for (Map.Entry value : ((HashMap) this.f290125e).entrySet()) {
            C98955d dVar = (C98955d) value.getValue();
            if (dVar != null) {
                int i = C94866e1.f274866V;
                boolean z = false;
                dVar.mo138282a(false);
                if (!Util.isNullOrNil(dVar.f290079H)) {
                    if (((HashMap) this.f290130j).get(dVar.f290079H) != null) {
                        C98972i iVar2 = (C98972i) ((HashMap) this.f290130j).get(dVar.f290079H);
                        SnsMethodCalculate.markStartTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (dVar.f290078G == 1) {
                            z = true;
                        }
                        SnsMethodCalculate.markEndTimeMs("getIsFullExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                        if (z) {
                            iVar2.f290171h = Util.currentTicks();
                            Log.m105918d("MicroMsg.SnsAdStatistic", "feedFullVisibleTime begin, id=" + dVar.f290079H);
                        } else {
                            SnsMethodCalculate.markStartTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                            boolean z2 = dVar.f290081J;
                            SnsMethodCalculate.markEndTimeMs("isHalfExposed", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                            if (z2) {
                                iVar2.f290175l = Util.currentTicks();
                                Log.m105918d("MicroMsg.SnsAdStatistic", "feedHalfVisibleTime begin, id=" + dVar.f290079H);
                            }
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: w */
    public void mo138316w(long j) {
        SnsMethodCalculate.markStartTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        MMHandlerThread.postToMainThread(new C98969f(j));
        SnsMethodCalculate.markEndTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: x */
    public C98957g mo138317x(String str) {
        SnsMethodCalculate.markStartTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        try {
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
                return null;
            }
            C98957g gVar = (C98957g) ((HashMap) this.f290129i).remove(str);
            SnsMethodCalculate.markEndTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return gVar;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdStatistic", "removeAdRemovedListener exp= " + th.toString());
            SnsMethodCalculate.markEndTimeMs("removeAdRemovedListener", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
            return null;
        }
    }

    /* renamed from: y */
    public void mo138318y(long j, long j2) {
        SnsMethodCalculate.markStartTimeMs("setCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        MMHandlerThread.postToMainThread(new C98971h(j, j2));
        SnsMethodCalculate.markEndTimeMs("setCurPlayTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }

    /* renamed from: z */
    public void mo138319z(int i, View view, Activity activity) {
        SnsMethodCalculate.markStartTimeMs("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        this.f290133m = i;
        this.f290134n = view;
        this.f290135o = activity;
        SnsMethodCalculate.markEndTimeMs("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
    }
}
