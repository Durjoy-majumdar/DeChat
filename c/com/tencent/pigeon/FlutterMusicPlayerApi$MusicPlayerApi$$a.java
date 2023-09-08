package com.tencent.pigeon;

import com.tencent.pigeon.FlutterMusicPlayerApi;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterMusicPlayerApi$MusicPlayerApi$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterMusicPlayerApi.MusicPlayerApi f74857a;

    public /* synthetic */ FlutterMusicPlayerApi$MusicPlayerApi$$a(FlutterMusicPlayerApi.MusicPlayerApi musicPlayerApi) {
        this.f74857a = musicPlayerApi;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterMusicPlayerApi.MusicPlayerApi.lambda$setup$0(this.f74857a, obj, reply);
    }
}
