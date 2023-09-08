package com.tencent.p014mm.plugin.appbrand;

import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.zip.ZipInputStream;

/* renamed from: com.tencent.mm.plugin.appbrand.e$$e */
public class e$$e implements Runnable {
    public e$$e(C81810e eVar) {
    }

    public void run() {
        int i;
        long nowMilliSecond = Util.nowMilliSecond();
        try {
            Uri n = C116299g2.m163858n("/sdcard/test_zip.zip");
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            i = C81412d0.m99876j(new ZipInputStream(C86013q1.m106421C(n, C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null))), "/sdcard/test_zip/");
        } catch (Exception e) {
            Log.m105921e("[ZIP]", "unzip Java ex=%s", e);
            i = -1;
        }
        Log.m105925i("[ZIP]", "unzip Java %d, cost %d", Integer.valueOf(i), Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
    }
}
