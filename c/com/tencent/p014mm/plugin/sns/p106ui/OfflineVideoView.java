package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoTextureView;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.IXWebBroadcastListener;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p206nj.C11171e;
import vr2.C37817q;

/* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView */
public class OfflineVideoView extends RelativeLayout implements C96875r0.C96876a {

    /* renamed from: d */
    public int f277114d;

    /* renamed from: e */
    public Context f277115e;

    /* renamed from: f */
    public C95361h f277116f;

    /* renamed from: g */
    public RelativeLayout f277117g;

    /* renamed from: h */
    public ImageView f277118h;

    /* renamed from: i */
    public C96875r0 f277119i;

    /* renamed from: j */
    public ProgressBar f277120j;

    /* renamed from: n */
    public boolean f277121n;

    /* renamed from: o */
    public boolean f277122o;

    /* renamed from: p */
    public boolean f277123p;

    /* renamed from: q */
    public boolean f277124q;

    /* renamed from: r */
    public int f277125r;

    /* renamed from: s */
    public int f277126s;

    /* renamed from: t */
    public int f277127t;

    /* renamed from: u */
    public MMHandler f277128u;

    /* renamed from: v */
    public int f277129v;

    /* renamed from: w */
    public boolean f277130w;

    /* renamed from: x */
    public MTimerHandler f277131x;

    /* renamed from: y */
    public C96875r0.C96879e f277132y;

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$a */
    public class C95354a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f277133d;

