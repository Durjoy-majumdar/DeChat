package com.tencent.pigeon;

import com.tencent.pigeon.MJTemplateApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class MJTemplateApi$HostPageLaunch$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ MJTemplateApi.HostPageLaunch f74892a;

    public /* synthetic */ MJTemplateApi$HostPageLaunch$$a(MJTemplateApi.HostPageLaunch hostPageLaunch) {
        this.f74892a = hostPageLaunch;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        MJTemplateApi.HostPageLaunch.lambda$setup$0(this.f74892a, obj, reply);
    }
}
