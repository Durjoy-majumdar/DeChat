package androidx.camera.core.impl;

import p202m2.C117512b;

public final /* synthetic */ class LiveDataObservable$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LiveDataObservable f44354d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44355e;

    public /* synthetic */ LiveDataObservable$$b(LiveDataObservable liveDataObservable, C117512b.C117513a aVar) {
        this.f44354d = liveDataObservable;
        this.f44355e = aVar;
    }

    public final void run() {
        this.f44354d.lambda$fetchData$0(this.f44355e);
    }
}
