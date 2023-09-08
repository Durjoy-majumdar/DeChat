package bn2;

import android.content.DialogInterface;
import android.os.CancellationSignal;

/* renamed from: bn2.e */
public final class C0334e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f913d;

    public C0334e(CancellationSignal cancellationSignal) {
        this.f913d = cancellationSignal;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f913d.cancel();
    }
}
