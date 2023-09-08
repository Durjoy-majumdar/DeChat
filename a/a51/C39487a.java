package a51;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.TextUtils;
import bd2.C79690d;
import c51.C0418d;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GameWatchReportEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.downloader.api.C40910b;
import com.tencent.p014mm.plugin.downloader.model.C40923i;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40934k;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.C40940o;
import com.tencent.p014mm.plugin.downloader.model.C40945r;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadService;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.downloader.p796ui.FileDownloadConfirmUI;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.downloadservice.TMAssistantDownloadSDKService;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ke3.C88144b;
import ld2.C46848g;
import nd3.C47223a;
import p918s2.C90116e;
import z41.C53736a;
import z41.C53737b;
import zt3.C119157j;

/* renamed from: a51.a */
public class C39487a extends C40945r {

    /* renamed from: b */
    public TMAssistantDownloadSDKClient f106033b = null;

    /* renamed from: c */
    public Context f106034c = MMApplicationContext.getContext();

    /* renamed from: d */
    public HashMap<String, Long> f106035d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, Long> f106036e = new HashMap<>();

    /* renamed from: f */
    public ConcurrentHashMap<String, Integer> f106037f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public HashSet<Long> f106038g = new HashSet<>();

    /* renamed from: h */
    public Map<String, String> f106039h = null;

    /* renamed from: i */
    public HashMap<String, Long> f106040i = new HashMap<>();

    /* renamed from: j */
    public HashMap<String, Long> f106041j = new HashMap<>();

    /* renamed from: k */
    public byte[] f106042k = new byte[0];

