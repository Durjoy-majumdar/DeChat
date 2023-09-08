package or0;

import android.content.DialogInterface;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: or0.g */
public final class C11727g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f34317d;

    public C11727g(C32224a<C13598b0> aVar) {
        this.f34317d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f34317d.invoke();
    }
}
