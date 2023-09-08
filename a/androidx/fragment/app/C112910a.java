package androidx.fragment.app;

import androidx.fragment.app.C112919c0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C39623j;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: androidx.fragment.app.a */
public final class C112910a extends C112919c0 implements FragmentManager.C112900k, FragmentManager.C112903p {

    /* renamed from: q */
    public final FragmentManager f338004q;

    /* renamed from: r */
    public boolean f338005r;

    /* renamed from: s */
    public int f338006s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112910a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().f338160e.getClassLoader() : null);
        this.f338006s = -1;
        this.f338004q = fragmentManager;
    }

    /* renamed from: w */
    public static boolean m154457w(C112919c0.C112920a aVar) {
        Fragment fragment = aVar.f338043b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    /* renamed from: a */
    public boolean mo165139a(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f338032g) {
            return true;
        }
        this.f338004q.addBackStackState(this);
        return true;
    }

    /* renamed from: d */
    public int mo165162d() {
        return mo165173q(false);
    }

    /* renamed from: e */
    public int mo165163e() {
        return mo165173q(true);
    }

    /* renamed from: f */
    public void mo165164f() {
        if (!this.f338032g) {
            this.f338033h = false;
            this.f338004q.execSingleAction(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: g */
    public void mo165165g() {
        if (!this.f338032g) {
            this.f338033h = false;
            this.f338004q.execSingleAction(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public String getName() {
        return this.f338034i;
    }

    /* renamed from: h */
    public C112919c0 mo165166h(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f338004q) {
            super.mo165166h(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: i */
    public void mo165167i(int i, Fragment fragment, String str, int i2) {
        super.mo165167i(i, fragment, str, i2);
        fragment.mFragmentManager = this.f338004q;
    }

    /* renamed from: j */
    public C112919c0 mo165168j(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f338004q) {
            super.mo165168j(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: k */
    public C112919c0 mo165169k(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f338004q) {
            super.mo165169k(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: n */
    public C112919c0 mo165170n(Fragment fragment, C39623j.C39626c cVar) {
        if (fragment.mFragmentManager != this.f338004q) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f338004q);
        } else if (cVar == C39623j.C39626c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        } else if (cVar != C39623j.C39626c.DESTROYED) {
            super.mo165170n(fragment, cVar);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    /* renamed from: o */
    public C112919c0 mo165171o(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f338004q) {
            super.mo165171o(fragment);
            return this;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: p */
    public void mo165172p(int i) {
        if (this.f338032g) {
            if (FragmentManager.isLoggingEnabled(2)) {
                toString();
            }
            int size = this.f338026a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C112919c0.C112920a aVar = this.f338026a.get(i2);
                Fragment fragment = aVar.f338043b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(aVar.f338043b);
                        int i3 = aVar.f338043b.mBackStackNesting;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public int mo165173q(boolean z) {
        if (!this.f338005r) {
            if (FragmentManager.isLoggingEnabled(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new C67091p0(FragmentManager.TAG));
                mo165174r("  ", printWriter, true);
                printWriter.close();
            }
            this.f338005r = true;
            if (this.f338032g) {
                this.f338006s = this.f338004q.allocBackStackIndex();
            } else {
                this.f338006s = -1;
            }
            this.f338004q.enqueueAction(this, z);
            return this.f338006s;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: r */
    public void mo165174r(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f338034i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f338006s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f338005r);
            if (this.f338031f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f338031f));
            }
            if (!(this.f338027b == 0 && this.f338028c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f338027b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f338028c));
            }
            if (!(this.f338029d == 0 && this.f338030e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f338029d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f338030e));
            }
            if (!(this.f338035j == 0 && this.f338036k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f338035j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f338036k);
            }
            if (!(this.f338037l == 0 && this.f338038m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f338037l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f338038m);
            }
        }
        if (!this.f338026a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f338026a.size();
            for (int i = 0; i < size; i++) {
                C112919c0.C112920a aVar = this.f338026a.get(i);
                switch (aVar.f338042a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f338042a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f338043b);
                if (z) {
                    if (!(aVar.f338044c == 0 && aVar.f338045d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f338044c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f338045d));
                    }
                    if (aVar.f338046e != 0 || aVar.f338047f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f338046e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f338047f));
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public void mo165175s() {
        int size = this.f338026a.size();
        for (int i = 0; i < size; i++) {
            C112919c0.C112920a aVar = this.f338026a.get(i);
            Fragment fragment = aVar.f338043b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setAnimations(aVar.f338044c, aVar.f338045d, aVar.f338046e, aVar.f338047f);
                fragment.setNextTransition(this.f338031f);
                fragment.setSharedElementNames(this.f338039n, this.f338040o);
            }
            switch (aVar.f338042a) {
                case 1:
                    this.f338004q.setExitAnimationOrder(fragment, false);
                    this.f338004q.addFragment(fragment);
                    break;
                case 3:
                    this.f338004q.removeFragment(fragment);
                    break;
                case 4:
                    this.f338004q.hideFragment(fragment);
                    break;
                case 5:
                    this.f338004q.setExitAnimationOrder(fragment, false);
                    this.f338004q.showFragment(fragment);
                    break;
                case 6:
                    this.f338004q.detachFragment(fragment);
                    break;
                case 7:
                    this.f338004q.setExitAnimationOrder(fragment, false);
                    this.f338004q.attachFragment(fragment);
                    break;
                case 8:
                    this.f338004q.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.f338004q.setPrimaryNavigationFragment((Fragment) null);
                    break;
                case 10:
                    this.f338004q.setMaxLifecycle(fragment, aVar.f338049h);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f338042a);
            }
            if (!this.f338041p && aVar.f338042a != 1 && fragment != null && !FragmentManager.USE_STATE_MANAGER) {
                this.f338004q.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.f338041p && !FragmentManager.USE_STATE_MANAGER) {
            FragmentManager fragmentManager = this.f338004q;
            fragmentManager.moveToState(fragmentManager.mCurState, true);
        }
    }

    /* renamed from: t */
    public void mo165176t(boolean z) {
        for (int size = this.f338026a.size() - 1; size >= 0; size--) {
            C112919c0.C112920a aVar = this.f338026a.get(size);
            Fragment fragment = aVar.f338043b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setAnimations(aVar.f338044c, aVar.f338045d, aVar.f338046e, aVar.f338047f);
                fragment.setNextTransition(FragmentManager.reverseTransit(this.f338031f));
                fragment.setSharedElementNames(this.f338040o, this.f338039n);
            }
            switch (aVar.f338042a) {
                case 1:
                    this.f338004q.setExitAnimationOrder(fragment, true);
                    this.f338004q.removeFragment(fragment);
                    break;
                case 3:
                    this.f338004q.addFragment(fragment);
                    break;
                case 4:
                    this.f338004q.showFragment(fragment);
                    break;
                case 5:
                    this.f338004q.setExitAnimationOrder(fragment, true);
                    this.f338004q.hideFragment(fragment);
                    break;
                case 6:
                    this.f338004q.attachFragment(fragment);
                    break;
                case 7:
                    this.f338004q.setExitAnimationOrder(fragment, true);
                    this.f338004q.detachFragment(fragment);
                    break;
                case 8:
                    this.f338004q.setPrimaryNavigationFragment((Fragment) null);
                    break;
                case 9:
                    this.f338004q.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.f338004q.setMaxLifecycle(fragment, aVar.f338048g);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f338042a);
            }
            if (!this.f338041p && aVar.f338042a != 3 && fragment != null && !FragmentManager.USE_STATE_MANAGER) {
                this.f338004q.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.f338041p && z && !FragmentManager.USE_STATE_MANAGER) {
            FragmentManager fragmentManager = this.f338004q;
            fragmentManager.moveToState(fragmentManager.mCurState, true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f338006s >= 0) {
            sb.append(" #");
            sb.append(this.f338006s);
        }
        if (this.f338034i != null) {
            sb.append(" ");
            sb.append(this.f338034i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo165178u(int i) {
        int size = this.f338026a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f338026a.get(i2).f338043b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v */
    public boolean mo165179v(ArrayList<C112910a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f338026a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f338026a.get(i4).f338043b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C112910a aVar = arrayList.get(i6);
                    int size2 = aVar.f338026a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f338026a.get(i7).f338043b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }
}
