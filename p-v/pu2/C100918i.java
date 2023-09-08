package pu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import gy3.C8479f0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import ju2.C9530k;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import te3.C101789j00;
import te3.C101804kv2;
import vu2.C102298a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: pu2.i */
public final class C100918i extends C62508a {

    /* renamed from: U0 */
    public static final /* synthetic */ int f295527U0 = 0;

    /* renamed from: T0 */
    public C102298a f295528T0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1", mo125469f = "ImproveMultiPhotoTimelineItem.kt", mo125470l = {58}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.i$a */
    public static final class C62544a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f177645d;

        /* renamed from: e */
        public final /* synthetic */ C100918i f177646e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62544a(C100918i iVar, C15601d<? super C62544a> dVar) {
            super(2, dVar);
            this.f177646e = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            C62544a aVar = new C62544a(this.f177646e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            Object invokeSuspend = ((C62544a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f177645d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C100918i iVar = this.f177646e;
                this.f177645d = 1;
                if (iVar.mo87537B(this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$feedPublishFinished$1");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2", mo125469f = "ImproveMultiPhotoTimelineItem.kt", mo125470l = {96}, mo125471m = "invokeSuspend")
    /* renamed from: pu2.i$b */
    public static final class C100919b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f295529d;

        /* renamed from: e */
        public Object f295530e;

        /* renamed from: f */
        public Object f295531f;

        /* renamed from: g */
        public int f295532g;

        /* renamed from: h */
        public int f295533h;

        /* renamed from: i */
        public final /* synthetic */ C100918i f295534i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1", mo125469f = "ImproveMultiPhotoTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: pu2.i$b$a */
        public static final class C100920a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<List<View>> f295535d;

            /* renamed from: e */
            public final /* synthetic */ C100918i f295536e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100920a(C8479f0<List<View>> f0Var, C100918i iVar, C15601d<? super C100920a> dVar) {
                super(2, dVar);
                this.f295535d = f0Var;
                this.f295536e = iVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                C100920a aVar = new C100920a(this.f295535d, this.f295536e, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                Object invokeSuspend = ((C100920a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                ResultKt.throwOnFailure(obj);
                C100918i iVar = this.f295536e;
                for (View view : (Iterable) this.f295535d.f27484d) {
                    view.setOnClickListener(iVar.getAdapter().f278572f.f280385o);
                    iVar.getAdapter().mo132921k().mo108275j(view, iVar.getAdapter().f278572f.f280395y, iVar.getAdapter().f278572f.f280381k);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100919b(C100918i iVar, C15601d<? super C100919b> dVar) {
            super(2, dVar);
            this.f295534i = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            C100919b bVar = new C100919b(this.f295534i, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C100919b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            TimeLineObject timeLineObject;
            List<C101804kv2> list;
            C8479f0 f0Var;
            String str;
            T childList;
            T childList2;
            String str2 = "invokeSuspend";
            SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i2 = this.f295533h;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SnsInfo snsInfo = this.f295534i.getStruct().f281367a;
                if (snsInfo == null || (timeLineObject = snsInfo.getTimeLine()) == null) {
                    String str3 = str2;
                    Boolean bool = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
                    return bool;
                } else if (this.f295534i.mo140384H(timeLineObject).isEmpty()) {
                    this.f295534i.mo140440l("MicroMsg.Improve.ImproveMultiPhotoTimelineItem", "loadCustomItemInfo error for empty media list!");
                    Boolean bool2 = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
                    return bool2;
                } else {
                    C100918i iVar = this.f295534i;
                    SnsMethodCalculate.markStartTimeMs("access$setViewDetached$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                    iVar.getClass();
                    SnsMethodCalculate.markEndTimeMs("access$setViewDetached$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                    C100918i iVar2 = this.f295534i;
                    TimeLineObject timeLine = iVar2.getStruct().f281367a.getTimeLine();
                    C87412m.m108593f(timeLine, "struct.mSnsInfo.timeLine");
                    list = iVar2.mo140384H(timeLine);
                    f0Var = new C8479f0();
                    C100918i iVar3 = this.f295534i;
                    SnsMethodCalculate.markStartTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                    C102298a aVar2 = iVar3.f295528T0;
                    SnsMethodCalculate.markEndTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                    if (aVar2 == null || (childList = aVar2.getChildList()) == null) {
                        String str4 = str2;
                        Boolean bool3 = Boolean.FALSE;
                        SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
                        return bool3;
                    }
                    f0Var.f27484d = childList;
                    if (childList.size() != list.size()) {
                        this.f295534i.mo140440l("MicroMsg.Improve.ImproveMultiPhotoTimelineItem", "improveMultiPhotoLoad may be sth. error!");
                        C100918i iVar4 = this.f295534i;
                        SnsMethodCalculate.markStartTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                        C102298a aVar3 = iVar4.f295528T0;
                        SnsMethodCalculate.markEndTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                        if (aVar3 != null) {
                            aVar3.mo141848c(list.size());
                        }
                        C100918i iVar5 = this.f295534i;
                        SnsMethodCalculate.markStartTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                        C102298a aVar4 = iVar5.f295528T0;
                        SnsMethodCalculate.markEndTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                        if (aVar4 == null || (childList2 = aVar4.getChildList()) == null) {
                            Boolean bool4 = Boolean.FALSE;
                            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
                            return bool4;
                        }
                        f0Var.f27484d = childList2;
                    }
                    int hashCode = this.f295534i.getContext().hashCode();
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C100920a aVar5 = new C100920a(f0Var, this.f295534i, (C15601d<? super C100920a>) null);
                    this.f295529d = timeLineObject;
                    this.f295530e = list;
                    this.f295531f = f0Var;
                    this.f295532g = hashCode;
                    this.f295533h = 1;
                    if (C53895h.m60469g(k2Var, aVar5, this) == aVar) {
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
                        return aVar;
                    }
                    i = hashCode;
                }
            } else if (i2 == 1) {
                int i3 = this.f295532g;
                f0Var = (C8479f0) this.f295531f;
                list = (List) this.f295530e;
                timeLineObject = (TimeLineObject) this.f295529d;
                ResultKt.throwOnFailure(obj);
                i = i3;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
                throw illegalStateException;
            }
            C95713a5 a5Var = this.f295534i.getAdapter().f278577k;
            if (a5Var != null) {
                C100918i iVar6 = this.f295534i;
                SnsInfo snsInfo2 = iVar6.getStruct().f281367a;
                C87412m.m108593f(snsInfo2, "struct.mSnsInfo");
                int i4 = this.f295534i.getStruct().f281376e0;
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLineObject.CreateTime;
                List<View> list2 = (List) f0Var.f27484d;
                int i5 = C100918i.f295527U0;
                SnsMethodCalculate.markStartTimeMs("access$improveMultiPhotoLoad", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                String str5 = "improveMultiPhotoLoad";
                SnsMethodCalculate.markStartTimeMs(str5, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                String snsId = snsInfo2.getSnsId();
                list.size();
                iVar6.mo140441m("MicroMsg.Improve.ImproveMultiPhotoTimelineItem", "improveMultiPhotoLoad view size:" + list2.size() + " media size:" + list.size());
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                int i6 = 0;
                for (T next : list2) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        String str6 = str5;
                        View view = (View) next;
                        C96983o3 o3Var = c;
                        MaskImageView maskImageView = view instanceof MaskImageView ? (MaskImageView) view : null;
                        if (maskImageView != null) {
                            maskImageView.setPosition(i4);
                        }
                        C96235u4 u4Var = new C96235u4();
                        String str7 = str2;
                        u4Var.f281206a = iVar6.getStruct().f281381h;
                        u4Var.f281207b = i6;
                        u4Var.f281209d = list2;
                        u4Var.f281210e = true;
                        u4Var.f281208c = i4;
                        view.setTag(u4Var);
                        sparseArray.put(i6, view);
                        if (list.size() > i6) {
                            sparseArray2.put(i6, list.get(i6));
                        }
                        C102298a aVar6 = iVar6.f295528T0;
                        int childCount = aVar6 != null ? aVar6.getChildCount() : 0;
                        SnsMethodCalculate.markStartTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
                        List<View> list3 = list2;
                        String b = C9530k.f29712a.mo10207b(i6, childCount);
                        SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemAccessibility");
                        view.setContentDescription(b);
                        str5 = str6;
                        c = o3Var;
                        i6 = i7;
                        str2 = str7;
                        iVar6 = iVar6;
                        list2 = list3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                str = str2;
                a5Var.mo133160e(sparseArray2, sparseArray, i, i4, c, snsId);
                SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
                SnsMethodCalculate.markEndTimeMs("access$improveMultiPhotoLoad", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
            } else {
                str = str2;
            }
            this.f295534i.mo140441m("MicroMsg.Improve.ImproveMultiPhotoTimelineItem", "improveMultiPhotoLoad loadCustomItemInfo finish!");
            Boolean bool5 = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem$loadCustomItemInfo$2");
            return bool5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100918i(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: B */
    public Object mo87537B(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C100919b(this, (C15601d<? super C100919b>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        return g;
    }

    /* renamed from: D */
    public void mo140383D() {
        SnsMethodCalculate.markStartTimeMs("feedPublishFinished", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        mo140441m("MicroMsg.Improve.ImproveMultiPhotoTimelineItem", "feedPublishFinished");
        super.mo140383D();
        C53896h0 h0Var = C53872d1.f151117a;
        C62544a aVar = new C62544a(this, (C15601d<? super C62544a>) null);
        SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        C87412m.m108594g(h0Var, "context");
        C0000n0 n0Var = C62549p.f177651a;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, h0Var, (C53934p0) null, aVar, 2, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        SnsMethodCalculate.markEndTimeMs("feedPublishFinished", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
    }

    /* renamed from: G */
    public View mo87535G(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        C102298a aVar = this.f295528T0;
        View childAt = aVar != null ? aVar.getChildAt(i) : null;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        return childAt;
    }

    /* renamed from: H */
    public final List<C101804kv2> mo140384H(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        C87412m.m108594g(timeLineObject, "<this>");
        C101789j00 j002 = timeLineObject.ContentObj;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        C87412m.m108591d(linkedList);
        SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        return linkedList;
    }

    /* renamed from: f */
    public C13604l<View, ConstraintLayout.LayoutParams> mo87542f() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        if (this.f295528T0 == null) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            this.f295528T0 = new C102298a(context);
        }
        TimeLineObject timeLine = getStruct().f281367a.getTimeLine();
        C87412m.m108593f(timeLine, "struct.mSnsInfo.timeLine");
        List<C101804kv2> H = mo140384H(timeLine);
        C102298a aVar = this.f295528T0;
        if (aVar != null) {
            aVar.mo141848c(H.size());
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f44447g = 0;
        C102298a aVar2 = this.f295528T0;
        C87412m.m108591d(aVar2);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(aVar2, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        return lVar;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        return 36;
    }

    /* renamed from: n */
    public String mo87544n() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        StringBuilder sb = new StringBuilder();
        sb.append("ImproveMultiPhotoTimelineItem-");
        TimeLineObject timeLine = getStruct().f281367a.getTimeLine();
        C87412m.m108593f(timeLine, "struct.mSnsInfo.timeLine");
        sb.append(mo140384H(timeLine).size());
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        return sb4;
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
    }

    /* renamed from: q */
    public void mo87550q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        super.mo87550q();
        TimeLineObject timeLine = getStruct().f281367a.getTimeLine();
        C87412m.m108593f(timeLine, "struct.mSnsInfo.timeLine");
        List<C101804kv2> H = mo140384H(timeLine);
        C102298a aVar = this.f295528T0;
        if (aVar != null) {
            aVar.mo141848c(H.size());
        }
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
    }

    /* renamed from: z */
    public boolean mo87552z() {
        SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        C102298a aVar = this.f295528T0;
        boolean z = false;
        if (aVar != null && aVar.mo141846a()) {
            z = true;
        }
        boolean z2 = !z;
        SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.item.improve.ImproveMultiPhotoTimelineItem");
        return z2;
    }
}
