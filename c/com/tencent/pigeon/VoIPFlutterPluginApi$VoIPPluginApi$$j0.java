package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$j0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74949a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$j0(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74949a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35839R(this.f74949a, obj, reply);
    }
}
