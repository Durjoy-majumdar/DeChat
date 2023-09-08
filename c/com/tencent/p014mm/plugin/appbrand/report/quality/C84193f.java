package com.tencent.p014mm.plugin.appbrand.report.quality;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityAndroidPageContainerCostStruct;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83588k;
import com.tencent.p014mm.plugin.appbrand.page.AppBrandPageContainerWC;
import com.tencent.p014mm.plugin.appbrand.page.C40502j2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84136m;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13603j;

/* renamed from: com.tencent.mm.plugin.appbrand.report.quality.f */
public class C84193f {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/report/quality/f$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.f$a */
    public static final class C84194a implements C80916r<IPCVoid, IPCInteger> {
        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCInteger(C81682d.m100223c());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.quality.f$b */
    public /* synthetic */ class C84195b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f245931a;

        static {
            int[] iArr = new int[C84136m.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[5] = 5;
            iArr[4] = 6;
            int[] iArr2 = new int[WebView.WebViewKind.values().length];
            iArr2[WebView.WebViewKind.WV_KIND_NONE.ordinal()] = 1;
            iArr2[WebView.WebViewKind.WV_KIND_SYS.ordinal()] = 2;
            iArr2[WebView.WebViewKind.WV_KIND_X5.ordinal()] = 3;
            iArr2[WebView.WebViewKind.WV_KIND_CW.ordinal()] = 4;
            iArr2[WebView.WebViewKind.WV_KIND_PINUS.ordinal()] = 5;
            f245931a = iArr2;
        }
    }

