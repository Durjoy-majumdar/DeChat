package eu2;

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
import bv2.C92313c;
import bv2.C92318f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem;
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
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import iu2.C98799a;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
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
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: eu2.y */
public final class C97746y extends ImprovePositionTimelineItem implements C92312b {

    /* renamed from: X0 */
    public ViewGroup f286738X0;

    /* renamed from: Y0 */
    public ImproveVideoFrameLayout f286739Y0;

    /* renamed from: Z0 */
    public MaskImageView f286740Z0;

    /* renamed from: a1 */
    public View f286741a1;

    /* renamed from: b1 */
    public SnsTimelineVideoView f286742b1;

    /* renamed from: c1 */
    public boolean f286743c1 = true;

    /* renamed from: eu2.y$a */
    public static final class C58833a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97746y f168431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58833a(C97746y yVar) {
            super(0);
            this.f168431d = yVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
            this.f168431d.mo137055z("MicroMsg.Improve.VideoTimelineItem", "video view remove");
            C97746y yVar = this.f168431d;
            SnsMethodCalculate.markStartTimeMs("access$getVideoBtn$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            View view = yVar.f286741a1;
            SnsMethodCalculate.markEndTimeMs("access$getVideoBtn$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$buildCustomView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$buildCustomView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2", mo125469f = "VideoImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.y$b */
    public static final class C97747b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C97746y f286744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97747b(C97746y yVar, C15601d<? super C97747b> dVar) {
            super(2, dVar);
            this.f286744d = yVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            C97747b bVar = new C97747b(this.f286744d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C97747b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C98214b b;
            TimeLineObject G2;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            C98799a data = this.f286744d.getData();
            if (data == null || (b = data.mo138170b()) == null || (G2 = b.mo137509G2()) == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            List<C101804kv2> S = this.f286744d.mo137060S(G2);
            if (S == null || S.isEmpty()) {
                C97746y yVar = this.f286744d;
                StringBuilder sb = new StringBuilder();
                sb.append("loadCustomItemInfo error,media list is empty.[");
                sb.append(S == null);
                sb.append(']');
                yVar.mo137054y("MicroMsg.Improve.VideoTimelineItem", sb.toString());
                Boolean bool2 = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
                return bool2;
            }
            C97746y yVar2 = this.f286744d;
            yVar2.mo137055z("MicroMsg.Improve.VideoTimelineItem", "loadCustomItemInfo type:" + ((C101804kv2) C110818d0.m150914L(S)).f298690e);
            C97746y yVar3 = this.f286744d;
            SnsMethodCalculate.markStartTimeMs("access$checkAndLoadThumb", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            yVar3.mo137059R();
            SnsMethodCalculate.markEndTimeMs("access$checkAndLoadThumb", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            Boolean bool3 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$loadCustomItemInfo$2");
            return bool3;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem", mo125469f = "VideoImproveTimelineItem.kt", mo125470l = {107}, mo125471m = "onBindViewHolder")
    /* renamed from: eu2.y$c */
    public static final class C97748c extends C66704d {

        /* renamed from: d */
        public Object f286745d;

        /* renamed from: e */
        public Object f286746e;

        /* renamed from: f */
        public /* synthetic */ Object f286747f;

        /* renamed from: g */
        public final /* synthetic */ C97746y f286748g;

        /* renamed from: h */
        public int f286749h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97748c(C97746y yVar, C15601d<? super C97748c> dVar) {
            super(dVar);
            this.f286748g = yVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$1");
            this.f286747f = obj;
            this.f286749h |= Integer.MIN_VALUE;
            Object g = this.f286748g.mo81006g((C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$1");
            return g;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97746y(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: F */
    public Object mo81005F(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C97747b(this, (C15601d<? super C97747b>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return g;
    }

    /* renamed from: P */
    public View mo83992P(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r5 != false) goto L_0x0022;
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137059R() {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "checkAndLoadThumb"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            boolean r3 = r0.f286743c1
            r4 = 1
            if (r3 != 0) goto L_0x0022
            boolean r3 = r18.mo81004D()
            if (r3 != 0) goto L_0x0022
            com.tencent.mm.plugin.sns.ui.MaskImageView r3 = r0.f286740Z0
            r5 = 0
            if (r3 == 0) goto L_0x0020
            boolean r3 = r3.mo126940m()
            if (r3 != 0) goto L_0x0020
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0093
        L_0x0022:
            iu2.a r3 = r18.getData()
            if (r3 == 0) goto L_0x00a0
            gu2.b r3 = r3.mo138170b()
            if (r3 == 0) goto L_0x00a0
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r3.mo137509G2()
            if (r3 != 0) goto L_0x0035
            goto L_0x00a0
        L_0x0035:
            java.util.List r5 = r0.mo137060S(r3)
            java.lang.String r6 = "MicroMsg.Improve.VideoTimelineItem"
            if (r5 == 0) goto L_0x0097
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L_0x0044
            goto L_0x0097
        L_0x0044:
            java.lang.Object r5 = sx3.C110818d0.m150914L(r5)
            r9 = r5
            te3.kv2 r9 = (te3.C101804kv2) r9
            com.tencent.mm.plugin.sns.model.o r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            iu2.a r5 = r18.getData()
            gy3.C87412m.m108591d(r5)
            gu2.b r5 = r5.mo138170b()
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r5.mo137505C2()
            com.tencent.mm.plugin.sns.ui.MaskImageView r10 = r0.f286740Z0
            r11 = 2131099651(0x7f060003, float:1.7811661E38)
            int r12 = r18.hashCode()
            int r13 = r18.mo137038A()
            com.tencent.mm.storage.o3 r14 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r3 = r3.CreateTime
            r14.f284145b = r3
            r15 = 0
            r16 = 1
            r17 = 1
            boolean r3 = r7.mo131096P(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "checkAndLoadThumb result:"
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r0.mo137055z(r6, r5)
            r3 = r3 ^ r4
            r0.f286743c1 = r3
        L_0x0093:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x0097:
            java.lang.String r3 = "checkAndLoadThumb error,empty list"
            r0.mo137054y(r6, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x00a0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97746y.mo137059R():void");
    }

    /* renamed from: S */
    public final List<C101804kv2> mo137060S(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        C87412m.m108594g(timeLineObject, "<this>");
        C101789j00 j002 = timeLineObject.ContentObj;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return linkedList;
    }

    /* renamed from: T */
    public final void mo137061T(ViewGroup.LayoutParams layoutParams) {
        C98214b b;
        TimeLineObject G2;
        SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        C98799a data = getData();
        if (data == null || (b = data.mo138170b()) == null || (G2 = b.mo137509G2()) == null) {
            SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        Pair<Integer, Integer> l = C91999u.m115566l(G2, getContext(), false);
        Object obj = l.first;
        C87412m.m108593f(obj, "pair.first");
        layoutParams.width = ((Number) obj).intValue();
        Object obj2 = l.second;
        C87412m.m108593f(obj2, "pair.second");
        layoutParams.height = ((Number) obj2).intValue();
        mo137055z("MicroMsg.Improve.VideoTimelineItem", "width:" + l.first + " height:" + l.second);
        SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        C98214b b;
        TimeLineObject timeLineObject;
        String str;
        int i2;
        C98214b b2;
        TimeLineObject G2;
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        C98799a data = getData();
        if (data == null || (b = data.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        SnsInfo DN = C94866e1.Yx0().mo139798DN(b.mo137503A2());
        if (DN == null) {
            mo137054y("MicroMsg.Improve.VideoTimelineItem", "play error, snsId:" + b.mo137503A2());
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        TimeLineObject timeLine = DN.getTimeLine();
        C87412m.m108593f(timeLine, "snsInfo.timeLine");
        List<C101804kv2> S = mo137060S(timeLine);
        if (S == null || S.isEmpty()) {
            mo137054y("MicroMsg.Improve.VideoTimelineItem", "play error, null media");
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        C101804kv2 kv22 = (C101804kv2) C110818d0.m150914L(S);
        if (kv22.f298690e == 8) {
            Log.m105924i("MicroMsg.Improve.VideoTimelineItem", "background video no auto play");
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        View view = this.f286741a1;
        if (view == null) {
            str = AssetExtension.SCENE_PLAY;
            timeLineObject = timeLine;
            i2 = 0;
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            Object[] b3 = aVar.mo10232b();
            str = AssetExtension.SCENE_PLAY;
            timeLineObject = timeLine;
            i2 = 0;
            C117292a.m165358d(view, b3, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = view;
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markStartTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        ImproveVideoFrameLayout improveVideoFrameLayout = this.f286739Y0;
        if (improveVideoFrameLayout == null) {
            SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        } else {
            C98799a data2 = getData();
            if (data2 == null || (b2 = data2.mo138170b()) == null || (G2 = b2.mo137509G2()) == null) {
                SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            } else {
                if (improveVideoFrameLayout.getChildCount() == 0) {
                    SnsTimelineVideoView b4 = C96254a.m123394d().mo133930b(G2.f283893Id);
                    if (b4 != null) {
                        if (!(b4.getParent() == null || b4.getParent() == improveVideoFrameLayout)) {
                            b4.f281255O1 = true;
                            ViewParent parent = b4.getParent();
                            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                            ((ViewGroup) parent).removeView(b4);
                            b4.setVisibility(i2);
                        }
                        if (b4.getParent() == null) {
                            improveVideoFrameLayout.addView(b4, new FrameLayout.LayoutParams(-1, -1));
                            mo137055z("MicroMsg.Improve.VideoTimelineItem", "lxl reAttach succ");
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
                        mo137055z("MicroMsg.Improve.VideoTimelineItem", "SnsVideoViewMgr getAvailableVideoView:" + c);
                    }
                }
                this.f286742b1 = (SnsTimelineVideoView) improveVideoFrameLayout.getChildAt(i2);
                mo137055z("MicroMsg.Improve.VideoTimelineItem", "setupVideoView video view:" + this.f286742b1);
                SnsTimelineVideoView snsTimelineVideoView = this.f286742b1;
                if (snsTimelineVideoView != null) {
                    snsTimelineVideoView.setVisibility(i2);
                }
                SnsTimelineVideoView snsTimelineVideoView2 = this.f286742b1;
                if (snsTimelineVideoView2 != null) {
                    snsTimelineVideoView2.setVideoScaleType(C96814a.C96817e.COVER);
                }
                SnsTimelineVideoView snsTimelineVideoView3 = this.f286742b1;
                if (snsTimelineVideoView3 != null) {
                    snsTimelineVideoView3.setVideoCallback((OnlineVideoView.IVideoViewCallback) null);
                }
                SnsTimelineVideoView snsTimelineVideoView4 = this.f286742b1;
                if (snsTimelineVideoView4 != null) {
                    snsTimelineVideoView4.setWindowType(1);
                }
                SnsMethodCalculate.markEndTimeMs("setupVideoView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            }
        }
        C92318f fVar = new C92318f();
        fVar.f264168a = kv22;
        fVar.f264169b = b.mo137503A2();
        fVar.f264171d = C102236a0.m134765q0(DN.field_snsId);
        fVar.f264170c = DN.getCreateTime();
        SnsTimelineVideoView snsTimelineVideoView5 = this.f286742b1;
        if (snsTimelineVideoView5 != null) {
            snsTimelineVideoView5.setWindowType(1);
        }
        C97540j.f286244a.mo136810b(DN, fVar.f264168a, true);
        C96254a.m123394d().mo133939l(this.f286742b1, fVar, "", 0, true, timeLineObject.f283893Id);
        C92313c.m116089a().mo126301d();
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo81006g(jq3.C60905o r21, iu2.C98799a r22, int r23, boolean r24, wx3.C15601d<? super rx3.C13598b0> r25) {
        /*
            r20 = this;
            r6 = r20
            r0 = r25
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof eu2.C97746y.C97748c
            if (r1 == 0) goto L_0x001f
            r1 = r0
            eu2.y$c r1 = (eu2.C97746y.C97748c) r1
            int r2 = r1.f286749h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001f
            int r2 = r2 - r3
            r1.f286749h = r2
            goto L_0x0024
        L_0x001f:
            eu2.y$c r1 = new eu2.y$c
            r1.<init>(r6, r0)
        L_0x0024:
            r5 = r1
            java.lang.Object r0 = r5.f286747f
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f286749h
            r10 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 != r10) goto L_0x003d
            java.lang.Object r1 = r5.f286746e
            iu2.a r1 = (iu2.C98799a) r1
            java.lang.Object r2 = r5.f286745d
            eu2.y r2 = (eu2.C97746y) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r11 = r1
            goto L_0x00a6
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L_0x0048:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = fu2.C98041z.m126632K(r20)
            java.util.Iterator r0 = r0.iterator()
        L_0x0053:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            fu2.a r1 = (fu2.C97987a) r1
            boolean r2 = r1 instanceof fu2.C97993a0
            if (r2 == 0) goto L_0x0053
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            if (r1 != 0) goto L_0x0089
            java.util.ArrayList r0 = r20.getClickInstanceList()
            fu2.a0 r1 = new fu2.a0
            android.content.Context r2 = r20.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r2, r3)
            r1.<init>(r2)
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r12 = r6.f286739Y0
            r13 = 0
            r14 = 1
            r15 = 0
            r16 = 10
            r17 = 0
            r11 = r1
            fu2.C97987a.m126564l(r11, r12, r13, r14, r15, r16, r17)
            r0.add(r1)
        L_0x0089:
            r5.f286745d = r6
            r11 = r22
            r5.f286746e = r11
            r5.f286749h = r10
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.Object r0 = super.mo81006g(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x00a5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        L_0x00a5:
            r2 = r6
        L_0x00a6:
            boolean r0 = r2.mo137046r(r11)
            if (r0 == 0) goto L_0x01d3
            r2.f286743c1 = r10
            android.view.View r0 = r2.f286741a1
            r1 = 0
            if (r0 != 0) goto L_0x00b4
            goto L_0x00f6
        L_0x00b4:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.mo10233c(r4)
            java.lang.Object[] r13 = r3.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem"
            java.lang.String r15 = "onBindViewHolder"
            java.lang.String r16 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/sns/ui/improve/repository/ImproveListItem;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r0
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r3 = r3.mo10231a(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/sns/ui/improve/repository/ImproveListItem;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x00f6:
            r2.mo137059R()
            java.lang.String r0 = "updateStructView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r8)
            gu2.b r3 = r11.mo138170b()
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r3.mo137509G2()
            java.util.List r4 = r2.mo137060S(r3)
            java.lang.String r5 = "MicroMsg.Improve.VideoTimelineItem"
            if (r4 == 0) goto L_0x01ca
            boolean r9 = r4.isEmpty()
            if (r9 == 0) goto L_0x0117
            goto L_0x01ca
        L_0x0117:
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            te3.kv2 r4 = (te3.C101804kv2) r4
            com.tencent.mm.plugin.sns.ui.video.a r9 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r12 = r3.f283893Id
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r9 = r9.mo133930b(r12)
            if (r9 == 0) goto L_0x0186
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r12 = r2.f286739Y0
            if (r12 == 0) goto L_0x0135
            int r12 = r12.getChildCount()
            if (r12 != 0) goto L_0x0135
            r12 = 1
            goto L_0x0136
        L_0x0135:
            r12 = 0
        L_0x0136:
            if (r12 == 0) goto L_0x0186
            android.view.ViewParent r12 = r9.getParent()
            if (r12 == 0) goto L_0x01b7
            android.view.ViewParent r12 = r9.getParent()
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r13 = r2.f286739Y0
            boolean r12 = gy3.C87412m.m108589b(r12, r13)
            if (r12 != 0) goto L_0x01b7
            r9.f281255O1 = r10
            android.view.ViewParent r10 = r9.getParent()
            java.lang.String r12 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r10, r12)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r10.removeView(r9)
            r9.setVisibility(r1)
            com.tencent.mm.pluginsdk.ui.a$e r1 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r9.setVideoScaleType(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r10 = -1
            r1.<init>(r10, r10)
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r10 = r2.f286739Y0
            if (r10 == 0) goto L_0x0170
            r10.addView(r9, r1)
        L_0x0170:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = "reAttach succ "
            r1.append(r10)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r2.mo137055z(r5, r1)
            goto L_0x01b7
        L_0x0186:
            com.tencent.mm.plugin.sns.ui.video.a r10 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r12 = r3.f283893Id
            boolean r10 = r10.mo133933f(r12)
            if (r10 != 0) goto L_0x01b7
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r10 = r2.f286739Y0
            if (r10 == 0) goto L_0x019b
            int r10 = r10.getChildCount()
            goto L_0x019c
        L_0x019b:
            r10 = 0
        L_0x019c:
            if (r10 <= 0) goto L_0x01b7
            com.tencent.mm.plugin.sns.ui.video.a r10 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r12 = r3.f283893Id
            boolean r10 = r10.mo133932e(r12)
            if (r10 != 0) goto L_0x01b7
            com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout r10 = r2.f286739Y0
            if (r10 == 0) goto L_0x01b1
            r10.removeViewAt(r1)
        L_0x01b1:
            java.lang.String r1 = "lxl item remove videoview cost"
            r2.mo137055z(r5, r1)
        L_0x01b7:
            if (r9 == 0) goto L_0x01c6
            gu2.b r1 = r11.mo138170b()
            java.lang.String r1 = r1.mo137503A2()
            int r2 = r3.CreateTime
            r9.mo132324P(r4, r1, r2)
        L_0x01c6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            goto L_0x01d3
        L_0x01ca:
            java.lang.String r1 = "updateStructView error,empty list"
            r2.mo137054y(r5, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
        L_0x01d3:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C97746y.mo81006g(jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    public Rect getDisplayRect() {
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        int[] iArr = new int[2];
        ImproveVideoFrameLayout improveVideoFrameLayout = this.f286739Y0;
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.getLocationOnScreen(iArr);
        }
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        ImproveVideoFrameLayout improveVideoFrameLayout2 = this.f286739Y0;
        int measuredWidth = improveVideoFrameLayout2 != null ? improveVideoFrameLayout2.getMeasuredWidth() : 0;
        ImproveVideoFrameLayout improveVideoFrameLayout3 = this.f286739Y0;
        if (improveVideoFrameLayout3 != null) {
            i = improveVideoFrameLayout3.getMeasuredHeight();
        }
        Rect rect = new Rect(i2, i3, measuredWidth + i2, i + i3);
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return rect;
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        MaskImageView maskImageView = this.f286740Z0;
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return maskImageView;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return 38;
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d5m, this, false);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.f286738X0 = viewGroup;
        ImproveVideoFrameLayout improveVideoFrameLayout = (ImproveVideoFrameLayout) viewGroup.findViewById(C0966R.C0970id.nwq);
        this.f286739Y0 = improveVideoFrameLayout;
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.setVideoRemoveCallback(new C58833a(this));
        }
        MaskImageView maskImageView = (MaskImageView) viewGroup.findViewById(C0966R.C0970id.nwr);
        this.f286740Z0 = maskImageView;
        if (maskImageView != null) {
            maskImageView.setScaleType(QImageView.C97274a.CENTER_CROP);
        }
        this.f286741a1 = viewGroup.findViewById(C0966R.C0970id.nwp);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        mo137061T(layoutParams);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(viewGroup, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        return "VideoImproveTimelineItem";
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        super.onAttachedToWindow();
        View view = this.f286741a1;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", "onAttachedToWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem", "onAttachedToWindow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    /* renamed from: q */
    public void mo84000q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        super.mo84000q();
        ViewGroup viewGroup = this.f286738X0;
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams == null) {
            SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
            return;
        }
        mo137061T(layoutParams);
        ViewGroup viewGroup2 = this.f286738X0;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
    }
}
