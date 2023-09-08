package p737wf;

import android.content.Context;
import p981ie.C117159b;

/* renamed from: wf.b$$c */
public final /* synthetic */ class b$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f355312d;

    public /* synthetic */ b$$c(Context context) {
        this.f355312d = context;
    }

    public final void run() {
        Context context = this.f355312d;
        if (C117159b.m165218s(context)) {
            C118763b.m167463a("posInCharge", "batt_amp_charge_pos", "batt_amp_charge_neg", new b$$d(context));
        } else {
            C118763b.m167463a("posOutOfCharge", "batt_amp_uncharge_pos", "batt_amp_uncharge_neg", new b$$e(context));
        }
    }
}
