package bz2;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import mz2.C47150c;

/* renamed from: bz2.b */
public final class C39873b extends C60896i<C47150c> {

    /* renamed from: e */
    public final C39874a f106931e;

    /* renamed from: bz2.b$a */
    public interface C39874a {
        /* renamed from: a */
        void mo62497a(Context context, long j);
    }

    public C39873b(C39874a aVar) {
        C87412m.m108594g(aVar, "onItemClickListener");
        this.f106931e = aVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cqk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0117, code lost:
        if (z04.C112551y.m153811k(r10) != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0147, code lost:
        if ((((java.lang.CharSequence) r2.get(1)).length() == 0) != false) goto L_0x018e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r21, jq3.C9493c r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            mz2.c r1 = (mz2.C47150c) r1
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r1, r2)
            r2 = 2131315705(0x7f094bf9, float:1.824987E38)
            android.view.View r2 = r0.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131306213(0x7f0926e5, float:1.8230619E38)
            android.view.View r3 = r0.mo85812D(r3)
            com.tencent.mm.plugin.textstatus.ui.TextStatusCircleIconLayout r3 = (com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCircleIconLayout) r3
            java.lang.String r4 = r1.f126671g
            r2.setText(r4)
            android.text.TextPaint r4 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r4)
            java.util.List<java.lang.String> r4 = r1.f126669e
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x003d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r4 = 0
            goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            r7 = 4
            if (r4 == 0) goto L_0x0054
            android.content.Context r0 = r0.f173499A
            r1 = 2131100909(0x7f0604ed, float:1.7814213E38)
            int r0 = kg3.C76577a.m92153d(r0, r1)
            r2.setTextColor(r0)
            r3.setVisibility(r7)
            r4 = r20
            goto L_0x024b
        L_0x0054:
            android.content.Context r4 = r0.f173499A
            r8 = 2131100174(0x7f06020e, float:1.7812722E38)
            int r4 = kg3.C76577a.m92153d(r4, r8)
            r2.setTextColor(r4)
            r3.setVisibility(r6)
            java.util.List<java.lang.String> r2 = r1.f126669e
            java.util.List<java.lang.String> r4 = r1.f126670f
            java.lang.String r8 = "iconIdList"
            gy3.C87412m.m108594g(r2, r8)
            java.lang.String r8 = "bgIdList"
            gy3.C87412m.m108594g(r4, r8)
            boolean r8 = r2.isEmpty()
            r9 = 8
            if (r8 != 0) goto L_0x01a1
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            java.lang.Object r8 = r2.get(r6)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0089
            r8 = 1
            goto L_0x008a
        L_0x0089:
            r8 = 0
        L_0x008a:
            if (r8 == 0) goto L_0x008e
            goto L_0x01a1
        L_0x008e:
            androidx.cardview.widget.CardView r7 = r3.f116914e
            if (r7 != 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r7.setVisibility(r6)
        L_0x0096:
            android.view.View r7 = r3.f116918i
            if (r7 != 0) goto L_0x009b
            goto L_0x00d9
        L_0x009b:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r8.mo10233c(r10)
            java.lang.Object[] r11 = r8.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCircleIconLayout"
            java.lang.String r13 = "setIcon"
            java.lang.String r14 = "(Ljava/util/List;Ljava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r7
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r8 = r8.mo10231a(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCircleIconLayout"
            java.lang.String r12 = "setIcon"
            java.lang.String r13 = "(Ljava/util/List;Ljava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x00d9:
            android.view.View r7 = r3.f116918i
            if (r7 == 0) goto L_0x00e3
            r8 = 2131231357(0x7f08027d, float:1.8078793E38)
            r7.setBackgroundResource(r8)
        L_0x00e3:
            b03.c r10 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            android.widget.ImageView r11 = r3.f116913d
            java.lang.Object r7 = r2.get(r6)
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            qy2.a$b r14 = qy2.C63347a.C47891b.WHITE
            r15 = 0
            r16 = 1
            r17 = 0
            r18 = 84
            r19 = 0
            b03.C39691c.m42340S(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            android.view.ViewGroup r7 = r3.f116916g
            r8 = 0
            if (r7 == 0) goto L_0x012c
            r10 = r4
            java.util.LinkedList r10 = (java.util.LinkedList) r10
            int r11 = r10.size()
            if (r11 <= 0) goto L_0x0119
            java.lang.Object r10 = r10.get(r6)
            java.lang.String r10 = (java.lang.String) r10
            boolean r11 = z04.C112551y.m153811k(r10)
            if (r11 == 0) goto L_0x011a
        L_0x0119:
            r10 = r8
        L_0x011a:
            if (r10 != 0) goto L_0x0123
            b03.p r10 = b03.C39718p.f106569a
            int r10 = r10.mo62352c()
            goto L_0x0129
        L_0x0123:
            b03.p r11 = b03.C39718p.f106569a
            int r10 = r11.mo62351b(r10)
        L_0x0129:
            r7.setBackgroundResource(r10)
        L_0x012c:
            int r7 = r2.size()
            if (r7 == r5) goto L_0x018e
            int r7 = r2.size()
            if (r7 <= r5) goto L_0x014a
            java.lang.Object r7 = r2.get(r5)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0146
            r7 = 1
            goto L_0x0147
        L_0x0146:
            r7 = 0
        L_0x0147:
            if (r7 == 0) goto L_0x014a
            goto L_0x018e
        L_0x014a:
            int r2 = r2.size()
            if (r2 <= r5) goto L_0x023f
            androidx.cardview.widget.CardView r2 = r3.f116915f
            if (r2 != 0) goto L_0x0155
            goto L_0x0158
        L_0x0155:
            r2.setVisibility(r6)
        L_0x0158:
            androidx.cardview.widget.CardView r2 = r3.f116919j
            if (r2 != 0) goto L_0x015d
            goto L_0x0160
        L_0x015d:
            r2.setVisibility(r6)
        L_0x0160:
            android.widget.LinearLayout r2 = r3.f116917h
            if (r2 == 0) goto L_0x023f
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            int r3 = r4.size()
            if (r3 <= r5) goto L_0x017a
            java.lang.Object r3 = r4.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = z04.C112551y.m153811k(r3)
            if (r4 == 0) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r8 = r3
        L_0x017a:
            if (r8 != 0) goto L_0x0183
            b03.p r3 = b03.C39718p.f106569a
            int r3 = r3.mo62352c()
            goto L_0x0189
        L_0x0183:
            b03.p r3 = b03.C39718p.f106569a
            int r3 = r3.mo62351b(r8)
        L_0x0189:
            r2.setBackgroundResource(r3)
            goto L_0x023f
        L_0x018e:
            androidx.cardview.widget.CardView r2 = r3.f116915f
            if (r2 != 0) goto L_0x0193
            goto L_0x0196
        L_0x0193:
            r2.setVisibility(r9)
        L_0x0196:
            androidx.cardview.widget.CardView r2 = r3.f116919j
            if (r2 != 0) goto L_0x019c
            goto L_0x023f
        L_0x019c:
            r2.setVisibility(r9)
            goto L_0x023f
        L_0x01a1:
            android.view.View r2 = r3.f116920n
            if (r2 != 0) goto L_0x01a6
            goto L_0x01e4
        L_0x01a6:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.mo10233c(r5)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCircleIconLayout"
            java.lang.String r13 = "hideViews"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCircleIconLayout"
            java.lang.String r12 = "hideViews"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x01e4:
            androidx.cardview.widget.CardView r2 = r3.f116914e
            if (r2 != 0) goto L_0x01e9
            goto L_0x01ec
        L_0x01e9:
            r2.setVisibility(r7)
        L_0x01ec:
            androidx.cardview.widget.CardView r2 = r3.f116915f
            if (r2 != 0) goto L_0x01f1
            goto L_0x01f4
        L_0x01f1:
            r2.setVisibility(r9)
        L_0x01f4:
            android.view.View r2 = r3.f116918i
            if (r2 != 0) goto L_0x01f9
            goto L_0x0237
        L_0x01f9:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r5)
            java.lang.Object[] r11 = r4.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCircleIconLayout"
            java.lang.String r13 = "hideViews"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r11 = "com/tencent/mm/plugin/textstatus/ui/TextStatusCircleIconLayout"
            java.lang.String r12 = "hideViews"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x0237:
            androidx.cardview.widget.CardView r2 = r3.f116919j
            if (r2 != 0) goto L_0x023c
            goto L_0x023f
        L_0x023c:
            r2.setVisibility(r9)
        L_0x023f:
            android.view.View r2 = r0.f44854d
            bz2.c r3 = new bz2.c
            r4 = r20
            r3.<init>(r4, r0, r1)
            r2.setOnClickListener(r3)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bz2.C39873b.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
