package pu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu2.i0 */
public abstract class C100921i0 extends C100934n0 {

    /* renamed from: Q0 */
    public String f295537Q0 = "";

    /* renamed from: y0 */
    public boolean f295538y0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1", mo125469f = "TimelineItemLoad.kt", mo125470l = {61}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.i0$a */
    public static final class C100922a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f295539d;

        /* renamed from: e */
        public int f295540e;

        /* renamed from: f */
        public final /* synthetic */ C100921i0 f295541f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100922a(C100921i0 i0Var, C15601d<? super C100922a> dVar) {
            super(2, dVar);
            this.f295541f = i0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            C100922a aVar = new C100922a(this.f295541f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            Object invokeSuspend = ((C100922a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f295540e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis();
                SnsJankActivity.f280539s.mo133612a(this.f295541f.mo87544n(), "loadCustomItemInfo");
                C100921i0 i0Var = this.f295541f;
                this.f295539d = currentTimeMillis;
                this.f295540e = 1;
                if (i0Var.mo87537B(this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
                    return aVar;
                }
                j = currentTimeMillis;
            } else if (i == 1) {
                j = this.f295539d;
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
                throw illegalStateException;
            }
            SnsJankActivity.f280539s.mo133613b(this.f295541f.mo87544n());
            C100921i0 i0Var2 = this.f295541f;
            i0Var2.mo140441m("MicroMsg.Improve.TimelineItemLoad", "itemLoad cost:" + (System.currentTimeMillis() - j));
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad$itemLoad$1");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100921i0(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: A */
    public final void mo140385A() {
        SnsMethodCalculate.markStartTimeMs("itemLoad", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        C53896h0 h0Var = C53872d1.f151117a;
        C100922a aVar = new C100922a(this, (C15601d<? super C100922a>) null);
        SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        C87412m.m108594g(h0Var, "context");
        C0000n0 n0Var = C62549p.f177651a;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, h0Var, (C53934p0) null, aVar, 2, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        SnsMethodCalculate.markEndTimeMs("itemLoad", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
    }

    /* renamed from: B */
    public abstract Object mo87537B(C15601d<? super Boolean> dVar);

    /* JADX WARNING: type inference failed for: r10v14, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87548C(com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "updateStruct"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "newStruct"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemMeasure"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            r17.setStruct(r18)
            java.lang.String r5 = "buildHellHoundReportTag"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            pu2.l0 r6 = new pu2.l0
            r6.<init>()
            com.tencent.mm.plugin.sns.ui.w6 r7 = r17.getStruct()
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r7.f281369b
            r6.timeLineObject = r7
            com.tencent.mm.plugin.sns.ui.w6 r7 = r17.getStruct()
            boolean r7 = r7.f281391r
            r6.isAd = r7
            com.tencent.mm.plugin.sns.ui.w6 r7 = r17.getStruct()
            com.tencent.mm.protocal.protobuf.SnsObject r7 = r7.f281371c
            r6.snsobj = r7
            com.tencent.mm.plugin.sns.ui.w6 r7 = r17.getStruct()
            java.lang.String r7 = r7.f281381h
            r6.f279956g = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            r0.setTag(r6)
            com.tencent.mm.kiss.widget.textview.PLSysTextView r5 = r17.getPublishTimeText()
            if (r5 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            java.lang.String r1 = r1.f281390q
            r5.setText(r1)
        L_0x0056:
            java.lang.String r1 = "loadRetryPostView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            com.tencent.mm.plugin.sns.ui.w6 r5 = r17.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.f281367a
            com.tencent.mm.plugin.sns.model.t1 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
            long r7 = r5.field_snsId
            int r9 = r5.getCreateTime()
            int r5 = r5.localid
            boolean r5 = r6.mo131277a(r7, r9, r5)
            java.lang.String r6 = "MicroMsg.Improve.TimelineItemMeasure"
            r7 = 0
            r8 = 8
            if (r5 == 0) goto L_0x00a8
            android.view.ViewStub r5 = r17.getRepostStub()
            android.view.ViewParent r5 = r5.getParent()
            if (r5 == 0) goto L_0x009a
            android.view.ViewStub r5 = r17.getRepostStub()
            android.view.View r5 = r5.inflate()
            r9 = 2131314087(0x7f0945a7, float:1.824659E38)
            android.view.View r5 = r5.findViewById(r9)
            pu2.o0 r9 = new pu2.o0
            r9.<init>(r0)
            r5.setOnClickListener(r9)
        L_0x009a:
            android.view.ViewStub r5 = r17.getRepostStub()
            r5.setVisibility(r7)
            java.lang.String r5 = "show retry postView "
            r0.mo140441m(r6, r5)
            goto L_0x00af
        L_0x00a8:
            android.view.ViewStub r5 = r17.getRepostStub()
            r5.setVisibility(r8)
        L_0x00af:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            java.lang.String r1 = "loadUnreadPostView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            com.tencent.mm.plugin.sns.ui.w6 r5 = r17.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r5.f281367a
            com.tencent.mm.plugin.sns.model.y1 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            long r10 = r5.field_snsId
            boolean r9 = r9.mo131303d(r10)
            if (r9 == 0) goto L_0x017f
            android.view.ViewStub r9 = r17.getUnreadStub()
            android.view.ViewParent r9 = r9.getParent()
            if (r9 == 0) goto L_0x00e0
            android.view.ViewStub r9 = r17.getUnreadStub()
            android.view.View r9 = r9.inflate()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0.f295567p0 = r9
        L_0x00e0:
            com.tencent.mm.plugin.sns.model.y1 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            java.util.LinkedList r9 = r9.mo131307h()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "checkUnreadTip expose, targetUserNames:"
            r10.append(r11)
            int r11 = r9.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r0.mo140441m(r6, r10)
            android.view.ViewGroup r10 = r0.f295567p0
            r11 = 0
            if (r10 == 0) goto L_0x010f
            r12 = 2131314147(0x7f0945e3, float:1.824671E38)
            android.view.View r10 = r10.findViewById(r12)
            com.tencent.mm.ui.widget.StoryAvatarDotsView r10 = (com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView) r10
            goto L_0x0110
        L_0x010f:
            r10 = r11
        L_0x0110:
            r0.f295568x0 = r10
            android.view.ViewGroup r10 = r0.f295567p0
            if (r10 == 0) goto L_0x0120
            r11 = 2131314148(0x7f0945e4, float:1.8246713E38)
            android.view.View r10 = r10.findViewById(r11)
            r11 = r10
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
        L_0x0120:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
            if (r10 == 0) goto L_0x0146
            com.tencent.mm.ui.widget.StoryAvatarDotsView r9 = r0.f295568x0
            if (r9 != 0) goto L_0x012b
            goto L_0x012e
        L_0x012b:
            r9.setVisibility(r8)
        L_0x012e:
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$n r9 = new com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$n
            pu2.p0 r10 = new pu2.p0
            r10.<init>(r0)
            r9.<init>(r10)
            java.lang.String r10 = "setOnSnsUnreadTipManagerCallback"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r12)
            com.tencent.p014mm.plugin.sns.model.C94974y1.f275336J = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r12)
            goto L_0x014c
        L_0x0146:
            com.tencent.mm.ui.widget.StoryAvatarDotsView r10 = r0.f295568x0
            r12 = 3
            r0.mo140401r(r10, r9, r12)
        L_0x014c:
            if (r11 == 0) goto L_0x0151
            r11.invalidate()
        L_0x0151:
            if (r11 == 0) goto L_0x015b
            pu2.q0 r9 = new pu2.q0
            r9.<init>(r11)
            r11.post(r9)
        L_0x015b:
            if (r11 == 0) goto L_0x0166
            long r9 = r5.field_snsId
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r11.setTag(r5)
        L_0x0166:
            com.tencent.mm.plugin.sns.model.y1 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r5.getClass()
            if (r11 == 0) goto L_0x0177
            pu2.r0 r5 = new pu2.r0
            r5.<init>(r0)
            r11.setOnClickListener(r5)
        L_0x0177:
            android.view.ViewStub r5 = r17.getUnreadStub()
            r5.setVisibility(r7)
            goto L_0x0186
        L_0x017f:
            android.view.ViewStub r5 = r17.getUnreadStub()
            r5.setVisibility(r8)
        L_0x0186:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            r17.mo140379s()
            java.lang.String r1 = "loadGroupPermissionView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            com.tencent.mm.plugin.sns.ui.w6 r5 = r17.getStruct()
            boolean r5 = r5.f281354N
            if (r5 == 0) goto L_0x0244
            android.view.View r5 = r17.getGroupImageStub()
            boolean r5 = r5 instanceof android.view.ViewStub
            if (r5 == 0) goto L_0x01f0
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = new com.tencent.mm.ui.widget.imageview.WeImageView
            android.content.Context r8 = r17.getContext()
            r5.<init>(r8)
            java.lang.String r8 = "loadGroupPermissionView: update res"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r8)
            r6 = 2131756050(0x7f100412, float:1.9142997E38)
            r8 = 2131099851(0x7f0600cb, float:1.7812067E38)
            r5.mo104518r(r6, r8)
            r6 = 2131296822(0x7f090236, float:1.8211572E38)
            r5.setId(r6)
            android.content.Context r6 = r17.getContext()
            r8 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r6 = kg3.C76577a.m92157h(r6, r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r6, r6)
            android.content.Context r6 = r17.getContext()
            r9 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r6 = kg3.C76577a.m92157h(r6, r9)
            r8.setMargins(r6, r7, r7, r7)
            android.view.View r6 = r17.getGroupImageStub()
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewStub"
            gy3.C87412m.m108592e(r6, r9)
            android.view.ViewStub r6 = (android.view.ViewStub) r6
            vu2.C52993b.m59322a(r6, r5, r8)
            r0.setGroupImageStub(r5)
        L_0x01f0:
            android.view.View r5 = r17.getGroupImageStub()
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.mo10233c(r8)
            java.lang.Object[] r10 = r6.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure"
            java.lang.String r12 = "loadGroupPermissionView"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure"
            java.lang.String r11 = "loadGroupPermissionView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r5 = r17.getGroupImageStub()
            com.tencent.mm.plugin.sns.ui.w6 r6 = r17.getStruct()
            java.lang.String r6 = r6.f281381h
            r5.setTag(r6)
            goto L_0x028b
        L_0x0244:
            android.view.View r5 = r17.getGroupImageStub()
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r8)
            java.lang.Object[] r9 = r6.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure"
            java.lang.String r11 = "loadGroupPermissionView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r8 = "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemMeasure"
            java.lang.String r9 = "loadGroupPermissionView"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r5
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x028b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            r17.mo140380v()
            if (r19 == 0) goto L_0x0296
            r17.mo140398k()
        L_0x0296:
            r17.mo140406y()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            boolean r1 = r17.mo87552z()
            if (r1 == 0) goto L_0x02a6
            r17.mo140385A()
            goto L_0x02d3
        L_0x02a6:
            if (r19 == 0) goto L_0x02d3
            java.lang.String r1 = "checkFeedNeedLoad"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)
            boolean r4 = r0.f295538y0
            if (r4 == 0) goto L_0x02d0
            java.lang.String r4 = r0.f295537Q0
            com.tencent.mm.plugin.sns.ui.w6 r5 = r17.getStruct()
            java.lang.String r5 = r5.f281381h
            boolean r4 = gy3.C87412m.m108589b(r4, r5)
            if (r4 != 0) goto L_0x02d0
            com.tencent.mm.plugin.sns.ui.w6 r4 = r17.getStruct()
            java.lang.String r4 = r4.f281381h
            java.lang.String r5 = "struct.mLocalId"
            gy3.C87412m.m108593f(r4, r5)
            r0.f295537Q0 = r4
            r17.mo140385A()
        L_0x02d0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
        L_0x02d3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C100921i0.mo87548C(com.tencent.mm.plugin.sns.ui.w6, boolean):void");
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        return null;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        super.onAttachedToWindow();
        this.f295538y0 = true;
        mo140441m("MicroMsg.Improve.TimelineItemLoad", "onAttachedToWindow");
        mo140385A();
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        super.onDetachedFromWindow();
        this.f295538y0 = false;
        mo140441m("MicroMsg.Improve.TimelineItemLoad", "onDetachedFromWindow");
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
    }

    public final void setAttachToWindow(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setAttachToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        this.f295538y0 = z;
        SnsMethodCalculate.markEndTimeMs("setAttachToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
    }

    /* renamed from: z */
    public boolean mo87552z() {
        SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        QPictureView tagImgView = getTagImgView();
        boolean z = false;
        if (tagImgView != null && !tagImgView.f266837E) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemLoad");
        return z;
    }
}
