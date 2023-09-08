package com.tencent.pigeon;

import com.tencent.pigeon.MJTemplateApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MJTemplateApi$HostPageLaunch$$e implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MJTemplateApi.HostPageLaunch f74896a;

    public /* synthetic */ MJTemplateApi$HostPageLaunch$$e(MJTemplateApi.HostPageLaunch hostPageLaunch) {
        this.f74896a = hostPageLaunch;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MJTemplateApi.HostPageLaunch.lambda$setup$4(this.f74896a, obj, reply);
    }
}