    /* renamed from: l */
    public MTimerHandler f106043l = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C39490c(), false);

    /* renamed from: m */
    public ITMAssistantDownloadSDKClientListener f106044m = new C39491d();

    /* renamed from: a51.a$a */
    public class C39488a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53736a f106045d;

        public C39488a(C53736a aVar) {
            this.f106045d = aVar;
        }

        public void run() {
            int i = -1;
            try {
                C53736a aVar = this.f106045d;
                C40910b.m44270c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
                C46848g.Cx0().mo69342c(this.f106045d.field_appId);
                TMAssistantDownloadSDKClient i2 = C39487a.this.mo62097i();
                C53736a aVar2 = this.f106045d;
                String str = aVar2.field_downloadUrl;
                i = i2.startDownloadTask(str, aVar2.field_secondaryUrl, aVar2.field_fileSize, 0, "resource/tm.android.unknown", MD5Util.getMD5String(str), this.f106045d.field_autoDownload, C39487a.this.f106039h);
                if (i == 0) {
                    TMAssistantDownloadTaskInfo downloadTaskState = C39487a.this.mo62097i().getDownloadTaskState(this.f106045d.field_downloadUrl);
                    String str2 = downloadTaskState.mSavePath;
                    Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "Task Info from TMAssistant: URL: %s, PATH: %s, fileLen: %d, receiveLen: %d", this.f106045d.field_downloadUrl, str2, Long.valueOf(C86013q1.m106451l(str2)), Long.valueOf(downloadTaskState.mReceiveDataLen));
                    C53736a aVar3 = this.f106045d;
                    aVar3.field_status = 1;
                    aVar3.field_startTime = System.currentTimeMillis();
                    C53736a aVar4 = this.f106045d;
                    long j = downloadTaskState.mReceiveDataLen;
                    aVar4.field_startSize = j;
                    aVar4.field_filePath = downloadTaskState.mSavePath;
                    aVar4.field_downloadedSize = j;
                    aVar4.field_totalSize = downloadTaskState.mTotalDataLen;
                    C40933j.m44322k(aVar4);
                    C39487a.this.f106038g.add(Long.valueOf(this.f106045d.field_downloadId));
                    C39487a.m42125f(C39487a.this, this.f106045d.field_downloadUrl, downloadTaskState.mState, 0, true);
                    C39487a.this.f110211a.mo63946i(this.f106045d.field_downloadId, downloadTaskState.mSavePath);
                    C53736a aVar5 = this.f106045d;
                    Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask: id: %d, url: %s, path: %s", Long.valueOf(this.f106045d.field_downloadId), aVar5.field_downloadUrl, aVar5.field_filePath);
                } else if (i == 1) {
                    C53736a aVar6 = this.f106045d;
                    aVar6.field_status = 4;
                    aVar6.field_errCode = 803;
                    C40933j.m44322k(aVar6);
                    C39487a.this.f110211a.mo63940c(this.f106045d.field_downloadId, 803, false);
                } else if (i == 2) {
                    C53736a aVar7 = this.f106045d;
                    aVar7.field_status = 4;
                    aVar7.field_errCode = 104;
                    C40933j.m44322k(aVar7);
                    C39487a.this.f110211a.mo63940c(this.f106045d.field_downloadId, 104, false);
                } else if (i == 3) {
                    C53736a aVar8 = this.f106045d;
                    aVar8.field_status = 4;
                    aVar8.field_errCode = 700;
                    C40933j.m44322k(aVar8);
                    C40933j.m44322k(this.f106045d);
                    C39487a.this.f110211a.mo63940c(this.f106045d.field_downloadId, 700, false);
                } else if (i == 4) {
                    Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "file has existed");
                    TMAssistantDownloadTaskInfo downloadTaskState2 = C39487a.this.mo62097i().getDownloadTaskState(this.f106045d.field_downloadUrl);
                    C53736a aVar9 = this.f106045d;
                    long currentTimeMillis = System.currentTimeMillis();
                    aVar9.field_finishTime = currentTimeMillis;
                    aVar9.field_startTime = currentTimeMillis;
                    C53736a aVar10 = this.f106045d;
                    aVar10.field_status = 6;
                    aVar10.field_filePath = downloadTaskState2.mSavePath;
                    long j2 = downloadTaskState2.mReceiveDataLen;
                    aVar10.field_startSize = j2;
                    aVar10.field_downloadedSize = j2;
                    aVar10.field_totalSize = downloadTaskState2.mTotalDataLen;
                    C40933j.m44322k(aVar10);
                    C39487a.this.f110211a.mo63939b(this.f106045d.field_downloadId);
                    Intent intent = new Intent();
                    intent.putExtra(FileDownloadService.f110081n, 1);
                    intent.setClass(C39487a.this.f106034c, FileDownloadService.class);
                    intent.putExtra(FileDownloadService.f110080j, this.f106045d.field_downloadId);
                    try {
                        C88144b.m109807y(intent);
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", e.getMessage());
                    }
                    C39487a.this.f106038g.remove(Long.valueOf(this.f106045d.field_downloadId));
                } else if (i == 5) {
                    this.f106045d.field_startTime = System.currentTimeMillis();
                    C53736a aVar11 = this.f106045d;
                    aVar11.field_status = 1;
                    C40933j.m44322k(aVar11);
                    C39487a.this.f106038g.add(Long.valueOf(this.f106045d.field_downloadId));
                    C39487a.m42125f(C39487a.this, this.f106045d.field_downloadUrl, 2, 0, true);
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.FileDownloaderImplTMAssistant", "Adding task to TMAssistant failed: ", e2.getMessage());
                C53736a aVar12 = this.f106045d;
                aVar12.field_errCode = 102;
                aVar12.field_status = 4;
                C40933j.m44322k(aVar12);
                Log.m105921e("MicroMsg.FileDownloaderImplTMAssistant", "Adding Task via TMAssistant Failed: %d, url: %s", Integer.valueOf(i), this.f106045d.field_downloadUrl);
                C39487a.this.f110211a.mo63940c(this.f106045d.field_downloadId, 102, false);
            }
        }
    }

    /* renamed from: a51.a$b */
    public class C39489b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f106047d;

        public C39489b(long j) {
            this.f106047d = j;
        }

        public void run() {
            C53736a c = C40933j.m44314c(this.f106047d);
            if (c != null) {
                try {
                    C39487a.this.mo62097i().cancelDownloadTask(c.field_downloadUrl);
                    C86013q1.m106447h(c.field_filePath);
                    Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask, delete file, path: %s", c.field_filePath);
                    C39487a.this.f106038g.remove(Long.valueOf(c.field_downloadId));
                    C39487a.this.mo62096g(c.field_downloadUrl);
                    Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: status = " + c.field_status);
                    if (c.field_status != 5) {
                        c.field_status = 5;
                        c.field_finishTime = System.currentTimeMillis();
                        C40933j.m44322k(c);
                        long nullAs = Util.nullAs(C39487a.this.f106041j.get(c.field_downloadUrl), c.field_startTime);
                        long nullAs2 = Util.nullAs(C39487a.this.f106040i.get(c.field_downloadUrl), c.field_startSize);
                        long currentTimeMillis = System.currentTimeMillis() - nullAs;
                        long j = c.field_downloadedSize;
                        float f = ((((float) (j - nullAs2)) * 1000.0f) / ((float) currentTimeMillis)) / 1048576.0f;
                        C0418d.m366a(c.field_downloadId, f, (int) ((((float) j) / ((float) c.field_totalSize)) * 100.0f));
                        C39487a.this.f110211a.mo63944g(c.field_downloadId);
                        Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "removeDownloadTask: id: %d, path: %s", Long.valueOf(this.f106047d), c.field_filePath);
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant remove task failed: " + e.toString());
                }
            }
        }
    }

    /* renamed from: a51.a$c */
    public class C39490c implements MTimerHandler.CallBack {
        public C39490c() {
        }

        public boolean onTimerExpired() {
            boolean z;
            C39487a aVar = C39487a.this;
            HashSet<Long> hashSet = aVar.f106038g;
            if (hashSet == null || hashSet.size() == 0) {
                TMAssistantDownloadSDKManager.getInstance(aVar.f106034c).releaseDownloadSDKClient("WechatDownloadClient");
                TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = aVar.f106033b;
                if (tMAssistantDownloadSDKClient != null) {
                    tMAssistantDownloadSDKClient.unRegisterDownloadTaskListener(aVar.f106044m);
                }
                aVar.f106033b = null;
                TMAssistantDownloadSDKManager.closeAllService(aVar.f106034c);
                try {
                    aVar.f106034c.stopService(new Intent(aVar.f106034c, TMAssistantDownloadSDKService.class));
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "Error occurred when stopping TMAssistant Service: " + e.toString());
                }
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistantSDK Client released");
                z = true;
            } else {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "Still have tasks running");
                z = false;
            }
            if (!z) {
                C39487a.this.f106043l.startTimer(240000);
            }
            return true;
        }
    }

    /* renamed from: a51.a$d */
    public class C39491d implements ITMAssistantDownloadSDKClientListener {
        public C39491d() {
        }

        public void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, String str, long j, long j2) {
            String str2 = str;
            long j3 = j;
            long j4 = j2;
            C53736a e = C40933j.m44316e(str);
            if (e == null) {
                Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
                return;
            }
            Long valueOf = Long.valueOf(Util.nullAsNil(C39487a.this.f106040i.get(e.field_downloadUrl)));
            if (valueOf.longValue() == 0) {
                valueOf = Long.valueOf(j);
                C39487a.this.f106040i.put(e.field_downloadUrl, Long.valueOf(j));
            }
            long longValue = j3 - valueOf.longValue();
            if (j4 == 0) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "onDownloadTaskProgressChanged, totalDataLen = 0");
            } else {
                int i = (int) ((((float) j3) / ((float) j4)) * 100.0f);
                if ((longValue * 100) / j4 >= 1) {
                    long nullAs = Util.nullAs(C39487a.this.f106041j.get(e.field_downloadUrl), e.field_startTime);
                    long currentTimeMillis = System.currentTimeMillis();
                    long j5 = currentTimeMillis - nullAs;
                    float f = ((((float) longValue) * 1000.0f) / ((float) j5)) / 1048576.0f;
                    Log.m105919d("MicroMsg.FileDownloaderImplTMAssistant", "downloadSpeed, appId = %s, speed = %f, period = %d, downloadedSize = %d, totalSize = %d", e.field_appId, Float.valueOf(f), Long.valueOf(j5), Long.valueOf(longValue), Long.valueOf(j2));
                    C0418d.m366a(e.field_downloadId, f, i);
                    C39487a.this.f106041j.put(e.field_downloadUrl, Long.valueOf(currentTimeMillis));
                    C39487a.this.f106040i.put(e.field_downloadUrl, Long.valueOf(j));
                }
            }
            String str3 = str;
            Long l = C39487a.this.f106036e.get(str3);
            Long valueOf2 = Long.valueOf(System.currentTimeMillis());
            if (l != null) {
                long longValue2 = valueOf2.longValue() - l.longValue();
                if (longValue2 > 0 && longValue2 < 500) {
                    return;
                }
            }
            C39487a.this.f106036e.put(str3, valueOf2);
            Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "onProgressChanged");
            long j6 = j2;
            C39487a.m42125f(C39487a.this, str3, 2, (int) ((100 * j3) / j6), false);
            long j7 = e.field_downloadId;
            C53737b f2 = C40933j.m44317f();
            if (f2 != null) {
                f2.execSQL("FileDownloadInfo", "update FileDownloadInfo set downloadedSize = " + j3 + "," + "totalSize" + "= " + j6 + " where " + "downloadId" + " = " + j7);
            }
            C39487a.this.f110211a.mo63943f(e.field_downloadId, str, j, j2);
        }

        public void OnDownloadSDKTaskStateChanged(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, String str, int i, int i2, String str2, boolean z, boolean z2) {
            boolean z3;
            String str3 = str;
            int i3 = i;
            int i4 = i2;
            boolean z4 = z;
            Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "OnDownloadSDKTaskStateChanged State: " + i3 + " | ErrorCode: " + i4 + " | ErrorMsg: " + str2);
            C53736a e = C40933j.m44316e(str);
            if (e == null) {
                Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadInfoByURL failed");
                return;
            }
            String str4 = e.field_filePath;
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "State: %d, Id: %d, Path: %s, File Exists: %b, URL: %s", Integer.valueOf(i), Long.valueOf(e.field_downloadId), str4, Boolean.valueOf(C86013q1.m106450k(str4)), str3);
            if (!(i3 == 1 || i3 == 2)) {
                FileDownloadTaskInfo e2 = C39487a.this.mo62095e(e.field_downloadId);
                long nullAs = Util.nullAs(C39487a.this.f106041j.get(e.field_downloadUrl), e.field_startTime);
                long nullAs2 = Util.nullAs(C39487a.this.f106040i.get(e.field_downloadUrl), e.field_startSize);
                long j = e2.f12200j;
                float currentTimeMillis = ((((float) (j - nullAs2)) * 1000.0f) / ((float) (System.currentTimeMillis() - nullAs))) / 1048576.0f;
                C0418d.m366a(e.field_downloadId, currentTimeMillis, (int) ((((float) j) / ((float) e2.f12201n)) * 100.0f));
                C39487a.this.f106040i.remove(e.field_downloadUrl);
                C39487a.this.f106041j.remove(e.field_downloadUrl);
            }
            TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo = null;
            try {
                tMAssistantDownloadTaskInfo = C39487a.this.mo62097i().getDownloadTaskState(e.field_downloadUrl);
            } catch (Exception unused) {
            }
            if (i3 == 2) {
                e.field_status = 1;
                if (tMAssistantDownloadTaskInfo != null) {
                    e.field_filePath = tMAssistantDownloadTaskInfo.mSavePath;
                }
                C40933j.m44322k(e);
            } else if (i3 == 3) {
                e.field_finishTime = System.currentTimeMillis();
                e.field_status = 2;
                C40933j.m44322k(e);
                C39487a.this.mo62096g(str3);
                C39487a.this.f106038g.remove(Long.valueOf(e.field_downloadId));
                C39487a.this.f110211a.mo63942e(e.field_downloadId);
            } else if (i3 == 4) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Download Succeed event received");
                e.field_status = 6;
                e.field_finishTime = System.currentTimeMillis();
                long j2 = e.field_totalSize;
                e.field_downloadedSize = j2;
                if (tMAssistantDownloadTaskInfo != null) {
                    e.field_filePath = tMAssistantDownloadTaskInfo.mSavePath;
                }
                Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "download succeed, downloadedSize = %d, startSize = %d", Long.valueOf(j2), Long.valueOf(e.field_startSize));
                C40933j.m44322k(e);
                C39487a.this.f110211a.mo63939b(e.field_downloadId);
                if (z2) {
                    GameWatchReportEvent gameWatchReportEvent = new GameWatchReportEvent();
                    GameWatchReportEvent.C1078a aVar = gameWatchReportEvent.f9289d;
                    aVar.f9290a = e.field_appId;
                    aVar.f9291b = 6;
                    gameWatchReportEvent.publish();
                }
                Intent intent = new Intent();
                intent.putExtra(FileDownloadService.f110081n, 1);
                intent.setClass(C39487a.this.f106034c, FileDownloadService.class);
                intent.putExtra(FileDownloadService.f110080j, e.field_downloadId);
                intent.putExtra(FileDownloadService.f110084q, z4);
                try {
                    C88144b.m109807y(intent);
                } catch (Exception e3) {
                    Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", e3.getMessage());
                }
                C39487a.this.mo62096g(str3);
                C39487a.this.f106038g.remove(Long.valueOf(e.field_downloadId));
            } else if (i3 == 5) {
                if (i4 == 601 || i4 == 602 || i4 == 603 || i4 == 605 || i4 == 606) {
                    Log.m105918d("MicroMsg.FileDownloaderImplTMAssistant", "releaseTimer 4 min");
                    C39487a.this.f106043l.startTimer(240000);
                }
                if (!NetStatusUtil.isWifi(MMApplicationContext.getContext()) || !e.field_downloadInWifi) {
                    z3 = false;
                } else {
                    z3 = false;
                    e.field_downloadInWifi = false;
                    e.field_reserveInWifi = false;
                }
                C39487a.m42125f(C39487a.this, str3, i3, z3 ? 1 : 0, z3);
                C39487a.this.f106038g.remove(Long.valueOf(e.field_downloadId));
                e.field_finishTime = System.currentTimeMillis();
                e.field_errCode = i4;
                e.field_status = 4;
                C40933j.m44322k(e);
                C39487a.this.f110211a.mo63940c(e.field_downloadId, i4, z4);
            }
        }

        public void OnDwonloadSDKServiceInvalid(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient) {
            Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "TMAssistant Service unavailable");
            Iterator<Long> it = C39487a.this.f106038g.iterator();
            while (it.hasNext()) {
                C53736a c = C40933j.m44314c(it.next().longValue());
                if (c != null) {
                    c.field_finishTime = System.currentTimeMillis();
                    c.field_status = 4;
                    c.field_errCode = 101;
                    C40933j.m44322k(c);
                    C39487a.this.f110211a.mo63940c(c.field_downloadId, 101, false);
                    C39487a.m42125f(C39487a.this, c.field_downloadUrl, 5, 0, false);
                }
            }
            C39487a.this.f106038g.clear();
        }
    }

    /* renamed from: a51.a$e */
    public class C39492e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53736a f106051d;

        /* renamed from: e */
        public final /* synthetic */ long f106052e;

        public C39492e(C53736a aVar, long j) {
            this.f106051d = aVar;
            this.f106052e = j;
        }

        public void run() {
            try {
                int i = C39487a.this.mo62097i().getDownloadTaskState(this.f106051d.field_downloadUrl).mState;
                if (i == 1 || i == 2) {
                    C39487a.this.mo62097i().pauseDownloadTask(this.f106051d.field_downloadUrl);
                    Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d ", Long.valueOf(this.f106052e));
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %s", e.toString());
                Log.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: a51.a$f */
    public class C39493f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53736a f106054d;

        /* renamed from: e */
        public final /* synthetic */ boolean f106055e;

        /* renamed from: f */
        public final /* synthetic */ long f106056f;

        public C39493f(C53736a aVar, boolean z, long j) {
            this.f106054d = aVar;
            this.f106055e = z;
            this.f106056f = j;
        }

        public void run() {
            int i;
            try {
                C53736a aVar = this.f106054d;
                C40910b.m44270c(aVar.field_appId, aVar.field_downloadUrl, aVar.field_secondaryUrl);
                C46848g.Cx0().mo69342c(this.f106054d.field_appId);
                TMAssistantDownloadTaskInfo downloadTaskState = C39487a.this.mo62097i().getDownloadTaskState(this.f106054d.field_downloadUrl);
                if (downloadTaskState == null || !((i = downloadTaskState.mState) == 1 || i == 2)) {
                    TMAssistantDownloadSDKClient i2 = C39487a.this.mo62097i();
                    C53736a aVar2 = this.f106054d;
                    String str = aVar2.field_downloadUrl;
                    int startDownloadTask = i2.startDownloadTask(str, aVar2.field_secondaryUrl, aVar2.field_fileSize, 0, "resource/tm.android.unknown", MD5Util.getMD5String(str), this.f106054d.field_autoDownload, C39487a.this.f106039h);
                    TMAssistantDownloadTaskInfo downloadTaskState2 = C39487a.this.mo62097i().getDownloadTaskState(this.f106054d.field_downloadUrl);
                    if (startDownloadTask == 0) {
                        C53736a aVar3 = this.f106054d;
                        aVar3.field_status = 1;
                        aVar3.field_startTime = System.currentTimeMillis();
                        C53736a aVar4 = this.f106054d;
                        aVar4.field_filePath = downloadTaskState2.mSavePath;
                        aVar4.field_totalSize = downloadTaskState2.mTotalDataLen;
                        aVar4.field_status = 1;
                        C40933j.m44322k(aVar4);
                        C39487a.this.f106038g.add(Long.valueOf(this.f106054d.field_downloadId));
                        C39487a.m42125f(C39487a.this, this.f106054d.field_downloadUrl, 2, 0, true);
                        if (this.f106055e) {
                            C40923i iVar = C39487a.this.f110211a;
                            C53736a aVar5 = this.f106054d;
                            iVar.mo63945h(aVar5.field_downloadId, aVar5.field_filePath);
                        }
                        Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d", Long.valueOf(this.f106056f));
                    } else if (startDownloadTask == 1) {
                        C53736a aVar6 = this.f106054d;
                        aVar6.field_status = 4;
                        aVar6.field_errCode = 803;
                        C40933j.m44322k(aVar6);
                        C39487a.this.f110211a.mo63940c(this.f106054d.field_downloadId, 803, false);
                    } else if (startDownloadTask == 2) {
                        C53736a aVar7 = this.f106054d;
                        aVar7.field_status = 4;
                        aVar7.field_errCode = 104;
                        C40933j.m44322k(aVar7);
                        C39487a.this.f110211a.mo63940c(this.f106054d.field_downloadId, 104, false);
                    } else if (startDownloadTask == 3) {
                        C53736a aVar8 = this.f106054d;
                        aVar8.field_status = 4;
                        aVar8.field_errCode = 700;
                        C40933j.m44322k(aVar8);
                        C39487a.this.f110211a.mo63940c(this.f106054d.field_downloadId, 700, false);
                    } else if (startDownloadTask == 4) {
                        Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "file has existed");
                        C53736a aVar9 = this.f106054d;
                        long currentTimeMillis = System.currentTimeMillis();
                        aVar9.field_finishTime = currentTimeMillis;
                        aVar9.field_startTime = currentTimeMillis;
                        C53736a aVar10 = this.f106054d;
                        aVar10.field_status = 6;
                        aVar10.field_filePath = downloadTaskState2.mSavePath;
                        long j = downloadTaskState2.mReceiveDataLen;
                        aVar10.field_startSize = j;
                        aVar10.field_downloadedSize = j;
                        aVar10.field_totalSize = downloadTaskState2.mTotalDataLen;
                        C40933j.m44322k(aVar10);
                        C39487a.this.f110211a.mo63939b(this.f106054d.field_downloadId);
                        Intent intent = new Intent();
                        intent.putExtra(FileDownloadService.f110081n, 1);
                        intent.setClass(C39487a.this.f106034c, FileDownloadService.class);
                        intent.putExtra(FileDownloadService.f110080j, this.f106054d.field_downloadId);
                        try {
                            C88144b.m109807y(intent);
                        } catch (Exception e) {
                            Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", e.getMessage());
                        }
                        C39487a.this.f106038g.remove(Long.valueOf(this.f106054d.field_downloadId));
                    } else if (startDownloadTask == 5) {
                        this.f106054d.field_startTime = System.currentTimeMillis();
                        C53736a aVar11 = this.f106054d;
                        aVar11.field_status = 1;
                        C40933j.m44322k(aVar11);
                        C39487a.this.f106038g.add(Long.valueOf(this.f106054d.field_downloadId));
                        C39487a.m42125f(C39487a.this, this.f106054d.field_downloadUrl, 2, 0, true);
                    }
                } else {
                    Log.m105928w("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, is running");
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %s", e2.toString());
                Log.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", e2, "", new Object[0]);
                C53736a aVar12 = this.f106054d;
                aVar12.field_status = 4;
                aVar12.field_errCode = 103;
                C40933j.m44322k(aVar12);
                C39487a.this.f110211a.mo63940c(this.f106054d.field_downloadId, 103, false);
            }
        }
    }

    public C39487a(C40923i iVar) {
        super(iVar);
        PackageInfo packageInfo = null;
        HashMap hashMap = new HashMap();
        String property = System.getProperty("http.agent");
        Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", property);
        String str = (Util.isNullOrNil(property) ? "Mozilla/5.0 (Linux; Android) AppleWebkit (KHTML, like Gecko)" : property) + " MicroMessenger";
        Context context = this.f106034c;
        String packageName = MMApplicationContext.getPackageName();
        if (packageName == null) {
            Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "getPackageInfo fail, packageName is null");
        } else {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.printErrStackTrace("MicroMsg.FileDownloaderImplTMAssistant", e, "", new Object[0]);
            }
        }
        if (packageInfo != null) {
            str = ((str + "/") + packageInfo.versionName) + "" + packageInfo.versionCode;
        }
        String str2 = str + " NetType/" + NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "User-Agent: %s", str2);
        hashMap.put("User-Agent", str2);
        this.f106039h = hashMap;
    }

    /* renamed from: f */
    public static void m42125f(C39487a aVar, String str, int i, int i2, boolean z) {
        aVar.getClass();
        Class cls = C79690d.class;
        C53736a e = C40933j.m44316e(str);
        if (e == null) {
            Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification failed: null task info");
        } else if (e.field_showNotification) {
            C90116e.C90121c cVar = new C90116e.C90121c(aVar.f106034c, "reminder_channel_id");
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                aVar.f106035d.put(str, Long.valueOf(currentTimeMillis));
                cVar.f258814z.when = currentTimeMillis;
            } else {
                Long l = aVar.f106035d.get(str);
                if (l != null) {
                    cVar.f258814z.when = l.longValue();
                } else {
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    aVar.f106035d.put(str, valueOf);
                    cVar.f258814z.when = valueOf.longValue();
                }
            }
            boolean z2 = false;
            C44561j i3 = C44565l.m48989i(e.field_appId, false, false);
            if (!TextUtils.isEmpty(e.field_fileName)) {
                if (i2 == 0) {
                    Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, FileDownloadInfo.appName=" + e.field_fileName + ", appId=" + e.field_appId);
                }
                cVar.mo124383h(e.field_fileName);
            } else if (i3 == null || Util.isNullOrNil(i3.field_appName)) {
                Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, appName is empty");
            } else {
                if (i2 == 0) {
                    Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "updateNotification, AppInfo.appName=" + i3.field_appName + ", appId=" + e.field_appId);
                }
                cVar.mo124383h(i3.field_appName);
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    cVar.f258814z.icon = 17301633;
                    if (i2 == 0) {
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        z2 = true;
                    }
                    cVar.mo124386k(100, i2, z2);
                    cVar.mo124382g(aVar.f106034c.getString(C0966R.string.cui));
                    if (e.field_reserveInWifi) {
                        cVar.f258801m = C90116e.C90121c.m112748d(aVar.f106034c.getString(C0966R.string.cuk));
                    }
                    cVar.mo124384i(2, true);
                    long j = e.field_downloadId;
                    Intent intent = new Intent(aVar.f106034c, FileDownloadConfirmUI.class);
                    intent.putExtra("extra_download_id", j);
                    cVar.f258795g = PendingIntent.getActivity(aVar.f106034c, (int) System.currentTimeMillis(), intent, 268435456);
                    break;
                case 4:
                case 6:
                    aVar.mo62096g(str);
                    return;
                case 5:
                    cVar.f258814z.icon = 17301634;
                    cVar.mo124380e(true);
                    cVar.f258795g = PendingIntent.getActivity(MMApplicationContext.getContext(), 0, new Intent(), 0);
                    cVar.mo124382g(aVar.f106034c.getString(C0966R.string.cuf));
                    break;
            }
            synchronized (aVar.f106042k) {
                Integer num = aVar.f106037f.get(str);
                if (num == null) {
                    aVar.f106037f.put(str, Integer.valueOf(((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93214k(cVar.mo124378b(), true)));
                } else {
                    ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93215l(num.intValue(), cVar.mo124378b(), true);
                }
                if (i == 4) {
                    aVar.f106037f.remove(str);
                }
            }
        }
    }

    /* renamed from: h */
    public static void m42126h() {
        C86009m1 m1Var = new C86009m1(TMAssistantFile.getSavePathRootDir() + "/.tmp/");
        if (!m1Var.mo119967g()) {
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "Make download dir result: %b, path:%s", Boolean.valueOf(m1Var.mo119987x()), m1Var.mo119976n());
        }
    }

    /* renamed from: a */
    public boolean mo62091a(long j) {
        return mo62098j(j, true);
    }

    /* renamed from: b */
    public long mo62092b(C40939n nVar) {
        if (nVar == null || Util.isNullOrNil(nVar.f110176a)) {
            Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "Invalid Request");
            return -1;
        }
        String str = nVar.f110176a;
        String str2 = nVar.f110182g;
        C53736a e = C40933j.m44316e(str);
        if (e != null) {
            FileDownloadTaskInfo e2 = mo62095e(e.field_downloadId);
            int i = e2.f12196f;
            if (i == 1) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, running, return");
                return e2.f12194d;
            } else if (i == 6) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, md5 checking, return");
                return e2.f12194d;
            } else if (i == 3) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "addDownloadTask, has download finished, install");
                if (nVar.f110184i) {
                    C39890a.m42668a(e2.f12194d, false, (C47223a) null);
                }
                return e2.f12194d;
            }
        }
        if (e == null) {
            e = C40933j.m44315d(str2);
        }
        m42126h();
        C40933j.m44321j(str);
        C40933j.m44320i(str2);
        C40933j.m44320i(nVar.f110199x);
        C53736a b = C40940o.m44349b(nVar);
        if (!nVar.f110188m || e == null) {
            b.field_downloadId = System.currentTimeMillis();
        } else {
            b.field_downloadId = e.field_downloadId;
        }
        b.field_status = 0;
        b.field_downloaderType = 2;
        if (e != null) {
            int i2 = e.field_status;
            if (i2 == 2) {
                b.field_startState = 1;
            } else if (i2 == 4) {
                b.field_startState = 1;
            } else {
                b.field_startState = 0;
            }
        } else {
            b.field_startState = 0;
        }
        if (!nVar.f110189n || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                b.field_downloadInWifi = true;
            }
            C40933j.m44312a(b);
            return mo62094d(b);
        }
        Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "downloadInWifi, not wifi");
        b.field_status = 0;
        b.field_downloadInWifi = true;
        C40933j.m44312a(b);
        return b.field_downloadId;
    }

    /* renamed from: c */
    public boolean mo62093c(long j) {
        C53736a c = C40933j.m44314c(j);
        if (c == null || Util.isNullOrNil(c.field_downloadUrl)) {
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, record not found", Long.valueOf(j));
            return false;
        } else if (c.field_downloaderType != 2) {
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask: %d, downloader type not matched", Long.valueOf(j));
            C86013q1.m106447h(c.field_filePath);
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "pauseDownloadTask, delete file: %s", c.field_filePath);
            C40933j.m44319h(j);
            return false;
        } else {
            ((C119157j) C119157j.f356862d).mo183876g(new C39492e(c, j), "MicroMsg.FileDownloaderImplTMAssistant");
            return true;
        }
    }

    /* renamed from: d */
    public long mo62094d(C53736a aVar) {
        ((C119157j) C119157j.f356862d).mo183876g(new C39488a(aVar), "MicroMsg.FileDownloaderImplTMAssistant");
        return aVar.field_downloadId;
    }

    /* renamed from: e */
    public FileDownloadTaskInfo mo62095e(long j) {
        FileDownloadTaskInfo fileDownloadTaskInfo = new FileDownloadTaskInfo();
        fileDownloadTaskInfo.f12194d = j;
        C53736a c = C40933j.m44314c(j);
        if (c != null && !Util.isNullOrNil(c.field_downloadUrl)) {
            fileDownloadTaskInfo.f12195e = c.field_downloadUrl;
            fileDownloadTaskInfo.f12196f = c.field_status;
            String str = c.field_filePath;
            fileDownloadTaskInfo.f12197g = str;
            if (!C86013q1.m106450k(str)) {
                fileDownloadTaskInfo.f12200j = 0;
                fileDownloadTaskInfo.f12201n = 0;
            } else {
                fileDownloadTaskInfo.f12200j = c.field_downloadedSize;
                fileDownloadTaskInfo.f12201n = c.field_totalSize;
            }
            fileDownloadTaskInfo.f12198h = c.field_md5;
            TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo = null;
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                tMAssistantDownloadTaskInfo = (TMAssistantDownloadTaskInfo) new C39494b(this, 500, (TMAssistantDownloadTaskInfo) null, fileDownloadTaskInfo.f12195e).exec(C86709a0.m107525e().getWorkerHandler());
            } else {
                try {
                    tMAssistantDownloadTaskInfo = mo62097i().getDownloadTaskState(fileDownloadTaskInfo.f12195e);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.FileDownloaderImplTMAssistant", "getDownloadTaskState faile: " + e.toString());
                }
            }
            if (tMAssistantDownloadTaskInfo != null) {
                int i = tMAssistantDownloadTaskInfo.mState;
                if (i == 1 || i == 2) {
                    fileDownloadTaskInfo.f12196f = 1;
                } else if (i == 3) {
                    fileDownloadTaskInfo.f12196f = 2;
                } else if (i != 4) {
                    if (fileDownloadTaskInfo.f12196f == 1) {
                        fileDownloadTaskInfo.f12196f = 0;
                    }
                } else if (fileDownloadTaskInfo.f12196f == 6) {
                    fileDownloadTaskInfo.f12196f = 6;
                } else {
                    fileDownloadTaskInfo.f12196f = 3;
                }
                fileDownloadTaskInfo.f12197g = tMAssistantDownloadTaskInfo.mSavePath;
                fileDownloadTaskInfo.f12200j = tMAssistantDownloadTaskInfo.mReceiveDataLen;
                fileDownloadTaskInfo.f12201n = tMAssistantDownloadTaskInfo.mTotalDataLen;
            } else if (fileDownloadTaskInfo.f12196f == 1) {
                fileDownloadTaskInfo.f12196f = 0;
            }
            int i2 = fileDownloadTaskInfo.f12196f;
            if ((i2 == 6 || i2 == 3) && !C86013q1.m106450k(fileDownloadTaskInfo.f12197g)) {
                fileDownloadTaskInfo.f12196f = 0;
            }
            if (fileDownloadTaskInfo.f12196f == 6) {
                long j2 = fileDownloadTaskInfo.f12194d;
                if (!((HashSet) C40934k.f110154a).contains(Long.valueOf(j2))) {
                    fileDownloadTaskInfo.f12196f = 3;
                }
            }
            if (Util.isNullOrNil(c.field_filePath)) {
                c.field_filePath = fileDownloadTaskInfo.f12197g;
                C40933j.m44322k(c);
            }
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadTask: appId: %s, status: %d, url: %s, path: %s", c.field_appId, Integer.valueOf(fileDownloadTaskInfo.f12196f), fileDownloadTaskInfo.f12195e, fileDownloadTaskInfo.f12197g);
        }
        return fileDownloadTaskInfo;
    }

    /* renamed from: g */
    public final void mo62096g(String str) {
        synchronized (this.f106042k) {
            Integer num = this.f106037f.get(str);
            if (num == null) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "No notification id found");
                return;
            }
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(num.intValue());
            Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "cancelNotification, id = " + num);
            this.f106037f.remove(str);
        }
    }

    /* renamed from: i */
    public final TMAssistantDownloadSDKClient mo62097i() {
        if (this.f106033b == null) {
            TMAssistantDownloadSDKClient downloadSDKClient = TMAssistantDownloadSDKManager.getInstance(this.f106034c).getDownloadSDKClient("WechatDownloadClient");
            this.f106033b = downloadSDKClient;
            downloadSDKClient.registerDownloadTaskListener(this.f106044m);
        }
        this.f106043l.startTimer(240000);
        return this.f106033b;
    }

    /* renamed from: j */
    public boolean mo62098j(long j, boolean z) {
        Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: id = " + j);
        C53736a c = C40933j.m44314c(j);
        if (c == null || Util.isNullOrNil(c.field_downloadUrl)) {
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, record not found", Long.valueOf(j));
            return false;
        } else if (c.field_downloaderType != 2) {
            Log.m105925i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask: %d, downloader type not matched", Long.valueOf(j));
            if (c.field_downloaderType != 4) {
                C86013q1.m106447h(c.field_filePath);
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, delete file: " + c.field_filePath);
                C40933j.m44319h(j);
            } else {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask, DOWNLOADER_TYPE_WEBNET.");
            }
            return false;
        } else {
            FileDownloadTaskInfo e = mo62095e(c.field_downloadId);
            int i = e.f12196f;
            if (i == 1) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "download runing, return");
                return true;
            } else if (i == 6) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "md5 checking ,return");
                return true;
            } else if (i == 3) {
                Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "has download finished, install");
                if (c.field_autoInstall) {
                    C39890a.m42668a(e.f12194d, false, (C47223a) null);
                }
                return true;
            } else {
                int i2 = c.field_status;
                if (i2 == 2) {
                    c.field_startState = 1;
                } else if (i2 == 4) {
                    c.field_startState = 2;
                } else {
                    c.field_startState = 0;
                }
                c.field_startSize = c.field_downloadedSize;
                c.field_errCode = 0;
                m42126h();
                if ((c.field_reserveInWifi || c.field_downloadInWifi) && !NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    Log.m105924i("MicroMsg.FileDownloaderImplTMAssistant", "resumeDownloadTask downloadInWifi, not wifi");
                    return true;
                }
                if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    c.field_downloadInWifi = true;
                }
                ((C119157j) C119157j.f356862d).mo183876g(new C39493f(c, z, j), "MicroMsg.FileDownloaderImplTMAssistant");
                return true;
            }
        }
    }

    public int removeDownloadTask(long j) {
        ((C119157j) C119157j.f356862d).mo183876g(new C39489b(j), "MicroMsg.FileDownloaderImplTMAssistant");
        return 1;
    }
}
