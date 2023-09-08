package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C16661o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p1108f3.C107453d;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: A */
    public final SparseIntArray f44665A = new SparseIntArray();

    /* renamed from: B */
    public C0127b f44666B = new C16601a();

    /* renamed from: C */
    public final Rect f44667C = new Rect();

    /* renamed from: v */
    public boolean f44668v = false;

    /* renamed from: w */
    public int f44669w = -1;

    /* renamed from: x */
    public int[] f44670x;

    /* renamed from: y */
    public View[] f44671y;

    /* renamed from: z */
    public final SparseIntArray f44672z = new SparseIntArray();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C0127b {

        /* renamed from: a */
        public final SparseIntArray f557a = new SparseIntArray();

        /* renamed from: a */
        public int mo116a(int i, int i2) {
            int c = mo118c(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int c2 = mo118c(i5);
                i3 += c2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = c2;
                }
            }
            return i3 + c > i2 ? i4 + 1 : i4;
        }

        /* renamed from: b */
        public int mo117b(int i, int i2) {
            int c = mo118c(i);
            if (c == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int c2 = mo118c(i4);
                i3 += c2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = c2;
                }
            }
            if (c + i3 <= i2) {
                return i3;
            }
            return 0;
        }

        /* renamed from: c */
        public abstract int mo118c(int i);

        /* renamed from: d */
        public void mo119d() {
            this.f557a.clear();
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C16601a extends C0127b {
        /* renamed from: b */
        public int mo117b(int i, int i2) {
            return i % i2;
        }

        /* renamed from: c */
        public int mo118c(int i) {
            return 1;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo16940i0(RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2).f44793b);
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
            if (position >= 0 && position < i3 && mo16932f0(rVar, wVar, position) == 0) {
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

    /* JADX WARNING: Removed duplicated region for block: B:108:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0260  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16925P(androidx.recyclerview.widget.RecyclerView.C16625r r19, androidx.recyclerview.widget.RecyclerView.C16628w r20, androidx.recyclerview.widget.LinearLayoutManager.C16605c r21, androidx.recyclerview.widget.LinearLayoutManager.C16604b r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17569j()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r18.getChildCount()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.f44670x
            int r11 = r6.f44669w
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r18.mo16941j0()
        L_0x002c:
            int r11 = r2.f44706e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.f44669w
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f44705d
            int r12 = r6.mo16932f0(r0, r1, r12)
            int r13 = r2.f44705d
            int r13 = r6.mo16933g0(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.f44669w
            if (r13 >= r14) goto L_0x00a6
            int r14 = r2.f44705d
            if (r14 < 0) goto L_0x0055
            int r15 = r20.mo17354b()
            if (r14 >= r15) goto L_0x0055
            r14 = 1
            goto L_0x0056
        L_0x0055:
            r14 = 0
        L_0x0056:
            if (r14 == 0) goto L_0x00a6
            if (r12 <= 0) goto L_0x00a6
            int r14 = r2.f44705d
            int r15 = r6.mo16933g0(r0, r1, r14)
            int r4 = r6.f44669w
            if (r15 > r4) goto L_0x0078
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x0068
            goto L_0x00a6
        L_0x0068:
            android.view.View r4 = r2.mo17015b(r0)
            if (r4 != 0) goto L_0x006f
            goto L_0x00a6
        L_0x006f:
            android.view.View[] r14 = r6.f44671y
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x0078:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f44669w
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            if (r13 != 0) goto L_0x00ab
            r7.f44699b = r8
            return
        L_0x00ab:
            if (r11 == 0) goto L_0x00b3
            r14 = r13
            r12 = 0
            r15 = 0
            r16 = 1
            goto L_0x00b9
        L_0x00b3:
            int r12 = r13 + -1
            r14 = -1
            r15 = 0
            r16 = -1
        L_0x00b9:
            if (r12 == r14) goto L_0x00d8
            android.view.View[] r4 = r6.f44671y
            r4 = r4[r12]
            android.view.ViewGroup$LayoutParams r17 = r4.getLayoutParams()
            r8 = r17
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r8
            int r4 = r6.getPosition(r4)
            int r4 = r6.mo16933g0(r0, r1, r4)
            r8.f44674i = r4
            r8.f44673h = r15
            int r15 = r15 + r4
            int r12 = r12 + r16
            r8 = 1
            goto L_0x00b9
        L_0x00d8:
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x00db:
            if (r1 >= r13) goto L_0x0126
            android.view.View[] r8 = r6.f44671y
            r8 = r8[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r12 = r2.f44711j
            if (r12 != 0) goto L_0x00ef
            if (r11 == 0) goto L_0x00eb
            r6.addView(r8)
            goto L_0x00f8
        L_0x00eb:
            r6.addView(r8, r5)
            goto L_0x00f8
        L_0x00ef:
            if (r11 == 0) goto L_0x00f5
            r6.addDisappearingView(r8)
            goto L_0x00f8
        L_0x00f5:
            r6.addDisappearingView(r8, r5)
        L_0x00f8:
            android.graphics.Rect r12 = r6.f44667C
            r6.calculateItemDecorationsForChild(r8, r12)
            r6.mo16939h0(r8, r3, r5)
            androidx.recyclerview.widget.y r12 = r6.f44677f
            int r12 = r12.mo17562c(r8)
            if (r12 <= r4) goto L_0x0109
            r4 = r12
        L_0x0109:
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r12 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r12
            r14 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.y r15 = r6.f44677f
            int r8 = r15.mo17563d(r8)
            float r8 = (float) r8
            float r8 = r8 * r14
            int r12 = r12.f44674i
            float r12 = (float) r12
            float r8 = r8 / r12
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0123
            r0 = r8
        L_0x0123:
            int r1 = r1 + 1
            goto L_0x00db
        L_0x0126:
            if (r9 == 0) goto L_0x0152
            int r1 = r6.f44669w
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r10)
            r6.mo16928c0(r0)
            r0 = 0
            r4 = 0
        L_0x013a:
            if (r0 >= r13) goto L_0x0152
            android.view.View[] r1 = r6.f44671y
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r6.mo16939h0(r1, r3, r8)
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r1 = r3.mo17562c(r1)
            if (r1 <= r4) goto L_0x014f
            r4 = r1
        L_0x014f:
            int r0 = r0 + 1
            goto L_0x013a
        L_0x0152:
            r0 = 0
        L_0x0153:
            if (r0 >= r13) goto L_0x01bf
            android.view.View[] r1 = r6.f44671y
            r1 = r1[r0]
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17562c(r1)
            if (r3 == r4) goto L_0x01ba
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r3 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r3
            android.graphics.Rect r8 = r3.f44799e
            int r9 = r8.top
            int r10 = r8.bottom
            int r9 = r9 + r10
            int r10 = r3.topMargin
            int r9 = r9 + r10
            int r10 = r3.bottomMargin
            int r9 = r9 + r10
            int r10 = r8.left
            int r8 = r8.right
            int r10 = r10 + r8
            int r8 = r3.leftMargin
            int r10 = r10 + r8
            int r8 = r3.rightMargin
            int r10 = r10 + r8
            int r8 = r3.f44673h
            int r11 = r3.f44674i
            int r8 = r6.mo16930d0(r8, r11)
            int r11 = r6.f44675d
            r12 = 1
            if (r11 != r12) goto L_0x019b
            int r3 = r3.width
            r11 = 1073741824(0x40000000, float:2.0)
            int r3 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r8, r11, r10, r3, r5)
            int r8 = r4 - r9
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            goto L_0x01aa
        L_0x019b:
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = r4 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r3 = r3.height
            int r8 = androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(r8, r11, r9, r3, r5)
            r3 = r10
        L_0x01aa:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r9 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r9
            boolean r9 = r6.shouldReMeasureChild(r1, r3, r8, r9)
            if (r9 == 0) goto L_0x01bc
            r1.measure(r3, r8)
            goto L_0x01bc
        L_0x01ba:
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x01bc:
            int r0 = r0 + 1
            goto L_0x0153
        L_0x01bf:
            r7.f44698a = r4
            int r0 = r6.f44675d
            r1 = 1
            if (r0 != r1) goto L_0x01d8
            int r0 = r2.f44707f
            r1 = -1
            if (r0 != r1) goto L_0x01d0
            int r0 = r2.f44703b
            int r1 = r0 - r4
            goto L_0x01d4
        L_0x01d0:
            int r1 = r2.f44703b
            int r0 = r4 + r1
        L_0x01d4:
            r2 = r1
            r1 = 0
            r3 = 0
            goto L_0x01ea
        L_0x01d8:
            r1 = -1
            int r0 = r2.f44707f
            if (r0 != r1) goto L_0x01e2
            int r0 = r2.f44703b
            int r1 = r0 - r4
            goto L_0x01e6
        L_0x01e2:
            int r1 = r2.f44703b
            int r0 = r4 + r1
        L_0x01e6:
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
        L_0x01ea:
            r8 = 0
        L_0x01eb:
            if (r8 >= r13) goto L_0x0274
            android.view.View[] r4 = r6.f44671y
            r9 = r4[r8]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r10 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r10
            int r4 = r6.f44675d
            r5 = 1
            if (r4 != r5) goto L_0x0231
            boolean r1 = r18.mo16968O()
            if (r1 == 0) goto L_0x021a
            int r1 = r18.getPaddingLeft()
            int[] r3 = r6.f44670x
            int r4 = r6.f44669w
            int r5 = r10.f44673h
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17563d(r9)
            int r3 = r1 - r3
            goto L_0x0243
        L_0x021a:
            int r1 = r18.getPaddingLeft()
            int[] r3 = r6.f44670x
            int r4 = r10.f44673h
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.y r3 = r6.f44677f
            int r3 = r3.mo17563d(r9)
            int r3 = r3 + r1
            r11 = r0
            r15 = r1
            r14 = r2
            r12 = r3
            goto L_0x0247
        L_0x0231:
            int r0 = r18.getPaddingTop()
            int[] r2 = r6.f44670x
            int r4 = r10.f44673h
            r2 = r2[r4]
            int r2 = r2 + r0
            androidx.recyclerview.widget.y r0 = r6.f44677f
            int r0 = r0.mo17563d(r9)
            int r0 = r0 + r2
        L_0x0243:
            r11 = r0
            r12 = r1
            r14 = r2
            r15 = r3
        L_0x0247:
            r0 = r18
            r1 = r9
            r2 = r15
            r3 = r14
            r4 = r12
            r5 = r11
            r0.layoutDecoratedWithMargins(r1, r2, r3, r4, r5)
            boolean r0 = r10.mo17282d()
            if (r0 != 0) goto L_0x0260
            boolean r0 = r10.mo17281c()
            if (r0 == 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r0 = 1
            goto L_0x0263
        L_0x0260:
            r0 = 1
            r7.f44700c = r0
        L_0x0263:
            boolean r1 = r7.f44701d
            boolean r2 = r9.hasFocusable()
            r1 = r1 | r2
            r7.f44701d = r1
            int r8 = r8 + 1
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            goto L_0x01eb
        L_0x0274:
            android.view.View[] r0 = r6.f44671y
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo16925P(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: Q */
    public void mo16926Q(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, LinearLayoutManager.C16603a aVar, int i) {
        mo16941j0();
        if (wVar.mo17354b() > 0 && !wVar.f44838g) {
            boolean z = i == 1;
            int f0 = mo16932f0(rVar, wVar, aVar.f44694b);
            if (z) {
                while (f0 > 0) {
                    int i2 = aVar.f44694b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f44694b = i3;
                    f0 = mo16932f0(rVar, wVar, i3);
                }
            } else {
                int b = wVar.mo17354b() - 1;
                int i4 = aVar.f44694b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int f05 = mo16932f0(rVar, wVar, i5);
                    if (f05 <= f0) {
                        break;
                    }
                    i4 = i5;
                    f0 = f05;
                }
                aVar.f44694b = i4;
            }
        }
        View[] viewArr = this.f44671y;
        if (viewArr == null || viewArr.length != this.f44669w) {
            this.f44671y = new View[this.f44669w];
        }
    }

    /* renamed from: Y */
    public void mo16927Y(boolean z) {
        if (!z) {
            super.mo16927Y(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: c0 */
    public final void mo16928c0(int i) {
        int i2;
        int[] iArr = this.f44670x;
        int i3 = this.f44669w;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f44670x = iArr;
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d0 */
    public int mo16930d0(int i, int i2) {
        if (this.f44675d != 1 || !mo16968O()) {
            int[] iArr = this.f44670x;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f44670x;
        int i3 = this.f44669w;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: e0 */
    public final int mo16931e0(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i) {
        if (!wVar.f44838g) {
            return this.f44666B.mo116a(i, this.f44669w);
        }
        int c = rVar.mo17339c(i);
        if (c == -1) {
            return 0;
        }
        return this.f44666B.mo116a(c, this.f44669w);
    }

    /* renamed from: f0 */
    public final int mo16932f0(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i) {
        if (!wVar.f44838g) {
            return this.f44666B.mo117b(i, this.f44669w);
        }
        int i2 = this.f44665A.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int c = rVar.mo17339c(i);
        if (c == -1) {
            return 0;
        }
        return this.f44666B.mo117b(c, this.f44669w);
    }

    /* renamed from: g0 */
    public final int mo16933g0(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i) {
        if (!wVar.f44838g) {
            return this.f44666B.mo118c(i);
        }
        int i2 = this.f44672z.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int c = rVar.mo17339c(i);
        if (c == -1) {
            return 1;
        }
        return this.f44666B.mo118c(c);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.f44675d == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public int getColumnCountForAccessibility(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (this.f44675d == 1) {
            return this.f44669w;
        }
        if (wVar.mo17354b() < 1) {
            return 0;
        }
        return mo16931e0(rVar, wVar, wVar.mo17354b() - 1) + 1;
    }

    public int getRowCountForAccessibility(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (this.f44675d == 0) {
            return this.f44669w;
        }
        if (wVar.mo17354b() < 1) {
            return 0;
        }
        return mo16931e0(rVar, wVar, wVar.mo17354b() - 1) + 1;
    }

    /* renamed from: h0 */
    public final void mo16939h0(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f44799e;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int d0 = mo16930d0(layoutParams.f44673h, layoutParams.f44674i);
        if (this.f44675d == 1) {
            i2 = RecyclerView.LayoutManager.getChildMeasureSpec(d0, i, i5, layoutParams.width, false);
            i3 = RecyclerView.LayoutManager.getChildMeasureSpec(this.f44677f.mo17571l(), getHeightMode(), i4, layoutParams.height, true);
        } else {
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(d0, i, i4, layoutParams.height, false);
            int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.f44677f.mo17571l(), getWidthMode(), i5, layoutParams.width, true);
            i3 = childMeasureSpec;
            i2 = childMeasureSpec2;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i2, i3, layoutParams2) : shouldMeasureChild(view, i2, i3, layoutParams2)) {
            view.measure(i2, i3);
        }
    }

    /* renamed from: i0 */
    public void mo16940i0(int i) {
        if (i != this.f44669w) {
            this.f44668v = true;
            if (i >= 1) {
                this.f44669w = i;
                this.f44666B.mo119d();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: j0 */
    public final void mo16941j0() {
        int i;
        int i2;
        if (this.f44675d == 1) {
            i2 = getWidth() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = getHeight() - getPaddingBottom();
            i = getPaddingTop();
        }
        mo16928c0(i2 - i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C16625r r26, androidx.recyclerview.widget.RecyclerView.C16628w r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.findContainingItemView(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f44673h
            int r5 = r5.f44674i
            int r5 = r5 + r6
            android.view.View r7 = super.onFocusSearchFailed(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo17001w(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f44680i
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.getChildCount()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.getChildCount()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f44675d
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo16968O()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.mo16931e0(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.mo16931e0(r1, r2, r10)
            android.view.View r1 = r0.getChildAt(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f44673h
            r18 = r3
            int r3 = r9.f44674i
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.isViewPartiallyVisible(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f44673h
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f44673h
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, View view, C107453d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, dVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int e0 = mo16931e0(rVar, wVar, layoutParams2.mo17280b());
        if (this.f44675d == 0) {
            int i = layoutParams2.f44673h;
            int i2 = layoutParams2.f44674i;
            int i3 = this.f44669w;
            dVar.mo157853m(C107453d.C107455b.m145563a(i, i2, e0, 1, i3 > 1 && i2 == i3, false));
            return;
        }
        int i4 = layoutParams2.f44673h;
        int i5 = layoutParams2.f44674i;
        int i6 = this.f44669w;
        dVar.mo157853m(C107453d.C107455b.m145563a(e0, 1, i4, i5, i6 > 1 && i5 == i6, false));
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f44666B.mo119d();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.f44666B.mo119d();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f44666B.mo119d();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f44666B.mo119d();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f44666B.mo119d();
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (wVar.f44838g) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
                int b = layoutParams.mo17280b();
                this.f44672z.put(b, layoutParams.f44674i);
                this.f44665A.put(b, layoutParams.f44673h);
            }
        }
        super.onLayoutChildren(rVar, wVar);
        this.f44672z.clear();
        this.f44665A.clear();
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        this.f44668v = false;
    }

    /* renamed from: s */
    public void mo16951s(RecyclerView.C16628w wVar, LinearLayoutManager.C16605c cVar, RecyclerView.LayoutManager.C16609c cVar2) {
        int i = this.f44669w;
        int i2 = 0;
        while (i2 < this.f44669w) {
            int i3 = cVar.f44705d;
            if ((i3 >= 0 && i3 < wVar.mo17354b()) && i > 0) {
                int i4 = cVar.f44705d;
                ((C16661o.C16663b) cVar2).mo17525a(i4, Math.max(0, cVar.f44708g));
                i -= this.f44666B.mo118c(i4);
                cVar.f44705d += cVar.f44706e;
                i2++;
            } else {
                return;
            }
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        mo16941j0();
        View[] viewArr = this.f44671y;
        if (viewArr == null || viewArr.length != this.f44669w) {
            this.f44671y = new View[this.f44669w];
        }
        return super.scrollHorizontallyBy(i, rVar, wVar);
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        mo16941j0();
        View[] viewArr = this.f44671y;
        if (viewArr == null || viewArr.length != this.f44669w) {
            this.f44671y = new View[this.f44669w];
        }
        return super.scrollVerticallyBy(i, rVar, wVar);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f44670x == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f44675d == 1) {
            i4 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f44670x;
            i3 = RecyclerView.LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            i3 = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f44670x;
            i4 = RecyclerView.LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.f44686r == null && !this.f44668v;
    }

    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: h */
        public int f44673h = -1;

        /* renamed from: i */
        public int f44674i = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo16940i0(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo16940i0(i);
    }
}
