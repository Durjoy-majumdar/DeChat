package h51;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;

/* renamed from: h51.f */
public class C8488f extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Resources f27498d;

    /* renamed from: e */
    public final Drawable f27499e;

    /* renamed from: f */
    public int f27500f;

    public C8488f(Resources resources) {
        this.f27498d = resources;
        this.f27499e = new ColorDrawable(resources.getColor(C0966R.color.f3311nd));
        this.f27500f = resources.getDimensionPixelSize(C0966R.dimen.ac_);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        rect.set(0, 0, 0, this.f27500f);
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            View findViewById = childAt.findViewById(C0966R.C0970id.j5m);
            View findViewById2 = childAt.findViewById(C0966R.C0970id.j5p);
            View findViewById3 = childAt.findViewById(C0966R.C0970id.j6v);
            if (childAt.getVisibility() != 8) {
                int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                int i2 = this.f27500f + bottom;
                if (findViewById.getVisibility() == 0) {
                    this.f27499e.setBounds(paddingLeft, bottom, width, i2);
                    this.f27499e.draw(canvas);
                } else if (findViewById2.getVisibility() == 0) {
                    this.f27499e.setBounds(this.f27498d.getDimensionPixelSize(C0966R.dimen.am4) + paddingLeft, bottom, width, i2);
                    this.f27499e.draw(canvas);
                } else if (findViewById3.getVisibility() == 0) {
                    this.f27499e.setBounds(this.f27498d.getDimensionPixelSize(C0966R.dimen.avp) + paddingLeft, bottom, width, i2);
                    this.f27499e.draw(canvas);
                }
            }
        }
    }
}
