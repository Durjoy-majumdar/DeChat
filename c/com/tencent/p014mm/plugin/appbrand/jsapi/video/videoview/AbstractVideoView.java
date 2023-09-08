package com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.C18015a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import pn0.C21999c;
import pn0.C22000d;
import pn0.C22001e;
import pn0.C22002f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView */
public abstract class AbstractVideoView extends RelativeLayout implements C17978c, C18015a.C18016a, C18015a.C18020e, C18015a.C18018c, C18015a.C18017b, C18015a.C18019d {

    /* renamed from: A */
    public C17978c.C17982d f49692A;

    /* renamed from: B */
    public View.OnClickListener f49693B;

    /* renamed from: C */
    public boolean f49694C;

    /* renamed from: D */
    public Runnable f49695D;

    /* renamed from: d */
    public Context f49696d;

    /* renamed from: e */
    public boolean f49697e;

    /* renamed from: f */
    public ImageView f49698f;

    /* renamed from: g */
    public RelativeLayout f49699g;

    /* renamed from: h */
    public ProgressBar f49700h;

    /* renamed from: i */
    public LinearLayout f49701i;

    /* renamed from: j */
    public VideoPlayerSeekBar f49702j;

    /* renamed from: n */
    public C17978c.C17980b f49703n;

    /* renamed from: o */
    public C18015a f49704o;

    /* renamed from: p */
    public boolean f49705p;

    /* renamed from: q */
    public C17978c.C17981c f49706q;

    /* renamed from: r */
    public MMHandler f49707r;

    /* renamed from: s */
    public int f49708s;

    /* renamed from: t */
    public boolean f49709t;

    /* renamed from: u */
    public int f49710u;

    /* renamed from: v */
    public int f49711v;

    /* renamed from: w */
    public boolean f49712w;

    /* renamed from: x */
    public MTimerHandler f49713x;

    /* renamed from: y */
    public MTimerHandler f49714y;

    /* renamed from: z */
    public MTimerHandler f49715z;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView$a */
    public class C18008a implements Runnable {
        public C18008a() {
        }

