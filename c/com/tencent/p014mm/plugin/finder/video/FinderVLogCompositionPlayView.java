package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Size;
import android.view.TextureView;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.player.Player;
import di3.C86312j;
import ei2.C31606c;
import f50.C58924d;
import fs3.C59318d;
import gr1.C59660k2;
import gr1.C59662l2;
import gr1.C59673q2;
import gr1.C59674r2;
import gr1.C59684w2;
import gy3.C87412m;
import ht1.C60157c5;
import ht1.C60171g1;
import java.lang.reflect.Field;
import kotlin.Metadata;
import mr1.C61575s;
import p707tz.C65000f;
import ph1.C62294j;
import pl1.C62367r0;
import pl1.C62369u0;
import qt1.C12931a;
import sp3.C110807k;
import te3.C101758az;
import te3.C64689rq2;
import te3.C64899zy;
import wp3.C111823a;
import wp3.C111829g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b-\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010m\u001a\u00020l\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010p\u001a\u00020\t¢\u0006\u0004\bq\u0010rB\u0019\b\u0016\u0012\u0006\u0010m\u001a\u00020l\u0012\u0006\u0010o\u001a\u00020n¢\u0006\u0004\bq\u0010sJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0005H\u0016J\n\u0010'\u001a\u0004\u0018\u00010&H\u0016J\n\u0010)\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0005H\u0016J\u0012\u00107\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208H\u0016J\u0012\u0010=\u001a\u00020\u00072\b\u0010<\u001a\u0004\u0018\u00010;H\u0016J\n\u0010?\u001a\u0004\u0018\u00010>H\u0016R$\u0010F\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010N\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010J\"\u0004\bO\u0010LR\"\u0010S\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010H\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR\"\u0010U\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010H\u001a\u0004\bU\u0010J\"\u0004\bV\u0010LR$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010f\u001a\u00020\u00058\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bc\u0010H\u001a\u0004\bd\u0010J\"\u0004\be\u0010LR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bg\u0010H\u001a\u0004\b\u0006\u0010J\"\u0004\bh\u0010LR\"\u0010j\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bi\u0010H\u001a\u0004\bj\u0010J\"\u0004\bk\u0010L¨\u0006t"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVLogCompositionPlayView;", "Lcom/tencent/mm/videocomposition/play/VideoCompositionPlayView;", "Lgr1/k2;", "", "getPlayStart", "", "isShowFullscreen", "Lrx3/b0;", "setFullscreen", "", "tag", "setContextTag", "getContextTag", "Lgr1/l2;", "getVideoAdapter", "isFull", "setFullScreenEnjoy", "getCurrentPlaySecond", "getCurrentPlayMs", "getVideoDuration", "getVideoDurationMs", "getVideoViewFocused", "Landroid/view/View;", "getVideoView", "getIsShouldPlayResume", "getIsNeverStart", "Landroid/view/ViewParent;", "getParentView", "shouldPlayResume", "setIsShouldPlayResume", "focused", "setVideoViewFocused", "isPreview", "setPreview", "isInterceptDetach", "setInterceptDetach", "mute", "setMute", "", "getVideoMediaId", "Lgr1/q2;", "getVideoMediaInfo", "Lht1/c5;", "_callback", "setIMMVideoViewCallback", "Lcom/tencent/mm/pluginsdk/ui/a$e;", "scaleType", "setScaleType", "Lcom/tencent/mm/modelvideo/a;", "_proxy", "setIOnlineVideoProxy", "isShow", "setIsShowBasicControls", "Lgr1/w2;", "lifecycle", "setVideoPlayLifecycle", "Lgr1/r2;", "muteListener", "setVideoMuteListener", "Lqt1/a;", "videoPlayTrace", "setFinderVideoPlayTrace", "", "getPlayer", "r", "Lgr1/q2;", "getMediaInfo", "()Lgr1/q2;", "setMediaInfo", "(Lgr1/q2;)V", "mediaInfo", "s", "Z", "isViewFocused", "()Z", "setViewFocused", "(Z)V", "t", "isShouldPlayResume", "setShouldPlayResume", "u", "get_isPreviewing", "set_isPreviewing", "_isPreviewing", "v", "isNeverStart", "setNeverStart", "w", "Lgr1/r2;", "getMuteListener", "()Lgr1/r2;", "setMuteListener", "(Lgr1/r2;)V", "x", "Lgr1/w2;", "getLifecycle", "()Lgr1/w2;", "setLifecycle", "(Lgr1/w2;)V", "I", "y", "setPreloadedView", "isPreloadedView", "J", "setShowFullscreen", "K", "isInterceptedDetach", "setInterceptedDetach", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-publish_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView */
public final class FinderVLogCompositionPlayView extends VideoCompositionPlayView implements C59660k2 {

