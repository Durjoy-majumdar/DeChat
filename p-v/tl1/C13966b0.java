package tl1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C0654b;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o40.C61926c;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C52204z21;

/* renamed from: tl1.b0 */
public final class C13966b0 {

    /* renamed from: a */
    public final C13998p f39214a;

    /* renamed from: b */
    public final ViewGroup f39215b;

    /* renamed from: c */
    public final View f39216c;

    /* renamed from: d */
    public final View f39217d;

    /* renamed from: e */
    public final String f39218e = "VisitorLotteryCardRunningUI";

    /* renamed from: f */
    public TextView f39219f;

    /* renamed from: g */
    public TextView f39220g;

    /* renamed from: h */
    public TextView f39221h;

    /* renamed from: i */
    public TextView f39222i;

    /* renamed from: j */
    public View f39223j;

    /* renamed from: k */
    public TextView f39224k;

    /* renamed from: l */
    public TextView f39225l;

    public C13966b0(C13998p pVar, ViewGroup viewGroup, View view, View view2) {
        C87412m.m108594g(pVar, "visitorCardPlugin");
        C87412m.m108594g(viewGroup, "runningContainer");
        C87412m.m108594g(view, "cardContainer");
        C87412m.m108594g(view2, "card");
        this.f39214a = pVar;
        this.f39215b = viewGroup;
        this.f39216c = view;
        this.f39217d = view2;
    }

