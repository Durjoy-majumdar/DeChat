package ps2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.downloader.api.C29841c;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import js0.C9512b;
import lo2.C99552l;
import p237sp.C13754y;
import rq2.C63505q;
import vr2.C102240d;
import z41.C53736a;
import z41.C53737b;

/* renamed from: ps2.b */
public class C100853b {

    /* renamed from: a */
    public C100855b f295368a = new C100855b((C100854a) null);

    /* renamed from: b */
    public volatile boolean f295369b;

    /* renamed from: c */
    public IntentFilter f295370c;

    /* renamed from: d */
    public volatile C100856c f295371d;

    /* renamed from: e */
    public ConcurrentHashMap<String, C100858e> f295372e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public ConcurrentHashMap<String, C100859f> f295373f = new ConcurrentHashMap<>();

    /* renamed from: g */
    public C40952u f295374g = new C100854a();

    /* renamed from: h */
    public MMHandler f295375h;

    /* renamed from: ps2.b$a */
    public class C100854a implements C40952u {
        public C100854a() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
            SnsMethodCalculate.markStartTimeMs("onTaskProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            Log.m105918d("MicroMsg.AdDownloadApkMgr", "progress changed, reset MSG_CHECK_INSTALL, id=" + j);
            if (C100853b.m132139b(C100853b.this) != null) {
                FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(j);
                if (n.f12200j >= 0 && n.f12201n > 0) {
                    C100856c b = C100853b.m132139b(C100853b.this);
                    int i = (int) ((n.f12200j * 100) / n.f12201n);
                    AdLandingPagesProxy.C94822e eVar = (AdLandingPagesProxy.C94822e) b;
                    eVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                    Log.m105927v("AdLandingPagesProxy", "progress %d", Integer.valueOf(i));
                    AdLandingPagesProxy.this.CLIENT_CALL("progress", Long.valueOf(j), Integer.valueOf(i));
                    SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                    C100853b.m132141d(C100853b.this).removeMessages(10008);
                    C100853b.m132141d(C100853b.this).sendEmptyMessageDelayed(10008, 300000);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onTaskProgressChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            SnsMethodCalculate.markStartTimeMs("onTaskRemoved", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            Log.m105924i("MicroMsg.AdDownloadApkMgr", "onTaskRemoved, id=" + j);
            if (C100853b.m132139b(C100853b.this) != null) {
                AdLandingPagesProxy.C94822e eVar = (AdLandingPagesProxy.C94822e) C100853b.m132139b(C100853b.this);
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                AdLandingPagesProxy.this.CLIENT_CALL("stopped", Long.valueOf(j));
                SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
            }
            C100853b.m132140c(C100853b.this, 2, j);
            SnsMethodCalculate.markEndTimeMs("onTaskRemoved", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }

        /* renamed from: O */
        public void mo1798O(long j) {
            SnsMethodCalculate.markStartTimeMs("onTaskMd5Checking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            Log.m105924i("MicroMsg.AdDownloadApkMgr", "onTaskMd5Checking, remove MSG_CHECK_INSTALL, id=" + j);
            C100853b.m132141d(C100853b.this).removeMessages(10008);
            C100853b.m132141d(C100853b.this).sendEmptyMessageDelayed(10008, 300000);
            SnsMethodCalculate.markEndTimeMs("onTaskMd5Checking", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
            SnsMethodCalculate.markStartTimeMs("onTaskResumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            Log.m105924i("MicroMsg.AdDownloadApkMgr", "onTaskResumed, reset MSG_CHECK_INSTALL, id=" + j);
            if (C100853b.m132139b(C100853b.this) != null) {
                AdLandingPagesProxy.C94822e eVar = (AdLandingPagesProxy.C94822e) C100853b.m132139b(C100853b.this);
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                AdLandingPagesProxy.this.CLIENT_CALL("resumed", Long.valueOf(j));
                SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
            }
            C100853b.this.mo140326j(4001005, j, (C100857d) null);
            C100853b.m132140c(C100853b.this, 7, j);
            C100853b.m132141d(C100853b.this).removeMessages(10008);
            C100853b.m132141d(C100853b.this).sendEmptyMessageDelayed(10008, 300000);
            SnsMethodCalculate.markEndTimeMs("onTaskResumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }

        /* renamed from: S */
        public void mo1800S(long j) {
            SnsMethodCalculate.markStartTimeMs("onTaskPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            Log.m105924i("MicroMsg.AdDownloadApkMgr", "onTaskPaused, remove MSG_CHECK_INSTALL, id=" + j);
            if (C100853b.m132139b(C100853b.this) != null) {
                AdLandingPagesProxy.C94822e eVar = (AdLandingPagesProxy.C94822e) C100853b.m132139b(C100853b.this);
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                AdLandingPagesProxy.this.CLIENT_CALL("paused", Long.valueOf(j));
                SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
            }
            C100853b.this.mo140326j(4001004, j, (C100857d) null);
            C100853b.m132140c(C100853b.this, 6, j);
            C100853b.m132141d(C100853b.this).removeMessages(10008);
            C100853b.m132141d(C100853b.this).sendEmptyMessageDelayed(10008, 300000);
            SnsMethodCalculate.markEndTimeMs("onTaskPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onTaskFailed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            Log.m105924i("MicroMsg.AdDownloadApkMgr", "onTaskFailed, id=" + j + ", errCode=" + i);
            if (C100853b.m132139b(C100853b.this) != null) {
                AdLandingPagesProxy.C94822e eVar = (AdLandingPagesProxy.C94822e) C100853b.m132139b(C100853b.this);
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs(StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                AdLandingPagesProxy.this.CLIENT_CALL(StateEvent.ProcessResult.FAILED, Long.valueOf(j));
                SnsMethodCalculate.markEndTimeMs(StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
            }
            C100853b.this.mo140326j(4001006, j, (C100857d) null);
            C100853b.m132140c(C100853b.this, 8, j);
            C115669n.INSTANCE.mo175911u(1958, 31);
            SnsMethodCalculate.markEndTimeMs("onTaskFailed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            SnsMethodCalculate.markStartTimeMs("onTaskStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            if (C100853b.m132139b(C100853b.this) != null) {
                AdLandingPagesProxy.C94822e eVar = (AdLandingPagesProxy.C94822e) C100853b.m132139b(C100853b.this);
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                AdLandingPagesProxy.this.CLIENT_CALL(IXWebBroadcastListener.STAGE_START, Long.valueOf(j));
                SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
            }
            C100853b.this.mo140326j(4001001, j, (C100857d) null);
            C100853b.m132140c(C100853b.this, 1, j);
            Log.m105924i("MicroMsg.AdDownloadApkMgr", "onTaskStarted, id=" + j);
            SnsMethodCalculate.markEndTimeMs("onTaskStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onTaskFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
            Log.m105924i("MicroMsg.AdDownloadApkMgr", "onTaskFinished, reset MSG_CHECK_INSTALL, id=" + j);
            if (C100853b.m132139b(C100853b.this) != null) {
                AdLandingPagesProxy.C94822e eVar = (AdLandingPagesProxy.C94822e) C100853b.m132139b(C100853b.this);
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs(StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                AdLandingPagesProxy.this.CLIENT_CALL(StateEvent.ProcessResult.SUCCEED, Long.valueOf(j));
                SnsMethodCalculate.markEndTimeMs(StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$3");
                C100853b.m132141d(C100853b.this).removeMessages(10008);
                C100853b.m132141d(C100853b.this).sendEmptyMessageDelayed(10008, 300000);
            }
            C100853b.this.mo140326j(4001009, j, (C100857d) null);
            C100853b.this.mo140326j(4001010, j, new C100857d(2));
            C100853b.m132140c(C100853b.this, 3, j);
            C115669n.INSTANCE.mo175911u(1958, 30);
            SnsMethodCalculate.markEndTimeMs("onTaskFinished", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$1");
        }
    }

    /* renamed from: ps2.b$b */
    public class C100855b extends BroadcastReceiver {
        public C100855b(C100854a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ApkInstallReceiver");
            if (intent != null) {
                String action = intent.getAction();
                Log.m105924i("MicroMsg.AdDownloadApkMgr", "onReceive, action=" + action);
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                    Log.m105924i("MicroMsg.AdDownloadApkMgr", "onReceive, pkg=" + schemeSpecificPart);
                    if (Util.isNullOrNil(schemeSpecificPart) || !C100853b.m132138a(C100853b.this).containsKey(schemeSpecificPart)) {
                        Log.m105920e("MicroMsg.AdDownloadApkMgr", "onReceive, installCallback==null, pkg=" + schemeSpecificPart);
                    } else {
                        ((C100858e) C100853b.m132138a(C100853b.this).remove(schemeSpecificPart)).mo130937b(schemeSpecificPart);
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    String schemeSpecificPart2 = intent.getData().getSchemeSpecificPart();
                    Log.m105924i("MicroMsg.AdDownloadApkMgr", "onReceive, pkg=" + schemeSpecificPart2);
                    if (Util.isNullOrNil(schemeSpecificPart2) || !C100853b.m132138a(C100853b.this).containsKey(schemeSpecificPart2)) {
                        Log.m105920e("MicroMsg.AdDownloadApkMgr", "onReceive, installCallback==null, pkg=" + schemeSpecificPart2);
                    } else {
                        ((C100858e) C100853b.m132138a(C100853b.this).remove(schemeSpecificPart2)).mo130936a(schemeSpecificPart2);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ApkInstallReceiver");
        }
    }

    /* renamed from: ps2.b$c */
    public interface C100856c {
    }

    /* renamed from: ps2.b$d */
    public static class C100857d {

        /* renamed from: a */
        public int f295378a;

        public C100857d(int i) {
            this.f295378a = i;
        }
    }

    /* renamed from: ps2.b$e */
    public interface C100858e {
        /* renamed from: a */
        void mo130936a(String str);

        /* renamed from: b */
        void mo130937b(String str);
    }

    /* renamed from: ps2.b$f */
    public static class C100859f implements Serializable {

        /* renamed from: d */
        public String f295379d;

        /* renamed from: e */
        public String f295380e;

        /* renamed from: f */
        public String f295381f;

        /* renamed from: g */
        public String f295382g;

        /* renamed from: h */
        public int f295383h;

        /* renamed from: i */
        public String f295384i;

        /* renamed from: j */
        public String f295385j;

        /* renamed from: n */
        public int f295386n;

        /* renamed from: o */
        public long f295387o;

        public C100859f(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2) {
            this.f295379d = str;
            this.f295380e = str2;
            this.f295381f = str3;
            this.f295382g = str4;
            this.f295383h = i;
            this.f295384i = str5;
            this.f295385j = str6;
            this.f295386n = i2;
        }
    }

    /* renamed from: ps2.b$g */
    public static final class C100860g {

        /* renamed from: a */
        public static final C100853b f295388a = new C100853b((C100854a) null);
    }

    public C100853b(C100854a aVar) {
        IntentFilter intentFilter = new IntentFilter();
        this.f295370c = intentFilter;
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        this.f295370c.addAction("android.intent.action.PACKAGE_REMOVED");
        this.f295370c.addDataScheme("package");
        this.f295375h = new C100861c(this, Looper.getMainLooper());
    }

    /* renamed from: a */
    public static /* synthetic */ ConcurrentHashMap m132138a(C100853b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ConcurrentHashMap<String, C100858e> concurrentHashMap = bVar.f295372e;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return concurrentHashMap;
    }

    /* renamed from: b */
    public static /* synthetic */ C100856c m132139b(C100853b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        C100856c cVar = bVar.f295371d;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return cVar;
    }

    /* renamed from: c */
    public static /* synthetic */ void m132140c(C100853b bVar, int i, long j) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        bVar.mo140327k(i, j);
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    /* renamed from: d */
    public static /* synthetic */ MMHandler m132141d(C100853b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        MMHandler mMHandler = bVar.f295375h;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return mMHandler;
    }

    /* renamed from: e */
    public static C100853b m132142e() {
        SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        C100853b bVar = C100860g.f295388a;
        SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return bVar;
    }

    /* renamed from: f */
    public boolean mo140322f(String str) {
        SnsMethodCalculate.markStartTimeMs("isApkExist", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(str);
        boolean z = o != null && o.f12196f == 3 && !TextUtils.isEmpty(o.f12197g) && C86013q1.m106450k(o.f12197g);
        SnsMethodCalculate.markEndTimeMs("isApkExist", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return z;
    }

    /* renamed from: g */
    public boolean mo140323g(Context context, String str) {
        SnsMethodCalculate.markStartTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        boolean z = false;
        if (context == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return false;
        }
        if (C9512b.m9207a(context, str) != null) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return z;
    }

    /* renamed from: h */
    public long mo140324h(String str) {
        SnsMethodCalculate.markStartTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        FileDownloadTaskInfo o = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63967o(str);
        long j = o != null ? o.f12194d : MAlarmHandler.NEXT_FIRE_INTERVAL;
        SnsMethodCalculate.markEndTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        return j;
    }

    /* renamed from: i */
    public final void mo140325i(String str, C100858e eVar) {
        SnsMethodCalculate.markStartTimeMs("registerInstallCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (eVar != null) {
            this.f295372e.put(str, eVar);
            Log.m105928w("MicroMsg.AdDownloadApkMgr", "register package receiver");
            try {
                MMApplicationContext.getContext().registerReceiver(this.f295368a, this.f295370c);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AdDownloadApkMgr", "register package receiver, exp=" + e.toString());
            }
            this.f295369b = true;
            this.f295375h.removeMessages(10008);
            this.f295375h.sendEmptyMessageDelayed(10008, 300000);
        }
        SnsMethodCalculate.markEndTimeMs("registerInstallCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    /* renamed from: j */
    public void mo140326j(int i, long j, C100857d dVar) {
        String str;
        String str2;
        int i2;
        C100857d dVar2 = dVar;
        String str3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr";
        SnsMethodCalculate.markStartTimeMs("reportConversionDownloadInfo", str3);
        C53736a Yt = ((C53737b) ((C29841c) C86312j.m106911c(C29841c.class)).mo56945gI()).mo74326Yt(j);
        if (Yt == null || Util.isNullOrNil(Yt.field_rawAppId)) {
            Log.m105920e("MicroMsg.AdDownloadApkMgr", "fileDownloadInfo or field_rawAppId is null");
            SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", str3);
            return;
        }
        C100859f fVar = this.f295373f.get(Yt.field_rawAppId);
        if (fVar == null) {
            Log.m105920e("MicroMsg.AdDownloadApkMgr", "reportInfo is null, appid = " + Yt.field_rawAppId);
            SnsMethodCalculate.markEndTimeMs("reportConversionDownloadInfo", str3);
            return;
        }
        SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        String str4 = fVar.f295381f;
        SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        String str5 = fVar.f295382g;
        int i3 = fVar.f295383h;
        String str6 = fVar.f295384i;
        SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        String str7 = fVar.f295379d;
        SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        SnsMethodCalculate.markStartTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        String str8 = fVar.f295380e;
        SnsMethodCalculate.markEndTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
        String str9 = fVar.f295385j;
        int i4 = fVar.f295386n;
        String str10 = "reportConversionDownloadInfo";
        switch (i) {
            case 4001001:
                str2 = str3;
                ArrayList<Integer> arrayList = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar = new C102240d.C102242b();
                    bVar.mo141803k(4001001);
                    bVar.mo141805m(str4);
                    bVar.mo141797e(str5);
                    bVar.mo141802j(i3);
                    bVar.mo141795c(str6);
                    bVar.mo141806n(str7);
                    bVar.mo141804l(str8);
                    bVar.mo141807o(str9);
                    bVar.mo141801i(4);
                    bVar.mo141796d(i4);
                    C63505q.m74843b(bVar.mo141793a());
                } catch (Throwable th) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportStartDownload, exp is " + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001004:
                str2 = str3;
                ArrayList<Integer> arrayList2 = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportPauseDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar2 = new C102240d.C102242b();
                    bVar2.mo141803k(4001004);
                    bVar2.mo141805m(str4);
                    bVar2.mo141797e(str5);
                    bVar2.mo141802j(i3);
                    bVar2.mo141795c(str6);
                    bVar2.mo141806n(str7);
                    bVar2.mo141804l(str8);
                    bVar2.mo141807o(str9);
                    bVar2.mo141801i(4);
                    bVar2.mo141796d(i4);
                    bVar2.mo141794b(0);
                    SnsMethodCalculate.markStartTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    bVar2.f301098l = 0;
                    SnsMethodCalculate.markEndTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    C63505q.m74843b(bVar2.mo141793a());
                } catch (Throwable th4) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportPauseDownload, exp is " + th4.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportPauseDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001005:
                str2 = str3;
                ArrayList<Integer> arrayList3 = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportResumeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar3 = new C102240d.C102242b();
                    bVar3.mo141803k(4001005);
                    bVar3.mo141805m(str4);
                    bVar3.mo141797e(str5);
                    bVar3.mo141802j(i3);
                    bVar3.mo141795c(str6);
                    bVar3.mo141806n(str7);
                    bVar3.mo141804l(str8);
                    bVar3.mo141807o(str9);
                    bVar3.mo141801i(4);
                    bVar3.mo141796d(i4);
                    bVar3.mo141794b(0);
                    SnsMethodCalculate.markStartTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    bVar3.f301098l = 0;
                    SnsMethodCalculate.markEndTimeMs("setActCode", "com.tencent.mm.plugin.sns.data.AdConversionOnlineReportData$Builder");
                    C63505q.m74843b(bVar3.mo141793a());
                } catch (Throwable th5) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportResumeDownload, exp is " + th5.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportResumeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001006:
                str2 = str3;
                ArrayList<Integer> arrayList4 = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportDownloadFailed", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar4 = new C102240d.C102242b();
                    bVar4.mo141803k(4001006);
                    bVar4.mo141805m(str4);
                    bVar4.mo141797e(str5);
                    bVar4.mo141802j(i3);
                    bVar4.mo141795c(str6);
                    bVar4.mo141806n(str7);
                    bVar4.mo141804l(str8);
                    bVar4.mo141807o(str9);
                    bVar4.mo141801i(4);
                    bVar4.mo141796d(i4);
                    C63505q.m74843b(bVar4.mo141793a());
                } catch (Throwable th6) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportDownloadFailed, exp is " + th6.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportDownloadFailed", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001009:
                str2 = str3;
                ArrayList<Integer> arrayList5 = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportDownloadComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar5 = new C102240d.C102242b();
                    bVar5.mo141803k(4001009);
                    bVar5.mo141805m(str4);
                    bVar5.mo141797e(str5);
                    bVar5.mo141802j(i3);
                    bVar5.mo141795c(str6);
                    bVar5.mo141806n(str7);
                    bVar5.mo141804l(str8);
                    bVar5.mo141807o(str9);
                    bVar5.mo141801i(4);
                    bVar5.mo141796d(i4);
                    C63505q.m74843b(bVar5.mo141793a());
                } catch (Throwable th7) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportDownloadComplete, exp is " + th7.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportDownloadComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            case 4001010:
                if (dVar2 != null) {
                    i2 = dVar2.f295378a;
                    SnsMethodCalculate.markStartTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    SnsMethodCalculate.markEndTimeMs("setActor", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    str2 = str3;
                } else {
                    str2 = str3;
                    i2 = 0;
                }
                fVar.f295387o = System.currentTimeMillis();
                ArrayList<Integer> arrayList6 = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportInstallStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar6 = new C102240d.C102242b();
                    bVar6.mo141803k(4001010);
                    bVar6.mo141805m(str4);
                    bVar6.mo141797e(str5);
                    bVar6.mo141802j(i3);
                    bVar6.mo141795c(str6);
                    bVar6.mo141806n(str7);
                    bVar6.mo141804l(str8);
                    bVar6.mo141807o(str9);
                    bVar6.mo141801i(4);
                    bVar6.mo141796d(i4);
                    bVar6.mo141794b(i2);
                    C63505q.m74843b(bVar6.mo141793a());
                } catch (Throwable th8) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportInstallStart, exp is " + th8.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportInstallStart", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                break;
            default:
                str = str10;
                break;
        }
        str = str10;
        str3 = str2;
        SnsMethodCalculate.markEndTimeMs(str, str3);
    }

    /* renamed from: k */
    public final void mo140327k(int i, long j) {
        SnsMethodCalculate.markStartTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        C53736a Yt = ((C53737b) ((C29841c) C86312j.m106911c(C29841c.class)).mo56945gI()).mo74326Yt(j);
        if (Yt == null) {
            SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        mo140328l(i, Yt.field_rawAppId);
        SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    /* renamed from: l */
    public void mo140328l(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        C53736a qq = ((C53737b) ((C29841c) C86312j.m106911c(C29841c.class)).mo56945gI()).mo74328qq(str);
        if (qq == null) {
            Log.m105920e("MicroMsg.AdDownloadApkMgr", "reportDownloadInfo, downloadinfo not found, appId=" + str + ", op=" + i);
            SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
            return;
        }
        mo140329m(i, str, qq.field_packageName, qq.field_md5, qq.field_downloadUrl);
        SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }

    /* renamed from: m */
    public void mo140329m(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6 = str;
        SnsMethodCalculate.markStartTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        System.currentTimeMillis();
        C100859f fVar = this.f295373f.get(str6);
        if (fVar == null) {
            Log.m105920e("MicroMsg.AdDownloadApkMgr", "reportInfo is null, appid=" + str6);
        }
        String replaceAll = !TextUtils.isEmpty(str2) ? str2.replaceAll("\\.", "_") : str2;
        String str7 = "";
        if (fVar == null) {
            str5 = str7;
        } else {
            StringBuilder sb = new StringBuilder();
            SnsMethodCalculate.markStartTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            String str8 = fVar.f295379d;
            SnsMethodCalculate.markEndTimeMs("getAid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            sb.append(str8);
            sb.append(".");
            SnsMethodCalculate.markStartTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            String str9 = fVar.f295380e;
            SnsMethodCalculate.markEndTimeMs("getTraceid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            sb.append(str9);
            sb.append(".");
            sb.append(replaceAll);
            sb.append(".0.20.0");
            str5 = sb.toString();
        }
        Object[] objArr = new Object[6];
        objArr[0] = str6;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = str4;
        objArr[3] = str5;
        objArr[4] = Long.valueOf(System.currentTimeMillis() / 1000);
        if (fVar != null) {
            SnsMethodCalculate.markStartTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            String str10 = fVar.f295381f;
            SnsMethodCalculate.markEndTimeMs("getUxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr$ReportInfo");
            str7 = str10;
        }
        objArr[5] = str7;
        SnsMethodCalculate.markStartTimeMs("getReportString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        StringBuilder sb4 = new StringBuilder();
        for (int i2 = 0; i2 < 6; i2++) {
            sb4.append(String.valueOf(objArr[i2]));
            if (i2 != 5) {
                sb4.append(',');
            }
        }
        String sb5 = sb4.toString();
        SnsMethodCalculate.markEndTimeMs("getReportString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        Log.m105925i("MicroMsg.AdDownloadApkMgr", "reporting %d  %s", 14542, sb5);
        Log.m105918d("MicroMsg.AdDownloadApkMgr", "14542  extinfo : " + str5);
        C115669n.INSTANCE.mo160126c(14542, sb5, true, false);
        SnsMethodCalculate.markEndTimeMs("reportDownloadInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
    }
}
