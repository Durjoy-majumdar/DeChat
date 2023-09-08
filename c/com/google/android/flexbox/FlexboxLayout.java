package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.C16972c;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

public class FlexboxLayout extends ViewGroup implements C16970a {

    /* renamed from: d */
    public int f45862d;

    /* renamed from: e */
    public int f45863e;

    /* renamed from: f */
    public int f45864f;

    /* renamed from: g */
    public int f45865g;

    /* renamed from: h */
    public int f45866h;

    /* renamed from: i */
    public int f45867i;

    /* renamed from: j */
    public Drawable f45868j;

    /* renamed from: n */
    public Drawable f45869n;

    /* renamed from: o */
    public int f45870o;

    /* renamed from: p */
    public int f45871p;

    /* renamed from: q */
    public int f45872q;

    /* renamed from: r */
    public int f45873r;

    /* renamed from: s */
    public int[] f45874s;

    /* renamed from: t */
    public SparseIntArray f45875t;

    /* renamed from: u */
    public C16972c f45876u;

    /* renamed from: v */
    public List<C16971b> f45877v;

    /* renamed from: w */
    public C16972c.C16973a f45878w;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public int mo18500a(View view) {
        return 0;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f45875t == null) {
            this.f45875t = new SparseIntArray(getChildCount());
        }
        C16972c cVar = this.f45876u;
        SparseIntArray sparseIntArray = this.f45875t;
        int flexItemCount = cVar.f45961a.getFlexItemCount();
        List<C16972c.C16974b> f = cVar.mo18604f(flexItemCount);
        C16972c.C16974b bVar = new C16972c.C16974b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            bVar.f45969e = 1;
        } else {
            bVar.f45969e = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            bVar.f45968d = flexItemCount;
        } else if (i < cVar.f45961a.getFlexItemCount()) {
            bVar.f45968d = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((C16972c.C16974b) ((ArrayList) f).get(i2)).f45968d++;
            }
        } else {
            bVar.f45968d = flexItemCount;
        }
        ((ArrayList) f).add(bVar);
        this.f45874s = cVar.mo18616r(flexItemCount + 1, f, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public int mo18502b(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo18539r()) {
            if (mo18532n(i, i2)) {
                i4 = 0 + this.f45873r;
            }
            if ((this.f45871p & 4) <= 0) {
                return i4;
            }
            i3 = this.f45873r;
        } else {
            if (mo18532n(i, i2)) {
                i4 = 0 + this.f45872q;
            }
            if ((this.f45870o & 4) <= 0) {
                return i4;
            }
            i3 = this.f45872q;
        }
        return i4 + i3;
    }

    /* renamed from: c */
    public final void mo18503c(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f45877v.size();
        for (int i = 0; i < size; i++) {
            C16971b bVar = this.f45877v.get(i);
            for (int i2 = 0; i2 < bVar.f45950h; i2++) {
                int i3 = bVar.f45957o + i2;
                View k = mo18529k(i3);
                if (!(k == null || k.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) k.getLayoutParams();
                    if (mo18532n(i3, i2)) {
                        mo18526h(canvas, z ? k.getRight() + layoutParams.rightMargin : (k.getLeft() - layoutParams.leftMargin) - this.f45873r, bVar.f45944b, bVar.f45949g);
                    }
                    if (i2 == bVar.f45950h - 1 && (this.f45871p & 4) > 0) {
                        mo18526h(canvas, z ? (k.getLeft() - layoutParams.leftMargin) - this.f45873r : k.getRight() + layoutParams.rightMargin, bVar.f45944b, bVar.f45949g);
                    }
                }
            }
            if (mo18533o(i)) {
                mo18507f(canvas, paddingLeft, z2 ? bVar.f45946d : bVar.f45944b - this.f45872q, max);
            }
            if (mo18537p(i) && (this.f45870o & 4) > 0) {
                mo18507f(canvas, paddingLeft, z2 ? bVar.f45944b - this.f45872q : bVar.f45946d, max);
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void mo18505d(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f45877v.size();
        for (int i = 0; i < size; i++) {
            C16971b bVar = this.f45877v.get(i);
            for (int i2 = 0; i2 < bVar.f45950h; i2++) {
                int i3 = bVar.f45957o + i2;
                View k = mo18529k(i3);
                if (!(k == null || k.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) k.getLayoutParams();
                    if (mo18532n(i3, i2)) {
                        mo18507f(canvas, bVar.f45943a, z2 ? k.getBottom() + layoutParams.bottomMargin : (k.getTop() - layoutParams.topMargin) - this.f45872q, bVar.f45949g);
                    }
                    if (i2 == bVar.f45950h - 1 && (this.f45870o & 4) > 0) {
                        mo18507f(canvas, bVar.f45943a, z2 ? (k.getTop() - layoutParams.topMargin) - this.f45872q : k.getBottom() + layoutParams.bottomMargin, bVar.f45949g);
                    }
                }
            }
            if (mo18533o(i)) {
                mo18526h(canvas, z ? bVar.f45945c : bVar.f45943a - this.f45873r, paddingTop, max);
            }
            if (mo18537p(i) && (this.f45871p & 4) > 0) {
                mo18526h(canvas, z ? bVar.f45943a - this.f45873r : bVar.f45945c, paddingTop, max);
            }
        }
    }

    /* renamed from: e */
    public void mo18506e(C16971b bVar) {
        if (mo18539r()) {
            if ((this.f45871p & 4) > 0) {
                int i = bVar.f45947e;
                int i2 = this.f45873r;
                bVar.f45947e = i + i2;
                bVar.f45948f += i2;
            }
        } else if ((this.f45870o & 4) > 0) {
            int i3 = bVar.f45947e;
            int i4 = this.f45872q;
            bVar.f45947e = i3 + i4;
            bVar.f45948f += i4;
        }
    }

    /* renamed from: f */
    public final void mo18507f(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f45868j;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f45872q + i2);
            this.f45868j.draw(canvas);
        }
    }

    /* renamed from: g */
    public void mo18508g(View view, int i, int i2, C16971b bVar) {
        if (!mo18532n(i, i2)) {
            return;
        }
        if (mo18539r()) {
            int i3 = bVar.f45947e;
            int i4 = this.f45873r;
            bVar.f45947e = i3 + i4;
            bVar.f45948f += i4;
            return;
        }
        int i5 = bVar.f45947e;
        int i6 = this.f45872q;
        bVar.f45947e = i5 + i6;
        bVar.f45948f += i6;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getAlignContent() {
        return this.f45866h;
    }

    public int getAlignItems() {
        return this.f45865g;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f45868j;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f45869n;
    }

    public int getFlexDirection() {
        return this.f45862d;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C16971b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f45877v.size());
        for (C16971b next : this.f45877v) {
            if (next.f45950h - next.f45951i != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<C16971b> getFlexLinesInternal() {
        return this.f45877v;
    }

    public int getFlexWrap() {
        return this.f45863e;
    }

    public int getJustifyContent() {
        return this.f45864f;
    }

    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C16971b bVar : this.f45877v) {
            i = Math.max(i, bVar.f45947e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f45867i;
    }

    public int getShowDividerHorizontal() {
        return this.f45870o;
    }

    public int getShowDividerVertical() {
        return this.f45871p;
    }

    public int getSumOfCrossSize() {
        int size = this.f45877v.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C16971b bVar = this.f45877v.get(i2);
            if (mo18533o(i2)) {
                i += mo18539r() ? this.f45872q : this.f45873r;
            }
            if (mo18537p(i2)) {
                i += mo18539r() ? this.f45872q : this.f45873r;
            }
            i += bVar.f45949g;
        }
        return i;
    }

    /* renamed from: h */
    public final void mo18526h(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f45869n;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f45873r + i, i3 + i2);
            this.f45869n.draw(canvas);
        }
    }

    /* renamed from: i */
    public View mo18527i(int i) {
        return getChildAt(i);
    }

    /* renamed from: j */
    public int mo18528j(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: k */
    public View mo18529k(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f45874s;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* renamed from: l */
    public View mo18530l(int i) {
        return mo18529k(i);
    }

    /* renamed from: m */
    public int mo18531m(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: n */
    public final boolean mo18532n(int i, int i2) {
        boolean z;
        int i3 = 1;
        while (true) {
            if (i3 > i2) {
                z = true;
                break;
            }
            View k = mo18529k(i - i3);
            if (k != null && k.getVisibility() != 8) {
                z = false;
                break;
            }
            i3++;
        }
        return z ? mo18539r() ? (this.f45871p & 1) != 0 : (this.f45870o & 1) != 0 : mo18539r() ? (this.f45871p & 2) != 0 : (this.f45870o & 2) != 0;
    }

    /* renamed from: o */
    public final boolean mo18533o(int i) {
        boolean z;
        if (i < 0 || i >= this.f45877v.size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            C16971b bVar = this.f45877v.get(i2);
            if (bVar.f45950h - bVar.f45951i > 0) {
                z = false;
                break;
            }
            i2++;
        }
        return z ? mo18539r() ? (this.f45870o & 1) != 0 : (this.f45871p & 1) != 0 : mo18539r() ? (this.f45870o & 2) != 0 : (this.f45871p & 2) != 0;
    }

    public void onDraw(Canvas canvas) {
        if (this.f45869n != null || this.f45868j != null) {
            if (this.f45870o != 0 || this.f45871p != 0) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                int d = C107207u.C107209c.m145195d(this);
                int i = this.f45862d;
                boolean z = false;
                boolean z2 = true;
                if (i == 0) {
                    boolean z3 = d == 1;
                    if (this.f45863e == 2) {
                        z = true;
                    }
                    mo18503c(canvas, z3, z);
                } else if (i == 1) {
                    boolean z4 = d != 1;
                    if (this.f45863e == 2) {
                        z = true;
                    }
                    mo18503c(canvas, z4, z);
                } else if (i == 2) {
                    if (d != 1) {
                        z2 = false;
                    }
                    if (this.f45863e == 2) {
                        z2 = !z2;
                    }
                    mo18505d(canvas, z2, false);
                } else if (i == 3) {
                    if (d == 1) {
                        z = true;
                    }
                    if (this.f45863e == 2) {
                        z = !z;
                    }
                    mo18505d(canvas, z, true);
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        int d = C107207u.C107209c.m145195d(this);
        int i5 = this.f45862d;
        boolean z2 = false;
        if (i5 == 0) {
            mo18540s(d == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            mo18540s(d != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            if (d == 1) {
                z2 = true;
            }
            mo18554t(this.f45863e == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            if (d == 1) {
                z2 = true;
            }
            mo18554t(this.f45863e == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f45862d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r9 = r15
            r10 = r16
            android.util.SparseIntArray r1 = r0.f45875t
            if (r1 != 0) goto L_0x0013
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            int r2 = r14.getChildCount()
            r1.<init>(r2)
            r0.f45875t = r1
        L_0x0013:
            com.google.android.flexbox.c r1 = r0.f45876u
            android.util.SparseIntArray r2 = r0.f45875t
            com.google.android.flexbox.a r3 = r1.f45961a
            int r3 = r3.getFlexItemCount()
            int r4 = r2.size()
            r5 = 1
            r11 = 0
            if (r4 == r3) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            r4 = 0
        L_0x0027:
            if (r4 >= r3) goto L_0x0047
            com.google.android.flexbox.a r6 = r1.f45961a
            android.view.View r6 = r6.mo18527i(r4)
            if (r6 != 0) goto L_0x0032
            goto L_0x0044
        L_0x0032:
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.flexbox.FlexItem r6 = (com.google.android.flexbox.FlexItem) r6
            int r6 = r6.getOrder()
            int r7 = r2.get(r4)
            if (r6 == r7) goto L_0x0044
        L_0x0042:
            r1 = 1
            goto L_0x0048
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 == 0) goto L_0x005e
            com.google.android.flexbox.c r1 = r0.f45876u
            android.util.SparseIntArray r2 = r0.f45875t
            com.google.android.flexbox.a r3 = r1.f45961a
            int r3 = r3.getFlexItemCount()
            java.util.List r4 = r1.mo18604f(r3)
            int[] r1 = r1.mo18616r(r3, r4, r2)
            r0.f45874s = r1
        L_0x005e:
            int r1 = r0.f45862d
            r12 = 3
            r13 = 2
            r2 = 0
            if (r1 == 0) goto L_0x00c8
            if (r1 == r5) goto L_0x00c8
            if (r1 == r13) goto L_0x0085
            if (r1 != r12) goto L_0x006c
            goto L_0x0085
        L_0x006c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid value for the flex direction is set: "
            r2.append(r3)
            int r3 = r0.f45862d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0085:
            java.util.List<com.google.android.flexbox.b> r1 = r0.f45877v
            r1.clear()
            com.google.android.flexbox.c$a r3 = r0.f45878w
            r3.f45966a = r2
            r3.f45967b = r11
            com.google.android.flexbox.c r1 = r0.f45876u
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r2 = r3
            r3 = r16
            r4 = r15
            r1.mo18600b(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.flexbox.c$a r1 = r0.f45878w
            java.util.List<com.google.android.flexbox.b> r1 = r1.f45966a
            r0.f45877v = r1
            com.google.android.flexbox.c r1 = r0.f45876u
            r1.mo18606h(r15, r10, r11)
            com.google.android.flexbox.c r1 = r0.f45876u
            int r2 = r14.getPaddingLeft()
            int r3 = r14.getPaddingRight()
            int r2 = r2 + r3
            r1.mo18605g(r15, r10, r2)
            com.google.android.flexbox.c r1 = r0.f45876u
            r1.mo18619u(r11)
            int r1 = r0.f45862d
            com.google.android.flexbox.c$a r2 = r0.f45878w
            int r2 = r2.f45967b
            r14.mo18555v(r1, r15, r10, r2)
            goto L_0x0180
        L_0x00c8:
            java.util.List<com.google.android.flexbox.b> r1 = r0.f45877v
            r1.clear()
            com.google.android.flexbox.c$a r3 = r0.f45878w
            r3.f45966a = r2
            r3.f45967b = r11
            com.google.android.flexbox.c r1 = r0.f45876u
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r2 = r3
            r3 = r15
            r4 = r16
            r1.mo18600b(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.flexbox.c$a r1 = r0.f45878w
            java.util.List<com.google.android.flexbox.b> r1 = r1.f45966a
            r0.f45877v = r1
            com.google.android.flexbox.c r1 = r0.f45876u
            r1.mo18606h(r15, r10, r11)
            int r1 = r0.f45865g
            if (r1 != r12) goto L_0x0164
            java.util.List<com.google.android.flexbox.b> r1 = r0.f45877v
            java.util.Iterator r1 = r1.iterator()
        L_0x00f7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0164
            java.lang.Object r2 = r1.next()
            com.google.android.flexbox.b r2 = (com.google.android.flexbox.C16971b) r2
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
        L_0x0106:
            int r5 = r2.f45950h
            if (r4 >= r5) goto L_0x0161
            int r5 = r2.f45957o
            int r5 = r5 + r4
            android.view.View r5 = r14.mo18529k(r5)
            if (r5 == 0) goto L_0x015e
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 != r7) goto L_0x011c
            goto L_0x015e
        L_0x011c:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            com.google.android.flexbox.FlexboxLayout$LayoutParams r6 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r6
            int r7 = r0.f45863e
            if (r7 == r13) goto L_0x0140
            int r7 = r2.f45954l
            int r8 = r5.getBaseline()
            int r7 = r7 - r8
            int r8 = r6.topMargin
            int r7 = java.lang.Math.max(r7, r8)
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x015e
        L_0x0140:
            int r7 = r2.f45954l
            int r8 = r5.getMeasuredHeight()
            int r7 = r7 - r8
            int r8 = r5.getBaseline()
            int r7 = r7 + r8
            int r8 = r6.bottomMargin
            int r7 = java.lang.Math.max(r7, r8)
            int r5 = r5.getMeasuredHeight()
            int r6 = r6.topMargin
            int r5 = r5 + r6
            int r5 = r5 + r7
            int r3 = java.lang.Math.max(r3, r5)
        L_0x015e:
            int r4 = r4 + 1
            goto L_0x0106
        L_0x0161:
            r2.f45949g = r3
            goto L_0x00f7
        L_0x0164:
            com.google.android.flexbox.c r1 = r0.f45876u
            int r2 = r14.getPaddingTop()
            int r3 = r14.getPaddingBottom()
            int r2 = r2 + r3
            r1.mo18605g(r15, r10, r2)
            com.google.android.flexbox.c r1 = r0.f45876u
            r1.mo18619u(r11)
            int r1 = r0.f45862d
            com.google.android.flexbox.c$a r2 = r0.f45878w
            int r2 = r2.f45967b
            r14.mo18555v(r1, r15, r10, r2)
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public final boolean mo18537p(int i) {
        if (i < 0 || i >= this.f45877v.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f45877v.size(); i2++) {
            C16971b bVar = this.f45877v.get(i2);
            if (bVar.f45950h - bVar.f45951i > 0) {
                return false;
            }
        }
        return mo18539r() ? (this.f45870o & 4) != 0 : (this.f45871p & 4) != 0;
    }

    /* renamed from: q */
    public void mo18538q(int i, View view) {
    }

    /* renamed from: r */
    public boolean mo18539r() {
        int i = this.f45862d;
        return i == 0 || i == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f6  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18540s(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<com.google.android.flexbox.b> r6 = r0.f45877v
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x0223
            java.util.List<com.google.android.flexbox.b> r9 = r0.f45877v
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C16971b) r9
            boolean r10 = r0.mo18533o(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f45872q
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.f45864f
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00ca
            if (r10 == r13) goto L_0x00c0
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00ae
            r7 = 3
            if (r10 == r7) goto L_0x0095
            if (r10 == r15) goto L_0x007b
            r7 = 5
            if (r10 != r7) goto L_0x0062
            int r7 = r9.f45950h
            int r10 = r9.f45951i
            int r7 = r7 - r10
            if (r7 == 0) goto L_0x0059
            int r10 = r9.f45947e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cf
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f45864f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007b:
            int r7 = r9.f45950h
            int r10 = r9.f45951i
            int r7 = r7 - r10
            if (r7 == 0) goto L_0x008a
            int r10 = r9.f45947e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00cf
        L_0x0095:
            float r7 = (float) r1
            int r10 = r9.f45950h
            int r12 = r9.f45951i
            int r10 = r10 - r12
            if (r10 == r13) goto L_0x00a1
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a3
        L_0x00a1:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a3:
            int r12 = r9.f45947e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00cf
        L_0x00ae:
            float r7 = (float) r1
            int r10 = r9.f45947e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
            goto L_0x00ce
        L_0x00c0:
            int r7 = r9.f45947e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
            r7 = r10
            goto L_0x00ce
        L_0x00ca:
            float r7 = (float) r1
            int r10 = r4 - r2
            float r12 = (float) r10
        L_0x00ce:
            r10 = 0
        L_0x00cf:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00d4:
            int r10 = r9.f45950h
            if (r14 >= r10) goto L_0x0217
            int r10 = r9.f45957o
            int r10 = r10 + r14
            android.view.View r18 = r0.mo18529k(r10)
            if (r18 == 0) goto L_0x0205
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 != r15) goto L_0x00eb
            goto L_0x0205
        L_0x00eb:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.mo18532n(r10, r14)
            if (r10 == 0) goto L_0x010a
            int r10 = r0.f45873r
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x010e
        L_0x010a:
            r19 = r12
            r20 = 0
        L_0x010e:
            int r10 = r9.f45950h
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x0120
            int r10 = r0.f45871p
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0122
            int r10 = r0.f45873r
            r21 = r10
            goto L_0x0124
        L_0x0120:
            r16 = 4
        L_0x0122:
            r21 = 0
        L_0x0124:
            int r10 = r0.f45863e
            r12 = 2
            if (r10 != r12) goto L_0x0186
            if (r29 == 0) goto L_0x015c
            com.google.android.flexbox.c r10 = r0.f45876u
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r18.getMeasuredHeight()
            int r23 = r3 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r18
            r25 = 2
            r12 = r9
            r26 = 1
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = 4
            r15 = r24
            r16 = r3
            r10.mo18613o(r11, r12, r13, r14, r15, r16)
            goto L_0x01ce
        L_0x015c:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            com.google.android.flexbox.c r10 = r0.f45876u
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r3 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r3
            r10.mo18613o(r11, r12, r13, r14, r15, r16)
            goto L_0x01ce
        L_0x0186:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            if (r29 == 0) goto L_0x01b1
            com.google.android.flexbox.c r10 = r0.f45876u
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo18613o(r11, r12, r13, r14, r15, r16)
            goto L_0x01ce
        L_0x01b1:
            com.google.android.flexbox.c r10 = r0.f45876u
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
            r10.mo18613o(r11, r12, r13, r14, r15, r16)
        L_0x01ce:
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            if (r29 == 0) goto L_0x01f6
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r21
            r14 = r20
            r10.mo18598a(r11, r12, r13, r14, r15)
            goto L_0x0202
        L_0x01f6:
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            r12 = r20
            r14 = r21
            r10.mo18598a(r11, r12, r13, r14, r15)
        L_0x0202:
            r12 = r19
            goto L_0x020f
        L_0x0205:
            r23 = r1
            r22 = r14
            r25 = 2
            r26 = 1
            r27 = 4
        L_0x020f:
            int r14 = r22 + 1
            r1 = r23
            r13 = 1
            r15 = 4
            goto L_0x00d4
        L_0x0217:
            r23 = r1
            int r1 = r9.f45949g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r23
            goto L_0x001e
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo18540s(boolean, int, int, int, int):void");
    }

    public void setAlignContent(int i) {
        if (this.f45866h != i) {
            this.f45866h = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f45865g != i) {
            this.f45865g = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f45868j) {
            this.f45868j = drawable;
            if (drawable != null) {
                this.f45872q = drawable.getIntrinsicHeight();
            } else {
                this.f45872q = 0;
            }
            if (this.f45868j == null && this.f45869n == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f45869n) {
            this.f45869n = drawable;
            if (drawable != null) {
                this.f45873r = drawable.getIntrinsicWidth();
            } else {
                this.f45873r = 0;
            }
            if (this.f45868j == null && this.f45869n == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f45862d != i) {
            this.f45862d = i;
            requestLayout();
        }
    }

    public void setFlexLines(List<C16971b> list) {
        this.f45877v = list;
    }

    public void setFlexWrap(int i) {
        if (this.f45863e != i) {
            this.f45863e = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f45864f != i) {
            this.f45864f = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f45867i != i) {
            this.f45867i = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f45870o) {
            this.f45870o = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f45871p) {
            this.f45871p = i;
            requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f1  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18554t(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.b> r3 = r0.f45877v
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x0216
            java.util.List<com.google.android.flexbox.b> r9 = r0.f45877v
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.b r9 = (com.google.android.flexbox.C16971b) r9
            boolean r10 = r0.mo18533o(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.f45873r
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.f45864f
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c7
            if (r10 == r14) goto L_0x00bf
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00ac
            r12 = 3
            if (r10 == r12) goto L_0x0094
            if (r10 == r15) goto L_0x007a
            r12 = 5
            if (r10 != r12) goto L_0x0061
            int r10 = r9.f45950h
            int r12 = r9.f45951i
            int r10 = r10 - r12
            if (r10 == 0) goto L_0x0059
            int r12 = r9.f45947e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x005a
        L_0x0059:
            r12 = 0
        L_0x005a:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00cc
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.f45864f
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007a:
            int r10 = r9.f45950h
            int r12 = r9.f45951i
            int r10 = r10 - r12
            if (r10 == 0) goto L_0x0089
            int r12 = r9.f45947e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x008a
        L_0x0089:
            r12 = 0
        L_0x008a:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00cc
        L_0x0094:
            float r10 = (float) r1
            int r7 = r9.f45950h
            int r12 = r9.f45951i
            int r7 = r7 - r12
            if (r7 == r14) goto L_0x00a0
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x00a2
        L_0x00a0:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x00a2:
            int r12 = r9.f45947e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00cc
        L_0x00ac:
            float r7 = (float) r1
            int r10 = r9.f45947e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r13
            float r7 = r7 + r12
            int r12 = r6 - r2
            float r12 = (float) r12
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r12 - r10
            r10 = r7
            goto L_0x00cb
        L_0x00bf:
            int r7 = r9.f45947e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            goto L_0x00ca
        L_0x00c7:
            float r10 = (float) r1
            int r7 = r6 - r2
        L_0x00ca:
            float r13 = (float) r7
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00d1:
            int r11 = r9.f45950h
            if (r12 >= r11) goto L_0x020e
            int r11 = r9.f45957o
            int r11 = r11 + r12
            android.view.View r18 = r0.mo18529k(r11)
            if (r18 == 0) goto L_0x0202
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 != r14) goto L_0x00e8
            goto L_0x0202
        L_0x00e8:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.mo18532n(r11, r12)
            if (r11 == 0) goto L_0x0109
            int r11 = r0.f45872q
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x010f
        L_0x0109:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x010f:
            int r10 = r9.f45950h
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x0122
            int r10 = r0.f45870o
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0124
            int r10 = r0.f45872q
            r22 = r10
            goto L_0x0126
        L_0x0122:
            r16 = 4
        L_0x0124:
            r22 = 0
        L_0x0126:
            if (r30 == 0) goto L_0x0181
            if (r31 == 0) goto L_0x0159
            com.google.android.flexbox.c r10 = r0.f45876u
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r17 = r5 - r11
            int r11 = java.lang.Math.round(r20)
            int r23 = r18.getMeasuredHeight()
            int r23 = r11 - r23
            int r24 = java.lang.Math.round(r20)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = 1
            r14 = r17
            r27 = r15
            r28 = 4
            r15 = r23
            r16 = r5
            r17 = r24
            r10.mo18614p(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c8
        L_0x0159:
            r25 = r12
            r27 = r15
            r26 = 1
            r28 = 4
            com.google.android.flexbox.c r10 = r0.f45876u
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r5 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r5
            r10.mo18614p(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c8
        L_0x0181:
            r25 = r12
            r27 = r15
            r26 = 1
            r28 = 4
            if (r31 == 0) goto L_0x01aa
            com.google.android.flexbox.c r10 = r0.f45876u
            r13 = 0
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r20)
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo18614p(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01c8
        L_0x01aa:
            com.google.android.flexbox.c r10 = r0.f45876u
            r13 = 0
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r14 = r4
            r10.mo18614p(r11, r12, r13, r14, r15, r16, r17)
        L_0x01c8:
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r27
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            if (r31 == 0) goto L_0x01f1
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r22
            r15 = r21
            r10.mo18598a(r11, r12, r13, r14, r15)
            goto L_0x01fd
        L_0x01f1:
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            r13 = r21
            r15 = r22
            r10.mo18598a(r11, r12, r13, r14, r15)
        L_0x01fd:
            r10 = r19
            r13 = r20
            goto L_0x0208
        L_0x0202:
            r25 = r12
            r26 = 1
            r28 = 4
        L_0x0208:
            int r12 = r25 + 1
            r14 = 1
            r15 = 4
            goto L_0x00d1
        L_0x020e:
            int r7 = r9.f45949g
            int r4 = r4 + r7
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo18554t(boolean, boolean, int, int, int, int):void");
    }

    /* renamed from: v */
    public final void mo18555v(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, TPMediaCodecProfileLevel.HEVCMainTierLevel62);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(i7, i8);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45867i = -1;
        this.f45876u = new C16972c(this);
        this.f45877v = new ArrayList();
        this.f45878w = new C16972c.C16973a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16975d.f45970a, i, 0);
        this.f45862d = obtainStyledAttributes.getInt(5, 0);
        this.f45863e = obtainStyledAttributes.getInt(6, 0);
        this.f45864f = obtainStyledAttributes.getInt(7, 0);
        this.f45865g = obtainStyledAttributes.getInt(1, 0);
        this.f45866h = obtainStyledAttributes.getInt(0, 0);
        this.f45867i = obtainStyledAttributes.getInt(8, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.f45871p = i2;
            this.f45870o = i2;
        }
        int i3 = obtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.f45871p = i3;
        }
        int i4 = obtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.f45870o = i4;
        }
        obtainStyledAttributes.recycle();
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

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C16964a();

        /* renamed from: d */
        public int f45879d = 1;

        /* renamed from: e */
        public float f45880e = 0.0f;

        /* renamed from: f */
        public float f45881f = 1.0f;

        /* renamed from: g */
        public int f45882g = -1;

        /* renamed from: h */
        public float f45883h = -1.0f;

        /* renamed from: i */
        public int f45884i = -1;

        /* renamed from: j */
        public int f45885j = -1;

        /* renamed from: n */
        public int f45886n = 16777215;

        /* renamed from: o */
        public int f45887o = 16777215;

        /* renamed from: p */
        public boolean f45888p;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        public class C16964a implements Parcelable.Creator<LayoutParams> {
            public Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public Object[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16975d.f45971b);
            this.f45879d = obtainStyledAttributes.getInt(8, 1);
            this.f45880e = obtainStyledAttributes.getFloat(2, 0.0f);
            this.f45881f = obtainStyledAttributes.getFloat(3, 1.0f);
            this.f45882g = obtainStyledAttributes.getInt(0, -1);
            this.f45883h = obtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f45884i = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            this.f45885j = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            this.f45886n = obtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.f45887o = obtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.f45888p = obtainStyledAttributes.getBoolean(9, false);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: J1 */
        public float mo18482J1() {
            return this.f45883h;
        }

        /* renamed from: M1 */
        public boolean mo18483M1() {
            return this.f45888p;
        }

        public int describeContents() {
            return 0;
        }

        public int getAlignSelf() {
            return this.f45882g;
        }

        public float getFlexGrow() {
            return this.f45880e;
        }

        public float getFlexShrink() {
            return this.f45881f;
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
            return this.f45887o;
        }

        public int getMaxWidth() {
            return this.f45886n;
        }

        public int getMinHeight() {
            return this.f45885j;
        }

        public int getMinWidth() {
            return this.f45884i;
        }

        public int getOrder() {
            return this.f45879d;
        }

        public int getWidth() {
            return this.width;
        }

        /* renamed from: h0 */
        public void mo18498h0(int i) {
            this.f45885j = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f45879d);
            parcel.writeFloat(this.f45880e);
            parcel.writeFloat(this.f45881f);
            parcel.writeInt(this.f45882g);
            parcel.writeFloat(this.f45883h);
            parcel.writeInt(this.f45884i);
            parcel.writeInt(this.f45885j);
            parcel.writeInt(this.f45886n);
            parcel.writeInt(this.f45887o);
            parcel.writeByte(this.f45888p ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        /* renamed from: y0 */
        public void mo18499y0(int i) {
            this.f45884i = i;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f45879d = layoutParams.f45879d;
            this.f45880e = layoutParams.f45880e;
            this.f45881f = layoutParams.f45881f;
            this.f45882g = layoutParams.f45882g;
            this.f45883h = layoutParams.f45883h;
            this.f45884i = layoutParams.f45884i;
            this.f45885j = layoutParams.f45885j;
            this.f45886n = layoutParams.f45886n;
            this.f45887o = layoutParams.f45887o;
            this.f45888p = layoutParams.f45888p;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f45879d = parcel.readInt();
            this.f45880e = parcel.readFloat();
            this.f45881f = parcel.readFloat();
            this.f45882g = parcel.readInt();
            this.f45883h = parcel.readFloat();
            this.f45884i = parcel.readInt();
            this.f45885j = parcel.readInt();
            this.f45886n = parcel.readInt();
            this.f45887o = parcel.readInt();
            this.f45888p = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
