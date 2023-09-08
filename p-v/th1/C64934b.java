package th1;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import f50.C58915a;

/* renamed from: th1.b */
public final class C64934b extends C58915a {

    /* renamed from: d */
    public final /* synthetic */ C64935c f186974d;

    public C64934b(C64935c cVar) {
        this.f186974d = cVar;
    }

    public void onNetStatus(Bundle bundle) {
    }

    public void onPlayEvent(int i, Bundle bundle) {
        super.onPlayEvent(i, bundle);
        if (i == -2304) {
            String str = this.f186974d.f181104e;
            Log.m105924i(str, "preloadStartLivePlayer playEventErrors: " + i);
            C64935c.m76533z(this.f186974d, i);
        } else if (i == 2003) {
            Log.m105924i(this.f186974d.f181104e, "preloadStartLivePlayer onPlayEvent EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME");
        } else if (i == 2009) {
            Log.m105924i(this.f186974d.f181104e, "preloadStartLivePlayer onPlayEvent PLAY_EVT_CHANGE_RESOLUTION");
            C64935c.m76532y(this.f186974d, bundle);
        }
    }
}
