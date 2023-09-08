package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39623j;
import androidx.viewpager.widget.C103853a;
import java.util.ArrayList;

@Deprecated
/* renamed from: androidx.fragment.app.a0 */
public abstract class C112911a0 extends C103853a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private C112919c0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;
    private ArrayList<Fragment> mFragments;
    private ArrayList<Fragment.SavedState> mSavedState;

    @Deprecated
    public C112911a0(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        while (this.mSavedState.size() <= i) {
            this.mSavedState.add((Object) null);
        }
        this.mSavedState.set(i, fragment.isAdded() ? this.mFragmentManager.saveFragmentInstanceState(fragment) : null);
        this.mFragments.set(i, (Object) null);
        this.mCurTransaction.mo165169k(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void finishUpdate(ViewGroup viewGroup) {
        C112919c0 c0Var = this.mCurTransaction;
        if (c0Var != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    c0Var.mo165165g();
                    this.mExecutingFinishUpdate = false;
                } catch (Throwable th) {
                    this.mExecutingFinishUpdate = false;
                    throw th;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i);

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.mFragments.size() > i && (fragment = this.mFragments.get(i)) != null) {
            return fragment;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.beginTransaction();
        }
        Fragment item = getItem(i);
        if (this.mSavedState.size() > i && (savedState = this.mSavedState.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mFragments.size() <= i) {
            this.mFragments.add((Object) null);
        }
        item.setMenuVisibility(false);
        if (this.mBehavior == 0) {
            item.setUserVisibleHint(false);
        }
        this.mFragments.set(i, item);
        this.mCurTransaction.mo165167i(viewGroup.getId(), item, (String) null, 1);
        if (this.mBehavior == 1) {
            this.mCurTransaction.mo165170n(item, C39623j.C39626c.STARTED);
        }
        return item;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.mFragmentManager.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.mFragments.size() <= parseInt) {
                            this.mFragments.add((Object) null);
                        }
                        fragment.setMenuVisibility(false);
                        this.mFragments.set(parseInt, fragment);
                    }
                }
            }
        }
    }

    public Parcelable saveState() {
        Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.mFragments.size(); i++) {
            Fragment fragment = this.mFragments.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.mFragmentManager.putFragment(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.beginTransaction();
                    }
                    this.mCurTransaction.mo165170n(this.mCurrentPrimaryItem, C39623j.C39626c.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.beginTransaction();
                }
                this.mCurTransaction.mo165170n(fragment, C39623j.C39626c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public C112911a0(FragmentManager fragmentManager, int i) {
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList<>();
        this.mFragments = new ArrayList<>();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i;
    }
}
