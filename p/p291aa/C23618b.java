package p291aa;

/* renamed from: aa.b */
public abstract class C23618b implements Cloneable {

    /* renamed from: d */
    public transient int f67798d;

    /* renamed from: e */
    public transient int f67799e;

    /* renamed from: f */
    public transient int f67800f;

    /* renamed from: g */
    public final float f67801g = 0.8f;

    /* renamed from: h */
    public int f67802h;

    public C23618b() {
        mo37133r(((int) (((float) 4) / 0.8f)) + 1);
    }

    public void clear() {
        this.f67798d = 0;
        this.f67799e = mo37125f();
        this.f67800f = 0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public abstract int mo37125f();

    public boolean isEmpty() {
        return this.f67798d == 0;
    }

    /* renamed from: k */
    public final void mo37127k() {
        if (this.f67800f > this.f67798d && mo37125f() > 42) {
            mo37131o(C112762a.m154255a(((int) (((float) this.f67798d) / this.f67801g)) + 2));
            mo37128l(mo37125f());
        }
    }

    /* renamed from: l */
    public final void mo37128l(int i) {
        this.f67802h = Math.min(i - 1, (int) (((float) i) * this.f67801g));
        this.f67799e = i - this.f67798d;
        this.f67800f = 0;
    }

    /* renamed from: m */
    public void mo37129m(int i) {
        int i2 = this.f67802h;
        int i3 = this.f67798d;
        if (i > i2 - i3) {
            mo37131o(C112762a.m154255a(((int) (((float) i) + (((float) i3) / this.f67801g))) + 2));
            mo37128l(mo37125f());
        }
    }

    /* renamed from: n */
    public final void mo37130n(boolean z) {
        if (z) {
            this.f67799e--;
        } else {
            this.f67800f--;
        }
        int i = this.f67798d + 1;
        this.f67798d = i;
        if (i > this.f67802h || this.f67799e == 0) {
            mo37131o(C112762a.m154255a(mo37125f() << 1));
            mo37128l(mo37125f());
        }
    }

    /* renamed from: o */
    public abstract void mo37131o(int i);

    /* renamed from: p */
    public abstract void mo37132p(int i);

    /* renamed from: r */
    public abstract int mo37133r(int i);

    public int size() {
        return this.f67798d;
    }
}
