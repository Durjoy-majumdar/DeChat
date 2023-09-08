package p22;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p22.C110120h;

/* renamed from: p22.i */
public final class C110123i extends C110108d {
    /* renamed from: a */
    public Context mo150201a() {
        Iterator it = ((ArrayList) C110120h.f329464h).iterator();
        while (it.hasNext()) {
            C110120h.C110121a aVar = (C110120h.C110121a) it.next();
            if (aVar.f329465a) {
                C110108d dVar = aVar.f329466b;
                if (dVar != null) {
                    return dVar.mo150201a();
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public View mo161505b() {
        WeakReference<View> weakReference = C110120h.f329460d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
