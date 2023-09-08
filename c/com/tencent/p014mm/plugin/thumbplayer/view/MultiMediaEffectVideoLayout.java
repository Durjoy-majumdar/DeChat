package com.tencent.p014mm.plugin.thumbplayer.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g03.C107666c;
import g03.C107678m;
import g03.C107679n;
import g03.C107680o;
import g03.C32296g;
import gy3.C87412m;
import h03.C107989a;
import i03.C60240c;
import java.util.List;
import kotlin.Metadata;
import m03.C109458k;
import m03.C109459m;
import m03.C61426c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import vp3.C111596i;
import vp3.C111598k;
import vp3.C111601n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010T\u001a\u00020S\u0012\b\u0010V\u001a\u0004\u0018\u00010U¢\u0006\u0004\bW\u0010XB#\b\u0016\u0012\u0006\u0010T\u001a\u00020S\u0012\b\u0010V\u001a\u0004\u0018\u00010U\u0012\u0006\u0010Z\u001a\u00020Y¢\u0006\u0004\bW\u0010[J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR:\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010,\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00104\u001a\u0004\u0018\u00010-8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u0010<\u001a\u0004\u0018\u0001052\b\u0010\u0016\u001a\u0004\u0018\u0001058\u0016@VX\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R:\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b=\u0010 \u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$RR\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010A2\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010A8\u0016@VX\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010I\u001a\u00020\u00118V@\u0016X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020O8VX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006\\"}, mo182094d2 = {"Lcom/tencent/mm/plugin/thumbplayer/view/MultiMediaEffectVideoLayout;", "Landroid/widget/FrameLayout;", "Lm03/c;", "Landroid/view/TextureView$SurfaceTextureListener;", "", "Ld03/a;", "mediaList", "Lrx3/b0;", "setMediaList", "getMediaList", "", "mute", "setMute", "media", "setPlayLoopForMedia", "loop", "setLoop", "", "getCurrentPositionMs", "Lcom/tencent/mm/xeffect/effect/EffectManager;", "getEffectManager", "Lg03/o;", "value", "h", "Lg03/o;", "getPlayStatusChangeListener", "()Lg03/o;", "setPlayStatusChangeListener", "(Lg03/o;)V", "playStatusChangeListener", "Lkotlin/Function0;", "i", "Lfy3/a;", "getOnPlayFinishListener", "()Lfy3/a;", "setOnPlayFinishListener", "(Lfy3/a;)V", "onPlayFinishListener", "j", "Z", "getPauseOnVideoPlay", "()Z", "setPauseOnVideoPlay", "(Z)V", "pauseOnVideoPlay", "Lm03/k;", "n", "Lm03/k;", "getMvMusicProxy", "()Lm03/k;", "setMvMusicProxy", "(Lm03/k;)V", "mvMusicProxy", "Lm03/m;", "o", "Lm03/m;", "getMediaChangeListener", "()Lm03/m;", "setMediaChangeListener", "(Lm03/m;)V", "mediaChangeListener", "p", "getFirstFrameRenderCallback", "setFirstFrameRenderCallback", "firstFrameRenderCallback", "Lkotlin/Function2;", "q", "Lfy3/p;", "getOnProgressCallback", "()Lfy3/p;", "setOnProgressCallback", "(Lfy3/p;)V", "onProgressCallback", "totalDuration", "J", "getTotalDuration", "()J", "setTotalDuration", "(J)V", "Li03/c;", "getReportInfo", "()Li03/c;", "reportInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-thumbplayer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout */
public final class MultiMediaEffectVideoLayout extends FrameLayout implements C61426c, TextureView.SurfaceTextureListener {

    /* renamed from: d */
    public final String f316380d = "MicroMsg.MultiMediaEffectVideoLayout";

    /* renamed from: e */
    public final TextureView f316381e;

    /* renamed from: f */
    public final C107666c f316382f;

    /* renamed from: g */
    public long f316383g;

    /* renamed from: h */
    public C107680o f316384h;

    /* renamed from: i */
    public C32224a<C13598b0> f316385i;

    /* renamed from: j */
    public boolean f316386j;

    /* renamed from: n */
    public C109458k f316387n;

    /* renamed from: o */
    public C109459m f316388o;

    /* renamed from: p */
    public C32224a<C13598b0> f316389p;

