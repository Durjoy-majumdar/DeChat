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
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 8*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00018B/\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b6\u00107J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\nJ\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R0\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000*j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000`+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/PendingEventNotifier;", "Lcom/tencent/mm/sdk/event/pending/IPendingEvent;", "T", "Landroidx/lifecycle/r;", "Lrx3/b0;", "doRealNotify", "event", "", "pending", "mergeNotifyData", "(Lcom/tencent/mm/sdk/event/pending/IPendingEvent;Z)V", "", "what", "sendPendingMessage", "sendMessage", "doNotify", "", "getLogTag", "onDestroy", "pausePendingNotify", "resumePendingNotify", "", "delay", "J", "getDelay", "()J", "setDelay", "(J)V", "handleThreadTag", "Ljava/lang/String;", "getHandleThreadTag", "()Ljava/lang/String;", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "handler", "Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "getHandler", "()Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;", "Landroidx/lifecycle/s;", "lifecycleOwner", "Landroidx/lifecycle/s;", "getLifecycleOwner", "()Landroidx/lifecycle/s;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "pendingEvent", "Ljava/util/HashMap;", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "pendingHandler$delegate", "Lrx3/g;", "getPendingHandler", "()Lcom/tencent/mm/sdk/platformtools/MMHandler;", "pendingHandler", "running", "Z", "<init>", "(JLjava/lang/String;Lcom/tencent/mm/sdk/event/pending/PendingEventHandler;Landroidx/lifecycle/s;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.event.pending.PendingEventNotifier */
public class PendingEventNotifier<T extends IPendingEvent> implements C0124r {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final int DESTROY = 2;
    private static final int MERGE = 1;
    private static final int SUBMIT = 0;
    public static final String TAG = "MicroMsg.Mvvm.PendingEventNotifier";
    public static final String THREAD_TAG = "PendingEventNotifierTag";
    private long delay;
    private final String handleThreadTag;
    private final PendingEventHandler<T> handler;
    private final C0125s lifecycleOwner;
    /* access modifiers changed from: private */
    public final HashMap<String, T> pendingEvent;
    private final C13601g pendingHandler$delegate;
    private volatile boolean running;

    @Metadata(mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/sdk/event/pending/PendingEventNotifier$Companion;", "", "()V", "DESTROY", "", "MERGE", "SUBMIT", "TAG", "", "THREAD_TAG", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.event.pending.PendingEventNotifier$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public PendingEventNotifier(long j, String str, PendingEventHandler<T> pendingEventHandler, C0125s sVar) {
        C87412m.m108594g(str, "handleThreadTag");
        C87412m.m108594g(pendingEventHandler, "handler");
        C87412m.m108594g(sVar, "lifecycleOwner");
        this.delay = j;
        this.handleThreadTag = str;
        this.handler = pendingEventHandler;
        this.lifecycleOwner = sVar;
        if (j > 0) {
            CommonKt.uiThread(new C32224a<C13598b0>(this) {
                public final /* synthetic */ PendingEventNotifier<T> this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.getLifecycleOwner().getLifecycle().addObserver(this.this$0);
                }
            });
            this.pendingEvent = new HashMap<>();
            this.pendingHandler$delegate = C36568h.m40985a(new PendingEventNotifier$pendingHandler$2(this));
            this.running = true;
            return;
        }
        throw new IllegalArgumentException("not allow use zero or smaller delay");
    }

    public static /* synthetic */ void doNotify$default(PendingEventNotifier pendingEventNotifier, IPendingEvent iPendingEvent, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            pendingEventNotifier.doNotify(iPendingEvent, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doNotify");
    }

    /* access modifiers changed from: private */
    public final void doRealNotify() {
        if (!this.running) {
            Log.m105924i(TAG, "not running");
            return;
        }
        HashMap<String, T> hashMap = this.pendingEvent;
        ArrayList arrayList = new ArrayList(hashMap.size());
        for (Map.Entry<String, T> value : hashMap.entrySet()) {
            arrayList.add((IPendingEvent) value.getValue());
        }
        this.pendingEvent.clear();
        if (!arrayList.isEmpty()) {
            this.handler.handleEvent(arrayList);
        }
    }

    private final MMHandler getPendingHandler() {
        return (MMHandler) this.pendingHandler$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (((com.tencent.p014mm.sdk.event.pending.IPendingEvent) r1.put(r2, r0)) == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mergeNotifyData(T r5, boolean r6) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, T> r0 = r4.pendingEvent
            java.lang.String r1 = r5.getKey()
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.sdk.event.pending.IPendingEvent r0 = (com.tencent.p014mm.sdk.event.pending.IPendingEvent) r0
            if (r0 == 0) goto L_0x0026
            java.util.HashMap<java.lang.String, T> r1 = r4.pendingEvent
            java.lang.String r2 = r0.getKey()
            com.tencent.mm.sdk.event.pending.IPendingEvent r0 = r0.mergeEvent(r5)
            java.lang.String r3 = "null cannot be cast to non-null type T of com.tencent.mm.sdk.event.pending.PendingEventNotifier.mergeNotifyData$lambda-1"
            gy3.C87412m.m108592e(r0, r3)
            java.lang.Object r0 = r1.put(r2, r0)
            com.tencent.mm.sdk.event.pending.IPendingEvent r0 = (com.tencent.p014mm.sdk.event.pending.IPendingEvent) r0
            if (r0 != 0) goto L_0x0032
        L_0x0026:
            java.util.HashMap<java.lang.String, T> r0 = r4.pendingEvent
            java.lang.String r1 = r5.getKey()
            java.lang.Object r5 = r0.put(r1, r5)
            com.tencent.mm.sdk.event.pending.IPendingEvent r5 = (com.tencent.p014mm.sdk.event.pending.IPendingEvent) r5
        L_0x0032:
            r5 = 0
            if (r6 == 0) goto L_0x0039
            r4.sendPendingMessage(r5)
            goto L_0x003c
        L_0x0039:
            r4.sendMessage(r5)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.event.pending.PendingEventNotifier.mergeNotifyData(com.tencent.mm.sdk.event.pending.IPendingEvent, boolean):void");
    }

    private final void sendMessage(int i) {
        Log.m105924i(getLogTag(), "send message 0");
        getPendingHandler().sendEmptyMessage(0);
    }

    private final void sendPendingMessage(int i) {
        if (!getPendingHandler().hasMessages(i)) {
            String logTag = getLogTag();
            Log.m105924i(logTag, "send pending message " + i);
            getPendingHandler().sendEmptyMessageDelayed(i, this.delay);
            return;
        }
        String logTag2 = getLogTag();
        Log.m105924i(logTag2, "ignore pending message " + i);
    }

    public final void doNotify(T t, boolean z) {
        C87412m.m108594g(t, "event");
        if (this.lifecycleOwner.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED) {
            getPendingHandler().sendMessage(getPendingHandler().obtainMessage(1, z ? 1 : 0, 0, t));
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    public final String getHandleThreadTag() {
        return this.handleThreadTag;
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
        getPendingHandler().removeCallbacksAndMessages((Object) null);
        getPendingHandler().sendEmptyMessage(2);
    }

    public final void pausePendingNotify() {
        String logTag = getLogTag();
        Log.m105924i(logTag, "pausePendingNotify " + this.running);
        if (this.running) {
            this.running = false;
        }
    }

    public final void resumePendingNotify() {
        String logTag = getLogTag();
        Log.m105924i(logTag, "resumePendingNotify " + this.running);
        if (!this.running) {
            this.running = true;
            if (!getPendingHandler().hasMessages(0)) {
                sendMessage(0);
            }
        }
    }

    public final void setDelay(long j) {
        this.delay = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PendingEventNotifier(long j, String str, PendingEventHandler pendingEventHandler, C0125s sVar, int i, C8480h hVar) {
        this(j, (i & 2) != 0 ? THREAD_TAG : str, pendingEventHandler, sVar);
    }
}
