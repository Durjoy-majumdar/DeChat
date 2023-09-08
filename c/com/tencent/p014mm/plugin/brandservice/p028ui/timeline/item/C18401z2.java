package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import by0.C16825a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.bizui.widget.BizRecTagTextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import s90.C77630j;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z2 */
public final class C18401z2 extends C18366u2 {

    /* renamed from: d */
    public final C18508z2 f51015d;

    /* renamed from: e */
    public final Context f51016e;

    /* renamed from: f */
    public View f51017f;

    /* renamed from: g */
    public LinearLayout f51018g;

    /* renamed from: h */
    public LinkedList<C18402a> f51019h = new LinkedList<>();

    /* renamed from: i */
    public C18363u f51020i;

    /* renamed from: j */
    public C18385y f51021j;

    /* renamed from: k */
    public C18213b0 f51022k;

    /* renamed from: l */
    public C18398z f51023l;

    /* renamed from: m */
    public C18207a0 f51024m;

    /* renamed from: n */
    public int f51025n;

    /* renamed from: o */
    public final C18333q<C18402a> f51026o;

    /* renamed from: p */
    public final C18368v[] f51027p;

    /* renamed from: q */
    public boolean f51028q;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a */
    public final class C18402a extends C18339q3 {

        /* renamed from: D */
        public final C18508z2 f51029D;

        /* renamed from: E */
        public final Context f51030E;

        /* renamed from: F */
        public final ViewGroup f51031F;

        /* renamed from: G */
        public TextView f51032G;

        /* renamed from: H */
        public MMNeat7extView f51033H;

        /* renamed from: I */
        public LinearLayout f51034I;

        /* renamed from: J */
        public LinearLayout f51035J;

        /* renamed from: K */
        public LinearLayout f51036K;

        /* renamed from: L */
        public View f51037L;

        /* renamed from: M */
        public WeImageView f51038M;

        /* renamed from: N */
        public BizRecTagTextView f51039N;

        /* renamed from: O */
        public MMNeat7extView f51040O;

        /* renamed from: P */
        public MMNeat7extView f51041P;

        /* renamed from: Q */
        public final C77630j f51042Q = new C77630j();

