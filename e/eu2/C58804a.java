package eu2;

import a14.C0000n0;
import ad0.C91999u;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImprovePositionTimelineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import iu2.C98799a;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import ls3.C61397g;
import o40.C61926c;
import p565ir.C60606n;
import pl1.C11978e0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48654a21;
import te3.C51576uo2;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64623p81;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: eu2.a */
public final class C58804a extends ImprovePositionTimelineItem {

    /* renamed from: e1 */
    public static final /* synthetic */ int f168360e1 = 0;

    /* renamed from: X0 */
    public View f168361X0;

    /* renamed from: Y0 */
    public final C13601g f168362Y0 = C36568h.m40985a(new C58813i(this));

    /* renamed from: Z0 */
    public final C13601g f168363Z0 = C36568h.m40985a(new C58805a(this));

    /* renamed from: a1 */
    public final C13601g f168364a1 = C36568h.m40985a(new C58808d(this));

    /* renamed from: b1 */
    public final C13601g f168365b1 = C36568h.m40985a(new C58809e(this));

    /* renamed from: c1 */
    public final C13601g f168366c1 = C36568h.m40985a(new C58806b(this));

    /* renamed from: d1 */
    public final C13601g f168367d1 = C36568h.m40985a(new C58807c(this));

    /* renamed from: eu2.a$a */
    public static final class C58805a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C58804a f168368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58805a(C58804a aVar) {
            super(0);
            this.f168368d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$bansTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$bansTv$2");
            View S = C58804a.m68589S(this.f168368d);
            TextView textView = S != null ? (TextView) S.findViewById(C0966R.C0970id.f358052mq2) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$bansTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$bansTv$2");
            return textView;
        }
    }

    /* renamed from: eu2.a$b */
    public static final class C58806b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C58804a f168369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58806b(C58804a aVar) {
            super(0);
            this.f168369d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderEndedUI$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderEndedUI$2");
            View S = C58804a.m68589S(this.f168369d);
            View findViewById = S != null ? S.findViewById(C0966R.C0970id.nej) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderEndedUI$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderEndedUI$2");
            return findViewById;
        }
    }

    /* renamed from: eu2.a$c */
    public static final class C58807c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C58804a f168370d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58807c(C58804a aVar) {
            super(0);
            this.f168370d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveEndedUITip$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveEndedUITip$2");
            View R = C58804a.m68588R(this.f168370d);
            TextView textView = R != null ? (TextView) R.findViewById(C0966R.C0970id.nek) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveEndedUITip$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveEndedUITip$2");
            return textView;
        }
    }

    /* renamed from: eu2.a$d */
    public static final class C58808d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C58804a f168371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58808d(C58804a aVar) {
            super(0);
            this.f168371d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUI$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUI$2");
            View S = C58804a.m68589S(this.f168371d);
            View findViewById = S != null ? S.findViewById(C0966R.C0970id.nf5) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUI$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUI$2");
            return findViewById;
        }
    }

    /* renamed from: eu2.a$e */
    public static final class C58809e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C58804a f168372d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58809e(C58804a aVar) {
            super(0);
            this.f168372d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
            View T = C58804a.m68590T(this.f168372d);
            TextView textView = T != null ? (TextView) T.findViewById(C0966R.C0970id.nf6) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
            return textView;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem", mo125469f = "FinderLiveImproveTimelineItem.kt", mo125470l = {155, 159}, mo125471m = "loadCustomItemInfo")
    /* renamed from: eu2.a$f */
    public static final class C58810f extends C66704d {

        /* renamed from: d */
        public Object f168373d;

        /* renamed from: e */
        public Object f168374e;

        /* renamed from: f */
        public Object f168375f;

        /* renamed from: g */
        public /* synthetic */ Object f168376g;

        /* renamed from: h */
        public final /* synthetic */ C58804a f168377h;

        /* renamed from: i */
        public int f168378i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58810f(C58804a aVar, C15601d<? super C58810f> dVar) {
            super(dVar);
            this.f168377h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$1");
            this.f168376g = obj;
            this.f168378i |= Integer.MIN_VALUE;
            Object F = this.f168377h.mo81005F(this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$1");
            return F;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1", mo125469f = "FinderLiveImproveTimelineItem.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: eu2.a$g */
    public static final class C58811g extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C58804a f168379d;

        /* renamed from: e */
        public final /* synthetic */ C64623p81 f168380e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58811g(C58804a aVar, C64623p81 p812, C15601d<? super C58811g> dVar) {
            super(2, dVar);
            this.f168379d = aVar;
            this.f168380e = p812;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            C58811g gVar = new C58811g(this.f168379d, this.f168380e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            Object invokeSuspend = ((C58811g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            ResultKt.throwOnFailure(obj);
            C58804a aVar = this.f168379d;
            C64623p81 p812 = this.f168380e;
            int i = C58804a.f168360e1;
            SnsMethodCalculate.markStartTimeMs("updateLiveTag$default", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            boolean a0 = aVar.mo83998a0(p812, (C51713vn0) null);
            SnsMethodCalculate.markEndTimeMs("updateLiveTag$default", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            Boolean valueOf = Boolean.valueOf(a0);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$loadCustomItemInfo$needUpdate$1");
            return valueOf;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem", mo125469f = "FinderLiveImproveTimelineItem.kt", mo125470l = {89}, mo125471m = "onBindViewHolder")
    /* renamed from: eu2.a$h */
    public static final class C58812h extends C66704d {

        /* renamed from: d */
        public Object f168381d;

        /* renamed from: e */
        public Object f168382e;

        /* renamed from: f */
        public /* synthetic */ Object f168383f;

        /* renamed from: g */
        public final /* synthetic */ C58804a f168384g;

        /* renamed from: h */
        public int f168385h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58812h(C58804a aVar, C15601d<? super C58812h> dVar) {
            super(dVar);
            this.f168384g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$onBindViewHolder$1");
            this.f168383f = obj;
            this.f168385h |= Integer.MIN_VALUE;
            Object g = this.f168384g.mo81006g((C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$onBindViewHolder$1");
            return g;
        }
    }

    /* renamed from: eu2.a$i */
    public static final class C58813i extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C58804a f168386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58813i(C58804a aVar) {
            super(0);
            this.f168386d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$thumbImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$thumbImg$2");
            View S = C58804a.m68589S(this.f168386d);
            ImageView imageView = S != null ? (ImageView) S.findViewById(C0966R.C0970id.jtg) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$thumbImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$thumbImg$2");
            return imageView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58804a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: R */
    public static final /* synthetic */ View m68588R(C58804a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        View finderEndedUI = aVar.getFinderEndedUI();
        SnsMethodCalculate.markEndTimeMs("access$getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return finderEndedUI;
    }

    /* renamed from: S */
    public static final /* synthetic */ View m68589S(C58804a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        View view = aVar.f168361X0;
        SnsMethodCalculate.markEndTimeMs("access$getFinderLiveView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    /* renamed from: T */
    public static final /* synthetic */ View m68590T(C58804a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        View finderLivingUI = aVar.getFinderLivingUI();
        SnsMethodCalculate.markEndTimeMs("access$getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return finderLivingUI;
    }

    private final TextView getBansTv() {
        SnsMethodCalculate.markStartTimeMs("getBansTv", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f168363Z0).getValue();
        SnsMethodCalculate.markEndTimeMs("getBansTv", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    private final View getFinderEndedUI() {
        SnsMethodCalculate.markStartTimeMs("getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        View view = (View) ((C36570n) this.f168366c1).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderEndedUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    private final TextView getFinderLiveEndedUITip() {
        SnsMethodCalculate.markStartTimeMs("getFinderLiveEndedUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f168367d1).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderLiveEndedUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    private final View getFinderLivingUI() {
        SnsMethodCalculate.markStartTimeMs("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        View view = (View) ((C36570n) this.f168364a1).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderLivingUI", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    private final TextView getFinderLivingUITip() {
        SnsMethodCalculate.markStartTimeMs("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        TextView textView = (TextView) ((C36570n) this.f168365b1).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderLivingUITip", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return textView;
    }

    private final ImageView getThumbImg() {
        SnsMethodCalculate.markStartTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        ImageView imageView = (ImageView) ((C36570n) this.f168362Y0).getValue();
        SnsMethodCalculate.markEndTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo81005F(wx3.C15601d<? super java.lang.Boolean> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "loadCustomItemInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r12 instanceof eu2.C58804a.C58810f
            if (r2 == 0) goto L_0x001b
            r2 = r12
            eu2.a$f r2 = (eu2.C58804a.C58810f) r2
            int r3 = r2.f168378i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f168378i = r3
            goto L_0x0020
        L_0x001b:
            eu2.a$f r2 = new eu2.a$f
            r2.<init>(r11, r12)
        L_0x0020:
            java.lang.Object r12 = r2.f168376g
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f168378i
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x004f
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00c7
        L_0x0034:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r12
        L_0x003f:
            java.lang.Object r4 = r2.f168375f
            te3.p81 r4 = (te3.C64623p81) r4
            java.lang.Object r6 = r2.f168374e
            gu2.b r6 = (gu2.C98214b) r6
            java.lang.Object r8 = r2.f168373d
            eu2.a r8 = (eu2.C58804a) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0093
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r12)
            iu2.a r12 = r11.getData()
            if (r12 == 0) goto L_0x00cd
            gu2.b r12 = r12.mo138170b()
            if (r12 != 0) goto L_0x0060
            goto L_0x00cd
        L_0x0060:
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r12.mo137509G2()
            te3.j00 r4 = r4.ContentObj
            if (r4 == 0) goto L_0x006b
            te3.p81 r4 = r4.f298435s
            goto L_0x006c
        L_0x006b:
            r4 = r7
        L_0x006c:
            if (r4 != 0) goto L_0x0074
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        L_0x0074:
            a14.h0 r8 = a14.C53872d1.f151117a
            a14.k2 r8 = f14.C58901s.f168555a
            eu2.a$g r9 = new eu2.a$g
            r9.<init>(r11, r4, r7)
            r2.f168373d = r11
            r2.f168374e = r12
            r2.f168375f = r4
            r2.f168378i = r6
            java.lang.Object r6 = a14.C53895h.m60469g(r8, r9, r2)
            if (r6 != r3) goto L_0x008f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x008f:
            r8 = r11
            r10 = r6
            r6 = r12
            r12 = r10
        L_0x0093:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00c7
            r2.f168373d = r7
            r2.f168374e = r7
            r2.f168375f = r7
            r2.f168378i = r5
            r8.getClass()
            java.lang.String r12 = "checkLiveStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)
            a14.h0 r5 = a14.C53872d1.f151117a
            eu2.b r9 = new eu2.b
            r9.<init>(r4, r8, r6, r7)
            java.lang.Object r2 = a14.C53895h.m60469g(r5, r9, r2)
            if (r2 != r3) goto L_0x00bc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)
            goto L_0x00c1
        L_0x00bc:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)
        L_0x00c1:
            if (r2 != r3) goto L_0x00c7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x00c7:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        L_0x00cd:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C58804a.mo81005F(wx3.d):java.lang.Object");
    }

    /* renamed from: P */
    public View mo83992P(int i) {
        SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        View view = this.f168361X0;
        SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return view;
    }

    /* renamed from: U */
    public final boolean mo83993U(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (imageView == null) {
            mo137054y("MicroMsg.Improve.FinderLiveTimelineItem", "notice!thumb view is null!");
            SnsMethodCalculate.markEndTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return false;
        }
        Object tag = imageView.getTag(C0966R.C0970id.n4_);
        mo137055z("MicroMsg.Improve.FinderLiveTimelineItem", "checkIsImageLoaded[" + C87412m.m108589b(tag, str + i) + "] last:" + tag + " current:$" + str + i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        boolean b = C87412m.m108589b(tag, sb.toString());
        SnsMethodCalculate.markEndTimeMs("checkIsImageLoaded", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return b;
    }

    /* renamed from: W */
    public final boolean mo83994W(C64623p81 p812, C64273c21 c212) {
        Class cls = C61397g.class;
        SnsMethodCalculate.markStartTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean ah02 = c212 != null ? ((C61397g) C86312j.m106911c(cls)).ah0(p812.f184779e, c212) : ((C61397g) C86312j.m106911c(cls)).mo83476G0(p812);
        SnsMethodCalculate.markEndTimeMs("isLiveReplay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return ah02;
    }

    /* renamed from: X */
    public final void mo83995X(ImageView imageView, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        if (imageView != null) {
            imageView.setTag(C0966R.C0970id.n4_, str + i);
        }
        SnsMethodCalculate.markEndTimeMs("setLoadedImageTagAndClearOther", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    /* renamed from: Y */
    public final void mo83996Y(C58832x xVar, int i) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("showEndTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        mo137055z("MicroMsg.Improve.FinderLiveTimelineItem", "showEndTag flag:" + i2);
        View finderLivingUI = getFinderLivingUI();
        if (finderLivingUI != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(finderLivingUI, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLivingUI.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(finderLivingUI, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View finderEndedUI = getFinderEndedUI();
        if (finderEndedUI != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = finderEndedUI;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderEndedUI.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem", "showEndTag", "(Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!mo83993U(getThumbImg(), xVar.mo84007a(), 3)) {
            mo137055z("MicroMsg.Improve.FinderLiveTimelineItem", "loadBgBlurImageRadius25");
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C60200t1.C60201a.m70368f((C60200t1) c, xVar.mo84008b(), getThumbImg(), xVar.mo84007a(), (C11978e0.C11979a) null, 8, (Object) null);
            mo83995X(getThumbImg(), xVar.mo84007a(), 3);
        }
        TextView bansTv = getBansTv();
        if (bansTv != null) {
            bansTv.setVisibility(8);
        }
        ((C60606n) C86312j.m106911c(C60606n.class)).Ej0(getFinderLiveEndedUITip(), true, i2);
        SnsMethodCalculate.markEndTimeMs("showEndTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00de, code lost:
        r2 = r1.f182386Y;
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83997Z(te3.C64273c21 r28, eu2.C58832x r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r30
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "showLiveTag"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "showLiveTag flag:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.Improve.FinderLiveTimelineItem"
            r0.mo137055z(r7, r6)
            android.view.View r6 = r27.getFinderLivingUI()
            r15 = 0
            if (r6 != 0) goto L_0x0034
            r18 = r4
            r16 = r5
            r5 = 0
            goto L_0x0080
        L_0x0034:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r8)
            java.lang.Object[] r9 = r14.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem"
            java.lang.String r11 = "showLiveTag"
            java.lang.String r12 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r8 = r6
            r18 = r4
            r4 = r14
            r14 = r16
            r16 = r5
            r5 = 0
            r15 = r17
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem"
            java.lang.String r10 = "showLiveTag"
            java.lang.String r11 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
        L_0x0080:
            android.view.View r4 = r27.getFinderEndedUI()
            r6 = 8
            if (r4 != 0) goto L_0x0089
            goto L_0x00cc
        L_0x0089:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8.mo10233c(r9)
            java.lang.Object[] r20 = r8.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem"
            java.lang.String r22 = "showLiveTag"
            java.lang.String r23 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r4
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.setVisibility(r8)
            java.lang.String r20 = "com/tencent/mm/plugin/sns/ui/improve/item/FinderLiveImproveTimelineItem"
            java.lang.String r21 = "showLiveTag"
            java.lang.String r22 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;Lcom/tencent/mm/plugin/sns/ui/improve/item/UrlAndToken;I)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x00cc:
            java.lang.Class<ir.n> r4 = p565ir.C60606n.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ir.n r4 = (p565ir.C60606n) r4
            android.widget.TextView r8 = r27.getFinderLivingUITip()
            r4.Ej0(r8, r5, r2)
            r15 = 1
            if (r1 == 0) goto L_0x00e8
            te3.ix0 r2 = r1.f182386Y
            if (r2 == 0) goto L_0x00e8
            int r2 = r2.f183745d
            if (r2 != r15) goto L_0x00e8
            r2 = 1
            goto L_0x00e9
        L_0x00e8:
            r2 = 0
        L_0x00e9:
            java.lang.String r4 = "getService(IFinderCommon…atureService::class.java)"
            if (r2 != 0) goto L_0x0138
            android.widget.ImageView r1 = r27.getThumbImg()
            java.lang.String r2 = r29.mo84007a()
            boolean r1 = r0.mo83993U(r1, r2, r5)
            if (r1 != 0) goto L_0x0129
            java.lang.String r1 = "loadImage not ban"
            r0.mo137055z(r7, r1)
            di3.d r1 = di3.C86312j.m106911c(r3)
            gy3.C87412m.m108593f(r1, r4)
            r7 = r1
            ht1.t1 r7 = (ht1.C60200t1) r7
            java.lang.String r8 = r29.mo84008b()
            android.widget.ImageView r9 = r27.getThumbImg()
            java.lang.String r10 = r29.mo84007a()
            r11 = 0
            r12 = 8
            r13 = 0
            ht1.C60200t1.C60201a.m70369g(r7, r8, r9, r10, r11, r12, r13)
            android.widget.ImageView r1 = r27.getThumbImg()
            java.lang.String r2 = r29.mo84007a()
            r0.mo83995X(r1, r2, r5)
        L_0x0129:
            android.widget.TextView r1 = r27.getBansTv()
            if (r1 != 0) goto L_0x0130
        L_0x012f:
            goto L_0x0133
        L_0x0130:
            r1.setVisibility(r6)
        L_0x0133:
            r1 = r16
            r2 = r18
            goto L_0x0196
        L_0x0138:
            android.widget.ImageView r2 = r27.getThumbImg()
            java.lang.String r6 = r29.mo84007a()
            boolean r2 = r0.mo83993U(r2, r6, r15)
            if (r2 != 0) goto L_0x0174
            java.lang.String r2 = "loadImage ban"
            r0.mo137055z(r7, r2)
            di3.d r2 = di3.C86312j.m106911c(r3)
            gy3.C87412m.m108593f(r2, r4)
            r6 = r2
            ht1.t1 r6 = (ht1.C60200t1) r6
            java.lang.String r7 = r29.mo84008b()
            android.widget.ImageView r8 = r27.getThumbImg()
            java.lang.String r9 = r29.mo84007a()
            r10 = 0
            r11 = 8
            r12 = 0
            ht1.C60200t1.C60201a.m70366d(r6, r7, r8, r9, r10, r11, r12)
            android.widget.ImageView r2 = r27.getThumbImg()
            java.lang.String r3 = r29.mo84007a()
            r0.mo83995X(r2, r3, r15)
        L_0x0174:
            android.widget.TextView r2 = r27.getBansTv()
            if (r2 != 0) goto L_0x017b
            goto L_0x018b
        L_0x017b:
            if (r1 == 0) goto L_0x0186
            te3.ix0 r1 = r1.f182386Y
            if (r1 == 0) goto L_0x0186
            java.lang.String r1 = r1.f183746e
            if (r1 == 0) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            java.lang.String r1 = ""
        L_0x0188:
            r2.setText(r1)
        L_0x018b:
            android.widget.TextView r1 = r27.getBansTv()
            if (r1 != 0) goto L_0x0192
            goto L_0x012f
        L_0x0192:
            r1.setVisibility(r5)
            goto L_0x0133
        L_0x0196:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C58804a.mo83997Z(te3.c21, eu2.x, int):void");
    }

    /* renamed from: a0 */
    public final boolean mo83998a0(C64623p81 p812, C51713vn0 vn02) {
        C48654a21 a212;
        LinkedList<C48654a21> linkedList;
        T t;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        SnsMethodCalculate.markStartTimeMs("getCoverUrl", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        String str = null;
        C58832x xVar = new C58832x((String) null, (String) null, 3, (C8480h) null);
        C51576uo2 uo22 = vn02 != null ? vn02.f143580o : null;
        if (vn02 == null || (linkedList = vn02.f143586u) == null) {
            a212 = null;
        } else {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C48654a21) t).f130235i == 2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            a212 = (C48654a21) t;
        }
        String str2 = a212 != null ? a212.f130230d : null;
        String str3 = "";
        if (!(str2 == null || str2.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a212 != null ? a212.f130230d : null);
            sb.append(Util.nullAsNil(a212 != null ? a212.f130231e : null));
            xVar.mo84010d(sb.toString());
            if (a212 != null) {
                str = a212.f130230d;
            }
            if (str != null) {
                str3 = str;
            }
            xVar.mo84009c(str3);
        } else {
            String str4 = uo22 != null ? uo22.f142984d : null;
            if (!(str4 == null || str4.length() == 0)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(uo22 != null ? uo22.f142984d : null);
                sb4.append(Util.nullAsNil(uo22 != null ? uo22.f142985e : null));
                xVar.mo84010d(sb4.toString());
                if (uo22 != null) {
                    str = uo22.f142984d;
                }
                if (str != null) {
                    str3 = str;
                }
                xVar.mo84009c(str3);
            } else {
                String str5 = p812.f184783i;
                if (!(str5 == null || str5.length() == 0)) {
                    String str6 = p812.f184783i;
                    if (str6 == null) {
                        str6 = str3;
                    }
                    xVar.mo84010d(str6);
                    String b = xVar.mo84008b();
                    SnsMethodCalculate.markStartTimeMs("removeParam", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItemKt");
                    C87412m.m108594g(b, "url");
                    Pattern compile = Pattern.compile("&?token=[^&]*");
                    C87412m.m108593f(compile, "compile(pattern)");
                    String replaceAll = compile.matcher(b).replaceAll(str3);
                    C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
                    SnsMethodCalculate.markEndTimeMs("removeParam", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItemKt");
                    xVar.mo84009c(replaceAll);
                } else {
                    String str7 = p812.f184789r;
                    if (!(str7 == null || str7.length() == 0)) {
                        String str8 = p812.f184789r;
                        if (str8 != null) {
                            str3 = str8;
                        }
                        xVar.mo84010d(str3);
                        xVar.mo84009c(xVar.mo84008b());
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("getCoverUrl", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        C64273c21 c212 = p812.f184761E;
        SnsMethodCalculate.markStartTimeMs("isChargeLive", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean I1 = c212 != null ? ((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(c212) : p812.f184759C == 2;
        SnsMethodCalculate.markEndTimeMs("isChargeLive", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean W = mo83994W(p812, p812.f184761E);
        C64273c21 c213 = p812.f184761E;
        Class cls = C61397g.class;
        SnsMethodCalculate.markStartTimeMs("replayAuditing", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean Qg = c213 != null ? ((C61397g) C86312j.m106911c(cls)).mo83480Qg(c213) : ((C61397g) C86312j.m106911c(cls)).X30(C61926c.m72671P(p812.f184778d));
        SnsMethodCalculate.markEndTimeMs("replayAuditing", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        mo137055z("MicroMsg.Improve.FinderLiveTimelineItem", "updateLiveTag, isChargeLive:" + I1 + " isLiveReplay:" + W + " replayAuditing:" + Qg + " getCoverUrl:" + xVar + ", finderShareObject.liveStatus=" + p812.f184791t);
        if (I1) {
            mo83997Z(p812.f184761E, xVar, 2);
            SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        } else if (W) {
            mo83997Z(p812.f184761E, xVar, 4);
            SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return false;
        } else if (Qg) {
            mo83996Y(xVar, 3);
            SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        } else if (p812.f184791t == 1) {
            mo83997Z(p812.f184761E, xVar, 0);
            SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return true;
        } else {
            mo83996Y(xVar, 0);
            SnsMethodCalculate.markEndTimeMs("updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        r3 = r3.mo138170b();
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo81006g(jq3.C60905o r20, iu2.C98799a r21, int r22, boolean r23, wx3.C15601d<? super rx3.C13598b0> r24) {
        /*
            r19 = this;
            r6 = r19
            r0 = r24
            java.lang.String r7 = "onBindViewHolder"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            boolean r1 = r0 instanceof eu2.C58804a.C58812h
            if (r1 == 0) goto L_0x001f
            r1 = r0
            eu2.a$h r1 = (eu2.C58804a.C58812h) r1
            int r2 = r1.f168385h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001f
            int r2 = r2 - r3
            r1.f168385h = r2
            goto L_0x0024
        L_0x001f:
            eu2.a$h r1 = new eu2.a$h
            r1.<init>(r6, r0)
        L_0x0024:
            r5 = r1
            java.lang.Object r0 = r5.f168383f
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f168385h
            r10 = 0
            r11 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 != r11) goto L_0x003e
            java.lang.Object r1 = r5.f168382e
            iu2.a r1 = (iu2.C98799a) r1
            java.lang.Object r2 = r5.f168381d
            eu2.a r2 = (eu2.C58804a) r2
            kotlin.ResultKt.throwOnFailure(r0)
            r12 = r1
            goto L_0x00a8
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            throw r0
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.ArrayList r0 = fu2.C98041z.m126632K(r19)
            java.util.Iterator r0 = r0.iterator()
        L_0x0054:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r0.next()
            fu2.a r1 = (fu2.C97987a) r1
            boolean r2 = r1 instanceof fu2.C59324k
            if (r2 == 0) goto L_0x0054
            goto L_0x0066
        L_0x0065:
            r1 = r10
        L_0x0066:
            if (r1 != 0) goto L_0x008b
            java.util.ArrayList r0 = r19.getClickInstanceList()
            fu2.k r1 = new fu2.k
            android.content.Context r2 = r19.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r2, r3)
            r1.<init>(r2)
            android.view.View r13 = r6.f168361X0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            r12 = r1
            fu2.C97987a.m126564l(r12, r13, r14, r15, r16, r17, r18)
            r0.add(r1)
        L_0x008b:
            r5.f168381d = r6
            r12 = r21
            r5.f168382e = r12
            r5.f168385h = r11
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.Object r0 = super.mo81006g(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x00a7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r9
        L_0x00a7:
            r2 = r6
        L_0x00a8:
            r2.getClass()
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            java.lang.String r1 = "doSthSetting"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            iu2.a r3 = r2.getData()
            if (r3 == 0) goto L_0x00c3
            gu2.b r3 = r3.mo138170b()
            if (r3 == 0) goto L_0x00c3
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r3.mo137509G2()
            goto L_0x00c4
        L_0x00c3:
            r3 = r10
        L_0x00c4:
            if (r3 == 0) goto L_0x0146
            te3.j00 r4 = r3.ContentObj
            if (r4 == 0) goto L_0x0146
            te3.p81 r4 = r4.f298435s
            if (r4 == 0) goto L_0x0146
            android.view.View r5 = r2.f168361X0
            if (r5 == 0) goto L_0x0146
            di3.d r9 = di3.C86312j.m106911c(r0)
            l31.e r9 = (l31.C61212e) r9
            r9.se0(r5)
            te3.c21 r9 = r4.f184761E
            boolean r9 = r2.mo83994W(r4, r9)
            if (r9 != 0) goto L_0x0146
            java.lang.String r9 = "isNeedToCheckLiveStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            te3.c21 r13 = r4.f184761E
            if (r13 == 0) goto L_0x0110
            java.lang.Class<ir.n> r14 = p565ir.C60606n.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ir.n r14 = (p565ir.C60606n) r14
            boolean r14 = r14.mo85008I1(r13)
            if (r14 == 0) goto L_0x00fe
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x0122
        L_0x00fe:
            java.lang.Class<ls3.g> r14 = ls3.C61397g.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            ls3.g r14 = (ls3.C61397g) r14
            boolean r13 = r14.mo83480Qg(r13)
            if (r13 == 0) goto L_0x0119
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x0122
        L_0x0110:
            int r13 = r4.f184759C
            r14 = 2
            if (r13 != r14) goto L_0x0119
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            goto L_0x0122
        L_0x0119:
            int r13 = r4.f184791t
            if (r13 != r11) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r11 = 0
        L_0x011f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
        L_0x0122:
            if (r11 == 0) goto L_0x012f
            t91.c$a r9 = t91.C64208c.f181951a
            java.lang.String r11 = r4.f184778d
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r9.mo89030e(r11, r10)
        L_0x012f:
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            java.lang.String r9 = "live_room_card"
            l31.e r0 = r0.o30(r5, r9)
            r9 = 40
            eu2.c r10 = new eu2.c
            r10.<init>(r4, r3, r2)
            r0.r80(r5, r9, r10)
        L_0x0146:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            lu2.b$a r0 = new lu2.b$a
            r0.<init>()
            gu2.b r1 = r12.mo138170b()
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.mo137509G2()
            r0.timeLineObject = r1
            r2.setTag(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu2.C58804a.mo81006g(jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    public int getViewType() {
        SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return 20;
    }

    /* renamed from: k */
    public C13604l<View, ConstraintLayout.LayoutParams> mo81009k() {
        SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        this.f168361X0 = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.d0h, this, false);
        Pair<Integer, Integer> j = C91999u.m115564j(getContext());
        Object obj = j.first;
        C87412m.m108593f(obj, "pair.first");
        int intValue = ((Number) obj).intValue();
        Object obj2 = j.second;
        C87412m.m108593f(obj2, "pair.second");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(intValue, ((Number) obj2).intValue());
        View view = this.f168361X0;
        C87412m.m108591d(view);
        C13604l<View, ConstraintLayout.LayoutParams> lVar = new C13604l<>(view, layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return lVar;
    }

    public String name() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        return "FinderImproveLiveTimelineItem";
    }
}
