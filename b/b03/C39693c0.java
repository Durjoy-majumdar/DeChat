package b03;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import gy3.C87412m;

/* renamed from: b03.c0 */
public final class C39693c0 extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ boolean f106489a;

    /* renamed from: b */
    public final /* synthetic */ boolean f106490b;

    /* renamed from: c */
    public final /* synthetic */ float f106491c;

    public C39693c0(boolean z, boolean z2, float f) {
        this.f106489a = z;
        this.f106490b = z2;
        this.f106491c = f;
    }

    public void getOutline(View view, Outline outline) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(outline, "outline");
        boolean z = this.f106489a;
        if (z && this.f106490b) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f106491c);
        } else if (z) {
            int width = view.getWidth();
            float f = this.f106491c;
            outline.setRoundRect(0, 0, width, (int) (((float) view.getHeight()) + f), f);
        } else if (this.f106490b) {
            outline.setRoundRect(0, (int) (((float) 0) - this.f106491c), view.getWidth(), view.getHeight(), this.f106491c);
        }
    }
}
