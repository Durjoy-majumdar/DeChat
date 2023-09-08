package com.tencent.p014mm.plugin.sight.decode.p1077ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelstat.C29038l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.plugin.sns.p106ui.VideoAdPlayerUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96895y1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97621e;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p206nj.C76861g;
import te3.C101804kv2;
import xn2.C102692b;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView */
public class VideoPlayView extends RelativeLayout implements C97621e.C97622a, C96875r0 {

    /* renamed from: H */
    public static final /* synthetic */ int f273572H = 0;

    /* renamed from: A */
    public boolean f273573A = false;

    /* renamed from: B */
    public boolean f273574B = false;

    /* renamed from: C */
    public long f273575C = 0;

    /* renamed from: D */
    public Animation f273576D = new AlphaAnimation(1.0f, 0.0f);

    /* renamed from: E */
    public Animation f273577E = new AlphaAnimation(0.0f, 1.0f);

    /* renamed from: F */
    public Runnable f273578F = new C94583d();

    /* renamed from: G */
    public int f273579G = 0;

    /* renamed from: d */
    public int f273580d = C0947jz.f2205e;

    /* renamed from: e */
    public int f273581e = 240;

    /* renamed from: f */
    public boolean f273582f = true;

    /* renamed from: g */
    public ProgressBar f273583g;

    /* renamed from: h */
    public C94586g f273584h;

    /* renamed from: i */
    public ViewGroup f273585i;

    /* renamed from: j */
    public C96875r0 f273586j = null;

    /* renamed from: n */
    public C102692b f273587n;

    /* renamed from: o */
    public double f273588o = 0.0d;

    /* renamed from: p */
    public View f273589p;

    /* renamed from: q */
    public TextView f273590q;

    /* renamed from: r */
    public String f273591r = "";

    /* renamed from: s */
    public MMHandler f273592s = new MMHandler();

    /* renamed from: t */
    public View f273593t;

    /* renamed from: u */
    public ImageView f273594u;

    /* renamed from: v */
    public boolean f273595v = true;

    /* renamed from: w */
    public String f273596w;

    /* renamed from: x */
    public int f273597x = 0;

    /* renamed from: y */
    public int f273598y = 0;

    /* renamed from: z */
    public int f273599z = 0;

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$a */
    public class C94578a implements C96875r0.C96876a {

        /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$a$a */
        public class C94579a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f273601d;

            /* renamed from: e */
            public final /* synthetic */ int f273602e;

            public C94579a(int i, int i2) {
                this.f273601d = i;
                this.f273602e = i2;
            }

