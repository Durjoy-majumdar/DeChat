package tl1;

import al1.C0082q;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import o40.C61937h;
import rl1.C13022d0;
import rx3.C13598b0;
import te3.C50617o01;
import te3.C52204z21;
import te3.C64273c21;

/* renamed from: tl1.d */
public final class C13969d extends C13988m {

    /* renamed from: A */
    public final C58124b f39228A;

    /* renamed from: B */
    public final String f39229B = "FinderLiveLotteryAnchorCardPlugin";

    /* renamed from: C */
    public final int f39230C = 1;

    /* renamed from: D */
    public final int f39231D = 2;

    /* renamed from: E */
    public final int f39232E = 10;

    /* renamed from: F */
    public View f39233F;

    /* renamed from: G */
    public TextView f39234G;

    /* renamed from: H */
    public TextView f39235H;

    /* renamed from: I */
    public TextView f39236I;

    /* renamed from: J */
    public TextView f39237J;

    /* renamed from: K */
    public TextView f39238K;

    /* renamed from: L */
    public View f39239L;

    /* renamed from: M */
    public View f39240M;

    /* renamed from: N */
    public TextView f39241N;

    /* renamed from: P */
    public TextView f39242P;

    /* renamed from: Q */
    public TextView f39243Q;

    /* renamed from: R */
    public TextView f39244R;

    /* renamed from: S */
    public RecyclerView f39245S;

    /* renamed from: T */
    public View f39246T;

    /* renamed from: U */
    public TextView f39247U;

    /* renamed from: V */
    public C13995n f39248V;

    /* renamed from: W */
    public boolean f39249W;

    /* renamed from: X */
    public final C32226l<C52204z21, C13598b0> f39250X = new C13970a(this);

    /* renamed from: Y */
    public final C32226l<C52204z21, C13598b0> f39251Y = new C13971b(this);

    /* renamed from: tl1.d$a */
    public static final class C13970a extends C87413o implements C32226l<C52204z21, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13969d f39252d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13970a(C13969d dVar) {
            super(1);
            this.f39252d = dVar;
        }