    /* renamed from: A */
    public String f161800A = String.valueOf(hashCode());

    /* renamed from: B */
    public C64689rq2 f161801B;

    /* renamed from: C */
    public boolean f161802C = true;

    /* renamed from: D */
    public boolean f161803D;

    /* renamed from: E */
    public C31606c f161804E;

    /* renamed from: F */
    public EffectManager f161805F;

    /* renamed from: G */
    public long f161806G;

    /* renamed from: H */
    public int f161807H = -1;

    /* renamed from: I */
    public boolean f161808I;

    /* renamed from: J */
    public boolean f161809J;

    /* renamed from: K */
    public boolean f161810K;

    /* renamed from: L */
    public Object f161811L;

    /* renamed from: M */
    public Object f161812M;

    /* renamed from: r */
    public C59673q2 f161813r;

    /* renamed from: s */
    public boolean f161814s = true;

    /* renamed from: t */
    public boolean f161815t;

    /* renamed from: u */
    public boolean f161816u;

    /* renamed from: v */
    public volatile boolean f161817v = true;

    /* renamed from: w */
    public C59674r2 f161818w;

    /* renamed from: x */
    public C59684w2 f161819x;

    /* renamed from: y */
    public C96814a.C57541b f161820y;

    /* renamed from: z */
    public String f161821z = String.valueOf(hashCode());

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderVLogCompositionPlayView$a */
    public static final class C56518a implements C111823a {

        /* renamed from: d */
        public long f161822d = -1;

        /* renamed from: e */
        public final /* synthetic */ FinderVLogCompositionPlayView f161823e;

        public C56518a(FinderVLogCompositionPlayView finderVLogCompositionPlayView) {
            this.f161823e = finderVLogCompositionPlayView;
        }

        /* renamed from: b */
        public void mo79528b(long j) {
            C59684w2 lifecycle = this.f161823e.getLifecycle();
            if (lifecycle != null) {
                FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f161823e;
                lifecycle.mo78296d(finderVLogCompositionPlayView.f161801B, j - finderVLogCompositionPlayView.getPlayStart(), this.f161823e.getVideoDurationMs());
            }
            long j2 = this.f161822d;
            if (j2 == -1 || j - j2 > 1000 || j < j2) {
                C59684w2 lifecycle2 = this.f161823e.getLifecycle();
                if (lifecycle2 != null) {
                    FinderVLogCompositionPlayView finderVLogCompositionPlayView2 = this.f161823e;
                    lifecycle2.mo78294c(finderVLogCompositionPlayView2.f161801B, (int) ((j - finderVLogCompositionPlayView2.getPlayStart()) / ((long) 1000)), this.f161823e.getVideoDuration());
                }
                this.f161822d = j;
            }
            if (this.f161823e.getVideoDurationMs() > 0 && j > 0 && this.f161823e.getVideoDurationMs() - j <= 500) {
                FinderVLogCompositionPlayView finderVLogCompositionPlayView3 = this.f161823e;
                if (!finderVLogCompositionPlayView3.f161803D && finderVLogCompositionPlayView3.f319845n) {
                    C59684w2 lifecycle3 = finderVLogCompositionPlayView3.getLifecycle();
                    if (lifecycle3 != null) {
                        lifecycle3.mo78299h(this.f161823e.f161801B);
                    }
                    this.f161823e.f161803D = true;
                }
            }
        }

