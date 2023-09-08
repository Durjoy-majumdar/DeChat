package ul2;

import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductListLayout;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ul2.b0 */
public final class C111194b0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScanProductListLayout f333005d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111194b0(ScanProductListLayout scanProductListLayout) {
        super(1);
        this.f333005d = scanProductListLayout;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue == 0) {
            ScanProductListLayout.C106122a productListCallBack = this.f333005d.getProductListCallBack();
            if (productListCallBack != null) {
                productListCallBack.mo151808a(7);
            }
        } else if (intValue == 1) {
            ScanProductListLayout scanProductListLayout = this.f333005d;
            int a = scanProductListLayout.getCloseStateTopMargin();
            this.f333005d.getClass();
            scanProductListLayout.setRecyclerViewMarginTop(a - 0);
            ScanProductListLayout.C106122a productListCallBack2 = this.f333005d.getProductListCallBack();
            if (productListCallBack2 != null) {
                productListCallBack2.mo151808a(0);
            }
        }
        return C13598b0.f38549a;
    }
}
