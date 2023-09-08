package com.tencent.p014mm.sdk.event.pending;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.event.pending.IPendingEvent;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import mu3.C109639a;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 5*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00015B%\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b3\u00104J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0007R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000&j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000`'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/UIPendingEventNotifier;", "Lcom/tencent/mm/sdk/event/pending/IPendingEvent;", "T", "Landroidx/lifecycle/r;", "Lrx3/b0;", "doRealNotify", "", "what", "sendPendingMessage", "sendMessage", "event", "", "pending", "doNotify", "(Lcom/tencent/mm/sdk/event/pending/IPendingEvent;Z)V", "", "getLogTag", "onDestroy", "", "delay", "J", "getDelay", "()J", "setDelay", "(J)V", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "handler", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "getHandler", "()Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "Landroidx/lifecycle/s;", "lifecycleOwner", "Landroidx/lifecycle/s;", "getLifecycleOwner", "()Landroidx/lifecycle/s;", "", "pendingLock", "Ljava/lang/Object;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pendingEvent", "Ljava/util/HashMap;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/tencent/mm/sdk/platformtools/MMHandler$Callback;", "callback", "Lcom/tencent/mm/sdk/platformtools/MMHandler$Callback;", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "pendingHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "<init>", "(JLcom/tencent/mm/sdk/event/pending/PendingEventHandler;Landroidx/lifecycle/s;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.pending.UIPendingEventNotifier */
public class UIPendingEventNotifier<T extends IPendingEvent> implements C0124r {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final int SUBMIT = 0;
    public static final String TAG = "MicroMsg.Mvvm.UIPendingEventNotifier";
    private final MMHandler.Callback callback;
    private long delay;
    private final PendingEventHandler<T> handler;
    private final C0125s lifecycleOwner;
    private final HashMap<String, T> pendingEvent;
    /* access modifiers changed from: private */
    public final AtomicBoolean pendingFlag;
    private final MMHandler pendingHandler;
    private final Object pendingLock;

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/UIPendingEventNotifier$Companion;", "", "()V", "SUBMIT", "", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.event.pending.UIPendingEventNotifier$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public UIPendingEventNotifier(long j, PendingEventHandler<T> pendingEventHandler, C0125s sVar) {
        C87412m.m108594g(pendingEventHandler, "handler");
        C87412m.m108594g(sVar, "lifecycleOwner");
        this.delay = j;
        this.handler = pendingEventHandler;
        this.lifecycleOwner = sVar;
        if (j > 0) {
            CommonKt.uiThread(new C32224a<C13598b0>(this) {
                public final /* synthetic */ UIPendingEventNotifier<T> this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.getLifecycleOwner().getLifecycle().addObserver(this.this$0);
                }
            });
            this.pendingLock = new Object();
            this.pendingEvent = new HashMap<>();
            this.pendingFlag = new AtomicBoolean(false);
            UIPendingEventNotifier$callback$1 uIPendingEventNotifier$callback$1 = new UIPendingEventNotifier$callback$1(this);
            this.callback = uIPendingEventNotifier$callback$1;
            this.pendingHandler = new MMHandler(C109639a.m148951b(), (MMHandler.Callback) uIPendingEventNotifier$callback$1);
            return;
        }
        throw new IllegalArgumentException("not allow use zero or smaller delay");
    }

    public static /* synthetic */ void doNotify$default(UIPendingEventNotifier uIPendingEventNotifier, IPendingEvent iPendingEvent, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            uIPendingEventNotifier.doNotify(iPendingEvent, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doNotify");
    }

    /* access modifiers changed from: private */
    public final void doRealNotify() {
        C8479f0 f0Var = new C8479f0();
        synchronized (this.pendingLock) {
            HashMap<String, T> hashMap = this.pendingEvent;
            T arrayList = new ArrayList(hashMap.size());
            for (Map.Entry<String, T> value : hashMap.entrySet()) {
                arrayList.add((IPendingEvent) value.getValue());
            }
            f0Var.f27484d = arrayList;
            this.pendingEvent.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        List list = (List) f0Var.f27484d;
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                this.handler.handleEvent(list);
            }
        }
    }

    private final void sendMessage(int i) {
        String logTag = getLogTag();
        Log.m105924i(logTag, "send message " + i);
        this.pendingHandler.sendEmptyMessage(i);
    }

    private final void sendPendingMessage(int i) {
        if (!this.pendingFlag.get()) {
            String logTag = getLogTag();
            Log.m105924i(logTag, "send pending message " + i);
            this.pendingFlag.set(true);
            this.pendingHandler.sendEmptyMessageDelayed(i, this.delay);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        if (((com.tencent.p014mm.sdk.event.pending.IPendingEvent) r2.put(r3, r1)) == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doNotify(T r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r6, r0)
            androidx.lifecycle.s r0 = r5.lifecycleOwner
            androidx.lifecycle.j r0 = r0.getLifecycle()
            androidx.lifecycle.j$c r0 = r0.getCurrentState()
            androidx.lifecycle.j$c r1 = androidx.lifecycle.C39623j.C39626c.DESTROYED
            if (r0 == r1) goto L_0x0057
            java.lang.Object r0 = r5.pendingLock
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, T> r1 = r5.pendingEvent     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r6.getKey()     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0054 }
            com.tencent.mm.sdk.event.pending.IPendingEvent r1 = (com.tencent.p014mm.sdk.event.pending.IPendingEvent) r1     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x003c
            java.util.HashMap<java.lang.String, T> r2 = r5.pendingEvent     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r1.getKey()     // Catch:{ all -> 0x0054 }
            com.tencent.mm.sdk.event.pending.IPendingEvent r1 = r1.mergeEvent(r6)     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "null cannot be cast to non-null type T of com.tencent.mm.sdk.event.pending.UIPendingEventNotifier.doNotify$lambda-6$lambda-4"
            gy3.C87412m.m108592e(r1, r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r2.put(r3, r1)     // Catch:{ all -> 0x0054 }
            com.tencent.mm.sdk.event.pending.IPendingEvent r1 = (com.tencent.p014mm.sdk.event.pending.IPendingEvent) r1     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x0048
        L_0x003c:
            java.util.HashMap<java.lang.String, T> r1 = r5.pendingEvent     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r6.getKey()     // Catch:{ all -> 0x0054 }
            java.lang.Object r6 = r1.put(r2, r6)     // Catch:{ all -> 0x0054 }
            com.tencent.mm.sdk.event.pending.IPendingEvent r6 = (com.tencent.p014mm.sdk.event.pending.IPendingEvent) r6     // Catch:{ all -> 0x0054 }
        L_0x0048:
            monitor-exit(r0)
            r6 = 0
            if (r7 == 0) goto L_0x0050
            r5.sendPendingMessage(r6)
            goto L_0x0057
        L_0x0050:
            r5.sendMessage(r6)
            goto L_0x0057
        L_0x0054:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.event.pending.UIPendingEventNotifier.doNotify(com.tencent.mm.sdk.event.pending.IPendingEvent, boolean):void");
    }

    public final long getDelay() {
        return this.delay;
    }

    public final PendingEventHandler<T> getHandler() {
        return this.handler;
    }

    public final C0125s getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public String getLogTag() {
        return TAG;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        this.pendingHandler.removeCallbacksAndMessages((Object) null);
        this.pendingFlag.set(false);
        synchronized (this.pendingLock) {
            this.pendingEvent.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    public final void setDelay(long j) {
        this.delay = j;
    }
}
