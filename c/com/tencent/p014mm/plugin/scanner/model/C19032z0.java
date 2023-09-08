package com.tencent.p014mm.plugin.scanner.model;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanUIRectView;
import com.tencent.p014mm.plugin.scanner.view.BaseScanMaskView;
import gy3.C87412m;
import nl2.C21671i;
import nl2.C21672j;
import nl2.C21680p;
import nl2.C21683r;

/* renamed from: com.tencent.mm.plugin.scanner.model.z0 */
public final class C19032z0 {

    /* renamed from: a */
    public final C71004i f53514a;

    /* renamed from: b */
    public C19033a f53515b;

    /* renamed from: c */
    public long f53516c = -1;

    /* renamed from: d */
    public C19034b f53517d = new C19034b(this);

    /* renamed from: e */
    public C21672j f53518e;

    /* renamed from: f */
    public DialogInterface.OnCancelListener f53519f;

    /* renamed from: com.tencent.mm.plugin.scanner.model.z0$a */
    public interface C19033a {
        /* renamed from: a */
        void mo24280a(C21680p pVar, int i, long j, int i2, String str);

        /* renamed from: b */
        void mo24281b(C21680p pVar);
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.z0$b */
    public static final class C19034b implements C21671i {

        /* renamed from: a */
        public final /* synthetic */ C19032z0 f53520a;

        public C19034b(C19032z0 z0Var) {
            this.f53520a = z0Var;
        }

        /* renamed from: a */
        public void mo24282a(C21680p pVar) {
            C19033a aVar;
            C87412m.m108594g(pVar, "result");
            C19032z0 z0Var = this.f53520a;
            if (z0Var.f53516c == pVar.f61354b && (aVar = z0Var.f53515b) != null) {
                aVar.mo24281b(pVar);
            }
        }

        /* renamed from: b */
        public void mo24283b(C21680p pVar, int i, String str) {
            C87412m.m108594g(pVar, "result");
        }

        /* renamed from: c */
        public boolean mo24284c(C21683r rVar) {
            C87412m.m108594g(rVar, "scanProductResult");
            return false;
        }

        /* renamed from: d */
        public void mo24285d(C21680p pVar, int i, String str) {
            C87412m.m108594g(pVar, "result");
            C19032z0 z0Var = this.f53520a;
            long j = z0Var.f53516c;
            long j2 = pVar.f61354b;
            if (j == j2) {
                C19033a aVar = z0Var.f53515b;
                if (aVar != null) {
                    aVar.mo24280a(pVar, pVar.f61353a, j2, i, str);
                }
                ScanUIRectView scanUIRectView = ((BaseScanUI) this.f53520a.f53514a).f53562e;
                BaseScanMaskView scanMaskView = scanUIRectView != null ? scanUIRectView.getScanMaskView() : null;
                if (scanMaskView != null) {
                    scanMaskView.mo151685s(false, (DialogInterface.OnCancelListener) null);
                }
            }
        }

        /* renamed from: e */
        public void mo24286e(C21680p pVar) {
            C87412m.m108594g(pVar, "result");
        }
    }

    public C19032z0(C71004i iVar) {
        C87412m.m108594g(iVar, "scanUIModel");
        this.f53514a = iVar;
    }
}
