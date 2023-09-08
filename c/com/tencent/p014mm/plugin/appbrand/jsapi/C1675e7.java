package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.e7 */
public final class C1675e7 {
    /* renamed from: a */
    public static final String m1724a(String str, String str2, String str3) {
        String str4;
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        boolean z = false;
        if (str3 == null || str3.length() == 0) {
            StringBuilder sb = new StringBuilder();
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            sb.append(path2);
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                str4 = '.' + str2;
            } else {
                str4 = "";
            }
            sb.append(str4);
            str3 = sb.toString();
        }
        Log.m105924i("MicroMsg.AppBrand.SendVideoCommons", "parseFileName, fileName: " + str3);
        return str3;
    }
}
