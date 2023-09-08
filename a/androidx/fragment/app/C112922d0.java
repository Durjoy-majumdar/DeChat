package androidx.fragment.app;

import androidx.fragment.app.C112935j0;
import androidx.fragment.app.FragmentManager;
import p834a3.C112741b;

/* renamed from: androidx.fragment.app.d0 */
public class C112922d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112935j0.C112936a f338051d;

    /* renamed from: e */
    public final /* synthetic */ Fragment f338052e;

    /* renamed from: f */
    public final /* synthetic */ C112741b f338053f;

    public C112922d0(C112935j0.C112936a aVar, Fragment fragment, C112741b bVar) {
        this.f338051d = aVar;
        this.f338052e = fragment;
        this.f338053f = bVar;
    }

    public void run() {
        ((FragmentManager.C112894d) this.f338051d).mo165134a(this.f338052e, this.f338053f);
    }
}
