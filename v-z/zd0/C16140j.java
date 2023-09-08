package zd0;

import android.view.View;
import android.view.ViewTreeObserver;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: zd0.j */
public final class C16140j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ View f43329d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C13598b0> f43330e;

    public C16140j(View view, C32224a<C13598b0> aVar) {
        this.f43329d = view;
        this.f43330e = aVar;
    }

    public boolean onPreDraw() {
        if (this.f43329d.getViewTreeObserver().isAlive()) {
            this.f43329d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f43330e.invoke();
        return false;
    }
}
