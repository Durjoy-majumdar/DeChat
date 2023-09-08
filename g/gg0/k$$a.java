package gg0;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMobilePolicyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import zt3.C119157j;

public final /* synthetic */ class k$$a implements C1256g {
    /* renamed from: a */
    public final void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = BindMobilePolicyUI.f344310C;
        if (bundle != null) {
            String string = bundle.getString("key_wording_cfg");
            if (!Util.isNullOrNil(string)) {
                ((C119157j) C119157j.f356862d).mo183895z(new k$$d(string));
                return;
            }
            Log.m105924i("MicroMsg.BindMobilePolicyUI", "checkAndStartBindPhoneGuidance config is empty");
        }
    }
}
