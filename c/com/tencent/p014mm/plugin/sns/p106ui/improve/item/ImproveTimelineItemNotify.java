package com.tencent.p014mm.plugin.sns.p106ui.improve.item;

import android.content.Context;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateStartEvent;
import com.tencent.p014mm.autogen.events.SnsUnTranslateEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.storage.C72996z1;
import fu2.C98041z;
import gu2.C98214b;
import gy3.C87412m;
import iu2.C98799a;
import jq3.C60905o;
import rx3.C13598b0;
import sx3.C64197v;
import te3.w64;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify */
public abstract class ImproveTimelineItemNotify extends C98041z {

    /* renamed from: V0 */
    public static final /* synthetic */ int f279817V0 = 0;

    /* renamed from: R0 */
    public final IListener<SnsTranslateStartEvent> f279818R0 = new ImproveTimelineItemNotify$translateStartListener$1(this, getLifecycleOwner());

    /* renamed from: S0 */
    public final IListener<SnsTranslateFinishEvent> f279819S0 = new ImproveTimelineItemNotify$translateFinishListener$1(this, getLifecycleOwner());

    /* renamed from: T0 */
    public final IListener<SnsUnTranslateEvent> f279820T0 = new ImproveTimelineItemNotify$unTranslateListener$1(this, getLifecycleOwner());

    /* renamed from: U0 */
    public final C95876a f279821U0 = new C95876a(this);

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$a */
    public static final class C95876a implements IStorageObserver<C72996z1> {

        /* renamed from: d */
        public final /* synthetic */ ImproveTimelineItemNotify f279822d;

        public C95876a(ImproveTimelineItemNotify improveTimelineItemNotify) {
            this.f279822d = improveTimelineItemNotify;
        }

        public void onChanged(Object obj) {
            C98214b b;
            String userName;
            SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$contactObserver$1");
            StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
            SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$contactObserver$1");
            C87412m.m108594g(storageObserverEvent, "event");
            C72996z1 z1Var = (C72996z1) storageObserverEvent.getObj();
            if (z1Var != null) {
                ImproveTimelineItemNotify improveTimelineItemNotify = this.f279822d;
                C98799a data = improveTimelineItemNotify.getData();
                boolean z = false;
                if (!(data == null || (b = data.mo138170b()) == null || (userName = b.getUserName()) == null || z1Var.getUsername().hashCode() != userName.hashCode())) {
                    z = true;
                }
                if (z && z1Var.mo62898f().hashCode() != improveTimelineItemNotify.getNickNameText().getText().hashCode()) {
                    improveTimelineItemNotify.mo137055z("MicroMsg.Improve.Notify", "contactObserver: refresh nickname old:" + improveTimelineItemNotify.getNickNameText().getText() + ", new:" + z1Var.mo62898f());
                    improveTimelineItemNotify.mo137052w();
                }
            }
            SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$contactObserver$1");
            SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$contactObserver$1");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify", mo125469f = "ImproveTimelineItemNotify.kt", mo125470l = {84}, mo125471m = "onBindViewHolder$suspendImpl")
    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$b */
    public static final class C95877b extends C66704d {

        /* renamed from: d */
        public Object f279823d;

        /* renamed from: e */
        public /* synthetic */ Object f279824e;

        /* renamed from: f */
        public final /* synthetic */ ImproveTimelineItemNotify f279825f;

        /* renamed from: g */
        public int f279826g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95877b(ImproveTimelineItemNotify improveTimelineItemNotify, C15601d<? super C95877b> dVar) {
            super(dVar);
            this.f279825f = improveTimelineItemNotify;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$onBindViewHolder$1");
            this.f279824e = obj;
            this.f279826g |= Integer.MIN_VALUE;
            Object O = ImproveTimelineItemNotify.m122740O(this.f279825f, (C60905o) null, (C98799a) null, 0, false, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$onBindViewHolder$1");
            return O;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveTimelineItemNotify(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m122740O(com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify r9, jq3.C60905o r10, iu2.C98799a r11, int r12, boolean r13, wx3.C15601d r14) {
        /*
            java.lang.String r0 = "onBindViewHolder$suspendImpl"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r14 instanceof com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify.C95877b
            if (r2 == 0) goto L_0x001b
            r2 = r14
            com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$b r2 = (com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify.C95877b) r2
            int r3 = r2.f279826g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f279826g = r3
            goto L_0x0020
        L_0x001b:
            com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$b r2 = new com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$b
            r2.<init>(r9, r14)
        L_0x0020:
            r8 = r2
            java.lang.Object r14 = r8.f279824e
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r8.f279826g
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0034
            java.lang.Object r9 = r8.f279823d
            com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify r9 = (com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify) r9
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0055
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r14)
            r8.f279823d = r9
            r8.f279826g = r4
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r10 = super.mo81006g(r4, r5, r6, r7, r8)
            if (r10 != r2) goto L_0x0055
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0055:
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent> r10 = r9.f279818R0
            r10.alive()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent> r10 = r9.f279819S0
            r10.alive()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent> r10 = r9.f279820T0
            r10.alive()
            androidx.lifecycle.s r10 = r9.getLifecycleOwner()
            com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify$a r9 = r9.f279821U0
            com.tencent.mm.sdk.storage.observer.StorageObserverOwner<xh.k1> r11 = p749xh.C53339k1.f149473Q1
            r11.observe(r10, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.item.ImproveTimelineItemNotify.m122740O(com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify, jq3.o, iu2.a, int, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: N */
    public final int mo133347N(String str) {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        C98799a data = getData();
        if (data == null || (b = data.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return -1;
        }
        String str2 = (String) C112550d0.m153785U(str, new String[]{";"}, false, 0, 6, (Object) null).get(1);
        int i = 0;
        for (T next : b.getCommentList()) {
            int i2 = i + 1;
            if (i >= 0) {
                w64 w64 = (w64) next;
                int i3 = w64.f299709j;
                if (C87412m.m108589b((i3 != 0 ? Integer.valueOf(i3) : Long.valueOf(w64.f299714r)).toString(), str2)) {
                    SnsMethodCalculate.markEndTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                    return i;
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        SnsMethodCalculate.markEndTimeMs("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return -1;
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        Object O = m122740O(this, oVar, aVar, i, z, dVar);
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return O;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        super.mo81008h();
        this.f279818R0.dead();
        this.f279819S0.dead();
        this.f279820T0.dead();
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
    }
}
