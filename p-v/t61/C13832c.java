package t61;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: t61.c */
public final class C13832c extends RecyclerView.C0129l {

    /* renamed from: d */
    public final int f38969d;

    /* renamed from: e */
    public final Rect f38970e = new Rect();

    /* renamed from: f */
    public final Paint f38971f;

    /* renamed from: g */
    public final float f38972g;

    public C13832c(Context context, int i) {
        C87412m.m108594g(context, "context");
        this.f38969d = i;
        Paint paint = new Paint();
        this.f38971f = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(context.getResources().getColor(C0966R.color.a1c));
        this.f38972g = (float) C76577a.m92151b(context, 64);
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        canvas.save();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.C16631z P0 = recyclerView.mo17031P0(childAt);
            int j = P0.mo17363j();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108591d(layoutManager);
            layoutManager.getDecoratedBoundsWithMargins(childAt, this.f38970e);
            int round = this.f38970e.bottom + Math.round(childAt.getTranslationY());
            int i2 = this.f38970e.top;
            childAt.getTranslationY();
            this.f38971f.getStrokeWidth();
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (adapter != null) {
                boolean z = true;
                if (j != (adapter.getItemCount() - 1) - this.f38969d) {
                    z = false;
                }
                if (P0 instanceof C101732h) {
                    if (z) {
                        float f = (float) round;
                        canvas.drawLine(0.0f, f, (float) this.f38970e.width(), f, this.f38971f);
                    } else {
                        float f2 = (float) round;
                        canvas.drawLine(this.f38972g, f2, (float) this.f38970e.width(), f2, this.f38971f);
                    }
                }
                i++;
            } else {
                return;
            }
        }
        canvas.restore();
    }
}
