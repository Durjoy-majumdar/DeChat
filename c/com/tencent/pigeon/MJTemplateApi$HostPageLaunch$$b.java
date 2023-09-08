package com.tencent.pigeon;

import com.tencent.pigeon.MJTemplateApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MJTemplateApi$HostPageLaunch$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MJTemplateApi.HostPageLaunch f74893a;

    public /* synthetic */ MJTemplateApi$HostPageLaunch$$b(MJTemplateApi.HostPageLaunch hostPageLaunch) {
        this.f74893a = hostPageLaunch;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MJTemplateApi.HostPageLaunch.lambda$setup$1(this.f74893a, obj, reply);
    }
}
