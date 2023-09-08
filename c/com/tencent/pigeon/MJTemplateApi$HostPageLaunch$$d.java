package com.tencent.pigeon;

import com.tencent.pigeon.MJTemplateApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MJTemplateApi$HostPageLaunch$$d implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MJTemplateApi.HostPageLaunch f74895a;

    public /* synthetic */ MJTemplateApi$HostPageLaunch$$d(MJTemplateApi.HostPageLaunch hostPageLaunch) {
        this.f74895a = hostPageLaunch;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MJTemplateApi.HostPageLaunch.lambda$setup$3(this.f74895a, obj, reply);
    }
}
