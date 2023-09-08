package com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannel;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannelList;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import np0.C89048m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.d */
final class C1756d implements C80916r<IPCString, WxaAppMsgChannelList> {
    private C1756d() {
    }

    public Object invoke(Object obj) {
        ArrayList<WxaAppMsgChannel> remove;
        IPCString iPCString = (IPCString) obj;
        try {
            Log.m105925i("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "ipc PullOnReceiveCacheMsgChannelBatchTask Task, src:%s", iPCString.toString());
            C89048m mVar = C89048m.INSTANCE;
            String iPCString2 = iPCString.toString();
            synchronized (mVar) {
                remove = mVar.f256698d.remove(iPCString2);
            }
            if (remove != null) {
                WxaAppMsgChannelList wxaAppMsgChannelList = new WxaAppMsgChannelList();
                wxaAppMsgChannelList.f108806d = remove;
                return wxaAppMsgChannelList;
            }
            Log.m105920e("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", "msgChannels is null");
            return new WxaAppMsgChannelList();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppBrandOnReceiveCacheMsgChannelBatchIPCPull", e, "ipc PullOnReceiveCacheMsgChannelBatchTask task", new Object[0]);
        }
    }
}
