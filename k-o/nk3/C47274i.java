package nk3;

import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: nk3.i */
public final class C47274i extends C112968x {

    /* renamed from: i */
    public final ArrayList<UIComponentFragment> f126898i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47274i(FragmentManager fragmentManager, ArrayList<UIComponentFragment> arrayList) {
        super(fragmentManager, 0);
        C87412m.m108594g(fragmentManager, "fm");
        C87412m.m108594g(arrayList, "fragmentList");
        this.f126898i = arrayList;
    }

    public int getCount() {
        return this.f126898i.size();
    }

    public Fragment getItem(int i) {
        UIComponentFragment uIComponentFragment = this.f126898i.get(i);
        C87412m.m108593f(uIComponentFragment, "fragmentList[position]");
        return uIComponentFragment;
    }
}