        /* renamed from: R */
        public final /* synthetic */ C18401z2 f51043R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18402a(C18401z2 z2Var, C18508z2 z2Var2, Context context) {
            super(z2Var2, context);
            C87412m.m108594g(z2Var2, "adapter");
            C87412m.m108594g(context, "context");
            this.f51043R = z2Var;
            this.f51029D = z2Var2;
            this.f51030E = context;
            View inflate = View.inflate(context, C0966R.C0971layout.f6627k4, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.f51031F = viewGroup;
            this.f50771o = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.bs4);
            this.f50772p = (MMNeat7extView) viewGroup.findViewById(C0966R.C0970id.kp7);
            this.f51040O = (MMNeat7extView) viewGroup.findViewById(C0966R.C0970id.f359410ks2);
            this.f51041P = (MMNeat7extView) viewGroup.findViewById(C0966R.C0970id.f6158yx);
            this.f51033H = (MMNeat7extView) viewGroup.findViewById(C0966R.C0970id.b6z);
            this.f50774r = viewGroup.findViewById(C0966R.C0970id.buq);
            this.f50775s = (ImageView) viewGroup.findViewById(C0966R.C0970id.bv8);
            this.f50778v = (ImageView) viewGroup.findViewById(C0966R.C0970id.f358928hx1);
            this.f50781y = viewGroup.findViewById(C0966R.C0970id.hw8);
            this.f50782z = viewGroup.findViewById(C0966R.C0970id.hw7);
            this.f51032G = (TextView) viewGroup.findViewById(C0966R.C0970id.fey);
            this.f51034I = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.b6x);
            LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.b6y);
            this.f51035J = linearLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            this.f51037L = viewGroup.findViewById(C0966R.C0970id.bes);
            this.f51038M = (WeImageView) viewGroup.findViewById(C0966R.C0970id.ber);
            this.f51039N = (BizRecTagTextView) viewGroup.findViewById(C0966R.C0970id.f359015if1);
            this.f51036K = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.koz);
        }

        /* renamed from: d */
        public void mo22879d(C77630j jVar, C19623o0 o0Var, int i, boolean z) {
            C87412m.m108594g(jVar, "item");
            if (jVar.f226333o == 8) {
                View view = this.f50781y;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z) {
                    this.f50782z.setBackgroundResource(C0966R.C0969drawable.f4608ho);
                } else {
                    this.f50782z.setBackgroundResource(C0966R.C0969drawable.ags);
                }
            } else {
                View view3 = this.f50781y;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot", "setCoverMask", "(Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/BizTimeLineInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$b */
    public static final class C18403b extends C87413o implements C32224a<C18402a> {

        /* renamed from: d */
        public final /* synthetic */ C18401z2 f51044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18403b(C18401z2 z2Var) {
            super(0);
            this.f51044d = z2Var;
        }

        public Object invoke() {
            C18401z2 z2Var = this.f51044d;
            return new C18402a(z2Var, z2Var.f51015d, z2Var.f51016e);
        }
    }

    public C18401z2(C18508z2 z2Var, Context context) {
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(context, "context");
        this.f51015d = z2Var;
        this.f51016e = context;
        this.f51020i = new C18363u(context, z2Var);
        this.f51021j = new C18385y(context, z2Var);
        this.f51022k = new C18213b0(context, z2Var);
        this.f51023l = new C18398z(context, z2Var);
        this.f51024m = new C18207a0(context, z2Var);
        this.f51025n = 2001;
        this.f51026o = new C18333q<>(new C18403b(this));
        this.f51027p = new C18368v[]{this.f51020i, this.f51022k, this.f51023l, this.f51024m, this.f51021j};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x033e, code lost:
        if ((r1 == null || z04.C112551y.m153811k(r1)) != false) goto L_0x0340;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x04d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22815a(com.tencent.p014mm.storage.C19623o0 r35, int r36, android.view.View r37, android.view.View r38) {
        /*
            r34 = this;
            r0 = r34
            r9 = r35
            r10 = r36
            r1 = r37
            r2 = r38
            java.lang.String r3 = "info"
            gy3.C87412m.m108594g(r9, r3)
            java.lang.String r3 = "convertView"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "parent"
            gy3.C87412m.m108594g(r2, r3)
            android.view.View r3 = r0.f51017f
            if (r3 != 0) goto L_0x0038
            r3 = 2131316303(0x7f094e4f, float:1.8251084E38)
            android.view.View r3 = r2.findViewById(r3)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
            r4 = 2131298002(0x7f0906d2, float:1.8213965E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.f51018g = r4
            r0.f51017f = r3
        L_0x0038:
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r0.f51028q = r11
            android.widget.LinearLayout r3 = r0.f51018g
            if (r3 == 0) goto L_0x0046
            r3.removeAllViews()
        L_0x0046:
            java.util.LinkedList<com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a> r3 = r0.f51019h
            java.util.Iterator r3 = r3.iterator()
        L_0x004c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r3.next()
            com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18401z2.C18402a) r4
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q<com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a> r5 = r0.f51026o
            r5.mo22905b(r4)
            goto L_0x004c
        L_0x005e:
            java.util.LinkedList<com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a> r3 = r0.f51019h
            r3.clear()
            te3.lo3 r3 = r9.f55539x1
            java.lang.String r4 = "info.recFeed"
            gy3.C87412m.m108593f(r3, r4)
            boolean r3 = com.tencent.p014mm.storage.C19613h1.m21040m(r3)
            if (r3 != 0) goto L_0x056e
            te3.lo3 r3 = r9.f55539x1
            gy3.C87412m.m108593f(r3, r4)
            java.util.LinkedList<te3.wo3> r3 = r3.f64172e
            java.lang.Object r3 = r3.get(r11)
            java.lang.String r4 = "this.RecommendItem[0]"
            gy3.C87412m.m108593f(r3, r4)
            te3.wo3 r3 = (te3.C22533wo3) r3
            boolean r3 = com.tencent.p014mm.storage.C19613h1.m21041n(r3)
            if (r3 == 0) goto L_0x008b
            goto L_0x056e
        L_0x008b:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.v[] r1 = r0.f51027p
            int r2 = r1.length
            r3 = 0
        L_0x008f:
            if (r3 >= r2) goto L_0x0099
            r4 = r1[r3]
            r4.mo22823d()
            int r3 = r3 + 1
            goto L_0x008f
        L_0x0099:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.q<com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a> r1 = r0.f51026o
            java.lang.Object r1 = r1.mo22904a()
            r14 = r1
            com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a r14 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18401z2.C18402a) r14
            android.widget.LinearLayout r1 = r0.f51018g
            if (r1 == 0) goto L_0x00ab
            android.view.ViewGroup r2 = r14.f51031F
            r1.addView(r2)
        L_0x00ab:
            java.util.LinkedList<com.tencent.mm.plugin.brandservice.ui.timeline.item.z2$a> r1 = r0.f51019h
            r1.add(r14)
            te3.lo3 r1 = r9.f55539x1
            java.util.LinkedList<te3.wo3> r1 = r1.f64172e
            java.lang.Object r1 = r1.get(r11)
            java.lang.String r2 = "info.recFeed.RecommendItem[0]"
            gy3.C87412m.m108593f(r1, r2)
            r15 = r1
            te3.wo3 r15 = (te3.C22533wo3) r15
            r14.getClass()
            java.lang.Class<ex0.d> r16 = ex0.C45696d.class
            te3.lo3 r1 = r9.f55539x1
            java.util.LinkedList<java.lang.String> r1 = r1.f64176i
            if (r1 == 0) goto L_0x00d4
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r1 = 0
            goto L_0x00d5
        L_0x00d4:
            r1 = 1
        L_0x00d5:
            r8 = 8
            if (r1 == 0) goto L_0x0121
            android.view.View r1 = r14.f51037L
            if (r1 != 0) goto L_0x00df
            goto L_0x0163
        L_0x00df:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r20 = "initFeedBack"
            java.lang.String r21 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r19 = "initFeedBack"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0163
        L_0x0121:
            android.view.View r1 = r14.f51037L
            if (r1 != 0) goto L_0x0126
            goto L_0x0163
        L_0x0126:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r12)
            java.lang.Object[] r25 = r2.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r27 = "initFeedBack"
            java.lang.String r28 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r25 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r26 = "initFeedBack"
            java.lang.String r27 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;I)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x0163:
            android.view.View r1 = r14.f51037L
            if (r1 == 0) goto L_0x016f
            com.tencent.mm.plugin.brandservice.ui.timeline.item.w2 r2 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.w2
            r2.<init>(r14, r9, r10)
            r1.setOnClickListener(r2)
        L_0x016f:
            android.content.Context r1 = r14.f51030E
            float r1 = kg3.C76577a.m92165p(r1)
            r2 = 1066401792(0x3f900000, float:1.125)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0192
            kw0.a r1 = kw0.C46746a.f125826a
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r14.f51038M
            android.content.Context r3 = r14.f51030E
            r4 = 31
            int r3 = kg3.C76577a.m92151b(r3, r4)
            android.content.Context r4 = r14.f51030E
            r5 = 21
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r1.mo71979m(r2, r3, r4)
        L_0x0192:
            te3.bj2 r7 = r15.f64690e
            java.lang.String r1 = r7.f63727d
            java.lang.String r6 = r7.f63729f
            int r5 = r7.f63733j
            int r2 = r15.f64695j
            r3 = 4
            if (r2 != r3) goto L_0x01a1
            r2 = 1
            goto L_0x01a2
        L_0x01a1:
            r2 = 0
        L_0x01a2:
            r4 = 14
            java.lang.String r13 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r3 = -1
            if (r2 == 0) goto L_0x0238
            java.lang.String r2 = r7.f63728e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0238
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f50772p
            r2.setVisibility(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f50772p
            if (r2 == 0) goto L_0x01bf
            java.lang.String r8 = ""
            r2.mo104279b(r8)
        L_0x01bf:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f51040O
            if (r2 != 0) goto L_0x01c4
            goto L_0x01c7
        L_0x01c4:
            r2.setVisibility(r11)
        L_0x01c7:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f51041P
            if (r2 != 0) goto L_0x01cc
            goto L_0x01cf
        L_0x01cc:
            r2.setVisibility(r11)
        L_0x01cf:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f51040O
            if (r2 == 0) goto L_0x01d6
            r2.mo104279b(r1)
        L_0x01d6:
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r14.f51041P
            if (r1 == 0) goto L_0x01df
            java.lang.String r2 = r7.f63728e
            r1.mo104279b(r2)
        L_0x01df:
            android.view.ViewGroup r1 = r14.f51031F
            android.content.Context r2 = r14.f51030E
            int r2 = kg3.C76577a.m92151b(r2, r4)
            r1.setPadding(r11, r11, r11, r2)
            android.view.ViewGroup r1 = r14.f50771o
            android.content.Context r2 = r14.f51030E
            r4 = 4
            int r2 = kg3.C76577a.m92151b(r2, r4)
            r1.setPadding(r11, r2, r11, r11)
            android.view.View r1 = r14.f50774r
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r2, r13)
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            android.content.Context r8 = r14.f51030E
            int r4 = kg3.C76577a.m92151b(r8, r4)
            r2.topMargin = r4
            r1.setLayoutParams(r2)
            android.widget.LinearLayout r1 = r14.f51036K
            if (r1 == 0) goto L_0x0213
            r1.setPadding(r11, r11, r11, r11)
        L_0x0213:
            android.widget.LinearLayout r1 = r14.f51036K
            if (r1 == 0) goto L_0x0221
            android.widget.LinearLayout r2 = r14.f51034I
            int r1 = r1.indexOfChild(r2)
            if (r1 != r3) goto L_0x0221
            r1 = 1
            goto L_0x0222
        L_0x0221:
            r1 = 0
        L_0x0222:
            if (r1 != 0) goto L_0x02ab
            android.widget.LinearLayout r1 = r14.f51036K
            if (r1 == 0) goto L_0x022d
            android.widget.LinearLayout r2 = r14.f51034I
            r1.removeView(r2)
        L_0x022d:
            android.widget.LinearLayout r1 = r14.f51035J
            if (r1 == 0) goto L_0x02ab
            android.widget.LinearLayout r2 = r14.f51034I
            r1.addView(r2)
            goto L_0x02ab
        L_0x0238:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f50772p
            r2.setVisibility(r11)
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f51040O
            r8 = 8
            if (r2 != 0) goto L_0x0244
            goto L_0x0247
        L_0x0244:
            r2.setVisibility(r8)
        L_0x0247:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f51041P
            if (r2 != 0) goto L_0x024c
            goto L_0x024f
        L_0x024c:
            r2.setVisibility(r8)
        L_0x024f:
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r14.f50772p
            r2.mo104279b(r1)
            android.view.ViewGroup r1 = r14.f51031F
            r1.setPadding(r11, r11, r11, r11)
            android.view.ViewGroup r1 = r14.f50771o
            int r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51418S
            r1.setPadding(r11, r2, r11, r11)
            android.view.View r1 = r14.f50774r
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r2, r13)
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            android.content.Context r8 = r14.f51030E
            r13 = 4
            int r8 = kg3.C76577a.m92151b(r8, r13)
            r2.topMargin = r8
            int r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51417R
            r2.bottomMargin = r8
            r1.setLayoutParams(r2)
            android.widget.LinearLayout r1 = r14.f51036K
            if (r1 == 0) goto L_0x0288
            android.content.Context r2 = r14.f51030E
            int r2 = kg3.C76577a.m92151b(r2, r4)
            r1.setPadding(r11, r11, r11, r2)
        L_0x0288:
            android.widget.LinearLayout r1 = r14.f51035J
            if (r1 == 0) goto L_0x0296
            android.widget.LinearLayout r2 = r14.f51034I
            int r1 = r1.indexOfChild(r2)
            if (r1 != r3) goto L_0x0296
            r1 = 1
            goto L_0x0297
        L_0x0296:
            r1 = 0
        L_0x0297:
            if (r1 != 0) goto L_0x02ab
            android.widget.LinearLayout r1 = r14.f51035J
            if (r1 == 0) goto L_0x02a2
            android.widget.LinearLayout r2 = r14.f51034I
            r1.removeView(r2)
        L_0x02a2:
            android.widget.LinearLayout r1 = r14.f51036K
            if (r1 == 0) goto L_0x02ab
            android.widget.LinearLayout r2 = r14.f51034I
            r1.addView(r2)
        L_0x02ab:
            java.lang.String r1 = r15.f64694i
            if (r1 == 0) goto L_0x02b8
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x02b6
            goto L_0x02b8
        L_0x02b6:
            r1 = 0
            goto L_0x02b9
        L_0x02b8:
            r1 = 1
        L_0x02b9:
            if (r1 == 0) goto L_0x02c6
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r14.f51033H
            r8 = 8
            if (r1 != 0) goto L_0x02c2
            goto L_0x02d9
        L_0x02c2:
            r1.setVisibility(r8)
            goto L_0x02d9
        L_0x02c6:
            r8 = 8
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r14.f51033H
            if (r1 != 0) goto L_0x02cd
            goto L_0x02d0
        L_0x02cd:
            r1.setVisibility(r11)
        L_0x02d0:
            com.tencent.mm.ui.widget.MMNeat7extView r1 = r14.f51033H
            if (r1 == 0) goto L_0x02d9
            java.lang.String r2 = r15.f64694i
            r1.mo104279b(r2)
        L_0x02d9:
            android.widget.TextView r13 = r14.f51032G
            if (r13 == 0) goto L_0x02ff
            qx0.a r1 = qx0.C22136a.f62618a
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r2 = r14.f51029D
            com.tencent.mm.plugin.brandservice.ui.timeline.m3 r2 = r2.f51443n
            android.content.Context r4 = r14.f51030E
            r18 = 0
            r3 = r36
            r19 = r4
            r4 = r18
            r32 = r5
            r5 = r35
            r37 = r6
            r6 = r15
            r33 = r7
            r7 = r13
            r13 = 8
            r8 = r19
            r1.mo35250b(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0307
        L_0x02ff:
            r32 = r5
            r37 = r6
            r33 = r7
            r13 = 8
        L_0x0307:
            qx0.a r1 = qx0.C22136a.f62618a
            te3.zo3 r2 = r15.f64696n
            com.tencent.mm.plugin.bizui.widget.BizRecTagTextView r3 = r14.f51039N
            r1.mo35251c(r2, r3)
            java.lang.String r1 = r15.f64694i
            if (r1 == 0) goto L_0x031d
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x031b
            goto L_0x031d
        L_0x031b:
            r1 = 0
            goto L_0x031e
        L_0x031d:
            r1 = 1
        L_0x031e:
            if (r1 == 0) goto L_0x0349
            java.lang.String r1 = r15.f64692g
            if (r1 == 0) goto L_0x032d
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x032b
            goto L_0x032d
        L_0x032b:
            r1 = 0
            goto L_0x032e
        L_0x032d:
            r1 = 1
        L_0x032e:
            if (r1 != 0) goto L_0x0340
            java.lang.String r1 = r15.f64693h
            if (r1 == 0) goto L_0x033d
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x033b
            goto L_0x033d
        L_0x033b:
            r1 = 0
            goto L_0x033e
        L_0x033d:
            r1 = 1
        L_0x033e:
            if (r1 == 0) goto L_0x0349
        L_0x0340:
            android.widget.LinearLayout r1 = r14.f51034I
            if (r1 != 0) goto L_0x0345
            goto L_0x0351
        L_0x0345:
            r1.setVisibility(r13)
            goto L_0x0351
        L_0x0349:
            android.widget.LinearLayout r1 = r14.f51034I
            if (r1 != 0) goto L_0x034e
            goto L_0x0351
        L_0x034e:
            r1.setVisibility(r11)
        L_0x0351:
            fy0.i r1 = fy0.C8219i.f27144a
            android.view.ViewGroup r7 = r14.f51031F
            com.tencent.mm.plugin.brandservice.ui.timeline.item.x2 r8 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.x2
            r6 = 0
            r1 = r8
            r2 = r14
            r3 = r35
            r4 = r15
            r5 = r36
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setOnClickListener(r8)
            k40.a r1 = f40.C86709a0.m107533q(r16)
            ex0.d r1 = (ex0.C45696d) r1
            r2 = 1
            boolean r1 = r1.mo70957E5(r2)
            if (r1 == 0) goto L_0x038a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r37)
            if (r1 != 0) goto L_0x038a
            k40.a r1 = f40.C86709a0.m107533q(r16)
            ex0.d r1 = (ex0.C45696d) r1
            r2 = 90
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r4 = r37
            r5 = r32
            r1.Tn0(r4, r5, r2, r3)
            goto L_0x038e
        L_0x038a:
            r4 = r37
            r5 = r32
        L_0x038e:
            s90.j r1 = r14.f51042Q
            r1.f226333o = r5
            r2 = r33
            java.lang.String r3 = r2.f63731h
            if (r3 == 0) goto L_0x03a1
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x039f
            goto L_0x03a1
        L_0x039f:
            r3 = 0
            goto L_0x03a2
        L_0x03a1:
            r3 = 1
        L_0x03a2:
            if (r3 == 0) goto L_0x03a7
            java.lang.String r2 = r2.f63730g
            goto L_0x03a9
        L_0x03a7:
            java.lang.String r2 = r2.f63731h
        L_0x03a9:
            r1.f226330i = r2
            s90.j r1 = r14.f51042Q
            r1.f226326e = r4
            int r1 = r1.f226333o
            r2 = 5
            if (r1 != r2) goto L_0x03cd
            android.widget.ImageView r1 = r14.f50778v
            r1.setVisibility(r11)
            android.widget.ImageView r1 = r14.f50778v
            r3 = 2131231314(0x7f080252, float:1.8078706E38)
            r1.setImageResource(r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a
            s90.j r3 = r14.f51042Q
            java.lang.String r4 = r3.f226326e
            int r3 = r3.f226333o
            r1.mo63636e(r4, r3)
            goto L_0x03d2
        L_0x03cd:
            android.widget.ImageView r1 = r14.f50778v
            r1.setVisibility(r13)
        L_0x03d2:
            s90.j r1 = r14.f51042Q
            int r1 = r1.f226333o
            if (r1 != r13) goto L_0x0418
            android.view.View r1 = r14.f50781y
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r3.mo10233c(r12)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r21 = "initUI"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r20 = "initUI"
            java.lang.String r21 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x045b
        L_0x0418:
            android.view.View r1 = r14.f50781y
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3.mo10233c(r4)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r28 = "initUI"
            java.lang.String r29 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r1
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r3 = r3.mo10231a(r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r27 = "initUI"
            java.lang.String r28 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x045b:
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r14.f51029D
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r1 = r1.f51445p
            java.lang.String r3 = r35.mo25768r2()
            r1.mo23101b(r3)
            s90.j r1 = r14.f51042Q
            java.lang.String r1 = r1.f226330i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x04d5
            android.view.View r1 = r14.f50774r
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r12)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r21 = "initUI"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r20 = "initUI"
            java.lang.String r21 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r14.f51029D
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r1 = r1.f51445p
            long r2 = r9.field_orderFlag
            s90.j r5 = r14.f51042Q
            java.lang.String r6 = r5.f226330i
            android.widget.ImageView r7 = r14.f50775s
            int r11 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51416Q
            r12 = 0
            com.tencent.mm.plugin.brandservice.ui.timeline.item.y2 r13 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.y2
            r13.<init>(r14, r9, r10)
            int r4 = r9.f55523h1
            r8 = 1
            int r14 = r4 + 1
            r15 = 1073741824(0x40000000, float:2.0)
            r4 = r36
            r8 = r11
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r1.mo23107i(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x05b1
        L_0x04d5:
            s90.j r1 = r14.f51042Q
            int r1 = r1.f226333o
            if (r1 != r2) goto L_0x052d
            android.view.View r1 = r14.f50774r
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r12)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r21 = "initUI"
            java.lang.String r22 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r20 = "initUI"
            java.lang.String r21 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            com.tencent.mm.plugin.brandservice.ui.timeline.z2 r1 = r14.f51029D
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.j r2 = r1.f51445p
            android.widget.ImageView r4 = r14.f50775s
            int r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2.f51416Q
            int r1 = r9.f55523h1
            r3 = 1
            int r7 = r1 + 1
            java.lang.String r3 = "2131231667"
            r5 = r6
            r2.mo23108j(r3, r4, r5, r6, r7)
            goto L_0x05b1
        L_0x052d:
            android.view.View r8 = r14.f50774r
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r1.mo10233c(r2)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r15 = "initUI"
            java.lang.String r16 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r8
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.mo10231a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent$BizRecFeedCommonSlot"
            java.lang.String r10 = "initUI"
            java.lang.String r11 = "(Lcom/tencent/mm/storage/BizTimeLineInfo;Lcom/tencent/mm/protocal/protobuf/RecommendItemMsg;II)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x05b1
        L_0x056e:
            com.tencent.mm.plugin.brandservice.ui.timeline.item.v[] r3 = r0.f51027p
            int r4 = r3.length
            r5 = 0
        L_0x0572:
            if (r5 >= r4) goto L_0x05b1
            r6 = r3[r5]
            te3.lo3 r7 = r9.f55539x1
            java.util.LinkedList<te3.wo3> r7 = r7.f64172e
            java.lang.Object r7 = r7.get(r11)
            te3.wo3 r7 = (te3.C22533wo3) r7
            boolean r7 = r6.mo22932i(r7)
            if (r7 != 0) goto L_0x058b
            r6.mo22823d()
            r6 = 1
            goto L_0x05ae
        L_0x058b:
            r6.mo22820a(r9, r10, r1, r2)
            boolean r6 = r6 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18213b0
            if (r6 == 0) goto L_0x05a4
            r6 = 1
            r0.f51028q = r6
            by0.a r7 = by0.C16825a.f45444a
            r7.mo17868f(r9, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.item.b0 r7 = r0.f51022k
            com.tencent.mm.plugin.brandservice.ui.timeline.item.a3 r8 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.a3
            r8.<init>(r0, r9)
            r7.f50874c = r8
            goto L_0x05ae
        L_0x05a4:
            r6 = 1
            com.tencent.mm.plugin.brandservice.ui.timeline.item.b0 r7 = r0.f51022k
            com.tencent.mm.plugin.brandservice.ui.timeline.item.b3 r8 = new com.tencent.mm.plugin.brandservice.ui.timeline.item.b3
            r8.<init>(r0, r9)
            r7.f50874c = r8
        L_0x05ae:
            int r5 = r5 + 1
            goto L_0x0572
        L_0x05b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18401z2.mo22815a(com.tencent.mm.storage.o0, int, android.view.View, android.view.View):void");
    }

    /* renamed from: b */
    public int mo22837b() {
        return this.f51025n;
    }

    /* renamed from: c */
    public Object mo22832c(C15601d<? super View> dVar) {
        return this.f51022k.f50876e;
    }

    /* renamed from: d */
    public void mo22838d() {
        View view = this.f51017f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent", "gone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public boolean mo22833e() {
        return this.f51028q;
    }

    /* renamed from: f */
    public void mo22834f(int i) {
    }

    /* renamed from: g */
    public void mo22839g() {
        View view = this.f51017f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecFeedContent", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: h */
    public void mo22968h(C19623o0 o0Var, String str) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(str, "extra");
        C16825a.f45444a.mo17864b(o0Var, str);
    }
}
