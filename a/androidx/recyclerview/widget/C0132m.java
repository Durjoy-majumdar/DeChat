package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
public class C0132m extends RecyclerView.C0129l {

    /* renamed from: g */
    public static final int[] f558g = {16843284};

    /* renamed from: d */
    public Drawable f559d;

    /* renamed from: e */
    public int f560e;

    /* renamed from: f */
    public final Rect f561f = new Rect();

    public C0132m(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f558g);
        this.f559d = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.f560e = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        Drawable drawable = this.f559d;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f560e == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.getLayoutManager() != null && this.f559d != null) {
            int i5 = 0;
            if (this.f560e == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.m15804R0(childAt, this.f561f);
                    int round = this.f561f.bottom + Math.round(childAt.getTranslationY());
                    this.f559d.setBounds(i3, round - this.f559d.getIntrinsicHeight(), i4, round);
                    this.f559d.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, this.f561f);
                int round2 = this.f561f.right + Math.round(childAt2.getTranslationX());
                this.f559d.setBounds(round2 - this.f559d.getIntrinsicWidth(), i, round2, i2);
                this.f559d.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }

    /* renamed from: j */
    public void mo128j(Drawable drawable) {
        if (drawable != null) {
            this.f559d = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }
}
