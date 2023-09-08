package com.tencent.p014mm.ipcinvoker.wx_extension;

import com.tencent.p014mm.ipcinvoker.wx_extension.C80933n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.q */
public class C1265q implements Runnable {
    public void run() {
        C85801v1 i;
        long nowMilliSecond;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IPC_EXT_MM_PROTOBUF_TRANSFER_MMKV_LARGE_FILE_CLEAR_CHECK_TIMESTAMP_LONG;
        try {
            if (C86709a0.m107535s().mo121142i().mo119673G(aVar, 0) + C1266r.f10318d <= Util.nowMilliSecond()) {
                MultiProcessMMKV multiProcessMMKV = C80933n.C1263a.f10317a;
                boolean z = multiProcessMMKV.totalSize() >= 20971520;
                Log.m105925i("MicroMsg.PluginIPC", "do check MMProtoBuf mmkv file too large, needClear[%b]", Boolean.valueOf(z));
                if (z) {
                    multiProcessMMKV.clearAll();
                }
                i = C86709a0.m107535s().mo121142i();
                nowMilliSecond = Util.nowMilliSecond();
                i.mo119677K(aVar, Long.valueOf(nowMilliSecond));
            }
        } catch (Throwable unused) {
        }
    }
}
