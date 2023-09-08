package y12;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.kidswatch.p066ui.reg.KidsWatchRegRebindUI;
import f40.C86709a0;
import w12.C65924c;

/* renamed from: y12.d */
public final class C112369d implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C65924c f336433d;

    /* renamed from: e */
    public final /* synthetic */ KidsWatchRegRebindUI f336434e;

    public C112369d(C65924c cVar, KidsWatchRegRebindUI kidsWatchRegRebindUI) {
        this.f336433d = cVar;
        this.f336434e = kidsWatchRegRebindUI;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f336433d);
        C86709a0.m107524d().mo123470p(5888, this.f336434e);
    }
}
