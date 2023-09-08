package com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsClickUnreadBtnEvent;
import com.tencent.p014mm.plugin.sns.p106ui.TouchImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gu2.C98214b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import iu2.C98799a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import kotlin.ResultKt;
import oa1.C117731d;
import ob0.C11385n;
import ob0.C117747y;
import p761yd.C38993b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110823p;
import ut2.C102084a;
import ut2.C102104r;
import ut2.C65477j;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zt2.C103077c;
import zt2.C103078d;
import zt2.C103080g;
import zt2.C103081h;
import zt2.C103082i;
import zt2.C39450f;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC */
public final class ImproveUnreadUIC extends C102084a implements C11385n {

    /* renamed from: q */
    public static ImproveUnreadUIC f279760q;

    /* renamed from: d */
    public final MultiProcessMMKV f279761d = MultiProcessMMKV.getDefault();

    /* renamed from: e */
    public final C13601g f279762e = C36568h.m40985a(C30470d.f82128d);

    /* renamed from: f */
    public final C13601g f279763f = C36568h.m40985a(new C95864a(this));

    /* renamed from: g */
    public C103082i f279764g = new C103082i(200);

    /* renamed from: h */
    public C103081h f279765h;

    /* renamed from: i */
    public final ArrayList<Observer> f279766i = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<String> f279767j = new ArrayList<>();

    /* renamed from: n */
    public final HashSet<String> f279768n = new HashSet<>();

    /* renamed from: o */
    public long f279769o;

    /* renamed from: p */
    public final IListener<SnsClickUnreadBtnEvent> f279770p = new ImproveUnreadUIC$clickUnreadBtnListener$1(this, getLifecycleOwner());

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$d */
    public static final class C30470d extends C87413o implements C32224a<C39450f> {

        /* renamed from: d */
        public static final C30470d f82128d = new C30470d();

        public C30470d() {
            super(0);
        }

