package or0;

import android.content.DialogInterface;
import fy3.C32224a;
import rx3.C13598b0;

/* renamed from: or0.b */
public final class C11724b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f34305d;

    public C11724b(C32224a<C13598b0> aVar) {
        this.f34305d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f34305d.invoke();
    }
}
