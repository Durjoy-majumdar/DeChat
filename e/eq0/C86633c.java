package eq0;

import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81418k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import cq0.C86089b;
import cq0.C86091c;
import java.util.HashMap;

/* renamed from: eq0.c */
public class C86633c extends C86089b {
    /* renamed from: a */
    public int mo120512a() {
        return 10;
    }

    /* renamed from: b */
    public void mo120513b(C104289g gVar, C86091c cVar) {
        C81418k0 storageSpaceStatistics;
        Log.m105924i("GetFileSysFolderSizeAsync", "[execute] reqArgs:" + gVar);
        String optString = gVar.optString("dirPath", "");
        String optString2 = gVar.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
        HashMap hashMap = new HashMap();
        C81415h0 fileSystem = cVar.f250575b.getFileSystem();
        if (fileSystem == null || (storageSpaceStatistics = fileSystem.getStorageSpaceStatistics()) == null) {
            hashMap.put("size", -1);
            cVar.mo120516c(hashMap);
            return;
        }
        hashMap.put("size", Long.valueOf(storageSpaceStatistics.mo113736b(optString, optString2)));
        cVar.mo120516c(hashMap);
    }
}
