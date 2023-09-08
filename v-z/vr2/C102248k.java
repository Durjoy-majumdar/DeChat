package vr2;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.bottomsheet.ViewTitleWithAnimation;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: vr2.k */
public class C102248k implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C102251n f301132d;

    public C102248k(C102251n nVar) {
        this.f301132d = nVar;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$1");
        try {
            C102251n nVar = this.f301132d;
            nVar.getClass();
            SnsMethodCalculate.markStartTimeMs("createQRCodeMenuItem", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            View b = ((ScanCodeSheetItemLogic) nVar.f301137c).mo67071b(new C102250m(nVar), nVar.f301138d, nVar.f301140f, 9);
            SnsMethodCalculate.markEndTimeMs("createQRCodeMenuItem", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            if (b instanceof ViewTitleWithAnimation) {
                ((ViewTitleWithAnimation) b).setTopPaddingVisibility(8);
            }
            C102251n.m134806a(this.f301132d).mo107567l(b);
            View view = new View(C102251n.m134807b(this.f301132d));
            view.setMinimumHeight(C76577a.m92151b(C102251n.m134807b(this.f301132d), 2));
            C102251n.m134806a(this.f301132d).mo107569n(view, true);
        } catch (Exception e) {
            Log.m105920e("SnsAdQRHelper", "onCreateMMMenu exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$1");
    }
}
