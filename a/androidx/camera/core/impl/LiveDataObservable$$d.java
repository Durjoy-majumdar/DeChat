package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;

public final /* synthetic */ class LiveDataObservable$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LiveDataObservable f44358d;

    /* renamed from: e */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f44359e;

    /* renamed from: f */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f44360f;

    public /* synthetic */ LiveDataObservable$$d(LiveDataObservable liveDataObservable, LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter2) {
        this.f44358d = liveDataObservable;
        this.f44359e = liveDataObserverAdapter;
        this.f44360f = liveDataObserverAdapter2;
    }

    public final void run() {
        this.f44358d.lambda$addObserver$2(this.f44359e, this.f44360f);
    }
}
