package vk2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;

/* renamed from: vk2.q */
public final class C52952q implements DialogInterface.OnShowListener {

    /* renamed from: d */
    public final /* synthetic */ C52958x f147795d;

    public C52952q(C52958x xVar) {
        this.f147795d = xVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        BaseBoxDialogView baseBoxDialogView = this.f147795d.f147817s;
        if (baseBoxDialogView != null) {
            baseBoxDialogView.mo151556j();
        }
        C52959y yVar = this.f147795d.f147816r;
        if (yVar != null) {
            yVar.onShow(dialogInterface);
        }
    }
}
