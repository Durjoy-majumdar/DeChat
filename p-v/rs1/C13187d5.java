package rs1;

import android.graphics.Rect;
import android.widget.FrameLayout;
import as1.C0201a;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC;
import gy3.C87412m;

/* renamed from: rs1.d5 */
public final class C13187d5 implements C0201a.C0203b {

    /* renamed from: a */
    public final /* synthetic */ FinderHorizontalVideoDrawerUIC f37503a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f37504b;

    public C13187d5(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, FrameLayout frameLayout) {
        this.f37503a = finderHorizontalVideoDrawerUIC;
        this.f37504b = frameLayout;
    }

    /* renamed from: g */
    public Rect mo236g(C0201a aVar) {
        C87412m.m108594g(aVar, "drawer");
        Rect rect = new Rect();
        if (this.f37503a.f18676f) {
            this.f37504b.getGlobalVisibleRect(rect);
        }
        return rect;
    }
}
