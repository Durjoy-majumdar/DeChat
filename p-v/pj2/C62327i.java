package pj2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: pj2.i */
public final class C62327i extends C60896i<C62324e> {

    /* renamed from: e */
    public final int f177164e;

    /* renamed from: f */
    public final C32227p<Integer, C62324e, C13598b0> f177165f;

    /* renamed from: g */
    public final C32227p<Integer, C62324e, C13598b0> f177166g;

    /* renamed from: h */
    public final String f177167h = "MicroMsg.RingtoneConverter";

    public C62327i(int i, C32227p<? super Integer, ? super C62324e, C13598b0> pVar, C32227p<? super Integer, ? super C62324e, C13598b0> pVar2) {
        C87412m.m108594g(pVar, "onClickAvatar");
        C87412m.m108594g(pVar2, "onClickAuthor");
        this.f177164e = i;
        this.f177165f = pVar;
        this.f177166g = pVar2;
    }

    /* renamed from: c */
    public int mo43c() {
        int i = this.f177164e;
        return i != 1 ? i != 2 ? i != 3 ? C0966R.C0971layout.btj : C0966R.C0971layout.f359954cp2 : C0966R.C0971layout.cp5 : C0966R.C0971layout.btj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r17, jq3.C9493c r18, int r19, int r20, boolean r21, java.util.List r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r22
            r3 = r18
            pj2.e r3 = (pj2.C62324e) r3
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r3, r4)
            java.lang.String r4 = r0.f177167h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onBindViewHolder play:"
            r5.append(r6)
            boolean r6 = r3.f177155e
            r5.append(r6)
            java.lang.String r6 = ", itemId:"
            r5.append(r6)
            long r6 = r3.getItemId()
            r5.append(r6)
            java.lang.String r6 = ", payloads:"
            r5.append(r6)
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0040
            java.lang.Object r8 = r2.get(r7)
            goto L_0x0041
        L_0x0040:
            r8 = r6
        L_0x0041:
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            r4 = 1
            if (r2 == 0) goto L_0x0057
            boolean r2 = r22.isEmpty()
            if (r2 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = 0
            goto L_0x0058
        L_0x0057:
            r2 = 1
        L_0x0058:
            r5 = 2131312534(0x7f093f96, float:1.824344E38)
            if (r2 == 0) goto L_0x022d
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            ve3.n0 r9 = r3.f177154d
            ve3.g r9 = r9.f189022f
            if (r9 != 0) goto L_0x0067
            goto L_0x022d
        L_0x0067:
            ve3.f r10 = r9.f188994d
            if (r10 == 0) goto L_0x022d
            long r10 = r10.f188983d
            wj2.f r10 = rj2.C63449b.m74791a(r10)
            if (r10 != 0) goto L_0x0075
            goto L_0x022d
        L_0x0075:
            r11 = 2131312579(0x7f093fc3, float:1.824353E38)
            java.lang.String r12 = r10.f190086i
            java.lang.String r13 = r3.f177157g
            lv1.f r12 = lv1.C99667f.m130088a(r12, r13, r7, r7)
            lv1.g r12 = kv1.C99254i.m129308e(r12)
            java.lang.CharSequence r12 = r12.f292107a
            r1.mo85815G(r11, r12)
            android.view.View r11 = r1.mo85812D(r5)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L_0x00a0
            di3.d r12 = di3.C86312j.m106911c(r2)
            ht1.t1 r12 = (ht1.C60200t1) r12
            java.lang.String r13 = r10.f190088k
            java.lang.String r14 = r10.mo90174e()
            r12.aa0(r13, r11, r14)
        L_0x00a0:
            int r11 = r9.f189008u
            java.lang.String r12 = ""
            r13 = 2131826566(0x7f111786, float:1.928602E38)
            r14 = 2
            if (r11 == r4) goto L_0x00e1
            if (r11 == r14) goto L_0x00c9
            r15 = 3
            if (r11 == r15) goto L_0x00b0
            goto L_0x00f4
        L_0x00b0:
            java.lang.Class<ny.h> r11 = p629ny.C76979h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r15 = r1.f173499A
            ve3.o0 r8 = r9.f189009v
            if (r8 == 0) goto L_0x00c4
            java.lang.String r8 = r8.f147612d
            if (r8 != 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r12 = r8
        L_0x00c4:
            android.text.SpannableString r12 = r11.mo107057T1(r15, r12)
            goto L_0x00f4
        L_0x00c9:
            android.content.Context r8 = r1.f173499A
            java.lang.Object[] r11 = new java.lang.Object[r4]
            di3.d r12 = di3.C86312j.m106911c(r2)
            ht1.t1 r12 = (ht1.C60200t1) r12
            long r14 = r9.f189002o
            int r15 = (int) r14
            java.lang.String r12 = r12.mo76868qS(r15)
            r11[r7] = r12
            java.lang.String r12 = r8.getString(r13, r11)
            goto L_0x00f4
        L_0x00e1:
            android.content.Context r8 = r1.f173499A
            r11 = 2131826565(0x7f111785, float:1.9286018E38)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            long r14 = r9.f189006s
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r12[r7] = r14
            java.lang.String r12 = r8.getString(r11, r12)
        L_0x00f4:
            r8 = 2131311951(0x7f093d4f, float:1.8242257E38)
            android.view.View r11 = r1.mo85812D(r8)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 != 0) goto L_0x0100
            goto L_0x0103
        L_0x0100:
            r11.setText(r12)
        L_0x0103:
            android.view.View r8 = r1.mo85812D(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 != 0) goto L_0x010c
            goto L_0x0124
        L_0x010c:
            java.lang.String r11 = "recommendReason"
            gy3.C87412m.m108593f(r12, r11)
            int r11 = r12.length()
            if (r11 <= 0) goto L_0x011a
            r11 = 1
            goto L_0x011b
        L_0x011a:
            r11 = 0
        L_0x011b:
            if (r11 == 0) goto L_0x011f
            r11 = 0
            goto L_0x0121
        L_0x011f:
            r11 = 8
        L_0x0121:
            r8.setVisibility(r11)
        L_0x0124:
            long r11 = r9.f189002o
            int r8 = (int) r11
            r11 = 2131312580(0x7f093fc4, float:1.8243533E38)
            android.view.View r11 = r1.mo85812D(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x0152
            android.content.Context r12 = r1.f173499A
            java.lang.Object[] r14 = new java.lang.Object[r4]
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            java.lang.String r2 = r2.mo76868qS(r8)
            r14[r7] = r2
            java.lang.String r2 = r12.getString(r13, r14)
            r11.setText(r2)
            if (r8 <= 0) goto L_0x014d
            r2 = 0
            goto L_0x014f
        L_0x014d:
            r2 = 8
        L_0x014f:
            r11.setVisibility(r2)
        L_0x0152:
            ve3.h0 r2 = r9.f189010w
            boolean r8 = r10.f190102y
            if (r8 == 0) goto L_0x015f
            if (r2 == 0) goto L_0x015d
            java.lang.String r8 = r2.f189013f
            goto L_0x0161
        L_0x015d:
            r8 = r6
            goto L_0x0161
        L_0x015f:
            java.lang.String r8 = r9.f189001n
        L_0x0161:
            if (r2 == 0) goto L_0x0166
            java.lang.String r2 = r2.f189014g
            goto L_0x0167
        L_0x0166:
            r2 = r6
        L_0x0167:
            if (r8 == 0) goto L_0x0172
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r8 = 0
            goto L_0x0173
        L_0x0172:
            r8 = 1
        L_0x0173:
            r9 = 2131312543(0x7f093f9f, float:1.8243458E38)
            if (r8 == 0) goto L_0x01b3
            if (r2 == 0) goto L_0x0183
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r2 = 0
            goto L_0x0184
        L_0x0183:
            r2 = 1
        L_0x0184:
            if (r2 != 0) goto L_0x0187
            goto L_0x01b3
        L_0x0187:
            java.lang.String r2 = r10.f190087j
            java.lang.String r8 = r3.f177157g
            lv1.f r2 = lv1.C99667f.m130088a(r2, r8, r7, r7)
            lv1.g r2 = kv1.C99254i.m129308e(r2)
            java.lang.CharSequence r2 = r2.f292107a
            r1.mo85815G(r9, r2)
            android.content.Context r2 = r1.f173499A
            r8 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r2 = kg3.C76577a.m92153d(r2, r8)
            r1.mo85816H(r9, r2)
            android.view.View r2 = r1.mo85812D(r9)
            r2.setOnClickListener(r6)
            android.view.View r2 = r1.mo85812D(r9)
            r2.setClickable(r7)
            goto L_0x01d7
        L_0x01b3:
            java.lang.String r2 = r10.f190087j
            r1.mo85815G(r9, r2)
            android.content.Context r2 = r1.f173499A
            r6 = 2131101015(0x7f060557, float:1.7814428E38)
            int r2 = kg3.C76577a.m92153d(r2, r6)
            r1.mo85816H(r9, r2)
            android.view.View r2 = r1.mo85812D(r9)
            pj2.f r6 = new pj2.f
            r6.<init>(r0, r1, r3)
            r2.setOnClickListener(r6)
            android.view.View r2 = r1.mo85812D(r9)
            r2.setClickable(r4)
        L_0x01d7:
            android.view.View r2 = r1.mo85812D(r5)
            pj2.g r6 = new pj2.g
            r6.<init>(r0, r1, r3)
            r2.setOnClickListener(r6)
            boolean r2 = r3.f177156f
            if (r2 == 0) goto L_0x022d
            r3.f177156f = r7
            android.content.Context r2 = r1.f173499A
            r6 = 2131101370(0x7f0606ba, float:1.7815148E38)
            int r2 = kg3.C76577a.m92153d(r2, r6)
            android.content.Context r6 = r1.f173499A
            r8 = 2131099650(0x7f060002, float:1.781166E38)
            int r6 = kg3.C76577a.m92153d(r6, r8)
            android.animation.ArgbEvaluator r8 = new android.animation.ArgbEvaluator
            r8.<init>()
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r9[r7] = r10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9[r4] = r6
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofObject(r8, r9)
            r8 = 1500(0x5dc, double:7.41E-321)
            r4.setStartDelay(r8)
            r8 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r8)
            pj2.h r6 = new pj2.h
            r6.<init>(r1)
            r4.addUpdateListener(r6)
            r4.start()
            android.view.View r4 = r1.f44854d
            r4.setBackgroundColor(r2)
        L_0x022d:
            boolean r2 = r3.f177155e
            r3 = 2131312581(0x7f093fc5, float:1.8243535E38)
            if (r2 == 0) goto L_0x0236
            r4 = 0
            goto L_0x0238
        L_0x0236:
            r4 = 8
        L_0x0238:
            r1.mo85817I(r3, r4)
            r3 = 2131312535(0x7f093f97, float:1.8243441E38)
            if (r2 == 0) goto L_0x0242
            r4 = 0
            goto L_0x0244
        L_0x0242:
            r4 = 8
        L_0x0244:
            r1.mo85817I(r3, r4)
            r3 = 2131312570(0x7f093fba, float:1.8243512E38)
            if (r2 == 0) goto L_0x024f
            r4 = 8
            goto L_0x0250
        L_0x024f:
            r4 = 0
        L_0x0250:
            r1.mo85817I(r3, r4)
            android.view.View r3 = r1.mo85812D(r5)
            android.content.Context r4 = r1.f173499A
            if (r2 == 0) goto L_0x025f
            r5 = 2131821621(0x7f110435, float:1.927599E38)
            goto L_0x0262
        L_0x025f:
            r5 = 2131821639(0x7f110447, float:1.9276027E38)
        L_0x0262:
            java.lang.String r4 = kg3.C76577a.m92166q(r4, r5)
            r3.setContentDescription(r4)
            r3 = 2131312537(0x7f093f99, float:1.8243445E38)
            android.view.View r1 = r1.mo85812D(r3)
            com.tencent.mm.plugin.gif.MMAnimateView r1 = (com.tencent.p014mm.plugin.gif.MMAnimateView) r1
            if (r2 == 0) goto L_0x028a
            if (r1 != 0) goto L_0x0277
            goto L_0x027a
        L_0x0277:
            r1.setVisibility(r7)
        L_0x027a:
            if (r1 == 0) goto L_0x027f
            r1.mo129237x()
        L_0x027f:
            java.lang.String r2 = nj2.C61767o.m72469e(r7)
            r1.setImageFilePath(r2)
            r1.mo129236w()
            goto L_0x0292
        L_0x028a:
            if (r1 != 0) goto L_0x028d
            goto L_0x0292
        L_0x028d:
            r2 = 8
            r1.setVisibility(r2)
        L_0x0292:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pj2.C62327i.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
