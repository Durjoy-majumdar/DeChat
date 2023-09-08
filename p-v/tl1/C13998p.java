package tl1;

import ak1.C54067f0;
import ak1.C54116w;
import al1.C0082q;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bh0.C113174b;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.C4213y;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ky2.C10432i;
import l31.C61212e;
import o40.C61926c;
import qo3.C77398g;
import qo3.C77426q;
import rl1.C13022d0;
import rl1.C13062n0;
import rl1.C13064o0;
import rx3.C13598b0;
import te3.C50617o01;
import te3.C52204z21;

/* renamed from: tl1.p */
public final class C13998p extends C13988m {

    /* renamed from: A */
    public final C58124b f39314A;

    /* renamed from: B */
    public volatile int f39315B = -1;

    /* renamed from: C */
    public ViewGroup f39316C;

    /* renamed from: D */
    public C13966b0 f39317D;

    /* renamed from: E */
    public ViewGroup f39318E;

    /* renamed from: F */
    public C13985j0 f39319F;

    /* renamed from: G */
    public ViewGroup f39320G;

    /* renamed from: H */
    public C14012y f39321H;

    /* renamed from: I */
    public final C32226l<C52204z21, C13598b0> f39322I = new C13999a(this);

    /* renamed from: J */
    public final C32226l<C52204z21, C13598b0> f39323J = new C14000b(this);

    /* renamed from: tl1.p$a */
    public static final class C13999a extends C87413o implements C32226l<C52204z21, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13998p f39324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13999a(C13998p pVar) {
            super(1);
            this.f39324d = pVar;
        }

