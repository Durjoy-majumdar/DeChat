package com.tencent.p014mm.accessibility.uitl;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.event.pending.IPendingEvent;
import com.tencent.p014mm.sdk.event.pending.UIPendingEventNotifier;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import rx3.C13598b0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001a\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/uitl/TimeBlocker;", "", "Landroidx/lifecycle/s;", "owner", "Lrx3/b0;", "addObserver", "", "key", "", "time", "", "isSinceLastTrue", "Landroid/view/View;", "view", "", "type", "Lkotlin/Function0;", "callback", "pendingExcu", "TAG", "Ljava/lang/String;", "", "lastTimeCache", "Ljava/util/Map;", "INTERVAL_TIME", "J", "com/tencent/mm/accessibility/uitl/TimeBlocker$handle$1", "handle", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker$handle$1;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/tencent/mm/sdk/event/pending/UIPendingEventNotifier;", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker$CallbackEvent;", "ownerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "CallbackEvent", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.uitl.TimeBlocker */
public final class TimeBlocker {
    public static final int $stable = 8;
    public static final TimeBlocker INSTANCE = new TimeBlocker();
    private static final long INTERVAL_TIME = 1000;
    private static final String TAG = "MicroMsg.Acc.TimeBlocker";
    private static final TimeBlocker$handle$1 handle = new TimeBlocker$handle$1();
    private static final Map<Integer, Long> lastTimeCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public static final ConcurrentHashMap<Integer, UIPendingEventNotifier<CallbackEvent>> ownerMap = new ConcurrentHashMap<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/uitl/TimeBlocker$CallbackEvent;", "Lcom/tencent/mm/sdk/event/pending/IPendingEvent;", "", "getKey", "newEvent", "mergeEvent", "_key", "Ljava/lang/String;", "get_key", "()Ljava/lang/String;", "Lkotlin/Function0;", "Lrx3/b0;", "callback", "Lfy3/a;", "getCallback", "()Lfy3/a;", "<init>", "(Ljava/lang/String;Lfy3/a;)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.accessibility.uitl.TimeBlocker$CallbackEvent */
    public static final class CallbackEvent implements IPendingEvent {
        public static final int $stable = 0;
        private final String _key;
        private final C32224a<C13598b0> callback;

        public CallbackEvent(String str, C32224a<C13598b0> aVar) {
            C87412m.m108594g(str, "_key");
            C87412m.m108594g(aVar, "callback");
            this._key = str;
            this.callback = aVar;
        }

        public final C32224a<C13598b0> getCallback() {
            return this.callback;
        }

        public String getKey() {
            return this._key;
        }

        public final String get_key() {
            return this._key;
        }

        public IPendingEvent mergeEvent(IPendingEvent iPendingEvent) {
            C87412m.m108594g(iPendingEvent, "newEvent");
            return iPendingEvent;
        }
    }

    private TimeBlocker() {
    }

    private final void addObserver(C0125s sVar) {
        Log.m105924i(TAG, "wait synchronized " + sVar);
        synchronized (this) {
            if (!ownerMap.containsKey(Integer.valueOf(sVar.hashCode()))) {
                Log.m105924i(TAG, "addObserver init " + sVar);
                TimeBlocker$addObserver$1$observer$1 timeBlocker$addObserver$1$observer$1 = new TimeBlocker$addObserver$1$observer$1(sVar);
                ((C119157j) C119157j.f356862d).mo183868B(new TimeBlocker$addObserver$1$1(sVar, timeBlocker$addObserver$1$observer$1));
            }
        }
    }

    public final boolean isSinceLastTrue(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        Map<Integer, Long> map = lastTimeCache;
        Integer valueOf = Integer.valueOf(i);
        long j2 = map.get(valueOf);
        if (j2 == null) {
            j2 = 0L;
            map.put(valueOf, 0L);
        }
        long longValue = currentTimeMillis - j2.longValue();
        if (longValue <= j && longValue >= 0) {
            return false;
        }
        map.put(Integer.valueOf(i), Long.valueOf(currentTimeMillis));
        return true;
    }

    public final void pendingExcu(View view, String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(str, "type");
        C87412m.m108594g(aVar, "callback");
        Context context = view.getContext();
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        if (sVar != null) {
            ConcurrentHashMap<Integer, UIPendingEventNotifier<CallbackEvent>> concurrentHashMap = ownerMap;
            if (!concurrentHashMap.containsKey(Integer.valueOf(sVar.hashCode()))) {
                addObserver(sVar);
            }
            if (sVar.getLifecycle().getCurrentState() == C39623j.C39626c.DESTROYED) {
                Log.m105924i(TAG, "skip getOrPut because of " + sVar + " DESTROYED");
            } else if (sVar.getLifecycle().getCurrentState() == C39623j.C39626c.INITIALIZED) {
                Log.m105924i(TAG, "skip getOrPut because of " + sVar + " INITIALIZED");
            } else {
                Integer valueOf = Integer.valueOf(sVar.hashCode());
                UIPendingEventNotifier<CallbackEvent> uIPendingEventNotifier = concurrentHashMap.get(valueOf);
                if (uIPendingEventNotifier == null) {
                    Log.m105924i(TAG, "put " + sVar + " into ownerMap, current status is " + sVar.getLifecycle().getCurrentState().name());
                    uIPendingEventNotifier = new UIPendingEventNotifier<>(1000, handle, sVar);
                    UIPendingEventNotifier<CallbackEvent> putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, uIPendingEventNotifier);
                    if (putIfAbsent != null) {
                        uIPendingEventNotifier = putIfAbsent;
                    }
                }
                UIPendingEventNotifier.doNotify$default(uIPendingEventNotifier, new CallbackEvent(view.hashCode() + str, aVar), false, 2, (Object) null);
            }
        }
    }
}
