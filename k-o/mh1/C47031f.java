package mh1;

import androidx.recyclerview.widget.RecyclerView;
import bl1.C39809x;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;

/* renamed from: mh1.f */
public final class C47031f extends C60896i<C39809x> {
    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0086, code lost:
        r6 = r6.f134919d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r24, jq3.C9493c r25, int r26, int r27, boolean r28, java.util.List r29) {
        /*
            r23 = this;
            r7 = r24
            r8 = r25
            bl1.x r8 = (bl1.C39809x) r8
            java.lang.Class<tf0.p1> r9 = tf0.C64916p1.class
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r8, r0)
            vg1.f r15 = vg1.C52891f.f147704a
            r0 = r15
            r1 = r24
            r2 = r8
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            boolean r0 = r0.mo73655e(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x0187
        L_0x0028:
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87114s(r8)
            r1 = 2131298291(0x7f0907f3, float:1.821455E38)
            if (r0 == 0) goto L_0x0048
            android.view.View r0 = r7.mo85812D(r1)
            android.content.Context r2 = r7.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131232498(0x7f0806f2, float:1.8081107E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0.setBackground(r2)
            goto L_0x005c
        L_0x0048:
            android.view.View r0 = r7.mo85812D(r1)
            android.content.Context r2 = r7.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0.setBackground(r2)
        L_0x005c:
            r0 = 2131298292(0x7f0907f4, float:1.8214553E38)
            android.view.View r0 = r7.mo85812D(r0)
            r11 = r0
            com.tencent.mm.plugin.finder.live.view.LiveNeat7extView r11 = (com.tencent.p014mm.plugin.finder.live.view.LiveNeat7extView) r11
            java.lang.String r0 = "contentTv"
            gy3.C87412m.m108593f(r11, r0)
            r15.mo73662l(r11)
            android.content.Context r0 = r7.f173499A
            java.lang.String r2 = "holder.context"
            gy3.C87412m.m108593f(r0, r2)
            nk1.h r3 = nk1.C47272h.f126894a
            java.lang.String r4 = r8.mo62407a()
            java.lang.String r5 = r8.mo62408b()
            te3.xs0 r6 = r8.f106734e
            te3.hx0 r6 = r6.f144914s
            r14 = 0
            if (r6 == 0) goto L_0x008d
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x008d
            java.lang.String r6 = r6.nickname
            goto L_0x008e
        L_0x008d:
            r6 = r14
        L_0x008e:
            java.lang.String r10 = ""
            if (r6 != 0) goto L_0x0093
            r6 = r10
        L_0x0093:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r19 = r3.mo72299d(r4, r5, r6, r12)
            di3.d r4 = di3.C86312j.m106911c(r9)
            java.lang.String r5 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r16 = r4
            tf0.p1 r16 = (tf0.C64916p1) r16
            android.text.TextPaint r4 = r11.getPaint()
            java.lang.String r6 = "contentTv.paint"
            gy3.C87412m.m108593f(r4, r6)
            r20 = 0
            r21 = 8
            r22 = 0
            r17 = r0
            r18 = r4
            java.lang.CharSequence r0 = tf0.C64916p1.C64917a.m76441h(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = r0.toString()
            android.content.Context r4 = r7.f173499A
            gy3.C87412m.m108593f(r4, r2)
            java.lang.String r2 = r8.mo62407a()
            java.lang.String r12 = r8.mo62409d()
            te3.xs0 r13 = r8.f106734e
            te3.hx0 r13 = r13.f144902d
            if (r13 == 0) goto L_0x00db
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r13.f134919d
            if (r13 == 0) goto L_0x00db
            java.lang.String r13 = r13.nickname
            goto L_0x00dc
        L_0x00db:
            r13 = r14
        L_0x00dc:
            if (r13 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r10 = r13
        L_0x00e0:
            boolean r13 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r19 = r3.mo72299d(r2, r12, r10, r13)
            di3.d r2 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r2, r5)
            r16 = r2
            tf0.p1 r16 = (tf0.C64916p1) r16
            android.text.TextPaint r2 = r11.getPaint()
            gy3.C87412m.m108593f(r2, r6)
            r20 = 0
            r21 = 8
            r22 = 0
            r17 = r4
            r18 = r2
            java.lang.CharSequence r2 = tf0.C64916p1.C64917a.m76441h(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = r2.toString()
            android.content.Context r3 = r7.f173499A
            r4 = 2131832002(0x7f112cc2, float:1.9297046E38)
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r9 = 2131828880(0x7f112090, float:1.9290713E38)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r13 = 0
            r10[r13] = r0
            r10[r5] = r2
            java.lang.String r0 = r3.getString(r9, r10)
            r6[r13] = r0
            java.lang.String r0 = r3.getString(r4, r6)
            java.lang.String r2 = "holder.context.getString…romUsername, toUsername))"
            gy3.C87412m.m108593f(r0, r2)
            java.lang.String r2 = r8.f106820i
            if (r2 == 0) goto L_0x0188
            java.lang.String r2 = r15.mo73651a(r0, r2)
            de3.u r3 = new de3.u
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r6 = r7.f173499A
            r9 = 0
            android.text.SpannableString r2 = r4.yp0(r6, r2, r9)
            r3.<init>((android.text.SpannableString) r2)
            rx3.g r2 = vg1.C52891f.f147706c
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.text.style.ForegroundColorSpan r2 = (android.text.style.ForegroundColorSpan) r2
            r4 = 33
            int r0 = r0.length()
            int r0 = r0 + r5
            r3.mo105705b(r2, r5, r0, r4)
            r11.mo104279b(r3)
            java.lang.String r12 = r8.mo62408b()
            r0 = 0
            r2 = 1
            int r4 = r15.mo73652b()
            r10 = r15
            r5 = 0
            r13 = r0
            r0 = r14
            r14 = r2
            r2 = r15
            r15 = r4
            r16 = r3
            r10.mo73654d(r11, r12, r13, r14, r15, r16)
            r2.mo73663m(r7, r8, r0)
            android.view.View r0 = r7.mo85812D(r1)
            java.lang.String r1 = "holder.getView(R.id.box_comment_container)"
            gy3.C87412m.m108593f(r0, r1)
            r2.mo73660j(r7, r5, r8, r0)
            r2.mo73661k(r7, r8)
        L_0x0187:
            return
        L_0x0188:
            r0 = r14
            java.lang.String r1 = "msgContent"
            gy3.C87412m.m108603p(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.C47031f.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
