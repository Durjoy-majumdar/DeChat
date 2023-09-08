package p176jc;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p176jc.C108699q;
import p993kc.C88135b;

/* renamed from: jc.r */
public final class C87937r extends C88135b {
    /* renamed from: a */
    public View mo122406a() {
        WeakReference<View> weakReference = C108699q.f325535d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public Context mo122407b() {
        Iterator it = ((ArrayList) C108699q.f325539h).iterator();
        while (it.hasNext()) {
            C108699q.C87935a aVar = (C108699q.C87935a) it.next();
            if (aVar.f254494a) {
                C88135b bVar = aVar.f254495b;
                if (bVar != null) {
                    return bVar.mo122407b();
                }
                return null;
            }
        }
        return null;
    }
}
