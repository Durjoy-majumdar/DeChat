package v82;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: v82.z0 */
public final class C37701z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f99888d;

    public C37701z0(Context context) {
        this.f99888d = context;
    }

    public final void run() {
        Context context = this.f99888d;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.iak), 1).show();
    }
}
