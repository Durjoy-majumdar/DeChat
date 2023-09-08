package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.widget.BaseAdapter;
import bl3.C39818r;
import c81.C39904a;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.LinkedList;
import java.util.List;
import te3.pa4;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.v */
public class C41377v extends BaseAdapter {

    /* renamed from: d */
    public Context f111404d;

    /* renamed from: e */
    public String f111405e;

    /* renamed from: f */
    public boolean f111406f;

    /* renamed from: g */
    public LinkedList<LinkedList<pa4>> f111407g;

    public C41377v(Context context, String str) {
        this.f111404d = context;
        this.f111405e = str;
        this.f111406f = C75592q0.m90789s().equals(str);
        this.f111407g = ((C39904a) C39818r.f106831a.mo62443b(context).mo75002a(C39904a.class)).f106991g;
    }

    public int getCount() {
        if (Util.isNullOrNil((List) this.f111407g)) {
            return 2;
        }
        return this.f111407g.size() + 2;
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i <= 0 || Util.isNullOrNil((List) this.f111407g) || i > this.f111407g.size()) {
            return this.f111406f ? 2 : 3;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02f7, code lost:
        if (r10.intValue() >= 3) goto L_0x02f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06f8  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x086b  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x088b  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0890  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            java.lang.Class<c81.a> r2 = c81.C39904a.class
            int r3 = r28.getItemViewType(r29)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 3
            if (r30 != 0) goto L_0x0187
            bl3.r r8 = bl3.C39818r.f106831a
            android.content.Context r9 = r1.f111404d
            bl3.r$a r8 = r8.mo62443b(r9)
            androidx.lifecycle.i0 r8 = r8.mo75002a(r2)
            c81.a r8 = (c81.C39904a) r8
            r9 = 2131297263(0x7f0903ef, float:1.8212466E38)
            if (r3 == 0) goto L_0x00c0
            if (r3 == r6) goto L_0x007e
            if (r3 == r4) goto L_0x0053
            if (r3 == r7) goto L_0x002f
            r8.getClass()
            r9 = r5
            goto L_0x0189
        L_0x002f:
            androidx.appcompat.app.AppCompatActivity r9 = r8.getActivity()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131494278(0x7f0c0586, float:1.861206E38)
            android.view.View r9 = r9.inflate(r10, r5)
            c81.a$a r10 = new c81.a$a
            r10.<init>(r8)
            r8 = 2131296677(0x7f0901a5, float:1.8211277E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r10.f106994a = r8
            r9.setTag(r10)
            goto L_0x0189
        L_0x0053:
            androidx.appcompat.app.AppCompatActivity r9 = r8.getActivity()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            r10 = 2131494280(0x7f0c0588, float:1.8612064E38)
            android.view.View r9 = r9.inflate(r10, r5)
            c81.a$c r10 = new c81.a$c
            r10.<init>(r8)
            r8 = 2131305077(0x7f092275, float:1.8228315E38)
            android.view.View r8 = r9.findViewById(r8)
            r10.f106999a = r8
            r8 = 2131301128(0x7f091308, float:1.8220305E38)
            android.view.View r8 = r9.findViewById(r8)
            r10.f107000b = r8
            r9.setTag(r10)
            goto L_0x0189
        L_0x007e:
            androidx.appcompat.app.AppCompatActivity r10 = r8.getActivity()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r11 = 2131494283(0x7f0c058b, float:1.861207E38)
            android.view.View r10 = r10.inflate(r11, r5)
            c81.a$b r11 = new c81.a$b
            r11.<init>(r8)
            android.view.View r8 = r10.findViewById(r9)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r11.f106995a = r8
            r8 = 2131297251(0x7f0903e3, float:1.8212442E38)
            android.view.View r8 = r10.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r11.f106996b = r8
            r8 = 2131297245(0x7f0903dd, float:1.821243E38)
            android.view.View r8 = r10.findViewById(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r8 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r8
            r11.f106997c = r8
            r8 = 2131297253(0x7f0903e5, float:1.8212446E38)
            android.view.View r8 = r10.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f106998d = r8
            r10.setTag(r11)
            goto L_0x0185
        L_0x00c0:
            androidx.appcompat.app.AppCompatActivity r10 = r8.getActivity()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r11 = 2131494282(0x7f0c058a, float:1.8612068E38)
            android.view.View r10 = r10.inflate(r11, r5)
            c81.a$d r11 = new c81.a$d
            r11.<init>(r8)
            r8 = 2131301753(0x7f091579, float:1.8221573E38)
            android.view.View r8 = r10.findViewById(r8)
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.ImageView"
            gy3.C87412m.m108592e(r8, r12)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r11.f107001a = r8
            r8 = 2131300712(0x7f091168, float:1.8219461E38)
            android.view.View r8 = r10.findViewById(r8)
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.TextView"
            gy3.C87412m.m108592e(r8, r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f107003c = r8
            r8 = 2131315452(0x7f094afc, float:1.8249358E38)
            android.view.View r8 = r10.findViewById(r8)
            gy3.C87412m.m108592e(r8, r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f107004d = r8
            r8 = 2131301749(0x7f091575, float:1.8221565E38)
            android.view.View r8 = r10.findViewById(r8)
            gy3.C87412m.m108592e(r8, r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f107006f = r8
            r8 = 2131301755(0x7f09157b, float:1.8221577E38)
            android.view.View r8 = r10.findViewById(r8)
            gy3.C87412m.m108592e(r8, r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f107002b = r8
            r8 = 2131301722(0x7f09155a, float:1.822151E38)
            android.view.View r8 = r10.findViewById(r8)
            gy3.C87412m.m108592e(r8, r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f107005e = r8
            android.view.View r8 = r10.findViewById(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.widget.LinearLayout"
            gy3.C87412m.m108592e(r8, r9)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r11.f107007g = r8
            r8 = 2131297262(0x7f0903ee, float:1.8212464E38)
            android.view.View r8 = r10.findViewById(r8)
            r11.f107008h = r8
            r8 = 2131315451(0x7f094afb, float:1.8249356E38)
            android.view.View r8 = r10.findViewById(r8)
            r11.f107009i = r8
            r8 = 2131301748(0x7f091574, float:1.8221563E38)
            android.view.View r8 = r10.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r11.f107010j = r8
            r8 = 2131317123(0x7f095183, float:1.8252747E38)
            android.view.View r8 = r10.findViewById(r8)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r8, r9)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r11.f107011k = r8
            r8 = 2131315787(0x7f094c4b, float:1.8250037E38)
            android.view.View r8 = r10.findViewById(r8)
            gy3.C87412m.m108592e(r8, r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f107012l = r8
            r8 = 2131315756(0x7f094c2c, float:1.8249974E38)
            android.view.View r8 = r10.findViewById(r8)
            gy3.C87412m.m108592e(r8, r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r11.f107013m = r8
            r10.setTag(r11)
        L_0x0185:
            r9 = r10
            goto L_0x0189
        L_0x0187:
            r9 = r30
        L_0x0189:
            bl3.r r8 = bl3.C39818r.f106831a
            android.content.Context r10 = r1.f111404d
            bl3.r$a r10 = r8.mo62443b(r10)
            androidx.lifecycle.i0 r2 = r10.mo75002a(r2)
            c81.a r2 = (c81.C39904a) r2
            java.lang.String r15 = r1.f111405e
            r2.getClass()
            java.lang.Class<yk3.d> r10 = yk3.C53531d.class
            java.lang.Class<kr0.w0> r11 = kr0.C76629w0.class
            java.lang.String r12 = "itemView"
            gy3.C87412m.m108594g(r9, r12)
            java.lang.String r12 = "username"
            gy3.C87412m.m108594g(r15, r12)
            java.lang.String r14 = "SimpleUIComponent"
            r13 = 8
            r5 = 0
            if (r3 == 0) goto L_0x0575
            if (r3 == r6) goto L_0x0227
            if (r3 == r4) goto L_0x01fe
            if (r3 == r7) goto L_0x01ba
            goto L_0x056f
        L_0x01ba:
            java.lang.Object r0 = r9.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.exdevice.uic.SportProfileUIC.AddFollowBtnViewHolder"
            gy3.C87412m.m108592e(r0, r3)
            c81.a$a r0 = (c81.C39904a.C39905a) r0
            java.lang.String r3 = eb0.C75592q0.m90789s()
            boolean r3 = gy3.C87412m.m108589b(r15, r3)
            if (r3 != 0) goto L_0x01f2
            te3.hb2 r3 = r2.f106990f
            if (r3 == 0) goto L_0x01d8
            boolean r3 = r3.f134549r
            if (r3 != r6) goto L_0x01d8
            goto L_0x01d9
        L_0x01d8:
            r6 = 0
        L_0x01d9:
            if (r6 != 0) goto L_0x01f2
            android.widget.TextView r3 = r0.f106994a
            if (r3 != 0) goto L_0x01e0
            goto L_0x01e3
        L_0x01e0:
            r3.setVisibility(r5)
        L_0x01e3:
            android.widget.TextView r0 = r0.f106994a
            if (r0 == 0) goto L_0x01fa
            c81.i r3 = new c81.i
            r3.<init>(r2)
            r0.setOnClickListener(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x01fa
        L_0x01f2:
            android.widget.TextView r0 = r0.f106994a
            if (r0 != 0) goto L_0x01f7
            goto L_0x01fa
        L_0x01f7:
            r0.setVisibility(r13)
        L_0x01fa:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0571
        L_0x01fe:
            java.lang.Object r0 = r9.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.exdevice.uic.SportProfileUIC.OtherBtnViewHolder"
            gy3.C87412m.m108592e(r0, r3)
            c81.a$c r0 = (c81.C39904a.C39907c) r0
            android.view.View r3 = r0.f107000b
            if (r3 == 0) goto L_0x0217
            c81.g r4 = new c81.g
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0217:
            android.view.View r0 = r0.f106999a
            if (r0 == 0) goto L_0x0571
            c81.h r3 = new c81.h
            r3.<init>(r2)
            r0.setOnClickListener(r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0571
        L_0x0227:
            java.lang.Object r3 = r9.getTag()
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.exdevice.uic.SportProfileUIC.GoalViewHolder"
            gy3.C87412m.m108592e(r3, r8)
            c81.a$b r3 = (c81.C39904a.C39906b) r3
            java.util.LinkedList<java.util.LinkedList<te3.pa4>> r8 = r2.f106991g
            if (r8 == 0) goto L_0x023f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x023d
            goto L_0x023f
        L_0x023d:
            r8 = 0
            goto L_0x0240
        L_0x023f:
            r8 = 1
        L_0x0240:
            if (r8 != 0) goto L_0x056f
            java.util.LinkedList<java.util.LinkedList<te3.pa4>> r8 = r2.f106991g
            int r8 = r8.size()
            if (r0 > r8) goto L_0x056f
            java.util.LinkedList<java.util.LinkedList<te3.pa4>> r8 = r2.f106991g
            int r0 = r0 - r6
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r8 = "sportRecordList[position - 1]"
            gy3.C87412m.m108593f(r0, r8)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x0571
            android.widget.LinearLayout r8 = r3.f106995a
            if (r8 == 0) goto L_0x026b
            int r8 = r8.getChildCount()
            if (r8 != 0) goto L_0x026b
            r8 = 1
            goto L_0x026c
        L_0x026b:
            r8 = 0
        L_0x026c:
            if (r8 != 0) goto L_0x0270
            goto L_0x0571
        L_0x0270:
            java.lang.Object r8 = r0.get(r5)
            java.lang.String r10 = "list[0]"
            gy3.C87412m.m108593f(r8, r10)
            te3.pa4 r8 = (te3.pa4) r8
            int r10 = r8.f139686o
            r13 = 2131099806(0x7f06009e, float:1.7811976E38)
            r12 = 2131494284(0x7f0c058c, float:1.8612072E38)
            if (r10 != 0) goto L_0x045e
            java.lang.String r10 = r8.f139678d
            java.lang.String r15 = "21f9d636b41b25be"
            boolean r10 = gy3.C87412m.m108589b(r15, r10)
            if (r10 != 0) goto L_0x02a1
            di3.d r7 = di3.C86312j.m106911c(r11)
            kr0.w0 r7 = (kr0.C76629w0) r7
            java.lang.String r10 = r8.f139678d
            c81.c r11 = new c81.c
            r11.<init>(r2, r3)
            r7.Ws0(r10, r11)
            goto L_0x044e
        L_0x02a1:
            android.widget.TextView r10 = r3.f106998d
            if (r10 == 0) goto L_0x02ad
            r15 = 2131837361(0x7f1141b1, float:1.9307915E38)
            r10.setText(r15)
            rx3.b0 r10 = rx3.C13598b0.f38549a
        L_0x02ad:
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = r3.f106997c
            if (r10 == 0) goto L_0x02b9
            r15 = 2131756220(0x7f1004bc, float:1.9143341E38)
            r10.setImageResource(r15)
            rx3.b0 r10 = rx3.C13598b0.f38549a
        L_0x02b9:
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = r3.f106997c
            if (r10 == 0) goto L_0x02ca
            android.app.Activity r15 = r2.getContext()
            int r13 = kg3.C76577a.m92153d(r15, r13)
            r10.setColorFilter(r13)
            rx3.b0 r10 = rx3.C13598b0.f38549a
        L_0x02ca:
            te3.hb2 r10 = r2.f106990f
            if (r10 == 0) goto L_0x02db
            java.util.LinkedList<te3.oa4> r10 = r10.f134537A
            if (r10 == 0) goto L_0x02db
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r6
            if (r10 != r6) goto L_0x02db
            r10 = 1
            goto L_0x02dc
        L_0x02db:
            r10 = 0
        L_0x02dc:
            if (r10 != 0) goto L_0x02f9
            te3.hb2 r10 = r2.f106990f
            if (r10 == 0) goto L_0x02ef
            java.util.LinkedList<te3.oa4> r10 = r10.f134537A
            if (r10 == 0) goto L_0x02ef
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x02f0
        L_0x02ef:
            r10 = 0
        L_0x02f0:
            gy3.C87412m.m108591d(r10)
            int r10 = r10.intValue()
            if (r10 < r7) goto L_0x043e
        L_0x02f9:
            androidx.appcompat.app.AppCompatActivity r7 = r2.getActivity()
            android.view.LayoutInflater r7 = r7.getLayoutInflater()
            r10 = 2131494281(0x7f0c0589, float:1.8612066E38)
            android.widget.LinearLayout r13 = r3.f106995a
            android.view.View r7 = r7.inflate(r10, r13, r5)
            if (r7 == 0) goto L_0x0438
            r10 = 2131314265(0x7f094659, float:1.824695E38)
            android.view.View r10 = r7.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            te3.hb2 r13 = r2.f106990f
            if (r13 == 0) goto L_0x031c
            java.util.LinkedList<te3.oa4> r13 = r13.f134537A
            goto L_0x031d
        L_0x031c:
            r13 = 0
        L_0x031d:
            if (r13 == 0) goto L_0x03e7
            java.util.Iterator r14 = r13.iterator()
        L_0x0323:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x03e3
            java.lang.Object r15 = r14.next()
            te3.oa4 r15 = (te3.oa4) r15
            androidx.appcompat.app.AppCompatActivity r18 = r2.getActivity()
            android.view.LayoutInflater r6 = r18.getLayoutInflater()
            android.widget.LinearLayout r4 = r3.f106995a
            android.view.View r4 = r6.inflate(r12, r4, r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x034d
            r6 = 2131311996(0x7f093d7c, float:1.8242348E38)
            android.view.View r19 = r4.findViewById(r6)
            android.widget.TextView r19 = (android.widget.TextView) r19
            r6 = r19
            goto L_0x034e
        L_0x034d:
            r6 = 0
        L_0x034e:
            r12 = 1096810496(0x41600000, float:14.0)
            if (r6 == 0) goto L_0x035c
            java.lang.String r5 = r15.f139074j
            r6.setText(r5)
            r2.mo62523d3(r6, r12)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x035c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r13
            double r12 = r15.f139070f
            int r12 = (int) r12
            r5.append(r12)
            r12 = 47
            r5.append(r12)
            double r12 = r15.f139071g
            int r12 = (int) r12
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            if (r4 == 0) goto L_0x03bd
            r12 = 2131311997(0x7f093d7d, float:1.824235E38)
            android.view.View r13 = r4.findViewById(r12)
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r13 == 0) goto L_0x03bd
            r13.setText(r5)
            android.text.TextPaint r5 = r13.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r5)
            int r5 = r15.f139072h
            if (r5 == 0) goto L_0x03a4
            r12 = 1
            if (r5 == r12) goto L_0x03a0
            r12 = 2
            if (r5 == r12) goto L_0x039c
            r5 = 2131100166(0x7f060206, float:1.7812706E38)
            goto L_0x03a7
        L_0x039c:
            r5 = 2131100472(0x7f060338, float:1.7813326E38)
            goto L_0x03a7
        L_0x03a0:
            r5 = 2131100473(0x7f060339, float:1.7813328E38)
            goto L_0x03a7
        L_0x03a4:
            r5 = 2131100474(0x7f06033a, float:1.781333E38)
        L_0x03a7:
            android.content.Context r12 = r13.getContext()
            android.content.res.Resources r12 = r12.getResources()
            int r5 = r12.getColor(r5)
            r13.setTextColor(r5)
            r5 = 1099431936(0x41880000, float:17.0)
            r2.mo62523d3(r13, r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x03bd:
            if (r4 == 0) goto L_0x03c9
            r5 = 2131312008(0x7f093d88, float:1.8242372E38)
            android.view.View r12 = r4.findViewById(r5)
            android.widget.TextView r12 = (android.widget.TextView) r12
            goto L_0x03ca
        L_0x03c9:
            r12 = 0
        L_0x03ca:
            if (r12 == 0) goto L_0x03d8
            java.lang.String r5 = r15.f139075n
            r12.setText(r5)
            r5 = 1096810496(0x41600000, float:14.0)
            r2.mo62523d3(r12, r5)
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x03d8:
            r10.addView(r4)
            r13 = r6
            r5 = 0
            r6 = 1
            r12 = 2131494284(0x7f0c058c, float:1.8612072E38)
            goto L_0x0323
        L_0x03e3:
            r6 = r13
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x03e8
        L_0x03e7:
            r6 = r13
        L_0x03e8:
            r4 = 2131305701(0x7f0924e5, float:1.822958E38)
            android.view.View r4 = r7.findViewById(r4)
            com.tencent.mm.plugin.exdevice.ui.ColorfulCircleProgress r4 = (com.tencent.p014mm.plugin.exdevice.p042ui.ColorfulCircleProgress) r4
            if (r4 == 0) goto L_0x042e
            if (r6 == 0) goto L_0x042c
            java.util.Iterator r5 = r6.iterator()
        L_0x03f9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x042a
            java.lang.Object r6 = r5.next()
            te3.oa4 r6 = (te3.oa4) r6
            int r10 = r6.f139072h
            double r12 = r6.f139070f
            double r14 = r6.f139071g
            r6 = 1135869952(0x43b40000, float:360.0)
            r30 = r5
            double r5 = (double) r6
            double r12 = r12 / r14
            double r5 = r5 * r12
            int r5 = (int) r5
            if (r10 == 0) goto L_0x0425
            r6 = 1
            if (r10 == r6) goto L_0x0422
            r6 = 2
            if (r10 == r6) goto L_0x041f
            r4.f312585g = r5
            goto L_0x0427
        L_0x041f:
            r4.f312585g = r5
            goto L_0x0427
        L_0x0422:
            r4.f312584f = r5
            goto L_0x0427
        L_0x0425:
            r4.f312583e = r5
        L_0x0427:
            r5 = r30
            goto L_0x03f9
        L_0x042a:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x042c:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x042e:
            android.widget.LinearLayout r4 = r3.f106995a
            if (r4 == 0) goto L_0x043e
            r4.addView(r7)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x043e
        L_0x0438:
            java.lang.String r4 = "updateItemView: goalLayout is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r4)
        L_0x043e:
            di3.d r4 = di3.C86312j.m106911c(r11)
            kr0.w0 r4 = (kr0.C76629w0) r4
            java.lang.String r5 = r8.f139678d
            c81.d r6 = new c81.d
            r6.<init>(r2, r3)
            r4.Ws0(r5, r6)
        L_0x044e:
            android.widget.LinearLayout r4 = r3.f106996b
            if (r4 == 0) goto L_0x04e3
            c81.e r5 = new c81.e
            r5.<init>(r8, r2)
            r4.setOnClickListener(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x04e3
        L_0x045e:
            r4 = 1
            if (r10 != r4) goto L_0x04e3
            android.widget.TextView r5 = r3.f106998d
            if (r5 != 0) goto L_0x0466
            goto L_0x046b
        L_0x0466:
            java.lang.String r6 = r8.f139679e
            r5.setText(r6)
        L_0x046b:
            hc0.c$b r5 = new hc0.c$b
            r5.<init>()
            r5.f59345a = r4
            r5.f59346b = r4
            r5.f59364t = r4
            hc0.c r4 = r5.mo32666a()
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r6 = r8.f139685n
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = r3.f106997c
            r5.mo32519h(r6, r7, r4)
            java.lang.String r4 = r8.f139684j
            if (r4 == 0) goto L_0x0492
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0490
            goto L_0x0492
        L_0x0490:
            r4 = 0
            goto L_0x0493
        L_0x0492:
            r4 = 1
        L_0x0493:
            if (r4 != 0) goto L_0x04e3
            org.json.JSONObject r4 = new org.json.JSONObject
            java.lang.String r5 = r8.f139684j
            r4.<init>(r5)
            java.lang.String r5 = "jump_type"
            int r12 = r4.optInt(r5)
            if (r12 == 0) goto L_0x04a6
            r11 = 1
            goto L_0x04a7
        L_0x04a6:
            r11 = 0
        L_0x04a7:
            android.app.Activity r5 = r2.getContext()
            android.widget.TextView r6 = r3.f106998d
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = r3.f106997c
            java.lang.String r10 = "context"
            gy3.C87412m.m108594g(r5, r10)
            if (r11 == 0) goto L_0x04be
            r10 = 2131099851(0x7f0600cb, float:1.7812067E38)
            int r5 = kg3.C76577a.m92153d(r5, r10)
            goto L_0x04c2
        L_0x04be:
            int r5 = kg3.C76577a.m92153d(r5, r13)
        L_0x04c2:
            d81.d r10 = new d81.d
            r10.<init>(r6, r5, r7)
            zp3.C23564m.m28136f(r10)
            android.widget.LinearLayout r5 = r3.f106996b
            if (r5 == 0) goto L_0x04e3
            c81.f r6 = new c81.f
            r10 = r6
            r7 = 2131494284(0x7f0c058c, float:1.8612072E38)
            r13 = r4
            r14 = r2
            r4 = r15
            r15 = r8
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r5.setOnClickListener(r6)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x04e6
        L_0x04e3:
            r7 = 2131494284(0x7f0c058c, float:1.8612072E38)
        L_0x04e6:
            java.util.Iterator r0 = r0.iterator()
        L_0x04ea:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x056f
            java.lang.Object r4 = r0.next()
            te3.pa4 r4 = (te3.pa4) r4
            java.lang.String r5 = r4.f139681g
            if (r5 == 0) goto L_0x0503
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0501
            goto L_0x0503
        L_0x0501:
            r5 = 0
            goto L_0x0504
        L_0x0503:
            r5 = 1
        L_0x0504:
            if (r5 != 0) goto L_0x04ea
            androidx.appcompat.app.AppCompatActivity r5 = r2.getActivity()
            android.view.LayoutInflater r5 = r5.getLayoutInflater()
            android.widget.LinearLayout r6 = r3.f106995a
            r8 = 0
            android.view.View r5 = r5.inflate(r7, r6, r8)
            if (r5 == 0) goto L_0x0521
            r6 = 2131311996(0x7f093d7c, float:1.8242348E38)
            android.view.View r8 = r5.findViewById(r6)
            android.widget.TextView r8 = (android.widget.TextView) r8
            goto L_0x0525
        L_0x0521:
            r6 = 2131311996(0x7f093d7c, float:1.8242348E38)
            r8 = 0
        L_0x0525:
            if (r8 != 0) goto L_0x0528
            goto L_0x052d
        L_0x0528:
            java.lang.String r10 = r4.f139681g
            r8.setText(r10)
        L_0x052d:
            r8 = 2131311997(0x7f093d7d, float:1.824235E38)
            if (r5 == 0) goto L_0x054c
            android.view.View r10 = r5.findViewById(r8)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x054c
            int r11 = r4.f139682h
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r10.setText(r11)
            android.text.TextPaint r10 = r10.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r10)
            rx3.b0 r10 = rx3.C13598b0.f38549a
        L_0x054c:
            if (r5 == 0) goto L_0x0558
            r10 = 2131312008(0x7f093d88, float:1.8242372E38)
            android.view.View r11 = r5.findViewById(r10)
            android.widget.TextView r11 = (android.widget.TextView) r11
            goto L_0x055c
        L_0x0558:
            r10 = 2131312008(0x7f093d88, float:1.8242372E38)
            r11 = 0
        L_0x055c:
            if (r11 != 0) goto L_0x055f
            goto L_0x0564
        L_0x055f:
            java.lang.String r4 = r4.f139683i
            r11.setText(r4)
        L_0x0564:
            android.widget.LinearLayout r4 = r3.f106995a
            if (r4 == 0) goto L_0x04ea
            r4.addView(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x04ea
        L_0x056f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0571:
            r17 = r9
            goto L_0x08a2
        L_0x0575:
            r4 = r15
            java.lang.Object r0 = r9.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.exdevice.uic.SportProfileUIC.ProfileViewHolder"
            gy3.C87412m.m108592e(r0, r3)
            r3 = r0
            c81.a$d r3 = (c81.C39904a.C39908d) r3
            java.lang.Class<ln.f> r0 = p196ln.C76705f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.f r0 = (p196ln.C76705f) r0
            android.widget.ImageView r5 = r3.f107001a
            r0.mo106849z(r5, r4)
            android.widget.TextView r0 = r3.f107004d
            if (r0 == 0) goto L_0x0598
            android.text.TextPaint r0 = r0.getPaint()
            goto L_0x0599
        L_0x0598:
            r0 = 0
        L_0x0599:
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r0)
            android.widget.TextView r0 = r3.f107002b
            if (r0 != 0) goto L_0x05a1
            goto L_0x05b0
        L_0x05a1:
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            java.lang.String r5 = r5.getDisplayName(r4)
            r0.setText(r5)
        L_0x05b0:
            android.widget.TextView r0 = r3.f107003c
            if (r0 != 0) goto L_0x05b5
            goto L_0x05cc
        L_0x05b5:
            androidx.appcompat.app.AppCompatActivity r5 = r2.getActivity()
            r6 = 2131830311(0x7f112627, float:1.9293616E38)
            java.lang.String r5 = r5.getString(r6)
            int r6 = eb0.C31543z5.m39455e()
            long r6 = (long) r6
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r5, r6)
            r0.setText(r5)
        L_0x05cc:
            android.widget.TextView r0 = r3.f107003c
            if (r0 == 0) goto L_0x05da
            c81.j r5 = new c81.j
            r5.<init>(r2, r4)
            r0.setOnClickListener(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05da:
            te3.hb2 r0 = r2.f106990f
            if (r0 == 0) goto L_0x05ed
            java.util.LinkedList<te3.kb4> r0 = r0.f134547p
            if (r0 == 0) goto L_0x05ed
            java.lang.Object r0 = sx3.C110818d0.m150925W(r0)
            te3.kb4 r0 = (te3.kb4) r0
            if (r0 == 0) goto L_0x05ed
            int r0 = r0.f136649e
            goto L_0x05ee
        L_0x05ed:
            r0 = 0
        L_0x05ee:
            android.widget.TextView r5 = r3.f107005e
            if (r5 != 0) goto L_0x05f3
            goto L_0x05fa
        L_0x05f3:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            r5.setText(r6)
        L_0x05fa:
            r5 = 10000(0x2710, float:1.4013E-41)
            if (r0 < r5) goto L_0x0617
            android.widget.TextView r0 = r3.f107005e
            if (r0 == 0) goto L_0x062f
            androidx.appcompat.app.AppCompatActivity r5 = r2.getActivity()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100485(0x7f060345, float:1.7813353E38)
            int r5 = r5.getColor(r6)
            r0.setTextColor(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x062f
        L_0x0617:
            android.widget.TextView r0 = r3.f107005e
            if (r0 == 0) goto L_0x062f
            androidx.appcompat.app.AppCompatActivity r5 = r2.getActivity()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100484(0x7f060344, float:1.781335E38)
            int r5 = r5.getColor(r6)
            r0.setTextColor(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x062f:
            te3.hb2 r0 = r2.f106990f
            if (r0 == 0) goto L_0x063a
            boolean r0 = r0.f134557z
            r5 = 1
            if (r0 != r5) goto L_0x063a
            r0 = 1
            goto L_0x063b
        L_0x063a:
            r0 = 0
        L_0x063b:
            if (r0 == 0) goto L_0x064a
            android.widget.ImageView r0 = r3.f107010j
            if (r0 == 0) goto L_0x0656
            r5 = 2131755504(0x7f1001f0, float:1.914189E38)
            r0.setImageResource(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0656
        L_0x064a:
            android.widget.ImageView r0 = r3.f107010j
            if (r0 == 0) goto L_0x0656
            r5 = 2131755505(0x7f1001f1, float:1.9141891E38)
            r0.setImageResource(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0656:
            java.lang.String r0 = eb0.C75592q0.m90789s()
            boolean r0 = gy3.C87412m.m108589b(r4, r0)
            if (r0 == 0) goto L_0x066e
            android.widget.ImageView r0 = r3.f107010j
            if (r0 == 0) goto L_0x066e
            c81.k r5 = new c81.k
            r5.<init>(r2)
            r0.setOnClickListener(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x066e:
            android.widget.TextView r0 = r3.f107006f
            if (r0 != 0) goto L_0x0673
            goto L_0x0682
        L_0x0673:
            te3.hb2 r5 = r2.f106990f
            if (r5 == 0) goto L_0x067a
            int r5 = r5.f134555x
            goto L_0x067b
        L_0x067a:
            r5 = 0
        L_0x067b:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.setText(r5)
        L_0x0682:
            android.widget.LinearLayout r0 = r3.f107007g
            if (r0 == 0) goto L_0x068b
            r0.removeAllViews()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x068b:
            te3.hb2 r0 = r2.f106990f
            if (r0 == 0) goto L_0x06f5
            java.util.LinkedList<te3.pa4> r0 = r0.f134554w
            if (r0 == 0) goto L_0x06f5
            boolean r5 = r0.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x069c
            goto L_0x069d
        L_0x069c:
            r0 = 0
        L_0x069d:
            if (r0 == 0) goto L_0x06f5
            android.widget.LinearLayout r0 = r3.f107007g
            if (r0 != 0) goto L_0x06a5
            r5 = 0
            goto L_0x06a9
        L_0x06a5:
            r5 = 0
            r0.setVisibility(r5)
        L_0x06a9:
            android.view.View r0 = r3.f107008h
            if (r0 != 0) goto L_0x06ae
            goto L_0x06f2
        L_0x06ae:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r7)
            java.lang.Object[] r21 = r6.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC"
            java.lang.String r23 = "updateItemView"
            java.lang.String r24 = "(ILandroid/view/View;Ljava/lang/String;I)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = 0
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r5 = r6.intValue()
            r0.setVisibility(r5)
            java.lang.String r21 = "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC"
            java.lang.String r22 = "updateItemView"
            java.lang.String r23 = "(ILandroid/view/View;Ljava/lang/String;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x06f2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x06f6
        L_0x06f5:
            r0 = 0
        L_0x06f6:
            if (r0 != 0) goto L_0x074b
            android.widget.LinearLayout r0 = r3.f107007g
            if (r0 != 0) goto L_0x06fd
            goto L_0x0700
        L_0x06fd:
            r0.setVisibility(r13)
        L_0x0700:
            android.view.View r0 = r3.f107008h
            if (r0 != 0) goto L_0x0705
            goto L_0x0749
        L_0x0705:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r5.mo10233c(r6)
            java.lang.Object[] r21 = r5.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC"
            java.lang.String r23 = "updateItemView"
            java.lang.String r24 = "(ILandroid/view/View;Ljava/lang/String;I)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0.setVisibility(r5)
            java.lang.String r21 = "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC"
            java.lang.String r22 = "updateItemView"
            java.lang.String r23 = "(ILandroid/view/View;Ljava/lang/String;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x0749:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x074b:
            android.widget.ImageView r0 = r3.f107001a
            if (r0 == 0) goto L_0x0759
            c81.l r5 = new c81.l
            r5.<init>(r4, r2)
            r0.setOnClickListener(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0759:
            te3.pa4 r0 = r2.f106993i
            if (r0 == 0) goto L_0x088b
            int r5 = r0.f139686o
            r6 = 2
            if (r5 != r6) goto L_0x0886
            r5 = 1
            r2.f106992h = r5
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0862 }
            java.lang.String r6 = r0.f139684j     // Catch:{ all -> 0x0862 }
            r5.<init>(r6)     // Catch:{ all -> 0x0862 }
            java.lang.String r6 = "rank"
            r5.optString(r6)     // Catch:{ all -> 0x0862 }
            java.lang.String r6 = "profile1_pre"
            java.lang.String r6 = r5.optString(r6)     // Catch:{ all -> 0x0862 }
            java.lang.String r7 = "profile1_suf"
            java.lang.String r7 = r5.optString(r7)     // Catch:{ all -> 0x0862 }
            java.lang.String r11 = "profile2"
            java.lang.String r15 = r5.optString(r11)     // Catch:{ all -> 0x0862 }
            java.lang.String r11 = "rank_num"
            java.lang.String r12 = r5.optString(r11)     // Catch:{ all -> 0x0862 }
            java.lang.String r11 = "finder_username"
            java.lang.String r5 = r5.optString(r11)     // Catch:{ all -> 0x0862 }
            android.view.ViewGroup r11 = r3.f107011k     // Catch:{ all -> 0x0862 }
            if (r11 == 0) goto L_0x0830
            r13 = 0
            r11.setVisibility(r13)     // Catch:{ all -> 0x0862 }
            gy3.d0 r13 = new gy3.d0     // Catch:{ all -> 0x0862 }
            r13.<init>()     // Catch:{ all -> 0x0862 }
            te3.hb2 r1 = r2.f106990f     // Catch:{ all -> 0x0862 }
            if (r1 == 0) goto L_0x07b4
            java.util.LinkedList<te3.kb4> r1 = r1.f134547p     // Catch:{ all -> 0x0862 }
            if (r1 == 0) goto L_0x07b4
            java.lang.Object r1 = sx3.C110818d0.m150925W(r1)     // Catch:{ all -> 0x0862 }
            te3.kb4 r1 = (te3.kb4) r1     // Catch:{ all -> 0x0862 }
            if (r1 == 0) goto L_0x07b4
            int r1 = r1.f136649e     // Catch:{ all -> 0x0862 }
            goto L_0x07b5
        L_0x07b4:
            r1 = 0
        L_0x07b5:
            r13.f27483d = r1     // Catch:{ all -> 0x0862 }
            te3.hb2 r1 = r2.f106990f     // Catch:{ all -> 0x0862 }
            if (r1 == 0) goto L_0x07c0
            int r1 = r1.f134555x     // Catch:{ all -> 0x0862 }
            r17 = r11
            goto L_0x07c3
        L_0x07c0:
            r17 = r11
            r1 = 0
        L_0x07c3:
            androidx.appcompat.app.AppCompatActivity r11 = r2.getActivity()     // Catch:{ all -> 0x0862 }
            bl3.r$a r11 = r8.mo62444c(r11)     // Catch:{ all -> 0x0862 }
            androidx.lifecycle.i0 r11 = r11.mo75002a(r10)     // Catch:{ all -> 0x0862 }
            yk3.d r11 = (yk3.C53531d) r11     // Catch:{ all -> 0x0862 }
            java.util.Set r11 = r11.mo74203d3()     // Catch:{ all -> 0x0862 }
            r29 = r12
            java.lang.String r12 = r0.f139684j     // Catch:{ all -> 0x0862 }
            boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x0862 }
            if (r11 != 0) goto L_0x0808
            int r11 = r13.f27483d     // Catch:{ all -> 0x0862 }
            java.lang.String r12 = "2022_hj"
            r18 = r14
            r14 = 47
            tv2.C14096e.m13448b(r14, r1, r11, r12)     // Catch:{ all -> 0x082a }
            androidx.appcompat.app.AppCompatActivity r11 = r2.getActivity()     // Catch:{ all -> 0x082a }
            bl3.r$a r8 = r8.mo62444c(r11)     // Catch:{ all -> 0x082a }
            androidx.lifecycle.i0 r8 = r8.mo75002a(r10)     // Catch:{ all -> 0x082a }
            yk3.d r8 = (yk3.C53531d) r8     // Catch:{ all -> 0x082a }
            java.util.Set r8 = r8.mo74203d3()     // Catch:{ all -> 0x082a }
            java.lang.String r0 = r0.f139684j     // Catch:{ all -> 0x082a }
            java.lang.String r10 = "record.sportUrl"
            gy3.C87412m.m108593f(r0, r10)     // Catch:{ all -> 0x082a }
            r8.add(r0)     // Catch:{ all -> 0x082a }
            goto L_0x080a
        L_0x0808:
            r18 = r14
        L_0x080a:
            c81.b r0 = new c81.b     // Catch:{ all -> 0x082a }
            r10 = r0
            r8 = r17
            r11 = r1
            r1 = r29
            r12 = r13
            r14 = 8
            r13 = r4
            r17 = r9
            r4 = r18
            r9 = 8
            r14 = r2
            r9 = r15
            r15 = r5
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0860 }
            r8.setOnClickListener(r0)     // Catch:{ all -> 0x0860 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0860 }
            goto L_0x0835
        L_0x082a:
            r0 = move-exception
            r17 = r9
            r4 = r18
            goto L_0x0866
        L_0x0830:
            r17 = r9
            r1 = r12
            r4 = r14
            r9 = r15
        L_0x0835:
            android.widget.TextView r0 = r3.f107012l     // Catch:{ all -> 0x0860 }
            if (r0 == 0) goto L_0x0857
            android.text.TextPaint r5 = r0.getPaint()     // Catch:{ all -> 0x0860 }
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r5)     // Catch:{ all -> 0x0860 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0860 }
            r5.<init>()     // Catch:{ all -> 0x0860 }
            r5.append(r6)     // Catch:{ all -> 0x0860 }
            r5.append(r1)     // Catch:{ all -> 0x0860 }
            r5.append(r7)     // Catch:{ all -> 0x0860 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0860 }
            r0.setText(r1)     // Catch:{ all -> 0x0860 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0860 }
        L_0x0857:
            android.widget.TextView r0 = r3.f107013m     // Catch:{ all -> 0x0860 }
            if (r0 != 0) goto L_0x085c
            goto L_0x0888
        L_0x085c:
            r0.setText(r9)     // Catch:{ all -> 0x0860 }
            goto L_0x0888
        L_0x0860:
            r0 = move-exception
            goto L_0x0866
        L_0x0862:
            r0 = move-exception
            r17 = r9
            r4 = r14
        L_0x0866:
            android.view.ViewGroup r1 = r3.f107011k
            if (r1 != 0) goto L_0x086b
            goto L_0x0870
        L_0x086b:
            r5 = 8
            r1.setVisibility(r5)
        L_0x0870:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "updateItemView: "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0888
        L_0x0886:
            r17 = r9
        L_0x0888:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x088e
        L_0x088b:
            r17 = r9
            r5 = 0
        L_0x088e:
            if (r5 != 0) goto L_0x08a0
            boolean r0 = r2.f106992h
            if (r0 != 0) goto L_0x089e
            android.view.ViewGroup r0 = r3.f107011k
            if (r0 != 0) goto L_0x0899
            goto L_0x089e
        L_0x0899:
            r1 = 8
            r0.setVisibility(r1)
        L_0x089e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x08a0:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x08a2:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.C41377v.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 4;
    }
}
