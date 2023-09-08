package p737wf;

import android.content.Context;

/* renamed from: wf.b$$a */
public final /* synthetic */ class b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f355308d;

    /* renamed from: e */
    public final /* synthetic */ int f355309e;

    public /* synthetic */ b$$a(Context context, int i) {
        this.f355308d = context;
        this.f355309e = i;
    }

    public final void run() {
        C118763b.m167463a("ampInMicro", "batt_amp_micro_pos", "batt_amp_micro_neg", new b$$b(this.f355308d, this.f355309e));
    }
}
