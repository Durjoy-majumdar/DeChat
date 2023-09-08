package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appcache.C29222i;
import com.tencent.p014mm.plugin.appbrand.appcache.C81229b1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81277j3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81286k3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.C81295n0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81347q0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81372u2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgLoadProgress;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.m3$$c;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.launching.C83397o1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ei0.C86518b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ii0.C87732a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import or3.C89286a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import te3.C90415hz1;
import te3.C90422jy;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.u0 */
public final class C83484u0 implements C83368m1 {

    /* renamed from: l */
    public static final C83486b f243932l = new C83486b((C8480h) null);
    @Deprecated

    /* renamed from: m */
    public static final WxaPkgLoadProgress f243933m = new WxaPkgLoadProgress(0, 0, 0);

    /* renamed from: b */
    public final C83368m1.C83374d f243934b;

    /* renamed from: c */
    public final C83397o1 f243935c;

    /* renamed from: d */
    public final C90422jy f243936d;

    /* renamed from: e */
    public final C83368m1.C83373c f243937e;

    /* renamed from: f */
    public final C32226l<C83368m1.C83377e, C13598b0> f243938f;

    /* renamed from: g */
    public final C32227p<C83368m1.C83369a, String, C13598b0> f243939g;

    /* renamed from: h */
    public final C32226l<WxaPkgLoadProgress, C13598b0> f243940h;

    /* renamed from: i */
    public final C81273j1 f243941i;

    /* renamed from: j */
    public final C13601g f243942j = C36568h.m40985a(new C83491g(this));

    /* renamed from: k */
    public int f243943k = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$a */
    public final class C83485a {
        public C83485a() {
        }

