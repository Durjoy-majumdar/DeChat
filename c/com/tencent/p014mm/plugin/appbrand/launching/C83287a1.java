package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemContactCGIStruct;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Locale;
import xm0.C91291c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.a1 */
public class C83287a1 implements C81662k.C81671h<WxaAttributes> {

    /* renamed from: a */
    public final /* synthetic */ String f243396a;

    /* renamed from: b */
    public final /* synthetic */ int f243397b;

    /* renamed from: c */
    public final /* synthetic */ long f243398c;

    /* renamed from: d */
    public final /* synthetic */ C83518x0 f243399d;

    public C83287a1(C83518x0 x0Var, String str, int i, long j) {
        this.f243399d = x0Var;
        this.f243396a = str;
        this.f243397b = i;
        this.f243398c = j;
    }

    /* renamed from: a */
    public void mo113997a(C81662k.C81671h.C81672a aVar, Object obj) {
        WxaAttributes wxaAttributes = (WxaAttributes) obj;
        C91291c cVar = C91291c.NO_UPDATE;
        if (wxaAttributes == null) {
            Log.m105921e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "onGetContact with username(%s) maybeNew == NULL", this.f243396a);
            try {
                ((IPCUpdateStateNotifier) this.f243399d.f244007h).mo115556a(cVar, 0, (String) null, (String) null, (String) null);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", e, "onGetContact with username(%s) maybeNew == NULL", this.f243396a);
            }
        } else if (wxaAttributes.mo113942o2() == null) {
            String format = String.format(Locale.US, "onGetContact with username(%s), maybeNew.versionInfo == NULL", new Object[]{this.f243396a});
            Log.m105920e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", format);
            try {
                ((IPCUpdateStateNotifier) this.f243399d.f244007h).mo115556a(cVar, 0, (String) null, (String) null, (String) null);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", e2, format, new Object[0]);
            }
        } else {
            Log.m105925i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "[appversion] onGetContact(%s), result %s, old.version %d, maybeNew.ver %d", this.f243396a, aVar, Integer.valueOf(this.f243397b), Integer.valueOf(wxaAttributes.mo113942o2().f239452d));
            WeAppQualitySystemContactCGIStruct.C80778c cVar2 = aVar.ordinal() != 3 ? WeAppQualitySystemContactCGIStruct.C80778c.ok : WeAppQualitySystemContactCGIStruct.C80778c.common_fail;
            C81662k.C81671h.C81672a aVar2 = C81662k.C81671h.C81672a.RET_HIT_FREQUENCY_LIMIT;
            if (aVar2 != aVar) {
                long nowMilliSecond = Util.nowMilliSecond();
                WeAppQualitySystemContactCGIStruct a = C84201i.m103804a(this.f243399d.f244008i);
                long j = this.f243398c;
                a.f237145k = j;
                a.mo86048e("StartTimeStampMs", j);
                a.f237146l = nowMilliSecond;
                a.mo86048e("EndTimeStampMs", nowMilliSecond);
                long j2 = nowMilliSecond - this.f243398c;
                a.f237143i = j2;
                a.mo86046c("CostTimeMs", j2);
                a.f237147m = cVar2;
                a.f237148n = WeAppQualitySystemContactCGIStruct.C80777b.async;
                a.f237149o = (long) C84201i.m103806c();
                a.f237151q = a.mo86045b("NetworkTypeStr", C84116i0.m103659b(MMApplicationContext.getContext()), true);
                a.mo86054n();
            }
            if (aVar2 == aVar) {
                C83518x0 x0Var = this.f243399d;
                if (x0Var.f244011l) {
                    Log.m105925i("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "skip dispatch noUpdate for username:%s, appId:%s", this.f243396a, x0Var.f244001b);
                    return;
                }
            }
            WxaAttributes.WxaVersionInfo wxaVersionInfo = this.f243399d.f244006g;
            if (wxaAttributes.mo113942o2().f239454f != 0) {
                ((IPCUpdateStateNotifier) this.f243399d.f244007h).mo115556a(cVar, 0, (String) null, (String) null, (String) null);
            } else if (wxaVersionInfo.f239452d >= wxaAttributes.mo113942o2().f239452d) {
                ((IPCUpdateStateNotifier) this.f243399d.f244007h).mo115556a(cVar, wxaVersionInfo.f239452d, wxaVersionInfo.f239453e, wxaAttributes.field_passThroughInfo, wxaAttributes.field_stablePassThroughInfo);
            } else {
                ((IPCUpdateStateNotifier) this.f243399d.f244007h).mo115556a(C91291c.UPDATING, wxaAttributes.mo113942o2().f239452d, wxaAttributes.mo113942o2().f239453e, wxaAttributes.field_passThroughInfo, wxaAttributes.field_stablePassThroughInfo);
                C119179t tVar = C119157j.f356862d;
                C83526z0 z0Var = new C83526z0(this, wxaAttributes);
                ((C119157j) tVar).mo183876g(z0Var, "MicroMsg.AppBrand.Launching.ContactSilentSyncProcess|download|" + this.f243396a);
            }
        }
    }
}
