package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.C112935j0;
import java.util.ArrayList;
import p1042u.C111055b;

/* renamed from: androidx.fragment.app.i0 */
public class C112933i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112941l0 f338088d;

    /* renamed from: e */
    public final /* synthetic */ C111055b f338089e;

    /* renamed from: f */
    public final /* synthetic */ Object f338090f;

    /* renamed from: g */
    public final /* synthetic */ C112935j0.C112937b f338091g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f338092h;

    /* renamed from: i */
    public final /* synthetic */ View f338093i;

    /* renamed from: j */
    public final /* synthetic */ Fragment f338094j;

    /* renamed from: n */
    public final /* synthetic */ Fragment f338095n;

    /* renamed from: o */
    public final /* synthetic */ boolean f338096o;

    /* renamed from: p */
    public final /* synthetic */ ArrayList f338097p;

    /* renamed from: q */
    public final /* synthetic */ Object f338098q;

    /* renamed from: r */
    public final /* synthetic */ Rect f338099r;

    public C112933i0(C112941l0 l0Var, C111055b bVar, Object obj, C112935j0.C112937b bVar2, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f338088d = l0Var;
        this.f338089e = bVar;
        this.f338090f = obj;
        this.f338091g = bVar2;
        this.f338092h = arrayList;
        this.f338093i = view;
        this.f338094j = fragment;
        this.f338095n = fragment2;
        this.f338096o = z;
        this.f338097p = arrayList2;
        this.f338098q = obj2;
        this.f338099r = rect;
    }

    public void run() {
        C111055b<String, View> d = C112935j0.m154509d(this.f338088d, this.f338089e, this.f338090f, this.f338091g);
        if (d != null) {
            this.f338092h.addAll(d.values());
            this.f338092h.add(this.f338093i);
        }
        C112935j0.m154508c(this.f338094j, this.f338095n, this.f338096o, d, false);
        Object obj = this.f338090f;
        if (obj != null) {
            this.f338088d.mo16826w(obj, this.f338097p, this.f338092h);
            View h = C112935j0.m154513h(d, this.f338091g, this.f338098q, this.f338096o);
            if (h != null) {
                this.f338088d.mo165222i(h, this.f338099r);
            }
        }
    }
}