    /* renamed from: q */
    public C32227p<? super Long, ? super C58010a, C13598b0> f316390q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiMediaEffectVideoLayout(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        TextureView textureView = new TextureView(getContext());
        this.f316381e = textureView;
        this.f316382f = new C107666c();
        this.f316383g = -1;
        textureView.setAlpha(1.0f);
        textureView.setSurfaceTextureListener(this);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo86373a(long j, long j2) {
        C107666c cVar = this.f316382f;
        String str = cVar.f322101g;
        Log.m105924i(str, "setPlayRange:[" + j + ", " + j2 + "], renderPts:" + cVar.f322111q + ", playStatus:" + cVar.f322110p);
        cVar.f322116v = j;
        cVar.f322117w = j2;
        if (cVar.f322110p == C107666c.C107668b.Started) {
            cVar.mo158083f(cVar.f322116v);
        }
    }

    /* renamed from: b */
    public void mo86374b(C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        C107666c cVar = this.f316382f;
        cVar.getClass();
        cVar.f322102h.mo163271h(new C32296g(lVar));
    }

    /* renamed from: c */
    public void mo86375c() {
        C107666c cVar = this.f316382f;
        C111601n nVar = cVar.f322102h;
        long j = cVar.f322111q;
        nVar.getClass();
        nVar.mo163269e(new C111596i(nVar, j));
    }

    /* renamed from: d */
    public void mo86376d() {
        C107666c cVar = this.f316382f;
        Log.m105924i(cVar.f322101g, "clearPlayRange");
        cVar.f322116v = -1;
        cVar.f322117w = -1;
    }

    /* renamed from: e */
    public void mo86377e() {
        Log.m105924i(this.f316380d, "startIgnoreMusicPosition");
        this.f316382f.mo158088k();
        this.f316383g = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088 A[LOOP:0: B:10:0x0045->B:34:0x0088, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c A[EDGE_INSN: B:45:0x008c->B:36:0x008c ?: BREAK  , SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86378f(d03.C58010a r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "prevTransitionMedia"
            gy3.C87412m.m108594g(r14, r0)
            boolean r0 = r14 instanceof i03.C60241d
            r1 = 0
            if (r0 == 0) goto L_0x000d
            i03.d r14 = (i03.C60241d) r14
            goto L_0x000e
        L_0x000d:
            r14 = r1
        L_0x000e:
            if (r14 == 0) goto L_0x00e4
            g03.c r0 = r13.f316382f
            r0.getClass()
            java.lang.String r2 = r0.f322101g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setTransition, mediaId:"
            r3.append(r4)
            java.lang.String r4 = r14.f165947s
            r3.append(r4)
            java.lang.String r4 = ", transitionPath:"
            r3.append(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            g03.n r2 = r0.f322108n
            if (r2 == 0) goto L_0x00e4
            java.util.ArrayList<g03.m> r2 = r2.f322149a
            if (r2 != 0) goto L_0x003f
            goto L_0x00e4
        L_0x003f:
            java.util.Iterator r3 = r2.iterator()
            r4 = 0
            r5 = 0
        L_0x0045:
            boolean r6 = r3.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x008b
            java.lang.Object r6 = r3.next()
            g03.m r6 = (g03.C107678m) r6
            d03.a r8 = r6.f322148h
            if (r8 == 0) goto L_0x0059
            java.lang.String r8 = r8.f165947s
            goto L_0x005a
        L_0x0059:
            r8 = r1
        L_0x005a:
            java.lang.String r9 = r14.f165947s
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x0084
            d03.a r6 = r6.f322148h
            if (r6 == 0) goto L_0x0070
            long r8 = r6.f165942n
            long r10 = r14.f165942n
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0070
            r8 = 1
            goto L_0x0071
        L_0x0070:
            r8 = 0
        L_0x0071:
            if (r8 == 0) goto L_0x0084
            if (r6 == 0) goto L_0x007f
            long r8 = r6.f165943o
            long r10 = r14.f165943o
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x007f
            r6 = 1
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 == 0) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            if (r6 == 0) goto L_0x0088
            goto L_0x008c
        L_0x0088:
            int r5 = r5 + 1
            goto L_0x0045
        L_0x008b:
            r5 = -1
        L_0x008c:
            java.lang.String r14 = r0.f322101g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "found transition trackIndex:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", trackList.size:"
            r3.append(r4)
            int r4 = r2.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            if (r5 < 0) goto L_0x00e4
            int r14 = r2.size()
            int r14 = r14 - r7
            if (r5 >= r14) goto L_0x00e4
            vp3.n r14 = r0.f322102h
            com.tencent.mm.xeffect.effect.EffectManager r14 = r14.f334033b
            java.lang.Object r3 = r2.get(r5)
            java.lang.String r4 = "trackList[trackIndex]"
            gy3.C87412m.m108593f(r3, r4)
            g03.m r3 = (g03.C107678m) r3
            int r5 = r5 + r7
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r4 = "trackList[trackIndex + 1]"
            gy3.C87412m.m108593f(r2, r4)
            g03.m r2 = (g03.C107678m) r2
            sp3.h r4 = r3.f322147g
            rr3.c0 r5 = r4.f331494b
            if (r5 == 0) goto L_0x00dd
            r14.mo154935o(r5)
            r4.f331494b = r1
        L_0x00dd:
            if (r15 == 0) goto L_0x00e4
            r4.f331493a = r15
            r0.mo158087j(r3, r2)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout.mo86378f(d03.a, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r5 = r5.f322148h;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0099 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo86379g(d03.C58010a r10) {
        /*
            r9 = this;
            java.lang.String r0 = "mediaInfo"
            gy3.C87412m.m108594g(r10, r0)
            g03.c r0 = r9.f316382f
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r1 = r0.f322105k
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L_0x0065
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r1 = r0.f322105k
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r1.next()
            r5 = r4
            h03.a r5 = (h03.C107989a) r5
            g03.m r5 = r5.f323390h
            if (r5 == 0) goto L_0x0033
            d03.a r5 = r5.f322148h
            if (r5 == 0) goto L_0x0033
            java.lang.String r5 = r5.f165947s
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            java.lang.String r6 = r10.f165947s
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x001b
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            h03.a r4 = (h03.C107989a) r4
            if (r4 == 0) goto L_0x0065
            boolean r1 = r4 instanceof h03.C107999j
            if (r1 == 0) goto L_0x0065
            java.lang.String r1 = r0.f322101g
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "getThumbFetcherExtraData get from playingPlayer mediaId:"
            r5.append(r6)
            java.lang.String r6 = r10.f165947s
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            h03.j r4 = (h03.C107999j) r4
            j03.d r1 = r4.f323430l
            j03.d$a r1 = r1.f172876g
            goto L_0x0066
        L_0x0065:
            r1 = r3
        L_0x0066:
            if (r1 != 0) goto L_0x00c0
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r4 = r0.f322106l
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x00c0
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r4 = r0.f322106l
            java.util.Iterator r4 = r4.iterator()
        L_0x0077:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0099
            java.lang.Object r5 = r4.next()
            r6 = r5
            h03.a r6 = (h03.C107989a) r6
            g03.m r6 = r6.f323390h
            if (r6 == 0) goto L_0x008f
            d03.a r6 = r6.f322148h
            if (r6 == 0) goto L_0x008f
            java.lang.String r6 = r6.f165947s
            goto L_0x0090
        L_0x008f:
            r6 = r3
        L_0x0090:
            java.lang.String r7 = r10.f165947s
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x0077
            goto L_0x009a
        L_0x0099:
            r5 = r3
        L_0x009a:
            h03.a r5 = (h03.C107989a) r5
            if (r5 == 0) goto L_0x00c0
            boolean r4 = r5 instanceof h03.C107999j
            if (r4 == 0) goto L_0x00c0
            java.lang.String r1 = r0.f322101g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getThumbFetcherExtraData get from pendingPlayer mediaId:"
            r4.append(r6)
            java.lang.String r6 = r10.f165947s
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            h03.j r5 = (h03.C107999j) r5
            j03.d r1 = r5.f323430l
            j03.d$a r1 = r1.f172876g
        L_0x00c0:
            if (r1 != 0) goto L_0x013a
            java.util.ArrayList<d03.a> r4 = r0.f322109o
            r5 = 0
            java.util.Iterator r4 = r4.iterator()
        L_0x00c9:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00e3
            java.lang.Object r6 = r4.next()
            d03.a r6 = (d03.C58010a) r6
            java.lang.String r6 = r6.f165947s
            java.lang.String r7 = r10.f165947s
            boolean r6 = gy3.C87412m.m108589b(r6, r7)
            if (r6 == 0) goto L_0x00e0
            goto L_0x00e4
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00c9
        L_0x00e3:
            r5 = -1
        L_0x00e4:
            if (r5 >= 0) goto L_0x00e7
            goto L_0x013b
        L_0x00e7:
            g03.n r4 = r0.f322108n
            if (r4 != 0) goto L_0x00ec
            goto L_0x013b
        L_0x00ec:
            java.util.ArrayList<g03.m> r6 = r4.f322149a
            int r6 = r6.size()
            if (r5 < r6) goto L_0x00f5
            goto L_0x013b
        L_0x00f5:
            java.lang.String r6 = r0.f322101g
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getThumbFetcherExtraData try create new one index:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = ", mediaId:"
            r7.append(r8)
            java.lang.String r10 = r10.f165947s
            r7.append(r10)
            java.lang.String r10 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            java.util.ArrayList<g03.m> r10 = r4.f322149a
            java.lang.Object r10 = r10.get(r5)
            java.lang.String r4 = "composition.trackList[index]"
            gy3.C87412m.m108593f(r10, r4)
            g03.m r10 = (g03.C107678m) r10
            h03.a r10 = r0.mo158079b(r10, r2)
            if (r10 != 0) goto L_0x0129
            goto L_0x013b
        L_0x0129:
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r0 = r0.f322107m
            r0.add(r10)
            boolean r0 = r10 instanceof h03.C107999j
            if (r0 == 0) goto L_0x013a
            h03.j r10 = (h03.C107999j) r10
            j03.d r10 = r10.f323430l
            j03.d$a r10 = r10.f172876g
            r3 = r10
            goto L_0x013b
        L_0x013a:
            r3 = r1
        L_0x013b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout.mo86379g(d03.a):java.lang.Object");
    }

    public long getCurrentPositionMs() {
        return this.f316382f.f322111q;
    }

    public EffectManager getEffectManager() {
        return this.f316382f.f322102h.f334033b;
    }

    public C32224a<C13598b0> getFirstFrameRenderCallback() {
        return this.f316389p;
    }

    public C109459m getMediaChangeListener() {
        return this.f316388o;
    }

    public List<C58010a> getMediaList() {
        return this.f316382f.f322109o;
    }

    public C109458k getMvMusicProxy() {
        return this.f316387n;
    }

    public C32224a<C13598b0> getOnPlayFinishListener() {
        return this.f316385i;
    }

    public C32227p<Long, C58010a, C13598b0> getOnProgressCallback() {
        return this.f316390q;
    }

    public boolean getPauseOnVideoPlay() {
        return this.f316386j;
    }

    public C107680o getPlayStatusChangeListener() {
        return this.f316384h;
    }

    public C60240c getReportInfo() {
        return this.f316382f.f322094B;
    }

    public long getTotalDuration() {
        C107679n nVar = this.f316382f.f322108n;
        if (nVar == null || !(!nVar.f322149a.isEmpty())) {
            return 0;
        }
        return ((C107678m) C110818d0.m150923U(nVar.f322149a)).f322143c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0044, code lost:
        r3 = r3.f322149a;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86383h(int r6, long r7) {
        /*
            r5 = this;
            g03.c r0 = r5.f316382f
            java.lang.String r1 = r0.f322101g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "seekToIndexTime, index:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", seekTo:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", renderPts:"
            r2.append(r3)
            long r3 = r0.f322111q
            r2.append(r3)
            java.lang.String r3 = ", playingPlayers.size:"
            r2.append(r3)
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r3 = r0.f322105k
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = ", status:"
            r2.append(r3)
            g03.c$b r3 = r0.f322110p
            r2.append(r3)
            java.lang.String r3 = ", trackList.size:"
            r2.append(r3)
            g03.n r3 = r0.f322108n
            if (r3 == 0) goto L_0x0051
            java.util.ArrayList<g03.m> r3 = r3.f322149a
            if (r3 == 0) goto L_0x0051
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            g03.n r1 = r0.f322108n
            if (r1 == 0) goto L_0x007f
            java.util.ArrayList<g03.m> r1 = r1.f322149a
            if (r1 != 0) goto L_0x0065
            goto L_0x007f
        L_0x0065:
            int r2 = r1.size()
            if (r6 <= r2) goto L_0x006c
            goto L_0x007f
        L_0x006c:
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r1 = "trackList[index]"
            gy3.C87412m.m108593f(r6, r1)
            g03.m r6 = (g03.C107678m) r6
            long r1 = r6.f322142b
            long r1 = r1 + r7
            r0.f322118x = r1
            r0.mo158084g(r6, r7)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout.mo86383h(int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x003c, code lost:
        r3 = r3.f322149a;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86384i(int r8) {
        /*
            r7 = this;
            g03.c r0 = r7.f316382f
            java.lang.String r1 = r0.f322101g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "seekToIndex:"
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", renderPts:"
            r2.append(r3)
            long r3 = r0.f322111q
            r2.append(r3)
            java.lang.String r3 = ", playingPlayers.size:"
            r2.append(r3)
            java.util.concurrent.ConcurrentLinkedDeque<h03.a> r3 = r0.f322105k
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = ", status:"
            r2.append(r3)
            g03.c$b r3 = r0.f322110p
            r2.append(r3)
            java.lang.String r3 = ", trackList.size:"
            r2.append(r3)
            g03.n r3 = r0.f322108n
            if (r3 == 0) goto L_0x0049
            java.util.ArrayList<g03.m> r3 = r3.f322149a
            if (r3 == 0) goto L_0x0049
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            g03.n r1 = r0.f322108n
            if (r1 == 0) goto L_0x00a0
            java.util.ArrayList<g03.m> r1 = r1.f322149a
            if (r1 != 0) goto L_0x005d
            goto L_0x00a0
        L_0x005d:
            int r2 = r1.size()
            if (r8 <= r2) goto L_0x0064
            goto L_0x00a0
        L_0x0064:
            java.lang.Object r8 = r1.get(r8)
            java.lang.String r1 = "trackList[index]"
            gy3.C87412m.m108593f(r8, r1)
            g03.m r8 = (g03.C107678m) r8
            long r1 = r8.f322144d
            java.lang.String r3 = r0.f322101g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "found seek target track:"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r5 = ", trackSeekTime:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", trackStartTimeMs:"
            r4.append(r5)
            long r5 = r8.f322144d
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            long r3 = r8.f322142b
            r0.f322118x = r3
            r0.mo158084g(r8, r1)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout.mo86384i(int):void");
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        String str = this.f316380d;
        Log.m105924i(str, "onSurfaceTextureAvailable, size:[" + i + ',' + i2 + "], surface:" + surfaceTexture);
        this.f316382f.mo158086i(i, i2);
        C107666c cVar = this.f316382f;
        cVar.getClass();
        String str2 = cVar.f322101g;
        Log.m105924i(str2, "attachSurface:" + surfaceTexture);
        C111601n nVar = cVar.f322102h;
        Surface surface = new Surface(surfaceTexture);
        nVar.f334038g = surface;
        if (nVar.f334037f != null) {
            nVar.mo163269e(new C111598k(nVar, surface));
        }
        cVar.f322119y = surfaceTexture;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
        String str = this.f316380d;
        Log.m105924i(str, "onSurfaceTextureDestroyed:" + surfaceTexture);
        C107666c cVar = this.f316382f;
        Log.m105924i(cVar.f322101g, "detachSurface");
        C111601n nVar = cVar.f322102h;
        nVar.f334038g = null;
        if (nVar.f334037f != null) {
            nVar.mo163269e(new C111598k(nVar, (Surface) null));
        }
        cVar.f322119y = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C87412m.m108594g(surfaceTexture, "surface");
        String str = this.f316380d;
        Log.m105924i(str, "onSurfaceTextureSizeChanged, size:[" + i + ',' + i2 + "], surface:" + surfaceTexture);
        this.f316382f.mo158086i(i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surface");
    }

    public void pause() {
        this.f316382f.mo158080c();
        C109458k mvMusicProxy = getMvMusicProxy();
        this.f316383g = mvMusicProxy != null ? mvMusicProxy.getCurrentPosition() : -1;
    }

    public void release() {
        C107666c cVar = this.f316382f;
        synchronized (cVar) {
            cVar.f322102h.mo163270f();
            cVar.f322102h.mo163259b();
            cVar.mo158082e();
            cVar.f322108n = null;
            cVar.f322109o.clear();
            cVar.f322110p = C107666c.C107668b.Unknown;
        }
    }

    public void resume() {
        C107989a aVar;
        C107666c cVar = this.f316382f;
        String str = cVar.f322101g;
        Log.m105924i(str, "resume: " + cVar.f322110p + ", " + cVar.f322105k.size());
        C107666c.C107668b bVar = cVar.f322110p;
        C107666c.C107668b bVar2 = C107666c.C107668b.Started;
        if (bVar != bVar2 && (aVar = (C107989a) C110818d0.m150915M(cVar.f322105k)) != null) {
            String str2 = cVar.f322101g;
            Log.m105924i(str2, "resume: " + aVar.mo158379b());
            if (!aVar.mo158379b()) {
                cVar.f322110p = bVar2;
                return;
            }
            aVar.mo158385h();
            cVar.f322110p = bVar2;
            C107680o oVar = cVar.f322095a;
            if (oVar != null) {
                oVar.onResume();
            }
            cVar.mo158089l();
        }
    }

    public void seekTo(long j) {
        this.f316382f.mo158083f(j);
    }

    public void setFirstFrameRenderCallback(C32224a<C13598b0> aVar) {
        this.f316382f.f322098d = aVar;
        this.f316389p = aVar;
    }

    public void setLoop(boolean z) {
        C107666c cVar = this.f316382f;
        String str = cVar.f322101g;
        Log.m105924i(str, "setLoop:" + z);
        cVar.f322113s = z;
    }

    public void setMediaChangeListener(C109459m mVar) {
        this.f316382f.f322096b = mVar;
        this.f316388o = mVar;
    }

    public void setMediaList(List<? extends C58010a> list) {
        C87412m.m108594g(list, "mediaList");
        C107666c cVar = this.f316382f;
        String str = C107666c.f322091D;
        cVar.mo158085h(list, false);
    }

    public void setMute(boolean z) {
        C107666c cVar = this.f316382f;
        String str = cVar.f322101g;
        Log.m105924i(str, "setMute:" + z);
        cVar.f322112r = z;
    }

    public void setMvMusicProxy(C109458k kVar) {
        this.f316387n = kVar;
    }

    public void setOnPlayFinishListener(C32224a<C13598b0> aVar) {
        this.f316382f.f322100f = aVar;
        this.f316385i = aVar;
    }

    public void setOnProgressCallback(C32227p<? super Long, ? super C58010a, C13598b0> pVar) {
        this.f316382f.f322099e = pVar;
        this.f316390q = pVar;
    }

    public void setPauseOnVideoPlay(boolean z) {
        String str = this.f316380d;
        Log.m105924i(str, "set pauseOnVideoPlay:" + z);
        this.f316382f.f322097c = z;
        this.f316386j = z;
    }

    public void setPlayLoopForMedia(C58010a aVar) {
        C87412m.m108594g(aVar, "media");
        C107666c cVar = this.f316382f;
        cVar.getClass();
        String str = cVar.f322101g;
        Log.m105924i(str, "setPlayLoopForMedia, mediaId:" + aVar.f165947s);
        Log.m105924i(cVar.f322101g, "setLoop:true");
        cVar.f322113s = true;
        cVar.mo158085h(C26236u.m33719b(aVar), false);
        C109458k mvMusicProxy = getMvMusicProxy();
        if (mvMusicProxy != null) {
            mvMusicProxy.mo80423a((int) aVar.f165942n);
        }
    }

    public void setPlayStatusChangeListener(C107680o oVar) {
        this.f316382f.f322095a = oVar;
        this.f316384h = oVar;
    }

    public void setTotalDuration(long j) {
    }

    public void start() {
        C109458k mvMusicProxy = getMvMusicProxy();
        long currentPosition = mvMusicProxy != null ? mvMusicProxy.getCurrentPosition() : -1;
        if (currentPosition >= 0 && this.f316383g != currentPosition) {
            this.f316382f.mo158083f(currentPosition);
        }
        this.f316382f.mo158088k();
        this.f316383g = -1;
    }

    public void stop() {
        C107666c cVar = this.f316382f;
        String str = cVar.f322101g;
        Log.m105924i(str, "stop, current status:" + cVar.f322110p + ", playingPlayers.size:" + cVar.f322105k.size());
        if (!cVar.f322105k.isEmpty()) {
            cVar.f322105k.getFirst().mo158392o();
            cVar.mo158082e();
            cVar.f322110p = C107666c.C107668b.Stop;
            cVar.mo158090m();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiMediaEffectVideoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        TextureView textureView = new TextureView(getContext());
        this.f316381e = textureView;
        this.f316382f = new C107666c();
        this.f316383g = -1;
        textureView.setAlpha(1.0f);
        textureView.setSurfaceTextureListener(this);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiMediaEffectVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        TextureView textureView = new TextureView(getContext());
        this.f316381e = textureView;
        this.f316382f = new C107666c();
        this.f316383g = -1;
        textureView.setAlpha(1.0f);
        textureView.setSurfaceTextureListener(this);
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
    }
}
