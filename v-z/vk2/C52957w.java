package vk2;

import com.tencent.p014mm.plugin.webview.core.C43558z;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import e00.C45520t;

/* renamed from: vk2.w */
public final class C52957w extends C43558z {

    /* renamed from: b */
    public final /* synthetic */ C52958x f147800b;

    public C52957w(C52958x xVar) {
        this.f147800b = xVar;
    }

    /* renamed from: e */
    public void mo64862e() {
        C43791l m;
        try {
            C45520t tVar = this.f147800b.f147809h;
            if (tVar != null && (m = tVar.mo67731m()) != null) {
                C52958x xVar = this.f147800b;
                C52955u uVar = xVar.f147812n;
                C45520t tVar2 = xVar.f147809h;
                m.Np0(uVar, tVar2 != null ? tVar2.mo67719g() : 0);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ScanBoxDialog", th, "alvinluo initWebViewController exception", new Object[0]);
        }
    }
}
