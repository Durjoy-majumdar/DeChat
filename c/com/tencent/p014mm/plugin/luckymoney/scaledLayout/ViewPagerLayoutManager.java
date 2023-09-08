package com.tencent.p014mm.plugin.luckymoney.scaledLayout;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager */
public abstract class ViewPagerLayoutManager extends LinearLayoutManager {

    /* renamed from: A */
    public int f53123A;

    /* renamed from: B */
    public float f53124B;

    /* renamed from: C */
    public C18928d f53125C;

    /* renamed from: D */
    public boolean f53126D = false;

    /* renamed from: E */
    public boolean f53127E = false;

    /* renamed from: F */
    public boolean f53128F = true;

    /* renamed from: G */
    public int f53129G = -1;

    /* renamed from: H */
    public SavedState f53130H = null;

    /* renamed from: I */
    public float f53131I;

    /* renamed from: J */
    public int f53132J;

    /* renamed from: K */
    public int f53133K;

    /* renamed from: L */
    public int f53134L = -1;

    /* renamed from: M */
    public int f53135M = Integer.MAX_VALUE;

    /* renamed from: N */
    public View f53136N;

    /* renamed from: v */
    public SparseArray<View> f53137v = new SparseArray<>();

    /* renamed from: w */
    public int f53138w;

    /* renamed from: x */
    public int f53139x;

    /* renamed from: y */
    public int f53140y;

    /* renamed from: z */
    public int f53141z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C18925a();

        /* renamed from: d */
        public int f53142d;

        /* renamed from: e */
        public float f53143e;

        /* renamed from: f */
        public boolean f53144f;

        /* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager$SavedState$a */
        public class C18925a implements Parcelable.Creator<SavedState> {
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
            parcel.writeInt(this.f53142d);
            parcel.writeFloat(this.f53143e);
            parcel.writeInt(this.f53144f ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.f53142d = parcel.readInt();
            this.f53143e = parcel.readFloat();
            this.f53144f = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.f53142d = savedState.f53142d;
            this.f53143e = savedState.f53143e;
            this.f53144f = savedState.f53144f;
        }
    }

    public ViewPagerLayoutManager(Context context, int i, boolean z) {
        super(context);
        mo16974W(i);
        mo16975X(z);
        setAutoMeasureEnabled(true);
        setItemPrefetchEnabled(false);
    }

    /* renamed from: U */
    private int m19876U(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo17002x();
        float f = (float) i;
        float f0 = f / mo23962f0();
        if (Math.abs(f0) < 1.0E-8f) {
            return 0;
        }
        float f2 = this.f53124B + f0;
        float f3 = 0.0f;
        if (f2 < (!this.f53127E ? 0.0f : ((float) (-(getItemCount() - 1))) * this.f53131I)) {
            if (this.f53127E) {
                f3 = ((float) (-(getItemCount() - 1))) * this.f53131I;
            }
            i = (int) (f - ((f2 - f3) * mo23962f0()));
        } else {
            if (f2 > (!this.f53127E ? ((float) (getItemCount() - 1)) * this.f53131I : 0.0f)) {
                if (!this.f53127E) {
                    f3 = ((float) (getItemCount() - 1)) * this.f53131I;
                }
                i = (int) ((f3 - this.f53124B) * mo23962f0());
            }
        }
        this.f53124B += ((float) i) / mo23962f0();
        mo23965i0(rVar);
        return i;
    }

    /* renamed from: N */
    public int mo16967N() {
        return this.f53140y;
    }