        public C95354a(String str) {
            this.f277133d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$1");
            if (OfflineVideoView.this.f277118h != null) {
                Log.m105925i("MicroMsg.OfflineVideoView", "%d fresh thumb image", Integer.valueOf(hashCode()));
                OfflineVideoView.this.f277118h.setImageBitmap(BackwardSupportUtil.BitmapFactory.decodeFile(this.f277133d, 1.0f));
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$b */
    public class C95355b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f277135d;

        public C95355b(String str) {
            this.f277135d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$2");
            OfflineVideoView.this.mo132293k(this.f277135d);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$c */
    public class C95356c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f277137d;

        /* renamed from: e */
        public final /* synthetic */ float f277138e;

        public C95356c(boolean z, float f) {
            this.f277137d = z;
            this.f277138e = f;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$3");
            Log.m105925i("MicroMsg.OfflineVideoView", "%d switch video model isVideoPlay %b %f", Integer.valueOf(OfflineVideoView.this.hashCode()), Boolean.valueOf(this.f277137d), Float.valueOf(this.f277138e));
            View view = (View) OfflineVideoView.m121607a(OfflineVideoView.this);
            if (this.f277137d) {
                float f = this.f277138e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = view;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                OfflineVideoView.m121608b(OfflineVideoView.this).setVisibility(0);
                OfflineVideoView.m121608b(OfflineVideoView.this).setAlpha(this.f277138e);
                float f2 = this.f277138e;
                if (((double) f2) >= 1.0d) {
                    OfflineVideoView.this.f277118h.setVisibility(8);
                } else if (((double) f2) == 0.0d) {
                    OfflineVideoView.this.f277118h.setVisibility(0);
                }
            } else {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view4 = view;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                OfflineVideoView.m121608b(OfflineVideoView.this).setVisibility(0);
                OfflineVideoView.m121608b(OfflineVideoView.this).setAlpha(0.0f);
                OfflineVideoView.this.f277118h.setVisibility(0);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$d */
    public class C95357d implements Runnable {
        public C95357d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$4");
            Log.m105925i("MicroMsg.OfflineVideoView", "%d show loading. downloadMode %d", Integer.valueOf(OfflineVideoView.this.hashCode()), Integer.valueOf(OfflineVideoView.this.hashCode()));
            if (!(OfflineVideoView.m121609c(OfflineVideoView.this) == null || OfflineVideoView.m121609c(OfflineVideoView.this).getVisibility() == 0)) {
                OfflineVideoView.m121609c(OfflineVideoView.this).setVisibility(0);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$e */
    public class C95358e implements Runnable {
        public C95358e() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$5");
            if (!(OfflineVideoView.m121609c(OfflineVideoView.this) == null || OfflineVideoView.m121609c(OfflineVideoView.this).getVisibility() == 8)) {
                Log.m105925i("MicroMsg.OfflineVideoView", "%d hide loading.", Integer.valueOf(OfflineVideoView.this.hashCode()));
                OfflineVideoView.m121609c(OfflineVideoView.this).setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$f */
    public class C95359f implements MTimerHandler.CallBack {
        public C95359f() {
        }

        public boolean onTimerExpired() {
            SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
            if (OfflineVideoView.m121607a(OfflineVideoView.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
                return false;
            }
            if (((View) OfflineVideoView.m121607a(OfflineVideoView.this)).getAlpha() < 1.0f) {
                OfflineVideoView.this.mo132298p(true, 1.0f);
            }
            if (OfflineVideoView.m121607a(OfflineVideoView.this).isPlaying()) {
                OfflineVideoView offlineVideoView = OfflineVideoView.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
                offlineVideoView.mo132282f();
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
                int currentPosition = OfflineVideoView.m121607a(OfflineVideoView.this).getCurrentPosition();
                OfflineVideoView.this.mo132307t(currentPosition);
                if (currentPosition / 1000 == 2) {
                    Log.m105924i("MicroMsg.OfflineVideoView", "onTimerExpired, curPos=" + currentPosition + ", video.alpha=" + OfflineVideoView.m121608b(OfflineVideoView.this).getAlpha() + ", video.visble=" + OfflineVideoView.m121608b(OfflineVideoView.this).getVisibility() + ", thumb.alpha=" + OfflineVideoView.this.f277118h.getAlpha() + ", thumb.visble=" + OfflineVideoView.this.f277118h.getVisibility());
                }
            } else {
                Log.m105924i("MicroMsg.OfflineVideoView", "onTimerExpired, isPlaying=false");
            }
            SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$6");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$g */
    public class C95360g implements C96875r0.C96879e {
        public C95360g() {
        }

        /* renamed from: r */
        public void mo79636r() {
            SnsMethodCalculate.markStartTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$7");
            Log.m105925i("MicroMsg.OfflineVideoView", "%d on texture update.", Integer.valueOf(OfflineVideoView.this.hashCode()));
            try {
                OfflineVideoView.this.mo132298p(true, 1.0f);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.OfflineVideoView", "texture view update. error " + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.OfflineVideoView$h */
    public interface C95361h {
        /* renamed from: a */
        void mo131754a(int i);

        /* renamed from: b */
        void mo131755b(int i);

        /* renamed from: c */
        boolean mo131756c(PString pString, PString pString2);

        void onCompletion();
    }

    public OfflineVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ C96875r0 m121607a(OfflineVideoView offlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = offlineVideoView.f277119i;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return r0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ RelativeLayout m121608b(OfflineVideoView offlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        RelativeLayout relativeLayout = offlineVideoView.f277117g;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return relativeLayout;
    }

    /* renamed from: c */
    public static /* synthetic */ ProgressBar m121609c(OfflineVideoView offlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        ProgressBar progressBar = offlineVideoView.f277120j;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return progressBar;
    }

    /* renamed from: M0 */
    public int mo76207M0(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        SnsMethodCalculate.markEndTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return 0;
    }

    /* renamed from: d */
    public void mo132280d() {
        SnsMethodCalculate.markStartTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277131x.stopTimer();
        SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: e */
    public void mo132281e(String str) {
        SnsMethodCalculate.markStartTimeMs("freshThumbImage", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("freshThumbImage", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return;
        }
        this.f277128u.post(new C95354a(str));
        SnsMethodCalculate.markEndTimeMs("freshThumbImage", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: f */
    public final void mo132282f() {
        SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277128u.post(new C95358e());
        SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: g */
    public boolean mo132283g() {
        SnsMethodCalculate.markStartTimeMs("isPlayerPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        if (r0Var instanceof VideoPlayerTextureView) {
            VideoPlayerTextureView videoPlayerTextureView = (VideoPlayerTextureView) r0Var;
            boolean z = true;
            if (!(videoPlayerTextureView.f318493t != null && !videoPlayerTextureView.f318478E) || !mo132290h()) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isPlayerPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return z;
        }
        boolean h = mo132290h();
        SnsMethodCalculate.markEndTimeMs("isPlayerPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return h;
    }

    public int getCurrentPosition() {
        SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        if (r0Var != null) {
            int currentPosition = r0Var.getCurrentPosition() / 1000;
            SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return currentPosition;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return 0;
    }

    public int getCurrentPositionMs() {
        SnsMethodCalculate.markStartTimeMs("getCurrentPositionMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        if (r0Var != null) {
            int currentPosition = r0Var.getCurrentPosition();
            SnsMethodCalculate.markEndTimeMs("getCurrentPositionMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return currentPosition;
        }
        SnsMethodCalculate.markEndTimeMs("getCurrentPositionMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return 0;
    }

    public int getDurationMs() {
        SnsMethodCalculate.markStartTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        if (r0Var != null) {
            int duration = r0Var.getDuration();
            SnsMethodCalculate.markEndTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return duration;
        }
        SnsMethodCalculate.markEndTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return 0;
    }

    public View getInnerVideoView() {
        SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        if (r0Var instanceof View) {
            View view = (View) r0Var;
            SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return view;
        }
        SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return null;
    }

    public int getTimerInterval() {
        SnsMethodCalculate.markStartTimeMs("getTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        int i = this.f277129v;
        SnsMethodCalculate.markEndTimeMs("getTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return i;
    }

    public String getVideoPath() {
        SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        if (r0Var != null) {
            String videoPath = r0Var.getVideoPath();
            SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return videoPath;
        }
        SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return "";
    }

    /* renamed from: h */
    public boolean mo132290h() {
        SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        boolean isPlaying = r0Var != null ? r0Var.isPlaying() : false;
        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return isPlaying;
    }

    /* renamed from: i */
    public void mo132291i() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105919d("MicroMsg.OfflineVideoView", "%d on destroy %s", Integer.valueOf(hashCode()), Util.getStack());
        SnsMethodCalculate.markStartTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d logic unInit", Integer.valueOf(hashCode()));
        this.f277128u.removeCallbacksAndMessages((Object) null);
        mo132280d();
        C96875r0 r0Var = this.f277119i;
        if (r0Var != null) {
            r0Var.stop();
        }
        SnsMethodCalculate.markEndTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: j */
    public void mo132292j() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105919d("MicroMsg.OfflineVideoView", "%d on resume %s", Integer.valueOf(hashCode()), Util.getStack());
        if (!this.f277122o) {
            mo132299q();
        }
        this.f277123p = true;
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: k */
    public void mo132293k(String str) {
        SnsMethodCalculate.markStartTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d prepare video  filePath %s", Integer.valueOf(hashCode()), str);
        if (Util.isNullOrNil(str)) {
            Log.m105929w("MicroMsg.OfflineVideoView", "%d prepare video but filepath is null.", Integer.valueOf(hashCode()));
            SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return;
        }
        C96875r0 r0Var = this.f277119i;
        if (r0Var != null) {
            r0Var.setOneTimeVideoTextureUpdateCallback(this.f277132y);
            this.f277119i.setVideoPath(str);
        }
        SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: l */
    public void mo132294l(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d seek second %d afterSeekPlay %b", Integer.valueOf(hashCode()), Integer.valueOf(i), Boolean.valueOf(z));
        mo132282f();
        this.f277119i.mo24787a((double) i, z);
        mo132297o();
        SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: m */
    public void mo132295m() {
        SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277128u.post(new C95357d());
        SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: n */
    public void mo132296n() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d start curPos [%d], duration [%d]", Integer.valueOf(hashCode()), Integer.valueOf(this.f277119i.getCurrentPosition()), Integer.valueOf(this.f277119i.getDuration()));
        if (!Util.isNullOrNil(this.f277119i.getVideoPath())) {
            if (this.f277119i.getCurrentPosition() >= this.f277119i.getDuration()) {
                this.f277119i.mo24787a(0.0d, true);
                C95361h hVar = this.f277116f;
                if (hVar != null) {
                    hVar.mo131755b(this.f277127t);
                }
            } else {
                this.f277119i.start();
            }
            mo132297o();
        }
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: o */
    public void mo132297o() {
        SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277131x.startTimer((long) this.f277129v);
        SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void onCompletion() {
        SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d on completion", Integer.valueOf(hashCode()));
        C95361h hVar = this.f277116f;
        if (hVar != null) {
            hVar.onCompletion();
        } else if (C11171e.m11045b(18) || !this.f277121n) {
            mo132294l(0, true);
        } else {
            C96875r0 r0Var = this.f277119i;
            if (r0Var != null) {
                String videoPath = r0Var.getVideoPath();
                this.f277119i.stop();
                mo132293k(videoPath);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void onError(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        int i3 = 3;
        Log.m105921e("MicroMsg.OfflineVideoView", "%d on play video error what %d extra %d isMMVideoPlayer %b errorCount %d", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f277121n), Integer.valueOf(this.f277126s));
        this.f277126s++;
        String videoPath = this.f277119i.getVideoPath();
        this.f277119i.stop();
        this.f277122o = true;
        mo132298p(false, 0.0f);
        if (this.f277126s <= 3) {
            this.f277128u.postDelayed(new C95355b(videoPath), 200);
        } else {
            long j = -1;
            try {
                if (Util.isNullOrNil(videoPath)) {
                    Log.m105920e("MicroMsg.OfflineVideoView", "onError, filepath==null");
                } else if (C86013q1.m106450k(videoPath)) {
                    j = C86013q1.m106451l(videoPath);
                    Log.m105924i("MicroMsg.OfflineVideoView", "onError, fileLen=" + j + ", delRet=" + C86013q1.m106447h(videoPath));
                    i3 = 1;
                } else {
                    Log.m105920e("MicroMsg.OfflineVideoView", "onError, file not exists");
                    i3 = 2;
                }
                if (!this.f277130w) {
                    C37817q.m41545a("offline_video_error2", this.f277121n ? "1" : "0", i3, (int) j, getClass().getSimpleName());
                    this.f277130w = true;
                }
                int i4 = this.f277114d;
                if (i4 == 1) {
                    C115669n.INSTANCE.mo175911u(1579, 9);
                } else if (i4 == 2) {
                    C115669n.INSTANCE.mo175911u(1579, 16);
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.OfflineVideoView", "onError, exp=" + th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void onPrepared() {
        SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        mo132298p(true, 0.0f);
        this.f277122o = false;
        mo132282f();
        this.f277127t = this.f277119i.getDuration() / 1000;
        Log.m105925i("MicroMsg.OfflineVideoView", "%d on prepared. shouldPlayWhenPrepared [%b] shouldSeekTimeWhenPrepared[%d]", Integer.valueOf(hashCode()), Boolean.valueOf(this.f277124q), Integer.valueOf(this.f277125r));
        if (this.f277124q) {
            int i = this.f277125r;
            if (i <= 0) {
                this.f277119i.start();
            } else {
                mo132294l(i, true);
            }
            mo132297o();
            C95361h hVar = this.f277116f;
            if (hVar != null) {
                hVar.mo131755b(this.f277127t);
            }
        } else {
            int i2 = this.f277125r;
            if (i2 <= 0) {
                i2 = 0;
            }
            mo132294l(i2, false);
        }
        this.f277125r = -1;
        SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: p */
    public void mo132298p(boolean z, float f) {
        SnsMethodCalculate.markStartTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277128u.post(new C95356c(z, f));
        SnsMethodCalculate.markEndTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: p3 */
    public void mo76226p3(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: q */
    public void mo132299q() {
        SnsMethodCalculate.markStartTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (this.f277116f != null) {
            PString pString = new PString();
            PString pString2 = new PString();
            if (this.f277116f.mo131756c(pString, pString2)) {
                if (!Util.isNullOrNil(pString2.value)) {
                    mo132281e(pString2.value);
                }
                if (!Util.isNullOrNil(pString.value)) {
                    mo132293k(pString.value);
                }
            } else {
                mo132295m();
                mo132298p(false, 0.0f);
            }
        } else {
            Log.m105929w("MicroMsg.OfflineVideoView", "%d toggle video but video callback is null", Integer.valueOf(hashCode()));
        }
        SnsMethodCalculate.markEndTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: r */
    public void mo132300r() {
        SnsMethodCalculate.markStartTimeMs("uiTouchPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d pause", Integer.valueOf(hashCode()));
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d on pause %s ", Integer.valueOf(hashCode()), Util.getStack());
        this.f277124q = false;
        if (this.f277119i.isPlaying()) {
            this.f277125r = this.f277119i.getCurrentPosition();
            Log.m105925i("MicroMsg.OfflineVideoView", "%d pause play", Integer.valueOf(hashCode()));
            this.f277119i.pause();
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        mo132282f();
        mo132280d();
        SnsMethodCalculate.markEndTimeMs("uiTouchPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: s */
    public void mo132301s(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("uiTouchSeek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d ui touch seek second %d afterSeekPlay %b", Integer.valueOf(hashCode()), Integer.valueOf(i), Boolean.valueOf(z));
        mo132294l(i, z);
        mo132297o();
        SnsMethodCalculate.markEndTimeMs("uiTouchSeek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setMute(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277119i.setMute(z);
        SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSeekCompleteCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C96875r0 r0Var = this.f277119i;
        if (r0Var != null) {
            r0Var.setOnSeekCompleteCallback(cVar);
        }
        SnsMethodCalculate.markEndTimeMs("setOnSeekCompleteCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setSource(int i) {
        SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277114d = i;
        SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setTimerInterval(int i) {
        SnsMethodCalculate.markStartTimeMs("setTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (i < 200) {
            i = 200;
        }
        this.f277129v = i;
        SnsMethodCalculate.markEndTimeMs("setTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setVideoCallback(C95361h hVar) {
        SnsMethodCalculate.markStartTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f277116f = hVar;
        SnsMethodCalculate.markEndTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    /* renamed from: t */
    public void mo132307t(int i) {
        SnsMethodCalculate.markStartTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        C95361h hVar = this.f277116f;
        if (hVar != null) {
            hVar.mo131754a(i);
        }
        SnsMethodCalculate.markEndTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public OfflineVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        this.f277114d = 0;
        this.f277115e = null;
        this.f277122o = false;
        this.f277123p = false;
        this.f277124q = true;
        this.f277125r = -1;
        this.f277126s = 0;
        this.f277127t = 0;
        this.f277128u = new MMHandler(Looper.getMainLooper());
        this.f277129v = 1000;
        this.f277130w = false;
        this.f277131x = new MTimerHandler(new C95359f(), true);
        this.f277132y = new C95360g();
        this.f277115e = context;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        Log.m105925i("MicroMsg.OfflineVideoView", "%d ui init view.", Integer.valueOf(hashCode()));
        LayoutInflater from = LayoutInflater.from(this.f277115e);
        SnsMethodCalculate.markStartTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        SnsMethodCalculate.markEndTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        from.inflate(C0966R.C0971layout.f360019c52, this);
        this.f277118h = (ImageView) findViewById(C0966R.C0970id.l7k);
        this.f277117g = (RelativeLayout) findViewById(C0966R.C0970id.l7c);
        this.f277120j = (ProgressBar) findViewById(C0966R.C0970id.l6a);
        SnsMethodCalculate.markStartTimeMs("checkCanUseMMVideoPlayer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (C11171e.m11044a(18)) {
            SnsMethodCalculate.markEndTimeMs("checkCanUseMMVideoPlayer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            z = false;
        } else {
            SnsMethodCalculate.markEndTimeMs("checkCanUseMMVideoPlayer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            z = true;
        }
        if (z) {
            this.f277121n = true;
            this.f277119i = new VideoPlayerTextureView(this.f277115e, (AttributeSet) null);
        } else {
            this.f277121n = false;
            this.f277119i = new VideoTextureView(this.f277115e, (AttributeSet) null);
        }
        this.f277119i.setVideoCallback(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f277117g.addView((View) this.f277119i, layoutParams);
        mo132298p(false, 0.0f);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }
}
