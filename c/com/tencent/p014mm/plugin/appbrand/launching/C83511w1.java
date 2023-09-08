package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.ArrayMap;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityPackageReuseStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySplitCodeLibStatisStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29188c;
import com.tencent.p014mm.plugin.appbrand.appcache.C29194d;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.BatchGetCodePkgExecutor;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import ji0.C87965a;
import ji0.C87966b;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import ux3.C65486b;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.w1 */
public final class C83511w1 {

    /* renamed from: a */
    public static final C83511w1 f243992a = new C83511w1();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.w1$a */
    public static abstract class C83512a implements BatchGetCodePkgExecutor.C83262a {
        /* renamed from: b */
        public void mo115536b() {
        }

        /* renamed from: c */
        public void mo115537c(C83368m1.C83374d dVar) {
            C87412m.m108594g(dVar, "request");
        }

        /* renamed from: f */
        public final void mo115803f(WeAppQualitySplitCodeLibStatisStruct weAppQualitySplitCodeLibStatisStruct, QualitySession qualitySession) {
            C87412m.m108594g(weAppQualitySplitCodeLibStatisStruct, "<this>");
            C87412m.m108594g(qualitySession, "session");
            weAppQualitySplitCodeLibStatisStruct.f237123d = weAppQualitySplitCodeLibStatisStruct.mo86045b("AppId", qualitySession.f245833e, true);
            weAppQualitySplitCodeLibStatisStruct.f237124e = (long) qualitySession.f245837i;
            int i = qualitySession.f245834f;
            weAppQualitySplitCodeLibStatisStruct.f237125f = i != 1 ? i != 2 ? i != 3 ? null : WeAppQualitySplitCodeLibStatisStruct.C80775a.demo : WeAppQualitySplitCodeLibStatisStruct.C80775a.debug : WeAppQualitySplitCodeLibStatisStruct.C80775a.release;
            weAppQualitySplitCodeLibStatisStruct.f237126g = (long) qualitySession.f245835g;
            weAppQualitySplitCodeLibStatisStruct.f237131l = weAppQualitySplitCodeLibStatisStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
            weAppQualitySplitCodeLibStatisStruct.f237132m = (long) qualitySession.f245836h;
        }

