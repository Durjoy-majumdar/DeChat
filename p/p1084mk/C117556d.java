package p1084mk;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83051d;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ym0.C118987a;

/* renamed from: mk.d */
public class C117556d implements C99908b {

    /* renamed from: b */
    public static C99907a f351698b;

    /* renamed from: a */
    public C117555c f351699a = null;

    public void onTaskFailed(String str, int i, boolean z) {
        Log.m105924i("WXFileDownloaderBridge", "onTaskFailed, url=" + str + ", errCode=" + i);
        ((AppBrandVideoDownLoadMgr.C115254a) this.f351699a).getClass();
        Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskFail err_code = %s, url = %s,is_resume = %s", Integer.valueOf(i), str, Boolean.valueOf(z));
        AppBrandVideoDownLoadMgr.f345373d.mo175023c(str, false);
        Map<String, C118987a> map = AppBrandVideoDownLoadMgr.f345372c;
        if (map != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            if (!(concurrentHashMap.get(str) == null || ((C118987a) concurrentHashMap.get(str)).f356419e == null)) {
                C83051d.C83052a aVar = (C83051d.C83052a) ((C118987a) concurrentHashMap.get(str)).f356419e;
                aVar.getClass();
                Log.m105925i("MicroMsg.JsApiLoadVideoResource", "leonlad downloadVideo onPreLoadFail err_code = %s, url = %s", Integer.valueOf(i), str);
                C83051d.this.mo115305w(aVar.f242788a, str, -5, i);
                return;
            }
        }
        Log.m105920e("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskFail callback is null");
    }

    public void onTaskFinished(String str, String str2, boolean z) {
        Log.m105924i("WXFileDownloaderBridge", "onTaskFinished url=" + str + ", save_path=" + str2);
        ((AppBrandVideoDownLoadMgr.C115254a) this.f351699a).getClass();
        Log.m105925i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskSucc save_path = %s, url = %s, is_resume = %s", str2, str, Boolean.valueOf(z));
        AppBrandVideoDownLoadMgr.f345373d.mo175023c(str, true);
        Map<String, C118987a> map = AppBrandVideoDownLoadMgr.f345372c;
        if (map != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            if (!(concurrentHashMap.get(str) == null || ((C118987a) concurrentHashMap.get(str)).f356419e == null)) {
                ((C83051d.C83052a) ((C118987a) concurrentHashMap.get(str)).f356419e).mo115306a(str, str2);
                return;
            }
        }
        Log.m105920e("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskSucc callback is null");
    }

    public void onTaskProgressChanged(String str, long j, long j2) {
        Log.m105924i("WXFileDownloaderBridge", "onTaskProgressChanged, url=" + str + ", cur_size:" + j + ", total_size:" + j2);
        this.f351699a.getClass();
    }
}