        public Object invoke() {
            C39450f fVar;
            String str;
            String str2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2");
            if (BuildInfo.DEBUG) {
                SnsMethodCalculate.markStartTimeMs("getDebugConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig$Companion");
                fVar = new C39450f(true, 1, 86400, 1, 1, 50, 2, 1, 0);
                SnsMethodCalculate.markEndTimeMs("getDebugConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig$Companion");
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2";
            } else {
                SnsMethodCalculate.markStartTimeMs("getReleaseConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig$Companion");
                fVar = new C39450f(true, C38993b.m41991a(C32735h.C32737c.clicfg_timeline_unread_jump_min_interval_android, 3600), C38993b.m41991a(C32735h.C32737c.clicfg_timeline_unread_jump_max_interval_android, 86400), C38993b.m41991a(C32735h.C32737c.clicfg_timeline_unread_jump_min_feeds_android, 5), C38993b.m41991a(C32735h.C32737c.clicfg_timeline_unread_jump_min_skip_feeds_android, 10), C38993b.m41991a(C32735h.C32737c.clicfg_timeline_unread_jump_not_ws_percent_android, 0), C38993b.m41991a(C32735h.C32737c.clicfg_timeline_unread_jump_read_continuous_feeds_android, 2), Util.getInt(C117731d.m166007c().mo182444f("clicfg_timeline_unread_jump_indicator_index_offset_android", String.valueOf(1), false, true), 1), C38993b.m41991a(C32735h.C32737c.clicfg_timeline_unread_jump_indicator_expose_interval_android, 14400));
                SnsMethodCalculate.markEndTimeMs("getReleaseConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig$Companion");
                str = "invoke";
                str2 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$config$2";
            }
            SnsMethodCalculate.markEndTimeMs(str, str2);
            SnsMethodCalculate.markEndTimeMs(str, str2);
            return fVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$a */
    public static final class C95864a extends C87413o implements C32224a<TouchImageView> {

        /* renamed from: d */
        public final /* synthetic */ ImproveUnreadUIC f279771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95864a(ImproveUnreadUIC improveUnreadUIC) {
            super(0);
            this.f279771d = improveUnreadUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$avatarImg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$avatarImg$2");
            TouchImageView touchImageView = (TouchImageView) this.f279771d.findViewById(C0966R.C0970id.a27);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$avatarImg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$avatarImg$2");
            return touchImageView;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {356}, mo125471m = "calculateUnreadTier")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$b */
    public static final class C95865b extends C66704d {

        /* renamed from: d */
        public Object f279772d;

        /* renamed from: e */
        public Object f279773e;

        /* renamed from: f */
        public Object f279774f;

        /* renamed from: g */
        public int f279775g;

        /* renamed from: h */
        public /* synthetic */ Object f279776h;

        /* renamed from: i */
        public final /* synthetic */ ImproveUnreadUIC f279777i;

        /* renamed from: j */
        public int f279778j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95865b(ImproveUnreadUIC improveUnreadUIC, C15601d<? super C95865b> dVar) {
            super(dVar);
            this.f279777i = improveUnreadUIC;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$1");
            this.f279776h = obj;
            this.f279778j |= Integer.MIN_VALUE;
            ImproveUnreadUIC improveUnreadUIC = this.f279777i;
            SnsMethodCalculate.markStartTimeMs("access$calculateUnreadTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            Object f3 = improveUnreadUIC.mo133312f3(this);
            SnsMethodCalculate.markEndTimeMs("access$calculateUnreadTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$1");
            return f3;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$c */
    public static final class C95866c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveUnreadUIC f279779d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95866c(ImproveUnreadUIC improveUnreadUIC, C15601d<? super C95866c> dVar) {
            super(2, dVar);
            this.f279779d = improveUnreadUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            C95866c cVar = new C95866c(this.f279779d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            Object invokeSuspend = ((C95866c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            ResultKt.throwOnFailure(obj);
            ImproveUnreadUIC improveUnreadUIC = this.f279779d;
            SnsMethodCalculate.markStartTimeMs("access$getUnreadListener$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            ArrayList<Observer> arrayList = improveUnreadUIC.f279766i;
            SnsMethodCalculate.markEndTimeMs("access$getUnreadListener$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            ImproveUnreadUIC improveUnreadUIC2 = this.f279779d;
            Iterator<Observer> it = arrayList.iterator();
            while (it.hasNext()) {
                improveUnreadUIC2.getClass();
                SnsMethodCalculate.markStartTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
                C103081h hVar = improveUnreadUIC2.f279765h;
                SnsMethodCalculate.markEndTimeMs("getTier", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
                it.next().update((Observable) null, hVar);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$calculateUnreadTier$4");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {460}, mo125471m = "fillSnsInfo")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$e */
    public static final class C95867e extends C66704d {

        /* renamed from: d */
        public Object f279780d;

        /* renamed from: e */
        public Object f279781e;

        /* renamed from: f */
        public Object f279782f;

        /* renamed from: g */
        public int f279783g;

        /* renamed from: h */
        public /* synthetic */ Object f279784h;

        /* renamed from: i */
        public final /* synthetic */ ImproveUnreadUIC f279785i;

        /* renamed from: j */
        public int f279786j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95867e(ImproveUnreadUIC improveUnreadUIC, C15601d<? super C95867e> dVar) {
            super(dVar);
            this.f279785i = improveUnreadUIC;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$fillSnsInfo$1");
            this.f279784h = obj;
            this.f279786j |= Integer.MIN_VALUE;
            ImproveUnreadUIC improveUnreadUIC = this.f279785i;
            SnsMethodCalculate.markStartTimeMs("access$fillSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            Object i3 = improveUnreadUIC.mo133314i3((ArrayList<String>) null, this);
            SnsMethodCalculate.markEndTimeMs("access$fillSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$fillSnsInfo$1");
            return i3;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {285, 295, 308}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$f */
    public static final class C95868f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f279787d;

        /* renamed from: e */
        public Object f279788e;

        /* renamed from: f */
        public Object f279789f;

        /* renamed from: g */
        public Object f279790g;

        /* renamed from: h */
        public int f279791h;

        /* renamed from: i */
        public final /* synthetic */ C117747y f279792i;

        /* renamed from: j */
        public final /* synthetic */ ImproveUnreadUIC f279793j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95868f(C117747y yVar, ImproveUnreadUIC improveUnreadUIC, C15601d<? super C95868f> dVar) {
            super(2, dVar);
            this.f279792i = yVar;
            this.f279793j = improveUnreadUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1");
            C95868f fVar = new C95868f(this.f279792i, this.f279793j, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1");
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1");
            Object invokeSuspend = ((C95868f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1");
            return invokeSuspend;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x0136  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = "invokeSuspend"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onSceneEnd$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r0.f279791h
                java.lang.String r5 = "getIdList"
                r7 = 2
                r8 = 3
                java.lang.String r9 = "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail"
                r10 = 1
                java.lang.String r11 = "resp.object_list"
                java.lang.String r12 = "MicroMsg.Improve.UnreadUIC"
                if (r4 == 0) goto L_0x0049
                if (r4 == r10) goto L_0x0044
                if (r4 == r7) goto L_0x002e
                if (r4 != r8) goto L_0x0023
                goto L_0x0044
            L_0x0023:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                throw r3
            L_0x002e:
                java.lang.Object r4 = r0.f279790g
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r13 = r0.f279789f
                com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r13 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC) r13
                java.lang.Object r14 = r0.f279788e
                java.util.List r14 = (java.util.List) r14
                java.lang.Object r15 = r0.f279787d
                te3.jb r15 = (te3.C49969jb) r15
                kotlin.ResultKt.throwOnFailure(r18)
                r10 = r0
                goto L_0x016f
            L_0x0044:
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x01ec
            L_0x0049:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r13 = "onSceneEnd: type:"
                r4.append(r13)
                ob0.y r13 = r0.f279792i
                if (r13 == 0) goto L_0x0065
                int r13 = r13.getType()
                java.lang.Integer r14 = new java.lang.Integer
                r14.<init>(r13)
                goto L_0x0066
            L_0x0065:
                r14 = 0
            L_0x0066:
                r4.append(r14)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
                ob0.y r4 = r0.f279792i
                r13 = 0
                if (r4 == 0) goto L_0x007f
                int r4 = r4.getType()
                r14 = 211(0xd3, float:2.96E-43)
                if (r4 != r14) goto L_0x007f
                r4 = 1
                goto L_0x0080
            L_0x007f:
                r4 = 0
            L_0x0080:
                if (r4 == 0) goto L_0x00b0
                ob0.y r4 = r0.f279792i
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine"
                gy3.C87412m.m108592e(r4, r5)
                com.tencent.mm.plugin.sns.model.o0 r4 = (com.tencent.p014mm.plugin.sns.model.C94916o0) r4
                boolean r4 = r4.mo131165Z0()
                if (r4 == 0) goto L_0x01ec
                ob0.y r4 = r0.f279792i
                com.tencent.mm.plugin.sns.model.o0 r4 = (com.tencent.p014mm.plugin.sns.model.C94916o0) r4
                te3.u84 r4 = r4.mo131170k1()
                com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r5 = r0.f279793j
                java.util.LinkedList<java.lang.Long> r4 = r4.f299605v
                java.lang.String r6 = "resp.IdListForCheckUnread"
                gy3.C87412m.m108593f(r4, r6)
                r0.f279791h = r10
                java.lang.Object r4 = com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.m122726e3(r5, r4, r0)
                if (r4 != r3) goto L_0x01ec
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x00b0:
                ob0.y r4 = r0.f279792i
                if (r4 == 0) goto L_0x00bd
                int r4 = r4.getType()
                r14 = 5987(0x1763, float:8.39E-42)
                if (r4 != r14) goto L_0x00bd
                r13 = 1
            L_0x00bd:
                if (r13 == 0) goto L_0x01ec
                ob0.y r4 = r0.f279792i
                java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail"
                gy3.C87412m.m108592e(r4, r13)
                com.tencent.mm.plugin.sns.model.b0 r4 = (com.tencent.p014mm.plugin.sns.model.C43034b0) r4
                java.lang.String r13 = "getResp"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r9)
                te3.jb r4 = r4.f116490f
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r9)
                if (r4 != 0) goto L_0x00db
                rx3.b0 r3 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x00db:
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r13 = r4.f135975d
                gy3.C87412m.m108593f(r13, r11)
                java.util.ArrayList r14 = new java.util.ArrayList
                r15 = 10
                int r15 = sx3.C36907w.m41090l(r13, r15)
                r14.<init>(r15)
                java.util.Iterator r13 = r13.iterator()
            L_0x00ef:
                boolean r15 = r13.hasNext()
                if (r15 == 0) goto L_0x010b
                java.lang.Object r15 = r13.next()
                com.tencent.mm.protocal.protobuf.SnsObject r15 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r15
                r16 = r11
                long r10 = r15.f283891Id
                java.lang.Long r15 = new java.lang.Long
                r15.<init>(r10)
                r14.add(r15)
                r11 = r16
                r10 = 1
                goto L_0x00ef
            L_0x010b:
                r16 = r11
                ob0.y r10 = r0.f279792i
                com.tencent.mm.plugin.sns.model.b0 r10 = (com.tencent.p014mm.plugin.sns.model.C43034b0) r10
                r10.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)
                java.util.List<java.lang.Long> r10 = r10.f116491g
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
                java.lang.String r11 = "scene.idList"
                gy3.C87412m.m108593f(r10, r11)
                com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r11 = r0.f279793j
                java.util.Iterator r10 = r10.iterator()
                r15 = r4
                r4 = r10
                r13 = r11
                r11 = r16
                r10 = r0
            L_0x012e:
                boolean r16 = r4.hasNext()
                java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
                if (r16 == 0) goto L_0x0172
                java.lang.Object r16 = r4.next()
                r6 = r16
                java.lang.Long r6 = (java.lang.Long) r6
                boolean r16 = r14.contains(r6)
                if (r16 != 0) goto L_0x0170
                java.lang.String r7 = "it"
                gy3.C87412m.m108593f(r6, r7)
                long r6 = r6.longValue()
                java.lang.String r6 = vr2.C102236a0.m134765q0(r6)
                r10.f279787d = r15
                r10.f279788e = r14
                r10.f279789f = r13
                r10.f279790g = r4
                r7 = 2
                r10.f279791h = r7
                java.lang.String r7 = "access$markInvalidFeed"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
                java.lang.Object r6 = r13.mo133316k3(r6, r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                if (r6 != r3) goto L_0x016f
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x016f:
                r7 = 2
            L_0x0170:
                r8 = 3
                goto L_0x012e
            L_0x0172:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "batch req size:"
                r4.append(r6)
                ob0.y r6 = r10.f279792i
                com.tencent.mm.plugin.sns.model.b0 r6 = (com.tencent.p014mm.plugin.sns.model.C43034b0) r6
                r6.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)
                java.util.List<java.lang.Long> r6 = r6.f116491g
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)
                int r5 = r6.size()
                r4.append(r5)
                java.lang.String r5 = " resp size:"
                r4.append(r5)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r5 = r15.f135975d
                int r5 = r5.size()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r4 = r15.f135975d
                gy3.C87412m.m108593f(r4, r11)
                boolean r4 = r4.isEmpty()
                r5 = 1
                r4 = r4 ^ r5
                if (r4 == 0) goto L_0x01cc
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r4 = r15.f135975d
                java.lang.Object r5 = r4.getFirst()
                com.tencent.mm.protocal.protobuf.SnsObject r5 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r5
                long r5 = r5.f283891Id
                java.lang.String r5 = vr2.C102236a0.m134765q0(r5)
                java.lang.String r5 = vr2.C102236a0.m134705B(r5)
                java.lang.String r6 = "@__batch"
                r7 = 2
                com.tencent.p014mm.plugin.sns.model.C94897n1.m120370h(r6, r7, r4, r5)
            L_0x01cc:
                com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r4 = r10.f279793j
                r5 = 0
                r10.f279787d = r5
                r10.f279788e = r5
                r10.f279789f = r5
                r10.f279790g = r5
                r5 = 3
                r10.f279791h = r5
                java.lang.String r5 = "access$calculateUnreadTier"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
                java.lang.Object r4 = r4.mo133312f3(r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
                if (r4 != r3) goto L_0x01ec
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x01ec:
                rx3.b0 r3 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.C95868f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {203, 204}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$g */
    public static final class C95869g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f279794d;

        /* renamed from: e */
        public final /* synthetic */ ImproveUnreadUIC f279795e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView f279796f;

        /* renamed from: g */
        public final /* synthetic */ C102104r f279797g;

        /* renamed from: h */
        public final /* synthetic */ int f279798h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95869g(ImproveUnreadUIC improveUnreadUIC, RecyclerView recyclerView, C102104r rVar, int i, C15601d<? super C95869g> dVar) {
            super(2, dVar);
            this.f279795e = improveUnreadUIC;
            this.f279796f = recyclerView;
            this.f279797g = rVar;
            this.f279798h = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            C95869g gVar = new C95869g(this.f279795e, this.f279796f, this.f279797g, this.f279798h, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            Object invokeSuspend = ((C95869g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C13598b0 b0Var;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f279794d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ImproveUnreadUIC improveUnreadUIC = this.f279795e;
                RecyclerView recyclerView = this.f279796f;
                C102104r rVar = this.f279797g;
                int i2 = this.f279798h;
                this.f279794d = 1;
                if (ImproveUnreadUIC.m122725d3(improveUnreadUIC, recyclerView, rVar, i2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                C13598b0 b0Var2 = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
                return b0Var2;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
                throw illegalStateException;
            }
            ImproveUnreadUIC improveUnreadUIC2 = this.f279795e;
            C102104r rVar2 = this.f279797g;
            this.f279794d = 2;
            SnsMethodCalculate.markStartTimeMs("access$updateExposeFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            improveUnreadUIC2.getClass();
            SnsMethodCalculate.markStartTimeMs("updateExposeFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            rVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getFirstVisiblePosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            int i3 = rVar2.f300666a;
            SnsMethodCalculate.markEndTimeMs("getFirstVisiblePosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            SnsMethodCalculate.markStartTimeMs("getLastVisiblePosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            int i4 = rVar2.f300667b;
            SnsMethodCalculate.markEndTimeMs("getLastVisiblePosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveSnapshotStruct");
            Log.m105918d("MicroMsg.Improve.UnreadUIC", "----------feed expose range:" + i3 + '-' + i4);
            if (i3 < 0 || i4 < 0) {
                b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("updateExposeFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            } else {
                for (C65477j jVar : rVar2.mo141604a()) {
                    jVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("getPos", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                    Rect rect = jVar.f188431d;
                    SnsMethodCalculate.markEndTimeMs("getPos", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                    if (rect.top < improveUnreadUIC2.getScreenHeight() - improveUnreadUIC2.getNavigationBarHeight()) {
                        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                        C98799a aVar2 = jVar.f188429b;
                        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                        C98214b b = aVar2.mo138170b();
                        if (!improveUnreadUIC2.f279764g.containsKey(b.mo137504B2())) {
                            C103082i iVar = improveUnreadUIC2.f279764g;
                            String B2 = b.mo137504B2();
                            C103080g gVar = r14;
                            C103080g gVar2 = new C103080g(false, false, (C98214b) null, 6, (C8480h) null);
                            iVar.put(B2, gVar);
                        }
                        C103080g gVar3 = (C103080g) improveUnreadUIC2.f279764g.get(b.mo137504B2());
                        boolean z = false;
                        if (gVar3 != null && gVar3.mo142789a()) {
                            z = true;
                        }
                        if (!z) {
                            improveUnreadUIC2.f279768n.add(b.mo137504B2());
                        }
                        C103080g gVar4 = (C103080g) improveUnreadUIC2.f279764g.get(b.mo137504B2());
                        if (gVar4 != null) {
                            SnsMethodCalculate.markStartTimeMs("setExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                            gVar4.f304143a = true;
                            SnsMethodCalculate.markEndTimeMs("setExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                        }
                        Log.m105918d("MicroMsg.Improve.UnreadUIC", "feed expose:" + b.mo137504B2());
                    }
                }
                b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("updateExposeFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            }
            SnsMethodCalculate.markEndTimeMs("access$updateExposeFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            if (b0Var == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
                return aVar;
            }
            C13598b0 b0Var22 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$2");
            return b0Var22;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1", mo125469f = "ImproveUnreadUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$h */
    public static final class C95870h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ImproveUnreadUIC f279799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95870h(ImproveUnreadUIC improveUnreadUIC, C15601d<? super C95870h> dVar) {
            super(2, dVar);
            this.f279799d = improveUnreadUIC;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
            C95870h hVar = new C95870h(this.f279799d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
            Object invokeSuspend = ((C95870h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            long j;
            String str3 = "invokeSuspend";
            String str4 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onStop$1";
            SnsMethodCalculate.markStartTimeMs(str3, str4);
            ResultKt.throwOnFailure(obj);
            ImproveUnreadUIC improveUnreadUIC = this.f279799d;
            SnsMethodCalculate.markStartTimeMs("access$saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            improveUnreadUIC.getClass();
            SnsMethodCalculate.markStartTimeMs("saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            Log.m105924i("MicroMsg.Improve.UnreadUIC", "saveUnreadInfo");
            SnsUnreadSaveList snsUnreadSaveList = new SnsUnreadSaveList((ArrayList) null, 1, (C8480h) null);
            long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            C39450f j3 = improveUnreadUIC.mo133315j3();
            j3.getClass();
            SnsMethodCalculate.markStartTimeMs("getJumpMaxInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            long j2 = j3.f105958c;
            SnsMethodCalculate.markEndTimeMs("getJumpMaxInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
            long j4 = currentTimeMillis - j2;
            Iterator<Map.Entry<String, C103080g>> it = improveUnreadUIC.f279764g.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = str3;
                    str2 = str4;
                    break;
                }
                Map.Entry next = it.next();
                String str5 = (String) next.getKey();
                C103080g gVar = (C103080g) next.getValue();
                C98214b c = gVar.mo142791c();
                if (c != null) {
                    int createTime = c.getCreateTime();
                    str = str3;
                    str2 = str4;
                    j = (long) createTime;
                } else {
                    str = str3;
                    str2 = str4;
                    j = 1 + j4;
                }
                if (j < j4) {
                    break;
                }
                Log.m105924i("MicroMsg.Improve.UnreadUIC", "add valid feed:" + str5 + " indicator:" + gVar.mo142790b());
                SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
                ArrayList<SnsUnreadSaveItem> arrayList = snsUnreadSaveList.f279803d;
                SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
                arrayList.add(new SnsUnreadSaveItem(str5, gVar.mo142789a(), gVar.mo142790b()));
                str3 = str;
                str4 = str2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("feedMap size:");
            SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            ArrayList<SnsUnreadSaveItem> arrayList2 = snsUnreadSaveList.f279803d;
            SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadSaveList");
            sb.append(arrayList2.size());
            Log.m105924i("MicroMsg.Improve.UnreadUIC", sb.toString());
            improveUnreadUIC.f279761d.encode("Key-Unread-Sns-Id", (Parcelable) snsUnreadSaveList);
            SnsMethodCalculate.markEndTimeMs("saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            SnsMethodCalculate.markEndTimeMs("access$saveUnreadInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs(str, str2);
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveUnreadUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final /* synthetic */ C103082i m122724c3(ImproveUnreadUIC improveUnreadUIC) {
        SnsMethodCalculate.markStartTimeMs("access$getFeedMap$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C103082i iVar = improveUnreadUIC.f279764g;
        SnsMethodCalculate.markEndTimeMs("access$getFeedMap$p", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return iVar;
    }

    /* renamed from: d3 */
    public static final /* synthetic */ Object m122725d3(ImproveUnreadUIC improveUnreadUIC, RecyclerView recyclerView, C102104r rVar, int i, C15601d dVar) {
        SnsMethodCalculate.markStartTimeMs("access$onScrollStateChanged$s1724030215", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        Object onScrollStateChanged = super.onScrollStateChanged(recyclerView, rVar, i, dVar);
        SnsMethodCalculate.markEndTimeMs("access$onScrollStateChanged$s1724030215", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return onScrollStateChanged;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m122726e3(com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC r18, java.util.LinkedList r19, wx3.C15601d r20) {
        /*
            r0 = r18
            r1 = r20
            java.lang.String r2 = "access$updateUnReadList"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r18.getClass()
            java.lang.String r4 = "updateUnReadList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            boolean r5 = r1 instanceof zt2.C103079e
            if (r5 == 0) goto L_0x0027
            r5 = r1
            zt2.e r5 = (zt2.C103079e) r5
            int r6 = r5.f304142h
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0027
            int r6 = r6 - r7
            r5.f304142h = r6
            goto L_0x002c
        L_0x0027:
            zt2.e r5 = new zt2.e
            r5.<init>(r0, r1)
        L_0x002c:
            java.lang.Object r1 = r5.f304140f
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f304142h
            java.lang.String r8 = "MicroMsg.Improve.UnreadUIC"
            r9 = 0
            r10 = 1
            if (r7 == 0) goto L_0x0054
            if (r7 != r10) goto L_0x0049
            java.lang.Object r0 = r5.f304139e
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r5 = r5.f304138d
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r5 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC) r5
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r0
            r0 = r5
            goto L_0x00c9
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            throw r0
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r1)
            boolean r1 = r19.isEmpty()
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x009d
            zt2.i r1 = r0.f279764g
            java.util.Map$Entry r1 = r1.firstEntry()
            if (r1 == 0) goto L_0x006d
            java.lang.Object r7 = r1.getValue()
            zt2.g r7 = (zt2.C103080g) r7
            goto L_0x006e
        L_0x006d:
            r7 = r9
        L_0x006e:
            if (r7 != 0) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            java.lang.String r11 = "setIndicator"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            r7.f304144b = r10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
        L_0x007e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "updateUnReadList mark indicator:"
            r7.append(r11)
            if (r1 == 0) goto L_0x0092
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0093
        L_0x0092:
            r1 = r9
        L_0x0093:
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
        L_0x009d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "updateUnReadList size:"
            r1.append(r7)
            int r7 = r19.size()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            r5.f304138d = r0
            r1 = r19
            r5.f304139e = r1
            r5.f304142h = r10
            java.lang.Object r5 = r0.mo133312f3(r5)
            if (r5 != r6) goto L_0x00c9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0144
        L_0x00c9:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x00db
            java.lang.String r0 = "no new unread feed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0144
        L_0x00db:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 0
            java.util.Iterator r1 = r1.iterator()
        L_0x00e5:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x012b
            java.lang.Object r7 = r1.next()
            int r10 = r6 + 1
            if (r6 < 0) goto L_0x0127
            java.lang.Number r7 = (java.lang.Number) r7
            long r6 = r7.longValue()
            java.lang.String r6 = vr2.C102236a0.m134765q0(r6)
            r5.append(r6)
            java.lang.String r7 = ","
            r5.append(r7)
            zt2.i r7 = r0.f279764g
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto L_0x0125
            zt2.i r7 = r0.f279764g
            java.lang.String r11 = "snsId"
            gy3.C87412m.m108593f(r6, r11)
            zt2.g r11 = new zt2.g
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            r7.put(r6, r11)
        L_0x0125:
            r6 = r10
            goto L_0x00e5
        L_0x0127:
            sx3.C64197v.m75542k()
            throw r9
        L_0x012b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add unReadList from server:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
        L_0x0144:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.m122726e3(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC, java.util.LinkedList, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0456, code lost:
        if ((r10.mo74530c()) != false) goto L_0x0458;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo133312f3(wx3.C15601d<? super rx3.C13598b0> r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "calculateUnreadTier"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.C95865b
            if (r4 == 0) goto L_0x001e
            r4 = r1
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$b r4 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.C95865b) r4
            int r5 = r4.f279778j
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f279778j = r5
            goto L_0x0023
        L_0x001e:
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$b r4 = new com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$b
            r4.<init>(r0, r1)
        L_0x0023:
            java.lang.Object r1 = r4.f279776h
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f279778j
            java.lang.String r7 = "MicroMsg.Improve.UnreadUIC"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig"
            r10 = 1
            if (r6 == 0) goto L_0x0057
            if (r6 != r10) goto L_0x004c
            int r6 = r4.f279775g
            java.lang.Object r11 = r4.f279774f
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r4.f279773e
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r4.f279772d
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r13 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC) r13
            kotlin.ResultKt.throwOnFailure(r1)
            r9 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
            goto L_0x0133
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r1
        L_0x0057:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "calculateUnreadTier size:"
            r1.append(r6)
            zt2.i r6 = r0.f279764g
            int r6 = r6.size()
            r1.append(r6)
            java.lang.String r6 = " enable:"
            r1.append(r6)
            boolean r6 = r24.mo133313g3()
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            boolean r1 = r24.mo133313g3()
            if (r1 == 0) goto L_0x052a
            zt2.f r1 = r24.mo133315j3()
            r1.getClass()
            java.lang.String r6 = "getJumpEnable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            boolean r1 = r1.f105956a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
            if (r1 != 0) goto L_0x009b
            goto L_0x052a
        L_0x009b:
            java.util.ArrayList<java.lang.String> r1 = r0.f279767j
            java.util.Iterator r1 = r1.iterator()
        L_0x00a1:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00b3
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            zt2.i r11 = r0.f279764g
            r11.remove(r6)
            goto L_0x00a1
        L_0x00b3:
            java.util.ArrayList<java.lang.String> r1 = r0.f279767j
            r1.clear()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6 = -1
            zt2.i r11 = r0.f279764g
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r13 = r0
            r12 = r1
            r1 = r8
        L_0x00cb:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0521
            int r6 = r6 + r10
            java.lang.Object r14 = r11.next()
            java.lang.String r15 = "iterator.next()"
            gy3.C87412m.m108593f(r14, r15)
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getValue()
            zt2.g r15 = (zt2.C103080g) r15
            boolean r15 = r15.mo142789a()
            if (r15 != 0) goto L_0x00f1
            java.lang.Object r15 = r14.getKey()
            r12.add(r15)
        L_0x00f1:
            int r15 = r12.size()
            r9 = 10
            if (r15 >= r9) goto L_0x010e
            java.lang.Object r9 = r14.getValue()
            zt2.g r9 = (zt2.C103080g) r9
            boolean r9 = r9.mo142789a()
            if (r9 != 0) goto L_0x010e
            zt2.i r9 = r13.f279764g
            int r9 = r9.size()
            int r9 = r9 - r10
            if (r6 < r9) goto L_0x051b
        L_0x010e:
            int r9 = r12.size()
            if (r9 == 0) goto L_0x051b
            r4.f279772d = r13
            r4.f279773e = r12
            r4.f279774f = r11
            r4.f279775g = r6
            r4.f279778j = r10
            java.lang.Object r9 = r13.mo133314i3(r12, r4)
            if (r9 != r5) goto L_0x0128
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L_0x0128:
            r23 = r2
            r2 = r1
            r1 = r9
            r9 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r23
        L_0x0133:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r14 = ","
            if (r1 != 0) goto L_0x01ba
            r13.getClass()
            java.lang.String r1 = "doNetRequestBatch"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L_0x0153:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0183
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            zt2.i r8 = r13.f279764g
            java.lang.Object r8 = r8.get(r7)
            zt2.g r8 = (zt2.C103080g) r8
            if (r8 == 0) goto L_0x016e
            gu2.b r8 = r8.mo142791c()
            goto L_0x016f
        L_0x016e:
            r8 = 0
        L_0x016f:
            if (r8 != 0) goto L_0x0153
            r5.append(r7)
            r5.append(r14)
            long r7 = vr2.C102236a0.m134706B0(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2.add(r7)
            goto L_0x0153
        L_0x0183:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "do net request,size:"
            r6.append(r7)
            int r7 = r2.size()
            r6.append(r7)
            java.lang.String r7 = " list:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            com.tencent.mm.plugin.sns.model.b0 r6 = new com.tencent.mm.plugin.sns.model.b0
            r6.<init>(r2)
            r5.mo123460f(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r1
        L_0x01ba:
            r13.getClass()
            java.lang.String r1 = "checkTierEnable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r4)
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L_0x01d1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            r20 = r5
            r21 = r6
            goto L_0x028e
        L_0x01d1:
            zt2.i r15 = r13.f279764g
            java.lang.Object r10 = sx3.C110818d0.m150914L(r12)
            java.lang.Object r10 = r15.get(r10)
            zt2.g r10 = (zt2.C103080g) r10
            if (r10 == 0) goto L_0x01e4
            gu2.b r10 = r10.mo142791c()
            goto L_0x01e5
        L_0x01e4:
            r10 = 0
        L_0x01e5:
            java.lang.String r15 = "calculateWSPercent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
            java.util.Iterator r18 = r12.iterator()
            r19 = 0
        L_0x01f0:
            boolean r20 = r18.hasNext()
            if (r20 == 0) goto L_0x0237
            java.lang.Object r20 = r18.next()
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            r20 = r5
            zt2.i r5 = r13.f279764g
            java.lang.Object r0 = r5.get(r0)
            zt2.g r0 = (zt2.C103080g) r0
            if (r0 == 0) goto L_0x022e
            gu2.b r0 = r0.mo142791c()
            if (r0 != 0) goto L_0x0211
            goto L_0x022e
        L_0x0211:
            java.lang.String r5 = "isWsFold"
            r21 = r6
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            int r0 = r0.getLocalFlag()
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 <= 0) goto L_0x0225
            r0 = 1
            goto L_0x0226
        L_0x0225:
            r0 = 0
        L_0x0226:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            if (r0 == 0) goto L_0x0230
            int r19 = r19 + 1
            goto L_0x0230
        L_0x022e:
            r21 = r6
        L_0x0230:
            r0 = r24
            r5 = r20
            r6 = r21
            goto L_0x01f0
        L_0x0237:
            r20 = r5
            r21 = r6
            int r19 = r19 * 100
            int r0 = r12.size()
            int r0 = r19 / r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "tier size:"
            r5.append(r6)
            int r6 = r12.size()
            r5.append(r6)
            java.lang.String r6 = " index:"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " wsPercent:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " time:"
            r5.append(r6)
            if (r10 == 0) goto L_0x0278
            int r6 = r10.getCreateTime()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0279
        L_0x0278:
            r6 = 0
        L_0x0279:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            if (r10 != 0) goto L_0x0294
            java.lang.String r0 = "tier not match for null info"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
        L_0x028e:
            r18 = r7
            r19 = r14
            goto L_0x03a5
        L_0x0294:
            int r5 = r12.size()
            long r5 = (long) r5
            zt2.f r15 = r13.mo133315j3()
            r15.getClass()
            r18 = r7
            java.lang.String r7 = "getJumpMinFeedsCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            r19 = r14
            long r14 = r15.f105959d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            int r22 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r22 >= 0) goto L_0x02db
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "tier not match for size limit:"
            r0.append(r5)
            zt2.f r5 = r13.mo133315j3()
            r5.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            long r5 = r5.f105959d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x03a5
        L_0x02db:
            zt2.f r5 = r13.mo133315j3()
            r5.getClass()
            java.lang.String r6 = "getJumpMinInterval"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r2)
            long r14 = r5.f105957b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
            int r5 = r10.getCreateTime()
            long r5 = (long) r5
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x039c
            zt2.f r5 = r13.mo133315j3()
            r5.getClass()
            java.lang.String r6 = "getJumpMaxInterval"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            long r14 = r5.f105958c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
            int r5 = r10.getCreateTime()
            long r5 = (long) r5
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r5)
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0319
            goto L_0x039c
        L_0x0319:
            java.lang.Object r5 = sx3.C110818d0.m150914L(r12)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "calculateFeedsGapCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            com.tencent.mm.plugin.sns.model.y1 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            long r14 = r7.f275370y
            os2.e0 r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r10 = vr2.C102236a0.m134763p0(r14)
            int r5 = r7.mo139809TY(r10, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            long r5 = (long) r5
            zt2.f r7 = r13.mo133315j3()
            r7.getClass()
            java.lang.String r10 = "getJumpMinFeedsGapCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            long r14 = r7.f105960e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            int r7 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x0377
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "tier not match for gap count:"
            r0.append(r5)
            zt2.f r5 = r13.mo133315j3()
            r5.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            long r5 = r5.f105960e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x03a5
        L_0x0377:
            long r5 = (long) r0
            zt2.f r0 = r13.mo133315j3()
            r0.getClass()
            java.lang.String r7 = "getJumpNotWsPercent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            long r14 = r0.f105961f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0397
            java.lang.String r0 = "tier not match for wsPercent"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            goto L_0x03a5
        L_0x0397:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            r0 = 1
            goto L_0x03a6
        L_0x039c:
            java.lang.String r0 = "tier not match for time error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
        L_0x03a5:
            r0 = 0
        L_0x03a6:
            if (r0 == 0) goto L_0x0506
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r12.iterator()
        L_0x03b1:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x03c6
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            r5 = r19
            r0.append(r5)
            goto L_0x03b1
        L_0x03c6:
            zt2.i r1 = r13.f279764g
            java.util.Set r1 = r1.keySet()
            java.lang.String r5 = "feedMap.keys"
            gy3.C87412m.m108593f(r1, r5)
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.Object[] r1 = r1.toArray(r6)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r1, r6)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r6 = sx3.C110818d0.m150914L(r12)
            int r6 = sx3.C110823p.m150984J(r1, r6)
            r7 = 0
        L_0x03e9:
            if (r7 >= r6) goto L_0x0421
            zt2.i r10 = r13.f279764g
            r14 = r1[r7]
            java.lang.Object r10 = r10.get(r14)
            zt2.g r10 = (zt2.C103080g) r10
            if (r10 == 0) goto L_0x0400
            boolean r10 = r10.mo142790b()
            r14 = 1
            if (r10 != r14) goto L_0x0400
            r14 = 1
            goto L_0x0401
        L_0x0400:
            r14 = 0
        L_0x0401:
            if (r14 == 0) goto L_0x041e
            zt2.f r10 = r13.mo133315j3()
            r10.getClass()
            java.lang.String r14 = "getJumpIndicatorIndexOffset"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r2)
            int r10 = r10.f105963h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r2)
            int r7 = r7 + r10
            r1 = r1[r7]
            java.lang.String r7 = "keyArray[j + config.jumpIndicatorIndexOffset]"
            gy3.C87412m.m108593f(r1, r7)
            goto L_0x0423
        L_0x041e:
            int r7 = r7 + 1
            goto L_0x03e9
        L_0x0421:
            java.lang.String r1 = ""
        L_0x0423:
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 != 0) goto L_0x04fe
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r7 = r13.getActivity()
            bl3.r$a r2 = r2.mo62444c(r7)
            java.lang.Class<vt2.c> r7 = vt2.C102279c.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r7)
            vt2.c r2 = (vt2.C102279c) r2
            int r6 = r6 + 5
            r2.getClass()
            java.lang.String r7 = "loadMoreFromDB"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            a14.z1 r10 = r2.f301250i
            if (r10 == 0) goto L_0x0458
            boolean r10 = r10.mo74530c()
            r14 = 1
            if (r10 != r14) goto L_0x0455
            r10 = 1
            goto L_0x0456
        L_0x0455:
            r10 = 0
        L_0x0456:
            if (r10 == 0) goto L_0x0472
        L_0x0458:
            b14.b r18 = r2.getDispatcher()
            r19 = 0
            vt2.e r10 = new vt2.e
            r11 = 0
            r10.<init>(r2, r6, r11)
            r21 = 2
            r22 = 0
            r17 = r2
            r20 = r10
            a14.z1 r6 = bl3.C0317e.launch$default(r17, r18, r19, r20, r21, r22)
            r2.f301250i = r6
        L_0x0472:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r6 = r12.size()
            r7 = 3
            int r6 = java.lang.Math.min(r6, r7)
            r10 = 0
        L_0x0484:
            if (r10 >= r6) goto L_0x04b5
            zt2.i r5 = r13.f279764g
            java.lang.Object r7 = r12.get(r10)
            java.lang.Object r5 = r5.get(r7)
            zt2.g r5 = (zt2.C103080g) r5
            if (r5 == 0) goto L_0x049f
            gu2.b r5 = r5.mo142791c()
            if (r5 == 0) goto L_0x049f
            java.lang.String r5 = r5.getUserName()
            goto L_0x04a0
        L_0x049f:
            r5 = 0
        L_0x04a0:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x04b2
            boolean r7 = sx3.C110818d0.m150903D(r2, r5)
            if (r7 != 0) goto L_0x04b2
            gy3.C87412m.m108591d(r5)
            r2.add(r5)
        L_0x04b2:
            int r10 = r10 + 1
            goto L_0x0484
        L_0x04b5:
            zt2.h r5 = new zt2.h
            r5.<init>(r1, r12, r2)
            r13.f279765h = r5
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r14 = f14.C58901s.f168555a
            r15 = 0
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$c r2 = new com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$c
            r5 = 0
            r2.<init>(r13, r5)
            r17 = 2
            r18 = 0
            r16 = r2
            bl3.C0317e.launch$default(r13, r14, r15, r16, r17, r18)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "find unread indicator:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r1 = " size:"
            r2.append(r1)
            int r1 = r12.size()
            r2.append(r1)
            java.lang.String r1 = " str:"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r0
        L_0x04fe:
            r14 = 1
            java.lang.String r0 = "not find valid indicator"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x0507
        L_0x0506:
            r14 = 1
        L_0x0507:
            java.lang.String r0 = "tier not match ruler,clear."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            r12.clear()
            r1 = r2
            r2 = r3
            r3 = r4
            r7 = r9
            r6 = r18
            r4 = r20
            r5 = r21
            goto L_0x051c
        L_0x051b:
            r14 = 1
        L_0x051c:
            r0 = r24
            r10 = 1
            goto L_0x00cb
        L_0x0521:
            r0 = 0
            r13.f279765h = r0
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r0
        L_0x052a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.mo133312f3(wx3.d):java.lang.Object");
    }

    /* renamed from: g3 */
    public final boolean mo133313g3() {
        SnsMethodCalculate.markStartTimeMs("exposeIntervalEnable", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        long currentTimeMillis = (System.currentTimeMillis() / ((long) 1000)) - this.f279761d.decodeLong("Key-Unread-Expose", 0);
        C39450f j3 = mo133315j3();
        j3.getClass();
        SnsMethodCalculate.markStartTimeMs("getJumpIndicatorExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        long j = j3.f105964i;
        SnsMethodCalculate.markEndTimeMs("getJumpIndicatorExposeInterval", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnReadConfig");
        boolean z = currentTimeMillis >= j;
        SnsMethodCalculate.markEndTimeMs("exposeIntervalEnable", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0107 A[LOOP:1: B:46:0x0101->B:48:0x0107, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo133314i3(java.util.ArrayList<java.lang.String> r13, wx3.C15601d<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "fillSnsInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r0 = r14 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.C95867e
            if (r0 == 0) goto L_0x001a
            r0 = r14
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$e r0 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.C95867e) r0
            int r1 = r0.f279786j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x001a
            int r1 = r1 - r2
            r0.f279786j = r1
            goto L_0x001f
        L_0x001a:
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$e r0 = new com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$e
            r0.<init>(r12, r14)
        L_0x001f:
            java.lang.Object r14 = r0.f279784h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f279786j
            r3 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 != r3) goto L_0x003e
            int r13 = r0.f279783g
            java.lang.Object r2 = r0.f279782f
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f279781e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r5 = r0.f279780d
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC r5 = (com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC) r5
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r13
            r13 = r4
            goto L_0x0057
        L_0x003e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            java.lang.String r14 = "fillSnsInfo"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r0)
            throw r13
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r14)
            java.util.Iterator r14 = r13.iterator()
            r5 = r12
            r2 = r14
            r14 = 1
        L_0x0057:
            boolean r4 = r2.hasNext()
            r6 = 0
            if (r4 == 0) goto L_0x00fb
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            zt2.i r7 = r5.f279764g
            java.lang.Object r7 = r7.get(r4)
            zt2.g r7 = (zt2.C103080g) r7
            if (r7 == 0) goto L_0x0073
            gu2.b r7 = r7.mo142791c()
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            if (r7 != 0) goto L_0x0057
            java.lang.Class<iu2.e> r7 = iu2.C60631e.class
            byte[] r8 = i40.C60247c.f171776h
            monitor-enter(r8)
            f40.e r9 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00f8 }
            r9.mo121108c()     // Catch:{ all -> 0x00f8 }
            java.lang.Class<i40.c> r9 = i40.C60247c.class
            boolean r9 = r9.isAssignableFrom(r7)     // Catch:{ all -> 0x00f8 }
            if (r9 == 0) goto L_0x00f0
            androidx.lifecycle.k0 r9 = new androidx.lifecycle.k0     // Catch:{ all -> 0x00f8 }
            f40.e r10 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x00f8 }
            f40.a r10 = r10.f251755f     // Catch:{ all -> 0x00f8 }
            i40.c$a$a r11 = new i40.c$a$a     // Catch:{ all -> 0x00f8 }
            r11.<init>()     // Catch:{ all -> 0x00f8 }
            r9.<init>((androidx.lifecycle.C0123n0) r10, (androidx.lifecycle.C54209k0.C54210b) r11)     // Catch:{ all -> 0x00f8 }
            androidx.lifecycle.i0 r7 = r9.mo75002a(r7)     // Catch:{ all -> 0x00f8 }
            monitor-exit(r8)
            iu2.e r7 = (iu2.C60631e) r7
            java.lang.Class<iu2.d> r8 = iu2.C98802d.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r7 = r7.mo85233d3(r8)
            iu2.d r7 = (iu2.C98802d) r7
            long r8 = vr2.C102236a0.m134706B0(r4)
            gu2.b r7 = r7.mo138173c3(r8)
            if (r7 != 0) goto L_0x00b5
            r14 = 0
            goto L_0x00d5
        L_0x00b5:
            int r6 = r7.getSourceType()
            r6 = r6 & 2
            if (r6 != 0) goto L_0x00d5
            r0.f279780d = r5
            r0.f279781e = r13
            r0.f279782f = r2
            r0.f279783g = r14
            r0.f279786j = r3
            java.lang.Object r4 = r5.mo133316k3(r4, r0)
            if (r4 != r1) goto L_0x0057
            java.lang.String r13 = "fillSnsInfo"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r1
        L_0x00d5:
            zt2.i r6 = r5.f279764g
            java.lang.Object r4 = r6.get(r4)
            zt2.g r4 = (zt2.C103080g) r4
            if (r4 != 0) goto L_0x00e1
            goto L_0x0057
        L_0x00e1:
            java.lang.String r6 = "setInfo"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            r4.f304145c = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
            goto L_0x0057
        L_0x00f0:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00f8 }
            java.lang.String r14 = "getLiveDB modelClass must extends BaseMvvmDB"
            r13.<init>(r14)     // Catch:{ all -> 0x00f8 }
            throw r13     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r13 = move-exception
            monitor-exit(r8)
            throw r13
        L_0x00fb:
            java.util.ArrayList<java.lang.String> r0 = r5.f279767j
            java.util.Iterator r0 = r0.iterator()
        L_0x0101:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0111
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r13.remove(r1)
            goto L_0x0101
        L_0x0111:
            if (r14 == 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r3 = 0
        L_0x0115:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            java.lang.String r14 = "fillSnsInfo"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC.mo133314i3(java.util.ArrayList, wx3.d):java.lang.Object");
    }

    /* renamed from: j3 */
    public final C39450f mo133315j3() {
        SnsMethodCalculate.markStartTimeMs("getConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C39450f fVar = (C39450f) ((C36570n) this.f279762e).getValue();
        SnsMethodCalculate.markEndTimeMs("getConfig", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return fVar;
    }

    /* renamed from: k3 */
    public final Object mo133316k3(String str, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("markInvalidFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        if (str == null) {
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("markInvalidFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            return b0Var;
        }
        C103080g gVar = (C103080g) this.f279764g.get(str);
        if (gVar != null && gVar.mo142790b()) {
            Set<String> keySet = this.f279764g.keySet();
            C87412m.m108593f(keySet, "feedMap.keys");
            Object[] array = keySet.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            int J = C110823p.m150984J(strArr, str);
            if (J >= 1) {
                String str2 = strArr[J - 1];
                C87412m.m108593f(str2, "keyArray[index - 1]");
                C103080g gVar2 = (C103080g) this.f279764g.get(str2);
                if (gVar2 != null) {
                    SnsMethodCalculate.markStartTimeMs("setIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                    gVar2.f304144b = true;
                    SnsMethodCalculate.markEndTimeMs("setIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
                }
                Log.m105924i("MicroMsg.Improve.UnreadUIC", "removeInvalidFeed and remark indicator id:" + str2);
            }
        }
        this.f279767j.add(str);
        Log.m105924i("MicroMsg.Improve.UnreadUIC", "removeInvalidFeed id:" + str);
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("markInvalidFeed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return b0Var2;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.Improve.UnreadUIC", "unread config:" + mo133315j3());
        f279760q = this;
        this.f279770p.alive();
        SnsMethodCalculate.markStartTimeMs("setDebugPrintInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = false;
        if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_FEED_NEW_SHOW_DEBUG_INT_SYNC, 0) == 1) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z) {
            SnsMethodCalculate.markStartTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            Object value = ((C36570n) this.f279763f).getValue();
            C87412m.m108593f(value, "<get-avatarImg>(...)");
            SnsMethodCalculate.markEndTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            ((TouchImageView) value).setOnLongClickListener(new C103078d(this));
        }
        SnsMethodCalculate.markEndTimeMs("setDebugPrintInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        SnsMethodCalculate.markStartTimeMs("restoreData", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C0317e.launch$default(this, getDispatcher(), (C53934p0) null, new C103077c(this, (C15601d<? super C103077c>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("restoreData", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C86709a0.m107529k().f251779b.mo123455a(211, this);
        C86709a0.m107529k().f251779b.mo123455a(5987, this);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        super.onDestroy();
        f279760q = null;
        this.f279770p.dead();
        C86709a0.m107529k().f251779b.mo123470p(211, this);
        C86709a0.m107529k().f251779b.mo123470p(5987, this);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        C0317e.launch$default(this, getDispatcher(), (C53934p0) null, new C95868f(yVar, this, (C15601d<? super C95868f>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }

    public Object onScrollStateChanged(RecyclerView recyclerView, C102104r rVar, int i, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        Object g = C53895h.m60469g(getDispatcher(), new C95869g(this, recyclerView, rVar, i, (C15601d<? super C95869g>) null), dVar);
        if (g == C15911a.COROUTINE_SUSPENDED) {
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            return g;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        return b0Var;
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
        super.onStop();
        C0317e.launch$default(this, getDispatcher(), (C53934p0) null, new C95870h(this, (C15601d<? super C95870h>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
    }
}
