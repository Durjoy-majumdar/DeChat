package com.tencent.mapsdk.internal;

import android.content.Context;
import android.widget.ListView;

/* renamed from: com.tencent.mapsdk.internal.qe */
public final class C114103qe extends ListView {

    /* renamed from: a */
    private C114104a f341506a;

    /* renamed from: com.tencent.mapsdk.internal.qe$a */
    public interface C114104a {
        /* renamed from: g */
        void mo172697g();
    }

    public C114103qe(Context context) {
        super(context);
    }

    public final void handleDataChanged() {
        super.handleDataChanged();
        C114104a aVar = this.f341506a;
        if (aVar != null) {
            aVar.mo172697g();
        }
    }

    public final void setOnDataChangedListener(C114104a aVar) {
        this.f341506a = aVar;
    }
}
