package b03;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import gy3.C87412m;

/* renamed from: b03.d0 */
public final class C67128d0 extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ float f192742a;

    public C67128d0(float f) {
        this.f192742a = f;
    }

    public void getOutline(View view, Outline outline) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f192742a * ((float) view.getWidth()));
    }
}
