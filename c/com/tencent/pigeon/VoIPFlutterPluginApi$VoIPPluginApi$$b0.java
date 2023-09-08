package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$b0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74933a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$b0(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74933a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35832K(this.f74933a, obj, reply);
    }
}
