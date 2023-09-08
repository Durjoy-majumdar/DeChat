package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;

/* renamed from: com.tencent.mapsdk.internal.az */
public final class C113531az implements TileOverlay {

    /* renamed from: a */
    private final C114110qj f339739a;

    public C113531az(C114110qj qjVar) {
        this.f339739a = qjVar;
    }

    public final void clearTileCache() {
        C114110qj qjVar = this.f339739a;
        if (qjVar != null) {
            qjVar.mo172014f();
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C113531az)) {
            return this.f339739a.equals(((C113531az) obj).f339739a);
        }
        return false;
    }

    public final String getId() {
        C114110qj qjVar = this.f339739a;
        return qjVar == null ? "" : qjVar.f341061b_;
    }

    public final int hashCode() {
        C114110qj qjVar = this.f339739a;
        if (qjVar == null) {
            return 0;
        }
        return qjVar.hashCode();
    }

    public final void reload() {
        C114110qj qjVar = this.f339739a;
        if (qjVar != null) {
            qjVar.mo172013e();
        }
    }

    public final void remove() {
        C114110qj qjVar = this.f339739a;
        if (qjVar != null) {
            qjVar.remove();
        }
    }

    public final void setDiskCacheDir(String str) {
        C114110qj qjVar = this.f339739a;
        if (qjVar != null && qjVar.f341569q != null && !TextUtils.isEmpty(str)) {
            qjVar.f341569q.diskCacheDir(str);
            qjVar.f341570r = qjVar.mo172015g();
        }
    }

    public final void setZindex(int i) {
        C114110qj qjVar = this.f339739a;
        if (qjVar != null) {
            qjVar.mo172716a(i);
        }
    }
}
