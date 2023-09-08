package bv2;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsOnlineVideoReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.model.C94869f2;
import com.tencent.p014mm.plugin.sns.model.C94952t2;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoViewHelper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.IXWebBroadcastListener;
import f03.C97785g;
import f40.C86709a0;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98429r0;
import l03.C99277b;
import lc3.C10485b;
import p749xh.C66261f3;
import te3.C101804kv2;
import zt3.C119157j;

/* renamed from: bv2.e */
public final class C92315e implements C97785g {

    /* renamed from: a */
    public final C101804kv2 f264155a;

    /* renamed from: b */
    public final int f264156b;

    /* renamed from: c */
    public final String f264157c;

    /* renamed from: d */
    public final C99277b f264158d;

    /* renamed from: e */
    public final C92316a f264159e;

    /* renamed from: f */
    public int f264160f;

    /* renamed from: g */
    public boolean f264161g;

    /* renamed from: h */
    public final String f264162h;

    /* renamed from: i */
    public final String f264163i;

    /* renamed from: j */
    public int f264164j;

    /* renamed from: k */
    public int f264165k;

    /* renamed from: l */
    public final int f264166l;

    /* renamed from: bv2.e$a */
    public interface C92316a {
        /* renamed from: a */
        OnlineVideoViewHelper.VideoRptStruct mo126317a();

        /* renamed from: b */
        long mo126318b();
    }

    /* renamed from: bv2.e$b */
    public static final class C92317b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92315e f264167d;

        public C92317b(C92315e eVar) {
            this.f264167d = eVar;
        }

