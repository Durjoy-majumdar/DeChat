package h60;

import android.os.Bundle;
import b50.C54410e;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import nj3.C76912y0;

/* renamed from: h60.p */
public final class C59764p implements C54410e {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170657d;

    public C59764p(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        this.f170657d = liveAnchorPluginLayout;
    }

    public void callback(int i, Bundle bundle) {
        Log.m105924i("MicroMsg.LiveCoreAnchor", "try resume live on enterRoom finish");
        if (i >= 0) {
            C58124b.C7172a.m7372a(this.f170657d, C58124b.C58125b.START_LIVE, (Bundle) null, 2, (Object) null);
            return;
        }
        Log.m105928w("MicroMsg.LiveCoreAnchor", "try resume live senter room fail");
        C76912y0.makeText(this.f170657d.getContext(), (CharSequence) "enter room fail", 0).show();
        C58124b.C7172a.m7372a(this.f170657d, C58124b.C58125b.BEFORE_LIVE, (Bundle) null, 2, (Object) null);
    }
}
