package op1;

import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import c30.C104289g;
import cj1.C54795n5;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wcdb.FileUtils;
import com.tencent.xweb.util.WXWebReporter;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import dj1.C58287u0;
import er1.C7919x;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import jq3.C9506m;
import jq3.C9507n;
import k60.C60979d;
import kg3.C76577a;
import np1.C61817a;
import np1.C61866i0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p40.C62192a;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pp1.C62424a;
import pp1.C62427b;
import pp1.C62430c;
import pp1.C62431d;
import pp1.C62438f;
import qj1.C62660c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C13696v;
import sk1.C48416t;
import sk1.C63964u;
import sk1.C63965x;
import sp1.C64059b;
import sp1.C64068b0;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C50401mh0;
import te3.C50483n21;
import te3.C50626o21;
import te3.C52220z51;
import te3.C64370fp1;
import te3.C64617p00;
import te3.C64620p2;
import uo3.C78253a;
import up1.C27696y;
import z04.C112550d0;
import zc1.C66785b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: op1.h */
public final class C62084h extends C9506m<C9507n> {

    /* renamed from: A */
    public static final C62085a f176530A = new C62085a((C8480h) null);

    /* renamed from: e */
    public final Context f176531e;

    /* renamed from: f */
    public boolean f176532f;

    /* renamed from: g */
    public final C45795b f176533g;

    /* renamed from: h */
    public final LinkedList<C63965x> f176534h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C0740i2> f176535i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C0740i2> f176536j = new LinkedList<>();

    /* renamed from: n */
    public ArrayList<Integer> f176537n = new ArrayList<>();

    /* renamed from: o */
    public LinkedList<C0740i2> f176538o = new LinkedList<>();

    /* renamed from: p */
    public final ArrayList<Integer> f176539p = new ArrayList<>();

    /* renamed from: q */
    public FinderLiveShoppingPriceView.C56321b f176540q;

    /* renamed from: r */
    public final C13601g f176541r;

    /* renamed from: s */
    public C61817a f176542s;

    /* renamed from: t */
    public C32227p<? super Integer, ? super C86299o, C13598b0> f176543t;

    /* renamed from: u */
    public C32226l<? super Boolean, C13598b0> f176544u;

    /* renamed from: v */
    public C32226l<? super Boolean, C13598b0> f176545v;

    /* renamed from: w */
    public C32228q<? super C62438f, ? super View, ? super Integer, C13598b0> f176546w;

    /* renamed from: x */
    public C32226l<? super Long, C13598b0> f176547x;

    /* renamed from: y */
    public C62431d.C62433b f176548y;

    /* renamed from: z */
    public FinderLiveShoppingCouponView.C3609a f176549z;

    /* renamed from: op1.h$a */
    public static final class C62085a {
        public C62085a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo87168a() {
            if (!C62042e.f176370a.mo87027N0()) {
                C45795b.C32059a aVar = C45795b.f123697j;
                C45795b bVar = C45795b.f123698n;
                return bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154190D : false;
            }
        }
    }

    /* renamed from: op1.h$b */
    public static final class C62086b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62084h f176550d;

