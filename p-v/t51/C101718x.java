package t51;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringEggVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.ITPPlayer;
import di3.C86312j;
import gy3.C87412m;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p682rz.C101487r;
import p682rz.C63688n;
import p765yp.C112477a;
import z04.C112551y;

/* renamed from: t51.x */
public final class C101718x implements C96814a.C57541b, C96814a.C96815a, C55394a, C98127h.C98128a {

    /* renamed from: d */
    public final SpringEggVideoView f297775d;

    /* renamed from: e */
    public final C110928q f297776e;

    /* renamed from: f */
    public C55394a.C55395a f297777f;

    /* renamed from: g */
    public String f297778g;

    /* renamed from: h */
    public final Handler f297779h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public long f297780i;

    /* renamed from: j */
    public long f297781j;

    /* renamed from: n */
    public int f297782n;

    /* renamed from: o */
    public long f297783o;

    /* renamed from: t51.x$a */
    public static final class C101719a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101718x f297784d;

        /* renamed from: e */
        public final /* synthetic */ String f297785e;

        /* renamed from: f */
        public final /* synthetic */ long f297786f;

        /* renamed from: g */
        public final /* synthetic */ long f297787g;

        public C101719a(C101718x xVar, String str, long j, long j2) {
            this.f297784d = xVar;
            this.f297785e = str;
            this.f297786f = j;
            this.f297787g = j2;
        }

