package ej1;

import android.content.Context;
import cj1.C0529d2;
import cj1.C0581o5;
import fj1.C45795b;
import gy3.C87412m;
import qk1.C12806i0;
import te3.C52013xs0;

/* renamed from: ej1.r */
public final class C7710r extends C7690k0 {

    /* renamed from: i */
    public final String f26129i = "CommentItemLevelUpgrade";

    /* renamed from: j */
    public final C45795b f26130j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7710r(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f26130j = bVar;
    }

    /* renamed from: b */
    public void mo8798b(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        mo8830p(context, aVar, o5Var, i, false);
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0529d2(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20031;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0270 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8830p(android.content.Context r42, qk1.C12806i0.C12807a r43, cj1.C0581o5 r44, int r45, boolean r46) {
        /*
            r41 = this;
            r0 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r11 = r45
            java.lang.Class<tf0.p1> r12 = tf0.C64916p1.class
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r9, r1)
            java.lang.String r1 = "commentData"
            gy3.C87412m.m108594g(r10, r1)
            fj1.b r1 = r0.f26130j
            java.lang.Class<yg1.c> r2 = yg1.C16004c.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            yg1.c r1 = (yg1.C16004c) r1
            cj1.g1 r13 = r1.mo14629c3()
            boolean r1 = r13.f1314e
            r14 = 1
            r15 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            if (r1 == 0) goto L_0x0039
            int r1 = r13.f1312c
            if (r1 != r11) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r1 == 0) goto L_0x0085
            if (r46 != 0) goto L_0x0085
            android.view.View r1 = r9.f44854d
            r2 = 1008981770(0x3c23d70a, float:0.01)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r19 = "onBindGlobalLevelUpMsg"
            java.lang.String r20 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r3.mo10231a(r15)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r18 = "onBindGlobalLevelUpMsg"
            java.lang.String r19 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x0085:
            java.lang.Object r1 = r44.mo563q()
            boolean r2 = r1 instanceof te3.C64348eu0
            if (r2 == 0) goto L_0x009a
            r2 = r1
            te3.eu0 r2 = (te3.C64348eu0) r2
            int r3 = r2.f183030d
            if (r3 != r14) goto L_0x009a
            int r2 = r2.f183032f
            if (r2 <= 0) goto L_0x009a
            r2 = 1
            goto L_0x009b
        L_0x009a:
            r2 = 0
        L_0x009b:
            r16 = 0
            if (r2 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r1 = r16
        L_0x00a2:
            java.lang.String r6 = "if (isMySelf) {\n        …), toLevel)\n            }"
            java.lang.String r5 = "holder.contentTv.paint"
            java.lang.String r4 = "getService(IFinderCommon…atureService::class.java)"
            r46 = r6
            if (r1 == 0) goto L_0x01f0
            android.view.View r2 = r9.f44854d
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r18 = k20.C60958c.f173611a
            r3.mo10233c(r7)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r21 = "onBindGlobalLevelUpMsg"
            java.lang.String r22 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r15)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r20 = "onBindGlobalLevelUpMsg"
            java.lang.String r21 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            ok1.e r3 = ok1.C62042e.f176370a
            java.lang.String r2 = r44.mo571e()
            boolean r2 = r3.mo87084h1(r2)
            te3.eu0 r1 = (te3.C64348eu0) r1
            int r1 = r1.f183032f
            if (r2 == 0) goto L_0x011b
            android.content.res.Resources r2 = r42.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r14]
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            r6[r15] = r19
            r14 = 2131827223(0x7f111a17, float:1.9287353E38)
            java.lang.String r2 = r2.getString(r14, r6)
            r14 = r46
            r25 = r1
            r35 = r3
            r17 = r4
            r36 = r5
            r15 = r7
            goto L_0x0182
        L_0x011b:
            android.content.res.Resources r14 = r42.getResources()
            r6 = 2
            java.lang.Object[] r2 = new java.lang.Object[r6]
            di3.d r6 = di3.C86312j.m106911c(r12)
            gy3.C87412m.m108593f(r6, r4)
            tf0.p1 r6 = (tf0.C64916p1) r6
            com.tencent.mm.ui.widget.MMNeat7extView r15 = r9.f36658A
            android.text.TextPaint r15 = r15.getPaint()
            gy3.C87412m.m108593f(r15, r5)
            java.lang.String r29 = r44.mo571e()
            java.lang.String r30 = r44.mo573g()
            r31 = 0
            r32 = 4
            r33 = 0
            r28 = r3
            java.lang.String r21 = ok1.C62042e.m72808l0(r28, r29, r30, r31, r32, r33)
            r22 = 0
            r23 = 8
            r24 = 0
            r25 = r1
            r1 = r6
            r6 = r2
            r2 = r42
            r35 = r3
            r3 = r15
            r15 = r4
            r4 = r21
            r36 = r5
            r5 = r22
            r37 = r46
            r38 = r6
            r6 = r23
            r17 = r15
            r15 = r7
            r7 = r24
            java.lang.CharSequence r1 = tf0.C64916p1.C64917a.m76441h(r1, r2, r3, r4, r5, r6, r7)
            r2 = r38
            r3 = 0
            r2[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r3 = 1
            r2[r3] = r1
            r1 = 2131827222(0x7f111a16, float:1.928735E38)
            java.lang.String r2 = r14.getString(r1, r2)
            r14 = r37
        L_0x0182:
            gy3.C87412m.m108593f(r2, r14)
            r0.mo8811o(r8, r9, r2)
            r1 = 40
            r2 = r25
            if (r2 < r1) goto L_0x01c3
            android.view.View r1 = r9.f36659B
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            wk1.r r4 = new wk1.r
            wk1.x r5 = wk1.C15483x.MODE_DARK
            wk1.y r6 = wk1.C15484y.SIZE_NORMAL
            r4.<init>(r5, r6)
            int r4 = r4.mo14282k(r2)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            r7 = 127(0x7f, float:1.78E-43)
            r3.setAlpha(r7)
            r1.setBackground(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            r3 = r35
            int r2 = r3.mo86989A0(r2)
            r1.setTextColor(r2)
            r5 = 2131101837(0x7f06088d, float:1.7816095E38)
            r6 = 2131232561(0x7f080731, float:1.8081235E38)
            goto L_0x01e9
        L_0x01c3:
            r7 = 127(0x7f, float:1.78E-43)
            android.view.View r1 = r9.f36659B
            android.content.res.Resources r2 = r42.getResources()
            r6 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r6)
            r1.setBackground(r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r2 = r2.getColor(r5)
            r1.setTextColor(r2)
        L_0x01e9:
            r13.mo591b(r10, r11)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r2 = 1
            goto L_0x0202
        L_0x01f0:
            r14 = r46
            r17 = r4
            r36 = r5
            r15 = r7
            r5 = 2131101837(0x7f06088d, float:1.7816095E38)
            r6 = 2131232561(0x7f080731, float:1.8081235E38)
            r7 = 127(0x7f, float:1.78E-43)
            r1 = r16
            r2 = 0
        L_0x0202:
            java.lang.String r18 = ""
            r21 = 8
            java.lang.String r4 = "invalid GlobalLevelUpgrade:"
            if (r1 != 0) goto L_0x026e
            java.lang.String r1 = r0.f26129i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.Object r22 = r44.mo563q()
            if (r22 != 0) goto L_0x021c
            r22 = r18
        L_0x021c:
            org.json.JSONObject r5 = o40.C61937h.m72709h(r22)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            android.view.View r1 = r9.f44854d
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r3.mo10233c(r5)
            java.lang.Object[] r23 = r3.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r25 = "onBindGlobalLevelUpMsg"
            java.lang.String r26 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r24 = "onBindGlobalLevelUpMsg"
            java.lang.String r25 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x026e:
            if (r2 == 0) goto L_0x0271
            return
        L_0x0271:
            java.lang.Object r1 = r44.mo563q()
            boolean r2 = r1 instanceof te3.C64348eu0
            if (r2 == 0) goto L_0x0287
            r2 = r1
            te3.eu0 r2 = (te3.C64348eu0) r2
            int r3 = r2.f183030d
            r5 = 2
            if (r3 != r5) goto L_0x0288
            int r2 = r2.f183032f
            if (r2 <= 0) goto L_0x0288
            r2 = 1
            goto L_0x0289
        L_0x0287:
            r5 = 2
        L_0x0288:
            r2 = 0
        L_0x0289:
            if (r2 == 0) goto L_0x028c
            goto L_0x028e
        L_0x028c:
            r1 = r16
        L_0x028e:
            if (r1 == 0) goto L_0x03b8
            android.view.View r2 = r9.f44854d
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r3.mo10233c(r15)
            java.lang.Object[] r23 = r3.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r25 = "onBindGlobalLevelUpMsg"
            java.lang.String r26 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r2
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r15 = 0
            java.lang.Object r3 = r3.mo10231a(r15)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r24 = "onBindGlobalLevelUpMsg"
            java.lang.String r25 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            ok1.e r15 = ok1.C62042e.f176370a
            java.lang.String r2 = r44.mo571e()
            boolean r2 = r15.mo87084h1(r2)
            te3.eu0 r1 = (te3.C64348eu0) r1
            int r3 = r1.f183032f
            if (r2 == 0) goto L_0x02fd
            android.content.res.Resources r1 = r42.getResources()
            r2 = 2131827226(0x7f111a1a, float:1.9287359E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r16 = 0
            r5[r16] = r12
            java.lang.String r1 = r1.getString(r2, r5)
            r46 = r3
            r17 = r4
            r12 = 127(0x7f, float:1.78E-43)
            goto L_0x0362
        L_0x02fd:
            android.content.res.Resources r2 = r42.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            di3.d r1 = di3.C86312j.m106911c(r12)
            r12 = r17
            gy3.C87412m.m108593f(r1, r12)
            tf0.p1 r1 = (tf0.C64916p1) r1
            com.tencent.mm.ui.widget.MMNeat7extView r12 = r9.f36658A
            android.text.TextPaint r12 = r12.getPaint()
            r6 = r36
            gy3.C87412m.m108593f(r12, r6)
            java.lang.String r30 = r44.mo571e()
            java.lang.String r31 = r44.mo573g()
            r32 = 0
            r33 = 4
            r34 = 0
            r29 = r15
            java.lang.String r6 = ok1.C62042e.m72808l0(r29, r30, r31, r32, r33, r34)
            r16 = 0
            r17 = 8
            r22 = 0
            r39 = r2
            r2 = r42
            r46 = r3
            r3 = r12
            r12 = r4
            r4 = r6
            r6 = r5
            r5 = r16
            r40 = r6
            r6 = r17
            r17 = r12
            r12 = 127(0x7f, float:1.78E-43)
            r7 = r22
            java.lang.CharSequence r1 = tf0.C64916p1.C64917a.m76441h(r1, r2, r3, r4, r5, r6, r7)
            r2 = r40
            r3 = 0
            r2[r3] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r46)
            r3 = 1
            r2[r3] = r1
            r1 = 2131827225(0x7f111a19, float:1.9287357E38)
            r3 = r39
            java.lang.String r1 = r3.getString(r1, r2)
        L_0x0362:
            gy3.C87412m.m108593f(r1, r14)
            r0.mo8811o(r8, r9, r1)
            r1 = 7
            r2 = r46
            if (r2 < r1) goto L_0x038e
            android.view.View r1 = r9.f36659B
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131232863(0x7f08085f, float:1.8081847E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            r3.setAlpha(r12)
            r1.setBackground(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            int r2 = r15.mo86989A0(r2)
            r1.setTextColor(r2)
            goto L_0x03b2
        L_0x038e:
            android.view.View r1 = r9.f36659B
            android.content.res.Resources r2 = r42.getResources()
            r3 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r1.setBackground(r2)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r9.f36658A
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
        L_0x03b2:
            r13.mo591b(r10, r11)
            rx3.b0 r16 = rx3.C13598b0.f38549a
            goto L_0x03ba
        L_0x03b8:
            r17 = r4
        L_0x03ba:
            if (r16 != 0) goto L_0x0423
            java.lang.String r1 = r0.f26129i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r17
            r2.append(r3)
            java.lang.Object r3 = r44.mo563q()
            if (r3 != 0) goto L_0x03cf
            goto L_0x03d1
        L_0x03cf:
            r18 = r3
        L_0x03d1:
            org.json.JSONObject r3 = o40.C61937h.m72709h(r18)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            android.view.View r1 = r9.f44854d
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r2.mo10233c(r3)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r6 = "onBindGlobalLevelUpMsg"
            java.lang.String r7 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLevelUpgrade"
            java.lang.String r5 = "onBindGlobalLevelUpMsg"
            java.lang.String r6 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;IZ)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0423:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7710r.mo8830p(android.content.Context, qk1.i0$a, cj1.o5, int, boolean):void");
    }
}
