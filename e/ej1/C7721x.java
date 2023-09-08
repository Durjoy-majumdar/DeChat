package ej1;

import android.content.Context;
import cj1.C0534e1;
import cj1.C0581o5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import qk1.C12806i0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C52013xs0;
import yg1.C15999b;

/* renamed from: ej1.x */
public class C7721x extends C15999b {

    /* renamed from: i */
    public final C13601g f26148i = C36568h.m40985a(C7722a.f26150d);

    /* renamed from: j */
    public final String f26149j = "(.*?)<_wc_custom_img_.+?src\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*.*?/>(.*?)";

    /* renamed from: ej1.x$a */
    public static final class C7722a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7722a f26150d = new C7722a();

        public C7722a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7721x(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveBuContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0120  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8798b(android.content.Context r29, qk1.C12806i0.C12807a r30, cj1.C0581o5 r31, int r32) {
        /*
            r28 = this;
            r8 = r28
            r4 = r29
            r2 = r30
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "msg"
            r3 = r31
            gy3.C87412m.m108594g(r3, r0)
            super.mo8798b(r29, r30, r31, r32)
            java.lang.String r1 = ""
            java.lang.String r0 = r31.getContent()
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x002d
            int r7 = r0.length()
            if (r7 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r7 = 0
            goto L_0x002e
        L_0x002d:
            r7 = 1
        L_0x002e:
            r9 = 8
            java.lang.String r10 = "CommentItemNotify"
            if (r7 == 0) goto L_0x007d
            java.lang.String r0 = "onBindNotifyMsg msgContent empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            android.view.View r0 = r2.f44854d
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r2)
            java.lang.Object[] r12 = r1.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify"
            java.lang.String r14 = "onBindNotifyMsg"
            java.lang.String r15 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r1.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify"
            java.lang.String r13 = "onBindNotifyMsg"
            java.lang.String r14 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02d6
        L_0x007d:
            r7 = 2
            java.lang.String r11 = r8.f26149j     // Catch:{ all -> 0x0107 }
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch:{ all -> 0x0107 }
            java.util.regex.Matcher r0 = r11.matcher(r0)     // Catch:{ all -> 0x0107 }
            boolean r11 = r0.matches()     // Catch:{ all -> 0x0107 }
            if (r11 == 0) goto L_0x00af
            java.lang.String r11 = r0.group(r5)     // Catch:{ all -> 0x0107 }
            if (r11 != 0) goto L_0x0095
            r11 = r1
        L_0x0095:
            java.lang.String r12 = r0.group(r7)     // Catch:{ all -> 0x00ac }
            if (r12 != 0) goto L_0x009c
            r12 = r1
        L_0x009c:
            r13 = 3
            java.lang.String r0 = r0.group(r13)     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x00a4
            r0 = r1
        L_0x00a4:
            r13 = r12
            r12 = r11
            r11 = r0
            goto L_0x00b2
        L_0x00a8:
            r0 = move-exception
            r13 = r12
            r12 = r1
            goto L_0x010b
        L_0x00ac:
            r0 = move-exception
            r12 = r1
            goto L_0x010a
        L_0x00af:
            r11 = r1
            r12 = r11
            r13 = r12
        L_0x00b2:
            java.lang.String r0 = "&lt;"
            java.lang.String r14 = "<"
            java.lang.String r0 = z04.C112551y.m153814n(r13, r0, r14, r6)     // Catch:{ all -> 0x0100 }
            java.lang.String r14 = "&gt;"
            java.lang.String r15 = ">"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r14, r15, r6)     // Catch:{ all -> 0x0100 }
            java.lang.String r14 = "&amp;"
            java.lang.String r15 = "&"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r14, r15, r6)     // Catch:{ all -> 0x0100 }
            java.lang.String r14 = "&apos;"
            java.lang.String r15 = "'"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r14, r15, r6)     // Catch:{ all -> 0x0100 }
            java.lang.String r14 = "&quot;"
            java.lang.String r15 = "\""
            java.lang.String r13 = z04.C112551y.m153814n(r0, r14, r15, r6)     // Catch:{ all -> 0x0100 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0100 }
            r0.<init>()     // Catch:{ all -> 0x0100 }
            java.lang.String r14 = "matcher prefix:"
            r0.append(r14)     // Catch:{ all -> 0x0100 }
            r0.append(r12)     // Catch:{ all -> 0x0100 }
            java.lang.String r14 = ", imgUrl:"
            r0.append(r14)     // Catch:{ all -> 0x0100 }
            r0.append(r13)     // Catch:{ all -> 0x0100 }
            java.lang.String r14 = ", contentSuffix:"
            r0.append(r14)     // Catch:{ all -> 0x0100 }
            r0.append(r11)     // Catch:{ all -> 0x0100 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0100 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ all -> 0x0100 }
            r0 = r12
            goto L_0x0114
        L_0x0100:
            r0 = move-exception
            r27 = r12
            r12 = r11
            r11 = r27
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            r11 = r1
            r12 = r11
        L_0x010a:
            r13 = r12
        L_0x010b:
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.String r15 = "onBindNotifyMsg"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r15, r14)
            r0 = r11
            r11 = r12
        L_0x0114:
            r15 = r13
            int r12 = r0.length()
            if (r12 != 0) goto L_0x011d
            r12 = 1
            goto L_0x011e
        L_0x011d:
            r12 = 0
        L_0x011e:
            if (r12 != 0) goto L_0x028f
            int r12 = r15.length()
            if (r12 != 0) goto L_0x0128
            r12 = 1
            goto L_0x0129
        L_0x0128:
            r12 = 0
        L_0x0129:
            if (r12 != 0) goto L_0x028f
            int r12 = r11.length()
            if (r12 != 0) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r5 = 0
        L_0x0133:
            if (r5 == 0) goto L_0x0137
            goto L_0x028f
        L_0x0137:
            android.view.View r5 = r2.f44854d
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r9.mo10233c(r10)
            java.lang.Object[] r17 = r9.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify"
            java.lang.String r19 = "onBindNotifyMsg"
            java.lang.String r20 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r5
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r9 = r9.mo10231a(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r5.setVisibility(r9)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify"
            java.lang.String r18 = "onBindNotifyMsg"
            java.lang.String r19 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r9 = 32
            r5.append(r9)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.String r9 = r28.mo14624e()
            r10 = 0
            java.lang.String r1 = r8.mo14623a(r9, r10, r1, r5)
            de3.u r9 = new de3.u
            java.lang.Class<ny.h> r5 = p629ny.C76979h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ny.h r5 = (p629ny.C76979h) r5
            android.text.SpannableString r1 = r5.mo107057T1(r4, r1)
            r9.<init>((android.text.SpannableString) r1)
            wk1.l r1 = new wk1.l
            wk1.l$a r16 = wk1.C15437l.f41880f
            java.lang.String r17 = r28.mo14624e()
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            android.graphics.drawable.Drawable r5 = wk1.C15437l.C15438a.m14437a(r16, r17, r18, r19, r20, r21)
            wk1.m r11 = new wk1.m
            java.lang.String r17 = r28.mo14624e()
            float r19 = wk1.C15439m.f41885k
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131099697(0x7f060031, float:1.7811755E38)
            int r20 = r12.getColor(r13)
            int r21 = wk1.C15439m.f41883i
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r22 = r12.getColor(r13)
            int r23 = wk1.C15439m.f41884j
            r24 = 0
            r25 = 128(0x80, float:1.794E-43)
            r26 = 0
            r16 = r11
            r18 = r19
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.<init>(r5, r11)
            java.lang.String r5 = r28.mo14624e()
            r11 = 33
            int r5 = r5.length()
            int r5 = r5 + r6
            r9.mo105705b(r1, r6, r5, r11)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r2.f36658A
            r1.mo104279b(r9)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r2.f36658A
            int r5 = r8.f43055h
            float r5 = (float) r5
            r1.setTextSize(r5)
            android.view.View r1 = r2.f36659B
            android.content.res.Resources r5 = r29.getResources()
            r11 = 2131232561(0x7f080731, float:1.8081235E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r11)
            r1.setBackground(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r2.f36658A
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.RelativeLayout"
            gy3.C87412m.m108592e(r1, r5)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            int r5 = r1.getPaddingTop()
            int r11 = r1.getPaddingBottom()
            r1.setPadding(r6, r5, r6, r11)
            android.view.View r1 = r2.f44854d
            long r5 = r31.getSeq()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.setTag(r5)
            r14 = 0
            r1 = 0
            r16 = 6
            r17 = 0
            r12 = r9
            r13 = r0
            r5 = r15
            r15 = r1
            int r1 = z04.C112550d0.m153769E(r12, r13, r14, r15, r16, r17)
            int r0 = r0.length()
            int r0 = r0 + r1
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            bl3.r$a r1 = r1.mo62446e(r6)
            java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
            bl3.c r1 = r1.mo62447c(r6)
            pl1.s0 r1 = (pl1.C11990s0) r1
            k60.d r1 = r1.mo11871f2()
            pl1.f r6 = new pl1.f
            r6.<init>(r5, r10, r7, r10)
            l60.b r10 = r1.mo85955a(r6)
            ej1.z r11 = new ej1.z
            r1 = r11
            r2 = r30
            r3 = r31
            r4 = r29
            r5 = r28
            r6 = r9
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.getClass()
            r10.f291320d = r11
            r10.mo85951a()
            goto L_0x02d6
        L_0x028f:
            java.lang.String r0 = "onBindNotifyMsg match failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            android.view.View r0 = r2.f44854d
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo10233c(r2)
            java.lang.Object[] r12 = r1.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify"
            java.lang.String r14 = "onBindNotifyMsg"
            java.lang.String r15 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r1.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemNotify"
            java.lang.String r13 = "onBindNotifyMsg"
            java.lang.String r14 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x02d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ej1.C7721x.mo8798b(android.content.Context, qk1.i0$a, cj1.o5, int):void");
    }

    /* renamed from: c */
    public C0581o5 mo8804c(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        return new C0534e1(xs02);
    }

    /* renamed from: j */
    public int mo8797j() {
        return 20074;
    }

    /* renamed from: l */
    public void mo8805l(Context context, C12806i0.C12807a aVar, C0581o5 o5Var, int i, List<Object> list) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(o5Var, "msg");
        C87412m.m108594g(list, "payloads");
    }
}
