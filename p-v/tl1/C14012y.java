package tl1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4213y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61937h;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import qo3.C77398g;
import rx3.C13598b0;
import te3.C51633v21;
import te3.C64373fs0;
import up1.C27696y;

/* renamed from: tl1.y */
public final class C14012y {

    /* renamed from: a */
    public final C13998p f39350a;

    /* renamed from: b */
    public final ViewGroup f39351b;

    /* renamed from: c */
    public final View f39352c;

    /* renamed from: d */
    public final View f39353d;

    /* renamed from: e */
    public TextView f39354e;

    /* renamed from: f */
    public TextView f39355f;

    /* renamed from: g */
    public ImageView f39356g;

    /* renamed from: h */
    public TextView f39357h;

    /* renamed from: i */
    public TextView f39358i;

    /* renamed from: j */
    public View f39359j;

    /* renamed from: k */
    public View f39360k;

    /* renamed from: l */
    public TextView f39361l;

    /* renamed from: m */
    public TextView f39362m;

    /* renamed from: n */
    public View f39363n;

    /* renamed from: o */
    public TextView f39364o;

    /* renamed from: p */
    public View f39365p;

    /* renamed from: q */
    public C4213y f39366q;

    /* renamed from: r */
    public C77398g f39367r;

    public C14012y(C13998p pVar, ViewGroup viewGroup, View view, View view2) {
        C87412m.m108594g(pVar, "visitorCardPlugin");
        C87412m.m108594g(viewGroup, "doneContainer");
        C87412m.m108594g(view, "cardContainer");
        C87412m.m108594g(view2, "card");
        this.f39350a = pVar;
        this.f39351b = viewGroup;
        this.f39352c = view;
        this.f39353d = view2;
    }

