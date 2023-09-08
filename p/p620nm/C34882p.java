package p620nm;

import a70.C112760b;
import android.content.Context;
import android.os.Environment;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.app.TempAppForegroundNotifyDeprecated;
import com.tencent.p014mm.autogen.events.DismissAllSendFailNotificationEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import p206nj.C11171e;
import p206nj.C88955f;
import p206nj.C88956h;
import p271xn.C91294h;
import qe3.C89625d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: nm.p */
public class C34882p extends C86301e {
    public void onCreate(Context context) {
        super.onCreate(context);
        long currentTimeMillis = System.currentTimeMillis();
        ((C91294h) C86312j.m106911c(C91294h.class)).mo125092Vu();
        new DismissAllSendFailNotificationEvent().publish();
        new TempAppForegroundNotifyDeprecated().mo112265d();
        if (!C88955f.m111058b()) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(340, C11171e.m11046c(19) ? 5 : 6, 1, false);
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(C11171e.m11046c(19) ? 5001 : 5002);
            objArr[1] = String.format("%s;%s;%s", new Object[]{C112760b.m154230f0(), Environment.getExternalStorageDirectory().getAbsolutePath(), C88956h.m111061b().getAbsolutePath()});
            nVar.mo160131h(11098, objArr);
        }
        Log.m105925i("LegacyWorkProfileAsyncService", "start time check WorkerProfile oncreate use time :%d, launcherisFirst :%b channel:%d cv:%d. topActivityName:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(C80610p1.f235825g), Integer.valueOf(ChannelUtil.channelId), Integer.valueOf(C89625d.f257841g), Util.getTopActivityName2(MMApplicationContext.getContext()));
    }
}
