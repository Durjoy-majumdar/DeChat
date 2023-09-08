package dp2;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fm0.C8136w;
import p1081gi.C98121d;
import p1081gi.C98127h;

/* renamed from: dp2.a */
public class C97508a implements C55394a {

    /* renamed from: d */
    public String f286177d = "";

    /* renamed from: e */
    public C55394a.C55395a f286178e;

    /* renamed from: dp2.a$b */
    public class C97510b implements C98127h.C98128a {

        /* renamed from: dp2.a$b$a */
        public class C97511a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f286180d;

            /* renamed from: e */
            public final /* synthetic */ long f286181e;

            /* renamed from: f */
            public final /* synthetic */ long f286182f;

            /* renamed from: g */
            public final /* synthetic */ CdnLogic.VideoInfo f286183g;

            public C97511a(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
                this.f286180d = str;
                this.f286181e = j;
                this.f286182f = j2;
                this.f286183g = videoInfo;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$1");
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 27);
                C97508a.m125628e(C97508a.this).mo76639l(this.f286180d, this.f286181e, this.f286182f, this.f286183g.svrFlag);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$1");
            }
        }

        /* renamed from: dp2.a$b$b */
        public class C97512b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f286185d;

            /* renamed from: e */
            public final /* synthetic */ long f286186e;

            /* renamed from: f */
            public final /* synthetic */ long f286187f;

            public C97512b(String str, long j, long j2) {
                this.f286185d = str;
                this.f286186e = j;
                this.f286187f = j2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$2");
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 29);
                C97508a.m125628e(C97508a.this).onDataAvailable(this.f286185d, this.f286186e, this.f286187f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$2");
            }
        }

        /* renamed from: dp2.a$b$c */
        public class C97513c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f286189d;

            /* renamed from: e */
            public final /* synthetic */ long f286190e;

            /* renamed from: f */
            public final /* synthetic */ long f286191f;

            public C97513c(String str, long j, long j2) {
                this.f286189d = str;
                this.f286190e = j;
                this.f286191f = j2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$3");
                C97508a.m125628e(C97508a.this).mo76638e(this.f286189d, this.f286190e, this.f286191f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$3");
            }
        }

        /* renamed from: dp2.a$b$d */
        public class C97514d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f286193d;

            /* renamed from: e */
            public final /* synthetic */ int f286194e;

            public C97514d(String str, int i) {
                this.f286193d = str;
                this.f286194e = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$4");
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 31);
                C97508a.m125628e(C97508a.this).mo76640m(this.f286193d, this.f286194e);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback$4");
            }
        }

        public C97510b(C97509a aVar) {
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
            if (C97508a.m125628e(C97508a.this) != null && C97508a.m125629g(C97508a.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C97513c(str, j, j2));
            }
            SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
            if (C97508a.m125628e(C97508a.this) != null && C97508a.m125629g(C97508a.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C97514d(str, i));
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        }

        public void onDataAvailable(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
            if (C97508a.m125628e(C97508a.this) != null && C97508a.m125629g(C97508a.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C97512b(str, j, j2));
            }
            SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        }

        public void onM3U8Ready(String str, String str2) {
            SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
            SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
            if (C97508a.m125628e(C97508a.this) != null) {
                String str2 = str;
                if (C97508a.m125629g(C97508a.this).equals(str)) {
                    MMHandlerThread.postToMainThread(new C97511a(str, j, j2, videoInfo));
                }
            }
            SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy$AdLandingVideoCdnCallback");
        }
    }

    /* renamed from: e */
    public static /* synthetic */ C55394a.C55395a m125628e(C97508a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        C55394a.C55395a aVar2 = aVar.f286178e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        return aVar2;
    }

    /* renamed from: g */
    public static /* synthetic */ String m125629g(C97508a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        String str = aVar.f286177d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        return str;
    }

    /* renamed from: a */
    public void mo36227a(String str) {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        Log.m105925i("MicroMsg.AdLandingGeneralVideoProxy", "%s, stop stream[%s]", Integer.valueOf(hashCode()), str);
        if (this.f286177d.equals(str)) {
            AdLandingPagesProxy.getInstance().stopDownloadLandingPageVideo(str);
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }

    /* renamed from: b */
    public void mo36228b(C55394a.C55395a aVar) {
        SnsMethodCalculate.markStartTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        this.f286178e = aVar;
        SnsMethodCalculate.markEndTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }

    /* renamed from: c */
    public boolean mo36229c(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        Log.m105925i("MicroMsg.AdLandingGeneralVideoProxy", "%s, check video data available[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f286177d.equals(str)) {
            boolean isVideoDataAvailable = AdLandingPagesProxy.getInstance().isVideoDataAvailable(str, i, i2);
            SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
            return isVideoDataAvailable;
        }
        SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        return false;
    }

    /* renamed from: d */
    public void mo36230d(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        Log.m105919d("MicroMsg.AdLandingGeneralVideoProxy", "%s, request video data[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f286177d.equals(str)) {
            AdLandingPagesProxy.getInstance().requestVideoData(str, i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }

    /* renamed from: f */
    public void mo36231f(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
        this.f286177d = str;
        Log.m105925i("MicroMsg.AdLandingGeneralVideoProxy", "%s start http stream[%s, %s, %s]", Integer.valueOf(hashCode()), str, str3, str2);
        AdLandingPagesProxy.getInstance().downloadLandingPageVideo(str, str3, str2, 1, false, -1, new C97510b((C97509a) null));
        SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.ad.landingpage.proxy.AdLandingGeneralVideoProxy");
    }
}
