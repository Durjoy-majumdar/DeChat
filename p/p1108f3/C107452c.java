package p1108f3;

import android.view.accessibility.AccessibilityManager;

/* renamed from: f3.c */
public final class C107452c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C107451b f321471a;

    public C107452c(C107451b bVar) {
        this.f321471a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107452c)) {
            return false;
        }
        return this.f321471a.equals(((C107452c) obj).f321471a);
    }

    public int hashCode() {
        return this.f321471a.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z) {
        this.f321471a.onTouchExplorationStateChanged(z);
    }
}
