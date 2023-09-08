package h60;

import android.os.Bundle;
import b50.C54410e;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import nj3.C76912y0;
import y50.C66519j0;

/* renamed from: h60.l */
public final class C59761l implements C54410e {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170654d;

    public C59761l(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        this.f170654d = liveAnchorPluginLayout;
    }

    public void callback(int i, Bundle bundle) {
        Log.m105924i("MicroMsg.LiveCoreAnchor", "on enterRoom finish");
        if (i >= 0) {
            C58124b.C7172a.m7372a(this.f170654d, C58124b.C58125b.START_LIVE, (Bundle) null, 2, (Object) null);
            C66519j0 j0Var = C66519j0.f191358d;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            j0Var.mo90604h(RoomLiveService.f157192c);
            C58124b.C7172a.m7372a(this.f170654d, C58124b.C58125b.LIVE_START_LIVE_SUCCESS, (Bundle) null, 2, (Object) null);
            return;
        }
        Log.m105928w("MicroMsg.LiveCoreAnchor", "enter room fail");
        C76912y0.makeText(this.f170654d.getContext(), (CharSequence) "enter room fail", 0).show();
        C58124b.C7172a.m7372a(this.f170654d, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("live_user_exit_reason", i);
        this.f170654d.statusChange(C58124b.C58125b.LIVE_START_LIVE_FAILED, bundle2);
    }
}