        /* renamed from: a */
        public static final void m102447a(C83485a aVar, String str, C86518b.C86519a aVar2, m3$$c m3__c, C90415hz1 hz12) {
            C83368m1.C83369a aVar3;
            if (C86518b.C86519a.OK == aVar2) {
                aVar.getClass();
                Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "onPkgUpdateResult, request:" + C83484u0.this.f243934b + ", resp{is_patch:" + hz12.f259562i + ", is_zstd:" + hz12.f259563j + '}');
                C83484u0 u0Var = C83484u0.this;
                C32226l<C83368m1.C83377e, C13598b0> lVar = u0Var.f243938f;
                C83487c cVar = C83487c.f243945a;
                C83368m1.C83374d dVar = u0Var.f243934b;
                C87412m.m108591d(m3__c);
                String str2 = m3__c.f238709a;
                C87412m.m108593f(str2, "response!!.filePath");
                ((C83490f) lVar).invoke(cVar.mo115784a(dVar, str2, hz12.f259559f, hz12.f259561h, C83368m1.C83378f.C83380b.f243629a));
                return;
            }
            C32227p<C83368m1.C83369a, String, C13598b0> pVar = C83484u0.this.f243939g;
            C83368m1.C83369a[] values = C83368m1.C83369a.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar3 = C83368m1.C83369a.FAILED;
                    break;
                }
                aVar3 = values[i];
                if (aVar3.f243607d == aVar2.f251370d) {
                    break;
                }
                i++;
            }
            ((C83488d) pVar).invoke(aVar3, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$b */
    public static final class C83486b {
        public C83486b(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01af, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b0, code lost:
            cy3.C58003b.m67160a(r2, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b3, code lost:
            throw r10;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x018a A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0205  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final com.tencent.p014mm.plugin.appbrand.appcache.C29222i m102448a(com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83486b r9, com.tencent.p014mm.plugin.appbrand.appcache.C81347q0 r10, com.tencent.p014mm.plugin.appbrand.appcache.C81273j1 r11, int r12, com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g r13) {
            /*
                r9.getClass()
                boolean r9 = r13 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c
                r0 = 0
                if (r9 == 0) goto L_0x0020
                boolean r9 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r12)
                if (r9 == 0) goto L_0x0020
                java.lang.String r9 = r11.toString()
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r13 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r13
                int r11 = r13.f243634a
                java.lang.String[] r13 = new java.lang.String[r0]
                xh.c0 r9 = r10.mo113533pl(r9, r11, r12, r13)
                com.tencent.mm.plugin.appbrand.appcache.i r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r9
                goto L_0x022f
            L_0x0020:
                boolean r9 = r13 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a
                if (r9 == 0) goto L_0x0036
                java.lang.String r9 = r11.toString()
                com.tencent.mm.plugin.appbrand.launching.m1$g$a r13 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a) r13
                java.lang.String r11 = r13.f243630a
                java.lang.String[] r13 = new java.lang.String[r0]
                xh.c0 r9 = r10.mo113536r3(r9, r12, r11, r13)
                com.tencent.mm.plugin.appbrand.appcache.i r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r9
                goto L_0x022f
            L_0x0036:
                boolean r9 = r13 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b
                if (r9 == 0) goto L_0x0223
                com.tencent.mm.plugin.appbrand.launching.m1$g$b r13 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b) r13
                java.lang.String r9 = r13.f243633c
                r1 = 1
                if (r9 == 0) goto L_0x004a
                int r9 = r9.length()
                if (r9 != 0) goto L_0x0048
                goto L_0x004a
            L_0x0048:
                r9 = 0
                goto L_0x004b
            L_0x004a:
                r9 = 1
            L_0x004b:
                if (r9 != 0) goto L_0x0223
                com.tencent.mm.plugin.appbrand.launching.u0$b r9 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.f243932l
                java.lang.String r9 = r13.f243633c
                int r13 = r9.length()
                r2 = 0
            L_0x0056:
                java.lang.String r3 = ""
                if (r2 >= r13) goto L_0x007d
                char r4 = r9.charAt(r2)
                boolean r4 = java.lang.Character.isDigit(r4)
                if (r4 == 0) goto L_0x007a
                java.lang.String r13 = r9.substring(r0, r2)
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                gy3.C87412m.m108593f(r13, r4)
                int r5 = r9.length()
                java.lang.String r2 = r9.substring(r2, r5)
                gy3.C87412m.m108593f(r2, r4)
                goto L_0x007f
            L_0x007a:
                int r2 = r2 + 1
                goto L_0x0056
            L_0x007d:
                r13 = r3
                r2 = r13
            L_0x007f:
                com.tencent.mm.plugin.appbrand.appcache.w1 r4 = com.tencent.p014mm.plugin.appbrand.appcache.C68581w1.f197012a
                int[] r2 = r4.mo94234b(r2)
                int r4 = r13.hashCode()
                java.lang.String r5 = ") for appId:"
                java.lang.String r6 = "MicroMsg.AppBrand.CommonPkgFetcher"
                if (r4 == 0) goto L_0x00db
                r3 = 94
                java.lang.String r7 = ".%"
                if (r4 == r3) goto L_0x00c0
                r3 = 126(0x7e, float:1.77E-43)
                if (r4 == r3) goto L_0x009a
                goto L_0x00e1
            L_0x009a:
                java.lang.String r3 = "~"
                boolean r3 = r13.equals(r3)
                if (r3 != 0) goto L_0x00a4
                goto L_0x00e1
            L_0x00a4:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r3 = r2[r0]
                r13.append(r3)
                r3 = 46
                r13.append(r3)
                r2 = r2[r1]
                r13.append(r2)
                r13.append(r7)
                java.lang.String r13 = r13.toString()
                goto L_0x0119
            L_0x00c0:
                java.lang.String r3 = "^"
                boolean r3 = r13.equals(r3)
                if (r3 != 0) goto L_0x00c9
                goto L_0x00e1
            L_0x00c9:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r2 = r2[r0]
                r13.append(r2)
                r13.append(r7)
                java.lang.String r13 = r13.toString()
                goto L_0x0119
            L_0x00db:
                boolean r2 = r13.equals(r3)
                if (r2 != 0) goto L_0x0118
            L_0x00e1:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "PLUGIN_SEMVER_QUERY_FACTORY unrecognized marker("
                r1.append(r2)
                r1.append(r13)
                r1.append(r5)
                java.lang.String r13 = r11.f238679a
                r1.append(r13)
                java.lang.String r13 = " semver:"
                r1.append(r13)
                r1.append(r9)
                java.lang.String r9 = ", use fallback query"
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                java.lang.String r9 = r11.toString()
                java.lang.String[] r11 = new java.lang.String[r0]
                xh.c0 r9 = r10.mo113516Kn(r9, r12, r11)
                com.tencent.mm.plugin.appbrand.appcache.i r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r9
                goto L_0x022f
            L_0x0118:
                r13 = r9
            L_0x0119:
                java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.p3> r2 = com.tencent.p014mm.plugin.appbrand.appcache.C29233p3.class
                java.lang.Object r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r2)
                com.tencent.mm.plugin.appbrand.appcache.p3 r2 = (com.tencent.p014mm.plugin.appbrand.appcache.C29233p3) r2
                java.lang.String r3 = r11.f238679a
                java.lang.String r4 = "key.appId"
                gy3.C87412m.m108593f(r3, r4)
                r2.getClass()
                java.lang.String r4 = "likeClause"
                gy3.C87412m.m108594g(r13, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "select * from "
                r4.append(r7)
                java.lang.String r7 = r2.getTableName()
                r4.append(r7)
                java.lang.String r7 = " where pluginAppID=? and pluginStringVersion like ?"
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r7 = 2
                java.lang.String[] r8 = new java.lang.String[r7]
                r8[r0] = r3
                r8[r1] = r13
                java.util.LinkedList r13 = new java.util.LinkedList
                r13.<init>()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f79893e
                android.database.Cursor r2 = r2.rawQuery(r4, r8, r7)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "batchGetVersionInfoForStringVersionLike "
                r3.append(r7)
                r3.append(r4)
                r4 = 32
                r3.append(r4)
                java.lang.String r4 = java.util.Arrays.toString(r8)
                r3.append(r4)
                java.lang.String r4 = ", get cursor:"
                r3.append(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "Luggage.WxaPluginCodeVersionInfoStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                r3 = 0
                if (r2 == 0) goto L_0x01b4
                boolean r4 = r2.isClosed()     // Catch:{ all -> 0x01ad }
                if (r4 != 0) goto L_0x01a7
                boolean r4 = r2.moveToFirst()     // Catch:{ all -> 0x01ad }
                if (r4 == 0) goto L_0x01a7
            L_0x0196:
                com.tencent.mm.plugin.appbrand.appcache.n3 r4 = new com.tencent.mm.plugin.appbrand.appcache.n3     // Catch:{ all -> 0x01ad }
                r4.<init>()     // Catch:{ all -> 0x01ad }
                r4.convertFrom(r2)     // Catch:{ all -> 0x01ad }
                r13.add(r4)     // Catch:{ all -> 0x01ad }
                boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x01ad }
                if (r4 != 0) goto L_0x0196
            L_0x01a7:
                rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01ad }
                cy3.C58003b.m67160a(r2, r3)
                goto L_0x01b4
            L_0x01ad:
                r9 = move-exception
                throw r9     // Catch:{ all -> 0x01af }
            L_0x01af:
                r10 = move-exception
                cy3.C58003b.m67160a(r2, r9)
                throw r10
            L_0x01b4:
                boolean r2 = r13.isEmpty()
                r1 = r1 ^ r2
                java.lang.String r2 = ", semver:"
                if (r1 == 0) goto L_0x0205
                com.tencent.mm.plugin.appbrand.appcache.w1 r1 = com.tencent.p014mm.plugin.appbrand.appcache.C68581w1.f197012a
                com.tencent.mm.plugin.appbrand.launching.v0 r3 = com.tencent.p014mm.plugin.appbrand.launching.C29588v0.f80515d
                java.lang.Object r13 = r1.mo94233a(r13, r3)
                com.tencent.mm.plugin.appbrand.appcache.n3 r13 = (com.tencent.p014mm.plugin.appbrand.appcache.C29228n3) r13
                java.lang.String r1 = r11.toString()
                int r3 = r13.field_pluginAppVersion
                java.lang.String[] r0 = new java.lang.String[r0]
                xh.c0 r10 = r10.mo113533pl(r1, r3, r12, r0)
                com.tencent.mm.plugin.appbrand.appcache.i r10 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r10
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "PLUGIN_SEMVER_QUERY_FACTORY matched pkg("
                r12.append(r0)
                int r0 = r13.field_pluginAppVersion
                r12.append(r0)
                r0 = 58
                r12.append(r0)
                java.lang.String r13 = r13.field_pluginStringVersion
                r12.append(r13)
                r12.append(r5)
                java.lang.String r11 = r11.f238679a
                r12.append(r11)
                r12.append(r2)
                r12.append(r9)
                java.lang.String r9 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                r9 = r10
                goto L_0x022f
            L_0x0205:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "PLUGIN_SEMVER_QUERY_FACTORY matched none for appId:"
                r10.append(r12)
                java.lang.String r11 = r11.f238679a
                r10.append(r11)
                r10.append(r2)
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                r9 = r3
                goto L_0x022f
            L_0x0223:
                java.lang.String r9 = r11.toString()
                java.lang.String[] r11 = new java.lang.String[r0]
                xh.c0 r9 = r10.mo113516Kn(r9, r12, r11)
                com.tencent.mm.plugin.appbrand.appcache.i r9 = (com.tencent.p014mm.plugin.appbrand.appcache.C29222i) r9
            L_0x022f:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83486b.m102448a(com.tencent.mm.plugin.appbrand.launching.u0$b, com.tencent.mm.plugin.appbrand.appcache.q0, com.tencent.mm.plugin.appbrand.appcache.j1, int, com.tencent.mm.plugin.appbrand.launching.m1$g):com.tencent.mm.plugin.appbrand.appcache.i");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$c */
    public static final class C83487c {

        /* renamed from: a */
        public static final C83487c f243945a = new C83487c();

        /* renamed from: c */
        public static final String m102449c(C81273j1 j1Var, C83368m1.C83374d dVar, C81347q0<?> q0Var, String str) {
            String i = C81372u2.m99809i(j1Var.toString(), ((C83368m1.C83381g.C83384c) dVar.f243620h).f243634a);
            C86013q1.m106442c(str, i);
            ((C81258h3) q0Var).mo113514C(j1Var.toString(), dVar.f243619g, ((C83368m1.C83381g.C83384c) dVar.f243620h).f243634a, i);
            C87412m.m108593f(i, "targetPkgPath");
            return i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83377e mo115784a(com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83374d r4, java.lang.String r5, java.lang.String r6, int r7, com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83378f r8) {
            /*
                r3 = this;
                java.lang.String r0 = "request"
                gy3.C87412m.m108594g(r4, r0)
                java.lang.String r0 = "wxaPkgFilePath"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.String r0 = "source"
                gy3.C87412m.m108594g(r8, r0)
                int[] r0 = or3.C89286a.f257214c
                int r1 = r4.f243618f
                boolean r0 = sx3.C110823p.m151008x(r0, r1)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0055
                com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo r0 = new com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo
                r0.<init>()
                r0.pkgPath = r5
                java.lang.String r4 = r4.f243616d
                r0.provider = r4
                r0.version = r7
                if (r6 == 0) goto L_0x0033
                int r4 = r6.length()
                if (r4 != 0) goto L_0x0034
            L_0x0033:
                r1 = 1
            L_0x0034:
                if (r1 == 0) goto L_0x003a
                java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99520c(r5)
            L_0x003a:
                r0.md5 = r6
                java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.p3> r4 = com.tencent.p014mm.plugin.appbrand.appcache.C29233p3.class
                java.lang.Object r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r4)
                com.tencent.mm.plugin.appbrand.appcache.p3 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C29233p3) r4
                java.lang.String r5 = r0.provider
                java.lang.String r6 = "provider"
                gy3.C87412m.m108593f(r5, r6)
                int r6 = r0.version
                java.lang.String r4 = r4.mo56530jo(r5, r6)
                r0.stringVersion = r4
                goto L_0x0073
            L_0x0055:
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo r0 = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo
                r0.<init>()
                r0.pkgPath = r5
                java.lang.String r4 = r4.f243617e
                r0.name = r4
                if (r6 == 0) goto L_0x0068
                int r4 = r6.length()
                if (r4 != 0) goto L_0x0069
            L_0x0068:
                r1 = 1
            L_0x0069:
                if (r1 == 0) goto L_0x006f
                java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99520c(r5)
            L_0x006f:
                r0.md5 = r6
                r0.pkgVersion = r7
            L_0x0073:
                com.tencent.mm.plugin.appbrand.launching.m1$e r4 = new com.tencent.mm.plugin.appbrand.launching.m1$e
                r4.<init>(r0, r8)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.mo115784a(com.tencent.mm.plugin.appbrand.launching.m1$d, java.lang.String, java.lang.String, int, com.tencent.mm.plugin.appbrand.launching.m1$f):com.tencent.mm.plugin.appbrand.launching.m1$e");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f1, code lost:
            if (r4 != null) goto L_0x00f3;
         */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x021f A[SYNTHETIC, Splitter:B:130:0x021f] */
        /* JADX WARNING: Removed duplicated region for block: B:167:0x029e  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0166  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83377e mo115785b(com.tencent.p014mm.plugin.appbrand.appcache.C81347q0<?> r22, com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83374d r23, com.tencent.p014mm.plugin.appbrand.appcache.C29222i r24) {
            /*
                r21 = this;
                r1 = r22
                r2 = r23
                r3 = r24
                java.lang.String r0 = "storage"
                gy3.C87412m.m108594g(r1, r0)
                java.lang.String r0 = "request"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.String r0 = "record"
                gy3.C87412m.m108594g(r3, r0)
                boolean r0 = r1 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81258h3
                r4 = 0
                if (r0 != 0) goto L_0x001e
                return r4
            L_0x001e:
                com.tencent.mm.plugin.appbrand.appcache.j1 r5 = r23.mo115637a()
                com.tencent.mm.plugin.appbrand.launching.m1$g r0 = r2.f243620h
                boolean r0 = r0 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c
                if (r0 == 0) goto L_0x0378
                int r0 = r2.f243619g
                boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r0)
                if (r0 == 0) goto L_0x0378
                java.lang.String r0 = r3.field_versionMd5
                r6 = 0
                r7 = 1
                if (r0 == 0) goto L_0x003f
                int r0 = r0.length()
                if (r0 != 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = 0
                goto L_0x0040
            L_0x003f:
                r0 = 1
            L_0x0040:
                if (r0 == 0) goto L_0x0069
                java.lang.String r0 = r3.field_NewMd5
                if (r0 == 0) goto L_0x004f
                int r0 = r0.length()
                if (r0 != 0) goto L_0x004d
                goto L_0x004f
            L_0x004d:
                r0 = 0
                goto L_0x0050
            L_0x004f:
                r0 = 1
            L_0x0050:
                if (r0 == 0) goto L_0x0069
                java.lang.String r0 = "MicroMsg.AppBrand.CommonPkgFetcher"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "makeResponseByReusableLocalPkg record.md5 is EMPTY, request="
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                return r4
            L_0x0069:
                int r0 = r2.f243619g
                com.tencent.mm.plugin.appbrand.launching.m1$g r8 = r2.f243620h
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r8 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r8
                int r8 = r8.f243634a
                r9 = 2
                java.lang.String[] r10 = new java.lang.String[r9]
                java.lang.String r11 = r3.field_versionMd5
                r10[r6] = r11
                java.lang.String r11 = r3.field_NewMd5
                r10[r7] = r11
                com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
                com.tencent.mm.plugin.appbrand.appcache.h3 r11 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
                r11.getClass()
                if (r5 != 0) goto L_0x0088
                goto L_0x00f8
            L_0x0088:
                com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r11.f238664d     // Catch:{ all -> 0x00f7 }
                java.lang.String r13 = "AppBrandWxaPkgManifestRecord"
                r14 = 0
                java.util.Locale r11 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00f7 }
                java.lang.String r15 = "%s=? and %s=?"
                java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ all -> 0x00f7 }
                java.lang.String r16 = "appId"
                r4[r6] = r16     // Catch:{ all -> 0x00f7 }
                java.lang.String r16 = "debugType"
                r4[r7] = r16     // Catch:{ all -> 0x00f7 }
                java.lang.String r15 = java.lang.String.format(r11, r15, r4)     // Catch:{ all -> 0x00f7 }
                java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ all -> 0x00f7 }
                java.lang.String r11 = r5.toString()     // Catch:{ all -> 0x00f7 }
                r4[r6] = r11     // Catch:{ all -> 0x00f7 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00f7 }
                r4[r7] = r0     // Catch:{ all -> 0x00f7 }
                r17 = 0
                r18 = 0
                java.lang.String r19 = "version DESC"
                r20 = 2
                r16 = r4
                android.database.Cursor r4 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00f7 }
                if (r4 == 0) goto L_0x00f1
                boolean r0 = r4.isClosed()     // Catch:{ all -> 0x00e5 }
                if (r0 == 0) goto L_0x00c5
                goto L_0x00f1
            L_0x00c5:
                boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x00e5 }
                if (r0 == 0) goto L_0x00f3
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x00e5 }
                r0.<init>()     // Catch:{ all -> 0x00e5 }
            L_0x00d0:
                com.tencent.mm.plugin.appbrand.appcache.z2 r11 = new com.tencent.mm.plugin.appbrand.appcache.z2     // Catch:{ all -> 0x00e5 }
                r11.<init>()     // Catch:{ all -> 0x00e5 }
                r11.convertFrom(r4)     // Catch:{ all -> 0x00e5 }
                r0.add(r11)     // Catch:{ all -> 0x00e5 }
                boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x00e5 }
                if (r11 != 0) goto L_0x00d0
                r4.close()     // Catch:{ all -> 0x00f7 }
                goto L_0x00f9
            L_0x00e5:
                r0 = move-exception
                r11 = r0
                r4.close()     // Catch:{ all -> 0x00eb }
                goto L_0x00f0
            L_0x00eb:
                r0 = move-exception
                r4 = r0
                r11.addSuppressed(r4)     // Catch:{ all -> 0x00f7 }
            L_0x00f0:
                throw r11     // Catch:{ all -> 0x00f7 }
            L_0x00f1:
                if (r4 == 0) goto L_0x00f8
            L_0x00f3:
                r4.close()     // Catch:{ all -> 0x00f7 }
                goto L_0x00f8
            L_0x00f7:
            L_0x00f8:
                r0 = 0
            L_0x00f9:
                if (r0 == 0) goto L_0x0142
                java.util.Iterator r0 = r0.iterator()
            L_0x00ff:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x0142
                java.lang.Object r4 = r0.next()
                com.tencent.mm.plugin.appbrand.appcache.z2 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r4
                int r11 = r4.field_version
                if (r11 != r8) goto L_0x0110
                goto L_0x00ff
            L_0x0110:
                r11 = 0
                r12 = 0
            L_0x0112:
                if (r12 >= r9) goto L_0x00ff
                r13 = r10[r12]
                boolean r14 = u24.C90599h.m113511d(r13)
                if (r14 != 0) goto L_0x013f
                java.lang.String r14 = r4.field_versionMd5
                boolean r14 = u24.C90599h.m113509b(r13, r14)
                if (r14 != 0) goto L_0x012c
                java.lang.String r14 = r4.field_NewMd5
                boolean r14 = u24.C90599h.m113509b(r13, r14)
                if (r14 == 0) goto L_0x013f
            L_0x012c:
                boolean r14 = u24.C90599h.m113511d(r11)
                if (r14 == 0) goto L_0x0138
                java.lang.String r11 = r4.field_pkgPath
                java.lang.String r11 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99520c(r11)
            L_0x0138:
                boolean r13 = u24.C90599h.m113509b(r13, r11)
                if (r13 == 0) goto L_0x013f
                goto L_0x0143
            L_0x013f:
                int r12 = r12 + 1
                goto L_0x0112
            L_0x0142:
                r4 = 0
            L_0x0143:
                if (r4 == 0) goto L_0x0166
                java.lang.String r0 = r4.field_pkgPath
                java.lang.String r3 = "reusable.field_pkgPath"
                gy3.C87412m.m108593f(r0, r3)
                java.lang.String r3 = m102449c(r5, r2, r1, r0)
                com.tencent.mm.plugin.appbrand.launching.u0$c r1 = f243945a
                r4 = 0
                com.tencent.mm.plugin.appbrand.launching.m1$g r0 = r2.f243620h
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r0
                int r5 = r0.f243634a
                com.tencent.mm.plugin.appbrand.launching.m1$f$a r6 = new com.tencent.mm.plugin.appbrand.launching.m1$f$a
                r6.<init>(r7)
                r2 = r23
                com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r1.mo115784a(r2, r3, r4, r5, r6)
                return r0
            L_0x0166:
                com.tencent.mm.plugin.appbrand.launching.m1$g r0 = r2.f243620h
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r0
                long r10 = r0.f243635b
                java.lang.Long r0 = java.lang.Long.valueOf(r10)
                long r10 = r0.longValue()
                r12 = 0
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 < 0) goto L_0x017c
                r4 = 1
                goto L_0x017d
            L_0x017c:
                r4 = 0
            L_0x017d:
                if (r4 == 0) goto L_0x0180
                goto L_0x0181
            L_0x0180:
                r0 = 0
            L_0x0181:
                if (r0 == 0) goto L_0x032f
                long r10 = r0.longValue()
                java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.a4> r0 = com.tencent.p014mm.plugin.appbrand.appcache.C29182a4.class
                java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
                r4 = r0
                com.tencent.mm.plugin.appbrand.appcache.a4 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C29182a4) r4
                java.lang.String r0 = r3.field_versionMd5
                java.lang.String r8 = r3.field_NewMd5
                r4.getClass()
                if (r0 == 0) goto L_0x01a2
                int r12 = r0.length()
                if (r12 != 0) goto L_0x01a0
                goto L_0x01a2
            L_0x01a0:
                r12 = 0
                goto L_0x01a3
            L_0x01a2:
                r12 = 1
            L_0x01a3:
                if (r12 == 0) goto L_0x01b7
                if (r8 == 0) goto L_0x01b0
                int r12 = r8.length()
                if (r12 != 0) goto L_0x01ae
                goto L_0x01b0
            L_0x01ae:
                r12 = 0
                goto L_0x01b1
            L_0x01b0:
                r12 = 1
            L_0x01b1:
                if (r12 == 0) goto L_0x01b7
                sx3.f0 r0 = sx3.C64186f0.f181907d
                goto L_0x0294
            L_0x01b7:
                monitor-enter(r4)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r4.f79814d     // Catch:{ all -> 0x032c }
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x032c }
                r13.<init>()     // Catch:{ all -> 0x032c }
                java.lang.String r14 = "select appId from "
                r13.append(r14)     // Catch:{ all -> 0x032c }
                java.lang.String r14 = r4.getTableName()     // Catch:{ all -> 0x032c }
                r13.append(r14)     // Catch:{ all -> 0x032c }
                java.lang.String r14 = " where templateId=?"
                r13.append(r14)     // Catch:{ all -> 0x032c }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x032c }
                java.lang.String[] r14 = new java.lang.String[r7]     // Catch:{ all -> 0x032c }
                java.lang.String r15 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x032c }
                r14[r6] = r15     // Catch:{ all -> 0x032c }
                android.database.Cursor r12 = r12.rawQuery(r13, r14)     // Catch:{ all -> 0x032c }
                if (r12 == 0) goto L_0x020b
                boolean r13 = r12.moveToFirst()     // Catch:{ all -> 0x0202 }
                if (r13 == 0) goto L_0x01fc
                java.util.LinkedList r13 = new java.util.LinkedList     // Catch:{ all -> 0x0202 }
                r13.<init>()     // Catch:{ all -> 0x0202 }
            L_0x01ee:
                java.lang.String r14 = r12.getString(r6)     // Catch:{ all -> 0x0202 }
                r13.add(r14)     // Catch:{ all -> 0x0202 }
                boolean r14 = r12.moveToNext()     // Catch:{ all -> 0x0202 }
                if (r14 != 0) goto L_0x01ee
                goto L_0x01fd
            L_0x01fc:
                r13 = 0
            L_0x01fd:
                r14 = 0
                cy3.C58003b.m67160a(r12, r14)     // Catch:{ all -> 0x032c }
                goto L_0x020c
            L_0x0202:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x0205 }
            L_0x0205:
                r0 = move-exception
                r2 = r0
                cy3.C58003b.m67160a(r12, r1)     // Catch:{ all -> 0x032c }
                throw r2     // Catch:{ all -> 0x032c }
            L_0x020b:
                r13 = 0
            L_0x020c:
                if (r13 == 0) goto L_0x0217
                boolean r12 = r13.isEmpty()     // Catch:{ all -> 0x032c }
                if (r12 == 0) goto L_0x0215
                goto L_0x0217
            L_0x0215:
                r12 = 0
                goto L_0x0218
            L_0x0217:
                r12 = 1
            L_0x0218:
                if (r12 == 0) goto L_0x021f
                sx3.f0 r0 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x032c }
                monitor-exit(r4)
                goto L_0x0294
            L_0x021f:
                java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ all -> 0x032c }
                r12.<init>()     // Catch:{ all -> 0x032c }
                java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x032c }
            L_0x0228:
                boolean r14 = r13.hasNext()     // Catch:{ all -> 0x032c }
                if (r14 == 0) goto L_0x0292
                java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x032c }
                java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x032c }
                com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r4.f79814d     // Catch:{ all -> 0x032c }
                java.lang.String r9 = "select * from AppBrandWxaPkgManifestRecord where appId like ? and (versionMd5=? or NewMd5=?) and pkgPath!=?"
                r7 = 4
                java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x032c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x032c }
                r6.<init>()     // Catch:{ all -> 0x032c }
                r6.append(r14)     // Catch:{ all -> 0x032c }
                r14 = 37
                r6.append(r14)     // Catch:{ all -> 0x032c }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x032c }
                r14 = 0
                r7[r14] = r6     // Catch:{ all -> 0x032c }
                if (r0 != 0) goto L_0x0255
                java.lang.String r6 = ""
                goto L_0x0256
            L_0x0255:
                r6 = r0
            L_0x0256:
                r14 = 1
                r7[r14] = r6     // Catch:{ all -> 0x032c }
                if (r8 != 0) goto L_0x025e
                java.lang.String r6 = ""
                goto L_0x025f
            L_0x025e:
                r6 = r8
            L_0x025f:
                r14 = 2
                r7[r14] = r6     // Catch:{ all -> 0x032c }
                r6 = 3
                java.lang.String r14 = ""
                r7[r6] = r14     // Catch:{ all -> 0x032c }
                android.database.Cursor r6 = r15.rawQuery(r9, r7)     // Catch:{ all -> 0x032c }
                if (r6 == 0) goto L_0x028e
                boolean r7 = r6.moveToFirst()     // Catch:{ all -> 0x0285 }
                if (r7 == 0) goto L_0x027e
                com.tencent.mm.plugin.appbrand.appcache.z2 r7 = new com.tencent.mm.plugin.appbrand.appcache.z2     // Catch:{ all -> 0x0285 }
                r7.<init>()     // Catch:{ all -> 0x0285 }
                r7.convertFrom(r6)     // Catch:{ all -> 0x0285 }
                r12.add(r7)     // Catch:{ all -> 0x0285 }
            L_0x027e:
                rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0285 }
                r7 = 0
                cy3.C58003b.m67160a(r6, r7)     // Catch:{ all -> 0x032c }
                goto L_0x028e
            L_0x0285:
                r0 = move-exception
                r1 = r0
                throw r1     // Catch:{ all -> 0x0288 }
            L_0x0288:
                r0 = move-exception
                r2 = r0
                cy3.C58003b.m67160a(r6, r1)     // Catch:{ all -> 0x032c }
                throw r2     // Catch:{ all -> 0x032c }
            L_0x028e:
                r6 = 0
                r7 = 1
                r9 = 2
                goto L_0x0228
            L_0x0292:
                monitor-exit(r4)
                r0 = r12
            L_0x0294:
                java.util.Iterator r0 = r0.iterator()
            L_0x0298:
                boolean r4 = r0.hasNext()
                if (r4 == 0) goto L_0x032f
                java.lang.Object r4 = r0.next()
                com.tencent.mm.plugin.appbrand.appcache.z2 r4 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r4
                java.lang.String r6 = r4.field_pkgPath
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
                if (r6 == 0) goto L_0x02b8
                com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
                java.lang.String r7 = r4.field_pkgPath
                r6.<init>((java.lang.String) r7)
                java.lang.String r6 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo.m99521f(r6)
                goto L_0x02b9
            L_0x02b8:
                r6 = 0
            L_0x02b9:
                if (r6 == 0) goto L_0x02c4
                int r7 = r6.length()
                if (r7 != 0) goto L_0x02c2
                goto L_0x02c4
            L_0x02c2:
                r7 = 0
                goto L_0x02c5
            L_0x02c4:
                r7 = 1
            L_0x02c5:
                if (r7 != 0) goto L_0x0298
                java.lang.String r7 = r4.field_versionMd5
                boolean r7 = gy3.C87412m.m108589b(r6, r7)
                if (r7 != 0) goto L_0x02d7
                java.lang.String r7 = r4.field_NewMd5
                boolean r7 = gy3.C87412m.m108589b(r6, r7)
                if (r7 == 0) goto L_0x0298
            L_0x02d7:
                java.lang.String r0 = "MicroMsg.AppBrand.CommonPkgFetcher"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "makeResponseByReusableLocalPkg matched pkg for templateId:"
                r3.append(r7)
                r3.append(r10)
                java.lang.String r7 = ", appId:"
                r3.append(r7)
                java.lang.String r7 = r2.f243616d
                r3.append(r7)
                java.lang.String r7 = ", appVersion:"
                r3.append(r7)
                com.tencent.mm.plugin.appbrand.launching.m1$g r7 = r2.f243620h
                r3.append(r7)
                java.lang.String r7 = ", fileMd5:"
                r3.append(r7)
                r3.append(r6)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                java.lang.String r0 = r4.field_pkgPath
                java.lang.String r3 = "templateRecord.field_pkgPath"
                gy3.C87412m.m108593f(r0, r3)
                java.lang.String r3 = m102449c(r5, r2, r1, r0)
                com.tencent.mm.plugin.appbrand.launching.u0$c r1 = f243945a
                com.tencent.mm.plugin.appbrand.launching.m1$g r0 = r2.f243620h
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r0
                int r5 = r0.f243634a
                com.tencent.mm.plugin.appbrand.launching.m1$f$a r0 = new com.tencent.mm.plugin.appbrand.launching.m1$f$a
                r4 = 2
                r0.<init>(r4)
                r2 = r23
                r4 = r6
                r6 = r0
                com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r1.mo115784a(r2, r3, r4, r5, r6)
                return r0
            L_0x032c:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            L_0x032f:
                com.tencent.mm.pointers.PString r0 = new com.tencent.mm.pointers.PString
                r0.<init>()
                java.lang.String r4 = r5.toString()
                com.tencent.mm.plugin.appbrand.launching.m1$g r5 = r2.f243620h
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r5 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r5
                int r5 = r5.f243634a
                r6 = 2
                java.lang.String[] r6 = new java.lang.String[r6]
                java.lang.String r7 = r3.field_versionMd5
                r8 = 0
                r6[r8] = r7
                java.lang.String r7 = r3.field_NewMd5
                r8 = 1
                r6[r8] = r7
                java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102338c(r4, r5, r6, r0)
                if (r4 == 0) goto L_0x0376
                java.lang.String r5 = "MicroMsg.AppBrand.CommonPkgFetcher"
                java.lang.String r6 = "find wxapkg in public pkg storage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                r3.field_pkgPath = r4
                com.tencent.p014mm.plugin.appbrand.appcache.C81277j3.m99635a(r1, r3)
                com.tencent.mm.plugin.appbrand.launching.u0$c r1 = f243945a
                java.lang.String r0 = r0.value
                com.tencent.mm.plugin.appbrand.launching.m1$g r3 = r2.f243620h
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r3 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r3
                int r5 = r3.f243634a
                com.tencent.mm.plugin.appbrand.launching.m1$f$a r6 = new com.tencent.mm.plugin.appbrand.launching.m1$f$a
                r3 = 0
                r6.<init>(r3)
                r2 = r23
                r3 = r4
                r4 = r0
                com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r1.mo115784a(r2, r3, r4, r5, r6)
                return r0
            L_0x0376:
                r1 = 0
                goto L_0x0379
            L_0x0378:
                r1 = r4
            L_0x0379:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.mo115785b(com.tencent.mm.plugin.appbrand.appcache.q0, com.tencent.mm.plugin.appbrand.launching.m1$d, com.tencent.mm.plugin.appbrand.appcache.i):com.tencent.mm.plugin.appbrand.launching.m1$e");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$d */
    public static final class C83488d extends C87413o implements C32227p<C83368m1.C83369a, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C83368m1.C83369a, String, C13598b0> f243946d;

        /* renamed from: e */
        public final /* synthetic */ C83484u0 f243947e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83488d(C32227p<? super C83368m1.C83369a, ? super String, C13598b0> pVar, C83484u0 u0Var) {
            super(2);
            this.f243946d = pVar;
            this.f243947e = u0Var;
        }

        /* JADX INFO: finally extract failed */
        public Object invoke(Object obj, Object obj2) {
            C83368m1.C83369a aVar = (C83368m1.C83369a) obj;
            String str = (String) obj2;
            C87412m.m108594g(aVar, "err");
            this.f243946d.invoke(aVar, str);
            int i = this.f243947e.f243943k;
            if (i > 0) {
                C87732a.INSTANCE.mo122144a(i, 191);
            }
            if (C83368m1.C83369a.CGI_GET_URL_FAILED_TIMEOUT == aVar) {
                String str2 = this.f243947e.f243934b.f243616d;
                ConcurrentHashMap<String, Boolean> concurrentHashMap = C81229b1.f238601a;
                int i2 = !Util.isNullOrNil(str2) && Boolean.TRUE.equals(C81229b1.f238601a.get(str2)) ? 776 : 368;
                C115669n.INSTANCE.mo175911u(i2, 118);
                C83368m1.C83374d dVar = this.f243947e.f243934b;
                C84240s.m103843i(dVar.f243616d, dVar.f243620h.mo115647a(), this.f243947e.f243934b.f243619g, i2, 118, 1);
            }
            Log.m105920e("MicroMsg.AppBrand.CommonPkgFetcher", "onError, request:" + this.f243947e.f243934b + ", err:" + aVar);
            C83368m1.C83370b bVar = C83368m1.f243597a;
            C83368m1.C83374d dVar2 = this.f243947e.f243934b;
            bVar.getClass();
            C87412m.m108594g(dVar2, "request");
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            try {
                Set<C32227p<C83368m1.C83369a, String, C13598b0>> d = C83368m1.C83370b.f243611d.mo122463d(dVar2);
                if (d != null) {
                    for (C32227p invoke : d) {
                        invoke.invoke(aVar, str);
                    }
                }
                C83368m1.C83370b.f243609b.remove(dVar2);
                return C13598b0.f38549a;
            } catch (Throwable th) {
                C83368m1.C83370b.f243609b.remove(dVar2);
                throw th;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$e */
    public static final class C83489e extends C87413o implements C32226l<WxaPkgLoadProgress, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<WxaPkgLoadProgress, C13598b0> f243948d;

        /* renamed from: e */
        public final /* synthetic */ C83484u0 f243949e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83489e(C32226l<? super WxaPkgLoadProgress, C13598b0> lVar, C83484u0 u0Var) {
            super(1);
            this.f243948d = lVar;
            this.f243949e = u0Var;
        }

        public Object invoke(Object obj) {
            WxaPkgLoadProgress wxaPkgLoadProgress = (WxaPkgLoadProgress) obj;
            C87412m.m108594g(wxaPkgLoadProgress, LocaleUtil.ITALIAN);
            this.f243948d.invoke(wxaPkgLoadProgress);
            C83368m1.C83370b bVar = C83368m1.f243597a;
            C83368m1.C83374d dVar = this.f243949e.f243934b;
            bVar.getClass();
            C87412m.m108594g(dVar, "request");
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            Set<C32226l<WxaPkgLoadProgress, C13598b0>> d = C83368m1.C83370b.f243612e.mo122463d(dVar);
            if (d != null) {
                for (C32226l invoke : d) {
                    invoke.invoke(wxaPkgLoadProgress);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$f */
    public static final class C83490f extends C87413o implements C32226l<C83368m1.C83377e, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<C83368m1.C83377e, C13598b0> f243950d;

        /* renamed from: e */
        public final /* synthetic */ C83484u0 f243951e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83490f(C32226l<? super C83368m1.C83377e, C13598b0> lVar, C83484u0 u0Var) {
            super(1);
            this.f243950d = lVar;
            this.f243951e = u0Var;
        }

        /* JADX INFO: finally extract failed */
        public Object invoke(Object obj) {
            C83368m1.C83377e eVar = (C83368m1.C83377e) obj;
            C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
            this.f243950d.invoke(eVar);
            if (eVar.f243627b instanceof C83368m1.C83378f.C83379a) {
                C83484u0 u0Var = this.f243951e;
                C83368m1.C83373c cVar = u0Var.f243937e;
                if (cVar != null) {
                    cVar.mo115598d(u0Var.f243934b, eVar);
                }
            } else {
                C83484u0 u0Var2 = this.f243951e;
                C83368m1.C83373c cVar2 = u0Var2.f243937e;
                if (cVar2 != null) {
                    cVar2.mo115599e(u0Var2.f243934b, eVar);
                }
            }
            int i = this.f243951e.f243943k;
            if (i > 0) {
                C87732a.INSTANCE.mo122144a(i, 190);
            }
            Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "onSuccess, request:" + this.f243951e.f243934b + ", response:" + eVar);
            C83368m1.C83370b bVar = C83368m1.f243597a;
            C83484u0 u0Var3 = this.f243951e;
            C83368m1.C83374d dVar = u0Var3.f243934b;
            C90422jy jyVar = u0Var3.f243936d;
            bVar.getClass();
            C87412m.m108594g(dVar, "request");
            C81161g2.vx0().getClass();
            C81161g2.requireAccountInitializedOnDemand();
            try {
                Set<C32226l<C83368m1.C83377e, C13598b0>> d = C83368m1.C83370b.f243610c.mo122463d(dVar);
                if (d != null) {
                    for (C32226l invoke : d) {
                        invoke.invoke(eVar);
                    }
                }
                C83368m1.C83370b.f243609b.remove(dVar);
                Enumeration<C32228q<C83368m1.C83374d, C83368m1.C83377e, C90422jy, C13598b0>> keys = C83368m1.C83370b.f243613f.keys();
                C87412m.m108593f(keys, "sExternalCompleteEventListeners.keys()");
                while (keys.hasMoreElements()) {
                    keys.nextElement().invoke(dVar, eVar, jyVar);
                }
                return C13598b0.f38549a;
            } catch (Throwable th) {
                C83368m1.C83370b.f243609b.remove(dVar);
                throw th;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$g */
    public static final class C83491g extends C87413o implements C32224a<C81347q0<? extends C29222i>> {

        /* renamed from: d */
        public final /* synthetic */ C83484u0 f243952d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83491g(C83484u0 u0Var) {
            super(0);
            this.f243952d = u0Var;
        }

        public Object invoke() {
            C83486b bVar = C83484u0.f243932l;
            C83368m1.C83374d dVar = this.f243952d.f243934b;
            C81286k3 wxaPkgStorageRouter = ((PluginAppBrand) C86312j.m106911c(PluginAppBrand.class)).getWxaPkgStorageRouter();
            C87412m.m108593f(wxaPkgStorageRouter, "getService(PluginAppBran…java).wxaPkgStorageRouter");
            String str = dVar.f243616d;
            int i = dVar.f243618f;
            int i2 = dVar.f243619g;
            dVar.f243620h.mo115647a();
            C87412m.m108594g(str, "appId");
            return (!C110823p.m151008x(C89286a.f257214c, i) || !C81289m.C81290a.m99663a(i2)) ? wxaPkgStorageRouter.f238696a : wxaPkgStorageRouter.f238697b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$h */
    public static final class C83492h extends C87413o implements C32226l<C90415hz1[], C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f243953d;

        /* renamed from: e */
        public final /* synthetic */ MTimerHandler f243954e;

        /* renamed from: f */
        public final /* synthetic */ C83484u0 f243955f;

        /* renamed from: g */
        public final /* synthetic */ C83397o1.C83398a f243956g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83492h(AtomicBoolean atomicBoolean, MTimerHandler mTimerHandler, C83484u0 u0Var, C83397o1.C83398a aVar) {
            super(1);
            this.f243953d = atomicBoolean;
            this.f243954e = mTimerHandler;
            this.f243955f = u0Var;
            this.f243956g = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.tencent.mm.plugin.appbrand.launching.m1$g} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: com.tencent.mm.plugin.appbrand.launching.m1$g$c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: com.tencent.mm.plugin.appbrand.launching.m1$g$c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: com.tencent.mm.plugin.appbrand.launching.m1$g$c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                r4 = r17
                te3.hz1[] r4 = (te3.C90415hz1[]) r4
                com.tencent.mm.plugin.appbrand.launching.m1$a r0 = com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83369a.CGI_GET_URL_FAILED_SERVER_ERROR
                java.lang.String r2 = "urls"
                gy3.C87412m.m108594g(r4, r2)
                java.util.concurrent.atomic.AtomicBoolean r2 = r1.f243953d
                boolean r2 = r2.get()
                if (r2 == 0) goto L_0x0018
                goto L_0x0497
            L_0x0018:
                com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r1.f243954e
                r2.stopTimer()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "cgiExecutor.onSuccess, "
                r2.append(r3)
                com.tencent.mm.plugin.appbrand.launching.u0 r5 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$d r5 = r5.f243934b
                java.lang.String r5 = r5.f243616d
                r2.append(r5)
                java.lang.String r5 = " print urls --START--"
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                java.lang.String r5 = "MicroMsg.AppBrand.CommonPkgFetcher"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                int r2 = r4.length
                r6 = 0
                r7 = 0
                r8 = 0
            L_0x0042:
                r9 = 1
                if (r7 >= r2) goto L_0x00d7
                r11 = r4[r7]
                int r12 = r8 + 1
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "cgiExecutor.onSuccess, print url, index:"
                r13.append(r14)
                if (r8 == 0) goto L_0x0065
                if (r8 == r9) goto L_0x0062
                r9 = 2
                if (r8 == r9) goto L_0x005f
                java.lang.String r8 = java.lang.String.valueOf(r8)
                goto L_0x0067
            L_0x005f:
                java.lang.String r8 = "PATCH"
                goto L_0x0067
            L_0x0062:
                java.lang.String r8 = "ZSTD"
                goto L_0x0067
            L_0x0065:
                java.lang.String r8 = "LEGACY"
            L_0x0067:
                r13.append(r8)
                java.lang.String r8 = ", item:{errcode:"
                r13.append(r8)
                if (r11 == 0) goto L_0x0078
                int r8 = r11.f259557d
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                goto L_0x0079
            L_0x0078:
                r8 = 0
            L_0x0079:
                r13.append(r8)
                java.lang.String r8 = ", url:"
                r13.append(r8)
                if (r11 == 0) goto L_0x0086
                java.lang.String r8 = r11.f259558e
                goto L_0x0087
            L_0x0086:
                r8 = 0
            L_0x0087:
                r13.append(r8)
                java.lang.String r8 = ", md5:"
                r13.append(r8)
                if (r11 == 0) goto L_0x0094
                java.lang.String r8 = r11.f259559f
                goto L_0x0095
            L_0x0094:
                r8 = 0
            L_0x0095:
                r13.append(r8)
                java.lang.String r8 = ", app_version:"
                r13.append(r8)
                if (r11 == 0) goto L_0x00a6
                int r8 = r11.f259561h
                java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
                goto L_0x00a7
            L_0x00a6:
                r10 = 0
            L_0x00a7:
                r13.append(r10)
                java.lang.String r8 = ", is_patch:"
                r13.append(r8)
                if (r11 == 0) goto L_0x00b4
                boolean r8 = r11.f259562i
                goto L_0x00b5
            L_0x00b4:
                r8 = 0
            L_0x00b5:
                r13.append(r8)
                java.lang.String r8 = ", is_zstd:"
                r13.append(r8)
                if (r11 == 0) goto L_0x00c2
                boolean r8 = r11.f259563j
                goto L_0x00c3
            L_0x00c2:
                r8 = 0
            L_0x00c3:
                r13.append(r8)
                r8 = 125(0x7d, float:1.75E-43)
                r13.append(r8)
                java.lang.String r8 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
                int r7 = r7 + 1
                r8 = r12
                goto L_0x0042
            L_0x00d7:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                com.tencent.mm.plugin.appbrand.launching.u0 r3 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$d r3 = r3.f243934b
                java.lang.String r3 = r3.f243616d
                r2.append(r3)
                java.lang.String r3 = " print urls --END--"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                r2 = r4[r6]
                if (r2 != 0) goto L_0x011b
                com.tencent.mm.plugin.appbrand.launching.u0 r2 = r1.f243955f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "cgiExecutor.onSuccess get NULL normal item with "
                r3.append(r4)
                com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r2.f243934b
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
                fy3.p<com.tencent.mm.plugin.appbrand.launching.m1$a, java.lang.String, rx3.b0> r2 = r2.f243939g
                com.tencent.mm.plugin.appbrand.launching.u0$d r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83488d) r2
                java.lang.String r3 = "get invalid url"
                r2.invoke(r0, r3)
                goto L_0x0497
            L_0x011b:
                int r3 = r2.f259557d
                r7 = -2000011(0xffffffffffe17b75, float:NaN)
                if (r3 == r7) goto L_0x0488
                r7 = -2000004(0xffffffffffe17b7c, float:NaN)
                if (r3 == r7) goto L_0x0488
                if (r3 == 0) goto L_0x0138
                com.tencent.mm.plugin.appbrand.launching.u0 r2 = r1.f243955f
                fy3.p<com.tencent.mm.plugin.appbrand.launching.m1$a, java.lang.String, rx3.b0> r2 = r2.f243939g
                java.lang.String r3 = java.lang.String.valueOf(r3)
                com.tencent.mm.plugin.appbrand.launching.u0$d r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83488d) r2
                r2.invoke(r0, r3)
                goto L_0x0497
            L_0x0138:
                com.tencent.mm.plugin.appbrand.launching.o1$a r0 = r1.f243956g
                boolean r0 = r0.f243674o
                java.lang.String r3 = ", version:"
                if (r0 == 0) goto L_0x01e2
                java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.p3> r0 = com.tencent.p014mm.plugin.appbrand.appcache.C29233p3.class
                java.lang.Object r0 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)
                r7 = r0
                com.tencent.mm.plugin.appbrand.appcache.p3 r7 = (com.tencent.p014mm.plugin.appbrand.appcache.C29233p3) r7
                te3.kt3 r0 = r2.f259564n
                java.lang.String r0 = r0.f259653d
                java.lang.String r8 = "resp.req_package_info.appid"
                gy3.C87412m.m108593f(r0, r8)
                int r8 = r2.f259561h
                java.lang.String r11 = r2.f259565o
                r7.getClass()
                java.lang.String r12 = "Luggage.WxaPluginCodeVersionInfoStorage"
                if (r11 != 0) goto L_0x017f
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r11 = "setPluginStringVersion with id:"
                r7.append(r11)
                r7.append(r0)
                r7.append(r3)
                r7.append(r8)
                java.lang.String r0 = ", invalid stringVersion"
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                goto L_0x01e2
            L_0x017f:
                com.tencent.mm.plugin.appbrand.appcache.n3 r13 = new com.tencent.mm.plugin.appbrand.appcache.n3
                r13.<init>()
                r13.field_pluginAppID = r0
                r13.field_pluginAppVersion = r8
                r13.field_pluginStringVersion = r11
                com.tencent.mm.plugin.appbrand.appcache.o3 r14 = new com.tencent.mm.plugin.appbrand.appcache.o3
                r14.<init>(r7, r13)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r7.f79893e
                java.lang.Thread r15 = java.lang.Thread.currentThread()
                long r9 = r15.getId()
                long r9 = r13.beginTransaction(r9)
                java.lang.Object r13 = r14.invoke()     // Catch:{ all -> 0x01da }
                com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r7.f79893e
                r7.endTransaction(r9)
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r7 = r13.booleanValue()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "setPluginStringVersion id:"
                r9.append(r10)
                r9.append(r0)
                java.lang.String r0 = " version:"
                r9.append(r0)
                r9.append(r8)
                java.lang.String r0 = " stringVersion:"
                r9.append(r0)
                r9.append(r11)
                java.lang.String r0 = " updated:"
                r9.append(r0)
                r9.append(r7)
                java.lang.String r0 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
                goto L_0x01e2
            L_0x01da:
                r0 = move-exception
                r2 = r0
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r7.f79893e
                r0.endTransaction(r9)
                throw r2
            L_0x01e2:
                com.tencent.mm.plugin.appbrand.launching.u0 r0 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$d r7 = r0.f243934b
                com.tencent.mm.plugin.appbrand.launching.m1$g r7 = r7.f243620h
                boolean r8 = r7 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b
                if (r8 == 0) goto L_0x01f8
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r7 = new com.tencent.mm.plugin.appbrand.launching.m1$g$c
                int r10 = r2.f259561h
                r11 = 0
                r13 = 2
                r14 = 0
                r9 = r7
                r9.<init>(r10, r11, r13, r14)
            L_0x01f8:
                com.tencent.mm.plugin.appbrand.launching.u0$b r8 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.f243932l
                com.tencent.mm.plugin.appbrand.appcache.q0 r9 = r0.mo115781a()
                com.tencent.mm.plugin.appbrand.appcache.j1 r10 = r0.f243941i
                com.tencent.mm.plugin.appbrand.launching.m1$d r11 = r0.f243934b
                int r11 = r11.f243619g
                com.tencent.mm.plugin.appbrand.appcache.i r8 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83486b.m102448a(r8, r9, r10, r11, r7)
                if (r8 == 0) goto L_0x020c
                r0 = 1
                goto L_0x024a
            L_0x020c:
                com.tencent.mm.plugin.appbrand.appcache.q0 r8 = r0.mo115781a()
                com.tencent.mm.plugin.appbrand.appcache.j1 r9 = r0.f243941i
                com.tencent.mm.plugin.appbrand.launching.m1$d r0 = r0.f243934b
                int r0 = r0.f243619g
                boolean r10 = r8 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81258h3
                if (r10 == 0) goto L_0x0220
                com.tencent.mm.plugin.appbrand.appcache.z2 r8 = new com.tencent.mm.plugin.appbrand.appcache.z2
                r8.<init>()
                goto L_0x0229
            L_0x0220:
                boolean r10 = r8 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81387x2
                if (r10 == 0) goto L_0x0465
                com.tencent.mm.plugin.appbrand.appcache.a3 r8 = new com.tencent.mm.plugin.appbrand.appcache.a3
                r8.<init>()
            L_0x0229:
                java.lang.String r9 = r9.toString()
                r8.field_appId = r9
                r8.field_debugType = r0
                boolean r0 = r7 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c
                if (r0 == 0) goto L_0x023c
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r7 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r7
                int r0 = r7.f243634a
                r8.field_version = r0
                goto L_0x0249
            L_0x023c:
                boolean r0 = r7 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a
                if (r0 == 0) goto L_0x0249
                r0 = r8
                com.tencent.mm.plugin.appbrand.appcache.a3 r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C81227a3) r0
                com.tencent.mm.plugin.appbrand.launching.m1$g$a r7 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a) r7
                java.lang.String r7 = r7.f243630a
                r0.field_versionDesc = r7
            L_0x0249:
                r0 = 0
            L_0x024a:
                java.lang.String r7 = r8.field_versionMd5
                java.lang.String r9 = r8.field_NewMd5
                boolean r10 = gy3.C87412m.m108589b(r9, r9)
                if (r10 != 0) goto L_0x0287
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "clear checksum: versionMD5["
                r10.append(r11)
                java.lang.String r11 = r8.field_versionMd5
                r10.append(r11)
                java.lang.String r11 = "] newMD5["
                r10.append(r11)
                java.lang.String r11 = r8.field_NewMd5
                r10.append(r11)
                java.lang.String r11 = "] respMD5["
                r10.append(r11)
                java.lang.String r11 = r2.f259559f
                r10.append(r11)
                r11 = 93
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
                r10 = 0
                r8.field_checksum = r10
            L_0x0287:
                java.lang.String r10 = r8.field_versionMd5
                if (r10 == 0) goto L_0x0294
                int r10 = r10.length()
                if (r10 != 0) goto L_0x0292
                goto L_0x0294
            L_0x0292:
                r10 = 0
                goto L_0x0295
            L_0x0294:
                r10 = 1
            L_0x0295:
                if (r10 == 0) goto L_0x029b
                java.lang.String r10 = r2.f259559f
                r8.field_versionMd5 = r10
            L_0x029b:
                java.lang.String r10 = r2.f259559f
                r8.field_NewMd5 = r10
                int r10 = r2.f259561h
                r8.field_version = r10
                java.lang.String r10 = r2.f259558e
                r8.field_downloadURL = r10
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                r8.field_createTime = r10
                if (r0 == 0) goto L_0x02ba
                com.tencent.mm.plugin.appbrand.launching.u0 r0 = r1.f243955f
                com.tencent.mm.plugin.appbrand.appcache.q0 r0 = r0.mo115781a()
                boolean r0 = com.tencent.p014mm.plugin.appbrand.appcache.C81277j3.m99636b(r0, r8)
                goto L_0x02e2
            L_0x02ba:
                com.tencent.mm.plugin.appbrand.launching.u0 r0 = r1.f243955f
                com.tencent.mm.plugin.appbrand.appcache.q0 r0 = r0.mo115781a()
                java.lang.String r10 = "<this>"
                gy3.C87412m.m108594g(r0, r10)
                boolean r10 = r0 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81258h3
                if (r10 == 0) goto L_0x02d3
                com.tencent.mm.plugin.appbrand.appcache.h3 r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C81258h3) r0
                r10 = r8
                com.tencent.mm.plugin.appbrand.appcache.z2 r10 = (com.tencent.p014mm.plugin.appbrand.appcache.C29315z2) r10
                boolean r0 = r0.mo113534q(r10)
                goto L_0x02e2
            L_0x02d3:
                boolean r10 = r0 instanceof com.tencent.p014mm.plugin.appbrand.appcache.C81387x2
                if (r10 == 0) goto L_0x02e1
                com.tencent.mm.plugin.appbrand.appcache.x2 r0 = (com.tencent.p014mm.plugin.appbrand.appcache.C81387x2) r0
                r10 = r8
                com.tencent.mm.plugin.appbrand.appcache.a3 r10 = (com.tencent.p014mm.plugin.appbrand.appcache.C81227a3) r10
                boolean r0 = r0.insert(r10)
                goto L_0x02e2
            L_0x02e1:
                r0 = 0
            L_0x02e2:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "cgiExecutor.onSuccess, updated("
                r10.append(r11)
                r10.append(r0)
                java.lang.String r0 = ") md5("
                r10.append(r0)
                r10.append(r7)
                r0 = 124(0x7c, float:1.74E-43)
                r10.append(r0)
                r10.append(r9)
                java.lang.String r7 = ")->("
                r10.append(r7)
                java.lang.String r7 = r8.field_versionMd5
                r10.append(r7)
                r10.append(r0)
                java.lang.String r0 = r8.field_NewMd5
                r10.append(r0)
                java.lang.String r0 = ") with key("
                r10.append(r0)
                java.lang.String r0 = r8.field_appId
                r10.append(r0)
                java.lang.String r0 = "), versionType("
                r10.append(r0)
                int r0 = r8.field_debugType
                r10.append(r0)
                java.lang.String r0 = "), version("
                r10.append(r0)
                int r0 = r8.field_version
                r10.append(r0)
                r0 = 41
                r10.append(r0)
                java.lang.String r0 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                com.tencent.mm.plugin.appbrand.launching.o1$a r0 = r1.f243956g
                boolean r0 = r0.f243674o
                if (r0 == 0) goto L_0x0414
                java.lang.String r0 = r8.field_appId
                int r7 = r8.field_debugType
                int r9 = r8.field_version
                com.tencent.mm.plugin.appbrand.launching.u0 r10 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$d r10 = r10.f243934b
                com.tencent.mm.plugin.appbrand.launching.m1$g r10 = r10.f243620h
                boolean r11 = r10 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a
                if (r11 == 0) goto L_0x0354
                com.tencent.mm.plugin.appbrand.launching.m1$g$a r10 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a) r10
                goto L_0x0355
            L_0x0354:
                r10 = 0
            L_0x0355:
                if (r10 == 0) goto L_0x035a
                java.lang.String r10 = r10.f243630a
                goto L_0x035b
            L_0x035a:
                r10 = 0
            L_0x035b:
                android.util.Pair r0 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99519b(r0, r7, r9, r10)
                java.lang.String r7 = "checkPkg(record.field_ap… as? VERSION.DESC)?.desc)"
                gy3.C87412m.m108593f(r0, r7)
                java.lang.Object r7 = r0.first
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r7 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a) r7
                java.lang.Object r0 = r0.second
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r0 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) r0
                if (r0 == 0) goto L_0x03dd
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "cgiExecutor.onSuccess, latest request already cached, request="
                r2.append(r4)
                com.tencent.mm.plugin.appbrand.launching.u0 r4 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$d r4 = r4.f243934b
                r2.append(r4)
                r2.append(r3)
                int r3 = r0.pkgVersion()
                r2.append(r3)
                java.lang.String r3 = " md5:"
                r2.append(r3)
                java.lang.String r3 = r0.checksumMd5()
                r2.append(r3)
                java.lang.String r3 = " path:"
                r2.append(r3)
                java.lang.String r3 = r0.pkgPath()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r2 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_LOCAL_EXIST
                if (r7 != r2) goto L_0x03b9
                java.lang.String r2 = r0.pkgPath
                r8.field_pkgPath = r2
                com.tencent.mm.plugin.appbrand.launching.u0 r2 = r1.f243955f
                com.tencent.mm.plugin.appbrand.appcache.q0 r2 = r2.mo115781a()
                com.tencent.p014mm.plugin.appbrand.appcache.C81277j3.m99635a(r2, r8)
            L_0x03b9:
                com.tencent.mm.plugin.appbrand.launching.u0 r2 = r1.f243955f
                fy3.l<com.tencent.mm.plugin.appbrand.launching.m1$e, rx3.b0> r3 = r2.f243938f
                com.tencent.mm.plugin.appbrand.launching.u0$c r9 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.f243945a
                com.tencent.mm.plugin.appbrand.launching.m1$d r10 = r2.f243934b
                java.lang.String r11 = r0.pkgPath
                java.lang.String r2 = "pkg.pkgPath"
                gy3.C87412m.m108593f(r11, r2)
                java.lang.String r12 = r0.md5
                int r13 = r8.field_version
                com.tencent.mm.plugin.appbrand.launching.m1$f$a r14 = new com.tencent.mm.plugin.appbrand.launching.m1$f$a
                r14.<init>(r6)
                com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r9.mo115784a(r10, r11, r12, r13, r14)
                com.tencent.mm.plugin.appbrand.launching.u0$f r3 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83490f) r3
                r3.invoke(r0)
                goto L_0x0497
            L_0x03dd:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "cgiExecutor.onSuccess, latest request find cached pkg with error:"
                r0.append(r3)
                r0.append(r7)
                java.lang.String r3 = " request:"
                r0.append(r3)
                com.tencent.mm.plugin.appbrand.launching.u0 r3 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$d r3 = r3.f243934b
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.ENV_ERR
                if (r7 == r0) goto L_0x0405
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r0 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_MANIFEST_NULL
                if (r7 != r0) goto L_0x0414
            L_0x0405:
                com.tencent.mm.plugin.appbrand.launching.u0 r0 = r1.f243955f
                fy3.p<com.tencent.mm.plugin.appbrand.launching.m1$a, java.lang.String, rx3.b0> r0 = r0.f243939g
                com.tencent.mm.plugin.appbrand.launching.m1$a r2 = com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83369a.ENV_ERR
                com.tencent.mm.plugin.appbrand.launching.u0$d r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83488d) r0
                java.lang.String r3 = "find cached pkg failed"
                r0.invoke(r2, r3)
                goto L_0x0497
            L_0x0414:
                com.tencent.mm.plugin.appbrand.launching.u0$c r0 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83487c.f243945a
                com.tencent.mm.plugin.appbrand.launching.u0 r3 = r1.f243955f
                com.tencent.mm.plugin.appbrand.appcache.q0 r3 = r3.mo115781a()
                com.tencent.mm.plugin.appbrand.launching.u0 r5 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$d r5 = r5.f243934b
                com.tencent.mm.plugin.appbrand.launching.m1$e r0 = r0.mo115785b(r3, r5, r8)
                if (r0 == 0) goto L_0x0430
                com.tencent.mm.plugin.appbrand.launching.u0 r2 = r1.f243955f
                fy3.l<com.tencent.mm.plugin.appbrand.launching.m1$e, rx3.b0> r2 = r2.f243938f
                com.tencent.mm.plugin.appbrand.launching.u0$f r2 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83490f) r2
                r2.invoke(r0)
                goto L_0x0497
            L_0x0430:
                com.tencent.mm.plugin.appbrand.launching.u0 r0 = r1.f243955f
                com.tencent.mm.plugin.appbrand.launching.m1$c r3 = r0.f243937e
                if (r3 == 0) goto L_0x043f
                com.tencent.mm.plugin.appbrand.launching.m1$d r0 = r0.f243934b
                int r5 = r2.f259561h
                java.lang.String r6 = r2.f259565o
                r3.mo115597a(r0, r5, r6)
            L_0x043f:
                com.tencent.mm.plugin.appbrand.launching.u0$a r5 = new com.tencent.mm.plugin.appbrand.launching.u0$a
                com.tencent.mm.plugin.appbrand.launching.u0 r6 = r1.f243955f
                r5.<init>()
                com.tencent.mm.plugin.appbrand.launching.o1$a r3 = r1.f243956g
                java.lang.String r7 = r2.f259559f
                java.lang.String r0 = "request"
                gy3.C87412m.m108594g(r3, r0)
                fy3.l<com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress, rx3.b0> r0 = r6.f243940h
                com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress r2 = com.tencent.p014mm.plugin.appbrand.launching.C83484u0.f243933m
                com.tencent.mm.plugin.appbrand.launching.u0$e r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83489e) r0
                r0.invoke(r2)
                mp3.i r0 = mp3.C88819d.LOGIC
                com.tencent.mm.plugin.appbrand.launching.q0 r8 = new com.tencent.mm.plugin.appbrand.launching.q0
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r0.arrange(r8)
                goto L_0x0497
            L_0x0465:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unrecognized storage class:"
                r2.append(r3)
                java.lang.Class r3 = r8.getClass()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0488:
                com.tencent.mm.plugin.appbrand.launching.u0 r0 = r1.f243955f
                fy3.p<com.tencent.mm.plugin.appbrand.launching.m1$a, java.lang.String, rx3.b0> r0 = r0.f243939g
                com.tencent.mm.plugin.appbrand.launching.m1$a r2 = com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83369a.CGI_GET_URL_FAILED_EXPIRED_VERSION
                java.lang.String r3 = java.lang.String.valueOf(r3)
                com.tencent.mm.plugin.appbrand.launching.u0$d r0 = (com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83488d) r0
                r0.invoke(r2, r3)
            L_0x0497:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83484u0.C83492h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$i */
    public static final class C83493i extends C87413o implements C32228q<Integer, Integer, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f243957d;

        /* renamed from: e */
        public final /* synthetic */ MTimerHandler f243958e;

        /* renamed from: f */
        public final /* synthetic */ C83484u0 f243959f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83493i(AtomicBoolean atomicBoolean, MTimerHandler mTimerHandler, C83484u0 u0Var) {
            super(3);
            this.f243957d = atomicBoolean;
            this.f243958e = mTimerHandler;
            this.f243959f = u0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            String str = (String) obj3;
            if (!this.f243957d.get()) {
                this.f243958e.stopTimer();
                C83368m1.C83369a aVar = 4 == intValue ? C83368m1.C83369a.CGI_GET_URL_FAILED_SERVER_ERROR : C83368m1.C83369a.CGI_GET_URL_FAILED_NETWORK;
                C32227p<C83368m1.C83369a, String, C13598b0> pVar = this.f243959f.f243939g;
                ((C83488d) pVar).invoke(aVar, '(' + intValue + ',' + intValue2 + ") " + Util.nullAsNil(str));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.u0$j */
    public static final class C83494j implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ AtomicBoolean f243960d;

        /* renamed from: e */
        public final /* synthetic */ C83484u0 f243961e;

        public C83494j(AtomicBoolean atomicBoolean, C83484u0 u0Var) {
            this.f243960d = atomicBoolean;
            this.f243961e = u0Var;
        }

        public final boolean onTimerExpired() {
            this.f243960d.set(true);
            ((C83488d) this.f243961e.f243939g).invoke(C83368m1.C83369a.CGI_GET_URL_FAILED_TIMEOUT, (Object) null);
            return true;
        }
    }

    public C83484u0(C83368m1.C83374d dVar, C32226l<? super C83368m1.C83377e, C13598b0> lVar, C32227p<? super C83368m1.C83369a, ? super String, C13598b0> pVar, C32226l<? super WxaPkgLoadProgress, C13598b0> lVar2, C83397o1 o1Var, C90422jy jyVar, C83368m1.C83373c cVar) {
        C87412m.m108594g(dVar, "request");
        C87412m.m108594g(lVar, "onSuccess");
        C87412m.m108594g(pVar, "onError");
        C87412m.m108594g(lVar2, "onProgress");
        C87412m.m108594g(o1Var, "cgiExecutor");
        C87412m.m108594g(jyVar, "cgiCommRequestSource");
        this.f243934b = dVar;
        this.f243935c = o1Var;
        this.f243936d = jyVar;
        this.f243937e = cVar;
        this.f243938f = new C83490f(lVar, this);
        this.f243939g = new C83488d(pVar, this);
        this.f243940h = new C83489e(lVar2, this);
        this.f243941i = dVar.mo115637a();
    }

    /* renamed from: a */
    public final C81347q0<? extends C29222i> mo115781a() {
        return (C81347q0) ((C36570n) this.f243942j).getValue();
    }

    /* renamed from: b */
    public final void mo115782b(C29222i iVar) {
        Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "prepare to move wxapkg to new dir");
        String str = null;
        String str2 = iVar != null ? iVar.field_pkgPath : null;
        if (str2 == null) {
            Log.m105920e("MicroMsg.AppBrand.CommonPkgFetcher", "prepare to move wxapkg to new dir, path is null");
            return;
        }
        String j = C81372u2.m99810j(iVar.field_appId, str2);
        if (!Util.isNullOrNil(j)) {
            Log.m105920e("MicroMsg.AppBrand.CommonPkgFetcher", "prepare to move wxapkg to new dir, origin path: " + str2);
            if (C86013q1.m106463x(str2, j)) {
                try {
                    C87412m.m108591d(j);
                    str = WxaPkgWrappingInfo.m99521f(new C86009m1(j));
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.AppBrand.CommonPkgFetcher", "get file md5 fail", e);
                }
                String nullAsNil = Util.nullAsNil(str);
                if (C87412m.m108589b(nullAsNil, iVar.field_versionMd5) || C87412m.m108589b(nullAsNil, iVar.field_NewMd5)) {
                    iVar.field_pkgPath = j;
                    if (C81277j3.m99635a(mo115781a(), iVar)) {
                        ((C81295n0) C86312j.m106911c(C81295n0.class)).mo56503tJ(str2);
                        Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "update dir success");
                    } else {
                        iVar.field_pkgPath = str2;
                    }
                } else {
                    Log.m105920e("MicroMsg.AppBrand.CommonPkgFetcher", "check md5 fail after file move");
                }
                Log.m105924i("MicroMsg.AppBrand.CommonPkgFetcher", "move wxapkg to new dir success");
                return;
            }
            Log.m105920e("MicroMsg.AppBrand.CommonPkgFetcher", "move wxapkg to new dir, move fail, new path: " + j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ae  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115783c() {
        /*
            r16 = this;
            r0 = r16
            com.tencent.mm.plugin.appbrand.launching.o1$a r2 = new com.tencent.mm.plugin.appbrand.launching.o1$a
            r2.<init>()
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r0.f243934b
            java.lang.String r1 = r1.f243616d
            java.lang.String r3 = "<set-?>"
            gy3.C87412m.m108594g(r1, r3)
            r2.f243666d = r1
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r0.f243934b
            int r1 = r1.f243618f
            int[] r3 = or3.C89286a.f257215d
            boolean r3 = sx3.C110823p.m151008x(r3, r1)
            r4 = 0
            if (r3 == 0) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            int[] r3 = or3.C89286a.f257214c
            boolean r1 = sx3.C110823p.m151008x(r3, r1)
            if (r1 == 0) goto L_0x002a
        L_0x0028:
            r1 = r4
            goto L_0x002e
        L_0x002a:
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r0.f243934b
            java.lang.String r1 = r1.f243617e
        L_0x002e:
            r2.f243667e = r1
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r0.f243934b
            int r3 = r1.f243618f
            r2.f243668f = r3
            int r1 = r1.f243619g
            r2.f243669g = r1
            boolean r1 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r1)
            r3 = 1
            r5 = 0
            if (r1 == 0) goto L_0x01bc
            int[] r1 = or3.C89286a.f257214c
            com.tencent.mm.plugin.appbrand.launching.m1$d r6 = r0.f243934b
            int r6 = r6.f243618f
            boolean r1 = sx3.C110823p.m151008x(r1, r6)
            if (r1 == 0) goto L_0x00f4
            boolean r1 = r2.f243674o
            if (r1 == 0) goto L_0x005e
            com.tencent.mm.plugin.appbrand.appcache.j1 r1 = r0.f243941i
            java.lang.String r1 = r1.toString()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102337b(r1, r5)
            goto L_0x00fe
        L_0x005e:
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r0.f243934b
            com.tencent.mm.plugin.appbrand.launching.m1$g r1 = r1.f243620h
            boolean r6 = r1 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c
            if (r6 == 0) goto L_0x006b
            com.tencent.mm.plugin.appbrand.launching.m1$g$c r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r1
            int r1 = r1.f243634a
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            com.tencent.mm.plugin.appbrand.appcache.j1 r6 = r0.f243941i
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appcache.h3 r7 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g
            int[] r7 = r7.mo113543y(r6)
            if (r7 == 0) goto L_0x00f2
            int r8 = r7.length
            if (r8 > 0) goto L_0x0082
            goto L_0x00f2
        L_0x0082:
            r8 = r7[r5]
            int r8 = r1 - r8
            int r8 = java.lang.Math.abs(r8)
            int r9 = r7.length
            int r9 = r9 - r3
            r9 = r7[r9]
            int r9 = r1 - r9
            int r9 = java.lang.Math.abs(r9)
            if (r8 <= r9) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r8 = r9
        L_0x0098:
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r5] = r6
            java.lang.String r11 = java.util.Arrays.toString(r7)
            r10[r3] = r11
            java.lang.String r11 = "MicroMsg.AppBrand.Launching.CheckPkgLogic"
            java.lang.String r12 = "findAvailablePluginPkg appId:%s,versionArray:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r10)
            int r10 = r7.length
            r12 = r8
            r13 = 0
            r8 = r4
        L_0x00ae:
            if (r13 >= r10) goto L_0x00d1
            r14 = r7[r13]
            int r15 = r1 - r14
            int r15 = java.lang.Math.abs(r15)
            android.util.Pair r14 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.m99519b(r6, r5, r14, r4)
            java.lang.Object r4 = r14.first
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker$a r9 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.C81220a.APP_READY
            if (r4 != r9) goto L_0x00cc
            java.lang.Object r4 = r14.second
            if (r4 == 0) goto L_0x00cc
            if (r15 > r12) goto L_0x00cc
            r8 = r4
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r8 = (com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) r8
            r12 = r15
        L_0x00cc:
            int r13 = r13 + 1
            r4 = 0
            r9 = 2
            goto L_0x00ae
        L_0x00d1:
            if (r8 == 0) goto L_0x00f0
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r4[r5] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r3] = r1
            int r1 = r8.pkgVersion
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 2
            r4[r6] = r1
            java.lang.String r1 = "findAvailablePluginPkg leastStep:%d,desireVersion:%d,localVersion:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r4)
        L_0x00f0:
            r1 = r8
            goto L_0x00fe
        L_0x00f2:
            r1 = 0
            goto L_0x00fe
        L_0x00f4:
            com.tencent.mm.plugin.appbrand.appcache.j1 r1 = r0.f243941i
            java.lang.String r1 = r1.toString()
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r1 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102337b(r1, r3)
        L_0x00fe:
            if (r1 == 0) goto L_0x01bc
            java.lang.Class<com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage> r4 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage.class
            java.lang.Object r4 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r4)
            com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage r4 = (com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage) r4
            r6 = 0
            if (r4 == 0) goto L_0x0120
            com.tencent.mm.plugin.appbrand.launching.m1$d r8 = r0.f243934b
            java.lang.String r8 = r8.f243616d
            ki0.g r4 = r4.mo56572e(r8)
            if (r4 == 0) goto L_0x0119
            long r8 = r4.field_timestamp
            goto L_0x011b
        L_0x0119:
            r8 = -1
        L_0x011b:
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            goto L_0x0121
        L_0x0120:
            r8 = r6
        L_0x0121:
            java.lang.String r4 = r1.pkgPath()     // Catch:{ Exception -> 0x0169 }
            gy3.C87412m.m108591d(r4)     // Catch:{ Exception -> 0x0169 }
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r10 = r4.getPath()     // Catch:{ Exception -> 0x0169 }
            if (r10 == 0) goto L_0x014c
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r5, r5)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r11 = r4.getPath()     // Catch:{ Exception -> 0x0169 }
            boolean r11 = r11.equals(r10)     // Catch:{ Exception -> 0x0169 }
            if (r11 != 0) goto L_0x014c
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ Exception -> 0x0169 }
            android.net.Uri$Builder r4 = r4.path(r10)     // Catch:{ Exception -> 0x0169 }
            android.net.Uri r4 = r4.build()     // Catch:{ Exception -> 0x0169 }
        L_0x014c:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0169 }
            r11 = 0
            com.tencent.mm.vfs.f0$h r4 = r10.mo177799l(r4, r11)     // Catch:{ Exception -> 0x0169 }
            boolean r10 = r4.mo177810a()     // Catch:{ Exception -> 0x0169 }
            if (r10 != 0) goto L_0x015a
            goto L_0x0164
        L_0x015a:
            com.tencent.mm.vfs.FileSystem$c r10 = r4.f348991a     // Catch:{ Exception -> 0x0169 }
            java.lang.String r4 = r4.f348992b     // Catch:{ Exception -> 0x0169 }
            com.tencent.mm.vfs.b0 r4 = r10.mo119945q(r4)     // Catch:{ Exception -> 0x0169 }
            if (r4 != 0) goto L_0x0166
        L_0x0164:
            r10 = r6
            goto L_0x016e
        L_0x0166:
            long r10 = r4.f250475e     // Catch:{ Exception -> 0x0169 }
            goto L_0x016e
        L_0x0169:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x016e:
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x01ae
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x01ae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "waitForDownload(), request:"
            r4.append(r6)
            com.tencent.mm.plugin.appbrand.launching.m1$d r6 = r0.f243934b
            r4.append(r6)
            java.lang.String r6 = ", fill localPkgVersion, find version("
            r4.append(r6)
            int r1 = r1.pkgVersion
            r4.append(r1)
            java.lang.String r1 = ") but lastModified("
            r4.append(r1)
            r4.append(r10)
            java.lang.String r1 = ") is marked as invalid until "
            r4.append(r1)
            r4.append(r8)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "MicroMsg.AppBrand.CommonPkgFetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r2.f243673n = r5
            r2.f243672j = r5
            goto L_0x01bc
        L_0x01ae:
            int r4 = r1.pkgVersion
            r2.f243673n = r4
            java.lang.String r1 = r1.pkgPath()
            int r1 = com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg.m99509d(r1)
            r2.f243672j = r1
        L_0x01bc:
            com.tencent.mm.plugin.appbrand.launching.m1$d r1 = r0.f243934b
            boolean r4 = r1.f243621i
            r4 = r4 ^ r3
            r2.f243672j = r4
            com.tencent.mm.plugin.appbrand.launching.m1$g r1 = r1.f243620h
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c
            if (r4 == 0) goto L_0x01d0
            com.tencent.mm.plugin.appbrand.launching.m1$g$c r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r1
            int r1 = r1.f243634a
            r2.f243670h = r1
            goto L_0x01ed
        L_0x01d0:
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b
            if (r4 == 0) goto L_0x01e1
            com.tencent.mm.plugin.appbrand.launching.m1$g$b r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b) r1
            int r4 = r1.f243631a
            r2.f243670h = r4
            r2.f243674o = r3
            java.lang.String r1 = r1.f243633c
            r2.f243675p = r1
            goto L_0x01ed
        L_0x01e1:
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a
            if (r3 == 0) goto L_0x01ed
            r2.f243670h = r5
            com.tencent.mm.plugin.appbrand.launching.m1$g$a r1 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83382a) r1
            java.lang.String r1 = r1.f243630a
            r2.f243671i = r1
        L_0x01ed:
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r5)
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.plugin.appbrand.launching.u0$j r4 = new com.tencent.mm.plugin.appbrand.launching.u0$j
            r4.<init>(r1, r0)
            r3.<init>(r4, r5)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r5 = 1
            long r4 = r4.toMillis(r5)
            r3.startTimer(r4)
            com.tencent.mm.plugin.appbrand.launching.o1 r4 = r0.f243935c
            com.tencent.mm.plugin.appbrand.launching.u0$h r5 = new com.tencent.mm.plugin.appbrand.launching.u0$h
            r5.<init>(r1, r3, r0, r2)
            com.tencent.mm.plugin.appbrand.launching.u0$i r6 = new com.tencent.mm.plugin.appbrand.launching.u0$i
            r6.<init>(r1, r3, r0)
            te3.jy r7 = r0.f243936d
            r8 = 0
            r1 = r4
            r3 = r5
            r4 = r6
            r5 = r8
            r6 = r7
            r1.mo115538a(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83484u0.mo115783c():void");
    }
}
