package jy2;

import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import ky2.C10432i;
import te3.C77984q62;

public final /* synthetic */ class b$$a implements IMvvmObserver {
    public final void onChanged(Object obj) {
        C77984q62 q622 = (C77984q62) obj;
        if (!C86709a0.m107522a()) {
            Log.m105928w("PluginTeenMode", "not login, skip notifyTeenModeDataChanged().");
            return;
        }
        Log.m105924i("PluginTeenMode", "ProfileUpdateEvent observer");
        ((C10432i) C86312j.m106911c(C10432i.class)).I40();
    }
}
