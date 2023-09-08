package qo3;

import android.text.Layout;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: qo3.h */
public class C77405h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77389a f225715d;

    /* renamed from: e */
    public final /* synthetic */ C77398g f225716e;

    public C77405h(C77398g gVar, C77389a aVar) {
        this.f225716e = gVar;
        this.f225715d = aVar;
    }

    public void run() {
        Layout layout = this.f225716e.f225693g.getLayout();
        if (layout != null && layout.getEllipsisCount(0) > 0) {
            C85975v4.m106306c("MicroMsg.MMAlertDialog", "PositiveButton text too long, show updown mode!!", new Object[0]);
            C77398g.m93306d(this.f225716e, this.f225715d);
        }
    }
}
