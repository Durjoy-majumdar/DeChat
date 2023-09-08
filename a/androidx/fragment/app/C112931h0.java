package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import p1042u.C111055b;

/* renamed from: androidx.fragment.app.h0 */
public class C112931h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Fragment f338080d;

    /* renamed from: e */
    public final /* synthetic */ Fragment f338081e;

    /* renamed from: f */
    public final /* synthetic */ boolean f338082f;

    /* renamed from: g */
    public final /* synthetic */ C111055b f338083g;

    /* renamed from: h */
    public final /* synthetic */ View f338084h;

    /* renamed from: i */
    public final /* synthetic */ C112941l0 f338085i;

    /* renamed from: j */
    public final /* synthetic */ Rect f338086j;

    public C112931h0(Fragment fragment, Fragment fragment2, boolean z, C111055b bVar, View view, C112941l0 l0Var, Rect rect) {
        this.f338080d = fragment;
        this.f338081e = fragment2;
        this.f338082f = z;
        this.f338083g = bVar;
        this.f338084h = view;
        this.f338085i = l0Var;
        this.f338086j = rect;
    }

    public void run() {
        C112935j0.m154508c(this.f338080d, this.f338081e, this.f338082f, this.f338083g, false);
        View view = this.f338084h;
        if (view != null) {
            this.f338085i.mo165222i(view, this.f338086j);
        }
    }
}
