package sr1;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Set;
import z04.C112551y;

/* renamed from: sr1.f */
public abstract class C118287f extends C103853a {

    /* renamed from: d */
    public final FragmentManager f353532d;

    /* renamed from: e */
    public FragmentManager f353533e;

    /* renamed from: f */
    public C112919c0 f353534f;

    /* renamed from: g */
    public final ArrayList<Fragment.SavedState> f353535g = new ArrayList<>();

    /* renamed from: h */
    public final ArrayList<Fragment> f353536h = new ArrayList<>();

    /* renamed from: i */
    public Fragment f353537i;

    public C118287f(FragmentManager fragmentManager) {
        C87412m.m108594g(fragmentManager, "fm");
        this.f353532d = fragmentManager;
        this.f353533e = fragmentManager;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(obj, "object");
        Fragment fragment = (Fragment) obj;
        if (this.f353534f == null) {
            FragmentManager fragmentManager = this.f353533e;
            C87412m.m108591d(fragmentManager);
            this.f353534f = fragmentManager.beginTransaction();
        }
        while (this.f353535g.size() <= i) {
            this.f353535g.add((Object) null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f353535g;
        if (fragment.isAdded()) {
            FragmentManager fragmentManager2 = this.f353533e;
            C87412m.m108591d(fragmentManager2);
            savedState = fragmentManager2.saveFragmentInstanceState(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f353536h.set(i, (Object) null);
        C112919c0 c0Var = this.f353534f;
        C87412m.m108591d(c0Var);
        c0Var.mo165169k(fragment);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "container");
        C112919c0 c0Var = this.f353534f;
        if (c0Var != null) {
            C87412m.m108591d(c0Var);
            c0Var.mo165165g();
            this.f353534f = null;
        }
    }

    public abstract Fragment getItem(int i);

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        C87412m.m108594g(viewGroup, "container");
        if (this.f353536h.size() > i && (fragment = this.f353536h.get(i)) != null) {
            return fragment;
        }
        if (this.f353534f == null) {
            FragmentManager fragmentManager = this.f353533e;
            C87412m.m108591d(fragmentManager);
            this.f353534f = fragmentManager.beginTransaction();
        }
        Fragment item = getItem(i);
        if (this.f353535g.size() > i && (savedState = this.f353535g.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.f353536h.size() <= i) {
            this.f353536h.add((Object) null);
        }
        item.setMenuVisibility(false);
        item.setUserVisibleHint(false);
        this.f353536h.set(i, item);
        C112919c0 c0Var = this.f353534f;
        C87412m.m108591d(c0Var);
        c0Var.mo165167i(viewGroup.getId(), item, (String) null, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("instantiateItem: title:");
        FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) item;
        sb.append(finderHomeTabFragment.f17332j);
        sb.append(" tabType:");
        sb.append(finderHomeTabFragment.f17334o);
        Log.m105924i("Finder.DynamicAdapter", sb.toString());
        return item;
    }

    public boolean isViewFromObject(View view, Object obj) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(obj, "object");
        return ((Fragment) obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f353535g.clear();
            this.f353536h.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    ArrayList<Fragment.SavedState> arrayList = this.f353535g;
                    C87412m.m108592e(parcelable2, "null cannot be cast to non-null type androidx.fragment.app.Fragment.SavedState");
                    arrayList.add((Fragment.SavedState) parcelable2);
                }
            }
            Set<String> keySet = bundle.keySet();
            C87412m.m108593f(keySet, "bundle.keySet()");
            for (T next : keySet) {
                C87412m.m108592e(next, "null cannot be cast to non-null type kotlin.String");
                String str = (String) next;
                if (C112551y.m153819s(str, "f", false)) {
                    String substring = str.substring(1);
                    C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                    int parseInt = Integer.parseInt(substring);
                    FragmentManager fragmentManager = this.f353533e;
                    C87412m.m108591d(fragmentManager);
                    Fragment fragment = fragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.f353536h.size() <= parseInt) {
                            this.f353536h.add((Object) null);
                        }
                        fragment.setMenuVisibility(false);
                        this.f353536h.set(parseInt, fragment);
                    } else {
                        Log.m105928w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    public Parcelable saveState() {
        Bundle bundle;
        if (this.f353535g.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f353535g.size()];
            this.f353535g.toArray(savedStateArr);
            bundle.putParcelableArray("states", (Parcelable[]) savedStateArr);
        } else {
            bundle = null;
        }
        int size = this.f353536h.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f353536h.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder();
                sb.append('f');
                sb.append(i);
                String sb4 = sb.toString();
                FragmentManager fragmentManager = this.f353533e;
                C87412m.m108591d(fragmentManager);
                fragmentManager.putFragment(bundle, sb4, fragment);
            }
        }
        return bundle;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        C87412m.m108594g(viewGroup, "container");
        C87412m.m108594g(obj, "object");
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f353537i;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                C87412m.m108591d(fragment2);
                fragment2.setMenuVisibility(false);
                Fragment fragment3 = this.f353537i;
                C87412m.m108591d(fragment3);
                fragment3.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f353537i = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "container");
        if (!(viewGroup.getId() != -1)) {
            throw new IllegalStateException(("ViewPager with adapter " + this + " requires a view id").toString());
        }
    }
}
