package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.CustomLayer;

/* renamed from: com.tencent.mapsdk.internal.au */
public final class C113526au implements CustomLayer {

    /* renamed from: a */
    private final C114110qj f339727a;

    public C113526au(C114110qj qjVar) {
        this.f339727a = qjVar;
    }

    public final void clearDiskCache() {
        C114110qj qjVar = this.f339727a;
        if (qjVar != null) {
            qjVar.mo172014f();
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C113526au)) {
            return this.f339727a.equals(((C113526au) obj).f339727a);
        }
        return false;
    }

    public final String getId() {
        C114110qj qjVar = this.f339727a;
        return qjVar == null ? "" : qjVar.f341061b_;
    }

    public final int hashCode() {
        C114110qj qjVar = this.f339727a;
        if (qjVar == null) {
            return 0;
        }
        return qjVar.hashCode();
    }

    public final boolean isRemoved() {
        C114110qj qjVar = this.f339727a;
        if (qjVar != null) {
            return qjVar.isRemoved();
        }
        return false;
    }

    public final void releaseData() {
        C114110qj qjVar = this.f339727a;
        if (qjVar != null) {
            qjVar.releaseData();
        }
    }

    public final void reload() {
        C114110qj qjVar = this.f339727a;
        if (qjVar != null) {
            qjVar.mo172013e();
        }
    }

    public final void remove() {
        C114110qj qjVar = this.f339727a;
        if (qjVar != null) {
            qjVar.remove();
            C113896kq.m157671d(C0949kl.f2231a);
        }
    }
}
