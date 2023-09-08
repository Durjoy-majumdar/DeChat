package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$k0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74951a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$k0(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74951a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35831J(this.f74951a, obj, reply);
    }
}
