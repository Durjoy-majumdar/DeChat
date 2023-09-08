package n61;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: n61.a */
public final class C11132a extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Rect f32889d = new Rect();

    /* renamed from: e */
    public final Paint f32890e;

    /* renamed from: f */
    public final float f32891f;

    /* renamed from: g */
    public final float f32892g;

    public C11132a(Context context) {
        C87412m.m108594g(context, "context");
        Paint paint = new Paint();
        this.f32890e = paint;
        paint.setStrokeWidth((float) C76577a.m92150a(context, 0.5f));
        paint.setColor(context.getResources().getColor(C0966R.color.a1c));
        this.f32891f = (float) C76577a.m92151b(context, 92);
        this.f32892g = (float) C76577a.m92151b(context, 16);
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        RecyclerView recyclerView2 = recyclerView;
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(recyclerView2, "parent");
        C87412m.m108594g(wVar, "state");
        canvas.save();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView2.getChildAt(i);
            int j = recyclerView2.mo17031P0(childAt).mo17363j();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108591d(layoutManager);
            layoutManager.getDecoratedBoundsWithMargins(childAt, this.f32889d);
            int round = this.f32889d.bottom + Math.round(childAt.getTranslationY());
            float translationY = ((float) this.f32889d.top) + childAt.getTranslationY() + this.f32890e.getStrokeWidth();
            float f = (float) round;
            canvas.drawLine(this.f32891f, f, (float) this.f32889d.width(), f, this.f32890e);
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (j == 0) {
                canvas.drawLine(this.f32892g, translationY, (float) this.f32889d.width(), translationY, this.f32890e);
            }
            if (adapter != null && j == adapter.getItemCount() - 1) {
                canvas.drawLine(this.f32892g, f, (float) this.f32889d.width(), f, this.f32890e);
            }
        }
        canvas.restore();
    }
}
