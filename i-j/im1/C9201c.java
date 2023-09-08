package im1;

import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import gy3.C87412m;
import java.util.List;

/* renamed from: im1.c */
public class C9201c extends C112968x {

    /* renamed from: i */
    public final List<Fragment> f28940i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9201c(FragmentManager fragmentManager, List<? extends Fragment> list) {
        super(fragmentManager, 0);
        C87412m.m108594g(fragmentManager, "fm");
        C87412m.m108594g(list, "fragments");
        this.f28940i = list;
    }

    public int getCount() {
        return this.f28940i.size();
    }

    public Fragment getItem(int i) {
        return this.f28940i.get(i);
    }
}
