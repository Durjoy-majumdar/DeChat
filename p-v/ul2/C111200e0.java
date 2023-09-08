package ul2;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.scanner.model.ScanProductInfo;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import com.tencent.p014mm.plugin.scanner.view.ScanProductDetectRectView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nl2.C21681q;
import rx3.C13598b0;

/* renamed from: ul2.e0 */
public final class C111200e0 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ ScanProductMaskDecorView f333012d;

    /* renamed from: e */
    public final /* synthetic */ ScanProductDetectRectView f333013e;

    /* renamed from: f */
    public final /* synthetic */ C21681q f333014f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f333015g;

    public C111200e0(ScanProductMaskDecorView scanProductMaskDecorView, ScanProductDetectRectView scanProductDetectRectView, C21681q qVar, C32224a<C13598b0> aVar) {
        this.f333012d = scanProductMaskDecorView;
        this.f333013e = scanProductDetectRectView;
        this.f333014f = qVar;
        this.f333015g = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        this.f333012d.removeView(this.f333013e);
        ScanProductMaskDecorView.C106127b bVar = this.f333012d.f316088f;
        if (bVar != null) {
            C21681q qVar = this.f333014f;
            C87412m.m108594g(qVar, "requestInfo");
            ScanProductInfo scanProductInfo = qVar.f61358a;
            Log.m105924i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + scanProductInfo.getId());
            synchronized (bVar.f316100j) {
                if (bVar.f316100j.containsKey(Integer.valueOf(scanProductInfo.getId()))) {
                    Log.m105924i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + scanProductInfo.getId() + " insert");
                    bVar.f316099i.add(0, Integer.valueOf(scanProductInfo.getId()));
                    bVar.notifyItemInserted(1);
                    C13598b0 b0Var = C13598b0.f38549a;
                } else {
                    RecyclerView.LayoutManager layoutManager = bVar.f316095e.getLayoutManager();
                    if (layoutManager != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "addProductInfo", "(Lcom/tencent/mm/plugin/scanner/scan_goods_new/ScanProductRequestInfo;)V", "Undefined", "scrollToPosition", "(I)V");
                        layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "addProductInfo", "(Lcom/tencent/mm/plugin/scanner/scan_goods_new/ScanProductRequestInfo;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    Log.m105924i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + scanProductInfo.getId() + " pending insert");
                    bVar.f316102o.add(Integer.valueOf(scanProductInfo.getId()));
                }
            }
        }
        this.f333015g.invoke();
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
