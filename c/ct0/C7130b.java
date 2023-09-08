package ct0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: ct0.b */
public final class C7130b implements Iterator<View> {

    /* renamed from: d */
    public final ViewGroup f25103d;

    /* renamed from: e */
    public int f25104e = 0;

    public C7130b(ViewGroup viewGroup) {
        this.f25103d = viewGroup;
    }

    public boolean hasNext() {
        return this.f25104e < this.f25103d.getChildCount();
    }

    public Object next() {
        ViewGroup viewGroup = this.f25103d;
        int i = this.f25104e;
        this.f25104e = i + 1;
        return viewGroup.getChildAt(i);
    }

    public void remove() {
        this.f25103d.removeViewAt(this.f25104e - 1);
    }
}
