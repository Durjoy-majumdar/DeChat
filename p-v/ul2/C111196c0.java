package ul2;

import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductListLayout;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ul2.c0 */
public final class C111196c0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScanProductListLayout f333007d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111196c0(ScanProductListLayout scanProductListLayout) {
        super(1);
        this.f333007d = scanProductListLayout;
    }

    public Object invoke(Object obj) {
        ScanProductListLayout.C106122a productListCallBack;
        int intValue = ((Number) obj).intValue();
        if (intValue == 0) {
            ScanProductListLayout.C106122a productListCallBack2 = this.f333007d.getProductListCallBack();
            if (productListCallBack2 != null) {
                productListCallBack2.mo151808a(4);
            }
        } else if (intValue == 1 && (productListCallBack = this.f333007d.getProductListCallBack()) != null) {
            productListCallBack.mo151808a(1);
        }
        return C13598b0.f38549a;
    }
}
