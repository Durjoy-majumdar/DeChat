package de3;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44563k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import nd3.C47223a;
import p237sp.C13754y;

@Deprecated
/* renamed from: de3.e0 */
public class C7303e0 {
    /* renamed from: a */
    public static void m7456a(Context context, Bundle bundle) {
        C115669n.INSTANCE.mo160131h(11621, Integer.valueOf(bundle != null ? bundle.getInt("fromScene") : 0), 0);
        FileDownloadTaskInfo p = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63968p("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
        if (p != null && p.f12196f == 3) {
            Log.m105924i("MicroMsg.WxPhoneBookHelper", "weixin phonebook already download successfully, install directly");
            if (C86013q1.m106450k(p.f12197g)) {
                C44563k0.m48979d(context, p.f12197g, (C47223a) null, false);
            }
        }
    }
}
