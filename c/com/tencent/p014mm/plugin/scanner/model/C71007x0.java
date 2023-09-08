package com.tencent.p014mm.plugin.scanner.model;

import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanInfoMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanSharedMaskView;
import com.tencent.p014mm.plugin.scanner.view.BaseScanMaskView;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ul2.C78226a0;

/* renamed from: com.tencent.mm.plugin.scanner.model.x0 */
public final class C71007x0 {

    /* renamed from: a */
    public C71004i f205484a;

    /* renamed from: b */
    public BaseScanMaskView<BaseScanRequest> f205485b;

    /* renamed from: c */
    public ScanSharedMaskView f205486c;

    /* renamed from: d */
    public ScanInfoMaskView f205487d;

    /* renamed from: e */
    public boolean f205488e;

    /* renamed from: f */
    public C94528d.C94529a f205489f;

    /* renamed from: g */
    public int f205490g;

    /* renamed from: h */
    public String f205491h = "";

    /* renamed from: a */
    public final void mo97655a(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        if (this.f205488e != z3) {
            if (z3) {
                BaseScanMaskView<BaseScanRequest> baseScanMaskView = this.f205485b;
                View targetSuccessMarkView = baseScanMaskView != null ? baseScanMaskView.getTargetSuccessMarkView() : null;
                ScanInfoMaskView scanInfoMaskView = this.f205487d;
                if (scanInfoMaskView != null) {
                    scanInfoMaskView.setAnchorView(targetSuccessMarkView);
                }
            }
            this.f205488e = z3;
            ScanSharedMaskView scanSharedMaskView = this.f205486c;
            if (scanSharedMaskView != null) {
                scanSharedMaskView.mo24471b(!z3);
            }
            ScanInfoMaskView scanInfoMaskView2 = this.f205487d;
            if (scanInfoMaskView2 != null) {
                Log.m105927v("MicroMsg.ScanInfoMaskView", "alvinluo showLoadingView show: %b, withAnimation: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
                View view = scanInfoMaskView2.f205542h;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = scanInfoMaskView2.f205544j;
                    if (textView != null) {
                        textView.setVisibility(8);
                        if (!z3) {
                            scanInfoMaskView2.setVisibility(8);
                            scanInfoMaskView2.f205555x = false;
                            View view3 = scanInfoMaskView2.f205540f;
                            if (view3 != null) {
                                C9556a aVar2 = new C9556a();
                                aVar2.mo10233c(8);
                                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                Animation animation = scanInfoMaskView2.f205546o;
                                if (animation != null) {
                                    animation.cancel();
                                }
                                View view4 = scanInfoMaskView2.f205541g;
                                if (view4 != null) {
                                    view4.clearAnimation();
                                } else {
                                    C87412m.m108603p("loadingIcon");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("loadingLayout");
                                throw null;
                            }
                        } else if (!z4) {
                            scanInfoMaskView2.mo97662b(false);
                        } else {
                            scanInfoMaskView2.f205547p = false;
                            scanInfoMaskView2.f205553v = true;
                            scanInfoMaskView2.f205554w = z4;
                            View view5 = scanInfoMaskView2.f205540f;
                            if (view5 != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(0);
                                View view6 = view5;
                                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                scanInfoMaskView2.setVisibility(4);
                                scanInfoMaskView2.post(new C78226a0(scanInfoMaskView2));
                            } else {
                                C87412m.m108603p("loadingLayout");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("opButton");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("infoLayout");
                    throw null;
                }
            }
            BaseScanMaskView<BaseScanRequest> baseScanMaskView2 = this.f205485b;
            if (baseScanMaskView2 != null) {
                baseScanMaskView2.mo151736q(z3);
            }
        }
    }
}
