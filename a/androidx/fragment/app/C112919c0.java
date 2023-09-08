package androidx.fragment.app;

import androidx.lifecycle.C39623j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c0 */
public abstract class C112919c0 {

    /* renamed from: a */
    public ArrayList<C112920a> f338026a = new ArrayList<>();

    /* renamed from: b */
    public int f338027b;

    /* renamed from: c */
    public int f338028c;

    /* renamed from: d */
    public int f338029d;

    /* renamed from: e */
    public int f338030e;

    /* renamed from: f */
    public int f338031f;

    /* renamed from: g */
    public boolean f338032g;

    /* renamed from: h */
    public boolean f338033h = true;

    /* renamed from: i */
    public String f338034i;

    /* renamed from: j */
    public int f338035j;

    /* renamed from: k */
    public CharSequence f338036k;

    /* renamed from: l */
    public int f338037l;

    /* renamed from: m */
    public CharSequence f338038m;

    /* renamed from: n */
    public ArrayList<String> f338039n;

    /* renamed from: o */
    public ArrayList<String> f338040o;

    /* renamed from: p */
    public boolean f338041p = false;

    /* renamed from: androidx.fragment.app.c0$a */
    public static final class C112920a {

        /* renamed from: a */
        public int f338042a;

        /* renamed from: b */
        public Fragment f338043b;

        /* renamed from: c */
        public int f338044c;

        /* renamed from: d */
        public int f338045d;

        /* renamed from: e */
        public int f338046e;

        /* renamed from: f */
        public int f338047f;

        /* renamed from: g */
        public C39623j.C39626c f338048g;

        /* renamed from: h */
        public C39623j.C39626c f338049h;

        public C112920a() {
        }

        public C112920a(int i, Fragment fragment) {
            this.f338042a = i;
            this.f338043b = fragment;
            C39623j.C39626c cVar = C39623j.C39626c.RESUMED;
            this.f338048g = cVar;
            this.f338049h = cVar;
        }

        public C112920a(int i, Fragment fragment, C39623j.C39626c cVar) {
            this.f338042a = i;
            this.f338043b = fragment;
            this.f338048g = fragment.mMaxState;
            this.f338049h = cVar;
        }
    }

    @Deprecated
    public C112919c0() {
    }

    /* renamed from: b */
    public void mo165198b(C112920a aVar) {
        this.f338026a.add(aVar);
        aVar.f338044c = this.f338027b;
        aVar.f338045d = this.f338028c;
        aVar.f338046e = this.f338029d;
        aVar.f338047f = this.f338030e;
    }

    /* renamed from: c */
    public C112919c0 mo165199c(String str) {
        if (this.f338033h) {
            this.f338032g = true;
            this.f338034i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: d */
    public abstract int mo165162d();

    /* renamed from: e */
    public abstract int mo165163e();

    /* renamed from: f */
    public abstract void mo165164f();

    /* renamed from: g */
    public abstract void mo165165g();

    /* renamed from: h */
    public C112919c0 mo165166h(Fragment fragment) {
        mo165198b(new C112920a(6, fragment));
        return this;
    }

    /* renamed from: i */
    public void mo165167i(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo165198b(new C112920a(i2, fragment));
    }

    /* renamed from: j */
    public C112919c0 mo165168j(Fragment fragment) {
        mo165198b(new C112920a(4, fragment));
        return this;
    }

    /* renamed from: k */
    public C112919c0 mo165169k(Fragment fragment) {
        mo165198b(new C112920a(3, fragment));
        return this;
    }

    /* renamed from: l */
    public C112919c0 mo165200l(int i, Fragment fragment) {
        if (i != 0) {
            mo165167i(i, fragment, (String) null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: m */
    public C112919c0 mo165201m(int i, int i2, int i3, int i4) {
        this.f338027b = i;
        this.f338028c = i2;
        this.f338029d = i3;
        this.f338030e = i4;
        return this;
    }

    /* renamed from: n */
    public C112919c0 mo165170n(Fragment fragment, C39623j.C39626c cVar) {
        mo165198b(new C112920a(10, fragment, cVar));
        return this;
    }

    /* renamed from: o */
    public C112919c0 mo165171o(Fragment fragment) {
        mo165198b(new C112920a(5, fragment));
        return this;
    }

    public C112919c0(C112949q qVar, ClassLoader classLoader) {
    }
}
