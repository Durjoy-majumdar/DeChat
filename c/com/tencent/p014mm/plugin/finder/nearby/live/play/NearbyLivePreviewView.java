package com.tencent.p014mm.plugin.finder.nearby.live.play;

import ak1.C54101n0;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.view.ratio.RatioLayout;
import er1.C58739j4;
import f50.C58915a;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g50.C59364c;
import gr1.C59668o0;
import gy3.C87412m;
import gy3.C87413o;
import kf1.C61046o4;
import kotlin.Metadata;
import ns3.C11265c;
import o40.C61926c;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p50.C47428d;
import pe3.C89349b;
import ph1.C62290e;
import ph1.C62292g;
import pm1.C62378a;
import pm1.C62406w;
import rx3.C13598b0;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64293cq2;
import te3.C64890zp2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001@B\u001b\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=B#\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b<\u0010?J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0011J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00102\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b6\u00103\"\u0004\b7\u00105¨\u0006A"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/play/NearbyLivePreviewView;", "Landroid/widget/FrameLayout;", "Lns3/c;", "Lpm1/a;", "mediaSource", "Lrx3/b0;", "setMediaSource", "getMediaSource", "", "getVideoRatioWH", "", "getVideoWidth", "getVideoHeight", "scaleMode", "setScaleMode", "volume", "setVolume", "", "isMute", "setMute", "reuse", "setIsReuse", "Landroid/view/TextureView;", "getTextureView", "Lf50/d;", "d", "Lf50/d;", "getPlayer", "()Lf50/d;", "setPlayer", "(Lf50/d;)V", "player", "Lgr1/o0;", "e", "Lgr1/o0;", "getRenderView", "()Lgr1/o0;", "setRenderView", "(Lgr1/o0;)V", "renderView", "Landroid/graphics/SurfaceTexture;", "f", "Landroid/graphics/SurfaceTexture;", "getRenderSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "setRenderSurfaceTexture", "(Landroid/graphics/SurfaceTexture;)V", "renderSurfaceTexture", "u", "Z", "isFirstFrameRendered", "()Z", "setFirstFrameRendered", "(Z)V", "isReusePlayer", "setReusePlayer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView */
public final class NearbyLivePreviewView extends FrameLayout implements C11265c {

    /* renamed from: A */
    public C47428d f160222A;

    /* renamed from: d */
    public C58924d f160223d;

    /* renamed from: e */
    public C59668o0 f160224e;

    /* renamed from: f */
    public SurfaceTexture f160225f;

    /* renamed from: g */
    public PAGView f160226g;

    /* renamed from: h */
    public RatioLayout f160227h;

    /* renamed from: i */
    public C62378a f160228i;

    /* renamed from: j */
    public int f160229j;

    /* renamed from: n */
    public boolean f160230n;

    /* renamed from: o */
    public boolean f160231o = true;

    /* renamed from: p */
    public boolean f160232p;

    /* renamed from: q */
    public C32224a<C13598b0> f160233q;

    /* renamed from: r */
    public C32224a<C13598b0> f160234r;

    /* renamed from: s */
    public C32227p<? super Integer, ? super Integer, C13598b0> f160235s;

    /* renamed from: t */
    public C61046o4 f160236t;

    /* renamed from: u */
    public boolean f160237u;

    /* renamed from: v */
    public int f160238v;

    /* renamed from: w */
    public int f160239w;

    /* renamed from: x */
    public float f160240x;

    /* renamed from: y */
    public long f160241y;

    /* renamed from: z */
    public final IListener<VoipEvent> f160242z = new NearbyLivePreviewView$voipCallEvent$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView$a */
    public final class C56170a extends C58915a {
        public C56170a() {
        }

