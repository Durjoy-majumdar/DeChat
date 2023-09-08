package com.tencent.pigeon;

import com.tencent.pigeon.FlutterMusicPlayerApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterMusicPlayerApi$MusicPlayerApi$$j implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterMusicPlayerApi.MusicPlayerApi f74866a;

    public /* synthetic */ FlutterMusicPlayerApi$MusicPlayerApi$$j(FlutterMusicPlayerApi.MusicPlayerApi musicPlayerApi) {
        this.f74866a = musicPlayerApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterMusicPlayerApi.MusicPlayerApi.lambda$setup$7(this.f74866a, obj, reply);
    }
}
