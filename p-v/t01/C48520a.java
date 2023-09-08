package t01;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c51.C0418d;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.p014mm.plugin.cdndownloader.service.CDNDownloadServiceSlot;
import com.tencent.p014mm.plugin.downloader.model.C40917h;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import q01.C47731a;
import q01.C47734b;
import u01.C52400a;
import u01.C52401b;
import v01.C37638a;
import v01.C37639b;
import v01.C37640c;
import y20.C53487a;
import y41.C53491a;
import z41.C53736a;

/* renamed from: t01.a */
public class C48520a implements C53487a {

    /* renamed from: p */
    public static C48520a f129773p;

    /* renamed from: q */
    public static final Object f129774q = new Object();

    /* renamed from: d */
    public long f129775d = 0;

    /* renamed from: e */
    public C47731a f129776e;

    /* renamed from: f */
    public Context f129777f = MMApplicationContext.getContext();

    /* renamed from: g */
    public Set<CDNTaskInfo> f129778g = new C52400a(new C48521a());

    /* renamed from: h */
    public C48526b f129779h;

    /* renamed from: i */
    public ServiceConnection f129780i = new C48522b();

    /* renamed from: j */
    public MTimerHandler f129781j = new MTimerHandler(((HandlerThread) C40319a0.m43493a().f108392a.getLooper().getThread()).getLooper(), (MTimerHandler.CallBack) new C48523c(), true);

    /* renamed from: n */
    public C47734b f129782n = new C48524d();

    /* renamed from: o */
    public C29060q.C29061a f129783o = new C48525e();

    /* renamed from: t01.a$a */
    public class C48521a implements C52401b {
        public C48521a() {
        }
    }

