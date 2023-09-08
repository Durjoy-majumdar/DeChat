package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;

public final /* synthetic */ class LiveDataObservable$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LiveDataObservable f44356d;

    /* renamed from: e */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f44357e;

    public /* synthetic */ LiveDataObservable$$c(LiveDataObservable liveDataObservable, LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter) {
        this.f44356d = liveDataObservable;
        this.f44357e = liveDataObserverAdapter;
    }

    public final void run() {
        this.f44356d.lambda$removeObserver$3(this.f44357e);
    }
}
