package ny1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p1081gi.C98121d;
import p1081gi.C98127h;
import p682rz.C101487r;
import p682rz.C63688n;

/* renamed from: ny1.a */
public class C100233a implements C55394a {

    /* renamed from: d */
    public MMVideoView f293664d;

    /* renamed from: e */
    public String f293665e;

    /* renamed from: f */
    public boolean f293666f;

    /* renamed from: g */
    public C100235b f293667g = new C100235b((C100234a) null);

    /* renamed from: ny1.a$a */
    public class C100234a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f293668d;

        /* renamed from: e */
        public final /* synthetic */ String f293669e;

        /* renamed from: f */
        public final /* synthetic */ String f293670f;

        public C100234a(String str, String str2, String str3) {
            this.f293668d = str;
            this.f293669e = str2;
            this.f293670f = str3;
        }

        public void run() {
            C63688n W6 = ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6();
            C100233a aVar = C100233a.this;
            String str = this.f293668d;
            String str2 = this.f293669e;
            String str3 = this.f293670f;
            C100235b bVar = aVar.f293667g;
            C98127h hVar = new C98127h();
            hVar.f287660d = "task_GameOnlineVideoProxy";
            hVar.field_mediaId = str;
            hVar.f287705p0 = str2;
            hVar.f287689V = 1;
            hVar.f287655L = 3;
            hVar.f287696Y0 = 4;
            hVar.field_fullpath = str3;
            hVar.f287704f1 = bVar;
            ((C92755e0) W6).mo126981e(hVar, false);
        }
    }

    /* renamed from: ny1.a$b */
    public class C100235b implements C98127h.C98128a {

        /* renamed from: ny1.a$b$a */
        public class C100236a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f293673d;

            /* renamed from: e */
            public final /* synthetic */ long f293674e;

            /* renamed from: f */
            public final /* synthetic */ long f293675f;

            /* renamed from: g */
            public final /* synthetic */ CdnLogic.VideoInfo f293676g;

            public C100236a(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
                this.f293673d = str;
                this.f293674e = j;
                this.f293675f = j2;
                this.f293676g = videoInfo;
            }

            public void run() {
                MMVideoView mMVideoView = C100233a.this.f293664d;
                if (mMVideoView != null) {
                    mMVideoView.mo76639l(this.f293673d, this.f293674e, this.f293675f, this.f293676g.svrFlag);
                }
            }
        }

        /* renamed from: ny1.a$b$b */
        public class C100237b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f293678d;

            /* renamed from: e */
            public final /* synthetic */ long f293679e;

            /* renamed from: f */
            public final /* synthetic */ long f293680f;

            public C100237b(String str, long j, long j2) {
                this.f293678d = str;
                this.f293679e = j;
                this.f293680f = j2;
            }

            public void run() {
                MMVideoView mMVideoView = C100233a.this.f293664d;
                if (mMVideoView != null) {
                    mMVideoView.onDataAvailable(this.f293678d, this.f293679e, this.f293680f);
                }
            }
        }

        /* renamed from: ny1.a$b$c */
        public class C100238c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f293682d;

            /* renamed from: e */
            public final /* synthetic */ long f293683e;

            /* renamed from: f */
            public final /* synthetic */ long f293684f;

            public C100238c(String str, long j, long j2) {
                this.f293682d = str;
                this.f293683e = j;
                this.f293684f = j2;
            }

            public void run() {
                MMVideoView mMVideoView = C100233a.this.f293664d;
                if (mMVideoView != null) {
                    mMVideoView.mo76638e(this.f293682d, this.f293683e, this.f293684f);
                }
            }
        }

        /* renamed from: ny1.a$b$d */
        public class C100239d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f293686d;

            /* renamed from: e */
            public final /* synthetic */ int f293687e;

            public C100239d(String str, int i) {
                this.f293686d = str;
                this.f293687e = i;
            }

            public void run() {
                MMVideoView mMVideoView = C100233a.this.f293664d;
                if (mMVideoView != null) {
                    mMVideoView.mo76640m(this.f293686d, this.f293687e);
                }
            }
        }

        public C100235b(C100234a aVar) {
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            Log.m105919d("MicroMsg.Haowan.GameOnlineVideoProxy", "%s, onProgress[mediaId:%s, offset:%d, total:%d]", Integer.valueOf(C100233a.this.hashCode()), str, Long.valueOf(j), Long.valueOf(j2));
            MMHandlerThread.postToMainThread(new C100238c(str, j, j2));
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            Log.m105919d("MicroMsg.Haowan.GameOnlineVideoProxy", "%s, onFinish[mediaId:%s, ret:%d]", Integer.valueOf(C100233a.this.hashCode()), str, Integer.valueOf(i));
            MMHandlerThread.postToMainThread(new C100239d(str, i));
        }

        public void onDataAvailable(String str, long j, long j2) {
            MMHandlerThread.postToMainThread(new C100237b(str, j, j2));
        }

        public void onM3U8Ready(String str, String str2) {
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            MMHandlerThread.postToMainThread(new C100236a(str, j, j2, videoInfo));
        }
    }

    public C100233a(MMVideoView mMVideoView) {
        this.f293664d = mMVideoView;
    }

    /* renamed from: a */
    public void mo36227a(String str) {
        Log.m105925i("MicroMsg.Haowan.GameOnlineVideoProxy", "%s, stop stream[%s]", Integer.valueOf(hashCode()), str);
        if (Util.nullAsNil(this.f293665e).equals(str)) {
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126983g(str, (Object[]) null);
        }
    }

    /* renamed from: b */
    public void mo36228b(C55394a.C55395a aVar) {
    }

    /* renamed from: c */
    public boolean mo36229c(String str, int i, int i2) {
        Log.m105919d("MicroMsg.Haowan.GameOnlineVideoProxy", "%s, check video data available[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (Util.nullAsNil(this.f293665e).equals(str)) {
            return ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126989m(str, i, i2);
        }
        return false;
    }

    /* renamed from: d */
    public void mo36230d(String str, int i, int i2) {
        Log.m105919d("MicroMsg.Haowan.GameOnlineVideoProxy", "%s, request video data[%s, %s, %s]", Integer.valueOf(hashCode()), str, Integer.valueOf(i), Integer.valueOf(i2));
        if (Util.nullAsNil(this.f293665e).equals(str)) {
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126990n(str, i, i2, 0);
        }
    }

    /* renamed from: f */
    public void mo36231f(String str, String str2, String str3) {
        Log.m105925i("MicroMsg.Haowan.GameOnlineVideoProxy", "%s start http stream[%s, %s, %s]", Integer.valueOf(hashCode()), str, str3, str2);
        this.f293665e = str;
        if (this.f293666f) {
            this.f293666f = false;
            MMHandlerThread.postToMainThreadDelayed(new C100234a(str, str3, str2), 1000);
            return;
        }
        C63688n W6 = ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6();
        C100235b bVar = this.f293667g;
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_GameOnlineVideoProxy";
        hVar.field_mediaId = str;
        hVar.f287705p0 = str3;
        hVar.f287689V = 1;
        hVar.f287655L = 3;
        hVar.f287696Y0 = 4;
        hVar.field_fullpath = str2;
        hVar.f287704f1 = bVar;
        ((C92755e0) W6).mo126981e(hVar, false);
    }
}
