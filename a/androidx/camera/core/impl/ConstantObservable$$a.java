package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;

public final /* synthetic */ class ConstantObservable$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ConstantObservable f44335d;

    /* renamed from: e */
    public final /* synthetic */ Observable.Observer f44336e;

    public /* synthetic */ ConstantObservable$$a(ConstantObservable constantObservable, Observable.Observer observer) {
        this.f44335d = constantObservable;
        this.f44336e = observer;
    }

    public final void run() {
        this.f44335d.lambda$addObserver$0(this.f44336e);
    }
}
