package av2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: av2.x */
public final class C0224x extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Paint f756d;

    /* renamed from: e */
    public final int f757e = 1;

    /* renamed from: f */
    public final /* synthetic */ C54360w f758f;

    public C0224x(C54360w wVar) {
        this.f758f = wVar;
        Paint paint = new Paint();
        this.f756d = paint;
        paint.setColor(C76577a.m92153d(wVar.getContext(), C0966R.color.BW_0_Alpha_0_1));
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        RecyclerView recyclerView2 = recyclerView;
        SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$1");
        C87412m.m108594g(canvas, "c");
        C87412m.m108594g(recyclerView2, "parent");
        C87412m.m108594g(wVar, "state");
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView2.getChildAt(i);
            int N0 = recyclerView2.mo17029N0(childAt);
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (N0 != (adapter != null ? adapter.getItemCount() : 0) - 1) {
                int bottom = childAt.getBottom() - this.f757e;
                canvas.drawRect((float) (recyclerView.getPaddingLeft() + C76577a.m92157h(this.f758f.getContext(), C0966R.dimen.avw)), (float) bottom, (float) (recyclerView.getWidth() - recyclerView.getPaddingRight()), (float) childAt.getBottom(), this.f756d);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.sheet.SnsLabelDetailDialog$initView$1");
    }
}