        public final void run() {
            C94554a aVar;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
            C92315e eVar = this.f264167d;
            SnsMethodCalculate.markStartTimeMs("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            C99277b bVar = eVar.f264158d;
            SnsMethodCalculate.markEndTimeMs("access$getReporter$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            C99277b.C99278a y = bVar.mo138685y();
            C92315e eVar2 = this.f264167d;
            SnsMethodCalculate.markStartTimeMs("access$getProvider$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            C92316a aVar2 = eVar2.f264159e;
            SnsMethodCalculate.markEndTimeMs("access$getProvider$p", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            OnlineVideoViewHelper.VideoRptStruct a = aVar2.mo126317a();
            SnsOnlineVideoReportStruct snsOnlineVideoReportStruct = new SnsOnlineVideoReportStruct();
            C92315e eVar3 = this.f264167d;
            snsOnlineVideoReportStruct.f266140n = (long) NetStatusUtil.getIOSNetType(MMApplicationContext.getContext());
            snsOnlineVideoReportStruct.f266126g = 0;
            snsOnlineVideoReportStruct.f266101K = 0;
            snsOnlineVideoReportStruct.f266124f = C86013q1.m106451l(a.f277339f);
            snsOnlineVideoReportStruct.f266104N = snsOnlineVideoReportStruct.mo86045b("SnsPublishid", a.f277337d, true);
            snsOnlineVideoReportStruct.f266120d = snsOnlineVideoReportStruct.mo86045b("SnsVideoUrl", a.f277338e, true);
            snsOnlineVideoReportStruct.f266130i = (long) y.f291113a;
            snsOnlineVideoReportStruct.f266132j = (long) y.f291114b;
            snsOnlineVideoReportStruct.f266134k = (long) y.f291115c;
            snsOnlineVideoReportStruct.f266136l = (long) y.f291116d;
            snsOnlineVideoReportStruct.f266138m = (long) y.f291117e;
            snsOnlineVideoReportStruct.f266099I = (long) y.f291118f;
            snsOnlineVideoReportStruct.f266100J = y.f291119g;
            snsOnlineVideoReportStruct.f266112V = a.f277336c;
            snsOnlineVideoReportStruct.f266113W = snsOnlineVideoReportStruct.mo86045b("AutoPlaySessionID", a.f277335b, true);
            snsOnlineVideoReportStruct.f266114X = (int) a.f277334a;
            snsOnlineVideoReportStruct.f266149r0 = snsOnlineVideoReportStruct.mo86045b("cdn_req_flag", a.f277340g, true);
            snsOnlineVideoReportStruct.f266151s0 = snsOnlineVideoReportStruct.mo86045b("cdn_resp_flag", a.f277341h, true);
            snsOnlineVideoReportStruct.f266153t0 = snsOnlineVideoReportStruct.mo86045b("switch_source_start_time", a.f277342i, true);
            snsOnlineVideoReportStruct.f266155u0 = snsOnlineVideoReportStruct.mo86045b("switch_source_end_time", a.f277343j, true);
            try {
                aVar = C94555d.m119567c(eVar3.mo126312h(), true);
            } catch (Throwable unused) {
                Log.m105928w("MicroMsg.SnsVideoDownloadTask", "Failed to getMediaInfo");
                aVar = null;
            }
            if (aVar != null) {
                snsOnlineVideoReportStruct.f266121d0 = (long) aVar.f273445c;
                snsOnlineVideoReportStruct.f266123e0 = (long) aVar.f273446d;
                snsOnlineVideoReportStruct.f266125f0 = (long) aVar.f273447e;
                snsOnlineVideoReportStruct.f266127g0 = y.f291120h;
                int i = y.f291121i;
                int i2 = 0;
                boolean z = (i & 1) != 0;
                boolean z2 = (i & 2) != 0;
                snsOnlineVideoReportStruct.f266129h0 = snsOnlineVideoReportStruct.f266136l;
                snsOnlineVideoReportStruct.f266131i0 = snsOnlineVideoReportStruct.f266138m;
                if (z && z2) {
                    i2 = 3;
                } else if (z) {
                    i2 = 1;
                } else if (z2) {
                    i2 = 2;
                }
                snsOnlineVideoReportStruct.f266133j0 = i2;
                int i3 = aVar.f273443a;
                if (i3 != 0) {
                    long j = 10000;
                    if (!y.f291123k) {
                        j = Math.min(10000, (((long) y.f291122j) * ((long) 10000)) / ((long) i3));
                    }
                    snsOnlineVideoReportStruct.f266135k0 = j;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.f273445c);
                sb.append('x');
                sb.append(aVar.f273446d);
                snsOnlineVideoReportStruct.f266141n0 = snsOnlineVideoReportStruct.mo86045b("widthxheight", sb.toString(), true);
            }
            snsOnlineVideoReportStruct.mo86054n();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask$rptVideoPause$1");
        }
    }

    public C92315e(C101804kv2 kv22, int i, String str, C99277b bVar, C92316a aVar) {
        Class cls = C10485b.class;
        C87412m.m108594g(kv22, "media");
        C87412m.m108594g(str, C66261f3.COL_LOCALID);
        C87412m.m108594g(bVar, "reporter");
        C87412m.m108594g(aVar, "provider");
        this.f264155a = kv22;
        this.f264156b = i;
        this.f264157c = str;
        this.f264158d = bVar;
        this.f264159e = aVar;
        this.f264162h = kv22.f298673F;
        this.f264163i = C94867e2.m120283b(i, kv22);
        this.f264166l = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsVideoFullDownloadPercent", 101);
        this.f264164j = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsVideoPreloadSec", 5);
        this.f264165k = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("SnsVideoDownloadSec", 1);
        Log.m105924i("MicroMsg.SnsVideoDownloadTask", "createTime=" + i + ", localId=" + str + ", createTime=" + i + ", preloadSec=" + this.f264164j + " downloadSec=" + this.f264165k + "], needFinish=" + mo126306d() + ',');
    }

    /* renamed from: a */
    public void mo126303a() {
        SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    /* renamed from: b */
    public boolean mo126304b() {
        SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        boolean s = C94866e1.hy0().mo131033s(this.f264155a, this.f264156b, this.f264157c);
        SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return s;
    }

    /* renamed from: c */
    public C97785g.C97786a mo126305c() {
        SnsMethodCalculate.markStartTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        C94869f2 hy02 = C94866e1.hy0();
        String str = this.f264157c;
        String mediaId = getMediaId();
        hy02.getClass();
        SnsMethodCalculate.markStartTimeMs("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        C94952t2 t2Var = hy02.f274914a;
        if (t2Var == null || TextUtils.isEmpty(t2Var.f275255b) || TextUtils.isEmpty(t2Var.f275259f) || !t2Var.f275255b.equals(mediaId) || !t2Var.f275259f.equals(str)) {
            SnsMethodCalculate.markEndTimeMs("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            t2Var = null;
        } else {
            SnsMethodCalculate.markEndTimeMs("getVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        }
        if (t2Var == null) {
            SnsMethodCalculate.markEndTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            return null;
        }
        C97785g.C97786a aVar = new C97785g.C97786a((long) t2Var.f275261h, (long) t2Var.f275262i, (long) t2Var.f275263j, (long) t2Var.f275264k);
        SnsMethodCalculate.markEndTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return aVar;
    }

    /* renamed from: d */
    public int mo126306d() {
        SnsMethodCalculate.markStartTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        int i = this.f264166l;
        SnsMethodCalculate.markEndTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return i;
    }

    /* renamed from: e */
    public String mo126307e() {
        SnsMethodCalculate.markStartTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        String str = this.f264162h;
        SnsMethodCalculate.markEndTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return str;
    }

    /* renamed from: f */
    public void mo126308f() {
        SnsMethodCalculate.markStartTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        Log.m105928w("MicroMsg.SnsVideoDownloadTask", "finishRemaining: savedPath=" + mo126312h() + ", mediaId=" + getMediaId());
        C94866e1.hy0().mo131028n(this.f264155a, this.f264156b, this.f264157c, false, false, 36, getMediaId());
        SnsMethodCalculate.markEndTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    /* renamed from: g */
    public Long mo126309g() {
        SnsMethodCalculate.markStartTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        SnsMethodCalculate.markEndTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return null;
    }

    public long getLength() {
        SnsMethodCalculate.markStartTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        String str = this.f264157c;
        C101804kv2 kv22 = this.f264155a;
        C98408n0 j = C98429r0.m127819j(str, kv22.f298689d, kv22.f298687U);
        if (j == null) {
            Log.m105928w("MicroMsg.SnsVideoDownloadTask", "Couldn't find video info for " + this.f264157c);
            SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            return 0;
        }
        long j2 = (long) j.f288566m;
        SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return j2;
    }

    public String getMediaId() {
        SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        String str = this.f264163i;
        SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return str;
    }

    /* renamed from: h */
    public String mo126312h() {
        SnsMethodCalculate.markStartTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        String n = C94867e2.m120295n(this.f264155a);
        SnsMethodCalculate.markEndTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return n;
    }

    /* renamed from: i */
    public final void mo126316i() {
        SnsMethodCalculate.markStartTimeMs("rptVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        ((C119157j) C119157j.f356862d).mo183876g(new C92317b(this), "rptVideoPause");
        SnsMethodCalculate.markEndTimeMs("rptVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
    }

    public boolean isFinished() {
        SnsMethodCalculate.markStartTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        String f = C94867e2.m120287f(this.f264157c, this.f264155a);
        boolean z = !(f == null || f.length() == 0);
        SnsMethodCalculate.markEndTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return z;
    }

    public boolean start() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        Log.m105924i("MicroMsg.SnsVideoDownloadTask", "start: savedPath=" + mo126312h() + ", mediaId=" + getMediaId());
        String h = mo126312h();
        if (!(h == null || h.length() == 0)) {
            String mediaId = getMediaId();
            if (!(mediaId == null || mediaId.length() == 0)) {
                C94866e1.hy0().mo131028n(this.f264155a, this.f264156b, this.f264157c, this.f264161g, true, this.f264160f, getMediaId());
                SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        return false;
    }

    public void stop() {
        String str;
        String str2;
        C94554a aVar;
        String str3;
        long j;
        int i;
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
        Log.m105928w("MicroMsg.SnsVideoDownloadTask", "stop: savedPath=" + mo126312h() + ", mediaId=" + getMediaId());
        String mediaId = getMediaId();
        if (!(mediaId == null || mediaId.length() == 0)) {
            C94869f2 hy02 = C94866e1.hy0();
            String mediaId2 = getMediaId();
            SnsMethodCalculate.markStartTimeMs("buildReportData", "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask");
            C99277b.C99278a y = this.f264158d.mo138685y();
            OnlineVideoViewHelper.VideoRptStruct a = this.f264159e.mo126317a();
            try {
                aVar = C94555d.m119567c(mo126312h(), true);
            } catch (Throwable unused) {
                Log.m105928w("MicroMsg.SnsVideoDownloadTask", "Failed to getMediaInfo");
                aVar = null;
            }
            int i2 = y.f291121i;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (aVar == null || (i = aVar.f273443a) == 0) {
                str3 = mediaId2;
                j = 0;
            } else if (y.f291123k) {
                str3 = mediaId2;
                j = 10000;
            } else {
                str3 = mediaId2;
                j = Math.min(10000, (((long) y.f291122j) * ((long) 10000)) / ((long) i));
            }
            Object[] objArr = new Object[20];
            objArr[0] = Integer.valueOf(y.f291113a);
            objArr[1] = Integer.valueOf(y.f291114b);
            int i3 = 2;
            objArr[2] = Integer.valueOf(y.f291115c);
            objArr[3] = Integer.valueOf(y.f291116d);
            objArr[4] = Integer.valueOf(y.f291117e);
            objArr[5] = Integer.valueOf(y.f291118f);
            objArr[6] = Integer.valueOf(y.f291119g);
            objArr[7] = Integer.valueOf(a.f277336c);
            String str4 = a.f277335b;
            C87412m.m108593f(str4, "uiReport.sessionId");
            objArr[8] = str4;
            str2 = "stop";
            str = "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask";
            objArr[9] = Long.valueOf(a.f277334a);
            String str5 = a.f277337d;
            C87412m.m108593f(str5, "uiReport.snsId");
            objArr[10] = str5;
            String str6 = a.f277338e;
            C87412m.m108593f(str6, "uiReport.snsUrl");
            objArr[11] = str6;
            String str7 = a.f277339f;
            C87412m.m108593f(str7, "uiReport.filePath");
            objArr[12] = str7;
            objArr[13] = Long.valueOf(this.f264159e.mo126318b());
            objArr[14] = Integer.valueOf(aVar != null ? aVar.f273445c : 0);
            objArr[15] = Integer.valueOf(aVar != null ? aVar.f273446d : 0);
            objArr[16] = Integer.valueOf(aVar != null ? aVar.f273447e : 0);
            objArr[17] = Long.valueOf(y.f291120h);
            if (z && z2) {
                i3 = 3;
            } else if (z) {
                i3 = 1;
            } else if (!z2) {
                i3 = 0;
            }
            objArr[18] = Integer.valueOf(i3);
            objArr[19] = Long.valueOf(j);
            SnsMethodCalculate.markEndTimeMs("buildReportData", str);
            hy02.mo131037w(str3, objArr);
            SnsMethodCalculate.markStartTimeMs("rptStopDownload", str);
            C115669n.INSTANCE.idkeyStat(354, 203, 1, false);
            SnsMethodCalculate.markEndTimeMs("rptStopDownload", str);
        } else {
            str2 = "stop";
            str = "com.tencent.mm.plugin.sns.ui.video.SnsVideoDownloadTask";
            mo126316i();
        }
        SnsMethodCalculate.markEndTimeMs(str2, str);
    }
}
