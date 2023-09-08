package tl2;

import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import lp3.C88631d;
import op3.C117877b;

/* renamed from: tl2.t */
public final class C111034t implements C88631d.C76721a<C117877b<Boolean, String>> {

    /* renamed from: a */
    public final /* synthetic */ ScanGoodsMaskView f332513a;

    public C111034t(ScanGoodsMaskView scanGoodsMaskView) {
        this.f332513a = scanGoodsMaskView;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        C117877b bVar = (C117877b) obj;
        Object[] objArr = new Object[2];
        String str = null;
        boolean z = false;
        objArr[0] = bVar != null ? (Boolean) bVar.mo182596a(0) : null;
        if (bVar != null) {
            str = (String) bVar.mo182596a(1);
        }
        objArr[1] = str;
        Log.m105921e("MicroMsg.ScanGoodsMaskView", "alvinluo showCustomView onInterrupt result: %s, %s", objArr);
        if (bVar != null) {
            z = C87412m.m108589b(bVar.mo182596a(0), Boolean.FALSE);
        }
        if (z) {
            ScanGoodsMaskView scanGoodsMaskView = this.f332513a;
            int i = ScanGoodsMaskView.f315898W0;
            scanGoodsMaskView.mo151693z();
        }
    }
}
