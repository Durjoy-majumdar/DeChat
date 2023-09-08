package zo3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import gy3.C87412m;

/* renamed from: zo3.a */
public final class C79405a extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ boolean f232923a;

    /* renamed from: b */
    public final /* synthetic */ boolean f232924b;

    /* renamed from: c */
    public final /* synthetic */ float f232925c;

    public C79405a(boolean z, boolean z2, float f) {
        this.f232923a = z;
        this.f232924b = z2;
        this.f232925c = f;
    }

    public void getOutline(View view, Outline outline) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(outline, "outline");
        boolean z = this.f232923a;
        if (z && this.f232924b) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f232925c);
        } else if (z) {
            int width = view.getWidth();
            float f = this.f232925c;
            outline.setRoundRect(0, 0, width, (int) (((float) view.getHeight()) + f), f);
        } else if (this.f232924b) {
            outline.setRoundRect(0, (int) (((float) 0) - this.f232925c), view.getWidth(), view.getHeight(), this.f232925c);
        }
    }
}
