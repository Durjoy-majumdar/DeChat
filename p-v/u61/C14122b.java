package u61;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: u61.b */
public final class C14122b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ Activity f39522d;

    public C14122b(int i, Activity activity, int i2) {
        this.f39522d = activity;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(1001, this.f39522d.getString(C0966R.string.c7w), C0966R.raw.bottomsheet_icon_transmit);
        e0Var.mo107144g(1000, this.f39522d.getString(C0966R.string.c7x), C0966R.raw.bottomsheet_icon_moment);
    }
}
