package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C16661o;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mapsdk.internal.C0947jz;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

public class LinearLayoutManager extends RecyclerView.LayoutManager implements C16665p.C16672g, RecyclerView.C16634v.C16636b {

    /* renamed from: d */
    public int f44675d;

    /* renamed from: e */
    public C16605c f44676e;

    /* renamed from: f */
    public C16682y f44677f;

    /* renamed from: g */
    public boolean f44678g;

    /* renamed from: h */
    public boolean f44679h;

    /* renamed from: i */
    public boolean f44680i;

    /* renamed from: j */
    public boolean f44681j;

    /* renamed from: n */
    public boolean f44682n;

    /* renamed from: o */
    public int f44683o;

    /* renamed from: p */
    public int f44684p;

    /* renamed from: q */
    public boolean f44685q;

    /* renamed from: r */
    public SavedState f44686r;

    /* renamed from: s */
    public final C16603a f44687s;

    /* renamed from: t */
    public final C16604b f44688t;

    /* renamed from: u */
    public int f44689u;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16602a();

        /* renamed from: d */
        public int f44690d;

        /* renamed from: e */
        public int f44691e;

        /* renamed from: f */
        public boolean f44692f;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public static class C16602a implements Parcelable.Creator<SavedState> {
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
            parcel.writeInt(this.f44690d);
            parcel.writeInt(this.f44691e);
            parcel.writeInt(this.f44692f ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f44690d = parcel.readInt();
            this.f44691e = parcel.readInt();
            this.f44692f = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f44690d = savedState.f44690d;
            this.f44691e = savedState.f44691e;
            this.f44692f = savedState.f44692f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C16603a {

        /* renamed from: a */
        public C16682y f44693a;

        /* renamed from: b */
        public int f44694b;

        /* renamed from: c */
        public int f44695c;

        /* renamed from: d */
        public boolean f44696d;

        /* renamed from: e */
        public boolean f44697e;

        public C16603a() {
            mo17012d();
        }

        /* renamed from: a */
        public void mo17009a() {
            this.f44695c = this.f44696d ? this.f44693a.mo17566g() : this.f44693a.mo17570k();
        }

        /* renamed from: b */
        public void mo17010b(View view, int i) {
            if (this.f44696d) {
                this.f44695c = this.f44693a.mo17561b(view) + this.f44693a.mo17575m();
            } else {
                this.f44695c = this.f44693a.mo17564e(view);
            }
            this.f44694b = i;
        }

        /* renamed from: c */
        public void mo17011c(View view, int i) {
            int m = this.f44693a.mo17575m();
            if (m >= 0) {
                mo17010b(view, i);
                return;
            }
            this.f44694b = i;
            if (this.f44696d) {
                int g = (this.f44693a.mo17566g() - m) - this.f44693a.mo17561b(view);
                this.f44695c = this.f44693a.mo17566g() - g;
                if (g > 0) {
                    int c = this.f44695c - this.f44693a.mo17562c(view);
                    int k = this.f44693a.mo17570k();
                    int min = c - (k + Math.min(this.f44693a.mo17564e(view) - k, 0));
                    if (min < 0) {
                        this.f44695c += Math.min(g, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int e = this.f44693a.mo17564e(view);
            int k2 = e - this.f44693a.mo17570k();
            this.f44695c = e;
            if (k2 > 0) {
                int g2 = (this.f44693a.mo17566g() - Math.min(0, (this.f44693a.mo17566g() - m) - this.f44693a.mo17561b(view))) - (e + this.f44693a.mo17562c(view));
                if (g2 < 0) {
                    this.f44695c -= Math.min(k2, -g2);
                }
            }
        }

        /* renamed from: d */
        public void mo17012d() {
            this.f44694b = -1;
            this.f44695c = Integer.MIN_VALUE;
            this.f44696d = false;
            this.f44697e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f44694b + ", mCoordinate=" + this.f44695c + ", mLayoutFromEnd=" + this.f44696d + ", mValid=" + this.f44697e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C16604b {

        /* renamed from: a */
        public int f44698a;

        /* renamed from: b */
        public boolean f44699b;

        /* renamed from: c */
        public boolean f44700c;

        /* renamed from: d */
        public boolean f44701d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C16605c {

        /* renamed from: a */
        public boolean f44702a = true;

        /* renamed from: b */
        public int f44703b;

        /* renamed from: c */
        public int f44704c;

        /* renamed from: d */
        public int f44705d;

        /* renamed from: e */
        public int f44706e;

        /* renamed from: f */
        public int f44707f;

        /* renamed from: g */
        public int f44708g;

        /* renamed from: h */
        public int f44709h = 0;

        /* renamed from: i */
        public int f44710i;

        /* renamed from: j */
        public List<RecyclerView.C16631z> f44711j = null;

        /* renamed from: k */
        public boolean f44712k;

        /* renamed from: a */
        public void mo17014a(View view) {
            int b;
            int size = this.f44711j.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f44711j.get(i2).f44854d;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo17282d() && (b = (layoutParams.mo17280b() - this.f44705d) * this.f44706e) >= 0 && b < i) {
                    view2 = view3;
                    if (b == 0) {
                        break;
                    }
                    i = b;
                }
            }
            if (view2 == null) {
                this.f44705d = -1;
            } else {
                this.f44705d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).mo17280b();
            }
        }

        /* renamed from: b */
        public View mo17015b(RecyclerView.C16625r rVar) {
            List<RecyclerView.C16631z> list = this.f44711j;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f44711j.get(i).f44854d;
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (!layoutParams.mo17282d() && this.f44705d == layoutParams.mo17280b()) {
                        mo17014a(view);
                        return view;
                    }
                }
                return null;
            }
            View e = rVar.mo17341e(this.f44705d);
            this.f44705d += this.f44706e;
            return e;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: A */
    public final View mo16955A(boolean z, boolean z2) {
        return this.f44680i ? mo16961G(0, getChildCount(), z, z2) : mo16961G(getChildCount() - 1, -1, z, z2);
    }

    /* renamed from: B */
    public final View mo16956B(boolean z, boolean z2) {
        return this.f44680i ? mo16961G(getChildCount() - 1, -1, z, z2) : mo16961G(0, getChildCount(), z, z2);
    }

    /* renamed from: C */
    public int mo16957C() {
        View G = mo16961G(0, getChildCount(), false, true);
        if (G == null) {
            return -1;
        }
        return getPosition(G);
    }

    /* renamed from: D */
    public int mo16958D() {
        View G = mo16961G(getChildCount() - 1, -1, true, false);
        if (G == null) {
            return -1;
        }
        return getPosition(G);
    }

    /* renamed from: E */
    public int mo16959E() {
        View G = mo16961G(getChildCount() - 1, -1, false, true);
        if (G == null) {
            return -1;
        }
        return getPosition(G);
    }

    /* renamed from: F */
    public View mo16960F(int i, int i2) {
        int i3;
        int i4;
        mo17002x();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return getChildAt(i);
        }
        if (this.f44677f.mo17564e(getChildAt(i)) < this.f44677f.mo17570k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return this.f44675d == 0 ? this.mHorizontalBoundCheck.mo17509a(i, i2, i4, i3) : this.mVerticalBoundCheck.mo17509a(i, i2, i4, i3);
    }

    /* renamed from: G */
    public View mo16961G(int i, int i2, boolean z, boolean z2) {
        mo17002x();
        int i3 = C0947jz.f2205e;
        int i4 = z ? 24579 : C0947jz.f2205e;
        if (!z2) {
            i3 = 0;
        }
        return this.f44675d == 0 ? this.mHorizontalBoundCheck.mo17509a(i, i2, i4, i3) : this.mVerticalBoundCheck.mo17509a(i, i2, i4, i3);
    }

    /* renamed from: H */
    public View mo16924H(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i, int i2, int i3) {
        mo17002x();
        int k = this.f44677f.mo17570k();
        int g = this.f44677f.mo17566g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).mo17282d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f44677f.mo17564e(childAt) < g && this.f44677f.mo17561b(childAt) >= k) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* renamed from: I */
    public final int mo16962I(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, boolean z) {
        int g;
        int g2 = this.f44677f.mo17566g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -mo16972U(-g2, rVar, wVar);
        int i3 = i + i2;
        if (!z || (g = this.f44677f.mo17566g() - i3) <= 0) {
            return i2;
        }
        this.f44677f.mo17574p(g);
        return g + i2;
    }

    /* renamed from: J */
    public final int mo16963J(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, boolean z) {
        int k;
        int k2 = i - this.f44677f.mo17570k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -mo16972U(k2, rVar, wVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.f44677f.mo17570k()) <= 0) {
            return i2;
        }
        this.f44677f.mo17574p(-k);
        return i2 - k;
    }

    /* renamed from: K */
    public final View mo16964K() {
        return getChildAt(this.f44680i ? 0 : getChildCount() - 1);
    }

    /* renamed from: L */
    public final View mo16965L() {
        return getChildAt(this.f44680i ? getChildCount() - 1 : 0);
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        if (wVar.f44832a != -1) {
            return this.f44677f.mo17571l();
        }
        return 0;
    }

    /* renamed from: N */
    public int mo16967N() {
        return this.f44675d;
    }

    /* renamed from: O */
    public boolean mo16968O() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: P */
    public void mo16925P(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, C16605c cVar, C16604b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View b = cVar.mo17015b(rVar);
        if (b == null) {
            bVar.f44699b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) b.getLayoutParams();
        if (cVar.f44711j == null) {
            if (this.f44680i == (cVar.f44707f == -1)) {
                addView(b);
            } else {
                addView(b, 0);
            }
        } else {
            if (this.f44680i == (cVar.f44707f == -1)) {
                addDisappearingView(b);
            } else {
                addDisappearingView(b, 0);
            }
        }
        measureChildWithMargins(b, 0, 0);
        bVar.f44698a = this.f44677f.mo17562c(b);
        if (this.f44675d == 1) {
            if (mo16968O()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.f44677f.mo17563d(b);
            } else {
                i4 = getPaddingLeft();
                i5 = this.f44677f.mo17563d(b) + i4;
            }
            if (cVar.f44707f == -1) {
                int i6 = cVar.f44703b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f44698a;
            } else {
                int i7 = cVar.f44703b;
                i3 = i7;
                i2 = i5;
                i = bVar.f44698a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d = this.f44677f.mo17563d(b) + paddingTop;
            if (cVar.f44707f == -1) {
                int i8 = cVar.f44703b;
                i2 = i8;
                i3 = paddingTop;
                i = d;
                i4 = i8 - bVar.f44698a;
            } else {
                int i9 = cVar.f44703b;
                i3 = paddingTop;
                i2 = bVar.f44698a + i9;
                i = d;
                i4 = i9;
            }
        }
        layoutDecoratedWithMargins(b, i4, i3, i2, i);
        if (layoutParams.mo17282d() || layoutParams.mo17281c()) {
            bVar.f44700c = true;
        }
        bVar.f44701d = b.hasFocusable();
    }

    /* renamed from: Q */
    public void mo16926Q(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, C16603a aVar, int i) {
    }

    /* renamed from: R */
    public final void mo16969R(RecyclerView.C16625r rVar, C16605c cVar) {
        if (cVar.f44702a && !cVar.f44712k) {
            if (cVar.f44707f == -1) {
                int i = cVar.f44708g;
                int childCount = getChildCount();
                if (i >= 0) {
                    int f = this.f44677f.mo17565f() - i;
                    if (this.f44680i) {
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = getChildAt(i2);
                            if (this.f44677f.mo17564e(childAt) < f || this.f44677f.mo17573o(childAt) < f) {
                                mo16970S(rVar, 0, i2);
                                return;
                            }
                        }
                        return;
                    }
                    int i3 = childCount - 1;
                    for (int i4 = i3; i4 >= 0; i4--) {
                        View childAt2 = getChildAt(i4);
                        if (this.f44677f.mo17564e(childAt2) < f || this.f44677f.mo17573o(childAt2) < f) {
                            mo16970S(rVar, i3, i4);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i5 = cVar.f44708g;
            if (i5 >= 0) {
                int childCount2 = getChildCount();
                if (this.f44680i) {
                    int i6 = childCount2 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View childAt3 = getChildAt(i7);
                        if (this.f44677f.mo17561b(childAt3) > i5 || this.f44677f.mo17572n(childAt3) > i5) {
                            mo16970S(rVar, i6, i7);
                            return;
                        }
                    }
                    return;
                }
                for (int i8 = 0; i8 < childCount2; i8++) {
                    View childAt4 = getChildAt(i8);
                    if (this.f44677f.mo17561b(childAt4) > i5 || this.f44677f.mo17572n(childAt4) > i5) {
                        mo16970S(rVar, 0, i8);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: S */
    public final void mo16970S(RecyclerView.C16625r rVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, rVar);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, rVar);
                i--;
            }
        }
    }

    /* renamed from: T */
    public final void mo16971T() {
        if (this.f44675d == 1 || !mo16968O()) {
            this.f44680i = this.f44679h;
        } else {
            this.f44680i = !this.f44679h;
        }
    }

    /* renamed from: U */
    public int mo16972U(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.f44676e.f44702a = true;
        mo17002x();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        mo16976Z(i2, abs, true, wVar);
        C16605c cVar = this.f44676e;
        int y = cVar.f44708g + mo17003y(rVar, cVar, wVar, false);
        if (y < 0) {
            return 0;
        }
        if (abs > y) {
            i = i2 * y;
        }
        this.f44677f.mo17574p(-i);
        this.f44676e.f44710i = i;
        return i;
    }

    /* renamed from: V */
    public void mo16973V(int i, int i2) {
        this.f44683o = i;
        this.f44684p = i2;
        SavedState savedState = this.f44686r;
        if (savedState != null) {
            savedState.f44690d = -1;
        }
        requestLayout();
    }

    /* renamed from: W */
    public void mo16974W(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.f44675d || this.f44677f == null) {
                C16682y a = C16682y.m16171a(this, i);
                this.f44677f = a;
                this.f44687s.f44693a = a;
                this.f44675d = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: X */
    public void mo16975X(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (z != this.f44679h) {
            this.f44679h = z;
            requestLayout();
        }
    }

    /* renamed from: Y */
    public void mo16927Y(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (this.f44681j != z) {
            this.f44681j = z;
            requestLayout();
        }
    }

    /* renamed from: Z */
    public final void mo16976Z(int i, int i2, boolean z, RecyclerView.C16628w wVar) {
        int i3;
        int i4 = 1;
        this.f44676e.f44712k = this.f44677f.mo17568i() == 0 && this.f44677f.mo17565f() == 0;
        this.f44676e.f44709h = mo16966M(wVar);
        C16605c cVar = this.f44676e;
        cVar.f44707f = i;
        if (i == 1) {
            cVar.f44709h += this.f44677f.mo17567h();
            View K = mo16964K();
            C16605c cVar2 = this.f44676e;
            if (this.f44680i) {
                i4 = -1;
            }
            cVar2.f44706e = i4;
            int position = getPosition(K);
            C16605c cVar3 = this.f44676e;
            cVar2.f44705d = position + cVar3.f44706e;
            cVar3.f44703b = this.f44677f.mo17561b(K);
            i3 = this.f44677f.mo17561b(K) - this.f44677f.mo17566g();
        } else {
            View L = mo16965L();
            this.f44676e.f44709h += this.f44677f.mo17570k();
            C16605c cVar4 = this.f44676e;
            if (!this.f44680i) {
                i4 = -1;
            }
            cVar4.f44706e = i4;
            int position2 = getPosition(L);
            C16605c cVar5 = this.f44676e;
            cVar4.f44705d = position2 + cVar5.f44706e;
            cVar5.f44703b = this.f44677f.mo17564e(L);
            i3 = (-this.f44677f.mo17564e(L)) + this.f44677f.mo17570k();
        }
        C16605c cVar6 = this.f44676e;
        cVar6.f44704c = i2;
        if (z) {
            cVar6.f44704c = i2 - i3;
        }
        cVar6.f44708g = i3;
    }

    /* renamed from: a0 */
    public final void mo16977a0(int i, int i2) {
        this.f44676e.f44704c = this.f44677f.mo17566g() - i2;
        C16605c cVar = this.f44676e;
        cVar.f44706e = this.f44680i ? -1 : 1;
        cVar.f44705d = i;
        cVar.f44707f = 1;
        cVar.f44703b = i2;
        cVar.f44708g = Integer.MIN_VALUE;
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.f44686r == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* renamed from: b0 */
    public final void mo16979b0(int i, int i2) {
        this.f44676e.f44704c = i2 - this.f44677f.mo17570k();
        C16605c cVar = this.f44676e;
        cVar.f44705d = i;
        cVar.f44706e = this.f44680i ? 1 : -1;
        cVar.f44707f = -1;
        cVar.f44703b = i2;
        cVar.f44708g = Integer.MIN_VALUE;
    }

    public boolean canScrollHorizontally() {
        return this.f44675d == 0;
    }

    public boolean canScrollVertically() {
        return this.f44675d == 1;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C16628w wVar, RecyclerView.LayoutManager.C16609c cVar) {
        if (this.f44675d != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            mo17002x();
            mo16976Z(i > 0 ? 1 : -1, Math.abs(i), true, wVar);
            mo16951s(wVar, this.f44676e, cVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void collectInitialPrefetchPositions(int r7, androidx.recyclerview.widget.RecyclerView.LayoutManager.C16609c r8) {
        /*
            r6 = this;
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.f44686r
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0013
            int r4 = r0.f44690d
            if (r4 < 0) goto L_0x000d
            r5 = 1
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            if (r5 == 0) goto L_0x0013
            boolean r0 = r0.f44692f
            goto L_0x0022
        L_0x0013:
            r6.mo16971T()
            boolean r0 = r6.f44680i
            int r4 = r6.f44683o
            if (r4 != r1) goto L_0x0022
            if (r0 == 0) goto L_0x0021
            int r4 = r7 + -1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 1
        L_0x0026:
            r0 = 0
        L_0x0027:
            int r2 = r6.f44689u
            if (r0 >= r2) goto L_0x0039
            if (r4 < 0) goto L_0x0039
            if (r4 >= r7) goto L_0x0039
            r2 = r8
            androidx.recyclerview.widget.o$b r2 = (androidx.recyclerview.widget.C16661o.C16663b) r2
            r2.mo17525a(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.collectInitialPrefetchPositions(int, androidx.recyclerview.widget.RecyclerView$LayoutManager$c):void");
    }

    public int computeHorizontalScrollExtent(RecyclerView.C16628w wVar) {
        return mo16998t(wVar);
    }

    public int computeHorizontalScrollOffset(RecyclerView.C16628w wVar) {
        return mo16999u(wVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.C16628w wVar) {
        return mo17000v(wVar);
    }

    public int computeVerticalScrollExtent(RecyclerView.C16628w wVar) {
        return mo16998t(wVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.C16628w wVar) {
        return mo16999u(wVar);
    }

    public int computeVerticalScrollRange(RecyclerView.C16628w wVar) {
        return mo17000v(wVar);
    }

    /* renamed from: f */
    public PointF mo16988f(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.f44680i) {
            i2 = -1;
        }
        return this.f44675d == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* renamed from: n */
    public void mo16991n(View view, View view2, int i, int i2) {
        View view3 = view;
        View view4 = view2;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        mo17002x();
        mo16971T();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c = position < position2 ? (char) 1 : 65535;
        if (this.f44680i) {
            if (c == 1) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(this.f44677f.mo17566g() - (this.f44677f.mo17564e(view2) + this.f44677f.mo17562c(view))));
                aVar.mo10233c(Integer.valueOf(position2));
                C117292a.m165358d(this, aVar.mo10232b(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(this, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                return;
            }
            int g = this.f44677f.mo17566g() - this.f44677f.mo17561b(view2);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(g));
            aVar2.mo10233c(Integer.valueOf(position2));
            C117292a.m165358d(this, aVar2.mo10232b(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
            C117292a.m165359e(this, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        } else if (c == 65535) {
            int e = this.f44677f.mo17564e(view2);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Integer.valueOf(e));
            aVar3.mo10233c(Integer.valueOf(position2));
            C117292a.m165358d(this, aVar3.mo10232b(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            mo16973V(((Integer) aVar3.mo10231a(0)).intValue(), ((Integer) aVar3.mo10231a(1)).intValue());
            C117292a.m165359e(this, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        } else {
            int b = this.f44677f.mo17561b(view2) - this.f44677f.mo17562c(view);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(Integer.valueOf(b));
            aVar4.mo10233c(Integer.valueOf(position2));
            C117292a.m165358d(this, aVar4.mo10232b(), "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            mo16973V(((Integer) aVar4.mo10231a(0)).intValue(), ((Integer) aVar4.mo10231a(1)).intValue());
            C117292a.m165359e(this, "androidx/recyclerview/widget/LinearLayoutManager", "prepareForDrop", "(Landroid/view/View;Landroid/view/View;II)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C16625r rVar) {
        super.onDetachedFromWindow(recyclerView, rVar);
        if (this.f44685q) {
            removeAndRecycleAllViews(rVar);
            rVar.mo17338b();
        }
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        int w;
        mo16971T();
        if (getChildCount() == 0 || (w = mo17001w(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo17002x();
        mo17002x();
        mo16976Z(w, (int) (((float) this.f44677f.mo17571l()) * 0.33333334f), false, wVar);
        C16605c cVar = this.f44676e;
        cVar.f44708g = Integer.MIN_VALUE;
        cVar.f44702a = false;
        mo17003y(rVar, cVar, wVar, true);
        View F = w == -1 ? this.f44680i ? mo16960F(getChildCount() - 1, -1) : mo16960F(0, getChildCount()) : this.f44680i ? mo16960F(0, getChildCount()) : mo16960F(getChildCount() - 1, -1);
        View L = w == -1 ? mo16965L() : mo16964K();
        if (!L.hasFocusable()) {
            return F;
        }
        if (F == null) {
            return null;
        }
        return L;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(mo16957C());
            accessibilityEvent.setToIndex(mo16959E());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.C16625r r18, androidx.recyclerview.widget.RecyclerView.C16628w r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.f44686r
            r9 = -1
            if (r0 != 0) goto L_0x000f
            int r0 = r6.f44683o
            if (r0 == r9) goto L_0x0019
        L_0x000f:
            int r0 = r19.mo17354b()
            if (r0 != 0) goto L_0x0019
            r17.removeAndRecycleAllViews(r18)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r0 = r6.f44686r
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L_0x002a
            int r0 = r0.f44690d
            if (r0 < 0) goto L_0x0025
            r1 = 1
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x002a
            r6.f44683o = r0
        L_0x002a:
            r17.mo17002x()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f44676e
            r0.f44702a = r11
            r17.mo16971T()
            android.view.View r0 = r17.getFocusedChild()
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r6.f44687s
            boolean r2 = r1.f44697e
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x0072
            int r2 = r6.f44683o
            if (r2 != r9) goto L_0x0072
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r2 = r6.f44686r
            if (r2 == 0) goto L_0x0049
            goto L_0x0072
        L_0x0049:
            if (r0 == 0) goto L_0x027f
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17564e(r0)
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17566g()
            if (r1 >= r2) goto L_0x0067
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17561b(r0)
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17570k()
            if (r1 > r2) goto L_0x027f
        L_0x0067:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r6.f44687s
            int r2 = r6.getPosition(r0)
            r1.mo17011c(r0, r2)
            goto L_0x027f
        L_0x0072:
            r1.mo17012d()
            androidx.recyclerview.widget.LinearLayoutManager$a r13 = r6.f44687s
            boolean r0 = r6.f44680i
            boolean r1 = r6.f44681j
            r0 = r0 ^ r1
            r13.f44696d = r0
            boolean r0 = r8.f44838g
            if (r0 != 0) goto L_0x0179
            int r0 = r6.f44683o
            if (r0 != r9) goto L_0x0088
            goto L_0x0179
        L_0x0088:
            if (r0 < 0) goto L_0x0175
            int r1 = r19.mo17354b()
            if (r0 < r1) goto L_0x0092
            goto L_0x0175
        L_0x0092:
            int r0 = r6.f44683o
            r13.f44694b = r0
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r6.f44686r
            if (r1 == 0) goto L_0x00c7
            int r2 = r1.f44690d
            if (r2 < 0) goto L_0x00a0
            r2 = 1
            goto L_0x00a1
        L_0x00a0:
            r2 = 0
        L_0x00a1:
            if (r2 == 0) goto L_0x00c7
            boolean r0 = r1.f44692f
            r13.f44696d = r0
            if (r0 == 0) goto L_0x00b8
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17566g()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r6.f44686r
            int r1 = r1.f44691e
            int r0 = r0 - r1
            r13.f44695c = r0
            goto L_0x0173
        L_0x00b8:
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17570k()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r1 = r6.f44686r
            int r1 = r1.f44691e
            int r0 = r0 + r1
            r13.f44695c = r0
            goto L_0x0173
        L_0x00c7:
            int r1 = r6.f44684p
            if (r1 != r12) goto L_0x0156
            android.view.View r0 = r6.findViewByPosition(r0)
            if (r0 == 0) goto L_0x0134
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17562c(r0)
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17571l()
            if (r1 <= r2) goto L_0x00e4
            r13.mo17009a()
            goto L_0x0173
        L_0x00e4:
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17564e(r0)
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17570k()
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x00ff
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17570k()
            r13.f44695c = r0
            r13.f44696d = r11
            goto L_0x0173
        L_0x00ff:
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17566g()
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17561b(r0)
            int r1 = r1 - r2
            if (r1 >= 0) goto L_0x0119
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17566g()
            r13.f44695c = r0
            r13.f44696d = r10
            goto L_0x0173
        L_0x0119:
            boolean r1 = r13.f44696d
            if (r1 == 0) goto L_0x012b
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r0 = r1.mo17561b(r0)
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17575m()
            int r0 = r0 + r1
            goto L_0x0131
        L_0x012b:
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r0 = r1.mo17564e(r0)
        L_0x0131:
            r13.f44695c = r0
            goto L_0x0173
        L_0x0134:
            int r0 = r17.getChildCount()
            if (r0 <= 0) goto L_0x0152
            android.view.View r0 = r6.getChildAt(r11)
            int r0 = r6.getPosition(r0)
            int r1 = r6.f44683o
            if (r1 >= r0) goto L_0x0148
            r0 = 1
            goto L_0x0149
        L_0x0148:
            r0 = 0
        L_0x0149:
            boolean r1 = r6.f44680i
            if (r0 != r1) goto L_0x014f
            r0 = 1
            goto L_0x0150
        L_0x014f:
            r0 = 0
        L_0x0150:
            r13.f44696d = r0
        L_0x0152:
            r13.mo17009a()
            goto L_0x0173
        L_0x0156:
            boolean r0 = r6.f44680i
            r13.f44696d = r0
            if (r0 == 0) goto L_0x0168
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17566g()
            int r1 = r6.f44684p
            int r0 = r0 - r1
            r13.f44695c = r0
            goto L_0x0173
        L_0x0168:
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17570k()
            int r1 = r6.f44684p
            int r0 = r0 + r1
            r13.f44695c = r0
        L_0x0173:
            r0 = 1
            goto L_0x017a
        L_0x0175:
            r6.f44683o = r9
            r6.f44684p = r12
        L_0x0179:
            r0 = 0
        L_0x017a:
            if (r0 == 0) goto L_0x017e
            goto L_0x027b
        L_0x017e:
            int r0 = r17.getChildCount()
            if (r0 != 0) goto L_0x0186
            goto L_0x0267
        L_0x0186:
            android.view.View r0 = r17.getFocusedChild()
            if (r0 == 0) goto L_0x01b6
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            boolean r2 = r1.mo17282d()
            if (r2 != 0) goto L_0x01aa
            int r2 = r1.mo17280b()
            if (r2 < 0) goto L_0x01aa
            int r1 = r1.mo17280b()
            int r2 = r19.mo17354b()
            if (r1 >= r2) goto L_0x01aa
            r1 = 1
            goto L_0x01ab
        L_0x01aa:
            r1 = 0
        L_0x01ab:
            if (r1 == 0) goto L_0x01b6
            int r1 = r6.getPosition(r0)
            r13.mo17011c(r0, r1)
            goto L_0x0265
        L_0x01b6:
            boolean r0 = r6.f44678g
            boolean r1 = r6.f44681j
            if (r0 == r1) goto L_0x01be
            goto L_0x0267
        L_0x01be:
            boolean r0 = r13.f44696d
            if (r0 == 0) goto L_0x01f0
            boolean r0 = r6.f44680i
            if (r0 == 0) goto L_0x01da
            int r4 = r17.getChildCount()
            int r5 = r19.mo17354b()
            r3 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.mo16924H(r1, r2, r3, r4, r5)
            goto L_0x021d
        L_0x01da:
            int r0 = r17.getChildCount()
            int r3 = r0 + -1
            int r5 = r19.mo17354b()
            r4 = -1
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.mo16924H(r1, r2, r3, r4, r5)
            goto L_0x021d
        L_0x01f0:
            boolean r0 = r6.f44680i
            if (r0 == 0) goto L_0x020a
            int r0 = r17.getChildCount()
            int r3 = r0 + -1
            int r5 = r19.mo17354b()
            r4 = -1
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.mo16924H(r1, r2, r3, r4, r5)
            goto L_0x021d
        L_0x020a:
            int r4 = r17.getChildCount()
            int r5 = r19.mo17354b()
            r3 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r0 = r0.mo16924H(r1, r2, r3, r4, r5)
        L_0x021d:
            if (r0 == 0) goto L_0x0267
            int r1 = r6.getPosition(r0)
            r13.mo17010b(r0, r1)
            boolean r1 = r8.f44838g
            if (r1 != 0) goto L_0x0265
            boolean r1 = r17.supportsPredictiveItemAnimations()
            if (r1 == 0) goto L_0x0265
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17564e(r0)
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17566g()
            if (r1 >= r2) goto L_0x024f
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r0 = r1.mo17561b(r0)
            androidx.recyclerview.widget.y r1 = r6.f44677f
            int r1 = r1.mo17570k()
            if (r0 >= r1) goto L_0x024d
            goto L_0x024f
        L_0x024d:
            r0 = 0
            goto L_0x0250
        L_0x024f:
            r0 = 1
        L_0x0250:
            if (r0 == 0) goto L_0x0265
            boolean r0 = r13.f44696d
            if (r0 == 0) goto L_0x025d
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17566g()
            goto L_0x0263
        L_0x025d:
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17570k()
        L_0x0263:
            r13.f44695c = r0
        L_0x0265:
            r0 = 1
            goto L_0x0268
        L_0x0267:
            r0 = 0
        L_0x0268:
            if (r0 == 0) goto L_0x026b
            goto L_0x027b
        L_0x026b:
            r13.mo17009a()
            boolean r0 = r6.f44681j
            if (r0 == 0) goto L_0x0278
            int r0 = r19.mo17354b()
            int r0 = r0 + r9
            goto L_0x0279
        L_0x0278:
            r0 = 0
        L_0x0279:
            r13.f44694b = r0
        L_0x027b:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.f44687s
            r0.f44697e = r10
        L_0x027f:
            int r0 = r6.mo16966M(r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r6.f44676e
            int r1 = r1.f44710i
            if (r1 < 0) goto L_0x028c
            r1 = r0
            r0 = 0
            goto L_0x028d
        L_0x028c:
            r1 = 0
        L_0x028d:
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17570k()
            int r0 = r0 + r2
            androidx.recyclerview.widget.y r2 = r6.f44677f
            int r2 = r2.mo17567h()
            int r1 = r1 + r2
            boolean r2 = r8.f44838g
            if (r2 == 0) goto L_0x02d6
            int r2 = r6.f44683o
            if (r2 == r9) goto L_0x02d6
            int r3 = r6.f44684p
            if (r3 == r12) goto L_0x02d6
            android.view.View r2 = r6.findViewByPosition(r2)
            if (r2 == 0) goto L_0x02d6
            boolean r3 = r6.f44680i
            if (r3 == 0) goto L_0x02c1
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17566g()
            androidx.recyclerview.widget.y r4 = r6.f44677f
            int r2 = r4.mo17561b(r2)
            int r3 = r3 - r2
            int r2 = r6.f44684p
            goto L_0x02d0
        L_0x02c1:
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r2 = r3.mo17564e(r2)
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17570k()
            int r2 = r2 - r3
            int r3 = r6.f44684p
        L_0x02d0:
            int r3 = r3 - r2
            if (r3 <= 0) goto L_0x02d5
            int r0 = r0 + r3
            goto L_0x02d6
        L_0x02d5:
            int r1 = r1 - r3
        L_0x02d6:
            androidx.recyclerview.widget.LinearLayoutManager$a r2 = r6.f44687s
            boolean r3 = r2.f44696d
            if (r3 == 0) goto L_0x02e1
            boolean r3 = r6.f44680i
            if (r3 == 0) goto L_0x02e5
            goto L_0x02e7
        L_0x02e1:
            boolean r3 = r6.f44680i
            if (r3 == 0) goto L_0x02e7
        L_0x02e5:
            r3 = -1
            goto L_0x02e8
        L_0x02e7:
            r3 = 1
        L_0x02e8:
            r6.mo16926Q(r7, r8, r2, r3)
            r17.detachAndScrapAttachedViews(r18)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17568i()
            if (r3 != 0) goto L_0x0302
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17565f()
            if (r3 != 0) goto L_0x0302
            r3 = 1
            goto L_0x0303
        L_0x0302:
            r3 = 0
        L_0x0303:
            r2.f44712k = r3
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            r2.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$a r2 = r6.f44687s
            boolean r3 = r2.f44696d
            if (r3 == 0) goto L_0x0357
            int r3 = r2.f44694b
            int r2 = r2.f44695c
            r6.mo16979b0(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            r2.f44709h = r0
            r6.mo17003y(r7, r2, r8, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f44676e
            int r2 = r0.f44703b
            int r3 = r0.f44705d
            int r0 = r0.f44704c
            if (r0 <= 0) goto L_0x0329
            int r1 = r1 + r0
        L_0x0329:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.f44687s
            int r4 = r0.f44694b
            int r0 = r0.f44695c
            r6.mo16977a0(r4, r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f44676e
            r0.f44709h = r1
            int r1 = r0.f44705d
            int r4 = r0.f44706e
            int r1 = r1 + r4
            r0.f44705d = r1
            r6.mo17003y(r7, r0, r8, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f44676e
            int r1 = r0.f44703b
            int r0 = r0.f44704c
            if (r0 <= 0) goto L_0x03a5
            r6.mo16979b0(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            r2.f44709h = r0
            r6.mo17003y(r7, r2, r8, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f44676e
            int r2 = r0.f44703b
            goto L_0x03a5
        L_0x0357:
            int r3 = r2.f44694b
            int r2 = r2.f44695c
            r6.mo16977a0(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            r2.f44709h = r1
            r6.mo17003y(r7, r2, r8, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r6.f44676e
            int r2 = r1.f44703b
            int r3 = r1.f44705d
            int r1 = r1.f44704c
            if (r1 <= 0) goto L_0x0370
            int r0 = r0 + r1
        L_0x0370:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r6.f44687s
            int r4 = r1.f44694b
            int r1 = r1.f44695c
            r6.mo16979b0(r4, r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r6.f44676e
            r1.f44709h = r0
            int r0 = r1.f44705d
            int r4 = r1.f44706e
            int r0 = r0 + r4
            r1.f44705d = r0
            r6.mo17003y(r7, r1, r8, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f44676e
            int r1 = r0.f44703b
            int r0 = r0.f44704c
            if (r0 <= 0) goto L_0x03a0
            r6.mo16977a0(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            r2.f44709h = r0
            r6.mo17003y(r7, r2, r8, r11)
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r6.f44676e
            int r0 = r0.f44703b
            r2 = r1
            r1 = r0
            goto L_0x03a5
        L_0x03a0:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x03a5:
            int r0 = r17.getChildCount()
            if (r0 <= 0) goto L_0x03c9
            boolean r0 = r6.f44680i
            boolean r3 = r6.f44681j
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x03bd
            int r0 = r6.mo16962I(r1, r7, r8, r10)
            int r2 = r2 + r0
            int r1 = r1 + r0
            int r0 = r6.mo16963J(r2, r7, r8, r11)
            goto L_0x03c7
        L_0x03bd:
            int r0 = r6.mo16963J(r2, r7, r8, r10)
            int r2 = r2 + r0
            int r1 = r1 + r0
            int r0 = r6.mo16962I(r1, r7, r8, r11)
        L_0x03c7:
            int r2 = r2 + r0
            int r1 = r1 + r0
        L_0x03c9:
            boolean r0 = r8.f44842k
            if (r0 == 0) goto L_0x0467
            int r0 = r17.getChildCount()
            if (r0 == 0) goto L_0x0467
            boolean r0 = r8.f44838g
            if (r0 != 0) goto L_0x0467
            boolean r0 = r17.supportsPredictiveItemAnimations()
            if (r0 != 0) goto L_0x03df
            goto L_0x0467
        L_0x03df:
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r0 = r7.f44825d
            int r3 = r0.size()
            android.view.View r4 = r6.getChildAt(r11)
            int r4 = r6.getPosition(r4)
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x03f0:
            if (r5 >= r3) goto L_0x0428
            java.lang.Object r14 = r0.get(r5)
            androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.C16631z) r14
            boolean r15 = r14.mo17370q()
            if (r15 == 0) goto L_0x03ff
            goto L_0x0424
        L_0x03ff:
            int r15 = r14.mo17364k()
            if (r15 >= r4) goto L_0x0407
            r15 = 1
            goto L_0x0408
        L_0x0407:
            r15 = 0
        L_0x0408:
            boolean r10 = r6.f44680i
            if (r15 == r10) goto L_0x040e
            r10 = -1
            goto L_0x040f
        L_0x040e:
            r10 = 1
        L_0x040f:
            if (r10 != r9) goto L_0x041b
            androidx.recyclerview.widget.y r10 = r6.f44677f
            android.view.View r14 = r14.f44854d
            int r10 = r10.mo17562c(r14)
            int r12 = r12 + r10
            goto L_0x0424
        L_0x041b:
            androidx.recyclerview.widget.y r10 = r6.f44677f
            android.view.View r14 = r14.f44854d
            int r10 = r10.mo17562c(r14)
            int r13 = r13 + r10
        L_0x0424:
            int r5 = r5 + 1
            r10 = 1
            goto L_0x03f0
        L_0x0428:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r6.f44676e
            r3.f44711j = r0
            r0 = 0
            if (r12 <= 0) goto L_0x0448
            android.view.View r3 = r17.mo16965L()
            int r3 = r6.getPosition(r3)
            r6.mo16979b0(r3, r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            r2.f44709h = r12
            r2.f44704c = r11
            r2.mo17014a(r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r6.f44676e
            r6.mo17003y(r7, r2, r8, r11)
        L_0x0448:
            if (r13 <= 0) goto L_0x0463
            android.view.View r2 = r17.mo16964K()
            int r2 = r6.getPosition(r2)
            r6.mo16977a0(r2, r1)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r6.f44676e
            r1.f44709h = r13
            r1.f44704c = r11
            r1.mo17014a(r0)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r6.f44676e
            r6.mo17003y(r7, r1, r8, r11)
        L_0x0463:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r6.f44676e
            r1.f44711j = r0
        L_0x0467:
            boolean r0 = r8.f44838g
            if (r0 != 0) goto L_0x0474
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r1 = r0.mo17571l()
            r0.f45082b = r1
            goto L_0x0479
        L_0x0474:
            androidx.recyclerview.widget.LinearLayoutManager$a r0 = r6.f44687s
            r0.mo17012d()
        L_0x0479:
            boolean r0 = r6.f44681j
            r6.f44678g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        this.f44686r = null;
        this.f44683o = -1;
        this.f44684p = Integer.MIN_VALUE;
        this.f44687s.mo17012d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f44686r = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.f44686r;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            mo17002x();
            boolean z = this.f44678g ^ this.f44680i;
            savedState2.f44692f = z;
            if (z) {
                View K = mo16964K();
                savedState2.f44691e = this.f44677f.mo17566g() - this.f44677f.mo17561b(K);
                savedState2.f44690d = getPosition(K);
            } else {
                View L = mo16965L();
                savedState2.f44690d = getPosition(L);
                savedState2.f44691e = this.f44677f.mo17564e(L) - this.f44677f.mo17570k();
            }
        } else {
            savedState2.f44690d = -1;
        }
        return savedState2;
    }

    /* renamed from: s */
    public void mo16951s(RecyclerView.C16628w wVar, C16605c cVar, RecyclerView.LayoutManager.C16609c cVar2) {
        int i = cVar.f44705d;
        if (i >= 0 && i < wVar.mo17354b()) {
            ((C16661o.C16663b) cVar2).mo17525a(i, Math.max(0, cVar.f44708g));
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (this.f44675d == 1) {
            return 0;
        }
        return mo16972U(i, rVar, wVar);
    }

    public void scrollToPosition(int i) {
        this.f44683o = i;
        this.f44684p = Integer.MIN_VALUE;
        SavedState savedState = this.f44686r;
        if (savedState != null) {
            savedState.f44690d = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (this.f44675d == 0) {
            return 0;
        }
        return mo16972U(i, rVar, wVar);
    }

    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C54256s sVar = new C54256s(recyclerView.getContext());
        sVar.f44872a = i;
        startSmoothScroll(sVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.f44686r == null && this.f44678g == this.f44681j;
    }

    /* renamed from: t */
    public final int mo16998t(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        mo17002x();
        C16682y yVar = this.f44677f;
        View B = mo16956B(!this.f44682n, true);
        return C16649d0.m16066a(wVar, yVar, B, mo16955A(!this.f44682n, true), this, this.f44682n);
    }

    /* renamed from: u */
    public final int mo16999u(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        mo17002x();
        C16682y yVar = this.f44677f;
        View B = mo16956B(!this.f44682n, true);
        return C16649d0.m16067b(wVar, yVar, B, mo16955A(!this.f44682n, true), this, this.f44682n, this.f44680i);
    }

    /* renamed from: v */
    public final int mo17000v(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        mo17002x();
        C16682y yVar = this.f44677f;
        View B = mo16956B(!this.f44682n, true);
        return C16649d0.m16068c(wVar, yVar, B, mo16955A(!this.f44682n, true), this, this.f44682n);
    }

    /* renamed from: w */
    public int mo17001w(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f44675d == 1) ? 1 : Integer.MIN_VALUE : this.f44675d == 0 ? 1 : Integer.MIN_VALUE : this.f44675d == 1 ? -1 : Integer.MIN_VALUE : this.f44675d == 0 ? -1 : Integer.MIN_VALUE : (this.f44675d != 1 && mo16968O()) ? -1 : 1 : (this.f44675d != 1 && mo16968O()) ? 1 : -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo17002x() {
        if (this.f44676e == null) {
            this.f44676e = new C16605c();
        }
    }

    /* renamed from: y */
    public int mo17003y(RecyclerView.C16625r rVar, C16605c cVar, RecyclerView.C16628w wVar, boolean z) {
        int i = cVar.f44704c;
        int i2 = cVar.f44708g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f44708g = i2 + i;
            }
            mo16969R(rVar, cVar);
        }
        int i3 = cVar.f44704c + cVar.f44709h;
        C16604b bVar = this.f44688t;
        while (true) {
            if (!cVar.f44712k && i3 <= 0) {
                break;
            }
            int i4 = cVar.f44705d;
            if (!(i4 >= 0 && i4 < wVar.mo17354b())) {
                break;
            }
            bVar.f44698a = 0;
            bVar.f44699b = false;
            bVar.f44700c = false;
            bVar.f44701d = false;
            mo16925P(rVar, wVar, cVar, bVar);
            if (!bVar.f44699b) {
                int i5 = cVar.f44703b;
                int i6 = bVar.f44698a;
                cVar.f44703b = i5 + (cVar.f44707f * i6);
                if (!bVar.f44700c || this.f44676e.f44711j != null || !wVar.f44838g) {
                    cVar.f44704c -= i6;
                    i3 -= i6;
                }
                int i7 = cVar.f44708g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.f44708g = i8;
                    int i9 = cVar.f44704c;
                    if (i9 < 0) {
                        cVar.f44708g = i8 + i9;
                    }
                    mo16969R(rVar, cVar);
                }
                if (z && bVar.f44701d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f44704c;
    }

    /* renamed from: z */
    public int mo17004z() {
        View G = mo16961G(0, getChildCount(), true, false);
        if (G == null) {
            return -1;
        }
        return getPosition(G);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f44675d = 1;
        this.f44679h = false;
        this.f44680i = false;
        this.f44681j = false;
        this.f44682n = true;
        this.f44683o = -1;
        this.f44684p = Integer.MIN_VALUE;
        this.f44686r = null;
        this.f44687s = new C16603a();
        this.f44688t = new C16604b();
        this.f44689u = 2;
        mo16974W(i);
        mo16975X(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f44675d = 1;
        this.f44679h = false;
        this.f44680i = false;
        this.f44681j = false;
        this.f44682n = true;
        this.f44683o = -1;
        this.f44684p = Integer.MIN_VALUE;
        this.f44686r = null;
        this.f44687s = new C16603a();
        this.f44688t = new C16604b();
        this.f44689u = 2;
        RecyclerView.LayoutManager.C16606d properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        mo16974W(properties.f44792a);
        mo16975X(properties.f44794c);
        mo16927Y(properties.f44795d);
    }
}
