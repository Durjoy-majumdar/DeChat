package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.fragment.app.h */
public class C112930h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112941l0 f338077d;

    /* renamed from: e */
    public final /* synthetic */ View f338078e;

    /* renamed from: f */
    public final /* synthetic */ Rect f338079f;

    public C112930h(C112912b bVar, C112941l0 l0Var, View view, Rect rect) {
        this.f338077d = l0Var;
        this.f338078e = view;
        this.f338079f = rect;
    }

    public void run() {
        this.f338077d.mo165222i(this.f338078e, this.f338079f);
    }
}
