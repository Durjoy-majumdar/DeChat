package p864t5;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p1105d5.C106997h;
import p1137n5.C109683a;
import p1137n5.C109685c;
import p1137n5.C109687d;
import p385u2.C111105a;
import rx3.C13598b0;

/* renamed from: t5.i */
public final class C110909i implements ComponentCallbacks2, C109685c.C109686a {

    /* renamed from: d */
    public final Context f331716d;

    /* renamed from: e */
    public final WeakReference<C106997h> f331717e;

    /* renamed from: f */
    public final C109685c f331718f;

    /* renamed from: g */
    public volatile boolean f331719g;

    /* renamed from: h */
    public final AtomicBoolean f331720h;

    public C110909i(C106997h hVar, Context context, boolean z) {
        C109685c cVar;
        C87412m.m108594g(hVar, "imageLoader");
        C87412m.m108594g(context, "context");
        this.f331716d = context;
        this.f331717e = new WeakReference<>(hVar);
        hVar.getClass();
        if (!z) {
            cVar = C109683a.f328324a;
        } else {
            ConnectivityManager connectivityManager = (ConnectivityManager) C111105a.m151502d(context, ConnectivityManager.class);
            if (connectivityManager != null) {
                if (C111105a.m151499a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                    try {
                        cVar = new C109687d(connectivityManager, this);
                    } catch (Exception unused) {
                        cVar = C109683a.f328324a;
                    }
                }
            }
            cVar = C109683a.f328324a;
        }
        this.f331718f = cVar;
        this.f331719g = cVar.mo160905a();
        this.f331720h = new AtomicBoolean(false);
        this.f331716d.registerComponentCallbacks(this);
    }

    /* renamed from: a */
    public void mo160907a(boolean z) {
        C106997h hVar = this.f331717e.get();
        if (hVar == null) {
            mo162597b();
            return;
        }
        this.f331719g = z;
        hVar.getClass();
    }

    /* renamed from: b */
    public final void mo162597b() {
        if (!this.f331720h.getAndSet(true)) {
            this.f331716d.unregisterComponentCallbacks(this);
            this.f331718f.shutdown();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        if (this.f331717e.get() == null) {
            mo162597b();
        }
    }

    public void onLowMemory() {
        onTrimMemory(80);
    }

    public void onTrimMemory(int i) {
        C13598b0 b0Var;
        C106997h hVar = this.f331717e.get();
        if (hVar == null) {
            b0Var = null;
        } else {
            hVar.f320274d.f327786a.mo160731a(i);
            hVar.f320274d.f327787b.mo160734a(i);
            hVar.f320273c.mo157692a(i);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            mo162597b();
        }
    }
}
