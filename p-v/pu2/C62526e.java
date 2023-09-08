package pu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import ad0.C91999u;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60216z4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ks2.C99181f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64628pk1;
import te3.C64682rk1;
import uo3.C78253a;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu2.e */
public final class C62526e extends C62508a {

    /* renamed from: X0 */
    public static final /* synthetic */ int f177606X0 = 0;

    /* renamed from: T0 */
    public View f177607T0;

    /* renamed from: U0 */
    public View f177608U0;

    /* renamed from: V0 */
    public final C13601g f177609V0 = C36568h.m40985a(new C62529b(this));

    /* renamed from: W0 */
    public final HashMap<String, Boolean> f177610W0 = new HashMap<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2", mo125469f = "ImproveFinderMediaTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.e$a */
    public static final class C62527a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C62526e f177611d;

        /* renamed from: pu2.e$a$a */
        public static final class C62528a<T> implements C60216z4.C8821a {

            /* renamed from: a */
            public final /* synthetic */ C64682rk1 f177612a;

            public C62528a(C64682rk1 rk12) {
                this.f177612a = rk12;
            }

            /* renamed from: a */
            public void mo6382a(Object obj) {
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
                Integer num = (Integer) obj;
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
                String str = this.f177612a.f185183d;
                C87412m.m108591d(num);
                int intValue = num.intValue();
                SnsMethodCalculate.markStartTimeMs("loadFinish", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
                C99181f.m129207j(str == null ? "" : str, intValue);
                C99181f.m129206h(str == null ? "" : str, -1, -1);
                if (str == null) {
                    str = "";
                }
                C99181f.m129209o(str);
                SnsMethodCalculate.markEndTimeMs("loadFinish", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62527a(C62526e eVar, C15601d<? super C62527a> dVar) {
            super(2, dVar);
            this.f177611d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2");
            C62527a aVar = new C62527a(this.f177611d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C62527a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x006e, code lost:
            if (r3.get(r13.getSnsId()) == null) goto L_0x0070;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r0 = "invokeSuspend"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$loadCustomItemInfo$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                kotlin.ResultKt.throwOnFailure(r13)
                pu2.e r13 = r12.f177611d
                com.tencent.mm.plugin.sns.ui.w6 r13 = r13.getStruct()
                com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r13.f281367a
                if (r13 == 0) goto L_0x019f
                pu2.e r13 = r12.f177611d
                com.tencent.mm.plugin.sns.ui.w6 r13 = r13.getStruct()
                com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r13.f281367a
                com.tencent.mm.protocal.protobuf.TimeLineObject r13 = r13.getTimeLine()
                te3.j00 r13 = r13.ContentObj
                if (r13 == 0) goto L_0x019f
                pu2.e r13 = r12.f177611d
                com.tencent.mm.plugin.sns.ui.w6 r13 = r13.getStruct()
                com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r13.f281367a
                com.tencent.mm.protocal.protobuf.TimeLineObject r13 = r13.getTimeLine()
                te3.j00 r13 = r13.ContentObj
                te3.rk1 r13 = r13.f298431o
                if (r13 != 0) goto L_0x0038
                goto L_0x019f
            L_0x0038:
                pu2.e r13 = r12.f177611d
                com.tencent.mm.plugin.sns.ui.w6 r13 = r13.getStruct()
                com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r13.f281367a
                pu2.e r2 = r12.f177611d
                com.tencent.mm.plugin.sns.ui.w6 r2 = r2.getStruct()
                com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.f281367a
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.getTimeLine()
                te3.j00 r2 = r2.ContentObj
                te3.rk1 r2 = r2.f298431o
                java.lang.String r3 = r13.getSnsId()
                java.lang.String r4 = "access$getListenerStatusMap$p"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem"
                if (r3 == 0) goto L_0x0070
                pu2.e r3 = r12.f177611d
                int r6 = pu2.C62526e.f177606X0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = r3.f177610W0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                java.lang.String r6 = r13.getSnsId()
                java.lang.Object r3 = r3.get(r6)
                if (r3 != 0) goto L_0x00b8
            L_0x0070:
                pu2.e r3 = r12.f177611d
                java.lang.String r6 = "finderShareObject"
                gy3.C87412m.m108593f(r2, r6)
                int r6 = pu2.C62526e.f177606X0
                java.lang.String r6 = "access$viewExposeReport"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                r3.getClass()
                java.lang.String r7 = "viewExposeReport"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r5)
                android.view.View r8 = r3.f177608U0
                if (r8 == 0) goto L_0x0093
                pu2.f r9 = new pu2.f
                r9.<init>(r2, r3, r13)
                zp3.C23564m.m28138h(r8, r9)
            L_0x0093:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                java.lang.String r3 = r13.getSnsId()
                if (r3 == 0) goto L_0x00b8
                pu2.e r3 = r12.f177611d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = r3.f177610W0
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                java.lang.String r4 = r13.getSnsId()
                java.lang.String r5 = "snsInfo.snsId"
                gy3.C87412m.m108593f(r4, r5)
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r3.put(r4, r5)
            L_0x00b8:
                java.util.LinkedList<te3.pk1> r3 = r2.f185190n
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                if (r3 != 0) goto L_0x0199
                java.util.LinkedList<te3.pk1> r3 = r2.f185190n
                r4 = 0
                java.lang.Object r3 = r3.get(r4)
                te3.pk1 r3 = (te3.C64628pk1) r3
                if (r3 == 0) goto L_0x0199
                float r5 = r3.f184829g
                int r5 = (int) r5
                float r6 = r3.f184830h
                int r6 = (int) r6
                pu2.e r7 = r12.f177611d
                android.content.Context r7 = r7.getContext()
                android.util.Pair r5 = ad0.C91999u.m115565k(r5, r6, r7, r4)
                java.lang.Object r6 = r5.first
                java.lang.Integer r6 = (java.lang.Integer) r6
                java.lang.Object r5 = r5.second
                java.lang.Integer r5 = (java.lang.Integer) r5
                pu2.e r7 = r12.f177611d
                android.view.View r7 = pu2.C62526e.m73487H(r7)
                r8 = 0
                if (r7 == 0) goto L_0x00f1
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                goto L_0x00f2
            L_0x00f1:
                r7 = r8
            L_0x00f2:
                if (r7 != 0) goto L_0x00f5
                goto L_0x0101
            L_0x00f5:
                java.lang.String r9 = "smallSide"
                gy3.C87412m.m108593f(r6, r9)
                int r6 = r6.intValue()
                r7.width = r6
            L_0x0101:
                pu2.e r6 = r12.f177611d
                android.view.View r6 = pu2.C62526e.m73487H(r6)
                if (r6 == 0) goto L_0x010d
                android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            L_0x010d:
                if (r8 != 0) goto L_0x0110
                goto L_0x011c
            L_0x0110:
                java.lang.String r6 = "smallHeight"
                gy3.C87412m.m108593f(r5, r6)
                int r5 = r5.intValue()
                r8.height = r5
            L_0x011c:
                pu2.e r5 = r12.f177611d
                android.view.View r5 = pu2.C62526e.m73487H(r5)
                if (r5 == 0) goto L_0x0127
                r5.requestLayout()
            L_0x0127:
                pu2.e r5 = r12.f177611d
                android.content.Context r5 = r5.getContext()
                r6 = 2131836924(0x7f113ffc, float:1.9307029E38)
                java.lang.String r5 = kg3.C76577a.m92166q(r5, r6)
                java.lang.String r6 = "getString(context, R.string.sns_finder_who_video)"
                gy3.C87412m.m108593f(r5, r6)
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]
                java.lang.String r8 = vr2.C102236a0.m134703A(r2)
                r7[r4] = r8
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r7, r6)
                java.lang.String r4 = java.lang.String.format(r5, r4)
                java.lang.String r5 = "format(format, *args)"
                gy3.C87412m.m108593f(r4, r5)
                pu2.e r5 = r12.f177611d
                android.view.View r5 = pu2.C62526e.m73487H(r5)
                if (r5 != 0) goto L_0x0158
                goto L_0x015b
            L_0x0158:
                r5.setContentDescription(r4)
            L_0x015b:
                java.lang.String r6 = r13.getSnsId()
                java.lang.String r13 = r2.f185183d
                java.lang.String r4 = "startLoad"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                if (r13 != 0) goto L_0x016d
                java.lang.String r13 = ""
            L_0x016d:
                r7 = r13
                r8 = -1
                r10 = 0
                r11 = 0
                java.lang.String r9 = "timeline"
                ks2.C99181f.m129210p(r6, r7, r8, r9, r10, r11)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                pu2.e$a$a r13 = new pu2.e$a$a
                r13.<init>(r2)
                java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ht1.t1 r2 = (ht1.C60200t1) r2
                java.lang.String r3 = r3.f184828f
                pu2.e r4 = r12.f177611d
                android.widget.ImageView r4 = pu2.C62526e.m73488I(r4)
                java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
                r5.<init>(r13)
                pl1.e0$a r13 = pl1.C11978e0.C11979a.COMMON
                r2.mo76809Sd(r3, r4, r5, r13)
            L_0x0199:
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r13
            L_0x019f:
                pu2.e r13 = r12.f177611d
                java.lang.String r2 = "MicroMsg.Improve.ImproveFinderMediaTimelineItem"
                java.lang.String r3 = "loadCustomItemInfo error"
                r13.mo140440l(r2, r3)
                java.lang.Boolean r13 = java.lang.Boolean.FALSE
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: pu2.C62526e.C62527a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: pu2.e$b */
    public static final class C62529b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62526e f177613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62529b(C62526e eVar) {
            super(0);
            this.f177613d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$thumbImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$thumbImg$2");
            View H = C62526e.m73487H(this.f177613d);
            ImageView imageView = H != null ? (ImageView) H.findViewById(C0966R.C0970id.jtg) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$thumbImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$thumbImg$2");
            return imageView;
        }
    }

    /* renamed from: pu2.e$c */
    public static final class C62530c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62526e f177614d;

        /* renamed from: e */
        public final /* synthetic */ C96275w6 f177615e;

        public C62530c(C62526e eVar, C96275w6 w6Var) {
            this.f177614d = eVar;
            this.f177615e = w6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderMediaTimelineItem$updateStruct$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$updateStruct$1");
            C62526e eVar = this.f177614d;
            eVar.mo140441m("MicroMsg.Improve.ImproveFinderMediaTimelineItem", C100960u0.f295631a.mo140476a(this.f177615e) + " perform click");
            this.f177614d.getAdapter().f278576j.f280587e.onClick(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem$updateStruct$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveFinderMediaTimelineItem$updateStruct$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62526e(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: H */
    public static final /* synthetic */ View m73487H(C62526e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        View view = eVar.f177608U0;
        SnsMethodCalculate.markEndTimeMs("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return view;
    }

    /* renamed from: I */
    public static final /* synthetic */ ImageView m73488I(C62526e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        ImageView thumbImg = eVar.getThumbImg();
        SnsMethodCalculate.markEndTimeMs("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return thumbImg;
    }

    private final C64628pk1 getFinderMedia() {
        SnsMethodCalculate.markStartTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        C64682rk1 rk12 = getStruct().f281367a.getTimeLine().ContentObj.f298431o;
        if (!Util.isNullOrNil((List) rk12.f185190n)) {
            C64628pk1 pk12 = rk12.f185190n.get(0);
            SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
            return pk12;
        }
        SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return null;
    }

    private final ImageView getThumbImg() {
        SnsMethodCalculate.markStartTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        ImageView imageView = (ImageView) ((C36570n) this.f177609V0).getValue();
        SnsMethodCalculate.markEndTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return imageView;
    }

    /* renamed from: B */
    public Object mo87537B(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C62527a(this, (C15601d<? super C62527a>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return g;
    }

    /* renamed from: C */
    public void mo87548C(C96275w6 w6Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        C87412m.m108594g(w6Var, "struct");
        super.mo87548C(w6Var, z);
        View view = this.f177608U0;
        if (view != null) {
            view.setTag(w6Var.f281367a.getTimeLine());
        }
        View view2 = this.f177608U0;
        if (view2 != null) {
            view2.setTag(C0966R.C0970id.oo7, w6Var.f281367a);
        }
        View view3 = this.f177608U0;
        if (view3 != null) {
            view3.setOnClickListener(new C62530c(this, w6Var));
        }
        C78253a k = getAdapter().mo132921k();
        View view4 = this.f177608U0;
        TimelineClickListener timelineClickListener = getAdapter().f278572f;
        k.mo108275j(view4, timelineClickListener != null ? timelineClickListener.f280350F : null, getAdapter().f278572f.f280381k);
        SnsMethodCalculate.markEndTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
    }

    /* renamed from: G */
    public View mo87535G(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        View view = this.f177608U0;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return view;
    }

    /* renamed from: J */
    public final void mo87549J(ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        C64628pk1 finderMedia = getFinderMedia();
        if (finderMedia == null) {
            SnsMethodCalculate.markEndTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
            return;
        }
        Pair<Integer, Integer> k = C91999u.m115565k((int) finderMedia.f184829g, (int) finderMedia.f184830h, getContext(), false);
        Object obj = k.first;
        C87412m.m108593f(obj, "pair.first");
        layoutParams.width = ((Number) obj).intValue();
        Object obj2 = k.second;
        C87412m.m108593f(obj2, "pair.second");
        layoutParams.height = ((Number) obj2).intValue();
        mo140441m("MicroMsg.Improve.ImproveFinderMediaTimelineItem", "calculateParamSize width:" + layoutParams.width + " height:" + layoutParams.height);
        SnsMethodCalculate.markEndTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d2v, this, false);
        this.f177607T0 = inflate;
        this.f177608U0 = inflate != null ? inflate.findViewById(C0966R.C0970id.jtc) : null;
        Pair<Integer, Integer> j = C91999u.m115564j(getContext());
        Object obj = j.first;
        C87412m.m108593f(obj, "pair.first");
        int intValue = ((Number) obj).intValue();
        Object obj2 = j.second;
        C87412m.m108593f(obj2, "pair.second");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(intValue, ((Number) obj2).intValue());
        mo87549J(layoutParams);
        View view = this.f177607T0;
        C87412m.m108591d(view);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(view, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return lVar;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return 18;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        return "ImproveFinderMediaTimelineItem";
    }

    /* renamed from: q */
    public void mo87550q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
        super.mo87550q();
        View view = this.f177607T0;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams == null) {
            SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
            return;
        }
        mo87549J(layoutParams);
        View view2 = this.f177607T0;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveFinderMediaTimelineItem");
    }
}
