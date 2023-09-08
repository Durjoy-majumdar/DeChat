package pm1;

import an1.C0090c;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$lifeObserver$1;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.findersdk.receiver.HeadsetReceiver;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import f50.C58924d;
import fm1.C8137c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import km1.C61117j;
import ks3.C61160f;
import mm1.C10934a;
import mt1.C61580b;
import o40.C61926c;
import p204mr.C11078h;
import p564iq.C87790d;
import ph1.C62290e;
import ph1.C62292g;
import ph1.C62293i;
import qm1.C63285a;
import rx3.C13598b0;
import sg1.C63880b;
import sg1.C63881c;
import sg1.C63888h;
import sx3.C64175a0;
import te3.C64273c21;
import te3.C64321dp2;
import te3.C64337e61;
import te3.C64390ga1;
import te3.C64858yi1;

/* renamed from: pm1.d */
public final class C62381d implements C11078h {

    /* renamed from: A */
    public final IListener<VoipEvent> f177282A;

    /* renamed from: B */
    public final NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1 f177283B;

    /* renamed from: C */
    public boolean f177284C;

    /* renamed from: a */
    public final Context f177285a;

    /* renamed from: b */
    public final RecyclerView f177286b;

    /* renamed from: c */
    public final List<C9493c> f177287c;

    /* renamed from: d */
    public final boolean f177288d;

    /* renamed from: e */
    public final int f177289e;

    /* renamed from: f */
    public final boolean f177290f;

    /* renamed from: g */
    public final boolean f177291g;

    /* renamed from: h */
    public final boolean f177292h;

    /* renamed from: i */
    public final WxRecyclerAdapter<?> f177293i;

    /* renamed from: j */
    public final boolean f177294j;

    /* renamed from: k */
    public final boolean f177295k;

    /* renamed from: l */
    public boolean f177296l;

    /* renamed from: m */
    public boolean f177297m;

    /* renamed from: n */
    public C63285a f177298n;

    /* renamed from: o */
    public final HeadsetReceiver f177299o;

    /* renamed from: p */
    public final C61117j f177300p;

    /* renamed from: q */
    public boolean f177301q;

    /* renamed from: r */
    public final C62399p f177302r;

    /* renamed from: s */
    public HashSet<C62382a> f177303s;

    /* renamed from: t */
    public HashSet<C35556b> f177304t;

    /* renamed from: u */
    public boolean f177305u;

    /* renamed from: v */
    public MMHandler f177306v;

    /* renamed from: w */
    public Runnable f177307w;

    /* renamed from: x */
    public C64858yi1 f177308x;

    /* renamed from: y */
    public C62395l f177309y;

    /* renamed from: z */
    public final NearbyLiveAutoPlayManager$lifeObserver$1 f177310z;

    /* renamed from: pm1.d$b */
    public static final class C35556b {

        /* renamed from: a */
        public final int f95064a;

        /* renamed from: b */
        public final int f95065b;

        /* renamed from: c */
        public final boolean f95066c;

