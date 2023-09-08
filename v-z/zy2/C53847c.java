package zy2;

import fz2.C45865a;
import qo3.C101218e0;
import qo3.C89779i0;

/* renamed from: zy2.c */
public final class C53847c extends C101218e0 {

    /* renamed from: L */
    public C45865a f151085L;

    /* renamed from: M */
    public C89779i0 f151086M;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53847c(android.content.Context r21, rz2.C48212k r22, uy2.C52660e r23, boolean r24, int r25, gy3.C8480h r26) {
        /*
            r20 = this;
            r6 = r20
            r3 = r21
            r0 = r25 & 2
            if (r0 == 0) goto L_0x000a
            r0 = 0
            goto L_0x000c
        L_0x000a:
            r0 = r22
        L_0x000c:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0012
            r4 = 0
            goto L_0x0014
        L_0x0012:
            r4 = r23
        L_0x0014:
            r2 = r25 & 8
            r5 = 1
            if (r2 == 0) goto L_0x001b
            r2 = 1
            goto L_0x001d
        L_0x001b:
            r2 = r24
        L_0x001d:
            java.lang.Class<xy2.h> r7 = xy2.C53477h.class
            java.lang.String r8 = "context"
            gy3.C87412m.m108594g(r3, r8)
            r8 = 0
            r6.<init>(r3, r8, r5)
            if (r0 != 0) goto L_0x003a
            di3.d r0 = di3.C86312j.m106911c(r7)
            xy2.h r0 = (xy2.C53477h) r0
            if (r4 == 0) goto L_0x0035
            java.lang.String r9 = r4.field_session_id
            goto L_0x0036
        L_0x0035:
            r9 = 0
        L_0x0036:
            rz2.k r0 = r0.wx0(r9)
        L_0x003a:
            r9 = r0
            r0 = 2131497938(0x7f0c13d2, float:1.8619483E38)
            r6.mo140662i(r0)
            android.view.View r0 = r6.f296384g
            r10 = 2131315135(0x7f0949bf, float:1.8248715E38)
            android.view.View r0 = r0.findViewById(r10)
            r10 = 2131297457(0x7f0904b1, float:1.821286E38)
            android.view.View r11 = p192l4.C10462b.m10395a(r0, r10)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L_0x01c4
            r10 = 2131298439(0x7f090887, float:1.8214851E38)
            android.view.View r12 = p192l4.C10462b.m10395a(r0, r10)
            r15 = r12
            android.widget.Button r15 = (android.widget.Button) r15
            if (r15 == 0) goto L_0x01c4
            r10 = 2131300452(0x7f091064, float:1.8218934E38)
            android.view.View r12 = p192l4.C10462b.m10395a(r0, r10)
            r16 = r12
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L_0x01c4
            r10 = 2131300837(0x7f0911e5, float:1.8219715E38)
            android.view.View r12 = p192l4.C10462b.m10395a(r0, r10)
            r17 = r12
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x01c4
            r18 = r0
            android.widget.LinearLayout r18 = (android.widget.LinearLayout) r18
            r10 = 2131315835(0x7f094c7b, float:1.8250134E38)
            android.view.View r12 = p192l4.C10462b.m10395a(r0, r10)
            r19 = r12
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x01c4
            fz2.a r0 = new fz2.a
            r12 = r0
            r13 = r18
            r14 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r6.f151085L = r0
            if (r9 == 0) goto L_0x009c
            java.lang.String r0 = r9.field_sessionId
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            java.lang.String r10 = ""
            if (r0 != 0) goto L_0x00a2
            r0 = r10
        L_0x00a2:
            tl3.C78039a.m94189a(r11, r0)
            if (r9 == 0) goto L_0x01c3
            fz2.a r0 = r6.f151085L
            java.lang.String r11 = "contactDialogBinding"
            if (r0 == 0) goto L_0x01be
            android.widget.TextView r0 = r0.f123804b
            java.lang.String r12 = r9.field_nickname
            if (r12 == 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r12 = r10
        L_0x00b5:
            r0.setText(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r12 = r9.field_sex
            java.lang.String r13 = " "
            if (r12 == r5) goto L_0x00d5
            r14 = 2
            if (r12 == r14) goto L_0x00c7
            goto L_0x00e2
        L_0x00c7:
            r12 = 2131836498(0x7f113e52, float:1.9306164E38)
            java.lang.String r12 = r3.getString(r12)
            r0.append(r12)
            r0.append(r13)
            goto L_0x00e2
        L_0x00d5:
            r12 = 2131836499(0x7f113e53, float:1.9306167E38)
            java.lang.String r12 = r3.getString(r12)
            r0.append(r12)
            r0.append(r13)
        L_0x00e2:
            java.lang.String r12 = r9.field_country
            if (r12 != 0) goto L_0x00e7
            r12 = r10
        L_0x00e7:
            com.tencent.mm.storage.RegionCodeDecoder r14 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            java.lang.String r15 = r9.field_province
            java.lang.String r14 = r14.mo135577m(r12, r15)
            com.tencent.mm.storage.RegionCodeDecoder r15 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            java.lang.String r8 = r9.field_province
            java.lang.String r1 = r9.field_city
            java.lang.String r1 = r15.mo135571f(r12, r8, r1)
            if (r14 == 0) goto L_0x0108
            boolean r8 = z04.C112551y.m153811k(r14)
            if (r8 == 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r8 = 0
            goto L_0x0109
        L_0x0108:
            r8 = 1
        L_0x0109:
            if (r8 != 0) goto L_0x0111
            r0.append(r14)
            r0.append(r13)
        L_0x0111:
            if (r1 == 0) goto L_0x011c
            boolean r8 = z04.C112551y.m153811k(r1)
            if (r8 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r8 = 0
            goto L_0x011d
        L_0x011c:
            r8 = 1
        L_0x011d:
            if (r8 != 0) goto L_0x0122
            r0.append(r1)
        L_0x0122:
            fz2.a r1 = r6.f151085L
            if (r1 == 0) goto L_0x01b9
            android.widget.TextView r1 = r1.f123805c
            r1.setText(r0)
            fz2.a r0 = r6.f151085L
            if (r0 == 0) goto L_0x01b4
            android.widget.TextView r0 = r0.f123806d
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            java.lang.String r8 = r9.field_signature
            if (r8 != 0) goto L_0x013e
            r8 = r10
        L_0x013e:
            android.text.SpannableString r1 = r1.mo107057T1(r3, r8)
            r0.setText(r1)
            fz2.a r0 = r6.f151085L
            if (r0 == 0) goto L_0x01af
            android.widget.Button r0 = r0.f123803a
            if (r2 == 0) goto L_0x014f
            r1 = 0
            goto L_0x0150
        L_0x014f:
            r1 = 4
        L_0x0150:
            r0.setVisibility(r1)
            di3.d r0 = di3.C86312j.m106911c(r7)
            xy2.h r0 = (xy2.C53477h) r0
            java.lang.String r1 = r9.field_sessionId
            if (r1 != 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r10 = r1
        L_0x015f:
            rz2.k r0 = r0.wx0(r10)
            if (r0 == 0) goto L_0x016b
            int r0 = r0.field_canTalk
            if (r0 != r5) goto L_0x016b
            r1 = 1
            goto L_0x016c
        L_0x016b:
            r1 = 0
        L_0x016c:
            fz2.a r0 = r6.f151085L
            if (r0 == 0) goto L_0x01aa
            android.widget.Button r0 = r0.f123803a
            if (r1 == 0) goto L_0x0180
            android.content.res.Resources r5 = r21.getResources()
            r7 = 2131837914(0x7f1143da, float:1.9309036E38)
            java.lang.String r5 = r5.getString(r7)
            goto L_0x018b
        L_0x0180:
            android.content.res.Resources r5 = r21.getResources()
            r7 = 2131837913(0x7f1143d9, float:1.9309034E38)
            java.lang.String r5 = r5.getString(r7)
        L_0x018b:
            r0.setText(r5)
            if (r2 == 0) goto L_0x01c3
            fz2.a r0 = r6.f151085L
            if (r0 == 0) goto L_0x01a5
            android.widget.Button r7 = r0.f123803a
            zy2.a r8 = new zy2.a
            r0 = r8
            r2 = r9
            r3 = r21
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r7.setOnClickListener(r8)
            goto L_0x01c3
        L_0x01a5:
            gy3.C87412m.m108603p(r11)
            r0 = 0
            throw r0
        L_0x01aa:
            r0 = 0
            gy3.C87412m.m108603p(r11)
            throw r0
        L_0x01af:
            r0 = 0
            gy3.C87412m.m108603p(r11)
            throw r0
        L_0x01b4:
            r0 = 0
            gy3.C87412m.m108603p(r11)
            throw r0
        L_0x01b9:
            r0 = 0
            gy3.C87412m.m108603p(r11)
            throw r0
        L_0x01be:
            r0 = 0
            gy3.C87412m.m108603p(r11)
            throw r0
        L_0x01c3:
            return
        L_0x01c4:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r10)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zy2.C53847c.<init>(android.content.Context, rz2.k, uy2.e, boolean, int, gy3.h):void");
    }
}
