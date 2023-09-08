package em1;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58741j5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import o40.C61926c;
import p294b7.C16739c;
import p295b8.C16765c;
import p295b8.C16772f;
import p295b8.C16774g;
import p300c8.C16871d;
import p300c8.C16875m;
import p300c8.C79952o;
import p300c8.C79954q;
import p300c8.C79957s;
import p333e8.C20551y;
import p370p7.C21941l;
import p370p7.C21943m;
import p370p7.C21962v;
import p396x6.C22995c;
import p396x6.C22996d;
import p396x6.C22997e;
import p396x6.C23016o;
import p396x6.C23017p;
import p396x6.C23023u;
import p396x6.C23027v;
import p823sg.C48380r;
import p953d8.C86204c;
import p953d8.C86205d;
import p953d8.C86207e;
import p953d8.C86214k;
import p953d8.C86215l;
import rx3.C13598b0;
import te3.C64726td1;

/* renamed from: em1.a */
public final class C97671a implements C23017p.C23018a, C58636b {

    /* renamed from: d */
    public final Context f286478d;

    /* renamed from: e */
    public C64726td1 f286479e;

    /* renamed from: f */
    public C23023u f286480f;

    /* renamed from: em1.a$a */
    public static final class C97672a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97671a f286481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97672a(C97671a aVar) {
            super(0);
            this.f286481d = aVar;
        }

