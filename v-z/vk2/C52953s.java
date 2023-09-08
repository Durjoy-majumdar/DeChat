package vk2;

import android.content.DialogInterface;

/* renamed from: vk2.s */
public final class C52953s implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C52958x f147796d;

    public C52953s(C52958x xVar) {
        this.f147796d = xVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C52959y yVar = this.f147796d.f147816r;
        if (yVar != null) {
            yVar.onCancel(dialogInterface);
        }
    }
}
