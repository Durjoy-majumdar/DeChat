package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$m implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74954a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$m(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74954a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35868w(this.f74954a, obj, reply);
    }
}
