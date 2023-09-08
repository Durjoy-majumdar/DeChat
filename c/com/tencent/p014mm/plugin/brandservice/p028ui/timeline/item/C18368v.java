package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.bizui.widget.BizRecTagTextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C18479j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C60193p4;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import kw0.C46746a;
import qx0.C22136a;
import rx3.C13598b0;
import s90.C77630j;
import te3.C22491bj2;
import te3.C22533wo3;
import te3.mr4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.v */
public abstract class C18368v {

    /* renamed from: a */
    public final Context f50872a;

    /* renamed from: b */
    public final C18508z2 f50873b;

    /* renamed from: c */
    public C32224a<C13598b0> f50874c;

    /* renamed from: d */
    public View f50875d;

    /* renamed from: e */
    public View f50876e;

    /* renamed from: f */
    public ImageView f50877f;

    /* renamed from: g */
    public View f50878g;

    /* renamed from: h */
    public MMNeat7extView f50879h;

    /* renamed from: i */
    public MMNeat7extView f50880i;

    /* renamed from: j */
    public MMNeat7extView f50881j;

    /* renamed from: k */
    public LinearLayout f50882k;

    /* renamed from: l */
    public TextView f50883l;

    /* renamed from: m */
    public View f50884m;

    /* renamed from: n */
    public WeImageView f50885n;

    /* renamed from: o */
    public BizRecTagTextView f50886o;

    /* renamed from: p */
    public final int f50887p;

    /* renamed from: q */
    public final C77630j f50888q = new C77630j();

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.v$a */
    public static final class C18369a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C18368v f50889d;

        /* renamed from: e */
        public final /* synthetic */ C22533wo3 f50890e;

        /* renamed from: f */
        public final /* synthetic */ C19623o0 f50891f;

        /* renamed from: g */
        public final /* synthetic */ int f50892g;

