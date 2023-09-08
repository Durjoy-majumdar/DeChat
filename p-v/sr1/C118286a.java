package sr1;

import android.view.ViewGroup;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sr1.a */
public final class C118286a<FragmentType> extends C118287f {

    /* renamed from: j */
    public final List<FragmentType> f353528j;

    /* renamed from: n */
    public C64160a f353529n;

    /* renamed from: o */
    public List<C64160a> f353530o = new ArrayList();

    /* renamed from: p */
    public List<FragmentType> f353531p = new ArrayList();

    /* renamed from: sr1.a$a */
    public static final class C64160a {

        /* renamed from: a */
        public final boolean f181876a;

        /* renamed from: b */
        public final int f181877b;

        public C64160a(boolean z, int i) {
            this.f181876a = z;
            this.f181877b = i;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118286a(ViewPager viewPager, FragmentManager fragmentManager, List<FragmentType> list) {
        super(fragmentManager);
        C87412m.m108594g(viewPager, "viewPager");
        C87412m.m108594g(fragmentManager, "manager");
        C87412m.m108594g(list, "pageFragments");
        this.f353528j = list;
    }

    /* renamed from: a */
    public final void mo183059a(C64160a aVar, FragmentType fragmenttype) {
        C87412m.m108594g(aVar, "action");
        this.f353529n = aVar;
        Log.m105924i("Finder.DynamicAdapter", "notifyItemChange isAdd:" + aVar.f181876a + " position " + aVar.f181877b);
        if (aVar.f181876a) {
            int i = aVar.f181877b;
            if (fragmenttype == null) {
                return;
            }
            if (i < 0 || i > this.f353528j.size()) {
                Log.m105920e("Finder.DynamicAdapter", "notifyAddItem index out of range");
                return;
            }
            List<FragmentType> list = this.f353528j;
            if (!(!list.contains(fragmenttype))) {
                list = null;
            }
            if (list != null) {
                list.add(i, fragmenttype);
            }
            notifyDataSetChanged();
            return;
        }
        int i2 = aVar.f181877b;
        if (i2 < 0 || i2 >= this.f353528j.size()) {
            Log.m105920e("Finder.DynamicAdapter", "notifyRemoveItem index out of range");
            return;
        }
        this.f353528j.remove(i2);
        notifyDataSetChanged();
    }

    public void finishUpdate(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "container");
        super.finishUpdate(viewGroup);
        Log.m105924i("Finder.DynamicAdapter", "finishUpdate");
    }

    public int getCount() {
        return this.f353528j.size();
    }

    public Fragment getItem(int i) {
        FragmentType fragmenttype = this.f353528j.get(i);
        C87412m.m108592e(fragmenttype, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        Fragment fragment = (Fragment) fragmenttype;
        if (fragment instanceof FinderHomeTabFragment) {
            StringBuilder sb = new StringBuilder();
            sb.append("getItem ");
            sb.append(i);
            sb.append(" fragment:");
            FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) fragment;
            sb.append(finderHomeTabFragment.f17332j);
            sb.append(" tabType:");
            sb.append(finderHomeTabFragment.f17334o);
            Log.m105924i("Finder.DynamicAdapter", sb.toString());
        }
        return fragment;
    }

    public int getItemPosition(Object obj) {
        C64160a aVar;
        C87412m.m108594g(obj, "object");
        int itemPosition = super.getItemPosition(obj);
        Log.m105924i("Finder.DynamicAdapter", "getItemPosition : position " + itemPosition);
        if (!(obj instanceof Fragment) || (aVar = this.f353529n) == null) {
            return itemPosition;
        }
        int indexOf = this.f353528j.indexOf(obj);
        Log.m105924i("Finder.DynamicAdapter", "getItemPosition : newPosition " + indexOf + " changePosition :" + aVar.f181877b);
        if (indexOf == -1) {
            return -2;
        }
        if (indexOf >= aVar.f181877b) {
            Log.m105924i("Finder.DynamicAdapter", "use new " + indexOf);
            return indexOf;
        }
        Log.m105924i("Finder.DynamicAdapter", "unchanged");
        return -1;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment fragment;
        Fragment.SavedState savedState;
        C87412m.m108594g(viewGroup, "container");
        Log.m105924i("Finder.DynamicAdapter", "instantiateItem " + i + " action:" + this.f353529n);
        C64160a aVar = this.f353529n;
        if (aVar == null || !aVar.f181876a) {
            return super.instantiateItem(viewGroup, i);
        }
        if (i == this.f353536h.size()) {
            return super.instantiateItem(viewGroup, i);
        }
        ArrayList<Fragment> arrayList = this.f353536h;
        if (i < arrayList.size()) {
            if (this.f353534f == null) {
                this.f353534f = this.f353532d.beginTransaction();
            }
            fragment = getItem(i);
            if (this.f353535g.size() > i && (savedState = this.f353535g.get(i)) != null) {
                fragment.setInitialSavedState(savedState);
            }
            fragment.setMenuVisibility(false);
            fragment.setUserVisibleHint(false);
            arrayList.add(i, fragment);
            StringBuilder sb = new StringBuilder();
            sb.append("instantiateItemInner: title:");
            FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) fragment;
            sb.append(finderHomeTabFragment.f17332j);
            sb.append(" tabType:");
            sb.append(finderHomeTabFragment.f17334o);
            Log.m105924i("Finder.DynamicAdapter", sb.toString());
            C112919c0 c0Var = this.f353534f;
            if (c0Var != null) {
                c0Var.mo165167i(viewGroup.getId(), fragment, (String) null, 1);
            }
        } else {
            fragment = null;
        }
        return fragment == null ? super.instantiateItem(viewGroup, i) : fragment;
    }

    public void notifyDataSetChanged() {
        Log.m105924i("Finder.DynamicAdapter", "notifyDataSetChanged");
        super.notifyDataSetChanged();
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(obj, "object");
        StringBuilder sb = new StringBuilder();
        sb.append("setPrimaryItem ");
        sb.append(i);
        sb.append("  changePosition ");
        C64160a aVar = this.f353529n;
        sb.append(aVar != null ? Integer.valueOf(aVar.f181877b) : null);
        sb.append(", obj:");
        sb.append(obj);
        sb.append(" title:");
        FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) obj;
        sb.append(finderHomeTabFragment.f17332j);
        sb.append(" tabType:");
        sb.append(finderHomeTabFragment.f17334o);
        Log.m105924i("Finder.DynamicAdapter", sb.toString());
        super.setPrimaryItem(viewGroup, i, obj);
        C64160a aVar2 = this.f353529n;
        if (aVar2 != null && aVar2.f181877b == i) {
            Log.m105924i("Finder.DynamicAdapter", "setPrimaryItem action null");
            this.f353529n = null;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "container");
        super.startUpdate(viewGroup);
        Log.m105924i("Finder.DynamicAdapter", "startUpdate");
    }
}
