package xo0;

import android.content.Context;
import android.util.Pair;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81273j1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81372u2;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81344s;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.util.List;
import kr0.C76629w0;
import kr0.C88273g1;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import nr3.C89059e;
import nr3.C89060f;
import o40.C61926c;
import p210o.C11323a;
import p910lj.C76701a;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C90415hz1;
import te3.C90424kt3;
import xo0.C38782e;
import yo0.C91535b;

@C86522b(creator = C38782e.C38783a.class, dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: xo0.a */
public final class C91313a extends C86301e implements C91535b {

    /* renamed from: d */
    public static final C91313a f261928d = new C91313a();

    /* renamed from: xo0.a$a */
    public static final class C91314a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91535b.C91536a f261929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91314a(C91535b.C91536a aVar) {
            super(0);
            this.f261929d = aVar;
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C76701a.makeText(context, (CharSequence) "WxaPkg path from OpenSdk accepted appId[" + this.f261929d.f259876d + "] key[" + this.f261929d.f259877e + "] version[" + this.f261929d.f259879g + ']', 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xo0.a$b */
    public static final class C91315b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f261930a;

        public C91315b(String str) {
            this.f261930a = str;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106878CE(this.f261930a, new C91318b(C88643g.m110545c()));
            return null;
        }
    }

    /* renamed from: xo0.a$c */
    public static final class C91316c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C88273g1 f261931a;

        /* renamed from: b */
        public final /* synthetic */ String f261932b;

        /* renamed from: c */
        public final /* synthetic */ String f261933c;

        public C91316c(C88273g1 g1Var, String str, String str2) {
            this.f261931a = g1Var;
            this.f261932b = str;
            this.f261933c = str2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.LinkedList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
            if (gy3.C87412m.m108589b(com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, r11.f239472d) == false) goto L_0x0166;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r1 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes) r1
                com.tencent.luggage.sdk.processes.LuggageServiceType r2 = com.tencent.luggage.sdk.processes.LuggageServiceType.WASERVICE
                r3 = 0
                java.lang.String r4 = "MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl"
                if (r1 == 0) goto L_0x02b3
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r1.mo113942o2()
                if (r5 != 0) goto L_0x0015
                goto L_0x02b3
            L_0x0015:
                java.lang.String r5 = r1.field_appId
                r6 = 0
                r7 = 1
                if (r5 == 0) goto L_0x0024
                int r5 = r5.length()
                if (r5 != 0) goto L_0x0022
                goto L_0x0024
            L_0x0022:
                r5 = 0
                goto L_0x0025
            L_0x0024:
                r5 = 1
            L_0x0025:
                if (r5 == 0) goto L_0x0037
                java.lang.String r1 = "prefetchContactAndPkgDownloadInfo EMPTY wxaAttrs.appId interrupt"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                lp3.b r1 = lp3.C88643g.m110544b()
                r1.mo72091a(r3)
                r2 = r3
                goto L_0x02c1
            L_0x0037:
                lp3.b r4 = lp3.C88643g.m110545c()
                kr0.g1 r5 = r0.f261931a
                if (r5 == 0) goto L_0x0086
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r1.mo113940m2()
                if (r5 == 0) goto L_0x004d
                boolean r5 = r5.mo113970a()
                if (r5 != r7) goto L_0x004d
                r5 = 1
                goto L_0x004e
            L_0x004d:
                r5 = 0
            L_0x004e:
                if (r5 == 0) goto L_0x005e
                com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r2 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
                com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r2 = r2.mo116962a()
                com.tencent.luggage.sdk.processes.LuggageServiceType r5 = com.tencent.luggage.sdk.processes.LuggageServiceType.WAGAME
                kr0.g1 r8 = r0.f261931a
                r2.mo116954S(r5, r8)
                goto L_0x0086
            L_0x005e:
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r5 = r1.mo113940m2()
                if (r5 == 0) goto L_0x006c
                boolean r5 = r5.mo113971b()
                if (r5 != r7) goto L_0x006c
                r5 = 1
                goto L_0x006d
            L_0x006c:
                r5 = 0
            L_0x006d:
                if (r5 == 0) goto L_0x007b
                com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r5 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
                com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r5 = r5.mo116962a()
                kr0.g1 r8 = r0.f261931a
                r5.mo116954S(r2, r8)
                goto L_0x0086
            L_0x007b:
                com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager$b r5 = com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager.f246131g
                com.tencent.mm.plugin.appbrand.task.AppBrandProcessesManager r5 = r5.mo116962a()
                kr0.g1 r8 = r0.f261931a
                r5.mo116954S(r2, r8)
            L_0x0086:
                java.lang.String r2 = r1.field_appId
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r5 = r1.mo113942o2()
                int r8 = r5.f239452d
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$a r9 = r1.mo113940m2()
                boolean r15 = r9.mo113970a()
                com.tencent.mm.plugin.appbrand.launching.w1 r14 = com.tencent.p014mm.plugin.appbrand.launching.C83511w1.f243992a
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r1 = r1.mo113942o2()
                java.lang.String r9 = "wxaAttrs.versionInfo"
                gy3.C87412m.m108593f(r1, r9)
                java.lang.String r9 = "appId"
                gy3.C87412m.m108593f(r2, r9)
                r11 = 0
                int r12 = r5.f239452d
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r9 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.m99632a()
                if (r9 != 0) goto L_0x00b3
                com.tencent.p014mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader.m99497a()
            L_0x00b3:
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r16 = com.tencent.p014mm.plugin.appbrand.appcache.C81274j2.m99632a()
                r9 = r14
                r10 = r2
                r13 = r15
                r7 = r14
                r14 = r16
                boolean r9 = r9.mo115801a(r10, r11, r12, r13, r14)
                java.util.Map r1 = r7.mo115802b(r1, r2, r9)
                boolean r7 = r5.f239461p
                java.lang.String r9 = "__APP__"
                if (r7 == 0) goto L_0x016a
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r7 = r5.f239460o
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
                if (r7 != 0) goto L_0x016a
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
                java.lang.String r10 = r0.f261932b
                java.lang.String r10 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99875i(r10)
                java.lang.String r17 = p225rc.C89925n.m112488a(r10)
                if (r17 == 0) goto L_0x00ed
                int r10 = r17.length()
                if (r10 != 0) goto L_0x00eb
                goto L_0x00ed
            L_0x00eb:
                r10 = 0
                goto L_0x00ee
            L_0x00ed:
                r10 = 1
            L_0x00ee:
                if (r10 == 0) goto L_0x0120
                java.lang.String r10 = r5.f239462q
                if (r10 == 0) goto L_0x00fd
                int r10 = r10.length()
                if (r10 != 0) goto L_0x00fb
                goto L_0x00fd
            L_0x00fb:
                r10 = 0
                goto L_0x00fe
            L_0x00fd:
                r10 = 1
            L_0x00fe:
                if (r10 == 0) goto L_0x0101
                goto L_0x011e
            L_0x0101:
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r10 = r5.f239460o
                java.util.Iterator r10 = r10.iterator()
            L_0x0107:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x011e
                java.lang.Object r11 = r10.next()
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r11 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r11
                java.lang.String r12 = r5.f239462q
                java.lang.String r13 = r11.f239472d
                boolean r12 = gy3.C87412m.m108589b(r12, r13)
                if (r12 == 0) goto L_0x0107
                goto L_0x0151
            L_0x011e:
                r11 = r3
                goto L_0x0151
            L_0x0120:
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo> r5 = r5.f239460o
                java.lang.String r10 = "versionInfo.moduleList"
                gy3.C87412m.m108593f(r5, r10)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "prefetchContactAndPkgDownloadInfo  appId:"
                r10.append(r11)
                r10.append(r2)
                java.lang.String r11 = " versionType:"
                r10.append(r11)
                r10.append(r6)
                java.lang.String r18 = r10.toString()
                r19 = 0
                r20 = 4
                r21 = 0
                r16 = r5
                java.lang.Object r5 = op0.C89277n.m111584a(r16, r17, r18, r19, r20, r21)
                r11 = r5
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo r11 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaVersionModuleInfo) r11
            L_0x0151:
                if (r11 == 0) goto L_0x0158
                java.lang.String r5 = r11.f239472d
                r7.add(r5)
            L_0x0158:
                if (r11 == 0) goto L_0x0166
                boolean r5 = r11.f239474f
                if (r5 != 0) goto L_0x0172
                java.lang.String r5 = r11.f239472d
                boolean r5 = gy3.C87412m.m108589b(r9, r5)
                if (r5 != 0) goto L_0x0172
            L_0x0166:
                r7.add(r9)
                goto L_0x0172
            L_0x016a:
                java.lang.String[] r5 = new java.lang.String[]{r9}
                java.util.ArrayList r7 = sx3.C64197v.m75534c(r5)
            L_0x0172:
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x017b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0217
                java.lang.Object r9 = r7.next()
                r11 = r9
                java.lang.String r11 = (java.lang.String) r11
                r9 = r1
                android.util.ArrayMap r9 = (android.util.ArrayMap) r9
                java.lang.Object r9 = r9.get(r11)
                r14 = r9
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo r14 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaWidgetInfo) r14
                if (r14 == 0) goto L_0x01f7
                com.tencent.mm.plugin.appbrand.launching.m1$d r13 = new com.tencent.mm.plugin.appbrand.launching.m1$d
                int r12 = r14.f239482d
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r22 = new com.tencent.mm.plugin.appbrand.launching.m1$g$c
                boolean r9 = com.tencent.p014mm.plugin.appbrand.appcache.C81289m.C81290a.m99664b(r6)
                if (r9 == 0) goto L_0x01a3
                r17 = r8
                goto L_0x01a5
            L_0x01a3:
                r17 = 0
            L_0x01a5:
                r18 = 0
                r20 = 2
                r21 = 0
                r16 = r22
                r16.<init>(r17, r18, r20, r21)
                com.tencent.mm.plugin.appbrand.launching.j1$a$a r9 = com.tencent.p014mm.plugin.appbrand.launching.C83344j1.C29580a.C29581a.f80508b
                boolean r9 = r9.mo56822a(r15, r3)
                r10 = 1
                r16 = r9 ^ 1
                r17 = 0
                r9 = r13
                r10 = r2
                r3 = r13
                r13 = r17
                r6 = r14
                r14 = r22
                r19 = r15
                r15 = r16
                r9.<init>(r10, r11, r12, r13, r14, r15)
                r5.add(r3)
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo> r3 = r6.f239484f
                if (r3 != 0) goto L_0x01d3
                sx3.f0 r3 = sx3.C64186f0.f181907d
            L_0x01d3:
                java.util.Iterator r3 = r3.iterator()
            L_0x01d7:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x01f2
                java.lang.Object r6 = r3.next()
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo r6 = (com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaPluginCodeInfo) r6
                java.lang.String r9 = "plugin"
                gy3.C87412m.m108593f(r6, r9)
                r9 = -1
                com.tencent.mm.plugin.appbrand.launching.m1$d r6 = com.tencent.p014mm.plugin.appbrand.launching.C83510w0.m102479b(r6, r9)
                r5.add(r6)
                goto L_0x01d7
            L_0x01f2:
                r15 = r19
                r3 = 0
                r6 = 0
                goto L_0x017b
            L_0x01f7:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid ModuleName("
                r2.append(r3)
                r2.append(r11)
                r3 = 41
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0217:
                te3.cb r1 = new te3.cb
                r1.<init>()
                java.util.Iterator r2 = r5.iterator()
            L_0x0220:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0288
                java.lang.Object r3 = r2.next()
                com.tencent.mm.plugin.appbrand.launching.m1$d r3 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83374d) r3
                java.util.LinkedList<te3.gz1> r5 = r1.f259441d
                xo0.a r6 = xo0.C91313a.f261928d
                r6.getClass()
                te3.gz1 r6 = new te3.gz1
                r6.<init>()
                te3.kt3 r7 = new te3.kt3
                r7.<init>()
                r6.f259532d = r7
                java.lang.String r8 = r3.f243616d
                r7.f259653d = r8
                int r8 = r3.f243618f
                int[] r9 = or3.C89286a.f257215d
                boolean r9 = sx3.C110823p.m151008x(r9, r8)
                if (r9 == 0) goto L_0x024e
                goto L_0x0256
            L_0x024e:
                int[] r9 = or3.C89286a.f257214c
                boolean r8 = sx3.C110823p.m151008x(r9, r8)
                if (r8 == 0) goto L_0x0258
            L_0x0256:
                r8 = 0
                goto L_0x025a
            L_0x0258:
                java.lang.String r8 = r3.f243617e
            L_0x025a:
                r7.f259655f = r8
                te3.kt3 r7 = r6.f259532d
                int r8 = r3.f243618f
                r7.f259656g = r8
                boolean r7 = r3.f243621i
                r8 = 1
                r7 = r7 ^ r8
                r6.f259534f = r7
                com.tencent.mm.plugin.appbrand.launching.m1$g r3 = r3.f243620h
                boolean r7 = r3 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b
                if (r7 == 0) goto L_0x0277
                r6.f259536h = r8
                com.tencent.mm.plugin.appbrand.launching.m1$g$b r3 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83383b) r3
                java.lang.String r3 = r3.f243633c
                r6.f259541p = r3
                goto L_0x0281
            L_0x0277:
                boolean r7 = r3 instanceof com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c
                if (r7 == 0) goto L_0x0281
                com.tencent.mm.plugin.appbrand.launching.m1$g$c r3 = (com.tencent.p014mm.plugin.appbrand.launching.C83368m1.C83381g.C83384c) r3
                int r3 = r3.f243634a
                r6.f259535g = r3
            L_0x0281:
                r3 = 0
                r6.f259537i = r3
                r5.add(r6)
                goto L_0x0220
            L_0x0288:
                r5 = 1
                r1.f259442e = r5
                te3.jy r2 = new te3.jy
                r2.<init>()
                r2.f259641f = r5
                r1.f259443f = r2
                com.tencent.mm.plugin.appbrand.appcache.j r2 = new com.tencent.mm.plugin.appbrand.appcache.j
                r2.<init>(r1)
                nr3.e r1 = r2.mo9225i()
                xo0.c r2 = new xo0.c
                java.lang.String r3 = r0.f261933c
                java.lang.String r5 = r0.f261932b
                r2.<init>(r4, r3, r5)
                r1.mo114038a(r2)
                xo0.d r2 = new xo0.d
                r2.<init>(r4)
                r1.mo123065b(r2)
                r2 = 0
                goto L_0x02c1
            L_0x02b3:
                java.lang.String r1 = "prefetchContactAndPkgDownloadInfo NULL wxaAttrs interrupt"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
                lp3.b r1 = lp3.C88643g.m110544b()
                r2 = 0
                r1.mo72091a(r2)
            L_0x02c1:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: xo0.C91313a.C91316c.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: xo0.a$d */
    public static final class C91317d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C11323a<WxaAttributes, Void> f261934d;

        /* renamed from: e */
        public final /* synthetic */ String f261935e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91317d(C11323a<WxaAttributes, Void> aVar, String str) {
            super(0);
            this.f261934d = aVar;
            this.f261935e = str;
        }

        public Object invoke() {
            C11323a<WxaAttributes, Void> aVar = this.f261934d;
            if (aVar != null) {
                Void apply = aVar.apply(C81161g2.Cx0().mo114000LL(this.f261935e, new String[0]));
            }
            return C13598b0.f38549a;
        }
    }

    public static final C91535b.C91536a vx0(C91313a aVar, C90415hz1 hz12) {
        aVar.getClass();
        C91535b.C91536a aVar2 = new C91535b.C91536a();
        C90424kt3 kt32 = hz12.f259564n;
        aVar2.f259876d = kt32.f259653d;
        String str = kt32.f259655f;
        if (str == null) {
            str = "";
        }
        aVar2.f259877e = str;
        aVar2.f259878f = kt32.f259656g;
        aVar2.f259879g = hz12.f259561h;
        aVar2.f262358h = hz12.f259559f;
        aVar2.f262359i = hz12.f259558e;
        aVar2.f262360j = (long) hz12.f259560g;
        return aVar2;
    }

    public C88633e<List<C91535b.C91536a>> Pc0(String str, String str2, C88273g1 g1Var) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "prefetchContactAndPkgDownloadInfo EMPTY USERNAME");
            return C89060f.m111325d((C88629c.C88630a) null);
        }
        C89059e<_Ret> A = C89060f.m111322a().mo123064p(new C91315b(str)).mo123064p(new C91316c(g1Var, str2, str));
        C87412m.m108593f(A, "username: String?, enter…n@`$logic` null\n        }");
        return A;
    }

    /* renamed from: jB */
    public void mo125306jB(List<? extends Pair<C91535b.C91536a, String>> list) {
        String str;
        if (list != null) {
            for (Pair pair : list) {
                C87412m.m108594g(pair, "<this>");
                C91535b.C91536a aVar = (C91535b.C91536a) pair.first;
                String str2 = (String) pair.second;
                if (aVar != null) {
                    String str3 = aVar.f259876d;
                    boolean z = true;
                    if (!(str3 == null || str3.length() == 0)) {
                        String str4 = aVar.f262358h;
                        if (!(str4 == null || str4.length() == 0)) {
                            if (str2 != null && C86013q1.m106450k(str2)) {
                                String str5 = null;
                                String str6 = aVar.f259876d;
                                String str7 = aVar.f259877e;
                                int i = aVar.f259878f;
                                String str8 = "";
                                if (i == 0) {
                                    str = str8;
                                } else if (i != 6) {
                                    str = ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
                                    if (i != 12) {
                                        if (i != 13) {
                                            str = ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
                                            if (i != 22) {
                                                if (i != 23) {
                                                    str = C81273j1.m99631a(str7);
                                                } else {
                                                    str = C81273j1.m99631a(str7) + '$' + str;
                                                }
                                            }
                                        } else {
                                            str = C81273j1.m99631a(str7) + '$' + str;
                                        }
                                    }
                                } else {
                                    str = ModulePkgInfo.PLUGIN_CODE;
                                }
                                if (Util.isNullOrNil((String) null)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str6);
                                    if (!Util.isNullOrNil(str)) {
                                        str8 = '$' + str;
                                    }
                                    sb.append(str8);
                                    str5 = sb.toString();
                                }
                                C87412m.m108593f(str5, "PkgQueryKey(pkg.appId, p…g.packageType).toString()");
                                C81161g2.requireAccountInitializedOnDemand();
                                C29315z2 m = C81161g2.f238471g.mo113533pl(str5, aVar.f259879g, 0, "versionMd5", "NewMd5");
                                if (m != null) {
                                    C87412m.m108591d(str2);
                                    String calcFileMD5 = CdnLogic.calcFileMD5(C86013q1.m106448i(str2, false));
                                    String[] strArr = {m.field_versionMd5, m.field_NewMd5};
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < 2) {
                                            String str9 = strArr[i2];
                                            if (!(str9 == null || str9.length() == 0) && C87412m.m108589b(str9, calcFileMD5)) {
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        String i3 = C81372u2.m99809i(str5, aVar.f259879g);
                                        C86013q1.m106463x(str2, i3);
                                        C81161g2.requireAccountInitializedOnDemand();
                                        C81161g2.f238471g.mo113514C(str5, 0, aVar.f259879g, i3);
                                        if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) {
                                            C61926c.m72668M(new C91314a(aVar));
                                        }
                                        Log.m105924i("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk accepted appId[" + aVar.f259876d + "] key[" + aVar.f259877e + "] version[" + aVar.f259879g + "] fileMD5[" + calcFileMD5 + ']');
                                    } else {
                                        Log.m105920e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk rejected appId[" + aVar.f259876d + "] key[" + aVar.f259877e + "] version[" + aVar.f259879g + "] fileMD5[" + calcFileMD5 + ']');
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: lO */
    public void mo125307lO(String str, C11323a<WxaAttributes, Void> aVar) {
        if (!(str == null || str.length() == 0)) {
            C81344s.f238811a.mo113619a(C26236u.m33719b(str), C81652f.C81653a.WX_OPEN_SDK_PRE_FETCH, new C91317d(aVar, str));
        } else if (aVar != null) {
            Void apply = aVar.apply(null);
        }
    }

    /* renamed from: za */
    public void mo125308za(String str, String str2) {
        new C91321g(str, str2).mo9225i();
    }
}
