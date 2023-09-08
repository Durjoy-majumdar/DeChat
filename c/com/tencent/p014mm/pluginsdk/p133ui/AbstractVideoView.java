package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;
import vd3.C102168a;
import vd3.C102169b;
import vd3.C102170c;
import vd3.C102171c0;
import vd3.C102173o;
import xn2.C102693c;

/* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView */
public abstract class AbstractVideoView extends RelativeLayout implements C96814a, C96875r0.C96876a, C96875r0.C96879e, C96875r0.C96877c, C96875r0.C19571b, C96875r0.C96878d {

    /* renamed from: A */
    public boolean f283571A;

    /* renamed from: B */
    public boolean f283572B;

    /* renamed from: C */
    public long f283573C;

    /* renamed from: D */
    public int f283574D;

    /* renamed from: E */
    public MTimerHandler f283575E;

    /* renamed from: F */
    public MTimerHandler f283576F;

    /* renamed from: G */
    public MTimerHandler f283577G;

    /* renamed from: H */
    public C102693c f283578H;

    /* renamed from: I */
    public View.OnClickListener f283579I;

    /* renamed from: J */
    public boolean f283580J;

    /* renamed from: K */
    public Runnable f283581K;

    /* renamed from: L */
    public Runnable f283582L;

    /* renamed from: M */
    public C96814a.C96816c f283583M;

    /* renamed from: N */
    public C102171c0 f283584N;

    /* renamed from: d */
    public String f283585d;

    /* renamed from: e */
    public String f283586e;

    /* renamed from: f */
    public Context f283587f;

    /* renamed from: g */
    public boolean f283588g;

    /* renamed from: h */
    public ImageView f283589h;

    /* renamed from: i */
    public RelativeLayout f283590i;

    /* renamed from: j */
    public ProgressBar f283591j;

    /* renamed from: n */
    public LinearLayout f283592n;

    /* renamed from: o */
    public VideoPlayerSeekBar f283593o;

    /* renamed from: p */
    public C102173o f283594p;

    /* renamed from: q */
    public C96875r0 f283595q;

    /* renamed from: r */
    public int f283596r;

    /* renamed from: s */
    public boolean f283597s;

    /* renamed from: t */
    public C96814a.C57541b f283598t;

    /* renamed from: u */
    public C96814a.C57542d f283599u;

    /* renamed from: v */
    public MMHandler f283600v;

    /* renamed from: w */
    public int f283601w;

    /* renamed from: x */
    public boolean f283602x;

    /* renamed from: y */
    public int f283603y;

    /* renamed from: z */
    public int f283604z;

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$a */
    public class C96798a implements Runnable {
        public C96798a() {
        }

