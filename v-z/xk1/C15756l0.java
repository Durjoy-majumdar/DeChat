package xk1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C8477a0;

/* renamed from: xk1.l0 */
public final class C15756l0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f42482d;

    public C15756l0(C8477a0 a0Var) {
        this.f42482d = a0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f42482d.f27482d = true;
        C115669n.INSTANCE.mo160131h(22385, 8, Long.valueOf(System.currentTimeMillis()));
    }
}
