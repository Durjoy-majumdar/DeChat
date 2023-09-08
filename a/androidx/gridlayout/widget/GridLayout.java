package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import androidx.legacy.widget.Space;
import com.tencent.p014mm.C0966R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import p358m3.C21481a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class GridLayout extends ViewGroup {

    /* renamed from: A */
    public static final C16587h f44582A;

    /* renamed from: B */
    public static final C16587h f44583B;

    /* renamed from: C */
    public static final C16587h f44584C;

    /* renamed from: D */
    public static final C16587h f44585D = new C16583e();

    /* renamed from: E */
    public static final C16587h f44586E = new C16584f();

    /* renamed from: F */
    public static final C16587h f44587F = new C16586g();

    /* renamed from: o */
    public static final Printer f44588o = new LogPrinter(3, GridLayout.class.getName());

    /* renamed from: p */
    public static final Printer f44589p = new C16579a();

    /* renamed from: q */
    public static final int f44590q = 3;

    /* renamed from: r */
    public static final int f44591r = 4;

    /* renamed from: s */
    public static final int f44592s = 1;

    /* renamed from: t */
    public static final int f44593t = 6;

    /* renamed from: u */
    public static final int f44594u = 5;

    /* renamed from: v */
    public static final int f44595v = 2;

    /* renamed from: w */
    public static final C16587h f44596w = new C16580b();

    /* renamed from: x */
    public static final C16587h f44597x;

    /* renamed from: y */
    public static final C16587h f44598y;

    /* renamed from: z */
    public static final C16587h f44599z;

    /* renamed from: d */
    public final C16590k f44600d;

    /* renamed from: e */
    public final C16590k f44601e;

    /* renamed from: f */
    public int f44602f;

    /* renamed from: g */
    public boolean f44603g;

    /* renamed from: h */
    public int f44604h;

    /* renamed from: i */
    public int f44605i;

    /* renamed from: j */
    public int f44606j;

    /* renamed from: n */
    public Printer f44607n;

    /* renamed from: androidx.gridlayout.widget.GridLayout$a */
    public static class C16579a implements Printer {
        public void println(String str) {
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$b */
    public static class C16580b extends C16587h {
        /* renamed from: a */
        public int mo16878a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* renamed from: c */
        public String mo16879c() {
            return "UNDEFINED";
        }

        /* renamed from: d */
        public int mo16880d(View view, int i) {
            return Integer.MIN_VALUE;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$c */
    public static class C16581c extends C16587h {
        /* renamed from: a */
        public int mo16878a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: c */
        public String mo16879c() {
            return "LEADING";
        }

        /* renamed from: d */
        public int mo16880d(View view, int i) {
            return 0;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$d */
    public static class C16582d extends C16587h {
        /* renamed from: a */
        public int mo16878a(View view, int i, int i2) {
            return i;
        }

        /* renamed from: c */
        public String mo16879c() {
            return "TRAILING";
        }

        /* renamed from: d */
        public int mo16880d(View view, int i) {
            return i;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$e */
    public static class C16583e extends C16587h {
        /* renamed from: a */
        public int mo16878a(View view, int i, int i2) {
            return i >> 1;
        }

        /* renamed from: c */
        public String mo16879c() {
            return "CENTER";
        }

        /* renamed from: d */
        public int mo16880d(View view, int i) {
            return i >> 1;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$f */
    public static class C16584f extends C16587h {

        /* renamed from: androidx.gridlayout.widget.GridLayout$f$a */
        public class C16585a extends C16591l {

            /* renamed from: d */
            public int f44611d;

            public C16585a(C16584f fVar) {
            }

            /* renamed from: a */
            public int mo16882a(GridLayout gridLayout, View view, C16587h hVar, int i, boolean z) {
                return Math.max(0, super.mo16882a(gridLayout, view, hVar, i, z));
            }

            /* renamed from: b */
            public void mo16883b(int i, int i2) {
                super.mo16883b(i, i2);
                this.f44611d = Math.max(this.f44611d, i + i2);
            }

            /* renamed from: c */
            public void mo16884c() {
                super.mo16884c();
                this.f44611d = Integer.MIN_VALUE;
            }

            /* renamed from: d */
            public int mo16885d(boolean z) {
                return Math.max(super.mo16885d(z), this.f44611d);
            }
        }

        /* renamed from: a */
        public int mo16878a(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        /* renamed from: b */
        public C16591l mo16881b() {
            return new C16585a(this);
        }

        /* renamed from: c */
        public String mo16879c() {
            return "BASELINE";
        }

        /* renamed from: d */
        public int mo16880d(View view, int i) {
            return 0;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$g */
    public static class C16586g extends C16587h {
        /* renamed from: a */
        public int mo16878a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* renamed from: c */
        public String mo16879c() {
            return "FILL";
        }

        /* renamed from: d */
        public int mo16880d(View view, int i) {
            return 0;
        }

        /* renamed from: e */
        public int mo16886e(View view, int i, int i2) {
            return i2;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$h */
    public static abstract class C16587h {
        /* renamed from: a */
        public abstract int mo16878a(View view, int i, int i2);

        /* renamed from: b */
        public C16591l mo16881b() {
            return new C16591l();
        }

        /* renamed from: c */
        public abstract String mo16879c();

        /* renamed from: d */
        public abstract int mo16880d(View view, int i);

        /* renamed from: e */
        public int mo16886e(View view, int i, int i2) {
            return i;
        }

        public String toString() {
            return "Alignment:" + mo16879c();
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$i */
    public static final class C16588i {

        /* renamed from: a */
        public final C16592m f44612a;

        /* renamed from: b */
        public final C16593n f44613b;

        /* renamed from: c */
        public boolean f44614c = true;

        public C16588i(C16592m mVar, C16593n nVar) {
            this.f44612a = mVar;
            this.f44613b = nVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f44612a);
            sb.append(" ");
            sb.append(!this.f44614c ? "+>" : "->");
            sb.append(" ");
            sb.append(this.f44613b);
            return sb.toString();
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$j */
    public static final class C16589j<K, V> extends ArrayList<Pair<K, V>> {

        /* renamed from: d */
        public final Class<K> f44615d;

        /* renamed from: e */
        public final Class<V> f44616e;

        public C16589j(Class<K> cls, Class<V> cls2) {
            this.f44615d = cls;
            this.f44616e = cls2;
        }

        /* renamed from: f */
        public C16594o<K, V> mo16889f() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance(this.f44615d, size);
            Object[] objArr2 = (Object[]) Array.newInstance(this.f44616e, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new C16594o<>(objArr, objArr2);
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$k */
    public final class C16590k {

        /* renamed from: a */
        public final boolean f44617a;

        /* renamed from: b */
        public int f44618b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f44619c = Integer.MIN_VALUE;

        /* renamed from: d */
        public C16594o<C16595p, C16591l> f44620d;

        /* renamed from: e */
        public boolean f44621e = false;

        /* renamed from: f */
        public C16594o<C16592m, C16593n> f44622f;

        /* renamed from: g */
        public boolean f44623g = false;

        /* renamed from: h */
        public C16594o<C16592m, C16593n> f44624h;

        /* renamed from: i */
        public boolean f44625i = false;

        /* renamed from: j */
        public int[] f44626j;

        /* renamed from: k */
        public boolean f44627k = false;

        /* renamed from: l */
        public int[] f44628l;

        /* renamed from: m */
        public boolean f44629m = false;

        /* renamed from: n */
        public C16588i[] f44630n;

        /* renamed from: o */
        public boolean f44631o = false;

        /* renamed from: p */
        public int[] f44632p;

        /* renamed from: q */
        public boolean f44633q = false;

        /* renamed from: r */
        public boolean f44634r;

        /* renamed from: s */
        public boolean f44635s = false;

        /* renamed from: t */
        public int[] f44636t;

        /* renamed from: u */
        public boolean f44637u = true;

        /* renamed from: v */
        public C16593n f44638v = new C16593n(0);

        /* renamed from: w */
        public C16593n f44639w = new C16593n(-100000);

        static {
            Class<GridLayout> cls = GridLayout.class;
        }

        public C16590k(boolean z) {
            this.f44617a = z;
        }

        /* renamed from: a */
        public final String mo16890a(List<C16588i> list) {
            StringBuilder sb;
            String str = this.f44617a ? "x" : "y";
            StringBuilder sb4 = new StringBuilder();
            boolean z = true;
            for (C16588i next : list) {
                if (z) {
                    z = false;
                } else {
                    sb4.append(", ");
                }
                C16592m mVar = next.f44612a;
                int i = mVar.f44644a;
                int i2 = mVar.f44645b;
                int i3 = next.f44613b.f44646a;
                if (i < i2) {
                    sb.append(str);
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i);
                    sb.append(">=");
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i2);
                    sb.append("<=");
                    i3 = -i3;
                }
                sb.append(i3);
                sb4.append(sb.toString());
            }
            return sb4.toString();
        }

        /* renamed from: b */
        public final void mo16891b(C16594o<C16592m, C16593n> oVar, boolean z) {
            C16593n[] nVarArr = (C16593n[]) oVar.f44649c;
            for (C16593n nVar : nVarArr) {
                nVar.f44646a = Integer.MIN_VALUE;
            }
            C16591l[] lVarArr = (C16591l[]) mo16896g().f44649c;
            for (int i = 0; i < lVarArr.length; i++) {
                int d = lVarArr[i].mo16885d(z);
                C16593n nVar2 = (C16593n) oVar.f44649c[oVar.f44647a[i]];
                int i2 = nVar2.f44646a;
                if (!z) {
                    d = -d;
                }
                nVar2.f44646a = Math.max(i2, d);
            }
        }

        /* renamed from: c */
        public final void mo16892c(boolean z) {
            int[] iArr = z ? this.f44626j : this.f44628l;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    GridLayout.this.getClass();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    boolean z2 = this.f44617a;
                    C16592m mVar = (z2 ? layoutParams.f44610b : layoutParams.f44609a).f44652b;
                    int i2 = z ? mVar.f44644a : mVar.f44645b;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.mo16850f(childAt, z2, z));
                }
            }
        }

        /* renamed from: d */
        public final C16594o<C16592m, C16593n> mo16893d(boolean z) {
            C16592m mVar;
            C16589j jVar = new C16589j(C16592m.class, C16593n.class);
            C16595p[] pVarArr = (C16595p[]) mo16896g().f44648b;
            int length = pVarArr.length;
            for (int i = 0; i < length; i++) {
                if (z) {
                    mVar = pVarArr[i].f44652b;
                } else {
                    C16592m mVar2 = pVarArr[i].f44652b;
                    mVar = new C16592m(mVar2.f44645b, mVar2.f44644a);
                }
                jVar.add(Pair.create(mVar, new C16593n()));
            }
            return jVar.mo16889f();
        }

        /* renamed from: e */
        public C16588i[] mo16894e() {
            if (this.f44630n == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.f44622f == null) {
                    this.f44622f = mo16893d(true);
                }
                if (!this.f44623g) {
                    mo16891b(this.f44622f, true);
                    this.f44623g = true;
                }
                C16594o<C16592m, C16593n> oVar = this.f44622f;
                int i = 0;
                while (true) {
                    C16592m[] mVarArr = (C16592m[]) oVar.f44648b;
                    if (i >= mVarArr.length) {
                        break;
                    }
                    mo16900k(arrayList, mVarArr[i], ((C16593n[]) oVar.f44649c)[i], false);
                    i++;
                }
                if (this.f44624h == null) {
                    this.f44624h = mo16893d(false);
                }
                if (!this.f44625i) {
                    mo16891b(this.f44624h, false);
                    this.f44625i = true;
                }
                C16594o<C16592m, C16593n> oVar2 = this.f44624h;
                int i2 = 0;
                while (true) {
                    C16592m[] mVarArr2 = (C16592m[]) oVar2.f44648b;
                    if (i2 >= mVarArr2.length) {
                        break;
                    }
                    mo16900k(arrayList2, mVarArr2[i2], ((C16593n[]) oVar2.f44649c)[i2], false);
                    i2++;
                }
                if (this.f44637u) {
                    int i3 = 0;
                    while (i3 < mo16895f()) {
                        int i4 = i3 + 1;
                        mo16900k(arrayList, new C16592m(i3, i4), new C16593n(0), true);
                        i3 = i4;
                    }
                }
                int f = mo16895f();
                mo16900k(arrayList, new C16592m(0, f), this.f44638v, false);
                mo16900k(arrayList2, new C16592m(f, 0), this.f44639w, false);
                C16588i[] q = mo16906q(arrayList);
                C16588i[] q2 = mo16906q(arrayList2);
                Printer printer = GridLayout.f44588o;
                Object[] objArr = (Object[]) Array.newInstance(q.getClass().getComponentType(), q.length + q2.length);
                System.arraycopy(q, 0, objArr, 0, q.length);
                System.arraycopy(q2, 0, objArr, q.length, q2.length);
                this.f44630n = (C16588i[]) objArr;
            }
            if (!this.f44631o) {
                if (this.f44622f == null) {
                    this.f44622f = mo16893d(true);
                }
                if (!this.f44623g) {
                    mo16891b(this.f44622f, true);
                    this.f44623g = true;
                }
                if (this.f44624h == null) {
                    this.f44624h = mo16893d(false);
                }
                if (!this.f44625i) {
                    mo16891b(this.f44624h, false);
                    this.f44625i = true;
                }
                this.f44631o = true;
            }
            return this.f44630n;
        }

        /* renamed from: f */
        public int mo16895f() {
            return Math.max(this.f44618b, mo16898i());
        }

        /* renamed from: g */
        public C16594o<C16595p, C16591l> mo16896g() {
            int i;
            int i2;
            if (this.f44620d == null) {
                C16589j jVar = new C16589j(C16595p.class, C16591l.class);
                int childCount = GridLayout.this.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = GridLayout.this.getChildAt(i3);
                    GridLayout.this.getClass();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    boolean z = this.f44617a;
                    C16595p pVar = z ? layoutParams.f44610b : layoutParams.f44609a;
                    jVar.add(Pair.create(pVar, pVar.mo16912a(z).mo16881b()));
                }
                this.f44620d = jVar.mo16889f();
            }
            if (!this.f44621e) {
                C16591l[] lVarArr = (C16591l[]) this.f44620d.f44649c;
                for (C16591l c : lVarArr) {
                    c.mo16884c();
                }
                int childCount2 = GridLayout.this.getChildCount();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = GridLayout.this.getChildAt(i4);
                    GridLayout.this.getClass();
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    boolean z2 = this.f44617a;
                    C16595p pVar2 = z2 ? layoutParams2.f44610b : layoutParams2.f44609a;
                    GridLayout gridLayout = GridLayout.this;
                    gridLayout.getClass();
                    if (childAt2.getVisibility() == 8) {
                        i = 0;
                    } else {
                        i = (z2 ? childAt2.getMeasuredWidth() : childAt2.getMeasuredHeight()) + gridLayout.mo16849e(childAt2, z2, true) + gridLayout.mo16849e(childAt2, z2, false);
                    }
                    if (pVar2.f44654d == 0.0f) {
                        i2 = 0;
                    } else {
                        if (this.f44636t == null) {
                            this.f44636t = new int[GridLayout.this.getChildCount()];
                        }
                        i2 = this.f44636t[i4];
                    }
                    int i5 = i + i2;
                    C16594o<C16595p, C16591l> oVar = this.f44620d;
                    C16591l lVar = (C16591l) oVar.f44649c[oVar.f44647a[i4]];
                    GridLayout gridLayout2 = GridLayout.this;
                    lVar.f44643c = ((pVar2.f44653c == GridLayout.f44596w && pVar2.f44654d == 0.0f) ? 0 : 2) & lVar.f44643c;
                    int a = pVar2.mo16912a(this.f44617a).mo16878a(childAt2, i5, gridLayout2.getLayoutMode());
                    lVar.mo16883b(a, i5 - a);
                }
                this.f44621e = true;
            }
            return this.f44620d;
        }

        /* renamed from: h */
        public int[] mo16897h() {
            boolean z;
            if (this.f44632p == null) {
                this.f44632p = new int[(mo16895f() + 1)];
            }
            if (!this.f44633q) {
                int[] iArr = this.f44632p;
                float f = 0.0f;
                if (!this.f44635s) {
                    int childCount = GridLayout.this.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            z = false;
                            break;
                        }
                        View childAt = GridLayout.this.getChildAt(i);
                        if (childAt.getVisibility() != 8) {
                            GridLayout.this.getClass();
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            if ((this.f44617a ? layoutParams.f44610b : layoutParams.f44609a).f44654d != 0.0f) {
                                z = true;
                                break;
                            }
                        }
                        i++;
                    }
                    this.f44634r = z;
                    this.f44635s = true;
                }
                if (!this.f44634r) {
                    mo16905p(mo16894e(), iArr, true);
                } else {
                    if (this.f44636t == null) {
                        this.f44636t = new int[GridLayout.this.getChildCount()];
                    }
                    Arrays.fill(this.f44636t, 0);
                    mo16905p(mo16894e(), iArr, true);
                    int childCount2 = (this.f44638v.f44646a * GridLayout.this.getChildCount()) + 1;
                    if (childCount2 >= 2) {
                        int childCount3 = GridLayout.this.getChildCount();
                        for (int i2 = 0; i2 < childCount3; i2++) {
                            View childAt2 = GridLayout.this.getChildAt(i2);
                            if (childAt2.getVisibility() != 8) {
                                GridLayout.this.getClass();
                                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                                f += (this.f44617a ? layoutParams2.f44610b : layoutParams2.f44609a).f44654d;
                            }
                        }
                        int i3 = -1;
                        int i4 = 0;
                        boolean z2 = true;
                        while (i4 < childCount2) {
                            int i5 = (int) ((((long) i4) + ((long) childCount2)) / 2);
                            mo16902m();
                            mo16904o(i5, f);
                            z2 = mo16905p(mo16894e(), iArr, false);
                            if (z2) {
                                i4 = i5 + 1;
                                i3 = i5;
                            } else {
                                childCount2 = i5;
                            }
                        }
                        if (i3 > 0 && !z2) {
                            mo16902m();
                            mo16904o(i3, f);
                            mo16905p(mo16894e(), iArr, true);
                        }
                    }
                }
                if (!this.f44637u) {
                    int i6 = iArr[0];
                    int length = iArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr[i7] = iArr[i7] - i6;
                    }
                }
                this.f44633q = true;
            }
            return this.f44632p;
        }

        /* renamed from: i */
        public final int mo16898i() {
            int i = Integer.MIN_VALUE;
            if (this.f44619c == Integer.MIN_VALUE) {
                int childCount = GridLayout.this.getChildCount();
                int i2 = -1;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = GridLayout.this.getChildAt(i3);
                    GridLayout.this.getClass();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    C16592m mVar = (this.f44617a ? layoutParams.f44610b : layoutParams.f44609a).f44652b;
                    i2 = Math.max(Math.max(Math.max(i2, mVar.f44644a), mVar.f44645b), mVar.f44645b - mVar.f44644a);
                }
                if (i2 != -1) {
                    i = i2;
                }
                this.f44619c = Math.max(0, i);
            }
            return this.f44619c;
        }

        /* renamed from: j */
        public int mo16899j(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                this.f44638v.f44646a = 0;
                this.f44639w.f44646a = -size;
                this.f44633q = false;
                return mo16897h()[mo16895f()];
            } else if (mode == 0) {
                this.f44638v.f44646a = 0;
                this.f44639w.f44646a = -100000;
                this.f44633q = false;
                return mo16897h()[mo16895f()];
            } else if (mode != 1073741824) {
                return 0;
            } else {
                this.f44638v.f44646a = size;
                this.f44639w.f44646a = -size;
                this.f44633q = false;
                return mo16897h()[mo16895f()];
            }
        }

        /* renamed from: k */
        public final void mo16900k(List<C16588i> list, C16592m mVar, C16593n nVar, boolean z) {
            if (mVar.f44645b - mVar.f44644a != 0) {
                if (z) {
                    for (C16588i iVar : list) {
                        if (iVar.f44612a.equals(mVar)) {
                            return;
                        }
                    }
                }
                list.add(new C16588i(mVar, nVar));
            }
        }

        /* renamed from: l */
        public void mo16901l() {
            this.f44619c = Integer.MIN_VALUE;
            this.f44620d = null;
            this.f44622f = null;
            this.f44624h = null;
            this.f44626j = null;
            this.f44628l = null;
            this.f44630n = null;
            this.f44632p = null;
            this.f44636t = null;
            this.f44635s = false;
            mo16902m();
        }

        /* renamed from: m */
        public void mo16902m() {
            this.f44621e = false;
            this.f44623g = false;
            this.f44625i = false;
            this.f44627k = false;
            this.f44629m = false;
            this.f44631o = false;
            this.f44633q = false;
        }

        /* renamed from: n */
        public void mo16903n(int i) {
            if (i == Integer.MIN_VALUE || i >= mo16898i()) {
                this.f44618b = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f44617a ? "column" : "row");
            sb.append("Count must be greater than or equal to the maximum of all grid indices ");
            sb.append("(and spans) defined in the LayoutParams of each child");
            GridLayout.m15666g(sb.toString());
            throw null;
        }

        /* renamed from: o */
        public final void mo16904o(int i, float f) {
            Arrays.fill(this.f44636t, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    GridLayout.this.getClass();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    float f2 = (this.f44617a ? layoutParams.f44610b : layoutParams.f44609a).f44654d;
                    if (f2 != 0.0f) {
                        int round = Math.round((((float) i) * f2) / f);
                        this.f44636t[i2] = round;
                        i -= round;
                        f -= f2;
                    }
                }
            }
        }

        /* renamed from: p */
        public final boolean mo16905p(C16588i[] iVarArr, int[] iArr, boolean z) {
            boolean z2;
            boolean z3;
            C16588i[] iVarArr2 = iVarArr;
            int[] iArr2 = iArr;
            String str = this.f44617a ? "horizontal" : "vertical";
            boolean z4 = true;
            int f = mo16895f() + 1;
            boolean[] zArr = null;
            int i = 0;
            while (i < iVarArr2.length) {
                Arrays.fill(iArr2, 0);
                for (int i2 = 0; i2 < f; i2++) {
                    boolean z5 = false;
                    for (C16588i iVar : iVarArr2) {
                        if (iVar.f44614c) {
                            C16592m mVar = iVar.f44612a;
                            int i3 = mVar.f44644a;
                            int i4 = mVar.f44645b;
                            int i5 = iArr2[i3] + iVar.f44613b.f44646a;
                            if (i5 > iArr2[i4]) {
                                iArr2[i4] = i5;
                                z3 = true;
                                z5 |= z3;
                            }
                        }
                        z3 = false;
                        z5 |= z3;
                    }
                    if (!z5) {
                        if (zArr != null) {
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            for (int i6 = 0; i6 < iVarArr2.length; i6++) {
                                C16588i iVar2 = iVarArr2[i6];
                                if (zArr[i6]) {
                                    arrayList.add(iVar2);
                                }
                                if (!iVar2.f44614c) {
                                    arrayList2.add(iVar2);
                                }
                            }
                            GridLayout.this.f44607n.println(str + " constraints: " + mo16890a(arrayList) + " are inconsistent; permanently removing: " + mo16890a(arrayList2) + ". ");
                        }
                        return z4;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[iVarArr2.length];
                for (int i7 = 0; i7 < f; i7++) {
                    int length = iVarArr2.length;
                    for (int i8 = 0; i8 < length; i8++) {
                        boolean z6 = zArr2[i8];
                        C16588i iVar3 = iVarArr2[i8];
                        if (iVar3.f44614c) {
                            C16592m mVar2 = iVar3.f44612a;
                            int i9 = mVar2.f44644a;
                            int i15 = mVar2.f44645b;
                            int i16 = iArr2[i9] + iVar3.f44613b.f44646a;
                            if (i16 > iArr2[i15]) {
                                iArr2[i15] = i16;
                                z2 = true;
                                zArr2[i8] = z2 | z6;
                            }
                        }
                        z2 = false;
                        zArr2[i8] = z2 | z6;
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= iVarArr2.length) {
                        break;
                    }
                    if (zArr2[i17]) {
                        C16588i iVar4 = iVarArr2[i17];
                        C16592m mVar3 = iVar4.f44612a;
                        if (mVar3.f44644a >= mVar3.f44645b) {
                            iVar4.f44614c = false;
                            break;
                        }
                    }
                    i17++;
                }
                i++;
                z4 = true;
            }
            return z4;
        }

        /* renamed from: q */
        public final C16588i[] mo16906q(List<C16588i> list) {
            C16597b bVar = new C16597b(this, (C16588i[]) list.toArray(new C16588i[list.size()]));
            int length = bVar.f44659c.length;
            for (int i = 0; i < length; i++) {
                bVar.mo16915a(i);
            }
            return bVar.f44657a;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$l */
    public static class C16591l {

        /* renamed from: a */
        public int f44641a;

        /* renamed from: b */
        public int f44642b;

        /* renamed from: c */
        public int f44643c;

        public C16591l() {
            mo16884c();
        }

        /* renamed from: a */
        public int mo16882a(GridLayout gridLayout, View view, C16587h hVar, int i, boolean z) {
            return this.f44641a - hVar.mo16878a(view, i, gridLayout.getLayoutMode());
        }

        /* renamed from: b */
        public void mo16883b(int i, int i2) {
            this.f44641a = Math.max(this.f44641a, i);
            this.f44642b = Math.max(this.f44642b, i2);
        }

        /* renamed from: c */
        public void mo16884c() {
            this.f44641a = Integer.MIN_VALUE;
            this.f44642b = Integer.MIN_VALUE;
            this.f44643c = 2;
        }

        /* renamed from: d */
        public int mo16885d(boolean z) {
            if (!z) {
                int i = this.f44643c;
                Printer printer = GridLayout.f44588o;
                if ((i & 2) != 0) {
                    return 100000;
                }
            }
            return this.f44641a + this.f44642b;
        }

        public String toString() {
            return "Bounds{before=" + this.f44641a + ", after=" + this.f44642b + '}';
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$m */
    public static final class C16592m {

        /* renamed from: a */
        public final int f44644a;

        /* renamed from: b */
        public final int f44645b;

        public C16592m(int i, int i2) {
            this.f44644a = i;
            this.f44645b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16592m.class != obj.getClass()) {
                return false;
            }
            C16592m mVar = (C16592m) obj;
            return this.f44645b == mVar.f44645b && this.f44644a == mVar.f44644a;
        }

        public int hashCode() {
            return (this.f44644a * 31) + this.f44645b;
        }

        public String toString() {
            return "[" + this.f44644a + ", " + this.f44645b + "]";
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$o */
    public static final class C16594o<K, V> {

        /* renamed from: a */
        public final int[] f44647a;

        /* renamed from: b */
        public final K[] f44648b;

        /* renamed from: c */
        public final V[] f44649c;

        public C16594o(K[] kArr, V[] vArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer num = (Integer) hashMap.get(k);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(k, num);
                }
                iArr[i] = num.intValue();
            }
            this.f44647a = iArr;
            this.f44648b = m15728a(kArr, iArr);
            this.f44649c = m15728a(vArr, iArr);
        }

        /* renamed from: a */
        public static <K> K[] m15728a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            Class<?> componentType = kArr.getClass().getComponentType();
            Printer printer = GridLayout.f44588o;
            int i = -1;
            for (int max : iArr) {
                i = Math.max(i, max);
            }
            K[] kArr2 = (Object[]) Array.newInstance(componentType, i + 1);
            for (int i2 = 0; i2 < length; i2++) {
                kArr2[iArr[i2]] = kArr[i2];
            }
            return kArr2;
        }
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$p */
    public static class C16595p {

        /* renamed from: e */
        public static final C16595p f44650e = GridLayout.m15668l(Integer.MIN_VALUE, 1, GridLayout.f44596w, 0.0f);

        /* renamed from: a */
        public final boolean f44651a;

        /* renamed from: b */
        public final C16592m f44652b;

        /* renamed from: c */
        public final C16587h f44653c;

        /* renamed from: d */
        public final float f44654d;

        public C16595p(boolean z, C16592m mVar, C16587h hVar, float f) {
            this.f44651a = z;
            this.f44652b = mVar;
            this.f44653c = hVar;
            this.f44654d = f;
        }

        /* renamed from: a */
        public C16587h mo16912a(boolean z) {
            C16587h hVar = this.f44653c;
            return hVar != GridLayout.f44596w ? hVar : this.f44654d == 0.0f ? z ? GridLayout.f44599z : GridLayout.f44586E : GridLayout.f44587F;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C16595p.class != obj.getClass()) {
                return false;
            }
            C16595p pVar = (C16595p) obj;
            return this.f44653c.equals(pVar.f44653c) && this.f44652b.equals(pVar.f44652b);
        }

        public int hashCode() {
            return (this.f44652b.hashCode() * 31) + this.f44653c.hashCode();
        }
    }

    static {
        C16581c cVar = new C16581c();
        C16582d dVar = new C16582d();
        f44597x = cVar;
        f44598y = dVar;
        f44599z = cVar;
        f44582A = dVar;
        f44583B = new C16596a(cVar, dVar);
        f44584C = new C16596a(dVar, cVar);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44600d = new C16590k(true);
        this.f44601e = new C16590k(false);
        this.f44602f = 0;
        this.f44603g = false;
        this.f44604h = 1;
        this.f44606j = 0;
        this.f44607n = f44588o;
        this.f44605i = context.getResources().getDimensionPixelOffset(C0966R.dimen.f357013a02);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21481a.f60810a);
        try {
            setRowCount(obtainStyledAttributes.getInt(f44591r, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(f44592s, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(f44590q, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(f44593t, false));
            setAlignmentMode(obtainStyledAttributes.getInt(0, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(f44594u, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(f44595v, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static C16587h m15665d(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        return i2 != 1 ? i2 != 3 ? i2 != 5 ? i2 != 7 ? i2 != 8388611 ? i2 != 8388613 ? f44596w : f44582A : f44599z : f44587F : z ? f44584C : f44598y : z ? f44583B : f44597x : f44585D;
    }

    /* renamed from: g */
    public static void m15666g(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    /* renamed from: k */
    public static void m15667k(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        C16592m mVar = new C16592m(i, i2 + i);
        C16595p pVar = layoutParams.f44609a;
        layoutParams.f44609a = new C16595p(pVar.f44651a, mVar, pVar.f44653c, pVar.f44654d);
        C16592m mVar2 = new C16592m(i3, i4 + i3);
        C16595p pVar2 = layoutParams.f44610b;
        layoutParams.f44610b = new C16595p(pVar2.f44651a, mVar2, pVar2.f44653c, pVar2.f44654d);
    }

    /* renamed from: l */
    public static C16595p m15668l(int i, int i2, C16587h hVar, float f) {
        return new C16595p(i != Integer.MIN_VALUE, new C16592m(i, i2 + i), hVar, f);
    }

    /* renamed from: a */
    public final void mo16845a(LayoutParams layoutParams, boolean z) {
        String str = z ? "column" : "row";
        C16592m mVar = (z ? layoutParams.f44610b : layoutParams.f44609a).f44652b;
        int i = mVar.f44644a;
        if (i == Integer.MIN_VALUE || i >= 0) {
            int i2 = (z ? this.f44600d : this.f44601e).f44618b;
            if (i2 != Integer.MIN_VALUE) {
                int i3 = mVar.f44645b;
                if (i3 > i2) {
                    m15666g(str + " indices (start + span) mustn't exceed the " + str + " count");
                    throw null;
                } else if (i3 - i > i2) {
                    m15666g(str + " span mustn't exceed the " + str + " count");
                    throw null;
                }
            }
        } else {
            m15666g(str + " indices must be positive");
            throw null;
        }
    }

    /* renamed from: b */
    public final int mo16846b() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = (i * 31) + ((LayoutParams) childAt.getLayoutParams()).hashCode();
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo16847c() {
        boolean z;
        int i = this.f44606j;
        if (i == 0) {
            boolean z2 = this.f44602f == 0;
            int i2 = (z2 ? this.f44600d : this.f44601e).f44618b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            int[] iArr = new int[i2];
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                C16595p pVar = z2 ? layoutParams.f44609a : layoutParams.f44610b;
                C16592m mVar = pVar.f44652b;
                boolean z3 = pVar.f44651a;
                int i6 = mVar.f44645b;
                int i7 = mVar.f44644a;
                int i8 = i6 - i7;
                if (z3) {
                    i3 = i7;
                }
                C16595p pVar2 = z2 ? layoutParams.f44610b : layoutParams.f44609a;
                C16592m mVar2 = pVar2.f44652b;
                boolean z4 = pVar2.f44651a;
                int i9 = mVar2.f44645b;
                int i15 = mVar2.f44644a;
                int i16 = i9 - i15;
                if (i2 != 0) {
                    i16 = Math.min(i16, i2 - (z4 ? Math.min(i15, i2) : 0));
                }
                if (z4) {
                    i4 = mVar2.f44644a;
                }
                if (i2 != 0) {
                    if (!z3 || !z4) {
                        while (true) {
                            int i17 = i4 + i16;
                            if (i17 <= i2) {
                                int i18 = i4;
                                while (true) {
                                    if (i18 >= i17) {
                                        z = true;
                                        break;
                                    } else if (iArr[i18] > i3) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                                break;
                            } else if (z4) {
                                i3++;
                            } else if (i17 <= i2) {
                                i4++;
                            } else {
                                i3++;
                                i4 = 0;
                            }
                        }
                    }
                    Arrays.fill(iArr, Math.min(i4, i2), Math.min(i4 + i16, i2), i3 + i8);
                }
                if (z2) {
                    m15667k(layoutParams, i3, i8, i4, i16);
                } else {
                    m15667k(layoutParams, i4, i16, i3, i8);
                }
                i4 += i16;
            }
            this.f44606j = mo16846b();
        } else if (i != mo16846b()) {
            this.f44607n.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            mo16860h();
            mo16847c();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        mo16845a(layoutParams2, true);
        mo16845a(layoutParams2, false);
        return true;
    }

    /* renamed from: e */
    public final int mo16849e(View view, boolean z, boolean z2) {
        int[] iArr;
        if (this.f44604h == 1) {
            return mo16850f(view, z, z2);
        }
        C16590k kVar = z ? this.f44600d : this.f44601e;
        if (z2) {
            if (kVar.f44626j == null) {
                kVar.f44626j = new int[(kVar.mo16895f() + 1)];
            }
            if (!kVar.f44627k) {
                kVar.mo16892c(true);
                kVar.f44627k = true;
            }
            iArr = kVar.f44626j;
        } else {
            if (kVar.f44628l == null) {
                kVar.f44628l = new int[(kVar.mo16895f() + 1)];
            }
            if (!kVar.f44629m) {
                kVar.mo16892c(false);
                kVar.f44629m = true;
            }
            iArr = kVar.f44628l;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        C16592m mVar = (z ? layoutParams.f44610b : layoutParams.f44609a).f44652b;
        return iArr[z2 ? mVar.f44644a : mVar.f44645b];
    }

    /* renamed from: f */
    public int mo16850f(View view, boolean z, boolean z2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i = z ? z2 ? layoutParams.leftMargin : layoutParams.rightMargin : z2 ? layoutParams.topMargin : layoutParams.bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (this.f44603g) {
            C16595p pVar = z ? layoutParams.f44610b : layoutParams.f44609a;
            C16590k kVar = z ? this.f44600d : this.f44601e;
            C16592m mVar = pVar.f44652b;
            if (z) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107209c.m145195d(this) == 1) {
                    z2 = !z2;
                }
            }
            if (z2) {
                int i2 = mVar.f44644a;
            } else {
                int i3 = mVar.f44645b;
                kVar.mo16895f();
            }
            if (!(view.getClass() == Space.class || view.getClass() == android.widget.Space.class)) {
                return this.f44605i / 2;
            }
        }
        return 0;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getAlignmentMode() {
        return this.f44604h;
    }

    public int getColumnCount() {
        return this.f44600d.mo16895f();
    }

    public int getOrientation() {
        return this.f44602f;
    }

    public Printer getPrinter() {
        return this.f44607n;
    }

    public int getRowCount() {
        return this.f44601e.mo16895f();
    }

    public boolean getUseDefaultMargins() {
        return this.f44603g;
    }

    /* renamed from: h */
    public final void mo16860h() {
        this.f44606j = 0;
        C16590k kVar = this.f44600d;
        if (kVar != null) {
            kVar.mo16901l();
        }
        C16590k kVar2 = this.f44601e;
        if (kVar2 != null) {
            kVar2.mo16901l();
        }
        C16590k kVar3 = this.f44600d;
        if (kVar3 != null && this.f44601e != null) {
            kVar3.mo16902m();
            this.f44601e.mo16902m();
        }
    }

    /* renamed from: i */
    public final void mo16861i(View view, int i, int i2, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i, mo16849e(view, true, true) + mo16849e(view, true, false), i3), ViewGroup.getChildMeasureSpec(i2, mo16849e(view, false, true) + mo16849e(view, false, false), i4));
    }

    /* renamed from: j */
    public final void mo16862j(int i, int i2, boolean z) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    mo16861i(childAt, i, i2, layoutParams.width, layoutParams.height);
                } else {
                    boolean z2 = this.f44602f == 0;
                    C16595p pVar = z2 ? layoutParams.f44610b : layoutParams.f44609a;
                    if (pVar.mo16912a(z2) == f44587F) {
                        C16592m mVar = pVar.f44652b;
                        int[] h = (z2 ? this.f44600d : this.f44601e).mo16897h();
                        int e = (h[mVar.f44645b] - h[mVar.f44644a]) - (mo16849e(childAt, z2, true) + mo16849e(childAt, z2, false));
                        if (z2) {
                            mo16861i(childAt, i, i2, e, layoutParams.height);
                        } else {
                            mo16861i(childAt, i, i2, layoutParams.width, e);
                        }
                    }
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr;
        GridLayout gridLayout = this;
        mo16847c();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        C16590k kVar = gridLayout.f44600d;
        int i6 = (i5 - paddingLeft) - paddingRight;
        kVar.f44638v.f44646a = i6;
        kVar.f44639w.f44646a = -i6;
        boolean z2 = false;
        kVar.f44633q = false;
        kVar.mo16897h();
        C16590k kVar2 = gridLayout.f44601e;
        int i7 = ((i4 - i2) - paddingTop) - paddingBottom;
        kVar2.f44638v.f44646a = i7;
        kVar2.f44639w.f44646a = -i7;
        kVar2.f44633q = false;
        kVar2.mo16897h();
        int[] h = gridLayout.f44600d.mo16897h();
        int[] h2 = gridLayout.f44601e.mo16897h();
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = gridLayout.getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                iArr = h;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C16595p pVar = layoutParams.f44610b;
                C16595p pVar2 = layoutParams.f44609a;
                C16592m mVar = pVar.f44652b;
                C16592m mVar2 = pVar2.f44652b;
                int i9 = h[mVar.f44644a];
                int i15 = h2[mVar2.f44644a];
                int i16 = h[mVar.f44645b] - i9;
                int i17 = h2[mVar2.f44645b] - i15;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                C16587h a = pVar.mo16912a(true);
                C16587h a2 = pVar2.mo16912a(z2);
                C16594o<C16595p, C16591l> g = gridLayout.f44600d.mo16896g();
                C16591l lVar = (C16591l) g.f44649c[g.f44647a[i8]];
                C16594o<C16595p, C16591l> g2 = gridLayout.f44601e.mo16896g();
                C16591l lVar2 = (C16591l) g2.f44649c[g2.f44647a[i8]];
                iArr = h;
                int d = a.mo16880d(childAt, i16 - lVar.mo16885d(true));
                C16587h hVar = a;
                int d2 = a2.mo16880d(childAt, i17 - lVar2.mo16885d(true));
                int e = gridLayout.mo16849e(childAt, true, true);
                int e2 = gridLayout.mo16849e(childAt, false, true);
                int e3 = gridLayout.mo16849e(childAt, true, false);
                int i18 = e + e3;
                int e4 = e2 + gridLayout.mo16849e(childAt, false, false);
                C16587h hVar2 = a2;
                C16591l lVar3 = lVar;
                C16587h hVar3 = hVar;
                View view = childAt;
                int a3 = lVar3.mo16882a(this, childAt, hVar, measuredWidth + i18, true);
                int i19 = measuredHeight;
                View view2 = view;
                int a4 = lVar2.mo16882a(this, view2, hVar2, i19 + e4, false);
                int e5 = hVar.mo16886e(view2, measuredWidth, i16 - i18);
                int e6 = hVar2.mo16886e(view2, i19, i17 - e4);
                int i25 = i9 + d + a3;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                boolean z3 = true;
                if (C107207u.C107209c.m145195d(this) != 1) {
                    z3 = false;
                }
                int i26 = !z3 ? paddingLeft + e + i25 : (((i5 - e5) - paddingRight) - e3) - i25;
                int i27 = paddingTop + i15 + d2 + a4 + e2;
                if (!(e5 == view2.getMeasuredWidth() && e6 == view2.getMeasuredHeight())) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(e5, 1073741824), View.MeasureSpec.makeMeasureSpec(e6, 1073741824));
                }
                view2.layout(i26, i27, e5 + i26, e6 + i27);
            }
            i8++;
            gridLayout = this;
            h = iArr;
            z2 = false;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        mo16847c();
        C16590k kVar = this.f44600d;
        if (!(kVar == null || this.f44601e == null)) {
            kVar.mo16902m();
            this.f44601e.mo16902m();
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingLeft) + i), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize((-paddingTop) + i2), View.MeasureSpec.getMode(i2));
        mo16862j(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.f44602f == 0) {
            i3 = this.f44600d.mo16899j(makeMeasureSpec);
            mo16862j(makeMeasureSpec, makeMeasureSpec2, false);
            i4 = this.f44601e.mo16899j(makeMeasureSpec2);
        } else {
            int j = this.f44601e.mo16899j(makeMeasureSpec2);
            mo16862j(makeMeasureSpec, makeMeasureSpec2, false);
            int i5 = j;
            i3 = this.f44600d.mo16899j(makeMeasureSpec);
            i4 = i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i4 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    public void requestLayout() {
        super.requestLayout();
        mo16860h();
    }

    public void setAlignmentMode(int i) {
        this.f44604h = i;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.f44600d.mo16903n(i);
        mo16860h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        C16590k kVar = this.f44600d;
        kVar.f44637u = z;
        kVar.mo16901l();
        mo16860h();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.f44602f != i) {
            this.f44602f = i;
            mo16860h();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = f44589p;
        }
        this.f44607n = printer;
    }

    public void setRowCount(int i) {
        this.f44601e.mo16903n(i);
        mo16860h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        C16590k kVar = this.f44601e;
        kVar.f44637u = z;
        kVar.mo16901l();
        mo16860h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z) {
        this.f44603g = z;
        requestLayout();
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$n */
    public static final class C16593n {

        /* renamed from: a */
        public int f44646a;

        public C16593n() {
            this.f44646a = Integer.MIN_VALUE;
        }

        public String toString() {
            return Integer.toString(this.f44646a);
        }

        public C16593n(int i) {
            this.f44646a = i;
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: c */
        public static final int f44608c = 1;

        /* renamed from: a */
        public C16595p f44609a;

        /* renamed from: b */
        public C16595p f44610b;

        public LayoutParams(C16595p pVar, C16595p pVar2) {
            super(-2, -2);
            C16595p pVar3 = C16595p.f44650e;
            this.f44609a = pVar3;
            this.f44610b = pVar3;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f44609a = pVar;
            this.f44610b = pVar2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.f44610b.equals(layoutParams.f44610b) && this.f44609a.equals(layoutParams.f44609a);
        }

        public int hashCode() {
            return (this.f44609a.hashCode() * 31) + this.f44610b.hashCode();
        }

        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            this.width = typedArray.getLayoutDimension(i, -2);
            this.height = typedArray.getLayoutDimension(i2, -2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LayoutParams() {
            /*
                r1 = this;
                androidx.gridlayout.widget.GridLayout$p r0 = androidx.gridlayout.widget.GridLayout.C16595p.f44650e
                r1.<init>((androidx.gridlayout.widget.GridLayout.C16595p) r0, (androidx.gridlayout.widget.GridLayout.C16595p) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout.LayoutParams.<init>():void");
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            C16595p pVar = C16595p.f44650e;
            this.f44609a = pVar;
            this.f44610b = pVar;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            C16595p pVar = C16595p.f44650e;
            this.f44609a = pVar;
            this.f44610b = pVar;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            C16595p pVar = C16595p.f44650e;
            this.f44609a = pVar;
            this.f44610b = pVar;
            this.f44609a = layoutParams.f44609a;
            this.f44610b = layoutParams.f44610b;
        }

        /* JADX INFO: finally extract failed */
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C16595p pVar = C16595p.f44650e;
            this.f44609a = pVar;
            this.f44610b = pVar;
            int[] iArr = C21481a.f60811b;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
                this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
                this.topMargin = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
                this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
                this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                try {
                    int i = obtainStyledAttributes2.getInt(10, 0);
                    int i2 = obtainStyledAttributes2.getInt(7, Integer.MIN_VALUE);
                    int i3 = f44608c;
                    this.f44610b = GridLayout.m15668l(i2, obtainStyledAttributes2.getInt(8, i3), GridLayout.m15665d(i, true), obtainStyledAttributes2.getFloat(9, 0.0f));
                    this.f44609a = GridLayout.m15668l(obtainStyledAttributes2.getInt(11, Integer.MIN_VALUE), obtainStyledAttributes2.getInt(12, i3), GridLayout.m15665d(i, false), obtainStyledAttributes2.getFloat(13, 0.0f));
                } finally {
                    obtainStyledAttributes2.recycle();
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
