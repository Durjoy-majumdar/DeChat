package x41;

import a51.C39487a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.tencent.p014mm.plugin.downloader.model.C29853f;
import com.tencent.p014mm.plugin.downloader.model.C40917h;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import f40.C86718e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sx1.C48493b;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;
import z41.C53737b;
import zt3.C119157j;

/* renamed from: x41.a */
public class C53286a {

    /* renamed from: a */
    public static BroadcastReceiver f148883a = null;

    /* renamed from: b */
    public static int f148884b = -1;

    /* renamed from: x41.a$b */
    public static class C53288b extends BroadcastReceiver {

        /* renamed from: x41.a$b$a */
        public class C53289a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f148885d;

            /* renamed from: x41.a$b$a$a */
            public class C53290a implements C48493b.C48494a {

                /* renamed from: x41.a$b$a$a$a */
                public class C53291a implements Runnable {
                    public C53291a(C53290a aVar) {
                    }

                    public void run() {
                        LinkedList linkedList;
                        C44561j j;
                        if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                            HashMap<Long, Integer> hashMap = C29853f.f80895a;
                            Log.m105924i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask , prepare check");
                            C29853f.f80896b.clear();
                            C53737b f = C40933j.m44317f();
                            if (f == null) {
                                linkedList = null;
                            } else {
                                Log.m105924i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status=4");
                                Cursor rawQuery = f.rawQuery("select * from FileDownloadInfo where status=4", new String[0]);
                                LinkedList linkedList2 = new LinkedList();
                                if (rawQuery != null) {
                                    while (rawQuery.moveToNext()) {
                                        C53736a aVar = new C53736a();
                                        aVar.convertFrom(rawQuery);
                                        linkedList2.add(aVar);
                                    }
                                    rawQuery.close();
                                }
                                linkedList = linkedList2;
                            }
                            if (!Util.isNullOrNil((List) linkedList)) {
                                Iterator it = linkedList.iterator();
                                while (it.hasNext()) {
                                    C53736a aVar2 = (C53736a) it.next();
                                    if (C40933j.m44318g(aVar2.field_downloadUrl)) {
                                        Log.m105924i("MicroMsg.DownloadRetry", "hasDuplicatedTask");
                                        C40933j.m44321j(aVar2.field_downloadUrl);
                                        C115669n.INSTANCE.idkeyStat(710, 26, 1, false);
                                    } else if (aVar2.field_downloaderType == 3 && C86013q1.m106450k(aVar2.field_filePath)) {
                                        int i = aVar2.field_errCode;
                                        if (!(i == 802 || i == 806 || i == 805) && (j = C44565l.m48990j(aVar2.field_appId, false)) != null && j.mo69359k()) {
                                            if (System.currentTimeMillis() - aVar2.field_downloadId <= 259200000) {
                                                aVar2.field_downloadType = 3;
                                                C40933j.m44322k(aVar2);
                                                C53493b bVar = new C53493b();
                                                bVar.mo74165a(aVar2);
                                                C53491a.m60013c(24, bVar);
                                                C40935l.m44326g().mo63973u(aVar2);
                                                Log.m105925i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask , retry downloadId = %d", Long.valueOf(aVar2.field_downloadId));
                                                C29853f.f80896b.add(Long.valueOf(aVar2.field_downloadId));
                                                C29853f.f80895a.put(Long.valueOf(aVar2.field_downloadId), 1);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                public C53290a(C53289a aVar) {
                }

                /* renamed from: a */
                public void mo65649a() {
                    ((C119157j) C119157j.f356862d).mo183875f(new C53291a(this));
                }
            }

            public C53289a(C53288b bVar, Context context) {
                this.f148885d = context;
            }

            public void run() {
                if (!C86709a0.m107522a() || C86718e.m107551r()) {
                    Log.m105920e("MicroMsg.Downloader.NetWorkManager", "acc has not ready");
                    return;
                }
                int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
                if (netType != C53286a.f148884b) {
                    C53286a.f148884b = netType;
                    Log.m105924i("MicroMsg.Downloader.NetWorkManager", "onNetStateChange, netState = " + netType);
                    if (!NetStatusUtil.isConnected(this.f148885d)) {
                        Log.m105928w("MicroMsg.Downloader.NetWorkManager", "network is not connected");
                        return;
                    }
                    LinkedList linkedList = null;
                    if (NetStatusUtil.isWifi(netType)) {
                        C53737b f = C40933j.m44317f();
                        if (f != null) {
                            Log.m105924i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiPauseTasks, sql = select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1");
                            Cursor rawQuery = f.rawQuery("select * from FileDownloadInfo where status<>1 and status<>3 and downloadInWifi=1", new String[0]);
                            linkedList = new LinkedList();
                            if (rawQuery != null) {
                                while (rawQuery.moveToNext()) {
                                    C53736a aVar = new C53736a();
                                    aVar.convertFrom(rawQuery);
                                    linkedList.add(aVar);
                                }
                                rawQuery.close();
                            }
                        }
                        if (linkedList != null) {
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                C53736a aVar2 = (C53736a) it.next();
                                Log.m105925i("MicroMsg.Downloader.NetWorkManager", "resumeTask, appId = %s, state = %d", aVar2.field_appId, Integer.valueOf(aVar2.field_status));
                                if (C40933j.m44318g(aVar2.field_downloadUrl)) {
                                    Log.m105924i("MicroMsg.Downloader.NetWorkManager", "hasDuplicatedTask");
                                    C40933j.m44321j(aVar2.field_downloadUrl);
                                    C115669n.INSTANCE.idkeyStat(710, 26, 1, false);
                                } else {
                                    int i = aVar2.field_status;
                                    if (i == 2) {
                                        C40935l g = C40935l.m44326g();
                                        long j = aVar2.field_downloadId;
                                        g.getClass();
                                        C53736a c = C40933j.m44314c(j);
                                        if (c == null || c.field_downloaderType != 3) {
                                            C39487a j2 = g.mo63962j();
                                            j2.getClass();
                                            C53736a c2 = C40933j.m44314c(j);
                                            if (c2 != null) {
                                                c2.field_downloadType = 2;
                                                C40933j.m44322k(c2);
                                            }
                                            C53491a.m60015e(j, 14);
                                            j2.mo62098j(j, true);
                                        } else {
                                            C40917h e = g.mo63959e();
                                            e.getClass();
                                            C53736a c3 = C40933j.m44314c(j);
                                            if (c3 != null) {
                                                c3.field_downloadType = 2;
                                                C40933j.m44322k(c3);
                                            }
                                            C53491a.m60015e(j, 14);
                                            e.mo63932h(j, true);
                                        }
                                    } else if (i == 0 && aVar2.field_reserveInWifi) {
                                        C40935l g2 = C40935l.m44326g();
                                        g2.getClass();
                                        if (aVar2.field_downloaderType == 3) {
                                            g2.mo63959e().mo62094d(aVar2);
                                        } else {
                                            g2.mo63960f().mo62094d(aVar2);
                                        }
                                    }
                                }
                            }
                        }
                        C48493b.m53856b().mo73124a("failed_download_resume", new C53290a(this));
                        return;
                    }
                    C53737b f2 = C40933j.m44317f();
                    if (f2 != null) {
                        Log.m105924i("MicroMsg.FileDownloadInfoStorage", "getDownloadInWifiRunningTasks, sql = select * from FileDownloadInfo where status=1 and downloadInWifi=1");
                        Cursor rawQuery2 = f2.rawQuery("select * from FileDownloadInfo where status=1 and downloadInWifi=1", new String[0]);
                        linkedList = new LinkedList();
                        if (rawQuery2 != null) {
                            while (rawQuery2.moveToNext()) {
                                C53736a aVar3 = new C53736a();
                                aVar3.convertFrom(rawQuery2);
                                linkedList.add(aVar3);
                            }
                            rawQuery2.close();
                        }
                    }
                    if (linkedList != null) {
                        Iterator it4 = linkedList.iterator();
                        while (it4.hasNext()) {
                            C53736a aVar4 = (C53736a) it4.next();
                            Log.m105924i("MicroMsg.Downloader.NetWorkManager", "pauseTask, appId: " + aVar4.field_appId);
                            C40935l g3 = C40935l.m44326g();
                            long j3 = aVar4.field_downloadId;
                            g3.getClass();
                            C53736a c4 = C40933j.m44314c(j3);
                            if (c4 == null || c4.field_downloaderType != 3) {
                                C39487a j4 = g3.mo63962j();
                                j4.getClass();
                                C53736a c5 = C40933j.m44314c(j3);
                                if (c5 != null) {
                                    c5.field_downloadType = 2;
                                    C40933j.m44322k(c5);
                                }
                                C53491a.m60015e(j3, 13);
                                j4.mo62093c(j3);
                            } else {
                                C40917h e2 = g3.mo63959e();
                                e2.getClass();
                                C53736a c6 = C40933j.m44314c(j3);
                                if (c6 != null) {
                                    c6.field_downloadType = 2;
                                    C40933j.m44322k(c6);
                                }
                                C53491a.m60015e(j3, 13);
                                e2.mo62093c(j3);
                            }
                        }
                    }
                }
            }
        }

        public C53288b(C53287a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            ((C119157j) C119157j.f356862d).mo183875f(new C53289a(this, context));
        }
    }
}
