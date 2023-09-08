package bv2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.model.C94869f2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import f03.C97785g;
import f40.C86709a0;
import gy3.C87412m;
import hd0.C98408n0;
import hd0.C98429r0;
import lc3.C10485b;
import p749xh.C66261f3;
import te3.C101804kv2;

/* renamed from: bv2.d */
public final class C92314d implements C97785g {

    /* renamed from: a */
    public final C101804kv2 f264151a;

    /* renamed from: b */
    public final int f264152b;

    /* renamed from: c */
    public final String f264153c;

    /* renamed from: d */
    public final int f264154d = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SnsVideoFullDownloadPercent", 101);

    public C92314d(C101804kv2 kv22, int i, String str) {
        C87412m.m108594g(kv22, "media");
        C87412m.m108594g(str, C66261f3.COL_LOCALID);
        this.f264151a = kv22;
        this.f264152b = i;
        this.f264153c = str;
        Log.m105924i("MicroMsg.SnsVideoCommonDownloadTask", "createTime=" + i + ", localId=" + str + ", createTime=" + i + ", needFinish=" + mo126306d());
    }

    /* renamed from: a */
    public void mo126303a() {
        SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    /* renamed from: b */
    public boolean mo126304b() {
        SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        boolean s = C94866e1.hy0().mo131033s(this.f264151a, this.f264152b, this.f264153c);
        SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return s;
    }

    /* renamed from: c */
    public C97785g.C97786a mo126305c() {
        SnsMethodCalculate.markStartTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        SnsMethodCalculate.markEndTimeMs("stat", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return null;
    }

    /* renamed from: d */
    public int mo126306d() {
        SnsMethodCalculate.markStartTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        int i = this.f264154d;
        SnsMethodCalculate.markEndTimeMs("getMinRemainPercent", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return i;
    }

    /* renamed from: e */
    public String mo126307e() {
        SnsMethodCalculate.markStartTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        String str = this.f264151a.f298673F;
        SnsMethodCalculate.markEndTimeMs("getFilename", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return str;
    }

    /* renamed from: f */
    public void mo126308f() {
        SnsMethodCalculate.markStartTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        Log.m105928w("MicroMsg.SnsVideoCommonDownloadTask", "finishRemaining: savedPath=" + mo126312h() + ", mediaId=" + getMediaId());
        C94866e1.hy0().mo131028n(this.f264151a, this.f264152b, this.f264153c, false, true, 36, getMediaId());
        SnsMethodCalculate.markEndTimeMs("finishRemaining", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }

    /* renamed from: g */
    public Long mo126309g() {
        SnsMethodCalculate.markStartTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        SnsMethodCalculate.markEndTimeMs("getLocalMsgId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return null;
    }

    public long getLength() {
        SnsMethodCalculate.markStartTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        String str = this.f264153c;
        C101804kv2 kv22 = this.f264151a;
        C98408n0 j = C98429r0.m127819j(str, kv22.f298689d, kv22.f298687U);
        if (j == null) {
            Log.m105928w("MicroMsg.SnsVideoCommonDownloadTask", "Couldn't find video info for " + this.f264153c);
            SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
            return 0;
        }
        long j2 = (long) j.f288566m;
        SnsMethodCalculate.markEndTimeMs("getLength", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return j2;
    }

    public String getMediaId() {
        SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        String b = C94867e2.m120283b(this.f264152b, this.f264151a);
        SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return b;
    }

    /* renamed from: h */
    public String mo126312h() {
        SnsMethodCalculate.markStartTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        String n = C94867e2.m120295n(this.f264151a);
        SnsMethodCalculate.markEndTimeMs("getSavedPath", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return n;
    }

    public boolean isFinished() {
        SnsMethodCalculate.markStartTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        String f = C94867e2.m120287f(this.f264153c, this.f264151a);
        boolean z = !(f == null || f.length() == 0);
        SnsMethodCalculate.markEndTimeMs("isFinished", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return z;
    }

    public boolean start() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        Log.m105924i("MicroMsg.SnsVideoCommonDownloadTask", "start: savedPath=" + mo126312h() + ", mediaId=" + getMediaId());
        String h = mo126312h();
        if (!(h == null || h.length() == 0)) {
            String mediaId = getMediaId();
            if (!(mediaId == null || mediaId.length() == 0)) {
                C94869f2 hy02 = C94866e1.hy0();
                C101804kv2 kv22 = this.f264151a;
                int i = this.f264152b;
                String str = this.f264153c;
                SnsMethodCalculate.markStartTimeMs("getDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                SnsMethodCalculate.markEndTimeMs("getDownloadScene", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                hy02.mo131028n(kv22, i, str, false, true, 40, getMediaId());
                SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        return false;
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
        Log.m105928w("MicroMsg.SnsVideoCommonDownloadTask", "stop: savedPath=" + mo126312h() + ", mediaId=" + getMediaId());
        String mediaId = getMediaId();
        if (!(mediaId == null || mediaId.length() == 0)) {
            C94866e1.hy0().mo131037w(getMediaId(), (Object[]) null);
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.video.SnsVideoCommonDownloadTask");
    }
}
