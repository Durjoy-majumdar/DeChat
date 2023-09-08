package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$y implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74976a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$y(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74976a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35829H(this.f74976a, obj, reply);
    }
}
