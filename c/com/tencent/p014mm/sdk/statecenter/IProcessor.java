package com.tencent.p014mm.sdk.statecenter;

import com.tencent.p014mm.sdk.statecenter.BaseState;

/* renamed from: com.tencent.mm.sdk.statecenter.IProcessor */
public interface IProcessor<State extends BaseState> {
    void process(State state);
}
