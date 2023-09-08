package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.s */
public class C54256s extends RecyclerView.C16634v {

    /* renamed from: h */
    public final LinearInterpolator f152289h = new LinearInterpolator();

    /* renamed from: i */
    public final DecelerateInterpolator f152290i = new DecelerateInterpolator();

    /* renamed from: j */
    public PointF f152291j;

    /* renamed from: k */
    public final float f152292k;

    /* renamed from: l */
    public int f152293l = 0;

    /* renamed from: m */
    public int f152294m = 0;

    public C54256s(Context context) {
        this.f152292k = mo3227k(context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public void mo17382c(int i, int i2, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
        if (this.f44873b.f44782s.getChildCount() == 0) {
            mo17386g();
            return;
        }
        int i3 = this.f152293l;
        int i4 = i3 - i;
        int i5 = 0;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.f152293l = i4;
        int i6 = this.f152294m;
        int i7 = i6 - i2;
        if (i6 * i7 > 0) {
            i5 = i7;
        }
        this.f152294m = i5;
        if (i4 == 0 && i5 == 0) {
            PointF a = mo17380a(this.f44872a);
            if (a != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    float f2 = a.y;
                    float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
                    float f3 = a.x / sqrt;
                    a.x = f3;
                    float f4 = a.y / sqrt;
                    a.y = f4;
                    this.f152291j = a;
                    this.f152293l = (int) (f3 * 10000.0f);
                    this.f152294m = (int) (f4 * 10000.0f);
                    aVar.mo17388b((int) (((float) this.f152293l) * 1.2f), (int) (((float) this.f152294m) * 1.2f), (int) (((float) mo10340m(10000)) * 1.2f), this.f152289h);
                    return;
                }
            }
            aVar.f44882d = this.f44872a;
            mo17386g();
        }
    }

    /* renamed from: d */
    public void mo17383d() {
    }

    /* renamed from: e */
    public void mo17384e() {
        this.f152294m = 0;
        this.f152293l = 0;
        this.f152291j = null;
    }

    /* renamed from: f */
    public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
        int i = mo74664i(view, mo65616n());
        int j = mo74665j(view, mo10341o());
        int l = mo10339l((int) Math.sqrt((double) ((i * i) + (j * j))));
        if (l > 0) {
            aVar.mo17388b(-i, -j, l, this.f152290i);
        }
    }

    /* renamed from: h */
    public int mo6715h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: i */
    public int mo74664i(View view, int i) {
        RecyclerView.LayoutManager layoutManager = this.f44874c;
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo6715h(layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin, layoutManager.getDecoratedRight(view) + layoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    /* renamed from: j */
    public int mo74665j(View view, int i) {
        RecyclerView.LayoutManager layoutManager = this.f44874c;
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return mo6715h(layoutManager.getDecoratedTop(view) - layoutParams.topMargin, layoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    /* renamed from: k */
    public float mo3227k(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: l */
    public int mo10339l(int i) {
        return (int) Math.ceil(((double) mo10340m(i)) / 0.3356d);
    }

    /* renamed from: m */
    public int mo10340m(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f152292k));
    }

    /* renamed from: n */
    public int mo65616n() {
        PointF pointF = this.f152291j;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: o */
    public int mo10341o() {
        PointF pointF = this.f152291j;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
