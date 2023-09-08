package androidx.camera.core.impl;

import androidx.camera.core.impl.LiveDataObservable;

public final /* synthetic */ class LiveDataObservable$LiveDataObserverAdapter$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LiveDataObservable.LiveDataObserverAdapter f44361d;

    /* renamed from: e */
    public final /* synthetic */ LiveDataObservable.Result f44362e;

    public /* synthetic */ LiveDataObservable$LiveDataObserverAdapter$$a(LiveDataObservable.LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObservable.Result result) {
        this.f44361d = liveDataObserverAdapter;
        this.f44362e = result;
    }

    public final void run() {
        this.f44361d.lambda$onChanged$0(this.f44362e);
    }
}
