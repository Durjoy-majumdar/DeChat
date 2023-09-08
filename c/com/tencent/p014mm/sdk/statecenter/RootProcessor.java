package com.tencent.p014mm.sdk.statecenter;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0014*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u000e\u0012\f0\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00000\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/RootProcessor;", "Lcom/tencent/mm/sdk/statecenter/BaseState;", "State", "Lcom/tencent/mm/sdk/statecenter/IProcessor;", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/s;", "lifecycleOwner", "processor", "Lrx3/b0;", "addProcessor", "state", "process", "(Lcom/tencent/mm/sdk/statecenter/BaseState;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/tencent/mm/sdk/statecenter/RootProcessor$LifecycleBoundProcessor;", "processorMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "Companion", "LifecycleBoundProcessor", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.statecenter.RootProcessor */
public class RootProcessor<State extends BaseState> implements IProcessor<State>, C0124r {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Mvvm.RootProcessor";
    /* access modifiers changed from: private */
    public final ConcurrentHashMap<Integer, RootProcessor<State>.LifecycleBoundProcessor> processorMap = new ConcurrentHashMap<>();

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/RootProcessor$Companion;", "", "()V", "TAG", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.statecenter.RootProcessor$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/RootProcessor$LifecycleBoundProcessor;", "Landroidx/lifecycle/r;", "", "shouldBeActive", "Lrx3/b0;", "attachObserver", "detachObserver", "state", "process", "(Lcom/tencent/mm/sdk/statecenter/BaseState;)V", "onLifecycleDestroy", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/s;", "getOwner", "()Landroidx/lifecycle/s;", "Lcom/tencent/mm/sdk/statecenter/IProcessor;", "processor", "Lcom/tencent/mm/sdk/statecenter/IProcessor;", "getProcessor", "()Lcom/tencent/mm/sdk/statecenter/IProcessor;", "<init>", "(Lcom/tencent/mm/sdk/statecenter/RootProcessor;Landroidx/lifecycle/s;Lcom/tencent/mm/sdk/statecenter/IProcessor;)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.sdk.statecenter.RootProcessor$LifecycleBoundProcessor */
    public class LifecycleBoundProcessor implements C0124r {
        private final C0125s owner;
        private final IProcessor<State> processor;
        public final /* synthetic */ RootProcessor<State> this$0;

        public LifecycleBoundProcessor(RootProcessor rootProcessor, C0125s sVar, IProcessor<State> iProcessor) {
            C87412m.m108594g(sVar, "owner");
            C87412m.m108594g(iProcessor, "processor");
            this.this$0 = rootProcessor;
            this.owner = sVar;
            this.processor = iProcessor;
        }

        private final boolean shouldBeActive() {
            return this.owner.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED;
        }

        public final void attachObserver() {
            if (shouldBeActive()) {
                this.owner.getLifecycle().addObserver(this);
                return;
            }
            Log.m105920e(RootProcessor.TAG, "attachObserver fail, lifecycle is destroyed owner:" + this.owner.hashCode() + " observer:" + this.processor.hashCode());
        }

        public final void detachObserver() {
            this.owner.getLifecycle().removeObserver(this);
        }

        public final C0125s getOwner() {
            return this.owner;
        }

        public final IProcessor<State> getProcessor() {
            return this.processor;
        }

        @C112974b0(C39623j.C39625b.ON_DESTROY)
        public void onLifecycleDestroy() {
            Log.m105918d(RootProcessor.TAG, "onLifecycleDestroy owner:" + this.owner.hashCode() + " observer:" + this.processor.hashCode());
            LifecycleBoundProcessor lifecycleBoundProcessor = (LifecycleBoundProcessor) this.this$0.processorMap.remove(Integer.valueOf(this.processor.hashCode()));
            if (lifecycleBoundProcessor != null) {
                lifecycleBoundProcessor.detachObserver();
            }
        }

        public final void process(State state) {
            C87412m.m108594g(state, "state");
            if (shouldBeActive()) {
                this.processor.process(state);
            }
        }
    }

    public final void addProcessor(C0125s sVar, IProcessor<State> iProcessor) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(iProcessor, "processor");
        LifecycleBoundProcessor lifecycleBoundProcessor = this.processorMap.get(Integer.valueOf(iProcessor.hashCode()));
        if (lifecycleBoundProcessor != null) {
            C0125s owner = lifecycleBoundProcessor.getOwner();
            if (!(!C87412m.m108589b(owner, sVar))) {
                owner = null;
            }
            if (owner != null) {
                Log.m105920e(TAG, "Cannot add the same processor with different lifecycles");
                return;
            }
        }
        ConcurrentHashMap<Integer, RootProcessor<State>.LifecycleBoundProcessor> concurrentHashMap = this.processorMap;
        Integer valueOf = Integer.valueOf(iProcessor.hashCode());
        LifecycleBoundProcessor lifecycleBoundProcessor2 = new LifecycleBoundProcessor(this, sVar, iProcessor);
        lifecycleBoundProcessor2.attachObserver();
        concurrentHashMap.put(valueOf, lifecycleBoundProcessor2);
    }

    public void process(State state) {
        C87412m.m108594g(state, "state");
        ConcurrentHashMap<Integer, RootProcessor<State>.LifecycleBoundProcessor> concurrentHashMap = this.processorMap;
        ArrayList<LifecycleBoundProcessor> arrayList = new ArrayList<>(concurrentHashMap.size());
        for (Map.Entry<Integer, RootProcessor<State>.LifecycleBoundProcessor> value : concurrentHashMap.entrySet()) {
            arrayList.add((LifecycleBoundProcessor) value.getValue());
        }
        for (LifecycleBoundProcessor process : arrayList) {
            process.process(state);
        }
    }
}
