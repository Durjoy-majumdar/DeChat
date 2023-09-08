package ya2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;

/* renamed from: ya2.f */
public final class C15942f extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Context f42825d;

    /* renamed from: e */
    public float f42826e;

    /* renamed from: f */
    public final Paint f42827f;

    /* renamed from: g */
    public final ArrayList<String> f42828g = new ArrayList<>();

    public C15942f(Context context) {
        C87412m.m108594g(context, "context");
        this.f42825d = context;
        Paint paint = new Paint(1);
        this.f42827f = paint;
        paint.setColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
        paint.setTextSize((float) C76577a.m92151b(context, 10));
        this.f42826e = paint.measureText("00:00");
    }

    /* renamed from: i */
    public void mo123i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        int i;
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int N0 = recyclerView.mo17029N0(childAt);
            float bottom = ((float) childAt.getBottom()) - this.f42827f.getFontMetrics().descent;
            int left = childAt.getLeft();
            int right = childAt.getRight();
            float f = (float) left;
            float f2 = this.f42826e;
            float f3 = (float) 2;
            if (f > (-f2) / f3) {
                canvas.drawText(this.f42828g.get(N0), f - (f2 / f3), bottom, this.f42827f);
            }
            if (i2 == childCount - 1 && (i = N0 + 1) < this.f42828g.size()) {
                float f4 = (float) right;
                float f5 = this.f42826e;
                if (f4 < ((float) recyclerView.getWidth()) + (f5 / f3)) {
                    canvas.drawText(this.f42828g.get(i), f4 - (f5 / f3), bottom - this.f42827f.getFontMetrics().descent, this.f42827f);
                }
            }
        }
    }
}
