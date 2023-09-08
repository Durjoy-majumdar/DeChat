package com.tinkerboots.sdk.tinker.service;

import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import hv3.C87598a;
import java.io.File;
import jv3.C88033a;

public class TinkerServerResultService extends DefaultTinkerResultService {
    /* renamed from: a */
    public void mo118340a(C87598a aVar) {
        if (aVar == null) {
            ShareTinkerLog.m106533v("Tinker.TinkerServerResultService", "received null result!!!!", new Object[0]);
            return;
        }
        ShareTinkerLog.m106533v("Tinker.TinkerServerResultService", "receive result: %s", aVar.toString());
        C88033a.m109602c(getApplicationContext());
        if (aVar.f253683d) {
            ShareTinkerLog.m106533v("Tinker.TinkerServerResultService", "patch success, please restart process", new Object[0]);
            mo120289d(new File(aVar.f253684e));
            if (!mo120288c(aVar)) {
                ShareTinkerLog.m106533v("Tinker.TinkerServerResultService", "I have already install the newly patch version!", new Object[0]);
                return;
            }
            return;
        }
        ShareTinkerLog.m106533v("Tinker.TinkerServerResultService", "patch fail, please check reason", new Object[0]);
    }
}
