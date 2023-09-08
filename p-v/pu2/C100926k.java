package pu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.p1073ui.QPictureView;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.p106ui.C95713a5;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.storage.C96983o3;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ju2.C9530k;
import kg3.C76577a;
import kotlin.ResultKt;
import ru2.C101465a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import te3.C101789j00;
import te3.C101804kv2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu2.k */
public final class C100926k extends C62508a {

    /* renamed from: T0 */
    public ColorDrawable f295550T0;

    /* renamed from: U0 */
    public MaskImageView f295551U0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1", mo125469f = "ImproveSinglePhotoTimelineItem.kt", mo125470l = {59}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.k$b */
    public static final class C62545b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f177647d;

        /* renamed from: e */
        public final /* synthetic */ C100926k f177648e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62545b(C100926k kVar, C15601d<? super C62545b> dVar) {
            super(2, dVar);
            this.f177648e = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            C62545b bVar = new C62545b(this.f177648e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            Object invokeSuspend = ((C62545b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f177647d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C100926k kVar = this.f177648e;
                this.f177647d = 1;
                if (kVar.mo87537B(this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$feedPublishFinished$1");
            return b0Var;
        }
    }

    /* renamed from: pu2.k$a */
    public static final class C100927a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100926k f295552d;

        public C100927a(C100926k kVar) {
            this.f295552d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/ImproveSinglePhotoTimelineItem$buildCustomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$buildCustomView$1");
            MaskImageView H = C100926k.m132294H(this.f295552d);
            if (H != null) {
                String str = this.f295552d.getStruct().f281381h;
                MaskImageView H2 = C100926k.m132294H(this.f295552d);
                C87412m.m108591d(H2);
                H.setTag(new C96235u4(str, 0, C64197v.m75534c(H2), this.f295552d.getStruct().f281376e0));
            }
            C100926k kVar = this.f295552d;
            kVar.mo140441m("MicroMsg.Improve.SinglePhotoTimelineItem", "click local id:" + this.f295552d.getStruct().f281381h);
            this.f295552d.getAdapter().f278572f.f280385o.onClick(C100926k.m132294H(this.f295552d));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$buildCustomView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/ImproveSinglePhotoTimelineItem$buildCustomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2", mo125469f = "ImproveSinglePhotoTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.k$c */
    public static final class C100928c extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C100926k f295553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100928c(C100926k kVar, C15601d<? super C100928c> dVar) {
            super(2, dVar);
            this.f295553d = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
            C100928c cVar = new C100928c(this.f295553d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C100928c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            TimeLineObject timeLine;
            boolean z;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            SnsInfo snsInfo = this.f295553d.getStruct().f281367a;
            if (snsInfo == null || (timeLine = snsInfo.getTimeLine()) == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
                return bool;
            } else if (this.f295553d.mo140388I(timeLine).isEmpty()) {
                this.f295553d.mo140440l("MicroMsg.Improve.SinglePhotoTimelineItem", "loadCustomItemInfo error for empty media list!");
                Boolean bool2 = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
                return bool2;
            } else {
                C100926k kVar = this.f295553d;
                SnsMethodCalculate.markStartTimeMs("access$setViewDetached$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
                kVar.getClass();
                SnsMethodCalculate.markEndTimeMs("access$setViewDetached$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
                int hashCode = this.f295553d.getContext().hashCode();
                C95713a5 a5Var = this.f295553d.getAdapter().f278577k;
                boolean z2 = false;
                if (a5Var != null) {
                    String str = this.f295553d.getStruct().f281381h;
                    int viewType = this.f295553d.getViewType();
                    C96983o3 c = C96983o3.m124651c();
                    c.f284145b = timeLine.CreateTime;
                    z = a5Var.mo133158c(C100926k.m132294H(this.f295553d), this.f295553d.mo140388I(timeLine).get(0), str, hashCode, viewType, 0, true, c, this.f295553d.getStruct().f281367a);
                } else {
                    z = false;
                }
                if (z) {
                    MaskImageView H = C100926k.m132294H(this.f295553d);
                    if (H != null ? H.mo126940m() : false) {
                        z2 = true;
                    }
                }
                C100926k kVar2 = this.f295553d;
                StringBuilder sb = new StringBuilder();
                sb.append("loadCustomItemInfo result:");
                sb.append(z);
                sb.append("  load bitmap:");
                MaskImageView H2 = C100926k.m132294H(this.f295553d);
                sb.append(H2 != null ? Boolean.valueOf(H2.mo126940m()) : null);
                kVar2.mo140441m("MicroMsg.Improve.SinglePhotoTimelineItem", sb.toString());
                Boolean valueOf = Boolean.valueOf(z2);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem$loadCustomItemInfo$2");
                return valueOf;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100926k(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
        this.f295550T0 = new ColorDrawable(C76577a.m92153d(context, C0966R.color.f2930d));
    }

    /* renamed from: H */
    public static final /* synthetic */ MaskImageView m132294H(C100926k kVar) {
        SnsMethodCalculate.markStartTimeMs("access$getImageView$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        MaskImageView maskImageView = kVar.f295551U0;
        SnsMethodCalculate.markEndTimeMs("access$getImageView$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return maskImageView;
    }

    /* renamed from: B */
    public Object mo87537B(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C100928c(this, (C15601d<? super C100928c>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return g;
    }

    /* renamed from: D */
    public void mo140383D() {
        SnsMethodCalculate.markStartTimeMs("feedPublishFinished", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        mo140441m("MicroMsg.Improve.SinglePhotoTimelineItem", "feedPublishFinished");
        super.mo140383D();
        C53896h0 h0Var = C53872d1.f151117a;
        C62545b bVar = new C62545b(this, (C15601d<? super C62545b>) null);
        SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        C87412m.m108594g(h0Var, "context");
        C0000n0 n0Var = C62549p.f177651a;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, h0Var, (C53934p0) null, bVar, 2, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        SnsMethodCalculate.markEndTimeMs("feedPublishFinished", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
    }

    /* renamed from: G */
    public View mo87535G(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        MaskImageView maskImageView = this.f295551U0;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return maskImageView;
    }

    /* renamed from: I */
    public final List<C101804kv2> mo140388I(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        C87412m.m108594g(timeLineObject, "<this>");
        C101789j00 j002 = timeLineObject.ContentObj;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        C87412m.m108591d(linkedList);
        SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return linkedList;
    }

    /* renamed from: J */
    public final void mo140389J(ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        TimeLineObject timeLine = getStruct().f281367a.getTimeLine();
        C87412m.m108593f(timeLine, "struct.mSnsInfo.timeLine");
        if (mo140388I(timeLine).isEmpty()) {
            mo140440l("MicroMsg.Improve.SinglePhotoTimelineItem", "updateParam error for empty media list!");
            SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
            return;
        }
        TimeLineObject timeLine2 = getStruct().f281367a.getTimeLine();
        C87412m.m108593f(timeLine2, "struct.mSnsInfo.timeLine");
        Size a = C101465a.f297160a.mo140964a(mo140388I(timeLine2).get(0));
        layoutParams.width = a.getWidth();
        layoutParams.height = a.getHeight();
        SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        MaskImageView maskImageView = new MaskImageView(getContext());
        this.f295551U0 = maskImageView;
        maskImageView.setClipToOutline(true);
        MaskImageView maskImageView2 = this.f295551U0;
        if (maskImageView2 != null) {
            maskImageView2.setScaleType(QImageView.C97274a.CENTER_CROP);
        }
        MaskImageView maskImageView3 = this.f295551U0;
        if (maskImageView3 != null) {
            SnsMethodCalculate.markStartTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
            String b = C9530k.f29712a.mo10207b(0, 1);
            SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
            maskImageView3.setContentDescription(b);
        }
        MaskImageView maskImageView4 = this.f295551U0;
        if (maskImageView4 != null) {
            maskImageView4.setOnClickListener(new C100927a(this));
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        mo140389J(layoutParams);
        MaskImageView maskImageView5 = this.f295551U0;
        C87412m.m108591d(maskImageView5);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(maskImageView5, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return lVar;
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        MaskImageView maskImageView = this.f295551U0;
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return maskImageView;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return 37;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        return "SinglePhotoTimelineItem";
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        super.onAttachedToWindow();
        getAdapter().mo132921k().mo108275j(this.f295551U0, getAdapter().f278572f.f280395y, getAdapter().f278572f.f280381k);
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
    }

    /* renamed from: q */
    public void mo87550q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
        super.mo87550q();
        MaskImageView maskImageView = this.f295551U0;
        ViewGroup.LayoutParams layoutParams = maskImageView != null ? maskImageView.getLayoutParams() : null;
        if (layoutParams == null) {
            SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
            return;
        }
        mo140389J(layoutParams);
        MaskImageView maskImageView2 = this.f295551U0;
        if (maskImageView2 != null) {
            maskImageView2.setLayoutParams(layoutParams);
        }
        MaskImageView maskImageView3 = this.f295551U0;
        if (maskImageView3 != null) {
            maskImageView3.setImageDrawable(this.f295550T0);
        }
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveSinglePhotoTimelineItem");
    }
}