        /* renamed from: g */
        public final void mo115804g(QualitySession qualitySession, C83368m1.C83374d dVar, C83368m1.C83377e eVar) {
            C87412m.m108594g(qualitySession, "reportQualitySession");
            C87412m.m108594g(dVar, "request");
            C87412m.m108594g(eVar, "response");
            C83368m1.C83378f fVar = eVar.f243627b;
            if ((fVar instanceof C83368m1.C83378f.C83379a) && ((C83368m1.C83378f.C83379a) fVar).f243628a != 0) {
                WeAppQualityPackageReuseStruct weAppQualityPackageReuseStruct = new WeAppQualityPackageReuseStruct();
                weAppQualityPackageReuseStruct.f236966d = weAppQualityPackageReuseStruct.mo86045b("InstanceId", qualitySession.f245832d, true);
                weAppQualityPackageReuseStruct.f236967e = weAppQualityPackageReuseStruct.mo86045b("AppId", qualitySession.f245833e, true);
                weAppQualityPackageReuseStruct.f236968f = (long) qualitySession.f245837i;
                weAppQualityPackageReuseStruct.f236969g = (long) qualitySession.f245834f;
                weAppQualityPackageReuseStruct.f236970h = (long) qualitySession.f245836h;
                weAppQualityPackageReuseStruct.f236971i = weAppQualityPackageReuseStruct.mo86045b("md5", eVar.f243626a.checksumMd5(), true);
                weAppQualityPackageReuseStruct.f236972j = weAppQualityPackageReuseStruct.mo86045b("moduleName", dVar.f243617e, true);
                weAppQualityPackageReuseStruct.f236973k = (long) dVar.f243618f;
                int i = ((C83368m1.C83378f.C83379a) eVar.f243627b).f243628a;
                if (i == 1) {
                    weAppQualityPackageReuseStruct.f236974l = 1;
                } else if (i == 2) {
                    weAppQualityPackageReuseStruct.f236974l = 2;
                    C83368m1.C83381g gVar = dVar.f243620h;
                    String str = null;
                    C83368m1.C83381g.C83384c cVar = gVar instanceof C83368m1.C83381g.C83384c ? (C83368m1.C83381g.C83384c) gVar : null;
                    if (cVar != null) {
                        str = Long.valueOf(cVar.f243635b).toString();
                    }
                    weAppQualityPackageReuseStruct.f236975m = weAppQualityPackageReuseStruct.mo86045b("resue_reason", str, true);
                }
                weAppQualityPackageReuseStruct.mo86054n();
            } else if ((fVar instanceof C83368m1.C83378f.C83379a) && ((C83368m1.C83378f.C83379a) fVar).f243628a == 0) {
                C87966b bVar = (C87966b) C81161g2.Bx0(C87966b.class);
                String str2 = qualitySession.f245832d;
                String str3 = dVar.f243616d;
                int pkgVersion = eVar.f243626a.pkgVersion();
                int i2 = dVar.f243618f;
                String str4 = dVar.f243617e;
                bVar.getClass();
                C61926c.m72657B("MicroMsg.AppBrand.PredownloadGetCodeStatStorage__report", true, new C87965a(bVar, str2, str3, pkgVersion, i2, str4));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.w1$b */
    public static final class C83513b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((WxaAttributes.WxaWidgetInfo) t2).f239482d), Integer.valueOf(((WxaAttributes.WxaWidgetInfo) t).f239482d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.w1$c */
    public static final class C83514c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((WxaAttributes.WxaWidgetInfo) t2).f239482d), Integer.valueOf(((WxaAttributes.WxaWidgetInfo) t).f239482d));
        }
    }

    /* renamed from: a */
    public final boolean mo115801a(String str, int i, int i2, boolean z, ICommLibReader iCommLibReader) {
        C29194d.C29195a aVar;
        C87412m.m108594g(str, "appId");
        if (C81289m.C81290a.m99663a(i)) {
            return true;
        }
        C29194d dVar = (C29194d) C81161g2.Bx0(C29194d.class);
        dVar.getClass();
        C29188c cVar = new C29188c();
        cVar.field_appId = str;
        cVar.field_appVersion = i2;
        if (!dVar.get(cVar, new String[0])) {
            cVar.field_isSeparatedPluginsUsed = -1;
        }
        int i3 = cVar.field_isSeparatedPluginsUsed;
        C29194d.C29195a[] values = C29194d.C29195a.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                aVar = null;
                break;
            }
            aVar = values[i4];
            if (aVar.f79837d == i3) {
                break;
            }
            i4++;
        }
        if (aVar == null) {
            aVar = C29194d.C29195a.NONE;
        }
        int ordinal = aVar.ordinal();
        return ordinal == 0 || ordinal == 2;
    }

    /* renamed from: b */
    public final Map mo115802b(WxaAttributes.WxaVersionInfo wxaVersionInfo, String str, boolean z) {
        boolean z2;
        boolean z3;
        C87412m.m108594g(wxaVersionInfo, "<this>");
        C87412m.m108594g(str, "appId");
        List<WxaAttributes.WxaVersionModuleInfo> list = wxaVersionInfo.f239460o;
        boolean z4 = true;
        if (!(list == null || list.isEmpty())) {
            ArrayMap arrayMap = new ArrayMap(wxaVersionInfo.f239460o.size());
            for (WxaAttributes.WxaVersionModuleInfo next : wxaVersionInfo.f239460o) {
                if (!z) {
                    r6 = new WxaAttributes.WxaWidgetInfo();
                    r6.f239482d = 4;
                    r6.f239483e = next.f239473e;
                } else {
                    List<WxaAttributes.WxaWidgetInfo> list2 = next.f239479n;
                    if (list2 == null || list2.isEmpty()) {
                        List<WxaAttributes.WxaPluginCodeInfo> list3 = next.f239477i;
                        if (!(list3 == null || list3.isEmpty())) {
                            r6 = new WxaAttributes.WxaWidgetInfo();
                            r6.f239483e = next.f239478j;
                            r6.f239482d = 13;
                            r6.f239484f = new LinkedList(next.f239477i);
                        } else {
                            r6 = new WxaAttributes.WxaWidgetInfo();
                            r6.f239482d = 4;
                            r6.f239483e = next.f239473e;
                        }
                    } else {
                        List<WxaAttributes.WxaWidgetInfo> list4 = next.f239479n;
                        C87412m.m108593f(list4, "this.wxaWidgetInfoList");
                        for (T t : C110818d0.m150943o0(list4, new C83514c())) {
                            if (t.f239482d <= 23) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                arrayMap.put(next.f239472d, t);
            }
            return arrayMap;
        } else if (!z) {
            WxaAttributes.WxaWidgetInfo wxaWidgetInfo = new WxaAttributes.WxaWidgetInfo();
            wxaWidgetInfo.f239482d = 0;
            wxaWidgetInfo.f239483e = wxaVersionInfo.f239455g;
            C13598b0 b0Var = C13598b0.f38549a;
            ArrayMap arrayMap2 = new ArrayMap();
            arrayMap2.put(ModulePkgInfo.MAIN_MODULE_NAME, wxaWidgetInfo);
            return arrayMap2;
        } else {
            List<WxaAttributes.WxaWidgetInfo> list5 = wxaVersionInfo.f239465t;
            if (list5 == null || list5.isEmpty()) {
                List<WxaAttributes.WxaPluginCodeInfo> list6 = wxaVersionInfo.f239458j;
                if (list6 != null && !list6.isEmpty()) {
                    z4 = false;
                }
                if (!z4) {
                    WxaAttributes.WxaWidgetInfo wxaWidgetInfo2 = new WxaAttributes.WxaWidgetInfo();
                    wxaWidgetInfo2.f239483e = wxaVersionInfo.f239464s;
                    wxaWidgetInfo2.f239482d = 12;
                    wxaWidgetInfo2.f239484f = new LinkedList(wxaVersionInfo.f239458j);
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    ArrayMap arrayMap3 = new ArrayMap();
                    arrayMap3.put(ModulePkgInfo.MAIN_MODULE_NAME, wxaWidgetInfo2);
                    return arrayMap3;
                }
                WxaAttributes.WxaWidgetInfo wxaWidgetInfo3 = new WxaAttributes.WxaWidgetInfo();
                wxaWidgetInfo3.f239482d = 0;
                wxaWidgetInfo3.f239483e = wxaVersionInfo.f239455g;
                C13598b0 b0Var3 = C13598b0.f38549a;
                ArrayMap arrayMap4 = new ArrayMap();
                arrayMap4.put(ModulePkgInfo.MAIN_MODULE_NAME, wxaWidgetInfo3);
                return arrayMap4;
            }
            List<WxaAttributes.WxaWidgetInfo> list7 = wxaVersionInfo.f239465t;
            C87412m.m108593f(list7, "this.widgetInfoList");
            for (T next2 : C110818d0.m150943o0(list7, new C83513b())) {
                WxaAttributes.WxaWidgetInfo wxaWidgetInfo4 = (WxaAttributes.WxaWidgetInfo) next2;
                if (wxaWidgetInfo4.f239482d <= 23) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    List<WxaAttributes.WxaPluginCodeInfo> list8 = wxaWidgetInfo4.f239484f;
                    if (list8 != null && !list8.isEmpty()) {
                        z4 = false;
                    }
                    if (z4) {
                        Log.m105920e("MicroMsg.AppBrand.LaunchCheckPkgBatchGetCodeUtils", "WxaVersionInfo.pickAppropriateWidgetInfoList appId(" + str + ") module(FALSE) split_plugin(TRUE) widgetInfo.wxaPluginCodeInfo isNullOrEmpty");
                        wxaWidgetInfo4.f239484f = wxaVersionInfo.f239458j;
                    }
                    C13598b0 b0Var4 = C13598b0.f38549a;
                    ArrayMap arrayMap5 = new ArrayMap();
                    arrayMap5.put(ModulePkgInfo.MAIN_MODULE_NAME, next2);
                    return arrayMap5;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
