package com.tencent.tinker.lib.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import bv3.C0386a;

public class TinkerPatchForeService extends Service {

    /* renamed from: com.tencent.tinker.lib.service.TinkerPatchForeService$a */
    public class C7107a extends C0386a {
        public C7107a(TinkerPatchForeService tinkerPatchForeService) {
        }
    }

    public IBinder onBind(Intent intent) {
        return new C7107a(this);
    }
}