    /* renamed from: W */
    public void mo16974W(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.f53140y) {
                this.f53140y = i;
                this.f53125C = null;
                this.f53135M = Integer.MAX_VALUE;
                removeAllViews();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: X */
    public void mo16975X(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (z != this.f53126D) {
            this.f53126D = z;
            removeAllViews();
        }
    }

    /* renamed from: c0 */
    public final int mo23959c0() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f53128F) {
            return !this.f53127E ? mo23960d0() : (getItemCount() - mo23960d0()) - 1;
        }
        boolean z = this.f53127E;
        float f = z ? this.f53124B : this.f53124B;
        return !z ? (int) f : (int) ((((float) (getItemCount() - 1)) * this.f53131I) + f);
    }

    public boolean canScrollHorizontally() {
        return this.f53140y == 0;
    }

    public boolean canScrollVertically() {
        return this.f53140y == 1;
    }

    public int computeHorizontalScrollExtent(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f53128F) {
            return 1;
        }
        return (int) this.f53131I;
    }

    public int computeHorizontalScrollOffset(RecyclerView.C16628w wVar) {
        return mo23959c0();
    }

    public int computeHorizontalScrollRange(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f53128F ? getItemCount() : (int) (((float) getItemCount()) * this.f53131I);
    }

    public int computeVerticalScrollExtent(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.f53128F) {
            return 1;
        }
        return (int) this.f53131I;
    }

    public int computeVerticalScrollOffset(RecyclerView.C16628w wVar) {
        return mo23959c0();
    }

    public int computeVerticalScrollRange(RecyclerView.C16628w wVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.f53128F ? getItemCount() : (int) (((float) getItemCount()) * this.f53131I);
    }

    /* renamed from: d0 */
    public int mo23960d0() {
        if (getItemCount() == 0) {
            return 0;
        }
        return Math.abs(mo23961e0());
    }

    /* renamed from: e0 */
    public int mo23961e0() {
        float f = this.f53131I;
        if (f == 0.0f) {
            return 0;
        }
        return Math.round(this.f53124B / f);
    }

    /* renamed from: f0 */
    public float mo23962f0() {
        return 1.0f;
    }

    public View findViewByPosition(int i) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        for (int i2 = 0; i2 < this.f53137v.size(); i2++) {
            int keyAt = this.f53137v.keyAt(i2);
            if (keyAt < 0) {
                int i3 = keyAt % itemCount;
                if (i3 == 0) {
                    i3 = -itemCount;
                }
                if (i3 + itemCount == i) {
                    return this.f53137v.valueAt(i2);
                }
            } else if (i == keyAt % itemCount) {
                return this.f53137v.valueAt(i2);
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public final View mo23963g0(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i) {
        if (i >= wVar.mo17354b() || i < 0) {
            return null;
        }
        try {
            return rVar.mo17341e(i);
        } catch (Exception unused) {
            return mo23963g0(rVar, wVar, i + 1);
        }
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: h0 */
    public int mo23964h0(int i) {
        return (int) (((((float) i) * (!this.f53127E ? this.f53131I : -this.f53131I)) - this.f53124B) * mo23962f0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0187  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23965i0(androidx.recyclerview.widget.RecyclerView.C16625r r26) {
        /*
            r25 = this;
            r6 = r25
            r25.detachAndScrapAttachedViews(r26)
            android.util.SparseArray<android.view.View> r0 = r6.f53137v
            r0.clear()
            int r7 = r25.getItemCount()
            if (r7 != 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r6.f53127E
            if (r0 == 0) goto L_0x001b
            int r0 = r25.mo23961e0()
            int r0 = -r0
            goto L_0x001f
        L_0x001b:
            int r0 = r25.mo23961e0()
        L_0x001f:
            r8 = r0
            int r0 = r6.f53132J
            int r0 = r8 - r0
            int r1 = r6.f53133K
            int r1 = r1 + r8
            int r2 = r6.f53134L
            r9 = -1
            r10 = 1
            r11 = 0
            if (r2 == r9) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x004f
            int r0 = r2 % 2
            if (r0 != 0) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0042
            int r0 = r2 / 2
            int r1 = r8 - r0
            int r1 = r1 + r10
            goto L_0x0048
        L_0x0042:
            int r0 = r2 + -1
            int r0 = r0 / 2
            int r1 = r8 - r0
        L_0x0048:
            int r0 = r0 + r8
            int r0 = r0 + r10
            r24 = r1
            r1 = r0
            r0 = r24
        L_0x004f:
            if (r0 >= 0) goto L_0x005c
            if (r2 == r9) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            r1 = r2
            r0 = 0
        L_0x005c:
            if (r1 <= r7) goto L_0x0060
            r12 = r7
            goto L_0x0061
        L_0x0060:
            r12 = r1
        L_0x0061:
            r1 = 1
            r13 = r0
            r14 = 1
        L_0x0064:
            if (r13 >= r12) goto L_0x0194
            int r0 = r6.f53134L
            if (r0 == r9) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r6.f53127E
            float r1 = (float) r13
            if (r0 == 0) goto L_0x0078
            float r0 = r6.f53131I
            float r0 = -r0
            goto L_0x007a
        L_0x0078:
            float r0 = r6.f53131I
        L_0x007a:
            float r1 = r1 * r0
            float r0 = r6.f53124B
            float r1 = r1 - r0
            com.tencent.mm.plugin.luckymoney.scaledLayout.d r0 = r6.f53125C
            int r0 = r0.mo23976d()
            int r2 = r6.f53141z
            int r0 = r0 - r2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00a2
            int r0 = r6.f53138w
            int r0 = -r0
            com.tencent.mm.plugin.luckymoney.scaledLayout.d r2 = r6.f53125C
            int r2 = r2.mo23975c()
            int r0 = r0 - r2
            int r2 = r6.f53141z
            int r0 = r0 - r2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r0 = 0
            goto L_0x00a3
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            if (r0 != 0) goto L_0x018f
        L_0x00a5:
            if (r13 < r7) goto L_0x00aa
            int r0 = r13 % r7
            goto L_0x00b3
        L_0x00aa:
            if (r13 >= 0) goto L_0x00b7
            int r0 = -r13
            int r0 = r0 % r7
            if (r0 != 0) goto L_0x00b1
            r0 = r7
        L_0x00b1:
            int r0 = r7 - r0
        L_0x00b3:
            r5 = r26
            r15 = r0
            goto L_0x00ba
        L_0x00b7:
            r5 = r26
            r15 = r13
        L_0x00ba:
            android.view.View r4 = r5.mo17341e(r15)
            r6.measureChildWithMargins(r4, r11, r11)
            r0 = 0
            r4.setRotation(r0)
            r4.setRotationY(r0)
            r4.setRotationX(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setScaleX(r0)
            r4.setScaleY(r0)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.mo10233c(r0)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/luckymoney/scaledLayout/ViewPagerLayoutManager"
            java.lang.String r19 = "resetViewProperty"
            java.lang.String r20 = "(Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setAlpha"
            java.lang.String r23 = "(F)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r1.mo10231a(r11)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r4.setAlpha(r0)
            java.lang.String r17 = "com/tencent/mm/plugin/luckymoney/scaledLayout/ViewPagerLayoutManager"
            java.lang.String r18 = "resetViewProperty"
            java.lang.String r19 = "(Landroid/view/View;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = r6.f53127E
            float r1 = (float) r13
            if (r0 == 0) goto L_0x011d
            float r0 = r6.f53131I
            float r0 = -r0
            goto L_0x011f
        L_0x011d:
            float r0 = r6.f53131I
        L_0x011f:
            float r1 = r1 * r0
            float r0 = r6.f53124B
            float r3 = r1 - r0
            int r0 = r6.f53140y
            if (r0 != r10) goto L_0x012b
            r1 = 0
            goto L_0x012c
        L_0x012b:
            int r1 = (int) r3
        L_0x012c:
            if (r0 != r10) goto L_0x0130
            int r2 = (int) r3
            goto L_0x0131
        L_0x0130:
            r2 = 0
        L_0x0131:
            if (r0 != r10) goto L_0x0155
            int r0 = r6.f53123A
            int r16 = r0 + r1
            int r0 = r6.f53141z
            int r17 = r0 + r2
            int r0 = r6.f53139x
            int r18 = r16 + r0
            int r0 = r6.f53138w
            int r19 = r17 + r0
            r0 = r25
            r1 = r4
            r2 = r16
            r9 = r3
            r3 = r17
            r17 = r4
            r4 = r18
            r5 = r19
            r0.layoutDecorated(r1, r2, r3, r4, r5)
            goto L_0x0174
        L_0x0155:
            r9 = r3
            r17 = r4
            int r0 = r6.f53141z
            int r3 = r0 + r1
            int r0 = r6.f53123A
            int r4 = r0 + r2
            int r0 = r6.f53138w
            int r5 = r3 + r0
            int r0 = r6.f53139x
            int r18 = r4 + r0
            r0 = r25
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r18
            r0.layoutDecorated(r1, r2, r3, r4, r5)
        L_0x0174:
            r0 = r17
            r6.mo23967k0(r0, r9)
            float r1 = (float) r15
            int r2 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0182
            r6.addView(r0)
            goto L_0x0185
        L_0x0182:
            r6.addView(r0, r11)
        L_0x0185:
            if (r13 != r8) goto L_0x0189
            r6.f53136N = r0
        L_0x0189:
            android.util.SparseArray<android.view.View> r2 = r6.f53137v
            r2.put(r13, r0)
            r14 = r1
        L_0x018f:
            int r13 = r13 + 1
            r9 = -1
            goto L_0x0064
        L_0x0194:
            android.view.View r0 = r6.f53136N
            r0.requestFocus()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.mo23965i0(androidx.recyclerview.widget.RecyclerView$r):void");
    }

    /* renamed from: j0 */
    public abstract float mo23966j0();

    /* renamed from: k0 */
    public abstract void mo23967k0(View view, float f);

    /* renamed from: l0 */
    public void mo23968l0() {
    }

    public void onAdapterChanged(RecyclerView.C16613e eVar, RecyclerView.C16613e eVar2) {
        removeAllViews();
        this.f53124B = 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView r5, java.util.ArrayList<android.view.View> r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.mo23960d0()
            android.view.View r1 = r4.findViewByPosition(r0)
            r2 = 1
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            boolean r3 = r5.hasFocus()
            if (r3 == 0) goto L_0x004d
            int r6 = r4.f53140y
            r8 = -1
            if (r6 != r2) goto L_0x0025
            r6 = 33
            if (r7 != r6) goto L_0x001e
            boolean r6 = r4.f53127E
            goto L_0x002b
        L_0x001e:
            r6 = 130(0x82, float:1.82E-43)
            if (r7 != r6) goto L_0x0034
            boolean r6 = r4.f53127E
            goto L_0x0035
        L_0x0025:
            r6 = 17
            if (r7 != r6) goto L_0x002d
            boolean r6 = r4.f53127E
        L_0x002b:
            r6 = r6 ^ r2
            goto L_0x0035
        L_0x002d:
            r6 = 66
            if (r7 != r6) goto L_0x0034
            boolean r6 = r4.f53127E
            goto L_0x0035
        L_0x0034:
            r6 = -1
        L_0x0035:
            if (r6 == r8) goto L_0x0050
            if (r6 != r2) goto L_0x003b
            int r0 = r0 - r2
            goto L_0x003c
        L_0x003b:
            int r0 = r0 + r2
        L_0x003c:
            int r6 = r4.mo23964h0(r0)
            int r7 = r4.f53140y
            r8 = 0
            if (r7 != r2) goto L_0x0049
            r5.smoothScrollBy(r8, r6)
            goto L_0x0050
        L_0x0049:
            r5.smoothScrollBy(r6, r8)
            goto L_0x0050
        L_0x004d:
            r1.addFocusables(r6, r7, r8)
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.onAddFocusables(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C16625r rVar) {
        super.onDetachedFromWindow(recyclerView, rVar);
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        return null;
    }

    public void onLayoutChildren(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        float f;
        float f2;
        if (wVar.mo17354b() == 0) {
            removeAndRecycleAllViews(rVar);
            this.f53124B = 0.0f;
            return;
        }
        mo17002x();
        if (this.f53140y == 1 || !mo16968O()) {
            this.f53127E = this.f53126D;
        } else {
            this.f53127E = !this.f53126D;
        }
        View g0 = mo23963g0(rVar, wVar, 0);
        if (g0 == null) {
            removeAndRecycleAllViews(rVar);
            this.f53124B = 0.0f;
            return;
        }
        measureChildWithMargins(g0, 0, 0);
        this.f53138w = this.f53125C.mo23973a(g0);
        this.f53139x = this.f53125C.mo23974b(g0);
        this.f53141z = (this.f53125C.mo23976d() - this.f53138w) / 2;
        if (this.f53135M == Integer.MAX_VALUE) {
            this.f53123A = (this.f53125C.mo23977e() - this.f53139x) / 2;
        } else {
            this.f53123A = (this.f53125C.mo23977e() - this.f53139x) - this.f53135M;
        }
        this.f53131I = mo23966j0();
        mo23968l0();
        if (this.f53131I == 0.0f) {
            this.f53132J = 1;
            this.f53133K = 1;
        } else {
            this.f53132J = ((int) Math.abs(((float) (((-this.f53138w) - this.f53125C.mo23975c()) - this.f53141z)) / this.f53131I)) + 1;
            this.f53133K = ((int) Math.abs(((float) (this.f53125C.mo23976d() - this.f53141z)) / this.f53131I)) + 1;
        }
        SavedState savedState = this.f53130H;
        if (savedState != null) {
            this.f53127E = savedState.f53144f;
            this.f53129G = savedState.f53142d;
            this.f53124B = savedState.f53143e;
        }
        int i = this.f53129G;
        if (i != -1) {
            if (this.f53127E) {
                f = (float) i;
                f2 = -this.f53131I;
            } else {
                f = (float) i;
                f2 = this.f53131I;
            }
            this.f53124B = f * f2;
        }
        mo23965i0(rVar);
    }

    public void onLayoutCompleted(RecyclerView.C16628w wVar) {
        super.onLayoutCompleted(wVar);
        this.f53130H = null;
        this.f53129G = -1;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f53130H = new SavedState((SavedState) parcelable);
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.f53130H;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f53142d = this.f53129G;
        savedState2.f53143e = this.f53124B;
        savedState2.f53144f = this.f53127E;
        return savedState2;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (this.f53140y == 1) {
            return 0;
        }
        return m19876U(i, rVar, wVar);
    }

    public void scrollToPosition(int i) {
        if (i >= 0 && i < getItemCount()) {
            this.f53129G = i;
            this.f53124B = ((float) i) * (this.f53127E ? -this.f53131I : this.f53131I);
            requestLayout();
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (this.f53140y == 0) {
            return 0;
        }
        return m19876U(i, rVar, wVar);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C16628w wVar, int i) {
        int h0 = mo23964h0(i);
        if (this.f53140y == 1) {
            recyclerView.mo17122s1(0, h0, (Interpolator) null);
        } else {
            recyclerView.mo17122s1(h0, 0, (Interpolator) null);
        }
    }

    /* renamed from: x */
    public void mo17002x() {
        C18928d dVar;
        if (this.f53125C == null) {
            int i = this.f53140y;
            if (i == 0) {
                dVar = new C18926b(this);
            } else if (i == 1) {
                dVar = new C18927c(this);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
            this.f53125C = dVar;
        }
    }
}