        /* renamed from: h */
        public void mo79529h() {
            FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f161823e;
            C96814a.C57541b bVar = finderVLogCompositionPlayView.f161820y;
            if (bVar != null) {
                bVar.mo22960T(finderVLogCompositionPlayView.f161821z, finderVLogCompositionPlayView.f161800A, "", -1, -1);
            }
        }

        /* renamed from: i */
        public void mo79530i() {
            FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f161823e;
            C96814a.C57541b bVar = finderVLogCompositionPlayView.f161820y;
            if (bVar != null) {
                bVar.mo22958L(finderVLogCompositionPlayView.f161821z, finderVLogCompositionPlayView.f161800A);
            }
        }

        /* renamed from: o */
        public void mo79531o() {
            C59684w2 lifecycle;
            FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f161823e;
            C96814a.C57541b bVar = finderVLogCompositionPlayView.f161820y;
            if (bVar != null) {
                bVar.mo22965m0(finderVLogCompositionPlayView.f161821z, finderVLogCompositionPlayView.f161800A);
            }
            FinderVLogCompositionPlayView finderVLogCompositionPlayView2 = this.f161823e;
            if ((finderVLogCompositionPlayView2.f161802C || !finderVLogCompositionPlayView2.f319845n) && (lifecycle = finderVLogCompositionPlayView2.getLifecycle()) != null) {
                lifecycle.mo77475e(this.f161823e.f161801B);
            }
            FinderVLogCompositionPlayView finderVLogCompositionPlayView3 = this.f161823e;
            finderVLogCompositionPlayView3.f161802C = false;
            finderVLogCompositionPlayView3.f161803D = false;
        }

        /* renamed from: r */
        public void mo79532r() {
            FinderVLogCompositionPlayView finderVLogCompositionPlayView = this.f161823e;
            C96814a.C57541b bVar = finderVLogCompositionPlayView.f161820y;
            if (bVar != null) {
                bVar.mo22956I1(finderVLogCompositionPlayView.f161821z, finderVLogCompositionPlayView.f161800A);
            }
            C59684w2 lifecycle = this.f161823e.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo78304m(this.f161823e.f161801B, 0);
            }
        }

