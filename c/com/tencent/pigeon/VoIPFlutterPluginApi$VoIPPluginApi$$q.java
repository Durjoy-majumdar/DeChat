package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$q implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74962a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$q(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74962a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35822A(this.f74962a, obj, reply);
    }
}
