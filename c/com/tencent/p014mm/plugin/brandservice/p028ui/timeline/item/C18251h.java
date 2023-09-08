package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.happybubble.BubbleLayout;
import com.tencent.p014mm.p136ui.widget.happybubble.C19857a;
import com.tencent.p014mm.p136ui.widget.happybubble.LabelsView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kw0.C46746a;
import sx3.C36907w;
import sx3.C64197v;
import te3.C22495eh;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h */
public final class C18251h extends C19857a implements View.OnClickListener {

    /* renamed from: q */
    public final C19623o0 f50472q;

    /* renamed from: r */
    public final C18508z2 f50473r;

    /* renamed from: s */
    public final C22495eh f50474s;

    /* renamed from: t */
    public final int f50475t;

    /* renamed from: u */
    public final C18252a f50476u;

    /* renamed from: v */
    public final String f50477v = "MicroMsg.BizTLRecCardUtil";

    /* renamed from: w */
    public List<String> f50478w;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h$a */
    public static final class C18252a {

        /* renamed from: a */
        public Button f50479a;

        /* renamed from: b */
        public LabelsView f50480b;

        public C18252a(View view) {
            C87412m.m108594g(view, "rootView");
            View findViewById = view.findViewById(C0966R.C0970id.hll);
            C87412m.m108593f(findViewById, "rootView.findViewById(R.id.ok_btn)");
            this.f50479a = (Button) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.ke8);
            C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.tag_layout)");
            this.f50480b = (LabelsView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.abr);
            C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.biz_rec_card_reason_tv)");
            ((TextView) findViewById3).getPaint().setFakeBoldText(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18251h(Context context, C19623o0 o0Var, C18508z2 z2Var, C22495eh ehVar, int i) {
        super(context);
        LinkedList<String> linkedList;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(z2Var, "adapter");
        this.f50472q = o0Var;
        this.f50473r = z2Var;
        this.f50474s = ehVar;
        this.f50475t = i;
        this.f56546i = new C19857a.C19860d[]{C19857a.C19860d.BOTTOM, C19857a.C19860d.TOP};
        String str = null;
        BubbleLayout bubbleLayout = new BubbleLayout(context, (AttributeSet) null);
        bubbleLayout.setBubbleColor(context.getResources().getColor(C0966R.color.BW_100));
        bubbleLayout.setBubbleRadius(C76577a.m92151b(context, 8));
        bubbleLayout.setShadowColor(0);
        bubbleLayout.setLookWidth(C76577a.m92151b(context, 14));
        bubbleLayout.setLookLength(C76577a.m92151b(context, 7));
        this.f56541d = bubbleLayout;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6621jy, (ViewGroup) null);
        C87412m.m108593f(inflate, "rootView");
        this.f50476u = new C18252a(inflate);
        View findViewById = inflate.findViewById(C0966R.C0970id.bsb);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.content_root_layout)");
        int f = C46746a.f125826a.mo71973f(context);
        int j = C76577a.m92159j(context);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.width = (f >= j ? j : f) - C76577a.m92151b(context, 82);
        findViewById.setLayoutParams(layoutParams);
        LinkedList<C18237e> linkedList2 = new LinkedList<>();
        if (o0Var.mo25774x2().f64521j == 102) {
            LinkedList<String> linkedList3 = o0Var.mo25774x2().f64523o.f63910o;
            C87412m.m108593f(linkedList3, "info.tlRecCardWrapper.ex…fo.NegativeFeedbackReason");
            int i2 = 0;
            for (T next : linkedList3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    linkedList2.add(new C18237e((String) next, i2));
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        } else if (!(ehVar == null || (linkedList = ehVar.f63801o) == null)) {
            int i4 = 0;
            for (T next2 : linkedList) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    linkedList2.add(new C18237e((String) next2, i4));
                    i4 = i5;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        this.f50476u.f50480b.mo154537i(linkedList2, C18288i.f50568a);
        this.f50476u.f50480b.mo154511a();
        this.f50476u.f50480b.setOnLabelClickListener(new C18295j(this));
        String str2 = "";
        for (C18237e eVar : linkedList2) {
            if (!Util.isNullOrNil(str2)) {
                str2 = str2 + '#';
            }
            str2 = str2 + eVar.f50429a;
        }
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[5];
        C22495eh ehVar2 = this.f50474s;
        objArr[0] = ehVar2 != null ? ehVar2.f63794e : str;
        objArr[1] = Long.valueOf(this.f50472q.mo25774x2().f64519h);
        objArr[2] = str2;
        objArr[3] = Integer.valueOf(C19636w0.f55626c);
        objArr[4] = Integer.valueOf(this.f50475t);
        nVar.mo160131h(18644, objArr);
        this.f56542e = inflate;
        this.f50476u.f50479a.setOnClickListener(this);
    }

    public void dismiss() {
        re4 x2 = this.f50472q.mo25774x2();
        List<C18237e> labels = this.f50476u.f50480b.getLabels();
        C87412m.m108593f(labels, "mViewHolder.labelsView.getLabels<BizRecCardTag>()");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(labels, 10));
        for (C18237e eVar : labels) {
            arrayList.add(eVar.f50429a);
        }
        if (this.f50472q.mo25774x2().f64521j == 102) {
            C87412m.m108593f(x2, "wrapper");
            C18355t.m18922a(3, 3, x2, arrayList, this.f50478w, this.f50472q);
        } else {
            C87412m.m108593f(x2, "wrapper");
            C18355t.m18922a(3, 1, x2, arrayList, this.f50478w, this.f50472q);
        }
        super.dismiss();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0093, code lost:
        r3 = r3.f63800n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r25) {
        /*
            r24 = this;
            r6 = r24
            r7 = r25
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowNegativeDialog"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r24
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "v"
            gy3.C87412m.m108594g(r7, r0)
            int r0 = r25.getId()
            r1 = 2131310504(0x7f0937a8, float:1.8239322E38)
            if (r0 != r1) goto L_0x014f
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.h$a r1 = r6.f50476u
            com.tencent.mm.ui.widget.happybubble.LabelsView r1 = r1.f50480b
            java.util.List r1 = r1.getSelectLabelDatas()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0082
            java.util.Iterator r1 = r1.iterator()
            r3 = r2
        L_0x0045:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x007f
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.e r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18237e) r4
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0068
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r3 = 35
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x0068:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = r4.f50429a
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = r4.f50429a
            r0.add(r4)
            goto L_0x0045
        L_0x007f:
            r16 = r3
            goto L_0x0084
        L_0x0082:
            r16 = r2
        L_0x0084:
            r6.f50478w = r0
            com.tencent.mm.storage.o0 r0 = r6.f50472q
            te3.re4 r0 = r0.mo25774x2()
            te3.hb0 r1 = r0.f64523o
            te3.eh r3 = r6.f50474s
            r4 = 0
            if (r3 == 0) goto L_0x009e
            java.util.LinkedList<te3.dh> r3 = r3.f63800n
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r3.get(r4)
            te3.dh r3 = (te3.C22493dh) r3
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r3 == 0) goto L_0x00a4
            java.lang.String r7 = r3.f63755i
            goto L_0x00a5
        L_0x00a4:
            r7 = 0
        L_0x00a5:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            r9 = 0
            if (r8 != 0) goto L_0x00cc
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r8 = "idx"
            java.lang.String r8 = r7.getQueryParameter(r8)     // Catch:{ Exception -> 0x00c8 }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)     // Catch:{ Exception -> 0x00c8 }
            java.lang.String r11 = "mid"
            java.lang.String r7 = r7.getQueryParameter(r11)     // Catch:{ Exception -> 0x00c6 }
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r9)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            goto L_0x00ca
        L_0x00c8:
            r8 = 0
        L_0x00ca:
            r11 = r8
            goto L_0x00cd
        L_0x00cc:
            r11 = 0
        L_0x00cd:
            java.lang.String r7 = r6.f50477v
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "onClick msgId = "
            r8.append(r12)
            com.tencent.mm.storage.o0 r12 = r6.f50472q
            long r12 = r12.field_msgId
            r8.append(r12)
            java.lang.String r12 = ", cardId="
            r8.append(r12)
            java.lang.String r12 = r1.f63908j
            r8.append(r12)
            java.lang.String r12 = ", style="
            r8.append(r12)
            com.tencent.mm.storage.o0 r12 = r6.f50472q
            te3.re4 r12 = r12.mo25774x2()
            int r12 = r12.f64521j
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r7 = r6.f50473r
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r7 = r7.f51443n
            te3.eh r8 = r6.f50474s
            if (r8 == 0) goto L_0x010c
            java.lang.String r8 = r8.f63794e
            goto L_0x010d
        L_0x010c:
            r8 = 0
        L_0x010d:
            r12 = 17
            long r14 = r0.f64519h
            r17 = 0
            java.lang.String r4 = r1.f63909n
            java.lang.String r5 = r0.f64522n
            java.lang.String r1 = r1.f63908j
            if (r3 == 0) goto L_0x0120
            int r13 = r3.f63747F
            r21 = r13
            goto L_0x0122
        L_0x0120:
            r21 = 0
        L_0x0122:
            int r0 = r0.f64521j
            if (r3 == 0) goto L_0x012b
            java.lang.String r3 = r3.f63748G
            r18 = r3
            goto L_0x012d
        L_0x012b:
            r18 = 0
        L_0x012d:
            if (r18 != 0) goto L_0x0132
            r23 = r2
            goto L_0x0134
        L_0x0132:
            r23 = r18
        L_0x0134:
            r2 = 0
            r13 = r2
            r18 = r4
            r19 = r5
            r20 = r1
            r22 = r0
            r7.mo22986m(r8, r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.storage.p0 r0 = rb0.C48009v0.Jx0()
            com.tencent.mm.storage.o0 r1 = r6.f50472q
            long r1 = r1.field_msgId
            r0.mo25785Lo(r1)
            r24.dismiss()
        L_0x014f:
            java.lang.String r0 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizRecCardUnfollowNegativeDialog"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18251h.onClick(android.view.View):void");
    }
}
