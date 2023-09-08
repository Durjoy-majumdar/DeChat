package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.component.f5 */
public class C73478f5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TransformComponent f215892d;

    public C73478f5(TransformComponent transformComponent) {
        this.f215892d = transformComponent;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f215892d) {
            TransformComponent.f215670s.clear();
            TransformComponent.f215669r.clear();
        }
        Log.m105925i("MicroMsg.TransformComponent", "alvinluo unsetTransformFlag cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
