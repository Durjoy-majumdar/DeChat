package com.tencent.p014mm.sdk.statecenter;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u0007\u001a\u00020\u000b\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tJ,\u0010\u0007\u001a\u00020\u000b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\fH\bø\u0001\u0000JP\u0010\u0012\u001a\u00020\u000b\"\b\b\u0000\u0010\r*\u00020\u0003\"\b\b\u0001\u0010\u000e*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0011J@\u0010\u0012\u001a\u00020\u000b\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\u000e\u0018\u0001*\u00020\u00012\u001a\b\b\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0011H\bø\u0001\u0000J\u0006\u0010\u0013\u001a\u00020\u0000R$\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/sdk/statecenter/BaseState;", "Lcom/tencent/mm/sdk/statecenter/IState;", "", "Lcom/tencent/mm/sdk/statecenter/IStateAction;", "T", "Ljava/lang/Class;", "clazz", "checkAction", "(Ljava/lang/Class;)Lcom/tencent/mm/sdk/statecenter/IStateAction;", "Lcom/tencent/mm/sdk/statecenter/StateActionHandler;", "handler", "Lrx3/b0;", "Lkotlin/Function1;", "Action", "State", "stateClazz", "actionClazz", "Lkotlin/Function2;", "check", "cloneState", "action", "Lcom/tencent/mm/sdk/statecenter/IStateAction;", "getAction", "()Lcom/tencent/mm/sdk/statecenter/IStateAction;", "setAction", "(Lcom/tencent/mm/sdk/statecenter/IStateAction;)V", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.statecenter.BaseState */
public class BaseState implements IState, Cloneable {
    private IStateAction action;

    public final <Action extends IStateAction, State extends IState> void check(Class<State> cls, Class<Action> cls2, C32227p<? super State, ? super Action, C13598b0> pVar) {
        C87412m.m108594g(cls, "stateClazz");
        C87412m.m108594g(cls2, "actionClazz");
        C87412m.m108594g(pVar, "handler");
        IStateAction iStateAction = null;
        BaseState baseState = getClass().isAssignableFrom(cls) ? this : null;
        if (getClass().isAssignableFrom(cls2)) {
            iStateAction = (IStateAction) this;
        }
        if (baseState != null && iStateAction != null) {
            pVar.invoke(baseState, iStateAction);
        }
    }

    public final <T extends IStateAction> T checkAction(Class<T> cls) {
        C87412m.m108594g(cls, "clazz");
        T action2 = getAction();
        if (action2 == null || !action2.getClass().isAssignableFrom(cls)) {
            return null;
        }
        return action2;
    }

    public Object clone() {
        return super.clone();
    }

    public final BaseState cloneState() {
        Object clone = super.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type com.tencent.mm.sdk.statecenter.BaseState");
        return (BaseState) clone;
    }

    public IStateAction getAction() {
        return this.action;
    }

    public void setAction(IStateAction iStateAction) {
        this.action = iStateAction;
    }

    public final <T extends IStateAction> void checkAction(Class<T> cls, StateActionHandler<T> stateActionHandler) {
        C87412m.m108594g(cls, "clazz");
        C87412m.m108594g(stateActionHandler, "handler");
        IStateAction action2 = getAction();
        if (action2 != null && action2.getClass().isAssignableFrom(cls)) {
            stateActionHandler.handle(action2);
        }
    }

    public final <Action extends IStateAction, State extends IState> void check(C32227p<? super State, ? super Action, C13598b0> pVar) {
        C87412m.m108594g(pVar, "handler");
        C87412m.m108602o();
        throw null;
    }

    public final <T extends IStateAction> void checkAction(C32226l<? super T, C13598b0> lVar) {
        C87412m.m108594g(lVar, "handler");
        if (getAction() != null) {
            C87412m.m108602o();
            throw null;
        }
    }
}