        public void run() {
            try {
                AbstractVideoView.this.mo22459p(0);
                AbstractVideoView abstractVideoView = AbstractVideoView.this;
                abstractVideoView.mo22460q(abstractVideoView.isPlaying());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView$b */
    public class C18009b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f49717d;

        public C18009b(int i) {
            this.f49717d = i;
        }

        public void run() {
            AbstractVideoView.this.getClass();
            AbstractVideoView.this.mo22459p(this.f49717d);
            AbstractVideoView.this.mo22294a((double) this.f49717d, true);
            AbstractVideoView.this.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView$c */
    public class C18010c implements MTimerHandler.CallBack {
        public C18010c() {
        }

        public boolean onTimerExpired() {
            if (!AbstractVideoView.this.isPlaying()) {
                return false;
            }
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            if (abstractVideoView.f49705p) {
                C17978c.C17981c cVar = abstractVideoView.f49706q;
                if (cVar != null) {
                    cVar.mo22312m0(abstractVideoView.getSessionId(), AbstractVideoView.this.getMediaId());
                }
                AbstractVideoView.this.f49705p = false;
            }
            AbstractVideoView abstractVideoView2 = AbstractVideoView.this;
            abstractVideoView2.mo22459p(abstractVideoView2.getCurrPosSec());
            AbstractVideoView abstractVideoView3 = AbstractVideoView.this;
            abstractVideoView3.mo22460q(abstractVideoView3.isPlaying());
            AbstractVideoView.this.getClass();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView$d */
    public class C18011d implements MTimerHandler.CallBack {
        public C18011d() {
        }

        public boolean onTimerExpired() {
            boolean isPlaying = AbstractVideoView.this.isPlaying();
            int currPosMs = AbstractVideoView.this.getCurrPosMs();
            Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s prepare start checker isplaying[%b] currPosMs[%d]", AbstractVideoView.this.mo22453k(), Boolean.valueOf(isPlaying), Integer.valueOf(currPosMs));
            C18015a aVar = AbstractVideoView.this.f49704o;
            if (aVar != null && currPosMs <= 50) {
                aVar.mo22415d(0.0d);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView$e */
    public class C18012e implements MTimerHandler.CallBack {
        public C18012e() {
        }

        public boolean onTimerExpired() {
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            if (abstractVideoView.f49711v <= 0) {
                return false;
            }
            if (!abstractVideoView.isPlaying()) {
                return true;
            }
            AbstractVideoView abstractVideoView2 = AbstractVideoView.this;
            Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s reset error count ", abstractVideoView2.mo22453k());
            abstractVideoView2.f49711v = 0;
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView$f */
    public class C18013f implements Runnable {
        public C18013f() {
        }

        public void run() {
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            abstractVideoView.f49694C = true;
            ProgressBar progressBar = abstractVideoView.f49700h;
            if (!(progressBar == null || progressBar.getVisibility() == 0)) {
                Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s show loading", AbstractVideoView.this.mo22453k());
                AbstractVideoView.this.f49700h.setVisibility(0);
            }
            AbstractVideoView abstractVideoView2 = AbstractVideoView.this;
            C17978c.C17981c cVar = abstractVideoView2.f49706q;
            if (cVar != null) {
                cVar.mo22313n0(abstractVideoView2.getSessionId(), AbstractVideoView.this.getMediaId());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView$g */
    public class C18014g implements Runnable {
        public C18014g() {
        }

        public void run() {
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            if (abstractVideoView.f49694C) {
                abstractVideoView.f49694C = false;
                C17978c.C17981c cVar = abstractVideoView.f49706q;
                if (cVar != null) {
                    cVar.mo22290F(abstractVideoView.getSessionId(), AbstractVideoView.this.getMediaId());
                }
                ProgressBar progressBar = AbstractVideoView.this.f49700h;
                if (progressBar != null && progressBar.getVisibility() != 8) {
                    Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s hide loading", AbstractVideoView.this.mo22453k());
                    AbstractVideoView.this.f49700h.setVisibility(8);
                }
            }
        }
    }

    public AbstractVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean mo22294a(double d, boolean z) {
        C18015a aVar = this.f49704o;
        boolean z2 = aVar != null && !Util.isNullOrNil(aVar.getVideoPath()) && this.f49712w;
        int videoDurationSec = getVideoDurationSec();
        int i = (int) d;
        if (videoDurationSec > 0 && d > ((double) videoDurationSec)) {
            i = videoDurationSec;
        }
        C18015a aVar2 = this.f49704o;
        Log.printInfoStack("MicroMsg.Video.AbstractVideoView", "%s seek to [%d %s] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", mo22453k(), Integer.valueOf(i), Double.valueOf(d), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(videoDurationSec), Boolean.valueOf(aVar2 != null && !Util.isNullOrNil(aVar2.getVideoPath())));
        if (!z2) {
            this.f49710u = i;
            this.f49709t = z;
        } else if (this.f49704o != null) {
            mo22455m();
            mo22459p(i);
            this.f49704o.mo22412a((double) (i * 1000), z);
            return z;
        }
        return false;
    }

    /* renamed from: b */
    public void mo22296b() {
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s onUIPause %s", mo22453k(), Util.getStack());
        getCurrPosSec();
        this.f49705p = isPlaying();
        pause();
        mo22457o();
        this.f49697e = false;
    }

    /* renamed from: c */
    public void mo22297c() {
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s onUIDestroy", mo22453k());
        stop();
        this.f49707r.removeCallbacksAndMessages((Object) null);
        mo22457o();
        this.f49715z.stopTimer();
    }

    /* renamed from: d */
    public boolean mo22298d(double d) {
        return mo22294a(d, isPlaying());
    }

    /* renamed from: e */
    public C18015a mo22448e(Context context) {
        return null;
    }

    /* renamed from: f */
    public void mo22299f() {
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s onUIResume %s", mo22453k(), Util.getStack());
        this.f49697e = true;
    }

    /* renamed from: g */
    public void mo22449g() {
        this.f49707r.removeCallbacks(this.f49695D);
        this.f49707r.post(new C18014g());
    }

    public int getCacheTimeSec() {
        return 0;
    }

    public int getCurrPosMs() {
        C18015a aVar = this.f49704o;
        if (aVar != null) {
            return aVar.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrPosSec() {
        C18015a aVar = this.f49704o;
        if (aVar != null) {
            return Math.round((((float) aVar.getCurrentPosition()) * 1.0f) / 1000.0f);
        }
        return 0;
    }

    public String getMediaId() {
        return "";
    }

    public int getPlayerType() {
        return this.f49708s;
    }

    public String getSessionId() {
        return "";
    }

    public int getVideoDurationSec() {
        C18015a aVar = this.f49704o;
        if (aVar != null) {
            return Math.round((((float) aVar.getDuration()) * 1.0f) / 1000.0f);
        }
        return -1;
    }

    public int getVideoSource() {
        return 0;
    }

    public abstract /* synthetic */ View getView();

    public boolean isPlaying() {
        C18015a aVar = this.f49704o;
        if (aVar != null) {
            return aVar.isPlaying();
        }
        return false;
    }

    /* renamed from: k */
    public String mo22453k() {
        return "" + hashCode();
    }

    /* renamed from: l */
    public void mo22454l(int i, int i2) {
        Log.m105929w("MicroMsg.Video.AbstractVideoView", "%s onError info [%d %d] errorCount[%d]", mo22453k(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f49711v));
        int i3 = this.f49711v + 1;
        this.f49711v = i3;
        if (i3 > 0) {
            C17978c.C17981c cVar = this.f49706q;
            if (cVar != null) {
                cVar.mo22292T(getSessionId(), getMediaId(), (i == -1010 || i == -1007) ? "MEDIA_ERR_SRC_NOT_SUPPORTED" : (i != -1004 ? NetStatusUtil.isConnected(this.f49696d) : NetStatusUtil.isConnected(this.f49696d)) ? "MEDIA_ERR_DECODE" : "MEDIA_ERR_NETWORK", i, i2);
            }
            stop();
            mo22449g();
            return;
        }
        int currPosSec = getCurrPosSec();
        int i4 = this.f49710u;
        if (i4 == -1) {
            i4 = currPosSec;
        }
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", mo22453k(), Integer.valueOf(i4), Integer.valueOf(this.f49710u), Integer.valueOf(currPosSec));
        stop();
        mo22455m();
        this.f49707r.postDelayed(new C18009b(i4), 200);
    }

    /* renamed from: m */
    public void mo22455m() {
        this.f49707r.removeCallbacks(this.f49695D);
        this.f49707r.postDelayed(this.f49695D, 500);
    }

    /* renamed from: n */
    public void mo22456n(boolean z) {
        Log.m105919d("MicroMsg.Video.AbstractVideoView", "%s start timer rightNow[%b]", mo22453k(), Boolean.valueOf(z));
        this.f49713x.startTimer(500);
    }

    /* renamed from: o */
    public void mo22457o() {
        this.f49713x.stopTimer();
        this.f49714y.stopTimer();
    }

    public void onCompletion() {
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s onCompletion, curMs %d, duration %d", mo22453k(), Integer.valueOf(getCurrPosSec()), Integer.valueOf(getVideoDurationSec()));
        mo22459p(getVideoDurationSec());
        mo22449g();
        mo22457o();
        C17978c.C17981c cVar = this.f49706q;
        if (cVar != null) {
            cVar.mo22291L(getSessionId(), getMediaId());
        }
    }

    /* renamed from: p */
    public void mo22459p(int i) {
        C17978c.C17980b bVar = this.f49703n;
        if (bVar != null) {
            bVar.mo22372a(i);
        }
    }

    public boolean pause() {
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s pause", mo22453k());
        if (this.f49704o == null) {
            return false;
        }
        mo22460q(false);
        this.f49704o.pause();
        mo22457o();
        C17978c.C17981c cVar = this.f49706q;
        if (cVar != null) {
            cVar.mo22295a0(getSessionId(), getMediaId());
        }
        return true;
    }

    public boolean play() {
        if (!this.f49697e) {
            Log.m105929w("MicroMsg.Video.AbstractVideoView", "%s ui on pause now, why u call me to play? [%s]", mo22453k(), Util.getStack());
            return false;
        }
        C18015a aVar = this.f49704o;
        if (aVar == null) {
            return false;
        }
        boolean start = aVar.start();
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s video play [%b] isPlayOnUiPause[%b]", mo22453k(), Boolean.valueOf(start), Boolean.valueOf(this.f49705p));
        mo22460q(start);
        if (start) {
            this.f49705p = false;
            mo22456n(false);
            C17978c.C17981c cVar = this.f49706q;
            if (cVar != null) {
                cVar.mo22312m0(getSessionId(), getMediaId());
            }
        }
        return start;
    }

    /* renamed from: q */
    public final void mo22460q(boolean z) {
        C17978c.C17980b bVar = this.f49703n;
        if (bVar != null) {
            bVar.mo22373c(z);
        }
    }

    public void setCover(Bitmap bitmap) {
        ImageView imageView;
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s set cover", mo22453k());
        if (bitmap != null && !bitmap.isRecycled() && (imageView = this.f49698f) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void setFullDirection(int i) {
    }

    public void setIMMVideoViewCallback(C17978c.C17981c cVar) {
        this.f49706q = cVar;
    }

    public void setIsShowBasicControls(boolean z) {
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s is show seek bar[%b]", mo22453k(), Boolean.valueOf(z));
        if (z) {
            this.f49707r.post(new C22001e(this));
        } else {
            this.f49707r.post(new C22002f(this));
        }
    }

    public void setMute(boolean z) {
        C18015a aVar = this.f49704o;
        if (aVar != null) {
            aVar.setMute(z);
        }
    }

    public abstract /* synthetic */ void setScaleType(C17978c.C17986h hVar);

    public void setVideoFooterView(C17978c.C17980b bVar) {
        if (!(bVar instanceof View)) {
            Log.m105929w("MicroMsg.Video.AbstractVideoView", "%s set video footer view but is not view", mo22453k());
            return;
        }
        C17978c.C17980b bVar2 = this.f49703n;
        if (bVar2 != null) {
            this.f49701i.removeView((View) bVar2);
        }
        this.f49703n = bVar;
        this.f49701i.addView((View) bVar);
    }

    public abstract /* synthetic */ void setVideoSource(int i);

    public void setVideoTotalTime(int i) {
        C17978c.C17980b bVar = this.f49703n;
        if (bVar != null && bVar.getVideoTotalTime() != i) {
            this.f49703n.setVideoTotalTime(i);
        }
    }

    public void stop() {
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s stop", mo22453k());
        C18015a aVar = this.f49704o;
        if (aVar != null) {
            aVar.stop();
        }
        this.f49710u = -1;
        this.f49709t = true;
        this.f49712w = false;
        mo22457o();
        this.f49707r.postDelayed(new C18008a(), 10);
    }

    public AbstractVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49697e = true;
        this.f49705p = false;
        this.f49707r = new MMHandler(Looper.getMainLooper());
        this.f49708s = 0;
        this.f49709t = true;
        this.f49710u = -1;
        this.f49711v = 0;
        this.f49712w = false;
        this.f49713x = new MTimerHandler(new C18010c(), true);
        this.f49714y = new MTimerHandler(new C18011d(), false);
        this.f49715z = new MTimerHandler(new C18012e(), true);
        this.f49692A = new C21999c(this);
        this.f49693B = new C22000d(this);
        this.f49694C = false;
        this.f49695D = new C18013f();
        this.f49696d = context;
        Log.m105925i("MicroMsg.Video.AbstractVideoView", "%s init abstract video view", mo22453k());
        LayoutInflater.from(this.f49696d).inflate(C0966R.C0971layout.f6377d7, this);
        this.f49698f = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f49699g = (RelativeLayout) findViewById(C0966R.C0970id.l7c);
        TextView textView = (TextView) findViewById(C0966R.C0970id.l5j);
        this.f49700h = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.l7q);
        this.f49701i = (LinearLayout) findViewById(C0966R.C0970id.l5w);
        VideoPlayerSeekBar videoPlayerSeekBar = (VideoPlayerSeekBar) findViewById(C0966R.C0970id.l6x);
        this.f49702j = videoPlayerSeekBar;
        this.f49703n = videoPlayerSeekBar;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setIplaySeekCallback(this.f49692A);
            this.f49702j.setOnClickListener(this.f49693B);
        }
        C18015a e = mo22448e(this.f49696d);
        this.f49704o = e;
        e.setVideoCallback(this);
        this.f49704o.setOnSeekCompleteCallback(this);
        this.f49704o.setOnInfoCallback(this);
        this.f49704o.setOnSurfaceCallback(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f49699g.addView((View) this.f49704o, 0, layoutParams);
    }
}
