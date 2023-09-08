package com.tencent.pigeon;

import com.tencent.pigeon.FlutterMusicPlayerApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterMusicPlayerApi$MusicPlayerApi$$e implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterMusicPlayerApi.MusicPlayerApi f74861a;

    public /* synthetic */ FlutterMusicPlayerApi$MusicPlayerApi$$e(FlutterMusicPlayerApi.MusicPlayerApi musicPlayerApi) {
        this.f74861a = musicPlayerApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterMusicPlayerApi.MusicPlayerApi.lambda$setup$2(this.f74861a, obj, reply);
    }
}
