package qo3;

import android.text.Layout;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: qo3.j */
public class C77406j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77389a f225717d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f225718e;

    public C77406j(C77398g gVar, C77389a aVar) {
        this.f225718e = gVar;
        this.f225717d = aVar;
    }

    public void run() {
        Layout layout = this.f225718e.f225694h.getLayout();
        if (layout != null && layout.getEllipsisCount(0) > 0) {
            C85975v4.m106306c("MicroMsg.MMAlertDialog", "NegativeButton text too long, show updown mode!!", new Object[0]);
            C77398g.m93306d(this.f225718e, this.f225717d);
        }
    }
}