    /* renamed from: e */
    public static final void m13380e(C14012y yVar, C64373fs0 fs02) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        ImageView imageView = yVar.f39356g;
        if (imageView != null) {
            if (fs02.f183215f == 3) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(Util.nullAsNil(fs02.f183214e), (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            } else {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(new C62345f(Util.nullAsNil(fs02.f183214e), (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
            }
            TextView textView = yVar.f39357h;
            if (textView != null) {
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(yVar.f39351b.getContext(), fs02.f183213d));
            }
        }
    }

    /* renamed from: a */
    public final void mo13439a(TextView textView, C51633v21 v212) {
        C13598b0 b0Var = null;
        if (textView != null) {
            if (v212.f143261i != 1) {
                String str = v212.f143258f;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                if (v212.f143259g == 0) {
                    textView.setBackgroundResource(C0966R.C0969drawable.f5140y0);
                    textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f2975b6, (Resources.Theme) null));
                    textView.setEnabled(true);
                    C7335d c = C86312j.m106911c(C54116w.class);
                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w wVar = (C54116w) c;
                    C54067f0.C0071v0 v0Var = C54067f0.C0071v0.LOTTERY_CARD_CLAIM_BTN_EXPOSE;
                    int i = v212.f143256d;
                    C54116w.my0(wVar, v0Var, i != 1 ? i != 2 ? "1" : "3" : "2", (String) null, 0, 12, (Object) null);
                } else {
                    textView.setBackground((Drawable) null);
                    textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_3, (Resources.Theme) null));
                    textView.setEnabled(false);
                }
            } else {
                textView.setText(textView.getContext().getResources().getString(C0966R.string.mno));
                textView.setBackground((Drawable) null);
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.amv, (Resources.Theme) null));
                textView.setEnabled(false);
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("LotteryUtil", "setClaim " + C61937h.m72709h(v212) + " but claimPrizeTip is null!");
        }
    }

    /* renamed from: b */
    public final void mo13440b() {
        TextView textView = this.f39354e;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.f39355f;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        TextView textView3 = this.f39358i;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        mo13441c(false);
        TextView textView4 = this.f39361l;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        ImageView imageView = this.f39356g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView5 = this.f39357h;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo13441c(boolean z) {
        boolean z2 = z;
        if (C58739j4.f168176a.mo83692U()) {
            Log.printInfoStack("VisitorLotteryCardDoneWidget", "setRainbowVisible visible:" + z2, new Object[0]);
        }
        if (z2) {
            View view = this.f39359j;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view3 = this.f39360k;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view5 = this.f39359j;
        if (view5 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view6 = this.f39360k;
        if (view6 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget", "setRainbowVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01fb A[ADDED_TO_REGION] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13442d(te3.C52204z21 r34, boolean r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            ak1.f0$v0 r3 = ak1.C54067f0.C0071v0.SHOW_WIN_RESULT_CARD
            java.lang.Class<ak1.w> r4 = ak1.C54116w.class
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            java.lang.String r6 = "lotteryInfo"
            gy3.C87412m.m108594g(r1, r6)
            tl1.p r6 = r0.f39350a
            int r7 = r6.mo14483f0()
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r7 != 0) goto L_0x002b
            int r7 = r6.f39315B
            if (r7 == r8) goto L_0x0029
            int r7 = r6.f39315B
            if (r7 == r9) goto L_0x0029
            int r6 = r6.f39315B
            if (r6 != r10) goto L_0x002b
        L_0x0029:
            r6 = 1
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "visitorLotteryDone fromUpdate:"
            r7.append(r12)
            r7.append(r2)
            java.lang.String r12 = ",isDoneUIShowing:"
            r7.append(r12)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r12 = "VisitorLotteryCardDoneWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)
            if (r2 == 0) goto L_0x0050
            if (r6 == 0) goto L_0x0050
            return
        L_0x0050:
            int r2 = r1.f145649p
            boolean r13 = o40.C61926c.m72696u(r2, r9)
            int r2 = r1.f145649p
            boolean r2 = o40.C61926c.m72696u(r2, r10)
            int r14 = r1.f145647n
            int r15 = r1.f145650q
            r0.mo13441c(r11)
            r7 = 0
            r6 = 8
            if (r13 == 0) goto L_0x0141
            tl1.p r2 = r0.f39350a
            r2.mo13434e1(r8)
            android.widget.TextView r2 = r0.f39358i
            if (r2 != 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            java.lang.String r3 = r1.f145644h
            r2.setText(r3)
        L_0x0077:
            android.widget.TextView r2 = r0.f39361l
            if (r2 != 0) goto L_0x007c
            goto L_0x008a
        L_0x007c:
            te3.v21 r3 = r1.f145653t
            if (r3 == 0) goto L_0x0085
            java.lang.String r3 = r3.f143260h
            if (r3 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            java.lang.String r3 = ""
        L_0x0087:
            r2.setText(r3)
        L_0x008a:
            android.widget.TextView r2 = r0.f39354e
            if (r2 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r2.setVisibility(r6)
        L_0x0092:
            android.widget.TextView r2 = r0.f39355f
            if (r2 != 0) goto L_0x0097
            goto L_0x009a
        L_0x0097:
            r2.setVisibility(r11)
        L_0x009a:
            android.widget.TextView r2 = r0.f39358i
            if (r2 != 0) goto L_0x009f
            goto L_0x00a2
        L_0x009f:
            r2.setVisibility(r11)
        L_0x00a2:
            r0.mo13441c(r10)
            android.widget.TextView r2 = r0.f39361l
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r2.setVisibility(r11)
        L_0x00ad:
            android.widget.ImageView r2 = r0.f39356g
            if (r2 != 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r2.setVisibility(r11)
        L_0x00b5:
            android.widget.TextView r2 = r0.f39357h
            if (r2 != 0) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            r2.setVisibility(r11)
        L_0x00bd:
            te3.gb3 r2 = r1.f145651r
            if (r2 == 0) goto L_0x00d2
            te3.fs0 r3 = new te3.fs0
            r3.<init>()
            java.lang.String r4 = r2.f133953f
            r3.f183214e = r4
            java.lang.String r2 = r2.f133952e
            r3.f183213d = r2
            m13380e(r0, r3)
            goto L_0x0112
        L_0x00d2:
            java.lang.String r2 = "lotteryInfo.participant_info is null ,so use loacal current role info"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            tl1.p r2 = r0.f39350a
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r5)
            cl1.o r2 = (cl1.C54991o) r2
            java.util.LinkedList<te3.fs0> r2 = r2.f154339m2
            java.util.Iterator r2 = r2.iterator()
        L_0x00e5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x010a
            java.lang.Object r3 = r2.next()
            r4 = r3
            te3.fs0 r4 = (te3.C64373fs0) r4
            int r4 = r4.f183215f
            tl1.p r8 = r0.f39350a
            androidx.lifecycle.i0 r8 = r8.mo87696x0(r5)
            cl1.o r8 = (cl1.C54991o) r8
            te3.fs0 r8 = r8.mo75986U3()
            int r8 = r8.f183215f
            if (r4 != r8) goto L_0x0106
            r4 = 1
            goto L_0x0107
        L_0x0106:
            r4 = 0
        L_0x0107:
            if (r4 == 0) goto L_0x00e5
            goto L_0x010b
        L_0x010a:
            r3 = r7
        L_0x010b:
            te3.fs0 r3 = (te3.C64373fs0) r3
            if (r3 == 0) goto L_0x0112
            m13380e(r0, r3)
        L_0x0112:
            tl1.p r2 = r0.f39350a
            java.lang.Class<rl1.d0> r3 = rl1.C13022d0.class
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r3)
            rl1.d0 r2 = (rl1.C13022d0) r2
            androidx.lifecycle.z<java.lang.Boolean> r2 = r2.f37101q
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.postValue(r3)
            te3.v21 r1 = r1.f145653t
            if (r1 == 0) goto L_0x012f
            android.widget.TextView r2 = r0.f39362m
            r0.mo13439a(r2, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0130
        L_0x012f:
            r1 = r7
        L_0x0130:
            if (r1 != 0) goto L_0x0138
            java.lang.String r1 = "setClaim but claim is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
        L_0x0138:
            android.widget.TextView r1 = r0.f39362m
            if (r1 != 0) goto L_0x013d
            goto L_0x016c
        L_0x013d:
            r1.setVisibility(r11)
            goto L_0x016c
        L_0x0141:
            if (r2 == 0) goto L_0x016f
            tl1.p r1 = r0.f39350a
            r1.mo13434e1(r9)
            android.widget.TextView r1 = r0.f39354e
            if (r1 != 0) goto L_0x014d
            goto L_0x0161
        L_0x014d:
            android.view.ViewGroup r2 = r0.f39351b
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131827869(0x7f111c9d, float:1.9288663E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
        L_0x0161:
            android.widget.TextView r1 = r0.f39362m
            if (r1 != 0) goto L_0x0166
            goto L_0x0169
        L_0x0166:
            r1.setVisibility(r6)
        L_0x0169:
            r33.mo13440b()
        L_0x016c:
            r8 = 8
            goto L_0x01ac
        L_0x016f:
            if (r10 > r15) goto L_0x0175
            if (r15 > r14) goto L_0x0175
            r1 = 1
            goto L_0x0176
        L_0x0175:
            r1 = 0
        L_0x0176:
            java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
            if (r1 == 0) goto L_0x01ae
            tl1.p r1 = r0.f39350a
            r1.mo13434e1(r10)
            tl1.p r1 = r0.f39350a
            r1.mo13435f1(r11)
            android.widget.TextView r1 = r0.f39362m
            if (r1 != 0) goto L_0x0189
            goto L_0x018c
        L_0x0189:
            r1.setVisibility(r6)
        L_0x018c:
            di3.d r1 = di3.C86312j.m106911c(r4)
            gy3.C87412m.m108593f(r1, r2)
            ak1.w r1 = (ak1.C54116w) r1
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r5 = 0
            r8 = 0
            r16 = 12
            r17 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r8 = 8
            r6 = r16
            r7 = r17
            ak1.C54116w.my0(r1, r2, r3, r4, r5, r6, r7)
        L_0x01ac:
            r1 = 1
            goto L_0x01f9
        L_0x01ae:
            r7 = 8
            tl1.p r1 = r0.f39350a
            r1.mo13434e1(r9)
            android.widget.TextView r1 = r0.f39354e
            if (r1 != 0) goto L_0x01ba
            goto L_0x01ce
        L_0x01ba:
            android.view.ViewGroup r5 = r0.f39351b
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131827871(0x7f111c9f, float:1.9288667E38)
            java.lang.String r5 = r5.getString(r6)
            r1.setText(r5)
        L_0x01ce:
            android.widget.TextView r1 = r0.f39362m
            if (r1 != 0) goto L_0x01d3
            goto L_0x01d6
        L_0x01d3:
            r1.setVisibility(r7)
        L_0x01d6:
            r33.mo13440b()
            di3.d r1 = di3.C86312j.m106911c(r4)
            gy3.C87412m.m108593f(r1, r2)
            ak1.w r1 = (ak1.C54116w) r1
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r5 = 0
            r6 = 0
            r8 = 12
            r16 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = 8
            r7 = r16
            ak1.C54116w.my0(r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
        L_0x01f9:
            if (r10 > r15) goto L_0x01ff
            if (r15 > r14) goto L_0x01ff
            r2 = 1
            goto L_0x0200
        L_0x01ff:
            r2 = 0
        L_0x0200:
            if (r2 == 0) goto L_0x024c
            android.view.View r2 = r0.f39365p
            if (r2 != 0) goto L_0x0208
            goto L_0x0294
        L_0x0208:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r3.mo10233c(r4)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget"
            java.lang.String r21 = "showLotteryDoneUI"
            java.lang.String r22 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget"
            java.lang.String r20 = "showLotteryDoneUI"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0294
        L_0x024c:
            android.view.View r2 = r0.f39365p
            if (r2 != 0) goto L_0x0251
            goto L_0x0294
        L_0x0251:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r4)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget"
            java.lang.String r28 = "showLotteryDoneUI"
            java.lang.String r29 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Z)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget"
            java.lang.String r27 = "showLotteryDoneUI"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Z)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x0294:
            if (r1 == 0) goto L_0x02e9
            android.widget.TextView r2 = r0.f39364o
            if (r2 != 0) goto L_0x029b
            goto L_0x02cf
        L_0x029b:
            android.view.ViewGroup r3 = r0.f39351b
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131827889(0x7f111cb1, float:1.9288703E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "doneContainer.context.re…nder_live_lottery_result)"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r4[r10] = r5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r9)
            java.lang.String r3 = java.lang.String.format(r3, r4)
            java.lang.String r4 = "format(format, *args)"
            gy3.C87412m.m108593f(r3, r4)
            r2.setText(r3)
        L_0x02cf:
            android.widget.TextView r2 = r0.f39364o
            if (r2 == 0) goto L_0x030b
            android.view.View r3 = r0.f39352c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100645(0x7f0603e5, float:1.7813677E38)
            r5 = 0
            int r3 = r3.getColor(r4, r5)
            r2.setTextColor(r3)
            goto L_0x030b
        L_0x02e9:
            r5 = 0
            android.widget.TextView r2 = r0.f39364o
            if (r2 == 0) goto L_0x02f3
            rl1.o0 r3 = rl1.C13064o0.f37206a
            r3.mo12568g(r2)
        L_0x02f3:
            android.widget.TextView r2 = r0.f39364o
            if (r2 == 0) goto L_0x030b
            android.view.View r3 = r0.f39352c
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100646(0x7f0603e6, float:1.781368E38)
            int r3 = r3.getColor(r4, r5)
            r2.setTextColor(r3)
        L_0x030b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "visitorLotteryDone isWin:"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = ",participateCnt:"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ",realWinnerCnt:"
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = ",haveLotteryResult:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C14012y.mo13442d(te3.z21, boolean):void");
    }
}
