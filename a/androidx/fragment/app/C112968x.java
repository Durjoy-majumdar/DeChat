package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C112919c0;
import androidx.lifecycle.C39623j;
import androidx.viewpager.widget.C103853a;
import com.tencent.xweb.file.XVFSFile;

@Deprecated
/* renamed from: androidx.fragment.app.x */
public abstract class C112968x extends C103853a {

    /* renamed from: d */
    public final FragmentManager f338180d;

    /* renamed from: e */
    public final int f338181e;

    /* renamed from: f */
    public C112919c0 f338182f = null;

    /* renamed from: g */
    public Fragment f338183g = null;

    /* renamed from: h */
    public boolean f338184h;

    public C112968x(FragmentManager fragmentManager, int i) {
        this.f338180d = fragmentManager;
        this.f338181e = i;
    }

    /* renamed from: a */
    public long mo66851a(int i) {
        return (long) i;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f338182f == null) {
            this.f338182f = this.f338180d.beginTransaction();
        }
        this.f338182f.mo165166h(fragment);
        if (fragment.equals(this.f338183g)) {
            this.f338183g = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void finishUpdate(ViewGroup viewGroup) {
        C112919c0 c0Var = this.f338182f;
        if (c0Var != null) {
            if (!this.f338184h) {
                try {
                    this.f338184h = true;
                    c0Var.mo165165g();
                    this.f338184h = false;
                } catch (Throwable th) {
                    this.f338184h = false;
                    throw th;
                }
            }
            this.f338182f = null;
        }
    }

    public abstract Fragment getItem(int i);

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f338182f == null) {
            this.f338182f = this.f338180d.beginTransaction();
        }
        long a = mo66851a(i);
        int id = viewGroup.getId();
        Fragment findFragmentByTag = this.f338180d.findFragmentByTag("android:switcher:" + id + XVFSFile.PATH_SEPARATOR + a);
        if (findFragmentByTag != null) {
            C112919c0 c0Var = this.f338182f;
            c0Var.getClass();
            c0Var.mo165198b(new C112919c0.C112920a(7, findFragmentByTag));
        } else {
            findFragmentByTag = getItem(i);
            C112919c0 c0Var2 = this.f338182f;
            int id4 = viewGroup.getId();
            int id5 = viewGroup.getId();
            c0Var2.mo165167i(id4, findFragmentByTag, "android:switcher:" + id5 + XVFSFile.PATH_SEPARATOR + a, 1);
        }
        if (findFragmentByTag != this.f338183g) {
            findFragmentByTag.setMenuVisibility(false);
            if (this.f338181e == 1) {
                this.f338182f.mo165170n(findFragmentByTag, C39623j.C39626c.STARTED);
            } else {
                findFragmentByTag.setUserVisibleHint(false);
            }
        }
        return findFragmentByTag;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f338183g;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f338181e == 1) {
                    if (this.f338182f == null) {
                        this.f338182f = this.f338180d.beginTransaction();
                    }
                    this.f338182f.mo165170n(this.f338183g, C39623j.C39626c.STARTED);
                } else {
                    this.f338183g.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f338181e == 1) {
                if (this.f338182f == null) {
                    this.f338182f = this.f338180d.beginTransaction();
                }
                this.f338182f.mo165170n(fragment, C39623j.C39626c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f338183g = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
