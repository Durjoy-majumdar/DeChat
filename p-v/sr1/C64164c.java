package sr1;

import android.view.ViewGroup;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C39623j;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: sr1.c */
public final class C64164c extends C112968x {

    /* renamed from: i */
    public final FragmentManager f181883i;

    /* renamed from: j */
    public final List<Fragment> f181884j;

    /* renamed from: n */
    public final int f181885n;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C64164c(FragmentManager fragmentManager, List list, int i, int i2, C8480h hVar) {
        this(fragmentManager, list, (i2 & 4) != 0 ? 0 : i);
    }

    public int getCount() {
        return this.f181884j.size();
    }

    public Fragment getItem(int i) {
        return this.f181884j.get(i);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "container");
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C87412m.m108593f(instantiateItem, "super.instantiateItem(container, position)");
        if (this.f181885n == 1) {
            Field declaredField = C112968x.class.getDeclaredField("f");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            C112919c0 c0Var = obj instanceof C112919c0 ? (C112919c0) obj : null;
            if (c0Var != null) {
                c0Var.mo165170n((Fragment) instantiateItem, C39623j.C39626c.INITIALIZED);
            }
        }
        return instantiateItem;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64164c(FragmentManager fragmentManager, List<? extends Fragment> list, int i) {
        super(fragmentManager, i);
        C87412m.m108594g(fragmentManager, "fm");
        C87412m.m108594g(list, "fragments");
        this.f181883i = fragmentManager;
        this.f181884j = list;
        this.f181885n = i;
    }
}