        public C62086b(C62084h hVar) {
            this.f176550d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$_onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62431d.C62433b bVar = this.f176550d.f176548y;
            if (bVar != null) {
                bVar.mo86777b();
            }
            if (C62042e.f176370a.mo87027N0()) {
                C62084h.m72976y5(this.f176550d, 14);
            } else {
                C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionCouponHalfPageClick;
                LinkedList<C0740i2> linkedList = this.f176550d.f176538o;
                ArrayList<C0740i2> arrayList2 = new ArrayList<>();
                for (T next : linkedList) {
                    if (((C0740i2) next) instanceof C13696v) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                for (C0740i2 i2Var : arrayList2) {
                    C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
                    arrayList3.add((C13696v) i2Var);
                }
                wVar.Sx0(r0Var, arrayList3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$_onCreateViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: op1.h$c */
    public static final class C62087c extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C62084h f176551a;

        public C62087c(C62084h hVar) {
            this.f176551a = hVar;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (!z) {
                return;
            }
            if (C62042e.f176370a.mo87027N0()) {
                C62084h.m72976y5(this.f176551a, 13);
                return;
            }
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionCouponHalfPageShow;
            LinkedList<C0740i2> linkedList = this.f176551a.f176538o;
            ArrayList<C0740i2> arrayList = new ArrayList<>();
            for (T next : linkedList) {
                if (((C0740i2) next) instanceof C13696v) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C0740i2 i2Var : arrayList) {
                C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
                arrayList2.add((C13696v) i2Var);
            }
            wVar.Sx0(r0Var, arrayList2);
        }
    }

    /* renamed from: op1.h$d */
    public static final class C62088d extends C87413o implements C32224a<C78253a> {

        /* renamed from: d */
        public final /* synthetic */ C62084h f176552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62088d(C62084h hVar) {
            super(0);
            this.f176552d = hVar;
        }

        public Object invoke() {
            return new C78253a(this.f176552d.f176531e);
        }
    }

    /* renamed from: op1.h$e */
    public static final class C62089e implements C58287u0.C58288a {

        /* renamed from: a */
        public final /* synthetic */ long f176553a;

        /* renamed from: b */
        public final /* synthetic */ long f176554b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<C0740i2> f176555c;

        /* renamed from: d */
        public final /* synthetic */ int f176556d;

        /* renamed from: e */
        public final /* synthetic */ int f176557e;

        /* renamed from: f */
        public final /* synthetic */ C62084h f176558f;

        /* renamed from: g */
        public final /* synthetic */ C62438f f176559g;

        /* renamed from: h */
        public final /* synthetic */ int f176560h;

        /* renamed from: op1.h$e$a */
        public static final class C62090a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ long f176561d;

            /* renamed from: e */
            public final /* synthetic */ C52220z51 f176562e;

            /* renamed from: f */
            public final /* synthetic */ long f176563f;

            /* renamed from: g */
            public final /* synthetic */ int f176564g;

            /* renamed from: h */
            public final /* synthetic */ int f176565h;

            /* renamed from: i */
            public final /* synthetic */ C8479f0<C0740i2> f176566i;

            /* renamed from: j */
            public final /* synthetic */ int f176567j;

            /* renamed from: n */
            public final /* synthetic */ int f176568n;

            /* renamed from: o */
            public final /* synthetic */ C62084h f176569o;

            /* renamed from: p */
            public final /* synthetic */ C62438f f176570p;

            /* renamed from: q */
            public final /* synthetic */ int f176571q;

            /* renamed from: r */
            public final /* synthetic */ String f176572r;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62090a(long j, C52220z51 z512, long j2, int i, int i2, C8479f0<C0740i2> f0Var, int i3, int i4, C62084h hVar, C62438f fVar, int i5, String str) {
                super(0);
                this.f176561d = j;
                this.f176562e = z512;
                this.f176563f = j2;
                this.f176564g = i;
                this.f176565h = i2;
                this.f176566i = f0Var;
                this.f176567j = i3;
                this.f176568n = i4;
                this.f176569o = hVar;
                this.f176570p = fVar;
                this.f176571q = i5;
                this.f176572r = str;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:188:0x03be, code lost:
                if (((r7 == null || (r8 = r7.f183160E) == null || r8.f186537i != 4) ? false : true) != false) goto L_0x03c0;
             */
            /* JADX WARNING: Removed duplicated region for block: B:102:0x01c9  */
            /* JADX WARNING: Removed duplicated region for block: B:103:0x01d5  */
            /* JADX WARNING: Removed duplicated region for block: B:198:0x041a  */
            /* JADX WARNING: Removed duplicated region for block: B:199:0x0426  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r41 = this;
                    r0 = r41
                    java.lang.Class<cl1.f1> r1 = cl1.C54974f1.class
                    ak1.g0 r3 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
                    java.lang.Class<kq.h> r2 = p185kq.C10383h.class
                    java.lang.Class<ak1.w> r4 = ak1.C54116w.class
                    java.lang.Class<ak1.o> r5 = ak1.C54108o.class
                    java.lang.Class<cl1.u> r6 = cl1.C55001u.class
                    java.lang.Class<cl1.h1> r7 = cl1.C54979h1.class
                    long r8 = r0.f176561d
                    te3.z51 r10 = r0.f176562e
                    long r11 = r10.f145708d
                    int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                    if (r14 == 0) goto L_0x0066
                    long r8 = r0.f176563f
                    long r10 = r10.f145709e
                    int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                    if (r12 == 0) goto L_0x0066
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "promote product fail,req productId:"
                    r1.append(r2)
                    long r2 = r0.f176561d
                    r1.append(r2)
                    java.lang.String r2 = ",resp:"
                    r1.append(r2)
                    te3.z51 r2 = r0.f176562e
                    if (r2 == 0) goto L_0x0041
                    long r2 = r2.f145708d
                    java.lang.Long r13 = java.lang.Long.valueOf(r2)
                    goto L_0x0042
                L_0x0041:
                    r13 = 0
                L_0x0042:
                    r1.append(r13)
                    java.lang.String r2 = ", req adId:"
                    r1.append(r2)
                    long r2 = r0.f176563f
                    r1.append(r2)
                    java.lang.String r2 = ", resp:"
                    r1.append(r2)
                    te3.z51 r2 = r0.f176562e
                    long r2 = r2.f145709e
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "Finder.LiveShoppingListAdapter"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                    goto L_0x05d5
                L_0x0066:
                    int r8 = r0.f176564g
                    java.lang.String r9 = ""
                    r12 = 1
                    if (r8 != 0) goto L_0x0558
                    int r8 = r0.f176565h
                    if (r8 != 0) goto L_0x0558
                    gy3.f0<cm1.i2> r8 = r0.f176566i
                    T r8 = r8.f27484d
                    boolean r14 = r8 instanceof sk1.C63965x
                    if (r14 == 0) goto L_0x0085
                    r15 = r8
                    sk1.x r15 = (sk1.C63965x) r15
                    int r13 = r0.f176567j
                    if (r13 != r12) goto L_0x0082
                    r13 = 1
                    goto L_0x0083
                L_0x0082:
                    r13 = 0
                L_0x0083:
                    r15.f181336D = r13
                L_0x0085:
                    boolean r13 = r8 instanceof sk1.C63964u
                    if (r13 == 0) goto L_0x0095
                    r15 = r8
                    sk1.u r15 = (sk1.C63964u) r15
                    int r11 = r0.f176567j
                    if (r11 != r12) goto L_0x0092
                    r11 = 1
                    goto L_0x0093
                L_0x0092:
                    r11 = 0
                L_0x0093:
                    r15.f181321A = r11
                L_0x0095:
                    int r11 = r0.f176567j
                    java.lang.String r15 = "getService(HellLiveReport::class.java)"
                    java.lang.String r10 = "clickid"
                    java.lang.String r12 = "liveid"
                    r18 = -1
                    r20 = r3
                    java.lang.String r3 = "appid"
                    r21 = r15
                    java.lang.String r15 = "productid"
                    r22 = r10
                    java.lang.String r10 = "shopwindowid"
                    r23 = r2
                    java.lang.String r2 = "sessionid"
                    r24 = r12
                    java.lang.String r12 = "type"
                    r25 = 0
                    r27 = r6
                    r6 = 1
                    if (r11 == r6) goto L_0x02f7
                    r6 = 2
                    if (r11 == r6) goto L_0x00c2
                    goto L_0x05d5
                L_0x00c2:
                    int r6 = r0.f176568n
                    r11 = 1
                    if (r6 != r11) goto L_0x00ed
                    op1.h r6 = r0.f176569o
                    r30 = 1
                    r31 = 0
                    if (r13 == 0) goto L_0x00d2
                    sk1.u r8 = (sk1.C63964u) r8
                    goto L_0x00d3
                L_0x00d2:
                    r8 = 0
                L_0x00d3:
                    if (r8 == 0) goto L_0x00dd
                    java.lang.String r8 = r8.f181331y
                    if (r8 != 0) goto L_0x00da
                    goto L_0x00dd
                L_0x00da:
                    r32 = r8
                    goto L_0x00df
                L_0x00dd:
                    r32 = r9
                L_0x00df:
                    pp1.f r8 = r0.f176570p
                    int r11 = r0.f176571q
                    r29 = r6
                    r33 = r8
                    r34 = r11
                    r29.mo87163Z5(r30, r31, r32, r33, r34)
                    goto L_0x010b
                L_0x00ed:
                    op1.h r6 = r0.f176569o
                    r34 = 1
                    r35 = 0
                    r36 = 0
                    pp1.f r11 = r0.f176570p
                    int r13 = r0.f176571q
                    if (r14 == 0) goto L_0x0100
                    sk1.x r8 = (sk1.C63965x) r8
                    r39 = r8
                    goto L_0x0102
                L_0x0100:
                    r39 = 0
                L_0x0102:
                    r33 = r6
                    r37 = r11
                    r38 = r13
                    r33.mo87165b6(r34, r35, r36, r37, r38, r39)
                L_0x010b:
                    pp1.f r6 = r0.f176570p
                    op1.h r8 = r0.f176569o
                    boolean r11 = r8.f176532f
                    gy3.f0<cm1.i2> r13 = r0.f176566i
                    T r13 = r13.f27484d
                    boolean r14 = r13 instanceof sk1.C63965x
                    if (r14 == 0) goto L_0x011c
                    sk1.x r13 = (sk1.C63965x) r13
                    goto L_0x011d
                L_0x011c:
                    r13 = 0
                L_0x011d:
                    if (r13 == 0) goto L_0x0122
                    te3.fp1 r13 = r13.f181346s
                    goto L_0x0123
                L_0x0122:
                    r13 = 0
                L_0x0123:
                    fj1.b r8 = r8.f176533g
                    r14 = 0
                    r6.mo87492I(r14, r11, r13, r8)
                    gy3.f0<cm1.i2> r6 = r0.f176566i
                    T r6 = r6.f27484d
                    boolean r6 = r6 instanceof sk1.C63965x
                    if (r6 == 0) goto L_0x01b8
                    op1.h r6 = r0.f176569o
                    fj1.b r6 = r6.f176533g
                    androidx.lifecycle.i0 r6 = r6.mo71262a(r7)
                    cl1.h1 r6 = (cl1.C54979h1) r6
                    te3.gj1 r6 = r6.f154113E
                    if (r6 == 0) goto L_0x0146
                    int r6 = r6.f183343d
                    r8 = 1
                    if (r6 != r8) goto L_0x0146
                    r6 = 1
                    goto L_0x0147
                L_0x0146:
                    r6 = 0
                L_0x0147:
                    if (r6 == 0) goto L_0x01b8
                    com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                    androidx.lifecycle.i0 r8 = r6.mo77630e(r7)
                    cl1.h1 r8 = (cl1.C54979h1) r8
                    if (r8 == 0) goto L_0x015d
                    te3.gj1 r8 = r8.f154113E
                    if (r8 == 0) goto L_0x015d
                    int r8 = r8.f183344e
                    if (r8 != 0) goto L_0x015d
                    r8 = 1
                    goto L_0x015e
                L_0x015d:
                    r8 = 0
                L_0x015e:
                    if (r8 == 0) goto L_0x01b8
                    gy3.f0<cm1.i2> r8 = r0.f176566i
                    T r8 = r8.f27484d
                    sk1.x r8 = (sk1.C63965x) r8
                    te3.fp1 r8 = r8.f181346s
                    if (r8 == 0) goto L_0x0176
                    te3.yh3 r11 = r8.f183160E
                    if (r11 == 0) goto L_0x0176
                    int r11 = r11.f186537i
                    r13 = 1000(0x3e8, float:1.401E-42)
                    if (r11 != r13) goto L_0x0176
                    r11 = 1
                    goto L_0x0177
                L_0x0176:
                    r11 = 0
                L_0x0177:
                    if (r11 == 0) goto L_0x01b8
                    if (r8 == 0) goto L_0x0182
                    te3.yh3 r8 = r8.f183160E
                    if (r8 == 0) goto L_0x0182
                    int r8 = r8.f186534f
                    goto L_0x0183
                L_0x0182:
                    r8 = 0
                L_0x0183:
                    int r11 = eb0.C31543z5.m39455e()
                    int r11 = r11 - r8
                    long r13 = (long) r11
                    int r8 = com.tencent.p014mm.plugin.finder.live.view.FinderLiveProductRecordView.f159795r
                    r28 = 5
                    int r8 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
                    if (r8 <= 0) goto L_0x01b8
                    androidx.lifecycle.i0 r1 = r6.mo77630e(r1)
                    cl1.f1 r1 = (cl1.C54974f1) r1
                    r6 = 0
                    if (r1 != 0) goto L_0x019b
                    goto L_0x019e
                L_0x019b:
                    r1.mo75934c3(r6)
                L_0x019e:
                    gy3.f0<cm1.i2> r1 = r0.f176566i
                    T r1 = r1.f27484d
                    sk1.x r1 = (sk1.C63965x) r1
                    te3.fp1 r1 = r1.f181346s
                    if (r1 == 0) goto L_0x01ab
                    te3.yh3 r1 = r1.f183160E
                    goto L_0x01ac
                L_0x01ab:
                    r1 = r6
                L_0x01ac:
                    if (r1 != 0) goto L_0x01af
                    goto L_0x01b2
                L_0x01af:
                    r8 = 0
                    r1.f186537i = r8
                L_0x01b2:
                    op1.h r1 = r0.f176569o
                    r1.notifyDataSetChanged()
                    goto L_0x01b9
                L_0x01b8:
                    r6 = 0
                L_0x01b9:
                    op1.h r1 = r0.f176569o
                    gy3.f0<cm1.i2> r8 = r0.f176566i
                    T r8 = r8.f27484d
                    cm1.i2 r8 = (cm1.C0740i2) r8
                    int r11 = r0.f176571q
                    boolean r1 = r1.f176532f
                    r13 = 8
                    if (r1 != 0) goto L_0x01d5
                    di3.d r1 = di3.C86312j.m106911c(r4)
                    ak1.w r1 = (ak1.C54116w) r1
                    r2 = 2
                    r1.Ix0(r2, r13, r11)
                    goto L_0x05d5
                L_0x01d5:
                    di3.d r1 = di3.C86312j.m106911c(r5)
                    ak1.o r1 = (ak1.C54108o) r1
                    r1.getClass()
                    ak1.f0 r1 = ak1.C54108o.f151869h
                    r4 = 0
                    r1.f151450c0 = r4
                    boolean r4 = r8 instanceof sk1.C63965x
                    if (r4 == 0) goto L_0x01ed
                    sk1.x r8 = (sk1.C63965x) r8
                    r11 = r7
                    long r6 = r8.f181347t
                    goto L_0x01f9
                L_0x01ed:
                    r11 = r7
                    boolean r4 = r8 instanceof sk1.C63964u
                    if (r4 == 0) goto L_0x01f7
                    sk1.u r8 = (sk1.C63964u) r8
                    long r6 = r8.f181326t
                    goto L_0x01f9
                L_0x01f7:
                    r6 = r25
                L_0x01f9:
                    di3.d r4 = di3.C86312j.m106911c(r5)
                    ak1.o r4 = (ak1.C54108o) r4
                    r4.getClass()
                    ak1.m0 r4 = r1.f151443Y
                    java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r4 = r4.f151845v
                    java.lang.Long r8 = java.lang.Long.valueOf(r6)
                    boolean r4 = r4.containsKey(r8)
                    if (r4 == 0) goto L_0x0277
                    di3.d r4 = di3.C86312j.m106911c(r5)
                    ak1.o r4 = (ak1.C54108o) r4
                    r4.getClass()
                    ak1.m0 r4 = r1.f151443Y
                    java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r4 = r4.f151845v
                    java.lang.Long r8 = java.lang.Long.valueOf(r6)
                    java.lang.Object r4 = r4.get(r8)
                    java.util.LinkedList r4 = (java.util.LinkedList) r4
                    if (r4 == 0) goto L_0x0277
                    boolean r8 = r4.isEmpty()
                    r14 = 1
                    r8 = r8 ^ r14
                    if (r8 == 0) goto L_0x0277
                    java.lang.Object r8 = r4.getLast()
                    ak1.z r8 = (ak1.C54118z) r8
                    boolean r8 = r8.f151965b
                    if (r8 != 0) goto L_0x0277
                    long r16 = java.lang.System.currentTimeMillis()
                    java.lang.Object r8 = r4.getLast()
                    ak1.z r8 = (ak1.C54118z) r8
                    long r13 = r8.f151964a
                    long r16 = r16 - r13
                    java.lang.Object r8 = r4.getLast()
                    ak1.z r8 = (ak1.C54118z) r8
                    int r13 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
                    if (r13 <= 0) goto L_0x0256
                    r13 = r16
                    goto L_0x0258
                L_0x0256:
                    r13 = r25
                L_0x0258:
                    r8.f151964a = r13
                    java.lang.Object r8 = r4.getLast()
                    ak1.z r8 = (ak1.C54118z) r8
                    r13 = 1
                    r8.f151965b = r13
                    java.lang.Long r8 = java.lang.Long.valueOf(r6)
                    di3.d r13 = di3.C86312j.m106911c(r5)
                    ak1.o r13 = (ak1.C54108o) r13
                    r13.getClass()
                    ak1.m0 r13 = r1.f151443Y
                    java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r13 = r13.f151845v
                    r13.put(r8, r4)
                L_0x0277:
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                    r8 = 8
                    r4.put(r12, r8)
                    di3.d r8 = di3.C86312j.m106911c(r5)
                    ak1.o r8 = (ak1.C54108o) r8
                    r8.getClass()
                    java.lang.String r1 = r1.f151475s
                    r4.put(r2, r1)
                    r4.put(r10, r9)
                    r4.put(r15, r6)
                    fj1.b r1 = fj1.C45795b.f123698n
                    if (r1 == 0) goto L_0x02a2
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r11)
                    cl1.h1 r1 = (cl1.C54979h1) r1
                    java.lang.String r13 = r1.f154151z
                    goto L_0x02a3
                L_0x02a2:
                    r13 = 0
                L_0x02a3:
                    r4.put(r3, r13)
                    fj1.b r1 = fj1.C45795b.f123698n
                    if (r1 == 0) goto L_0x02b9
                    r6 = r27
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r6)
                    cl1.u r1 = (cl1.C55001u) r1
                    te3.c21 r1 = r1.f154420q
                    if (r1 == 0) goto L_0x02b9
                    long r1 = r1.f182392d
                    goto L_0x02bb
                L_0x02b9:
                    r1 = r18
                L_0x02bb:
                    int r3 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
                    if (r3 >= 0) goto L_0x02c5
                    r7 = r24
                    r4.put(r7, r9)
                    goto L_0x02d4
                L_0x02c5:
                    r7 = r24
                    di3.d r3 = di3.C86312j.m106911c(r23)
                    kq.h r3 = (p185kq.C10383h) r3
                    java.lang.String r1 = r3.mo10700XQ(r1)
                    r4.put(r7, r1)
                L_0x02d4:
                    java.lang.String r1 = t91.C64208c.f181967q
                    r14 = r22
                    r4.put(r14, r1)
                    t91.C64208c.f181967q = r9
                    di3.d r1 = di3.C86312j.m106911c(r5)
                    r2 = r21
                    gy3.C87412m.m108593f(r1, r2)
                    r2 = r1
                    ht1.j5 r2 = (ht1.C8777j5) r2
                    java.lang.String r4 = r4.toString()
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r3 = r20
                    ht1.C8777j5.C8778a.m8605f(r2, r3, r4, r5, r6, r7)
                    goto L_0x05d5
                L_0x02f7:
                    r11 = r7
                    r40 = r21
                    r7 = r24
                    r6 = r27
                    int r14 = r0.f176568n
                    r7 = 1
                    if (r14 != r7) goto L_0x032b
                    op1.h r7 = r0.f176569o
                    r30 = 1
                    r31 = 1
                    if (r13 == 0) goto L_0x030e
                    sk1.u r8 = (sk1.C63964u) r8
                    goto L_0x030f
                L_0x030e:
                    r8 = 0
                L_0x030f:
                    if (r8 == 0) goto L_0x0319
                    java.lang.String r8 = r8.f181331y
                    if (r8 != 0) goto L_0x0316
                    goto L_0x0319
                L_0x0316:
                    r32 = r8
                    goto L_0x031b
                L_0x0319:
                    r32 = r9
                L_0x031b:
                    pp1.f r8 = r0.f176570p
                    int r13 = r0.f176571q
                    r29 = r7
                    r33 = r8
                    r34 = r13
                    r29.mo87163Z5(r30, r31, r32, r33, r34)
                    r21 = r3
                    goto L_0x034b
                L_0x032b:
                    op1.h r7 = r0.f176569o
                    r34 = 1
                    r35 = 1
                    r36 = 0
                    pp1.f r13 = r0.f176570p
                    int r14 = r0.f176571q
                    r21 = r3
                    java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem"
                    gy3.C87412m.m108592e(r8, r3)
                    r39 = r8
                    sk1.x r39 = (sk1.C63965x) r39
                    r33 = r7
                    r37 = r13
                    r38 = r14
                    r33.mo87165b6(r34, r35, r36, r37, r38, r39)
                L_0x034b:
                    pp1.f r3 = r0.f176570p
                    op1.h r7 = r0.f176569o
                    boolean r8 = r7.f176532f
                    gy3.f0<cm1.i2> r13 = r0.f176566i
                    T r13 = r13.f27484d
                    boolean r14 = r13 instanceof sk1.C63965x
                    if (r14 == 0) goto L_0x035c
                    sk1.x r13 = (sk1.C63965x) r13
                    goto L_0x035d
                L_0x035c:
                    r13 = 0
                L_0x035d:
                    if (r13 == 0) goto L_0x0362
                    te3.fp1 r13 = r13.f181346s
                    goto L_0x0363
                L_0x0362:
                    r13 = 0
                L_0x0363:
                    fj1.b r7 = r7.f176533g
                    r14 = 1
                    r3.mo87492I(r14, r8, r13, r7)
                    gy3.f0<cm1.i2> r3 = r0.f176566i
                    T r3 = r3.f27484d
                    boolean r3 = r3 instanceof sk1.C63965x
                    if (r3 == 0) goto L_0x0400
                    op1.h r3 = r0.f176569o
                    fj1.b r3 = r3.f176533g
                    androidx.lifecycle.i0 r3 = r3.mo71262a(r11)
                    cl1.h1 r3 = (cl1.C54979h1) r3
                    te3.gj1 r3 = r3.f154113E
                    if (r3 == 0) goto L_0x0386
                    int r3 = r3.f183343d
                    r7 = 1
                    if (r3 != r7) goto L_0x0386
                    r3 = 1
                    goto L_0x0387
                L_0x0386:
                    r3 = 0
                L_0x0387:
                    if (r3 == 0) goto L_0x0400
                    com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                    androidx.lifecycle.i0 r7 = r3.mo77630e(r11)
                    cl1.h1 r7 = (cl1.C54979h1) r7
                    if (r7 == 0) goto L_0x039d
                    te3.gj1 r7 = r7.f154113E
                    if (r7 == 0) goto L_0x039d
                    int r7 = r7.f183344e
                    if (r7 != 0) goto L_0x039d
                    r7 = 1
                    goto L_0x039e
                L_0x039d:
                    r7 = 0
                L_0x039e:
                    if (r7 == 0) goto L_0x0400
                    gy3.f0<cm1.i2> r7 = r0.f176566i
                    T r7 = r7.f27484d
                    sk1.x r7 = (sk1.C63965x) r7
                    te3.fp1 r7 = r7.f181346s
                    if (r7 == 0) goto L_0x03ad
                    te3.yh3 r8 = r7.f183160E
                    goto L_0x03ae
                L_0x03ad:
                    r8 = 0
                L_0x03ae:
                    if (r8 == 0) goto L_0x03c0
                    if (r7 == 0) goto L_0x03bd
                    te3.yh3 r8 = r7.f183160E
                    if (r8 == 0) goto L_0x03bd
                    int r8 = r8.f186537i
                    r13 = 4
                    if (r8 != r13) goto L_0x03bd
                    r8 = 1
                    goto L_0x03be
                L_0x03bd:
                    r8 = 0
                L_0x03be:
                    if (r8 == 0) goto L_0x0400
                L_0x03c0:
                    te3.yh3 r8 = new te3.yh3
                    r8.<init>()
                    op1.h r13 = r0.f176569o
                    fj1.b r13 = r13.f176533g
                    androidx.lifecycle.i0 r13 = r13.mo71262a(r6)
                    cl1.u r13 = (cl1.C55001u) r13
                    te3.c21 r13 = r13.f154420q
                    long r13 = r13.f182392d
                    r8.f186532d = r13
                    r13 = 1000(0x3e8, float:1.401E-42)
                    r8.f186537i = r13
                    int r13 = eb0.C31543z5.m39455e()
                    r8.f186534f = r13
                    r7.f183160E = r8
                    androidx.lifecycle.i0 r1 = r3.mo77630e(r1)
                    cl1.f1 r1 = (cl1.C54974f1) r1
                    if (r1 != 0) goto L_0x03ea
                    goto L_0x03f5
                L_0x03ea:
                    gy3.f0<cm1.i2> r3 = r0.f176566i
                    T r3 = r3.f27484d
                    sk1.x r3 = (sk1.C63965x) r3
                    te3.fp1 r3 = r3.f181346s
                    r1.mo75934c3(r3)
                L_0x03f5:
                    op1.v r1 = new op1.v
                    op1.h r3 = r0.f176569o
                    r1.<init>(r3)
                    o40.C61926c.m72668M(r1)
                    goto L_0x040b
                L_0x0400:
                    op1.h r1 = r0.f176569o
                    fy3.l<? super java.lang.Boolean, rx3.b0> r1 = r1.f176545v
                    if (r1 == 0) goto L_0x040b
                    java.lang.Boolean r3 = java.lang.Boolean.TRUE
                    r1.invoke(r3)
                L_0x040b:
                    op1.h r1 = r0.f176569o
                    gy3.f0<cm1.i2> r3 = r0.f176566i
                    T r3 = r3.f27484d
                    cm1.i2 r3 = (cm1.C0740i2) r3
                    int r7 = r0.f176571q
                    boolean r1 = r1.f176532f
                    r8 = 7
                    if (r1 != 0) goto L_0x0426
                    di3.d r1 = di3.C86312j.m106911c(r4)
                    ak1.w r1 = (ak1.C54116w) r1
                    r2 = 2
                    r1.Ix0(r2, r8, r7)
                    goto L_0x05d5
                L_0x0426:
                    di3.d r1 = di3.C86312j.m106911c(r5)
                    ak1.o r1 = (ak1.C54108o) r1
                    r1.getClass()
                    ak1.f0 r1 = ak1.C54108o.f151869h
                    r4 = 1
                    r1.f151450c0 = r4
                    di3.d r4 = di3.C86312j.m106911c(r5)
                    ak1.o r4 = (ak1.C54108o) r4
                    r4.getClass()
                    r1.mo74764n()
                    boolean r4 = r3 instanceof sk1.C63965x
                    if (r4 == 0) goto L_0x0449
                    sk1.x r3 = (sk1.C63965x) r3
                    long r3 = r3.f181347t
                    goto L_0x0454
                L_0x0449:
                    boolean r4 = r3 instanceof sk1.C63964u
                    if (r4 == 0) goto L_0x0452
                    sk1.u r3 = (sk1.C63964u) r3
                    long r3 = r3.f181326t
                    goto L_0x0454
                L_0x0452:
                    r3 = r25
                L_0x0454:
                    di3.d r7 = di3.C86312j.m106911c(r5)
                    ak1.o r7 = (ak1.C54108o) r7
                    r7.getClass()
                    ak1.m0 r7 = r1.f151443Y
                    java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r7 = r7.f151845v
                    java.lang.Long r13 = java.lang.Long.valueOf(r3)
                    boolean r7 = r7.containsKey(r13)
                    if (r7 == 0) goto L_0x04ad
                    di3.d r7 = di3.C86312j.m106911c(r5)
                    ak1.o r7 = (ak1.C54108o) r7
                    r7.getClass()
                    ak1.m0 r7 = r1.f151443Y
                    java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r7 = r7.f151845v
                    java.lang.Long r13 = java.lang.Long.valueOf(r3)
                    java.lang.Object r7 = r7.get(r13)
                    java.util.LinkedList r7 = (java.util.LinkedList) r7
                    if (r7 != 0) goto L_0x0489
                    java.util.LinkedList r7 = new java.util.LinkedList
                    r7.<init>()
                L_0x0489:
                    ak1.z r13 = new ak1.z
                    r27 = r9
                    long r8 = java.lang.System.currentTimeMillis()
                    r14 = 0
                    r13.<init>(r8, r14)
                    r7.addLast(r13)
                    java.lang.Long r8 = java.lang.Long.valueOf(r3)
                    di3.d r9 = di3.C86312j.m106911c(r5)
                    ak1.o r9 = (ak1.C54108o) r9
                    r9.getClass()
                    ak1.m0 r9 = r1.f151443Y
                    java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r9 = r9.f151845v
                    r9.put(r8, r7)
                    goto L_0x04d5
                L_0x04ad:
                    r27 = r9
                    java.util.LinkedList r7 = new java.util.LinkedList
                    r7.<init>()
                    ak1.z r8 = new ak1.z
                    long r13 = java.lang.System.currentTimeMillis()
                    r9 = 0
                    r8.<init>(r13, r9)
                    r7.addLast(r8)
                    java.lang.Long r8 = java.lang.Long.valueOf(r3)
                    di3.d r9 = di3.C86312j.m106911c(r5)
                    ak1.o r9 = (ak1.C54108o) r9
                    r9.getClass()
                    ak1.m0 r9 = r1.f151443Y
                    java.util.HashMap<java.lang.Long, java.util.LinkedList<ak1.z>> r9 = r9.f151845v
                    r9.put(r8, r7)
                L_0x04d5:
                    org.json.JSONObject r7 = new org.json.JSONObject
                    r7.<init>()
                    r8 = 7
                    r7.put(r12, r8)
                    di3.d r8 = di3.C86312j.m106911c(r5)
                    ak1.o r8 = (ak1.C54108o) r8
                    r8.getClass()
                    java.lang.String r1 = r1.f151475s
                    r7.put(r2, r1)
                    r1 = r27
                    r7.put(r10, r1)
                    r7.put(r15, r3)
                    fj1.b r2 = fj1.C45795b.f123698n
                    if (r2 == 0) goto L_0x0503
                    androidx.lifecycle.i0 r2 = r2.mo71262a(r11)
                    cl1.h1 r2 = (cl1.C54979h1) r2
                    java.lang.String r13 = r2.f154151z
                    r2 = r21
                    goto L_0x0506
                L_0x0503:
                    r2 = r21
                    r13 = 0
                L_0x0506:
                    r7.put(r2, r13)
                    fj1.b r2 = fj1.C45795b.f123698n
                    if (r2 == 0) goto L_0x051a
                    androidx.lifecycle.i0 r2 = r2.mo71262a(r6)
                    cl1.u r2 = (cl1.C55001u) r2
                    te3.c21 r2 = r2.f154420q
                    if (r2 == 0) goto L_0x051a
                    long r2 = r2.f182392d
                    goto L_0x051c
                L_0x051a:
                    r2 = r18
                L_0x051c:
                    int r4 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
                    if (r4 >= 0) goto L_0x0526
                    r4 = r24
                    r7.put(r4, r1)
                    goto L_0x0535
                L_0x0526:
                    r4 = r24
                    di3.d r6 = di3.C86312j.m106911c(r23)
                    kq.h r6 = (p185kq.C10383h) r6
                    java.lang.String r2 = r6.mo10700XQ(r2)
                    r7.put(r4, r2)
                L_0x0535:
                    java.lang.String r2 = t91.C64208c.f181967q
                    r3 = r22
                    r7.put(r3, r2)
                    t91.C64208c.f181967q = r1
                    di3.d r1 = di3.C86312j.m106911c(r5)
                    r2 = r40
                    gy3.C87412m.m108593f(r1, r2)
                    r2 = r1
                    ht1.j5 r2 = (ht1.C8777j5) r2
                    java.lang.String r4 = r7.toString()
                    r5 = 0
                    r6 = 4
                    r7 = 0
                    r3 = r20
                    ht1.C8777j5.C8778a.m8605f(r2, r3, r4, r5, r6, r7)
                    goto L_0x05d5
                L_0x0558:
                    r1 = r9
                    android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r2 = r2.getResources()
                    r3 = 2131828544(0x7f111f40, float:1.9290032E38)
                    java.lang.String r2 = r2.getString(r3)
                    java.lang.String r3 = "getContext().resources.g…ofile_action_fail_prefix)"
                    gy3.C87412m.m108593f(r2, r3)
                    int r3 = r0.f176567j
                    r4 = 1
                    if (r3 == r4) goto L_0x058c
                    r4 = 2
                    if (r3 == r4) goto L_0x0577
                    r3 = r1
                    goto L_0x05a0
                L_0x0577:
                    android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r3 = r3.getResources()
                    r4 = 2131828850(0x7f112072, float:1.9290653E38)
                    java.lang.String r3 = r3.getString(r4)
                    java.lang.String r4 = "getContext().resources.g…ive_shopping_talking_end)"
                    gy3.C87412m.m108593f(r3, r4)
                    goto L_0x05a0
                L_0x058c:
                    android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r3 = r3.getResources()
                    r4 = 2131828849(0x7f112071, float:1.929065E38)
                    java.lang.String r3 = r3.getString(r4)
                    java.lang.String r4 = "getContext().resources.g…ive_shopping_talking_btn)"
                    gy3.C87412m.m108593f(r3, r4)
                L_0x05a0:
                    android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r2)
                    r5.append(r3)
                    java.lang.String r2 = r5.toString()
                    r3 = 0
                    android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r4, (java.lang.CharSequence) r2, (int) r3)
                    r2.show()
                    er1.f5 r3 = er1.C58728f5.f168144a
                    int r5 = r0.f176565h
                    int r6 = r0.f176564g
                    java.lang.String r2 = r0.f176572r
                    if (r2 != 0) goto L_0x05c7
                    r7 = r1
                    goto L_0x05c8
                L_0x05c7:
                    r7 = r2
                L_0x05c8:
                    op1.h r1 = r0.f176569o
                    fj1.b r8 = r1.f176533g
                    r9 = 0
                    r10 = 32
                    r11 = 0
                    java.lang.String r4 = "productPromoting"
                    er1.C58728f5.m68215a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                L_0x05d5:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.C62089e.C62090a.invoke():java.lang.Object");
            }
        }

        public C62089e(long j, long j2, C8479f0<C0740i2> f0Var, int i, int i2, C62084h hVar, C62438f fVar, int i3) {
            this.f176553a = j;
            this.f176554b = j2;
            this.f176555c = f0Var;
            this.f176556d = i;
            this.f176557e = i2;
            this.f176558f = hVar;
            this.f176559g = fVar;
            this.f176560h = i3;
        }

        /* renamed from: a */
        public void mo83054a(int i, int i2, String str, C52220z51 z512) {
            C52220z51 z513 = z512;
            C87412m.m108594g(z513, "resp");
            C61926c.m72668M(new C62090a(this.f176553a, z513, this.f176554b, i, i2, this.f176555c, this.f176556d, this.f176557e, this.f176558f, this.f176559g, this.f176560h, str));
        }
    }

    /* renamed from: op1.h$f */
    public static final class C62091f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62084h f176573d;

        /* renamed from: e */
        public final /* synthetic */ int f176574e;

        /* renamed from: f */
        public final /* synthetic */ C62438f f176575f;

        public C62091f(C62084h hVar, int i, C62438f fVar) {
            this.f176573d = hVar;
            this.f176574e = i;
            this.f176575f = fVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setAdOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62084h.m72974u5(this.f176573d, this.f176574e, this.f176575f, C54067f0.C54081r0.CommerceActionGoodsItemClick);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setAdOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: op1.h$g */
    public static final class C62092g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62084h f176576d;

        /* renamed from: e */
        public final /* synthetic */ C62438f f176577e;

        /* renamed from: f */
        public final /* synthetic */ int f176578f;

        public C62092g(C62084h hVar, C62438f fVar, int i) {
            this.f176576d = hVar;
            this.f176577e = fVar;
            this.f176578f = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
            if ((r8 != null ? ((cl1.C54991o) r8.mo71262a(cl1.C54991o.class)).f154190D : false) != false) goto L_0x004c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setAdOnClickListener$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                er1.j4 r8 = er1.C58739j4.f168176a
                boolean r8 = r8.mo83683L()
                java.lang.String r0 = "(Landroid/view/View;)V"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setAdOnClickListener$2"
                if (r8 == 0) goto L_0x002f
                j20.C117292a.m165361g(r7, r3, r2, r1, r0)
                return
            L_0x002f:
                ok1.e r8 = ok1.C62042e.f176370a
                boolean r8 = r8.mo87027N0()
                r4 = 0
                if (r8 != 0) goto L_0x004c
                fj1.b$a r8 = fj1.C45795b.f123697j
                fj1.b r8 = fj1.C45795b.f123698n
                if (r8 == 0) goto L_0x0049
                java.lang.Class<cl1.o> r5 = cl1.C54991o.class
                androidx.lifecycle.i0 r8 = r8.mo71262a(r5)
                cl1.o r8 = (cl1.C54991o) r8
                boolean r8 = r8.f154190D
                goto L_0x004a
            L_0x0049:
                r8 = 0
            L_0x004a:
                if (r8 == 0) goto L_0x004d
            L_0x004c:
                r4 = 1
            L_0x004d:
                if (r4 == 0) goto L_0x0059
                op1.h r8 = r7.f176576d
                pp1.f r4 = r7.f176577e
                int r5 = r7.f176578f
                op1.C62084h.m72973N5(r8, r4, r5)
                goto L_0x0064
            L_0x0059:
                op1.h r8 = r7.f176576d
                int r4 = r7.f176578f
                pp1.f r5 = r7.f176577e
                ak1.f0$r0 r6 = ak1.C54067f0.C54081r0.CommerceActionPurchaseButtonClick
                op1.C62084h.m72974u5(r8, r4, r5, r6)
            L_0x0064:
                j20.C117292a.m165361g(r7, r3, r2, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.C62092g.onClick(android.view.View):void");
        }
    }

    /* renamed from: op1.h$h */
    public static final class C62093h implements View.OnLongClickListener {

        /* renamed from: d */
        public static final C62093h f176579d = new C62093h();

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setAdOnClickListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setAdOnClickListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: op1.h$i */
    public static final class C62094i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62084h f176580d;

        /* renamed from: e */
        public final /* synthetic */ int f176581e;

        /* renamed from: f */
        public final /* synthetic */ C62438f f176582f;

        /* renamed from: op1.h$i$a */
        public static final class C62095a extends C87413o implements C32227p<Boolean, C86299o, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C62084h f176583d;

            /* renamed from: e */
            public final /* synthetic */ C0740i2 f176584e;

            /* renamed from: f */
            public final /* synthetic */ C62438f f176585f;

            /* renamed from: g */
            public final /* synthetic */ int f176586g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62095a(C62084h hVar, C0740i2 i2Var, C62438f fVar, int i) {
                super(2);
                this.f176583d = hVar;
                this.f176584e = i2Var;
                this.f176585f = fVar;
                this.f176586g = i;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Class<cl1.o>} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Class<cl1.o>} */
            /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.String] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31) {
                /*
                    r29 = this;
                    r0 = r29
                    r1 = r30
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    r1.booleanValue()
                    r7 = r31
                    di0.o r7 = (di0.C86299o) r7
                    java.lang.Class<ak1.w> r8 = ak1.C54116w.class
                    java.lang.Class<cl1.o> r9 = cl1.C54991o.class
                    java.lang.Class<ak1.o> r10 = ak1.C54108o.class
                    if (r7 == 0) goto L_0x0244
                    op1.h r11 = r0.f176583d
                    cm1.i2 r3 = r0.f176584e
                    pp1.f r2 = r0.f176585f
                    int r12 = r0.f176586g
                    com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r1 = r7.f250947s
                    if (r1 != 0) goto L_0x0026
                    com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r1 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
                    r1.<init>()
                L_0x0026:
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                    r13 = r3
                    sk1.x r13 = (sk1.C63965x) r13
                    te3.fp1 r5 = r13.f181346s
                    java.lang.String r5 = r5.f183163H
                    java.lang.String r14 = ""
                    if (r5 != 0) goto L_0x0037
                    r5 = r14
                L_0x0037:
                    java.lang.String r6 = "cookies"
                    r4.put(r6, r5)
                    r15 = 1
                    r1.f239396d = r15
                    java.lang.String r4 = r4.toString()
                    r1.f239399g = r4
                    r7.f250947s = r1
                    er1.j4 r1 = er1.C58739j4.f168176a
                    te3.l40 r1 = r1.mo83715j(r7)
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r4 = r7.f250912A
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$b r4 = r4.mo76935f()
                    np1.v r5 = np1.C61881v.f175961a
                    fj1.b r6 = r11.f176533g
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$ShareActionConfig r1 = r5.mo86810b(r6, r13, r1)
                    r4.f158008t = r1
                    com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r4.mo76967a()
                    r7.f250912A = r1
                    r5.mo86813e(r7)
                    te3.fp1 r1 = r13.f181346s
                    te3.yh3 r1 = r1.f183160E
                    if (r1 == 0) goto L_0x00a3
                    long r4 = r1.f186536h
                    java.lang.Class<com.tencent.mm.plugin.finder.live.view.o1> r1 = com.tencent.p014mm.plugin.finder.live.view.C3222o1.class
                    r7.f250926O = r1
                    org.json.JSONObject r1 = new org.json.JSONObject
                    r1.<init>()
                    te3.fp1 r6 = r13.f181346s
                    r30 = r8
                    r31 = r9
                    long r8 = r6.f183176d
                    java.lang.String r6 = "productId"
                    org.json.JSONObject r1 = r1.put(r6, r8)
                    java.lang.String r6 = "replayId"
                    org.json.JSONObject r1 = r1.put(r6, r4)
                    java.lang.String r4 = r7.f250940l
                    java.lang.String r5 = "session"
                    org.json.JSONObject r1 = r1.put(r5, r4)
                    java.lang.String r4 = r13.f181293f
                    java.lang.String r5 = "jumpId"
                    org.json.JSONObject r1 = r1.put(r5, r4)
                    java.lang.String r1 = r1.toString()
                    r7.f250927P = r1
                    goto L_0x00a7
                L_0x00a3:
                    r30 = r8
                    r31 = r9
                L_0x00a7:
                    a14.n0 r8 = r2.f29679z
                    if (r8 == 0) goto L_0x00c2
                    r17 = 0
                    r18 = 0
                    op1.w r19 = new op1.w
                    r6 = 0
                    r1 = r19
                    r4 = r11
                    r5 = r7
                    r1.<init>(r2, r3, r4, r5, r6)
                    r20 = 3
                    r21 = 0
                    r16 = r8
                    a14.C53895h.m60466d(r16, r17, r18, r19, r20, r21)
                L_0x00c2:
                    boolean r1 = r11.f176532f
                    r2 = 0
                    r3 = 0
                    if (r1 == 0) goto L_0x01a8
                    di3.d r1 = di3.C86312j.m106911c(r10)
                    ak1.o r1 = (ak1.C54108o) r1
                    r1.getClass()
                    ak1.f0 r1 = ak1.C54108o.f151869h
                    r1.f151452d0 = r15
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                    r5 = 3
                    java.lang.String r6 = "type"
                    r4.put(r6, r5)
                    di3.d r5 = di3.C86312j.m106911c(r10)
                    ak1.o r5 = (ak1.C54108o) r5
                    r5.getClass()
                    java.lang.String r1 = r1.f151475s
                    java.lang.String r5 = "sessionid"
                    r4.put(r5, r1)
                    java.lang.String r1 = "shopwindowid"
                    r4.put(r1, r14)
                    long r5 = r13.f181347t
                    java.lang.String r1 = "productid"
                    r4.put(r1, r5)
                    fj1.b r1 = fj1.C45795b.f123698n
                    r5 = r31
                    if (r1 == 0) goto L_0x0113
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r5)
                    cl1.o r1 = (cl1.C54991o) r1
                    boolean r1 = r1.mo75995c4()
                    if (r1 != r15) goto L_0x0113
                    r1 = 1
                    goto L_0x0114
                L_0x0113:
                    r1 = 0
                L_0x0114:
                    java.lang.String r6 = "getService(HellLiveReport::class.java)"
                    if (r1 == 0) goto L_0x0130
                    di3.d r1 = di3.C86312j.m106911c(r10)
                    gy3.C87412m.m108593f(r1, r6)
                    r7 = r1
                    ht1.j5 r7 = (ht1.C8777j5) r7
                    r8 = 6
                    java.lang.String r10 = r4.toString()
                    r11 = 0
                    r12 = 4
                    r13 = 0
                    ht1.C8777j5.C8778a.m8600a(r7, r8, r10, r11, r12, r13)
                    goto L_0x0244
                L_0x0130:
                    fj1.b r1 = fj1.C45795b.f123698n
                    if (r1 == 0) goto L_0x0141
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r5)
                    cl1.o r1 = (cl1.C54991o) r1
                    boolean r1 = r1.mo75999e4()
                    if (r1 != r15) goto L_0x0141
                    goto L_0x0142
                L_0x0141:
                    r15 = 0
                L_0x0142:
                    if (r15 == 0) goto L_0x0244
                    fj1.b r1 = fj1.C45795b.f123698n
                    if (r1 == 0) goto L_0x0152
                    java.lang.Class<cl1.h1> r2 = cl1.C54979h1.class
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
                    cl1.h1 r1 = (cl1.C54979h1) r1
                    java.lang.String r2 = r1.f154151z
                L_0x0152:
                    java.lang.String r1 = "appid"
                    r4.put(r1, r2)
                    fj1.b r1 = fj1.C45795b.f123698n
                    if (r1 == 0) goto L_0x016a
                    java.lang.Class<cl1.u> r2 = cl1.C55001u.class
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
                    cl1.u r1 = (cl1.C55001u) r1
                    te3.c21 r1 = r1.f154420q
                    if (r1 == 0) goto L_0x016a
                    long r1 = r1.f182392d
                    goto L_0x016c
                L_0x016a:
                    r1 = -1
                L_0x016c:
                    r7 = 0
                    java.lang.String r3 = "liveid"
                    int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    if (r5 >= 0) goto L_0x0178
                    r4.put(r3, r14)
                    goto L_0x0187
                L_0x0178:
                    java.lang.Class<kq.h> r5 = p185kq.C10383h.class
                    di3.d r5 = di3.C86312j.m106911c(r5)
                    kq.h r5 = (p185kq.C10383h) r5
                    java.lang.String r1 = r5.mo10700XQ(r1)
                    r4.put(r3, r1)
                L_0x0187:
                    java.lang.String r1 = t91.C64208c.f181967q
                    java.lang.String r2 = "clickid"
                    r4.put(r2, r1)
                    t91.C64208c.f181967q = r14
                    di3.d r1 = di3.C86312j.m106911c(r10)
                    gy3.C87412m.m108593f(r1, r6)
                    r7 = r1
                    ht1.j5 r7 = (ht1.C8777j5) r7
                    ak1.g0 r8 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
                    java.lang.String r9 = r4.toString()
                    r10 = 0
                    r11 = 4
                    r12 = 0
                    ht1.C8777j5.C8778a.m8605f(r7, r8, r9, r10, r11, r12)
                    goto L_0x0244
                L_0x01a8:
                    r5 = r31
                    fj1.b r1 = fj1.C45795b.f123698n
                    if (r1 == 0) goto L_0x01b6
                    androidx.lifecycle.i0 r1 = r1.mo71262a(r5)
                    cl1.o r1 = (cl1.C54991o) r1
                    boolean r3 = r1.f154190D
                L_0x01b6:
                    if (r3 == 0) goto L_0x01c4
                    di3.d r1 = di3.C86312j.m106911c(r30)
                    ak1.w r1 = (ak1.C54116w) r1
                    r2 = 2
                    r1.Ix0(r2, r2, r12)
                    goto L_0x0244
                L_0x01c4:
                    di3.d r1 = di3.C86312j.m106911c(r30)
                    java.lang.String r3 = "getService(HellLiveVisitorReoprter::class.java)"
                    gy3.C87412m.m108593f(r1, r3)
                    r16 = r1
                    ak1.w r16 = (ak1.C54116w) r16
                    ak1.f0$r0 r17 = ak1.C54067f0.C54081r0.CommerceActionGoodsItemClick
                    java.lang.String r1 = r7.f250940l
                    long r3 = r13.f181347t
                    java.lang.String r19 = java.lang.String.valueOf(r3)
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    np1.i0 r3 = np1.C61866i0.f175909a
                    te3.fp1 r4 = r13.f181346s
                    org.json.JSONObject r3 = r3.mo86794e(r4)
                    boolean r4 = r11.mo87158U5()
                    r4 = r4 ^ r15
                    java.lang.String r5 = "list_type"
                    r3.put(r5, r4)
                    te3.fp1 r4 = r13.f181346s
                    java.util.LinkedList<te3.p00> r4 = r4.f183195z
                    if (r4 == 0) goto L_0x0237
                    boolean r5 = r4.isEmpty()
                    r5 = r5 ^ r15
                    if (r5 == 0) goto L_0x0205
                    r2 = r4
                L_0x0205:
                    if (r2 == 0) goto L_0x0237
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.util.Iterator r2 = r2.iterator()
                L_0x0210:
                    boolean r5 = r2.hasNext()
                    java.lang.String r6 = ";"
                    if (r5 == 0) goto L_0x022a
                    java.lang.Object r5 = r2.next()
                    te3.p00 r5 = (te3.C64617p00) r5
                    java.lang.String r5 = r5.f184724e
                    if (r5 != 0) goto L_0x0223
                    r5 = r14
                L_0x0223:
                    r4.append(r5)
                    r4.append(r6)
                    goto L_0x0210
                L_0x022a:
                    java.lang.CharSequence r2 = z04.C112550d0.m153779O(r4, r6)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r4 = "couponid"
                    r3.put(r4, r2)
                L_0x0237:
                    rx3.b0 r2 = rx3.C13598b0.f38549a
                    r27 = 248(0xf8, float:3.48E-43)
                    r28 = 0
                    r18 = r1
                    r26 = r3
                    ak1.C54116w.Rx0(r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28)
                L_0x0244:
                    rx3.b0 r1 = rx3.C13598b0.f38549a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.C62094i.C62095a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        public C62094i(C62084h hVar, int i, C62438f fVar) {
            this.f176580d = hVar;
            this.f176581e = i;
            this.f176582f = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x0360  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x036b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f2  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0146  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0242  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0244  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x025f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0261  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0284  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x02b2  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x02b5  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x02d7  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x02da  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0342  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r71) {
            /*
                r70 = this;
                r6 = r70
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r71
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$1"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r70
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                er1.j4 r0 = er1.C58739j4.f168176a
                boolean r1 = r0.mo83683L()
                java.lang.String r2 = "(Landroid/view/View;)V"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "android/view/View$OnClickListener"
                java.lang.String r5 = "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$1"
                if (r1 == 0) goto L_0x0034
                j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                return
            L_0x0034:
                op1.h r1 = r6.f176580d
                int r7 = r6.f176581e
                cm1.i2 r1 = r1.mo87156S5(r7)
                boolean r7 = r1 instanceof sk1.C63965x
                if (r7 == 0) goto L_0x03ea
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "on product item click appId:"
                r7.append(r8)
                r8 = r1
                sk1.x r8 = (sk1.C63965x) r8
                te3.l40 r9 = r8.f181335C
                if (r9 == 0) goto L_0x0054
                java.lang.String r9 = r9.f184031d
                goto L_0x0055
            L_0x0054:
                r9 = 0
            L_0x0055:
                r7.append(r9)
                java.lang.String r9 = ",path:"
                r7.append(r9)
                te3.l40 r9 = r8.f181335C
                if (r9 == 0) goto L_0x0064
                java.lang.String r9 = r9.f184032e
                goto L_0x0065
            L_0x0064:
                r9 = 0
            L_0x0065:
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.String r9 = "Finder.LiveShoppingListAdapter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
                op1.h r7 = r6.f176580d
                fj1.b r9 = r7.f176533g
                op1.h$i$a r11 = new op1.h$i$a
                pp1.f r12 = r6.f176582f
                int r13 = r6.f176581e
                r11.<init>(r7, r1, r12, r13)
                java.lang.Class<kq.h> r1 = p185kq.C10383h.class
                java.lang.Class<cl1.u> r7 = cl1.C55001u.class
                java.lang.Class<cl1.o> r12 = cl1.C54991o.class
                java.lang.String r13 = "liveData"
                gy3.C87412m.m108594g(r9, r13)
                java.lang.String r13 = "FinderLive.MiniProgramPayloadHelper"
                if (r8 != 0) goto L_0x009c
                java.lang.String r0 = "[getPayloadForProductItemClick] fail, liveData is null:false,data is null:true!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                r17 = r2
                r19 = r3
                r18 = r4
                r71 = r5
                goto L_0x03df
            L_0x009c:
                ok1.e r14 = ok1.C62042e.f176370a
                int r15 = r8.f181337E
                r14.getClass()
                r16 = 0
                if (r15 <= 0) goto L_0x00a9
                r15 = 1
                goto L_0x00aa
            L_0x00a9:
                r15 = 0
            L_0x00aa:
                byte[] r10 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
                r17 = r2
                te3.l40 r2 = r8.f181335C
                r18 = r2
                te3.s90 r2 = r8.mo88747k()
                if (r2 == 0) goto L_0x00d2
                te3.l40 r2 = r2.f141381e
                if (r2 == 0) goto L_0x00d2
                java.lang.String r2 = r2.f184031d
                if (r2 == 0) goto L_0x00d2
                int r2 = r2.length()
                r19 = r3
                if (r2 <= 0) goto L_0x00cc
                r2 = 1
                goto L_0x00cd
            L_0x00cc:
                r2 = 0
            L_0x00cd:
                r3 = 1
                if (r2 != r3) goto L_0x00d4
                r2 = 1
                goto L_0x00d5
            L_0x00d2:
                r19 = r3
            L_0x00d4:
                r2 = 0
            L_0x00d5:
                if (r2 == 0) goto L_0x00e2
                te3.s90 r2 = r8.mo88747k()
                if (r2 == 0) goto L_0x00e0
                te3.l40 r2 = r2.f141381e
                goto L_0x00e4
            L_0x00e0:
                r2 = 0
                goto L_0x00e4
            L_0x00e2:
                r2 = r18
            L_0x00e4:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r18 = r4
                java.lang.String r4 = "[getPayloadForProductItemClick] appId:"
                r3.append(r4)
                if (r2 == 0) goto L_0x00f5
                java.lang.String r4 = r2.f184031d
                goto L_0x00f6
            L_0x00f5:
                r4 = 0
            L_0x00f6:
                r3.append(r4)
                java.lang.String r4 = ", path:"
                r3.append(r4)
                if (r2 == 0) goto L_0x0103
                java.lang.String r4 = r2.f184032e
                goto L_0x0104
            L_0x0103:
                r4 = 0
            L_0x0104:
                r3.append(r4)
                java.lang.String r4 = ", isThirdParty:"
                r3.append(r4)
                r3.append(r15)
                java.lang.String r4 = ", clickId:"
                r3.append(r4)
                r3.append(r10)
                r4 = 33
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
                di0.o r3 = new di0.o
                r3.<init>()
                java.lang.String r4 = ""
                if (r2 == 0) goto L_0x0130
                java.lang.String r15 = r2.f184031d
                if (r15 != 0) goto L_0x0131
            L_0x0130:
                r15 = r4
            L_0x0131:
                r3.f250930b = r15
                if (r2 == 0) goto L_0x0139
                java.lang.String r15 = r2.f184032e
                if (r15 != 0) goto L_0x013a
            L_0x0139:
                r15 = r4
            L_0x013a:
                r3.f250934f = r15
                boolean r15 = r14.mo87027N0()
                r71 = r5
                java.lang.String r5 = "::"
                if (r15 == 0) goto L_0x01ce
                r15 = 1176(0x498, float:1.648E-42)
                r3.f250939k = r15
                androidx.lifecycle.i0 r15 = r9.mo71262a(r7)
                cl1.u r15 = (cl1.C55001u) r15
                te3.c21 r15 = r15.f154420q
                r20 = r7
                long r6 = r15.f182392d
                r22 = 0
                int r15 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
                if (r15 != 0) goto L_0x015f
                java.lang.String r6 = "pre_live_detail"
                goto L_0x0161
            L_0x015f:
                java.lang.String r6 = "post_live_detail"
            L_0x0161:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                r15 = 58
                r7.append(r15)
                r15 = r20
                androidx.lifecycle.i0 r20 = r9.mo71262a(r15)
                r22 = r6
                r6 = r20
                cl1.u r6 = (cl1.C55001u) r6
                te3.c21 r6 = r6.f154420q
                r20 = r0
                r23 = r1
                long r0 = r6.f182392d
                r7.append(r0)
                r0 = 58
                r7.append(r0)
                androidx.lifecycle.i0 r1 = r9.mo71262a(r12)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154345o
                r7.append(r1)
                r7.append(r5)
                androidx.lifecycle.i0 r1 = r9.mo71262a(r12)
                cl1.o r1 = (cl1.C54991o) r1
                long r5 = r1.f154325i1
                r7.append(r5)
                r7.append(r0)
                r7.append(r10)
                r7.append(r0)
                androidx.lifecycle.i0 r1 = r9.mo71262a(r12)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154318g2
                r7.append(r1)
                r7.append(r0)
                androidx.lifecycle.i0 r0 = r9.mo71262a(r12)
                cl1.o r0 = (cl1.C54991o) r0
                java.lang.String r0 = r0.f154203G1
                r7.append(r0)
                java.lang.String r0 = r7.toString()
                r3.f250940l = r0
                r32 = r22
                goto L_0x023b
            L_0x01ce:
                r20 = r0
                r23 = r1
                r15 = r7
                r0 = 1177(0x499, float:1.65E-42)
                r3.f250939k = r0
                java.lang.String r6 = "live_list_detail"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r1 = 58
                r0.append(r1)
                androidx.lifecycle.i0 r7 = r9.mo71262a(r15)
                cl1.u r7 = (cl1.C55001u) r7
                te3.c21 r7 = r7.f154420q
                r21 = r6
                long r6 = r7.f182392d
                r0.append(r6)
                r0.append(r1)
                androidx.lifecycle.i0 r6 = r9.mo71262a(r12)
                cl1.o r6 = (cl1.C54991o) r6
                java.lang.String r6 = r6.f154345o
                r0.append(r6)
                r0.append(r5)
                androidx.lifecycle.i0 r5 = r9.mo71262a(r12)
                cl1.o r5 = (cl1.C54991o) r5
                long r5 = r5.f154325i1
                r0.append(r5)
                r0.append(r1)
                r0.append(r10)
                r0.append(r1)
                androidx.lifecycle.i0 r5 = r9.mo71262a(r12)
                cl1.o r5 = (cl1.C54991o) r5
                java.lang.String r5 = r5.f154318g2
                r0.append(r5)
                r0.append(r1)
                androidx.lifecycle.i0 r1 = r9.mo71262a(r12)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154203G1
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.f250940l = r0
                r32 = r21
            L_0x023b:
                if (r2 == 0) goto L_0x0244
                int r0 = r2.f184036i
                r1 = 1
                if (r0 != r1) goto L_0x0244
                r0 = 1
                goto L_0x0245
            L_0x0244:
                r0 = 0
            L_0x0245:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r5 = "showNavigationBar:"
                r1.append(r5)
                r1.append(r0)
                java.lang.String r5 = " showDragBar:"
                r1.append(r5)
                if (r2 == 0) goto L_0x0261
                int r5 = r2.f184037j
                r6 = 1
                if (r5 != r6) goto L_0x0261
                r5 = 1
                goto L_0x0262
            L_0x0261:
                r5 = 0
            L_0x0262:
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
                int r1 = r1.y
                float r1 = (float) r1
                android.content.res.Resources r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                android.content.res.Configuration r5 = r5.getConfiguration()
                int r5 = r5.orientation
                r6 = 2
                if (r5 != r6) goto L_0x028f
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
                int r1 = r1.x
                float r1 = (float) r1
            L_0x028f:
                gg1.a r5 = gg1.C32444a.f86121a
                int r5 = r5.mo58621b()
                float r5 = (float) r5
                r6 = 1120403456(0x42c80000, float:100.0)
                float r5 = r5 / r6
                float r5 = r5 * r1
                int r1 = (int) r5
                android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r5 = r5.getResources()
                r6 = 2131165339(0x7f07009b, float:1.7944892E38)
                float r5 = r5.getDimension(r6)
                int r5 = (int) r5
                int r35 = r1 + r5
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r36 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.POPUP
                if (r0 == 0) goto L_0x02b5
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r1 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.SINGLE_CLOSE
                goto L_0x02b7
            L_0x02b5:
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r1 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.HIDE
            L_0x02b7:
                r41 = r1
                r65 = r0 ^ 1
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f r45 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55456f.NORMAL
                r1 = r20
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r59 = r1.mo83713i(r2)
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                float r1 = r1.getDimension(r6)
                int r1 = (int) r1
                if (r2 == 0) goto L_0x02da
                int r5 = r2.f184037j
                r6 = 1
                if (r5 != r6) goto L_0x02da
                r61 = 1
                goto L_0x02dc
            L_0x02da:
                r61 = 0
            L_0x02dc:
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r5 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
                r33 = r5
                r34 = 1
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r42 = 0
                r44 = 0
                r47 = 0
                r48 = 0
                r49 = 0
                r50 = 0
                r51 = 0
                r52 = 0
                r53 = 0
                r54 = 0
                r55 = 0
                r56 = 0
                r57 = 0
                r58 = 0
                r62 = 1
                r63 = 0
                r64 = 0
                r66 = 0
                r67 = 1644160376(0x61ffe578, float:5.9005684E20)
                r68 = 1
                r69 = 0
                r43 = r0
                r46 = r65
                r60 = r1
                r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
                r3.f250912A = r5
                java.lang.Class<ak1.o> r0 = ak1.C54108o.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ak1.o r0 = (ak1.C54108o) r0
                r0.getClass()
                ak1.f0 r0 = ak1.C54108o.f151869h
                java.lang.String r1 = r3.f250940l
                java.lang.String r5 = "sceneNote"
                gy3.C87412m.m108593f(r1, r5)
                r0.getClass()
                r0.f151475s = r1
                cj1.l6 r0 = new cj1.l6
                r0.<init>()
                java.lang.String r1 = r8.f181339G
                if (r1 != 0) goto L_0x0343
                r1 = r4
            L_0x0343:
                r0.f153583d = r1
                long r5 = r8.f181347t
                r0.f153584e = r5
                r0.f153587h = r4
                r1 = 1
                r0.f153591o = r1
                r0.f153592p = r10
                if (r2 == 0) goto L_0x0357
                int r2 = r2.f184037j
                if (r2 != r1) goto L_0x0357
                goto L_0x0358
            L_0x0357:
                r1 = 0
            L_0x0358:
                r0.f153590n = r1
                boolean r1 = r14.mo87027N0()
                if (r1 == 0) goto L_0x036b
                t91.c$a r1 = t91.C64208c.f181951a
                byte[] r1 = r0.f153592p
                java.lang.String r1 = java.lang.String.valueOf(r1)
                t91.C64208c.f181967q = r1
                goto L_0x03a4
            L_0x036b:
                t91.c$a r20 = t91.C64208c.f181951a
                byte[] r1 = r0.f153592p
                java.lang.String r21 = java.lang.String.valueOf(r1)
                java.lang.String r1 = r3.f250930b
                di3.d r2 = di3.C86312j.m106911c(r23)
                kq.h r2 = (p185kq.C10383h) r2
                androidx.lifecycle.i0 r4 = r9.mo71262a(r15)
                cl1.u r4 = (cl1.C55001u) r4
                te3.c21 r4 = r4.f154420q
                long r4 = r4.f182392d
                java.lang.String r2 = r2.mo10700XQ(r4)
                di3.d r4 = di3.C86312j.m106911c(r23)
                kq.h r4 = (p185kq.C10383h) r4
                androidx.lifecycle.i0 r5 = r9.mo71262a(r12)
                cl1.o r5 = (cl1.C54991o) r5
                long r5 = r5.f154325i1
                java.lang.String r25 = r4.mo10700XQ(r5)
                java.lang.String r24 = ""
                r22 = r1
                r23 = r2
                r20.mo89033h(r21, r22, r23, r24, r25)
            L_0x03a4:
                r3.f250937i = r0
                java.lang.Class<ht1.f4> r0 = ht1.C60169f4.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                r24 = r0
                ht1.f4 r24 = (ht1.C60169f4) r24
                r25 = 3
                java.lang.String r0 = r3.f250930b
                java.lang.String r1 = "bundle.appId"
                gy3.C87412m.m108593f(r0, r1)
                java.lang.String r28 = r10.toString()
                r29 = 1176(0x498, double:5.81E-321)
                androidx.lifecycle.i0 r1 = r9.mo71262a(r12)
                cl1.o r1 = (cl1.C54991o) r1
                long r1 = r1.f154325i1
                java.lang.String r31 = java.lang.String.valueOf(r1)
                androidx.lifecycle.i0 r1 = r9.mo71262a(r12)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154318g2
                r27 = r0
                r33 = r1
                r24.uv0(r25, r27, r28, r29, r31, r32, r33)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r11.invoke(r0, r3)
            L_0x03df:
                r0 = r70
                r4 = r71
                r1 = r17
                r3 = r18
                r2 = r19
                goto L_0x03f0
            L_0x03ea:
                r0 = r70
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
            L_0x03f0:
                j20.C117292a.m165361g(r0, r4, r3, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.C62094i.onClick(android.view.View):void");
        }
    }

    /* renamed from: op1.h$j */
    public static final class C62096j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62084h f176587d;

        /* renamed from: e */
        public final /* synthetic */ int f176588e;

        /* renamed from: f */
        public final /* synthetic */ C62438f f176589f;

        public C62096j(C62084h hVar, int i, C62438f fVar) {
            this.f176587d = hVar;
            this.f176588e = i;
            this.f176589f = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
            r5 = r5.f154113E;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
                r18 = this;
                r6 = r18
                java.lang.Class<cl1.h1> r7 = cl1.C54979h1.class
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r19
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$2"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r18
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                er1.j4 r0 = er1.C58739j4.f168176a
                boolean r0 = r0.mo83683L()
                java.lang.String r1 = "(Landroid/view/View;)V"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "android/view/View$OnClickListener"
                java.lang.String r4 = "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$2"
                if (r0 == 0) goto L_0x0036
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            L_0x0036:
                op1.h r0 = r6.f176587d
                int r5 = r6.f176588e
                cm1.i2 r0 = r0.mo87156S5(r5)
                boolean r0 = r0 instanceof sk1.C63965x
                if (r0 == 0) goto L_0x0084
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r5 = r0.mo77630e(r7)
                cl1.h1 r5 = (cl1.C54979h1) r5
                r8 = 0
                if (r5 == 0) goto L_0x0057
                te3.gj1 r5 = r5.f154113E
                if (r5 == 0) goto L_0x0057
                int r5 = r5.f183344e
                if (r5 != 0) goto L_0x0057
                r5 = 1
                goto L_0x0058
            L_0x0057:
                r5 = 0
            L_0x0058:
                if (r5 == 0) goto L_0x0084
                java.lang.Class<ak1.o> r5 = ak1.C54108o.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                java.lang.String r9 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r5, r9)
                r10 = r5
                ak1.o r10 = (ak1.C54108o) r10
                r11 = 4
                androidx.lifecycle.i0 r0 = r0.mo77630e(r7)
                cl1.h1 r0 = (cl1.C54979h1) r0
                if (r0 == 0) goto L_0x0079
                te3.gj1 r0 = r0.f154113E
                if (r0 == 0) goto L_0x0079
                int r8 = r0.f183344e
                r12 = r8
                goto L_0x007a
            L_0x0079:
                r12 = 0
            L_0x007a:
                r13 = 0
                r15 = 0
                r16 = 12
                r17 = 0
                ak1.C54108o.Ux0(r10, r11, r12, r13, r15, r16, r17)
            L_0x0084:
                op1.h r0 = r6.f176587d
                pp1.f r5 = r6.f176589f
                int r7 = r6.f176588e
                op1.C62084h.m72973N5(r0, r5, r7)
                j20.C117292a.m165361g(r6, r4, r3, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.C62096j.onClick(android.view.View):void");
        }
    }

    /* renamed from: op1.h$k */
    public static final class C62097k implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62084h f176590d;

        /* renamed from: e */
        public final /* synthetic */ C62438f f176591e;

        /* renamed from: f */
        public final /* synthetic */ int f176592f;

        public C62097k(C62084h hVar, C62438f fVar, int i) {
            this.f176590d = hVar;
            this.f176591e = fVar;
            this.f176592f = i;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C32228q<? super C62438f, ? super View, ? super Integer, C13598b0> qVar = this.f176590d.f176546w;
            if (qVar != null) {
                C62438f fVar = this.f176591e;
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                qVar.invoke(fVar, view, Integer.valueOf(this.f176592f));
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingListAdapter$setProductOnClickListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: op1.h$l */
    public static final class C62098l extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C62084h f176593a;

        public C62098l(C62084h hVar) {
            this.f176593a = hVar;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C62084h hVar = this.f176593a;
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
                hVar.mo87161X5(((Integer) tag).intValue());
            }
        }
    }

    /* renamed from: op1.h$m */
    public static final class C62099m extends C87413o implements C32226l<C0740i2, Boolean> {

        /* renamed from: d */
        public static final C62099m f176594d = new C62099m();

        public C62099m() {
            super(1);
        }

        public Object invoke(Object obj) {
            C0740i2 i2Var = (C0740i2) obj;
            C87412m.m108594g(i2Var, "item");
            return Boolean.valueOf((i2Var instanceof C63965x) || (i2Var instanceof C63964u));
        }
    }

    /* renamed from: op1.h$n */
    public static final class C62100n extends C87413o implements C32226l<C0740i2, Boolean> {

        /* renamed from: d */
        public static final C62100n f176595d = new C62100n();

        public C62100n() {
            super(1);
        }

        public Object invoke(Object obj) {
            C0740i2 i2Var = (C0740i2) obj;
            C87412m.m108594g(i2Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(i2Var instanceof C48416t);
        }
    }

    /* renamed from: op1.h$o */
    public static final class C62101o extends C87413o implements C32226l<C0740i2, Boolean> {

        /* renamed from: d */
        public static final C62101o f176596d = new C62101o();

        public C62101o() {
            super(1);
        }

        public Object invoke(Object obj) {
            C0740i2 i2Var = (C0740i2) obj;
            C87412m.m108594g(i2Var, "rvFeed");
            return Boolean.valueOf(i2Var instanceof C13696v);
        }
    }

    public C62084h(Context context, boolean z, C45795b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        this.f176531e = context;
        this.f176532f = z;
        this.f176533g = bVar;
        FinderLiveShoppingPriceView.C3617a aVar = FinderLiveShoppingPriceView.f160994j;
        this.f176540q = FinderLiveShoppingPriceView.f160997p;
        this.f176541r = C36568h.m40985a(new C62088d(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x05e3, code lost:
        if ((r5.length() > 0) == true) goto L_0x05e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05a9  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e6  */
    /* renamed from: N5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m72973N5(op1.C62084h r60, pp1.C62438f r61, int r62) {
        /*
            r0 = r60
            r1 = r61
            r2 = r62
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            cm1.i2 r4 = r0.mo87156S5(r2)
            if (r4 != 0) goto L_0x0010
            goto L_0x0658
        L_0x0010:
            android.widget.TextView r5 = r61.mo87490G()
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.TextView"
            gy3.C87412m.m108592e(r5, r6)
            op1.h$a r6 = f176530A
            boolean r6 = r6.mo87168a()
            java.lang.String r7 = "Finder.LiveShoppingListAdapter"
            r8 = 2
            r10 = 1
            if (r6 == 0) goto L_0x009a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.CharSequence r6 = r5.getText()
            r3.append(r6)
            java.lang.String r6 = " pos:"
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = ",appId:"
            r3.append(r6)
            boolean r6 = r4 instanceof sk1.C63965x
            if (r6 == 0) goto L_0x0045
            sk1.x r4 = (sk1.C63965x) r4
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 == 0) goto L_0x004b
            java.lang.String r9 = r4.f181348u
            goto L_0x004c
        L_0x004b:
            r9 = 0
        L_0x004c:
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            java.lang.CharSequence r3 = r5.getText()
            java.lang.String r3 = r3.toString()
            android.content.Context r4 = r5.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131828849(0x7f112071, float:1.929065E38)
            java.lang.String r4 = r4.getString(r6)
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x0078
            r0.mo87159V5(r1, r2, r10)
            goto L_0x0658
        L_0x0078:
            java.lang.CharSequence r3 = r5.getText()
            java.lang.String r3 = r3.toString()
            android.content.Context r4 = r5.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131828850(0x7f112072, float:1.9290653E38)
            java.lang.String r4 = r4.getString(r5)
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x0658
            r0.mo87159V5(r1, r2, r8)
            goto L_0x0658
        L_0x009a:
            boolean r5 = r4 instanceof sk1.C63965x
            java.lang.String r6 = ""
            if (r5 == 0) goto L_0x04da
            r1 = r4
            sk1.x r1 = (sk1.C63965x) r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "buy pos:"
            r5.append(r12)
            r5.append(r2)
            java.lang.String r2 = ",buy appId:"
            r5.append(r2)
            te3.l40 r2 = r1.f181335C
            if (r2 == 0) goto L_0x00bc
            java.lang.String r2 = r2.f184031d
            goto L_0x00bd
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            r5.append(r2)
            java.lang.String r2 = ",buy path:"
            r5.append(r2)
            te3.l40 r2 = r1.f181335C
            if (r2 == 0) goto L_0x00cc
            java.lang.String r2 = r2.f184032e
            goto L_0x00cd
        L_0x00cc:
            r2 = 0
        L_0x00cd:
            r5.append(r2)
            java.lang.String r2 = ",detail appId:"
            r5.append(r2)
            te3.l40 r2 = r1.f181334B
            if (r2 == 0) goto L_0x00dc
            java.lang.String r2 = r2.f184031d
            goto L_0x00dd
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            r5.append(r2)
            java.lang.String r2 = ", detail path:"
            r5.append(r2)
            te3.l40 r2 = r1.f181334B
            if (r2 == 0) goto L_0x00ec
            java.lang.String r2 = r2.f184032e
            goto L_0x00ed
        L_0x00ec:
            r2 = 0
        L_0x00ed:
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            np1.v r2 = np1.C61881v.f175961a
            fj1.b r5 = r0.f176533g
            op1.a0 r7 = new op1.a0
            r7.<init>(r4, r0)
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            java.lang.Class<kq.h> r12 = p185kq.C10383h.class
            java.lang.Class<cl1.u> r13 = cl1.C55001u.class
            java.lang.String r14 = "liveData"
            gy3.C87412m.m108594g(r5, r14)
            java.lang.String r14 = "FinderLive.MiniProgramPayloadHelper"
            ok1.e r15 = ok1.C62042e.f176370a
            int r9 = r1.f181337E
            r15.getClass()
            if (r9 <= 0) goto L_0x011a
            r9 = 1
            goto L_0x011b
        L_0x011a:
            r9 = 0
        L_0x011b:
            byte[] r15 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
            te3.s90 r11 = r1.mo88747k()
            if (r11 == 0) goto L_0x013a
            te3.l40 r11 = r11.f141381e
            if (r11 == 0) goto L_0x013a
            java.lang.String r11 = r11.f184031d
            if (r11 == 0) goto L_0x013a
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0135
            r11 = 1
            goto L_0x0136
        L_0x0135:
            r11 = 0
        L_0x0136:
            if (r11 != r10) goto L_0x013a
            r11 = 1
            goto L_0x013b
        L_0x013a:
            r11 = 0
        L_0x013b:
            if (r11 == 0) goto L_0x0165
            te3.s90 r11 = r1.mo88747k()
            if (r11 == 0) goto L_0x0146
            te3.l40 r11 = r11.f141381e
            goto L_0x0147
        L_0x0146:
            r11 = 0
        L_0x0147:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r8 = "[getPayloadForProductBuyClick] use exclusive page "
            r10.append(r8)
            if (r11 != 0) goto L_0x0155
            r8 = r6
            goto L_0x0156
        L_0x0155:
            r8 = r11
        L_0x0156:
            org.json.JSONObject r8 = o40.C61937h.m72709h(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)
            goto L_0x0166
        L_0x0165:
            r11 = 0
        L_0x0166:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "[getPayloadForProductBuyClick] appId:"
            r8.append(r10)
            te3.l40 r10 = r1.f181335C
            if (r10 == 0) goto L_0x0177
            java.lang.String r10 = r10.f184031d
            goto L_0x0178
        L_0x0177:
            r10 = 0
        L_0x0178:
            r8.append(r10)
            java.lang.String r10 = ",purchase appId:"
            r8.append(r10)
            te3.l40 r10 = r1.f181334B
            if (r10 == 0) goto L_0x0187
            java.lang.String r10 = r10.f184031d
            goto L_0x0188
        L_0x0187:
            r10 = 0
        L_0x0188:
            r8.append(r10)
            java.lang.String r10 = ", isThirdParty:"
            r8.append(r10)
            r8.append(r9)
            java.lang.String r10 = ", clickId:"
            r8.append(r10)
            r8.append(r15)
            r10 = 33
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)
            if (r11 != 0) goto L_0x01ac
            te3.l40 r8 = r1.f181334B
            goto L_0x01ad
        L_0x01ac:
            r8 = r11
        L_0x01ad:
            if (r8 == 0) goto L_0x01d8
            java.lang.String r10 = r8.f184031d
            if (r10 == 0) goto L_0x01d8
            androidx.lifecycle.i0 r14 = r5.mo71262a(r4)
            cl1.h1 r14 = (cl1.C54979h1) r14
            java.util.HashMap<java.lang.String, java.lang.String> r14 = r14.f154124Q
            r61 = r7
            java.lang.String r7 = r8.f184033f
            if (r7 != 0) goto L_0x01c2
            r7 = r6
        L_0x01c2:
            r14.put(r10, r7)
            androidx.lifecycle.i0 r4 = r5.mo71262a(r4)
            cl1.h1 r4 = (cl1.C54979h1) r4
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r4.f154125R
            java.lang.String r7 = r8.f184034g
            if (r7 != 0) goto L_0x01d2
            r7 = r6
        L_0x01d2:
            r4.put(r10, r7)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x01da
        L_0x01d8:
            r61 = r7
        L_0x01da:
            java.lang.String r4 = "sceneNote"
            java.lang.String r7 = "::"
            java.lang.String r10 = "live_list_buy:"
            java.lang.String r14 = "push"
            r60 = r12
            if (r9 == 0) goto L_0x035b
            di0.o r9 = new di0.o
            r9.<init>()
            cj1.l6 r12 = new cj1.l6
            r12.<init>()
            r21 = r8
            java.lang.String r8 = r1.f181339G
            if (r8 != 0) goto L_0x01f7
            r8 = r6
        L_0x01f7:
            r12.f153583d = r8
            r22 = r7
            long r7 = r1.f181347t
            r12.f153584e = r7
            r12.f153587h = r6
            r12.f153586g = r14
            r7 = 2
            r12.f153591o = r7
            r12.f153592p = r15
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r9.f250937i = r12
            if (r11 == 0) goto L_0x0213
            java.lang.String r7 = r11.f184031d
            if (r7 != 0) goto L_0x021c
            goto L_0x021b
        L_0x0213:
            te3.l40 r7 = r1.f181334B
            if (r7 == 0) goto L_0x021b
            java.lang.String r7 = r7.f184031d
            if (r7 != 0) goto L_0x021c
        L_0x021b:
            r7 = r6
        L_0x021c:
            r9.f250930b = r7
            if (r11 == 0) goto L_0x0227
            java.lang.String r7 = r11.f184032e
            if (r7 != 0) goto L_0x0225
            goto L_0x022f
        L_0x0225:
            r6 = r7
            goto L_0x022f
        L_0x0227:
            te3.l40 r7 = r1.f181334B
            if (r7 == 0) goto L_0x022f
            java.lang.String r7 = r7.f184032e
            if (r7 != 0) goto L_0x0225
        L_0x022f:
            r9.f250934f = r6
            r6 = 1177(0x499, float:1.65E-42)
            r9.f250939k = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            androidx.lifecycle.i0 r7 = r5.mo71262a(r13)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r7 = r7.f182392d
            r6.append(r7)
            r7 = 58
            r6.append(r7)
            androidx.lifecycle.i0 r8 = r5.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            java.lang.String r8 = r8.f154345o
            r6.append(r8)
            r8 = r22
            r6.append(r8)
            androidx.lifecycle.i0 r8 = r5.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            long r10 = r8.f154325i1
            r6.append(r10)
            r6.append(r7)
            r6.append(r15)
            r6.append(r7)
            androidx.lifecycle.i0 r8 = r5.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            java.lang.String r8 = r8.f154318g2
            r6.append(r8)
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r5.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.f154203G1
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r9.f250940l = r6
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            java.lang.String r6 = r9.f250940l
            gy3.C87412m.m108593f(r6, r4)
            r0.getClass()
            r0.f151475s = r6
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
            r23 = 1
            int r24 = r2.mo86812d()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r25 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.POPUP
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r30 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.SINGLE_CLOSE
            r31 = 0
            r32 = 1
            r33 = 0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f r34 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55456f.NORMAL
            te3.l40 r1 = r1.f181334B
            if (r1 == 0) goto L_0x02cf
            int r1 = r1.f184036i
            r2 = 1
            if (r1 != r2) goto L_0x02cf
            r35 = 1
            goto L_0x02d1
        L_0x02cf:
            r35 = 0
        L_0x02d1:
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            er1.j4 r1 = er1.C58739j4.f168176a
            r7 = r21
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r48 = r1.mo83713i(r7)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165339(0x7f07009b, float:1.7944892E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            r49 = r1
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = -100670088(0xfffffffff9ffe578, float:-1.6608623E35)
            r57 = 1
            r58 = 0
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r9.f250912A = r0
            t91.c$a r16 = t91.C64208c.f181951a
            java.lang.String r17 = r15.toString()
            java.lang.String r0 = r9.f250930b
            di3.d r1 = di3.C86312j.m106911c(r60)
            kq.h r1 = (p185kq.C10383h) r1
            androidx.lifecycle.i0 r2 = r5.mo71262a(r13)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r6 = r2.f182392d
            java.lang.String r19 = r1.mo10700XQ(r6)
            di3.d r1 = di3.C86312j.m106911c(r60)
            kq.h r1 = (p185kq.C10383h) r1
            androidx.lifecycle.i0 r2 = r5.mo71262a(r3)
            cl1.o r2 = (cl1.C54991o) r2
            long r2 = r2.f154325i1
            java.lang.String r21 = r1.mo10700XQ(r2)
            java.lang.String r20 = ""
            r18 = r0
            r16.mo89033h(r17, r18, r19, r20, r21)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r12 = r61
            r12.invoke(r0, r9)
            goto L_0x0658
        L_0x035b:
            r12 = r61
            r59 = r8
            r8 = r7
            r7 = r59
            di0.o r9 = new di0.o
            r9.<init>()
            cj1.l6 r12 = new cj1.l6
            r12.<init>()
            r21 = r7
            java.lang.String r7 = r1.f181339G
            if (r7 != 0) goto L_0x0373
            r7 = r6
        L_0x0373:
            r12.f153583d = r7
            r22 = r8
            long r7 = r1.f181347t
            r12.f153584e = r7
            r12.f153587h = r6
            r12.f153586g = r14
            r7 = 2
            r12.f153591o = r7
            r12.f153592p = r15
            r8 = 0
            r12.f153594r = r8
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r9.f250937i = r12
            if (r11 == 0) goto L_0x0392
            java.lang.String r7 = r11.f184031d
            if (r7 != 0) goto L_0x039b
            goto L_0x039a
        L_0x0392:
            te3.l40 r7 = r1.f181334B
            if (r7 == 0) goto L_0x039a
            java.lang.String r7 = r7.f184031d
            if (r7 != 0) goto L_0x039b
        L_0x039a:
            r7 = r6
        L_0x039b:
            r9.f250930b = r7
            if (r11 == 0) goto L_0x03a6
            java.lang.String r7 = r11.f184032e
            if (r7 != 0) goto L_0x03a4
            goto L_0x03ae
        L_0x03a4:
            r6 = r7
            goto L_0x03ae
        L_0x03a6:
            te3.l40 r7 = r1.f181334B
            if (r7 == 0) goto L_0x03ae
            java.lang.String r7 = r7.f184032e
            if (r7 != 0) goto L_0x03a4
        L_0x03ae:
            r9.f250934f = r6
            r6 = 1177(0x499, float:1.65E-42)
            r9.f250939k = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            androidx.lifecycle.i0 r7 = r5.mo71262a(r13)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r10 = r7.f182392d
            r6.append(r10)
            r7 = 58
            r6.append(r7)
            androidx.lifecycle.i0 r10 = r5.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154345o
            r6.append(r10)
            r10 = r22
            r6.append(r10)
            androidx.lifecycle.i0 r10 = r5.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            long r10 = r10.f154325i1
            r6.append(r10)
            r6.append(r7)
            r6.append(r15)
            r6.append(r7)
            androidx.lifecycle.i0 r10 = r5.mo71262a(r3)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154318g2
            r6.append(r10)
            r6.append(r7)
            androidx.lifecycle.i0 r7 = r5.mo71262a(r3)
            cl1.o r7 = (cl1.C54991o) r7
            java.lang.String r7 = r7.f154203G1
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r9.f250940l = r6
            di3.d r0 = di3.C86312j.m106911c(r0)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            java.lang.String r6 = r9.f250940l
            gy3.C87412m.m108593f(r6, r4)
            r0.getClass()
            r0.f151475s = r6
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig
            r23 = 1
            int r24 = r2.mo86812d()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$a r25 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55451a.SLIDE
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$c r30 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55453c.HIDE
            r31 = 0
            r32 = 0
            r33 = 0
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$f r34 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55456f.FAKE_NATIVE
            te3.l40 r1 = r1.f181334B
            if (r1 == 0) goto L_0x044e
            int r1 = r1.f184036i
            r2 = 1
            if (r1 != r2) goto L_0x044e
            r35 = 1
            goto L_0x0450
        L_0x044e:
            r35 = 0
        L_0x0450:
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            er1.j4 r1 = er1.C58739j4.f168176a
            r8 = r21
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$CustomSubjectInfo r48 = r1.mo83713i(r8)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165339(0x7f07009b, float:1.7944892E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            r49 = r1
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = -100670088(0xfffffffff9ffe578, float:-1.6608623E35)
            r57 = 1
            r58 = 0
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r9.f250912A = r0
            t91.c$a r16 = t91.C64208c.f181951a
            java.lang.String r17 = r15.toString()
            java.lang.String r0 = r9.f250930b
            di3.d r1 = di3.C86312j.m106911c(r60)
            kq.h r1 = (p185kq.C10383h) r1
            androidx.lifecycle.i0 r2 = r5.mo71262a(r13)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r6 = r2.f182392d
            java.lang.String r19 = r1.mo10700XQ(r6)
            di3.d r1 = di3.C86312j.m106911c(r60)
            kq.h r1 = (p185kq.C10383h) r1
            androidx.lifecycle.i0 r2 = r5.mo71262a(r3)
            cl1.o r2 = (cl1.C54991o) r2
            long r2 = r2.f154325i1
            java.lang.String r21 = r1.mo10700XQ(r2)
            java.lang.String r20 = ""
            r18 = r0
            r16.mo89033h(r17, r18, r19, r20, r21)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r61
            r1.invoke(r0, r9)
            goto L_0x0658
        L_0x04da:
            r8 = 0
            boolean r2 = r4 instanceof sk1.C63964u
            if (r2 == 0) goto L_0x0658
            sk1.u r4 = (sk1.C63964u) r4
            te3.p2 r2 = r4.f181327u
            if (r2 == 0) goto L_0x0658
            boolean r5 = r0.f176532f
            if (r5 != 0) goto L_0x052c
            java.lang.Class<ak1.w> r5 = ak1.C54116w.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r9 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r5, r9)
            r19 = r5
            ak1.w r19 = (ak1.C54116w) r19
            ak1.f0$r0 r20 = ak1.C54067f0.C54081r0.CommerceActionPurchaseButtonClick
            r21 = 0
            long r9 = r4.f181326t
            java.lang.String r22 = java.lang.String.valueOf(r9)
            te3.p2 r5 = r4.f181327u
            if (r5 == 0) goto L_0x050e
            java.lang.String r5 = r5.f184738g
            if (r5 != 0) goto L_0x050b
            goto L_0x050e
        L_0x050b:
            r23 = r5
            goto L_0x0510
        L_0x050e:
            r23 = r6
        L_0x0510:
            long r9 = r4.f181326t
            java.lang.String r24 = java.lang.String.valueOf(r9)
            java.lang.String r5 = r4.f181322B
            if (r5 != 0) goto L_0x051d
            r25 = r6
            goto L_0x051f
        L_0x051d:
            r25 = r5
        L_0x051f:
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 448(0x1c0, float:6.28E-43)
            r31 = 0
            ak1.C54116w.Rx0(r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
        L_0x052c:
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            re1.a r5 = up1.C37521f.f99548w5
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0562
            fj1.b r5 = r0.f176533g
            if (r5 == 0) goto L_0x054a
            androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
            cl1.o r5 = (cl1.C54991o) r5
            goto L_0x054b
        L_0x054a:
            r5 = 0
        L_0x054b:
            if (r5 != 0) goto L_0x054e
            goto L_0x0551
        L_0x054e:
            r9 = 0
            r5.f154357q3 = r9
        L_0x0551:
            fj1.b r5 = r0.f176533g
            if (r5 == 0) goto L_0x0562
            androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
            cl1.o r5 = (cl1.C54991o) r5
            java.util.HashMap<java.lang.Long, java.lang.String> r5 = r5.f154361r3
            if (r5 == 0) goto L_0x0562
            r5.clear()
        L_0x0562:
            fj1.b r5 = r0.f176533g
            androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.f154357q3
            if (r5 == 0) goto L_0x057c
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0576
            r5 = 1
            goto L_0x0577
        L_0x0576:
            r5 = 0
        L_0x0577:
            r9 = 1
            if (r5 != r9) goto L_0x057c
            r5 = 1
            goto L_0x057d
        L_0x057c:
            r5 = 0
        L_0x057d:
            if (r5 == 0) goto L_0x05a9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "get uxInfo from outsize:"
            r4.append(r5)
            fj1.b r5 = r0.f176533g
            androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.f154357q3
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            fj1.b r0 = r0.f176533g
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154357q3
            goto L_0x0644
        L_0x05a9:
            fj1.b r5 = r0.f176533g
            androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
            cl1.o r5 = (cl1.C54991o) r5
            java.util.HashMap<java.lang.Long, java.lang.String> r5 = r5.f154361r3
            long r9 = r4.f181326t
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r5 = r5.containsKey(r9)
            java.lang.String r9 = ",uxinfo:"
            if (r5 == 0) goto L_0x061e
            fj1.b r5 = r0.f176533g
            androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
            cl1.o r5 = (cl1.C54991o) r5
            java.util.HashMap<java.lang.Long, java.lang.String> r5 = r5.f154361r3
            long r10 = r4.f181326t
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r5 = r5.get(r10)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x05e6
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x05e1
            r5 = 1
            goto L_0x05e2
        L_0x05e1:
            r5 = 0
        L_0x05e2:
            r10 = 1
            if (r5 != r10) goto L_0x05e6
            goto L_0x05e7
        L_0x05e6:
            r10 = 0
        L_0x05e7:
            if (r10 == 0) goto L_0x061e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "get uxInfo from cgi-getShowShopSelf,adid:"
            r5.append(r8)
            long r10 = r4.f181326t
            r5.append(r10)
            r5.append(r9)
            java.lang.String r8 = r4.f181322B
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            fj1.b r0 = r0.f176533g
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.HashMap<java.lang.Long, java.lang.String> r0 = r0.f154361r3
            long r3 = r4.f181326t
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0644
        L_0x061e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "get uxInfo from promotingProduct,adid:"
            r0.append(r3)
            long r10 = r4.f181326t
            r0.append(r10)
            r0.append(r9)
            java.lang.String r3 = r4.f181322B
            if (r3 != 0) goto L_0x0635
            r3 = r6
        L_0x0635:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            java.lang.String r0 = r4.f181322B
            if (r0 != 0) goto L_0x0644
            r0 = r6
        L_0x0644:
            ok1.e r3 = ok1.C62042e.f176370a
            android.view.View r1 = r1.f44854d
            android.content.Context r1 = r1.getContext()
            java.lang.String r4 = "holder.itemView.context"
            gy3.C87412m.m108593f(r1, r4)
            if (r0 != 0) goto L_0x0654
            goto L_0x0655
        L_0x0654:
            r6 = r0
        L_0x0655:
            r3.mo87104o1(r1, r2, r6)
        L_0x0658:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.m72973N5(op1.h, pp1.f, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017f  */
    /* renamed from: u5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m72974u5(op1.C62084h r20, int r21, pp1.C62438f r22, ak1.C54067f0.C54081r0 r23) {
        /*
            r0 = r20
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            cm1.i2 r2 = r20.mo87156S5(r21)
            boolean r3 = r2 instanceof sk1.C63964u
            if (r3 == 0) goto L_0x0183
            sk1.u r2 = (sk1.C63964u) r2
            te3.p2 r3 = r2.f181327u
            if (r3 == 0) goto L_0x0183
            up1.f r4 = up1.C37521f.f99374d
            r4.getClass()
            re1.a r4 = up1.C37521f.f99548w5
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0048
            fj1.b r4 = r0.f176533g
            r5 = 0
            if (r4 == 0) goto L_0x0031
            androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
            cl1.o r4 = (cl1.C54991o) r4
            goto L_0x0032
        L_0x0031:
            r4 = r5
        L_0x0032:
            if (r4 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r4.f154357q3 = r5
        L_0x0037:
            fj1.b r4 = r0.f176533g
            if (r4 == 0) goto L_0x0048
            androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
            cl1.o r4 = (cl1.C54991o) r4
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r4.f154361r3
            if (r4 == 0) goto L_0x0048
            r4.clear()
        L_0x0048:
            boolean r4 = r0.f176532f
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x008a
            java.lang.Class<ak1.w> r4 = ak1.C54116w.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r6 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r4, r6)
            r7 = r4
            ak1.w r7 = (ak1.C54116w) r7
            r9 = 0
            long r10 = r2.f181326t
            java.lang.String r10 = java.lang.String.valueOf(r10)
            te3.p2 r4 = r2.f181327u
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = r4.f184738g
            if (r4 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r11 = r4
            goto L_0x006f
        L_0x006e:
            r11 = r5
        L_0x006f:
            long r12 = r2.f181326t
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r4 = r2.f181322B
            if (r4 != 0) goto L_0x007b
            r13 = r5
            goto L_0x007c
        L_0x007b:
            r13 = r4
        L_0x007c:
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 448(0x1c0, float:6.28E-43)
            r19 = 0
            r8 = r23
            ak1.C54116w.Rx0(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19)
        L_0x008a:
            fj1.b r4 = r0.f176533g
            androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154357q3
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x00a5
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x00a0
            r4 = 1
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            if (r4 != r7) goto L_0x00a5
            r4 = 1
            goto L_0x00a6
        L_0x00a5:
            r4 = 0
        L_0x00a6:
            java.lang.String r8 = "Finder.LiveShoppingListAdapter"
            if (r4 == 0) goto L_0x00d4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "get uxInfo from outsize:"
            r2.append(r4)
            fj1.b r4 = r0.f176533g
            androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154357q3
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            fj1.b r0 = r0.f176533g
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            cl1.o r0 = (cl1.C54991o) r0
            java.lang.String r0 = r0.f154357q3
            goto L_0x016d
        L_0x00d4:
            fj1.b r4 = r0.f176533g
            androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
            cl1.o r4 = (cl1.C54991o) r4
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r4.f154361r3
            long r9 = r2.f181326t
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r4 = r4.containsKey(r9)
            java.lang.String r9 = ",uxinfo:"
            if (r4 == 0) goto L_0x0147
            fj1.b r4 = r0.f176533g
            androidx.lifecycle.i0 r4 = r4.mo71262a(r1)
            cl1.o r4 = (cl1.C54991o) r4
            java.util.HashMap<java.lang.Long, java.lang.String> r4 = r4.f154361r3
            long r10 = r2.f181326t
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0110
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x010c
            r4 = 1
            goto L_0x010d
        L_0x010c:
            r4 = 0
        L_0x010d:
            if (r4 != r7) goto L_0x0110
            r6 = 1
        L_0x0110:
            if (r6 == 0) goto L_0x0147
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "get uxInfo from cgi-getShowShopSelf,adid:"
            r4.append(r6)
            long r6 = r2.f181326t
            r4.append(r6)
            r4.append(r9)
            java.lang.String r6 = r2.f181322B
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            fj1.b r0 = r0.f176533g
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            cl1.o r0 = (cl1.C54991o) r0
            java.util.HashMap<java.lang.Long, java.lang.String> r0 = r0.f154361r3
            long r1 = r2.f181326t
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x016d
        L_0x0147:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "get uxInfo from promotingProduct,adid:"
            r0.append(r1)
            long r6 = r2.f181326t
            r0.append(r6)
            r0.append(r9)
            java.lang.String r1 = r2.f181322B
            if (r1 != 0) goto L_0x015e
            r1 = r5
        L_0x015e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            java.lang.String r0 = r2.f181322B
            if (r0 != 0) goto L_0x016d
            r0 = r5
        L_0x016d:
            ok1.e r1 = ok1.C62042e.f176370a
            r2 = r22
            android.view.View r2 = r2.f44854d
            android.content.Context r2 = r2.getContext()
            java.lang.String r4 = "holder.itemView.context"
            gy3.C87412m.m108593f(r2, r4)
            if (r0 != 0) goto L_0x017f
            goto L_0x0180
        L_0x017f:
            r5 = r0
        L_0x0180:
            r1.mo87104o1(r2, r3, r5)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.m72974u5(op1.h, int, pp1.f, ak1.f0$r0):void");
    }

    /* renamed from: w5 */
    public static final void m72975w5(C62084h hVar, C50401mh0 mh02) {
        C62660c cVar;
        C54795n5 D0;
        hVar.getClass();
        Class cls = C55001u.class;
        Log.m105924i("Finder.LiveShoppingListAdapter", "modifyShelfProduct :scene:" + mh02.f138028d);
        C61817a aVar = hVar.f176542s;
        if (aVar != null && (cVar = aVar.f175776i) != null && (D0 = cVar.mo14476D0()) != null) {
            Context context = hVar.f176531e;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            D0.mo75737h((MMActivity) context, ((C55001u) hVar.f176533g.mo71262a(cls)).f154420q.f182392d, ((C55001u) hVar.f176533g.mo71262a(cls)).f154416j, ((C54991o) hVar.f176533g.mo71262a(C54991o.class)).f154345o, mh02, new C62111r(hVar, mh02));
        }
    }

    /* renamed from: y5 */
    public static final void m72976y5(C62084h hVar, int i) {
        hVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_ANCHOR_ACTION_COMMERCE, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    /* renamed from: F4 */
    public void mo10187F4(C9507n nVar, int i) {
        String str;
        String str2;
        FinderJumpInfo finderJumpInfo;
        String str3;
        String str4;
        C63964u uVar;
        C62438f fVar;
        C9507n nVar2 = nVar;
        int i2 = i;
        Class cls = C54979h1.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(nVar2, "holder");
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("Finder.LiveShoppingListAdapter", "onBindViewHolder pos:" + i2);
        if (mo87158U5()) {
            C63965x xVar = this.f176534h.get(i2);
            C87412m.m108593f(xVar, "canUseCouponGoodsList[position]");
            mo87152O5(xVar, (C62438f) nVar2, i2, true);
            return;
        }
        String str5 = "";
        if (getItemViewType(i2) == 2 && (nVar2 instanceof C62438f)) {
            int W5 = mo87160W5(i2, 2);
            C0740i2 i2Var = this.f176535i.get(W5);
            C87412m.m108593f(i2Var, "goodsAndAdList[goodsPos]");
            C0740i2 i2Var2 = i2Var;
            if (i2Var2 instanceof C63965x) {
                mo87152O5((C63965x) i2Var2, (C62438f) nVar2, W5, false);
            } else if (i2Var2 instanceof C63964u) {
                C63964u uVar2 = (C63964u) i2Var2;
                C62438f fVar2 = (C62438f) nVar2;
                Class cls3 = C11990s0.class;
                Class<C60200t1> cls4 = C60200t1.class;
                ((TextView) ((C36570n) fVar2.f177432F).getValue()).setVisibility(0);
                fVar2.mo87485B().setVisibility(8);
                fVar2.mo87488E().setVisibility(8);
                fVar2.mo87489F().setVisibility(8);
                Log.m105924i("Finder.LiveShoppingListAdapter", "bindAdItem " + uVar2.f181332z + ", " + uVar2.f181328v + ", " + uVar2.f181331y);
                C39818r rVar = C39818r.f106831a;
                C60979d<C100810g0> V = ((C11990s0) rVar.mo62446e(cls4).mo62447c(cls3)).mo11870V();
                C11984n0 n0Var = new C11984n0(uVar2.f181329w, C27696y.THUMB_IMAGE);
                ImageView imageView = (ImageView) ((C36570n) fVar2.f177427A).getValue();
                C87412m.m108593f(imageView, "holder.productImg");
                V.mo85957c(n0Var, imageView, ((C11990s0) rVar.mo62446e(cls4).mo62447c(cls3)).mo11867O2(C11978e0.C11979a.LIVE_SHOPPING_DEFAULT));
                fVar2.mo87488E().setText(str5);
                TextView textView = (TextView) ((C36570n) fVar2.f177432F).getValue();
                if (textView != null) {
                    textView.setText(uVar2.f181330x);
                }
                TextView C = fVar2.mo87486C();
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                Context context = MMApplicationContext.getContext();
                String str6 = uVar2.f181328v;
                if (str6 == null) {
                    str6 = str5;
                }
                C.setText(hVar.mo107057T1(context, str6));
                fVar2.mo87490G().setVisibility(0);
                if (((C55001u) this.f176533g.mo71262a(cls2)).f154420q.f182392d == 0) {
                    fVar2.mo87490G().setVisibility(8);
                    fVar = fVar2;
                    uVar = uVar2;
                } else if (!f176530A.mo87168a()) {
                    fVar = fVar2;
                    uVar = uVar2;
                    String str7 = uVar.f181331y;
                    mo87163Z5(false, false, str7 == null ? str5 : str7, fVar, W5);
                } else if (uVar2.f181321A == 1) {
                    String str8 = uVar2.f181331y;
                    fVar = fVar2;
                    uVar = uVar2;
                    mo87163Z5(true, true, str8 == null ? str5 : str8, fVar2, W5);
                } else {
                    fVar = fVar2;
                    uVar = uVar2;
                    String str9 = uVar.f181331y;
                    mo87163Z5(true, false, str9 == null ? str5 : str9, fVar, W5);
                }
                if (uVar.f181321A == 1) {
                    fVar.mo87492I(true, this.f176532f, (C64370fp1) null, this.f176533g);
                } else {
                    fVar.mo87492I(false, this.f176532f, (C64370fp1) null, this.f176533g);
                }
                mo87162Y5(fVar, W5);
            }
        } else if (getItemViewType(i2) == 3 && (nVar2 instanceof C62430c)) {
            C0740i2 i2Var3 = this.f176538o.get(mo87160W5(i2, 3));
            C87412m.m108592e(i2Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
            C13696v vVar = (C13696v) i2Var3;
            C62430c cVar = (C62430c) nVar2;
            FinderLiveShoppingCouponView finderLiveShoppingCouponView = cVar.f177410A;
            C62085a aVar = f176530A;
            finderLiveShoppingCouponView.mo3995b(vVar, aVar.mo87168a(), ((C55001u) this.f176533g.mo71262a(cls2)).f154420q.f182392d == 0);
            cVar.f44854d.getLayoutParams().height = C76577a.m92155f(this.f176531e, aVar.mo87168a() ? C0966R.dimen.a7y : C0966R.dimen.a7z);
        } else if (getItemViewType(i2) == 1 && (nVar2 instanceof C62431d)) {
            int size = this.f176535i.size() + this.f176536j.size();
            if (size == 0) {
                str4 = C76577a.m92166q(this.f176531e, C0966R.string.e8j);
            } else {
                Locale locale = Locale.getDefault();
                String q = C76577a.m92166q(this.f176531e, C0966R.string.e8k);
                C87412m.m108593f(q, "getString(context, R.str…_shopping_title_with_num)");
                String format = String.format(locale, q, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                C87412m.m108593f(format, "format(locale, format, *args)");
                str4 = format;
            }
            C62431d dVar = (C62431d) nVar2;
            C87412m.m108593f(str4, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C62431d.C62432a aVar2 = C62431d.C62432a.Goods;
            boolean z = !this.f176538o.isEmpty();
            boolean T5 = mo87157T5();
            LinkedList<C0740i2> linkedList = this.f176535i;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                if (next instanceof C63964u) {
                    arrayList.add(next);
                }
            }
            dVar.mo87480z(str4, aVar2, z, T5, !arrayList.isEmpty());
        } else if (getItemViewType(i2) == 0 && (nVar2 instanceof C62431d)) {
            int i3 = ((C54979h1) this.f176533g.mo71262a(cls)).f154146u;
            if (i3 == 0) {
                str3 = C76577a.m92166q(this.f176531e, C0966R.string.e7p);
            } else {
                Locale locale2 = Locale.getDefault();
                String q2 = C76577a.m92166q(this.f176531e, C0966R.string.e7q);
                C87412m.m108593f(q2, "getString(context, R.str…ng_coupon_title_with_num)");
                String format2 = String.format(locale2, q2, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                C87412m.m108593f(format2, "format(locale, format, *args)");
                str3 = format2;
            }
            C87412m.m108593f(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            ((C62431d) nVar2).mo87480z(str3, C62431d.C62432a.Coupon, !this.f176538o.isEmpty(), mo87157T5(), false);
        } else if (getItemViewType(i2) == 4 && (nVar2 instanceof C62424a)) {
            C62424a aVar3 = (C62424a) nVar2;
            String str10 = ((C54979h1) this.f176533g.mo71262a(cls)).f154121M;
            LinkedList<C0740i2> linkedList2 = this.f176538o;
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : linkedList2) {
                C0740i2 i2Var4 = (C0740i2) next2;
                C13696v vVar2 = i2Var4 instanceof C13696v ? (C13696v) i2Var4 : null;
                if (vVar2 != null && vVar2.f38758E) {
                    arrayList2.add(next2);
                }
            }
            int size2 = arrayList2.size();
            C87412m.m108594g(str10, "wording");
            ((TextView) ((C36570n) aVar3.f177395A).getValue()).setText(str10);
            TextView z2 = aVar3.mo87477z();
            C87412m.m108593f(z2, "descPrefixTxtView");
            C7919x.m8091a(z2);
            if (!C62042e.f176370a.mo87027N0()) {
                aVar3.mo87477z().setText(aVar3.f44854d.getContext().getString(C0966R.string.mve));
            } else if (size2 > 0) {
                aVar3.mo87477z().setVisibility(0);
                aVar3.mo87477z().setText(aVar3.f44854d.getContext().getString(C0966R.string.mva));
            } else {
                aVar3.mo87477z().setVisibility(8);
            }
        } else if (getItemViewType(i2) == 5 && (nVar2 instanceof C62427b)) {
            C0740i2 i2Var5 = this.f176536j.get(mo87160W5(i2, 5));
            C48416t tVar = i2Var5 instanceof C48416t ? (C48416t) i2Var5 : null;
            if (tVar != null) {
                C62427b bVar = (C62427b) nVar2;
                bVar.mo87478B(tVar.f129597d);
                C50626o21 o212 = tVar.f129597d.f139534d;
                if (o212 == null || (finderJumpInfo = o212.f138912d) == null || (str = finderJumpInfo.jump_id) == null) {
                    str = str5;
                }
                C104289g gVar = new C104289g();
                gVar.put("liuzi_component_id", str);
                if (eVar.mo87032P0(this.f176533g)) {
                    C50483n21 n212 = tVar.f129597d.f139535e;
                    if ((n212 != null ? n212.f138342g : 0) == 1) {
                        if (!(n212 == null || (str2 = n212.f138343h) == null)) {
                            str5 = str2;
                        }
                        bVar.f177405G.setVisibility(8);
                        bVar.f177403E.setVisibility(8);
                        if (str5.length() > 0) {
                            bVar.f177403E.setText(str5);
                            bVar.f177405G.setVisibility(8);
                            bVar.f177403E.setVisibility(0);
                        }
                        bVar.f177404F.setTextColor(this.f176531e.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
                        bVar.f177404F.setBackgroundResource(C0966R.C0969drawable.a1z);
                        bVar.f177404F.setOnClickListener((View.OnClickListener) null);
                    } else {
                        bVar.f177403E.setVisibility(8);
                        bVar.f177404F.setOnClickListener(new C62104l(gVar, tVar, this, bVar));
                    }
                    bVar.f44854d.setOnClickListener(new C62106m(gVar, tVar, this));
                    return;
                }
                bVar.f44854d.setOnClickListener(new C62107n(tVar, this, gVar));
                bVar.f177404F.setOnClickListener(new C62108o(tVar, this, bVar));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: sk1.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: te3.fp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: te3.fp1} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10188G4(jq3.C9507n r9, int r10, java.util.List<java.lang.Object> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "payloads"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onBindViewHolder payload, pos:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ",payloads:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.LiveShoppingListAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            boolean r0 = r8.mo87158U5()
            if (r0 == 0) goto L_0x0032
            r8.mo10187F4(r9, r10)
            return
        L_0x0032:
            int r0 = r8.getItemViewType(r10)
            r1 = 2
            if (r0 != r1) goto L_0x0114
            boolean r0 = r9 instanceof pp1.C62438f
            if (r0 == 0) goto L_0x0114
            int r0 = r8.mo87160W5(r10, r1)
            cm1.i2 r2 = r8.mo87156S5(r0)
            boolean r3 = r2 instanceof sk1.C63964u
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L_0x0110
            java.util.Iterator r10 = r11.iterator()
        L_0x0051:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0117
            java.lang.Object r11 = r10.next()
            boolean r4 = r11 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0051
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = gy3.C87412m.m108589b(r11, r5)
            if (r5 == 0) goto L_0x006c
            r5 = 1
            goto L_0x0074
        L_0x006c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            boolean r5 = gy3.C87412m.m108589b(r11, r5)
        L_0x0074:
            if (r5 == 0) goto L_0x009e
            r11 = r9
            pp1.f r11 = (pp1.C62438f) r11
            android.widget.TextView r4 = r11.mo87488E()
            java.lang.String r5 = r8.mo87155R5(r0)
            r4.setText(r5)
            android.view.View r4 = r9.f44854d
            r5 = 2131302566(0x7f0918a6, float:1.8223222E38)
            android.widget.TextView r6 = r11.mo87488E()
            java.lang.CharSequence r6 = r6.getText()
            r4.setTag(r5, r6)
            if (r3 != 0) goto L_0x009a
            r8.mo87164a6(r11, r0)
            goto L_0x0051
        L_0x009a:
            r8.mo87162Y5(r11, r0)
            goto L_0x0051
        L_0x009e:
            r5 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = gy3.C87412m.m108589b(r11, r5)
            r6 = 0
            if (r5 == 0) goto L_0x00c2
            r11 = r9
            pp1.f r11 = (pp1.C62438f) r11
            boolean r5 = r8.f176532f
            boolean r7 = r2 instanceof sk1.C63965x
            if (r7 == 0) goto L_0x00b7
            r7 = r2
            sk1.x r7 = (sk1.C63965x) r7
            goto L_0x00b8
        L_0x00b7:
            r7 = r6
        L_0x00b8:
            if (r7 == 0) goto L_0x00bc
            te3.fp1 r6 = r7.f181346s
        L_0x00bc:
            fj1.b r7 = r8.f176533g
            r11.mo87492I(r4, r5, r6, r7)
            goto L_0x0051
        L_0x00c2:
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = gy3.C87412m.m108589b(r11, r4)
            if (r4 == 0) goto L_0x00e7
            r11 = r9
            pp1.f r11 = (pp1.C62438f) r11
            r4 = 0
            boolean r5 = r8.f176532f
            boolean r7 = r2 instanceof sk1.C63965x
            if (r7 == 0) goto L_0x00db
            r7 = r2
            sk1.x r7 = (sk1.C63965x) r7
            goto L_0x00dc
        L_0x00db:
            r7 = r6
        L_0x00dc:
            if (r7 == 0) goto L_0x00e0
            te3.fp1 r6 = r7.f181346s
        L_0x00e0:
            fj1.b r7 = r8.f176533g
            r11.mo87492I(r4, r5, r6, r7)
            goto L_0x0051
        L_0x00e7:
            r4 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r11 = gy3.C87412m.m108589b(r11, r4)
            if (r11 == 0) goto L_0x0051
            boolean r11 = r2 instanceof sk1.C63965x
            if (r11 == 0) goto L_0x00f9
            r6 = r2
            sk1.x r6 = (sk1.C63965x) r6
        L_0x00f9:
            if (r6 == 0) goto L_0x0051
            r11 = r9
            pp1.f r11 = (pp1.C62438f) r11
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r4 = r11.mo87493z(r6)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r5 = r11.mo87485B()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$a r7 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.f160994j
            r5.mo78824b(r1, r6, r4)
            r11.mo87491H(r6)
            goto L_0x0051
        L_0x0110:
            r8.mo10187F4(r9, r10)
            goto L_0x0117
        L_0x0114:
            r8.mo10187F4(r9, r10)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.mo10188G4(jq3.n, int, java.util.List):void");
    }

    /* renamed from: O4 */
    public C9507n mo10189O4(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0 || i == 1) {
            View inflate = LayoutInflater.from(this.f176531e).inflate(C0966R.C0971layout.ajy, viewGroup, false);
            C87412m.m108593f(inflate, "from(context).inflate(la…ader_item, parent, false)");
            C62431d dVar = new C62431d(inflate, f176530A.mo87168a());
            dVar.f177412B = this.f176548y;
            return dVar;
        } else if (i == 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ajx, viewGroup, false);
            C87412m.m108593f(inflate2, "from(parent.context).inf…oods_item, parent, false)");
            return new C62438f(inflate2);
        } else if (i == 3) {
            View inflate3 = LayoutInflater.from(this.f176531e).inflate(C0966R.C0971layout.ajw, viewGroup, false);
            C87412m.m108593f(inflate3, "from(context).inflate(la…upon_item, parent, false)");
            C62430c cVar = new C62430c(inflate3);
            cVar.f177410A.setCallback(this.f176549z);
            return cVar;
        } else if (i == 4) {
            View inflate4 = LayoutInflater.from(this.f176531e).inflate(C0966R.C0971layout.d1s, viewGroup, false);
            C87412m.m108593f(inflate4, "from(context).inflate(la…ance_item, parent, false)");
            C62424a aVar = new C62424a(inflate4);
            inflate4.setOnClickListener(new C62086b(this));
            C23564m.m28138h(inflate4, new C62087c(this));
            return aVar;
        } else if (i != 5) {
            return new C62431d(new FrameLayout(this.f176531e), f176530A.mo87168a());
        } else {
            View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359751d62, viewGroup, false);
            C87412m.m108593f(inflate5, "from(parent.context).inf…tion_item, parent, false)");
            return new C62427b(inflate5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0316 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02dd  */
    /* renamed from: O5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87152O5(sk1.C63965x r29, pp1.C62438f r30, int r31, boolean r32) {
        /*
            r28 = this;
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            java.lang.Class<cl1.o> r11 = cl1.C54991o.class
            r12 = 0
            java.lang.String r13 = ""
            r0 = 2131302566(0x7f0918a6, float:1.8223222E38)
            r14 = 8
            if (r32 == 0) goto L_0x0021
            android.widget.TextView r1 = r30.mo87488E()
            r1.setVisibility(r14)
            android.view.View r1 = r9.f44854d
            r1.setTag(r0, r13)
            goto L_0x0040
        L_0x0021:
            android.widget.TextView r1 = r30.mo87488E()
            r1.setVisibility(r12)
            android.widget.TextView r1 = r30.mo87488E()
            java.lang.String r2 = r7.mo87155R5(r10)
            r1.setText(r2)
            android.view.View r1 = r9.f44854d
            android.widget.TextView r2 = r30.mo87488E()
            java.lang.CharSequence r2 = r2.getText()
            r1.setTag(r0, r2)
        L_0x0040:
            fj1.b r0 = r7.f176533g
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r1)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r0 = r0.f182392d
            r2 = 0
            r15 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x005d
            android.widget.TextView r0 = r30.mo87490G()
            r0.setVisibility(r14)
            goto L_0x00a8
        L_0x005d:
            int r0 = r8.f181345M
            if (r0 == r15) goto L_0x009a
            op1.h$a r0 = f176530A
            boolean r0 = r0.mo87168a()
            if (r0 == 0) goto L_0x008b
            int r0 = r8.f181336D
            if (r0 != r15) goto L_0x007c
            r1 = 1
            r2 = 1
            r3 = 0
            r0 = r28
            r4 = r30
            r5 = r31
            r6 = r29
            r0.mo87165b6(r1, r2, r3, r4, r5, r6)
            goto L_0x00a8
        L_0x007c:
            r1 = 1
            r2 = 0
            r3 = 0
            r0 = r28
            r4 = r30
            r5 = r31
            r6 = r29
            r0.mo87165b6(r1, r2, r3, r4, r5, r6)
            goto L_0x00a8
        L_0x008b:
            r1 = 0
            r2 = 0
            r3 = 0
            r0 = r28
            r4 = r30
            r5 = r31
            r6 = r29
            r0.mo87165b6(r1, r2, r3, r4, r5, r6)
            goto L_0x00a8
        L_0x009a:
            r1 = 0
            r2 = 0
            r3 = 1
            r0 = r28
            r4 = r30
            r5 = r31
            r6 = r29
            r0.mo87165b6(r1, r2, r3, r4, r5, r6)
        L_0x00a8:
            int r0 = r8.f181336D
            if (r0 != r15) goto L_0x00b6
            boolean r0 = r7.f176532f
            te3.fp1 r1 = r8.f181346s
            fj1.b r2 = r7.f176533g
            r9.mo87492I(r15, r0, r1, r2)
            goto L_0x00bf
        L_0x00b6:
            boolean r0 = r7.f176532f
            te3.fp1 r1 = r8.f181346s
            fj1.b r2 = r7.f176533g
            r9.mo87492I(r12, r0, r1, r2)
        L_0x00bf:
            r7.mo87164a6(r9, r10)
            java.lang.Class<cl1.h1> r0 = cl1.C54979h1.class
            com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView r1 = r30.mo87487D()
            fj1.b r2 = r7.f176533g
            androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
            cl1.h1 r2 = (cl1.C54979h1) r2
            long r2 = r2.f154114F
            int r3 = (int) r2
            boolean r2 = o40.C61926c.m72696u(r3, r15)
            r3 = 2
            r4 = 0
            if (r2 != 0) goto L_0x00e0
            r1.setVisibility(r14)
            goto L_0x0192
        L_0x00e0:
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r5 = r2.mo87027N0()
            if (r5 == 0) goto L_0x018f
            fj1.b r5 = r7.f176533g
            androidx.lifecycle.i0 r5 = r5.mo71262a(r11)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154186C
            if (r5 == 0) goto L_0x018f
            fj1.b r5 = r7.f176533g
            androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
            cl1.h1 r5 = (cl1.C54979h1) r5
            te3.gj1 r5 = r5.f154113E
            if (r5 == 0) goto L_0x0106
            int r5 = r5.f183343d
            if (r5 != r15) goto L_0x0106
            r5 = 1
            goto L_0x0107
        L_0x0106:
            r5 = 0
        L_0x0107:
            if (r5 == 0) goto L_0x0177
            fj1.b r5 = r7.f176533g
            androidx.lifecycle.i0 r0 = r5.mo71262a(r0)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.gj1 r0 = r0.f154113E
            if (r0 == 0) goto L_0x011b
            int r0 = r0.f183344e
            if (r0 != r15) goto L_0x011b
            r0 = 1
            goto L_0x011c
        L_0x011b:
            r0 = 0
        L_0x011c:
            if (r0 == 0) goto L_0x0125
            r1.setVisibility(r12)
            r1.setOnClickListener(r4)
            goto L_0x017a
        L_0x0125:
            te3.fp1 r0 = r8.f181346s
            te3.yh3 r0 = r0.f183160E
            if (r0 == 0) goto L_0x0132
            int r0 = r0.f186537i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0133
        L_0x0132:
            r0 = r4
        L_0x0133:
            if (r0 != 0) goto L_0x0136
            goto L_0x013c
        L_0x0136:
            int r5 = r0.intValue()
            if (r5 == 0) goto L_0x0167
        L_0x013c:
            r5 = 100
            if (r0 != 0) goto L_0x0141
            goto L_0x0147
        L_0x0141:
            int r6 = r0.intValue()
            if (r6 == r5) goto L_0x0167
        L_0x0147:
            if (r0 != 0) goto L_0x014a
            goto L_0x0150
        L_0x014a:
            int r5 = r0.intValue()
            if (r5 == r3) goto L_0x0167
        L_0x0150:
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r0 != 0) goto L_0x0155
            goto L_0x015b
        L_0x0155:
            int r6 = r0.intValue()
            if (r6 == r5) goto L_0x0167
        L_0x015b:
            if (r0 != 0) goto L_0x015e
            goto L_0x0165
        L_0x015e:
            int r0 = r0.intValue()
            if (r0 != r15) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r0 = 0
            goto L_0x0168
        L_0x0167:
            r0 = 1
        L_0x0168:
            if (r0 == 0) goto L_0x016e
            r1.setVisibility(r12)
            goto L_0x0171
        L_0x016e:
            r1.setVisibility(r14)
        L_0x0171:
            op1.j r0 = op1.C11715j.f34293d
            r1.setOnClickListener(r0)
            goto L_0x017a
        L_0x0177:
            r1.setVisibility(r14)
        L_0x017a:
            fj1.b r0 = r7.f176533g
            te3.fp1 r5 = r8.f181346s
            r2.mo87111r(r0, r5)
            te3.fp1 r0 = r8.f181346s
            r1.mo77968g(r0)
            op1.k r0 = new op1.k
            r0.<init>(r7)
            r1.setNotifyRecordBtnCallBack(r0)
            goto L_0x0192
        L_0x018f:
            r1.setVisibility(r14)
        L_0x0192:
            fj1.b r0 = r7.f176533g
            np1.a r1 = r7.f176542s
            if (r1 == 0) goto L_0x019b
            qj1.c r1 = r1.f175776i
            goto L_0x019c
        L_0x019b:
            r1 = r4
        L_0x019c:
            java.lang.String r2 = "liveData"
            gy3.C87412m.m108594g(r0, r2)
            rx3.g r2 = r9.f177441P
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer r2 = (com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer) r2
            r2.mo78798l(r0, r8, r1)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r0 = r7.f176540q
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.String r5 = "priceViewConfig"
            gy3.C87412m.m108594g(r0, r5)
            r9.f177443R = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "bindProductItem "
            r0.append(r5)
            long r5 = r8.f181347t
            r0.append(r5)
            java.lang.String r5 = ", "
            r0.append(r5)
            java.lang.String r6 = r8.f181333A
            r0.append(r6)
            r0.append(r5)
            java.lang.String r6 = r8.f181348u
            r0.append(r6)
            r0.append(r5)
            int r5 = r8.f181336D
            r0.append(r5)
            java.lang.String r5 = ",is_market_price_show:"
            r0.append(r5)
            te3.fp1 r5 = r8.f181346s
            int r5 = r5.f183168M
            r0.append(r5)
            java.lang.String r5 = " adapter:"
            r0.append(r5)
            int r5 = r28.hashCode()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.FinderLiveShoppingViewHolder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            rx3.g r0 = r9.f177432F
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r14)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r0 = r30.mo87485B()
            r0.setVisibility(r12)
            android.widget.TextView r0 = r30.mo87488E()
            android.widget.TextView r6 = r30.mo87488E()
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L_0x0234
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0232
            goto L_0x0234
        L_0x0232:
            r6 = 0
            goto L_0x0235
        L_0x0234:
            r6 = 1
        L_0x0235:
            if (r6 == 0) goto L_0x0238
            goto L_0x0239
        L_0x0238:
            r14 = 0
        L_0x0239:
            r0.setVisibility(r14)
            android.widget.TextView r0 = r30.mo87489F()
            r0.setVisibility(r12)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r6 = r0.mo62446e(r2)
            bl3.c r6 = r6.mo62447c(r1)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11870V()
            pl1.f r10 = new pl1.f
            java.util.LinkedList<java.lang.String> r14 = r8.f181349v
            java.lang.String r15 = "item.img_urls"
            gy3.C87412m.m108593f(r14, r15)
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
            java.lang.String r14 = (java.lang.String) r14
            r10.<init>(r14, r4, r3, r4)
            rx3.g r14 = r9.f177427A
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            java.lang.String r15 = "productImg"
            gy3.C87412m.m108593f(r14, r15)
            pl1.e0$a r15 = pl1.C11978e0.C11979a.LIVE_SHOPPING_DEFAULT
            bl3.r$a r0 = r0.mo62446e(r2)
            bl3.c r0 = r0.mo62447c(r1)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r15)
            r6.mo85957c(r10, r14, r0)
            te3.s90 r0 = r29.mo88747k()
            np1.i0 r1 = np1.C61866i0.f175909a
            rx3.g r2 = r9.f177433G
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            r15 = r2
            android.widget.TextView r15 = (android.widget.TextView) r15
            java.lang.String r2 = "productStock"
            gy3.C87412m.m108593f(r15, r2)
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r2 = r2.mo87027N0()
            if (r2 != 0) goto L_0x02b8
            fj1.b r2 = fj1.C45795b.f123698n
            if (r2 == 0) goto L_0x02b2
            androidx.lifecycle.i0 r2 = r2.mo71262a(r11)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154190D
            goto L_0x02b3
        L_0x02b2:
            r2 = 0
        L_0x02b3:
            if (r2 == 0) goto L_0x02b6
            goto L_0x02b8
        L_0x02b6:
            r2 = 0
            goto L_0x02b9
        L_0x02b8:
            r2 = 1
        L_0x02b9:
            java.lang.String r16 = r1.mo86799k(r2, r8, r0)
            rx3.g r0 = r9.f177437K
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            java.lang.String r2 = "sourceDivider"
            gy3.C87412m.m108593f(r0, r2)
            android.widget.TextView r2 = r30.mo87489F()
            java.lang.String r6 = "productSrc"
            gy3.C87412m.m108593f(r2, r6)
            java.lang.String r6 = r8.f181333A
            if (r6 != 0) goto L_0x02dd
            r19 = r13
            goto L_0x02df
        L_0x02dd:
            r19 = r6
        L_0x02df:
            rx3.g r6 = r9.f177435I
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            r20 = r6
            android.widget.TextView r20 = (android.widget.TextView) r20
            te3.fp1 r6 = r8.f181346s
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r6, r10)
            java.util.LinkedList<te3.z44> r6 = r6.f183165J
            java.lang.String r10 = "this.show_box_items"
            gy3.C87412m.m108593f(r6, r10)
            java.util.Iterator r6 = r6.iterator()
        L_0x02fe:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0316
            java.lang.Object r10 = r6.next()
            r11 = r10
            te3.z44 r11 = (te3.z44) r11
            int r11 = r11.f186625d
            r14 = 5
            if (r11 != r14) goto L_0x0312
            r11 = 1
            goto L_0x0313
        L_0x0312:
            r11 = 0
        L_0x0313:
            if (r11 == 0) goto L_0x02fe
            goto L_0x0317
        L_0x0316:
            r10 = r4
        L_0x0317:
            te3.z44 r10 = (te3.z44) r10
            if (r10 == 0) goto L_0x032c
            pe3.b r6 = r10.f186626e
            if (r6 == 0) goto L_0x032c
            te3.h40 r10 = new te3.h40
            r10.<init>()
            byte[] r6 = r6.mo123703f()
            r10.parseFrom(r6)
            goto L_0x032d
        L_0x032c:
            r10 = r4
        L_0x032d:
            if (r10 == 0) goto L_0x0337
            java.lang.String r6 = r10.f183400d
            if (r6 != 0) goto L_0x0334
            goto L_0x0337
        L_0x0334:
            r21 = r6
            goto L_0x0339
        L_0x0337:
            r21 = r13
        L_0x0339:
            rx3.g r6 = r9.f177436J
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            r22 = r6
            android.view.View r22 = (android.view.View) r22
            r14 = r1
            r17 = r0
            r18 = r2
            r14.mo86804q(r15, r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r0 = r9.mo87493z(r8)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r2 = r30.mo87485B()
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$a r6 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.f160994j
            r2.mo78824b(r3, r8, r0)
            android.widget.TextView r0 = r30.mo87490G()
            r0.setVisibility(r12)
            a14.n0 r0 = r9.f29679z
            if (r0 == 0) goto L_0x0397
            android.widget.TextView r2 = r30.mo87486C()
            java.lang.String r3 = "productDesc"
            gy3.C87412m.m108593f(r2, r3)
            java.util.LinkedList<java.lang.String> r3 = r8.f181344L
            java.lang.String r4 = r8.f181348u
            if (r4 != 0) goto L_0x0377
            r19 = r13
            goto L_0x0379
        L_0x0377:
            r19 = r4
        L_0x0379:
            r20 = 1
            r21 = 0
            r22 = 1
            r23 = 1
            r24 = 0
            r25 = 0
            r26 = 512(0x200, float:7.175E-43)
            r27 = 0
            java.lang.String r15 = "MicroMsg.FinderLiveShoppingViewHolder"
            r14 = r1
            r16 = r0
            r17 = r2
            r18 = r3
            np1.C61866i0.m72597o(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0397:
            if (r4 != 0) goto L_0x03bb
            java.lang.String r0 = "insertIcon2Str but scope is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            android.widget.TextView r0 = r30.mo87486C()
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = r8.f181348u
            if (r3 != 0) goto L_0x03b3
            goto L_0x03b4
        L_0x03b3:
            r13 = r3
        L_0x03b4:
            android.text.SpannableString r1 = r1.mo107057T1(r2, r13)
            r0.setText(r1)
        L_0x03bb:
            r9.mo87491H(r8)
            android.view.View r0 = r9.f44854d
            r1 = 2131302564(0x7f0918a4, float:1.8223218E38)
            android.widget.TextView r2 = r30.mo87486C()
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r1, r2)
            android.view.View r0 = r9.f44854d
            r1 = 2131302567(0x7f0918a7, float:1.8223224E38)
            android.widget.TextView r2 = r30.mo87489F()
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r1, r2)
            android.view.View r0 = r9.f44854d
            r1 = 2131302565(0x7f0918a5, float:1.822322E38)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r2 = r30.mo87485B()
            android.widget.TextView r2 = r2.getSellPrice()
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: op1.C62084h.mo87152O5(sk1.x, pp1.f, int, boolean):void");
    }

    /* renamed from: P5 */
    public final void mo87153P5(long j, C32227p<? super Integer, ? super C63965x, C13598b0> pVar) {
        int i = 0;
        for (T next : this.f176535i) {
            int i2 = i + 1;
            if (i >= 0) {
                C0740i2 i2Var = (C0740i2) next;
                if (!(i2Var instanceof C63965x) || ((C63965x) i2Var).f181347t != j) {
                    i = i2;
                } else {
                    pVar.invoke(Integer.valueOf(i), i2Var);
                    return;
                }
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        pVar.invoke(-1, null);
    }

    /* renamed from: Q5 */
    public final C78253a mo87154Q5() {
        return (C78253a) ((C36570n) this.f176541r).getValue();
    }

    /* renamed from: R5 */
    public final String mo87155R5(int i) {
        return this.f176537n.size() > 0 ? this.f176537n.contains(Integer.valueOf(i)) ? "" : String.valueOf(this.f176535i.size() - i) : String.valueOf(this.f176535i.size() - i);
    }

    /* renamed from: S5 */
    public final C0740i2 mo87156S5(int i) {
        boolean z = true;
        if (!this.f176534h.isEmpty()) {
            if (i >= 0 && i < this.f176534h.size()) {
                return this.f176534h.get(i);
            }
        }
        if (i < 0 || i >= this.f176535i.size()) {
            z = false;
        }
        if (z) {
            return this.f176535i.get(i);
        }
        return null;
    }

    /* renamed from: T5 */
    public final boolean mo87157T5() {
        LinkedList<C0740i2> linkedList = this.f176535i;
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (next instanceof C63965x) {
                arrayList.add(next);
            }
        }
        return !arrayList.isEmpty();
    }

    /* renamed from: U5 */
    public final boolean mo87158U5() {
        return this.f176534h.size() > 0;
    }

    /* renamed from: V5 */
    public final void mo87159V5(C62438f fVar, int i, int i2) {
        Class cls = C55001u.class;
        C8479f0 f0Var = new C8479f0();
        T S5 = mo87156S5(i);
        f0Var.f27484d = S5;
        if ((S5 instanceof C63965x) || (S5 instanceof C63964u)) {
            C63964u uVar = null;
            C63965x xVar = S5 instanceof C63965x ? (C63965x) S5 : null;
            long j = 0;
            long j2 = xVar != null ? xVar.f181347t : 0;
            if (S5 instanceof C63964u) {
                uVar = (C63964u) S5;
            }
            if (uVar != null) {
                j = uVar.f181326t;
            }
            long j3 = j;
            boolean z = S5 instanceof C63964u;
            Log.m105924i("Finder.LiveShoppingListAdapter", "promoteProduct id:" + j2 + ",adId:" + j3 + " scene:" + i2 + ", promoteType:" + (z ? 1 : 0));
            C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62443b(this.f176531e).mo62447c(C60172g4.class)).mo12861q3();
            new C58287u0(((C55001u) this.f176533g.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f176533g.mo71262a(cls)).f154416j, C66785b.f191882e.mo90662O5(), j2, z ? 1 : 0, j3, i2, q3, new C62089e(j2, j3, f0Var, i2, z ? 1 : 0, this, fVar, i)).mo9225i();
        }
    }

    /* renamed from: W5 */
    public final int mo87160W5(int i, int i2) {
        return i - this.f176539p.indexOf(Integer.valueOf(i2));
    }

    /* renamed from: X5 */
    public final void mo87161X5(int i) {
        String str;
        C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionGoodsItemShow;
        Class cls = C54116w.class;
        try {
            C0740i2 S5 = mo87156S5(i);
            try {
                if (this.f176532f) {
                    return;
                }
                if (S5 instanceof C63965x) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w wVar = (C54116w) c;
                    String valueOf = String.valueOf(((C63965x) S5).f181347t);
                    JSONObject e = C61866i0.f175909a.mo86794e(((C63965x) S5).f181346s);
                    e.put("list_type", mo87158U5() ? 0 : 1);
                    LinkedList<C64617p00> linkedList = ((C63965x) S5).f181346s.f183195z;
                    if (linkedList != null) {
                        if (!(!linkedList.isEmpty())) {
                            linkedList = null;
                        }
                        if (linkedList != null) {
                            StringBuilder sb = new StringBuilder();
                            for (C64617p00 p002 : linkedList) {
                                String str2 = p002.f184724e;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                sb.append(str2);
                                sb.append(";");
                            }
                            e.put("couponid", C112550d0.m153779O(sb, ";").toString());
                        }
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                    C54116w.Rx0(wVar, r0Var, (String) null, valueOf, (String) null, (String) null, (String) null, 0, 0, e, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
                } else if (S5 instanceof C63964u) {
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w wVar2 = (C54116w) c2;
                    String valueOf2 = String.valueOf(((C63964u) S5).f181326t);
                    C64620p2 p2Var = ((C63964u) S5).f181327u;
                    if (p2Var == null || (str = p2Var.f184738g) == null) {
                        str = "";
                    }
                    String valueOf3 = String.valueOf(((C63964u) S5).f181326t);
                    String str3 = ((C63964u) S5).f181322B;
                    C54116w.Rx0(wVar2, r0Var, (String) null, valueOf2, str, valueOf3, str3 == null ? "" : str3, 0, 0, (JSONObject) null, FileUtils.S_IRWXU, (Object) null);
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: Y5 */
    public final void mo87162Y5(C62438f fVar, int i) {
        fVar.f44854d.setOnClickListener(new C62091f(this, i, fVar));
        fVar.mo87490G().setOnClickListener(new C62092g(this, fVar, i));
        if (f176530A.mo87168a()) {
            fVar.f44854d.setOnLongClickListener(C62093h.f176579d);
        }
        mo87161X5(i);
    }

    /* renamed from: Z5 */
    public final void mo87163Z5(boolean z, boolean z2, String str, C62438f fVar, int i) {
        Log.m105924i("Finder.LiveShoppingListAdapter", "setAnchorPromoteText,anchor:" + z + ",promoting:" + z2 + ",pos:" + i);
        if (z) {
            if (z2) {
                fVar.mo87490G().setText(fVar.mo87490G().getContext().getResources().getString(C0966R.string.e8i));
                fVar.mo87490G().setTextColor(fVar.mo87490G().getContext().getResources().getColor(C0966R.color.f3445zo));
                fVar.mo87490G().setBackgroundResource(C0966R.C0969drawable.a1z);
            } else {
                fVar.mo87490G().setText(fVar.mo87490G().getContext().getResources().getString(C0966R.string.e8h));
                fVar.mo87490G().setTextColor(fVar.mo87490G().getContext().getResources().getColor(C0966R.color.f2975b6));
                fVar.mo87490G().setBackgroundResource(C0966R.C0969drawable.f357186b92);
            }
        } else if (!z) {
            fVar.mo87490G().setText(str);
            fVar.mo87490G().setTextColor(fVar.mo87490G().getContext().getResources().getColor(C0966R.color.f2975b6));
            fVar.mo87490G().setBackgroundResource(C0966R.C0969drawable.f357186b92);
        }
        fVar.mo87490G().setEnabled(true);
    }

    /* renamed from: a6 */
    public final void mo87164a6(C62438f fVar, int i) {
        fVar.f44854d.setOnClickListener(new C62094i(this, i, fVar));
        fVar.mo87490G().setOnClickListener(new C62096j(this, i, fVar));
        if (f176530A.mo87168a()) {
            fVar.f44854d.setOnLongClickListener(new C62097k(this, fVar, i));
        }
        fVar.f44854d.setTag(Integer.valueOf(i));
        View view = fVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C23564m.m28138h(view, new C62098l(this));
    }

    /* renamed from: b6 */
    public final void mo87165b6(boolean z, boolean z2, boolean z3, C62438f fVar, int i, C63965x xVar) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("setAnchorPromoteText,anchor:");
        sb.append(z);
        sb.append(",promoting:");
        sb.append(z2);
        sb.append(",pos:");
        sb.append(i);
        sb.append(",button_wording:");
        sb.append(xVar != null ? xVar.f181340H : null);
        Log.m105924i("Finder.LiveShoppingListAdapter", sb.toString());
        if (z3) {
            TextView G = fVar.mo87490G();
            if (xVar == null || (str2 = xVar.f181340H) == null) {
                str2 = fVar.mo87490G().getContext().getResources().getString(C0966R.string.e8_);
            }
            G.setText(str2);
            fVar.mo87490G().setTextColor(fVar.mo87490G().getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
            fVar.mo87490G().setBackgroundResource(C0966R.C0969drawable.a1z);
            fVar.mo87490G().setEnabled(false);
            return;
        }
        if (!z) {
            TextView G2 = fVar.mo87490G();
            if (xVar == null || (str = xVar.f181340H) == null) {
                str = fVar.mo87490G().getContext().getResources().getString(C0966R.string.e75);
            }
            G2.setText(str);
            fVar.mo87490G().setTextColor(fVar.mo87490G().getContext().getResources().getColor(C0966R.color.f2975b6));
            fVar.mo87490G().setBackgroundResource(C0966R.C0969drawable.f357186b92);
        } else if (z2) {
            fVar.mo87490G().setText(fVar.mo87490G().getContext().getResources().getString(C0966R.string.e8i));
            fVar.mo87490G().setTextColor(fVar.mo87490G().getContext().getResources().getColor(C0966R.color.f3445zo));
            fVar.mo87490G().setBackgroundResource(C0966R.C0969drawable.a1z);
        } else {
            fVar.mo87490G().setText(fVar.mo87490G().getContext().getResources().getString(C0966R.string.e8h));
            fVar.mo87490G().setTextColor(fVar.mo87490G().getContext().getResources().getColor(C0966R.color.f2975b6));
            fVar.mo87490G().setBackgroundResource(C0966R.C0969drawable.f357186b92);
        }
        fVar.mo87490G().setEnabled(true);
    }

    /* renamed from: c6 */
    public final void mo87166c6(C62192a<C0740i2> aVar) {
        C87412m.m108594g(aVar, "productList");
        Log.m105924i("Finder.LiveShoppingListAdapter", "before updateShoppingList,ori size:" + this.f176535i.size() + ",new size:" + aVar.mo87252c());
        this.f176534h.clear();
        this.f176535i.clear();
        this.f176535i.addAll(aVar.mo87251b(C62099m.f176594d));
        this.f176536j.clear();
        this.f176536j.addAll(((C54979h1) this.f176533g.mo71262a(C54979h1.class)).f154141p.mo87251b(C62100n.f176595d));
        this.f176537n.clear();
        ArrayList<Integer> arrayList = this.f176537n;
        LinkedList<C0740i2> linkedList = this.f176535i;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
        Iterator<T> it = linkedList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            Integer num = null;
            if (it.hasNext()) {
                T next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (((C0740i2) next) instanceof C63964u) {
                        num = Integer.valueOf(i2);
                    }
                    arrayList2.add(num);
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            } else {
                arrayList.addAll(C110818d0.m150912J(arrayList2));
                this.f176538o.clear();
                this.f176538o.addAll(aVar.mo87251b(C62101o.f176596d));
                mo87167d6();
                if (this.f176532f) {
                    ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
                    C54108o.f151869h.f151454e0.clear();
                    C62102i iVar = C62102i.f176597d;
                    C87412m.m108594g(iVar, "action");
                    List<E> list = aVar.f127225a;
                    C87412m.m108593f(list, "list");
                    synchronized (list) {
                        for (T next2 : list) {
                            int i4 = i + 1;
                            if (i >= 0) {
                                iVar.invoke(Integer.valueOf(i), next2);
                                i = i4;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
                notifyDataSetChanged();
                Log.m105924i("Finder.LiveShoppingListAdapter", "after updateShoppingList,data size:" + this.f176535i.size() + ",ad list:" + this.f176537n);
                return;
            }
        }
    }

    /* renamed from: d6 */
    public final void mo87167d6() {
        this.f176539p.clear();
        if (!this.f176538o.isEmpty()) {
            this.f176539p.add(4);
        }
        if (f176530A.mo87168a() && (!this.f176535i.isEmpty())) {
            this.f176539p.add(1);
        }
        ArrayList<Integer> arrayList = this.f176539p;
        LinkedList<C0740i2> linkedList = this.f176536j;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C0740i2 i2Var : linkedList) {
            arrayList2.add(5);
        }
        arrayList.addAll(arrayList2);
        ArrayList<Integer> arrayList3 = this.f176539p;
        LinkedList<C0740i2> linkedList2 = this.f176535i;
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C0740i2 i2Var2 : linkedList2) {
            arrayList4.add(2);
        }
        arrayList3.addAll(arrayList4);
    }

    /* renamed from: g5 */
    public void onViewRecycled(C9507n nVar) {
        C64059b bVar;
        C87412m.m108594g(nVar, "holder");
        super.onViewRecycled(nVar);
        if ((nVar instanceof C62438f ? nVar : null) != null) {
            C62438f fVar = (C62438f) nVar;
            C53973z1 z1Var = fVar.mo87487D().f159802j;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C64068b0 b0Var = fVar.f177440N;
            if (!(b0Var == null || (bVar = b0Var.f181627c) == null)) {
                bVar.mo88813a(3);
            }
            ((FinderLiveShopPromoteContainer) ((C36570n) fVar.f177441P).getValue()).getClass();
            Log.m105924i("FinderLiveShopPromoteContainer", "recycled");
            fVar.f177443R = null;
        }
    }

    public int getItemCount() {
        return mo87158U5() ? this.f176534h.size() : this.f176539p.size();
    }

    public int getItemViewType(int i) {
        if (mo87158U5()) {
            return 2;
        }
        Integer num = this.f176539p.get(i);
        C87412m.m108593f(num, "viewTypeArray[position]");
        return num.intValue();
    }
}