        /* renamed from: u */
        public void mo79533u() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVLogCompositionPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setPlayerCallback(new C56518a(this));
    }

    /* access modifiers changed from: private */
    public final long getPlayStart() {
        C110807k composition = getComposition();
        if (composition != null) {
            return composition.mo162388k();
        }
        return 0;
    }

    /* renamed from: A */
    public void mo78597A(C58924d dVar, int i, int i2, long j) {
        C87412m.m108594g(dVar, "txPlayer");
    }

    /* renamed from: B */
    public boolean mo51221B(Integer num) {
        Class cls = C65000f.class;
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + " startOrPlay, " + this.f319844j + ", " + isPlaying());
        boolean z = this.f161817v;
        if (!this.f319844j) {
            setFirstFrame(true);
        }
        if (getComposition() == null) {
            C31606c cVar = this.f161804E;
            if (cVar != null) {
                cVar.destroy();
            }
            Rect rect = null;
            this.f161804E = null;
            EffectManager effectManager = this.f161805F;
            if (effectManager != null) {
                effectManager.mo154931k();
            }
            this.f161805F = null;
            C64689rq2 rq22 = this.f161801B;
            C64899zy zyVar = rq22 != null ? rq22.f185235B : null;
            if (zyVar != null) {
                C31606c gp = ((C65000f) C86312j.m106911c(cls)).mo89191gp(zyVar);
                this.f161804E = gp;
                if (gp != null) {
                    gp.start();
                }
                EffectManager effectManager2 = new EffectManager();
                this.f161805F = effectManager2;
                C101758az azVar = zyVar.f186904i;
                if (azVar.f297915z == null && azVar.f297894A == null) {
                    if (this.f161809J) {
                        C101758az azVar2 = zyVar.f186904i;
                        rect = new Rect(0, 0, azVar2.f297897e, azVar2.f297898f);
                    }
                } else if (this.f161809J) {
                    rect = new Rect();
                    ((C65000f) C86312j.m106911c(cls)).mo89209x8(zyVar.f186904i.f297915z.f184446d, rect);
                } else {
                    rect = new Rect();
                    ((C65000f) C86312j.m106911c(cls)).mo89209x8(zyVar.f186904i.f297894A.f184446d, rect);
                }
                C65000f fVar = (C65000f) C86312j.m106911c(cls);
                C31606c cVar2 = this.f161804E;
                C87412m.m108591d(cVar2);
                mo79510k(fVar.bo0(zyVar, effectManager2, cVar2, rect, zyVar.f186904i.f297904o));
            }
        } else if (!isPlaying()) {
            mo154761h();
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo51223a(double d, boolean z) {
        mo154762i(((long) (d * ((double) 1000))) + getPlayStart());
        if (z) {
            C60171g1.C8767a.m8577a(this, (Integer) null, 1, (Object) null);
        }
        return true;
    }

    /* renamed from: b */
    public void mo79504b() {
        C96814a.C57541b bVar;
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + " createPlayer");
        super.mo79504b();
        C96814a.C57541b bVar2 = this.f161820y;
        if (bVar2 != null) {
            bVar2.mo22962Z(this.f161821z, this.f161800A);
        }
        C110807k composition = getComposition();
        Size h = composition != null ? composition.mo162385h() : null;
        if (h != null && (bVar = this.f161820y) != null) {
            bVar.mo22964l0(this.f161821z, this.f161800A, h.getWidth(), h.getHeight());
        }
    }

    /* renamed from: c */
    public void mo78608c() {
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + " onUIDestroy");
        this.f161814s = false;
        this.f161817v = true;
        this.f161802C = true;
        this.f161814s = false;
        mo154756f();
        C31606c cVar = this.f161804E;
        if (cVar != null) {
            cVar.destroy();
        }
        EffectManager effectManager = this.f161805F;
        if (effectManager != null) {
            effectManager.mo154931k();
        }
    }

    /* renamed from: d */
    public void mo78609d() {
    }

    public void destroyDrawingCache() {
        super.destroyDrawingCache();
        if (this.f161810K) {
            mo79527u();
        }
    }

    /* renamed from: g */
    public boolean mo78610g() {
        return this.f161816u;
    }

    public int getContextTag() {
        return this.f161807H;
    }

    public long getCurrentPlayMs() {
        C111829g player = getPlayer();
        return (player != null ? player.mo163542a() : 0) - getPlayStart();
    }

    public int getCurrentPlaySecond() {
        C111829g player = getPlayer();
        return ((int) ((player != null ? player.mo163542a() : 0) - getPlayStart())) / 1000;
    }

    public C59318d getEventDetector() {
        return null;
    }

    public boolean getIsNeverStart() {
        return this.f161817v;
    }

    public boolean getIsShouldPlayResume() {
        return this.f161815t;
    }

    public final C59684w2 getLifecycle() {
        return this.f161819x;
    }

    public final C59673q2 getMediaInfo() {
        return this.f161813r;
    }

    public final C59674r2 getMuteListener() {
        return this.f161818w;
    }

    public ViewParent getParentView() {
        return getParent();
    }

    public Object getPlayer() {
        return getPlayer();
    }

    public C59662l2 getVideoAdapter() {
        return null;
    }

    public int getVideoDuration() {
        C110807k composition = getComposition();
        return ((int) (composition != null ? composition.mo162384g() : 0)) / 1000;
    }

    public long getVideoDurationMs() {
        C110807k composition = getComposition();
        if (composition != null) {
            return composition.mo162384g();
        }
        return 0;
    }

    public String getVideoMediaId() {
        C59673q2 q2Var = this.f161813r;
        if (q2Var != null) {
            return q2Var.f170493c;
        }
        return null;
    }

    public C59673q2 getVideoMediaInfo() {
        return this.f161813r;
    }

    public View getVideoView() {
        return this;
    }

    public boolean getVideoViewFocused() {
        return this.f161814s;
    }

    public final boolean get_isPreviewing() {
        return this.f161816u;
    }

    /* renamed from: k */
    public void mo79510k(C110807k kVar) {
        C59684w2 w2Var;
        C87412m.m108594g(kVar, "composition");
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + " start");
        if (!this.f161814s) {
            Log.m105928w("MicroMsg.FinderVLogCompositionPlayView", "isViewFocused=" + this.f161814s);
            return;
        }
        if (this.f161817v && (w2Var = this.f161819x) != null) {
            C59673q2 q2Var = this.f161813r;
            w2Var.mo78305n(q2Var != null ? q2Var.f170494d : null, q2Var, 0);
        }
        if (!this.f319844j) {
            super.mo79510k(kVar);
        } else if (!isPlaying()) {
            mo154761h();
        }
        this.f161817v = false;
    }

    /* renamed from: n */
    public void mo78638n() {
    }

    /* renamed from: o */
    public void mo78639o(C62369u0 u0Var, boolean z, FeedData feedData) {
        C87412m.m108594g(u0Var, "video");
        C87412m.m108594g(feedData, "feedData");
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + " setVideoMedia video:" + u0Var + ", isLocal:" + z);
        this.f161801B = u0Var.mo87421f();
        String b = ((C62367r0) u0Var).mo11841b();
        this.f161800A = b;
        this.f161813r = new C59673q2("", "", b, this.f161801B, u0Var, feedData);
    }

    public void onAttachedToWindow() {
        if (this.f161810K) {
            mo79514r();
        }
        super.onAttachedToWindow();
        if (this.f161810K) {
            mo79527u();
        }
    }

    public void onDetachedFromWindow() {
        if (this.f161810K) {
            mo79514r();
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FinderVLogCompositionPlayView", e, "unkown error", new Object[0]);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        this.f161806G = getCurrentPlayMs();
        C31606c cVar = this.f161804E;
        if (cVar != null) {
            cVar.destroy();
        }
        this.f161804E = null;
        EffectManager effectManager = this.f161805F;
        if (effectManager != null) {
            effectManager.mo154931k();
        }
        this.f161805F = null;
        setComposition((C110807k) null);
        super.onSurfaceTextureDestroyed(surfaceTexture);
        setPlayer((C111829g) null);
        return false;
    }

    /* renamed from: p */
    public C62294j mo78640p(long j) {
        return null;
    }

    public boolean pause() {
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + "  pause");
        super.pause();
        C96814a.C57541b bVar = this.f161820y;
        if (bVar != null) {
            bVar.mo22963a0(this.f161821z, this.f161800A);
        }
        C59684w2 w2Var = this.f161819x;
        if (w2Var == null) {
            return true;
        }
        C59684w2.C59685a.m69601a(w2Var, this.f161801B, (C61575s) null, 2, (Object) null);
        return true;
    }

    public boolean play() {
        C111829g player;
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + " play");
        if (getComposition() == null) {
            C60171g1.C8767a.m8577a(this, (Integer) null, 1, (Object) null);
            mo154762i(this.f161806G);
        } else if (!this.f319844j && (player = getPlayer()) != null) {
            player.mo163544c();
        }
        C96814a.C57541b bVar = this.f161820y;
        if (bVar != null) {
            bVar.mo22965m0(this.f161821z, this.f161800A);
        }
        C59684w2 w2Var = this.f161819x;
        if (w2Var != null) {
            w2Var.mo77475e(this.f161801B);
        }
        return true;
    }

    /* renamed from: q */
    public int mo51226q() {
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + "  pauseWithCancel");
        this.f161813r = null;
        super.pause();
        return 0;
    }

    /* renamed from: r */
    public final void mo79514r() {
        try {
            Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", "hookInnerDetach");
            Field declaredField = TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f161811L = declaredField.get(this);
            declaredField.set(this, (Object) null);
            Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f161812M = declaredField2.get(this);
            declaredField2.set(this, (Object) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FinderVLogCompositionPlayView", e, "", new Object[0]);
        }
    }

    /* renamed from: s */
    public boolean mo51228s() {
        return false;
    }

    public void setContextTag(int i) {
        this.f161807H = i;
    }

    public void setFinderVideoPlayTrace(C12931a aVar) {
    }

    public void setFullScreenEnjoy(boolean z) {
    }

    public void setFullscreen(boolean z) {
        this.f161809J = z;
    }

    public void setIMMVideoViewCallback(C60157c5 c5Var) {
        C87412m.m108594g(c5Var, "_callback");
        this.f161820y = c5Var;
    }

    public void setIOnlineVideoProxy(C55394a aVar) {
        C87412m.m108594g(aVar, "_proxy");
    }

    public void setInterceptDetach(boolean z) {
        this.f161810K = z;
    }

    public final void setInterceptedDetach(boolean z) {
        this.f161810K = z;
    }

    public void setIsShouldPlayResume(boolean z) {
        this.f161815t = z;
    }

    public void setIsShowBasicControls(boolean z) {
    }

    public final void setLifecycle(C59684w2 w2Var) {
        this.f161819x = w2Var;
    }

    public final void setMediaInfo(C59673q2 q2Var) {
        this.f161813r = q2Var;
    }

    public void setMute(boolean z) {
        Player player;
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + "  setMute:" + z);
        C111829g gVar = this.f319838d;
        if (!(gVar == null || (player = gVar.f334836a) == null)) {
            player.setVolume(z ? 0.0f : 1.0f);
        }
        C59674r2 r2Var = this.f161818w;
        if (r2Var != null) {
            r2Var.mo79550b(z);
        }
    }

    public final void setMuteListener(C59674r2 r2Var) {
        this.f161818w = r2Var;
    }

    public final void setNeverStart(boolean z) {
        this.f161817v = z;
    }

    public void setPreloadedView(boolean z) {
        this.f161808I = z;
    }

    public void setPreview(boolean z) {
        this.f161816u = z;
    }

    public void setScaleType(C96814a.C96817e eVar) {
        C87412m.m108594g(eVar, "scaleType");
    }

    public final void setShouldPlayResume(boolean z) {
        this.f161815t = z;
    }

    public final void setShowFullscreen(boolean z) {
        this.f161809J = z;
    }

    public void setVideoMuteListener(C59674r2 r2Var) {
        C87412m.m108594g(r2Var, "muteListener");
        this.f161818w = r2Var;
    }

    public void setVideoPlayLifecycle(C59684w2 w2Var) {
        this.f161819x = w2Var;
    }

    public void setVideoViewFocused(boolean z) {
        this.f161814s = z;
    }

    public final void setViewFocused(boolean z) {
        this.f161814s = z;
    }

    public final void set_isPreviewing(boolean z) {
        this.f161816u = z;
    }

    public void stop() {
        Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", hashCode() + " stop");
        super.stop();
        C59684w2 w2Var = this.f161819x;
        if (w2Var != null) {
            C59684w2.C59685a.m69602b(w2Var, this.f161813r, (C61575s) null, 2, (Object) null);
        }
        this.f161817v = true;
        this.f161802C = true;
        this.f161814s = false;
    }

    /* renamed from: t */
    public void mo51232t() {
    }

    /* renamed from: u */
    public final void mo79527u() {
        try {
            Log.m105924i("MicroMsg.FinderVLogCompositionPlayView", "unHookInnerDetach");
            if (this.f161811L != null) {
                Field declaredField = TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f161811L);
                this.f161811L = null;
            }
            if (this.f161812M != null) {
                Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f161812M);
                this.f161812M = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FinderVLogCompositionPlayView", e, "", new Object[0]);
        }
    }

    /* renamed from: v */
    public boolean mo78668v() {
        return false;
    }

    /* renamed from: w */
    public void mo78669w() {
    }

    /* renamed from: x */
    public boolean mo51233x(double d, boolean z, int i) {
        mo51223a(d, z);
        return true;
    }

    /* renamed from: y */
    public boolean mo78670y() {
        return this.f161808I;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVLogCompositionPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        setPlayerCallback(new C56518a(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVLogCompositionPlayView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        setPlayerCallback(new C56518a(this));
    }
}
