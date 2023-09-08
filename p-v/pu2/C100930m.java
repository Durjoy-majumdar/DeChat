package pu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import ad0.C91999u;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bv2.C92312b;
import bv2.C92318f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.view.ImproveVideoFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import ds2.C97540j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu2.m */
public final class C100930m extends C62508a implements C92312b {

    /* renamed from: Z0 */
    public static final /* synthetic */ int f295554Z0 = 0;

    /* renamed from: T0 */
    public ViewGroup f295555T0;

    /* renamed from: U0 */
    public ImproveVideoFrameLayout f295556U0;

    /* renamed from: V0 */
    public MaskImageView f295557V0;

    /* renamed from: W0 */
    public View f295558W0;

    /* renamed from: X0 */
    public SnsTimelineVideoView f295559X0;

    /* renamed from: Y0 */
    public boolean f295560Y0 = true;

    /* renamed from: pu2.m$a */
    public static final class C62548a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100930m f177650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62548a(C100930m mVar) {
            super(0);
            this.f177650d = mVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$buildCustomView$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$buildCustomView$1");
            this.f177650d.mo140441m("MicroMsg.Improve.ImproveVideoTimelineItem", "video view remove");
            C100930m mVar = this.f177650d;
            SnsMethodCalculate.markStartTimeMs("access$getVideoBtn$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            View view = mVar.f295558W0;
            SnsMethodCalculate.markEndTimeMs("access$getVideoBtn$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem$buildCustomView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem$buildCustomView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$buildCustomView$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$buildCustomView$1");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2", mo125469f = "ImproveVideoTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.m$b */
    public static final class C100931b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C100930m f295561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100931b(C100930m mVar, C15601d<? super C100931b> dVar) {
            super(2, dVar);
            this.f295561d = mVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            C100931b bVar = new C100931b(this.f295561d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C100931b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            TimeLineObject timeLine = this.f295561d.getStruct().f281367a.getTimeLine();
            C87412m.m108593f(timeLine, "struct.mSnsInfo.timeLine");
            List<C101804kv2> J = this.f295561d.mo140393J(timeLine);
            if (J == null || J.isEmpty()) {
                C100930m mVar = this.f295561d;
                StringBuilder sb = new StringBuilder();
                sb.append("loadCustomItemInfo error,media list is empty.[");
                sb.append(J == null);
                sb.append(']');
                mVar.mo140440l("MicroMsg.Improve.ImproveVideoTimelineItem", sb.toString());
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            C100930m mVar2 = this.f295561d;
            mVar2.mo140441m("MicroMsg.Improve.ImproveVideoTimelineItem", "loadCustomItemInfo type:" + ((C101804kv2) C110818d0.m150914L(J)).f298690e);
            C100930m mVar3 = this.f295561d;
            SnsMethodCalculate.markStartTimeMs("access$checkAndLoadThumb", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            mVar3.mo140392I();
            SnsMethodCalculate.markEndTimeMs("access$checkAndLoadThumb", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            Boolean bool2 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem$loadCustomItemInfo$2");
            return bool2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100930m(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: B */
    public Object mo87537B(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C100931b(this, (C15601d<? super C100931b>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0126  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo87548C(com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "updateStruct"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "struct"
            gy3.C87412m.m108594g(r14, r2)
            super.mo87548C(r14, r15)
            if (r15 == 0) goto L_0x013a
            r15 = 1
            r13.f295560Y0 = r15
            android.view.View r10 = r13.f295558W0
            r11 = 0
            if (r10 != 0) goto L_0x001c
            goto L_0x005f
        L_0x001c:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r12.mo10233c(r2)
            java.lang.Object[] r3 = r12.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem"
            java.lang.String r5 = "updateStruct"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r10
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r12.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem"
            java.lang.String r4 = "updateStruct"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Z)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r10
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x005f:
            r13.mo140392I()
            java.lang.String r2 = "updateStructView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r14.f281367a
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r3.getTimeLine()
            java.lang.String r4 = "struct.mSnsInfo.timeLine"
            gy3.C87412m.m108593f(r3, r4)
            java.util.List r4 = r13.mo140393J(r3)
            java.lang.String r5 = "MicroMsg.Improve.ImproveVideoTimelineItem"
            if (r4 == 0) goto L_0x0131
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0084
            goto L_0x0131
        L_0x0084:
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            te3.kv2 r4 = (te3.C101804kv2) r4
            com.tencent.mm.plugin.sns.ui.video.a r6 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r7 = r3.f283893Id
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r6 = r6.mo133930b(r7)
            if (r6 == 0) goto L_0x00f3
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r7 = r13.f295556U0
            if (r7 == 0) goto L_0x00a2
            int r7 = r7.getChildCount()
            if (r7 != 0) goto L_0x00a2
            r7 = 1
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            if (r7 == 0) goto L_0x00f3
            android.view.ViewParent r7 = r6.getParent()
            if (r7 == 0) goto L_0x0124
            android.view.ViewParent r7 = r6.getParent()
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r8 = r13.f295556U0
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 != 0) goto L_0x0124
            r6.f281255O1 = r15
            android.view.ViewParent r15 = r6.getParent()
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r15, r7)
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            r15.removeView(r6)
            r6.setVisibility(r11)
            com.tencent.mm.pluginsdk.ui.a$e r15 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r6.setVideoScaleType(r15)
            android.widget.FrameLayout$LayoutParams r15 = new android.widget.FrameLayout$LayoutParams
            r7 = -1
            r15.<init>(r7, r7)
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r7 = r13.f295556U0
            if (r7 == 0) goto L_0x00dd
            r7.addView(r6, r15)
        L_0x00dd:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r7 = "reAttach succ "
            r15.append(r7)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r13.mo140441m(r5, r15)
            goto L_0x0124
        L_0x00f3:
            com.tencent.mm.plugin.sns.ui.video.a r15 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r7 = r3.f283893Id
            boolean r15 = r15.mo133933f(r7)
            if (r15 != 0) goto L_0x0124
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r15 = r13.f295556U0
            if (r15 == 0) goto L_0x0108
            int r15 = r15.getChildCount()
            goto L_0x0109
        L_0x0108:
            r15 = 0
        L_0x0109:
            if (r15 <= 0) goto L_0x0124
            com.tencent.mm.plugin.sns.ui.video.a r15 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r7 = r3.f283893Id
            boolean r15 = r15.mo133932e(r7)
            if (r15 != 0) goto L_0x0124
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r15 = r13.f295556U0
            if (r15 == 0) goto L_0x011e
            r15.removeViewAt(r11)
        L_0x011e:
            java.lang.String r15 = "lxl item remove videoview cost"
            r13.mo140441m(r5, r15)
        L_0x0124:
            if (r6 == 0) goto L_0x012d
            java.lang.String r14 = r14.f281381h
            int r15 = r3.CreateTime
            r6.mo132324P(r4, r14, r15)
        L_0x012d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x013a
        L_0x0131:
            java.lang.String r14 = "updateStructView error,empty list"
            r13.mo140440l(r5, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x013a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C100930m.mo87548C(com.tencent.mm.plugin.sns.ui.w6, boolean):void");
    }

    /* renamed from: G */
    public View mo87535G(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return null;
    }

    /* renamed from: H */
    public final void mo140391H() {
        SnsMethodCalculate.markStartTimeMs("buildAndSetTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        C96066m2 m2Var = new C96066m2();
        m2Var.f280499b = getStruct().f281381h;
        m2Var.f280498a = getStruct().f281367a.getTimeLine();
        m2Var.f280511n = getStruct().f281391r;
        ImproveVideoFrameLayout improveVideoFrameLayout = this.f295556U0;
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.setTag(m2Var);
        }
        SnsMethodCalculate.markEndTimeMs("buildAndSetTag", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r5 != false) goto L_0x0022;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140392I() {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "checkAndLoadThumb"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            boolean r3 = r0.f295560Y0
            r4 = 1
            if (r3 != 0) goto L_0x0022
            boolean r3 = r18.mo87552z()
            if (r3 != 0) goto L_0x0022
            com.tencent.mm.plugin.sns.ui.MaskImageView r3 = r0.f295557V0
            r5 = 0
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.mo126940m()
            if (r3 != 0) goto L_0x0020
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x008e
        L_0x0022:
            com.tencent.mm.plugin.sns.ui.w6 r3 = r18.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r3.f281367a
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r3.getTimeLine()
            java.lang.String r5 = "struct.mSnsInfo.timeLine"
            gy3.C87412m.m108593f(r3, r5)
            java.util.List r5 = r0.mo140393J(r3)
            java.lang.String r6 = "MicroMsg.Improve.ImproveVideoTimelineItem"
            if (r5 == 0) goto L_0x0092
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x0041
            goto L_0x0092
        L_0x0041:
            java.lang.Object r5 = sx3.C110818d0.m150914L(r5)
            r9 = r5
            te3.kv2 r9 = (te3.C101804kv2) r9
            com.tencent.mm.plugin.sns.model.o r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.w6 r5 = r18.getStruct()
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r5.f281367a
            com.tencent.mm.plugin.sns.ui.MaskImageView r10 = r0.f295557V0
            r11 = 2131099651(0x7f060003, float:1.7811661E38)
            int r12 = r18.hashCode()
            com.tencent.mm.plugin.sns.ui.w6 r5 = r18.getStruct()
            int r13 = r5.f281376e0
            com.tencent.mm.storage.o3 r14 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r3 = r3.CreateTime
            r14.f284145b = r3
            com.tencent.mm.plugin.sns.ui.w6 r3 = r18.getStruct()
            boolean r15 = r3.f281391r
            r16 = 1
            r17 = 1
            boolean r3 = r7.mo131096P(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "checkAndLoadThumb result:"
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r0.mo140441m(r6, r5)
            r3 = r3 ^ r4
            r0.f295560Y0 = r3
        L_0x008e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x0092:
            java.lang.String r3 = "checkAndLoadThumb error,empty list"
            r0.mo140440l(r6, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C100930m.mo140392I():void");
    }

    /* renamed from: J */
    public final List<C101804kv2> mo140393J(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        C87412m.m108594g(timeLineObject, "<this>");
        C101789j00 j002 = timeLineObject.ContentObj;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return linkedList;
    }

    /* renamed from: K */
    public final void mo140394K(ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        Pair<Integer, Integer> l = C91999u.m115566l(getStruct().f281367a.getTimeLine(), getContext(), getStruct().f281391r);
        Object obj = l.first;
        C87412m.m108593f(obj, "pair.first");
        layoutParams.width = ((Number) obj).intValue();
        Object obj2 = l.second;
        C87412m.m108593f(obj2, "pair.second");
        layoutParams.height = ((Number) obj2).intValue();
        SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        TimeLineObject timeLineObject;
        String str;
        int i2;
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(getStruct().f281381h);
        if (DN == null) {
            mo140440l("MicroMsg.Improve.ImproveVideoTimelineItem", "play error, snsId:" + getStruct().f281381h);
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            return;
        }
        TimeLineObject timeLine = DN.getTimeLine();
        C87412m.m108593f(timeLine, "snsInfo.timeLine");
        List<C101804kv2> J = mo140393J(timeLine);
        if (J == null || J.isEmpty()) {
            mo140440l("MicroMsg.Improve.ImproveVideoTimelineItem", "play error, null media");
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            return;
        }
        C101804kv2 kv22 = (C101804kv2) C110818d0.m150914L(J);
        if (kv22.f298690e == 8) {
            Log.m105924i("MicroMsg.Improve.ImproveVideoTimelineItem", "background video no auto play");
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            return;
        }
        View view = this.f295558W0;
        if (view == null) {
            str = AssetExtension.SCENE_PLAY;
            timeLineObject = timeLine;
            i2 = 0;
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            Object[] b = aVar.mo10232b();
            View view2 = view;
            str = AssetExtension.SCENE_PLAY;
            timeLineObject = timeLine;
            i2 = 0;
            C117292a.m165358d(view2, b, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markStartTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        ImproveVideoFrameLayout improveVideoFrameLayout = this.f295556U0;
        if (improveVideoFrameLayout == null) {
            SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        } else {
            if (improveVideoFrameLayout.getChildCount() == 0) {
                TimeLineObject timeLine2 = getStruct().f281367a.getTimeLine();
                C87412m.m108593f(timeLine2, "struct.mSnsInfo.timeLine");
                SnsTimelineVideoView b2 = C96254a.m123394d().mo133930b(timeLine2.f283893Id);
                if (b2 != null) {
                    if (!(b2.getParent() == null || b2.getParent() == improveVideoFrameLayout)) {
                        b2.f281255O1 = true;
                        ViewParent parent = b2.getParent();
                        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent).removeView(b2);
                        b2.setVisibility(i2);
                    }
                    if (b2.getParent() == null) {
                        improveVideoFrameLayout.addView(b2, new FrameLayout.LayoutParams(-1, -1));
                        mo140441m("MicroMsg.Improve.ImproveVideoTimelineItem", "lxl reAttach succ");
                    }
                } else {
                    SnsTimelineVideoView c = C96254a.m123394d().mo133931c(getContext());
                    if (c.getParent() != null) {
                        c.mo133915c0();
                        c.f281255O1 = true;
                        ViewGroup viewGroup = (ViewGroup) c.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(c);
                        }
                    }
                    improveVideoFrameLayout.addView(c, new FrameLayout.LayoutParams(-1, -1));
                    c.setThumbViewScaleType(ImageView.ScaleType.CENTER_CROP);
                    mo140441m("MicroMsg.Improve.ImproveVideoTimelineItem", "SnsVideoViewMgr getAvailableVideoView:" + c);
                }
            }
            this.f295559X0 = (SnsTimelineVideoView) improveVideoFrameLayout.getChildAt(i2);
            mo140441m("MicroMsg.Improve.ImproveVideoTimelineItem", "setupVideoView video view:" + this.f295559X0);
            SnsTimelineVideoView snsTimelineVideoView = this.f295559X0;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.setVisibility(i2);
            }
            SnsTimelineVideoView snsTimelineVideoView2 = this.f295559X0;
            if (snsTimelineVideoView2 != null) {
                snsTimelineVideoView2.setVideoScaleType(C96814a.C96817e.COVER);
            }
            SnsTimelineVideoView snsTimelineVideoView3 = this.f295559X0;
            if (snsTimelineVideoView3 != null) {
                snsTimelineVideoView3.setVideoCallback((OnlineVideoView.IVideoViewCallback) null);
            }
            SnsTimelineVideoView snsTimelineVideoView4 = this.f295559X0;
            if (snsTimelineVideoView4 != null) {
                snsTimelineVideoView4.setWindowType(1);
            }
            SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        }
        C92318f fVar = new C92318f();
        fVar.f264168a = kv22;
        fVar.f264169b = getStruct().f281381h;
        fVar.f264171d = C102236a0.m134765q0(DN.field_snsId);
        fVar.f264170c = DN.getCreateTime();
        SnsTimelineVideoView snsTimelineVideoView5 = this.f295559X0;
        if (snsTimelineVideoView5 != null) {
            snsTimelineVideoView5.setWindowType(1);
        }
        C97540j.f286244a.mo136810b(DN, fVar.f264168a, true);
        C96254a.m123394d().mo133939l(this.f295559X0, fVar, "", 0, true, timeLineObject.f283893Id);
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d5m, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f295555T0 = viewGroup;
        ImproveVideoFrameLayout improveVideoFrameLayout = (ImproveVideoFrameLayout) viewGroup.findViewById(C0966R.C0970id.nwq);
        this.f295556U0 = improveVideoFrameLayout;
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.setVideoRemoveCallback(new C62548a(this));
        }
        MaskImageView maskImageView = (MaskImageView) viewGroup.findViewById(C0966R.C0970id.nwr);
        this.f295557V0 = maskImageView;
        if (maskImageView != null) {
            maskImageView.setScaleType(QImageView.C97274a.CENTER_CROP);
        }
        this.f295558W0 = viewGroup.findViewById(C0966R.C0970id.nwp);
        SnsMethodCalculate.markStartTimeMs("registerTouchEvent", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        ImproveVideoFrameLayout improveVideoFrameLayout2 = this.f295556U0;
        if (improveVideoFrameLayout2 != null) {
            improveVideoFrameLayout2.setOnClickListener(new C100933n(this));
        }
        getAdapter().mo132921k().mo108275j(this.f295556U0, new C100937o(this), getAdapter().f278572f.f280381k);
        SnsMethodCalculate.markEndTimeMs("registerTouchEvent", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        mo140394K(layoutParams);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(viewGroup, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return lVar;
    }

    public Rect getDisplayRect() {
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        int[] iArr = new int[2];
        ImproveVideoFrameLayout improveVideoFrameLayout = this.f295556U0;
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.getLocationOnScreen(iArr);
        }
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ImproveVideoFrameLayout improveVideoFrameLayout2 = this.f295556U0;
        int measuredWidth = improveVideoFrameLayout2 != null ? improveVideoFrameLayout2.getMeasuredWidth() : 0;
        ImproveVideoFrameLayout improveVideoFrameLayout3 = this.f295556U0;
        if (improveVideoFrameLayout3 != null) {
            i = improveVideoFrameLayout3.getMeasuredHeight();
        }
        Rect rect = new Rect(i2, i3, measuredWidth + i2, i + i3);
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return rect;
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        MaskImageView maskImageView = this.f295557V0;
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return maskImageView;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return 38;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        return "ImproveVideoTimelineItem";
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        super.onAttachedToWindow();
        View view = this.f295558W0;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem", "onAttachedToWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveVideoTimelineItem", "onAttachedToWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }

    /* renamed from: q */
    public void mo87550q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        super.mo87550q();
        ViewGroup viewGroup = this.f295555T0;
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams == null) {
            SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
            return;
        }
        mo140394K(layoutParams);
        ViewGroup viewGroup2 = this.f295555T0;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveVideoTimelineItem");
    }
}
