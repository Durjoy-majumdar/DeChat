package o13;

import com.tencent.p014mm.plugin.updater.xlabupdater.XUpdateDownloadUI;
import fy3.C32224a;
import gy3.C87413o;
import qo3.C77398g;
import rx3.C13598b0;

/* renamed from: o13.b */
public final class C11326b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ XUpdateDownloadUI f33282d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11326b(XUpdateDownloadUI xUpdateDownloadUI) {
        super(0);
        this.f33282d = xUpdateDownloadUI;
    }

    public Object invoke() {
        C77398g gVar = this.f33282d.f21649i;
        if (gVar != null) {
            gVar.hide();
        }
        this.f33282d.f21649i = null;
        return C13598b0.f38549a;
    }
}
