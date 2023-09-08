package p853i4;

import android.view.View;
import android.view.WindowId;

/* renamed from: i4.c0 */
public class C108340c0 implements C108342d0 {

    /* renamed from: a */
    public final WindowId f324369a;

    public C108340c0(View view) {
        this.f324369a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C108340c0) && ((C108340c0) obj).f324369a.equals(this.f324369a);
    }

    public int hashCode() {
        return this.f324369a.hashCode();
    }
}
