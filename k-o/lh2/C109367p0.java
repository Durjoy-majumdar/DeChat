package lh2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import i21.C60242i;
import k21.C60960c;
import qh2.C101198e;

/* renamed from: lh2.p0 */
public final class C109367p0 implements MMSightRecordButton.C105504k {

    /* renamed from: a */
    public final /* synthetic */ C109360o0 f327404a;

    public C109367p0(C109360o0 o0Var) {
        this.f327404a = o0Var;
    }

    /* renamed from: a */
    public final void mo128045a() {
        long j = this.f327404a.f327389r;
        if (j == -1 || Util.ticksToNow(j) > ((long) this.f327404a.f327388q)) {
            Log.m105925i("MicroMsg.MMRecordUI", "onSimpleTap %s", Util.getStack().toString());
            C101198e.C62622a.m73576a(this.f327404a.f327379e, C101198e.C101199b.RECORD_PICTURE, (Bundle) null, 2, (Object) null);
            this.f327404a.f327389r = Util.currentTicks();
        } else {
            Log.m105925i("MicroMsg.MMRecordUI", "onSimpleTap too often! %s", Util.getStack().toString());
        }
        C60960c.f173618a.mo85927k("SnsPublishProcess", "endSessionShot", 1, C60242i.APPEND);
    }
}
