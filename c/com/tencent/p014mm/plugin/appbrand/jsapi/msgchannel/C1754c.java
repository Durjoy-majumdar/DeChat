package com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel;

import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannel;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannelList;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.ArrayList;
import kr0.C88267e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.c */
public class C1754c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f11495d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.c$a */
    public class C1755a implements Runnable {
        public C1755a() {
        }

        public void run() {
            ArrayList<WxaAppMsgChannel> arrayList;
            WxaAppMsgChannelList wxaAppMsgChannelList = (WxaAppMsgChannelList) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new IPCString(C1754c.this.f11495d.f238147j), C1756d.class);
            if (wxaAppMsgChannelList == null || (arrayList = wxaAppMsgChannelList.f108806d) == null || arrayList.size() < 0) {
                Log.m105920e("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "fetchWxaAppMsgChannelListSync cache is empty.");
                return;
            }
            Log.m105925i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "fetchWxaAppMsgChannelListSync appId:%s, cache list:%d", C1754c.this.f11495d.f238147j, Integer.valueOf(wxaAppMsgChannelList.f108806d.size()));
            new C40472e().mo63227s((C88267e) C1754c.this.f11495d.f238150p, wxaAppMsgChannelList.f108806d);
        }
    }

    public C1754c(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f11495d = appBrandRuntimeWC;
    }

    public void run() {
        Log.m105925i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "checkOrSendOnReceiveCacheMsgChannelBatch appId:%s", this.f11495d.f238147j);
        ((C119157j) C119157j.f356862d).mo183876g(new C1755a(), "checkOrSendOnReceiveCacheMsgChannelBatch");
    }
}
