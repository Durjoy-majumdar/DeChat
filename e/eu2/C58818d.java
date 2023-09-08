package eu2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import ad0.C91999u;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C60216z4;
import iu2.C98799a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import jq3.C60905o;
import kg3.C76577a;
import kotlin.ResultKt;
import ks2.C99181f;
import pl1.C11978e0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101789j00;
import te3.C64628pk1;
import te3.C64682rk1;
import vr2.C102236a0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C23564m;

/* renamed from: eu2.d */
public final class C58818d extends ImprovePositionTimelineItem {

    /* renamed from: b1 */
    public static final /* synthetic */ int f168401b1 = 0;

    /* renamed from: X0 */
    public View f168402X0;

    /* renamed from: Y0 */
    public View f168403Y0;

    /* renamed from: Z0 */
    public final C13601g f168404Z0 = C36568h.m40985a(new C58822c(this));

    /* renamed from: a1 */
    public final HashMap<String, Boolean> f168405a1 = new HashMap<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2", mo125469f = "FinderMediaImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.d$a */
    public static final class C58819a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C58818d f168406d;

        /* renamed from: eu2.d$a$a */
        public static final class C58820a<T> implements C60216z4.C8821a {

            /* renamed from: a */
            public final /* synthetic */ C64682rk1 f168407a;

            public C58820a(C64682rk1 rk12) {
                this.f168407a = rk12;
            }

