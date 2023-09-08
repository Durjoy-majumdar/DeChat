package f51;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.downloader.model.C29853f;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadPendingReceive;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadService;
import com.tencent.p014mm.plugin.downloader_app.model.C40981b;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.plugin.downloader_app.model.v$$a;
import com.tencent.p014mm.plugin.downloader_app.model.v$$b;
import com.tencent.p014mm.plugin.downloader_app.model.v$$e;
import com.tencent.p014mm.plugin.downloader_app.model.v$$g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gx3.C87404a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p237sp.C36768q;
import p261wl.C38166b;
import p918s2.C90116e;
import z41.C53736a;

/* renamed from: f51.a */
public class C45749a implements C36768q.C36771c {
    /* renamed from: f */
    public void mo5418f(int i, long j) {
        boolean z;
        LinkedList<v$$b> linkedList = C41008v.f110375a;
        C53736a c = C40933j.m44314c(j);
        if (!(c == null || !(z = c.field_fromDownloadApp) || i == 9)) {
            Map<String, Long> map = C40981b.f110311a;
            Class cls = C79690d.class;
            if (!z) {
                Log.m105924i("MicroMsg.DownloadNotificationManager", "updateNotification not from download app");
            } else if (!c.field_autoDownload || c.field_status == 3) {
                long j2 = c.field_totalSize;
                boolean z2 = false;
                int i2 = j2 > 0 ? (int) ((c.field_downloadedSize * 100) / j2) : 0;
                C90116e.C90121c cVar = new C90116e.C90121c(MMApplicationContext.getContext(), "reminder_channel_id");
                Long l = (Long) ((HashMap) C40981b.f110311a).get(c.field_downloadUrl);
                if (l == null) {
                    l = Long.valueOf(System.currentTimeMillis());
                    ((HashMap) C40981b.f110311a).put(c.field_downloadUrl, l);
                }
                cVar.f258814z.when = l.longValue();
                if (!Util.isNullOrNil(c.field_notificationTitle)) {
                    cVar.mo124383h(c.field_notificationTitle);
                } else {
                    cVar.mo124383h(c.field_fileName);
                }
                int i3 = c.field_status;
                if (i3 == 1) {
                    cVar.f258814z.icon = C0966R.C0969drawable.c9k;
                    if (i2 == 0) {
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        z2 = true;
                    }
                    cVar.mo124386k(100, i2, z2);
                    if (c.field_reserveInWifi) {
                        cVar.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.cuk) + "·" + MMApplicationContext.getContext().getString(C0966R.string.cui));
                    } else {
                        cVar.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.cui));
                    }
                    cVar.mo124384i(2, true);
                    cVar.f258795g = C40981b.m44412b(c.field_appId);
                } else if (i3 == 2) {
                    C40981b.m44411a(c.field_downloadUrl);
                } else if (i3 == 3) {
                    C40981b.m44411a(c.field_downloadUrl);
                    Context context = MMApplicationContext.getContext();
                    C90116e.C90121c cVar2 = new C90116e.C90121c(context, "reminder_channel_id");
                    if (!Util.isNullOrNil(c.field_notificationTitle)) {
                        cVar2.mo124383h(c.field_notificationTitle);
                    } else {
                        cVar2.mo124383h(c.field_fileName);
                    }
                    cVar2.f258814z.icon = C0966R.C0969drawable.c9k;
                    cVar2.mo124380e(true);
                    Intent intent = new Intent();
                    Context context2 = MMApplicationContext.getContext();
                    intent.setClass(context2, FileDownloadPendingReceive.class);
                    intent.putExtra(FileDownloadService.f110081n, 3);
                    intent.putExtra(FileDownloadService.f110082o, c.field_filePath);
                    intent.putExtra(FileDownloadService.f110083p, c.field_md5);
                    intent.putExtra("downloadId", c.field_downloadId);
                    cVar2.f258795g = PendingIntent.getBroadcast(context2, (int) System.currentTimeMillis(), intent, 0);
                    if (c.field_reserveInWifi) {
                        cVar2.mo124382g(context.getString(C0966R.string.c16));
                    } else if (c.field_autoDownload) {
                        if (!Util.isNullOrNil(c.field_notificationTitle)) {
                            cVar2.mo124383h(c.field_notificationTitle + " · " + MMApplicationContext.getContext().getString(C0966R.string.cud));
                        } else {
                            cVar2.mo124383h(c.field_fileName + " · " + MMApplicationContext.getContext().getString(C0966R.string.cud));
                        }
                        cVar2.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.cuc));
                    } else {
                        cVar2.mo124382g(context.getString(C0966R.string.cuh));
                    }
                    ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93214k(cVar2.mo124378b(), true);
                } else if (i3 == 4) {
                    cVar.f258814z.icon = C0966R.C0969drawable.c9k;
                    cVar.mo124380e(true);
                    cVar.f258795g = C40981b.m44412b(c.field_appId);
                    int i4 = c.field_errCode;
                    if (i4 == 806 || i4 == 802) {
                        cVar.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.hat));
                    } else {
                        long j3 = c.field_downloadId;
                        HashMap<Long, Integer> hashMap = C29853f.f80895a;
                        if (System.currentTimeMillis() - j3 <= 259200000) {
                            z2 = true;
                        }
                        if (!z2) {
                            cVar.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.haq));
                        } else if (C87404a.m108579b(MMApplicationContext.getContext())) {
                            cVar.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.har));
                        } else {
                            cVar.mo124382g(MMApplicationContext.getContext().getString(C0966R.string.has));
                        }
                    }
                    cVar.f258795g = C40981b.m44412b(c.field_appId);
                } else if (i3 != 5) {
                    C40981b.m44411a(c.field_downloadUrl);
                } else {
                    C40981b.m44411a(c.field_downloadUrl);
                }
                synchronized (C40981b.f110313c) {
                    Integer num = (Integer) ((HashMap) C40981b.f110312b).get(c.field_downloadUrl);
                    if (num == null) {
                        ((HashMap) C40981b.f110312b).put(c.field_downloadUrl, Integer.valueOf(((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93214k(cVar.mo124378b(), true)));
                    } else {
                        ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93215l(num.intValue(), cVar.mo124378b(), true);
                    }
                    if (c.field_status == 4) {
                        ((HashMap) C40981b.f110312b).remove(c.field_downloadUrl);
                        ((HashMap) C40981b.f110311a).remove(c.field_downloadUrl);
                    }
                }
            }
        }
        Iterator<v$$e> it = C41008v.f110380f.iterator();
        while (it.hasNext()) {
            it.next().mo64029f(i, j);
        }
        C38166b.m41755b(v$$g.class, new v$$a(i, j));
    }
}
