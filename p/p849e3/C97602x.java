package p849e3;

import android.view.View;
import android.view.ViewGroup;
import hy3.C33145a;
import java.util.Iterator;

/* renamed from: e3.x */
public final class C97602x implements Iterator<View>, C33145a {

    /* renamed from: d */
    public int f286331d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f286332e;

    public C97602x(ViewGroup viewGroup) {
        this.f286332e = viewGroup;
    }

    public boolean hasNext() {
        return this.f286331d < this.f286332e.getChildCount();
    }

    public Object next() {
        ViewGroup viewGroup = this.f286332e;
        int i = this.f286331d;
        this.f286331d = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove() {
        ViewGroup viewGroup = this.f286332e;
        int i = this.f286331d - 1;
        this.f286331d = i;
        viewGroup.removeViewAt(i);
    }
}
