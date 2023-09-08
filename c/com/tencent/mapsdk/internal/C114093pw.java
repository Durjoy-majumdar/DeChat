package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import java.util.ArrayList;

/* renamed from: com.tencent.mapsdk.internal.pw */
public final class C114093pw implements C113711ev {

    /* renamed from: a */
    private ArrayList<C113711ev> f341450a = new ArrayList<>();

    /* renamed from: a */
    public final synchronized void mo172682a(C113711ev evVar) {
        if (evVar != null) {
            if (!this.f341450a.contains(evVar)) {
                this.f341450a.add(evVar);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo172683b(C113711ev evVar) {
        this.f341450a.remove(evVar);
    }

    /* renamed from: c */
    public final synchronized boolean mo172044c(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172044c(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized boolean mo172046d(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172046d(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final synchronized boolean mo172047e(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172047e(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final synchronized boolean mo172048f(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172048f(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final synchronized boolean mo172049g(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172049g(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final synchronized boolean mo172050h(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172050h(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final synchronized boolean mo172051i(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172051i(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final synchronized boolean mo172052j(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172052j(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo172053k(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172053k(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized boolean mo172042b(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172042b(f, f2)) {
                return true;
            }
        }
        C113889km.m157537a("notify onSingleTap");
        for (int size2 = this.f341450a.size() - 1; size2 >= 0; size2--) {
            this.f341450a.get(size2).mo172035a();
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo172037a(float f, float f2) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172037a(f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized boolean mo172043c() {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172043c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final synchronized boolean mo172045d() {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172045d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo172035a() {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            this.f341450a.get(size).mo172035a();
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo172036a(float f) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172036a(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized boolean mo172040b() {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172040b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo172039a(PointF pointF, PointF pointF2, float f) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172039a(pointF, pointF2, f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized boolean mo172041b(float f) {
        for (int size = this.f341450a.size() - 1; size >= 0; size--) {
            if (this.f341450a.get(size).mo172041b(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo172038a(PointF pointF, PointF pointF2, double d, double d2) {
        synchronized (this) {
            for (int size = this.f341450a.size() - 1; size >= 0; size--) {
                if (this.f341450a.get(size).mo172038a(pointF, pointF2, d, d2)) {
                    return true;
                }
            }
            return false;
        }
    }
}
