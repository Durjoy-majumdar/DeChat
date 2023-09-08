package lh2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.mmsight.p077ui.C105591z0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import i21.C60242i;
import k21.C60960c;
import qh2.C101198e;

/* renamed from: lh2.j0 */
public final class C109355j0 implements C105591z0 {

    /* renamed from: a */
    public final /* synthetic */ C109345h0 f327373a;

    public C109355j0(C109345h0 h0Var) {
        this.f327373a = h0Var;
    }

    /* renamed from: a */
    public void mo150438a() {
        long j = this.f327373a.f327355t;
        if (j == -1 || Util.ticksToNow(j) > ((long) this.f327373a.f327354s)) {
            Log.m105925i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap %s", Util.getStack().toString());
            C101198e.C62622a.m73576a(this.f327373a.f327343e, C101198e.C101199b.RECORD_PICTURE, (Bundle) null, 2, (Object) null);
            this.f327373a.f327344f.setTouchEnable(false);
            this.f327373a.f327355t = Util.currentTicks();
        } else {
            Log.m105925i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap too often! %s", Util.getStack().toString());
        }
        C60960c.f173618a.mo85927k("SnsPublishProcess", "endSessionShot", 1, C60242i.APPEND);
    }
}
