package com.tencent.p014mm.wexnet;

import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/wexnet/WeXNet;", "", "<init>", "()V", "Companion", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.wexnet.WeXNet */
public final class WeXNet {
    public static final C86022a Companion = new C86022a((C8480h) null);

    /* renamed from: com.tencent.mm.wexnet.WeXNet$a */
    public static final class C86022a {

        /* renamed from: com.tencent.mm.wexnet.WeXNet$a$a */
        public static final class C86023a extends Exception {
            public C86023a() {
                super("xent lib not loaded");
            }
        }

        public C86022a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:110:0x027b A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0066 A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x009f A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1 A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01b5 A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01c3 A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01d0 A[Catch:{ all -> 0x029d }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01ee A[SYNTHETIC, Splitter:B:76:0x01ee] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo120038a() {
            /*
                r24 = this;
                com.tencent.mm.wexnet.d r1 = com.tencent.p014mm.wexnet.C86026d.f250513a
                monitor-enter(r1)
                boolean r0 = com.tencent.p014mm.wexnet.C86026d.f250514b     // Catch:{ all -> 0x0339 }
                r2 = 0
                r3 = 1
                r4 = 0
                if (r0 == 0) goto L_0x000d
                monitor-exit(r1)
                goto L_0x029a
            L_0x000d:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0339 }
                java.lang.String r5 = "xnet_using_debug_so"
                boolean r0 = r0.getBoolean(r5, r4)     // Catch:{ all -> 0x0339 }
                r5 = 93
                if (r0 == 0) goto L_0x00f9
                com.tencent.mm.wexnet.c$a r6 = com.tencent.p014mm.wexnet.C86024c.f250512a     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = r6.mo120045a()     // Catch:{ all -> 0x0339 }
                android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r8 = r7.getPath()     // Catch:{ all -> 0x0339 }
                if (r8 == 0) goto L_0x0046
                java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r4, r4)     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = r7.getPath()     // Catch:{ all -> 0x0339 }
                boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x0339 }
                if (r9 != 0) goto L_0x0046
                android.net.Uri$Builder r7 = r7.buildUpon()     // Catch:{ all -> 0x0339 }
                android.net.Uri$Builder r7 = r7.path(r8)     // Catch:{ all -> 0x0339 }
                android.net.Uri r7 = r7.build()     // Catch:{ all -> 0x0339 }
            L_0x0046:
                com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0339 }
                com.tencent.mm.vfs.f0$h r7 = r8.mo177799l(r7, r2)     // Catch:{ all -> 0x0339 }
                boolean r9 = r7.mo177810a()     // Catch:{ all -> 0x0339 }
                if (r9 != 0) goto L_0x0053
                goto L_0x0063
            L_0x0053:
                com.tencent.mm.vfs.FileSystem$c r9 = r7.f348991a     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = r7.f348992b     // Catch:{ all -> 0x0339 }
                com.tencent.mm.vfs.b0 r7 = r9.mo119945q(r7)     // Catch:{ all -> 0x0339 }
                if (r7 == 0) goto L_0x0063
                boolean r7 = r7.f250476f     // Catch:{ all -> 0x0339 }
                if (r7 != 0) goto L_0x0063
                r7 = 1
                goto L_0x0064
            L_0x0063:
                r7 = 0
            L_0x0064:
                if (r7 == 0) goto L_0x006d
                java.lang.String r7 = r6.mo120045a()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.vfs.C86013q1.m106447h(r7)     // Catch:{ all -> 0x0339 }
            L_0x006d:
                java.lang.String r7 = r6.mo120045a()     // Catch:{ all -> 0x0339 }
                android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = r7.getPath()     // Catch:{ all -> 0x0339 }
                if (r9 == 0) goto L_0x0095
                java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r4, r4)     // Catch:{ all -> 0x0339 }
                java.lang.String r10 = r7.getPath()     // Catch:{ all -> 0x0339 }
                boolean r10 = r10.equals(r9)     // Catch:{ all -> 0x0339 }
                if (r10 != 0) goto L_0x0095
                android.net.Uri$Builder r7 = r7.buildUpon()     // Catch:{ all -> 0x0339 }
                android.net.Uri$Builder r7 = r7.path(r9)     // Catch:{ all -> 0x0339 }
                android.net.Uri r7 = r7.build()     // Catch:{ all -> 0x0339 }
            L_0x0095:
                com.tencent.mm.vfs.f0$h r7 = r8.mo177799l(r7, r2)     // Catch:{ all -> 0x0339 }
                boolean r8 = r7.mo177810a()     // Catch:{ all -> 0x0339 }
                if (r8 != 0) goto L_0x00a1
                r7 = 0
                goto L_0x00a9
            L_0x00a1:
                com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = r7.f348992b     // Catch:{ all -> 0x0339 }
                boolean r7 = r8.mo119948x(r7)     // Catch:{ all -> 0x0339 }
            L_0x00a9:
                if (r7 != 0) goto L_0x00b2
                java.lang.String r7 = r6.mo120045a()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.vfs.C86013q1.m106461v(r7)     // Catch:{ all -> 0x0339 }
            L_0x00b2:
                java.lang.String r7 = r6.mo120046b()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.vfs.C86013q1.m106446g(r7, r3)     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = r6.mo120045a()     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106458s(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r8 = r6.mo120046b()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.vfs.C86013q1.m106441b(r7, r8)     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r8.<init>()     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = "is debug["
                r8.append(r9)     // Catch:{ all -> 0x0339 }
                r8.append(r0)     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = "], copy from ["
                r8.append(r9)     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = r6.mo120045a()     // Catch:{ all -> 0x0339 }
                r8.append(r9)     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = "] ---> ["
                r8.append(r9)     // Catch:{ all -> 0x0339 }
                java.lang.String r6 = r6.mo120046b()     // Catch:{ all -> 0x0339 }
                r8.append(r6)     // Catch:{ all -> 0x0339 }
                r8.append(r5)     // Catch:{ all -> 0x0339 }
                java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)     // Catch:{ all -> 0x0339 }
            L_0x00f9:
                if (r0 == 0) goto L_0x011e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r6.<init>()     // Catch:{ all -> 0x0339 }
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0339 }
                java.io.File r7 = r7.getFilesDir()     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x0339 }
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = java.io.File.separator     // Catch:{ all -> 0x0339 }
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = "XNetLibDebug"
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0339 }
                goto L_0x014f
            L_0x011e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r6.<init>()     // Catch:{ all -> 0x0339 }
                android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0339 }
                java.io.File r7 = r7.getFilesDir()     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x0339 }
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = java.io.File.separator     // Catch:{ all -> 0x0339 }
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r8 = "XNetLib"
                r6.append(r8)     // Catch:{ all -> 0x0339 }
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64     // Catch:{ all -> 0x0339 }
                if (r7 == 0) goto L_0x0146
                java.lang.String r7 = "64"
                goto L_0x0148
            L_0x0146:
                java.lang.String r7 = "32"
            L_0x0148:
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0339 }
            L_0x014f:
                java.lang.String r7 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r8.<init>()     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = "load so from ["
                r8.append(r9)     // Catch:{ all -> 0x0339 }
                r8.append(r6)     // Catch:{ all -> 0x0339 }
                r8.append(r5)     // Catch:{ all -> 0x0339 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0339 }
                android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ all -> 0x0339 }
                java.lang.String r8 = r7.getPath()     // Catch:{ all -> 0x0339 }
                if (r8 == 0) goto L_0x018c
                java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r4, r4)     // Catch:{ all -> 0x0339 }
                java.lang.String r9 = r7.getPath()     // Catch:{ all -> 0x0339 }
                boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x0339 }
                if (r9 != 0) goto L_0x018c
                android.net.Uri$Builder r7 = r7.buildUpon()     // Catch:{ all -> 0x0339 }
                android.net.Uri$Builder r7 = r7.path(r8)     // Catch:{ all -> 0x0339 }
                android.net.Uri r7 = r7.build()     // Catch:{ all -> 0x0339 }
            L_0x018c:
                com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0339 }
                com.tencent.mm.vfs.f0$h r7 = r8.mo177799l(r7, r2)     // Catch:{ all -> 0x0339 }
                boolean r8 = r7.mo177810a()     // Catch:{ all -> 0x0339 }
                if (r8 != 0) goto L_0x0199
                goto L_0x01a9
            L_0x0199:
                com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = r7.f348992b     // Catch:{ all -> 0x0339 }
                com.tencent.mm.vfs.b0 r7 = r8.mo119945q(r7)     // Catch:{ all -> 0x0339 }
                if (r7 == 0) goto L_0x01a9
                boolean r7 = r7.f250476f     // Catch:{ all -> 0x0339 }
                if (r7 == 0) goto L_0x01a9
                r7 = 1
                goto L_0x01aa
            L_0x01a9:
                r7 = 0
            L_0x01aa:
                if (r7 != 0) goto L_0x01af
                com.tencent.p014mm.vfs.C86013q1.m106445f(r6)     // Catch:{ all -> 0x0339 }
            L_0x01af:
                boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)     // Catch:{ all -> 0x0339 }
                if (r7 != 0) goto L_0x01b8
                com.tencent.p014mm.vfs.C86013q1.m106461v(r6)     // Catch:{ all -> 0x0339 }
            L_0x01b8:
                com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x0339 }
                r7.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0339 }
                com.tencent.mm.vfs.m1[] r7 = r7.mo119984u()     // Catch:{ all -> 0x0339 }
                if (r7 == 0) goto L_0x01cd
                int r8 = r7.length     // Catch:{ all -> 0x0339 }
                if (r8 != 0) goto L_0x01c8
                r8 = 1
                goto L_0x01c9
            L_0x01c8:
                r8 = 0
            L_0x01c9:
                if (r8 != 0) goto L_0x01cd
                r8 = 1
                goto L_0x01ce
            L_0x01cd:
                r8 = 0
            L_0x01ce:
                if (r8 != 0) goto L_0x01ee
                java.lang.String r0 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r5.<init>()     // Catch:{ all -> 0x0339 }
                r7 = 34
                r5.append(r7)     // Catch:{ all -> 0x0339 }
                r5.append(r6)     // Catch:{ all -> 0x0339 }
                java.lang.String r6 = "\" is empty"
                r5.append(r6)     // Catch:{ all -> 0x0339 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0339 }
                monitor-exit(r1)
                goto L_0x031c
            L_0x01ee:
                int r6 = r7.length     // Catch:{ all -> 0x0339 }
                r8 = 0
            L_0x01f0:
                if (r8 >= r6) goto L_0x02ec
                r9 = r7[r8]     // Catch:{ all -> 0x0339 }
                boolean r10 = r9.mo119977o()     // Catch:{ all -> 0x0339 }
                if (r10 == 0) goto L_0x02e7
                com.tencent.mm.vfs.m1[] r9 = r9.mo119984u()     // Catch:{ all -> 0x0339 }
                if (r9 == 0) goto L_0x02e7
                int r10 = r9.length     // Catch:{ all -> 0x0339 }
                r11 = 0
            L_0x0202:
                if (r11 >= r10) goto L_0x02e7
                r12 = r9[r11]     // Catch:{ all -> 0x0339 }
                boolean r13 = r12.mo119978p()     // Catch:{ all -> 0x0339 }
                if (r13 == 0) goto L_0x02e2
                java.lang.String r13 = r12.mo119976n()     // Catch:{ all -> 0x0339 }
                java.lang.String r13 = com.tencent.p014mm.vfs.C86013q1.m106456q(r13)     // Catch:{ all -> 0x0339 }
                java.lang.String r14 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r15.<init>()     // Catch:{ all -> 0x0339 }
                java.lang.String r2 = " checking so md5["
                r15.append(r2)     // Catch:{ all -> 0x0339 }
                if (r13 != 0) goto L_0x0225
                java.lang.String r2 = ""
                goto L_0x0226
            L_0x0225:
                r2 = r13
            L_0x0226:
                r15.append(r2)     // Catch:{ all -> 0x0339 }
                r15.append(r5)     // Catch:{ all -> 0x0339 }
                java.lang.String r2 = r15.toString()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)     // Catch:{ all -> 0x0339 }
                if (r13 == 0) goto L_0x0246
                boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64     // Catch:{ all -> 0x0339 }
                if (r2 == 0) goto L_0x023c
                java.lang.String r2 = "9de611da4bdc00b6dc55c7999cf463a9"
                goto L_0x023e
            L_0x023c:
                java.lang.String r2 = "2753304bfe0a6d1cad7f0de9031bf23e"
            L_0x023e:
                boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x0339 }
                if (r2 != r3) goto L_0x0246
                r2 = 1
                goto L_0x0247
            L_0x0246:
                r2 = 0
            L_0x0247:
                if (r2 != 0) goto L_0x024b
                if (r0 == 0) goto L_0x02e2
            L_0x024b:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0339 }
                r17 = 1868(0x74c, double:9.23E-321)
                r19 = 0
                r21 = 1
                r23 = 1
                r16 = r0
                r16.idkeyStat(r17, r19, r21, r23)     // Catch:{ all -> 0x0339 }
                java.lang.String r2 = r12.mo119971i()     // Catch:{ all -> 0x029d }
                java.lang.System.load(r2)     // Catch:{ all -> 0x029d }
                java.lang.String r2 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r6.<init>()     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = "load so success ["
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                com.tencent.mm.vfs.m1 r7 = r12.mo119969h()     // Catch:{ all -> 0x0339 }
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = "]  md5["
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                if (r13 != 0) goto L_0x027d
                java.lang.String r13 = ""
            L_0x027d:
                r6.append(r13)     // Catch:{ all -> 0x0339 }
                r6.append(r5)     // Catch:{ all -> 0x0339 }
                java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.wexnet.C86026d.f250514b = r3     // Catch:{ all -> 0x0339 }
                r17 = 1868(0x74c, double:9.23E-321)
                r19 = 2
                r21 = 1
                r23 = 1
                r16 = r0
                r16.idkeyStat(r17, r19, r21, r23)     // Catch:{ all -> 0x0339 }
                monitor-exit(r1)
            L_0x029a:
                r0 = 1
                goto L_0x031d
            L_0x029d:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r6.<init>()     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = "load so fail["
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                com.tencent.mm.vfs.m1 r7 = r12.mo119969h()     // Catch:{ all -> 0x0339 }
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = "]  md5["
                r6.append(r7)     // Catch:{ all -> 0x0339 }
                if (r13 != 0) goto L_0x02ba
                java.lang.String r13 = ""
            L_0x02ba:
                r6.append(r13)     // Catch:{ all -> 0x0339 }
                r6.append(r5)     // Catch:{ all -> 0x0339 }
                java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ all -> 0x0339 }
                java.lang.String r2 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.String r5 = ""
                java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0339 }
                java.lang.String r7 = ""
                r6[r4] = r7     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r6)     // Catch:{ all -> 0x0339 }
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0339 }
                r9 = 1868(0x74c, double:9.23E-321)
                r11 = 3
                r13 = 1
                r15 = 1
                r8.idkeyStat(r9, r11, r13, r15)     // Catch:{ all -> 0x0339 }
                monitor-exit(r1)
                goto L_0x031c
            L_0x02e2:
                int r11 = r11 + 1
                r2 = 0
                goto L_0x0202
            L_0x02e7:
                int r8 = r8 + 1
                r2 = 0
                goto L_0x01f0
            L_0x02ec:
                com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0339 }
                r17 = 1868(0x74c, double:9.23E-321)
                r19 = 1
                r21 = 1
                r23 = 1
                r16.idkeyStat(r17, r19, r21, r23)     // Catch:{ all -> 0x0339 }
                java.lang.String r0 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0339 }
                r2.<init>()     // Catch:{ all -> 0x0339 }
                java.lang.String r6 = "load so fail, can not found the so which MD5 is ["
                r2.append(r6)     // Catch:{ all -> 0x0339 }
                boolean r6 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64     // Catch:{ all -> 0x0339 }
                if (r6 == 0) goto L_0x030c
                java.lang.String r6 = "9de611da4bdc00b6dc55c7999cf463a9"
                goto L_0x030e
            L_0x030c:
                java.lang.String r6 = "2753304bfe0a6d1cad7f0de9031bf23e"
            L_0x030e:
                r2.append(r6)     // Catch:{ all -> 0x0339 }
                r2.append(r5)     // Catch:{ all -> 0x0339 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0339 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0339 }
                monitor-exit(r1)
            L_0x031c:
                r0 = 0
            L_0x031d:
                if (r0 == 0) goto L_0x0320
                goto L_0x0330
            L_0x0320:
                java.lang.String r0 = "MicroMsg.XNET.XNetLibLoaderHelper"
                java.lang.String r1 = "loadLib fail, try check so resource update"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
                java.lang.Class<com.tencent.mm.wexnet.a> r1 = com.tencent.p014mm.wexnet.C7095a.class
                r2 = 0
                com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r2, r1, r2)
                r3 = 0
            L_0x0330:
                if (r3 == 0) goto L_0x0333
                return
            L_0x0333:
                com.tencent.mm.wexnet.WeXNet$a$a r0 = new com.tencent.mm.wexnet.WeXNet$a$a
                r0.<init>()
                throw r0
            L_0x0339:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wexnet.WeXNet.C86022a.mo120038a():void");
        }

        /* renamed from: b */
        public final Result mo120039b(SessionKeeper sessionKeeper, HashMap<String, TensorCpuB> hashMap, HashMap<String, TensorCpuB> hashMap2) {
            C87412m.m108594g(sessionKeeper, "sessionKeeper");
            C87412m.m108594g(hashMap, "inputTensors");
            C87412m.m108594g(hashMap2, "outputTensors");
            mo120038a();
            Result access$run = WeXNet.run(sessionKeeper, hashMap, hashMap2);
            HashMap hashMap3 = new HashMap();
            for (Map.Entry next : hashMap2.entrySet()) {
                ByteBuffer data = ((TensorCpuB) next.getValue()).getData();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(data.capacity());
                allocateDirect.put(data);
                hashMap3.put(next.getKey(), new TensorCpuB(((TensorCpuB) next.getValue()).getDateType(), ((TensorCpuB) next.getValue()).getDataShape(), allocateDirect));
            }
            hashMap2.clear();
            hashMap2.putAll(hashMap3);
            return access$run;
        }
    }

    /* access modifiers changed from: private */
    public static final native SessionCreateResult createSession(String str, Options options);

    /* access modifiers changed from: private */
    public static final native String getXNetRuntimeVer();

    /* access modifiers changed from: private */
    public static final native Result releaseSession(long j);

    /* access modifiers changed from: private */
    public static final native Result run(SessionKeeper sessionKeeper, Map<String, TensorCpuB> map, Map<String, TensorCpuB> map2);

    public static final SessionCreateResult tryCreateSession(String str, Options options) {
        C86022a aVar = Companion;
        aVar.getClass();
        C87412m.m108594g(str, "modelFilePath");
        C87412m.m108594g(options, "options");
        aVar.mo120038a();
        return createSession(str, options);
    }

    public static final String tryGetXNetRuntimeVer() {
        Companion.mo120038a();
        return getXNetRuntimeVer();
    }

    private static final void tryLoadLib() {
        Companion.mo120038a();
    }

    public static final Result tryReleaseSession(long j) {
        Companion.mo120038a();
        return releaseSession(j);
    }

    public static final Result tryRun(SessionKeeper sessionKeeper, HashMap<String, TensorCpuB> hashMap, HashMap<String, TensorCpuB> hashMap2) {
        return Companion.mo120039b(sessionKeeper, hashMap, hashMap2);
    }
}
