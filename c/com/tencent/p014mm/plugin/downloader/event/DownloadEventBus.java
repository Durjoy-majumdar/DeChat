package com.tencent.p014mm.plugin.downloader.event;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetAppIdByUrlEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p237sp.C36768q;
import p261wl.C38166b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.event.DownloadEventBus */
public class DownloadEventBus implements C40952u {

    /* renamed from: d */
    public static DownloadEventBus f110051d;

    /* renamed from: e */
    public static BroadcastReceiver f110052e;

    /* renamed from: f */
    public static Set<C36768q.C36769a> f110053f = new CopyOnWriteArraySet();

    /* renamed from: g */
    public static Set<C36768q.C36770b> f110054g = new CopyOnWriteArraySet();

    /* renamed from: h */
    public static IListener f110055h = new IListener<GetAppIdByUrlEvent>(C40008f.f107254d) {
        {
            this.__eventId = 566931480;
        }

        public boolean callback(IEvent iEvent) {
            C53736a e;
            GetAppIdByUrlEvent getAppIdByUrlEvent = (GetAppIdByUrlEvent) iEvent;
            String str = getAppIdByUrlEvent.f107580d.f107582a;
            if (Util.isNullOrNil(str) || (e = C40933j.m44316e(str)) == null) {
                return false;
            }
            getAppIdByUrlEvent.f107581e.f107583a = e.field_appId;
            return false;
        }
    };

    /* renamed from: a */
    public static void m44272a(int i, long j) {
        Log.m105925i("MicroMsg.DownloadEventBus", "dispatch event = %d, id = %d", Integer.valueOf(i), Long.valueOf(j));
        C53736a c = C40933j.m44314c(j);
        if (c != null) {
            Iterator it = ((CopyOnWriteArraySet) f110053f).iterator();
            while (it.hasNext()) {
                ((C36768q.C36769a) it.next()).mo2084f(i, c.field_downloadId);
            }
            C38166b.m41755b(C36768q.C36771c.class, new DownloadEventBus$$a(i, c));
            Bundle bundle = new Bundle();
            bundle.putString("appId", c.field_appId);
            bundle.putInt("state", c.field_status);
            long j2 = c.field_totalSize;
            if (j2 > 0) {
                bundle.putInt("progress", (int) ((c.field_downloadedSize * 100) / j2));
            }
            bundle.putBoolean("downloadInWidget", c.field_fromDownloadApp);
            bundle.putInt("event", i);
            ToolsProcessIPCService.m43508a(bundle, DownloadEventBus$$c.class, (C1256g) null);
        }
    }

    /* renamed from: B */
    public void mo1796B(long j, String str, long j2, long j3) {
        m44272a(6, j);
    }

    /* renamed from: D */
    public void mo1797D(long j) {
        m44272a(4, j);
    }

    /* renamed from: O */
    public void mo1798O(long j) {
        m44272a(8, j);
    }

    /* renamed from: Q */
    public void mo1799Q(long j, String str) {
        m44272a(7, j);
    }

    /* renamed from: S */
    public void mo1800S(long j) {
        m44272a(2, j);
    }

    /* renamed from: d */
    public void mo1801d(long j, int i, boolean z) {
        m44272a(5, j);
    }

    /* renamed from: f0 */
    public void mo1802f0(long j, String str) {
        m44272a(1, j);
    }

    /* renamed from: q */
    public void mo1803q(long j, String str, boolean z) {
        m44272a(3, j);
    }
}
