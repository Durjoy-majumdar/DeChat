package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

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

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a */
public class C95260a implements C55394a {

    /* renamed from: d */
    public String f276461d = "";

    /* renamed from: e */
    public C55394a.C55395a f276462e;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a$b */
    public class C95262b implements C98127h.C98128a {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a$b$a */
        public class C95263a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f276464d;

            /* renamed from: e */
            public final /* synthetic */ long f276465e;

            /* renamed from: f */
            public final /* synthetic */ long f276466f;

            /* renamed from: g */
            public final /* synthetic */ CdnLogic.VideoInfo f276467g;

            public C95263a(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
                this.f276464d = str;
                this.f276465e = j;
                this.f276466f = j2;
                this.f276467g = videoInfo;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$1");
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 27);
                C95260a.m121294e(C95260a.this).mo76639l(this.f276464d, this.f276465e, this.f276466f, this.f276467g.svrFlag);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a$b$b */
        public class C95264b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f276469d;

            /* renamed from: e */
            public final /* synthetic */ long f276470e;

            /* renamed from: f */
            public final /* synthetic */ long f276471f;

            public C95264b(String str, long j, long j2) {
                this.f276469d = str;
                this.f276470e = j;
                this.f276471f = j2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$2");
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 29);
                C95260a.m121294e(C95260a.this).onDataAvailable(this.f276469d, this.f276470e, this.f276471f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$2");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a$b$c */
        public class C95265c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f276473d;

            /* renamed from: e */
            public final /* synthetic */ long f276474e;

            /* renamed from: f */
            public final /* synthetic */ long f276475f;

            public C95265c(String str, long j, long j2) {
                this.f276473d = str;
                this.f276474e = j;
                this.f276475f = j2;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$3");
                C95260a.m121294e(C95260a.this).mo76638e(this.f276473d, this.f276474e, this.f276475f);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$3");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a$b$d */
        public class C95266d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f276477d;

            /* renamed from: e */
            public final /* synthetic */ int f276478e;

            public C95266d(String str, int i) {
                this.f276477d = str;
                this.f276478e = i;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$4");
                C115669n.INSTANCE.mo175911u(C8136w.CTRL_INDEX, 31);
                C95260a.m121294e(C95260a.this).mo76640m(this.f276477d, this.f276478e);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback$4");
            }
        }

        public C95262b(C95261a aVar) {
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
            if (C95260a.m121294e(C95260a.this) != null && C95260a.m121295g(C95260a.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C95265c(str, j, j2));
            }
            SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
            if (C95260a.m121294e(C95260a.this) != null && C95260a.m121295g(C95260a.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C95266d(str, i));
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
        }

        public void onDataAvailable(String str, long j, long j2) {
            SnsMethodCalculate.markStartTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
            if (C95260a.m121294e(C95260a.this) != null && C95260a.m121295g(C95260a.this).equals(str)) {
                MMHandlerThread.postToMainThread(new C95264b(str, j, j2));
            }
            SnsMethodCalculate.markEndTimeMs("onDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
        }

        public void onM3U8Ready(String str, String str2) {
            SnsMethodCalculate.markStartTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
            SnsMethodCalculate.markEndTimeMs("onM3U8Ready", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
            if (C95260a.m121294e(C95260a.this) != null) {
                String str2 = str;
                if (C95260a.m121295g(C95260a.this).equals(str)) {
                    MMHandlerThread.postToMainThread(new C95263a(str, j, j2, videoInfo));
                }
            }
            SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy$AdLandingVideoCdnCallback");
        }
    }

    /* renamed from: e */
    public static /* synthetic */ C55394a.C55395a m121294e(C95260a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        C55394a.C55395a aVar2 = aVar.f276462e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        return aVar2;
    }

    /* renamed from: g */
    public static /* synthetic */ String m121295g(C95260a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        String str = aVar.f276461d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        return str;
    }

    /* renamed from: a */
    public void mo36227a(String str) {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        Log.m105925i("MicroMsg.AdLandingOnlineVideoProxy", "%s, stop stream[%s]", Integer.valueOf(hashCode()), str);
        if (this.f276461d.equals(str)) {
            AdLandingPagesProxy.getInstance().stopDownloadLandingPageVideo(str);
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }

    /* renamed from: b */
    public void mo36228b(C55394a.C55395a aVar) {
        SnsMethodCalculate.markStartTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        this.f276462e = aVar;
        SnsMethodCalculate.markEndTimeMs("setIEngineCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }

    /* renamed from: c */
    public boolean mo36229c(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        Log.m105925i("MicroMsg.AdLandingOnlineVideoProxy", "%s, check video data available[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f276461d.equals(str)) {
            boolean isVideoDataAvailable = AdLandingPagesProxy.getInstance().isVideoDataAvailable(str, i, i2);
            SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
            return isVideoDataAvailable;
        }
        SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        return false;
    }

    /* renamed from: d */
    public void mo36230d(String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        Log.m105919d("MicroMsg.AdLandingOnlineVideoProxy", "%s, request video data[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (this.f276461d.equals(str)) {
            AdLandingPagesProxy.getInstance().requestVideoData(str, i, i2);
        }
        SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }

    /* renamed from: f */
    public void mo36231f(String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
        this.f276461d = str;
        Log.m105925i("MicroMsg.AdLandingOnlineVideoProxy", "%s start http stream[%s, %s, %s]", Integer.valueOf(hashCode()), str, str3, str2);
        AdLandingPagesProxy.getInstance().downloadLandingPageVideo(str, str3, str2, 0, false, -1, new C95262b((C95261a) null));
        SnsMethodCalculate.markEndTimeMs("startHttpStream", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingOnlineVideoProxy");
    }
}