    /* renamed from: a */
    public final void mo116897a(QualitySessionRuntime qualitySessionRuntime, String str) {
        if (qualitySessionRuntime != null) {
            return;
        }
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public final void mo116898b(AppBrandPageContainerWC appBrandPageContainerWC) {
        C87412m.m108594g(appBrandPageContainerWC, "pagecontainer");
        if (!(appBrandPageContainerWC.getRuntime() instanceof C83588k)) {
            WeAppQualityAndroidPageContainerCostStruct weAppQualityAndroidPageContainerCostStruct = new WeAppQualityAndroidPageContainerCostStruct();
            QualitySessionRuntime c = C84185b.m103770c(appBrandPageContainerWC.getAppId(), true);
            C83928t1 t1Var = null;
            if (c == null) {
                c = null;
            } else if (c.f245845F > 0) {
                weAppQualityAndroidPageContainerCostStruct.f236685d = weAppQualityAndroidPageContainerCostStruct.mo86045b("InstanceId", c.f245832d, true);
                weAppQualityAndroidPageContainerCostStruct.f236686e = weAppQualityAndroidPageContainerCostStruct.mo86045b("AppId", c.f245833e, true);
                weAppQualityAndroidPageContainerCostStruct.f236687f = (long) c.f245837i;
                int i = c.f245834f;
                weAppQualityAndroidPageContainerCostStruct.f236688g = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualityAndroidPageContainerCostStruct.C80759a.demo : WeAppQualityAndroidPageContainerCostStruct.C80759a.debug : WeAppQualityAndroidPageContainerCostStruct.C80759a.release;
                weAppQualityAndroidPageContainerCostStruct.f236689h = (long) c.f245835g;
                weAppQualityAndroidPageContainerCostStruct.f236691j = (long) c.f245836h;
                long j = c.f245845F;
                weAppQualityAndroidPageContainerCostStruct.f236692k = j;
                weAppQualityAndroidPageContainerCostStruct.mo86048e("StartTimeStampMs", j);
                long nowMilliSecond = Util.nowMilliSecond();
                weAppQualityAndroidPageContainerCostStruct.f236693l = nowMilliSecond;
                weAppQualityAndroidPageContainerCostStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
                long j2 = weAppQualityAndroidPageContainerCostStruct.f236693l - weAppQualityAndroidPageContainerCostStruct.f236692k;
                weAppQualityAndroidPageContainerCostStruct.f236690i = j2;
                weAppQualityAndroidPageContainerCostStruct.mo86046c("CostTimeMs", j2);
                C83820i0 currentPage = appBrandPageContainerWC.getCurrentPage();
                C82381f currentPageView = currentPage != null ? currentPage.getCurrentPageView() : null;
                if (currentPageView instanceof C83928t1) {
                    t1Var = (C83928t1) currentPageView;
                }
                weAppQualityAndroidPageContainerCostStruct.f236694m = mo116901e(t1Var);
                weAppQualityAndroidPageContainerCostStruct.mo86054n();
            }
            mo116897a(c, "Null session with " + appBrandPageContainerWC.getAppId());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116899c(kr0.C88267e r3, java.lang.String r4, long r5, boolean r7, long r8, long r10, java.lang.Object r12) {
        /*
            r2 = this;
            java.lang.String r7 = "service"
            gy3.C87412m.m108594g(r3, r7)
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r7 = r3.mo114272k()
            if (r7 == 0) goto L_0x0012
            java.lang.String r7 = r7.mo113377i()
            if (r7 != 0) goto L_0x0014
        L_0x0012:
            java.lang.String r7 = "invalid"
        L_0x0014:
            boolean r0 = r12 instanceof com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g
            if (r0 == 0) goto L_0x001b
            com.tencent.mm.appbrand.v8.j$g r12 = (com.tencent.p014mm.appbrand.p942v8.C80669j.C80676g) r12
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Inject MainContextLibScript["
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "] Succeed wx.version = "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ", appId = "
            r0.append(r7)
            java.lang.String r7 = r3.getAppId()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MicroMsg.AppBrandQualitySystemKVProtocol"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            boolean r7 = r3.mo114335b0()
            if (r7 != 0) goto L_0x0052
            boolean r7 = r3.isRunning()
            if (r7 == 0) goto L_0x00be
        L_0x0052:
            com.tencent.mm.plugin.appbrand.report.quality.e r7 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.f245912a
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct r7 = r7.mo116888g(r3)
            r7.mo112531s(r4)
            r7.f236930p = r5
            if (r12 == 0) goto L_0x006b
            int r4 = r12.codeCacheStatus
            if (r4 < 0) goto L_0x006b
            int[] r5 = com.tencent.p014mm.plugin.appbrand.jsruntime.C83187w.f242988l0
            r6 = 7
            if (r4 >= r6) goto L_0x006b
            r4 = r5[r4]
            goto L_0x006c
        L_0x006b:
            r4 = 4
        L_0x006c:
            long r4 = (long) r4
            r7.f236932r = r4
            boolean r3 = r3.mo122650O0()
            r4 = 0
            if (r3 == 0) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = r4
        L_0x007b:
            r7.f236933s = r0
            if (r12 == 0) goto L_0x0081
            long r4 = r12.flatJSCompileCost
        L_0x0081:
            r7.f236934t = r4
            if (r12 == 0) goto L_0x0088
            int r3 = r12.f236060c
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            long r3 = (long) r3
            r7.f236936v = r3
            if (r12 == 0) goto L_0x0090
            long r8 = r12.f236058a
        L_0x0090:
            r7.f236925k = r8
            java.lang.String r3 = "StartTimeStampMs"
            r7.mo86048e(r3, r8)
            if (r12 == 0) goto L_0x009b
            long r10 = r12.f236059b
        L_0x009b:
            r7.f236926l = r10
            java.lang.String r3 = "EndTimeStampMs"
            r7.mo86048e(r3, r10)
            long r3 = r7.f236926l
            long r5 = r7.f236925k
            long r3 = r3 - r5
            r7.f236923i = r3
            java.lang.String r5 = "CostTimeMs"
            r7.mo86046c(r5, r3)
            java.lang.String r3 = com.eclipsesource.mmv8.C80135V8.getV8Version()
            r4 = 1
            java.lang.String r5 = "engineVersion"
            java.lang.String r3 = r7.mo86045b(r5, r3, r4)
            r7.f236935u = r3
            r7.mo86054n()
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.quality.C84193f.mo116899c(kr0.e, java.lang.String, long, boolean, long, long, java.lang.Object):void");
    }

    /* renamed from: d */
    public final long mo116900d() {
        try {
            WebView.WebViewKind currentModuleWebCoreType = WebView.getCurrentModuleWebCoreType();
            int i = currentModuleWebCoreType == null ? -1 : C84195b.f245931a[currentModuleWebCoreType.ordinal()];
            int i2 = 0;
            if (!(i == -1 || i == 1)) {
                if (i == 2) {
                    i2 = XWebSdk.safeGetChromiumVersion();
                } else if (i != 3) {
                    if (i == 4) {
                        i2 = XWebSdk.getAvailableVersion();
                    } else if (i == 5) {
                        i2 = XWebSdk.getAvailableVersion();
                    } else {
                        throw new C13603j();
                    }
                }
            }
            return (long) i2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public final long mo116901e(C83928t1 t1Var) {
        C40502j2 M1 = t1Var != null ? t1Var.mo116525M1() : null;
        int i = -1;
        if (M1 != null) {
            if (M1.isSysKernel()) {
                i = 4;
            } else if (M1.isXWalkKernel()) {
                i = 3;
            }
        }
        return (long) i;
    }
}