        public Object invoke() {
            Log.m105924i("FinderImgFeedMusicPlayer", "relsese musicId:" + this.f286481d.f286479e.f185534d + ",musicName:" + this.f286481d.f286479e.f185536f);
            this.f286481d.stop();
            C97671a aVar = this.f286481d;
            C23023u uVar = aVar.f286480f;
            if (uVar != null) {
                uVar.mo36265d(aVar);
            }
            C23023u uVar2 = this.f286481d.f286480f;
            if (uVar2 != null) {
                uVar2.release();
            }
            this.f286481d.f286480f = null;
            return C13598b0.f38549a;
        }
    }

    public C97671a(Context context, C64726td1 td12) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(td12, "musicInfo");
        this.f286478d = context;
        this.f286479e = td12;
        mo136919b();
    }

    /* renamed from: a */
    public long mo83512a() {
        C23023u uVar = this.f286480f;
        if (uVar != null) {
            return uVar.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo136919b() {
        if (this.f286480f == null) {
            Log.m105924i("FinderImgFeedMusicPlayer", "init musicId:" + this.f286479e.f185534d + ",musicName:" + this.f286479e.f185536f);
            Context context = this.f286478d;
            this.f286480f = new C23023u(new C22996d(context), new C16765c((C16772f.C16773a) null), new C22995c());
            Context context2 = this.f286478d;
            String i = C20551y.m22319i(context2, "Finder.Player");
            C16875m mVar = new C16875m((Handler) null, (C16871d.C16872a) null);
            C79952o oVar = new C79952o(context2, mVar, new C79954q(i, mVar));
            C58741j5 j5Var = C58741j5.f168184a;
            C64726td1 td12 = this.f286479e;
            C87412m.m108594g(td12, "musicInfo");
            C86215l lVar = new C86215l(new File(C48380r.m53726a(C58741j5.f168192i + "/exo/" + td12.f185534d, true)), new C86214k(5242880));
            C16739c cVar = new C16739c();
            String str = this.f286479e.f185539i;
            if (str == null) {
                str = "";
            }
            C21943m mVar2 = new C21943m(new C21941l(Uri.parse(str), new C86207e(lVar, oVar, new C79957s(), new C86204c(lVar, 2097152), 0, (C86205d.C86206a) null), cVar, (Handler) null, (C21941l.C21942a) null), 50);
            C23023u uVar = this.f286480f;
            if (uVar != null) {
                uVar.mo36323h(this);
            }
            C23023u uVar2 = this.f286480f;
            if (uVar2 != null) {
                uVar2.mo36325j(mVar2);
            }
        }
    }

    public boolean isPlaying() {
        StringBuilder sb = new StringBuilder();
        sb.append("[isPlaying] state:");
        C23023u uVar = this.f286480f;
        sb.append(uVar != null ? Integer.valueOf(uVar.mo36266f()) : null);
        Log.m105924i("FinderImgFeedMusicPlayer", sb.toString());
        C23023u uVar2 = this.f286480f;
        if (!(uVar2 != null ? uVar2.mo36263b() : false)) {
            return false;
        }
        C23023u uVar3 = this.f286480f;
        if (!(uVar3 != null && uVar3.mo36266f() == 3)) {
            C23023u uVar4 = this.f286480f;
            if (!(uVar4 != null && uVar4.mo36266f() == 2)) {
                C23023u uVar5 = this.f286480f;
                return uVar5 != null && uVar5.mo36266f() == 1;
            }
        }
    }

    public void onLoadingChanged(boolean z) {
        Log.m105924i("FinderImgFeedMusicPlayer", "[onLoadingChanged] isLoading:" + z);
    }

    public void onPlaybackParametersChanged(C23016o oVar) {
    }

    public void onPlayerError(C22997e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("[onPlayerError] type:");
        Throwable th = null;
        sb.append(eVar != null ? Integer.valueOf(eVar.f66080d) : null);
        sb.append(" , message:");
        sb.append(eVar != null ? eVar.getMessage() : null);
        sb.append(" ,cause:");
        if (eVar != null) {
            th = eVar.getCause();
        }
        sb.append(th);
        Log.m105924i("FinderImgFeedMusicPlayer", sb.toString());
        C115669n.INSTANCE.mo175913w(1530, 4, 1);
    }

    public void onPlayerStateChanged(boolean z, int i) {
        Log.m105924i("FinderImgFeedMusicPlayer", "[onPlayerStateChanged] playWhenReady:" + z + " ,state:" + i);
    }

    public void onPositionDiscontinuity() {
    }

    public void onRepeatModeChanged(int i) {
    }

    public void onTimelineChanged(C23027v vVar, Object obj) {
    }

    public void onTracksChanged(C21962v vVar, C16774g gVar) {
    }

    public void pause() {
        if (isPlaying()) {
            Log.m105924i("FinderImgFeedMusicPlayer", "pause musicId:" + this.f286479e.f185534d + ",musicName:" + this.f286479e.f185536f + ",musicInfo:" + this.f286479e);
            C23023u uVar = this.f286480f;
            if (uVar != null) {
                uVar.mo36262a(false);
                return;
            }
            return;
        }
        Log.m105924i("FinderImgFeedMusicPlayer", "pause musicInfo:" + this.f286479e + " failed, cause it is not playing");
    }

    public void play() {
        mo136919b();
        C23023u uVar = this.f286480f;
        if (uVar != null) {
            uVar.mo36262a(true);
        }
        Log.m105924i("FinderImgFeedMusicPlayer", "play musicId:" + this.f286479e.f185534d + ",musicName:" + this.f286479e.f185536f);
    }

    public void release() {
        C61926c.m72661F("FinderImgFeedMusicPlayer", new C97672a(this));
    }

    public void seekTo(long j) {
        C23023u uVar = this.f286480f;
        if (uVar != null) {
            uVar.mo36327l(j);
        }
    }

    public void setMute(boolean z) {
        C23023u uVar = this.f286480f;
        if (uVar != null) {
            uVar.mo36331p(z ? 0.0f : 1.0f);
        }
    }

    public void stop() {
        C23023u uVar;
        Log.m105924i("FinderImgFeedMusicPlayer", "stop musicId:" + this.f286479e.f185534d + ",musicName:" + this.f286479e.f185536f);
        if (isPlaying() && (uVar = this.f286480f) != null) {
            uVar.stop();
        }
    }
}
