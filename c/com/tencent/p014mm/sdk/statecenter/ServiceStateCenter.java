package com.tencent.p014mm.sdk.statecenter;

import a14.C53934p0;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001(\u0018\u0000 -*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001-B+\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b+\u0010,J\r\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u001c\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fJ\"\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000fJ\u001c\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000fR\u0017\u0010\u0013\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0005R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00028\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/ServiceStateCenter;", "Lcom/tencent/mm/sdk/statecenter/BaseState;", "State", "", "getState", "()Lcom/tencent/mm/sdk/statecenter/BaseState;", "Lcom/tencent/mm/sdk/statecenter/IStateAction;", "action", "Lrx3/b0;", "dispatch", "Landroidx/lifecycle/s;", "owner", "Lcom/tencent/mm/sdk/statecenter/IProcessor;", "processor", "process", "Lkotlin/Function1;", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "observer", "observe", "initState", "Lcom/tencent/mm/sdk/statecenter/BaseState;", "getInitState", "lifecycleOwner", "Landroidx/lifecycle/s;", "getLifecycleOwner", "()Landroidx/lifecycle/s;", "", "logTag", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "lifecycleScope", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "getLifecycleScope", "()Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "_state", "Lcom/tencent/mm/sdk/statecenter/RootProcessor;", "rootProcessor", "Lcom/tencent/mm/sdk/statecenter/RootProcessor;", "com/tencent/mm/sdk/statecenter/ServiceStateCenter$observerOwner$1", "observerOwner", "Lcom/tencent/mm/sdk/statecenter/ServiceStateCenter$observerOwner$1;", "<init>", "(Lcom/tencent/mm/sdk/statecenter/BaseState;Landroidx/lifecycle/s;Ljava/lang/String;Lcom/tencent/mm/sdk/coroutines/LifecycleScope;)V", "Companion", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.statecenter.ServiceStateCenter */
public final class ServiceStateCenter<State extends BaseState> {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String SCOPE_NAME = "StateCenter.LifecycleScope";
    /* access modifiers changed from: private */
    public State _state;
    private final State initState;
    private final C0125s lifecycleOwner;
    private final LifecycleScope lifecycleScope;
    private final String logTag;
    /* access modifiers changed from: private */
    public final ServiceStateCenter$observerOwner$1 observerOwner;
    /* access modifiers changed from: private */
    public final RootProcessor<State> rootProcessor;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/ServiceStateCenter$Companion;", "", "()V", "SCOPE_NAME", "", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.sdk.statecenter.ServiceStateCenter$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public ServiceStateCenter(State state, C0125s sVar, String str, LifecycleScope lifecycleScope2) {
        C87412m.m108594g(state, "initState");
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(str, "logTag");
        C87412m.m108594g(lifecycleScope2, "lifecycleScope");
        this.initState = state;
        this.lifecycleOwner = sVar;
        this.logTag = str;
        this.lifecycleScope = lifecycleScope2;
        this._state = state;
        this.rootProcessor = new RootProcessor<>();
        this.observerOwner = new ServiceStateCenter$observerOwner$1(this);
    }

    public final void dispatch(IStateAction iStateAction) {
        C87412m.m108594g(iStateAction, "action");
        String str = this.logTag;
        Log.m105918d(str, "dispatch action:" + iStateAction);
        LifecycleScope.launchDefault$default(this.lifecycleScope, (C53934p0) null, new ServiceStateCenter$dispatch$1(this, iStateAction, (C15601d<? super ServiceStateCenter$dispatch$1>) null), 1, (Object) null);
    }

    public final State getInitState() {
        return this.initState;
    }

    public final C0125s getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final LifecycleScope getLifecycleScope() {
        return this.lifecycleScope;
    }

    public final String getLogTag() {
        return this.logTag;
    }

    public final State getState() {
        return this._state;
    }

    public final void observe(C0125s sVar, IMvvmObserver<State> iMvvmObserver) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(iMvvmObserver, "observer");
        this.observerOwner.observe(sVar, MvvmObserverOwner.MainThread, iMvvmObserver);
    }

    public final void process(C0125s sVar, IProcessor<State> iProcessor) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(iProcessor, "processor");
        this.rootProcessor.addProcessor(sVar, iProcessor);
    }

    public final void observe(C0125s sVar, C32226l<? super State, C13598b0> lVar) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(lVar, "observer");
        this.observerOwner.observe(sVar, MvvmObserverOwner.MainThread, new C19596x15ce98d6(lVar));
    }

    public final void process(C0125s sVar, C32226l<? super State, C13598b0> lVar) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(lVar, "processor");
        this.rootProcessor.addProcessor(sVar, new C19597x79bb82(lVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServiceStateCenter(BaseState baseState, C0125s sVar, String str, LifecycleScope lifecycleScope2, int i, C8480h hVar) {
        this(baseState, sVar, (i & 4) != 0 ? "MicroMsg.State.StateCenter" : str, (i & 8) != 0 ? new LifecycleScope("StateCenter.LifecycleScope", sVar, 0, 4, (C8480h) null) : lifecycleScope2);
    }
}