    /* renamed from: t01.a$b */
    public class C48522b implements ServiceConnection {
        public C48522b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C47731a aVar;
            Log.m105924i("MicroMsg.CDNDownloadClient", "onServiceConnected");
            C48520a aVar2 = C48520a.this;
            int i = C47731a.C47732a.f128247d;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.cdndownloader.aidl.ICDNDownloadService");
                aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C47731a)) ? new C47731a.C47732a.C47733a(iBinder) : (C47731a) queryLocalInterface;
            }
            aVar2.f129776e = aVar;
            C48520a aVar3 = C48520a.this;
            aVar3.getClass();
            try {
                Log.m105924i("MicroMsg.CDNDownloadClient", "registerCallback");
                aVar3.f129776e.ko0(aVar3.f129782n);
            } catch (RemoteException e) {
                Log.m105920e("MicroMsg.CDNDownloadClient", "registerCallback: " + e.getMessage());
            }
            C48520a aVar4 = C48520a.this;
            aVar4.getClass();
            Log.m105924i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected");
            if (((HashSet) aVar4.f129778g).size() > 0) {
                aVar4.mo73154b();
            }
            Iterator it = ((HashSet) aVar4.f129778g).iterator();
            while (it.hasNext()) {
                CDNTaskInfo cDNTaskInfo = (CDNTaskInfo) it.next();
                Log.m105925i("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected, url: %s, resume: %b", cDNTaskInfo.f109964e, Boolean.valueOf(cDNTaskInfo.f109973q));
                try {
                    if (cDNTaskInfo.f109973q) {
                        aVar4.f129776e.r90(cDNTaskInfo);
                    } else {
                        aVar4.f129776e.mo63880NQ(cDNTaskInfo);
                    }
                    ((C48524d) aVar4.f129782n).mo72549A9(cDNTaskInfo.f109965f, 1, 0, "");
                } catch (RemoteException e2) {
                    Log.m105920e("MicroMsg.CDNDownloadClient", "resumeTaskWhenSvrConnected: " + e2);
                    C115669n.INSTANCE.idkeyStat(710, 0, 1, false);
                }
            }
            try {
                Object obj = C48520a.f129774q;
                synchronized (obj) {
                    obj.notifyAll();
                }
            } catch (Exception unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.m105924i("MicroMsg.CDNDownloadClient", "onServiceDisconnected");
            if (((HashSet) C48520a.this.f129778g).size() != 0) {
                Iterator it = ((HashSet) C48520a.this.f129778g).iterator();
                while (it.hasNext()) {
                    ((CDNTaskInfo) it.next()).f109973q = true;
                }
            }
        }
    }

    /* renamed from: t01.a$c */
    public class C48523c implements MTimerHandler.CallBack {
        public C48523c() {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.CDNDownloadClient", "checkProcessTimer");
            if (((HashSet) C48520a.this.f129778g).size() == 0) {
                return false;
            }
            if (C48520a.this.f129776e != null) {
                try {
                    Log.m105918d("MicroMsg.CDNDownloadClient", "checkActive");
                    C48520a.this.f129776e.mo63884iF();
                } catch (RemoteException unused) {
                    Log.m105920e("MicroMsg.CDNDownloadClient", "check process active false");
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(710, 3, 1, false);
                    C48520a aVar = C48520a.this;
                    aVar.getClass();
                    if (System.currentTimeMillis() - aVar.f129775d > 120000) {
                        C48520a.this.f129775d = System.currentTimeMillis();
                        Iterator it = ((HashSet) C48520a.this.f129778g).iterator();
                        while (it.hasNext()) {
                            ((CDNTaskInfo) it.next()).f109973q = true;
                        }
                        C48520a.this.mo73156d();
                        return true;
                    }
                    Log.m105924i("MicroMsg.CDNDownloadClient", "dead twice in 1 min, something wrong must be happened");
                    nVar.idkeyStat(710, 4, 1, false);
                    Iterator it4 = ((HashSet) C48520a.this.f129778g).iterator();
                    while (it4.hasNext()) {
                        ((C40917h.C40918a) C48520a.this.f129779h).mo63934a(((CDNTaskInfo) it4.next()).f109964e, 4, 204, (String) null);
                    }
                    ((C52400a) C48520a.this.f129778g).clear();
                    C37640c a = C37639b.m41469a();
                    if (a != null) {
                        a.execSQL("CdnDownloadInfo", String.format("delete from %s", new Object[]{"CdnDownloadInfo"}));
                    }
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: t01.a$d */
    public class C48524d extends C47734b.C47735a {
        public C48524d() {
        }

        /* renamed from: A9 */
        public void mo72549A9(String str, int i, int i2, String str2) {
            Log.m105925i("MicroMsg.CDNDownloadClient", "onDownloadStateChange, mediaId = %s, state = %d, errCode = %d, errMsg = %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
            if (i != 1) {
                C48520a.this.mo73159h(new CDNTaskInfo(str));
            }
            C48526b bVar = C48520a.this.f129779h;
            if (bVar != null) {
                ((C40917h.C40918a) bVar).mo63934a(str, i, i2, str2);
            }
        }

        /* renamed from: oD */
        public void mo72550oD(String str, long j, long j2) {
            long j3 = j;
            long j4 = j2;
            Log.m105919d("MicroMsg.CDNDownloadClient", "onDownloadProgressChange, mediaId = %s, receiveLen = %d, totalLen = %d", str, Long.valueOf(j), Long.valueOf(j2));
            C48526b bVar = C48520a.this.f129779h;
            if (bVar != null) {
                C40917h.C40918a aVar = (C40917h.C40918a) bVar;
                Log.m105919d("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, totalDataLen = %d, receiveDataLen = %d", Long.valueOf(j2), Long.valueOf(j));
                C53736a e = C40933j.m44316e(str);
                if (e == null) {
                    Log.m105924i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, info is null");
                    return;
                }
                if (e.field_downloadInWifi && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    C40917h hVar = C40917h.this;
                    long j5 = e.field_downloadId;
                    hVar.getClass();
                    C53736a c = C40933j.m44314c(j5);
                    if (c != null) {
                        c.field_downloadType = 2;
                        C40933j.m44322k(c);
                    }
                    C53491a.m60015e(j5, 13);
                    hVar.mo62093c(j5);
                }
                Long valueOf = Long.valueOf(Util.nullAsNil(C40917h.this.f110097g.get(e.field_downloadUrl)));
                if (valueOf.longValue() == 0) {
                    valueOf = Long.valueOf(j);
                    C40917h.this.f110097g.put(e.field_downloadUrl, Long.valueOf(j));
                }
                long longValue = j3 - valueOf.longValue();
                int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                if (i == 0) {
                    Log.m105924i("MicroMsg.FileCDNDownloader", "onDownloadTaskProgressChanged, totalDataLen = 0");
                } else {
                    int i2 = (int) ((((float) j3) / ((float) j4)) * 100.0f);
                    if ((100 * longValue) / j4 >= 1) {
                        long nullAs = Util.nullAs(C40917h.this.f110098h.get(e.field_downloadUrl), e.field_startTime);
                        long currentTimeMillis = System.currentTimeMillis();
                        long j6 = currentTimeMillis - nullAs;
                        float f = ((((float) longValue) * 1000.0f) / ((float) j6)) / 1048576.0f;
                        Log.m105919d("MicroMsg.FileCDNDownloader", "downloadSpeed, appId = %s, speed = %f, period = %d, downloadedSize = %d, totalSize = %d, totalPercent = %d", e.field_appId, Float.valueOf(f), Long.valueOf(j6), Long.valueOf(longValue), Long.valueOf(j2), Integer.valueOf(i2));
                        C0418d.m366a(e.field_downloadId, f, i2);
                        C40917h.this.f110098h.put(e.field_downloadUrl, Long.valueOf(currentTimeMillis));
                        C40917h.this.f110097g.put(e.field_downloadUrl, Long.valueOf(j));
                    }
                }
                Long valueOf2 = Long.valueOf(Util.nullAsNil(C40917h.this.f110095e.get(e.field_downloadUrl)));
                Long valueOf3 = Long.valueOf(System.currentTimeMillis());
                long longValue2 = valueOf3.longValue() - valueOf2.longValue();
                if (longValue2 <= 0 || longValue2 >= 500) {
                    C40917h.this.f110095e.put(e.field_downloadUrl, valueOf3);
                    e.field_downloadedSize = j3;
                    e.field_totalSize = j4;
                    C40933j.m44322k(e);
                    C40917h.this.f110211a.mo63943f(e.field_downloadId, str, j, j2);
                    int i3 = i > 0 ? (int) ((((float) j3) / ((float) j4)) * 100.0f) : 0;
                    C40917h.this.mo63933i(e.field_downloadUrl, 1, i3 < 0 ? 0 : i3 > 100 ? 100 : i3, false, false);
                }
            }
        }
    }

    /* renamed from: t01.a$e */
    public class C48525e extends C29060q.C29061a {
        public C48525e() {
        }

        public void onNetworkChange(int i) {
            C48520a aVar = C48520a.this;
            aVar.getClass();
            Log.m105924i("MicroMsg.CDNDownloadClient", "notifyNetworkChange: " + i);
            C47731a aVar2 = aVar.f129776e;
            if (aVar2 != null) {
                try {
                    aVar2.mo63879Lo(i);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public C48520a() {
        C86709a0.m107528h();
        C86709a0.m107529k().mo121126a(this.f129783o);
        mo73156d();
    }

    /* renamed from: a */
    public static void m53895a(C48520a aVar) {
        C47731a aVar2 = aVar.f129776e;
        if (aVar2 != null) {
            try {
                aVar2.mo63881WX();
            } catch (RemoteException e) {
                Log.m105920e("MicroMsg.CDNDownloadClient", "removeIPCTaskMarker: " + e);
            }
        }
        aVar.f129775d = 0;
    }

    /* renamed from: f */
    public static synchronized C48520a m53896f() {
        C48520a aVar;
        synchronized (C48520a.class) {
            if (f129773p == null) {
                f129773p = new C48520a();
            }
            aVar = f129773p;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo73154b() {
        C47731a aVar = this.f129776e;
        if (aVar != null) {
            try {
                aVar.jf0();
            } catch (RemoteException e) {
                Log.m105920e("MicroMsg.CDNDownloadClient", "addIPCTaskMarker: " + e);
            }
        }
    }

    /* renamed from: c */
    public final void mo73155c(CDNTaskInfo cDNTaskInfo) {
        ((C52400a) this.f129778g).add(cDNTaskInfo);
        C37638a aVar = new C37638a();
        aVar.field_mediaId = cDNTaskInfo.f109965f;
        aVar.field_downloadUrlHashCode = cDNTaskInfo.f109964e.hashCode();
        aVar.field_downloadUrl = cDNTaskInfo.f109964e;
        aVar.field_httpsUrl = cDNTaskInfo.f109967h;
        aVar.field_filePath = cDNTaskInfo.f109966g;
        aVar.field_verifyHeaders = cDNTaskInfo.f109968i;
        aVar.field_allowMobileNetDownload = Boolean.valueOf(cDNTaskInfo.f109971o);
        aVar.field_wifiAutoDownload = Boolean.valueOf(cDNTaskInfo.f109972p);
        aVar.field_game_package_download = Boolean.valueOf(cDNTaskInfo.f109963d);
        C37640c a = C37639b.m41469a();
        if (a != null) {
            boolean insert = a.insert(aVar);
            Log.m105924i("MicroMsg.CdnDownloadInfoDBHelp", "insert: " + insert);
        }
    }

    /* renamed from: d */
    public final synchronized void mo73156d() {
        try {
            boolean bindService = this.f129777f.bindService(new Intent(this.f129777f, CDNDownloadServiceSlot.class), this.f129780i, 1);
            Log.m105924i("MicroMsg.CDNDownloadClient", "bindService: " + bindService);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CDNDownloadClient", "bindService: " + e.getMessage());
        }
        return;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo mo73157e(java.lang.String r7) {
        /*
            r6 = this;
            v01.c r0 = v01.C37639b.m41469a()
            r1 = 0
            if (r0 == 0) goto L_0x0043
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = "CdnDownloadInfo"
            r2[r3] = r4
            r4 = 1
            java.lang.String r5 = "downloadUrlHashCode"
            r2[r4] = r5
            int r4 = r7.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "select * from %s where %s=%s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.String[] r3 = new java.lang.String[r3]
            android.database.Cursor r0 = r0.rawQuery(r2, r3)
            if (r0 != 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            r2 = r1
        L_0x0030:
            boolean r3 = r0.moveToNext()
            if (r3 == 0) goto L_0x003f
            v01.a r2 = new v01.a
            r2.<init>()
            r2.convertFrom(r0)
            goto L_0x0030
        L_0x003f:
            r0.close()
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            if (r2 == 0) goto L_0x007c
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo r0 = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo
            r0.<init>(r7)
            java.lang.String r7 = r2.field_httpsUrl
            r0.f109967h = r7
            java.lang.String r7 = r2.field_mediaId
            r0.f109965f = r7
            java.lang.String r7 = r2.field_filePath
            r0.f109966g = r7
            java.lang.String r7 = r2.field_verifyHeaders
            r0.f109968i = r7
            java.lang.Boolean r7 = r2.field_allowMobileNetDownload
            boolean r7 = r7.booleanValue()
            r0.f109971o = r7
            java.lang.Boolean r7 = r2.field_wifiAutoDownload
            boolean r7 = r7.booleanValue()
            r0.f109972p = r7
            java.lang.Boolean r7 = r2.field_game_package_download
            boolean r7 = r7.booleanValue()
            r0.f109963d = r7
            r7 = 15
            r0.f109969j = r7
            r7 = 3600(0xe10, float:5.045E-42)
            r0.f109970n = r7
            return r0
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t01.C48520a.mo73157e(java.lang.String):com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        return r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskState mo73158g(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "MicroMsg.CDNDownloadClient"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "queryDownloadTask: "
            r1.append(r2)     // Catch:{ all -> 0x00ac }
            r1.append(r7)     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00ac }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ all -> 0x00ac }
            r1 = 0
            if (r0 == 0) goto L_0x0029
            java.lang.String r7 = "MicroMsg.CDNDownloadClient"
            java.lang.String r0 = "queryDownloadTask, url invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)     // Catch:{ all -> 0x00ac }
            monitor-exit(r6)
            return r1
        L_0x0029:
            q01.a r0 = r6.f129776e     // Catch:{ all -> 0x00ac }
            r2 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "MicroMsg.CDNDownloadClient"
            java.lang.String r3 = "queryDownloadTask service has connected"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r3)     // Catch:{ all -> 0x00ac }
            q01.a r0 = r6.f129776e     // Catch:{ RemoteException -> 0x0076 }
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState r0 = r0.mo63883Wh(r7)     // Catch:{ RemoteException -> 0x0076 }
            int r3 = r0.f109974d     // Catch:{ RemoteException -> 0x0076 }
            r4 = 100
            if (r3 == r4) goto L_0x0058
            if (r3 != r2) goto L_0x0046
            goto L_0x0058
        L_0x0046:
            java.util.Set<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo> r3 = r6.f129778g     // Catch:{ RemoteException -> 0x0076 }
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo r4 = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo     // Catch:{ RemoteException -> 0x0076 }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0076 }
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ RemoteException -> 0x0076 }
            boolean r3 = r3.contains(r4)     // Catch:{ RemoteException -> 0x0076 }
            if (r3 == 0) goto L_0x0074
            r0.f109974d = r2     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0074
        L_0x0058:
            java.util.Set<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo> r3 = r6.f129778g     // Catch:{ RemoteException -> 0x0076 }
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo r4 = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo     // Catch:{ RemoteException -> 0x0076 }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0076 }
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ RemoteException -> 0x0076 }
            boolean r3 = r3.contains(r4)     // Catch:{ RemoteException -> 0x0076 }
            if (r3 != 0) goto L_0x0074
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo r3 = r6.mo73157e(r7)     // Catch:{ RemoteException -> 0x0076 }
            if (r3 == 0) goto L_0x0074
            java.util.Set<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo> r4 = r6.f129778g     // Catch:{ RemoteException -> 0x0076 }
            u01.a r4 = (u01.C52400a) r4     // Catch:{ RemoteException -> 0x0076 }
            r4.add(r3)     // Catch:{ RemoteException -> 0x0076 }
        L_0x0074:
            monitor-exit(r6)
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.CDNDownloadClient"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r4.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = "queryDownloadTask, "
            r4.append(r5)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00ac }
            r4.append(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00ac }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ all -> 0x00ac }
        L_0x0092:
            java.util.Set<com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo> r0 = r6.f129778g     // Catch:{ all -> 0x00ac }
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo r3 = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo     // Catch:{ all -> 0x00ac }
            r3.<init>(r7)     // Catch:{ all -> 0x00ac }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x00ac }
            boolean r7 = r0.contains(r3)     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00aa
            com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState r7 = new com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState     // Catch:{ all -> 0x00ac }
            r7.<init>()     // Catch:{ all -> 0x00ac }
            r7.f109974d = r2     // Catch:{ all -> 0x00ac }
            monitor-exit(r6)
            return r7
        L_0x00aa:
            monitor-exit(r6)
            return r1
        L_0x00ac:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t01.C48520a.mo73158g(java.lang.String):com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState");
    }

    /* renamed from: h */
    public final void mo73159h(CDNTaskInfo cDNTaskInfo) {
        ((C52400a) this.f129778g).remove(cDNTaskInfo);
        String str = cDNTaskInfo.f109964e;
        C37640c a = C37639b.m41469a();
        if (a != null) {
            boolean execSQL = a.execSQL("CdnDownloadInfo", String.format("delete from %s where %s=%s", new Object[]{"CdnDownloadInfo", "downloadUrlHashCode", Integer.valueOf(str.hashCode())}));
            Log.m105924i("MicroMsg.CdnDownloadInfoDBHelp", "removeDownloadInfoByDownloadUrl: " + execSQL);
        }
    }
}
