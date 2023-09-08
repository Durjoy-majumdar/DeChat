package ul2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ul2.u */
public final class C111218u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333043d;

    public C111218u(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f333043d = scanCodeProductMergeMaskView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$switchScanProductViewExpand$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ScanProductMaskDecorView scanProductMaskDecorView = this.f333043d.f316031W0;
        if (scanProductMaskDecorView != null) {
            scanProductMaskDecorView.mo151816c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$switchScanProductViewExpand$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("scanProductListView");
        throw null;
    }
}
