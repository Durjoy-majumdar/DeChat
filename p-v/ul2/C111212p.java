package ul2;

import android.view.ViewTreeObserver;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import gy3.C87412m;

/* renamed from: ul2.p */
public final class C111212p implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333038d;

    public C111212p(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f333038d = scanCodeProductMergeMaskView;
    }

    public void onGlobalLayout() {
        ScanProductMaskDecorView scanProductMaskDecorView = this.f333038d.f316031W0;
        if (scanProductMaskDecorView != null) {
            scanProductMaskDecorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f333038d;
            ScanProductMaskDecorView scanProductMaskDecorView2 = scanCodeProductMergeMaskView.f316031W0;
            if (scanProductMaskDecorView2 == null) {
                C87412m.m108603p("scanProductListView");
                throw null;
            } else if (scanProductMaskDecorView2 != null) {
                scanProductMaskDecorView2.mo151817d(scanCodeProductMergeMaskView.getMBottomExtraHeight() + this.f333038d.getProductListBottomMarginDelta());
            } else {
                C87412m.m108603p("scanProductListView");
                throw null;
            }
        } else {
            C87412m.m108603p("scanProductListView");
            throw null;
        }
    }
}
