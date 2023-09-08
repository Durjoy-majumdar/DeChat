package ej1;

import cj1.C0537f2;
import cj1.C0581o5;
import cl1.C0702z0;
import fj1.C45795b;
import gy3.C87412m;
import ok1.C62042e;
import te3.C52013xs0;
import yg1.C15999b;

/* renamed from: ej1.g */
public abstract class C7681g extends C15999b {

    /* renamed from: i */
    public final C45795b f26046i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7681g(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f26046i = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01eb  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8798b(android.content.Context r24, qk1.C12806i0.C12807a r25, cj1.C0581o5 r26, int r27) {
        /*
            r23 = this;
            r0 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "msg"
            gy3.C87412m.m108594g(r10, r1)
            super.mo8798b(r24, r25, r26, r27)
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r3 = r2.mo87108q(r10)
            if (r3 == 0) goto L_0x0035
            android.view.View r3 = r9.f36659B
            android.content.res.Resources r4 = r24.getResources()
            r5 = 2131232498(0x7f0806f2, float:1.8081107E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r3.setBackground(r4)
            goto L_0x0045
        L_0x0035:
            android.view.View r3 = r9.f36659B
            android.content.res.Resources r4 = r24.getResources()
            r5 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r3.setBackground(r4)
        L_0x0045:
            fj1.b r3 = r0.f26046i
            androidx.lifecycle.i0 r3 = r3.mo71262a(r1)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            java.lang.String r4 = r26.mo571e()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x005e
            java.lang.String r3 = r23.mo14626g()
            goto L_0x0060
        L_0x005e:
            java.lang.String r3 = ""
        L_0x0060:
            r11 = r3
            te3.hx0 r3 = r26.mo579i()
            if (r3 == 0) goto L_0x006b
            java.util.LinkedList<te3.aw0> r3 = r3.f134930r
            r14 = r3
            goto L_0x006c
        L_0x006b:
            r14 = 0
        L_0x006c:
            int r3 = r11.length()
            r7 = 1
            r6 = 0
            if (r3 != 0) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            if (r3 == 0) goto L_0x0098
            wk1.n r13 = wk1.C15440n.f41895a
            int[] r3 = wk1.C15440n.f41914t
            r4 = 6
            int[] r15 = sx3.C110821n.m150971r(r3, r4)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r9.f36658A
            r16 = 0
            r17 = 0
            r18 = 4
            r20 = 0
            r21 = 76
            r22 = 0
            r19 = r3
            java.util.List r3 = wk1.C15440n.m14441q(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r13 = r3
            goto L_0x0099
        L_0x0098:
            r13 = 0
        L_0x0099:
            java.lang.String r3 = r26.mo573g()
            if (r3 == 0) goto L_0x00b2
            int r4 = r3.length()
            if (r4 != 0) goto L_0x00a7
            r4 = 1
            goto L_0x00a8
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            r4 = r4 ^ r7
            if (r4 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            if (r3 == 0) goto L_0x00b2
            r12 = 0
            r14 = 1
            goto L_0x00c5
        L_0x00b2:
            java.lang.String r3 = r26.mo571e()
            java.lang.String r4 = r26.mo573g()
            r5 = 0
            r14 = 4
            r15 = 0
            r12 = 0
            r6 = r14
            r14 = 1
            r7 = r15
            java.lang.String r3 = ok1.C62042e.m72808l0(r2, r3, r4, r5, r6, r7)
        L_0x00c5:
            fj1.b r2 = r0.f26046i
            androidx.lifecycle.i0 r1 = r2.mo71262a(r1)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo75998e3()
            if (r1 == 0) goto L_0x0104
            c50.b r1 = c50.C54655b.f153178f1
            if (r1 == 0) goto L_0x00d9
            r7 = 1
            goto L_0x00da
        L_0x00d9:
            r7 = 0
        L_0x00da:
            if (r7 != 0) goto L_0x00e8
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x00e2
            r7 = 1
            goto L_0x00e3
        L_0x00e2:
            r7 = 0
        L_0x00e3:
            if (r7 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r7 = 0
            goto L_0x00e9
        L_0x00e8:
            r7 = 1
        L_0x00e9:
            if (r7 != 0) goto L_0x0104
            te3.hx0 r1 = r26.mo579i()
            if (r1 == 0) goto L_0x00f8
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f134919d
            if (r1 == 0) goto L_0x00f8
            java.lang.String r1 = r1.username
            goto L_0x00f9
        L_0x00f8:
            r1 = 0
        L_0x00f9:
            java.lang.String r1 = er1.C7878t0.m8042k(r1, r3)
            java.lang.String r2 = "makeAnonymousNameIfIsMyS…    nameStr\n            )"
            gy3.C87412m.m108593f(r1, r2)
            r4 = r1
            goto L_0x0105
        L_0x0104:
            r4 = r3
        L_0x0105:
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            tf0.p1 r1 = (tf0.C64916p1) r1
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r9.f36658A
            android.text.TextPaint r3 = r2.getPaint()
            java.lang.String r2 = "holder.contentTv.paint"
            gy3.C87412m.m108593f(r3, r2)
            r5 = 0
            r6 = 8
            r7 = 0
            r2 = r24
            java.lang.CharSequence r1 = tf0.C64916p1.C64917a.m76441h(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = r26.getContent()
            r3 = 2131832002(0x7f112cc2, float:1.9297046E38)
            java.lang.Object[] r4 = new java.lang.Object[r14]
            r4[r12] = r1
            java.lang.String r1 = r8.getString(r3, r4)
            java.lang.String r3 = "context.getString(com.te…w_content_tmpl, userName)"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r2 = r0.mo14623a(r11, r13, r1, r2)
            de3.u r3 = new de3.u
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.text.SpannableString r2 = r4.mo107057T1(r8, r2)
            r3.<init>((android.text.SpannableString) r2)
            int r2 = r11.length()
            if (r2 <= 0) goto L_0x0158
            r7 = 1
            goto L_0x0159
        L_0x0158:
            r7 = 0
        L_0x0159:
            r2 = 33
            if (r7 == 0) goto L_0x0178
            wk1.p r4 = r23.mo14625f()
            java.lang.String r5 = r23.mo14626g()
            int r5 = r5.length()
            int r5 = r5 + r12
            r3.mo105705b(r4, r12, r5, r2)
            java.lang.String r4 = r23.mo14626g()
            int r4 = r4.length()
            int r6 = r4 + 0
            goto L_0x0179
        L_0x0178:
            r6 = 0
        L_0x0179:
            if (r13 == 0) goto L_0x0192
            java.util.Iterator r4 = r13.iterator()
        L_0x017f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0192
            java.lang.Object r5 = r4.next()
            android.text.style.ImageSpan r5 = (android.text.style.ImageSpan) r5
            int r7 = r6 + 1
            r3.mo105705b(r5, r6, r7, r2)
            r6 = r7
            goto L_0x017f
        L_0x0192:
            android.text.style.ForegroundColorSpan r4 = r0.f43053f
            int r1 = r1.length()
            int r1 = r1 + r6
            r3.mo105705b(r4, r6, r1, r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            r1.mo104279b(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r1, r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            com.tencent.mm.ui.widget.MMNeat7extView r4 = r9.f36658A
            android.view.ViewParent r4 = r4.getParent()
            gy3.C87412m.m108592e(r4, r2)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            int r5 = r23.mo14628i()
            int r7 = r1.getPaddingTop()
            int r8 = r1.getPaddingRight()
            int r1 = r1.getPaddingBottom()
            r4.setPadding(r5, r7, r8, r1)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            r1.mo104279b(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            int r3 = r0.f43055h
            float r3 = (float) r3
            r1.setTextSize(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            android.view.ViewParent r1 = r1.getParent()
            gy3.C87412m.m108592e(r1, r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            if (r6 != 0) goto L_0x01eb
            int r6 = r23.mo14628i()
            goto L_0x01ec
        L_0x01eb:
            r6 = 0
        L_0x01ec:
            int r2 = r1.getPaddingTop()
            int r3 = r1.getPaddingRight()
            int r4 = r1.getPaddingBottom()
            r1.setPadding(r6, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7681g.mo8798b(android.content.Context, qk1.i0$a, cj1.o5, int):void");
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        C0537f2 f2Var = new C0537f2(xs02);
        if (C62042e.f176370a.mo87108q(f2Var)) {
            ((C0702z0) this.f26046i.mo71262a(C0702z0.class)).f1681r = true;
        }
        return f2Var;
    }
}
