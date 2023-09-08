package com.tencent.p014mm.service;

import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.platformtools.BroadcastHelper;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.service.ProcessService$MMProcessService */
public class ProcessService$MMProcessService extends CommonProcessService {

    /* renamed from: i */
    public CoreService.C114706e f348003i = null;

    /* renamed from: c */
    public String mo174289c() {
        return "MicroMsg.MMProcessService";
    }

    public void onCreate() {
        Class<BroadcastHelper> cls = BroadcastHelper.class;
        try {
            int i = BroadcastHelper.f310937a;
            CoreService.C114706e newInstance = cls.newInstance();
            this.f348003i = newInstance;
            Log.m105919d("MicroMsg.MMProcessService", "broadcastRegisterHelper = %s", newInstance);
            this.f348003i.registerBroadcasts();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMProcessService", "onCreate Class.forName(com.tencent.mm.platformtools.BroadcastHelper) Exception = %s ", e.getMessage());
        }
        super.onCreate();
    }

    public void onDestroy() {
        CoreService.C114706e eVar = this.f348003i;
        if (eVar != null) {
            try {
                eVar.unRegisterBroadcasts();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MMProcessService", "onDestroy unRegisterBroadcasts() Exception = %s ", e.getMessage());
            }
        }
        super.onDestroy();
    }
}
