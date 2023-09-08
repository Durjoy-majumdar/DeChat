package p849e3;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
import java.util.WeakHashMap;
import p849e3.C107207u;

/* renamed from: e3.l */
public class C107200l {

    /* renamed from: a */
    public ViewParent f320800a;

    /* renamed from: b */
    public ViewParent f320801b;

    /* renamed from: c */
    public final View f320802c;

    /* renamed from: d */
    public boolean f320803d;

    /* renamed from: e */
    public int[] f320804e;

    public C107200l(View view) {
        this.f320802c = view;
    }

    /* renamed from: a */
    public boolean mo157664a(float f, float f2, boolean z) {
        ViewParent g;
        if (!this.f320803d || (g = mo157670g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedFling(this.f320802c, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(g);
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo157665b(float f, float f2) {
        ViewParent g;
        if (!this.f320803d || (g = mo157670g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedPreFling(this.f320802c, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(g);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo157666c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo157667d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo157667d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent g;
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int[] iArr4 = iArr2;
        int i8 = i3;
        if (!this.f320803d || (g = mo157670g(i8)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        if (iArr4 != null) {
            this.f320802c.getLocationInWindow(iArr4);
            i5 = iArr4[0];
            i4 = iArr4[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f320804e == null) {
                this.f320804e = new int[2];
            }
            iArr3 = this.f320804e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f320802c;
        if (g instanceof C107201m) {
            ((C107201m) g).mo77719n(view, i, i2, iArr3, i3);
        } else if (i8 == 0) {
            try {
                g.onNestedPreScroll(view, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(g);
            }
        }
        if (iArr4 != null) {
            this.f320802c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i5;
            iArr4[1] = iArr4[1] - i4;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public boolean mo157668e(int i, int i2, int i3, int i4, int[] iArr) {
        return mo157669f(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: f */
    public final boolean mo157669f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent g;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.f320803d || (g = mo157670g(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f320802c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f320804e == null) {
                this.f320804e = new int[2];
            }
            int[] iArr5 = this.f320804e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f320802c;
        if (g instanceof C107202n) {
            ((C107202n) g).mo145018v(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (g instanceof C107201m) {
                ((C107201m) g).mo77727j(view, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                try {
                    g.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(g);
                }
            }
        }
        if (iArr4 != null) {
            this.f320802c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: g */
    public final ViewParent mo157670g(int i) {
        if (i == 0) {
            return this.f320800a;
        }
        if (i != 1) {
            return null;
        }
        return this.f320801b;
    }

    /* renamed from: h */
    public boolean mo157671h(int i) {
        return mo157670g(i) != null;
    }

    /* renamed from: i */
    public void mo157672i(boolean z) {
        if (this.f320803d) {
            View view = this.f320802c;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107213g.m145241z(view);
        }
        this.f320803d = z;
    }

    /* renamed from: j */
    public boolean mo157673j(int i, int i2) {
        boolean z;
        if (mo157671h(i2)) {
            return true;
        }
        if (this.f320803d) {
            View view = this.f320802c;
            for (ViewParent parent = this.f320802c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f320802c;
                boolean z2 = parent instanceof C107201m;
                if (z2) {
                    z = ((C107201m) parent).mo77716Z(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f320800a = parent;
                    } else if (i2 == 1) {
                        this.f320801b = parent;
                    }
                    View view3 = this.f320802c;
                    if (z2) {
                        ((C107201m) parent).mo77725g(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo157674k(int i) {
        ViewParent g = mo157670g(i);
        if (g != null) {
            View view = this.f320802c;
            if (g instanceof C107201m) {
                ((C107201m) g).mo77718i(view, i);
            } else if (i == 0) {
                try {
                    g.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(g);
                }
            }
            if (i == 0) {
                this.f320800a = null;
            } else if (i == 1) {
                this.f320801b = null;
            }
        }
    }
}