        public C35556b(int i, int i2, boolean z) {
            this.f95064a = i;
            this.f95065b = i2;
            this.f95066c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35556b)) {
                return false;
            }
            C35556b bVar = (C35556b) obj;
            return this.f95064a == bVar.f95064a && this.f95065b == bVar.f95065b && this.f95066c == bVar.f95066c;
        }

        public int hashCode() {
            int i = ((this.f95064a * 31) + this.f95065b) * 31;
            boolean z = this.f95066c;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "LivePreviewMuteStateData(pos=" + this.f95064a + ", containerHashCode=" + this.f95065b + ", isMute=" + this.f95066c + ')';
        }
    }

    /* renamed from: pm1.d$a */
    public static final class C62382a {

        /* renamed from: a */
        public final int f177311a;

        /* renamed from: b */
        public final NearbyLivePreviewView f177312b;

        /* renamed from: c */
        public final C0797z f177313c;

        /* renamed from: d */
        public final C63888h f177314d;

        public C62382a(int i, NearbyLivePreviewView nearbyLivePreviewView, C0797z zVar, C63888h hVar) {
            C87412m.m108594g(nearbyLivePreviewView, "view");
            C87412m.m108594g(zVar, "feed");
            this.f177311a = i;
            this.f177312b = nearbyLivePreviewView;
            this.f177313c = zVar;
            this.f177314d = hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62382a)) {
                return false;
            }
            C62382a aVar = (C62382a) obj;
            return this.f177311a == aVar.f177311a && C87412m.m108589b(this.f177312b, aVar.f177312b) && C87412m.m108589b(this.f177313c, aVar.f177313c) && C87412m.m108589b(this.f177314d, aVar.f177314d);
        }

        public int hashCode() {
            int hashCode = ((((this.f177311a * 31) + this.f177312b.hashCode()) * 31) + this.f177313c.hashCode()) * 31;
            C63888h hVar = this.f177314d;
            return hashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            return "LivePreviewData(pos=" + this.f177311a + ", view=" + this.f177312b + ", feed=" + this.f177313c + ", chargeTimeManager=" + this.f177314d + ')';
        }
    }

    /* renamed from: pm1.d$c */
    public static final class C62383c implements C61580b {

        /* renamed from: d */
        public final /* synthetic */ C62381d f177315d;

        public C62383c(C62381d dVar) {
            this.f177315d = dVar;
        }

        /* renamed from: g5 */
        public void mo80088g5(boolean z) {
            String r = this.f177315d.mo87439r();
            Log.m105924i(r, "onHeadsetStateChange on:" + z);
            C62381d dVar = this.f177315d;
            dVar.f177305u = z;
            if (!z) {
                String r2 = dVar.mo87439r();
                Log.m105924i(r2, "muteCurrentView set:" + dVar.f177303s.size());
                Iterator<C62382a> it = dVar.f177303s.iterator();
                while (it.hasNext()) {
                    C61926c.m72666K(0, new C62394k(it.next()));
                }
            }
        }
    }

    /* renamed from: pm1.d$d */
    public static final class C62384d implements C63880b {

        /* renamed from: a */
        public final /* synthetic */ C62381d f177316a;

        /* renamed from: b */
        public final /* synthetic */ int f177317b;

        /* renamed from: c */
        public final /* synthetic */ long f177318c;

        /* renamed from: d */
        public final /* synthetic */ View f177319d;

        public C62384d(C62381d dVar, int i, long j, View view) {
            this.f177316a = dVar;
            this.f177317b = i;
            this.f177318c = j;
            this.f177319d = view;
        }

        /* renamed from: a */
        public void mo79436a(C64321dp2 dp22) {
            C87412m.m108594g(dp22, "info");
            String r = this.f177316a.mo87439r();
            Log.m105924i(r, "checkAutoPlay pos:" + this.f177317b + " liveId=" + this.f177318c + " charge_live liveFreeTimeManager callback freeTomeToWatch=" + dp22.f182792e);
            if (dp22.f182792e <= 0) {
                this.f177316a.mo87427A(this.f177317b);
                this.f177316a.mo87430i(this.f177317b, this.f177319d);
            }
        }
    }

    /* renamed from: pm1.d$e */
    public static final class C62385e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f177320d;

        /* renamed from: e */
        public final /* synthetic */ C0740i2 f177321e;

        /* renamed from: f */
        public final /* synthetic */ C62381d f177322f;

        /* renamed from: g */
        public final /* synthetic */ int f177323g;

        /* renamed from: h */
        public final /* synthetic */ NearbyLivePreviewView f177324h;

        /* renamed from: i */
        public final /* synthetic */ View f177325i;

        /* renamed from: j */
        public final /* synthetic */ C64321dp2 f177326j;

        /* renamed from: n */
        public final /* synthetic */ C8479f0<C63888h> f177327n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62385e(String str, C0740i2 i2Var, C62381d dVar, int i, NearbyLivePreviewView nearbyLivePreviewView, View view, C64321dp2 dp22, C8479f0<C63888h> f0Var) {
            super(0);
            this.f177320d = str;
            this.f177321e = i2Var;
            this.f177322f = dVar;
            this.f177323g = i;
            this.f177324h = nearbyLivePreviewView;
            this.f177325i = view;
            this.f177326j = dp22;
            this.f177327n = f0Var;
        }

        public Object invoke() {
            boolean z;
            C35556b bVar;
            C58924d dVar;
            boolean z2;
            String str = this.f177320d;
            C87412m.m108593f(str, "liveUrl");
            this.f177324h.setMediaSource(new C62378a(str, (C0797z) this.f177321e, this.f177322f.mo87444w(this.f177323g)));
            C62381d dVar2 = this.f177322f;
            int i = this.f177323g;
            View view = this.f177325i;
            dVar2.getClass();
            C64390ga1 ga12 = null;
            FrameLayout frameLayout = view != null ? (FrameLayout) view.findViewById(C0966R.C0970id.fwx) : null;
            int hashCode = frameLayout != null ? frameLayout.hashCode() : 0;
            Iterator<C35556b> it = dVar2.f177304t.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = it.next();
                C35556b bVar2 = bVar;
                if (bVar2.f95064a == i && bVar2.f95065b == hashCode) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C35556b bVar3 = bVar;
            if (bVar3 != null) {
                z = bVar3.f95066c;
            }
            C62391e eVar = new C62391e(this.f177325i, this.f177324h, this.f177322f, this.f177323g);
            C62290e a = C62293i.f177081a.mo87356a(((C0797z) this.f177321e).getItemId());
            this.f177324h.setIsReuse(a.f177071b);
            if (a.f177071b) {
                C62292g gVar = a.f177072c;
                if (!(gVar == null || (dVar = gVar.f177095g) == null)) {
                    dVar.setMute(z);
                }
                this.f177324h.mo78394i(a, eVar, (C32224a<C13598b0>) null, (C32227p<? super Integer, ? super Integer, C13598b0>) null);
            } else {
                this.f177324h.setMute(z);
                this.f177324h.mo78395j(eVar, (C32224a<C13598b0>) null, (C32227p<? super Integer, ? super Integer, C13598b0>) null);
            }
            Log.m105924i(this.f177322f.mo87439r(), "checkAutoPlay canReusePlayer:" + a.f177071b + " view:" + this.f177324h + ",previewTimeLimit:" + this.f177326j.f182793f);
            C63888h hVar = (C63888h) this.f177327n.f27484d;
            if (hVar != null) {
                C64273c21 c212 = ((C0797z) this.f177321e).mo3513o().getFeedObject().liveInfo;
                if (c212 != null) {
                    ga12 = c212.f182362H;
                }
                hVar.mo88652c(ga12);
            }
            Log.m105924i(this.f177322f.mo87439r(), "checkAutoPlay pos:" + this.f177323g + " startCountDown!");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pm1.d$f */
    public static final class C62386f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62381d f177328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62386f(C62381d dVar) {
            super(0);
            this.f177328d = dVar;
        }

        public Object invoke() {
            this.f177328d.f177304t.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pm1.d$g */
    public static final class C62387g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62382a f177329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62387g(C62382a aVar) {
            super(0);
            this.f177329d = aVar;
        }

        public Object invoke() {
            NearbyLivePreviewView nearbyLivePreviewView = this.f177329d.f177312b;
            nearbyLivePreviewView.mo78387f("pause");
            nearbyLivePreviewView.f160230n = true;
            StringBuilder sb = new StringBuilder();
            sb.append("pause player: ");
            sb.append(nearbyLivePreviewView.f160223d);
            sb.append(" hashCode: ");
            C58924d dVar = nearbyLivePreviewView.f160223d;
            sb.append(dVar != null ? dVar.hashCode() : 0);
            Log.m105924i("NearbyLivePreviewView", sb.toString());
            C58924d dVar2 = nearbyLivePreviewView.f160223d;
            if (dVar2 != null) {
                dVar2.pause();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pm1.d$h */
    public static final class C62388h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62382a f177330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62388h(C62382a aVar) {
            super(0);
            this.f177330d = aVar;
        }

        public Object invoke() {
            NearbyLivePreviewView nearbyLivePreviewView = this.f177330d.f177312b;
            if (nearbyLivePreviewView.f160230n) {
                nearbyLivePreviewView.f160230n = false;
                C58924d dVar = nearbyLivePreviewView.f160223d;
                if (dVar != null) {
                    dVar.resume();
                }
                nearbyLivePreviewView.mo78386e();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pm1.d$i */
    public static final class C62389i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62381d f177331d;

        /* renamed from: e */
        public final /* synthetic */ C62382a f177332e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62389i(C62381d dVar, C62382a aVar) {
            super(0);
            this.f177331d = dVar;
            this.f177332e = aVar;
        }

        public Object invoke() {
            C62381d dVar = this.f177331d;
            dVar.f177296l = false;
            dVar.mo87428B(this.f177332e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pm1.d$j */
    public static final class C62390j extends C87413o implements C32226l<C62382a, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ int f177333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62390j(int i) {
            super(1);
            this.f177333d = i;
        }

        public Object invoke(Object obj) {
            C62382a aVar = (C62382a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(aVar.f177311a == this.f177333d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0103, code lost:
        if (r3 == null) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62381d(android.content.Context r3, androidx.recyclerview.widget.RecyclerView r4, java.util.List r5, boolean r6, int r7, boolean r8, boolean r9, boolean r10, com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter<?> r11, int r12, gy3.C8480h r13) {
        /*
            r2 = this;
            r13 = r12 & 16
            r0 = 0
            if (r13 == 0) goto L_0x0006
            r7 = 0
        L_0x0006:
            r13 = r12 & 32
            if (r13 == 0) goto L_0x000b
            r8 = 0
        L_0x000b:
            r13 = r12 & 64
            r1 = 1
            if (r13 == 0) goto L_0x0011
            r9 = 1
        L_0x0011:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0016
            r10 = 0
        L_0x0016:
            r12 = r12 & 256(0x100, float:3.59E-43)
            r13 = 0
            if (r12 == 0) goto L_0x001c
            r11 = r13
        L_0x001c:
            java.lang.String r12 = "context"
            gy3.C87412m.m108594g(r3, r12)
            java.lang.String r12 = "feedList"
            gy3.C87412m.m108594g(r5, r12)
            r2.<init>()
            r2.f177285a = r3
            r2.f177286b = r4
            r2.f177287c = r5
            r2.f177288d = r6
            r2.f177289e = r7
            r2.f177290f = r8
            r2.f177291g = r9
            r2.f177292h = r10
            r2.f177293i = r11
            pe1.c<java.lang.Integer> r7 = gg1.C32444a.f86072K
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r1) goto L_0x004b
            r7 = 1
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            r2.f177294j = r7
            pe1.c<java.lang.Integer> r7 = gg1.C32444a.f86076L
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r1) goto L_0x005d
            r0 = 1
        L_0x005d:
            r2.f177295k = r0
            r2.f177297m = r1
            qm1.b r7 = new qm1.b
            r7.<init>(r5, r11)
            r2.f177298n = r7
            com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver r5 = new com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver
            r5.<init>()
            r2.f177299o = r5
            if (r4 != 0) goto L_0x0073
            r5 = r13
            goto L_0x0078
        L_0x0073:
            km1.j r5 = new km1.j
            r5.<init>(r3, r4)
        L_0x0078:
            r2.f177300p = r5
            if (r4 != 0) goto L_0x007d
            goto L_0x008c
        L_0x007d:
            pm1.p r13 = new pm1.p
            pm1.m r3 = new pm1.m
            r3.<init>(r2)
            pm1.n r5 = new pm1.n
            r5.<init>(r2)
            r13.<init>(r4, r6, r3, r5)
        L_0x008c:
            r2.f177302r = r13
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f177303s = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f177304t = r3
            com.tencent.mm.sdk.platformtools.MMHandler r3 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>((android.os.Looper) r5)
            r2.f177306v = r3
            pm1.l r3 = new pm1.l
            r3.<init>(r2)
            r2.f177309y = r3
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$lifeObserver$1 r3 = new com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$lifeObserver$1
            r3.<init>(r2)
            r2.f177310z = r3
            if (r4 == 0) goto L_0x00bf
            pm1.c r3 = new pm1.c
            r3.<init>(r2)
            r4.setOnTouchListener(r3)
        L_0x00bf:
            if (r4 == 0) goto L_0x00c6
            pm1.l r3 = r2.f177309y
            r4.mo17043c(r3)
        L_0x00c6:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r3 = r3.Nt0()
            java.lang.String r4 = "NearbyLiveTab"
            te3.yi1 r3 = r3.mo77279s(r4)
            r2.f177308x = r3
            if (r3 == 0) goto L_0x0105
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enterLiveAction:"
            r4.append(r5)
            long r7 = r3.f186549g
            r4.append(r7)
            java.lang.String r5 = " targetTabId:"
            r4.append(r5)
            int r5 = r3.f186558s
            r4.append(r5)
            java.lang.String r5 = " tabId:"
            r4.append(r5)
            int r3 = r3.f186558s
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            if (r3 != 0) goto L_0x0107
        L_0x0105:
            java.lang.String r3 = "NULL"
        L_0x0107:
            java.lang.String r4 = r2.mo87439r()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "init isEnableVoice:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r6 = " tabTips:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.app.f r3 = com.tencent.p014mm.app.C40008f.f107254d
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$voipCallEvent$1 r4 = new com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$voipCallEvent$1
            r4.<init>(r2, r3)
            r2.f177282A = r4
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1 r4 = new com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1
            r4.<init>(r2, r3)
            r2.f177283B = r4
            r2.f177284C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm1.C62381d.<init>(android.content.Context, androidx.recyclerview.widget.RecyclerView, java.util.List, boolean, int, boolean, boolean, boolean, com.tencent.mm.view.recyclerview.WxRecyclerAdapter, int, gy3.h):void");
    }

    /* renamed from: A */
    public final void mo87427A(int i) {
        Runnable runnable = this.f177307w;
        if (runnable != null) {
            this.f177306v.removeCallbacks(runnable);
            this.f177307w = null;
        }
        HashSet<C62382a> hashSet = this.f177303s;
        ArrayList<C62382a> arrayList = new ArrayList<>();
        for (T next : hashSet) {
            if (((C62382a) next).f177311a == i) {
                arrayList.add(next);
            }
        }
        for (C62382a B : arrayList) {
            mo87428B(B);
        }
        C64175a0.m75511s(this.f177303s, new C62390j(i));
    }

    /* renamed from: B */
    public final void mo87428B(C62382a aVar) {
        String str;
        String r = mo87439r();
        StringBuilder sb = new StringBuilder();
        sb.append("stopLiveViewInternal ");
        int i = aVar.f177311a;
        C0797z zVar = aVar.f177313c;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i);
        sb4.append('-');
        String nickName = zVar.mo3513o().getNickName();
        if (nickName == null || TextUtils.isEmpty(nickName)) {
            str = "";
        } else {
            str = nickName.substring(0, Math.min(4, nickName.length()));
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb4.append(str);
        sb.append(sb4.toString());
        Log.m105924i(r, sb.toString());
        aVar.f177312b.mo78397l();
        aVar.f177312b.mo78388g();
        ViewParent parent = aVar.f177312b.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            View findViewWithTag = viewGroup.findViewWithTag("nearby-live-fluent-preview-view-tag");
            if (findViewWithTag != null) {
                viewGroup.removeView(findViewWithTag);
            }
            viewGroup.removeView(aVar.f177312b);
        }
        C63888h hVar = aVar.f177314d;
        if (hVar != null) {
            C64273c21 liveInfo = aVar.f177313c.mo3513o().getLiveInfo();
            C63881c.C63882a.m75104a(hVar, liveInfo != null ? liveInfo.f182392d : 0, true, false, 4, (Object) null);
        }
        C63888h hVar2 = aVar.f177314d;
        if (hVar2 != null) {
            hVar2.f181092f = null;
        }
        String r2 = mo87439r();
        Log.m105924i(r2, "stopLiveViewInternal pos:" + aVar.f177311a + " charge_live stop!");
        NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler = (NearbyLivePlayerViewRecycler) C39818r.f106831a.mo62446e(C8137c.class).mo75002a(NearbyLivePlayerViewRecycler.class);
        NearbyLivePreviewView nearbyLivePreviewView = aVar.f177312b;
        nearbyLivePlayerViewRecycler.getClass();
        C87412m.m108594g(nearbyLivePreviewView, "view");
        if (nearbyLivePreviewView.getParent() != null) {
            ViewParent parent2 = nearbyLivePreviewView.getParent();
            C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(nearbyLivePreviewView);
        }
        if (nearbyLivePreviewView.getPlayer() == null) {
            Log.m105928w("NearbyLivePlayerViewRecycler", "recycleView view:" + nearbyLivePreviewView + " return for player:" + nearbyLivePreviewView.getPlayer());
            return;
        }
        if (nearbyLivePreviewView.isPlaying()) {
            nearbyLivePreviewView.mo78397l();
            nearbyLivePreviewView.mo78388g();
        }
        nearbyLivePlayerViewRecycler.f160213d.add(nearbyLivePreviewView);
        Log.m105924i("NearbyLivePlayerViewRecycler", "recycleView view:" + nearbyLivePreviewView + " isPlaying:" + nearbyLivePreviewView.isPlaying() + " size:" + nearbyLivePlayerViewRecycler.f160213d.size());
    }

    /* renamed from: a */
    public void mo11214a() {
        String r = mo87439r();
        Log.m105924i(r, "stopCurrentView set:" + this.f177303s.size() + " set: " + this.f177303s);
        Runnable runnable = this.f177307w;
        if (runnable != null) {
            this.f177306v.removeCallbacks(runnable);
            this.f177307w = null;
        }
        for (C62382a iVar : this.f177303s) {
            C61926c.m72666K(0, new C62389i(this, iVar));
        }
        this.f177303s.clear();
    }

    /* renamed from: b */
    public void mo11215b() {
        String r = mo87439r();
        Log.m105924i(r, "checkAutoPlay isPagePause: " + mo87445x() + " enableNearbyLiveAutoPlay:" + this.f177294j);
        if (!this.f177294j) {
            String r2 = mo87439r();
            Log.m105928w(r2, "checkAutoPlay return for enableNearbyLiveAutoPlay:" + this.f177294j);
        } else if (!mo87445x()) {
            boolean z = false;
            this.f177296l = false;
            C62293i iVar = C62293i.f177081a;
            HashMap<Long, C62292g> hashMap = C62293i.f177088h;
            if (hashMap == null || hashMap.size() <= 0) {
                z = true;
            }
            Log.m105924i("FinderFluentSwitchManager", "ifDelayCheckAutoPlay:" + z + " size:" + hashMap.size());
            if (z) {
                Runnable runnable = this.f177307w;
                if (runnable != null) {
                    this.f177306v.removeCallbacks(runnable);
                    this.f177307w = null;
                }
                C62393j jVar = new C62393j(this);
                this.f177307w = jVar;
                this.f177306v.postDelayed(jVar, 100);
                return;
            }
            mo87431j();
        }
    }

    /* renamed from: c */
    public void mo11216c() {
        mo87435n();
        mo11214a();
    }

    /* renamed from: d */
    public void mo11217d(FinderObject finderObject, View view, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        String str;
        C64337e61 e612;
        FinderObject finderObject2 = finderObject;
        View view2 = view;
        C87412m.m108594g(finderObject, WeChatBrands.Business.GROUP_LIVE);
        C87412m.m108594g(view, "view");
        C0797z zVar = new C0797z(FinderItem.Companion.mo79056a(finderObject, 0));
        if (!((C87790d) C86312j.m106911c(C87790d.class)).W90()) {
            Log.m105928w(mo87439r(), "#checkAutoPlayByOutside return for expansions not yet installed");
        } else if (mo87445x()) {
            Log.m105920e(mo87439r(), "checkAutoPlayByOutside isPagePause");
        } else {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(C0966R.C0970id.fwx);
            if (frameLayout == null) {
                String r = mo87439r();
                Log.m105928w(r, "#checkAutoPlayByOutside return for view:" + view);
                return;
            }
            NearbyLivePreviewView s = mo87440s(frameLayout);
            C64273c21 c212 = zVar.mo3513o().getFeedObject().liveInfo;
            boolean z = true;
            Integer num = null;
            if (!(c212 != null && c212.f182394f == 1)) {
                StringBuilder sb = new StringBuilder();
                sb.append("#checkAutoPlayByOutside return for liveStatus:");
                C64273c21 c213 = zVar.mo3513o().getFeedObject().liveInfo;
                if (c213 != null) {
                    num = Integer.valueOf(c213.f182394f);
                }
                sb.append(num);
                mo87441t(sb.toString(), zVar, false);
                return;
            }
            int i = C61160f.f174109a;
            C64273c21 c214 = zVar.mo3513o().getFeedObject().liveInfo;
            int i2 = (c214 == null || (e612 = c214.f182363I) == null) ? 0 : e612.f182920d;
            if (i2 == 2 || i2 == 8 || i2 == 16) {
                mo87441t("#checkAutoPlayByOutside return for charge live!", zVar, false);
                return;
            }
            C64273c21 c215 = zVar.mo3513o().getFeedObject().liveInfo;
            if (c215 != null && (str = c215.f182395g) != null) {
                if (mo87443v(s)) {
                    mo87441t("#checkAutoPlayByOutside return for same feed:" + zVar + " same view:" + s + " set:" + this.f177303s.size(), zVar, true);
                    return;
                }
                C64273c21 c216 = zVar.mo3513o().getFeedObject().liveInfo;
                if (c216 == null || c216.f182384X != 1) {
                    z = false;
                }
                if (z) {
                    mo87441t("#checkAutoPlayByOutside return for vr live", zVar, false);
                    return;
                }
                mo87434m();
                this.f177303s.add(new C62382a((int) zVar.getItemId(), s, zVar, (C63888h) null));
                String r2 = mo87439r();
                Log.m105928w(r2, "#checkAutoPlayByOutside feed:" + zVar + " view:" + s);
                C61926c.m72666K(0, new C62392i(str, zVar, s, this, aVar, view, aVar2, pVar));
            }
        }
    }

    public void detach() {
        C39623j lifecycle;
        this.f177282A.dead();
        this.f177283B.dead();
        mo11214a();
        this.f177304t.clear();
        this.f177299o.mo80134c(this.f177285a);
        RecyclerView recyclerView = this.f177286b;
        if (recyclerView != null) {
            recyclerView.mo17098m1(this.f177309y);
        }
        Context context = this.f177285a;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null && (lifecycle = mMActivity.getLifecycle()) != null) {
            lifecycle.removeObserver(this.f177310z);
        }
    }

    /* renamed from: e */
    public void mo11219e() {
        mo87429h((C63285a) null);
    }

    /* renamed from: f */
    public void mo11220f() {
        mo87435n();
        String r = mo87439r();
        Log.m105924i(r, "pausePlayer set:" + this.f177303s.size() + " set: " + this.f177303s);
        Runnable runnable = this.f177307w;
        if (runnable != null) {
            this.f177306v.removeCallbacks(runnable);
            this.f177307w = null;
        }
        for (C62382a gVar : this.f177303s) {
            C61926c.m72666K(0, new C62387g(gVar));
        }
    }

    /* renamed from: g */
    public void mo11221g() {
        String r = mo87439r();
        Log.m105924i(r, "resumePlayer set:" + this.f177303s.size() + " set: " + this.f177303s);
        Runnable runnable = this.f177307w;
        if (runnable != null) {
            this.f177306v.removeCallbacks(runnable);
            this.f177307w = null;
        }
        for (C62382a hVar : this.f177303s) {
            C61926c.m72666K(0, new C62388h(hVar));
        }
    }

    /* renamed from: h */
    public final void mo87429h(C63285a aVar) {
        C39623j lifecycle;
        if (aVar != null) {
            this.f177298n = aVar;
        }
        this.f177282A.alive();
        this.f177283B.alive();
        this.f177299o.mo80133b(this.f177285a, new C62383c(this));
        Context context = this.f177285a;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null && (lifecycle = mMActivity.getLifecycle()) != null) {
            lifecycle.addObserver(this.f177310z);
        }
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.Integer] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e5, code lost:
        r0 = r0.liveInfo;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87430i(int r25, android.view.View r26) {
        /*
            r24 = this;
            r9 = r24
            r10 = r25
            r6 = r26
            java.lang.Class<iq.d> r0 = p564iq.C87790d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            iq.d r0 = (p564iq.C87790d) r0
            boolean r0 = r0.W90()
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r24.mo87439r()
            java.lang.String r1 = "checkAutoPlay return for expansions not yet installed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        L_0x001e:
            boolean r0 = r24.mo87445x()
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r24.mo87439r()
            java.lang.String r1 = "checkAutoPlay isPagePause"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x002e:
            boolean r0 = r9.f177284C
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = r24.mo87439r()
            java.lang.String r1 = "checkAutoPlay return for isEnableCheckAutoPlay is disable"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        L_0x003c:
            boolean r0 = r9.f177294j
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = r24.mo87439r()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkAutoPlay return for enableNearbyLiveAutoPlay:"
            r1.append(r2)
            boolean r2 = r9.f177294j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        L_0x005b:
            cm1.i2 r7 = r24.mo87437p(r25)
            java.lang.String r8 = "checkAutoPlay pos:"
            if (r7 != 0) goto L_0x0082
            java.lang.String r0 = r24.mo87439r()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r10)
            java.lang.String r2 = "  return for feed:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        L_0x0082:
            r0 = 2131307699(0x7f092cb3, float:1.8233633E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = r24.mo87439r()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r10)
            java.lang.String r2 = " return for view:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            return
        L_0x00ac:
            java.lang.String r1 = r24.mo87439r()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "checkAutoPlay getOrCreateLiveView livePlayerContainer: "
            r2.append(r3)
            int r3 = r0.hashCode()
            r2.append(r3)
            java.lang.String r3 = " pos: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            com.tencent.mm.plugin.finder.nearby.live.play.NearbyLivePreviewView r11 = r9.mo87440s(r0)
            boolean r0 = r7 instanceof cm1.C0797z
            if (r0 == 0) goto L_0x0317
            r12 = r7
            cm1.z r12 = (cm1.C0797z) r12
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x00ec
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x00ec
            long r3 = r0.f182392d
            goto L_0x00ee
        L_0x00ec:
            r3 = 0
        L_0x00ee:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0111
            te3.by0 r0 = r0.f182402p0
            if (r0 == 0) goto L_0x0111
            int r5 = r0.f131380d
            int r15 = ks3.C10411s.f31639a
            if (r5 != r13) goto L_0x010c
            int r0 = r0.f131383g
            if (r0 == r13) goto L_0x010c
            r0 = 1
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            if (r0 != r13) goto L_0x0111
            r0 = 1
            goto L_0x0112
        L_0x0111:
            r0 = 0
        L_0x0112:
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "checkAutoPlay return is olympic"
            r9.mo87441t(r0, r12, r14)
            return
        L_0x011a:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x012c
            int r0 = r0.f182394f
            if (r0 != r13) goto L_0x012c
            r0 = 1
            goto L_0x012d
        L_0x012c:
            r0 = 0
        L_0x012d:
            r5 = 0
            if (r0 != 0) goto L_0x015d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r10)
            java.lang.String r1 = " return for liveStatus:"
            r0.append(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            te3.c21 r1 = r1.liveInfo
            if (r1 == 0) goto L_0x0152
            int r1 = r1.f182394f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
        L_0x0152:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.mo87441t(r0, r12, r14)
            return
        L_0x015d:
            gy3.f0 r15 = new gy3.f0
            r15.<init>()
            sg1.i r0 = sg1.C63889i.f181100a
            com.tencent.mm.plugin.finder.storage.FinderItem r16 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r16.getFeedObject()
            te3.c21 r1 = r1.liveInfo
            if (r1 == 0) goto L_0x0172
            te3.ga1 r5 = r1.f182362H
        L_0x0172:
            te3.dp2 r5 = r0.mo88654a(r3, r5)
            int r0 = ks3.C61160f.f174109a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x018b
            te3.e61 r0 = r0.f182363I
            if (r0 == 0) goto L_0x018b
            int r0 = r0.f182920d
            goto L_0x018c
        L_0x018b:
            r0 = 0
        L_0x018c:
            r1 = 2
            if (r0 == r1) goto L_0x019a
            r1 = 8
            if (r0 == r1) goto L_0x019a
            r1 = 16
            if (r0 != r1) goto L_0x0198
            goto L_0x019a
        L_0x0198:
            r0 = 0
            goto L_0x019b
        L_0x019a:
            r0 = 1
        L_0x019b:
            if (r0 == 0) goto L_0x023a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x01b3
            te3.e61 r0 = r0.f182363I
            if (r0 == 0) goto L_0x01b3
            boolean r0 = r0.f182921e
            if (r0 != r13) goto L_0x01b3
            r0 = 1
            goto L_0x01b4
        L_0x01b3:
            r0 = 0
        L_0x01b4:
            if (r0 != 0) goto L_0x023a
            java.lang.String r0 = r24.mo87439r()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r10)
            java.lang.String r2 = " liveId="
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " you are charge_live,"
            r1.append(r2)
            sk1.a r2 = sk1.C63947a.f181274a
            java.lang.String r2 = r2.mo88731q(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            int r0 = r5.f182792e
            if (r0 > r13) goto L_0x0203
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r10)
            java.lang.String r1 = " return for charge_live residueTime="
            r0.append(r1)
            int r1 = r5.f182792e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.mo87441t(r0, r12, r14)
            return
        L_0x0203:
            sg1.h r2 = new sg1.h
            r0 = 1
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r12.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x0215
            long r13 = r1.f182392d
            r18 = r13
            goto L_0x0217
        L_0x0215:
            r18 = 0
        L_0x0217:
            r20 = 0
            r21 = 1
            r22 = 4
            r23 = 0
            r16 = r2
            r17 = r0
            r16.<init>(r17, r18, r20, r21, r22, r23)
            pm1.d$d r13 = new pm1.d$d
            r0 = r13
            r1 = r24
            r14 = r2
            r2 = r25
            r16 = r5
            r5 = r26
            r0.<init>(r1, r2, r3, r5)
            r14.f181092f = r13
            r15.f27484d = r14
            goto L_0x023c
        L_0x023a:
            r16 = r5
        L_0x023c:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x032f
            java.lang.String r1 = r0.f182395g
            if (r1 == 0) goto L_0x032f
            boolean r0 = r9.mo87443v(r11)
            if (r0 == 0) goto L_0x0284
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r10)
            java.lang.String r1 = " return for same feed:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " same view:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " set:"
            r0.append(r1)
            java.util.HashSet<pm1.d$a> r1 = r9.f177303s
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 1
            r9.mo87441t(r0, r12, r2)
            return
        L_0x0284:
            r2 = 1
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r12.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x0297
            int r0 = r0.f182384X
            if (r0 != r2) goto L_0x0297
            r13 = 1
            goto L_0x0298
        L_0x0297:
            r13 = 0
        L_0x0298:
            if (r13 == 0) goto L_0x02b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r10)
            java.lang.String r1 = " return for vr live"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r9.mo87441t(r0, r12, r1)
            return
        L_0x02b3:
            r24.mo87434m()
            java.util.HashSet<pm1.d$a> r0 = r9.f177303s
            pm1.d$a r2 = new pm1.d$a
            T r3 = r15.f27484d
            sg1.h r3 = (sg1.C63888h) r3
            r2.<init>(r10, r11, r12, r3)
            r0.add(r2)
            java.lang.String r0 = r24.mo87439r()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r10)
            java.lang.String r3 = " curLivePreviewDataSet: "
            r2.append(r3)
            java.util.HashSet<pm1.d$a> r3 = r9.f177303s
            r2.append(r3)
            java.lang.String r3 = " feed:"
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " view:"
            r2.append(r3)
            r2.append(r11)
            r3 = 32
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            pm1.d$e r13 = new pm1.d$e
            r0 = r13
            r2 = r7
            r3 = r24
            r4 = r25
            r5 = r11
            r6 = r26
            r7 = r16
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            o40.C61926c.m72668M(r13)
            ln1.a r1 = ln1.C61313a.f174432a
            long r3 = (long) r10
            r5 = 1
            r2 = r12
            r1.mo86280a(r2, r3, r5)
            goto L_0x032f
        L_0x0317:
            java.lang.String r0 = r24.mo87439r()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkAutoPlay return for feed:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x032f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm1.C62381d.mo87430i(int, android.view.View):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87431j() {
        /*
            r14 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r14.f177286b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager r0 = (com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) r0
            androidx.recyclerview.widget.RecyclerView r1 = r14.f177286b
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            r2 = 0
            if (r1 == 0) goto L_0x001e
            int r1 = r1.getItemCount()
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            r3 = 2
            int[] r4 = new int[r3]
            int[] r3 = new int[r3]
            r0.mo17394A(r4)
            r0.mo17395B(r3)
            qm1.a r5 = r14.f177298n
            int[] r5 = r5.mo12394b(r0, r4, r3)
            boolean r6 = r14.f177301q
            r7 = 1
            if (r6 == 0) goto L_0x0057
            r6 = r4[r2]
            r8 = r3[r7]
            if (r6 > r8) goto L_0x0048
        L_0x003b:
            boolean r9 = r14.mo87442u(r6)
            if (r9 == 0) goto L_0x0043
            r6 = 1
            goto L_0x0049
        L_0x0043:
            if (r6 == r8) goto L_0x0048
            int r6 = r6 + 1
            goto L_0x003b
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r6 == 0) goto L_0x0057
            r14.f177301q = r2
            java.lang.String r0 = r14.mo87439r()
            java.lang.String r1 = "checkAutoPlayInternal return for hit test3 & before invoke by touch event"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0057:
            int r6 = r5.length
            r8 = 0
        L_0x0059:
            if (r8 >= r6) goto L_0x008f
            r9 = r5[r8]
            android.view.View r10 = r0.findViewByPosition(r9)
            if (r10 == 0) goto L_0x0069
            r14.mo87430i(r9, r10)
            rx3.b0 r11 = rx3.C13598b0.f38549a
            goto L_0x006a
        L_0x0069:
            r11 = 0
        L_0x006a:
            if (r11 != 0) goto L_0x008c
            java.lang.String r11 = r14.mo87439r()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "checkAutoPlayInternal invalid pos:"
            r12.append(r13)
            r12.append(r9)
            java.lang.String r9 = " view:"
            r12.append(r9)
            r12.append(r10)
            java.lang.String r9 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r9)
        L_0x008c:
            int r8 = r8 + 1
            goto L_0x0059
        L_0x008f:
            r5 = 0
            pm1.d$f r0 = new pm1.d$f
            r0.<init>(r14)
            o40.C61926c.m72666K(r5, r0)
            java.lang.String r0 = r14.mo87439r()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkAutoPlayInternal visible["
            r5.append(r6)
            r2 = r4[r2]
            r5.append(r2)
            java.lang.String r2 = ", "
            r5.append(r2)
            r2 = r3[r7]
            r5.append(r2)
            java.lang.String r2 = "] itemCount:"
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm1.C62381d.mo87431j():void");
    }

    /* renamed from: k */
    public final void mo87432k() {
        RecyclerView recyclerView = this.f177286b;
        if (recyclerView != null) {
            if (!this.f177294j) {
                String r = mo87439r();
                Log.m105928w(r, "checkAutoStopInternal return for enableNearbyLiveAutoPlay:" + this.f177294j);
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (FinderStaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            finderStaggeredGridLayoutManager.mo17394A(iArr);
            finderStaggeredGridLayoutManager.mo17395B(iArr2);
            if (finderStaggeredGridLayoutManager.f44894h == 0) {
                int i = iArr[0];
                int i2 = iArr2[0];
                if (i <= i2) {
                    while (true) {
                        mo87433l(i);
                        if (i != i2) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                for (int i3 = 0; i3 < 2; i3++) {
                    mo87433l(iArr[i3]);
                }
                for (int i4 = 0; i4 < 2; i4++) {
                    mo87433l(iArr2[i4]);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo87433l(int i) {
        RecyclerView recyclerView = this.f177286b;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (FinderStaggeredGridLayoutManager) layoutManager;
            View findViewByPosition = finderStaggeredGridLayoutManager.findViewByPosition(i);
            if (findViewByPosition != null) {
                mo87436o(i);
                boolean c = C10934a.f32583a.mo11134c(finderStaggeredGridLayoutManager.f44894h, findViewByPosition, 0.5f);
                NearbyLivePreviewView nearbyLivePreviewView = (NearbyLivePreviewView) findViewByPosition.findViewWithTag("nearby-live-preview-view-tag");
                boolean v = nearbyLivePreviewView != null ? mo87443v(nearbyLivePreviewView) : false;
                if (finderStaggeredGridLayoutManager.f44894h == 0) {
                    Log.m105924i("ZehongDetach", "scroll checkAutoStopInternal ori: " + finderStaggeredGridLayoutManager.f44894h + " ThanXPercent: " + c + " isCurPlayerView: " + v + " pos: " + i + " hashCode: " + hashCode());
                }
                if (c && v) {
                    mo87427A(i);
                    String r = mo87439r();
                    Log.m105924i(r, "checkAutoStopInternal stop pos:" + i + " view:" + findViewByPosition);
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo87434m() {
        RecyclerView recyclerView = this.f177286b;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            for (C62382a aVar : this.f177298n.mo12393a((FinderStaggeredGridLayoutManager) layoutManager, new HashSet(this.f177303s))) {
                mo87427A(aVar.f177311a);
            }
        }
    }

    /* renamed from: n */
    public final void mo87435n() {
        this.f177304t.clear();
    }

    /* renamed from: o */
    public final void mo87436o(int i) {
        RecyclerView recyclerView = this.f177286b;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
            View findViewByPosition = ((FinderStaggeredGridLayoutManager) layoutManager).findViewByPosition(i);
            if (findViewByPosition != null) {
                mo87444w(i);
                View findViewById = findViewByPosition.findViewById(C0966R.C0970id.f357470a03);
                findViewByPosition.findViewById(C0966R.C0970id.fmm);
                findViewByPosition.findViewById(C0966R.C0970id.fmn);
                findViewByPosition.findViewById(C0966R.C0970id.fmo);
                findViewByPosition.findViewById(C0966R.C0970id.it6);
                findViewByPosition.findViewById(C0966R.C0970id.it7);
                findViewByPosition.findViewById(C0966R.C0970id.it8);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "dismissAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "dismissAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* renamed from: p */
    public final C0740i2 mo87437p(int i) {
        if (this.f177287c == null) {
            String r = mo87439r();
            Log.m105928w(r, "getFeedByPos return for feedList:" + this.f177287c);
            return null;
        }
        int q = i - mo87438q();
        if (q < 0 || q >= this.f177287c.size()) {
            String r2 = mo87439r();
            Log.m105928w(r2, "getFeedByPos return for invalid pos:" + i + ", headerCount=" + mo87438q());
            return null;
        }
        C9493c cVar = this.f177287c.get(q);
        if (cVar instanceof C0740i2) {
            return (C0740i2) cVar;
        }
        return null;
    }

    /* renamed from: q */
    public final int mo87438q() {
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f177293i;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.mo85796c6();
        }
        return 0;
    }

    /* renamed from: r */
    public final String mo87439r() {
        return "NearbyLiveAutoPlayManager." + hashCode();
    }

    /* renamed from: s */
    public final NearbyLivePreviewView mo87440s(FrameLayout frameLayout) {
        NearbyLivePreviewView nearbyLivePreviewView = (NearbyLivePreviewView) frameLayout.findViewWithTag("nearby-live-preview-view-tag");
        if (nearbyLivePreviewView != null) {
            String r = mo87439r();
            Log.m105924i(r, "getOrCreateLiveView get view:" + nearbyLivePreviewView);
            return nearbyLivePreviewView;
        }
        NearbyLivePlayerViewRecycler nearbyLivePlayerViewRecycler = (NearbyLivePlayerViewRecycler) C39818r.f106831a.mo62446e(C8137c.class).mo75002a(NearbyLivePlayerViewRecycler.class);
        NearbyLivePreviewView nearbyLivePreviewView2 = (NearbyLivePreviewView) C61926c.m72672Q(nearbyLivePlayerViewRecycler.f160213d, C35560t.f95078d);
        if (nearbyLivePreviewView2 != null) {
            Log.m105924i("NearbyLivePlayerViewRecycler", "getOrCreate: get view success, view.hashcode = " + nearbyLivePreviewView2.hashCode() + " recycledViews.size = " + nearbyLivePlayerViewRecycler.f160213d.size());
        } else {
            nearbyLivePreviewView2 = nearbyLivePlayerViewRecycler.mo78382c3();
        }
        nearbyLivePreviewView2.setTag("nearby-live-preview-view-tag");
        frameLayout.addView(nearbyLivePreviewView2);
        String r2 = mo87439r();
        Log.m105924i(r2, "getOrCreateLiveView create view:" + nearbyLivePreviewView2);
        return nearbyLivePreviewView2;
    }

    /* renamed from: t */
    public final void mo87441t(String str, C0797z zVar, boolean z) {
        C58924d dVar;
        String r = mo87439r();
        Log.m105924i(r, "handleAutoPlayError: " + str);
        C62293i iVar = C62293i.f177081a;
        C62290e a = iVar.mo87356a(zVar.getItemId());
        String r2 = mo87439r();
        Log.m105924i(r2, "handleAutoPlayError isSameFeed: " + z + " canReusePlayer: " + a.f177071b + " feedId: " + zVar.getItemId() + ' ');
        if (a.f177071b && !z) {
            C62292g gVar = a.f177072c;
            if (!(gVar == null || (dVar = gVar.f177095g) == null)) {
                dVar.stopPlay(true);
            }
            iVar.mo87358c();
        }
    }

    /* renamed from: u */
    public final boolean mo87442u(int i) {
        T t;
        boolean z;
        Iterator<T> it = this.f177303s.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C62382a) t).f177311a == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: v */
    public final boolean mo87443v(NearbyLivePreviewView nearbyLivePreviewView) {
        T t;
        Iterator<T> it = this.f177303s.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C62382a) t).f177312b, nearbyLivePreviewView)) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: w */
    public final boolean mo87444w(int i) {
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= i) {
                break;
            }
            if ((i3 - i4) % 2 != 0 || (mo87437p(i3 + 1) instanceof C0797z)) {
                z = false;
            }
            if (!(mo87437p(i3) instanceof C0797z) || (mo87437p(i3) instanceof C0090c) || z) {
                i2--;
                i4++;
            }
            i3++;
        }
        return i2 % 2 == 0;
    }

    /* renamed from: x */
    public final boolean mo87445x() {
        Context context = this.f177285a;
        MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
        if (mMActivity != null) {
            return mMActivity.isPaused();
        }
        return true;
    }

    /* renamed from: y */
    public final boolean mo87446y(int i) {
        if (mo87437p(i) instanceof C0090c) {
            return true;
        }
        return mo87444w(i) && ((mo87437p(i + 1) instanceof C0797z) ^ true);
    }

    /* renamed from: z */
    public final void mo87447z(boolean z) {
        this.f177284C = z;
        if (z) {
            mo11215b();
            return;
        }
        mo87435n();
        mo11214a();
    }
}