        public final void run() {
            C55394a.C55395a aVar = this.f297784d.f297777f;
            C87412m.m108591d(aVar);
            aVar.onDataAvailable(this.f297785e, this.f297786f, this.f297787g);
        }
    }

    /* renamed from: t51.x$b */
    public static final class C101720b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101718x f297788d;

        /* renamed from: e */
        public final /* synthetic */ String f297789e;

        /* renamed from: f */
        public final /* synthetic */ int f297790f;

        public C101720b(C101718x xVar, String str, int i) {
            this.f297788d = xVar;
            this.f297789e = str;
            this.f297790f = i;
        }

        public final void run() {
            C55394a.C55395a aVar = this.f297788d.f297777f;
            C87412m.m108591d(aVar);
            aVar.mo76640m(this.f297789e, this.f297790f);
        }
    }

    /* renamed from: t51.x$c */
    public static final class C101721c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101718x f297791d;

        /* renamed from: e */
        public final /* synthetic */ String f297792e;

        /* renamed from: f */
        public final /* synthetic */ long f297793f;

        /* renamed from: g */
        public final /* synthetic */ long f297794g;

        /* renamed from: h */
        public final /* synthetic */ CdnLogic.VideoInfo f297795h;

        public C101721c(C101718x xVar, String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            this.f297791d = xVar;
            this.f297792e = str;
            this.f297793f = j;
            this.f297794g = j2;
            this.f297795h = videoInfo;
        }

        public final void run() {
            C55394a.C55395a aVar = this.f297791d.f297777f;
            C87412m.m108591d(aVar);
            String str = this.f297792e;
            long j = this.f297793f;
            long j2 = this.f297794g;
            CdnLogic.VideoInfo videoInfo = this.f297795h;
            String str2 = videoInfo != null ? videoInfo.svrFlag : null;
            if (str2 == null) {
                str2 = "";
            }
            aVar.mo76639l(str, j, j2, str2);
        }
    }

    /* renamed from: t51.x$d */
    public static final class C101722d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101718x f297796d;

        /* renamed from: e */
        public final /* synthetic */ String f297797e;

        /* renamed from: f */
        public final /* synthetic */ long f297798f;

        /* renamed from: g */
        public final /* synthetic */ long f297799g;

        public C101722d(C101718x xVar, String str, long j, long j2) {
            this.f297796d = xVar;
            this.f297797e = str;
            this.f297798f = j;
            this.f297799g = j2;
        }

        public final void run() {
            C55394a.C55395a aVar = this.f297796d.f297777f;
            C87412m.m108591d(aVar);
            aVar.mo76638e(this.f297797e, this.f297798f, this.f297799g);
        }
    }

    public C101718x(SpringEggVideoView springEggVideoView, C110928q qVar, String str) {
        C87412m.m108594g(springEggVideoView, "videoView");
        C87412m.m108594g(qVar, "viewBinding");
        C87412m.m108594g(str, "url");
        this.f297775d = springEggVideoView;
        this.f297776e = qVar;
        springEggVideoView.setLoop(true);
        springEggVideoView.setIMMVideoViewCallback(this);
        springEggVideoView.setIMMDownloadFinish(this);
        springEggVideoView.setIOnlineVideoProxy(this);
        springEggVideoView.mo76636h(false, str, 0);
        springEggVideoView.setFilepath(C112477a.f336782f + "MMVideo_" + str.hashCode() + ".mp4.temp");
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        Log.m105925i("MicroMsg.VideoController", "onVideoWaitingEnd!!! mediaId[%s].", str2);
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        Log.m105925i("MicroMsg.VideoController", "onVideoFirstFrameDraw!!! mediaId[%s].", str2);
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        bool.booleanValue();
        Log.m105925i("MicroMsg.VideoController", "onVideoWaiting!!! mediaId[%s].", str2);
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        Log.m105925i("MicroMsg.VideoController", "onVideoEnded!!! mediaId[%s].", str2);
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
        Log.m105925i("MicroMsg.VideoController", "onError!!! mediaId[%s] errorMsg[%s].", str2, str3);
        this.f297776e.f331761q.setVisibility(0);
        this.f297775d.setVisibility(8);
        this.f297776e.f331766v.setVisibility(8);
        this.f297781j += Util.milliSecondsToNow(this.f297780i);
        this.f297780i = 0;
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
        Log.m105925i("MicroMsg.VideoController", "onPrepared!!! mediaId[%s].", str2);
        this.f297780i = Util.nowMilliSecond();
        this.f297783o = ((long) this.f297775d.getVideoDurationSec()) * 1000;
        this.f297776e.f331761q.setVisibility(8);
    }

    /* renamed from: a */
    public void mo36227a(String str) {
        C87412m.m108594g(str, "mediaId");
        Log.m105928w("MicroMsg.VideoController", "stop " + str);
        String str2 = this.f297778g;
        if (str2 != null && C87412m.m108589b(str2, str)) {
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126983g(str, (Object[]) null);
        }
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        Log.m105925i("MicroMsg.VideoController", "onVideoPause!!! mediaId[%s].", str2);
    }

    /* renamed from: b */
    public void mo36228b(C55394a.C55395a aVar) {
        this.f297777f = aVar;
    }

    /* renamed from: c */
    public boolean mo36229c(String str, int i, int i2) {
        Log.m105925i("MicroMsg.VideoController", "isVideoDataAvailable!!! mediaId[%s] offset[%s] length[%s].", str, Integer.valueOf(i), Integer.valueOf(i2));
        String str2 = this.f297778g;
        if (str2 == null || !C87412m.m108589b(str2, str)) {
            return false;
        }
        return ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126989m(str, i, i2);
    }

    /* renamed from: d */
    public void mo36230d(String str, int i, int i2) {
        String str2 = this.f297778g;
        if (str2 != null && C87412m.m108589b(str2, str)) {
            Log.m105928w("MicroMsg.VideoController", "requestVideoData offset=" + i + ", length=" + i2);
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126990n(str, i, i2, 0);
        }
    }

    /* renamed from: e */
    public void mo17917e(String str, long j, long j2) {
        String str2;
        C87412m.m108594g(str, "mediaId");
        Log.m105925i("MicroMsg.VideoController", "onProgress!!! mediaId[%s] offset[%s] length[%s].", str, Long.valueOf(j), Long.valueOf(j2));
        if (this.f297777f != null && (str2 = this.f297778g) != null && C87412m.m108589b(str2, str)) {
            this.f297779h.post(new C101722d(this, str, j, j2));
        }
    }

    /* renamed from: f */
    public void mo36231f(String str, String str2, String str3) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(str2, "path");
        C87412m.m108594g(str3, "url");
        this.f297778g = str;
        if (C86013q1.m106450k(C112477a.f336782f + "MMVideo_" + str3.hashCode() + ".mp4")) {
            mo17918g(str, 0, (C98121d) null);
            return;
        }
        C63688n W6 = ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6();
        C98127h hVar = new C98127h();
        hVar.field_mediaId = str;
        hVar.f287705p0 = str3;
        hVar.f287689V = 1;
        hVar.f287655L = 5;
        hVar.f287696Y0 = 3;
        hVar.field_fullpath = str2;
        hVar.f287704f1 = this;
        ((C92755e0) W6).mo126981e(hVar, false);
    }

    /* renamed from: g */
    public void mo17918g(String str, int i, C98121d dVar) {
        String str2;
        C87412m.m108594g(str, "mediaId");
        Log.m105925i("MicroMsg.VideoController", "onFinish!!! mediaId[%s].", str);
        if (this.f297777f != null && (str2 = this.f297778g) != null && C87412m.m108589b(str2, str)) {
            this.f297779h.post(new C101720b(this, str, i));
        }
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        Log.m105925i("MicroMsg.VideoController", "onGetVideoSize!!! mediaId[%s].", str2);
        Resources resources = this.f297776e.f331760p.getResources();
        ViewGroup.LayoutParams layoutParams = this.f297776e.f331760p.getLayoutParams();
        if (i < i2) {
            layoutParams.width = resources.getDimensionPixelSize(C0966R.dimen.f4196vt);
            layoutParams.height = resources.getDimensionPixelSize(C0966R.dimen.f4194vr);
        } else {
            layoutParams.height = resources.getDimensionPixelSize(C0966R.dimen.f4196vt);
            layoutParams.width = resources.getDimensionPixelSize(C0966R.dimen.f4194vr);
        }
        this.f297776e.f331760p.requestLayout();
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        Log.m105925i("MicroMsg.VideoController", "onVideoPlay!!! mediaId[%s], duration[%s].", str2, Integer.valueOf(this.f297775d.getVideoDurationSec()));
        this.f297782n++;
    }

    /* renamed from: o */
    public void mo129208o(String str, boolean z) {
        if (str != null) {
            String n = C112551y.m153814n(str, ".temp", "", false);
            if (!C86013q1.m106450k(n) && C112551y.m153808h(str, ".temp", false, 2, (Object) null)) {
                C86013q1.m106442c(str, n);
            }
        }
    }

    public void onDataAvailable(String str, long j, long j2) {
        String str2;
        C87412m.m108594g(str, "mediaId");
        Log.m105925i("MicroMsg.VideoController", "onDataAvailable!!! mediaId[%s] offset[%s] length[%s].", str, Long.valueOf(j), Long.valueOf(j2));
        if (this.f297777f != null && (str2 = this.f297778g) != null && C87412m.m108589b(str2, str)) {
            this.f297779h.post(new C101719a(this, str, j, j2));
        }
    }

    public void onM3U8Ready(String str, String str2) {
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        String str2;
        Log.m105925i("MicroMsg.VideoController", "onMoovReady!!! mediaId[%s] offset[%s] length[%s].", str, Long.valueOf(j), Long.valueOf(j2));
        if (this.f297777f != null && (str2 = this.f297778g) != null && C87412m.m108589b(str2, str)) {
            this.f297779h.post(new C101721c(this, str, j, j2, videoInfo));
        }
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
    }
}