        public void onNetStatus(Bundle bundle) {
            int netType = NetStatusUtil.getNetType(NearbyLivePreviewView.this.getContext());
            NearbyLivePreviewView nearbyLivePreviewView = NearbyLivePreviewView.this;
            StringBuilder sb = new StringBuilder();
            sb.append("onNetStatus curPlayStatus:");
            sb.append(NearbyLivePreviewView.this.f160229j);
            sb.append(", netQuality:");
            sb.append(netType);
            sb.append(", isPlaying:");
            C58924d player = NearbyLivePreviewView.this.getPlayer();
            boolean z = true;
            sb.append(player != null && player.isPlaying());
            nearbyLivePreviewView.mo78387f(sb.toString());
            C58924d player2 = NearbyLivePreviewView.this.getPlayer();
            if (player2 == null || !player2.isPlaying()) {
                z = false;
            }
            if (z && netType != -1) {
                NearbyLivePreviewView nearbyLivePreviewView2 = NearbyLivePreviewView.this;
                if (nearbyLivePreviewView2.f160229j == -2301) {
                    nearbyLivePreviewView2.mo78387f("restart");
                    C58924d dVar = nearbyLivePreviewView2.f160223d;
                    if (dVar != null) {
                        dVar.stopPlay(false);
                    }
                    nearbyLivePreviewView2.f160230n = false;
                    nearbyLivePreviewView2.mo78395j(nearbyLivePreviewView2.f160233q, (C32224a<C13598b0>) null, (C32227p<? super Integer, ? super Integer, C13598b0>) null);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: rx3.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: rx3.l<java.lang.Boolean, java.lang.String>} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x014b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPlayEvent(int r14, android.os.Bundle r15) {
            /*
                r13 = this;
                super.onPlayEvent(r14, r15)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "receive play event: "
                r1.append(r2)
                r1.append(r14)
                java.lang.String r2 = " isPlaying: "
                r1.append(r2)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r2 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                f50.d r2 = r2.getPlayer()
                r3 = 0
                if (r2 == 0) goto L_0x0029
                boolean r2 = r2.isPlaying()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x002a
            L_0x0029:
                r2 = r3
            L_0x002a:
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.mo78387f(r1)
                r0 = -2301(0xfffffffffffff703, float:NaN)
                if (r14 != r0) goto L_0x003d
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.m64151a(r1)
            L_0x003d:
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                f50.d r1 = r1.getPlayer()
                r2 = 1
                r4 = 0
                if (r1 == 0) goto L_0x004f
                boolean r1 = r1.isPlaying()
                if (r1 != r2) goto L_0x004f
                r1 = 1
                goto L_0x0050
            L_0x004f:
                r1 = 0
            L_0x0050:
                java.lang.String r5 = ""
                if (r1 == 0) goto L_0x032f
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                r1.f160229j = r14
                r6 = -2304(0xfffffffffffff700, float:NaN)
                if (r14 == r6) goto L_0x0308
                r6 = -1
                r7 = 2
                if (r14 == r0) goto L_0x02a4
                r0 = 2001(0x7d1, float:2.804E-42)
                if (r14 == r0) goto L_0x0285
                r0 = 2009(0x7d9, float:2.815E-42)
                if (r14 == r0) goto L_0x020d
                r0 = 2012(0x7dc, float:2.82E-42)
                if (r14 == r0) goto L_0x01f2
                r0 = 2033(0x7f1, float:2.849E-42)
                if (r14 == r0) goto L_0x01b7
                r0 = 2103(0x837, float:2.947E-42)
                if (r14 == r0) goto L_0x0076
                goto L_0x032f
            L_0x0076:
                android.content.Context r1 = r1.getContext()
                int r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r1)
                if (r1 != r6) goto L_0x0082
                r1 = 1
                goto L_0x0083
            L_0x0082:
                r1 = 0
            L_0x0083:
                w50.b r6 = w50.C65928b.f189533a
                boolean r6 = r6.mo89968f(r14, r15)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r8 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "onPlayEvent PLAY_WARNING_RECONNECT, non_network:"
                r9.append(r10)
                r9.append(r1)
                java.lang.String r10 = ", liveFinish:"
                r9.append(r10)
                r9.append(r6)
                java.lang.String r9 = r9.toString()
                r8.mo78387f(r9)
                if (r6 == 0) goto L_0x00bb
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                f50.d r0 = r0.getPlayer()
                if (r0 == 0) goto L_0x00b4
                r0.stopPlay(r2)
            L_0x00b4:
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.m64151a(r0)
                goto L_0x032f
            L_0x00bb:
                if (r1 != 0) goto L_0x032f
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                r1.getClass()
                p50.d$b r6 = p50.C47428d.f127226d
                boolean r0 = r6.mo72454a(r0, r15)
                if (r0 == 0) goto L_0x0196
                w50.a r0 = w50.C53075a.f148139a
                r0.mo73766f()
                p50.d r0 = r1.f160222A
                if (r0 != 0) goto L_0x00d8
                p50.d r0 = new p50.d
                r0.<init>()
            L_0x00d8:
                r1.f160222A = r0
                wh1.b r0 = wh1.C66115b.f190032a
                pm1.a r6 = r1.f160228i
                if (r6 == 0) goto L_0x00e4
                java.lang.String r8 = r6.f177280a
                if (r8 != 0) goto L_0x00e5
            L_0x00e4:
                r8 = r5
            L_0x00e5:
                if (r6 == 0) goto L_0x010e
                cm1.z r6 = r6.f177278c
                if (r6 == 0) goto L_0x010e
                com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo3513o()
                if (r6 == 0) goto L_0x010e
                te3.c21 r6 = r6.getLiveInfo()
                if (r6 == 0) goto L_0x010e
                te3.bq2 r6 = r6.f182358D
                if (r6 == 0) goto L_0x010e
                pe3.b r6 = r6.f182318j
                if (r6 == 0) goto L_0x010e
                te3.cq2 r9 = new te3.cq2
                r9.<init>()
                byte[] r6 = r6.mo123703f()
                r9.parseFrom(r6)
                te3.zp2 r6 = r9.f182556f
                goto L_0x010f
            L_0x010e:
                r6 = r3
            L_0x010f:
                java.lang.String r0 = r0.mo90156a(r8, r6)
                p50.d r6 = r1.f160222A
                if (r6 == 0) goto L_0x0151
                pm1.a r8 = r1.f160228i
                if (r8 == 0) goto L_0x0148
                cm1.z r8 = r8.f177278c
                if (r8 == 0) goto L_0x0148
                com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
                if (r8 == 0) goto L_0x0148
                te3.c21 r8 = r8.getLiveInfo()
                if (r8 == 0) goto L_0x0148
                te3.bq2 r8 = r8.f182358D
                if (r8 == 0) goto L_0x0142
                pe3.b r8 = r8.f182318j
                if (r8 == 0) goto L_0x0142
                te3.cq2 r9 = new te3.cq2
                r9.<init>()
                byte[] r8 = r8.mo123703f()
                r9.parseFrom(r8)
                te3.zp2 r8 = r9.f182556f
                goto L_0x0143
            L_0x0142:
                r8 = r3
            L_0x0143:
                if (r8 == 0) goto L_0x0148
                java.lang.String r8 = r8.f186803X
                goto L_0x0149
            L_0x0148:
                r8 = r3
            L_0x0149:
                if (r8 != 0) goto L_0x014c
                r8 = r5
            L_0x014c:
                rx3.l r6 = r6.mo72451a(r0, r8)
                goto L_0x0152
            L_0x0151:
                r6 = r3
            L_0x0152:
                if (r6 == 0) goto L_0x0160
                A r8 = r6.f38555d
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != r2) goto L_0x0160
                r8 = 1
                goto L_0x0161
            L_0x0160:
                r8 = 0
            L_0x0161:
                if (r8 == 0) goto L_0x016b
                B r0 = r6.f38556e
                java.lang.String r0 = (java.lang.String) r0
                com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.m64152m(r1, r2, r0)
                goto L_0x018c
            L_0x016b:
                p50.d r6 = r1.f160222A
                if (r6 == 0) goto L_0x0173
                rx3.l r3 = r6.mo72452b(r0)
            L_0x0173:
                if (r3 == 0) goto L_0x0181
                A r0 = r3.f38555d
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != r2) goto L_0x0181
                r0 = 1
                goto L_0x0182
            L_0x0181:
                r0 = 0
            L_0x0182:
                if (r0 == 0) goto L_0x018b
                B r0 = r3.f38556e
                java.lang.String r0 = (java.lang.String) r0
                com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.m64152m(r1, r2, r0)
            L_0x018b:
                r6 = r3
            L_0x018c:
                if (r6 == 0) goto L_0x0196
                A r0 = r6.f38555d
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r4 = r0.booleanValue()
            L_0x0196:
                if (r4 == 0) goto L_0x032f
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                pm1.a r0 = r0.f160228i
                if (r0 == 0) goto L_0x032f
                cm1.z r0 = r0.f177278c
                if (r0 == 0) goto L_0x032f
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x032f
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x032f
                ak1.o0 r1 = ak1.C54109o0.f151877a
                long r2 = r0.f182392d
                r1.mo74840a(r2, r7)
                goto L_0x032f
            L_0x01b7:
                java.lang.String r0 = "receive EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME"
                r1.mo78387f(r0)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                pm1.a r0 = r0.f160228i
                if (r0 == 0) goto L_0x032f
                cm1.z r0 = r0.f177278c
                if (r0 == 0) goto L_0x032f
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x032f
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x032f
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                ak1.n0 r2 = ak1.C54101n0.f151856a
                long r3 = r0.f182392d
                pm1.a r0 = r1.f160228i
                if (r0 == 0) goto L_0x01ec
                cm1.z r0 = r0.f177278c
                if (r0 == 0) goto L_0x01ec
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x01ec
                java.lang.String r0 = r0.getNickName()
                if (r0 != 0) goto L_0x01ed
            L_0x01ec:
                r0 = r5
            L_0x01ed:
                r2.mo74795b(r3, r0, r7)
                goto L_0x032f
            L_0x01f2:
                if (r15 == 0) goto L_0x01fa
                java.lang.String r0 = "EVT_GET_MSG"
                byte[] r3 = r15.getByteArray(r0)
            L_0x01fa:
                if (r15 == 0) goto L_0x0202
                java.lang.String r0 = "EVT_GET_MSG_TYPE"
                int r4 = r15.getInt(r0)
            L_0x0202:
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                kf1.o4 r0 = r0.f160236t
                if (r0 == 0) goto L_0x032f
                r0.mo85203a(r3, r4)
                goto L_0x032f
            L_0x020d:
                if (r15 == 0) goto L_0x0216
                java.lang.String r0 = "EVT_PARAM1"
                int r0 = r15.getInt(r0)
                goto L_0x0217
            L_0x0216:
                r0 = 0
            L_0x0217:
                r1.f160238v = r0
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                if (r15 == 0) goto L_0x0223
                java.lang.String r1 = "EVT_PARAM2"
                int r4 = r15.getInt(r1)
            L_0x0223:
                r0.f160239w = r4
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                r1 = 1065353216(0x3f800000, float:1.0)
                int r2 = r0.f160238v
                float r2 = (float) r2
                float r2 = r2 * r1
                int r1 = r0.f160239w
                float r1 = (float) r1
                float r2 = r2 / r1
                r0.f160240x = r2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onPlayEvent PLAY_EVT_CHANGE_RESOLUTION, w:h="
                r1.append(r2)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r2 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                int r2 = r2.f160238v
                r1.append(r2)
                r2 = 58
                r1.append(r2)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r2 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                int r2 = r2.f160239w
                r1.append(r2)
                java.lang.String r2 = " videoRatioWH:"
                r1.append(r2)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r2 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                float r2 = r2.f160240x
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.mo78387f(r1)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                fy3.p<? super java.lang.Integer, ? super java.lang.Integer, rx3.b0> r1 = r0.f160235s
                if (r1 == 0) goto L_0x0279
                int r2 = r0.f160238v
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                int r0 = r0.f160239w
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.invoke(r2, r0)
            L_0x0279:
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                r0.mo78386e()
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                r0.mo78384c()
                goto L_0x032f
            L_0x0285:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "onPlayEvent "
                r0.append(r2)
                r2 = 2004(0x7d4, float:2.808E-42)
                if (r14 != r2) goto L_0x0296
                java.lang.String r2 = "PLAY_EVT_PLAY_BEGIN"
                goto L_0x0298
            L_0x0296:
                java.lang.String r2 = "PLAY_EVT_CONNECT_SUCC"
            L_0x0298:
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.mo78387f(r0)
                goto L_0x032f
            L_0x02a4:
                android.content.Context r0 = r1.getContext()
                int r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.getNetType((android.content.Context) r0)
                if (r0 != r6) goto L_0x02af
                goto L_0x02b0
            L_0x02af:
                r2 = 0
            L_0x02b0:
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:"
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.mo78387f(r1)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                f50.d r0 = r0.getPlayer()
                if (r0 == 0) goto L_0x02d1
                r0.stopPlay(r4)
            L_0x02d1:
                if (r2 != 0) goto L_0x032f
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                pm1.a r0 = r0.f160228i
                if (r0 == 0) goto L_0x032f
                cm1.z r0 = r0.f177278c
                if (r0 == 0) goto L_0x032f
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x032f
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x032f
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                ak1.n0 r2 = ak1.C54101n0.f151856a
                long r3 = r0.f182392d
                pm1.a r0 = r1.f160228i
                if (r0 == 0) goto L_0x0303
                cm1.z r0 = r0.f177278c
                if (r0 == 0) goto L_0x0303
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x0303
                java.lang.String r0 = r0.getNickName()
                if (r0 != 0) goto L_0x0304
            L_0x0303:
                r0 = r5
            L_0x0304:
                r2.mo74794a(r3, r0, r7)
                goto L_0x032f
            L_0x0308:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "receive PLAY_ERR_HEVC_DECODE_FAIL -2304 mediaSource : "
                r0.append(r1)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                pm1.a r1 = r1.f160228i
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "AbsTXLivePlayListener"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                pm1.a r0 = r0.f160228i
                if (r0 == 0) goto L_0x032f
                wh1.b r1 = wh1.C66115b.f190032a
                java.lang.String r0 = r0.f177280a
                r1.mo90157b(r0)
            L_0x032f:
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r0 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                pm1.a r0 = r0.f160228i
                if (r0 == 0) goto L_0x0369
                cm1.z r0 = r0.f177278c
                if (r0 == 0) goto L_0x0369
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x0369
                te3.c21 r0 = r0.getLiveInfo()
                if (r0 == 0) goto L_0x0369
                com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r1 = com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.this
                ak1.n0 r6 = ak1.C54101n0.f151856a
                long r9 = r0.f182392d
                pm1.a r0 = r1.f160228i
                if (r0 == 0) goto L_0x0362
                cm1.z r0 = r0.f177278c
                if (r0 == 0) goto L_0x0362
                com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
                if (r0 == 0) goto L_0x0362
                java.lang.String r0 = r0.getNickName()
                if (r0 != 0) goto L_0x0360
                goto L_0x0362
            L_0x0360:
                r11 = r0
                goto L_0x0363
            L_0x0362:
                r11 = r5
            L_0x0363:
                r12 = 2
                r7 = r14
                r8 = r15
                r6.mo74800g(r7, r8, r9, r11, r12)
            L_0x0369:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.C56170a.onPlayEvent(int, android.os.Bundle):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView$b */
    public static final class C56171b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLivePreviewView f160244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56171b(NearbyLivePreviewView nearbyLivePreviewView) {
            super(1);
            this.f160244d = nearbyLivePreviewView;
        }

        public Object invoke(Object obj) {
            C61926c.m72668M(new C56172a(((Boolean) obj).booleanValue(), this.f160244d));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLivePreviewView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo78385d();
    }

    /* renamed from: m */
    public static final void m64152m(NearbyLivePreviewView nearbyLivePreviewView, int i, String str) {
        C0797z zVar;
        FinderItem o;
        C64273c21 liveInfo;
        C64265bq2 bq22;
        C89349b bVar;
        C58924d dVar = nearbyLivePreviewView.f160223d;
        if (dVar != null) {
            dVar.stopPlay(false);
        }
        C62378a aVar = nearbyLivePreviewView.f160228i;
        C64890zp2 zp22 = null;
        if (!(aVar == null || (zVar = aVar.f177278c) == null || (o = zVar.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null || (bq22 = liveInfo.f182358D) == null || (bVar = bq22.f182318j) == null)) {
            C64293cq2 cq22 = new C64293cq2();
            cq22.parseFrom(bVar.mo123703f());
            zp22 = cq22.f182556f;
        }
        nearbyLivePreviewView.mo78396k(str, i, zp22, "restart");
    }

    /* renamed from: b */
    public boolean mo11323b() {
        return this.f160237u;
    }

    /* renamed from: c */
    public final void mo78384c() {
        RatioLayout ratioLayout = this.f160227h;
        if (ratioLayout != null) {
            ViewParent parent = ratioLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            int height = viewGroup != null ? viewGroup.getHeight() : 0;
            Log.m105924i("NearbyLivePreviewView", "checkLinkMicMode videoWidth: " + this.f160238v + " height: " + height);
            if (height > 0) {
                int i = (int) (((float) height) * (((float) this.f160238v) / ((float) this.f160239w)));
                ratioLayout.getLayoutParams().width = i;
                ratioLayout.requestLayout();
                C61046o4 o4Var = this.f160236t;
                if (o4Var != null) {
                    Point point = new Point(i, height);
                    o4Var.f173854h.mo85999i(point);
                    String str = o4Var.f173849c;
                    Log.m105924i(str, "setWindowSize size:" + point);
                }
            }
        }
        C61046o4 o4Var2 = this.f160236t;
        if (o4Var2 != null) {
            o4Var2.mo85207e(this.f160238v, this.f160239w);
        }
    }

    /* renamed from: d */
    public final void mo78385d() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        setRenderView(new C59668o0(context));
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f160227h = new RatioLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        addView(getRenderView(), layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        RatioLayout ratioLayout = this.f160227h;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        C13598b0 b0Var = C13598b0.f38549a;
        frameLayout.addView(ratioLayout, layoutParams3);
        addView(frameLayout, layoutParams2);
        int e = C59364c.m69282e(false);
        C59364c cVar = new C59364c(getContext(), true, (e == 5 || e == 6) ? 2 : 0);
        this.f160223d = cVar;
        cVar.enableHardwareDecode(true);
        C58924d dVar = this.f160223d;
        if (dVar != null) {
            dVar.setPlayListener(new C56170a());
        }
        C58924d dVar2 = this.f160223d;
        if (dVar2 != null) {
            dVar2.setConfig(C58739j4.m68256z(C58739j4.f168176a, true, 0, 2, (Object) null));
        }
        C58924d dVar3 = this.f160223d;
        if (dVar3 != null) {
            dVar3.setRenderMode(0);
        }
        this.f160232p = false;
        setMute(true);
        this.f160236t = new C61046o4(1, this.f160227h, new C56171b(this));
        mo78387f("init view:" + getRenderView() + " player:" + getRenderView());
    }

    /* renamed from: e */
    public final void mo78386e() {
        this.f160237u = true;
        C32224a<C13598b0> aVar = this.f160233q;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        r1 = (r1 = (r1 = r1.f177278c).mo3513o()).getLiveInfo();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78387f(java.lang.String r5) {
        /*
            r4 = this;
            pm1.a r0 = r4.f160228i
            if (r0 == 0) goto L_0x0034
            cm1.z r0 = r0.f177278c
            if (r0 == 0) goto L_0x0034
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.getNickName()
            r1 = 0
            r2 = 4
            if (r0 == 0) goto L_0x0031
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x001d
            goto L_0x0031
        L_0x001d:
            int r2 = r2 + r1
            int r3 = r0.length()
            int r2 = java.lang.Math.min(r2, r3)
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r0, r1)
            goto L_0x0036
        L_0x0031:
            java.lang.String r0 = ""
            goto L_0x0036
        L_0x0034:
            java.lang.String r0 = "NULL"
        L_0x0036:
            pm1.a r1 = r4.f160228i
            if (r1 == 0) goto L_0x0051
            cm1.z r1 = r1.f177278c
            if (r1 == 0) goto L_0x0051
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            if (r1 == 0) goto L_0x0051
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x0051
            long r1 = r1.f182392d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r0 = 32
            r2.append(r0)
            r2.append(r1)
            r2.append(r0)
            int r0 = r4.hashCode()
            r2.append(r0)
            java.lang.String r0 = " == "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r0 = "NearbyLivePreviewView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.mo78387f(java.lang.String):void");
    }

    /* renamed from: g */
    public void mo78388g() {
        C61046o4 o4Var = this.f160236t;
        if (o4Var != null) {
            o4Var.mo85205c();
        }
        mo78387f("release");
    }

    public final C62378a getMediaSource() {
        return this.f160228i;
    }

    public final C58924d getPlayer() {
        return this.f160223d;
    }

    public final SurfaceTexture getRenderSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.f160225f;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        C87412m.m108603p("renderSurfaceTexture");
        throw null;
    }

    public final C59668o0 getRenderView() {
        C59668o0 o0Var = this.f160224e;
        if (o0Var != null) {
            return o0Var;
        }
        C87412m.m108603p("renderView");
        throw null;
    }

    public TextureView getTextureView() {
        C59668o0 renderView = getRenderView();
        if (renderView != null) {
            return renderView.getVideoView();
        }
        return null;
    }

    public int getVideoHeight() {
        return this.f160239w;
    }

    public float getVideoRatioWH() {
        return this.f160240x;
    }

    public int getVideoWidth() {
        return this.f160238v;
    }

    /* renamed from: h */
    public C58924d mo11322a() {
        Log.m105928w("NearbyLivePreviewView", "disConnectPlayer player:" + this.f160223d);
        C58924d dVar = this.f160223d;
        this.f160223d = null;
        return dVar;
    }

    /* renamed from: i */
    public final void mo78394i(C62290e eVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(eVar, "outerParams");
        this.f160233q = aVar;
        this.f160234r = aVar2;
        this.f160235s = pVar;
        C62292g gVar = eVar.f177072c;
        this.f160238v = gVar != null ? gVar.f177092d : 0;
        this.f160239w = gVar != null ? gVar.f177093e : 0;
        this.f160240x = gVar != null ? gVar.f177094f : 0.0f;
        this.f160241y = eVar.f177070a;
        C58924d dVar = this.f160223d;
        if (dVar != null) {
            dVar.stopPlay(true);
        }
        C62292g gVar2 = eVar.f177072c;
        C58924d dVar2 = gVar2 != null ? gVar2.f177095g : null;
        if (gVar2 != null) {
            gVar2.f177095g = null;
        }
        this.f160223d = dVar2;
        if (dVar2 != null) {
            dVar2.setPlayListener(new C56170a());
        }
        mo78387f("reusePlayer " + this.f160223d);
        getRenderView().removeVideoView();
        getRenderView().addVideoView(new TextureView(getContext()));
        getRenderView().setVisibility(0);
        C58924d dVar3 = this.f160223d;
        if (dVar3 != null) {
            dVar3.setPlayerView(getRenderView());
        }
        C58924d dVar4 = this.f160223d;
        if (dVar4 != null) {
            dVar4.setRenderMode(0);
        }
        mo78384c();
        C58924d dVar5 = this.f160223d;
        if (dVar5 != null) {
            dVar5.setPlayerView(getRenderView());
        }
        getRenderView().post(new C62406w(this));
    }

    public boolean isPlaying() {
        C58924d dVar = this.f160223d;
        return dVar != null && dVar.isPlaying();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        r1 = (r1 = (r1 = r1.f177278c).mo3513o()).getLiveInfo();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78395j(fy3.C32224a<rx3.C13598b0> r4, fy3.C32224a<rx3.C13598b0> r5, fy3.C32227p<? super java.lang.Integer, ? super java.lang.Integer, rx3.C13598b0> r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "start player:"
            r0.append(r1)
            f50.d r1 = r3.f160223d
            r0.append(r1)
            java.lang.String r1 = " isPause:"
            r0.append(r1)
            boolean r1 = r3.f160230n
            r0.append(r1)
            java.lang.String r1 = " mediaSource:"
            r0.append(r1)
            pm1.a r1 = r3.f160228i
            r0.append(r1)
            java.lang.String r1 = ",isFinishLive:"
            r0.append(r1)
            boolean r1 = r3.f160232p
            r0.append(r1)
            java.lang.String r1 = ",liveStatus:"
            r0.append(r1)
            pm1.a r1 = r3.f160228i
            r2 = 0
            if (r1 == 0) goto L_0x004f
            cm1.z r1 = r1.f177278c
            if (r1 == 0) goto L_0x004f
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo3513o()
            if (r1 == 0) goto L_0x004f
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x004f
            int r1 = r1.f182394f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.mo78387f(r0)
            boolean r0 = r3.f160230n
            if (r0 == 0) goto L_0x006a
            f50.d r4 = r3.f160223d
            if (r4 == 0) goto L_0x0065
            r4.resume()
        L_0x0065:
            r3.mo78386e()
            goto L_0x01d6
        L_0x006a:
            pm1.a r0 = r3.f160228i
            java.lang.String r1 = "NearbyLivePreviewView"
            if (r0 != 0) goto L_0x0088
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "start player return for mediaSource:"
            r4.append(r5)
            pm1.a r5 = r3.f160228i
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
            return
        L_0x0088:
            r3.f160233q = r4
            r3.f160234r = r5
            r3.f160235s = r6
            gr1.o0 r4 = r3.getRenderView()
            r4.removeVideoView()
            gr1.o0 r4 = r3.getRenderView()
            android.view.TextureView r5 = new android.view.TextureView
            android.content.Context r6 = r3.getContext()
            r5.<init>(r6)
            r4.addVideoView(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "start player: "
            r4.append(r5)
            f50.d r5 = r3.f160223d
            r4.append(r5)
            java.lang.String r5 = " hashCode: "
            r4.append(r5)
            f50.d r5 = r3.f160223d
            r6 = 0
            if (r5 == 0) goto L_0x00c4
            int r5 = r5.hashCode()
            goto L_0x00c5
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            r4.append(r5)
            java.lang.String r5 = " isAttach: "
            r4.append(r5)
            boolean r5 = r3.isAttachedToWindow()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            f50.d r4 = r3.f160223d
            if (r4 == 0) goto L_0x00e6
            gr1.o0 r5 = r3.getRenderView()
            r4.setPlayerView(r5)
        L_0x00e6:
            f50.d r4 = r3.f160223d
            if (r4 == 0) goto L_0x00f2
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView$a r5 = new com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView$a
            r5.<init>()
            r4.setPlayListener(r5)
        L_0x00f2:
            gr1.o0 r4 = r3.getRenderView()
            r4.setVisibility(r6)
            pm1.a r4 = r3.f160228i
            if (r4 == 0) goto L_0x01d6
            wh1.b r5 = wh1.C66115b.f190032a
            java.lang.String r0 = r4.f177280a
            cm1.z r4 = r4.f177278c
            if (r4 == 0) goto L_0x0128
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            if (r4 == 0) goto L_0x0128
            te3.c21 r4 = r4.getLiveInfo()
            if (r4 == 0) goto L_0x0128
            te3.bq2 r4 = r4.f182358D
            if (r4 == 0) goto L_0x0128
            pe3.b r4 = r4.f182318j
            if (r4 == 0) goto L_0x0128
            te3.cq2 r1 = new te3.cq2
            r1.<init>()
            byte[] r4 = r4.mo123703f()
            r1.parseFrom(r4)
            te3.zp2 r4 = r1.f182556f
            goto L_0x0129
        L_0x0128:
            r4 = r2
        L_0x0129:
            java.lang.String r4 = r5.mo90156a(r0, r4)
            pm1.a r5 = r3.f160228i
            if (r5 == 0) goto L_0x0158
            cm1.z r5 = r5.f177278c
            if (r5 == 0) goto L_0x0158
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo3513o()
            if (r5 == 0) goto L_0x0158
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x0158
            te3.bq2 r5 = r5.f182358D
            if (r5 == 0) goto L_0x0158
            pe3.b r5 = r5.f182318j
            if (r5 == 0) goto L_0x0158
            te3.cq2 r0 = new te3.cq2
            r0.<init>()
            byte[] r5 = r5.mo123703f()
            r0.parseFrom(r5)
            te3.zp2 r5 = r0.f182556f
            r2 = r5
        L_0x0158:
            r5 = 1
            java.lang.String r0 = "start"
            r3.mo78396k(r4, r5, r2, r0)
            pm1.a r4 = r3.f160228i
            if (r4 == 0) goto L_0x0177
            cm1.z r4 = r4.f177278c
            if (r4 == 0) goto L_0x0177
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
            if (r4 == 0) goto L_0x0177
            te3.c21 r4 = r4.getLiveInfo()
            if (r4 == 0) goto L_0x0177
            java.lang.String r4 = r4.f182357C
            if (r4 != 0) goto L_0x0179
        L_0x0177:
            java.lang.String r4 = ""
        L_0x0179:
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0181
            r0 = 1
            goto L_0x0182
        L_0x0181:
            r0 = 0
        L_0x0182:
            r5 = r5 ^ r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NearbyLivePreviewView set isLowDelayMode["
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "],gameAppId["
            r0.append(r1)
            r0.append(r4)
            r4 = 93
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "WaveJBM"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            if (r5 == 0) goto L_0x01d6
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "api"
            java.lang.String r0 = "setAudioJitterBufferFactory"
            r4.put(r5, r0)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "controllerFactory"
            r5.put(r0, r6)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            java.lang.String r6 = "params"
            r4.put(r6, r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "JSONObject().apply{\n    …             }.toString()"
            gy3.C87412m.m108593f(r4, r5)
            f50.d r5 = r3.f160223d
            if (r5 == 0) goto L_0x01d6
            r5.callExperimentalAPI(r4)
        L_0x01d6:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent> r4 = r3.f160242z
            r4.alive()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.mo78395j(fy3.a, fy3.a, fy3.p):void");
    }

    /* renamed from: k */
    public final void mo78396k(String str, int i, C64890zp2 zp22, String str2) {
        C0797z zVar;
        FinderItem o;
        C64273c21 liveInfo;
        String str3;
        C0797z zVar2;
        FinderItem o2;
        C58924d dVar = this.f160223d;
        if (dVar != null) {
            dVar.mo84115f(str, i, zp22);
        }
        String str4 = str2 + ";url:" + str;
        C62378a aVar = this.f160228i;
        if (aVar != null && (zVar = aVar.f177278c) != null && (o = zVar.mo3513o()) != null && (liveInfo = o.getLiveInfo()) != null) {
            C54101n0 n0Var = C54101n0.f151856a;
            long j = liveInfo.f182392d;
            C62378a aVar2 = this.f160228i;
            if (aVar2 == null || (zVar2 = aVar2.f177278c) == null || (o2 = zVar2.mo3513o()) == null || (str3 = o2.getNickName()) == null) {
                str3 = "";
            }
            n0Var.mo74801h(str4, j, str3, 2);
        }
    }

    /* renamed from: l */
    public void mo78397l() {
        mo78387f("stop");
        this.f160242z.dead();
        mo78387f("stopAudioEnableView");
        PAGView pAGView = this.f160226g;
        if (pAGView != null) {
            pAGView.setVisibility(4);
        }
        PAGView pAGView2 = this.f160226g;
        if (pAGView2 != null) {
            pAGView2.stop();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("stop player: ");
        sb.append(this.f160223d);
        sb.append(" hashCode: ");
        C58924d dVar = this.f160223d;
        sb.append(dVar != null ? dVar.hashCode() : 0);
        Log.m105924i("NearbyLivePreviewView", sb.toString());
        C58924d dVar2 = this.f160223d;
        if (dVar2 != null) {
            dVar2.stopPlay(true);
        }
        this.f160230n = false;
        this.f160233q = null;
        this.f160234r = null;
        this.f160235s = null;
        this.f160238v = 0;
        this.f160239w = 0;
        this.f160240x = 0.0f;
        this.f160237u = false;
        C47428d dVar3 = this.f160222A;
        if (dVar3 != null) {
            dVar3.mo72453c();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sb = new StringBuilder();
        sb.append("onAttachedToWindow isPlaying: ");
        C58924d dVar = this.f160223d;
        sb.append(dVar != null ? Boolean.valueOf(dVar.isPlaying()) : null);
        mo78387f(sb.toString());
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder sb = new StringBuilder();
        sb.append("onDetachedFromWindow isPlaying: ");
        C58924d dVar = this.f160223d;
        sb.append(dVar != null ? Boolean.valueOf(dVar.isPlaying()) : null);
        mo78387f(sb.toString());
    }

    public final void setFirstFrameRendered(boolean z) {
        this.f160237u = z;
    }

    public final void setIsReuse(boolean z) {
    }

    public final void setMediaSource(C62378a aVar) {
        C87412m.m108594g(aVar, "mediaSource");
        if (!TextUtils.isEmpty(aVar.f177280a)) {
            this.f160228i = aVar;
            C61046o4 o4Var = this.f160236t;
            if (o4Var != null) {
                o4Var.mo85206d(FeedData.Companion.mo78884b(aVar.f177278c.mo3513o()), aVar.f177278c.mo3513o());
            }
            PAGView pAGView = (PAGView) findViewWithTag("NearbyLivePreviewView");
            if (pAGView != null) {
                removeView(pAGView);
            }
            PAGView pAGView2 = new PAGView(getContext());
            this.f160226g = pAGView2;
            pAGView2.setComposition(PAGFile.Load(getContext().getAssets(), "finder_nearby_live_square_card_audio_wave.pag"));
            PAGView pAGView3 = this.f160226g;
            if (pAGView3 != null) {
                pAGView3.setRepeatCount(-1);
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);
            C62378a aVar2 = this.f160228i;
            boolean z = true;
            if (aVar2 == null || !aVar2.f177279d) {
                z = false;
            }
            layoutParams.gravity = z ? 51 : 53;
            layoutParams.leftMargin = dimensionPixelSize2;
            layoutParams.topMargin = dimensionPixelSize2;
            layoutParams.rightMargin = dimensionPixelSize2;
            PAGView pAGView4 = this.f160226g;
            if (pAGView4 != null) {
                pAGView4.setVisibility(4);
            }
            PAGView pAGView5 = this.f160226g;
            if (pAGView5 != null) {
                pAGView5.setTag("NearbyLivePreviewView");
            }
            addView(this.f160226g, layoutParams);
            mo78387f("setMediaSource mediaSource:" + aVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMute(boolean r9) {
        /*
            r8 = this;
            boolean r0 = p182kk.C61104a.m71668x()
            r1 = 1
            java.lang.String r2 = "NearbyLivePreviewView"
            if (r0 == 0) goto L_0x0013
            if (r9 != 0) goto L_0x0013
            java.lang.String r0 = "setMute true for playing."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = r9
        L_0x0014:
            android.content.Context r3 = r8.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            r4 = 0
            r5 = 0
            boolean r3 = p182kk.C61104a.m71653i(r3, r5, r4)
            if (r3 != 0) goto L_0x0034
            boolean r3 = p182kk.C61104a.m71642B(r4, r5)
            if (r3 != 0) goto L_0x0034
            boolean r3 = p182kk.C61104a.m71644D()
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = 0
            goto L_0x0035
        L_0x0034:
            r3 = 1
        L_0x0035:
            if (r3 == 0) goto L_0x0040
            if (r9 != 0) goto L_0x0040
            java.lang.String r0 = "setMute true for isVoip."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 1
        L_0x0040:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            gy3.C87412m.m108592e(r3, r4)     // Catch:{ Exception -> 0x006b }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x006b }
            int r3 = r3.getCallState()     // Catch:{ Exception -> 0x006b }
            r4 = 2
            if (r3 == r4) goto L_0x005a
            r4 = 0
            goto L_0x005b
        L_0x005a:
            r4 = 1
        L_0x005b:
            java.lang.String r6 = "TelephoneManager.callState is %d"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0069 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0069 }
            r7[r5] = r3     // Catch:{ Exception -> 0x0069 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r7)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007a
        L_0x0069:
            r3 = move-exception
            goto L_0x006d
        L_0x006b:
            r3 = move-exception
            r4 = 0
        L_0x006d:
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r3 = r3.getLocalizedMessage()
            r6[r5] = r3
            java.lang.String r3 = "get callState error , errMsg is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r6)
        L_0x007a:
            if (r4 == 0) goto L_0x0085
            if (r9 != 0) goto L_0x0085
            java.lang.String r9 = "setMute true for isUsePhone."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            r0 = 1
        L_0x0085:
            boolean r9 = r8.f160232p
            if (r9 == 0) goto L_0x0090
            java.lang.String r9 = "setMute true for isFinishLive."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            goto L_0x0091
        L_0x0090:
            r1 = r0
        L_0x0091:
            f50.d r9 = r8.f160223d
            if (r9 == 0) goto L_0x0098
            r9.setMute(r1)
        L_0x0098:
            if (r1 == 0) goto L_0x00b1
            java.lang.String r9 = "stopAudioEnableView"
            r8.mo78387f(r9)
            org.libpag.PAGView r9 = r8.f160226g
            if (r9 != 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            r0 = 4
            r9.setVisibility(r0)
        L_0x00a9:
            org.libpag.PAGView r9 = r8.f160226g
            if (r9 == 0) goto L_0x00c6
            r9.stop()
            goto L_0x00c6
        L_0x00b1:
            java.lang.String r9 = "startAudioEnableView"
            r8.mo78387f(r9)
            org.libpag.PAGView r9 = r8.f160226g
            if (r9 != 0) goto L_0x00bc
            goto L_0x00bf
        L_0x00bc:
            r9.setVisibility(r5)
        L_0x00bf:
            org.libpag.PAGView r9 = r8.f160226g
            if (r9 == 0) goto L_0x00c6
            r9.play()
        L_0x00c6:
            r8.f160231o = r1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "setMute isMute:"
            r9.append(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.mo78387f(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView.setMute(boolean):void");
    }

    public final void setPlayer(C58924d dVar) {
        this.f160223d = dVar;
    }

    public final void setRenderSurfaceTexture(SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "<set-?>");
        this.f160225f = surfaceTexture;
    }

    public final void setRenderView(C59668o0 o0Var) {
        C87412m.m108594g(o0Var, "<set-?>");
        this.f160224e = o0Var;
    }

    public final void setReusePlayer(boolean z) {
    }

    public final void setScaleMode(int i) {
        C58924d dVar = this.f160223d;
        if (dVar != null) {
            dVar.setRenderMode(i);
        }
    }

    public final void setVolume(int i) {
        C58924d dVar = this.f160223d;
        if (dVar != null) {
            dVar.setVolume(i);
        }
    }

    /* renamed from: a */
    public static final void m64151a(NearbyLivePreviewView nearbyLivePreviewView) {
        C0797z zVar;
        nearbyLivePreviewView.mo78387f("notifyLiveFinish");
        nearbyLivePreviewView.f160232p = true;
        C62378a aVar = nearbyLivePreviewView.f160228i;
        if (!(aVar == null || (zVar = aVar.f177278c) == null)) {
            C62042e eVar = C62042e.f176370a;
            C64273c21 liveInfo = zVar.mo3513o().getLiveInfo();
            C62042e.m72809u1(eVar, liveInfo != null ? liveInfo.f182392d : 0, zVar.mo3513o().getUserName(), 2, 0, 8, (Object) null);
        }
        C32224a<C13598b0> aVar2 = nearbyLivePreviewView.f160234r;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLivePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo78385d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLivePreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo78385d();
    }
}
