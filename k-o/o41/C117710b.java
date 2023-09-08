package o41;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o41.b */
public class C117710b<T> {

    /* renamed from: a */
    public List<WeakReference<View>> f352037a = new ArrayList();

    /* renamed from: b */
    public int f352038b;

    public C117710b(int i) {
        if ((i >>> 24) >= 2) {
            this.f352038b = i;
            return;
        }
        throw new IllegalArgumentException("[WeakViewMap] argument tagKey must pass an application specific resource id.");
    }

    /* renamed from: a */
    public final void mo182407a() {
        Iterator it = ((ArrayList) this.f352037a).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public boolean mo182408b(View view) {
        if (view == null) {
            return false;
        }
        mo182407a();
        Iterator it = ((ArrayList) this.f352037a).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference != null && weakReference.get() == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public T mo182409c(View view) {
        T tag;
        if (view == null) {
            return null;
        }
        mo182407a();
        if (!mo182408b(view) || (tag = view.getTag(this.f352038b)) == null) {
            return null;
        }
        return tag;
    }
}
