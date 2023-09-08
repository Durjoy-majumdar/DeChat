package tl2;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lp3.C88631d;

/* renamed from: tl2.u */
public final class C111035u<T> implements C88631d.C88632b {

    /* renamed from: a */
    public final /* synthetic */ ScanGoodsMaskView f332514a;

    public C111035u(ScanGoodsMaskView scanGoodsMaskView) {
        this.f332514a = scanGoodsMaskView;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        Log.m105925i("MicroMsg.ScanGoodsMaskView", "alvinluo showCustomView finish result: %b", (Boolean) obj);
        ScanGoodsMaskView scanGoodsMaskView = this.f332514a;
        scanGoodsMaskView.f315902D = true;
        LinearLayout linearLayout = scanGoodsMaskView.f315906H;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            ImageView imageView = this.f332514a.f315903E;
            if (imageView != null) {
                imageView.setVisibility(0);
                ScanGoodsMaskView scanGoodsMaskView2 = this.f332514a;
                scanGoodsMaskView2.f315913P = scanGoodsMaskView2.getResources().getDimensionPixelSize(C0966R.dimen.alo);
                View view = this.f332514a.f315929w;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onSetCustomBackgroundSuccess$5", "onTerminate", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onSetCustomBackgroundSuccess$5", "onTerminate", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ScanGoodsMaskView scanGoodsMaskView3 = this.f332514a;
                    ImageView imageView2 = scanGoodsMaskView3.f315904F;
                    if (imageView2 != null) {
                        scanGoodsMaskView3.f315929w = imageView2;
                    } else {
                        C87412m.m108603p("customSuccessView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("successMarkView");
                    throw null;
                }
            } else {
                C87412m.m108603p("customMaskView");
                throw null;
            }
        } else {
            C87412m.m108603p("customTipsImageContainer");
            throw null;
        }
    }
}