        public Object invoke(Object obj) {
            C52204z21 z212;
            C52204z21 z213;
            C52204z21 z214;
            C52204z21 z215 = (C52204z21) obj;
            Class cls = C13022d0.class;
            C87412m.m108594g(z215, LocaleUtil.ITALIAN);
            C0082q qVar = ((C13022d0) this.f39252d.mo87696x0(cls)).f37098n;
            String str = null;
            Integer valueOf = qVar != null ? Integer.valueOf(qVar.f506a) : null;
            String str2 = z215.f145640d;
            C0082q qVar2 = ((C13022d0) this.f39252d.mo87696x0(cls)).f37098n;
            String str3 = (qVar2 == null || (z214 = qVar2.f509d) == null) ? null : z214.f145640d;
            C50617o01 o012 = ((C13022d0) this.f39252d.mo87696x0(cls)).f37100p;
            if (!(o012 == null || (z213 = o012.f138872d) == null)) {
                str = z213.f145640d;
            }
            String str4 = this.f39252d.f39229B;
            Log.m105924i(str4, "computingAnimCallback,localStatus:" + valueOf + ", callbakcId:" + str2 + ",recordId:" + str + ",localId id:" + str3);
            if (valueOf != null && valueOf.intValue() == 2) {
                C13969d dVar = this.f39252d;
                C0082q qVar3 = ((C13022d0) dVar.mo87696x0(cls)).f37098n;
                if (!(qVar3 == null || (z212 = qVar3.f509d) == null)) {
                    z215 = z212;
                }
                C13969d.m13346f1(dVar, z215);
            }
            C13969d dVar2 = this.f39252d;
            dVar2.mo13428a1(new C13967c(dVar2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tl1.d$b */
    public static final class C13971b extends C87413o implements C32226l<C52204z21, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13969d f39253d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13971b(C13969d dVar) {
            super(1);
            this.f39253d = dVar;
        }

        public Object invoke(Object obj) {
            C52204z21 z212;
            C52204z21 z213;
            C52204z21 z214;
            C52204z21 z215 = (C52204z21) obj;
            Class cls = C13022d0.class;
            C87412m.m108594g(z215, LocaleUtil.ITALIAN);
            C50617o01 o012 = ((C13022d0) this.f39253d.mo87696x0(cls)).f37100p;
            Long l = null;
            Long valueOf = o012 != null ? Long.valueOf(o012.f138876h) : null;
            C50617o01 o013 = ((C13022d0) this.f39253d.mo87696x0(cls)).f37100p;
            String str = (o013 == null || (z214 = o013.f138872d) == null) ? null : z214.f145640d;
            C0082q qVar = ((C13022d0) this.f39253d.mo87696x0(cls)).f37098n;
            String str2 = (qVar == null || (z213 = qVar.f509d) == null) ? null : z213.f145640d;
            String str3 = z215.f145640d;
            String str4 = this.f39253d.f39229B;
            StringBuilder sb = new StringBuilder();
            sb.append("doneAnimCallback record:");
            Object obj2 = ((C13022d0) this.f39253d.mo87696x0(cls)).f37100p;
            if (obj2 == null) {
                obj2 = "";
            }
            sb.append(C61937h.m72709h(obj2));
            sb.append(" lotteryInfo:");
            sb.append(C61937h.m72709h(z215));
            sb.append(" curRecordLiveId");
            sb.append(valueOf);
            sb.append(",curRecordLotteryId:");
            sb.append(str);
            sb.append(",callbakcId:");
            sb.append(str3);
            sb.append(",localId:");
            sb.append(str2);
            sb.append(",lottering:");
            sb.append(this.f39253d.f39293s);
            Log.m105924i(str4, sb.toString());
            C64273c21 c212 = ((C55001u) this.f39253d.mo87696x0(C55001u.class)).f154420q;
            if (c212 != null) {
                l = Long.valueOf(c212.f182392d);
            }
            if (C87412m.m108589b(valueOf, l)) {
                if (!(str == null || str.length() == 0) && C87412m.m108589b(str, str2)) {
                    C13969d.m13345e1(this.f39253d, z215);
                    return C13598b0.f38549a;
                }
            }
            C13969d dVar = this.f39253d;
            C0082q qVar2 = ((C13022d0) dVar.mo87696x0(cls)).f37098n;
            if (qVar2 == null || (z212 = qVar2.f509d) == null) {
                z212 = z215;
            }
            C13969d.m13346f1(dVar, z212);
            C13969d dVar2 = this.f39253d;
            dVar2.mo13428a1(new C13973e(dVar2, z215));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13969d(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f39228A = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r1 = (r1 = r12.f138875g).f132658d;
     */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13345e1(tl1.C13969d r11, te3.C52204z21 r12) {
        /*
            java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r11.mo87696x0(r1)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75999e4()
            if (r2 == 0) goto L_0x014c
            androidx.lifecycle.i0 r1 = r11.mo87696x0(r0)
            rl1.d0 r1 = (rl1.C13022d0) r1
            te3.o01 r1 = r1.f37100p
            if (r1 == 0) goto L_0x0020
            te3.z21 r1 = r1.f138872d
            if (r1 != 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r12 = r1
        L_0x0020:
            java.lang.String r1 = "business(LiveLotterySlic…otteryInfo ?: lotteryInfo"
            gy3.C87412m.m108593f(r12, r1)
            int r1 = r12.f145647n
            r2 = 0
            if (r1 <= 0) goto L_0x00d7
            int r12 = r11.f39230C
            r11.mo13420g1(r12)
            tl1.n r12 = r11.f39248V
            if (r12 == 0) goto L_0x0042
            java.lang.String r1 = "Finder.LiveLotteryWinnerListAdapter"
            java.lang.String r3 = "clear"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.util.LinkedList<te3.w21> r1 = r12.f39310d
            r1.clear()
            r12.notifyDataSetChanged()
        L_0x0042:
            androidx.lifecycle.i0 r12 = r11.mo87696x0(r0)
            rl1.d0 r12 = (rl1.C13022d0) r12
            te3.o01 r12 = r12.f37100p
            if (r12 == 0) goto L_0x0059
            te3.e31 r1 = r12.f138875g
            if (r1 == 0) goto L_0x0059
            java.util.LinkedList<te3.w21> r1 = r1.f132658d
            if (r1 == 0) goto L_0x0059
            int r1 = r1.size()
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            java.lang.String r3 = r11.f39229B
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "parseWinnerList winnerListSize:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            if (r1 <= 0) goto L_0x0076
            r11.mo13422i1(r12)
            goto L_0x00bd
        L_0x0076:
            androidx.lifecycle.i0 r12 = r11.mo87696x0(r0)
            rl1.d0 r12 = (rl1.C13022d0) r12
            al1.q r12 = r12.f37098n
            r1 = 0
            if (r12 == 0) goto L_0x0088
            te3.z21 r12 = r12.f509d
            if (r12 == 0) goto L_0x0088
            java.lang.String r12 = r12.f145640d
            goto L_0x0089
        L_0x0088:
            r12 = r1
        L_0x0089:
            java.lang.String r3 = r11.f39229B
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "parseWinnerList record is empty!lotteryId:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            cj1.n5 r3 = r11.mo14476D0()
            if (r3 == 0) goto L_0x00bd
            if (r12 != 0) goto L_0x00a9
            java.lang.String r12 = ""
        L_0x00a9:
            androidx.lifecycle.i0 r0 = r11.mo87696x0(r0)
            rl1.d0 r0 = (rl1.C13022d0) r0
            te3.o01 r0 = r0.f37100p
            if (r0 == 0) goto L_0x00b5
            pe3.b r1 = r0.f138873e
        L_0x00b5:
            tl1.k r0 = new tl1.k
            r0.<init>(r11)
            r3.mo75711O(r12, r1, r0)
        L_0x00bd:
            android.widget.TextView r12 = r11.f39238K
            if (r12 != 0) goto L_0x00c2
            goto L_0x0103
        L_0x00c2:
            android.view.ViewGroup r0 = r11.f166287d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131827884(0x7f111cac, float:1.9288693E38)
            java.lang.String r0 = r0.getString(r1)
            r12.setText(r0)
            goto L_0x0103
        L_0x00d7:
            int r0 = r11.f39231D
            r11.mo13420g1(r0)
            android.widget.TextView r0 = r11.f39242P
            r11.mo13421h1(r0, r12)
            android.widget.TextView r12 = r11.f39241N
            if (r12 != 0) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            android.view.ViewGroup r0 = r11.f166287d
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131827871(0x7f111c9f, float:1.9288667E38)
            java.lang.String r0 = r0.getString(r1)
            r12.setText(r0)
        L_0x00fa:
            android.widget.TextView r12 = r11.f39238K
            if (r12 == 0) goto L_0x0103
            rl1.o0 r0 = rl1.C13064o0.f37206a
            r0.mo12568g(r12)
        L_0x0103:
            android.view.View r12 = r11.f39295u
            if (r12 != 0) goto L_0x0108
            goto L_0x0148
        L_0x0108:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.mo10233c(r1)
            java.lang.Object[] r4 = r0.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin"
            java.lang.String r6 = "anchorDoneAction"
            java.lang.String r7 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r12
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.mo10231a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin"
            java.lang.String r5 = "anchorDoneAction"
            java.lang.String r6 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0148:
            r11.mo10792g(r2)
            goto L_0x016f
        L_0x014c:
            r12 = 8
            r11.mo10792g(r12)
            java.lang.String r12 = r11.f39229B
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "anchorDoneAction liveStatus:"
            r0.append(r2)
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r1)
            cl1.o r11 = (cl1.C54991o) r11
            int r11 = r11.f154295b1
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13969d.m13345e1(tl1.d, te3.z21):void");
    }

    /* renamed from: f1 */
    public static final void m13346f1(C13969d dVar, C52204z21 z212) {
        dVar.mo13420g1(0);
        dVar.mo13421h1(dVar.f39234G, z212);
        TextView textView = dVar.f39235H;
        if (textView != null) {
            textView.setText(dVar.f166287d.getContext().getResources().getString(C0966R.string.dsi));
        }
        if (z212.f145647n > 0) {
            TextView textView2 = dVar.f39236I;
            if (textView2 != null) {
                String string = dVar.f166287d.getContext().getResources().getString(C0966R.string.dsl);
                C87412m.m108593f(string, "root.context.resources.g…nder_live_lottery_attend)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(z212.f145647n)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                textView2.setText(format);
            }
        } else {
            TextView textView3 = dVar.f39236I;
            if (textView3 != null) {
                textView3.setText(dVar.f166287d.getContext().getResources().getString(C0966R.string.du4));
            }
        }
        TextView textView4 = dVar.f39237J;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        dVar.mo10792g(0);
        View view = dVar.f39295u;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13418b1() {
        /*
            r6 = this;
            super.mo13418b1()
            android.view.ViewGroup r0 = r6.f166287d
            r1 = 2131312673(0x7f094021, float:1.8243721E38)
            android.view.View r0 = r0.findViewById(r1)
            r6.f39233F = r0
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r2 = 2131300828(0x7f0911dc, float:1.8219697E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            r6.f39234G = r0
            android.view.View r0 = r6.f39233F
            if (r0 == 0) goto L_0x002c
            r2 = 2131300897(0x7f091221, float:1.8219837E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            r6.f39235H = r0
            android.view.View r0 = r6.f39233F
            if (r0 == 0) goto L_0x003d
            r2 = 2131300907(0x7f09122b, float:1.8219857E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x003e
        L_0x003d:
            r0 = r1
        L_0x003e:
            r6.f39236I = r0
            if (r0 == 0) goto L_0x0047
            android.text.TextPaint r0 = r0.getPaint()
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r2)
            android.view.View r0 = r6.f39233F
            if (r0 == 0) goto L_0x005c
            r3 = 2131296956(0x7f0902bc, float:1.8211843E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x005d
        L_0x005c:
            r0 = r1
        L_0x005d:
            r6.f39237J = r0
            if (r0 == 0) goto L_0x0066
            android.text.TextPaint r0 = r0.getPaint()
            goto L_0x0067
        L_0x0066:
            r0 = r1
        L_0x0067:
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r2)
            android.widget.TextView r0 = r6.f39237J
            if (r0 == 0) goto L_0x0076
            tl1.g r3 = new tl1.g
            r3.<init>(r6)
            r0.setOnClickListener(r3)
        L_0x0076:
            android.view.ViewGroup r0 = r6.f166287d
            r3 = 2131298208(0x7f0907a0, float:1.8214383E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f39238K = r0
            if (r0 == 0) goto L_0x008a
            rl1.o0 r3 = rl1.C13064o0.f37206a
            r3.mo12568g(r0)
        L_0x008a:
            android.view.ViewGroup r0 = r6.f166287d
            r3 = 2131317115(0x7f09517b, float:1.825273E38)
            android.view.View r0 = r0.findViewById(r3)
            r6.f39239L = r0
            android.view.ViewGroup r0 = r6.f166287d
            r3 = 2131310327(0x7f0936f7, float:1.8238963E38)
            android.view.View r0 = r0.findViewById(r3)
            r6.f39240M = r0
            if (r0 == 0) goto L_0x00ac
            r3 = 2131310328(0x7f0936f8, float:1.8238965E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00ad
        L_0x00ac:
            r0 = r1
        L_0x00ad:
            r6.f39242P = r0
            android.view.View r0 = r6.f39240M
            if (r0 == 0) goto L_0x00bd
            r3 = 2131310326(0x7f0936f6, float:1.823896E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00be
        L_0x00bd:
            r0 = r1
        L_0x00be:
            r6.f39241N = r0
            if (r0 == 0) goto L_0x00c7
            android.text.TextPaint r0 = r0.getPaint()
            goto L_0x00c8
        L_0x00c7:
            r0 = r1
        L_0x00c8:
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r2)
            android.view.ViewGroup r0 = r6.f166287d
            r3 = 2131317114(0x7f09517a, float:1.8252729E38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f39243Q = r0
            if (r0 == 0) goto L_0x00df
            android.text.TextPaint r0 = r0.getPaint()
            goto L_0x00e0
        L_0x00df:
            r0 = r1
        L_0x00e0:
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r2)
            android.view.ViewGroup r0 = r6.f166287d
            r2 = 2131315569(0x7f094b71, float:1.8249595E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f39244R = r0
            android.view.View r0 = r6.f39239L
            if (r0 == 0) goto L_0x00fe
            r2 = 2131317119(0x7f09517f, float:1.8252739E38)
            android.view.View r0 = r0.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            r6.f39245S = r0
            tl1.n r0 = new tl1.n
            fj1.b r2 = r6.mo87684A0()
            r0.<init>(r2)
            r6.f39248V = r0
            androidx.recyclerview.widget.RecyclerView r0 = r6.f39245S
            if (r0 == 0) goto L_0x012d
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r3 = r6.f166287d
            android.content.Context r3 = r3.getContext()
            r4 = 1
            r5 = 0
            r2.<init>(r3, r4, r5)
            r0.setLayoutManager(r2)
            tl1.n r2 = r6.f39248V
            r0.setAdapter(r2)
            tl1.f r2 = new tl1.f
            r2.<init>(r6)
            r0.mo17043c(r2)
        L_0x012d:
            android.view.View r0 = r6.f39239L
            if (r0 == 0) goto L_0x0139
            r2 = 2131317116(0x7f09517c, float:1.8252733E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x013a
        L_0x0139:
            r0 = r1
        L_0x013a:
            r6.f39246T = r0
            android.view.View r0 = r6.f39239L
            if (r0 == 0) goto L_0x014a
            r1 = 2131308010(0x7f092dea, float:1.8234263E38)
            android.view.View r0 = r0.findViewById(r1)
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x014a:
            r6.f39247U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13969d.mo13418b1():void");
    }

    /* renamed from: c1 */
    public void mo13419c1(boolean z, C0082q qVar) {
        C87412m.m108594g(qVar, "lotteryInfoWrapper");
        super.mo13419c1(z, qVar);
        C61926c.m72668M(new C13963a(qVar, this, z));
    }

    /* renamed from: g1 */
    public final void mo13420g1(int i) {
        int i2 = i;
        String str = this.f39229B;
        Log.m105924i(str, "chooseContainer ui mode:" + i2);
        if (i2 == this.f39230C) {
            View view = this.f39233F;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f39240M;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view5 = this.f39239L;
            if (view5 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (i2 == this.f39231D) {
            View view7 = this.f39233F;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view9 = this.f39240M;
            if (view9 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view11 = this.f39239L;
            if (view11 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            View view13 = this.f39233F;
            if (view13 != null) {
                C9556a aVar7 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar7.mo10233c(0);
                View view14 = view13;
                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view15 = this.f39240M;
            if (view15 != null) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                aVar8.mo10233c(8);
                View view16 = view15;
                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view17 = this.f39239L;
            if (view17 != null) {
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                aVar9.mo10233c(8);
                View view18 = view17;
                C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view18, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "chooseContainer", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: h1 */
    public final void mo13421h1(TextView textView, C52204z21 z212) {
        String string = this.f166287d.getContext().getResources().getString(C0966R.string.mnk);
        C87412m.m108593f(string, "root.context.resources.g…ttery_desc_prize_content)");
        Object[] objArr = new Object[1];
        String str = z212.f145644h;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        String format = String.format(string, Arrays.copyOf(objArr, 1));
        C87412m.m108593f(format, "format(format, *args)");
        int i = z212.f145646j;
        if (textView != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(10);
            String string2 = this.f166287d.getContext().getResources().getString(C0966R.string.dtc);
            C87412m.m108593f(string2, "root.context.resources.g…e_lottery_desc_winnercnt)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            sb.append(format2);
            textView.setText(sb.toString());
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13422i1(te3.C50617o01 r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0006
            te3.z21 r1 = r10.f138872d
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            if (r1 == 0) goto L_0x0076
            android.widget.TextView r2 = r9.f39243Q
            java.lang.String r3 = "format(format, *args)"
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0012
            goto L_0x0041
        L_0x0012:
            android.view.ViewGroup r6 = r9.f166287d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131827917(0x7f111ccd, float:1.928876E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "root.context.resources.g…ive_lottery_winner_count)"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r8 = r1.f145650q
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7[r4] = r8
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r6 = java.lang.String.format(r6, r7)
            gy3.C87412m.m108593f(r6, r3)
            r2.setText(r6)
        L_0x0041:
            android.widget.TextView r2 = r9.f39244R
            if (r2 != 0) goto L_0x0046
            goto L_0x007e
        L_0x0046:
            android.view.ViewGroup r6 = r9.f166287d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131827873(0x7f111ca1, float:1.928867E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "root.context.resources.g…ottery_participate_count)"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            int r1 = r1.f145647n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7[r4] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r5)
            java.lang.String r1 = java.lang.String.format(r6, r1)
            gy3.C87412m.m108593f(r1, r3)
            r2.setText(r1)
            goto L_0x007e
        L_0x0076:
            java.lang.String r1 = r9.f39229B
            java.lang.String r2 = "updateWinnerList error lotteryInfo is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
        L_0x007e:
            tl1.n r1 = r9.f39248V
            if (r1 == 0) goto L_0x008f
            if (r10 == 0) goto L_0x008a
            te3.e31 r10 = r10.f138875g
            if (r10 == 0) goto L_0x008a
            java.util.LinkedList<te3.w21> r0 = r10.f132658d
        L_0x008a:
            r1.mo13433G4(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x008f:
            if (r0 != 0) goto L_0x0099
            java.lang.String r10 = r9.f39229B
            java.lang.String r0 = "updateWinnerList but winnderAdapter is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x0099:
            tl1.n r10 = r9.f39248V
            if (r10 == 0) goto L_0x00a0
            r10.notifyDataSetChanged()
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13969d.mo13422i1(te3.o01):void");
    }
}
