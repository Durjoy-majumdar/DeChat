package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class C112842b {
    private CopyOnWriteArrayList<C112841a> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public C112842b(boolean z) {
        this.mEnabled = z;
    }

    public void addCancellable(C112841a aVar) {
        this.mCancellables.add(aVar);
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.mEnabled;
    }

    public final void remove() {
        Iterator<C112841a> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void removeCancellable(C112841a aVar) {
        this.mCancellables.remove(aVar);
    }

    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }
}
