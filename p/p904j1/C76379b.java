package p904j1;

import android.view.KeyEvent;
import gy3.C87412m;

/* renamed from: j1.b */
public final class C76379b {

    /* renamed from: a */
    public final KeyEvent f223658a;

    public /* synthetic */ C76379b(KeyEvent keyEvent) {
        this.f223658a = keyEvent;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C76379b) && C87412m.m108589b(this.f223658a, ((C76379b) obj).f223658a);
    }

    public int hashCode() {
        return this.f223658a.hashCode();
    }

    public String toString() {
        KeyEvent keyEvent = this.f223658a;
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }
}
