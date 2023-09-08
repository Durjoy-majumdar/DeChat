package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C16972c;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements C16970a, RecyclerView.C16634v.C16636b {

    /* renamed from: E */
    public static final Rect f45889E = new Rect();

    /* renamed from: A */
    public final Context f45890A;

    /* renamed from: B */
    public View f45891B;

    /* renamed from: C */
    public int f45892C = -1;

    /* renamed from: D */
    public C16972c.C16973a f45893D = new C16972c.C16973a();

    /* renamed from: d */
    public int f45894d;

    /* renamed from: e */
    public int f45895e;

    /* renamed from: f */
    public int f45896f;

    /* renamed from: g */
    public int f45897g = -1;

    /* renamed from: h */
    public boolean f45898h;

    /* renamed from: i */
    public boolean f45899i;

    /* renamed from: j */
    public List<C16971b> f45900j = new ArrayList();

    /* renamed from: n */
    public final C16972c f45901n = new C16972c(this);

    /* renamed from: o */
    public RecyclerView.C16625r f45902o;

    /* renamed from: p */
    public RecyclerView.C16628w f45903p;

    /* renamed from: q */
    public C16969c f45904q;

    /* renamed from: r */
    public C16968b f45905r = new C16968b((C16967a) null);

    /* renamed from: s */
    public C16682y f45906s;

    /* renamed from: t */
    public C16682y f45907t;

    /* renamed from: u */
    public SavedState f45908u;

    /* renamed from: v */
    public int f45909v = -1;

    /* renamed from: w */
    public int f45910w = Integer.MIN_VALUE;

    /* renamed from: x */
    public int f45911x = Integer.MIN_VALUE;

    /* renamed from: y */
    public int f45912y = Integer.MIN_VALUE;

    /* renamed from: z */
    public SparseArray<View> f45913z = new SparseArray<>();

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C16966a();

        /* renamed from: d */
        public int f45923d;

        /* renamed from: e */
        public int f45924e;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        public class C16966a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C16967a) null);
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

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f45923d + ", mAnchorOffset=" + this.f45924e + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f45923d);
            parcel.writeInt(this.f45924e);
        }

        public SavedState(Parcel parcel, C16967a aVar) {
            this.f45923d = parcel.readInt();
            this.f45924e = parcel.readInt();
        }

        public SavedState(SavedState savedState, C16967a aVar) {
            this.f45923d = savedState.f45923d;
            this.f45924e = savedState.f45924e;
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    public class C16968b {

        /* renamed from: a */
        public int f45925a;

        /* renamed from: b */
        public int f45926b;

        /* renamed from: c */
        public int f45927c;

        /* renamed from: d */
        public int f45928d = 0;

        /* renamed from: e */
        public boolean f45929e;

        /* renamed from: f */
        public boolean f45930f;

        /* renamed from: g */
        public boolean f45931g;

        public C16968b(C16967a aVar) {
        }

        /* renamed from: a */
        public static void m16722a(C16968b bVar) {
            if (!FlexboxLayoutManager.this.mo18539r()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                if (flexboxLayoutManager.f45898h) {
                    bVar.f45927c = bVar.f45929e ? flexboxLayoutManager.f45906s.mo17566g() : flexboxLayoutManager.getWidth() - FlexboxLayoutManager.this.f45906s.mo17570k();
                    return;
                }
            }
            bVar.f45927c = bVar.f45929e ? FlexboxLayoutManager.this.f45906s.mo17566g() : FlexboxLayoutManager.this.f45906s.mo17570k();
        }

        /* renamed from: b */
        public static void m16723b(C16968b bVar) {
            bVar.f45925a = -1;
            bVar.f45926b = -1;
            bVar.f45927c = Integer.MIN_VALUE;
            boolean z = false;
            bVar.f45930f = false;
            bVar.f45931g = false;
            if (FlexboxLayoutManager.this.mo18539r()) {
                FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                int i = flexboxLayoutManager.f45895e;
                if (i == 0) {
                    if (flexboxLayoutManager.f45894d == 1) {
                        z = true;
                    }
                    bVar.f45929e = z;
                    return;
                }
                if (i == 2) {
                    z = true;
                }
                bVar.f45929e = z;
                return;
            }
            FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
            int i2 = flexboxLayoutManager2.f45895e;
            if (i2 == 0) {
                if (flexboxLayoutManager2.f45894d == 3) {
                    z = true;
                }
                bVar.f45929e = z;
                return;
            }
            if (i2 == 2) {
                z = true;
            }
            bVar.f45929e = z;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f45925a + ", mFlexLinePosition=" + this.f45926b + ", mCoordinate=" + this.f45927c + ", mPerpendicularCoordinate=" + this.f45928d + ", mLayoutFromEnd=" + this.f45929e + ", mValid=" + this.f45930f + ", mAssignedFromSavedState=" + this.f45931g + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    public static class C16969c {

        /* renamed from: a */
        public int f45933a;

        /* renamed from: b */
        public boolean f45934b;

        /* renamed from: c */
        public int f45935c;

        /* renamed from: d */
        public int f45936d;

        /* renamed from: e */
        public int f45937e;

        /* renamed from: f */
        public int f45938f;

        /* renamed from: g */
        public int f45939g;

        /* renamed from: h */
        public int f45940h = 1;

        /* renamed from: i */
        public int f45941i = 1;

        /* renamed from: j */
        public boolean f45942j;

        public C16969c(C16967a aVar) {
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f45933a + ", mFlexLinePosition=" + this.f45935c + ", mPosition=" + this.f45936d + ", mOffset=" + this.f45937e + ", mScrollingOffset=" + this.f45938f + ", mLastScrollDelta=" + this.f45939g + ", mItemDirection=" + this.f45940h + ", mLayoutDirection=" + this.f45941i + '}';
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.C16606d properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f44792a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.f44794c) {
                    mo18569J(3);
                } else {
                    mo18569J(2);
                }
            }
        } else if (properties.f44794c) {
            mo18569J(1);
        } else {
            mo18569J(0);
        }
        int i4 = this.f45895e;
        if (i4 != 1) {
            if (i4 == 0) {
                removeAllViews();
                this.f45900j.clear();
                C16968b.m16723b(this.f45905r);
                this.f45905r.f45928d = 0;
            }
            this.f45895e = 1;
            this.f45906s = null;
            this.f45907t = null;
            requestLayout();
        }
        if (this.f45896f != 4) {
            removeAllViews();
            this.f45900j.clear();
            C16968b.m16723b(this.f45905r);
            this.f45905r.f45928d = 0;
            this.f45896f = 4;
            requestLayout();
        }
        this.f45890A = context;
    }

    public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !isMeasurementCacheEnabled() || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height);
    }

    /* renamed from: A */
    public final View mo18560A(View view, C16971b bVar) {
        boolean r = mo18539r();
        int childCount = (getChildCount() - bVar.f45950h) - 1;
        for (int childCount2 = getChildCount() - 2; childCount2 > childCount; childCount2--) {
            View childAt = getChildAt(childCount2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f45898h || r) {
                    if (this.f45906s.mo17561b(view) >= this.f45906s.mo17561b(childAt)) {
                    }
                } else if (this.f45906s.mo17564e(view) <= this.f45906s.mo17564e(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: B */
    public final View mo18561B(int i, int i2, boolean z) {
        int i3 = i2;
        int i4 = i;
        int i5 = i3 > i4 ? 1 : -1;
        while (i4 != i3) {
            View childAt = getChildAt(i4);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            boolean z2 = false;
            boolean z3 = paddingLeft <= decoratedLeft && width >= decoratedRight;
            boolean z4 = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z5 = paddingTop <= decoratedTop && height >= decoratedBottom;
            boolean z6 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (!z ? !(!z4 || !z6) : !(!z3 || !z5)) {
                z2 = true;
            }
            if (z2) {
                return childAt;
            }
            i4 += i5;
        }
        return null;
    }

    /* renamed from: C */
    public final View mo18562C(int i, int i2, int i3) {
        int position;
        mo18576v();
        View view = null;
        if (this.f45904q == null) {
            this.f45904q = new C16969c((C16967a) null);
        }
        int k = this.f45906s.mo17570k();
        int g = this.f45906s.mo17566g();
        int i4 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).mo17282d()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.f45906s.mo17564e(childAt) >= k && this.f45906s.mo17561b(childAt) <= g) {
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

    /* renamed from: D */
    public final int mo18563D(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, boolean z) {
        int i2;
        int g;
        if (!mo18539r() && this.f45898h) {
            int k = i - this.f45906s.mo17570k();
            if (k <= 0) {
                return 0;
            }
            i2 = mo18565F(k, rVar, wVar);
        } else {
            int g2 = this.f45906s.mo17566g() - i;
            if (g2 <= 0) {
                return 0;
            }
            i2 = -mo18565F(-g2, rVar, wVar);
        }
        int i3 = i + i2;
        if (!z || (g = this.f45906s.mo17566g() - i3) <= 0) {
            return i2;
        }
        this.f45906s.mo17574p(g);
        return g + i2;
    }

    /* renamed from: E */
    public final int mo18564E(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, boolean z) {
        int i2;
        int k;
        if (mo18539r() || !this.f45898h) {
            int k2 = i - this.f45906s.mo17570k();
            if (k2 <= 0) {
                return 0;
            }
            i2 = -mo18565F(k2, rVar, wVar);
        } else {
            int g = this.f45906s.mo17566g() - i;
            if (g <= 0) {
                return 0;
            }
            i2 = mo18565F(-g, rVar, wVar);
        }
        int i3 = i + i2;
        if (!z || (k = i3 - this.f45906s.mo17570k()) <= 0) {
            return i2;
        }
        this.f45906s.mo17574p(-k);
        return i2 - k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e7  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18565F(int r19, androidx.recyclerview.widget.RecyclerView.C16625r r20, androidx.recyclerview.widget.RecyclerView.C16628w r21) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            r2 = 0
            if (r1 == 0) goto L_0x0201
            if (r19 != 0) goto L_0x000d
            goto L_0x0201
        L_0x000d:
            r18.mo18576v()
            com.google.android.flexbox.FlexboxLayoutManager$c r1 = r0.f45904q
            r3 = 1
            r1.f45942j = r3
            boolean r1 = r18.mo18539r()
            if (r1 != 0) goto L_0x0021
            boolean r1 = r0.f45898h
            if (r1 == 0) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r4 = -1
            if (r1 == 0) goto L_0x0028
            if (r19 >= 0) goto L_0x002c
            goto L_0x002a
        L_0x0028:
            if (r19 <= 0) goto L_0x002c
        L_0x002a:
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = -1
        L_0x002d:
            int r6 = java.lang.Math.abs(r19)
            com.google.android.flexbox.FlexboxLayoutManager$c r7 = r0.f45904q
            r7.f45941i = r5
            boolean r7 = r18.mo18539r()
            int r8 = r18.getWidth()
            int r9 = r18.getWidthMode()
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            int r9 = r18.getHeight()
            int r10 = r18.getHeightMode()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            if (r7 != 0) goto L_0x0059
            boolean r10 = r0.f45898h
            if (r10 == 0) goto L_0x0059
            r10 = 1
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            if (r5 != r3) goto L_0x013b
            int r11 = r18.getChildCount()
            int r11 = r11 - r3
            android.view.View r11 = r0.getChildAt(r11)
            if (r11 != 0) goto L_0x0069
            goto L_0x01d7
        L_0x0069:
            com.google.android.flexbox.FlexboxLayoutManager$c r12 = r0.f45904q
            androidx.recyclerview.widget.y r13 = r0.f45906s
            int r13 = r13.mo17561b(r11)
            r12.f45937e = r13
            int r12 = r0.getPosition(r11)
            com.google.android.flexbox.c r13 = r0.f45901n
            int[] r13 = r13.f45963c
            r13 = r13[r12]
            java.util.List<com.google.android.flexbox.b> r14 = r0.f45900j
            java.lang.Object r13 = r14.get(r13)
            com.google.android.flexbox.b r13 = (com.google.android.flexbox.C16971b) r13
            android.view.View r11 = r0.mo18560A(r11, r13)
            com.google.android.flexbox.FlexboxLayoutManager$c r13 = r0.f45904q
            r13.f45940h = r3
            int r12 = r12 + r3
            r13.f45936d = r12
            com.google.android.flexbox.c r14 = r0.f45901n
            int[] r14 = r14.f45963c
            int r15 = r14.length
            if (r15 > r12) goto L_0x009a
            r13.f45935c = r4
            goto L_0x009e
        L_0x009a:
            r12 = r14[r12]
            r13.f45935c = r12
        L_0x009e:
            if (r10 == 0) goto L_0x00c5
            androidx.recyclerview.widget.y r10 = r0.f45906s
            int r10 = r10.mo17564e(r11)
            r13.f45937e = r10
            com.google.android.flexbox.FlexboxLayoutManager$c r10 = r0.f45904q
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r11 = r12.mo17564e(r11)
            int r11 = -r11
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r12 = r12.mo17570k()
            int r11 = r11 + r12
            r10.f45938f = r11
            com.google.android.flexbox.FlexboxLayoutManager$c r10 = r0.f45904q
            int r11 = r10.f45938f
            int r11 = java.lang.Math.max(r11, r2)
            r10.f45938f = r11
            goto L_0x00de
        L_0x00c5:
            androidx.recyclerview.widget.y r10 = r0.f45906s
            int r10 = r10.mo17561b(r11)
            r13.f45937e = r10
            com.google.android.flexbox.FlexboxLayoutManager$c r10 = r0.f45904q
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r11 = r12.mo17561b(r11)
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r12 = r12.mo17566g()
            int r11 = r11 - r12
            r10.f45938f = r11
        L_0x00de:
            com.google.android.flexbox.FlexboxLayoutManager$c r10 = r0.f45904q
            int r10 = r10.f45935c
            if (r10 == r4) goto L_0x00ed
            java.util.List<com.google.android.flexbox.b> r4 = r0.f45900j
            int r4 = r4.size()
            int r4 = r4 - r3
            if (r10 <= r4) goto L_0x01cf
        L_0x00ed:
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r3 = r3.f45936d
            int r4 = r18.getFlexItemCount()
            if (r3 > r4) goto L_0x01cf
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r4 = r3.f45938f
            int r14 = r6 - r4
            com.google.android.flexbox.c$a r11 = r0.f45893D
            r4 = 0
            r11.f45966a = r4
            r11.f45967b = r2
            if (r14 <= 0) goto L_0x01cf
            if (r7 == 0) goto L_0x0118
            com.google.android.flexbox.c r10 = r0.f45901n
            int r15 = r3.f45936d
            java.util.List<com.google.android.flexbox.b> r3 = r0.f45900j
            r16 = -1
            r12 = r8
            r13 = r9
            r17 = r3
            r10.mo18600b(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0127
        L_0x0118:
            com.google.android.flexbox.c r10 = r0.f45901n
            int r15 = r3.f45936d
            java.util.List<com.google.android.flexbox.b> r3 = r0.f45900j
            r16 = -1
            r12 = r9
            r13 = r8
            r17 = r3
            r10.mo18600b(r11, r12, r13, r14, r15, r16, r17)
        L_0x0127:
            com.google.android.flexbox.c r3 = r0.f45901n
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.f45904q
            int r4 = r4.f45936d
            r3.mo18606h(r8, r9, r4)
            com.google.android.flexbox.c r3 = r0.f45901n
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.f45904q
            int r4 = r4.f45936d
            r3.mo18619u(r4)
            goto L_0x01cf
        L_0x013b:
            android.view.View r7 = r0.getChildAt(r2)
            if (r7 != 0) goto L_0x0143
            goto L_0x01d7
        L_0x0143:
            com.google.android.flexbox.FlexboxLayoutManager$c r8 = r0.f45904q
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17564e(r7)
            r8.f45937e = r9
            int r8 = r0.getPosition(r7)
            com.google.android.flexbox.c r9 = r0.f45901n
            int[] r9 = r9.f45963c
            r9 = r9[r8]
            java.util.List<com.google.android.flexbox.b> r11 = r0.f45900j
            java.lang.Object r9 = r11.get(r9)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C16971b) r9
            android.view.View r7 = r0.mo18579y(r7, r9)
            com.google.android.flexbox.FlexboxLayoutManager$c r9 = r0.f45904q
            r9.f45940h = r3
            com.google.android.flexbox.c r11 = r0.f45901n
            int[] r11 = r11.f45963c
            r11 = r11[r8]
            if (r11 != r4) goto L_0x0170
            r11 = 0
        L_0x0170:
            if (r11 <= 0) goto L_0x0184
            java.util.List<com.google.android.flexbox.b> r4 = r0.f45900j
            int r9 = r11 + -1
            java.lang.Object r4 = r4.get(r9)
            com.google.android.flexbox.b r4 = (com.google.android.flexbox.C16971b) r4
            com.google.android.flexbox.FlexboxLayoutManager$c r9 = r0.f45904q
            int r4 = r4.f45950h
            int r8 = r8 - r4
            r9.f45936d = r8
            goto L_0x0186
        L_0x0184:
            r9.f45936d = r4
        L_0x0186:
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.f45904q
            if (r11 <= 0) goto L_0x018c
            int r11 = r11 - r3
            goto L_0x018d
        L_0x018c:
            r11 = 0
        L_0x018d:
            r4.f45935c = r11
            if (r10 == 0) goto L_0x01b5
            androidx.recyclerview.widget.y r3 = r0.f45906s
            int r3 = r3.mo17561b(r7)
            r4.f45937e = r3
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            androidx.recyclerview.widget.y r4 = r0.f45906s
            int r4 = r4.mo17561b(r7)
            androidx.recyclerview.widget.y r7 = r0.f45906s
            int r7 = r7.mo17566g()
            int r4 = r4 - r7
            r3.f45938f = r4
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r4 = r3.f45938f
            int r4 = java.lang.Math.max(r4, r2)
            r3.f45938f = r4
            goto L_0x01cf
        L_0x01b5:
            androidx.recyclerview.widget.y r3 = r0.f45906s
            int r3 = r3.mo17564e(r7)
            r4.f45937e = r3
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            androidx.recyclerview.widget.y r4 = r0.f45906s
            int r4 = r4.mo17564e(r7)
            int r4 = -r4
            androidx.recyclerview.widget.y r7 = r0.f45906s
            int r7 = r7.mo17570k()
            int r4 = r4 + r7
            r3.f45938f = r4
        L_0x01cf:
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r4 = r3.f45938f
            int r4 = r6 - r4
            r3.f45933a = r4
        L_0x01d7:
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r4 = r3.f45938f
            r7 = r20
            r8 = r21
            int r3 = r0.mo18577w(r7, r8, r3)
            int r4 = r4 + r3
            if (r4 >= 0) goto L_0x01e7
            return r2
        L_0x01e7:
            if (r1 == 0) goto L_0x01ef
            if (r6 <= r4) goto L_0x01f4
            int r1 = -r5
            int r1 = r1 * r4
            goto L_0x01f6
        L_0x01ef:
            if (r6 <= r4) goto L_0x01f4
            int r1 = r5 * r4
            goto L_0x01f6
        L_0x01f4:
            r1 = r19
        L_0x01f6:
            androidx.recyclerview.widget.y r2 = r0.f45906s
            int r3 = -r1
            r2.mo17574p(r3)
            com.google.android.flexbox.FlexboxLayoutManager$c r2 = r0.f45904q
            r2.f45939g = r1
            return r1
        L_0x0201:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo18565F(int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):int");
    }

    /* renamed from: G */
    public final int mo18566G(int i) {
        int i2;
        boolean z = false;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo18576v();
        boolean r = mo18539r();
        View view = this.f45891B;
        int width = r ? view.getWidth() : view.getHeight();
        int width2 = r ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + this.f45905r.f45928d) - width, abs);
            }
            i2 = this.f45905r.f45928d;
            if (i2 + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((width2 - this.f45905r.f45928d) - width, i);
        } else {
            i2 = this.f45905r.f45928d;
            if (i2 + i >= 0) {
                return i;
            }
        }
        return -i2;
    }

    /* renamed from: H */
    public final void mo18567H(RecyclerView.C16625r rVar, C16969c cVar) {
        int childCount;
        View childAt;
        int i;
        int childCount2;
        int i2;
        View childAt2;
        int i3;
        if (cVar.f45942j) {
            int i4 = -1;
            if (cVar.f45941i == -1) {
                if (cVar.f45938f >= 0 && (childCount2 = getChildCount()) != 0 && (childAt2 = getChildAt(i2)) != null && (i3 = this.f45901n.f45963c[getPosition(childAt2)]) != -1) {
                    C16971b bVar = this.f45900j.get(i3);
                    int i5 = childCount2 - 1;
                    while (true) {
                        if (i5 < 0) {
                            break;
                        }
                        View childAt3 = getChildAt(i5);
                        if (childAt3 != null) {
                            int i6 = cVar.f45938f;
                            if (!(mo18539r() || !this.f45898h ? this.f45906s.mo17564e(childAt3) >= this.f45906s.mo17565f() - i6 : this.f45906s.mo17561b(childAt3) <= i6)) {
                                break;
                            } else if (bVar.f45957o != getPosition(childAt3)) {
                                continue;
                            } else if (i3 <= 0) {
                                childCount2 = i5;
                                break;
                            } else {
                                i3 += cVar.f45941i;
                                bVar = this.f45900j.get(i3);
                                childCount2 = i5;
                            }
                        }
                        i5--;
                    }
                    while (i2 >= childCount2) {
                        removeAndRecycleViewAt(i2, rVar);
                        i2--;
                    }
                }
            } else if (cVar.f45938f >= 0 && (childCount = getChildCount()) != 0 && (childAt = getChildAt(0)) != null && (i = this.f45901n.f45963c[getPosition(childAt)]) != -1) {
                C16971b bVar2 = this.f45900j.get(i);
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt4 = getChildAt(i7);
                    if (childAt4 != null) {
                        int i8 = cVar.f45938f;
                        if (!(mo18539r() || !this.f45898h ? this.f45906s.mo17561b(childAt4) <= i8 : this.f45906s.mo17565f() - this.f45906s.mo17564e(childAt4) <= i8)) {
                            break;
                        } else if (bVar2.f45958p != getPosition(childAt4)) {
                            continue;
                        } else if (i >= this.f45900j.size() - 1) {
                            i4 = i7;
                            break;
                        } else {
                            i += cVar.f45941i;
                            bVar2 = this.f45900j.get(i);
                            i4 = i7;
                        }
                    }
                    i7++;
                }
                while (i4 >= 0) {
                    removeAndRecycleViewAt(i4, rVar);
                    i4--;
                }
            }
        }
    }

    /* renamed from: I */
    public final void mo18568I() {
        int heightMode = mo18539r() ? getHeightMode() : getWidthMode();
        this.f45904q.f45934b = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    /* renamed from: J */
    public void mo18569J(int i) {
        if (this.f45894d != i) {
            removeAllViews();
            this.f45894d = i;
            this.f45906s = null;
            this.f45907t = null;
            this.f45900j.clear();
            C16968b.m16723b(this.f45905r);
            this.f45905r.f45928d = 0;
            requestLayout();
        }
    }

    /* renamed from: K */
    public final void mo18570K(int i) {
        int i2 = -1;
        View B = mo18561B(getChildCount() - 1, -1, false);
        if (B != null) {
            i2 = getPosition(B);
        }
        if (i < i2) {
            int childCount = getChildCount();
            this.f45901n.mo18608j(childCount);
            this.f45901n.mo18609k(childCount);
            this.f45901n.mo18607i(childCount);
            if (i < this.f45901n.f45963c.length) {
                this.f45892C = i;
                View childAt = getChildAt(0);
                if (childAt != null) {
                    this.f45909v = getPosition(childAt);
                    if (mo18539r() || !this.f45898h) {
                        this.f45910w = this.f45906s.mo17564e(childAt) - this.f45906s.mo17570k();
                    } else {
                        this.f45910w = this.f45906s.mo17561b(childAt) + this.f45906s.mo17567h();
                    }
                }
            }
        }
    }

    /* renamed from: L */
    public final void mo18571L(C16968b bVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            mo18568I();
        } else {
            this.f45904q.f45934b = false;
        }
        if (mo18539r() || !this.f45898h) {
            this.f45904q.f45933a = this.f45906s.mo17566g() - bVar.f45927c;
        } else {
            this.f45904q.f45933a = bVar.f45927c - getPaddingRight();
        }
        C16969c cVar = this.f45904q;
        cVar.f45936d = bVar.f45925a;
        cVar.f45940h = 1;
        cVar.f45941i = 1;
        cVar.f45937e = bVar.f45927c;
        cVar.f45938f = Integer.MIN_VALUE;
        cVar.f45935c = bVar.f45926b;
        if (z && this.f45900j.size() > 1 && (i = bVar.f45926b) >= 0 && i < this.f45900j.size() - 1) {
            C16969c cVar2 = this.f45904q;
            cVar2.f45935c++;
            cVar2.f45936d += this.f45900j.get(bVar.f45926b).f45950h;
        }
    }

    /* renamed from: M */
    public final void mo18572M(C16968b bVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            mo18568I();
        } else {
            this.f45904q.f45934b = false;
        }
        if (mo18539r() || !this.f45898h) {
            this.f45904q.f45933a = bVar.f45927c - this.f45906s.mo17570k();
        } else {
            this.f45904q.f45933a = (this.f45891B.getWidth() - bVar.f45927c) - this.f45906s.mo17570k();
        }
        C16969c cVar = this.f45904q;
        cVar.f45936d = bVar.f45925a;
        cVar.f45940h = 1;
        cVar.f45941i = -1;
        cVar.f45937e = bVar.f45927c;
        cVar.f45938f = Integer.MIN_VALUE;
        int i2 = bVar.f45926b;
        cVar.f45935c = i2;
        if (z && i2 > 0 && this.f45900j.size() > (i = bVar.f45926b)) {
            C16969c cVar2 = this.f45904q;
            cVar2.f45935c--;
            cVar2.f45936d -= this.f45900j.get(i).f45950h;
        }
    }

    /* renamed from: a */
    public int mo18500a(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (mo18539r()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    /* renamed from: b */
    public int mo18502b(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (mo18539r()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    public boolean canScrollHorizontally() {
        if (this.f45895e == 0) {
            return mo18539r();
        }
        if (mo18539r()) {
            int width = getWidth();
            View view = this.f45891B;
            return width > (view != null ? view.getWidth() : 0);
        }
    }

    public boolean canScrollVertically() {
        if (this.f45895e == 0) {
            return !mo18539r();
        }
        if (mo18539r()) {
            return true;
        }
        int height = getHeight();
        View view = this.f45891B;
        return height > (view != null ? view.getHeight() : 0);
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public int computeHorizontalScrollExtent(RecyclerView.C16628w wVar) {
        return mo18573s(wVar);
    }

    public int computeHorizontalScrollOffset(RecyclerView.C16628w wVar) {
        return mo18574t(wVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.C16628w wVar) {
        return mo18575u(wVar);
    }

    public int computeVerticalScrollExtent(RecyclerView.C16628w wVar) {
        return mo18573s(wVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.C16628w wVar) {
        return mo18574t(wVar);
    }

    public int computeVerticalScrollRange(RecyclerView.C16628w wVar) {
        return mo18575u(wVar);
    }

    /* renamed from: e */
    public void mo18506e(C16971b bVar) {
    }

    /* renamed from: f */
    public PointF mo16988f(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        int i2 = i < getPosition(childAt) ? -1 : 1;
        return mo18539r() ? new PointF(0.0f, (float) i2) : new PointF((float) i2, 0.0f);
    }

    /* renamed from: g */
    public void mo18508g(View view, int i, int i2, C16971b bVar) {
        calculateItemDecorationsForChild(view, f45889E);
        if (mo18539r()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            bVar.f45947e += leftDecorationWidth;
            bVar.f45948f += leftDecorationWidth;
            return;
        }
        int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
        bVar.f45947e += topDecorationHeight;
        bVar.f45948f += topDecorationHeight;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.f45896f;
    }

    public int getFlexDirection() {
        return this.f45894d;
    }

    public int getFlexItemCount() {
        return this.f45903p.mo17354b();
    }

    public List<C16971b> getFlexLinesInternal() {
        return this.f45900j;
    }

    public int getFlexWrap() {
        return this.f45895e;
    }

    public int getLargestMainSize() {
        if (this.f45900j.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.f45900j.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f45900j.get(i2).f45947e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f45897g;
    }

    public int getSumOfCrossSize() {
        int size = this.f45900j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f45900j.get(i2).f45949g;
        }
        return i;
    }

    /* renamed from: i */
    public View mo18527i(int i) {
        View view = this.f45913z.get(i);
        return view != null ? view : this.f45902o.mo17341e(i);
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* renamed from: j */
    public int mo18528j(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    /* renamed from: l */
    public View mo18530l(int i) {
        return mo18527i(i);
    }

    /* renamed from: m */
    public int mo18531m(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    public void onAdapterChanged(RecyclerView.C16613e eVar, RecyclerView.C16613e eVar2) {
        removeAllViews();
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f45891B = (View) recyclerView.getParent();
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C16625r rVar) {
        super.onDetachedFromWindow(recyclerView, rVar);
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        mo18570K(i);
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        mo18570K(Math.min(i, i2));
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        mo18570K(i);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        mo18570K(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0290  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.C16625r r22, androidx.recyclerview.widget.RecyclerView.C16628w r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r0.f45902o = r1
            r0.f45903p = r2
            int r3 = r23.mo17354b()
            if (r3 != 0) goto L_0x0015
            boolean r4 = r2.f44838g
            if (r4 == 0) goto L_0x0015
            return
        L_0x0015:
            int r4 = r21.getLayoutDirection()
            int r5 = r0.f45894d
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x005f
            if (r5 == r7) goto L_0x004e
            if (r5 == r6) goto L_0x003d
            r9 = 3
            if (r5 == r9) goto L_0x002c
            r0.f45898h = r8
            r0.f45899i = r8
            goto L_0x006f
        L_0x002c:
            if (r4 != r7) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            r0.f45898h = r4
            int r5 = r0.f45895e
            if (r5 != r6) goto L_0x003a
            r4 = r4 ^ r7
            r0.f45898h = r4
        L_0x003a:
            r0.f45899i = r7
            goto L_0x006f
        L_0x003d:
            if (r4 != r7) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            r0.f45898h = r4
            int r5 = r0.f45895e
            if (r5 != r6) goto L_0x004b
            r4 = r4 ^ r7
            r0.f45898h = r4
        L_0x004b:
            r0.f45899i = r8
            goto L_0x006f
        L_0x004e:
            if (r4 == r7) goto L_0x0052
            r4 = 1
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            r0.f45898h = r4
            int r4 = r0.f45895e
            if (r4 != r6) goto L_0x005b
            r4 = 1
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            r0.f45899i = r4
            goto L_0x006f
        L_0x005f:
            if (r4 != r7) goto L_0x0063
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            r0.f45898h = r4
            int r4 = r0.f45895e
            if (r4 != r6) goto L_0x006c
            r4 = 1
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            r0.f45899i = r4
        L_0x006f:
            r21.mo18576v()
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.f45904q
            r5 = 0
            if (r4 != 0) goto L_0x007e
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = new com.google.android.flexbox.FlexboxLayoutManager$c
            r4.<init>(r5)
            r0.f45904q = r4
        L_0x007e:
            com.google.android.flexbox.c r4 = r0.f45901n
            r4.mo18608j(r3)
            com.google.android.flexbox.c r4 = r0.f45901n
            r4.mo18609k(r3)
            com.google.android.flexbox.c r4 = r0.f45901n
            r4.mo18607i(r3)
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.f45904q
            r4.f45942j = r8
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r4 = r0.f45908u
            if (r4 == 0) goto L_0x00a2
            int r6 = r4.f45923d
            if (r6 < 0) goto L_0x009d
            if (r6 >= r3) goto L_0x009d
            r9 = 1
            goto L_0x009e
        L_0x009d:
            r9 = 0
        L_0x009e:
            if (r9 == 0) goto L_0x00a2
            r0.f45909v = r6
        L_0x00a2:
            com.google.android.flexbox.FlexboxLayoutManager$b r6 = r0.f45905r
            boolean r9 = r6.f45930f
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -1
            if (r9 == 0) goto L_0x00b1
            int r9 = r0.f45909v
            if (r9 != r11) goto L_0x00b1
            if (r4 == 0) goto L_0x029b
        L_0x00b1:
            com.google.android.flexbox.FlexboxLayoutManager.C16968b.m16723b(r6)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f45905r
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r6 = r0.f45908u
            boolean r9 = r2.f44838g
            if (r9 != 0) goto L_0x01af
            int r9 = r0.f45909v
            if (r9 != r11) goto L_0x00c2
            goto L_0x01af
        L_0x00c2:
            if (r9 < 0) goto L_0x01ab
            int r12 = r23.mo17354b()
            if (r9 < r12) goto L_0x00cc
            goto L_0x01ab
        L_0x00cc:
            int r9 = r0.f45909v
            r4.f45925a = r9
            com.google.android.flexbox.c r12 = r0.f45901n
            int[] r12 = r12.f45963c
            r9 = r12[r9]
            r4.f45926b = r9
            com.google.android.flexbox.FlexboxLayoutManager$SavedState r9 = r0.f45908u
            if (r9 == 0) goto L_0x00fc
            int r12 = r23.mo17354b()
            int r9 = r9.f45923d
            if (r9 < 0) goto L_0x00e8
            if (r9 >= r12) goto L_0x00e8
            r9 = 1
            goto L_0x00e9
        L_0x00e8:
            r9 = 0
        L_0x00e9:
            if (r9 == 0) goto L_0x00fc
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17570k()
            int r6 = r6.f45924e
            int r9 = r9 + r6
            r4.f45927c = r9
            r4.f45931g = r7
            r4.f45926b = r11
            goto L_0x01a9
        L_0x00fc:
            int r6 = r0.f45910w
            if (r6 != r10) goto L_0x0188
            int r6 = r0.f45909v
            android.view.View r6 = r0.findViewByPosition(r6)
            if (r6 == 0) goto L_0x016b
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17562c(r6)
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r12 = r12.mo17571l()
            if (r9 <= r12) goto L_0x011b
            com.google.android.flexbox.FlexboxLayoutManager.C16968b.m16722a(r4)
            goto L_0x01a9
        L_0x011b:
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17564e(r6)
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r12 = r12.mo17570k()
            int r9 = r9 - r12
            if (r9 >= 0) goto L_0x0136
            androidx.recyclerview.widget.y r6 = r0.f45906s
            int r6 = r6.mo17570k()
            r4.f45927c = r6
            r4.f45929e = r8
            goto L_0x01a9
        L_0x0136:
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17566g()
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r12 = r12.mo17561b(r6)
            int r9 = r9 - r12
            if (r9 >= 0) goto L_0x0150
            androidx.recyclerview.widget.y r6 = r0.f45906s
            int r6 = r6.mo17566g()
            r4.f45927c = r6
            r4.f45929e = r7
            goto L_0x01a9
        L_0x0150:
            boolean r9 = r4.f45929e
            if (r9 == 0) goto L_0x0162
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r6 = r9.mo17561b(r6)
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17575m()
            int r6 = r6 + r9
            goto L_0x0168
        L_0x0162:
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r6 = r9.mo17564e(r6)
        L_0x0168:
            r4.f45927c = r6
            goto L_0x01a9
        L_0x016b:
            int r6 = r21.getChildCount()
            if (r6 <= 0) goto L_0x0184
            android.view.View r6 = r0.getChildAt(r8)
            if (r6 == 0) goto L_0x0184
            int r6 = r0.getPosition(r6)
            int r9 = r0.f45909v
            if (r9 >= r6) goto L_0x0181
            r6 = 1
            goto L_0x0182
        L_0x0181:
            r6 = 0
        L_0x0182:
            r4.f45929e = r6
        L_0x0184:
            com.google.android.flexbox.FlexboxLayoutManager.C16968b.m16722a(r4)
            goto L_0x01a9
        L_0x0188:
            boolean r6 = r21.mo18539r()
            if (r6 != 0) goto L_0x019e
            boolean r6 = r0.f45898h
            if (r6 == 0) goto L_0x019e
            int r6 = r0.f45910w
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17567h()
            int r6 = r6 - r9
            r4.f45927c = r6
            goto L_0x01a9
        L_0x019e:
            androidx.recyclerview.widget.y r6 = r0.f45906s
            int r6 = r6.mo17570k()
            int r9 = r0.f45910w
            int r6 = r6 + r9
            r4.f45927c = r6
        L_0x01a9:
            r6 = 1
            goto L_0x01b0
        L_0x01ab:
            r0.f45909v = r11
            r0.f45910w = r10
        L_0x01af:
            r6 = 0
        L_0x01b0:
            if (r6 == 0) goto L_0x01b4
            goto L_0x0297
        L_0x01b4:
            int r6 = r21.getChildCount()
            if (r6 != 0) goto L_0x01bc
            goto L_0x028c
        L_0x01bc:
            boolean r6 = r4.f45929e
            if (r6 == 0) goto L_0x01c9
            int r6 = r23.mo17354b()
            android.view.View r6 = r0.mo18580z(r6)
            goto L_0x01d1
        L_0x01c9:
            int r6 = r23.mo17354b()
            android.view.View r6 = r0.mo18578x(r6)
        L_0x01d1:
            if (r6 == 0) goto L_0x028c
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r12 = r9.f45895e
            if (r12 != 0) goto L_0x01dc
            androidx.recyclerview.widget.y r12 = r9.f45907t
            goto L_0x01de
        L_0x01dc:
            androidx.recyclerview.widget.y r12 = r9.f45906s
        L_0x01de:
            boolean r9 = r9.mo18539r()
            if (r9 != 0) goto L_0x0201
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            boolean r9 = r9.f45898h
            if (r9 == 0) goto L_0x0201
            boolean r9 = r4.f45929e
            if (r9 == 0) goto L_0x01fa
            int r9 = r12.mo17564e(r6)
            int r12 = r12.mo17575m()
            int r9 = r9 + r12
            r4.f45927c = r9
            goto L_0x0217
        L_0x01fa:
            int r9 = r12.mo17561b(r6)
            r4.f45927c = r9
            goto L_0x0217
        L_0x0201:
            boolean r9 = r4.f45929e
            if (r9 == 0) goto L_0x0211
            int r9 = r12.mo17561b(r6)
            int r12 = r12.mo17575m()
            int r9 = r9 + r12
            r4.f45927c = r9
            goto L_0x0217
        L_0x0211:
            int r9 = r12.mo17564e(r6)
            r4.f45927c = r9
        L_0x0217:
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            int r9 = r9.getPosition(r6)
            r4.f45925a = r9
            r4.f45931g = r8
            com.google.android.flexbox.FlexboxLayoutManager r12 = com.google.android.flexbox.FlexboxLayoutManager.this
            com.google.android.flexbox.c r13 = r12.f45901n
            int[] r13 = r13.f45963c
            if (r9 == r11) goto L_0x022a
            goto L_0x022b
        L_0x022a:
            r9 = 0
        L_0x022b:
            r9 = r13[r9]
            if (r9 == r11) goto L_0x0230
            goto L_0x0231
        L_0x0230:
            r9 = 0
        L_0x0231:
            r4.f45926b = r9
            java.util.List<com.google.android.flexbox.b> r9 = r12.f45900j
            int r9 = r9.size()
            int r12 = r4.f45926b
            if (r9 <= r12) goto L_0x024b
            com.google.android.flexbox.FlexboxLayoutManager r9 = com.google.android.flexbox.FlexboxLayoutManager.this
            java.util.List<com.google.android.flexbox.b> r9 = r9.f45900j
            java.lang.Object r9 = r9.get(r12)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C16971b) r9
            int r9 = r9.f45957o
            r4.f45925a = r9
        L_0x024b:
            boolean r9 = r2.f44838g
            if (r9 != 0) goto L_0x028a
            boolean r9 = r21.supportsPredictiveItemAnimations()
            if (r9 == 0) goto L_0x028a
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17564e(r6)
            androidx.recyclerview.widget.y r12 = r0.f45906s
            int r12 = r12.mo17566g()
            if (r9 >= r12) goto L_0x0274
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r6 = r9.mo17561b(r6)
            androidx.recyclerview.widget.y r9 = r0.f45906s
            int r9 = r9.mo17570k()
            if (r6 >= r9) goto L_0x0272
            goto L_0x0274
        L_0x0272:
            r6 = 0
            goto L_0x0275
        L_0x0274:
            r6 = 1
        L_0x0275:
            if (r6 == 0) goto L_0x028a
            boolean r6 = r4.f45929e
            if (r6 == 0) goto L_0x0282
            androidx.recyclerview.widget.y r6 = r0.f45906s
            int r6 = r6.mo17566g()
            goto L_0x0288
        L_0x0282:
            androidx.recyclerview.widget.y r6 = r0.f45906s
            int r6 = r6.mo17570k()
        L_0x0288:
            r4.f45927c = r6
        L_0x028a:
            r6 = 1
            goto L_0x028d
        L_0x028c:
            r6 = 0
        L_0x028d:
            if (r6 == 0) goto L_0x0290
            goto L_0x0297
        L_0x0290:
            com.google.android.flexbox.FlexboxLayoutManager.C16968b.m16722a(r4)
            r4.f45925a = r8
            r4.f45926b = r8
        L_0x0297:
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f45905r
            r4.f45930f = r7
        L_0x029b:
            r21.detachAndScrapAttachedViews(r22)
            com.google.android.flexbox.FlexboxLayoutManager$b r4 = r0.f45905r
            boolean r6 = r4.f45929e
            if (r6 == 0) goto L_0x02a8
            r0.mo18572M(r4, r8, r7)
            goto L_0x02ab
        L_0x02a8:
            r0.mo18571L(r4, r8, r7)
        L_0x02ab:
            int r4 = r21.getWidth()
            int r6 = r21.getWidthMode()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            int r6 = r21.getHeight()
            int r9 = r21.getHeightMode()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            int r9 = r21.getWidth()
            int r12 = r21.getHeight()
            boolean r13 = r21.mo18539r()
            if (r13 == 0) goto L_0x02f0
            int r13 = r0.f45911x
            if (r13 == r10) goto L_0x02d9
            if (r13 == r9) goto L_0x02d9
            r10 = 1
            goto L_0x02da
        L_0x02d9:
            r10 = 0
        L_0x02da:
            com.google.android.flexbox.FlexboxLayoutManager$c r13 = r0.f45904q
            boolean r14 = r13.f45934b
            if (r14 == 0) goto L_0x02ed
            android.content.Context r13 = r0.f45890A
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r13 = r13.heightPixels
            goto L_0x030e
        L_0x02ed:
            int r13 = r13.f45933a
            goto L_0x030e
        L_0x02f0:
            int r13 = r0.f45912y
            if (r13 == r10) goto L_0x02f8
            if (r13 == r12) goto L_0x02f8
            r10 = 1
            goto L_0x02f9
        L_0x02f8:
            r10 = 0
        L_0x02f9:
            com.google.android.flexbox.FlexboxLayoutManager$c r13 = r0.f45904q
            boolean r14 = r13.f45934b
            if (r14 == 0) goto L_0x030c
            android.content.Context r13 = r0.f45890A
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r13 = r13.widthPixels
            goto L_0x030e
        L_0x030c:
            int r13 = r13.f45933a
        L_0x030e:
            r16 = r13
            r0.f45911x = r9
            r0.f45912y = r12
            int r9 = r0.f45892C
            if (r9 != r11) goto L_0x0384
            int r12 = r0.f45909v
            if (r12 != r11) goto L_0x031e
            if (r10 == 0) goto L_0x0384
        L_0x031e:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f45905r
            boolean r3 = r3.f45929e
            if (r3 == 0) goto L_0x0326
            goto L_0x0426
        L_0x0326:
            java.util.List<com.google.android.flexbox.b> r3 = r0.f45900j
            r3.clear()
            com.google.android.flexbox.c$a r3 = r0.f45893D
            r3.f45966a = r5
            r3.f45967b = r8
            boolean r3 = r21.mo18539r()
            if (r3 == 0) goto L_0x034d
            com.google.android.flexbox.c r12 = r0.f45901n
            com.google.android.flexbox.c$a r13 = r0.f45893D
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f45905r
            int r3 = r3.f45925a
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            r17 = 0
            r14 = r4
            r15 = r6
            r18 = r3
            r19 = r5
            r12.mo18600b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0362
        L_0x034d:
            com.google.android.flexbox.c r12 = r0.f45901n
            com.google.android.flexbox.c$a r13 = r0.f45893D
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f45905r
            int r3 = r3.f45925a
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            r17 = 0
            r14 = r6
            r15 = r4
            r18 = r3
            r19 = r5
            r12.mo18600b(r13, r14, r15, r16, r17, r18, r19)
        L_0x0362:
            com.google.android.flexbox.c$a r3 = r0.f45893D
            java.util.List<com.google.android.flexbox.b> r3 = r3.f45966a
            r0.f45900j = r3
            com.google.android.flexbox.c r3 = r0.f45901n
            r3.mo18606h(r4, r6, r8)
            com.google.android.flexbox.c r3 = r0.f45901n
            r3.mo18619u(r8)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f45905r
            com.google.android.flexbox.c r4 = r0.f45901n
            int[] r4 = r4.f45963c
            int r5 = r3.f45925a
            r4 = r4[r5]
            r3.f45926b = r4
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            r3.f45935c = r4
            goto L_0x0426
        L_0x0384:
            if (r9 == r11) goto L_0x038f
            com.google.android.flexbox.FlexboxLayoutManager$b r10 = r0.f45905r
            int r10 = r10.f45925a
            int r9 = java.lang.Math.min(r9, r10)
            goto L_0x0393
        L_0x038f:
            com.google.android.flexbox.FlexboxLayoutManager$b r9 = r0.f45905r
            int r9 = r9.f45925a
        L_0x0393:
            com.google.android.flexbox.c$a r10 = r0.f45893D
            r10.f45966a = r5
            r10.f45967b = r8
            boolean r5 = r21.mo18539r()
            if (r5 == 0) goto L_0x03db
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x03c4
            com.google.android.flexbox.c r3 = r0.f45901n
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            r3.mo18602d(r5, r9)
            com.google.android.flexbox.c r12 = r0.f45901n
            com.google.android.flexbox.c$a r13 = r0.f45893D
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f45905r
            int r3 = r3.f45925a
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            r14 = r4
            r15 = r6
            r17 = r9
            r18 = r3
            r19 = r5
            r12.mo18600b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0416
        L_0x03c4:
            com.google.android.flexbox.c r5 = r0.f45901n
            r5.mo18607i(r3)
            com.google.android.flexbox.c r12 = r0.f45901n
            com.google.android.flexbox.c$a r13 = r0.f45893D
            r17 = 0
            java.util.List<com.google.android.flexbox.b> r3 = r0.f45900j
            r18 = -1
            r14 = r4
            r15 = r6
            r19 = r3
            r12.mo18600b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0416
        L_0x03db:
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0400
            com.google.android.flexbox.c r3 = r0.f45901n
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            r3.mo18602d(r5, r9)
            com.google.android.flexbox.c r12 = r0.f45901n
            com.google.android.flexbox.c$a r13 = r0.f45893D
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f45905r
            int r3 = r3.f45925a
            java.util.List<com.google.android.flexbox.b> r5 = r0.f45900j
            r14 = r6
            r15 = r4
            r17 = r9
            r18 = r3
            r19 = r5
            r12.mo18600b(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0416
        L_0x0400:
            com.google.android.flexbox.c r5 = r0.f45901n
            r5.mo18607i(r3)
            com.google.android.flexbox.c r12 = r0.f45901n
            com.google.android.flexbox.c$a r13 = r0.f45893D
            r17 = 0
            java.util.List<com.google.android.flexbox.b> r3 = r0.f45900j
            r18 = -1
            r14 = r6
            r15 = r4
            r19 = r3
            r12.mo18600b(r13, r14, r15, r16, r17, r18, r19)
        L_0x0416:
            com.google.android.flexbox.c$a r3 = r0.f45893D
            java.util.List<com.google.android.flexbox.b> r3 = r3.f45966a
            r0.f45900j = r3
            com.google.android.flexbox.c r3 = r0.f45901n
            r3.mo18606h(r4, r6, r9)
            com.google.android.flexbox.c r3 = r0.f45901n
            r3.mo18619u(r9)
        L_0x0426:
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            r0.mo18577w(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.f45905r
            boolean r4 = r3.f45929e
            if (r4 == 0) goto L_0x0442
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.f45904q
            int r4 = r4.f45937e
            r0.mo18571L(r3, r7, r8)
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            r0.mo18577w(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r3 = r3.f45937e
            goto L_0x0457
        L_0x0442:
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r0.f45904q
            int r4 = r4.f45937e
            r0.mo18572M(r3, r7, r8)
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            r0.mo18577w(r1, r2, r3)
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r3 = r3.f45937e
            r20 = r4
            r4 = r3
            r3 = r20
        L_0x0457:
            int r5 = r21.getChildCount()
            if (r5 <= 0) goto L_0x0474
            com.google.android.flexbox.FlexboxLayoutManager$b r5 = r0.f45905r
            boolean r5 = r5.f45929e
            if (r5 == 0) goto L_0x046c
            int r3 = r0.mo18563D(r3, r1, r2, r7)
            int r4 = r4 + r3
            r0.mo18564E(r4, r1, r2, r8)
            goto L_0x0474
        L_0x046c:
            int r4 = r0.mo18564E(r4, r1, r2, r7)
            int r3 = r3 + r4
            r0.mo18563D(r3, r1, r2, r8)
        L_0x0474:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        this.f45908u = null;
        this.f45909v = -1;
        this.f45910w = Integer.MIN_VALUE;
        this.f45892C = -1;
        C16968b.m16723b(this.f45905r);
        this.f45913z.clear();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f45908u = (SavedState) parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.f45908u;
        if (savedState != null) {
            return new SavedState(savedState, (C16967a) null);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            savedState2.f45923d = getPosition(childAt);
            savedState2.f45924e = this.f45906s.mo17564e(childAt) - this.f45906s.mo17570k();
        } else {
            savedState2.f45923d = -1;
        }
        return savedState2;
    }

    /* renamed from: q */
    public void mo18538q(int i, View view) {
        this.f45913z.put(i, view);
    }

    /* renamed from: r */
    public boolean mo18539r() {
        int i = this.f45894d;
        return i == 0 || i == 1;
    }

    /* renamed from: s */
    public final int mo18573s(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b = wVar.mo17354b();
        mo18576v();
        View x = mo18578x(b);
        View z = mo18580z(b);
        if (wVar.mo17354b() == 0 || x == null || z == null) {
            return 0;
        }
        return Math.min(this.f45906s.mo17571l(), this.f45906s.mo17561b(z) - this.f45906s.mo17564e(x));
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (!mo18539r() || this.f45895e == 0) {
            int F = mo18565F(i, rVar, wVar);
            this.f45913z.clear();
            return F;
        }
        int G = mo18566G(i);
        this.f45905r.f45928d += G;
        this.f45907t.mo17574p(-G);
        return G;
    }

    public void scrollToPosition(int i) {
        this.f45909v = i;
        this.f45910w = Integer.MIN_VALUE;
        SavedState savedState = this.f45908u;
        if (savedState != null) {
            savedState.f45923d = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (mo18539r() || (this.f45895e == 0 && !mo18539r())) {
            int F = mo18565F(i, rVar, wVar);
            this.f45913z.clear();
            return F;
        }
        int G = mo18566G(i);
        this.f45905r.f45928d += G;
        this.f45907t.mo17574p(-G);
        return G;
    }

    public void setFlexLines(List<C16971b> list) {
        this.f45900j = list;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        C54256s sVar = new C54256s(recyclerView.getContext());
        sVar.f44872a = i;
        startSmoothScroll(sVar);
    }

    /* renamed from: t */
    public final int mo18574t(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b = wVar.mo17354b();
        View x = mo18578x(b);
        View z = mo18580z(b);
        if (!(wVar.mo17354b() == 0 || x == null || z == null)) {
            int position = getPosition(x);
            int position2 = getPosition(z);
            int abs = Math.abs(this.f45906s.mo17561b(z) - this.f45906s.mo17564e(x));
            int[] iArr = this.f45901n.f45963c;
            int i = iArr[position];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[position2] - i) + 1)))) + ((float) (this.f45906s.mo17570k() - this.f45906s.mo17564e(x))));
            }
        }
        return 0;
    }

    /* renamed from: u */
    public final int mo18575u(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        int b = wVar.mo17354b();
        View x = mo18578x(b);
        View z = mo18580z(b);
        if (wVar.mo17354b() == 0 || x == null || z == null) {
            return 0;
        }
        View B = mo18561B(0, getChildCount(), false);
        int i = -1;
        int position = B == null ? -1 : getPosition(B);
        View B2 = mo18561B(getChildCount() - 1, -1, false);
        if (B2 != null) {
            i = getPosition(B2);
        }
        return (int) ((((float) Math.abs(this.f45906s.mo17561b(z) - this.f45906s.mo17564e(x))) / ((float) ((i - position) + 1))) * ((float) wVar.mo17354b()));
    }

    /* renamed from: v */
    public final void mo18576v() {
        if (this.f45906s == null) {
            if (mo18539r()) {
                if (this.f45895e == 0) {
                    this.f45906s = new C16680w(this);
                    this.f45907t = new C16681x(this);
                    return;
                }
                this.f45906s = new C16681x(this);
                this.f45907t = new C16680w(this);
            } else if (this.f45895e == 0) {
                this.f45906s = new C16681x(this);
                this.f45907t = new C16680w(this);
            } else {
                this.f45906s = new C16680w(this);
                this.f45907t = new C16681x(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r10 = r2.f45935c;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo18577w(androidx.recyclerview.widget.RecyclerView.C16625r r31, androidx.recyclerview.widget.RecyclerView.C16628w r32, com.google.android.flexbox.FlexboxLayoutManager.C16969c r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r33
            int r3 = r2.f45938f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x0016
            int r5 = r2.f45933a
            if (r5 >= 0) goto L_0x0013
            int r3 = r3 + r5
            r2.f45938f = r3
        L_0x0013:
            r0.mo18567H(r1, r2)
        L_0x0016:
            int r3 = r2.f45933a
            boolean r5 = r30.mo18539r()
            r7 = r3
            r8 = 0
        L_0x001e:
            if (r7 > 0) goto L_0x0026
            com.google.android.flexbox.FlexboxLayoutManager$c r9 = r0.f45904q
            boolean r9 = r9.f45934b
            if (r9 == 0) goto L_0x0335
        L_0x0026:
            java.util.List<com.google.android.flexbox.b> r9 = r0.f45900j
            int r10 = r2.f45936d
            if (r10 < 0) goto L_0x003e
            int r12 = r32.mo17354b()
            if (r10 >= r12) goto L_0x003e
            int r10 = r2.f45935c
            if (r10 < 0) goto L_0x003e
            int r9 = r9.size()
            if (r10 >= r9) goto L_0x003e
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            if (r9 == 0) goto L_0x0335
            java.util.List<com.google.android.flexbox.b> r9 = r0.f45900j
            int r10 = r2.f45935c
            java.lang.Object r9 = r9.get(r10)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C16971b) r9
            int r10 = r9.f45957o
            r2.f45936d = r10
            boolean r10 = r30.mo18539r()
            r12 = 0
            r13 = -1
            r20 = 32
            if (r10 == 0) goto L_0x0178
            int r10 = r30.getPaddingLeft()
            int r14 = r30.getPaddingRight()
            int r15 = r30.getWidth()
            int r6 = r2.f45937e
            int r4 = r2.f45941i
            if (r4 != r13) goto L_0x006e
            int r4 = r9.f45949g
            int r6 = r6 - r4
        L_0x006e:
            int r4 = r2.f45936d
            float r10 = (float) r10
            int r15 = r15 - r14
            float r13 = (float) r15
            com.google.android.flexbox.FlexboxLayoutManager$b r14 = r0.f45905r
            int r14 = r14.f45928d
            float r14 = (float) r14
            float r10 = r10 - r14
            float r13 = r13 - r14
            float r19 = java.lang.Math.max(r12, r12)
            int r15 = r9.f45950h
            r14 = r4
            r12 = 0
        L_0x0082:
            int r11 = r4 + r15
            if (r14 >= r11) goto L_0x0165
            android.view.View r11 = r0.mo18527i(r14)
            if (r11 != 0) goto L_0x0096
            r23 = r3
            r22 = r4
            r26 = r14
            r27 = r15
            goto L_0x015b
        L_0x0096:
            r22 = r4
            int r4 = r2.f45941i
            r16 = r15
            r15 = 1
            if (r4 != r15) goto L_0x00a8
            android.graphics.Rect r4 = f45889E
            r0.calculateItemDecorationsForChild(r11, r4)
            r0.addView(r11)
            goto L_0x00b2
        L_0x00a8:
            android.graphics.Rect r4 = f45889E
            r0.calculateItemDecorationsForChild(r11, r4)
            r0.addView(r11, r12)
            int r12 = r12 + 1
        L_0x00b2:
            r4 = r12
            com.google.android.flexbox.c r12 = r0.f45901n
            long[] r12 = r12.f45964d
            r23 = r3
            r24 = r4
            r3 = r12[r14]
            int r12 = (int) r3
            long r3 = r3 >> r20
            int r4 = (int) r3
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r3 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r3
            boolean r15 = r0.shouldMeasureChild(r11, r12, r4, r3)
            if (r15 == 0) goto L_0x00d0
            r11.measure(r12, r4)
        L_0x00d0:
            int r4 = r3.leftMargin
            int r12 = r0.getLeftDecorationWidth(r11)
            int r4 = r4 + r12
            float r4 = (float) r4
            float r10 = r10 + r4
            int r4 = r3.rightMargin
            int r12 = r0.getRightDecorationWidth(r11)
            int r4 = r4 + r12
            float r4 = (float) r4
            float r4 = r13 - r4
            int r12 = r0.getTopDecorationHeight(r11)
            int r17 = r6 + r12
            boolean r12 = r0.f45898h
            if (r12 == 0) goto L_0x0113
            com.google.android.flexbox.c r12 = r0.f45901n
            int r13 = java.lang.Math.round(r4)
            int r15 = r11.getMeasuredWidth()
            int r15 = r13 - r15
            int r18 = java.lang.Math.round(r4)
            int r13 = r11.getMeasuredHeight()
            int r25 = r17 + r13
            r13 = r11
            r26 = r14
            r14 = r9
            r27 = r16
            r16 = r17
            r17 = r18
            r18 = r25
            r12.mo18613o(r13, r14, r15, r16, r17, r18)
            goto L_0x0138
        L_0x0113:
            r26 = r14
            r27 = r16
            com.google.android.flexbox.c r12 = r0.f45901n
            int r15 = java.lang.Math.round(r10)
            int r13 = java.lang.Math.round(r10)
            int r14 = r11.getMeasuredWidth()
            int r18 = r13 + r14
            int r13 = r11.getMeasuredHeight()
            int r25 = r17 + r13
            r13 = r11
            r14 = r9
            r16 = r17
            r17 = r18
            r18 = r25
            r12.mo18613o(r13, r14, r15, r16, r17, r18)
        L_0x0138:
            int r12 = r11.getMeasuredWidth()
            int r13 = r3.rightMargin
            int r12 = r12 + r13
            int r13 = r0.getRightDecorationWidth(r11)
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 + r19
            float r10 = r10 + r12
            int r12 = r11.getMeasuredWidth()
            int r3 = r3.leftMargin
            int r12 = r12 + r3
            int r3 = r0.getLeftDecorationWidth(r11)
            int r12 = r12 + r3
            float r3 = (float) r12
            float r3 = r3 + r19
            float r4 = r4 - r3
            r13 = r4
            r12 = r24
        L_0x015b:
            int r14 = r26 + 1
            r4 = r22
            r3 = r23
            r15 = r27
            goto L_0x0082
        L_0x0165:
            r23 = r3
            com.google.android.flexbox.FlexboxLayoutManager$c r3 = r0.f45904q
            int r3 = r3.f45941i
            int r4 = r2.f45935c
            int r4 = r4 + r3
            r2.f45935c = r4
            int r3 = r9.f45949g
            r22 = r7
            r24 = r8
            goto L_0x030a
        L_0x0178:
            r23 = r3
            int r3 = r30.getPaddingTop()
            int r4 = r30.getPaddingBottom()
            int r6 = r30.getHeight()
            int r10 = r2.f45937e
            int r11 = r2.f45941i
            if (r11 != r13) goto L_0x0194
            int r11 = r9.f45949g
            int r13 = r10 - r11
            int r10 = r10 + r11
            r11 = r10
            r10 = r13
            goto L_0x0195
        L_0x0194:
            r11 = r10
        L_0x0195:
            int r15 = r2.f45936d
            float r3 = (float) r3
            int r6 = r6 - r4
            float r4 = (float) r6
            com.google.android.flexbox.FlexboxLayoutManager$b r6 = r0.f45905r
            int r6 = r6.f45928d
            float r6 = (float) r6
            float r3 = r3 - r6
            float r4 = r4 - r6
            float r6 = java.lang.Math.max(r12, r12)
            int r14 = r9.f45950h
            r13 = r15
            r12 = 0
        L_0x01a9:
            int r1 = r15 + r14
            if (r13 >= r1) goto L_0x02fb
            android.view.View r1 = r0.mo18527i(r13)
            if (r1 != 0) goto L_0x01c1
            r22 = r7
            r24 = r8
            r27 = r13
            r21 = r14
            r29 = r15
            r28 = 1
            goto L_0x02ef
        L_0x01c1:
            r16 = r14
            com.google.android.flexbox.c r14 = r0.f45901n
            long[] r14 = r14.f45964d
            r22 = r7
            r24 = r8
            r7 = r14[r13]
            int r14 = (int) r7
            long r7 = r7 >> r20
            int r8 = (int) r7
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r7 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r7
            boolean r17 = r0.shouldMeasureChild(r1, r14, r8, r7)
            if (r17 == 0) goto L_0x01e0
            r1.measure(r14, r8)
        L_0x01e0:
            int r8 = r7.topMargin
            int r14 = r0.getTopDecorationHeight(r1)
            int r8 = r8 + r14
            float r8 = (float) r8
            float r3 = r3 + r8
            int r8 = r7.rightMargin
            int r14 = r0.getBottomDecorationHeight(r1)
            int r8 = r8 + r14
            float r8 = (float) r8
            float r4 = r4 - r8
            int r8 = r2.f45941i
            r14 = 1
            if (r8 != r14) goto L_0x0200
            android.graphics.Rect r8 = f45889E
            r0.calculateItemDecorationsForChild(r1, r8)
            r0.addView(r1)
            goto L_0x020a
        L_0x0200:
            android.graphics.Rect r8 = f45889E
            r0.calculateItemDecorationsForChild(r1, r8)
            r0.addView(r1, r12)
            int r12 = r12 + 1
        L_0x020a:
            r8 = r12
            int r12 = r0.getLeftDecorationWidth(r1)
            int r17 = r10 + r12
            int r12 = r0.getRightDecorationWidth(r1)
            int r18 = r11 - r12
            boolean r12 = r0.f45898h
            if (r12 == 0) goto L_0x0277
            boolean r14 = r0.f45899i
            if (r14 == 0) goto L_0x024f
            com.google.android.flexbox.c r14 = r0.f45901n
            int r17 = r1.getMeasuredWidth()
            int r17 = r18 - r17
            int r19 = java.lang.Math.round(r4)
            int r25 = r1.getMeasuredHeight()
            int r19 = r19 - r25
            int r25 = java.lang.Math.round(r4)
            r26 = r12
            r12 = r14
            r27 = r13
            r13 = r1
            r21 = r16
            r28 = 1
            r14 = r9
            r29 = r15
            r15 = r26
            r16 = r17
            r17 = r19
            r19 = r25
            r12.mo18614p(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02d0
        L_0x024f:
            r26 = r12
            r27 = r13
            r29 = r15
            r21 = r16
            r28 = 1
            com.google.android.flexbox.c r12 = r0.f45901n
            int r13 = r1.getMeasuredWidth()
            int r16 = r18 - r13
            int r17 = java.lang.Math.round(r3)
            int r13 = java.lang.Math.round(r3)
            int r14 = r1.getMeasuredHeight()
            int r19 = r13 + r14
            r13 = r1
            r14 = r9
            r15 = r26
            r12.mo18614p(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02d0
        L_0x0277:
            r26 = r12
            r27 = r13
            r29 = r15
            r21 = r16
            r28 = 1
            boolean r12 = r0.f45899i
            if (r12 == 0) goto L_0x02ab
            com.google.android.flexbox.c r12 = r0.f45901n
            int r13 = java.lang.Math.round(r4)
            int r14 = r1.getMeasuredHeight()
            int r18 = r13 - r14
            int r13 = r1.getMeasuredWidth()
            int r19 = r17 + r13
            int r25 = java.lang.Math.round(r4)
            r13 = r1
            r14 = r9
            r15 = r26
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r25
            r12.mo18614p(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02d0
        L_0x02ab:
            com.google.android.flexbox.c r12 = r0.f45901n
            int r18 = java.lang.Math.round(r3)
            int r13 = r1.getMeasuredWidth()
            int r19 = r17 + r13
            int r13 = java.lang.Math.round(r3)
            int r14 = r1.getMeasuredHeight()
            int r25 = r13 + r14
            r13 = r1
            r14 = r9
            r15 = r26
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r25
            r12.mo18614p(r13, r14, r15, r16, r17, r18, r19)
        L_0x02d0:
            int r12 = r1.getMeasuredHeight()
            int r13 = r7.topMargin
            int r12 = r12 + r13
            int r13 = r0.getBottomDecorationHeight(r1)
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 + r6
            float r3 = r3 + r12
            int r12 = r1.getMeasuredHeight()
            int r7 = r7.bottomMargin
            int r12 = r12 + r7
            int r1 = r0.getTopDecorationHeight(r1)
            int r12 = r12 + r1
            float r1 = (float) r12
            float r1 = r1 + r6
            float r4 = r4 - r1
            r12 = r8
        L_0x02ef:
            int r13 = r27 + 1
            r14 = r21
            r7 = r22
            r8 = r24
            r15 = r29
            goto L_0x01a9
        L_0x02fb:
            r22 = r7
            r24 = r8
            com.google.android.flexbox.FlexboxLayoutManager$c r1 = r0.f45904q
            int r1 = r1.f45941i
            int r3 = r2.f45935c
            int r3 = r3 + r1
            r2.f45935c = r3
            int r3 = r9.f45949g
        L_0x030a:
            int r8 = r24 + r3
            if (r5 != 0) goto L_0x031e
            boolean r1 = r0.f45898h
            if (r1 == 0) goto L_0x031e
            int r1 = r9.f45949g
            int r3 = r2.f45941i
            int r1 = r1 * r3
            int r3 = r2.f45937e
            int r3 = r3 - r1
            r2.f45937e = r3
            goto L_0x0329
        L_0x031e:
            int r1 = r9.f45949g
            int r3 = r2.f45941i
            int r1 = r1 * r3
            int r3 = r2.f45937e
            int r3 = r3 + r1
            r2.f45937e = r3
        L_0x0329:
            int r1 = r9.f45949g
            int r7 = r22 - r1
            r1 = r31
            r3 = r23
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x001e
        L_0x0335:
            r23 = r3
            r24 = r8
            int r1 = r2.f45933a
            int r1 = r1 - r24
            r2.f45933a = r1
            int r3 = r2.f45938f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x0353
            int r3 = r3 + r24
            r2.f45938f = r3
            if (r1 >= 0) goto L_0x034e
            int r3 = r3 + r1
            r2.f45938f = r3
        L_0x034e:
            r1 = r31
            r0.mo18567H(r1, r2)
        L_0x0353:
            int r1 = r2.f45933a
            int r3 = r23 - r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.mo18577w(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* renamed from: x */
    public final View mo18578x(int i) {
        int i2;
        View C = mo18562C(0, getChildCount(), i);
        if (C == null || (i2 = this.f45901n.f45963c[getPosition(C)]) == -1) {
            return null;
        }
        return mo18579y(C, this.f45900j.get(i2));
    }

    /* renamed from: y */
    public final View mo18579y(View view, C16971b bVar) {
        boolean r = mo18539r();
        int i = bVar.f45950h;
        for (int i2 = 1; i2 < i; i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (!this.f45898h || r) {
                    if (this.f45906s.mo17564e(view) <= this.f45906s.mo17564e(childAt)) {
                    }
                } else if (this.f45906s.mo17561b(view) >= this.f45906s.mo17561b(childAt)) {
                }
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: z */
    public final View mo18580z(int i) {
        View C = mo18562C(getChildCount() - 1, -1, i);
        if (C == null) {
            return null;
        }
        return mo18560A(C, this.f45900j.get(this.f45901n.f45963c[getPosition(C)]));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        mo18570K(i);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C16965a();

        /* renamed from: h */
        public float f45914h = 0.0f;

        /* renamed from: i */
        public float f45915i = 1.0f;

        /* renamed from: j */
        public int f45916j = -1;

        /* renamed from: n */
        public float f45917n = -1.0f;

        /* renamed from: o */
        public int f45918o;

        /* renamed from: p */
        public int f45919p;

        /* renamed from: q */
        public int f45920q = 16777215;

        /* renamed from: r */
        public int f45921r = 16777215;

        /* renamed from: s */
        public boolean f45922s;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        public class C16965a implements Parcelable.Creator<LayoutParams> {
            public Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public Object[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: J1 */
        public float mo18482J1() {
            return this.f45917n;
        }

        /* renamed from: M1 */
        public boolean mo18483M1() {
            return this.f45922s;
        }

        public int describeContents() {
            return 0;
        }

        public int getAlignSelf() {
            return this.f45916j;
        }

        public float getFlexGrow() {
            return this.f45914h;
        }

        public float getFlexShrink() {
            return this.f45915i;
        }

        public int getHeight() {
            return this.height;
        }

        public int getMarginBottom() {
            return this.bottomMargin;
        }

        public int getMarginLeft() {
            return this.leftMargin;
        }

        public int getMarginRight() {
            return this.rightMargin;
        }

        public int getMarginTop() {
            return this.topMargin;
        }

        public int getMaxHeight() {
            return this.f45921r;
        }

        public int getMaxWidth() {
            return this.f45920q;
        }

        public int getMinHeight() {
            return this.f45919p;
        }

        public int getMinWidth() {
            return this.f45918o;
        }

        public int getOrder() {
            return 1;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: h0 */
        public void mo18498h0(int i) {
            this.f45919p = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f45914h);
            parcel.writeFloat(this.f45915i);
            parcel.writeInt(this.f45916j);
            parcel.writeFloat(this.f45917n);
            parcel.writeInt(this.f45918o);
            parcel.writeInt(this.f45919p);
            parcel.writeInt(this.f45920q);
            parcel.writeInt(this.f45921r);
            parcel.writeByte(this.f45922s ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: y0 */
        public void mo18499y0(int i) {
            this.f45918o = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f45914h = parcel.readFloat();
            this.f45915i = parcel.readFloat();
            this.f45916j = parcel.readInt();
            this.f45917n = parcel.readFloat();
            this.f45918o = parcel.readInt();
            this.f45919p = parcel.readInt();
            this.f45920q = parcel.readInt();
            this.f45921r = parcel.readInt();
            this.f45922s = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
