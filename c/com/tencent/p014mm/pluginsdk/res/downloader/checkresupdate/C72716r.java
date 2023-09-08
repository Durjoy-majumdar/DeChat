package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.sdk.coroutines.CheckController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import f40.C86718e;
import java.text.SimpleDateFormat;
import java.util.Date;
import p645pj.C47509i;
import tf3.C110977d;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.r */
public final class C72716r {
    /* renamed from: a */
    public static void m85117a(int i) {
        Log.m105925i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "doCheck %s", Integer.valueOf(i));
        C86709a0.m107529k().f251779b.mo123460f(new C57538o());
        if (C86709a0.m107523b().mo121114l()) {
            long c = C31543z5.m39453c();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_RES_DOWNLOADER_CHECK_RES_LAST_CHECK_TIME_LONG, Long.valueOf(c));
            Log.m105925i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "refreshCheckTime %s %s", Long.valueOf(c), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date(c)));
        }
    }

    /* renamed from: b */
    public static void m85118b() {
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                CheckController checkController = new CheckController("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", C31543z5.m39453c(), Util.nullAs((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_RES_DOWNLOADER_CHECK_RES_LAST_CHECK_TIME_LONG, (Object) null), 0), 86400000);
                try {
                    String d = C47509i.m52838a().mo107406d(new C110977d());
                    if (!d.isEmpty()) {
                        String[] split = d.split(";");
                        if (split.length > 0) {
                            for (String addCheckCondition : split) {
                                checkController.addCheckCondition(addCheckCondition);
                            }
                        }
                    }
                    Log.m105925i("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", "apply exptConfigStr %s", d);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.ResDownloader.PostTaskCheckResUpdateScene", th, "run", new Object[0]);
                }
                if (checkController.checkCondition()) {
                    m85117a(0);
                }
            }
        }
    }
}
