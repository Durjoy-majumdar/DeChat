package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96011a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ps2.C100891r;
import sn0.C90259e;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView */
public class SightVideoFullScreenView extends RelativeLayout implements View.OnClickListener, View.OnTouchListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: x0 */
    public static final /* synthetic */ int f277411x0 = 0;

    /* renamed from: A */
    public volatile boolean f277412A = true;

    /* renamed from: B */
    public volatile boolean f277413B = false;

    /* renamed from: C */
    public int f277414C;

    /* renamed from: D */
    public String f277415D;

    /* renamed from: E */
    public int f277416E;

    /* renamed from: F */
    public int f277417F;

    /* renamed from: G */
    public boolean f277418G;

    /* renamed from: H */
    public boolean f277419H;

    /* renamed from: I */
    public String f277420I;

    /* renamed from: J */
    public String f277421J;

    /* renamed from: K */
    public View.OnClickListener f277422K;

    /* renamed from: L */
    public C102693c f277423L;

    /* renamed from: M */
    public C96011a f277424M;

    /* renamed from: N */
    public long f277425N;

    /* renamed from: P */
    public int f277426P;

    /* renamed from: Q */
    public int f277427Q;

    /* renamed from: R */
    public int f277428R;

    /* renamed from: S */
    public int f277429S;

    /* renamed from: T */
    public int f277430T;

    /* renamed from: U */
    public long f277431U;

    /* renamed from: V */
    public C95414e f277432V;

    /* renamed from: W */
    public Runnable f277433W;

    /* renamed from: d */
    public View f277434d = null;

    /* renamed from: e */
    public FrameLayout f277435e;

    /* renamed from: f */
    public View f277436f;

    /* renamed from: g */
    public View f277437g;

    /* renamed from: h */
    public OfflineVideoView f277438h;

    /* renamed from: i */
    public VideoPlayerSeekBar f277439i;

    /* renamed from: j */
    public ImageView f277440j;

    /* renamed from: n */
    public ImageView f277441n;

    /* renamed from: o */
    public View f277442o;

    /* renamed from: p */
    public int f277443p;

    /* renamed from: p0 */
    public Runnable f277444p0;

    /* renamed from: q */
    public int f277445q;

    /* renamed from: r */
    public int f277446r;

    /* renamed from: s */
    public Context f277447s;

    /* renamed from: t */
    public String f277448t;

    /* renamed from: u */
    public GestureDetector f277449u;

    /* renamed from: v */
    public volatile boolean f277450v = false;

    /* renamed from: w */
    public volatile boolean f277451w = false;

    /* renamed from: x */
    public volatile boolean f277452x = true;

    /* renamed from: y */
    public volatile boolean f277453y = true;

    /* renamed from: z */
    public volatile boolean f277454z = false;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$d */
    public class C30430d implements Runnable {
        public C30430d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$9");
            View e = SightVideoFullScreenView.m121757e(SightVideoFullScreenView.this);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(e, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$9", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(e, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$9", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$a */
    public class C95411a implements Runnable {
        public C95411a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$4");
            try {
                Log.m105924i("SightVideoFullScreenView", "sightVideoStartPlay");
                SightVideoFullScreenView.m121754b(SightVideoFullScreenView.this).mo132296n();
                SightVideoFullScreenView.m121756d(SightVideoFullScreenView.this, true);
                SightVideoFullScreenView sightVideoFullScreenView = SightVideoFullScreenView.this;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                Runnable runnable = sightVideoFullScreenView.f277444p0;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                MMHandlerThread.removeRunnable(runnable);
                View e = SightVideoFullScreenView.m121757e(SightVideoFullScreenView.this);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(e, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(e, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SightVideoFullScreenView.this.mo132481y();
            } catch (Throwable th) {
                Log.m105920e("SightVideoFullScreenView", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$b */
    public class C95412b implements Runnable {
        public C95412b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$5");
            try {
                Log.m105924i("SightVideoFullScreenView", "sightVideoPausePlay");
                SightVideoFullScreenView.m121754b(SightVideoFullScreenView.this).mo132300r();
                SightVideoFullScreenView.m121756d(SightVideoFullScreenView.this, false);
                View e = SightVideoFullScreenView.m121757e(SightVideoFullScreenView.this);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(e, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                e.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(e, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SightVideoFullScreenView sightVideoFullScreenView = SightVideoFullScreenView.this;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                Runnable runnable = sightVideoFullScreenView.f277444p0;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.mo132455k(runnable);
                SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            } catch (Throwable th) {
                Log.m105920e("SightVideoFullScreenView", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$c */
    public class C95413c implements Runnable {
        public C95413c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$8");
            SightVideoFullScreenView.m121758f(SightVideoFullScreenView.this, false);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$e */
    public class C95414e implements AudioManager.OnAudioFocusChangeListener {
        public C95414e() {
        }

        public void onAudioFocusChange(int i) {
            SnsMethodCalculate.markStartTimeMs("onAudioFocusChange", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$AudioFocusChangeListener");
            SightVideoFullScreenView sightVideoFullScreenView = SightVideoFullScreenView.this;
            int i2 = SightVideoFullScreenView.f277411x0;
            SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            sightVideoFullScreenView.getClass();
            SnsMethodCalculate.markStartTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            Log.m105924i("SightVideoFullScreenView", "onAudioFocusChanged is called, focusChange is " + i);
            SnsMethodCalculate.markEndTimeMs("onAudioFocusChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            SnsMethodCalculate.markEndTimeMs("onAudioFocusChange", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$AudioFocusChangeListener");
        }
    }

    public SightVideoFullScreenView(Context context) {
        super(context);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C95997k2 k2Var = new C95997k2(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277422K = k2Var;
        SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C96005l2 l2Var = new C96005l2(this);
        SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277423L = l2Var;
        this.f277425N = 0;
        this.f277426P = 0;
        this.f277427Q = 0;
        this.f277428R = 0;
        this.f277429S = 0;
        this.f277430T = 0;
        this.f277431U = 0;
        this.f277433W = new C95413c();
        this.f277444p0 = new C30430d();
        this.f277447s = context;
        this.f277449u = new GestureDetector(this);
    }

    /* renamed from: b */
    public static /* synthetic */ OfflineVideoView m121754b(SightVideoFullScreenView sightVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        OfflineVideoView offlineVideoView = sightVideoFullScreenView.f277438h;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return offlineVideoView;
    }

    /* renamed from: c */
    public static void m121755c(SightVideoFullScreenView sightVideoFullScreenView, int i) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.getClass();
        SnsMethodCalculate.markStartTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            MMHandlerThread.postToMainThread(new C95970j2(sightVideoFullScreenView, i));
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: d */
    public static /* synthetic */ void m121756d(SightVideoFullScreenView sightVideoFullScreenView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.mo132453B(z);
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: e */
    public static /* synthetic */ View m121757e(SightVideoFullScreenView sightVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        View view = sightVideoFullScreenView.f277442o;
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return view;
    }

    /* renamed from: f */
    public static /* synthetic */ void m121758f(SightVideoFullScreenView sightVideoFullScreenView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.setFocus(z);
        SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: g */
    public static /* synthetic */ int m121759g(SightVideoFullScreenView sightVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        int i = sightVideoFullScreenView.f277416E;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return i;
    }

    /* renamed from: h */
    public static /* synthetic */ VideoPlayerSeekBar m121760h(SightVideoFullScreenView sightVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        VideoPlayerSeekBar videoPlayerSeekBar = sightVideoFullScreenView.f277439i;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return videoPlayerSeekBar;
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m121761i(SightVideoFullScreenView sightVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        boolean z = sightVideoFullScreenView.f277419H;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return z;
    }

    /* renamed from: j */
    public static void m121762j(SightVideoFullScreenView sightVideoFullScreenView) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.getClass();
        SnsMethodCalculate.markStartTimeMs("initsightVideoThumbImage", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            String l = C100891r.m132217l("adId", sightVideoFullScreenView.f277420I);
            if (C86013q1.m106450k(l)) {
                sightVideoFullScreenView.f277438h.mo132281e(l);
            } else {
                C100891r.m132207b("adId", sightVideoFullScreenView.f277420I, false, 1000000001, 0, new C95803h2(sightVideoFullScreenView));
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initsightVideoThumbImage", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    private void setFocus(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        if (z) {
            try {
                C96011a aVar = this.f277424M;
                if (aVar != null) {
                    ((VideoFullScreenActivity) aVar).mo133147I7(true);
                }
                this.f277439i.setVisibility(0);
                this.f277441n.setVisibility(0);
                this.f277440j.setVisibility(0);
                mo132455k(this.f277433W);
            } catch (Throwable th) {
                Log.m105920e("SightVideoFullScreenView", th.toString());
            }
        } else {
            this.f277453y = false;
            this.f277439i.setVisibility(4);
            this.f277441n.setVisibility(8);
            this.f277440j.setVisibility(8);
            MMHandlerThread.removeRunnable(this.f277433W);
            C96011a aVar2 = this.f277424M;
            if (aVar2 != null) {
                ((VideoFullScreenActivity) aVar2).mo133147I7(false);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: A */
    public void mo132452A() {
        SnsMethodCalculate.markStartTimeMs("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (this.f277450v) {
                Log.m105920e("SightVideoFullScreenView", "last download fail, try again");
                this.f277438h.mo132299q();
                SnsMethodCalculate.markEndTimeMs("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                return;
            }
            if (!this.f277451w && !TextUtils.isEmpty(this.f277448t)) {
                this.f277438h.mo132293k(this.f277448t);
                this.f277451w = true;
            }
            MMHandlerThread.postToMainThread(new C95411a());
            this.f277425N = System.currentTimeMillis();
            this.f277430T++;
            SnsMethodCalculate.markEndTimeMs("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
    }

    /* renamed from: B */
    public final void mo132453B(boolean z) {
        SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f277439i.setIsPlay(z);
            this.f277439i.getPlayBtn().getLayoutParams().width = this.f277446r;
            this.f277439i.getPlayBtn().getLayoutParams().height = this.f277446r;
            if (z) {
                Log.m105924i("SightVideoFullScreenView", "startPlay");
                this.f277439i.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f277447s, C0966R.raw.media_player_btn_cur_status_on));
            } else {
                Log.m105924i("SightVideoFullScreenView", "pausePlay");
                this.f277439i.getPlayBtn().setImageDrawable(C76577a.m92158i(this.f277447s, C0966R.raw.media_player_btn_cur_status_off));
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: a */
    public final void mo132454a() {
        AudioManager audioManager;
        SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            Context context = this.f277447s;
            if (context == null) {
                Log.m105920e("SightVideoFullScreenView", "context is null");
                SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                return;
            }
            if (!(this.f277432V == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null)) {
                audioManager.abandonAudioFocus(this.f277432V);
                this.f277432V = null;
            }
            SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        } catch (Throwable unused) {
            Log.m105920e("SightVideoFullScreenView", "abandonAudioFocus has something wrong!");
        }
    }

    /* renamed from: k */
    public final void mo132455k(Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            MMHandlerThread.removeRunnable(runnable);
            MMHandlerThread.postToMainThreadDelayed(runnable, 4000);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: l */
    public void mo132456l() {
        SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f277441n.setImageDrawable(C76577a.m92158i(this.f277447s, C0966R.raw.icon_volume_off));
            this.f277438h.setMute(true);
            this.f277418G = true;
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: m */
    public Intent mo132457m() {
        SnsMethodCalculate.markStartTimeMs("createSightVideoIntent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        Intent intent = new Intent();
        try {
            if (this.f277438h.mo132290h() && this.f277425N != 0) {
                this.f277431U += System.currentTimeMillis() - this.f277425N;
                this.f277425N = 0;
                Log.m105924i("SightVideoFullScreenView", "playTimeInterval update");
            }
            intent.putExtra("KComponentVideoType", this.f277414C);
            intent.putExtra("KComponentCid", this.f277415D);
            intent.putExtra("KComponentCurrentTime", this.f277438h.getCurrentPositionMs());
            intent.putExtra("KComponentVoiceType", this.f277418G);
            intent.putExtra("KComponentProgressType", this.f277438h.mo132290h());
            intent.putExtra("KComponentClickPlayControlCount", this.f277426P);
            intent.putExtra("KComponentDoubleClickCount", this.f277427Q);
            intent.putExtra("KComponentClickVoiceControlCount", this.f277428R);
            intent.putExtra("KComponentPlayCompletedCount", this.f277429S);
            intent.putExtra("KComponentPlayCount", this.f277430T);
            intent.putExtra("KComponentPlayTimeInterval", this.f277431U);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("createSightVideoIntent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return intent;
    }

    /* renamed from: n */
    public final void mo132458n() {
        SnsMethodCalculate.markStartTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            C95198o2.m121134f((Activity) this.f277447s);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f277436f.getLayoutParams();
            layoutParams.leftMargin = C76577a.m92151b(this.f277447s, 64);
            layoutParams.rightMargin = C76577a.m92151b(this.f277447s, 64);
            ((RelativeLayout.LayoutParams) this.f277437g.getLayoutParams()).rightMargin = C76577a.m92151b(this.f277447s, 20);
            ((RelativeLayout.LayoutParams) this.f277440j.getLayoutParams()).rightMargin = C76577a.m92151b(this.f277447s, 20);
            ((RelativeLayout.LayoutParams) this.f277439i.getLayoutParams()).width = this.f277445q - C76577a.m92151b(this.f277447s, 232);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: o */
    public final void mo132459o() {
        SnsMethodCalculate.markStartTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            C95198o2.m121134f((Activity) this.f277447s);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f277436f.getLayoutParams();
            layoutParams.leftMargin = C76577a.m92151b(this.f277447s, 0);
            layoutParams.rightMargin = C76577a.m92151b(this.f277447s, 0);
            ((RelativeLayout.LayoutParams) this.f277437g.getLayoutParams()).rightMargin = C76577a.m92151b(this.f277447s, 10);
            ((RelativeLayout.LayoutParams) this.f277440j.getLayoutParams()).rightMargin = C76577a.m92151b(this.f277447s, 10);
            ((RelativeLayout.LayoutParams) this.f277439i.getLayoutParams()).width = this.f277443p - C76577a.m92151b(this.f277447s, 74);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (view.getId() == C0966R.C0970id.jqs) {
                this.f277428R++;
                setFocus(true);
                if (this.f277418G) {
                    mo132480x();
                } else {
                    mo132456l();
                }
            } else if (view.getId() == C0966R.C0970id.jqr) {
                MMHandlerThread.removeRunnable(this.f277444p0);
                View view2 = this.f277442o;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((Activity) this.f277447s).finish();
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        super.onConfigurationChanged(configuration);
        try {
            int i = configuration.orientation;
            if (i == 2) {
                Log.m105924i("SightVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                mo132458n();
            } else if (i == 1) {
                Log.m105924i("SightVideoFullScreenView", "ORIENTATION_PORTRAIT");
                mo132459o();
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            Log.m105924i("SightVideoFullScreenView", "onDoubleTap");
            this.f277427Q++;
            mo132455k(this.f277433W);
            if (this.f277438h.mo132290h()) {
                mo132482z();
            } else {
                if (this.f277418G) {
                    mo132456l();
                } else {
                    mo132480x();
                }
                mo132452A();
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            Log.m105924i("SightVideoFullScreenView", "onSingleTapConfirmed");
            if (!this.f277453y) {
                this.f277453y = true;
                setFocus(true);
            } else {
                this.f277453y = false;
                setFocus(false);
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        GestureDetector gestureDetector = this.f277449u;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }

    /* renamed from: p */
    public void mo132472p(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        if (i2 >= i) {
            try {
                this.f277443p = i;
                this.f277445q = i2;
            } catch (Throwable th) {
                Log.m105920e("SightVideoFullScreenView", th.toString());
            }
        } else {
            this.f277445q = i;
            this.f277443p = i2;
        }
        this.f277446r = C76577a.m92151b(this.f277447s, 32);
        SnsMethodCalculate.markEndTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: q */
    public final void mo132473q() {
        SnsMethodCalculate.markStartTimeMs("initSightVideoComponents", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            View inflate = LayoutInflater.from(this.f277447s).inflate(C0966R.C0971layout.bzv, this, true);
            this.f277434d = inflate;
            this.f277435e = (FrameLayout) inflate.findViewById(C0966R.C0970id.l4k);
            this.f277436f = this.f277434d.findViewById(C0966R.C0970id.ag7);
            this.f277437g = this.f277434d.findViewById(C0966R.C0970id.f1a);
            this.f277439i = (VideoPlayerSeekBar) this.f277434d.findViewById(C0966R.C0970id.i7m);
            OfflineVideoView offlineVideoView = new OfflineVideoView(this.f277447s, (AttributeSet) null);
            this.f277438h = offlineVideoView;
            offlineVideoView.setClickable(true);
            this.f277438h.setOnTouchListener(this);
            this.f277438h.setSource(2);
            this.f277435e.addView(this.f277438h);
            this.f277439i.setVisibility(0);
            this.f277439i.setOnPlayButtonClickListener(this.f277422K);
            this.f277439i.setIplaySeekCallback(this.f277423L);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.jqr);
            this.f277440j = imageView;
            imageView.setVisibility(0);
            this.f277440j.setOnClickListener(this);
            ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.jqs);
            this.f277441n = imageView2;
            imageView2.setVisibility(0);
            this.f277441n.setOnClickListener(this);
            View findViewById = this.f277434d.findViewById(C0966R.C0970id.hrx);
            this.f277442o = findViewById;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "initSightVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "initSightVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f277447s.getResources().getConfiguration().orientation == 2) {
                Log.m105924i("SightVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                mo132458n();
            } else if (this.f277447s.getResources().getConfiguration().orientation == 1) {
                Log.m105924i("SightVideoFullScreenView", "ORIENTATION_PORTRAIT");
                mo132459o();
            }
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initSightVideoComponents", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: r */
    public final void mo132474r() {
        SnsMethodCalculate.markStartTimeMs("initVideoStatus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            int videoTotalTime = this.f277439i.getVideoTotalTime();
            int i = this.f277417F;
            if (videoTotalTime != i / 1000) {
                this.f277439i.setVideoTotalTime(i / 1000);
            }
            this.f277439i.seek(this.f277416E / 1000);
            mo132453B(this.f277419H);
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initVideoStatus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: s */
    public void mo132475s() {
        SnsMethodCalculate.markStartTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            mo132473q();
            mo132474r();
            SnsMethodCalculate.markStartTimeMs("initSightVideoPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            this.f277438h.setVideoCallback(new C95810i2(this));
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initSightVideoPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277438h.mo132299q();
        setFocus(true);
        SnsMethodCalculate.markEndTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void setProgressBarStatusListener(C96011a aVar) {
        SnsMethodCalculate.markStartTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277424M = aVar;
        SnsMethodCalculate.markEndTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: t */
    public void mo132477t(int i, String str, int i2, int i3, boolean z, boolean z2, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f277452x = true;
            this.f277412A = true;
            this.f277414C = i;
            this.f277415D = str;
            this.f277416E = i2;
            this.f277417F = i3;
            this.f277418G = z;
            this.f277419H = z2;
            this.f277420I = str2;
            this.f277421J = str3;
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: v */
    public void mo132478v() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            mo132454a();
            MMHandlerThread.removeRunnable(this.f277433W);
            MMHandlerThread.removeRunnable(this.f277444p0);
            this.f277438h.mo132291i();
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: w */
    public void mo132479w() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (this.f277412A) {
                mo132481y();
            } else if (!this.f277438h.mo132290h() && this.f277413B) {
                mo132452A();
                this.f277413B = false;
            }
            this.f277412A = false;
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: x */
    public void mo132480x() {
        SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f277441n.setImageDrawable(C76577a.m92158i(this.f277447s, C0966R.raw.icon_volume_on));
            this.f277438h.setMute(false);
            this.f277418G = false;
        } catch (Throwable th) {
            Log.m105920e("SightVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    /* renamed from: y */
    public void mo132481y() {
        SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            Context context = this.f277447s;
            if (context == null) {
                Log.m105920e("SightVideoFullScreenView", "context is null");
                SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                return;
            }
            if (this.f277432V == null) {
                this.f277432V = new C95414e();
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    int requestAudioFocus = audioManager.requestAudioFocus(this.f277432V, 3, 2);
                    if (requestAudioFocus == 1) {
                        Log.m105924i("SightVideoFullScreenView", "requestAudioFocus successfully!");
                    } else {
                        Log.m105924i("SightVideoFullScreenView", "requestAudioFocus is not granted. value = " + requestAudioFocus);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        } catch (Throwable unused) {
            Log.m105920e("SightVideoFullScreenView", "requestAudioFocus has something wrong!");
        }
    }

    /* renamed from: z */
    public final void mo132482z() {
        SnsMethodCalculate.markStartTimeMs("sightVideoPausePlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        Log.m105918d("SightVideoFullScreenView", "pause play");
        MMHandlerThread.postToMainThread(new C95412b());
        if (this.f277425N != 0) {
            this.f277431U += System.currentTimeMillis() - this.f277425N;
            this.f277425N = 0;
            Log.m105924i("SightVideoFullScreenView", "playTimeInterval update");
        }
        SnsMethodCalculate.markEndTimeMs("sightVideoPausePlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public SightVideoFullScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C95997k2 k2Var = new C95997k2(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277422K = k2Var;
        SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C96005l2 l2Var = new C96005l2(this);
        SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277423L = l2Var;
        this.f277425N = 0;
        this.f277426P = 0;
        this.f277427Q = 0;
        this.f277428R = 0;
        this.f277429S = 0;
        this.f277430T = 0;
        this.f277431U = 0;
        this.f277433W = new C95413c();
        this.f277444p0 = new C30430d();
        this.f277447s = context;
        this.f277449u = new GestureDetector(this);
    }

    public SightVideoFullScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C95997k2 k2Var = new C95997k2(this);
        SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277422K = k2Var;
        SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        C96005l2 l2Var = new C96005l2(this);
        SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.f277423L = l2Var;
        this.f277425N = 0;
        this.f277426P = 0;
        this.f277427Q = 0;
        this.f277428R = 0;
        this.f277429S = 0;
        this.f277430T = 0;
        this.f277431U = 0;
        this.f277433W = new C95413c();
        this.f277444p0 = new C30430d();
        this.f277447s = context;
        this.f277449u = new GestureDetector(this);
    }
}
