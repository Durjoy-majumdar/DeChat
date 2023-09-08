package eu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.plugin.sns.p106ui.C95713a5;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.storage.C96983o3;
import du2.C97541a;
import f14.C58901s;
import fu2.C97987a;
import fu2.C98031u;
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

/* renamed from: eu2.t */
public final class C97739t extends ImprovePositionTimelineItem {

    /* renamed from: Y0 */
    public static final /* synthetic */ int f286718Y0 = 0;

    /* renamed from: X0 */
    public C102298a f286719X0;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2", mo125469f = "MultiPhotoImproveTimelineItem.kt", mo125470l = {99}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.t$a */
    public static final class C97740a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f286720d;

        /* renamed from: e */
        public Object f286721e;

        /* renamed from: f */
        public Object f286722f;

        /* renamed from: g */
        public int f286723g;

        /* renamed from: h */
        public int f286724h;

        /* renamed from: i */
        public final /* synthetic */ C97739t f286725i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1", mo125469f = "MultiPhotoImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: eu2.t$a$a */
        public static final class C97741a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C97739t f286726d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97741a(C97739t tVar, C15601d<? super C97741a> dVar) {
                super(2, dVar);
                this.f286726d = tVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                C97741a aVar = new C97741a(this.f286726d, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                Object invokeSuspend = ((C97741a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                C13598b0 b0Var;
                C97987a aVar;
                C97987a aVar2;
                C97987a aVar3;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                ResultKt.throwOnFailure(obj);
                Iterator it = C98041z.m126632K(this.f286726d).iterator();
                while (true) {
                    b0Var = null;
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (C97987a) it.next();
                    if (aVar instanceof C98038y) {
                        break;
                    }
                }
                if (aVar == null) {
                    C97739t tVar = this.f286726d;
                    int i = C97739t.f286718Y0;
                    SnsMethodCalculate.markStartTimeMs("access$getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                    ArrayList<C97987a> clickInstanceList = tVar.getClickInstanceList();
                    SnsMethodCalculate.markEndTimeMs("access$getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                    Context context = this.f286726d.getContext();
                    C87412m.m108593f(context, "context");
                    clickInstanceList.add(new C98031u(context));
                }
                Iterator it4 = C98041z.m126632K(this.f286726d).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        aVar2 = null;
                        break;
                    }
                    aVar2 = (C97987a) it4.next();
                    if (aVar2 instanceof C98038y) {
                        break;
                    }
                }
                C98038y yVar = (C98038y) aVar2;
                if (yVar != null) {
                    C97987a.m126564l(yVar, C97739t.m126065R(this.f286726d), false, true, false, 10, (Object) null);
                }
                Iterator it5 = C98041z.m126632K(this.f286726d).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        aVar3 = null;
                        break;
                    }
                    aVar3 = (C97987a) it5.next();
                    if (aVar3 instanceof C98038y) {
                        break;
                    }
                }
                C98038y yVar2 = (C98038y) aVar3;
                if (yVar2 != null) {
                    C60905o holder = this.f286726d.getHolder();
                    C87412m.m108591d(holder);
                    C98799a data = this.f286726d.getData();
                    C87412m.m108591d(data);
                    yVar2.mo137318m(holder, data.mo138170b());
                    b0Var = C13598b0.f38549a;
                }
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97740a(C97739t tVar, C15601d<? super C97740a> dVar) {
            super(2, dVar);
            this.f286725i = tVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            C97740a aVar = new C97740a(this.f286725i, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C97740a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            TimeLineObject timeLineObject;
            List list;
            List<View> list2;
            String str;
            C98214b b;
            String str2 = "invokeSuspend";
            SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i2 = this.f286724h;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C98799a data = this.f286725i.getData();
                if (data == null || (b = data.mo138170b()) == null || (timeLineObject = b.mo137509G2()) == null) {
                    String str3 = str2;
                    Boolean bool = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
                    return bool;
                }
                this.f286725i.getClass();
                SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                C101789j00 j002 = timeLineObject.ContentObj;
                LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
                C87412m.m108591d(linkedList);
                SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                if (linkedList.isEmpty()) {
                    this.f286725i.mo137054y("MicroMsg.Improve.MultiPhotoTimelineItem", "loadCustomItemInfo error for empty media list!");
                    Boolean bool2 = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
                    return bool2;
                }
                C97739t tVar = this.f286725i;
                SnsMethodCalculate.markStartTimeMs("access$setViewDetached$p", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                tVar.getClass();
                SnsMethodCalculate.markEndTimeMs("access$setViewDetached$p", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                this.f286725i.getClass();
                SnsMethodCalculate.markStartTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                C101789j00 j003 = timeLineObject.ContentObj;
                list = j003 != null ? j003.f298427h : null;
                C87412m.m108591d(list);
                SnsMethodCalculate.markEndTimeMs("getMediaList$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                C102298a R = C97739t.m126065R(this.f286725i);
                if (R == null || (list2 = R.getChildList()) == null) {
                    String str4 = str2;
                    Boolean bool3 = Boolean.FALSE;
                    SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
                    return bool3;
                }
                if (list2.size() != list.size()) {
                    this.f286725i.mo137054y("MicroMsg.Improve.MultiPhotoTimelineItem", "improveMultiPhotoLoad may be sth. error!");
                    C102298a R2 = C97739t.m126065R(this.f286725i);
                    if (R2 != null) {
                        R2.mo141848c(list.size());
                    }
                    C102298a R3 = C97739t.m126065R(this.f286725i);
                    if (R3 == null || (list2 = R3.getChildList()) == null) {
                        Boolean bool4 = Boolean.FALSE;
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
                        return bool4;
                    }
                }
                int hashCode = this.f286725i.getContext().hashCode();
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C97741a aVar2 = new C97741a(this.f286725i, (C15601d<? super C97741a>) null);
                this.f286720d = timeLineObject;
                this.f286721e = list;
                this.f286722f = list2;
                this.f286723g = hashCode;
                this.f286724h = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
                    return aVar;
                }
                i = hashCode;
            } else if (i2 == 1) {
                int i3 = this.f286723g;
                list2 = (List) this.f286722f;
                list = (List) this.f286721e;
                timeLineObject = (TimeLineObject) this.f286720d;
                ResultKt.throwOnFailure(obj);
                i = i3;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
                throw illegalStateException;
            }
            SnsMethodCalculate.markStartTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
            C95713a5 a5Var = C97541a.f286247a;
            SnsMethodCalculate.markEndTimeMs("getImageLoader", "com.tencent.mm.plugin.sns.ui.improve.func.SnsImprovePhotoLoader");
            if (a5Var != null) {
                C97739t tVar2 = this.f286725i;
                C98799a data2 = tVar2.getData();
                C87412m.m108591d(data2);
                SnsInfo C2 = data2.mo138170b().mo137505C2();
                int A = this.f286725i.mo137038A();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLineObject.CreateTime;
                SnsMethodCalculate.markStartTimeMs("access$improveMultiPhotoLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                String str5 = "improveMultiPhotoLoad";
                SnsMethodCalculate.markStartTimeMs(str5, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                String snsId = C2.getSnsId();
                list.size();
                tVar2.mo137055z("MicroMsg.Improve.MultiPhotoTimelineItem", "improveMultiPhotoLoad view size:" + list2.size() + " media size:" + list.size());
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                int i4 = 0;
                for (T next : list2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        String str6 = str5;
                        View view = (View) next;
                        C96983o3 o3Var = c;
                        MaskImageView maskImageView = view instanceof MaskImageView ? (MaskImageView) view : null;
                        if (maskImageView != null) {
                            maskImageView.setPosition(A);
                        }
                        C96235u4 u4Var = new C96235u4();
                        C98799a data3 = tVar2.getData();
                        C87412m.m108591d(data3);
                        String str7 = str2;
                        u4Var.f281206a = data3.mo138170b().mo137503A2();
                        u4Var.f281207b = i4;
                        u4Var.f281209d = list2;
                        u4Var.f281210e = true;
                        u4Var.f281208c = A;
                        view.setTag(u4Var);
                        sparseArray.put(i4, view);
                        if (list.size() > i4) {
                            sparseArray2.put(i4, list.get(i4));
                        }
                        C102298a aVar3 = tVar2.f286719X0;
                        int childCount = aVar3 != null ? aVar3.getChildCount() : 0;
                        SnsMethodCalculate.markStartTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
                        List<View> list3 = list2;
                        String b2 = C9530k.f29712a.mo10207b(i4, childCount);
                        SnsMethodCalculate.markEndTimeMs("createPhotoContentDescription", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemAccessibility");
                        view.setContentDescription(b2);
                        str5 = str6;
                        c = o3Var;
                        i4 = i5;
                        tVar2 = tVar2;
                        str2 = str7;
                        list2 = list3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                str = str2;
                a5Var.mo133160e(sparseArray2, sparseArray, i, A, c, snsId);
                SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
                SnsMethodCalculate.markEndTimeMs("access$improveMultiPhotoLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
            } else {
                str = str2;
            }
            this.f286725i.mo137055z("MicroMsg.Improve.MultiPhotoTimelineItem", "improveMultiPhotoLoad loadCustomItemInfo finish!");
            Boolean bool5 = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem$loadCustomItemInfo$2");
            return bool5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97739t(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: R */
    public static final /* synthetic */ C102298a m126065R(C97739t tVar) {
        SnsMethodCalculate.markStartTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        C102298a aVar = tVar.f286719X0;
        SnsMethodCalculate.markEndTimeMs("access$getPhotoLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return aVar;
    }

    /* renamed from: D */
    public boolean mo81004D() {
        SnsMethodCalculate.markStartTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        C102298a aVar = this.f286719X0;
        boolean z = false;
        if (aVar != null && aVar.mo141846a()) {
            z = true;
        }
        boolean z2 = !z;
        SnsMethodCalculate.markEndTimeMs("enableRepeatLoad", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return z2;
    }

    /* renamed from: F */
    public Object mo81005F(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C97740a(this, (C15601d<? super C97740a>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return g;
    }

    /* renamed from: P */
    public View mo83992P(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        C102298a aVar = this.f286719X0;
        View childAt = aVar != null ? aVar.getChildAt(i) : null;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return childAt;
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return 36;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        super.mo81008h();
        C102298a aVar = this.f286719X0;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
            int childCount = aVar.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = aVar.getChildAt(i);
                C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.MaskImageView");
                ((MaskImageView) childAt).mo126941o();
            }
            SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        }
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        if (this.f286719X0 == null) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            this.f286719X0 = new C102298a(context);
        }
        List<C101804kv2> mediaList = getMediaList();
        C102298a aVar = this.f286719X0;
        if (aVar != null) {
            aVar.mo141848c(mediaList != null ? mediaList.size() : 0);
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f44447g = 0;
        C102298a aVar2 = this.f286719X0;
        C87412m.m108591d(aVar2);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(aVar2, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        StringBuilder sb = new StringBuilder();
        sb.append("MultiPhotoImproveTimelineItem-");
        List<C101804kv2> mediaList = getMediaList();
        sb.append(mediaList != null ? Integer.valueOf(mediaList.size()) : null);
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        return sb4;
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
    }

    /* renamed from: q */
    public void mo84000q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
        super.mo84000q();
        List<C101804kv2> mediaList = getMediaList();
        C102298a aVar = this.f286719X0;
        if (aVar != null) {
            aVar.mo141848c(mediaList != null ? mediaList.size() : 0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("width:");
        C102298a aVar2 = this.f286719X0;
        Integer num = null;
        sb.append(aVar2 != null ? Integer.valueOf(aVar2.getWidth()) : null);
        sb.append(" height:");
        C102298a aVar3 = this.f286719X0;
        if (aVar3 != null) {
            num = Integer.valueOf(aVar3.getHeight());
        }
        sb.append(num);
        mo137055z("MicroMsg.Improve.MultiPhotoTimelineItem", sb.toString());
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.MultiPhotoImproveTimelineItem");
    }
}
