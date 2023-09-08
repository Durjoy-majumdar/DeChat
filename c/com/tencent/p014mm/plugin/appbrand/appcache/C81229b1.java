package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.SystemClock;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.appbrand.appcache.C81282k1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.launching.C83396o0;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.report.model.kv_14609;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84215p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ei0.C86516a;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import junit.framework.Assert;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.b1 */
public final class C81229b1 implements C81282k1.C81284b {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, Boolean> f238601a = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.b1$b */
    public static final class C81231b implements C81282k1.C81283a {

        /* renamed from: a */
        public final C86516a f238602a;

        /* renamed from: b */
        public final int f238603b;

        /* renamed from: c */
        public final boolean f238604c;

        /* renamed from: d */
        public C81232a f238605d;

        /* renamed from: e */
        public ArrayList<IDKey> f238606e;

        /* renamed from: f */
        public long f238607f = 0;

        /* renamed from: g */
        public long f238608g = 0;

        /* renamed from: h */
        public long f238609h = 0;

        /* renamed from: i */
        public long f238610i = 0;

        /* renamed from: j */
        public long f238611j = 0;

        /* renamed from: k */
        public kv_14609 f238612k;

        /* renamed from: com.tencent.mm.plugin.appbrand.appcache.b1$b$a */
        public enum C81232a {
            DOWNLOAD(1),
            UPDATE(4),
            LIB_UPDATE(7),
            INCREMENTAL_UPDATE(10),
            LIB_INCREMENTAL_UPDATE(13);
            

            /* renamed from: d */
            public final int f238619d;

            /* access modifiers changed from: public */
            C81232a(int i) {
                this.f238619d = i;
            }

            /* renamed from: a */
            public int mo113487a() {
                return this.f238619d;
            }
        }

        public C81231b(C86516a aVar, C81230a aVar2) {
            this.f238602a = aVar;
            String str = aVar.f251357l;
            boolean z = true;
            this.f238603b = !Util.isNullOrNil(str) && Boolean.TRUE.equals(C81229b1.f238601a.get(str)) ? 776 : 368;
            String[] split = aVar.f251357l.split(Pattern.quote("$"));
            this.f238604c = (split == null ? -1 : split.length) != 2 ? false : z;
        }

        /* renamed from: a */
        public void mo113474a(boolean z) {
            if (!z) {
                mo113485l(57);
            } else {
                kv_14609 kv_14609 = this.f238612k;
                if (kv_14609 != null) {
                    C86516a aVar = this.f238602a;
                    if (aVar instanceof C81234b4) {
                        kv_14609.f245677s = (int) C86013q1.m106451l(((C81234b4) aVar).mo113488i());
                    }
                }
            }
            if (this.f238612k != null) {
                this.f238612k.f245683y = SystemClock.elapsedRealtime() - this.f238607f;
            }
        }

