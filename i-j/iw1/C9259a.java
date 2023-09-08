package iw1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.picker.GalleryPickerFragment;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: iw1.a */
public final class C9259a extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Paint f29008d;

    /* renamed from: e */
    public final /* synthetic */ GalleryPickerFragment f29009e;

    public C9259a(GalleryPickerFragment galleryPickerFragment) {
        this.f29009e = galleryPickerFragment;
        int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.akw);
        Paint paint = new Paint();
        this.f29008d = paint;
        paint.setColor(color);
        paint.setStrokeWidth(6.4f);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: g */
    public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(rect, "outRect");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        super.mo21g(rect, view, recyclerView, wVar);
        int O0 = recyclerView.mo17030O0(view);
        if (O0 % 4 == 0) {
            rect.left = 4;
        }
        rect.right = 4;
        rect.bottom = 4;
        boolean z = false;
        if (O0 >= 0 && O0 < 4) {
            z = true;
        }
        if (z) {
            rect.top = 4;
        }
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        this.f29009e.getClass();
        RecyclerView.C16631z I0 = recyclerView.mo17023I0(0);
        View view = I0 != null ? I0.f44854d : null;
        if (view != null) {
            canvas.drawRect(new Rect(view.getLeft() + 2, view.getTop() + 2, view.getRight() - 2, view.getBottom() - 2), this.f29008d);
        }
    }
}
