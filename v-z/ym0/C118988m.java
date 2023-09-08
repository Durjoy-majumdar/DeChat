package ym0;

import com.tencent.p014mm.autogen.mmdata.rpt.AppBrandVideoPreLoadReportStruct;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ym0.m */
public class C118988m implements C91510h {
    public void report(String str) {
        synchronized (AppBrandVideoDownLoadMgr.f345373d) {
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad report error videoUrl is nil");
                return;
            }
            C118987a aVar = (C118987a) ((ConcurrentHashMap) AppBrandVideoDownLoadMgr.f345372c).get(str);
            if (aVar != null && aVar.f356417c >= 0) {
                if (str.equalsIgnoreCase(aVar.f356415a)) {
                    Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad report downLoadCostTime = %s,preLoadStatus = %s", Long.valueOf(aVar.f356417c), aVar.f356418d);
                    AppBrandVideoPreLoadReportStruct appBrandVideoPreLoadReportStruct = new AppBrandVideoPreLoadReportStruct();
                    appBrandVideoPreLoadReportStruct.f343653d = appBrandVideoPreLoadReportStruct.mo86045b("Url", str, true);
                    appBrandVideoPreLoadReportStruct.f343654e = aVar.f356417c;
                    appBrandVideoPreLoadReportStruct.f343655f = aVar.f356418d;
                    appBrandVideoPreLoadReportStruct.mo86054n();
                    return;
                }
            }
            Log.m105924i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad report error preLoadCostTime or videoUrl");
        }
    }

    /* renamed from: w3 */
    public void mo125421w3(C91508e eVar) {
        try {
            AppBrandVideoDownLoadMgr.f345373d.getClass();
            if (eVar != null) {
                Iterator it = new LinkedList(((ConcurrentHashMap) AppBrandVideoDownLoadMgr.f345372c).values()).iterator();
                while (it.hasNext()) {
                    C118987a aVar = (C118987a) it.next();
                    if (eVar == aVar.f356419e) {
                        aVar.f356419e = null;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public String ya0(String str) {
        return AppBrandVideoDownLoadMgr.f345373d.mo175021a(str);
    }

    /* renamed from: zr */
    public int mo125423zr(String str, C91508e eVar) {
        return AppBrandVideoDownLoadMgr.f345373d.mo175022b(str, eVar);
    }
}
