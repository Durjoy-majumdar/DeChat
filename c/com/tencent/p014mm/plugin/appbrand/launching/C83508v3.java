package com.tencent.p014mm.plugin.appbrand.launching;

import android.util.Pair;
import bp0.C79746b;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mp3.C88819d;
import ob0.C89132b;
import ob0.C89147n0;
import rp0.C90077a;
import wo0.C91047f;
import wo0.C91048g;
import wo0.C91051k;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.v3 */
public class C83508v3 extends C83448q3<Pair<HashMap<String, AppRuntimeAppidABTestPermissionBundle>, Boolean>> {

    /* renamed from: h */
    public final WxaAttributes.WxaVersionInfo f243982h;

    /* renamed from: i */
    public final String f243983i;

    /* renamed from: j */
    public final int f243984j;

    /* renamed from: n */
    public final int f243985n;

    /* renamed from: o */
    public final boolean f243986o;

    /* renamed from: p */
    public final QualitySession f243987p;

    /* renamed from: q */
    public List<C91051k> f243988q = new LinkedList();

    public C83508v3(String str, int i, int i2, boolean z, String str2, WxaAttributes.WxaVersionInfo wxaVersionInfo, QualitySession qualitySession) {
        this.f243983i = str;
        this.f243984j = i;
        this.f243985n = !C81289m.C81290a.m99664b(i) ? 0 : i2;
        this.f243986o = z;
        this.f243982h = wxaVersionInfo;
        this.f243987p = qualitySession;
        Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "<init> hash:%d, appId:%s,versionType:%d,isGame:%b", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Boolean.valueOf(z));
    }

    public Object call() {
        HashMap hashMap = new HashMap();
        WxaAttributes.WxaVersionInfo wxaVersionInfo = this.f243982h;
        boolean z = this.f243986o;
        LinkedList linkedList = new LinkedList();
        if (z) {
            C91051k kVar = new C91051k();
            kVar.f261208a = this.f243983i;
            kVar.f261209b = 1;
            kVar.f261210c = this.f243984j;
            linkedList.add(kVar);
            List<WxaAttributes.WxaWidgetInfo> list = wxaVersionInfo.f239465t;
            if (list != null && list.size() > 0) {
                for (WxaAttributes.WxaWidgetInfo wxaWidgetInfo : list) {
                    List<WxaAttributes.WxaPluginCodeInfo> list2 = wxaWidgetInfo.f239484f;
                    if (list2 != null && list2.size() > 0) {
                        for (WxaAttributes.WxaPluginCodeInfo next : list2) {
                            C91051k kVar2 = new C91051k();
                            kVar2.f261208a = next.f239437d;
                            kVar2.f261209b = 2;
                            kVar2.f261210c = Util.isNullOrNil(next.f239444n) ^ true ? 1 : 0;
                            if (!linkedList.contains(kVar2)) {
                                linkedList.add(kVar2);
                            }
                        }
                    }
                }
            }
        }
        this.f243988q = linkedList;
        int size = linkedList.size();
        boolean z2 = false;
        if (size <= 0) {
            Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "call() todoChecAppidInfoList null, return, hash:%d", Integer.valueOf(hashCode()));
            return null;
        }
        C79746b.m96887a(150, this.f243983i, this.f243984j, this.f243985n);
        Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "call() todoChecAppidInfoList size:%d", Integer.valueOf(((LinkedList) this.f243988q).size()));
        C81161g2.requireAccountInitializedOnDemand();
        C83496u2 u2Var = C81161g2.f238475n;
        C81161g2.requireAccountInitializedOnDemand();
        C29561a3 a3Var = C81161g2.f238481t;
        if (u2Var == null || a3Var == null) {
            Log.m105924i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "needSyncCheckAppidPermission storage null!");
            C79746b.m96887a(151, this.f243983i, this.f243984j, this.f243985n);
        } else {
            List<C91051k> list3 = this.f243988q;
            if (list3 != null && ((LinkedList) list3).size() > 0) {
                Iterator<C91051k> it = this.f243988q.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C91051k next2 = it.next();
                    String str = next2.f261208a;
                    int i = next2.f261209b;
                    int i2 = next2.f261210c;
                    Log.m105925i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "get, appId:%s , appType :%d, versionType: %d", str, Integer.valueOf(i), Integer.valueOf(i2));
                    C29593z2 z2Var = new C29593z2();
                    z2Var.field_appId = str;
                    z2Var.field_appType = i;
                    z2Var.field_versionType = i2;
                    byte[] bArr = a3Var.get(z2Var, new String[0]) ? z2Var.field_permissionBytes : null;
                    if (bArr == null) {
                        Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "needSyncCheckAppidPermission appidABTestInfoStorage not include appId:%s ,appType:%d!", str, Integer.valueOf(i));
                        z2 = true;
                        break;
                    }
                    hashMap.put(C91048g.m114214k(str, i, i2), new AppRuntimeAppidABTestPermissionBundle(bArr));
                }
            }
            C79746b.m96887a(162, this.f243983i, this.f243984j, this.f243985n);
        }
        if (z2) {
            Log.m105924i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "zbql:CgiWxaAppidABTestInfo sync");
            AppLaunchPrepareProcess appLaunchPrepareProcess = ((C83361l0) this).f243591r;
            if (appLaunchPrepareProcess.f243257g != null) {
                C83483u uVar = (C83483u) appLaunchPrepareProcess.f243257g;
                if (uVar.f243928d != null) {
                    AppBrandPrepareTask.PrepareResult prepareResult = new AppBrandPrepareTask.PrepareResult();
                    prepareResult.f243185d = AppBrandPrepareTask.C83254d.EVENT_ON_SYNC_APPID_ABTEST_INFO_START;
                    uVar.f243928d.mo894a(prepareResult);
                }
            } else {
                appLaunchPrepareProcess.f243264p0 = true;
            }
            C91048g gVar = new C91048g(this.f243983i, this.f243984j, this.f243988q, true, this.f243987p, this);
            gVar.f261199o = true;
            C89132b.C89134c a = C89147n0.m111434a(gVar);
            if (!C90077a.m112679b(a) || gVar.f261200p == null) {
                C79746b.m96887a(152, this.f243983i, this.f243984j, this.f243985n);
                if (a == null || a.f256793a != 4) {
                    C79746b.m96887a(154, this.f243983i, this.f243984j, this.f243985n);
                } else {
                    C79746b.m96887a(153, this.f243983i, this.f243984j, this.f243985n);
                }
            } else {
                C79746b.m96887a(161, this.f243983i, this.f243984j, this.f243985n);
            }
            return Pair.create(gVar.f261200p, Boolean.TRUE);
        }
        Log.m105924i("MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo", "zbql:CgiWxaAppidABTestInfo async");
        C88819d.LOGIC.arrange(new C91047f(new C91048g(this.f243983i, this.f243984j, this.f243988q, false, this.f243987p, this)));
        return Pair.create(hashMap, Boolean.FALSE);
    }

    /* renamed from: f */
    public String mo115591f() {
        return "MicroMsg.AppBrand.PrepareStepCheckAppidABTestPermissionInfo";
    }
}
