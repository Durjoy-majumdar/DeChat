package com.tencent.p014mm.plugin.luckymoney.scaledLayout;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.a */
public class C56850a extends C54259z {

    /* renamed from: f */
    public View f162886f;

    /* renamed from: g */
    public Context f162887g;

    /* renamed from: h */
    public boolean f162888h = false;

    /* renamed from: com.tencent.mm.plugin.luckymoney.scaledLayout.a$a */
    public class C56851a extends C54256s {

        /* renamed from: n */
        public final /* synthetic */ RecyclerView.LayoutManager f162889n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56851a(Context context, RecyclerView.LayoutManager layoutManager) {
            super(context);
            this.f162889n = layoutManager;
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            int[] c = C56850a.this.mo75026c(this.f162889n, view);
            int i = c[0];
            int i2 = c[1];
            int l = mo10339l(Math.max(Math.abs(i), Math.abs(i2)));
            if (l > 0) {
                aVar.mo17388b(i, i2, l, this.f152290i);
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            return 50.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: m */
        public int mo10340m(int i) {
            return Math.min(50, super.mo10340m(i));
        }
    }

    /* renamed from: d */
    public RecyclerView.C16634v mo75027d(RecyclerView.LayoutManager layoutManager) {
        return this.f162888h ? mo75028e(layoutManager) : new C56851a(this.f162887g, layoutManager);
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        View f = super.mo75029f(layoutManager);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < layoutManager.getChildCount(); i3++) {
            View childAt = layoutManager.getChildAt(i3);
            if (childAt == f) {
                i = i3;
            }
            if (childAt == this.f162886f) {
                i2 = i3;
            }
        }
        int i4 = i - i2;
        return i4 > 1 ? layoutManager.findViewByPosition(i2 + 1) : i4 < -1 ? layoutManager.findViewByPosition(i2 - 1) : f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r4 = r6 - 1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo75030g(androidx.recyclerview.widget.RecyclerView.LayoutManager r4, int r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getItemCount()
            r0 = -1
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.view.View r6 = r3.mo80268n(r4)
            if (r6 != 0) goto L_0x000f
            return r0
        L_0x000f:
            android.view.View r0 = r3.f162886f
            if (r0 == 0) goto L_0x0016
            if (r0 == r6) goto L_0x0016
            r6 = r0
        L_0x0016:
            int r6 = r4.getPosition(r6)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0[r1] = r2
            java.lang.String r1 = "CusPager"
            java.lang.String r2 = "pos: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r0)
            r0 = 100
            if (r5 < r0) goto L_0x0038
            int r0 = r6 + 1
            int r4 = r4.getItemCount()
            if (r0 >= r4) goto L_0x0038
            return r0
        L_0x0038:
            r4 = -100
            if (r5 > r4) goto L_0x0041
            int r4 = r6 + -1
            if (r4 < 0) goto L_0x0041
            return r4
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.scaledLayout.C56850a.mo75030g(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }

    /* renamed from: n */
    public View mo80268n(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        new Rect();
        int paddingLeft = layoutManager.getClipToPadding() ? layoutManager.getPaddingLeft() + (((layoutManager.getWidth() - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight()) / 2) : layoutManager.getWidth() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int decoratedLeft = layoutManager.getDecoratedLeft(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).leftMargin;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int abs = Math.abs((decoratedLeft + (((layoutManager.getDecoratedMeasuredWidth(childAt) + layoutParams.leftMargin) + layoutParams.rightMargin) / 2)) - paddingLeft);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }
}
