package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C16661o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p1108f3.C107453d;

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.C16634v.C16636b {

    /* renamed from: A */
    public boolean f44886A = false;

    /* renamed from: B */
    public boolean f44887B = true;

    /* renamed from: C */
    public int[] f44888C;

    /* renamed from: D */
    public final Runnable f44889D = new C16641a();

    /* renamed from: d */
    public int f44890d = -1;

    /* renamed from: e */
    public C16643c[] f44891e;

    /* renamed from: f */
    public C16682y f44892f;

    /* renamed from: g */
    public C16682y f44893g;

    /* renamed from: h */
    public int f44894h;

    /* renamed from: i */
    public int f44895i;

    /* renamed from: j */
    public final C16677r f44896j;

    /* renamed from: n */
    public boolean f44897n = false;

    /* renamed from: o */
    public boolean f44898o = false;

    /* renamed from: p */
    public BitSet f44899p;

    /* renamed from: q */
    public int f44900q = -1;

    /* renamed from: r */
    public int f44901r = Integer.MIN_VALUE;

    /* renamed from: s */
    public LazySpanLookup f44902s = new LazySpanLookup();

    /* renamed from: t */
    public int f44903t = 2;

    /* renamed from: u */
    public boolean f44904u;

    /* renamed from: v */
    public boolean f44905v;

    /* renamed from: w */
    public SavedState f44906w;

    /* renamed from: x */
    public int f44907x;

    /* renamed from: y */
    public final Rect f44908y = new Rect();

    /* renamed from: z */
    public final C16642b f44909z = new C16642b();

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: h */
        public C16643c f44910h;

        /* renamed from: i */
        public boolean f44911i;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int mo17429e() {
            C16643c cVar = this.f44910h;
            if (cVar == null) {
                return -1;
            }
            return cVar.f44940e;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16640a();

        /* renamed from: d */
        public int f44918d;

        /* renamed from: e */
        public int f44919e;

        /* renamed from: f */
        public int f44920f;

        /* renamed from: g */
        public int[] f44921g;

        /* renamed from: h */
        public int f44922h;

        /* renamed from: i */
        public int[] f44923i;

        /* renamed from: j */
        public List<LazySpanLookup.FullSpanItem> f44924j;

        /* renamed from: n */
        public boolean f44925n;

        /* renamed from: o */
        public boolean f44926o;

        /* renamed from: p */
        public boolean f44927p;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public static class C16640a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f44918d);
            parcel.writeInt(this.f44919e);
            parcel.writeInt(this.f44920f);
            if (this.f44920f > 0) {
                parcel.writeIntArray(this.f44921g);
            }
            parcel.writeInt(this.f44922h);
            if (this.f44922h > 0) {
                parcel.writeIntArray(this.f44923i);
            }
            parcel.writeInt(this.f44925n ? 1 : 0);
            parcel.writeInt(this.f44926o ? 1 : 0);
            parcel.writeInt(this.f44927p ? 1 : 0);
            parcel.writeList(this.f44924j);
        }

        public SavedState(Parcel parcel) {
            this.f44918d = parcel.readInt();
            this.f44919e = parcel.readInt();
            int readInt = parcel.readInt();
            this.f44920f = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f44921g = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f44922h = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f44923i = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f44925n = parcel.readInt() == 1;
            this.f44926o = parcel.readInt() == 1;
            this.f44927p = parcel.readInt() == 1 ? true : z;
            this.f44924j = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f44920f = savedState.f44920f;
            this.f44918d = savedState.f44918d;
            this.f44919e = savedState.f44919e;
            this.f44921g = savedState.f44921g;
            this.f44922h = savedState.f44922h;
            this.f44923i = savedState.f44923i;
            this.f44925n = savedState.f44925n;
            this.f44926o = savedState.f44926o;
            this.f44927p = savedState.f44927p;
            this.f44924j = savedState.f44924j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C16641a implements Runnable {
        public C16641a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo17422t();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C16642b {

        /* renamed from: a */
        public int f44929a;

        /* renamed from: b */
        public int f44930b;

        /* renamed from: c */
        public boolean f44931c;

        /* renamed from: d */
        public boolean f44932d;

        /* renamed from: e */
        public boolean f44933e;

        /* renamed from: f */
        public int[] f44934f;

        public C16642b() {
            mo17448a();
        }

        /* renamed from: a */
        public void mo17448a() {
            this.f44929a = -1;
            this.f44930b = Integer.MIN_VALUE;
            this.f44931c = false;
            this.f44932d = false;
            this.f44933e = false;
            int[] iArr = this.f44934f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public class C16643c {

        /* renamed from: a */
        public ArrayList<View> f44936a = new ArrayList<>();

        /* renamed from: b */
        public int f44937b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f44938c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f44939d = 0;

        /* renamed from: e */
        public final int f44940e;

        public C16643c(int i) {
            this.f44940e = i;
        }

        /* renamed from: a */
        public void mo17449a(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f44910h = this;
            this.f44936a.add(view);
            this.f44938c = Integer.MIN_VALUE;
            if (this.f44936a.size() == 1) {
                this.f44937b = Integer.MIN_VALUE;
            }
            if (layoutParams.mo17282d() || layoutParams.mo17281c()) {
                this.f44939d += StaggeredGridLayoutManager.this.f44892f.mo17562c(view);
            }
        }

        /* renamed from: b */
        public void mo17450b() {
            LazySpanLookup.FullSpanItem e;
            ArrayList<View> arrayList = this.f44936a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams k = mo17459k(view);
            this.f44938c = StaggeredGridLayoutManager.this.f44892f.mo17561b(view);
            if (k.f44911i && (e = StaggeredGridLayoutManager.this.f44902s.mo17434e(k.mo17280b())) != null && e.f44915e == 1) {
                int i = this.f44938c;
                int i2 = this.f44940e;
                int[] iArr = e.f44916f;
                this.f44938c = i + (iArr == null ? 0 : iArr[i2]);
            }
        }

        /* renamed from: c */
        public void mo17451c() {
            LazySpanLookup.FullSpanItem e;
            int i = 0;
            View view = this.f44936a.get(0);
            LayoutParams k = mo17459k(view);
            this.f44937b = StaggeredGridLayoutManager.this.f44892f.mo17564e(view);
            if (k.f44911i && (e = StaggeredGridLayoutManager.this.f44902s.mo17434e(k.mo17280b())) != null && e.f44915e == -1) {
                int i2 = this.f44937b;
                int i3 = this.f44940e;
                int[] iArr = e.f44916f;
                if (iArr != null) {
                    i = iArr[i3];
                }
                this.f44937b = i2 - i;
            }
        }

        /* renamed from: d */
        public void mo17452d() {
            this.f44936a.clear();
            this.f44937b = Integer.MIN_VALUE;
            this.f44938c = Integer.MIN_VALUE;
            this.f44939d = 0;
        }

        /* renamed from: e */
        public int mo17453e() {
            if (StaggeredGridLayoutManager.this.f44897n) {
                return mo17455g(this.f44936a.size() - 1, -1, false, false, true);
            }
            return mo17455g(0, this.f44936a.size(), false, false, true);
        }

        /* renamed from: f */
        public int mo17454f() {
            if (StaggeredGridLayoutManager.this.f44897n) {
                return mo17455g(0, this.f44936a.size(), false, false, true);
            }
            return mo17455g(this.f44936a.size() - 1, -1, false, false, true);
        }

        /* renamed from: g */
        public int mo17455g(int i, int i2, boolean z, boolean z2, boolean z3) {
            int k = StaggeredGridLayoutManager.this.f44892f.mo17570k();
            int g = StaggeredGridLayoutManager.this.f44892f.mo17566g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f44936a.get(i);
                int e = StaggeredGridLayoutManager.this.f44892f.mo17564e(view);
                int b = StaggeredGridLayoutManager.this.f44892f.mo17561b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? e < g : e <= g;
                if (!z3 ? b > k : b >= k) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (e < k || b > g) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (e >= k && b <= g) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: h */
        public int mo17456h(int i, int i2, boolean z) {
            return mo17455g(i, i2, z, true, false);
        }

        /* renamed from: i */
        public int mo17457i(int i) {
            int i2 = this.f44938c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f44936a.size() == 0) {
                return i;
            }
            mo17450b();
            return this.f44938c;
        }

        /* renamed from: j */
        public View mo17458j(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f44936a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f44936a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f44897n && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f44897n && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f44936a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f44936a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f44897n && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f44897n && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: k */
        public LayoutParams mo17459k(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: l */
        public int mo17460l(int i) {
            int i2 = this.f44937b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f44936a.size() == 0) {
                return i;
            }
            mo17451c();
            return this.f44937b;
        }

        /* renamed from: m */
        public void mo17461m() {
            int size = this.f44936a.size();
            View remove = this.f44936a.remove(size - 1);
            LayoutParams k = mo17459k(remove);
            k.f44910h = null;
            if (k.mo17282d() || k.mo17281c()) {
                this.f44939d -= StaggeredGridLayoutManager.this.f44892f.mo17562c(remove);
            }
            if (size == 1) {
                this.f44937b = Integer.MIN_VALUE;
            }
            this.f44938c = Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public void mo17462n() {
            View remove = this.f44936a.remove(0);
            LayoutParams k = mo17459k(remove);
            k.f44910h = null;
            if (this.f44936a.size() == 0) {
                this.f44938c = Integer.MIN_VALUE;
            }
            if (k.mo17282d() || k.mo17281c()) {
                this.f44939d -= StaggeredGridLayoutManager.this.f44892f.mo17562c(remove);
            }
            this.f44937b = Integer.MIN_VALUE;
        }

        /* renamed from: o */
        public void mo17463o(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f44910h = this;
            this.f44936a.add(0, view);
            this.f44937b = Integer.MIN_VALUE;
            if (this.f44936a.size() == 1) {
                this.f44938c = Integer.MIN_VALUE;
            }
            if (layoutParams.mo17282d() || layoutParams.mo17281c()) {
                this.f44939d += StaggeredGridLayoutManager.this.f44892f.mo17562c(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.C16606d properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f44792a;
        if (i3 == 0 || i3 == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i3 != this.f44894h) {
                this.f44894h = i3;
                C16682y yVar = this.f44892f;
                this.f44892f = this.f44893g;
                this.f44893g = yVar;
                requestLayout();
            }
            mo17416W(properties.f44793b);
            boolean z = properties.f44794c;
            assertNotInLayoutOrScroll((String) null);
            SavedState savedState = this.f44906w;
            if (!(savedState == null || savedState.f44925n == z)) {
                savedState.f44925n = z;
            }
            this.f44897n = z;
            requestLayout();
            this.f44896j = new C16677r();
            this.f44892f = C16682y.m16171a(this, this.f44894h);
            this.f44893g = C16682y.m16171a(this, 1 - this.f44894h);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: A */
    public int[] mo17394A(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f44890d];
        } else if (iArr.length < this.f44890d) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f44890d + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f44890d; i++) {
            C16643c cVar = this.f44891e[i];
            iArr[i] = StaggeredGridLayoutManager.this.f44897n ? cVar.mo17456h(cVar.f44936a.size() - 1, -1, false) : cVar.mo17456h(0, cVar.f44936a.size(), false);
        }
        return iArr;
    }

    /* renamed from: B */
    public int[] mo17395B(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f44890d];
        } else if (iArr.length < this.f44890d) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f44890d + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f44890d; i++) {
            C16643c cVar = this.f44891e[i];
            iArr[i] = StaggeredGridLayoutManager.this.f44897n ? cVar.mo17456h(0, cVar.f44936a.size(), false) : cVar.mo17456h(cVar.f44936a.size() - 1, -1, false);
        }
        return iArr;
    }

    /* renamed from: C */
    public final void mo17396C(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, boolean z) {
        int g;
        int G = mo17400G(Integer.MIN_VALUE);
        if (G != Integer.MIN_VALUE && (g = this.f44892f.mo17566g() - G) > 0) {
            int i = g - (-mo17413T(-g, rVar, wVar));
            if (z && i > 0) {
                this.f44892f.mo17574p(i);
            }
        }
    }

    /* renamed from: D */
    public final void mo17397D(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, boolean z) {
        int k;
        int H = mo17401H(Integer.MAX_VALUE);
        if (H != Integer.MAX_VALUE && (k = H - this.f44892f.mo17570k()) > 0) {
            int T = k - mo17413T(k, rVar, wVar);
            if (z && T > 0) {
                this.f44892f.mo17574p(-T);
            }
        }
    }

    /* renamed from: E */
    public int mo17398E() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: F */
    public int mo17399F() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* renamed from: G */
    public final int mo17400G(int i) {
        int i2 = this.f44891e[0].mo17457i(i);
        for (int i3 = 1; i3 < this.f44890d; i3++) {
            int i4 = this.f44891e[i3].mo17457i(i);
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* renamed from: H */
    public final int mo17401H(int i) {
        int l = this.f44891e[0].mo17460l(i);
        for (int i2 = 1; i2 < this.f44890d; i2++) {
            int l2 = this.f44891e[i2].mo17460l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17402I(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f44898o
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo17399F()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo17398E()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f44902s
            r4.mo17435f(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f44902s
            r9.mo17437h(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f44902s
            r7.mo17436g(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f44902s
            r9.mo17437h(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f44902s
            r9.mo17436g(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f44898o
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo17398E()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo17399F()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo17402I(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        if (r11 == r12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if (r11 == r12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r11 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0099 A[SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo17403J() {
        /*
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f44890d
            r2.<init>(r3)
            int r3 = r13.f44890d
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f44894h
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.mo17404K()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r13.f44898o
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002f
            r7 = 1
            goto L_0x0030
        L_0x002f:
            r7 = -1
        L_0x0030:
            if (r0 == r6) goto L_0x00f9
            android.view.View r8 = r13.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r9.f44910h
            int r10 = r10.f44940e
            boolean r10 = r2.get(r10)
            if (r10 == 0) goto L_0x00a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r9.f44910h
            boolean r11 = r13.f44898o
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0074
            int r11 = r10.f44938c
            if (r11 == r12) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r10.mo17450b()
            int r11 = r10.f44938c
        L_0x0058:
            androidx.recyclerview.widget.y r12 = r13.f44892f
            int r12 = r12.mo17566g()
            if (r11 >= r12) goto L_0x0096
            java.util.ArrayList<android.view.View> r11 = r10.f44936a
            int r12 = r11.size()
            int r12 = r12 + r5
            java.lang.Object r11 = r11.get(r12)
            android.view.View r11 = (android.view.View) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r10 = r10.mo17459k(r11)
            boolean r10 = r10.f44911i
            goto L_0x0094
        L_0x0074:
            int r11 = r10.f44937b
            if (r11 == r12) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            r10.mo17451c()
            int r11 = r10.f44937b
        L_0x007e:
            androidx.recyclerview.widget.y r12 = r13.f44892f
            int r12 = r12.mo17570k()
            if (r11 <= r12) goto L_0x0096
            java.util.ArrayList<android.view.View> r11 = r10.f44936a
            java.lang.Object r11 = r11.get(r4)
            android.view.View r11 = (android.view.View) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r10 = r10.mo17459k(r11)
            boolean r10 = r10.f44911i
        L_0x0094:
            r10 = r10 ^ r1
            goto L_0x0097
        L_0x0096:
            r10 = 0
        L_0x0097:
            if (r10 == 0) goto L_0x009a
            return r8
        L_0x009a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r9.f44910h
            int r10 = r10.f44940e
            r2.clear(r10)
        L_0x00a1:
            boolean r10 = r9.f44911i
            if (r10 == 0) goto L_0x00a6
            goto L_0x00f6
        L_0x00a6:
            int r10 = r0 + r7
            if (r10 == r6) goto L_0x00f6
            android.view.View r10 = r13.getChildAt(r10)
            boolean r11 = r13.f44898o
            if (r11 == 0) goto L_0x00c4
            androidx.recyclerview.widget.y r11 = r13.f44892f
            int r11 = r11.mo17561b(r8)
            androidx.recyclerview.widget.y r12 = r13.f44892f
            int r12 = r12.mo17561b(r10)
            if (r11 >= r12) goto L_0x00c1
            return r8
        L_0x00c1:
            if (r11 != r12) goto L_0x00d7
            goto L_0x00d5
        L_0x00c4:
            androidx.recyclerview.widget.y r11 = r13.f44892f
            int r11 = r11.mo17564e(r8)
            androidx.recyclerview.widget.y r12 = r13.f44892f
            int r12 = r12.mo17564e(r10)
            if (r11 <= r12) goto L_0x00d3
            return r8
        L_0x00d3:
            if (r11 != r12) goto L_0x00d7
        L_0x00d5:
            r11 = 1
            goto L_0x00d8
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            if (r11 == 0) goto L_0x00f6
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f44910h
            int r9 = r9.f44940e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r10.f44910h
            int r10 = r10.f44940e
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x00ed
            r9 = 1
            goto L_0x00ee
        L_0x00ed:
            r9 = 0
        L_0x00ee:
            if (r3 >= 0) goto L_0x00f2
            r10 = 1
            goto L_0x00f3
        L_0x00f2:
            r10 = 0
        L_0x00f3:
            if (r9 == r10) goto L_0x00f6
            return r8
        L_0x00f6:
            int r0 = r0 + r7
            goto L_0x0030
        L_0x00f9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo17403J():android.view.View");
    }

    /* renamed from: K */
    public boolean mo17404K() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: L */
    public final void mo17405L(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.f44908y);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f44908y;
        int a0 = mo17420a0(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f44908y;
        int a05 = mo17420a0(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, a0, a05, layoutParams) : shouldMeasureChild(view, a0, a05, layoutParams)) {
            view.measure(a0, a05);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:243:0x043d, code lost:
        if (mo17422t() != false) goto L_0x0441;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01cc  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17406M(androidx.recyclerview.widget.RecyclerView.C16625r r12, androidx.recyclerview.widget.RecyclerView.C16628w r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.f44909z
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f44906w
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f44900q
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.mo17354b()
            if (r1 != 0) goto L_0x0018
            r11.removeAndRecycleAllViews(r12)
            r0.mo17448a()
            return
        L_0x0018:
            boolean r1 = r0.f44933e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f44900q
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f44906w
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r1 == 0) goto L_0x020b
            r0.mo17448a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f44906w
            if (r7 == 0) goto L_0x00ba
            int r8 = r7.f44920f
            if (r8 <= 0) goto L_0x007d
            int r9 = r11.f44890d
            if (r8 != r9) goto L_0x006f
            r7 = 0
        L_0x003f:
            int r8 = r11.f44890d
            if (r7 >= r8) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r8 = r11.f44891e
            r8 = r8[r7]
            r8.mo17452d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r11.f44906w
            int[] r9 = r8.f44921g
            r9 = r9[r7]
            if (r9 == r5) goto L_0x0064
            boolean r8 = r8.f44926o
            if (r8 == 0) goto L_0x005d
            androidx.recyclerview.widget.y r8 = r11.f44892f
            int r8 = r8.mo17566g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.y r8 = r11.f44892f
            int r8 = r8.mo17570k()
        L_0x0063:
            int r9 = r9 + r8
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r8 = r11.f44891e
            r8 = r8[r7]
            r8.f44937b = r9
            r8.f44938c = r9
            int r7 = r7 + 1
            goto L_0x003f
        L_0x006f:
            r7.f44921g = r6
            r7.f44920f = r4
            r7.f44922h = r4
            r7.f44923i = r6
            r7.f44924j = r6
            int r8 = r7.f44919e
            r7.f44918d = r8
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f44906w
            boolean r8 = r7.f44927p
            r11.f44905v = r8
            boolean r7 = r7.f44925n
            r11.assertNotInLayoutOrScroll(r6)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r8 = r11.f44906w
            if (r8 == 0) goto L_0x0092
            boolean r9 = r8.f44925n
            if (r9 == r7) goto L_0x0092
            r8.f44925n = r7
        L_0x0092:
            r11.f44897n = r7
            r11.requestLayout()
            r11.mo17412S()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f44906w
            int r8 = r7.f44918d
            if (r8 == r2) goto L_0x00a7
            r11.f44900q = r8
            boolean r8 = r7.f44926o
            r0.f44931c = r8
            goto L_0x00ab
        L_0x00a7:
            boolean r8 = r11.f44898o
            r0.f44931c = r8
        L_0x00ab:
            int r8 = r7.f44922h
            if (r8 <= r3) goto L_0x00c1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r11.f44902s
            int[] r9 = r7.f44923i
            r8.f44912a = r9
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r7 = r7.f44924j
            r8.f44913b = r7
            goto L_0x00c1
        L_0x00ba:
            r11.mo17412S()
            boolean r7 = r11.f44898o
            r0.f44931c = r7
        L_0x00c1:
            boolean r7 = r13.f44838g
            if (r7 != 0) goto L_0x01c8
            int r7 = r11.f44900q
            if (r7 != r2) goto L_0x00cb
            goto L_0x01c8
        L_0x00cb:
            if (r7 < 0) goto L_0x01c4
            int r8 = r13.mo17354b()
            if (r7 < r8) goto L_0x00d5
            goto L_0x01c4
        L_0x00d5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f44906w
            if (r7 == 0) goto L_0x00ea
            int r8 = r7.f44918d
            if (r8 == r2) goto L_0x00ea
            int r7 = r7.f44920f
            if (r7 >= r3) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            r0.f44930b = r5
            int r7 = r11.f44900q
            r0.f44929a = r7
            goto L_0x01c2
        L_0x00ea:
            int r7 = r11.f44900q
            android.view.View r7 = r11.findViewByPosition(r7)
            if (r7 == 0) goto L_0x017c
            boolean r8 = r11.f44898o
            if (r8 == 0) goto L_0x00fb
            int r8 = r11.mo17399F()
            goto L_0x00ff
        L_0x00fb:
            int r8 = r11.mo17398E()
        L_0x00ff:
            r0.f44929a = r8
            int r8 = r11.f44901r
            if (r8 == r5) goto L_0x0131
            boolean r8 = r0.f44931c
            if (r8 == 0) goto L_0x011d
            androidx.recyclerview.widget.y r8 = r11.f44892f
            int r8 = r8.mo17566g()
            int r9 = r11.f44901r
            int r8 = r8 - r9
            androidx.recyclerview.widget.y r9 = r11.f44892f
            int r7 = r9.mo17561b(r7)
            int r8 = r8 - r7
            r0.f44930b = r8
            goto L_0x01c2
        L_0x011d:
            androidx.recyclerview.widget.y r8 = r11.f44892f
            int r8 = r8.mo17570k()
            int r9 = r11.f44901r
            int r8 = r8 + r9
            androidx.recyclerview.widget.y r9 = r11.f44892f
            int r7 = r9.mo17564e(r7)
            int r8 = r8 - r7
            r0.f44930b = r8
            goto L_0x01c2
        L_0x0131:
            androidx.recyclerview.widget.y r8 = r11.f44892f
            int r8 = r8.mo17562c(r7)
            androidx.recyclerview.widget.y r9 = r11.f44892f
            int r9 = r9.mo17571l()
            if (r8 <= r9) goto L_0x0154
            boolean r7 = r0.f44931c
            if (r7 == 0) goto L_0x014a
            androidx.recyclerview.widget.y r7 = r11.f44892f
            int r7 = r7.mo17566g()
            goto L_0x0150
        L_0x014a:
            androidx.recyclerview.widget.y r7 = r11.f44892f
            int r7 = r7.mo17570k()
        L_0x0150:
            r0.f44930b = r7
            goto L_0x01c2
        L_0x0154:
            androidx.recyclerview.widget.y r8 = r11.f44892f
            int r8 = r8.mo17564e(r7)
            androidx.recyclerview.widget.y r9 = r11.f44892f
            int r9 = r9.mo17570k()
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x0167
            int r7 = -r8
            r0.f44930b = r7
            goto L_0x01c2
        L_0x0167:
            androidx.recyclerview.widget.y r8 = r11.f44892f
            int r8 = r8.mo17566g()
            androidx.recyclerview.widget.y r9 = r11.f44892f
            int r7 = r9.mo17561b(r7)
            int r8 = r8 - r7
            if (r8 >= 0) goto L_0x0179
            r0.f44930b = r8
            goto L_0x01c2
        L_0x0179:
            r0.f44930b = r5
            goto L_0x01c2
        L_0x017c:
            int r7 = r11.f44900q
            r0.f44929a = r7
            int r8 = r11.f44901r
            if (r8 != r5) goto L_0x01a5
            int r7 = r11.mo17421s(r7)
            if (r7 != r3) goto L_0x018c
            r7 = 1
            goto L_0x018d
        L_0x018c:
            r7 = 0
        L_0x018d:
            r0.f44931c = r7
            if (r7 == 0) goto L_0x019a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.y r7 = r7.f44892f
            int r7 = r7.mo17566g()
            goto L_0x01a2
        L_0x019a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.y r7 = r7.f44892f
            int r7 = r7.mo17570k()
        L_0x01a2:
            r0.f44930b = r7
            goto L_0x01c0
        L_0x01a5:
            boolean r7 = r0.f44931c
            if (r7 == 0) goto L_0x01b5
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.y r7 = r7.f44892f
            int r7 = r7.mo17566g()
            int r7 = r7 - r8
            r0.f44930b = r7
            goto L_0x01c0
        L_0x01b5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.y r7 = r7.f44892f
            int r7 = r7.mo17570k()
            int r7 = r7 + r8
            r0.f44930b = r7
        L_0x01c0:
            r0.f44932d = r3
        L_0x01c2:
            r7 = 1
            goto L_0x01c9
        L_0x01c4:
            r11.f44900q = r2
            r11.f44901r = r5
        L_0x01c8:
            r7 = 0
        L_0x01c9:
            if (r7 == 0) goto L_0x01cc
            goto L_0x0209
        L_0x01cc:
            boolean r7 = r11.f44904u
            if (r7 == 0) goto L_0x01e8
            int r7 = r13.mo17354b()
            int r8 = r11.getChildCount()
        L_0x01d8:
            int r8 = r8 + r2
            if (r8 < 0) goto L_0x0204
            android.view.View r9 = r11.getChildAt(r8)
            int r9 = r11.getPosition(r9)
            if (r9 < 0) goto L_0x01d8
            if (r9 >= r7) goto L_0x01d8
            goto L_0x0205
        L_0x01e8:
            int r7 = r13.mo17354b()
            int r8 = r11.getChildCount()
            r9 = 0
        L_0x01f1:
            if (r9 >= r8) goto L_0x0204
            android.view.View r10 = r11.getChildAt(r9)
            int r10 = r11.getPosition(r10)
            if (r10 < 0) goto L_0x0201
            if (r10 >= r7) goto L_0x0201
            r9 = r10
            goto L_0x0205
        L_0x0201:
            int r9 = r9 + 1
            goto L_0x01f1
        L_0x0204:
            r9 = 0
        L_0x0205:
            r0.f44929a = r9
            r0.f44930b = r5
        L_0x0209:
            r0.f44933e = r3
        L_0x020b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f44906w
            if (r7 != 0) goto L_0x022e
            int r7 = r11.f44900q
            if (r7 != r2) goto L_0x022e
            boolean r7 = r0.f44931c
            boolean r8 = r11.f44904u
            if (r7 != r8) goto L_0x0221
            boolean r7 = r11.mo17404K()
            boolean r8 = r11.f44905v
            if (r7 == r8) goto L_0x022e
        L_0x0221:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r11.f44902s
            int[] r8 = r7.f44912a
            if (r8 == 0) goto L_0x022a
            java.util.Arrays.fill(r8, r2)
        L_0x022a:
            r7.f44913b = r6
            r0.f44932d = r3
        L_0x022e:
            int r6 = r11.getChildCount()
            if (r6 <= 0) goto L_0x02e6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f44906w
            if (r6 == 0) goto L_0x023c
            int r6 = r6.f44920f
            if (r6 >= r3) goto L_0x02e6
        L_0x023c:
            boolean r6 = r0.f44932d
            if (r6 == 0) goto L_0x025b
            r1 = 0
        L_0x0241:
            int r6 = r11.f44890d
            if (r1 >= r6) goto L_0x02e6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f44891e
            r6 = r6[r1]
            r6.mo17452d()
            int r6 = r0.f44930b
            if (r6 == r5) goto L_0x0258
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f44891e
            r7 = r7[r1]
            r7.f44937b = r6
            r7.f44938c = r6
        L_0x0258:
            int r1 = r1 + 1
            goto L_0x0241
        L_0x025b:
            if (r1 != 0) goto L_0x027d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f44909z
            int[] r1 = r1.f44934f
            if (r1 != 0) goto L_0x0264
            goto L_0x027d
        L_0x0264:
            r1 = 0
        L_0x0265:
            int r6 = r11.f44890d
            if (r1 >= r6) goto L_0x02e6
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f44891e
            r6 = r6[r1]
            r6.mo17452d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.f44909z
            int[] r7 = r7.f44934f
            r7 = r7[r1]
            r6.f44937b = r7
            r6.f44938c = r7
            int r1 = r1 + 1
            goto L_0x0265
        L_0x027d:
            r1 = 0
        L_0x027e:
            int r6 = r11.f44890d
            if (r1 >= r6) goto L_0x02be
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f44891e
            r6 = r6[r1]
            boolean r7 = r11.f44898o
            int r8 = r0.f44930b
            if (r7 == 0) goto L_0x0291
            int r9 = r6.mo17457i(r5)
            goto L_0x0295
        L_0x0291:
            int r9 = r6.mo17460l(r5)
        L_0x0295:
            r6.mo17452d()
            if (r9 != r5) goto L_0x029b
            goto L_0x02bb
        L_0x029b:
            if (r7 == 0) goto L_0x02a7
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.y r10 = r10.f44892f
            int r10 = r10.mo17566g()
            if (r9 < r10) goto L_0x02bb
        L_0x02a7:
            if (r7 != 0) goto L_0x02b4
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.y r7 = r7.f44892f
            int r7 = r7.mo17570k()
            if (r9 <= r7) goto L_0x02b4
            goto L_0x02bb
        L_0x02b4:
            if (r8 == r5) goto L_0x02b7
            int r9 = r9 + r8
        L_0x02b7:
            r6.f44938c = r9
            r6.f44937b = r9
        L_0x02bb:
            int r1 = r1 + 1
            goto L_0x027e
        L_0x02be:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f44909z
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f44891e
            r1.getClass()
            int r7 = r6.length
            int[] r8 = r1.f44934f
            if (r8 == 0) goto L_0x02cd
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02d6
        L_0x02cd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r8 = r8.f44891e
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f44934f = r8
        L_0x02d6:
            r8 = 0
        L_0x02d7:
            if (r8 >= r7) goto L_0x02e6
            int[] r9 = r1.f44934f
            r10 = r6[r8]
            int r10 = r10.mo17460l(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02d7
        L_0x02e6:
            r11.detachAndScrapAttachedViews(r12)
            androidx.recyclerview.widget.r r1 = r11.f44896j
            r1.f45071a = r4
            r11.f44886A = r4
            androidx.recyclerview.widget.y r1 = r11.f44893g
            int r1 = r1.mo17571l()
            int r6 = r11.f44890d
            int r6 = r1 / r6
            r11.f44895i = r6
            androidx.recyclerview.widget.y r6 = r11.f44893g
            int r6 = r6.mo17568i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r11.f44907x = r1
            int r1 = r0.f44929a
            r11.mo17418Y(r1, r13)
            boolean r1 = r0.f44931c
            if (r1 == 0) goto L_0x0328
            r11.mo17415V(r2)
            androidx.recyclerview.widget.r r1 = r11.f44896j
            r11.mo17426x(r12, r1, r13)
            r11.mo17415V(r3)
            androidx.recyclerview.widget.r r1 = r11.f44896j
            int r2 = r0.f44929a
            int r6 = r1.f45074d
            int r2 = r2 + r6
            r1.f45073c = r2
            r11.mo17426x(r12, r1, r13)
            goto L_0x033f
        L_0x0328:
            r11.mo17415V(r3)
            androidx.recyclerview.widget.r r1 = r11.f44896j
            r11.mo17426x(r12, r1, r13)
            r11.mo17415V(r2)
            androidx.recyclerview.widget.r r1 = r11.f44896j
            int r2 = r0.f44929a
            int r6 = r1.f45074d
            int r2 = r2 + r6
            r1.f45073c = r2
            r11.mo17426x(r12, r1, r13)
        L_0x033f:
            androidx.recyclerview.widget.y r1 = r11.f44893g
            int r1 = r1.mo17568i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x034b
            goto L_0x03fe
        L_0x034b:
            r1 = 0
            int r2 = r11.getChildCount()
            r6 = 0
        L_0x0351:
            if (r6 >= r2) goto L_0x037c
            android.view.View r7 = r11.getChildAt(r6)
            androidx.recyclerview.widget.y r8 = r11.f44893g
            int r8 = r8.mo17562c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0363
            goto L_0x0379
        L_0x0363:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            boolean r7 = r7.f44911i
            if (r7 == 0) goto L_0x0375
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r7
            int r7 = r11.f44890d
            float r7 = (float) r7
            float r8 = r8 / r7
        L_0x0375:
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0379:
            int r6 = r6 + 1
            goto L_0x0351
        L_0x037c:
            int r6 = r11.f44895i
            int r7 = r11.f44890d
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.y r7 = r11.f44893g
            int r7 = r7.mo17568i()
            if (r7 != r5) goto L_0x0399
            androidx.recyclerview.widget.y r5 = r11.f44893g
            int r5 = r5.mo17571l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0399:
            int r5 = r11.f44890d
            int r5 = r1 / r5
            r11.f44895i = r5
            androidx.recyclerview.widget.y r5 = r11.f44893g
            int r5 = r5.mo17568i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r11.f44907x = r1
            int r1 = r11.f44895i
            if (r1 != r6) goto L_0x03b0
            goto L_0x03fe
        L_0x03b0:
            r1 = 0
        L_0x03b1:
            if (r1 >= r2) goto L_0x03fe
            android.view.View r5 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            boolean r8 = r7.f44911i
            if (r8 == 0) goto L_0x03c2
            goto L_0x03fb
        L_0x03c2:
            boolean r8 = r11.mo17404K()
            if (r8 == 0) goto L_0x03e4
            int r8 = r11.f44894h
            if (r8 != r3) goto L_0x03e4
            int r8 = r11.f44890d
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.f44910h
            int r7 = r7.f44940e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f44895i
            int r9 = r9 * r10
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03fb
        L_0x03e4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.f44910h
            int r7 = r7.f44940e
            int r8 = r11.f44895i
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f44894h
            if (r9 != r3) goto L_0x03f7
            int r8 = r8 - r7
            r5.offsetLeftAndRight(r8)
            goto L_0x03fb
        L_0x03f7:
            int r8 = r8 - r7
            r5.offsetTopAndBottom(r8)
        L_0x03fb:
            int r1 = r1 + 1
            goto L_0x03b1
        L_0x03fe:
            int r1 = r11.getChildCount()
            if (r1 <= 0) goto L_0x0415
            boolean r1 = r11.f44898o
            if (r1 == 0) goto L_0x040f
            r11.mo17396C(r12, r13, r3)
            r11.mo17397D(r12, r13, r4)
            goto L_0x0415
        L_0x040f:
            r11.mo17397D(r12, r13, r3)
            r11.mo17396C(r12, r13, r4)
        L_0x0415:
            if (r14 == 0) goto L_0x0440
            boolean r14 = r13.f44838g
            if (r14 != 0) goto L_0x0440
            int r14 = r11.f44903t
            if (r14 == 0) goto L_0x0431
            int r14 = r11.getChildCount()
            if (r14 <= 0) goto L_0x0431
            boolean r14 = r11.f44886A
            if (r14 != 0) goto L_0x042f
            android.view.View r14 = r11.mo17403J()
            if (r14 == 0) goto L_0x0431
        L_0x042f:
            r14 = 1
            goto L_0x0432
        L_0x0431:
            r14 = 0
        L_0x0432:
            if (r14 == 0) goto L_0x0440
            java.lang.Runnable r14 = r11.f44889D
            r11.removeCallbacks(r14)
            boolean r14 = r11.mo17422t()
            if (r14 == 0) goto L_0x0440
            goto L_0x0441
        L_0x0440:
            r3 = 0
        L_0x0441:
            boolean r14 = r13.f44838g
            if (r14 == 0) goto L_0x044a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f44909z
            r14.mo17448a()
        L_0x044a:
            boolean r14 = r0.f44931c
            r11.f44904u = r14
            boolean r14 = r11.mo17404K()
            r11.f44905v = r14
            if (r3 == 0) goto L_0x045e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f44909z
            r14.mo17448a()
            r11.mo17406M(r12, r13, r4)
        L_0x045e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo17406M(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    /* renamed from: N */
    public final boolean mo17407N(int i) {
        if (this.f44894h == 0) {
            return (i == -1) != this.f44898o;
        }
        return ((i == -1) == this.f44898o) == mo17404K();
    }

    /* renamed from: O */
    public void mo17408O(int i, RecyclerView.C16628w wVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo17399F();
            i2 = 1;
        } else {
            i3 = mo17398E();
            i2 = -1;
        }
        this.f44896j.f45071a = true;
        mo17418Y(i3, wVar);
        mo17415V(i2);
        C16677r rVar = this.f44896j;
        rVar.f45073c = i3 + rVar.f45074d;
        rVar.f45072b = Math.abs(i);
    }

    /* renamed from: P */
    public final void mo17409P(RecyclerView.C16625r rVar, C16677r rVar2) {
        if (rVar2.f45071a && !rVar2.f45079i) {
            if (rVar2.f45072b != 0) {
                int i = 1;
                if (rVar2.f45075e == -1) {
                    int i2 = rVar2.f45076f;
                    int l = this.f44891e[0].mo17460l(i2);
                    while (i < this.f44890d) {
                        int l2 = this.f44891e[i].mo17460l(i2);
                        if (l2 > l) {
                            l = l2;
                        }
                        i++;
                    }
                    int i3 = i2 - l;
                    mo17410Q(rVar, i3 < 0 ? rVar2.f45077g : rVar2.f45077g - Math.min(i3, rVar2.f45072b));
                    return;
                }
                int i4 = rVar2.f45077g;
                int i5 = this.f44891e[0].mo17457i(i4);
                while (i < this.f44890d) {
                    int i6 = this.f44891e[i].mo17457i(i4);
                    if (i6 < i5) {
                        i5 = i6;
                    }
                    i++;
                }
                int i7 = i5 - rVar2.f45077g;
                mo17411R(rVar, i7 < 0 ? rVar2.f45076f : Math.min(i7, rVar2.f45072b) + rVar2.f45076f);
            } else if (rVar2.f45075e == -1) {
                mo17410Q(rVar, rVar2.f45077g);
            } else {
                mo17411R(rVar, rVar2.f45076f);
            }
        }
    }

    /* renamed from: Q */
    public final void mo17410Q(RecyclerView.C16625r rVar, int i) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (this.f44892f.mo17564e(childAt) >= i && this.f44892f.mo17573o(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f44911i) {
                    int i2 = 0;
                    while (i2 < this.f44890d) {
                        if (this.f44891e[i2].f44936a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f44890d; i3++) {
                        this.f44891e[i3].mo17461m();
                    }
                } else if (layoutParams.f44910h.f44936a.size() != 1) {
                    layoutParams.f44910h.mo17461m();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, rVar);
                childCount--;
            } else {
                return;
            }
        }
    }

    /* renamed from: R */
    public final void mo17411R(RecyclerView.C16625r rVar, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f44892f.mo17561b(childAt) <= i && this.f44892f.mo17572n(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f44911i) {
                    int i2 = 0;
                    while (i2 < this.f44890d) {
                        if (this.f44891e[i2].f44936a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f44890d; i3++) {
                        this.f44891e[i3].mo17462n();
                    }
                } else if (layoutParams.f44910h.f44936a.size() != 1) {
                    layoutParams.f44910h.mo17462n();
                } else {
                    return;
                }
                removeAndRecycleView(childAt, rVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: S */
    public final void mo17412S() {
        if (this.f44894h == 1 || !mo17404K()) {
            this.f44898o = this.f44897n;
        } else {
            this.f44898o = !this.f44897n;
        }
    }

    /* renamed from: T */
    public int mo17413T(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo17408O(i, wVar);
        int x = mo17426x(rVar, this.f44896j, wVar);
        if (this.f44896j.f45072b >= x) {
            i = i < 0 ? -x : x;
        }
        this.f44892f.mo17574p(-i);
        this.f44904u = this.f44898o;
        C16677r rVar2 = this.f44896j;
        rVar2.f45072b = 0;
        mo17409P(rVar, rVar2);
        return i;
    }

    /* renamed from: U */
    public void mo17414U(int i, int i2) {
        SavedState savedState = this.f44906w;
        if (savedState != null) {
            savedState.f44921g = null;
            savedState.f44920f = 0;
            savedState.f44918d = -1;
            savedState.f44919e = -1;
        }
        this.f44900q = i;
        this.f44901r = i2;
        requestLayout();
    }

    /* renamed from: V */
    public final void mo17415V(int i) {
        C16677r rVar = this.f44896j;
        rVar.f45075e = i;
        int i2 = 1;
        if (this.f44898o != (i == -1)) {
            i2 = -1;
        }
        rVar.f45074d = i2;
    }

    /* renamed from: W */
    public void mo17416W(int i) {
        assertNotInLayoutOrScroll((String) null);
        if (i != this.f44890d) {
            LazySpanLookup lazySpanLookup = this.f44902s;
            int[] iArr = lazySpanLookup.f44912a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            lazySpanLookup.f44913b = null;
            requestLayout();
            this.f44890d = i;
            this.f44899p = new BitSet(this.f44890d);
            this.f44891e = new C16643c[this.f44890d];
            for (int i2 = 0; i2 < this.f44890d; i2++) {
                this.f44891e[i2] = new C16643c(i2);
            }
            requestLayout();
        }
    }

    /* renamed from: X */
    public final void mo17417X(int i, int i2) {
        for (int i3 = 0; i3 < this.f44890d; i3++) {
            if (!this.f44891e[i3].f44936a.isEmpty()) {
                mo17419Z(this.f44891e[i3], i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17418Y(int r5, androidx.recyclerview.widget.RecyclerView.C16628w r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.r r0 = r4.f44896j
            r1 = 0
            r0.f45072b = r1
            r0.f45073c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L_0x002c
            int r6 = r6.f44832a
            r0 = -1
            if (r6 == r0) goto L_0x002c
            boolean r0 = r4.f44898o
            if (r6 >= r5) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r0 != r5) goto L_0x0023
            androidx.recyclerview.widget.y r5 = r4.f44892f
            int r5 = r5.mo17571l()
            goto L_0x002d
        L_0x0023:
            androidx.recyclerview.widget.y r5 = r4.f44892f
            int r5 = r5.mo17571l()
            r6 = r5
            r5 = 0
            goto L_0x002e
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = 0
        L_0x002e:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L_0x004b
            androidx.recyclerview.widget.r r0 = r4.f44896j
            androidx.recyclerview.widget.y r3 = r4.f44892f
            int r3 = r3.mo17570k()
            int r3 = r3 - r6
            r0.f45076f = r3
            androidx.recyclerview.widget.r r6 = r4.f44896j
            androidx.recyclerview.widget.y r0 = r4.f44892f
            int r0 = r0.mo17566g()
            int r0 = r0 + r5
            r6.f45077g = r0
            goto L_0x005b
        L_0x004b:
            androidx.recyclerview.widget.r r0 = r4.f44896j
            androidx.recyclerview.widget.y r3 = r4.f44892f
            int r3 = r3.mo17565f()
            int r3 = r3 + r5
            r0.f45077g = r3
            androidx.recyclerview.widget.r r5 = r4.f44896j
            int r6 = -r6
            r5.f45076f = r6
        L_0x005b:
            androidx.recyclerview.widget.r r5 = r4.f44896j
            r5.f45078h = r1
            r5.f45071a = r2
            androidx.recyclerview.widget.y r6 = r4.f44892f
            int r6 = r6.mo17568i()
            if (r6 != 0) goto L_0x0072
            androidx.recyclerview.widget.y r6 = r4.f44892f
            int r6 = r6.mo17565f()
            if (r6 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r5.f45079i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo17418Y(int, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    /* renamed from: Z */
    public final void mo17419Z(C16643c cVar, int i, int i2) {
        int i3 = cVar.f44939d;
        if (i == -1) {
            int i4 = cVar.f44937b;
            if (i4 == Integer.MIN_VALUE) {
                cVar.mo17451c();
                i4 = cVar.f44937b;
            }
            if (i4 + i3 <= i2) {
                this.f44899p.set(cVar.f44940e, false);
                return;
            }
            return;
        }
        int i5 = cVar.f44938c;
        if (i5 == Integer.MIN_VALUE) {
            cVar.mo17450b();
            i5 = cVar.f44938c;
        }
        if (i5 - i3 >= i2) {
            this.f44899p.set(cVar.f44940e, false);
        }
    }

    /* renamed from: a0 */
    public final int mo17420a0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.f44906w == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public boolean canScrollHorizontally() {
        return this.f44894h == 0;
    }

    public boolean canScrollVertically() {
        return this.f44894h == 1;
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C16628w wVar, RecyclerView.LayoutManager.C16609c cVar) {
        int i3;
        int i4;
        if (this.f44894h != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            mo17408O(i, wVar);
            int[] iArr = this.f44888C;
            if (iArr == null || iArr.length < this.f44890d) {
                this.f44888C = new int[this.f44890d];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f44890d; i6++) {
                C16677r rVar = this.f44896j;
                if (rVar.f45074d == -1) {
                    i4 = rVar.f45076f;
                    i3 = this.f44891e[i6].mo17460l(i4);
                } else {
                    i4 = this.f44891e[i6].mo17457i(rVar.f45077g);
                    i3 = this.f44896j.f45077g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f44888C[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f44888C, 0, i5);
            int i8 = 0;
            while (i8 < i5) {
                int i9 = this.f44896j.f45073c;
                if (i9 >= 0 && i9 < wVar.mo17354b()) {
                    ((C16661o.C16663b) cVar).mo17525a(this.f44896j.f45073c, this.f44888C[i8]);
                    C16677r rVar2 = this.f44896j;
                    rVar2.f45073c += rVar2.f45074d;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public int computeHorizontalScrollExtent(RecyclerView.C16628w wVar) {
        return mo17423u(wVar);
    }

    public int computeHorizontalScrollOffset(RecyclerView.C16628w wVar) {
        return mo17424v(wVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.C16628w wVar) {
        return mo17425w(wVar);
    }

    public int computeVerticalScrollExtent(RecyclerView.C16628w wVar) {
        return mo17423u(wVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.C16628w wVar) {
        return mo17424v(wVar);
    }

    public int computeVerticalScrollRange(RecyclerView.C16628w wVar) {
        return mo17425w(wVar);
    }

    /* renamed from: f */
    public PointF mo16988f(int i) {
        int s = mo17421s(i);
        PointF pointF = new PointF();
        if (s == 0) {
            return null;
        }
        if (this.f44894h == 0) {
            pointF.x = (float) s;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) s;
        }
        return pointF;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f44894h == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getColumnCountForAccessibility(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return this.f44894h == 1 ? this.f44890d : super.getColumnCountForAccessibility(rVar, wVar);
    }

    public int getRowCountForAccessibility(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return this.f44894h == 0 ? this.f44890d : super.getRowCountForAccessibility(rVar, wVar);
    }

    public boolean isAutoMeasureEnabled() {
        return this.f44903t != 0;
    }

    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f44890d; i2++) {
            C16643c cVar = this.f44891e[i2];
            int i3 = cVar.f44937b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.f44937b = i3 + i;
            }
            int i4 = cVar.f44938c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.f44938c = i4 + i;
            }
        }
    }

    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f44890d; i2++) {
            C16643c cVar = this.f44891e[i2];
            int i3 = cVar.f44937b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.f44937b = i3 + i;
            }
            int i4 = cVar.f44938c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.f44938c = i4 + i;
            }
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C16625r rVar) {
        super.onDetachedFromWindow(recyclerView, rVar);
        removeCallbacks(this.f44889D);
        for (int i = 0; i < this.f44890d; i++) {
            this.f44891e[i].mo17452d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r9.f44894h == 1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r9.f44894h == 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (mo17404K() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (mo17404K() == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.C16625r r12, androidx.recyclerview.widget.RecyclerView.C16628w r13) {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.findContainingItemView(r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.mo17412S()
            r0 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            if (r11 == r3) goto L_0x0051
            r4 = 2
            if (r11 == r4) goto L_0x0045
            r4 = 17
            if (r11 == r4) goto L_0x0040
            r4 = 33
            if (r11 == r4) goto L_0x003a
            r4 = 66
            if (r11 == r4) goto L_0x0035
            r4 = 130(0x82, float:1.82E-43)
            if (r11 == r4) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            int r11 = r9.f44894h
            if (r11 != r3) goto L_0x0032
        L_0x0030:
            r11 = 1
            goto L_0x005d
        L_0x0032:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005d
        L_0x0035:
            int r11 = r9.f44894h
            if (r11 != 0) goto L_0x0032
            goto L_0x0030
        L_0x003a:
            int r11 = r9.f44894h
            if (r11 != r3) goto L_0x0032
        L_0x003e:
            r11 = -1
            goto L_0x005d
        L_0x0040:
            int r11 = r9.f44894h
            if (r11 != 0) goto L_0x0032
        L_0x0044:
            goto L_0x003e
        L_0x0045:
            int r11 = r9.f44894h
            if (r11 != r3) goto L_0x004a
            goto L_0x0030
        L_0x004a:
            boolean r11 = r9.mo17404K()
            if (r11 == 0) goto L_0x0030
            goto L_0x0055
        L_0x0051:
            int r11 = r9.f44894h
            if (r11 != r3) goto L_0x0056
        L_0x0055:
            goto L_0x0044
        L_0x0056:
            boolean r11 = r9.mo17404K()
            if (r11 == 0) goto L_0x003e
            goto L_0x0030
        L_0x005d:
            if (r11 != r2) goto L_0x0060
            return r1
        L_0x0060:
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r2
            boolean r4 = r2.f44911i
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = r2.f44910h
            if (r11 != r3) goto L_0x0071
            int r5 = r9.mo17399F()
            goto L_0x0075
        L_0x0071:
            int r5 = r9.mo17398E()
        L_0x0075:
            r9.mo17418Y(r5, r13)
            r9.mo17415V(r11)
            androidx.recyclerview.widget.r r6 = r9.f44896j
            int r7 = r6.f45074d
            int r7 = r7 + r5
            r6.f45073c = r7
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.y r8 = r9.f44892f
            int r8 = r8.mo17571l()
            float r8 = (float) r8
            float r8 = r8 * r7
            int r7 = (int) r8
            r6.f45072b = r7
            androidx.recyclerview.widget.r r6 = r9.f44896j
            r6.f45078h = r3
            r7 = 0
            r6.f45071a = r7
            r9.mo17426x(r12, r6, r13)
            boolean r12 = r9.f44898o
            r9.f44904u = r12
            if (r4 != 0) goto L_0x00aa
            android.view.View r12 = r2.mo17458j(r5, r11)
            if (r12 == 0) goto L_0x00aa
            if (r12 == r10) goto L_0x00aa
            return r12
        L_0x00aa:
            boolean r12 = r9.mo17407N(r11)
            if (r12 == 0) goto L_0x00c5
            int r12 = r9.f44890d
            int r12 = r12 - r3
        L_0x00b3:
            if (r12 < 0) goto L_0x00da
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f44891e
            r13 = r13[r12]
            android.view.View r13 = r13.mo17458j(r5, r11)
            if (r13 == 0) goto L_0x00c2
            if (r13 == r10) goto L_0x00c2
            return r13
        L_0x00c2:
            int r12 = r12 + -1
            goto L_0x00b3
        L_0x00c5:
            r12 = 0
        L_0x00c6:
            int r13 = r9.f44890d
            if (r12 >= r13) goto L_0x00da
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f44891e
            r13 = r13[r12]
            android.view.View r13 = r13.mo17458j(r5, r11)
            if (r13 == 0) goto L_0x00d7
            if (r13 == r10) goto L_0x00d7
            return r13
        L_0x00d7:
            int r12 = r12 + 1
            goto L_0x00c6
        L_0x00da:
            boolean r12 = r9.f44897n
            r12 = r12 ^ r3
            if (r11 != r0) goto L_0x00e1
            r13 = 1
            goto L_0x00e2
        L_0x00e1:
            r13 = 0
        L_0x00e2:
            if (r12 != r13) goto L_0x00e6
            r12 = 1
            goto L_0x00e7
        L_0x00e6:
            r12 = 0
        L_0x00e7:
            if (r4 != 0) goto L_0x00fd
            if (r12 == 0) goto L_0x00f0
            int r13 = r2.mo17453e()
            goto L_0x00f4
        L_0x00f0:
            int r13 = r2.mo17454f()
        L_0x00f4:
            android.view.View r13 = r9.findViewByPosition(r13)
            if (r13 == 0) goto L_0x00fd
            if (r13 == r10) goto L_0x00fd
            return r13
        L_0x00fd:
            boolean r11 = r9.mo17407N(r11)
            if (r11 == 0) goto L_0x012c
            int r11 = r9.f44890d
            int r11 = r11 - r3
        L_0x0106:
            if (r11 < 0) goto L_0x014f
            int r13 = r2.f44940e
            if (r11 != r13) goto L_0x010d
            goto L_0x0129
        L_0x010d:
            if (r12 == 0) goto L_0x0118
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f44891e
            r13 = r13[r11]
            int r13 = r13.mo17453e()
            goto L_0x0120
        L_0x0118:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f44891e
            r13 = r13[r11]
            int r13 = r13.mo17454f()
        L_0x0120:
            android.view.View r13 = r9.findViewByPosition(r13)
            if (r13 == 0) goto L_0x0129
            if (r13 == r10) goto L_0x0129
            return r13
        L_0x0129:
            int r11 = r11 + -1
            goto L_0x0106
        L_0x012c:
            int r11 = r9.f44890d
            if (r7 >= r11) goto L_0x014f
            if (r12 == 0) goto L_0x013b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r11 = r9.f44891e
            r11 = r11[r7]
            int r11 = r11.mo17453e()
            goto L_0x0143
        L_0x013b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r11 = r9.f44891e
            r11 = r11[r7]
            int r11 = r11.mo17454f()
        L_0x0143:
            android.view.View r11 = r9.findViewByPosition(r11)
            if (r11 == 0) goto L_0x014c
            if (r11 == r10) goto L_0x014c
            return r11
        L_0x014c:
            int r7 = r7 + 1
            goto L_0x012c
        L_0x014f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View z = mo17428z(false);
            View y = mo17427y(false);
            if (z != null && y != null) {
                int position = getPosition(z);
                int position2 = getPosition(y);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, View view, C107453d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, dVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.f44894h == 0) {
            int e = layoutParams2.mo17429e();
            boolean z = layoutParams2.f44911i;
            dVar.mo157853m(C107453d.C107455b.m145563a(e, z ? this.f44890d : 1, -1, -1, z, false));
            return;
        }
        int e2 = layoutParams2.mo17429e();
        boolean z2 = layoutParams2.f44911i;
        dVar.mo157853m(C107453d.C107455b.m145563a(-1, -1, e2, z2 ? this.f44890d : 1, z2, false));
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        mo17402I(i, i2, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        LazySpanLookup lazySpanLookup = this.f44902s;
        int[] iArr = lazySpanLookup.f44912a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        lazySpanLookup.f44913b = null;
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        mo17402I(i, i2, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        mo17402I(i, i2, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo17402I(i, i2, 4);
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        mo17406M(rVar, wVar, true);
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        this.f44900q = -1;
        this.f44901r = Integer.MIN_VALUE;
        this.f44906w = null;
        this.f44909z.mo17448a();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f44906w = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        int i;
        int i2;
        int[] iArr;
        SavedState savedState = this.f44906w;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f44925n = this.f44897n;
        savedState2.f44926o = this.f44904u;
        savedState2.f44927p = this.f44905v;
        LazySpanLookup lazySpanLookup = this.f44902s;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f44912a) == null) {
            savedState2.f44922h = 0;
        } else {
            savedState2.f44923i = iArr;
            savedState2.f44922h = iArr.length;
            savedState2.f44924j = lazySpanLookup.f44913b;
        }
        int i3 = -1;
        if (getChildCount() > 0) {
            savedState2.f44918d = this.f44904u ? mo17399F() : mo17398E();
            View y = this.f44898o ? mo17427y(true) : mo17428z(true);
            if (y != null) {
                i3 = getPosition(y);
            }
            savedState2.f44919e = i3;
            int i4 = this.f44890d;
            savedState2.f44920f = i4;
            savedState2.f44921g = new int[i4];
            for (int i5 = 0; i5 < this.f44890d; i5++) {
                if (this.f44904u) {
                    i = this.f44891e[i5].mo17457i(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f44892f.mo17566g();
                    } else {
                        savedState2.f44921g[i5] = i;
                    }
                } else {
                    i = this.f44891e[i5].mo17460l(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f44892f.mo17570k();
                    } else {
                        savedState2.f44921g[i5] = i;
                    }
                }
                i -= i2;
                savedState2.f44921g[i5] = i;
            }
        } else {
            savedState2.f44918d = -1;
            savedState2.f44919e = -1;
            savedState2.f44920f = 0;
        }
        return savedState2;
    }

    public void onScrollStateChanged(int i) {
        if (i == 0) {
            mo17422t();
        }
    }

    /* renamed from: s */
    public final int mo17421s(int i) {
        if (getChildCount() == 0) {
            return this.f44898o ? 1 : -1;
        }
        return (i < mo17398E()) != this.f44898o ? -1 : 1;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return mo17413T(i, rVar, wVar);
    }

    public void scrollToPosition(int i) {
        SavedState savedState = this.f44906w;
        if (!(savedState == null || savedState.f44918d == i)) {
            savedState.f44921g = null;
            savedState.f44920f = 0;
            savedState.f44918d = -1;
            savedState.f44919e = -1;
        }
        this.f44900q = i;
        this.f44901r = Integer.MIN_VALUE;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return mo17413T(i, rVar, wVar);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f44894h == 1) {
            i4 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            i3 = RecyclerView.LayoutManager.chooseSize(i, (this.f44895i * this.f44890d) + paddingLeft, getMinimumWidth());
        } else {
            i3 = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            i4 = RecyclerView.LayoutManager.chooseSize(i2, (this.f44895i * this.f44890d) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C54256s sVar = new C54256s(recyclerView.getContext());
        sVar.f44872a = i;
        startSmoothScroll(sVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.f44906w == null;
    }

    /* renamed from: t */
    public boolean mo17422t() {
        int i;
        int i2;
        if (getChildCount() == 0 || this.f44903t == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f44898o) {
            i2 = mo17399F();
            i = mo17398E();
        } else {
            i2 = mo17398E();
            i = mo17399F();
        }
        if (i2 == 0 && mo17403J() != null) {
            LazySpanLookup lazySpanLookup = this.f44902s;
            int[] iArr = lazySpanLookup.f44912a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            lazySpanLookup.f44913b = null;
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (!this.f44886A) {
            return false;
        } else {
            int i3 = this.f44898o ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem d = this.f44902s.mo17433d(i2, i4, i3, true);
            if (d == null) {
                this.f44886A = false;
                this.f44902s.mo17432c(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem d2 = this.f44902s.mo17433d(i2, d.f44914d, i3 * -1, true);
            if (d2 == null) {
                this.f44902s.mo17432c(d.f44914d);
            } else {
                this.f44902s.mo17432c(d2.f44914d + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
    }

    /* renamed from: u */
    public final int mo17423u(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C16649d0.m16066a(wVar, this.f44892f, mo17428z(!this.f44887B), mo17427y(!this.f44887B), this, this.f44887B);
    }

    /* renamed from: v */
    public final int mo17424v(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C16649d0.m16067b(wVar, this.f44892f, mo17428z(!this.f44887B), mo17427y(!this.f44887B), this, this.f44887B, this.f44898o);
    }

    /* renamed from: w */
    public final int mo17425w(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C16649d0.m16068c(wVar, this.f44892f, mo17428z(!this.f44887B), mo17427y(!this.f44887B), this, this.f44887B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x036b  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo17426x(androidx.recyclerview.widget.RecyclerView.C16625r r19, androidx.recyclerview.widget.C16677r r20, androidx.recyclerview.widget.RecyclerView.C16628w r21) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            java.util.BitSet r0 = r6.f44899p
            int r1 = r6.f44890d
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.r r0 = r6.f44896j
            boolean r0 = r0.f45079i
            if (r0 == 0) goto L_0x0020
            int r0 = r8.f45075e
            if (r0 != r10) goto L_0x001d
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0030
        L_0x001d:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0030
        L_0x0020:
            int r0 = r8.f45075e
            if (r0 != r10) goto L_0x002a
            int r0 = r8.f45077g
            int r1 = r8.f45072b
            int r0 = r0 + r1
            goto L_0x002f
        L_0x002a:
            int r0 = r8.f45076f
            int r1 = r8.f45072b
            int r0 = r0 - r1
        L_0x002f:
            r13 = r0
        L_0x0030:
            int r0 = r8.f45075e
            r6.mo17417X(r0, r13)
            boolean r0 = r6.f44898o
            if (r0 == 0) goto L_0x0040
            androidx.recyclerview.widget.y r0 = r6.f44892f
            int r0 = r0.mo17566g()
            goto L_0x0046
        L_0x0040:
            androidx.recyclerview.widget.y r0 = r6.f44892f
            int r0 = r0.mo17570k()
        L_0x0046:
            r14 = r0
            r0 = 0
        L_0x0048:
            int r1 = r8.f45073c
            if (r1 < 0) goto L_0x0054
            int r2 = r21.mo17354b()
            if (r1 >= r2) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            r2 = -1
            if (r1 == 0) goto L_0x037a
            androidx.recyclerview.widget.r r1 = r6.f44896j
            boolean r1 = r1.f45079i
            if (r1 != 0) goto L_0x0066
            java.util.BitSet r1 = r6.f44899p
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x037a
        L_0x0066:
            int r0 = r8.f45073c
            android.view.View r15 = r7.mo17341e(r0)
            int r0 = r8.f45073c
            int r1 = r8.f45074d
            int r0 = r0 + r1
            r8.f45073c = r0
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r5 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r5
            int r0 = r5.mo17280b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f44902s
            int[] r1 = r1.f44912a
            if (r1 == 0) goto L_0x008b
            int r3 = r1.length
            if (r0 < r3) goto L_0x0088
            goto L_0x008b
        L_0x0088:
            r1 = r1[r0]
            goto L_0x008c
        L_0x008b:
            r1 = -1
        L_0x008c:
            if (r1 != r2) goto L_0x0090
            r3 = 1
            goto L_0x0091
        L_0x0090:
            r3 = 0
        L_0x0091:
            if (r3 == 0) goto L_0x00fc
            boolean r1 = r5.f44911i
            if (r1 == 0) goto L_0x009c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r6.f44891e
            r1 = r1[r9]
            goto L_0x00f0
        L_0x009c:
            int r1 = r8.f45075e
            boolean r1 = r6.mo17407N(r1)
            if (r1 == 0) goto L_0x00ab
            int r1 = r6.f44890d
            int r1 = r1 - r10
            r4 = -1
            r16 = -1
            goto L_0x00b1
        L_0x00ab:
            int r1 = r6.f44890d
            r4 = r1
            r1 = 0
            r16 = 1
        L_0x00b1:
            int r11 = r8.f45075e
            r17 = 0
            if (r11 != r10) goto L_0x00d4
            androidx.recyclerview.widget.y r11 = r6.f44892f
            int r11 = r11.mo17570k()
            r12 = 2147483647(0x7fffffff, float:NaN)
        L_0x00c0:
            if (r1 == r4) goto L_0x00ee
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r2 = r6.f44891e
            r2 = r2[r1]
            int r9 = r2.mo17457i(r11)
            if (r9 >= r12) goto L_0x00cf
            r17 = r2
            r12 = r9
        L_0x00cf:
            int r1 = r1 + r16
            r2 = -1
            r9 = 0
            goto L_0x00c0
        L_0x00d4:
            androidx.recyclerview.widget.y r2 = r6.f44892f
            int r2 = r2.mo17566g()
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00dc:
            if (r1 == r4) goto L_0x00ee
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r11 = r6.f44891e
            r11 = r11[r1]
            int r12 = r11.mo17460l(r2)
            if (r12 <= r9) goto L_0x00eb
            r17 = r11
            r9 = r12
        L_0x00eb:
            int r1 = r1 + r16
            goto L_0x00dc
        L_0x00ee:
            r1 = r17
        L_0x00f0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r2 = r6.f44902s
            r2.mo17431b(r0)
            int[] r2 = r2.f44912a
            int r4 = r1.f44940e
            r2[r0] = r4
            goto L_0x0100
        L_0x00fc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r2 = r6.f44891e
            r1 = r2[r1]
        L_0x0100:
            r9 = r1
            r5.f44910h = r9
            int r1 = r8.f45075e
            if (r1 != r10) goto L_0x010b
            r6.addView(r15)
            goto L_0x010f
        L_0x010b:
            r1 = 0
            r6.addView(r15, r1)
        L_0x010f:
            boolean r1 = r5.f44911i
            if (r1 == 0) goto L_0x0153
            int r1 = r6.f44894h
            if (r1 != r10) goto L_0x0135
            int r1 = r6.f44907x
            int r2 = r18.getHeight()
            int r4 = r18.getHeightMode()
            int r11 = r18.getPaddingTop()
            int r12 = r18.getPaddingBottom()
            int r11 = r11 + r12
            int r12 = r5.height
            int r2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r2, r4, r11, r12, r10)
            r4 = 0
            r6.mo17405L(r15, r1, r2, r4)
            goto L_0x01a7
        L_0x0135:
            r4 = 0
            int r1 = r18.getWidth()
            int r2 = r18.getWidthMode()
            int r11 = r18.getPaddingLeft()
            int r12 = r18.getPaddingRight()
            int r11 = r11 + r12
            int r12 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r2, r11, r12, r10)
            int r2 = r6.f44907x
            r6.mo17405L(r15, r1, r2, r4)
            goto L_0x01a7
        L_0x0153:
            r4 = 0
            int r1 = r6.f44894h
            if (r1 != r10) goto L_0x0180
            int r1 = r6.f44895i
            int r2 = r18.getWidthMode()
            int r11 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r2, r4, r11, r4)
            int r2 = r18.getHeight()
            int r11 = r18.getHeightMode()
            int r12 = r18.getPaddingTop()
            int r16 = r18.getPaddingBottom()
            int r12 = r12 + r16
            int r7 = r5.height
            int r2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r2, r11, r12, r7, r10)
            r6.mo17405L(r15, r1, r2, r4)
            goto L_0x01a7
        L_0x0180:
            int r1 = r18.getWidth()
            int r2 = r18.getWidthMode()
            int r4 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r4 = r4 + r7
            int r7 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r1, r2, r4, r7, r10)
            int r2 = r6.f44895i
            int r4 = r18.getHeightMode()
            int r7 = r5.height
            r11 = 0
            int r2 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r2, r4, r11, r7, r11)
            r6.mo17405L(r15, r1, r2, r11)
        L_0x01a7:
            int r1 = r8.f45075e
            if (r1 != r10) goto L_0x01f3
            boolean r1 = r5.f44911i
            if (r1 == 0) goto L_0x01b4
            int r1 = r6.mo17400G(r14)
            goto L_0x01b8
        L_0x01b4:
            int r1 = r9.mo17457i(r14)
        L_0x01b8:
            androidx.recyclerview.widget.y r2 = r6.f44892f
            int r2 = r2.mo17562c(r15)
            int r2 = r2 + r1
            if (r3 == 0) goto L_0x01f0
            boolean r4 = r5.f44911i
            if (r4 == 0) goto L_0x01f0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r4 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r4.<init>()
            int r7 = r6.f44890d
            int[] r7 = new int[r7]
            r4.f44916f = r7
            r7 = 0
        L_0x01d1:
            int r11 = r6.f44890d
            if (r7 >= r11) goto L_0x01e6
            int[] r11 = r4.f44916f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r6.f44891e
            r12 = r12[r7]
            int r12 = r12.mo17457i(r1)
            int r12 = r1 - r12
            r11[r7] = r12
            int r7 = r7 + 1
            goto L_0x01d1
        L_0x01e6:
            r7 = -1
            r4.f44915e = r7
            r4.f44914d = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f44902s
            r7.mo17430a(r4)
        L_0x01f0:
            r4 = r1
            r7 = r2
            goto L_0x0239
        L_0x01f3:
            boolean r1 = r5.f44911i
            if (r1 == 0) goto L_0x01fc
            int r1 = r6.mo17401H(r14)
            goto L_0x0200
        L_0x01fc:
            int r1 = r9.mo17460l(r14)
        L_0x0200:
            androidx.recyclerview.widget.y r2 = r6.f44892f
            int r2 = r2.mo17562c(r15)
            int r2 = r1 - r2
            if (r3 == 0) goto L_0x0237
            boolean r4 = r5.f44911i
            if (r4 == 0) goto L_0x0237
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r4 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r4.<init>()
            int r7 = r6.f44890d
            int[] r7 = new int[r7]
            r4.f44916f = r7
            r7 = 0
        L_0x021a:
            int r11 = r6.f44890d
            if (r7 >= r11) goto L_0x022e
            int[] r11 = r4.f44916f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r6.f44891e
            r12 = r12[r7]
            int r12 = r12.mo17460l(r1)
            int r12 = r12 - r1
            r11[r7] = r12
            int r7 = r7 + 1
            goto L_0x021a
        L_0x022e:
            r4.f44915e = r10
            r4.f44914d = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f44902s
            r7.mo17430a(r4)
        L_0x0237:
            r7 = r1
            r4 = r2
        L_0x0239:
            boolean r1 = r5.f44911i
            if (r1 == 0) goto L_0x0299
            int r1 = r8.f45074d
            r2 = -1
            if (r1 != r2) goto L_0x0299
            if (r3 == 0) goto L_0x0247
            r6.f44886A = r10
            goto L_0x0299
        L_0x0247:
            int r1 = r8.f45075e
            if (r1 != r10) goto L_0x0269
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r6.f44891e
            r2 = 0
            r1 = r1[r2]
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1.mo17457i(r11)
            r2 = 1
        L_0x0257:
            int r3 = r6.f44890d
            if (r2 >= r3) goto L_0x0288
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r3 = r6.f44891e
            r3 = r3[r2]
            int r3 = r3.mo17457i(r11)
            if (r3 == r1) goto L_0x0266
            goto L_0x0283
        L_0x0266:
            int r2 = r2 + 1
            goto L_0x0257
        L_0x0269:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r6.f44891e
            r2 = 0
            r1 = r1[r2]
            int r1 = r1.mo17460l(r11)
            r2 = 1
        L_0x0275:
            int r3 = r6.f44890d
            if (r2 >= r3) goto L_0x0288
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r3 = r6.f44891e
            r3 = r3[r2]
            int r3 = r3.mo17460l(r11)
            if (r3 == r1) goto L_0x0285
        L_0x0283:
            r1 = 0
            goto L_0x0289
        L_0x0285:
            int r2 = r2 + 1
            goto L_0x0275
        L_0x0288:
            r1 = 1
        L_0x0289:
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x029b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f44902s
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.mo17434e(r0)
            if (r0 == 0) goto L_0x0296
            r0.f44917g = r10
        L_0x0296:
            r6.f44886A = r10
            goto L_0x029b
        L_0x0299:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x029b:
            int r0 = r8.f45075e
            if (r0 != r10) goto L_0x02b7
            boolean r0 = r5.f44911i
            if (r0 == 0) goto L_0x02b1
            int r0 = r6.f44890d
        L_0x02a5:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x02ce
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r6.f44891e
            r1 = r1[r0]
            r1.mo17449a(r15)
            goto L_0x02a5
        L_0x02b1:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r5.f44910h
            r0.mo17449a(r15)
            goto L_0x02ce
        L_0x02b7:
            boolean r0 = r5.f44911i
            if (r0 == 0) goto L_0x02c9
            int r0 = r6.f44890d
        L_0x02bd:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x02ce
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r6.f44891e
            r1 = r1[r0]
            r1.mo17463o(r15)
            goto L_0x02bd
        L_0x02c9:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r5.f44910h
            r0.mo17463o(r15)
        L_0x02ce:
            boolean r0 = r18.mo17404K()
            if (r0 == 0) goto L_0x02ff
            int r0 = r6.f44894h
            if (r0 != r10) goto L_0x02ff
            boolean r0 = r5.f44911i
            if (r0 == 0) goto L_0x02e3
            androidx.recyclerview.widget.y r0 = r6.f44893g
            int r0 = r0.mo17566g()
            goto L_0x02f4
        L_0x02e3:
            androidx.recyclerview.widget.y r0 = r6.f44893g
            int r0 = r0.mo17566g()
            int r1 = r6.f44890d
            int r1 = r1 - r10
            int r2 = r9.f44940e
            int r1 = r1 - r2
            int r2 = r6.f44895i
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x02f4:
            androidx.recyclerview.widget.y r1 = r6.f44893g
            int r1 = r1.mo17562c(r15)
            int r1 = r0 - r1
            r12 = r0
            r3 = r1
            goto L_0x0320
        L_0x02ff:
            boolean r0 = r5.f44911i
            if (r0 == 0) goto L_0x030a
            androidx.recyclerview.widget.y r0 = r6.f44893g
            int r0 = r0.mo17570k()
            goto L_0x0317
        L_0x030a:
            int r0 = r9.f44940e
            int r1 = r6.f44895i
            int r0 = r0 * r1
            androidx.recyclerview.widget.y r1 = r6.f44893g
            int r1 = r1.mo17570k()
            int r0 = r0 + r1
        L_0x0317:
            androidx.recyclerview.widget.y r1 = r6.f44893g
            int r1 = r1.mo17562c(r15)
            int r1 = r1 + r0
            r3 = r0
            r12 = r1
        L_0x0320:
            int r0 = r6.f44894h
            if (r0 != r10) goto L_0x0331
            r0 = r18
            r1 = r15
            r2 = r3
            r3 = r4
            r4 = r12
            r12 = r5
            r5 = r7
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            r7 = r12
            goto L_0x033b
        L_0x0331:
            r0 = r18
            r1 = r15
            r2 = r4
            r4 = r7
            r7 = r5
            r5 = r12
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
        L_0x033b:
            boolean r0 = r7.f44911i
            if (r0 == 0) goto L_0x0347
            androidx.recyclerview.widget.r r0 = r6.f44896j
            int r0 = r0.f45075e
            r6.mo17417X(r0, r13)
            goto L_0x034e
        L_0x0347:
            androidx.recyclerview.widget.r r0 = r6.f44896j
            int r0 = r0.f45075e
            r6.mo17419Z(r9, r0, r13)
        L_0x034e:
            androidx.recyclerview.widget.r r0 = r6.f44896j
            r1 = r19
            r6.mo17409P(r1, r0)
            androidx.recyclerview.widget.r r0 = r6.f44896j
            boolean r0 = r0.f45078h
            if (r0 == 0) goto L_0x0374
            boolean r0 = r15.hasFocusable()
            if (r0 == 0) goto L_0x0374
            boolean r0 = r7.f44911i
            if (r0 == 0) goto L_0x036b
            java.util.BitSet r0 = r6.f44899p
            r0.clear()
            goto L_0x0374
        L_0x036b:
            java.util.BitSet r0 = r6.f44899p
            int r2 = r9.f44940e
            r3 = 0
            r0.set(r2, r3)
            goto L_0x0375
        L_0x0374:
            r3 = 0
        L_0x0375:
            r7 = r1
            r0 = 1
            r9 = 0
            goto L_0x0048
        L_0x037a:
            r1 = r7
            r3 = 0
            if (r0 != 0) goto L_0x0383
            androidx.recyclerview.widget.r r0 = r6.f44896j
            r6.mo17409P(r1, r0)
        L_0x0383:
            androidx.recyclerview.widget.r r0 = r6.f44896j
            int r0 = r0.f45075e
            r1 = -1
            if (r0 != r1) goto L_0x039c
            androidx.recyclerview.widget.y r0 = r6.f44892f
            int r0 = r0.mo17570k()
            int r0 = r6.mo17401H(r0)
            androidx.recyclerview.widget.y r1 = r6.f44892f
            int r1 = r1.mo17570k()
            int r1 = r1 - r0
            goto L_0x03ae
        L_0x039c:
            androidx.recyclerview.widget.y r0 = r6.f44892f
            int r0 = r0.mo17566g()
            int r0 = r6.mo17400G(r0)
            androidx.recyclerview.widget.y r1 = r6.f44892f
            int r1 = r1.mo17566g()
            int r1 = r0 - r1
        L_0x03ae:
            if (r1 <= 0) goto L_0x03b7
            int r0 = r8.f45072b
            int r9 = java.lang.Math.min(r0, r1)
            goto L_0x03b8
        L_0x03b7:
            r9 = 0
        L_0x03b8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo17426x(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView$w):int");
    }

    /* renamed from: y */
    public View mo17427y(boolean z) {
        int k = this.f44892f.mo17570k();
        int g = this.f44892f.mo17566g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e = this.f44892f.mo17564e(childAt);
            int b = this.f44892f.mo17561b(childAt);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: z */
    public View mo17428z(boolean z) {
        int k = this.f44892f.mo17570k();
        int g = this.f44892f.mo17566g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int e = this.f44892f.mo17564e(childAt);
            if (this.f44892f.mo17561b(childAt) > k && e < g) {
                if (e >= k || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f44912a;

        /* renamed from: b */
        public List<FullSpanItem> f44913b;

        /* renamed from: a */
        public void mo17430a(FullSpanItem fullSpanItem) {
            if (this.f44913b == null) {
                this.f44913b = new ArrayList();
            }
            int size = this.f44913b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f44913b.get(i);
                if (fullSpanItem2.f44914d == fullSpanItem.f44914d) {
                    this.f44913b.remove(i);
                }
                if (fullSpanItem2.f44914d >= fullSpanItem.f44914d) {
                    this.f44913b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f44913b.add(fullSpanItem);
        }

        /* renamed from: b */
        public void mo17431b(int i) {
            int[] iArr = this.f44912a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f44912a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f44912a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f44912a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: c */
        public int mo17432c(int i) {
            List<FullSpanItem> list = this.f44913b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f44913b.get(size).f44914d >= i) {
                        this.f44913b.remove(size);
                    }
                }
            }
            return mo17435f(i);
        }

        /* renamed from: d */
        public FullSpanItem mo17433d(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f44913b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f44913b.get(i4);
                int i5 = fullSpanItem.f44914d;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f44915e == i3 || (z && fullSpanItem.f44917g))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: e */
        public FullSpanItem mo17434e(int i) {
            List<FullSpanItem> list = this.f44913b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f44913b.get(size);
                if (fullSpanItem.f44914d == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo17435f(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f44912a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f44913b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.mo17434e(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.f44913b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f44913b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f44913b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f44914d
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = -1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f44913b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f44913b
                r3.remove(r2)
                int r0 = r0.f44914d
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f44912a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f44912a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.f44912a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.mo17435f(int):int");
        }

        /* renamed from: g */
        public void mo17436g(int i, int i2) {
            int[] iArr = this.f44912a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo17431b(i3);
                int[] iArr2 = this.f44912a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f44912a, i, i3, -1);
                List<FullSpanItem> list = this.f44913b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f44913b.get(size);
                        int i4 = fullSpanItem.f44914d;
                        if (i4 >= i) {
                            fullSpanItem.f44914d = i4 + i2;
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo17437h(int i, int i2) {
            int[] iArr = this.f44912a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo17431b(i3);
                int[] iArr2 = this.f44912a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f44912a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<FullSpanItem> list = this.f44913b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f44913b.get(size);
                        int i4 = fullSpanItem.f44914d;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f44913b.remove(size);
                            } else {
                                fullSpanItem.f44914d = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C16639a();

            /* renamed from: d */
            public int f44914d;

            /* renamed from: e */
            public int f44915e;

            /* renamed from: f */
            public int[] f44916f;

            /* renamed from: g */
            public boolean f44917g;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public static class C16639a implements Parcelable.Creator<FullSpanItem> {
                public Object createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public Object[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f44914d = parcel.readInt();
                this.f44915e = parcel.readInt();
                this.f44917g = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f44916f = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f44914d + ", mGapDir=" + this.f44915e + ", mHasUnwantedGapAfter=" + this.f44917g + ", mGapPerSpan=" + Arrays.toString(this.f44916f) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f44914d);
                parcel.writeInt(this.f44915e);
                parcel.writeInt(this.f44917g ? 1 : 0);
                int[] iArr = this.f44916f;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f44916f);
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f44894h = i2;
        mo17416W(i);
        this.f44896j = new C16677r();
        this.f44892f = C16682y.m16171a(this, this.f44894h);
        this.f44893g = C16682y.m16171a(this, 1 - this.f44894h);
    }
}
