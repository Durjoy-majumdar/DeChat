package com.tencent.pigeon;

import com.tencent.pigeon.MJTemplateApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MJTemplateApi$HostPageLaunch$$c implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MJTemplateApi.HostPageLaunch f74894a;

    public /* synthetic */ MJTemplateApi$HostPageLaunch$$c(MJTemplateApi.HostPageLaunch hostPageLaunch) {
        this.f74894a = hostPageLaunch;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MJTemplateApi.HostPageLaunch.lambda$setup$2(this.f74894a, obj, reply);
    }
}
