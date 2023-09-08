package eu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
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
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.storage.C96983o3;
import du2.C97541a;
import f14.C58901s;
import fu2.C97987a;
import fu2.C98038y;
import fu2.C98041z;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60905o;
import ju2.C9530k;
import kg3.C76577a;
import kotlin.ResultKt;
import ru2.C101465a;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C101789j00;
import te3.C101804kv2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: eu2.v */
public final class C97744v extends ImprovePositionTimelineItem {

    /* renamed from: X0 */
    public ColorDrawable f286735X0;

    /* renamed from: Y0 */
    public MaskImageView f286736Y0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2", mo125469f = "SinglePhotoImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.v$a */
    public static final class C97745a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C97744v f286737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97745a(C97744v vVar, C15601d<? super C97745a> dVar) {
            super(2, dVar);
            this.f286737d = vVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
            C97745a aVar = new C97745a(this.f286737d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C97745a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C98214b b;
            String str;
            boolean z;
            boolean z2;
            String str2;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            C98799a data = this.f286737d.getData();
            if (data == null || (b = data.mo138170b()) == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            TimeLineObject G2 = b.mo137509G2();
            if (G2 == null) {
                Boolean bool2 = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
                return bool2;
            } else if (this.f286737d.mo137057R(G2).isEmpty()) {
                this.f286737d.mo137054y("MicroMsg.Improve.SinglePhotoTimelineItem", "loadCustomItemInfo error for empty media list!");
                Boolean bool3 = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
                return bool3;
            } else {
                int hashCode = this.f286737d.getContext().hashCode();
                SnsMethodCalculate.markStartTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
                C95713a5 a5Var = C97541a.f286247a;
                SnsMethodCalculate.markEndTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
                if (a5Var != null) {
                    C97744v vVar = this.f286737d;
                    SnsMethodCalculate.markStartTimeMs("access$getImageView$p", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
                    MaskImageView maskImageView = vVar.f286736Y0;
                    SnsMethodCalculate.markEndTimeMs("access$getImageView$p", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
                    String A2 = b.mo137503A2();
                    int viewType = this.f286737d.getViewType();
                    int A = this.f286737d.mo137038A();
                    C96983o3 c = C96983o3.m124651c();
                    c.f284145b = G2.CreateTime;
                    z = false;
                    str = "access$getImageView$p";
                    z2 = a5Var.mo133158c(maskImageView, this.f286737d.mo137057R(G2).get(0), A2, hashCode, viewType, A, true, c, b.mo137505C2());
                } else {
                    str = "access$getImageView$p";
                    z = false;
                    z2 = false;
                }
                if (z2) {
                    C97744v vVar2 = this.f286737d;
                    str2 = str;
                    SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
                    MaskImageView maskImageView2 = vVar2.f286736Y0;
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
                    if (maskImageView2 != null ? maskImageView2.mo126940m() : false) {
                        z = true;
                    }
                } else {
                    str2 = str;
                }
                C97744v vVar3 = this.f286737d;
                StringBuilder sb = new StringBuilder();
                sb.append("loadCustomItemInfo result:");
                sb.append(z2);
                sb.append("  load bitmap:");
                C97744v vVar4 = this.f286737d;
                SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
                MaskImageView maskImageView3 = vVar4.f286736Y0;
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
                sb.append(maskImageView3 != null ? Boolean.valueOf(maskImageView3.mo126940m()) : null);
                vVar3.mo137055z("MicroMsg.Improve.SinglePhotoTimelineItem", sb.toString());
                Boolean valueOf = Boolean.valueOf(z);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem$loadCustomItemInfo$2");
                return valueOf;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97744v(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f286735X0 = new ColorDrawable(C76577a.m92153d(context, C0966R.color.f2930d));
    }

    /* renamed from: F */
    public Object mo81005F(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C97745a(this, (C15601d<? super C97745a>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return g;
    }

    /* renamed from: P */
    public View mo83992P(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        MaskImageView maskImageView = this.f286736Y0;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return maskImageView;
    }

    /* renamed from: R */
    public final List<C101804kv2> mo137057R(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        C87412m.m108594g(timeLineObject, "<this>");
        C101789j00 j002 = timeLineObject.ContentObj;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        C87412m.m108591d(linkedList);
        SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return linkedList;
    }

    /* renamed from: S */
    public final void mo137058S(ViewGroup.LayoutParams layoutParams) {
        C98214b b;
        TimeLineObject G2;
        SnsMethodCalculate.markStartTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        C98799a data = getData();
        if (data == null || (b = data.mo138170b()) == null || (G2 = b.mo137509G2()) == null) {
            SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        } else if (mo137057R(G2).isEmpty()) {
            mo137054y("MicroMsg.Improve.SinglePhotoTimelineItem", "updateParam error for empty media list!");
            SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        } else {
            Size a = C101465a.f297160a.mo140964a(mo137057R(G2).get(0));
            layoutParams.width = a.getWidth();
            layoutParams.height = a.getHeight();
            mo137055z("MicroMsg.Improve.SinglePhotoTimelineItem", "width:" + a.getWidth() + " height:" + a.getHeight());
            SnsMethodCalculate.markEndTimeMs("updateParam", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        }
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        C97987a aVar2;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        Iterator it = C98041z.m126632K(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = (C97987a) it.next();
            if (aVar2 instanceof C98038y) {
                break;
            }
        }
        if (aVar2 == null) {
            ArrayList<C97987a> clickInstanceList = getClickInstanceList();
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C98038y yVar = new C98038y(context);
            C97987a.m126564l(yVar, this.f286736Y0, false, true, false, 10, (Object) null);
            clickInstanceList.add(yVar);
        }
        Object g = super.mo81006g(oVar, aVar, i, z, dVar);
        if (g == C15911a.COROUTINE_SUSPENDED) {
            SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
            return g;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return b0Var;
    }

    public QPictureView getTagImgView() {
        SnsMethodCalculate.markStartTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        MaskImageView maskImageView = this.f286736Y0;
        SnsMethodCalculate.markEndTimeMs("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return maskImageView;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return 37;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        super.mo81008h();
        MaskImageView maskImageView = this.f286736Y0;
        if (maskImageView != null) {
            maskImageView.mo126941o();
        }
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        MaskImageView maskImageView = new MaskImageView(getContext());
        this.f286736Y0 = maskImageView;
        SnsMethodCalculate.markStartTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        String b = C9530k.f29712a.mo10207b(0, 1);
        SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
        maskImageView.setContentDescription(b);
        MaskImageView maskImageView2 = this.f286736Y0;
        if (maskImageView2 != null) {
            maskImageView2.setScaleType(QImageView.C97274a.CENTER_CROP);
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        mo137058S(layoutParams);
        MaskImageView maskImageView3 = this.f286736Y0;
        C87412m.m108591d(maskImageView3);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(maskImageView3, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        return "SinglePhotoTimelineItem";
    }

    /* renamed from: q */
    public void mo84000q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
        super.mo84000q();
        MaskImageView maskImageView = this.f286736Y0;
        ViewGroup.LayoutParams layoutParams = maskImageView != null ? maskImageView.getLayoutParams() : null;
        if (layoutParams == null) {
            SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
            return;
        }
        mo137058S(layoutParams);
        MaskImageView maskImageView2 = this.f286736Y0;
        if (maskImageView2 != null) {
            maskImageView2.setLayoutParams(layoutParams);
        }
        MaskImageView maskImageView3 = this.f286736Y0;
        if (maskImageView3 != null) {
            maskImageView3.setImageDrawable(this.f286735X0);
        }
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.SinglePhotoImproveTimelineItem");
    }
}
