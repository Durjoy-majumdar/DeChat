package com.tencent.pigeon;

import com.tencent.pigeon.FlutterMusicPlayerApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterMusicPlayerApi$MusicPlayerApi$$k implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterMusicPlayerApi.MusicPlayerApi f74867a;

    public /* synthetic */ FlutterMusicPlayerApi$MusicPlayerApi$$k(FlutterMusicPlayerApi.MusicPlayerApi musicPlayerApi) {
        this.f74867a = musicPlayerApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterMusicPlayerApi.MusicPlayerApi.lambda$setup$8(this.f74867a, obj, reply);
    }
}