        public C18369a(C18368v vVar, C22533wo3 wo32, C19623o0 o0Var, int i) {
            this.f50889d = vVar;
            this.f50890e = wo32;
            this.f50891f = o0Var;
            this.f50892g = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f50889d.f50874c;
            if (aVar != null) {
                aVar.invoke();
            }
            mr4 mr4 = this.f50890e.f64690e.f63735o;
            String str = mr4 != null ? mr4.f184396h : null;
            if (!Util.isNullOrNil(str)) {
                Map<String, String> parseXml = XmlParser.parseXml(str, "finder_feed", (String) null);
                boolean z = false;
                if (parseXml != null) {
                    z = ((C60193p4) C86312j.m106911c(C60193p4.class)).mo78731f7(this.f50889d.f50872a, "", parseXml, ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(26, 2, 25, (Intent) null));
                }
                if (!z) {
                    C18368v vVar = this.f50889d;
                    C19623o0 o0Var = this.f50891f;
                    C22533wo3 wo32 = this.f50890e;
                    C87412m.m108593f(wo32, "itemMsg");
                    vVar.mo22930f(o0Var, wo32, this.f50892g);
                } else {
                    this.f50889d.f50873b.f51443n.mo22975b(this.f50891f, this.f50892g, (int) (System.currentTimeMillis() / ((long) 1000)));
                    Log.m105924i("MicroMsg.BizTimeLineItem", "enter finder success!");
                }
            } else {
                C18368v vVar2 = this.f50889d;
                C19623o0 o0Var2 = this.f50891f;
                C22533wo3 wo33 = this.f50890e;
                C87412m.m108593f(wo33, "itemMsg");
                vVar2.mo22930f(o0Var2, wo33, this.f50892g);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C18368v(Context context, C18508z2 z2Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
        this.f50872a = context;
        this.f50873b = z2Var;
        C18479j jVar = z2Var.f51445p;
        jVar.getClass();
        this.f50887p = C46746a.f125826a.mo71973f(jVar.f51309a) - (C18508z2.f51418S * 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x026d, code lost:
        if (r9 != false) goto L_0x026f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22820a(com.tencent.p014mm.storage.C19623o0 r28, int r29, android.view.View r30, android.view.View r31) {
        /*
            r27 = this;
            r0 = r27
            r5 = r28
            r3 = r29
            r1 = r31
            java.lang.String r2 = "info"
            gy3.C87412m.m108594g(r5, r2)
            java.lang.String r2 = "convertView"
            r4 = r30
            gy3.C87412m.m108594g(r4, r2)
            java.lang.String r2 = "parent"
            gy3.C87412m.m108594g(r1, r2)
            int r2 = r27.mo22822c()
            android.view.View r4 = r0.f50875d
            if (r4 == 0) goto L_0x0024
            goto L_0x00b8
        L_0x0024:
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
            r4 = 2131299321(0x7f090bf9, float:1.821664E38)
            android.view.View r4 = r2.findViewById(r4)
            r0.f50878g = r4
            r4 = 2131311250(0x7f093a92, float:1.8240835E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4 = 2131299330(0x7f090c02, float:1.8216658E38)
            android.view.View r4 = r2.findViewById(r4)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r4
            r0.f50879h = r4
            r4 = 2131299328(0x7f090c00, float:1.8216654E38)
            android.view.View r4 = r2.findViewById(r4)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r4
            r0.f50880i = r4
            r4 = 2131299323(0x7f090bfb, float:1.8216644E38)
            android.view.View r4 = r2.findViewById(r4)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r4
            r0.f50881j = r4
            r4 = 2131299324(0x7f090bfc, float:1.8216646E38)
            android.view.View r1 = r1.findViewById(r4)
            r0.f50876e = r1
            r1 = 2131300509(0x7f09109d, float:1.821905E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0.f50877f = r1
            r1 = 2131300533(0x7f0910b5, float:1.8219098E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2131306867(0x7f092973, float:1.8231945E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f50883l = r1
            r1 = 2131298118(0x7f090746, float:1.82142E38)
            android.view.View r1 = r2.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f50882k = r1
            r1 = 2131299724(0x7f090d8c, float:1.8217457E38)
            android.view.View r1 = r2.findViewById(r1)
            r0.f50884m = r1
            r1 = 2131299723(0x7f090d8b, float:1.8217455E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r0.f50885n = r1
            r1 = 2131311841(0x7f093ce1, float:1.8242034E38)
            android.view.View r1 = r2.findViewById(r1)
            com.tencent.mm.plugin.bizui.widget.BizRecTagTextView r1 = (com.tencent.p014mm.plugin.bizui.widget.BizRecTagTextView) r1
            r0.f50886o = r1
            r0.f50875d = r2
            r27.mo22827g()
        L_0x00b8:
            te3.lo3 r1 = r5.f55539x1
            java.util.LinkedList<java.lang.String> r1 = r1.f64176i
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r1 = 0
            goto L_0x00ca
        L_0x00c9:
            r1 = 1
        L_0x00ca:
            r11 = 8
            if (r1 == 0) goto L_0x0115
            android.view.View r1 = r0.f50884m
            if (r1 != 0) goto L_0x00d4
            goto L_0x015b
        L_0x00d4:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r2.mo10233c(r4)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem"
            java.lang.String r15 = "initFeedBack"
            java.lang.String r16 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem"
            java.lang.String r14 = "initFeedBack"
            java.lang.String r15 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x015b
        L_0x0115:
            android.view.View r1 = r0.f50884m
            if (r1 != 0) goto L_0x011a
            goto L_0x015b
        L_0x011a:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r4)
            java.lang.Object[] r20 = r2.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem"
            java.lang.String r22 = "initFeedBack"
            java.lang.String r23 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r1
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r20 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem"
            java.lang.String r21 = "initFeedBack"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x015b:
            android.view.View r1 = r0.f50884m
            if (r1 == 0) goto L_0x0167
            com.tencent.mm.plugin.brandservice.ui.timeline.item.w r2 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.w
            r2.<init>(r0, r5, r3)
            r1.setOnClickListener(r2)
        L_0x0167:
            android.content.Context r1 = r0.f50872a
            float r1 = kg3.C76577a.m92165p(r1)
            r2 = 1066401792(0x3f900000, float:1.125)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x018a
            kw0.a r1 = kw0.C46746a.f125826a
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f50885n
            android.content.Context r4 = r0.f50872a
            r6 = 31
            int r4 = kg3.C76577a.m92151b(r4, r6)
            android.content.Context r6 = r0.f50872a
            r7 = 21
            int r6 = kg3.C76577a.m92151b(r6, r7)
            r1.mo71979m(r2, r4, r6)
        L_0x018a:
            android.view.View r1 = r0.f50875d
            if (r1 != 0) goto L_0x018f
            goto L_0x01cf
        L_0x018f:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r4)
            java.lang.Object[] r13 = r2.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem"
            java.lang.String r15 = "filling"
            java.lang.String r16 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLFeedCommBigItem"
            java.lang.String r14 = "filling"
            java.lang.String r15 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;ILandroid/view/View;Landroid/view/View;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x01cf:
            te3.lo3 r1 = r5.f55539x1
            java.util.LinkedList<te3.wo3> r1 = r1.f64172e
            java.lang.Object r1 = r1.get(r10)
            r12 = r1
            te3.wo3 r12 = (te3.C22533wo3) r12
            te3.bj2 r1 = r12.f64690e
            java.lang.String r2 = "itemMsg.ItemInfo"
            gy3.C87412m.m108593f(r1, r2)
            r0.mo22928e(r1)
            android.view.View r1 = r0.f50878g
            if (r1 == 0) goto L_0x01f0
            com.tencent.mm.plugin.brandservice.ui.timeline.item.v$a r2 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.v$a
            r2.<init>(r0, r12, r5, r3)
            r1.setOnClickListener(r2)
        L_0x01f0:
            java.lang.String r1 = r12.f64694i
            if (r1 == 0) goto L_0x01fd
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            r1 = 0
            goto L_0x01fe
        L_0x01fd:
            r1 = 1
        L_0x01fe:
            if (r1 == 0) goto L_0x0212
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r0.f50880i
            if (r1 == 0) goto L_0x0209
            java.lang.String r2 = ""
            r1.mo104279b(r2)
        L_0x0209:
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r0.f50880i
            if (r1 != 0) goto L_0x020e
            goto L_0x0223
        L_0x020e:
            r1.setVisibility(r11)
            goto L_0x0223
        L_0x0212:
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r0.f50880i
            if (r1 != 0) goto L_0x0217
            goto L_0x021a
        L_0x0217:
            r1.setVisibility(r10)
        L_0x021a:
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r0.f50880i
            if (r1 == 0) goto L_0x0223
            java.lang.String r2 = r12.f64694i
            r1.mo104279b(r2)
        L_0x0223:
            android.widget.TextView r7 = r0.f50883l
            if (r7 == 0) goto L_0x0238
            qx0.a r1 = qx0.C22136a.f62618a
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r0.f50873b
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r2 = r2.f51443n
            r4 = 0
            android.content.Context r8 = r0.f50872a
            r3 = r29
            r5 = r28
            r6 = r12
            r1.mo35250b(r2, r3, r4, r5, r6, r7, r8)
        L_0x0238:
            qx0.a r1 = qx0.C22136a.f62618a
            te3.zo3 r2 = r12.f64696n
            com.tencent.mm.plugin.bizui.widget.BizRecTagTextView r3 = r0.f50886o
            r1.mo35251c(r2, r3)
            java.lang.String r1 = r12.f64694i
            if (r1 == 0) goto L_0x024e
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x024c
            goto L_0x024e
        L_0x024c:
            r1 = 0
            goto L_0x024f
        L_0x024e:
            r1 = 1
        L_0x024f:
            if (r1 == 0) goto L_0x0278
            java.lang.String r1 = r12.f64692g
            if (r1 == 0) goto L_0x025e
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x025c
            goto L_0x025e
        L_0x025c:
            r1 = 0
            goto L_0x025f
        L_0x025e:
            r1 = 1
        L_0x025f:
            if (r1 != 0) goto L_0x026f
            java.lang.String r1 = r12.f64693h
            if (r1 == 0) goto L_0x026d
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x026c
            goto L_0x026d
        L_0x026c:
            r9 = 0
        L_0x026d:
            if (r9 == 0) goto L_0x0278
        L_0x026f:
            android.widget.LinearLayout r1 = r0.f50882k
            if (r1 != 0) goto L_0x0274
            goto L_0x0280
        L_0x0274:
            r1.setVisibility(r11)
            goto L_0x0280
        L_0x0278:
            android.widget.LinearLayout r1 = r0.f50882k
            if (r1 != 0) goto L_0x027d
            goto L_0x0280
        L_0x027d:
            r1.setVisibility(r10)
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18368v.mo22820a(com.tencent.mm.storage.o0, int, android.view.View, android.view.View):void");
    }

    /* renamed from: b */
    public abstract int mo22821b();

    /* renamed from: c */
    public abstract int mo22822c();

    /* renamed from: d */
    public abstract void mo22823d();

    /* renamed from: e */
    public void mo22928e(C22491bj2 bj22) {
        C87412m.m108594g(bj22, "itemInfo");
        C77630j jVar = this.f50888q;
        jVar.f226333o = bj22.f63733j;
        jVar.f226330i = bj22.f63730g;
        jVar.f226312D = bj22.f63731h;
        jVar.f226326e = bj22.f63729f;
    }

    /* renamed from: f */
    public void mo22930f(C19623o0 o0Var, C22533wo3 wo32, int i) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(wo32, "recommendItem");
        if (o0Var.f55539x1 == null || wo32.f64689d == null || wo32.f64690e == null) {
            Log.m105928w("MicroMsg.BizTimeLineItem", "onAppMsgClick appMsg is null");
            return;
        }
        C22136a.f62618a.mo35252d(this.f50872a, o0Var, wo32, i);
        this.f50873b.f51443n.mo22975b(o0Var, 0, (int) (System.currentTimeMillis() / ((long) 1000)));
    }

    /* renamed from: g */
    public void mo22827g() {
    }

    /* renamed from: h */
    public final void mo22931h(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = i;
        }
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r3 = r3.f64690e;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22932i(te3.C22533wo3 r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = com.tencent.p014mm.storage.C19613h1.m21041n(r3)
            if (r1 == 0) goto L_0x000b
            return r0
        L_0x000b:
            te3.bj2 r3 = r3.f64690e
            if (r3 == 0) goto L_0x0018
            int r3 = r3.f63733j
            int r1 = r2.mo22821b()
            if (r3 != r1) goto L_0x0018
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18368v.mo22932i(te3.wo3):boolean");
    }
}
