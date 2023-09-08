package com.tencent.p014mm.live.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.Format;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import p295b8.C16760a;
import p295b8.C16765c;
import p295b8.C16774g;
import p300c8.C16871d;
import p300c8.C16873k;
import p300c8.C16875m;
import p300c8.C79946g;
import p300c8.C79950j;
import p300c8.C79952o;
import p300c8.C79954q;
import p333e8.C20551y;
import p370p7.C21920c;
import p370p7.C21941l;
import p370p7.C21962v;
import p396x6.C22995c;
import p396x6.C22996d;
import p396x6.C22997e;
import p396x6.C23002g;
import p396x6.C23016o;
import p396x6.C23017p;
import p396x6.C23023u;
import p396x6.C23027v;
import rx3.C13598b0;
import xn2.C102693c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB!\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0002R,\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/live/view/LiveReplayVideoView;", "Landroid/widget/RelativeLayout;", "Lx6/p$a;", "", "getLayoutId", "Lkotlin/Function0;", "Lrx3/b0;", "n", "Lfy3/a;", "getVideoSeekBarDragCallback", "()Lfy3/a;", "setVideoSeekBarDragCallback", "(Lfy3/a;)V", "videoSeekBarDragCallback", "Lkotlin/Function1;", "Landroid/view/View;", "t", "Lfy3/l;", "getOnCloseClickListener", "()Lfy3/l;", "setOnCloseClickListener", "(Lfy3/l;)V", "onCloseClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "e", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.LiveReplayVideoView */
public final class LiveReplayVideoView extends RelativeLayout implements C23017p.C23018a {

    /* renamed from: d */
    public final String f266774d;

    /* renamed from: e */
    public C23023u f266775e;

    /* renamed from: f */
    public TextureView f266776f;

    /* renamed from: g */
    public final TextView f266777g;

    /* renamed from: h */
    public final ViewGroup f266778h;

    /* renamed from: i */
    public final ViewGroup f266779i;

    /* renamed from: j */
    public RedesignVideoPlayerSeekBar f266780j;

    /* renamed from: n */
    public C32224a<C13598b0> f266781n;

    /* renamed from: o */
    public final Handler f266782o;

    /* renamed from: p */
    public C79946g.C79947a f266783p;

    /* renamed from: q */
    public boolean f266784q;

    /* renamed from: r */
    public final long f266785r;

    /* renamed from: s */
    public final Handler f266786s;

    /* renamed from: t */
    public C32226l<? super View, C13598b0> f266787t;

    /* renamed from: u */
    public final C92697f f266788u;

    /* renamed from: com.tencent.mm.live.view.LiveReplayVideoView$a */
    public static final class C68058a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveReplayVideoView f195349d;