    /* renamed from: a */
    public final Map<String, Object> mo13414a(int i) {
        if (i != 4) {
            if (i == 5 && ((C0696x) this.f39214a.mo87696x0(C0696x.class)).f1643f) {
                i = 7;
            }
        } else if (((C0654b) this.f39214a.mo87696x0(C0654b.class)).mo623c3()) {
            i = 6;
        }
        return C90364q0.m113148g(new C13604l("lottery_attend_type", Integer.valueOf(i)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13415b() {
        /*
            r6 = this;
            java.lang.Class<rl1.d0> r0 = rl1.C13022d0.class
            tl1.p r1 = r6.f39214a
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r0)
            rl1.d0 r1 = (rl1.C13022d0) r1
            al1.q r1 = r1.f37098n
            r2 = 0
            if (r1 == 0) goto L_0x0016
            int r1 = r1.f506a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            r3 = 2131827047(0x7f111967, float:1.9286996E38)
            if (r1 != 0) goto L_0x001e
            goto L_0x0122
        L_0x001e:
            int r1 = r1.intValue()
            r4 = 1
            if (r1 != r4) goto L_0x0122
            tl1.p r1 = r6.f39214a
            androidx.lifecycle.i0 r0 = r1.mo87696x0(r0)
            rl1.d0 r0 = (rl1.C13022d0) r0
            al1.q r0 = r0.f37098n
            if (r0 == 0) goto L_0x0040
            te3.z21 r0 = r0.f509d
            if (r0 == 0) goto L_0x0040
            te3.u21 r0 = r0.f145645i
            if (r0 == 0) goto L_0x0040
            int r0 = r0.f142563d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 != 0) goto L_0x0044
            goto L_0x004b
        L_0x0044:
            int r1 = r0.intValue()
            if (r1 != r4) goto L_0x004b
            goto L_0x0057
        L_0x004b:
            r1 = 3
            if (r0 != 0) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            int r5 = r0.intValue()
            if (r5 != r1) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x005f
            goto L_0x0132
        L_0x005f:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r3 = 2131827048(0x7f111968, float:1.9286998E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0132
        L_0x006f:
            r1 = 2
            if (r0 != 0) goto L_0x0073
            goto L_0x008f
        L_0x0073:
            int r4 = r0.intValue()
            if (r4 != r1) goto L_0x008f
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x007f
            goto L_0x0132
        L_0x007f:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r3 = 2131827050(0x7f11196a, float:1.9287002E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0132
        L_0x008f:
            r1 = 4
            if (r0 != 0) goto L_0x0093
            goto L_0x00d1
        L_0x0093:
            int r4 = r0.intValue()
            if (r4 != r1) goto L_0x00d1
            tl1.p r0 = r6.f39214a
            java.lang.Class<cl1.b> r1 = cl1.C0654b.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
            cl1.b r0 = (cl1.C0654b) r0
            boolean r0 = r0.mo623c3()
            if (r0 == 0) goto L_0x00bc
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x00af
            goto L_0x0132
        L_0x00af:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0132
        L_0x00bc:
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x00c2
            goto L_0x0132
        L_0x00c2:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r3 = 2131827049(0x7f111969, float:1.9287E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0132
        L_0x00d1:
            r1 = 5
            if (r0 != 0) goto L_0x00d5
            goto L_0x0111
        L_0x00d5:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0111
            tl1.p r0 = r6.f39214a
            java.lang.Class<cl1.x> r1 = cl1.C0696x.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r1)
            cl1.x r0 = (cl1.C0696x) r0
            boolean r0 = r0.f1643f
            if (r0 == 0) goto L_0x00fd
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x00ee
            goto L_0x0132
        L_0x00ee:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r3 = 2131827782(0x7f111c46, float:1.9288486E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0132
        L_0x00fd:
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x0102
            goto L_0x0132
        L_0x0102:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r3 = 2131827781(0x7f111c45, float:1.9288484E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0132
        L_0x0111:
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x0116
            goto L_0x0132
        L_0x0116:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0132
        L_0x0122:
            android.widget.TextView r0 = r6.f39224k
            if (r0 != 0) goto L_0x0127
            goto L_0x0132
        L_0x0127:
            android.content.res.Resources r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
        L_0x0132:
            android.view.View r0 = r6.f39217d
            if (r0 == 0) goto L_0x0144
            r1 = 2131302543(0x7f09188f, float:1.8223175E38)
            android.widget.TextView r3 = r6.f39224k
            if (r3 == 0) goto L_0x0141
            java.lang.CharSequence r2 = r3.getText()
        L_0x0141:
            r0.setTag(r1, r2)
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl1.C13966b0.mo13415b():void");
    }

    /* renamed from: c */
    public final void mo13416c(int i) {
        Drawable drawable = this.f39215b.getContext().getResources().getDrawable(i);
        drawable.setBounds(0, 0, C76577a.m92151b(this.f39215b.getContext(), 21), C76577a.m92151b(this.f39215b.getContext(), 20));
        TextView textView = this.f39224k;
        if (textView != null) {
            textView.setCompoundDrawablePadding(C76577a.m92151b(this.f39215b.getContext(), 4));
        }
        TextView textView2 = this.f39224k;
        if (textView2 != null) {
            textView2.setPadding(C76577a.m92151b(this.f39215b.getContext(), 16), 0, C76577a.m92151b(this.f39215b.getContext(), 16), 0);
        }
        TextView textView3 = this.f39224k;
        if (textView3 != null) {
            textView3.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: d */
    public final void mo13417d(C52204z21 z212) {
        C52204z21 z213 = z212;
        C87412m.m108594g(z213, "lotteryInfo");
        TextView textView = this.f39219f;
        if (textView != null) {
            textView.setText(z213.f145644h);
        }
        View view = this.f39217d;
        if (view != null) {
            TextView textView2 = this.f39219f;
            view.setTag(C0966R.C0970id.d4f, textView2 != null ? textView2.getText() : null);
        }
        TextView textView3 = this.f39220g;
        if (textView3 != null) {
            textView3.setText(this.f39215b.getContext().getResources().getString(C0966R.string.mn4, new Object[]{Integer.valueOf(z213.f145646j)}));
        }
        if (z213.f145647n > 0) {
            TextView textView4 = this.f39222i;
            if (textView4 != null) {
                String string = this.f39215b.getContext().getResources().getString(C0966R.string.dsl);
                C87412m.m108593f(string, "runningContainer.context…nder_live_lottery_attend)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(z213.f145647n)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                textView4.setText(format);
            }
            TextView textView5 = this.f39222i;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            View view2 = this.f39223j;
            if (view2 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate-6", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate-6", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view4 = this.f39217d;
            if (view4 != null) {
                TextView textView6 = this.f39222i;
                view4.setTag(C0966R.C0970id.d4g, textView6 != null ? textView6.getText() : null);
            }
        } else {
            TextView textView7 = this.f39222i;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            View view5 = this.f39223j;
            if (view5 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate-6", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing$updateParticipate-6", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view7 = this.f39217d;
            if (view7 != null) {
                view7.setTag(C0966R.C0970id.d4g, "");
            }
        }
        TextView textView8 = this.f39221h;
        if (textView8 != null) {
            textView8.setText(this.f39215b.getContext().getResources().getString(C0966R.string.dsi));
        }
        View view8 = this.f39217d;
        if (view8 != null) {
            TextView textView9 = this.f39221h;
            view8.setTag(C0966R.C0970id.d4h, textView9 != null ? textView9.getText() : null);
        }
        if (C61926c.m72696u(z213.f145649p, 1)) {
            TextView textView10 = this.f39225l;
            if (textView10 != null) {
                textView10.setVisibility(0);
            }
            TextView textView11 = this.f39225l;
            if (textView11 != null) {
                textView11.setText(this.f39215b.getContext().getResources().getString(C0966R.string.dgs));
            }
            View view9 = this.f39217d;
            if (view9 != null) {
                TextView textView12 = this.f39225l;
                view9.setTag(C0966R.C0970id.d4d, textView12 != null ? textView12.getText() : null);
            }
            TextView textView13 = this.f39224k;
            if (textView13 != null) {
                textView13.setVisibility(8);
            }
        } else {
            TextView textView14 = this.f39225l;
            if (textView14 != null) {
                textView14.setVisibility(8);
            }
            View view10 = this.f39217d;
            if (view10 != null) {
                view10.setTag(C0966R.C0970id.d4d, "");
            }
            mo13415b();
            TextView textView15 = this.f39224k;
            if (textView15 != null) {
                textView15.setVisibility(0);
            }
            TextView textView16 = this.f39224k;
            if (textView16 != null) {
                textView16.setEnabled(false);
            }
            TextView textView17 = this.f39224k;
            if (textView17 != null) {
                textView17.setCompoundDrawablePadding(0);
            }
            TextView textView18 = this.f39224k;
            if (textView18 != null) {
                textView18.setPadding(0, 0, 0, 0);
            }
            TextView textView19 = this.f39224k;
            if (textView19 != null) {
                textView19.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            TextView textView20 = this.f39224k;
            if (textView20 != null) {
                textView20.setTextColor(this.f39215b.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_1_5));
            }
        }
        View view11 = this.f39216c;
        if (view11 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget", "visitorLotteryComputing", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f39214a.mo10792g(0);
    }
}
