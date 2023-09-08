package vk2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.box.webview.BoxWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C45520t;
import e00.C7574m0;
import f40.C86709a0;
import t83.C13856j1;

/* renamed from: vk2.r */
public final class C14887r implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C52958x f40918d;

    public C14887r(C52958x xVar) {
        this.f40918d = xVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Log.m105925i("MicroMsg.ScanBoxDialog", "dismiss dialog exitType: %s", Integer.valueOf(this.f40918d.f147819u));
        C52958x xVar = this.f40918d;
        C52959y yVar = xVar.f147816r;
        if (yVar != null) {
            yVar.mo24321a(dialogInterface, xVar.f147819u);
        }
        C52958x xVar2 = this.f40918d;
        xVar2.getClass();
        ((C7574m0) C86312j.m106911c(C7574m0.class)).mo8344P6(C13856j1.f39003b);
        C52947e0 e0Var = xVar2.f147814p;
        if (e0Var != null) {
            if (e0Var.f147792e != null) {
                C86709a0.m107524d().mo123458d(e0Var.f147792e);
            }
            C86709a0.m107524d().mo123470p(1532, e0Var);
        }
        BoxWebView boxWebView = xVar2.f147813o;
        if (boxWebView != null) {
            boxWebView.destroy();
        }
        xVar2.f147813o = null;
        if (xVar2.f147815q != null) {
            C14883d0.f40915g.f40908a.clear();
        }
        C45520t tVar = xVar2.f147809h;
        if (tVar != null) {
            tVar.onDestroy();
        }
    }
}
