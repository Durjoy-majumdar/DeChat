package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$i0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74947a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$i0(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74947a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35838Q(this.f74947a, obj, reply);
    }
}