        public Object invoke(Object obj) {
            C52204z21 z212;
            C52204z21 z213 = (C52204z21) obj;
            Class cls = C13022d0.class;
            C87412m.m108594g(z213, LocaleUtil.ITALIAN);
            C0082q qVar = ((C13022d0) this.f39324d.mo87696x0(cls)).f37098n;
            String str = null;
            C52204z21 z214 = qVar != null ? qVar.f509d : null;
            C0082q qVar2 = ((C13022d0) this.f39324d.mo87696x0(cls)).f37098n;
            Integer valueOf = qVar2 != null ? Integer.valueOf(qVar2.f506a) : null;
            String str2 = z213.f145640d;
            String str3 = z214 != null ? z214.f145640d : null;
            C50617o01 o012 = ((C13022d0) this.f39324d.mo87696x0(cls)).f37100p;
            if (!(o012 == null || (z212 = o012.f138872d) == null)) {
                str = z212.f145640d;
            }
            Log.m105924i("FinderLiveLotteryVisitorCardPlugin", "computingAnimCallback,localStatus:" + valueOf + ", callbakcId:" + str2 + ",localId:" + str3 + ",recordId:" + str);
            if (valueOf != null && valueOf.intValue() == 2) {
                this.f39324d.mo13434e1(0);
                C13966b0 b0Var = this.f39324d.f39317D;
                if (b0Var != null) {
                    if (z214 != null) {
                        z213 = z214;
                    }
                    b0Var.mo13417d(z213);
                }
            }
            C13998p pVar = this.f39324d;
            pVar.mo13428a1(new C13997o(pVar));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: tl1.p$b */
    public static final class C14000b extends C87413o implements C32226l<C52204z21, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13998p f39325d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14000b(C13998p pVar) {
            super(1);
            this.f39325d = pVar;
        }

        /* renamed from: a */
        public static final void m13378a(C13998p pVar, C52204z21 z212) {
            C52204z21 z213;
            Class cls = C54991o.class;
            if (((C54991o) pVar.mo87696x0(cls)).mo75999e4()) {
                View view = pVar.f39295u;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin$doneAnimCallback$1", "invoke$visitorDoneAction", "(Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin$doneAnimCallback$1", "invoke$visitorDoneAction", "(Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveVisitorLotteryCardPlugin;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C14012y yVar = pVar.f39321H;
                if (yVar != null) {
                    C0082q qVar = ((C13022d0) pVar.mo87696x0(C13022d0.class)).f37098n;
                    if (!(qVar == null || (z213 = qVar.f509d) == null)) {
                        z212 = z213;
                    }
                    yVar.mo13442d(z212, true);
                }
                pVar.mo10792g(0);
                return;
            }
            Log.m105924i("FinderLiveLotteryVisitorCardPlugin", "visitorDoneAction liveStatus:" + ((C54991o) pVar.mo87696x0(cls)).f154295b1);
        }

        public Object invoke(Object obj) {
            C52204z21 z212;
            C52204z21 z213;
            C52204z21 z214;
            C52204z21 z215 = (C52204z21) obj;
            Class cls = C13022d0.class;
            C87412m.m108594g(z215, LocaleUtil.ITALIAN);
            C50617o01 o012 = ((C13022d0) this.f39325d.mo87696x0(cls)).f37100p;
            String str = null;
            Long valueOf = o012 != null ? Long.valueOf(o012.f138876h) : null;
            C50617o01 o013 = ((C13022d0) this.f39325d.mo87696x0(cls)).f37100p;
            String str2 = (o013 == null || (z214 = o013.f138872d) == null) ? null : z214.f145640d;
            C0082q qVar = ((C13022d0) this.f39325d.mo87696x0(cls)).f37098n;
            if (!(qVar == null || (z213 = qVar.f509d) == null)) {
                str = z213.f145640d;
            }
            Log.m105924i("FinderLiveLotteryVisitorCardPlugin", "doneAnimCallback curRecordLiveId" + valueOf + ",curRecordLotteryId:" + str2 + ",callbakcId:" + z215.f145640d + ",localId:" + str + ",lottering:" + this.f39325d.f39293s);
            long j = ((C55001u) this.f39325d.mo87696x0(C55001u.class)).f154420q.f182392d;
            if (valueOf != null && valueOf.longValue() == j) {
                if (!(str2 == null || str2.length() == 0) && C87412m.m108589b(str2, str)) {
                    m13378a(this.f39325d, z215);
                    return C13598b0.f38549a;
                }
            }
            this.f39325d.mo13434e1(0);
            C13998p pVar = this.f39325d;
            C13966b0 b0Var = pVar.f39317D;
            if (b0Var != null) {
                C0082q qVar2 = ((C13022d0) pVar.mo87696x0(cls)).f37098n;
                if (qVar2 == null || (z212 = qVar2.f509d) == null) {
                    z212 = z215;
                }
                b0Var.mo13417d(z212);
            }
            C13998p pVar2 = this.f39325d;
            pVar2.mo13428a1(new C14001q(z215, pVar2));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13998p(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f39314A = bVar;
    }

    /* renamed from: Z0 */
    public void mo13427Z0() {
        super.mo13427Z0();
        this.f39315B = -1;
    }

    /* renamed from: b1 */
    public void mo13418b1() {
        Class cls = C61212e.class;
        super.mo13418b1();
        ViewGroup viewGroup = (ViewGroup) this.f166287d.findViewById(C0966R.C0970id.ixd);
        this.f39316C = viewGroup;
        View view = this.f39295u;
        View view2 = this.f39296v;
        TextPaint textPaint = null;
        if (!(viewGroup == null || view == null || view2 == null)) {
            C13966b0 b0Var = new C13966b0(this, viewGroup, view, view2);
            this.f39317D = b0Var;
            b0Var.f39219f = (TextView) b0Var.f39215b.findViewById(C0966R.C0970id.f357845c22);
            b0Var.f39220g = (TextView) b0Var.f39215b.findViewById(C0966R.C0970id.n7b);
            TextView textView = b0Var.f39219f;
            C85875k4.m106189j0(textView != null ? textView.getPaint() : null, 0.8f);
            b0Var.f39221h = (TextView) b0Var.f39215b.findViewById(C0966R.C0970id.c3i);
            b0Var.f39222i = (TextView) b0Var.f39215b.findViewById(C0966R.C0970id.n7a);
            b0Var.f39223j = b0Var.f39215b.findViewById(C0966R.C0970id.ncq);
            b0Var.f39225l = (TextView) b0Var.f39215b.findViewById(C0966R.C0970id.etq);
            b0Var.f39224k = (TextView) b0Var.f39215b.findViewById(C0966R.C0970id.f6186zp);
            ((C61212e) C86312j.m106911c(cls)).o30(b0Var.f39224k, "finder_live_participate_lucky");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(b0Var.f39224k, 40, 25561);
            ((C61212e) C86312j.m106911c(cls)).E60(b0Var.f39224k, new C14013z(b0Var));
            TextView textView2 = b0Var.f39224k;
            if (textView2 != null) {
                textView2.setOnClickListener(new C13964a0(b0Var));
            }
            TextView textView3 = (TextView) b0Var.f39217d.findViewById(C0966R.C0970id.agn);
            C13064o0 o0Var = C13064o0.f37206a;
            C87412m.m108593f(textView3, "this");
            o0Var.mo12568g(textView3);
            View view3 = b0Var.f39217d;
            TextView textView4 = (TextView) b0Var.f39215b.findViewById(C0966R.C0970id.agn);
            view3.setTag(C0966R.C0970id.d4e, textView4 != null ? textView4.getText() : null);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f166287d.findViewById(C0966R.C0970id.lqd);
        this.f39318E = viewGroup2;
        View view4 = this.f39295u;
        View view5 = this.f39296v;
        if (!(viewGroup2 == null || view4 == null || view5 == null)) {
            C13985j0 j0Var = new C13985j0(this, viewGroup2, view4, view5);
            this.f39319F = j0Var;
            WeImageView weImageView = (WeImageView) j0Var.f39274b.findViewById(C0966R.C0970id.g7_);
            j0Var.f39278f = weImageView;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            WeImageView weImageView2 = j0Var.f39278f;
            if (weImageView2 != null) {
                weImageView2.post(new C13972d0(j0Var));
            }
            WeImageView weImageView3 = j0Var.f39278f;
            if (weImageView3 != null) {
                weImageView3.setOnClickListener(new C13974e0(j0Var));
            }
            TextView textView5 = (TextView) j0Var.f39274b.findViewById(C0966R.C0970id.lqc);
            j0Var.f39279g = textView5;
            C85875k4.m106189j0(textView5 != null ? textView5.getPaint() : null, 0.8f);
            j0Var.f39280h = (TextView) j0Var.f39274b.findViewById(C0966R.C0970id.ksy);
            j0Var.f39281i = (RecyclerView) j0Var.f39274b.findViewById(C0966R.C0970id.lqh);
            j0Var.f39284l = new C13995n(j0Var.f39273a.mo87684A0());
            RecyclerView recyclerView = j0Var.f39281i;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(j0Var.f39274b.getContext(), 1, false));
                recyclerView.setAdapter(j0Var.f39284l);
                recyclerView.mo17043c(new C13976f0(j0Var));
            }
            j0Var.f39282j = j0Var.f39274b.findViewById(C0966R.C0970id.lqe);
            j0Var.f39283k = (TextView) j0Var.f39274b.findViewById(C0966R.C0970id.g2t);
        }
        ViewGroup viewGroup3 = (ViewGroup) this.f166287d.findViewById(C0966R.C0970id.f358640g80);
        this.f39320G = viewGroup3;
        View view6 = this.f39295u;
        View view7 = this.f39296v;
        if (viewGroup3 != null && view6 != null && view7 != null) {
            C14012y yVar = new C14012y(this, viewGroup3, view6, view7);
            this.f39321H = yVar;
            TextView textView6 = (TextView) yVar.f39351b.findViewById(C0966R.C0970id.f358862hh2);
            yVar.f39354e = textView6;
            C85875k4.m106189j0(textView6 != null ? textView6.getPaint() : null, 0.8f);
            TextView textView7 = (TextView) yVar.f39351b.findViewById(C0966R.C0970id.lqi);
            yVar.f39355f = textView7;
            if (textView7 != null) {
                textPaint = textView7.getPaint();
            }
            C85875k4.m106189j0(textPaint, 0.8f);
            yVar.f39356g = (ImageView) yVar.f39351b.findViewById(C0966R.C0970id.lqa);
            yVar.f39357h = (TextView) yVar.f39351b.findViewById(C0966R.C0970id.lqf);
            yVar.f39358i = (TextView) yVar.f39351b.findViewById(C0966R.C0970id.nbx);
            yVar.f39359j = yVar.f39351b.findViewById(C0966R.C0970id.n_l);
            yVar.f39360k = yVar.f39351b.findViewById(C0966R.C0970id.nc8);
            yVar.f39361l = (TextView) yVar.f39351b.findViewById(C0966R.C0970id.n7c);
            TextView textView8 = (TextView) yVar.f39351b.findViewById(C0966R.C0970id.n6v);
            yVar.f39362m = textView8;
            if (textView8 != null) {
                textView8.setOnClickListener(new C14003s(yVar));
            }
            View findViewById = yVar.f39351b.findViewById(C0966R.C0970id.g7i);
            yVar.f39363n = findViewById;
            if (findViewById != null) {
                findViewById.post(new C14004t(yVar));
            }
            ((C61212e) C86312j.m106911c(cls)).o30(yVar.f39363n, "finder_live_win_result_list");
            ((C61212e) C86312j.m106911c(cls)).mo86175pO(yVar.f39363n, 8, 25561);
            View view8 = yVar.f39363n;
            if (view8 != null) {
                view8.setOnClickListener(new C14005u(yVar));
            }
            yVar.f39364o = (TextView) yVar.f39351b.findViewById(C0966R.C0970id.g7h);
            yVar.f39365p = yVar.f39351b.findViewById(C0966R.C0970id.g79);
        }
    }

    /* renamed from: c1 */
    public void mo13419c1(boolean z, C0082q qVar) {
        C87412m.m108594g(qVar, "lotteryInfoWrapper");
        super.mo13419c1(z, qVar);
        C61926c.m72668M(new C14002r(qVar, z, this));
    }

    /* renamed from: e1 */
    public final void mo13434e1(int i) {
        C54067f0.C0071v0 v0Var = C54067f0.C0071v0.SHOW_WIN_RESULT_CARD;
        Class cls = C54116w.class;
        Log.m105924i("FinderLiveLotteryVisitorCardPlugin", "chooseContainer ui mode:" + i);
        this.f39315B = i;
        if (i == 0) {
            ViewGroup viewGroup = this.f39316C;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = this.f39318E;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            ViewGroup viewGroup3 = this.f39320G;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        } else if (i == 1) {
            ViewGroup viewGroup4 = this.f39316C;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
            ViewGroup viewGroup5 = this.f39318E;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(0);
            }
            ViewGroup viewGroup6 = this.f39320G;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
        } else if (i == 2) {
            ViewGroup viewGroup7 = this.f39316C;
            if (viewGroup7 != null) {
                viewGroup7.setVisibility(8);
            }
            ViewGroup viewGroup8 = this.f39318E;
            if (viewGroup8 != null) {
                viewGroup8.setVisibility(8);
            }
            ViewGroup viewGroup9 = this.f39320G;
            if (viewGroup9 != null) {
                viewGroup9.setVisibility(0);
            }
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.my0((C54116w) c, v0Var, String.valueOf(2), (String) null, 0, 12, (Object) null);
        } else if (i == 3) {
            ViewGroup viewGroup10 = this.f39316C;
            if (viewGroup10 != null) {
                viewGroup10.setVisibility(8);
            }
            ViewGroup viewGroup11 = this.f39318E;
            if (viewGroup11 != null) {
                viewGroup11.setVisibility(8);
            }
            ViewGroup viewGroup12 = this.f39320G;
            if (viewGroup12 != null) {
                viewGroup12.setVisibility(0);
            }
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.my0((C54116w) c2, v0Var, String.valueOf(1), (String) null, 0, 12, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r2 = r2.f509d;
     */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13435f1(boolean r9) {
        /*
            r8 = this;
            tl1.j0 r0 = r8.f39319F
            if (r0 == 0) goto L_0x012b
            java.lang.Class<rl1.d0> r1 = rl1.C13022d0.class
            tl1.p r2 = r0.f39273a
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
            rl1.d0 r2 = (rl1.C13022d0) r2
            al1.q r2 = r2.f37098n
            r3 = 0
            if (r2 == 0) goto L_0x001a
            te3.z21 r2 = r2.f509d
            if (r2 == 0) goto L_0x001a
            int r2 = r2.f145650q
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            tl1.p r4 = r0.f39273a
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r1)
            rl1.d0 r4 = (rl1.C13022d0) r4
            al1.q r4 = r4.f37098n
            if (r4 == 0) goto L_0x002e
            te3.z21 r4 = r4.f509d
            if (r4 == 0) goto L_0x002e
            int r4 = r4.f145647n
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            java.lang.String r5 = r0.f39277e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "visitorLotteryDoneWinnerList realWinnerCnt:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = ",participateCount:"
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            tl1.n r2 = r0.f39284l
            if (r2 == 0) goto L_0x0061
            java.lang.String r4 = "Finder.LiveLotteryWinnerListAdapter"
            java.lang.String r5 = "clear"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.LinkedList<te3.w21> r4 = r2.f39310d
            r4.clear()
            r2.notifyDataSetChanged()
        L_0x0061:
            android.widget.TextView r2 = r0.f39279g
            if (r2 != 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            r2.setVisibility(r3)
        L_0x0069:
            android.widget.TextView r2 = r0.f39280h
            if (r2 != 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r2.setVisibility(r3)
        L_0x0071:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f39281i
            if (r2 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r2.setVisibility(r3)
        L_0x0079:
            tl1.p r2 = r0.f39273a
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
            rl1.d0 r2 = (rl1.C13022d0) r2
            te3.o01 r2 = r2.f37100p
            if (r2 == 0) goto L_0x0092
            te3.e31 r4 = r2.f138875g
            if (r4 == 0) goto L_0x0092
            java.util.LinkedList<te3.w21> r4 = r4.f132658d
            if (r4 == 0) goto L_0x0092
            int r4 = r4.size()
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            java.lang.String r5 = r0.f39277e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "parseWinnerList winnerListSize:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            if (r4 <= 0) goto L_0x00af
            r0.mo13426a(r2)
            goto L_0x00fc
        L_0x00af:
            tl1.p r2 = r0.f39273a
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
            rl1.d0 r2 = (rl1.C13022d0) r2
            al1.q r2 = r2.f37098n
            r4 = 0
            if (r2 == 0) goto L_0x00c3
            te3.z21 r2 = r2.f509d
            if (r2 == 0) goto L_0x00c3
            java.lang.String r2 = r2.f145640d
            goto L_0x00c4
        L_0x00c3:
            r2 = r4
        L_0x00c4:
            java.lang.String r5 = r0.f39277e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "parseWinnerList record is empty!lotteryId:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            tl1.p r5 = r0.f39273a
            cj1.n5 r5 = r5.mo14476D0()
            if (r5 == 0) goto L_0x00fc
            if (r2 != 0) goto L_0x00e6
            java.lang.String r2 = ""
        L_0x00e6:
            tl1.p r6 = r0.f39273a
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r1)
            rl1.d0 r1 = (rl1.C13022d0) r1
            te3.o01 r1 = r1.f37100p
            if (r1 == 0) goto L_0x00f4
            pe3.b r4 = r1.f138873e
        L_0x00f4:
            tl1.h0 r1 = new tl1.h0
            r1.<init>(r0)
            r5.mo75711O(r2, r4, r1)
        L_0x00fc:
            if (r9 == 0) goto L_0x0107
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = r0.f39278f
            if (r9 != 0) goto L_0x0103
            goto L_0x0111
        L_0x0103:
            r9.setVisibility(r3)
            goto L_0x0111
        L_0x0107:
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = r0.f39278f
            if (r9 != 0) goto L_0x010c
            goto L_0x0111
        L_0x010c:
            r0 = 8
            r9.setVisibility(r0)
        L_0x0111:
            java.lang.Class<ak1.w> r9 = ak1.C54116w.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            java.lang.String r0 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r9, r0)
            r1 = r9
            ak1.w r1 = (ak1.C54116w) r1
            ak1.f0$v0 r2 = ak1.C54067f0.C0071v0.CLICK_WIN_LIST
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            java.lang.String r3 = ""
            ak1.C54116w.my0(r1, r2, r3, r4, r5, r6, r7)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13998p.mo13435f1(boolean):void");
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
            this.f166287d.setVisibility(8);
            Log.m105928w("FinderLiveLotteryVisitorCardPlugin", "setVisible return for isTeenMode");
            return;
        }
        super.mo10792g(i);
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        C113174b bVar;
        byte[] byteArrayExtra;
        C14012y yVar = this.f39321H;
        if (yVar != null && i == 1001 && i2 == -1) {
            if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("launch_from_select_addr")) == null) {
                bVar = null;
            } else {
                bVar = new C113174b();
                bVar.parseFrom(byteArrayExtra);
            }
            if (bVar != null) {
                Context context = yVar.f39351b.getContext();
                C87412m.m108593f(context, "doneContainer.context");
                C77426q qVar = new C77426q(context);
                qVar.mo107595g(context.getResources().getString(C0966R.string.mn7));
                qVar.mo107602n(context.getResources().getString(C0966R.string.mn6));
                qVar.mo107598j(context.getResources().getString(C0966R.string.mn5));
                qVar.mo107597i(new C13062n0(qVar));
                qVar.mo107600l(new C14006v(yVar, bVar));
                qVar.mo107603o();
                yVar.f39367r = qVar.f225839c;
                return;
            }
            Log.m105920e("VisitorLotteryCardDoneWidget", "request addr but result is empty!");
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C14012y yVar = this.f39321H;
        if (yVar != null) {
            C4213y yVar2 = yVar.f39366q;
            if (yVar2 != null) {
                yVar2.mo5085n();
            }
            C77398g gVar = yVar.f39367r;
            if (gVar != null) {
                gVar.dismiss();
            }
        }
    }
}
