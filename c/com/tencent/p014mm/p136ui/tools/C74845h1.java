package com.tencent.p014mm.p136ui.tools;

import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72917n0;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.tools.h1 */
public class C74845h1 implements Runnable {

    /* renamed from: d */
    public long f220062d = System.currentTimeMillis();

    /* renamed from: e */
    public C72917n0 f220063e;

    /* renamed from: f */
    public int f220064f;

    /* renamed from: g */
    public int f220065g;

    /* renamed from: h */
    public int f220066h;

    /* renamed from: i */
    public int f220067i;

    /* renamed from: j */
    public final int f220068j;

    /* renamed from: n */
    public int f220069n;

    public C74845h1(C72917n0 n0Var) {
        this.f220063e = n0Var;
        int scaledFadingEdgeLength = ViewConfiguration.get(n0Var.getContext()).getScaledFadingEdgeLength();
        this.f220068j = scaledFadingEdgeLength;
        Log.m105919d("ScrollerRunnable", "mExtraScroll: %d", Integer.valueOf(scaledFadingEdgeLength));
    }

    public void run() {
        if (System.currentTimeMillis() - this.f220062d <= 10000) {
            int height = this.f220063e.getHeight();
            int firstVisiblePosition = this.f220063e.getFirstVisiblePosition();
            int i = this.f220064f;
            if (i == 1) {
                int childCount = this.f220063e.getChildCount() - 1;
                int i2 = firstVisiblePosition + childCount;
                if (childCount >= 0) {
                    if (i2 == this.f220066h) {
                        if (this.f220069n > 20) {
                            this.f220063e.setSelection(this.f220065g);
                            Log.m105918d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
                        } else {
                            this.f220063e.post(this);
                            this.f220069n++;
                            Log.m105919d("ScrollerRunnable", "dz:try scroll lastpos = %d", Integer.valueOf(i2));
                            return;
                        }
                    }
                    this.f220069n = 0;
                    View childAt = this.f220063e.getChildAt(childCount);
                    this.f220063e.smoothScrollBy((childAt.getHeight() - (height - childAt.getTop())) + (i2 < this.f220063e.getCount() - 1 ? this.f220068j : this.f220063e.getPaddingBottom()), this.f220067i);
                    this.f220066h = i2;
                    if (i2 < this.f220065g) {
                        this.f220063e.post(this);
                    }
                }
            } else if (i == 2) {
                if (firstVisiblePosition == this.f220066h) {
                    if (this.f220069n > 20) {
                        this.f220063e.setSelection(this.f220065g);
                        Log.m105918d("ScrollerRunnable", "dz:try scroll at same item more than 10, direct seletion");
                    } else {
                        this.f220063e.post(this);
                        this.f220069n++;
                        Log.m105919d("ScrollerRunnable", "dz:try scroll firstPos = %d", Integer.valueOf(firstVisiblePosition));
                        return;
                    }
                }
                this.f220069n = 0;
                View childAt2 = this.f220063e.getChildAt(0);
                if (childAt2 != null) {
                    this.f220063e.smoothScrollBy(childAt2.getTop() - (firstVisiblePosition > 0 ? this.f220068j : this.f220063e.getPaddingTop()), this.f220067i);
                    this.f220066h = firstVisiblePosition;
                    if (firstVisiblePosition > this.f220065g) {
                        this.f220063e.post(this);
                    }
                }
            }
        }
    }
}
