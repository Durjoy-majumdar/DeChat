package qj1;

import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;

/* renamed from: qj1.e4 */
public final class C12317e4 extends C12252b {

    /* renamed from: u */
    public static final int f35481u = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);

    /* renamed from: v */
    public static final int f35482v = MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3755d6);

    /* renamed from: q */
    public final C58124b f35483q;

    /* renamed from: r */
    public final C13601g f35484r;

    /* renamed from: s */
    public final C13601g f35485s;

    /* renamed from: t */
    public Runnable f35486t;

    /* renamed from: qj1.e4$a */
    public static final class C12318a {

        /* renamed from: a */
        public final int f35487a;

        /* renamed from: b */
        public final int f35488b;

        /* renamed from: c */
        public final int f35489c;

        /* renamed from: d */
        public final int f35490d;

        public C12318a(int i, int i2, int i3, int i4) {
            this.f35487a = i;
            this.f35488b = i2;
            this.f35489c = i3;
            this.f35490d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12318a)) {
                return false;
            }
            C12318a aVar = (C12318a) obj;
            return this.f35487a == aVar.f35487a && this.f35488b == aVar.f35488b && this.f35489c == aVar.f35489c && this.f35490d == aVar.f35490d;
        }

        public int hashCode() {
            return (((((this.f35487a * 31) + this.f35488b) * 31) + this.f35489c) * 31) + this.f35490d;
        }

        public String toString() {
            return "AnchorLocationSize(posX=" + this.f35487a + ", posY=" + this.f35488b + ", width=" + this.f35489c + ", height=" + this.f35490d + ')';
        }
    }

    /* renamed from: qj1.e4$b */
    public enum C12319b {
        CHARGE_FREE,
        INCREASE_CHARGE_FREE_DURATION
    }

    /* renamed from: qj1.e4$c */
    public static final class C12320c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35494d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12320c(ViewGroup viewGroup) {
            super(0);
            this.f35494d = viewGroup;
        }

        public Object invoke() {
            return Integer.valueOf(C75044y4.m89990b(this.f35494d.getContext()).y);
        }
    }

    /* renamed from: qj1.e4$d */
    public static final class C12321d extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12321d(ViewGroup viewGroup) {
            super(0);
            this.f35495d = viewGroup;
        }

        public Object invoke() {
            TextView textView = new TextView(this.f35495d.getContext());
            ViewGroup viewGroup = this.f35495d;
            textView.setTextColor(textView.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            textView.setTextSize(0, (float) C76577a.m92157h(textView.getContext(), C0966R.dimen.f3957lf));
            textView.setGravity(17);
            textView.setBackgroundResource(C0966R.C0969drawable.bcb);
            viewGroup.setOnClickListener(C12435h4.f35811d);
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12317e4(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35483q = bVar;
        this.f35484r = C36568h.m40985a(new C12320c(viewGroup));
        this.f35485s = C36568h.m40985a(new C12321d(viewGroup));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0222  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11869Z0(qj1.C12317e4 r16, qj1.C12317e4.C12319b r17, int r18, java.lang.String r19, boolean r20, long r21, android.view.View r23, int r24, java.lang.Object r25) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r24 & 8
            r4 = 1
            if (r3 == 0) goto L_0x000d
            r3 = 1
            goto L_0x000f
        L_0x000d:
            r3 = r20
        L_0x000f:
            r5 = r24 & 16
            if (r5 == 0) goto L_0x0016
            r5 = 5000(0x1388, double:2.4703E-320)
            goto L_0x0018
        L_0x0016:
            r5 = r21
        L_0x0018:
            r7 = r24 & 32
            if (r7 == 0) goto L_0x001e
            r7 = 0
            goto L_0x0020
        L_0x001e:
            r7 = r23
        L_0x0020:
            r16.getClass()
            java.lang.String r9 = "type"
            gy3.C87412m.m108594g(r1, r9)
            boolean r9 = r16.mo82893g0()
            java.lang.String r10 = ", type:"
            java.lang.String r11 = "showTips "
            java.lang.String r12 = "FinderLiveBottomTipsLazyPlugin"
            r13 = 0
            if (r9 == 0) goto L_0x0055
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r2)
            r0.append(r10)
            r0.append(r1)
            java.lang.String r1 = ";but is Landscape!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0080
        L_0x0055:
            if (r2 == 0) goto L_0x0060
            int r9 = r19.length()
            if (r9 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r9 = 0
            goto L_0x0061
        L_0x0060:
            r9 = 1
        L_0x0061:
            if (r9 == 0) goto L_0x0083
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r2)
            r0.append(r10)
            r0.append(r1)
            java.lang.String r1 = ";but tip string is empty!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0080:
            r4 = 0
            goto L_0x0236
        L_0x0083:
            r9 = 2
            if (r7 == 0) goto L_0x00ad
            int r14 = r7.getMeasuredHeight()
            if (r14 <= 0) goto L_0x008e
            r14 = 1
            goto L_0x008f
        L_0x008e:
            r14 = 0
        L_0x008f:
            if (r14 == 0) goto L_0x0093
            r14 = r7
            goto L_0x0094
        L_0x0093:
            r14 = 0
        L_0x0094:
            if (r14 == 0) goto L_0x00ad
            int[] r14 = new int[r9]
            r7.getLocationInWindow(r14)
            qj1.e4$a r15 = new qj1.e4$a
            r8 = r14[r13]
            r14 = r14[r4]
            int r4 = r7.getMeasuredWidth()
            int r13 = r7.getMeasuredHeight()
            r15.<init>(r8, r14, r4, r13)
            goto L_0x00ae
        L_0x00ad:
            r15 = 0
        L_0x00ae:
            if (r15 == 0) goto L_0x00eb
            int r8 = r15.f35488b
            if (r8 <= 0) goto L_0x00e7
            int r13 = r15.f35490d
            if (r13 <= 0) goto L_0x00e7
            int r8 = r8 + r13
            rx3.g r13 = r0.f35484r
            rx3.n r13 = (rx3.C36570n) r13
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r8 > r13) goto L_0x00e7
            int r8 = r15.f35488b
            int r13 = r15.f35490d
            int r13 = r13 / r9
            int r8 = r8 + r13
            rx3.g r13 = r0.f35484r
            rx3.n r13 = (rx3.C36570n) r13
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r14 = f35482v
            int r14 = r14 / r9
            int r8 = r8 + r14
            int r13 = r13 - r8
            if (r13 >= 0) goto L_0x017a
            r13 = 0
            goto L_0x017a
        L_0x00e7:
            int r13 = f35481u
            goto L_0x017a
        L_0x00eb:
            java.lang.Class<qj1.jc> r8 = qj1.C12475jc.class
            qj1.c r8 = r0.mo87687E0(r8)
            qj1.jc r8 = (qj1.C12475jc) r8
            if (r8 == 0) goto L_0x0178
            android.view.ViewGroup r13 = r8.f166287d
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            boolean r14 = r13 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r14 == 0) goto L_0x0102
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            goto L_0x0103
        L_0x0102:
            r13 = 0
        L_0x0103:
            if (r13 == 0) goto L_0x0108
            int r13 = r13.bottomMargin
            goto L_0x0109
        L_0x0108:
            r13 = 0
        L_0x0109:
            android.view.ViewGroup r14 = r8.f166287d
            int r14 = r14.getPaddingBottom()
            int r13 = r13 + r14
            android.view.ViewGroup r8 = r8.f166287d
            r14 = 2131304415(0x7f091fdf, float:1.8226972E38)
            android.view.View r8 = r8.findViewById(r14)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            if (r8 == 0) goto L_0x0122
            int r8 = r8.height
            goto L_0x0123
        L_0x0122:
            r8 = 0
        L_0x0123:
            int r14 = r8 / 2
            int r14 = r14 + r13
            int r15 = f35482v
            int r15 = r15 / r9
            int r9 = r14 - r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = "calculateBottomMargin postPlugin postContentMarginBottom:"
            r15.append(r4)
            r15.append(r13)
            java.lang.String r4 = ",postContentHeight:"
            r15.append(r4)
            r15.append(r8)
            java.lang.String r4 = ",baseLine:"
            r15.append(r4)
            r15.append(r14)
            java.lang.String r4 = ",myBottomMargin:"
            r15.append(r4)
            r15.append(r9)
            r4 = 33
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            int r8 = r4.intValue()
            if (r8 <= 0) goto L_0x0168
            r13 = 1
            goto L_0x0169
        L_0x0168:
            r13 = 0
        L_0x0169:
            if (r13 == 0) goto L_0x016d
            r8 = r4
            goto L_0x016e
        L_0x016d:
            r8 = 0
        L_0x016e:
            if (r8 == 0) goto L_0x0175
            int r13 = r8.intValue()
            goto L_0x017a
        L_0x0175:
            int r13 = f35481u
            goto L_0x017a
        L_0x0178:
            int r13 = f35481u
        L_0x017a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r2)
            r4.append(r10)
            r4.append(r1)
            java.lang.String r1 = ", maxShowTimes:"
            r4.append(r1)
            r1 = r18
            r4.append(r1)
            java.lang.String r1 = ", bottomMargin:"
            r4.append(r1)
            r4.append(r13)
            java.lang.String r1 = ", withAnim:"
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ",anchor:"
            r4.append(r1)
            r4.append(r7)
            r1 = 33
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            ok1.e r1 = ok1.C62042e.f176370a
            rx3.g r4 = r0.f35485s
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.mo87010H1(r4)
            android.view.ViewGroup r1 = r0.f166287d
            rx3.g r4 = r0.f35485s
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r8 = -1
            int r9 = f35482v
            r7.<init>(r8, r9)
            r1.addView(r4, r7)
            rx3.g r1 = r0.f35485s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0204
            android.view.ViewGroup r2 = r0.f166287d
            r3 = 0
            r2.setAlpha(r3)
            android.view.ViewGroup r2 = r0.f166287d
            android.view.ViewPropertyAnimator r2 = r2.animate()
            android.view.ViewPropertyAnimator r1 = r2.alpha(r1)
            r1.start()
            goto L_0x0209
        L_0x0204:
            android.view.ViewGroup r2 = r0.f166287d
            r2.setAlpha(r1)
        L_0x0209:
            android.view.ViewGroup r1 = r0.f166287d
            int r2 = r1.getPaddingLeft()
            android.view.ViewGroup r3 = r0.f166287d
            int r3 = r3.getPaddingTop()
            android.view.ViewGroup r4 = r0.f166287d
            int r4 = r4.getPaddingRight()
            r1.setPadding(r2, r3, r4, r13)
            java.lang.Runnable r1 = r0.f35486t
            if (r1 != 0) goto L_0x0227
            qj1.g4 r1 = new qj1.g4
            r1.<init>(r0)
        L_0x0227:
            r0.f35486t = r1
            android.view.ViewGroup r2 = r0.f166287d
            r2.removeCallbacks(r1)
            android.view.ViewGroup r1 = r0.f166287d
            java.lang.Runnable r0 = r0.f35486t
            r1.postDelayed(r0, r5)
            r4 = 1
        L_0x0236:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12317e4.m11869Z0(qj1.e4, qj1.e4$b, int, java.lang.String, boolean, long, android.view.View, int, java.lang.Object):boolean");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
        super.mo10792g(i);
        Log.m105920e("FinderLiveBottomTipsLazyPlugin", "setVisible visible:" + i + ",root.alpha:" + this.f166287d.getAlpha() + ",isShow:" + this.f166287d.isShown() + ",root.parent:" + this.f166287d.getParent() + '!');
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Log.m105920e("FinderLiveBottomTipsLazyPlugin", "unMount!");
        this.f166287d.removeCallbacks(this.f35486t);
        this.f166287d.animate().setListener(new C12380f4(this)).alpha(0.0f).start();
    }
}