            public void run() {
                Log.m105924i("MicroMsg.VideoPlayView", "play time " + this.f273601d + " video time " + this.f273602e);
                int i = this.f273602e;
                if (i > 0) {
                    VideoPlayView videoPlayView = VideoPlayView.this;
                    videoPlayView.f273597x = i;
                    if (videoPlayView.f273587n != null && videoPlayView.f273582f) {
                        videoPlayView.f273582f = false;
                    }
                    VideoAdPlayerUI.C95705a aVar = (VideoAdPlayerUI.C95705a) videoPlayView.f273584h;
                    aVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("onPlayInfo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                    if (VideoAdPlayerUI.m122504J7(VideoAdPlayerUI.this) == 0) {
                        VideoAdPlayerUI videoAdPlayerUI = VideoAdPlayerUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        videoAdPlayerUI.f279095q = i;
                        SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        VideoAdPlayerUI videoAdPlayerUI2 = VideoAdPlayerUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        C101804kv2 kv22 = videoAdPlayerUI2.f279076J;
                        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        kv22.f298668A = i;
                    }
                    SnsMethodCalculate.markEndTimeMs("onPlayInfo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                }
                C102692b bVar = VideoPlayView.this.f273587n;
                if (bVar != null) {
                    int videoTotalTime = bVar.getVideoTotalTime();
                    int i2 = this.f273602e;
                    if (videoTotalTime != i2) {
                        VideoPlayView.this.f273587n.setVideoTotalTime(i2);
                    }
                    VideoPlayView.this.f273587n.seek(this.f273601d);
                    VideoPlayView.this.f273587n.setIsPlay(true);
                }
                if (VideoPlayView.this.f273583g.getVisibility() == 0) {
                    VideoPlayView.this.f273583g.setVisibility(8);
                }
                VideoPlayView.this.f273588o = (double) this.f273601d;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$a$b */
        public class C94580b implements Runnable {
            public C94580b() {
            }

            public void run() {
                VideoPlayView videoPlayView = VideoPlayView.this;
                videoPlayView.mo130126i(videoPlayView.f273579G);
            }
        }

        public C94578a() {
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            MMHandlerThread.postToMainThread(new C94579a(i, i2));
            return 0;
        }

        public void onCompletion() {
            Log.m105918d("MicroMsg.VideoPlayView", "on completion " + Util.getStack().toString());
            VideoPlayView videoPlayView = VideoPlayView.this;
            if (!videoPlayView.f273573A) {
                videoPlayView.f273588o = 0.0d;
                videoPlayView.mo24788d(0.0d);
                VideoPlayView.this.f273587n.setIsPlay(false);
                VideoPlayView.this.mo130123f(0);
                VideoPlayView.this.mo130124g();
                long currentTimeMillis = System.currentTimeMillis();
                VideoPlayView videoPlayView2 = VideoPlayView.this;
                if (currentTimeMillis - videoPlayView2.f273575C < 2000) {
                    Log.m105924i("MicroMsg.VideoPlayView", "Too short onCompletion");
                    return;
                }
                videoPlayView2.f273575C = System.currentTimeMillis();
                C94586g gVar = VideoPlayView.this.f273584h;
                if (gVar != null) {
                    VideoAdPlayerUI.C95705a aVar = (VideoAdPlayerUI.C95705a) gVar;
                    SnsMethodCalculate.markStartTimeMs("onPlayCompletion", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                    Log.m105924i("MicroMsg.VideoPlayerUI", "onPlayCompletion");
                    VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290740b++;
                    VideoAdPlayerUI.m122503I7(VideoAdPlayerUI.this, false);
                    VideoAdPlayerUI videoAdPlayerUI = VideoAdPlayerUI.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    int i = videoAdPlayerUI.f279078L;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                    if (i != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("1,2,");
                        sb.append(VideoAdPlayerUI.m122504J7(VideoAdPlayerUI.this));
                        sb.append(",");
                        VideoAdPlayerUI videoAdPlayerUI2 = VideoAdPlayerUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        String str = videoAdPlayerUI2.f279079M;
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        sb.append(str);
                        sb.append(",");
                        VideoAdPlayerUI videoAdPlayerUI3 = VideoAdPlayerUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        String str2 = videoAdPlayerUI3.f279080N;
                        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        sb.append(str2);
                        sb.append(",");
                        sb.append(Util.nowSecond());
                        sb.append(",");
                        VideoAdPlayerUI videoAdPlayerUI4 = VideoAdPlayerUI.this;
                        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        String str3 = videoAdPlayerUI4.f279077K;
                        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                        sb.append(str3);
                        sb.append(",");
                        sb.append(VideoAdPlayerUI.m122504J7(VideoAdPlayerUI.this));
                        C29038l lVar = new C29038l(13227, sb.toString(), (int) Util.nowSecond());
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(lVar);
                    }
                    SnsMethodCalculate.markEndTimeMs("onPlayCompletion", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                    return;
                }
                return;
            }
            videoPlayView.f273587n.setIsPlay(false);
            VideoPlayView videoPlayView3 = VideoPlayView.this;
            videoPlayView3.mo130123f((int) videoPlayView3.f273588o);
            VideoPlayView.this.mo130124g();
            C94586g gVar2 = VideoPlayView.this.f273584h;
            if (gVar2 != null) {
                VideoAdPlayerUI.C95705a aVar2 = (VideoAdPlayerUI.C95705a) gVar2;
                SnsMethodCalculate.markStartTimeMs("onPlayDownloadedPartComplete", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
                Log.m105924i("MicroMsg.VideoPlayerUI", "onPlayDownloadedPartComplete");
                VideoAdPlayerUI.m122503I7(VideoAdPlayerUI.this, false);
                VideoAdPlayerUI videoAdPlayerUI5 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoPlayView videoPlayView4 = videoAdPlayerUI5.f279086e;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                videoPlayView4.f273583g.setVisibility(0);
                SnsMethodCalculate.markEndTimeMs("onPlayDownloadedPartComplete", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            }
        }

        public void onError(int i, int i2) {
            Log.m105921e("MicroMsg.VideoPlayView", "on play video error, what %d extra %d", Integer.valueOf(i), Integer.valueOf(i2));
            VideoPlayView.this.f273586j.stop();
        }

        public void onPrepared() {
            Log.m105918d("MicroMsg.VideoPlayView", C76861g.m92659b() + " onPrepared");
            VideoPlayView videoPlayView = VideoPlayView.this;
            int i = VideoPlayView.f273572H;
            videoPlayView.mo130125h(true);
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
            VideoPlayView videoPlayView = VideoPlayView.this;
            videoPlayView.f273580d = i;
            videoPlayView.f273581e = i2;
            if (videoPlayView.f273574B) {
                videoPlayView.f273592s.post(new C94580b());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$b */
    public class C94581b implements View.OnTouchListener {
        public C94581b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 1) {
                VideoPlayView videoPlayView = VideoPlayView.this;
                if (videoPlayView.f273593t.getVisibility() == 0) {
                    videoPlayView.mo130121b();
                } else {
                    videoPlayView.mo130124g();
                }
            } else {
                motionEvent.getAction();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$c */
    public class C94582c implements Runnable {
        public C94582c() {
        }

        public void run() {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (VideoPlayView.this.getContext() instanceof MMActivity) {
                ((MMActivity) VideoPlayView.this.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                C96875r0 r0Var = VideoPlayView.this.f273586j;
                if (r0Var instanceof VideoSightView) {
                    ((VideoSightView) r0Var).setDrawableWidth(displayMetrics.widthPixels);
                }
            }
            ((View) VideoPlayView.this.f273586j).requestLayout();
            ((View) VideoPlayView.this.f273586j).postInvalidate();
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$d */
    public class C94583d implements Runnable {
        public C94583d() {
        }

        public void run() {
            VideoPlayView.this.mo130121b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$e */
    public class C94584e implements Runnable {
        public C94584e() {
        }

        public void run() {
            C102692b bVar = VideoPlayView.this.f273587n;
            if (bVar != null) {
                bVar.setIsPlay(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$f */
    public class C94585f implements Runnable {
        public C94585f() {
        }

        public void run() {
            if (!VideoPlayView.this.f273586j.isPlaying()) {
                ((AdVideoPlayerLoadingBar) VideoPlayView.this.f273587n).mo36658r();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView$g */
    public interface C94586g {
    }

    public VideoPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130122c();
    }

    /* renamed from: I2 */
    public void mo23179I2() {
    }

    /* renamed from: N3 */
    public void mo23180N3() {
    }

    /* renamed from: R0 */
    public void mo23181R0() {
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        mo24788d(d);
    }

    /* renamed from: b */
    public void mo130121b() {
        C102692b bVar = this.f273587n;
        if (bVar != null) {
            View view = (View) bVar;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f273593t;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f273594u.setVisibility(8);
        View view4 = this.f273589p;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: c */
    public final void mo130122c() {
        this.f273576D.setDuration(200);
        this.f273577E.setDuration(200);
        View.inflate(getContext(), C0966R.C0971layout.cbl, this);
        this.f273593t = findViewById(C0966R.C0970id.hwz);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.grt);
        this.f273594u = imageView;
        imageView.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.f273583g = (ProgressBar) findViewById(C0966R.C0970id.i89);
        this.f273585i = (ViewGroup) findViewById(C0966R.C0970id.f359485l50);
        C96875r0 a = C96895y1.m124471a(getContext());
        this.f273586j = a;
        a.setLoop(false);
        this.f273585i.addView((View) this.f273586j, 0, new RelativeLayout.LayoutParams(-1, -1));
        TextView textView = (TextView) findViewById(C0966R.C0970id.jjx);
        this.f273590q = textView;
        this.f273589p = textView;
        this.f273586j.setVideoCallback(new C94578a());
        C96875r0 r0Var = this.f273586j;
        if (r0Var instanceof VideoSightView) {
            ((VideoSightView) r0Var).setEnableConfigChanged(false);
        }
        setOnTouchListener(new C94581b());
        mo130121b();
        ((View) this.f273586j).post(new C94582c());
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        this.f273586j.mo24788d(d);
        this.f273587n.seek((int) d);
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        return this.f273586j.mo24789e(context, z);
    }

    /* renamed from: f */
    public final void mo130123f(int i) {
        this.f273588o = i >= 0 ? (double) i : this.f273586j.getLastProgresstime();
        Log.m105924i("MicroMsg.VideoPlayView", "pause play " + this.f273588o + " lastTime: " + i + " last " + this.f273586j.getLastProgresstime());
        this.f273586j.pause();
        this.f273592s.post(new C94584e());
        C94586g gVar = this.f273584h;
        if (gVar != null) {
            VideoAdPlayerUI.C95705a aVar = (VideoAdPlayerUI.C95705a) gVar;
            SnsMethodCalculate.markStartTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            VideoAdPlayerUI videoAdPlayerUI = VideoAdPlayerUI.this;
            int i2 = VideoAdPlayerUI.f279066T;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            C97621e eVar = videoAdPlayerUI.f279085d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            eVar.mo136889a();
            VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290741c += (int) Util.ticksToNow(VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290745g);
            VideoAdPlayerUI.m122503I7(VideoAdPlayerUI.this, false);
            SnsMethodCalculate.markEndTimeMs("onPausePlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    /* renamed from: f2 */
    public void mo23185f2() {
    }

    /* renamed from: g */
    public final void mo130124g() {
        View view = (View) this.f273587n;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f273593t;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f273595v) {
            this.f273594u.setVisibility(0);
        }
        if (this.f273579G != 2 && !Util.isNullOrNil(this.f273591r)) {
            View view4 = this.f273589p;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "tryShowMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "tryShowMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f273592s.removeCallbacks(this.f273578F);
        this.f273592s.postDelayed(this.f273578F, 3000);
    }

    public int getCurrentPosition() {
        return this.f273586j.getCurrentPosition();
    }

    public int getDuration() {
        int i = this.f273597x;
        return i == 0 ? this.f273586j.getDuration() : i;
    }

    public double getLastProgresstime() {
        return Math.max(this.f273588o, this.f273586j.getLastProgresstime());
    }

    public long getLastSurfaceUpdateTime() {
        return 0;
    }

    public String getVideoPath() {
        return this.f273596w;
    }

    /* renamed from: h */
    public final void mo130125h(boolean z) {
        this.f273586j.mo24788d(this.f273588o);
        this.f273586j.start();
        Log.m105924i("MicroMsg.VideoPlayView", "startplay get duration " + this.f273597x + " lastPlayProgressTime: " + this.f273588o);
        C94586g gVar = this.f273584h;
        if (gVar != null) {
            VideoAdPlayerUI.C95705a aVar = (VideoAdPlayerUI.C95705a) gVar;
            SnsMethodCalculate.markStartTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            if (z) {
                VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290744f = VideoAdPlayerUI.this.getResources().getConfiguration().orientation == 2 ? 2 : 1;
                VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290745g = Util.currentTicks();
                VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290743e = 2;
                VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290741c = 0;
            }
            VideoAdPlayerUI videoAdPlayerUI = VideoAdPlayerUI.this;
            int i = VideoAdPlayerUI.f279066T;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            boolean z2 = videoAdPlayerUI.f279081P;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (!z2) {
                VideoAdPlayerUI videoAdPlayerUI2 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                VideoPlayView videoPlayView = videoAdPlayerUI2.f279086e;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                if (((int) videoPlayView.getLastProgresstime()) == 0) {
                    VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290739a++;
                }
            }
            VideoAdPlayerUI.m122502H7(VideoAdPlayerUI.this).f290185j.f290745g = Util.currentTicks();
            VideoAdPlayerUI videoAdPlayerUI3 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            C97621e eVar = videoAdPlayerUI3.f279085d;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            VideoAdPlayerUI videoAdPlayerUI4 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            VideoPlayView videoPlayView2 = videoAdPlayerUI4.f279086e;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            eVar.mo136891c(videoPlayView2);
            VideoAdPlayerUI videoAdPlayerUI5 = VideoAdPlayerUI.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i2 = videoAdPlayerUI5.f279078L;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (i2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("1,1,0,");
                VideoAdPlayerUI videoAdPlayerUI6 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str = videoAdPlayerUI6.f279079M;
                SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb.append(str);
                sb.append(",");
                VideoAdPlayerUI videoAdPlayerUI7 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str2 = videoAdPlayerUI7.f279080N;
                SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb.append(str2);
                sb.append(",");
                sb.append(Util.nowSecond());
                sb.append(",");
                VideoAdPlayerUI videoAdPlayerUI8 = VideoAdPlayerUI.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                String str3 = videoAdPlayerUI8.f279077K;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb.append(str3);
                sb.append(",");
                sb.append(VideoAdPlayerUI.m122504J7(VideoAdPlayerUI.this));
                C29038l lVar = new C29038l(13227, sb.toString(), (int) Util.nowSecond());
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(lVar);
            }
            VideoAdPlayerUI.m122503I7(VideoAdPlayerUI.this, true);
            SnsMethodCalculate.markEndTimeMs("onStartPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    /* renamed from: i */
    public final void mo130126i(int i) {
        this.f273574B = true;
        if (this.f273599z == 0 || this.f273598y == 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int i2 = displayMetrics.heightPixels;
            this.f273599z = i2;
            int i3 = displayMetrics.widthPixels;
            this.f273598y = i3;
            if (i2 < i3) {
                this.f273599z = i3;
                this.f273598y = i2;
            }
            Log.m105924i("MicroMsg.VideoPlayView", "getScreen screen_height:" + this.f273599z + " screen_width:" + this.f273598y);
        }
        ViewGroup.LayoutParams layoutParams = this.f273585i.getLayoutParams();
        C102692b bVar = this.f273587n;
        RelativeLayout.LayoutParams layoutParams2 = bVar == null ? null : (RelativeLayout.LayoutParams) ((View) bVar).getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        if (i == 1) {
            int i4 = this.f273598y;
            layoutParams3.width = i4;
            layoutParams3.height = (int) (((((double) i4) * 1.0d) * ((double) this.f273581e)) / ((double) this.f273580d));
            if (this.f273587n != null) {
                layoutParams2.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 0.0f);
            }
        } else {
            int i5 = this.f273598y;
            layoutParams3.height = i5;
            layoutParams3.width = (int) (((((double) i5) * 1.0d) * ((double) this.f273580d)) / ((double) this.f273581e));
            if (this.f273587n != null) {
                layoutParams2.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 0.0f);
            }
        }
        C102692b bVar2 = this.f273587n;
        if (bVar2 != null) {
            bVar2.mo130080f();
            ((View) this.f273587n).setLayoutParams(layoutParams2);
            if (this.f273587n instanceof AdVideoPlayerLoadingBar) {
                this.f273592s.postDelayed(new C94585f(), 500);
            }
        }
        Log.m105924i("MicroMsg.VideoPlayView", "orientation " + i + " " + layoutParams3.width + " " + layoutParams3.height);
        ((View) this.f273586j).setLayoutParams(layoutParams3);
        C96875r0 r0Var = this.f273586j;
        if (r0Var instanceof C94571a) {
            ((C94571a) r0Var).mo130072c(layoutParams3.width, layoutParams3.height);
        }
        layoutParams.height = layoutParams3.height;
        layoutParams.width = layoutParams3.width;
        this.f273585i.setLayoutParams(layoutParams);
        ((View) this.f273586j).requestLayout();
    }

    public boolean isPlaying() {
        return this.f273586j.isPlaying();
    }

    public void onDetach() {
        this.f273586j.onDetach();
    }

    public void pause() {
        mo130123f(-1);
    }

    public void setForceScaleFullScreen(boolean z) {
    }

    public void setIsDownloading(boolean z) {
        this.f273573A = z;
        C96875r0 r0Var = this.f273586j;
        if (r0Var != null && (r0Var instanceof VideoSightView)) {
            VideoSightView videoSightView = (VideoSightView) r0Var;
            if (videoSightView.getController() != null) {
                videoSightView.getController().f273489v = !z;
            }
        }
    }

    public void setLeftButtonOnClickListener(View.OnClickListener onClickListener) {
        this.f273593t.setOnClickListener(onClickListener);
    }

    public void setLoop(boolean z) {
        this.f273586j.setLoop(z);
    }

    public void setMute(boolean z) {
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
    }

    public void setPlayProgressCallback(boolean z) {
        this.f273586j.setPlayProgressCallback(z);
    }

    public void setRightButtonOnCliclListener(View.OnClickListener onClickListener) {
        this.f273594u.setOnClickListener(onClickListener);
    }

    public void setThumb(Bitmap bitmap) {
        this.f273586j.setThumb(bitmap);
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f273586j.setVideoCallback(aVar);
    }

    public void setVideoPath(String str) {
        this.f273596w = str;
        Log.m105925i("MicroMsg.VideoPlayView", "videoPath  %s", str);
        this.f273586j.setVideoPath(this.f273596w);
    }

    public void setVideoPlayViewEvent(C94586g gVar) {
        this.f273584h = gVar;
    }

    public void setVideoTotalTime(int i) {
        if (this.f273587n.getVideoTotalTime() != i) {
            this.f273587n.setVideoTotalTime(i);
        }
    }

    public boolean start() {
        mo130125h(true);
        return true;
    }

    public void stop() {
        this.f273586j.stop();
    }

    public VideoPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo130122c();
    }
}