        /* renamed from: b */
        public void mo113475b(boolean z) {
            C81232a aVar = C81232a.DOWNLOAD;
            C86516a aVar2 = this.f238602a;
            int i = 1;
            if (aVar2 instanceof C81300o2) {
                this.f238605d = "@LibraryAppId".equals(aVar2.f251357l) ? C81232a.LIB_INCREMENTAL_UPDATE : C81232a.INCREMENTAL_UPDATE;
                C86516a aVar3 = this.f238602a;
                String str = aVar3.f251357l;
                C81300o2 o2Var = (C81300o2) aVar3;
                kv_14609 kv_14609 = new kv_14609(str, o2Var.f238724q, o2Var.f238725r);
                this.f238612k = kv_14609;
                kv_14609.f245680v = Util.nowMilliSecond();
            } else if ("@LibraryAppId".equals(aVar2.f251357l)) {
                this.f238605d = C81232a.LIB_UPDATE;
            } else if (C81289m.C81290a.m99664b(this.f238602a.f251359n)) {
                WxaPkgWrappingInfo b = C83396o0.m102337b(this.f238602a.f251357l, 1);
                if (b != null) {
                    aVar = C81232a.UPDATE;
                }
                this.f238605d = aVar;
                C86516a aVar4 = this.f238602a;
                kv_14609 kv_146092 = new kv_14609(aVar4.f251357l, b == null ? 0 : b.pkgVersion, aVar4.f251358m);
                this.f238612k = kv_146092;
                kv_146092.f245680v = Util.nowMilliSecond();
            } else {
                C86516a aVar5 = this.f238602a;
                if (aVar5 instanceof C81296n2) {
                    String str2 = aVar5.f251357l;
                    int i2 = aVar5.f251359n;
                    kv_14609 kv_146093 = new kv_14609(str2, 0, 0);
                    kv_146093.f245669h = i2 + 1;
                    this.f238612k = kv_146093;
                    kv_146093.f245680v = Util.nowMilliSecond();
                }
                this.f238605d = aVar;
            }
            int ordinal = this.f238605d.ordinal();
            if (ordinal != 0) {
                i = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 0 : 46 : 35 : 20 : 10;
            }
            mo113485l(i);
            this.f238607f = SystemClock.elapsedRealtime();
            if (this.f238602a.f251361p != null) {
                this.f238612k.f245660G = this.f238602a.f251361p.f259641f;
                this.f238612k.f245661H = this.f238602a.f251361p.f259640e ? 1 : 0;
                this.f238612k.f245662I = this.f238602a.f251361p.f259642g;
            }
        }

        /* renamed from: c */
        public void mo113476c() {
            mo113485l(32);
        }

