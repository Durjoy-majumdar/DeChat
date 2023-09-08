package com.tencent.pigeon;

import com.tencent.pigeon.FlutterMusicPlayerApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterMusicPlayerApi$MusicPlayerApi$$h implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterMusicPlayerApi.MusicPlayerApi f74864a;

    public /* synthetic */ FlutterMusicPlayerApi$MusicPlayerApi$$h(FlutterMusicPlayerApi.MusicPlayerApi musicPlayerApi) {
        this.f74864a = musicPlayerApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterMusicPlayerApi.MusicPlayerApi.lambda$setup$5(this.f74864a, obj, reply);
    }
}
