package com.tencent.pigeon;

import com.tencent.pigeon.VoIPFlutterPluginApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class VoIPFlutterPluginApi$VoIPPluginApi$$s0 implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ VoIPFlutterPluginApi.VoIPPluginApi f74967a;

    public /* synthetic */ VoIPFlutterPluginApi$VoIPPluginApi$$s0(VoIPFlutterPluginApi.VoIPPluginApi voIPPluginApi) {
        this.f74967a = voIPPluginApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        VoIPFlutterPluginApi.VoIPPluginApi.CC.m35854i(this.f74967a, obj, reply);
    }
}