        /* renamed from: d */
        public void mo113477d(boolean z, String str) {
            boolean z2 = z;
            C81232a aVar = C81232a.LIB_INCREMENTAL_UPDATE;
            if (this.f238608g <= 0 && BuildInfo.DEBUG) {
                Assert.fail("Why the hell verifyStartMs is minus");
            }
            long nowMilliSecond = Util.nowMilliSecond();
            this.f238609h = nowMilliSecond;
            long j = nowMilliSecond - this.f238608g;
            C86516a aVar2 = this.f238602a;
            Log.m105925i("MicroMsg.AppBrand.PkgDownloadReporterImpl", "onVerifyEnd, cost[%dms], appId[%s], version[%d]", Long.valueOf(j), aVar2.f251357l, Integer.valueOf(aVar2.f251358m));
            int ordinal = this.f238605d.ordinal();
            mo113485l(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 0 : z2 ? 50 : 51 : z2 ? 42 : 43 : z2 ? 25 : 26 : z2 ? 15 : 16 : z2 ? 6 : 7);
            if (this.f238610i > 0 && !z2) {
                mo113486m(697, 11);
            }
            kv_14609 kv_14609 = this.f238612k;
            if (kv_14609 != null && kv_14609.mo116818a() > 0 && !z2) {
                mo113485l(58);
            }
            try {
                C117407d.INSTANCE.mo160124a(this.f238606e, false);
                this.f238606e.clear();
            } catch (Exception unused) {
            }
            C81232a aVar3 = C81232a.LIB_UPDATE;
            C81232a aVar4 = this.f238605d;
            C84240s.m103835a((aVar3 == aVar4 || aVar == aVar4) ? "" : this.f238602a.f251357l, aVar4.mo113487a() + 1, z2 ? 1 : 2, j, this.f238604c);
            if (!z2) {
                C86516a aVar5 = this.f238602a;
                C84240s.m103846l(aVar5.f251357l, 22, aVar5.f251359n + 1);
            }
            kv_14609 kv_146092 = this.f238612k;
            if (kv_146092 != null) {
                kv_146092.mo116819b();
                C81232a aVar6 = this.f238605d;
                if (aVar6 != C81232a.INCREMENTAL_UPDATE && aVar6 != aVar) {
                    this.f238612k.mo116826h(z2);
                } else if (z2) {
                    this.f238612k.mo116826h(true);
                    this.f238612k.mo116827i(true);
                }
                if (!z2) {
                    this.f238612k.mo116821d(6);
                }
                this.f238612k.mo116820c();
                kv_14609 kv_146093 = this.f238612k;
                CdnLogic.WebPageProfile webPageProfile = kv_146093.f245665d;
                if (webPageProfile != null) {
                    C84215p.m103811a(kv_146093.f245666e, kv_146093, this.f238602a, webPageProfile, str, this.f238610i, this.f238611j, this.f238608g, this.f238609h);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:125:0x0177 A[Catch:{ Exception -> 0x0163 }] */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x01b3 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo113478e(com.tencent.p014mm.pluginsdk.res.downloader.model.C85639p r18) {
            /*
                r17 = this;
                r1 = r17
                long r2 = r1.f238607f
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x0013
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 == 0) goto L_0x0013
                java.lang.String r0 = "Why the hell downloadStartMs is minus"
                junit.framework.Assert.fail(r0)
            L_0x0013:
                long r2 = android.os.SystemClock.elapsedRealtime()
                long r4 = r1.f238607f
                long r2 = r2 - r4
                r4 = 2
                r5 = 1
                r12 = 0
                if (r18 == 0) goto L_0x0027
                int r0 = r18.mo119188c()
                if (r0 != r4) goto L_0x0027
                r13 = 1
                goto L_0x0028
            L_0x0027:
                r13 = 0
            L_0x0028:
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r0 = r1.f238605d
                r14 = 4
                r15 = 404(0x194, float:5.66E-43)
                r6 = 23
                r11 = 410(0x19a, float:5.75E-43)
                r9 = 3
                if (r0 == 0) goto L_0x0124
                if (r13 == 0) goto L_0x0044
                ei0.a r0 = r1.f238602a
                java.lang.String r0 = r0.mo119181c()
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r0 != 0) goto L_0x0044
                r0 = 1
                goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                ei0.a r7 = r1.f238602a
                boolean r7 = r7 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81234b4
                if (r13 != 0) goto L_0x0055
                if (r18 == 0) goto L_0x0055
                int r8 = r18.mo119187b()
                if (r8 != r15) goto L_0x0055
                r8 = 1
                goto L_0x0056
            L_0x0055:
                r8 = 0
            L_0x0056:
                if (r13 != 0) goto L_0x0062
                if (r18 == 0) goto L_0x0062
                int r10 = r18.mo119187b()
                if (r10 != r11) goto L_0x0062
                r10 = 1
                goto L_0x0063
            L_0x0062:
                r10 = 0
            L_0x0063:
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r11 = r1.f238605d
                int r11 = r11.ordinal()
                if (r11 == 0) goto L_0x00e0
                if (r11 == r5) goto L_0x00e0
                if (r11 == r4) goto L_0x00bf
                if (r11 == r9) goto L_0x009a
                if (r11 == r14) goto L_0x0075
                goto L_0x0124
            L_0x0075:
                if (r13 == 0) goto L_0x007a
                r7 = 47
                goto L_0x007c
            L_0x007a:
                r7 = 48
            L_0x007c:
                r1.mo113485l(r7)
                if (r0 == 0) goto L_0x0086
                r0 = 45
                r1.mo113485l(r0)
            L_0x0086:
                if (r13 != 0) goto L_0x0124
                if (r8 == 0) goto L_0x0091
                r0 = 62
                r1.mo113485l(r0)
                goto L_0x0124
            L_0x0091:
                if (r10 == 0) goto L_0x0124
                r0 = 63
                r1.mo113485l(r0)
                goto L_0x0124
            L_0x009a:
                if (r13 == 0) goto L_0x009f
                r7 = 36
                goto L_0x00a1
            L_0x009f:
                r7 = 37
            L_0x00a1:
                r1.mo113485l(r7)
                if (r0 == 0) goto L_0x00ab
                r0 = 39
                r1.mo113485l(r0)
            L_0x00ab:
                if (r13 != 0) goto L_0x0124
                if (r8 == 0) goto L_0x00b6
                r0 = 94
                r1.mo113485l(r0)
                goto L_0x0124
            L_0x00b6:
                if (r10 == 0) goto L_0x0124
                r0 = 95
                r1.mo113485l(r0)
                goto L_0x0124
            L_0x00bf:
                if (r13 == 0) goto L_0x00c4
                r7 = 21
                goto L_0x00c6
            L_0x00c4:
                r7 = 22
            L_0x00c6:
                r1.mo113485l(r7)
                if (r0 == 0) goto L_0x00ce
                r1.mo113485l(r6)
            L_0x00ce:
                if (r13 != 0) goto L_0x0124
                if (r8 == 0) goto L_0x00d8
                r0 = 60
                r1.mo113485l(r0)
                goto L_0x0124
            L_0x00d8:
                if (r10 == 0) goto L_0x0124
                r0 = 61
                r1.mo113485l(r0)
                goto L_0x0124
            L_0x00e0:
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r11 = com.tencent.p014mm.plugin.appbrand.appcache.C81229b1.C81231b.C81232a.DOWNLOAD
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r6 = r1.f238605d
                if (r11 != r6) goto L_0x00ef
                if (r13 == 0) goto L_0x00ea
                r6 = 2
                goto L_0x00eb
            L_0x00ea:
                r6 = 3
            L_0x00eb:
                r1.mo113485l(r6)
                goto L_0x00fd
            L_0x00ef:
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r11 = com.tencent.p014mm.plugin.appbrand.appcache.C81229b1.C81231b.C81232a.UPDATE
                if (r11 != r6) goto L_0x00fd
                if (r13 == 0) goto L_0x00f8
                r6 = 11
                goto L_0x00fa
            L_0x00f8:
                r6 = 12
            L_0x00fa:
                r1.mo113485l(r6)
            L_0x00fd:
                if (r0 == 0) goto L_0x0109
                if (r7 == 0) goto L_0x0104
                r0 = 18
                goto L_0x0106
            L_0x0104:
                r0 = 17
            L_0x0106:
                r1.mo113485l(r0)
            L_0x0109:
                if (r13 != 0) goto L_0x0124
                if (r8 == 0) goto L_0x0118
                if (r7 == 0) goto L_0x0112
                r0 = 92
                goto L_0x0114
            L_0x0112:
                r0 = 90
            L_0x0114:
                r1.mo113485l(r0)
                goto L_0x0124
            L_0x0118:
                if (r10 == 0) goto L_0x0124
                if (r7 == 0) goto L_0x011f
                r0 = 93
                goto L_0x0121
            L_0x011f:
                r0 = 91
            L_0x0121:
                r1.mo113485l(r0)
            L_0x0124:
                if (r13 != 0) goto L_0x0159
                ei0.a r0 = r1.f238602a
                java.lang.String r0 = r0.f251357l
                java.lang.String r6 = "@LibraryAppId"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L_0x0159
                r0 = 999(0x3e7, float:1.4E-42)
                ei0.a r6 = r1.f238602a
                int r6 = r6.f251359n
                if (r0 == r6) goto L_0x0159
                if (r18 == 0) goto L_0x014d
                int r0 = r18.mo119187b()
                if (r0 == r15) goto L_0x014a
                int r0 = r18.mo119187b()
                r6 = 403(0x193, float:5.65E-43)
                if (r0 != r6) goto L_0x014d
            L_0x014a:
                r6 = 23
                goto L_0x014f
            L_0x014d:
                r6 = 19
            L_0x014f:
                ei0.a r0 = r1.f238602a
                java.lang.String r7 = r0.f251357l
                int r0 = r0.f251359n
                int r0 = r0 + r5
                com.tencent.p014mm.plugin.appbrand.report.C84240s.m103846l(r7, r6, r0)
            L_0x0159:
                if (r18 == 0) goto L_0x0166
                int r0 = r18.mo119188c()     // Catch:{ Exception -> 0x0163 }
                if (r0 != r4) goto L_0x0166
                r8 = 1
                goto L_0x0171
            L_0x0163:
                r0 = move-exception
                r15 = 3
                goto L_0x019f
            L_0x0166:
                if (r18 == 0) goto L_0x0170
                int r0 = r18.mo119188c()     // Catch:{ Exception -> 0x0163 }
                if (r0 != r14) goto L_0x0170
                r8 = 3
                goto L_0x0171
            L_0x0170:
                r8 = 2
            L_0x0171:
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81229b1.C81231b.C81232a.LIB_UPDATE     // Catch:{ Exception -> 0x0163 }
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r6 = r1.f238605d     // Catch:{ Exception -> 0x0163 }
                if (r0 == r6) goto L_0x0181
                com.tencent.mm.plugin.appbrand.appcache.b1$b$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81229b1.C81231b.C81232a.LIB_INCREMENTAL_UPDATE     // Catch:{ Exception -> 0x0163 }
                if (r0 != r6) goto L_0x017c
                goto L_0x0181
            L_0x017c:
                ei0.a r0 = r1.f238602a     // Catch:{ Exception -> 0x0163 }
                java.lang.String r0 = r0.f251357l     // Catch:{ Exception -> 0x0163 }
                goto L_0x0183
            L_0x0181:
                java.lang.String r0 = ""
            L_0x0183:
                int r7 = r6.mo113487a()     // Catch:{ Exception -> 0x0163 }
                boolean r11 = r1.f238604c     // Catch:{ Exception -> 0x0163 }
                r6 = r0
                r15 = 3
                r9 = r2
                com.tencent.p014mm.plugin.appbrand.report.C84240s.m103835a(r6, r7, r8, r9, r11)     // Catch:{ Exception -> 0x019e }
                kj2.d r0 = kj2.C117407d.INSTANCE     // Catch:{ Exception -> 0x019c }
                java.util.ArrayList<com.tencent.mars.smc.IDKey> r6 = r1.f238606e     // Catch:{ Exception -> 0x019c }
                r0.mo160124a(r6, r12)     // Catch:{ Exception -> 0x019c }
                java.util.ArrayList<com.tencent.mars.smc.IDKey> r0 = r1.f238606e     // Catch:{ Exception -> 0x019c }
                r0.clear()     // Catch:{ Exception -> 0x019c }
                goto L_0x01af
            L_0x019c:
                goto L_0x01af
            L_0x019e:
                r0 = move-exception
            L_0x019f:
                java.lang.Object[] r6 = new java.lang.Object[r5]
                ei0.a r7 = r1.f238602a
                java.lang.String r7 = r7.f251357l
                r6[r12] = r7
                java.lang.String r7 = "MicroMsg.AppBrand.PkgDownloadReporterImpl"
                java.lang.String r8 = "report onEnd, appId %s"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r6)
            L_0x01af:
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                if (r0 == 0) goto L_0x02b9
                if (r18 == 0) goto L_0x0222
                android.os.Bundle r0 = r18.mo119186a()
                if (r0 == 0) goto L_0x0222
                android.os.Bundle r0 = r18.mo119186a()
                java.lang.String r6 = "RESPONSE_KEY_FALLBACK_USE_SYSTEM_URL_CONNECTION"
                boolean r0 = r0.getBoolean(r6, r12)
                if (r0 == 0) goto L_0x01ce
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.f245657D = r14
                r0.f245664K = r5
                goto L_0x01f4
            L_0x01ce:
                android.os.Bundle r0 = r18.mo119186a()
                java.lang.String r6 = "RESPONSE_KEY_USE_QUIC"
                boolean r0 = r0.getBoolean(r6, r12)
                if (r0 == 0) goto L_0x01df
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.f245657D = r5
                goto L_0x01f4
            L_0x01df:
                android.os.Bundle r0 = r18.mo119186a()
                java.lang.String r6 = "RESPONSE_KEY_USE_HTTP2"
                boolean r0 = r0.getBoolean(r6, r12)
                if (r0 == 0) goto L_0x01f0
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.f245657D = r4
                goto L_0x01f4
            L_0x01f0:
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.f245657D = r12
            L_0x01f4:
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                android.os.Bundle r6 = r18.mo119186a()
                java.lang.String r7 = "RESPONSE_KEY_CRONET_PERFORMANCE"
                android.os.Parcelable r6 = r6.getParcelable(r7)
                com.tencent.mars.cdn.CdnLogic$WebPageProfile r6 = (com.tencent.mars.cdn.CdnLogic.WebPageProfile) r6
                r0.f245665d = r6
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                android.os.Bundle r6 = r18.mo119186a()
                java.lang.String r7 = "RESPONSE_KEY_USE_NEWDNS"
                boolean r6 = r6.getBoolean(r7)
                r0.f245659F = r6
                android.os.Bundle r0 = r18.mo119186a()
                java.lang.String r6 = "RESPONSE_KEY_USE_PLAIN_CRONET_LOGIC"
                boolean r0 = r0.getBoolean(r6)
                if (r0 == 0) goto L_0x0222
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.f245664K = r4
            L_0x0222:
                if (r13 != 0) goto L_0x0279
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116819b()
                if (r18 != 0) goto L_0x0231
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116821d(r15)
                goto L_0x0252
            L_0x0231:
                int r0 = r18.mo119187b()
                r6 = 410(0x19a, float:5.75E-43)
                if (r0 != r6) goto L_0x023f
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116821d(r5)
                goto L_0x0252
            L_0x023f:
                int r0 = r18.mo119187b()
                r5 = 404(0x194, float:5.66E-43)
                if (r0 != r5) goto L_0x024d
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116821d(r4)
                goto L_0x0252
            L_0x024d:
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116821d(r15)
            L_0x0252:
                ei0.a r0 = r1.f238602a
                boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81234b4
                if (r0 == 0) goto L_0x025d
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116828j(r2)
            L_0x025d:
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116820c()
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r5 = r1.f238612k
                com.tencent.mars.cdn.CdnLogic$WebPageProfile r7 = r5.f245665d
                if (r7 == 0) goto L_0x02aa
                com.tencent.mm.plugin.appbrand.report.quality.QualitySession r4 = r5.f245666e
                ei0.a r6 = r1.f238602a
                r8 = 0
                r9 = 0
                r11 = 0
                r13 = 0
                r15 = 0
                com.tencent.p014mm.plugin.appbrand.report.quality.C84215p.m103811a(r4, r5, r6, r7, r8, r9, r11, r13, r15)
                goto L_0x02aa
            L_0x0279:
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                ei0.a r4 = r1.f238602a
                java.lang.String r4 = r4.mo119181c()
                long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
                r0.f245658E = r4
                ei0.a r0 = r1.f238602a
                boolean r4 = r0 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81300o2
                if (r4 == 0) goto L_0x029c
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r4 = r1.f238612k
                java.lang.String r0 = r0.mo119181c()
                long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
                int r0 = (int) r5
                r4.mo116825g(r0)
                goto L_0x02aa
            L_0x029c:
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r4 = r1.f238612k
                java.lang.String r0 = r0.mo119181c()
                long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
                int r0 = (int) r5
                r4.mo116823e(r0)
            L_0x02aa:
                ei0.a r0 = r1.f238602a
                boolean r4 = r0 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81234b4
                if (r4 != 0) goto L_0x02b9
                boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81300o2
                if (r0 != 0) goto L_0x02b9
                com.tencent.mm.plugin.appbrand.report.model.kv_14609 r0 = r1.f238612k
                r0.mo116824f(r2)
            L_0x02b9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.C81229b1.C81231b.mo113478e(com.tencent.mm.pluginsdk.res.downloader.model.p):void");
        }

        /* renamed from: f */
        public void mo113479f() {
            mo113485l(56);
        }

        /* renamed from: g */
        public void mo113480g() {
            C81232a aVar = C81232a.LIB_UPDATE;
            C81232a aVar2 = this.f238605d;
            if (aVar != aVar2 && C81232a.LIB_INCREMENTAL_UPDATE != aVar2) {
                C86516a aVar3 = this.f238602a;
                C84240s.m103846l(aVar3.f251357l, 20, aVar3.f251359n + 1);
            }
        }

        /* renamed from: h */
        public void mo113481h() {
            int ordinal = this.f238605d.ordinal();
            mo113485l((ordinal == 2 || ordinal == 4) ? 33 : 34);
        }

        /* renamed from: i */
        public void mo113482i() {
            this.f238610i = Util.nowMilliSecond();
            mo113486m(697, 1);
        }

        /* renamed from: j */
        public void mo113483j() {
            this.f238608g = Util.nowMilliSecond();
            int ordinal = this.f238605d.ordinal();
            if (ordinal == 0) {
                mo113485l(5);
            } else if (ordinal == 1) {
                mo113485l(14);
            } else if (ordinal == 2) {
                mo113485l(24);
            } else if (ordinal == 3) {
                mo113485l(41);
            } else if (ordinal == 4) {
                mo113485l(49);
            }
        }

        /* renamed from: k */
        public void mo113484k(int i) {
            if (this.f238610i <= 0 && BuildInfo.DEBUG) {
                Assert.fail("Why the hell incrementalMergeStartMs is minus");
            }
            long nowMilliSecond = Util.nowMilliSecond();
            this.f238611j = nowMilliSecond;
            long j = nowMilliSecond - this.f238610i;
            C81300o2 o2Var = (C81300o2) this.f238602a;
            Log.m105925i("MicroMsg.AppBrand.PkgDownloadReporterImpl", "onIncrementalMergeEnd, cost[%dms], appId[%s], version[%d->%d]", Long.valueOf(j), o2Var.f251357l, Integer.valueOf(o2Var.f238724q), Integer.valueOf(o2Var.f238725r));
            if (i == 0) {
                mo113486m(697, 2);
            } else if (i < 0) {
                mo113486m(697, -i);
            } else if (i == 1) {
                mo113486m(697, 10);
            }
            try {
                C117407d.INSTANCE.mo160124a(this.f238606e, false);
                this.f238606e.clear();
            } catch (Exception unused) {
            }
            kv_14609 kv_14609 = this.f238612k;
            if (kv_14609 == null) {
                return;
            }
            if (i != 0) {
                if (i == -4) {
                    kv_14609.mo116821d(4);
                } else {
                    kv_14609.mo116821d(5);
                }
                this.f238612k.mo116819b();
                this.f238612k.mo116820c();
                kv_14609 kv_146092 = this.f238612k;
                CdnLogic.WebPageProfile webPageProfile = kv_146092.f245665d;
                if (webPageProfile != null) {
                    C84215p.m103811a(kv_146092.f245666e, kv_146092, this.f238602a, webPageProfile, (String) null, this.f238610i, this.f238611j, 0, 0);
                    return;
                }
                return;
            }
            kv_14609.mo116823e((int) C86013q1.m106451l(((C81300o2) this.f238602a).mo113571j()));
        }

        /* renamed from: l */
        public final void mo113485l(int i) {
            mo113486m(this.f238603b, i);
        }

        /* renamed from: m */
        public final void mo113486m(int i, int i2) {
            if (this.f238606e == null) {
                this.f238606e = new ArrayList<>();
            }
            this.f238606e.add(new IDKey(i, i2, 1));
        }
    }

    /* renamed from: b */
    public static boolean m99529b(C86516a aVar) {
        if (aVar == null) {
            return false;
        }
        return C81372u2.class == aVar.getClass() || C81296n2.class == aVar.getClass() || C81300o2.class == aVar.getClass() || C81234b4.class == aVar.getClass();
    }

    /* renamed from: c */
    public static void m99530c(String str) {
        if (!Util.isNullOrNil(str)) {
            f238601a.put(str, Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public C81282k1.C81283a mo113473a(C86516a aVar) {
        if (m99529b(aVar)) {
            return new C81231b(aVar, (C81230a) null);
        }
        return null;
    }
}