        public void run() {
            try {
                AbstractVideoView.this.mo79610W(0);
                AbstractVideoView abstractVideoView = AbstractVideoView.this;
                abstractVideoView.mo135078X(abstractVideoView.isPlaying());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$b */
    public class C96799b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f283606d;

        public C96799b(int i) {
            this.f283606d = i;
        }

        public void run() {
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            abstractVideoView.f283571A = true;
            abstractVideoView.mo79610W(this.f283606d);
            AbstractVideoView.this.mo79613a((double) this.f283606d, true);
            AbstractVideoView.this.f283571A = false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$c */
    public class C96800c extends MMHandler {
        public C96800c(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                ((C96805h) AbstractVideoView.this.f283581K).run();
            } else if (i == 2) {
                ((C96806i) AbstractVideoView.this.f283582L).run();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$d */
    public class C96801d implements MTimerHandler.CallBack {
        public C96801d() {
        }

        public boolean onTimerExpired() {
            if (!AbstractVideoView.this.isPlaying()) {
                return false;
            }
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            if (abstractVideoView.f283597s) {
                C96814a.C57541b bVar = abstractVideoView.f283598t;
                if (bVar != null) {
                    bVar.mo22965m0(abstractVideoView.getSessionId(), AbstractVideoView.this.getMediaId());
                }
                AbstractVideoView.this.f283597s = false;
            }
            AbstractVideoView abstractVideoView2 = AbstractVideoView.this;
            abstractVideoView2.mo79610W(abstractVideoView2.getCurrPosSec());
            AbstractVideoView abstractVideoView3 = AbstractVideoView.this;
            abstractVideoView3.mo135078X(abstractVideoView3.isPlaying());
            if (AbstractVideoView.this.mo129178N()) {
                return AbstractVideoView.this.mo135071C();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$e */
    public class C96802e implements MTimerHandler.CallBack {
        public C96802e() {
        }

        public boolean onTimerExpired() {
            boolean isPlaying = AbstractVideoView.this.isPlaying();
            int currPosMs = AbstractVideoView.this.getCurrPosMs();
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            Log.m105925i(abstractVideoView.f283586e, "%s prepare start checker isplaying[%b] currPosMs[%d]", abstractVideoView.mo76634K(), Boolean.valueOf(isPlaying), Integer.valueOf(currPosMs));
            C96875r0 r0Var = AbstractVideoView.this.f283595q;
            if (r0Var != null && currPosMs <= 50) {
                r0Var.mo24788d(0.0d);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$f */
    public class C96803f implements MTimerHandler.CallBack {
        public C96803f() {
        }

        public boolean onTimerExpired() {
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            if (abstractVideoView.f283604z <= 0) {
                return false;
            }
            if (!abstractVideoView.isPlaying()) {
                return true;
            }
            AbstractVideoView abstractVideoView2 = AbstractVideoView.this;
            Log.m105925i(abstractVideoView2.f283586e, "%s reset error count ", abstractVideoView2.mo76634K());
            abstractVideoView2.f283604z = 0;
            abstractVideoView2.mo135073G(600, (long) (abstractVideoView2.getReportIdkey() + 91), 1, false);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$g */
    public class C96804g implements C102693c {
        public C96804g() {
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            if (AbstractVideoView.this.mo79613a((double) i, true)) {
                Log.m105924i(AbstractVideoView.this.f283585d, "onSeekTo, startTimer");
                AbstractVideoView.this.mo127230T(false);
            }
            VideoPlayerSeekBar videoPlayerSeekBar = AbstractVideoView.this.f283593o;
            if (videoPlayerSeekBar != null) {
                videoPlayerSeekBar.setIsPlay(true);
            }
        }

        /* renamed from: c */
        public void mo4336c(int i) {
        }

        public void onSeekPre() {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$h */
    public class C96805h implements Runnable {
        public C96805h() {
        }

        public void run() {
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            abstractVideoView.f283580J = true;
            ProgressBar progressBar = abstractVideoView.f283591j;
            if (!(progressBar == null || progressBar.getVisibility() == 0)) {
                AbstractVideoView abstractVideoView2 = AbstractVideoView.this;
                Log.m105925i(abstractVideoView2.f283586e, "%s show loading", abstractVideoView2.mo76634K());
                AbstractVideoView.this.f283591j.setVisibility(0);
            }
            AbstractVideoView abstractVideoView3 = AbstractVideoView.this;
            C96814a.C57541b bVar = abstractVideoView3.f283598t;
            if (bVar != null) {
                bVar.mo22957I3(abstractVideoView3.getSessionId(), AbstractVideoView.this.getMediaId(), Boolean.FALSE);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView$i */
    public class C96806i implements Runnable {
        public C96806i() {
        }

        public void run() {
            AbstractVideoView abstractVideoView = AbstractVideoView.this;
            if (abstractVideoView.f283580J) {
                abstractVideoView.f283580J = false;
                C96814a.C57541b bVar = abstractVideoView.f283598t;
                if (bVar != null) {
                    bVar.mo22955F(abstractVideoView.getSessionId(), AbstractVideoView.this.getMediaId());
                }
                ProgressBar progressBar = AbstractVideoView.this.f283591j;
                if (progressBar != null && progressBar.getVisibility() != 8) {
                    AbstractVideoView abstractVideoView2 = AbstractVideoView.this;
                    Log.m105925i(abstractVideoView2.f283586e, "%s hide loading", abstractVideoView2.mo76634K());
                    AbstractVideoView.this.f283591j.setVisibility(8);
                }
            }
        }
    }

    public AbstractVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: C */
    public boolean mo135071C() {
        long lastSurfaceUpdateTime = this.f283595q.getLastSurfaceUpdateTime();
        int currentPosition = this.f283595q.getCurrentPosition();
        Log.m105919d(this.f283586e, "%s check surface is update surface[%d %d] playtime[%d %d]", mo76634K(), Long.valueOf(this.f283573C), Long.valueOf(lastSurfaceUpdateTime), Integer.valueOf(this.f283574D), Integer.valueOf(currentPosition));
        if (lastSurfaceUpdateTime <= 0 || lastSurfaceUpdateTime != this.f283573C || currentPosition == this.f283574D) {
            this.f283573C = lastSurfaceUpdateTime;
            this.f283574D = currentPosition;
            return true;
        }
        Log.m105929w(this.f283586e, "%s check surface is update error", mo76634K());
        mo79613a((double) (this.f283574D / 1000), true);
        return false;
    }

    /* renamed from: D */
    public C102693c mo134040D() {
        return new C96804g();
    }

    /* renamed from: E */
    public C96875r0 mo79608E(Context context) {
        return null;
    }

    /* renamed from: F */
    public void mo135072F() {
        this.f283600v.removeMessages(1);
        this.f283600v.sendEmptyMessage(2);
    }

    /* renamed from: G */
    public void mo135073G(long j, long j2, long j3, boolean z) {
        C96814a.C96816c cVar = this.f283583M;
        if (cVar != null) {
            cVar.idkeyStat(j, j2, j3, z);
        }
    }

    /* renamed from: H */
    public void mo79392H() {
        Log.m105925i(this.f283586e, "%s init view ", mo76634K());
        LayoutInflater.from(this.f283587f).inflate(mo79393J(), this);
        this.f283589h = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f283590i = (RelativeLayout) findViewById(C0966R.C0970id.l7c);
        TextView textView = (TextView) findViewById(C0966R.C0970id.l5j);
        this.f283591j = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.l7q);
        this.f283592n = (LinearLayout) findViewById(C0966R.C0970id.l5w);
        VideoPlayerSeekBar videoPlayerSeekBar = (VideoPlayerSeekBar) findViewById(C0966R.C0970id.l6x);
        this.f283593o = videoPlayerSeekBar;
        this.f283594p = videoPlayerSeekBar;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setIplaySeekCallback(this.f283578H);
            this.f283593o.setOnClickListener(this.f283579I);
        }
        C96875r0 E = mo79608E(this.f283587f);
        this.f283595q = E;
        E.setVideoCallback(this);
        this.f283595q.setOnSeekCompleteCallback(this);
        this.f283595q.setOnInfoCallback(this);
        this.f283595q.setOnSurfaceCallback(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f283590i.addView((View) this.f283595q, 0, layoutParams);
    }

    /* renamed from: I */
    public boolean mo135074I() {
        C96875r0 r0Var = this.f283595q;
        boolean z = r0Var != null && !Util.isNullOrNil(r0Var.getVideoPath()) && this.f283572B;
        Log.m105919d(this.f283586e, "%s is prepared [%b] isPrepared[%b]", mo76634K(), Boolean.valueOf(z), Boolean.valueOf(this.f283572B));
        return z;
    }

    /* renamed from: J */
    public int mo79393J() {
        return C0966R.C0971layout.f7031vk;
    }

    /* renamed from: K */
    public String mo76634K() {
        return "" + hashCode();
    }

    /* renamed from: L */
    public boolean mo135075L() {
        return !(this instanceof EnvelopeStoryVideoView);
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        return 0;
    }

    /* renamed from: N */
    public boolean mo129178N() {
        return false;
    }

    /* renamed from: O */
    public void mo135076O() {
        C102171c0 c0Var = this.f283584N;
        if (c0Var.f300835a == 0) {
            c0Var.f300835a = Util.nowMilliSecond();
        }
    }

    /* renamed from: P */
    public void mo135077P() {
        int i;
        int i2;
        C102171c0 c0Var = this.f283584N;
        long j = c0Var.f300840f;
        if (j > 0) {
            long j2 = c0Var.f300839e;
            if (j2 > 0) {
                int i3 = (int) ((j - j2) / 1000);
                if (NetStatusUtil.isWifi(this.f283587f)) {
                    i2 = 70;
                    i = 74;
                } else if (NetStatusUtil.is4G(this.f283587f)) {
                    i2 = 75;
                    i = 79;
                } else if (NetStatusUtil.is3G(this.f283587f)) {
                    i2 = 80;
                    i = 84;
                } else if (NetStatusUtil.is2G(this.f283587f)) {
                    i2 = 85;
                    i = 89;
                } else {
                    return;
                }
                int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(i3, new int[]{1, 2, 3, 4}, i2 + getReportIdkey(), i + getReportIdkey()));
                Log.m105919d(this.f283586e, "%s rptResumeTime [%d]", mo76634K(), Integer.valueOf(nullAsNil));
                mo135073G(600, (long) nullAsNil, 1, false);
            }
        }
    }

    /* renamed from: Q */
    public boolean mo79609Q(double d) {
        return mo79613a(d, isPlaying());
    }

    /* renamed from: R */
    public void mo129179R() {
        mo127367S(500);
    }

    /* renamed from: S */
    public void mo127367S(long j) {
        if (!this.f283600v.hasMessages(1) && !this.f283580J) {
            this.f283600v.sendEmptyMessageDelayed(1, j);
        }
    }

    /* renamed from: T */
    public void mo127230T(boolean z) {
        Log.m105919d(this.f283586e, "%s start timer rightNow[%b]", mo76634K(), Boolean.valueOf(z));
        this.f283575E.startTimer(500);
    }

    /* renamed from: U */
    public void mo127231U() {
        this.f283575E.stopTimer();
        this.f283576F.stopTimer();
    }

    /* renamed from: W */
    public void mo79610W(int i) {
        C102173o oVar = this.f283594p;
        if (oVar != null) {
            oVar.mo130492a(i);
        }
    }

    /* renamed from: X */
    public final void mo135078X(boolean z) {
        C102173o oVar = this.f283594p;
        if (oVar != null) {
            oVar.mo130494c(z);
        }
    }

    /* renamed from: a */
    public boolean mo79613a(double d, boolean z) {
        double d2 = d;
        boolean z2 = z;
        boolean I = mo135074I();
        int videoDurationSec = getVideoDurationSec();
        int i = (videoDurationSec <= 0 || d2 <= ((double) videoDurationSec)) ? (int) d2 : videoDurationSec;
        C96875r0 r0Var = this.f283595q;
        boolean z3 = r0Var != null && !Util.isNullOrNil(r0Var.getVideoPath());
        Log.printInfoStack(this.f283586e, "%s seek to [%d %s] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", mo76634K(), Integer.valueOf(i), Double.valueOf(d), Boolean.valueOf(z), Boolean.valueOf(I), Integer.valueOf(videoDurationSec), Boolean.valueOf(z3));
        mo135073G(600, (long) (getReportIdkey() + 5), 1, false);
        if (!I) {
            this.f283603y = i;
            if (z3) {
                this.f283602x = true;
            } else {
                this.f283602x = z2;
                start();
            }
        } else if (this.f283595q != null) {
            mo129179R();
            mo79610W(i);
            this.f283595q.mo24787a((double) (i * 1000), z2);
            return z2;
        }
        return false;
    }

    /* renamed from: b */
    public void mo79614b() {
        Log.m105925i(this.f283586e, "%s onUIPause %s", mo76634K(), Util.getStack());
        this.f283596r = getCurrPosSec();
        this.f283597s = isPlaying();
        this.f283574D = 0;
        this.f283573C = (long) 0;
        pause();
        mo127231U();
        this.f283588g = false;
        mo135073G(600, (long) (getReportIdkey() + 11), 1, false);
    }

    /* renamed from: c */
    public void mo79616c() {
        Log.m105925i(this.f283586e, "%s onUIDestroy", mo76634K());
        stop();
        this.f283600v.removeCallbacksAndMessages((Object) null);
        mo127231U();
        this.f283577G.stopTimer();
        mo135073G(600, (long) (getReportIdkey() + 12), 1, false);
    }

    /* renamed from: f */
    public void mo79617f() {
        Log.m105925i(this.f283586e, "%s onUIResume %s", mo76634K(), Util.getStack());
        this.f283588g = true;
        mo135073G(600, (long) (getReportIdkey() + 10), 1, false);
    }

    public int getCacheTimeSec() {
        return 0;
    }

    public int getCurrPosMs() {
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            return r0Var.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrPosSec() {
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            return Math.round((((float) r0Var.getCurrentPosition()) * 1.0f) / 1000.0f);
        }
        return 0;
    }

    public String getMediaId() {
        return "";
    }

    public int getPlayerType() {
        return this.f283601w;
    }

    public abstract int getReportIdkey();

    public String getSessionId() {
        return "";
    }

    public int getVideoDurationSec() {
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            return Math.round((((float) r0Var.getDuration()) * 1.0f) / 1000.0f);
        }
        return -1;
    }

    public int getVideoSource() {
        return 0;
    }

    public boolean isPlaying() {
        C96875r0 r0Var = this.f283595q;
        boolean isPlaying = r0Var != null ? r0Var.isPlaying() : false;
        Log.m105925i(this.f283586e, "%s is playing[%b]", mo76634K(), Boolean.valueOf(isPlaying));
        return isPlaying;
    }

    /* renamed from: k */
    public void mo127239k() {
        Log.m105925i(this.f283586e, "%s on surface available", mo76634K());
        mo127230T(false);
    }

    public void onCompletion() {
        Log.m105925i(this.f283586e, "%s onCompletion, curMs %d, duration %d", mo76634K(), Integer.valueOf(getCurrPosSec()), Integer.valueOf(getVideoDurationSec()));
        mo79610W(getVideoDurationSec());
        mo135072F();
        mo127231U();
        C96814a.C57541b bVar = this.f283598t;
        if (bVar != null) {
            bVar.mo22958L(getSessionId(), getMediaId());
        }
        this.f283574D = 0;
        this.f283573C = (long) 0;
        mo135073G(600, (long) (getReportIdkey() + 7), 1, false);
    }

    public void onError(int i, int i2) {
        int i3 = i;
        Log.m105929w(this.f283586e, "%s onError info [%d %d] errorCount[%d]", mo76634K(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f283604z));
        mo135073G(600, (long) (getReportIdkey() + 90), 1, false);
        int i4 = this.f283604z + 1;
        this.f283604z = i4;
        if (i4 > 5) {
            mo135073G(600, (long) (getReportIdkey() + 92), 1, false);
            C102171c0 c0Var = this.f283584N;
            c0Var.f300845k = i3;
            c0Var.f300846l = i2;
            C96814a.C57541b bVar = this.f283598t;
            if (bVar != null) {
                bVar.mo22960T(getSessionId(), getMediaId(), (i3 == -1010 || i3 == -1007) ? "MEDIA_ERR_SRC_NOT_SUPPORTED" : (i3 != -1004 ? NetStatusUtil.isConnected(this.f283587f) : NetStatusUtil.isConnected(this.f283587f)) ? "MEDIA_ERR_DECODE" : "MEDIA_ERR_NETWORK", i, i2);
            }
            stop();
            mo135072F();
            return;
        }
        int currPosSec = getCurrPosSec();
        int i5 = this.f283603y;
        if (i5 == -1) {
            i5 = currPosSec;
        }
        Log.m105925i(this.f283586e, "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", mo76634K(), Integer.valueOf(i5), Integer.valueOf(this.f283603y), Integer.valueOf(currPosSec));
        stop();
        mo129179R();
        this.f283600v.postDelayed(new C96799b(i5), 200);
    }

    public void onPrepared() {
        int i;
        int i2;
        Log.m105924i(this.f283585d, "video is onPrepared");
        Log.m105925i(this.f283586e, "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", mo76634K(), Boolean.valueOf(this.f283602x), Integer.valueOf(this.f283603y), Boolean.valueOf(this.f283572B));
        this.f283572B = true;
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            r0Var.setOneTimeVideoTextureUpdateCallback(this);
        }
        setVideoTotalTime(getVideoDurationSec());
        boolean z = this.f283602x;
        if (!z) {
            int i3 = this.f283603y;
            mo79613a(i3 <= -1 ? 0.0d : (double) i3, z);
        } else if (this.f283603y <= -1) {
            if (play() && mo135075L()) {
                this.f283576F.startTimer(1000);
            }
        } else if (!mo129198i()) {
            mo79613a((double) this.f283603y, this.f283602x);
        } else {
            play();
        }
        this.f283603y = -1;
        this.f283602x = true;
        this.f283574D = 0;
        this.f283573C = (long) 0;
        C96814a.C57541b bVar = this.f283598t;
        if (bVar != null) {
            bVar.mo22962Z(getSessionId(), getMediaId());
        }
        if (this.f283604z > 0) {
            Log.m105919d(this.f283586e, "%s start error check timer", mo76634K());
            this.f283577G.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
        mo135073G(600, (long) (getReportIdkey() + 2), 1, false);
        C102171c0 c0Var = this.f283584N;
        if (c0Var.f300836b == 0) {
            c0Var.f300836b = Util.nowMilliSecond();
        }
        int videoDurationSec = getVideoDurationSec();
        C102171c0 c0Var2 = this.f283584N;
        c0Var2.f300844j = videoDurationSec;
        long j = c0Var2.f300835a;
        if (j > 0) {
            long j2 = c0Var2.f300836b;
            if (j2 > 0) {
                int i4 = (int) ((j2 - j) / 1000);
                if (NetStatusUtil.isWifi(this.f283587f)) {
                    i2 = 20;
                    i = 24;
                } else if (NetStatusUtil.is4G(this.f283587f)) {
                    i2 = 25;
                    i = 29;
                } else if (NetStatusUtil.is3G(this.f283587f)) {
                    i2 = 30;
                    i = 34;
                } else if (NetStatusUtil.is2G(this.f283587f)) {
                    i2 = 35;
                    i = 39;
                } else {
                    return;
                }
                int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(i4, new int[]{1, 2, 3, 4}, i2 + getReportIdkey(), i + getReportIdkey()));
                Log.m105919d(this.f283586e, "%s rptFirstPlayTime [%d]", mo76634K(), Integer.valueOf(nullAsNil));
                mo135073G(600, (long) nullAsNil, 1, false);
            }
        }
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
        Log.m105925i(this.f283586e, "%s on get video size [%d, %d]", mo76634K(), Integer.valueOf(i), Integer.valueOf(i2));
        C96814a.C57541b bVar = this.f283598t;
        if (bVar != null) {
            bVar.mo22964l0(getSessionId(), getMediaId(), i, i2);
        }
        mo135073G(600, (long) (getReportIdkey() + 8), 1, false);
    }

    public boolean pause() {
        Log.m105925i(this.f283586e, "%s pause", mo76634K());
        mo135073G(600, (long) (getReportIdkey() + 4), 1, false);
        if (this.f283595q == null) {
            return false;
        }
        mo135078X(false);
        this.f283595q.pause();
        mo127231U();
        C96814a.C57541b bVar = this.f283598t;
        if (bVar != null) {
            bVar.mo22963a0(getSessionId(), getMediaId());
        }
        this.f283584N.f300838d = Util.nowMilliSecond();
        return true;
    }

    public boolean play() {
        if (!this.f283588g) {
            Log.m105929w(this.f283586e, "%s ui on pause now, why u call me to play? [%s]", mo76634K(), Util.getStack());
            return false;
        }
        mo135073G(600, (long) (getReportIdkey() + 3), 1, false);
        C96875r0 r0Var = this.f283595q;
        if (r0Var == null) {
            return false;
        }
        boolean start = r0Var.start();
        Log.m105925i(this.f283586e, "%s video play [%b] isPlayOnUiPause[%b]", mo76634K(), Boolean.valueOf(start), Boolean.valueOf(this.f283597s));
        mo135078X(start);
        if (start) {
            this.f283597s = false;
            Log.m105924i(this.f283585d, "play, start is true");
            mo127230T(false);
            C96814a.C57541b bVar = this.f283598t;
            if (bVar != null) {
                bVar.mo22965m0(getSessionId(), getMediaId());
            }
        }
        return start;
    }

    /* renamed from: r */
    public void mo79636r() {
        Log.m105925i(this.f283586e, "%s onTextureUpdate ", mo76634K());
        mo135072F();
    }

    public void setCover(Bitmap bitmap) {
        ImageView imageView;
        Log.m105925i(this.f283586e, "%s set cover", mo76634K());
        if (bitmap != null && !bitmap.isRecycled() && (imageView = this.f283589h) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void setFullDirection(int i) {
    }

    public void setIMMVideoViewCallback(C96814a.C57541b bVar) {
        this.f283598t = bVar;
    }

    public void setIsShowBasicControls(boolean z) {
        Log.m105925i(this.f283586e, "%s is show seek bar[%b]", mo76634K(), Boolean.valueOf(z));
        if (z) {
            this.f283600v.post(new C102170c(this));
        } else {
            this.f283600v.post(new C102168a(this));
        }
    }

    public abstract /* synthetic */ void setLoop(boolean z);

    public void setLoopCompletionCallback(C96814a.C57542d dVar) {
        this.f283599u = dVar;
    }

    public void setMute(boolean z) {
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            r0Var.setMute(z);
        }
    }

    public void setReporter(C96814a.C96816c cVar) {
        this.f283583M = cVar;
    }

    public abstract /* synthetic */ void setScaleType(C96814a.C96817e eVar);

    public void setVideoFooterView(C102173o oVar) {
        if (!(oVar instanceof View)) {
            Log.m105929w(this.f283586e, "%s set video footer view but is not view", mo76634K());
            return;
        }
        mo135081w();
        this.f283594p = oVar;
        this.f283592n.addView((View) oVar);
    }

    public void setVideoTotalTime(int i) {
        C102173o oVar = this.f283594p;
        if (oVar != null && oVar.getVideoTotalTime() != i) {
            this.f283594p.setVideoTotalTime(i);
        }
    }

    public void stop() {
        int i;
        int i2;
        Log.m105925i(this.f283586e, "%s stop", mo76634K());
        mo135073G(600, (long) (getReportIdkey() + 6), 1, false);
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            r0Var.stop();
        }
        this.f283603y = -1;
        this.f283602x = true;
        this.f283572B = false;
        this.f283574D = 0;
        this.f283573C = (long) 0;
        mo127231U();
        this.f283600v.postDelayed(new C96798a(), 10);
        this.f283584N.f300837c = Util.nowMilliSecond();
        if (this.f283584N.f300842h > 0) {
            if (NetStatusUtil.isWifi(this.f283587f)) {
                i2 = 41;
                i = 45;
            } else if (NetStatusUtil.is4G(this.f283587f)) {
                i2 = 46;
                i = 50;
            } else if (NetStatusUtil.is3G(this.f283587f)) {
                i2 = 51;
                i = 55;
            } else if (NetStatusUtil.is2G(this.f283587f)) {
                i2 = 56;
                i = 60;
            }
            int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(this.f283584N.f300842h, new int[]{1, 2, 3, 4}, i2 + getReportIdkey(), i + getReportIdkey()));
            Log.m105919d(this.f283586e, "%s rptBlockCount [%d]", mo76634K(), Integer.valueOf(nullAsNil));
            mo135073G(600, (long) nullAsNil, 1, false);
        }
        if (this.f283584N.f300835a != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f283584N.f300835a);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300836b);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300837c);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300838d);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300839e);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300840f);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300841g);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300842h);
            stringBuffer.append(",");
            C102171c0 c0Var = this.f283584N;
            long j = c0Var.f300836b;
            stringBuffer.append(j > 0 ? j - c0Var.f300835a : 0);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300843i);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300844j);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300845k);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300846l);
            stringBuffer.append(",");
            stringBuffer.append(this.f283584N.f300847m);
            stringBuffer.append(",");
            C102171c0 c0Var2 = this.f283584N;
            long j2 = c0Var2.f300847m;
            long j3 = c0Var2.f300835a;
            stringBuffer.append(j2 > j3 ? j2 - j3 : 0);
            stringBuffer.append(",");
            stringBuffer.append(getPlayerType());
            stringBuffer.append(",");
            stringBuffer.append(getVideoSource());
            String stringBuffer2 = stringBuffer.toString();
            Log.m105925i(this.f283586e, "%s rpt video kv stat{%s}", mo76634K(), stringBuffer2);
            C96814a.C96816c cVar = this.f283583M;
            if (cVar != null) {
                cVar.kvStat(14349, stringBuffer2);
            }
            C102171c0 c0Var3 = this.f283584N;
            c0Var3.f300835a = 0;
            c0Var3.f300836b = 0;
            c0Var3.f300837c = 0;
            c0Var3.f300838d = 0;
            c0Var3.f300839e = 0;
            c0Var3.f300840f = 0;
            c0Var3.f300841g = 0;
            c0Var3.f300842h = 0;
            c0Var3.f300843i = "";
            c0Var3.f300844j = 0;
            c0Var3.f300845k = 0;
            c0Var3.f300846l = 0;
            c0Var3.f300847m = 0;
        }
    }

    /* renamed from: w */
    public void mo135081w() {
        C102173o oVar = this.f283594p;
        if (oVar != null) {
            this.f283592n.removeView((View) oVar);
        }
    }

    /* renamed from: z */
    public void mo86881z(boolean z) {
        Log.m105925i(this.f283586e, "%s on seek complete startPlay[%b]", mo76634K(), Boolean.valueOf(z));
        C96875r0 r0Var = this.f283595q;
        if (r0Var != null) {
            r0Var.setOneTimeVideoTextureUpdateCallback(this);
        }
        mo135072F();
        mo135078X(z);
        mo79610W(getCurrPosSec());
        if (z) {
            Log.m105924i(this.f283585d, "onSeekComplete, startTimer, startPlay is true");
            mo127230T(false);
            this.f283597s = false;
            C96814a.C57541b bVar = this.f283598t;
            if (bVar != null) {
                bVar.mo22965m0(getSessionId(), getMediaId());
            }
        }
    }

    public AbstractVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f283585d = "VideoView.AbstractVideoView";
        this.f283586e = "MicroMsg.AbstractVideoView";
        this.f283588g = true;
        this.f283596r = 0;
        this.f283597s = false;
        this.f283600v = new C96800c(Looper.getMainLooper());
        this.f283601w = 0;
        this.f283602x = true;
        this.f283603y = -1;
        this.f283604z = 0;
        this.f283571A = false;
        this.f283572B = false;
        this.f283573C = 0;
        this.f283574D = 0;
        this.f283575E = new MTimerHandler(new C96801d(), true);
        this.f283576F = new MTimerHandler(new C96802e(), false);
        this.f283577G = new MTimerHandler(new C96803f(), true);
        this.f283578H = mo134040D();
        this.f283579I = new C102169b(this);
        this.f283580J = false;
        this.f283581K = new C96805h();
        this.f283582L = new C96806i();
        this.f283583M = null;
        this.f283584N = new C102171c0();
        this.f283587f = context;
        mo79392H();
    }
}
