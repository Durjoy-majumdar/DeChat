package mf1;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import er1.C7868s3;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import lf1.C10500a;
import o40.C11348f;
import o40.C61926c;
import pf1.C11896f;
import pf1.C11911l;
import pf1.C11917o0;
import pf1.C11920q;
import pf1.C11929x;
import pf1.C11930y;
import pf1.C62273n;
import rf1.C12982a;
import rf1.C12990b;
import rf1.C12991c;
import rs1.C13383r;
import rs1.C13442s8;
import rs1.C13448t;
import rs1.C13467u;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C50124kf1;
import te3.C51384te1;
import te3.C51432tq3;
import te3.uc4;
import up1.C37521f;

/* renamed from: mf1.o0 */
public abstract class C10846o0 extends UIComponent {

    /* renamed from: s */
    public static final float f32387s = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3766df);

    /* renamed from: t */
    public static final float f32388t = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3703bv);

    /* renamed from: u */
    public static final HashMap<C10848b, C10817f1> f32389u = new HashMap<>();

    /* renamed from: d */
    public final C13601g f32390d = C36568h.m40985a(C10849c.f32413d);

    /* renamed from: e */
    public final MMHandler f32391e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public final HashMap<Integer, LinkedList<View>> f32392f = new HashMap<>();

    /* renamed from: g */
    public final C13601g f32393g = C36568h.m40985a(new C10853g(this));

    /* renamed from: h */
    public final int f32394h = C0966R.C0970id.mzc;

    /* renamed from: i */
    public final int f32395i = C0966R.C0970id.mzb;

    /* renamed from: j */
    public final int f32396j = C0966R.C0970id.gqx;

    /* renamed from: n */
    public C32226l<? super C60905o, C13598b0> f32397n;

    /* renamed from: o */
    public final SparseIntArray f32398o = new SparseIntArray();

    /* renamed from: p */
    public final ConcurrentHashMap<Integer, C12982a> f32399p = new ConcurrentHashMap<>();

    /* renamed from: q */
    public final ConcurrentHashMap<Integer, C12990b> f32400q = new ConcurrentHashMap<>();

    /* renamed from: r */
    public final HashMap<Integer, C10847a> f32401r = new HashMap<>();

    /* renamed from: mf1.o0$a */
    public final class C10847a implements C0120a0<Set<? extends C11911l>> {

        /* renamed from: d */
        public final C60905o f32402d;

        /* renamed from: e */
        public final BaseFinderFeed f32403e;

        /* renamed from: f */
        public final String f32404f;

        /* renamed from: g */
        public final long f32405g;

        /* renamed from: h */
        public C11929x f32406h;

        /* renamed from: i */
        public final Context f32407i;

        /* renamed from: j */
        public final /* synthetic */ C10846o0 f32408j;

        public C10847a(C10846o0 o0Var, C60905o oVar, BaseFinderFeed baseFinderFeed, String str, long j, C11929x xVar, int i, C8480h hVar) {
            j = (i & 8) != 0 ? 0 : j;
            xVar = (i & 16) != 0 ? null : xVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
            this.f32408j = o0Var;
            this.f32402d = oVar;
            this.f32403e = baseFinderFeed;
            this.f32404f = str;
            this.f32405g = j;
            this.f32406h = xVar;
            this.f32407i = oVar.f44854d.getContext();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10847a) {
                return C87412m.m108589b(this.f32402d.f44854d, ((C10847a) obj).f32402d.f44854d);
            }
            return false;
        }

        public int hashCode() {
            return this.f32402d.f44854d.hashCode();
        }

        /* JADX WARNING: Removed duplicated region for block: B:111:0x0398  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x039b  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x03a4  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x03ad  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x03b9  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x03bb  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x03c0  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x03c3  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x03ca  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x03cd  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0405  */
        /* JADX WARNING: Removed duplicated region for block: B:145:0x0438  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x043d  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0458  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0468  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x05b4  */
        /* JADX WARNING: Removed duplicated region for block: B:229:0x05dd  */
        /* JADX WARNING: Removed duplicated region for block: B:260:0x0392 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:263:0x0416 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x021c  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x023d  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x024a  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x027f  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x02b2  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0327  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0372  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r40) {
            /*
                r39 = this;
                r9 = r39
                r0 = r40
                java.util.Set r0 = (java.util.Set) r0
                java.lang.String r1 = "set"
                gy3.C87412m.m108594g(r0, r1)
                boolean r1 = r0.isEmpty()
                r10 = 0
                if (r1 == 0) goto L_0x001c
                sx3.f0 r1 = sx3.C64186f0.f181907d
                pf1.x r2 = r9.f32406h
                if (r2 == 0) goto L_0x001c
                r2.mo2364a(r10, r1)
            L_0x001c:
                mf1.o0 r11 = r9.f32408j
                java.util.Iterator r12 = r0.iterator()
            L_0x0022:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x067a
                java.lang.Object r0 = r12.next()
                r13 = r0
                pf1.l r13 = (pf1.C11911l) r13
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onChanged feedId="
                r0.append(r1)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r9.f32403e
                long r1 = r1.getItemId()
                r0.append(r1)
                java.lang.String r1 = " commentId="
                r0.append(r1)
                long r1 = r9.f32405g
                r0.append(r1)
                java.lang.String r1 = " position="
                r0.append(r1)
                jq3.o r1 = r9.f32402d
                int r1 = r1.mo17363j()
                r0.append(r1)
                java.lang.String r1 = " ex.position="
                r0.append(r1)
                int r1 = r13.f34805c
                r0.append(r1)
                java.lang.String r1 = " jumpInfoList=["
                r0.append(r1)
                java.util.List<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r14 = r13.f34806d
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                mf1.g0 r20 = mf1.C10819g0.f32320d
                r21 = 31
                r22 = 0
                java.lang.String r1 = sx3.C110818d0.m150921S(r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "Finder.BaseAdFeedJumperUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                float r0 = mf1.C10846o0.f32387s
                rx3.g r0 = r11.f32393g
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                java.util.Map r0 = (java.util.Map) r0
                int r3 = r13.f34805c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r0.get(r3)
                r14 = r0
                rf1.c r14 = (rf1.C12991c) r14
                if (r14 == 0) goto L_0x0673
                jq3.o r0 = r9.f32402d
                android.view.View r0 = r0.f44854d
                java.lang.String r3 = "holder.itemView"
                gy3.C87412m.m108593f(r0, r3)
                android.view.ViewGroup r15 = r14.mo11030a(r0)
                if (r15 != 0) goto L_0x00c4
                sx3.f0 r0 = sx3.C64186f0.f181907d
                pf1.x r1 = r9.f32406h
                if (r1 == 0) goto L_0x0022
                r1.mo2364a(r10, r0)
                goto L_0x0022
            L_0x00c4:
                int r0 = r11.f32396j
                java.lang.Object r0 = r15.getTag(r0)
                boolean r3 = r0 instanceof java.lang.String
                r16 = 0
                if (r3 == 0) goto L_0x00d3
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x00d5
            L_0x00d3:
                r0 = r16
            L_0x00d5:
                java.lang.String r17 = ""
                if (r0 != 0) goto L_0x00db
                r0 = r17
            L_0x00db:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = 91
                r3.append(r4)
                java.util.List<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r4 = r13.f34806d
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                mf1.m0 r24 = mf1.C10842m0.f32379d
                r25 = 31
                r26 = 0
                r18 = r4
                java.lang.String r4 = sx3.C110818d0.m150921S(r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                boolean r8 = gy3.C87412m.m108589b(r0, r3)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "onChanged position="
                r4.append(r5)
                int r5 = r13.f34805c
                r4.append(r5)
                java.lang.String r5 = " isSkipViewChange="
                r4.append(r5)
                r4.append(r8)
                java.lang.String r5 = " prevList=["
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = "] nowList=["
                r4.append(r0)
                r4.append(r3)
                r4.append(r1)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                jq3.o r0 = r9.f32402d
                r11.mo11059K3(r0, r15, r8)
                if (r8 != 0) goto L_0x0148
                int r0 = r11.f32396j
                r15.setTag(r0, r3)
            L_0x0148:
                java.util.List<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r0 = r13.f34806d
                java.util.Iterator r18 = r0.iterator()
                r0 = 0
            L_0x014f:
                boolean r1 = r18.hasNext()
                if (r1 == 0) goto L_0x0663
                java.lang.Object r1 = r18.next()
                int r19 = r0 + 1
                if (r0 < 0) goto L_0x065f
                r6 = r1
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r6
                int r1 = r6.business_type
                r2 = 2
                if (r1 != r2) goto L_0x0192
                int r1 = r6.jumpinfo_type
                r3 = 7
                if (r1 != r3) goto L_0x0192
                bl3.r r0 = bl3.C39818r.f106831a
                jq3.o r1 = r9.f32402d
                android.content.Context r1 = r1.f173499A
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r1, r3)
                com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
                bl3.r$a r0 = r0.mo62444c(r1)
                java.lang.Class<ht1.y2> r1 = ht1.C8817y2.class
                bl3.c r0 = r0.mo62447c(r1)
                ht1.y2 r0 = (ht1.C8817y2) r0
                ht1.z2 r0 = r0.mo9643v2()
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r9.f32403e
                long r3 = r1.getItemId()
                r0.mo9645S0(r2, r3)
                goto L_0x025f
            L_0x0192:
                java.lang.String r1 = r9.f32404f
                java.lang.String r3 = "source"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.String r3 = "timeline"
                boolean r1 = gy3.C87412m.m108589b(r1, r3)
                if (r1 == 0) goto L_0x01ab
                int r1 = r6.business_type
                r5 = 21
                if (r1 != r5) goto L_0x01ab
                r1 = 1
                goto L_0x01ac
            L_0x01ab:
                r1 = 0
            L_0x01ac:
                if (r1 == 0) goto L_0x01b0
                goto L_0x025f
            L_0x01b0:
                java.util.LinkedList<te3.uc4> r1 = r6.style
                java.lang.String r5 = "info.style"
                gy3.C87412m.m108593f(r1, r5)
                java.util.Iterator r1 = r1.iterator()
                r7 = 0
            L_0x01bc:
                boolean r20 = r1.hasNext()
                if (r20 == 0) goto L_0x01d5
                java.lang.Object r20 = r1.next()
                r2 = r20
                te3.uc4 r2 = (te3.uc4) r2
                int r4 = r2.f142760f
                int r10 = r13.f34805c
                if (r4 != r10) goto L_0x01d2
                int r7 = r2.f142762h
            L_0x01d2:
                r2 = 2
                r10 = 0
                goto L_0x01bc
            L_0x01d5:
                int r1 = r14.mo11031b(r7)
                if (r1 > 0) goto L_0x01dd
                goto L_0x025f
            L_0x01dd:
                if (r8 == 0) goto L_0x01ea
                java.lang.String r2 = r6.jump_id
                if (r2 != 0) goto L_0x01e5
                r2 = r17
            L_0x01e5:
                android.view.View r2 = mf1.C10846o0.m10832c3(r11, r15, r7, r2)
                goto L_0x01ec
            L_0x01ea:
                r2 = r16
            L_0x01ec:
                if (r2 != 0) goto L_0x0214
                java.util.HashMap<java.lang.Integer, java.util.LinkedList<android.view.View>> r2 = r11.f32392f
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
                java.lang.Object r2 = r2.get(r4)
                java.util.LinkedList r2 = (java.util.LinkedList) r2
                if (r2 == 0) goto L_0x0203
                java.lang.Object r2 = r2.poll()
                android.view.View r2 = (android.view.View) r2
                goto L_0x0205
            L_0x0203:
                r2 = r16
            L_0x0205:
                if (r2 != 0) goto L_0x0214
                android.content.Context r2 = r9.f32407i
                android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r2)
                r4 = 0
                android.view.View r1 = r2.inflate(r1, r15, r4)
                r10 = r1
                goto L_0x0215
            L_0x0214:
                r10 = r2
            L_0x0215:
                int r1 = r13.f34805c
                java.lang.String r2 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
                r4 = 5
                if (r1 != r4) goto L_0x023b
                if (r0 != 0) goto L_0x022d
                android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
                gy3.C87412m.m108592e(r1, r2)
                android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
                float r4 = mf1.C10846o0.f32388t
                int r4 = (int) r4
                r1.topMargin = r4
                goto L_0x023b
            L_0x022d:
                android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
                gy3.C87412m.m108592e(r1, r2)
                android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
                float r4 = mf1.C10846o0.f32387s
                int r4 = (int) r4
                r1.topMargin = r4
            L_0x023b:
                if (r8 != 0) goto L_0x0240
                r15.addView(r10)
            L_0x0240:
                int r1 = r11.f32394h
                java.lang.Object r1 = r10.getTag(r1)
                boolean r4 = r1 instanceof rf1.C12982a
                if (r4 == 0) goto L_0x024d
                rf1.a r1 = (rf1.C12982a) r1
                goto L_0x024f
            L_0x024d:
                r1 = r16
            L_0x024f:
                if (r1 != 0) goto L_0x0266
                rf1.a r1 = r14.mo11032c(r7)
                if (r1 == 0) goto L_0x025f
                int r4 = r11.f32394h
                r10.setTag(r4, r1)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                goto L_0x0266
            L_0x025f:
                r10 = r8
                r30 = r12
                r31 = r15
                goto L_0x0655
            L_0x0266:
                r4 = r1
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, rf1.b> r1 = r11.f32400q
                r30 = r12
                jq3.o r12 = r9.f32402d
                int r12 = r12.hashCode()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Object r1 = r1.get(r12)
                rf1.b r1 = (rf1.C12990b) r1
                java.lang.String r12 = "FeedJumperObserverWrapper"
                if (r1 != 0) goto L_0x02b2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r31 = r15
                java.lang.String r15 = "onChanged createObserverWrapper for holder="
                r1.append(r15)
                jq3.o r15 = r9.f32402d
                int r15 = r15.hashCode()
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
                rf1.b r1 = new rf1.b
                r1.<init>()
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, rf1.b> r15 = r11.f32400q
                r23 = r3
                jq3.o r3 = r9.f32402d
                int r3 = r3.hashCode()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r15.put(r3, r1)
                goto L_0x02b6
            L_0x02b2:
                r23 = r3
                r31 = r15
            L_0x02b6:
                int r3 = r10.hashCode()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
                r24 = r2
                java.util.HashMap<java.lang.Integer, rf1.a> r2 = r1.f37051a
                r2.put(r15, r4)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r15 = "[addObserver] key:"
                r2.append(r15)
                r2.append(r3)
                java.lang.String r3 = " observer:"
                r2.append(r3)
                int r3 = r4.hashCode()
                r2.append(r3)
                java.lang.String r3 = " observerWrapper:"
                r2.append(r3)
                int r1 = r1.hashCode()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, rf1.a> r1 = r11.f32399p
                jq3.o r2 = r9.f32402d
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r1 = r1.get(r2)
                rf1.a r1 = (rf1.C12982a) r1
                up1.f r2 = up1.C37521f.f99374d
                r2.getClass()
                pe1.c<java.lang.Integer> r2 = up1.C37521f.f99551w8
                java.lang.Object r2 = r2.mo60266n()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = 1
                if (r2 != r3) goto L_0x0324
                if (r1 == 0) goto L_0x0324
                int r1 = r1.f37018g
                r2 = 2
                if (r1 != r2) goto L_0x0324
                int r1 = r6.business_type
                if (r1 == r2) goto L_0x0324
                r1 = 1
                goto L_0x0325
            L_0x0324:
                r1 = 0
            L_0x0325:
                if (r1 != 0) goto L_0x0336
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, rf1.a> r1 = r11.f32399p
                jq3.o r2 = r9.f32402d
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.put(r2, r4)
            L_0x0336:
                int r1 = r11.f32395i
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                r10.setTag(r1, r2)
                pf1.q r12 = new pf1.q
                r12.<init>(r6)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r9.f32403e
                r12.f34830d = r1
                java.lang.String r1 = r9.f32404f
                r12.f34833g = r1
                int r1 = r13.f34805c
                r12.f34841o = r1
                r12.f34842p = r7
                long r1 = r9.f32405g
                r12.f34831e = r1
                java.lang.String r1 = r13.f34808f
                java.lang.String r2 = "<set-?>"
                gy3.C87412m.m108594g(r1, r2)
                r12.f34840n = r1
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r12.f34827a
                java.util.LinkedList<te3.uc4> r1 = r1.style
                java.lang.String r3 = "infoEx.jumpInfo.style"
                gy3.C87412m.m108593f(r1, r3)
                java.util.Iterator r1 = r1.iterator()
            L_0x036c:
                boolean r15 = r1.hasNext()
                if (r15 == 0) goto L_0x0392
                java.lang.Object r15 = r1.next()
                r40 = r1
                r1 = r15
                te3.uc4 r1 = (te3.uc4) r1
                r25 = r15
                int r15 = r1.f142762h
                if (r15 != r7) goto L_0x0389
                int r1 = r1.f142760f
                int r15 = r13.f34805c
                if (r1 != r15) goto L_0x0389
                r1 = 1
                goto L_0x038a
            L_0x0389:
                r1 = 0
            L_0x038a:
                if (r1 == 0) goto L_0x038f
                r15 = r25
                goto L_0x0394
            L_0x038f:
                r1 = r40
                goto L_0x036c
            L_0x0392:
                r15 = r16
            L_0x0394:
                te3.uc4 r15 = (te3.uc4) r15
                if (r15 == 0) goto L_0x039b
                int r1 = r15.f142772u
                goto L_0x039c
            L_0x039b:
                r1 = 0
            L_0x039c:
                r12.f34844r = r1
                int r1 = r1 * 1000
                r12.f34843q = r1
                if (r15 == 0) goto L_0x03ad
                int r1 = r15.f142774w
                r40 = r0
                r0 = 1
                if (r1 != r0) goto L_0x03b0
                r1 = 1
                goto L_0x03b1
            L_0x03ad:
                r40 = r0
                r0 = 1
            L_0x03b0:
                r1 = 0
            L_0x03b1:
                r12.f34845s = r1
                if (r15 == 0) goto L_0x03bb
                int r1 = r15.f142752I
                if (r1 != r0) goto L_0x03bb
                r1 = 1
                goto L_0x03bc
            L_0x03bb:
                r1 = 0
            L_0x03bc:
                r12.f34847u = r1
                if (r15 == 0) goto L_0x03c3
                int r1 = r15.f142777z
                goto L_0x03c4
            L_0x03c3:
                r1 = 0
            L_0x03c4:
                int r1 = r1 / 1000
                r12.f34850x = r1
                if (r15 == 0) goto L_0x03cd
                int r1 = r15.f142745B
                goto L_0x03ce
            L_0x03cd:
                r1 = 0
            L_0x03ce:
                int r1 = r1 / 1000
                r12.f34851y = r1
                jq3.o r1 = r9.f32402d
                r4.f37016e = r1
                r4.f37012a = r10
                java.lang.String r1 = r9.f32404f
                gy3.C87412m.m108594g(r1, r2)
                r4.f37013b = r1
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r9.f32403e
                long r0 = r1.getItemId()
                r4.f37014c = r0
                r4.f37015d = r12
                mf1.C10846o0.m10833d3(r11, r4, r12)
                int r0 = r6.business_type
                r4.f37018g = r0
                int r0 = r6.jumpinfo_type
                r4.f37019h = r0
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r12.f34827a
                java.util.LinkedList<te3.uc4> r0 = r0.style
                gy3.C87412m.m108593f(r0, r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x03ff:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0416
                java.lang.Object r1 = r0.next()
                r3 = r1
                te3.uc4 r3 = (te3.uc4) r3
                int r3 = r3.f142762h
                if (r3 != r7) goto L_0x0412
                r3 = 1
                goto L_0x0413
            L_0x0412:
                r3 = 0
            L_0x0413:
                if (r3 == 0) goto L_0x03ff
                goto L_0x0418
            L_0x0416:
                r1 = r16
            L_0x0418:
                te3.uc4 r1 = (te3.uc4) r1
                r4.f37017f = r1
                java.util.HashMap<mf1.o0$b, mf1.f1> r0 = mf1.C10846o0.f32389u
                bl3.r r1 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r3 = r11.getActivity()
                bl3.r$a r1 = r1.mo62444c(r3)
                java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
                rs1.s8 r1 = (rs1.C13442s8) r1
                int r1 = r1.f38096i
                mf1.o0$b r3 = new mf1.o0$b
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r15 = r12.f34830d
                if (r15 == 0) goto L_0x043d
                long r25 = r15.getItemId()
                goto L_0x043f
            L_0x043d:
                r25 = 0
            L_0x043f:
                r33 = r25
                int r15 = r12.f34841o
                r38 = r4
                int r4 = r12.f34842p
                r32 = r3
                r35 = r1
                r36 = r15
                r37 = r4
                r32.<init>(r33, r35, r36, r37)
                java.lang.Object r1 = r0.get(r3)
                if (r1 != 0) goto L_0x0460
                mf1.f1 r1 = new mf1.f1
                r1.<init>()
                r0.put(r3, r1)
            L_0x0460:
                mf1.f1 r1 = (mf1.C10817f1) r1
                r12.f34823A = r1
                r0 = 15
                if (r7 != r0) goto L_0x05a8
                java.util.LinkedList<te3.uc4> r0 = r6.style
                gy3.C87412m.m108593f(r0, r5)
                java.util.Iterator r0 = r0.iterator()
            L_0x0471:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0488
                java.lang.Object r1 = r0.next()
                r3 = r1
                te3.uc4 r3 = (te3.uc4) r3
                int r3 = r3.f142762h
                if (r3 != r7) goto L_0x0484
                r4 = 1
                goto L_0x0485
            L_0x0484:
                r4 = 0
            L_0x0485:
                if (r4 == 0) goto L_0x0471
                goto L_0x048a
            L_0x0488:
                r1 = r16
            L_0x048a:
                te3.uc4 r1 = (te3.uc4) r1
                if (r1 == 0) goto L_0x0491
                te3.ey r0 = r1.f142757N
                goto L_0x0493
            L_0x0491:
                r0 = r16
            L_0x0493:
                if (r0 != 0) goto L_0x0497
                goto L_0x0545
            L_0x0497:
                boolean r1 = r10 instanceof android.view.ViewGroup
                if (r1 == 0) goto L_0x049f
                r1 = r10
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                goto L_0x04a1
            L_0x049f:
                r1 = r16
            L_0x04a1:
                if (r1 == 0) goto L_0x05a8
                if (r8 != 0) goto L_0x04a8
                r1.removeAllViews()
            L_0x04a8:
                java.util.LinkedList<te3.uc4> r0 = r0.f133169d
                java.lang.String r3 = "combinationStyle.style"
                gy3.C87412m.m108593f(r0, r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x04b3:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x05a8
                java.lang.Object r3 = r0.next()
                te3.uc4 r3 = (te3.uc4) r3
                int r4 = r3.f142762h
                int r4 = r14.mo11031b(r4)
                if (r4 > 0) goto L_0x04c9
                goto L_0x0545
            L_0x04c9:
                if (r8 == 0) goto L_0x04d8
                int r5 = r3.f142762h
                java.lang.String r7 = r6.jump_id
                if (r7 != 0) goto L_0x04d3
                r7 = r17
            L_0x04d3:
                android.view.View r5 = mf1.C10846o0.m10832c3(r11, r1, r5, r7)
                goto L_0x04da
            L_0x04d8:
                r5 = r16
            L_0x04da:
                if (r5 != 0) goto L_0x04e8
                android.content.Context r5 = r9.f32407i
                android.view.LayoutInflater r5 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r5)
                r15 = 0
                android.view.View r5 = r5.inflate(r4, r1, r15)
                goto L_0x04e9
            L_0x04e8:
                r15 = 0
            L_0x04e9:
                int r4 = r13.f34805c
                r7 = 5
                if (r4 != r7) goto L_0x0512
                if (r40 != 0) goto L_0x0501
                android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
                r7 = r24
                gy3.C87412m.m108592e(r4, r7)
                android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
                float r15 = mf1.C10846o0.f32388t
                int r15 = (int) r15
                r4.topMargin = r15
                goto L_0x0514
            L_0x0501:
                r7 = r24
                android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
                gy3.C87412m.m108592e(r4, r7)
                android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
                float r15 = mf1.C10846o0.f32387s
                int r15 = (int) r15
                r4.topMargin = r15
                goto L_0x0514
            L_0x0512:
                r7 = r24
            L_0x0514:
                int r4 = r11.f32395i
                int r15 = r3.f142762h
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r5.setTag(r4, r15)
                if (r8 != 0) goto L_0x0524
                r1.addView(r5)
            L_0x0524:
                int r4 = r11.f32394h
                java.lang.Object r4 = r5.getTag(r4)
                boolean r15 = r4 instanceof rf1.C12982a
                if (r15 == 0) goto L_0x0531
                rf1.a r4 = (rf1.C12982a) r4
                goto L_0x0533
            L_0x0531:
                r4 = r16
            L_0x0533:
                if (r4 != 0) goto L_0x0548
                int r4 = r3.f142762h
                rf1.a r4 = r14.mo11032c(r4)
                if (r4 == 0) goto L_0x0545
                int r15 = r11.f32394h
                r5.setTag(r15, r4)
                rx3.b0 r15 = rx3.C13598b0.f38549a
                goto L_0x0548
            L_0x0545:
                r10 = r8
                goto L_0x0655
            L_0x0548:
                jq3.o r15 = r9.f32402d
                r4.f37016e = r15
                r4.f37012a = r5
                java.lang.String r15 = r9.f32404f
                gy3.C87412m.m108594g(r15, r2)
                r4.f37013b = r15
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r15 = r9.f32403e
                r24 = r0
                r20 = r1
                long r0 = r15.getItemId()
                r4.f37014c = r0
                r4.f37015d = r12
                r4.f37017f = r3
                mf1.C10846o0.m10833d3(r11, r4, r12)
                int r0 = r6.business_type
                r15 = r38
                r15.f37018g = r0
                int r0 = r6.jumpinfo_type
                r15.f37019h = r0
                boolean r0 = r15 instanceof mf1.C10882y
                if (r0 == 0) goto L_0x057a
                r0 = r15
                mf1.y r0 = (mf1.C10882y) r0
                goto L_0x057c
            L_0x057a:
                r0 = r16
            L_0x057c:
                if (r0 == 0) goto L_0x058e
                java.util.Map<java.lang.Integer, rf1.a> r0 = r0.f32491o
                if (r0 == 0) goto L_0x058e
                int r1 = r3.f142762h
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.put(r1, r4)
                rf1.a r0 = (rf1.C12982a) r0
            L_0x058e:
                mf1.h0 r0 = new mf1.h0
                r0.<init>(r4, r9, r10, r12)
                r5.setOnClickListener(r0)
                mf1.i0 r0 = new mf1.i0
                r0.<init>(r12, r6, r4, r9)
                zp3.C23564m.m28138h(r5, r0)
                r38 = r15
                r1 = r20
                r0 = r24
                r24 = r7
                goto L_0x04b3
            L_0x05a8:
                r15 = r38
                java.lang.String r0 = r9.f32404f
                r1 = r23
                boolean r0 = gy3.C87412m.m108589b(r0, r1)
                if (r0 == 0) goto L_0x05d8
                jq3.o r0 = r9.f32402d
                r1 = 2131302685(0x7f09191d, float:1.8223463E38)
                android.view.View r0 = r0.mo85812D(r1)
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r0
                if (r0 == 0) goto L_0x05c6
                gr1.o2 r0 = r0.getVideoView()
                goto L_0x05c8
            L_0x05c6:
                r0 = r16
            L_0x05c8:
                boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
                if (r1 == 0) goto L_0x05cf
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
                goto L_0x05d1
            L_0x05cf:
                r0 = r16
            L_0x05d1:
                if (r0 == 0) goto L_0x05d8
                int r4 = r0.getCurrentPlaySecond()
                goto L_0x05d9
            L_0x05d8:
                r4 = 0
            L_0x05d9:
                boolean r0 = r12.f34847u
                if (r0 == 0) goto L_0x0614
                int r0 = r12.f34850x
                if (r4 < r0) goto L_0x05fd
                int r0 = r12.f34851y
                if (r4 >= r0) goto L_0x05fd
                jq3.o r0 = r9.f32402d
                r26 = 0
                r27 = 0
                r28 = 16
                r29 = 0
                r22 = r15
                r23 = r0
                r24 = r10
                r25 = r12
                rf1.C12992d.C12993a.m12459b(r22, r23, r24, r25, r26, r27, r28, r29)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x0614
            L_0x05fd:
                jq3.o r0 = r9.f32402d
                r26 = 0
                r27 = 0
                r28 = 16
                r29 = 0
                r22 = r15
                r23 = r0
                r24 = r10
                r25 = r12
                rf1.C12992d.C12993a.m12458a(r22, r23, r24, r25, r26, r27, r28, r29)
                rx3.b0 r0 = rx3.C13598b0.f38549a
            L_0x0614:
                mf1.j0 r0 = new mf1.j0
                r0.<init>(r12, r15, r9, r10)
                r10.setOnClickListener(r0)
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r9.f32403e
                long r0 = r0.getItemId()
                java.lang.String r7 = o40.C61926c.m72691p(r0)
                mf1.k0 r5 = new mf1.k0
                r0 = r5
                r1 = r12
                r2 = r6
                r3 = r15
                r4 = r7
                r40 = r8
                r8 = r5
                r5 = r39
                r0.<init>(r1, r2, r3, r4, r5)
                zp3.C23564m.m28138h(r10, r8)
                r20 = 0
                r22 = 0
                mf1.l0 r23 = new mf1.l0
                r8 = 0
                r0 = r23
                r1 = r15
                r3 = r12
                r6 = r10
                r7 = r11
                r10 = r40
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                r7 = 3
                r3 = r11
                r4 = r20
                r5 = r22
                r6 = r23
                bl3.C0317e.launch$default(r3, r4, r5, r6, r7, r8)
            L_0x0655:
                r8 = r10
                r0 = r19
                r12 = r30
                r15 = r31
                r10 = 0
                goto L_0x014f
            L_0x065f:
                sx3.C64197v.m75542k()
                throw r16
            L_0x0663:
                r30 = r12
                int r0 = r13.f34805c
                java.util.List<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r1 = r13.f34806d
                pf1.x r2 = r9.f32406h
                if (r2 == 0) goto L_0x0670
                r2.mo2364a(r0, r1)
            L_0x0670:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x0675
            L_0x0673:
                r30 = r12
            L_0x0675:
                r12 = r30
                r10 = 0
                goto L_0x0022
            L_0x067a:
                mf1.o0 r0 = r9.f32408j
                mf1.n0 r1 = new mf1.n0
                r1.<init>(r0)
                r0.mo11062g3(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mf1.C10846o0.C10847a.onChanged(java.lang.Object):void");
        }

        public String toString() {
            return C10847a.class.getSimpleName() + '#' + C61926c.m72691p(this.f32403e.getItemId());
        }
    }

    /* renamed from: mf1.o0$b */
    public static final class C10848b {

        /* renamed from: a */
        public final long f32409a;

        /* renamed from: b */
        public final int f32410b;

        /* renamed from: c */
        public final int f32411c;

        /* renamed from: d */
        public final int f32412d;

        public C10848b(long j, int i, int i2, int i3) {
            this.f32409a = j;
            this.f32410b = i;
            this.f32411c = i2;
            this.f32412d = i3;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C10848b)) {
                return false;
            }
            C10848b bVar = (C10848b) obj;
            return this.f32409a == bVar.f32409a && this.f32410b == bVar.f32410b && this.f32411c == bVar.f32411c && this.f32412d == bVar.f32412d;
        }

        public int hashCode() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32409a);
            sb.append('_');
            sb.append(this.f32410b);
            sb.append('_');
            sb.append(this.f32411c);
            sb.append('_');
            sb.append(this.f32412d);
            return sb.toString().hashCode();
        }
    }

    /* renamed from: mf1.o0$c */
    public static final class C10849c extends C87413o implements C32224a<C62273n> {

        /* renamed from: d */
        public static final C10849c f32413d = new C10849c();

        public C10849c() {
            super(0);
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            return (C62273n) a;
        }
    }

    /* renamed from: mf1.o0$d */
    public static final class C10850d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LiveData<Set<C11911l>> f32414d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f32415e;

        /* renamed from: f */
        public final /* synthetic */ C10847a f32416f;

        public C10850d(LiveData<Set<C11911l>> liveData, MMActivity mMActivity, C10847a aVar) {
            this.f32414d = liveData;
            this.f32415e = mMActivity;
            this.f32416f = aVar;
        }

        public final void run() {
            C61926c.m72695t(this.f32414d, this.f32415e, this.f32416f);
        }
    }

    /* renamed from: mf1.o0$e */
    public static final class C10851e extends C87413o implements C32226l<C12982a, C13598b0> {

        /* renamed from: d */
        public static final C10851e f32417d = new C10851e();

        public C10851e() {
            super(1);
        }

        public Object invoke(Object obj) {
            C12982a aVar = (C12982a) obj;
            C87412m.m108594g(aVar, "observer");
            C11920q qVar = aVar.f37015d;
            View view = aVar.f37012a;
            if (!(qVar == null || view == null)) {
                BaseFinderFeed baseFinderFeed = qVar.f34830d;
                if (baseFinderFeed != null && C58784w3.f168295a.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                    Log.m105924i("Finder.BaseAdFeedJumperUIC", "onPause feedId=" + baseFinderFeed.getItemId());
                }
                qVar.f34846t = false;
                C11917o0 o0Var = aVar.f37020i;
                if (o0Var != null) {
                    o0Var.mo11769c(view, qVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: mf1.o0$f */
    public static final class C10852f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LiveData<Set<C11911l>> f32418d;

        /* renamed from: e */
        public final /* synthetic */ C10847a f32419e;

        public C10852f(LiveData<Set<C11911l>> liveData, C10847a aVar) {
            this.f32418d = liveData;
            this.f32419e = aVar;
        }

        public final void run() {
            this.f32418d.removeObserver(this.f32419e);
        }
    }

    /* renamed from: mf1.o0$g */
    public static final class C10853g extends C87413o implements C32224a<Map<Integer, ? extends C12991c<?>>> {

        /* renamed from: d */
        public final /* synthetic */ C10846o0 f32420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10853g(C10846o0 o0Var) {
            super(0);
            this.f32420d = o0Var;
        }

        public Object invoke() {
            return this.f32420d.mo11022I3();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10846o0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: F3 */
    public static void m10831F3(C10846o0 o0Var, BaseFinderFeed baseFinderFeed, long j, C60905o oVar, String str, int i, Object obj) {
        C10846o0 o0Var2 = o0Var;
        C60905o oVar2 = oVar;
        if (obj == null) {
            String str2 = (i & 8) != 0 ? FFmpegMetadataRetriever.METADATA_KEY_COMMENT : str;
            o0Var.getClass();
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(oVar2, "holder");
            C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
            View view = oVar2.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            Context context = view.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) context;
            if (o0Var.mo11024e3()) {
                C54219z<Set<C11911l>> f3 = o0Var.mo11063j3().mo87340f3(baseFinderFeed.getItemId(), j, ((C13442s8) C39818r.f106831a.mo62444c(o0Var.getActivity()).mo75002a(C13442s8.class)).f38096i);
                int hashCode = oVar.hashCode();
                int hashCode2 = f3.hashCode();
                if (o0Var2.f32398o.get(hashCode) != hashCode2) {
                    o0Var2.mo11057G3(oVar2);
                    o0Var2.mo11058J3(oVar2);
                    int i2 = hashCode2;
                    C10847a aVar = r0;
                    C10847a aVar2 = new C10847a(o0Var, oVar, baseFinderFeed, str2, j, (C11929x) null, 16, (C8480h) null);
                    o0Var2.f32401r.put(Integer.valueOf(hashCode), aVar);
                    if (!C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                        view.post(new C10864s0(f3, mMActivity, aVar));
                    } else {
                        C61926c.m72695t(f3, mMActivity, aVar);
                    }
                    o0Var2.f32398o.put(hashCode, i2);
                    return;
                }
                return;
            }
            o0Var2.mo11057G3(oVar2);
            o0Var2.mo11058J3(oVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBindView");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View m10832c3(mf1.C10846o0 r7, android.view.ViewGroup r8, int r9, java.lang.String r10) {
        /*
            r7.getClass()
            int r0 = r8.getChildCount()
            r1 = 0
        L_0x0008:
            r2 = 0
            if (r1 >= r0) goto L_0x004e
            android.view.View r3 = r8.getChildAt(r1)
            int r4 = r7.f32394h
            java.lang.Object r4 = r3.getTag(r4)
            boolean r5 = r4 instanceof rf1.C12982a
            if (r5 == 0) goto L_0x001c
            rf1.a r4 = (rf1.C12982a) r4
            goto L_0x001d
        L_0x001c:
            r4 = r2
        L_0x001d:
            if (r4 == 0) goto L_0x004e
            pf1.q r4 = r4.f37015d
            if (r4 == 0) goto L_0x004e
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f34827a
            if (r4 == 0) goto L_0x004e
            java.lang.String r4 = r4.jump_id
            if (r4 != 0) goto L_0x002c
            goto L_0x004e
        L_0x002c:
            int r5 = r7.f32395i
            java.lang.Object r5 = r3.getTag(r5)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0039
            r2 = r5
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0039:
            if (r2 == 0) goto L_0x0040
            int r2 = r2.intValue()
            goto L_0x0041
        L_0x0040:
            r2 = -1
        L_0x0041:
            if (r9 != r2) goto L_0x004b
            boolean r2 = gy3.C87412m.m108589b(r4, r10)
            if (r2 == 0) goto L_0x004b
            r2 = r3
            goto L_0x004e
        L_0x004b:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10846o0.m10832c3(mf1.o0, android.view.ViewGroup, int, java.lang.String):android.view.View");
    }

    /* renamed from: d3 */
    public static final void m10833d3(C10846o0 o0Var, C12982a aVar, C11920q qVar) {
        o0Var.getClass();
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        if (!(aVar.f37018g == finderJumpInfo.business_type || aVar.f37019h == finderJumpInfo.jumpinfo_type) || aVar.f37020i == null) {
            C11917o0 l3 = o0Var.mo11027l3(qVar);
            C11896f fVar = l3 instanceof C11896f ? (C11896f) l3 : null;
            if (fVar != null) {
                uc4 uc4 = aVar.f37017f;
                fVar.f34766c = uc4 != null ? uc4.f142762h : -1;
            }
            aVar.f37020i = l3;
        }
        if ((aVar.f37018g != finderJumpInfo.business_type && aVar.f37019h != finderJumpInfo.jumpinfo_type) || aVar.f37021j == null) {
            aVar.f37021j = o0Var.mo11025i3(qVar);
        }
    }

    /* renamed from: o3 */
    public static /* synthetic */ int m10834o3(C10846o0 o0Var, BaseFinderFeed baseFinderFeed, C60905o oVar, String str, boolean z, C11929x xVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                str = "timeline";
            }
            String str2 = str;
            boolean z2 = (i & 8) != 0 ? false : z;
            if ((i & 16) != 0) {
                xVar = null;
            }
            return o0Var.mo11064n3(baseFinderFeed, oVar, str2, z2, xVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBindView");
    }

    /* renamed from: G3 */
    public final void mo11057G3(C60905o oVar) {
        BaseFinderFeed baseFinderFeed;
        View view;
        int hashCode = oVar.hashCode();
        Log.m105924i("Finder.BaseAdFeedJumperUIC", "[recycleCacheForViewHolder] holder:" + hashCode);
        this.f32398o.delete(hashCode);
        C12982a aVar = this.f32399p.get(Integer.valueOf(hashCode));
        if (aVar != null) {
            aVar.mo11092s(oVar);
        }
        if (!(aVar == null || (view = aVar.f37012a) == null)) {
            view.setTag(this.f32396j, "");
        }
        this.f32399p.remove(Integer.valueOf(hashCode));
        C12990b bVar = this.f32400q.get(Integer.valueOf(hashCode));
        this.f32400q.remove(Integer.valueOf(hashCode));
        StringBuilder sb = new StringBuilder();
        sb.append("[recycleCacheForViewHolder] holder:");
        sb.append(oVar.hashCode());
        sb.append(" observerWrapper:");
        sb.append(bVar != null ? Integer.valueOf(bVar.hashCode()) : null);
        Log.m105924i("Finder.BaseAdFeedJumperUIC", sb.toString());
        if (aVar != null) {
            long j = aVar.f37014c;
            C11920q qVar = aVar.f37015d;
            if (qVar != null && (baseFinderFeed = qVar.f34830d) != null) {
                long j2 = qVar != null ? qVar.f34831e : 0;
                int i = baseFinderFeed.mo3513o().getFeedObject().adFlag;
                Activity context = getContext();
                if ((context instanceof MMActivity ? (MMActivity) context : null) != null) {
                    int i2 = ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13442s8.class)).f38096i;
                    C54219z<Set<C11911l>> g3 = j2 <= 0 ? mo11063j3().mo87341g3(j, i2) : mo11063j3().mo87340f3(j, j2, i2);
                    C10847a remove = this.f32401r.remove(Integer.valueOf(hashCode));
                    if (remove != null) {
                        remove.f32406h = null;
                        if (!C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                            new MMHandler(Looper.getMainLooper()).post(new C10852f(g3, remove));
                        } else {
                            g3.removeObserver(remove);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: I3 */
    public abstract Map<Integer, C12991c<?>> mo11022I3();

    /* renamed from: J3 */
    public final void mo11058J3(C60905o oVar) {
        for (Map.Entry<Integer, Integer> value : mo11026k3().entrySet()) {
            ViewGroup viewGroup = (ViewGroup) oVar.f44854d.findViewById(((Number) value.getValue()).intValue());
            if (viewGroup != null) {
                mo11059K3(oVar, viewGroup, false);
            }
        }
    }

    /* renamed from: K3 */
    public final void mo11059K3(C60905o oVar, ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Integer num = null;
            if (!z) {
                Object tag = childAt.getTag(this.f32395i);
                Integer num2 = tag instanceof Integer ? (Integer) tag : null;
                int intValue = num2 != null ? num2.intValue() : -1;
                if (intValue >= 0) {
                    HashMap<Integer, LinkedList<View>> hashMap = this.f32392f;
                    Integer valueOf = Integer.valueOf(intValue);
                    LinkedList<View> linkedList = hashMap.get(valueOf);
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        hashMap.put(valueOf, linkedList);
                    }
                    linkedList.add(childAt);
                }
            }
            C12990b bVar = this.f32400q.get(Integer.valueOf(oVar.hashCode()));
            if (bVar != null) {
                int hashCode = childAt.hashCode();
                C12982a remove = bVar.f37051a.remove(Integer.valueOf(hashCode));
                StringBuilder sb = new StringBuilder();
                sb.append("[removeObserver] key:");
                sb.append(hashCode);
                sb.append(" observer:");
                sb.append(remove != null ? remove.hashCode() : 0);
                sb.append(" observerWrapper:");
                sb.append(bVar.hashCode());
                Log.m105924i("FeedJumperObserverWrapper", sb.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("[removeAndRecycleView] holder:");
            sb4.append(oVar.hashCode());
            sb4.append(" view:");
            sb4.append(childAt.hashCode());
            sb4.append(" observerWrapper:");
            if (bVar != null) {
                num = Integer.valueOf(bVar.hashCode());
            }
            sb4.append(num);
            Log.m105924i("Finder.BaseAdFeedJumperUIC", sb4.toString());
        }
        if (!z) {
            viewGroup.setTag(this.f32396j, "");
            viewGroup.removeAllViews();
        }
    }

    /* renamed from: L3 */
    public final void mo11060L3(C60905o oVar) {
        C51384te1 te12;
        C51384te1 te13;
        C51384te1 te14;
        C60905o oVar2 = oVar;
        Class cls = C13448t.class;
        C87412m.m108594g(oVar2, "holder");
        Object obj = oVar2.f173503E;
        FinderJumpInfo finderJumpInfo = null;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            C58784w3 w3Var = C58784w3.f168295a;
            if (w3Var.mo83872H0(baseFinderFeed.mo3513o().getFeedObject())) {
                long itemId = baseFinderFeed.getItemId();
                C39818r rVar = C39818r.f106831a;
                Context context = oVar2.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13448t tVar = (C13448t) rVar.mo62443b(context).mo62449e(cls);
                if (tVar != null) {
                    tVar.mo12877d3(itemId);
                }
                C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
                int i = f != null ? f.mo12861q3().f134675i : 0;
                C10500a aVar = C10500a.f31736a;
                C50124kf1 kf12 = baseFinderFeed.mo3513o().getFeedObject().object_extend;
                C10500a.m10435a(aVar, 3, itemId, i, (kf12 == null || (te14 = kf12.f136749h) == null) ? 0 : te14.f142157e, false, "", 0, 0, false, (String) null, 960, (Object) null);
                C13448t tVar2 = (C13448t) rVar.mo62444c(getActivity()).mo62449e(cls);
                if (tVar2 != null) {
                    FinderObject feedObject = baseFinderFeed.mo3513o().getFeedObject();
                    C87412m.m108594g(feedObject, "feed");
                    C50124kf1 kf13 = feedObject.object_extend;
                    long j = (kf13 == null || (te13 = kf13.f136749h) == null) ? 0 : te13.f142157e;
                    if (!(kf13 == null || (te12 = kf13.f136749h) == null)) {
                        finderJumpInfo = te12.f142156d;
                    }
                    boolean z = finderJumpInfo != null;
                    if (w3Var.mo83872H0(feedObject) && j != 0) {
                        Boolean bool = (Boolean) ((LinkedHashMap) tVar2.f38119e).get(Long.valueOf(feedObject.f164794id));
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        Log.m105924i("Finder.AdTraceUIC", "checkHasReport feedId=" + feedObject.f164794id + " hasReport=" + booleanValue + " hasComponent=" + z);
                        C11348f.C11349a.m11178b(C59319a.f169618b, "finderAdExposureReport", booleanValue, (C11348f.C11352b) null, false, false, new C13467u(feedObject, j, z), 28, (Object) null);
                    }
                }
                C13383r a = C13383r.f37907d.mo12791a();
                FinderObject feedObject2 = baseFinderFeed.mo3513o().getFeedObject();
                a.getClass();
                C87412m.m108594g(feedObject2, "feed");
                if (C13383r.f37908e.contains(Integer.valueOf(i))) {
                    C13383r.C13386c cVar = a.f37910a.get(new C13383r.C13387d(feedObject2.f164794id, i));
                    if (cVar == null || cVar.f37919f < 3) {
                        Log.m105924i("Finder.AdTraceMgr", "onFeedUnFocused return! unfocus without consume, dispatch and focus, commentScene=" + i + " feedId=" + C61926c.m72691p(feedObject2.f164794id));
                        return;
                    }
                    cVar.f37919f = 4;
                    cVar.f37923j = System.currentTimeMillis();
                    Log.m105924i("Finder.AdTraceMgr", "onFeedUnFocused dispatchFeed=" + cVar + " [unFocus-focus]=" + (cVar.f37923j - cVar.f37922i) + LocaleUtil.MALAY);
                }
            }
        }
    }

    /* renamed from: e3 */
    public boolean mo11024e3() {
        return true;
    }

    /* renamed from: f3 */
    public final void mo11061f3(C60905o oVar, C32226l<? super C12982a, C13598b0> lVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(lVar, "callback");
        C37521f.f99374d.getClass();
        if (C37521f.f99128A8.mo60266n().intValue() == 0) {
            C12982a aVar = this.f32399p.get(Integer.valueOf(oVar.hashCode()));
            if (aVar != null) {
                lVar.invoke(aVar);
                return;
            }
            return;
        }
        C12990b bVar = this.f32400q.get(Integer.valueOf(oVar.hashCode()));
        if (bVar != null) {
            for (Map.Entry value : new HashMap(bVar.f37051a).entrySet()) {
                C12982a aVar2 = (C12982a) value.getValue();
                C87412m.m108593f(aVar2, "observer");
                lVar.invoke(aVar2);
            }
        }
    }

    /* renamed from: g3 */
    public final void mo11062g3(C32226l<? super C12982a, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        C37521f.f99374d.getClass();
        if (C37521f.f99128A8.mo60266n().intValue() == 0) {
            for (Map.Entry value : new HashMap(this.f32399p).entrySet()) {
                C12982a aVar = (C12982a) value.getValue();
                C87412m.m108593f(aVar, "observer");
                lVar.invoke(aVar);
            }
            return;
        }
        for (Map.Entry value2 : new HashMap(this.f32400q).entrySet()) {
            for (Map.Entry value3 : new HashMap(((C12990b) value2.getValue()).f37051a).entrySet()) {
                C12982a aVar2 = (C12982a) value3.getValue();
                C87412m.m108593f(aVar2, "observer");
                lVar.invoke(aVar2);
            }
        }
    }

    /* renamed from: i3 */
    public abstract C11930y mo11025i3(C11920q qVar);

    /* renamed from: j3 */
    public final C62273n mo11063j3() {
        return (C62273n) this.f32390d.getValue();
    }

    /* renamed from: k3 */
    public abstract Map<Integer, Integer> mo11026k3();

    /* renamed from: l3 */
    public abstract C11917o0 mo11027l3(C11920q qVar);

    /* renamed from: m3 */
    public void mo11028m3(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str, C12982a aVar) {
        T t;
        FinderVideoLayout finderVideoLayout;
        C51432tq3 tq32;
        boolean z;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(qVar, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(aVar, "observer");
        if (view != null) {
            C10817f1 f1Var = qVar.f34823A;
            if (!(f1Var != null && f1Var.f32317a) && qVar.f34843q > 0) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC", "onAfterBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC", "onAfterBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (qVar.f34841o == 10) {
                C7868s3 s3Var = C7868s3.f26472a;
                int d = s3Var.mo8978d(view);
                int height = view.getHeight();
                ViewParent parent = view.getParent();
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                View view2 = parent instanceof View ? (View) parent : null;
                if (height <= 0 && view2 != null) {
                    height = s3Var.mo8976c(view, view2).y;
                }
                LinkedList<uc4> linkedList = qVar.f34827a.style;
                C87412m.m108593f(linkedList, "infoEx.jumpInfo.style");
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((uc4) t).f142762h == qVar.f34842p) {
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
                uc4 uc4 = (uc4) t;
                if (uc4 != null && (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) != null && (tq32 = uc4.f142751H) != null) {
                    float measuredHeight = (((float) finderVideoLayout.getMeasuredHeight()) * (((float) tq32.f142363e) / 100.0f)) - ((float) (height / 2));
                    float measuredWidth = (((float) finderVideoLayout.getMeasuredWidth()) * (((float) tq32.f142362d) / 100.0f)) - ((float) (d / 2));
                    Log.m105924i("Finder.BaseAdFeedJumperUIC", "onAfterBindView viewWidth=" + d + " height=" + height + " videoWidth=" + finderVideoLayout.getMeasuredWidth() + " videoHeight=" + finderVideoLayout.getMeasuredHeight() + " marginTop=" + measuredHeight + " marginLeft=" + measuredWidth);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.topMargin = (int) measuredHeight;
                        marginLayoutParams2.leftMargin = (int) measuredWidth;
                        marginLayoutParams = marginLayoutParams2;
                    }
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    /* renamed from: n3 */
    public final int mo11064n3(BaseFinderFeed baseFinderFeed, C60905o oVar, String str, boolean z, C11929x xVar) {
        C60905o oVar2 = oVar;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        baseFinderFeed.mo3513o().getFeedObject();
        View view = oVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        long itemId = baseFinderFeed.getItemId();
        Context context = view.getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) context;
        if (mo11024e3()) {
            C54219z<Set<C11911l>> g3 = mo11063j3().mo87341g3(itemId, ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13442s8.class)).f38096i);
            int hashCode = oVar.hashCode();
            int hashCode2 = g3.hashCode();
            if (!z && this.f32398o.get(hashCode) == hashCode2) {
                return 2;
            }
            mo11057G3(oVar2);
            mo11058J3(oVar2);
            int i = hashCode2;
            C10847a aVar = r0;
            C10847a aVar2 = new C10847a(this, oVar, baseFinderFeed, str, 0, xVar, 8, (C8480h) null);
            this.f32401r.put(Integer.valueOf(hashCode), aVar);
            if (!C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                view.post(new C10850d(g3, mMActivity, aVar));
            } else {
                C61926c.m72695t(g3, mMActivity, aVar);
            }
            this.f32398o.put(hashCode, i);
            return 1;
        }
        mo11057G3(oVar2);
        mo11058J3(oVar2);
        return 0;
    }

    public void onPause() {
        super.onPause();
        this.f32391e.removeCallbacksAndMessages((Object) null);
        mo11062g3(C10851e.f32417d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10846o0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