        public C68058a(LiveReplayVideoView liveReplayVideoView) {
            this.f195349d = liveReplayVideoView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/view/LiveReplayVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<View, C13598b0> onCloseClickListener = this.f195349d.getOnCloseClickListener();
            if (onCloseClickListener != null) {
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                onCloseClickListener.invoke(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/view/LiveReplayVideoView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveReplayVideoView$b */
    public static final class C68059b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveReplayVideoView f195350d;

        public C68059b(LiveReplayVideoView liveReplayVideoView) {
            this.f195350d = liveReplayVideoView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/view/LiveReplayVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveReplayVideoView liveReplayVideoView = this.f195350d;
            if (liveReplayVideoView.f266778h.getVisibility() == 0) {
                liveReplayVideoView.f266778h.setVisibility(8);
            } else {
                liveReplayVideoView.f266778h.setVisibility(0);
            }
            if (liveReplayVideoView.f266779i.getVisibility() == 0) {
                liveReplayVideoView.f266779i.setVisibility(8);
            } else {
                liveReplayVideoView.f266779i.setVisibility(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/view/LiveReplayVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveReplayVideoView$c */
    public static final class C92694c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveReplayVideoView f266789d;

        public C92694c(LiveReplayVideoView liveReplayVideoView) {
            this.f266789d = liveReplayVideoView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/view/LiveReplayVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LiveReplayVideoView liveReplayVideoView = this.f266789d;
            C23023u uVar = liveReplayVideoView.f266775e;
            if (uVar != null) {
                if (uVar.mo36263b()) {
                    uVar.mo36262a(false);
                    RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = liveReplayVideoView.f266780j;
                    if (redesignVideoPlayerSeekBar != null) {
                        redesignVideoPlayerSeekBar.setIsPlay(false);
                    }
                } else {
                    if (liveReplayVideoView.f266784q) {
                        liveReplayVideoView.mo126877a();
                        liveReplayVideoView.f266784q = false;
                    }
                    uVar.mo36262a(true);
                    RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = liveReplayVideoView.f266780j;
                    if (redesignVideoPlayerSeekBar2 != null) {
                        redesignVideoPlayerSeekBar2.setIsPlay(true);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/live/view/LiveReplayVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveReplayVideoView$d */
    public static final class C92695d implements C102693c {

        /* renamed from: d */
        public final /* synthetic */ LiveReplayVideoView f266790d;

        public C92695d(LiveReplayVideoView liveReplayVideoView) {
            this.f266790d = liveReplayVideoView;
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            String str = this.f266790d.f266774d;
            Log.m105924i(str, "onSeekTo " + i);
            C23023u uVar = this.f266790d.f266775e;
            if (uVar != null) {
                uVar.mo36327l(((long) i) * 1000);
            }
            C23023u uVar2 = this.f266790d.f266775e;
            if (uVar2 != null) {
                uVar2.mo36262a(true);
            }
            C32224a<C13598b0> videoSeekBarDragCallback = this.f266790d.getVideoSeekBarDragCallback();
            if (videoSeekBarDragCallback != null) {
                C13598b0 invoke = videoSeekBarDragCallback.invoke();
            }
            LiveReplayVideoView liveReplayVideoView = this.f266790d;
            if (liveReplayVideoView.f266784q) {
                liveReplayVideoView.f266784q = false;
                liveReplayVideoView.mo126877a();
            }
        }

        /* renamed from: c */
        public void mo4336c(int i) {
        }

        public void onSeekPre() {
            Log.m105924i(this.f266790d.f266774d, "onSeekPre");
            C23023u uVar = this.f266790d.f266775e;
            if (uVar != null) {
                uVar.mo36262a(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveReplayVideoView$e */
    public final class C92696e implements C21920c, C21941l.C21942a {
        public C92696e() {
        }

        /* renamed from: d */
        public void mo33442d() {
            Log.m105918d(LiveReplayVideoView.this.f266774d, "onHasEndTag");
        }

        /* renamed from: k */
        public void mo33447k(int i, Format format, int i2, Object obj, long j) {
            Log.m105919d(LiveReplayVideoView.this.f266774d, "onDownstreamFormatChanged, trackType:%s, trackFormat:%s, mediaTimeMs:%s", Integer.valueOf(i), format, Long.valueOf(j));
        }

        /* renamed from: l */
        public void mo33448l(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = LiveReplayVideoView.this.f266780j;
            if (redesignVideoPlayerSeekBar != null) {
                redesignVideoPlayerSeekBar.setIsPlay(false);
            }
            Log.printErrStackTrace(LiveReplayVideoView.this.f266774d, iOException, "onLoadError1, IOException, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s, loadDurationMs:%s, bytesLoaded:%s, wasCanceled:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Boolean.valueOf(z));
        }

        /* renamed from: m */
        public void mo33449m(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            Log.m105919d(LiveReplayVideoView.this.f266774d, "onLoadCompleted, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        }

        /* renamed from: o */
        public void mo33451o(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
            Log.m105919d(LiveReplayVideoView.this.f266774d, "onLoadStarted, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        }

        public void onLoadError(IOException iOException) {
            Log.printErrStackTrace(LiveReplayVideoView.this.f266774d, iOException, "onLoadError2, IOException", new Object[0]);
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = LiveReplayVideoView.this.f266780j;
            if (redesignVideoPlayerSeekBar != null) {
                redesignVideoPlayerSeekBar.setIsPlay(false);
            }
        }

        /* renamed from: t */
        public void mo33454t(C79950j jVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            Log.m105919d(LiveReplayVideoView.this.f266774d, "onLoadCanceled, dataSpec:%s, trackType:%s, trackFormat:%s, mediaStartTimeMs:%s, mediaEndTimeMs:%s, elapsedRealtimeMs:%s", jVar, Integer.valueOf(i2), format, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveReplayVideoView$f */
    public static final class C92697f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LiveReplayVideoView f266792d;

        public C92697f(LiveReplayVideoView liveReplayVideoView) {
            this.f266792d = liveReplayVideoView;
        }

        public void run() {
            C23023u uVar = this.f266792d.f266775e;
            Long l = null;
            Long valueOf = uVar != null ? Long.valueOf(uVar.getCurrentPosition()) : null;
            C23023u uVar2 = this.f266792d.f266775e;
            if (uVar2 != null) {
                C23002g gVar = (C23002g) uVar2.f66192b;
                l = Long.valueOf((gVar.f66099p.mo36345k() || gVar.f66096m > 0) ? gVar.f66106w : gVar.mo36271j(gVar.f66104u.f66163e));
            }
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f266792d.f266780j;
            if (redesignVideoPlayerSeekBar != null) {
                redesignVideoPlayerSeekBar.seek((int) ((valueOf != null ? valueOf.longValue() : 0) / ((long) 1000)));
            }
            String str = this.f266792d.f266774d;
            Log.m105924i(str, "repeaterTask curPosition:" + valueOf + "ms bufferedPosition:" + l + LocaleUtil.MALAY);
            LiveReplayVideoView liveReplayVideoView = this.f266792d;
            liveReplayVideoView.f266786s.postDelayed(this, liveReplayVideoView.f266785r);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveReplayVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f266774d = "MicroMsg.LiveReplayVideoView";
        this.f266782o = new Handler(Looper.getMainLooper());
        String i2 = C20551y.m22319i(context, context.getString(C0966R.string.a0u));
        Surface surface = null;
        C16875m mVar = new C16875m((Handler) null, (C16871d.C16872a) null);
        this.f266785r = 1000;
        this.f266786s = new Handler();
        this.f266788u = new C92697f(this);
        View.inflate(context, getLayoutId(), this);
        View findViewById = findViewById(C0966R.C0970id.fqt);
        C87412m.m108593f(findViewById, "findViewById(R.id.live_after_replay_close_icon)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f358558fr2);
        C87412m.m108593f(findViewById2, "findViewById(R.id.live_after_replay_title_tv)");
        this.f266777g = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f358556fr0);
        C87412m.m108593f(findViewById3, "findViewById(R.id.live_after_replay_texture_view)");
        this.f266776f = (TextureView) findViewById3;
        this.f266780j = (RedesignVideoPlayerSeekBar) findViewById(C0966R.C0970id.fqw);
        View findViewById4 = findViewById(C0966R.C0970id.f358557fr1);
        C87412m.m108593f(findViewById4, "findViewById(R.id.live_after_replay_title_group)");
        this.f266778h = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.fqu);
        C87412m.m108593f(findViewById5, "findViewById(R.id.live_after_replay_footer_group)");
        this.f266779i = (ViewGroup) findViewById5;
        Drawable drawable = getResources().getDrawable(C0966R.raw.icons_filled_close);
        C74933u4.m89769f(drawable, -1);
        imageView.setImageDrawable(drawable);
        this.f266775e = new C23023u(new C22996d(getContext()), new C16765c(new C16760a.C16761a(mVar)), new C22995c(new C16873k(true, 65536)));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        C87412m.m108593f(i2, "userAgent");
        this.f266783p = new C79952o(context2, mVar, new C79954q(i2, mVar, 8000, 8000, true));
        C23023u uVar = this.f266775e;
        if (uVar != null) {
            uVar.mo36323h(this);
        }
        C23023u uVar2 = this.f266775e;
        if (uVar2 != null) {
            TextureView textureView = this.f266776f;
            uVar2.mo36326k();
            uVar2.f66201k = textureView;
            if (textureView == null) {
                uVar2.mo36330o((Surface) null, true);
            } else {
                textureView.getSurfaceTextureListener();
                textureView.setSurfaceTextureListener(uVar2.f66193c);
                SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
                uVar2.mo36330o(surfaceTexture != null ? new Surface(surfaceTexture) : surface, true);
            }
        }
        imageView.setOnClickListener(new C68058a(this));
        this.f266776f.setOnClickListener(new C68059b(this));
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f266780j;
        if (redesignVideoPlayerSeekBar != null) {
            redesignVideoPlayerSeekBar.setPlayBtnOnClickListener(new C92694c(this));
        }
        RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = this.f266780j;
        if (redesignVideoPlayerSeekBar2 != null) {
            redesignVideoPlayerSeekBar2.setIplaySeekCallback(new C92695d(this));
        }
    }

    private final int getLayoutId() {
        return C0966R.C0971layout.b64;
    }

    /* renamed from: a */
    public final void mo126877a() {
        this.f266786s.removeCallbacks(this.f266788u);
        this.f266786s.post(this.f266788u);
    }

    public final C32226l<View, C13598b0> getOnCloseClickListener() {
        return this.f266787t;
    }

    public final C32224a<C13598b0> getVideoSeekBarDragCallback() {
        return this.f266781n;
    }

    public void onLoadingChanged(boolean z) {
        Log.m105924i(this.f266774d, "onLoadingChanged");
    }

    public void onPlaybackParametersChanged(C23016o oVar) {
        Log.m105924i(this.f266774d, "onPlaybackParametersChanged");
    }

    public void onPlayerError(C22997e eVar) {
        Log.m105924i(this.f266774d, "onPlayerError");
    }

    public void onPlayerStateChanged(boolean z, int i) {
        String str = this.f266774d;
        Log.m105924i(str, "onPlayerStateChanged playWhenReady:" + z + " playbackState:" + i);
        long j = 0;
        if (i == 3) {
            String str2 = this.f266774d;
            StringBuilder sb = new StringBuilder();
            sb.append("duration:");
            C23023u uVar = this.f266775e;
            Long l = null;
            sb.append(uVar != null ? Long.valueOf(uVar.getDuration()) : null);
            sb.append("ms curPosition:");
            C23023u uVar2 = this.f266775e;
            if (uVar2 != null) {
                l = Long.valueOf(uVar2.getDuration());
            }
            sb.append(l);
            sb.append(LocaleUtil.MALAY);
            Log.m105924i(str2, sb.toString());
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = this.f266780j;
            if (redesignVideoPlayerSeekBar != null) {
                C23023u uVar3 = this.f266775e;
                redesignVideoPlayerSeekBar.setVideoTotalTime((int) ((uVar3 != null ? uVar3.getDuration() : 0) / ((long) 1000)));
            }
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = this.f266780j;
            if (redesignVideoPlayerSeekBar2 != null) {
                C23023u uVar4 = this.f266775e;
                if (uVar4 != null) {
                    j = uVar4.getCurrentPosition();
                }
                redesignVideoPlayerSeekBar2.seek((int) (j / ((long) 1000)));
            }
        } else if (i == 4) {
            this.f266784q = true;
            C23023u uVar5 = this.f266775e;
            if (uVar5 != null) {
                uVar5.mo36327l(0);
            }
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar3 = this.f266780j;
            if (redesignVideoPlayerSeekBar3 != null) {
                redesignVideoPlayerSeekBar3.setIsPlay(false);
            }
            this.f266786s.removeCallbacks(this.f266788u);
            C23023u uVar6 = this.f266775e;
            if (uVar6 != null) {
                uVar6.mo36262a(false);
            }
        }
    }

    public void onPositionDiscontinuity() {
        Log.m105924i(this.f266774d, "onPositionDiscontinuity");
    }

    public void onRepeatModeChanged(int i) {
        Log.m105924i(this.f266774d, "onRepeatModeChanged");
    }

    public void onTimelineChanged(C23027v vVar, Object obj) {
        Log.m105924i(this.f266774d, "onTimelineChanged");
    }

    public void onTracksChanged(C21962v vVar, C16774g gVar) {
        Log.m105924i(this.f266774d, "onTracksChanged");
    }

    public final void setOnCloseClickListener(C32226l<? super View, C13598b0> lVar) {
        this.f266787t = lVar;
    }

    public final void setVideoSeekBarDragCallback(C32224a<C13598b0> aVar) {
        this.f266781n = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LiveReplayVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