            /* renamed from: a */
            public void mo6382a(Object obj) {
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
                Integer num = (Integer) obj;
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
                String str = this.f168407a.f185183d;
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
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2$imageLoadCallback$1");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58819a(C58818d dVar, C15601d<? super C58819a> dVar2) {
            super(2, dVar2);
            this.f168406d = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            C58819a aVar = new C58819a(this.f168406d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            Object invokeSuspend = ((C58819a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C98214b b;
            C64628pk1 pk12;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            ResultKt.throwOnFailure(obj);
            C98799a data = this.f168406d.getData();
            if (data == null || (b = data.mo138170b()) == null) {
                Boolean bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
                return bool;
            }
            C101789j00 j002 = b.mo137509G2().ContentObj;
            ViewGroup.LayoutParams layoutParams = null;
            C64682rk1 rk12 = j002 != null ? j002.f298431o : null;
            if (rk12 == null) {
                this.f168406d.mo137054y("MicroMsg.Improve.FinderMediaTimelineItem", "loadCustomItemInfo error");
                Boolean bool2 = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
                return bool2;
            }
            C58818d dVar = this.f168406d;
            int i = C58818d.f168401b1;
            SnsMethodCalculate.markStartTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            HashMap<String, Boolean> hashMap = dVar.f168405a1;
            SnsMethodCalculate.markEndTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            if (hashMap.get(b.mo137504B2()) == null) {
                C58818d dVar2 = this.f168406d;
                SnsMethodCalculate.markStartTimeMs("access$viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                dVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                View view = dVar2.f168403Y0;
                if (view != null) {
                    C23564m.m28138h(view, new C58823e(rk12, dVar2, b));
                }
                SnsMethodCalculate.markEndTimeMs("viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                SnsMethodCalculate.markEndTimeMs("access$viewExposeReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                if (!TextUtils.isEmpty(b.mo137504B2())) {
                    C58818d dVar3 = this.f168406d;
                    SnsMethodCalculate.markStartTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    HashMap<String, Boolean> hashMap2 = dVar3.f168405a1;
                    SnsMethodCalculate.markEndTimeMs("access$getListenerStatusMap$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    hashMap2.put(b.mo137504B2(), Boolean.TRUE);
                }
            }
            if (!Util.isNullOrNil((List) rk12.f185190n) && (pk12 = rk12.f185190n.get(0)) != null) {
                Pair<Integer, Integer> k = C91999u.m115565k((int) pk12.f184829g, (int) pk12.f184830h, this.f168406d.getContext(), false);
                Integer num = (Integer) k.first;
                Integer num2 = (Integer) k.second;
                View R = C58818d.m68602R(this.f168406d);
                ViewGroup.LayoutParams layoutParams2 = R != null ? R.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    C87412m.m108593f(num, "smallSide");
                    layoutParams2.width = num.intValue();
                }
                View R2 = C58818d.m68602R(this.f168406d);
                if (R2 != null) {
                    layoutParams = R2.getLayoutParams();
                }
                if (layoutParams != null) {
                    C87412m.m108593f(num2, "smallHeight");
                    layoutParams.height = num2.intValue();
                }
                View R3 = C58818d.m68602R(this.f168406d);
                if (R3 != null) {
                    R3.requestLayout();
                }
                String q = C76577a.m92166q(this.f168406d.getContext(), C0966R.string.jch);
                C87412m.m108593f(q, "getString(context, R.string.sns_finder_who_video)");
                String format = String.format(q, Arrays.copyOf(new Object[]{C102236a0.m134703A(rk12)}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                View R4 = C58818d.m68602R(this.f168406d);
                if (R4 != null) {
                    R4.setContentDescription(format);
                }
                String B2 = b.mo137504B2();
                String str = rk12.f185183d;
                SnsMethodCalculate.markStartTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
                if (str == null) {
                    str = "";
                }
                C99181f.m129210p(B2, str, -1, "timeline", false, false);
                SnsMethodCalculate.markEndTimeMs("startLoad", "com.tencent.mm.plugin.sns.report.SnsFinderReportUtil");
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76809Sd(pk12.f184828f, C58818d.m68603S(this.f168406d), new WeakReference(new C58820a(rk12)), C11978e0.C11979a.COMMON);
            }
            Boolean bool3 = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$loadCustomItemInfo$2");
            return bool3;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem", mo125469f = "FinderMediaImproveTimelineItem.kt", mo125470l = {71}, mo125471m = "onBindViewHolder")
    /* renamed from: eu2.d$b */
    public static final class C58821b extends C66704d {

        /* renamed from: d */
        public Object f168408d;

        /* renamed from: e */
        public /* synthetic */ Object f168409e;

        /* renamed from: f */
        public final /* synthetic */ C58818d f168410f;

        /* renamed from: g */
        public int f168411g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58821b(C58818d dVar, C15601d<? super C58821b> dVar2) {
            super(dVar2);
            this.f168410f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$onBindViewHolder$1");
            this.f168409e = obj;
            this.f168411g |= Integer.MIN_VALUE;
            Object g = this.f168410f.mo81006g((C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$onBindViewHolder$1");
            return g;
        }
    }

    /* renamed from: eu2.d$c */
    public static final class C58822c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C58818d f168412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58822c(C58818d dVar) {
            super(0);
            this.f168412d = dVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$thumbImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$thumbImg$2");
            View R = C58818d.m68602R(this.f168412d);
            ImageView imageView = R != null ? (ImageView) R.findViewById(C0966R.C0970id.jtg) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$thumbImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$thumbImg$2");
            return imageView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58818d(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: R */
    public static final /* synthetic */ View m68602R(C58818d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        View view = dVar.f168403Y0;
        SnsMethodCalculate.markEndTimeMs("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    /* renamed from: S */
    public static final /* synthetic */ ImageView m68603S(C58818d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        ImageView thumbImg = dVar.getThumbImg();
        SnsMethodCalculate.markEndTimeMs("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return thumbImg;
    }

    private final C64628pk1 getFinderMedia() {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        C98799a data = getData();
        if (data == null || (b = data.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return null;
        }
        C64682rk1 rk12 = b.mo137509G2().ContentObj.f298431o;
        if (!Util.isNullOrNil((List) rk12.f185190n)) {
            C64628pk1 pk12 = rk12.f185190n.get(0);
            SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return pk12;
        }
        SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return null;
    }

    private final ImageView getThumbImg() {
        SnsMethodCalculate.markStartTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        ImageView imageView = (ImageView) ((C36570n) this.f168404Z0).getValue();
        SnsMethodCalculate.markEndTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return imageView;
    }

    /* renamed from: F */
    public Object mo81005F(C15601d<? super Boolean> dVar) {
        SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        C53896h0 h0Var = C53872d1.f151117a;
        Object g = C53895h.m60469g(C58901s.f168555a, new C58819a(this, (C15601d<? super C58819a>) null), dVar);
        SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return g;
    }

    /* renamed from: P */
    public View mo83992P(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        View view = this.f168403Y0;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    /* renamed from: T */
    public final void mo83999T(ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        C64628pk1 finderMedia = getFinderMedia();
        if (finderMedia == null) {
            SnsMethodCalculate.markEndTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        Pair<Integer, Integer> k = C91999u.m115565k((int) finderMedia.f184829g, (int) finderMedia.f184830h, getContext(), false);
        Object obj = k.first;
        C87412m.m108593f(obj, "pair.first");
        layoutParams.width = ((Number) obj).intValue();
        Object obj2 = k.second;
        C87412m.m108593f(obj2, "pair.second");
        layoutParams.height = ((Number) obj2).intValue();
        mo137055z("MicroMsg.Improve.FinderMediaTimelineItem", "calculateParamSize width:" + layoutParams.width + " height:" + layoutParams.height);
        SnsMethodCalculate.markEndTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo81006g(jq3.C60905o r18, iu2.C98799a r19, int r20, boolean r21, wx3.C15601d<? super rx3.C13598b0> r22) {
        /*
            r17 = this;
            r6 = r17
            r0 = r22
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof eu2.C58818d.C58821b
            if (r1 == 0) goto L_0x001f
            r1 = r0
            eu2.d$b r1 = (eu2.C58818d.C58821b) r1
            int r2 = r1.f168411g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001f
            int r2 = r2 - r3
            r1.f168411g = r2
            goto L_0x0024
        L_0x001f:
            eu2.d$b r1 = new eu2.d$b
            r1.<init>(r6, r0)
        L_0x0024:
            r5 = r1
            java.lang.Object r0 = r5.f168409e
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f168411g
            r2 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 != r2) goto L_0x0038
            java.lang.Object r1 = r5.f168408d
            eu2.d r1 = (eu2.C58818d) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x009d
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = fu2.C98041z.m126632K(r17)
            java.util.Iterator r0 = r0.iterator()
        L_0x004e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            fu2.a r1 = (fu2.C97987a) r1
            boolean r3 = r1 instanceof fu2.C98017m
            if (r3 == 0) goto L_0x004e
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 != 0) goto L_0x0084
            java.util.ArrayList r0 = r17.getClickInstanceList()
            fu2.m r1 = new fu2.m
            android.content.Context r3 = r17.getContext()
            java.lang.String r4 = "context"
            gy3.C87412m.m108593f(r3, r4)
            r1.<init>(r3)
            android.view.View r11 = r6.f168403Y0
            r12 = 0
            r13 = 1
            r14 = 0
            r15 = 10
            r16 = 0
            r10 = r1
            fu2.C97987a.m126564l(r10, r11, r12, r13, r14, r15, r16)
            r0.add(r1)
        L_0x0084:
            r5.f168408d = r6
            r5.f168411g = r2
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r0 = super.mo81006g(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x009c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        L_0x009c:
            r1 = r6
        L_0x009d:
            r1.mo84000q()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C58818d.mo81006g(jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return 18;
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d2v, this, false);
        this.f168402X0 = inflate;
        this.f168403Y0 = inflate != null ? inflate.findViewById(C0966R.C0970id.jtc) : null;
        Pair<Integer, Integer> j = C91999u.m115564j(getContext());
        Object obj = j.first;
        C87412m.m108593f(obj, "pair.first");
        int intValue = ((Number) obj).intValue();
        Object obj2 = j.second;
        C87412m.m108593f(obj2, "pair.second");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(intValue, ((Number) obj2).intValue());
        mo83999T(layoutParams);
        View view = this.f168402X0;
        C87412m.m108591d(view);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(view, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return "FinderImproveMediaTimelineItem";
    }

    /* renamed from: q */
    public void mo84000q() {
        SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        super.mo84000q();
        View view = this.f168402X0;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams == null) {
            SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        mo83999T(layoutParams);
        View view2 = this.f168402X0;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }
}
