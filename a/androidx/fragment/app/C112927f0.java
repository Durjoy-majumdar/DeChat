package androidx.fragment.app;

import androidx.fragment.app.C112935j0;
import androidx.fragment.app.FragmentManager;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.f0 */
public class C112927f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112935j0.C112936a f338062d;

    /* renamed from: e */
    public final /* synthetic */ Fragment f338063e;

    /* renamed from: f */
    public final /* synthetic */ C112741b f338064f;

    public C112927f0(C112935j0.C112936a aVar, Fragment fragment, C112741b bVar) {
        this.f338062d = aVar;
        this.f338063e = fragment;
        this.f338064f = bVar;
    }

    public void run() {
        ((FragmentManager.C112894d) this.f338062d).mo165134a(this.f338063e, this.f338064f);
    }
}
