package eq0;

import android.text.TextUtils;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81418k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq0.C86091c;
import cq0.C86092d;
import java.io.File;
import java.util.Map;

/* renamed from: eq0.a */
public class C86631a extends C86092d {
    /* renamed from: a */
    public int mo120512a() {
        return 9;
    }

    /* renamed from: b */
    public String mo120517b(C104289g gVar, C86091c cVar) {
        C81415h0 fileSystem = cVar.f250575b.getFileSystem();
        if (fileSystem == null) {
            return cVar.mo120515b(1);
        }
        C81418k0 storageSpaceStatistics = fileSystem.getStorageSpaceStatistics();
        if (storageSpaceStatistics == null) {
            return cVar.mo120515b(1);
        }
        Log.m105924i("FileSizeChangeEvent", "[execute] reqArgs:" + gVar);
        C104289g m = gVar.optJSONObject("info");
        if (m == null) {
            return cVar.mo120516c((Map<String, Object>) null);
        }
        String optString = m.optString("path", "");
        long optLong = m.optLong("sizeDiff", -1);
        String optString2 = m.optString("event", "");
        if (TextUtils.isEmpty(optString) || optLong == -1) {
            return cVar.mo120516c((Map<String, Object>) null);
        }
        storageSpaceStatistics.mo113738d(new File(optString).getPath(), optLong, optString2);
        return cVar.mo120516c((Map<String, Object>) null);
    }
}
