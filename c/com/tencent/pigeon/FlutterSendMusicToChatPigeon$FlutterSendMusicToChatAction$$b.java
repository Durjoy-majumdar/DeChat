package com.tencent.pigeon;

import com.tencent.pigeon.FlutterSendMusicToChatPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterSendMusicToChatPigeon$FlutterSendMusicToChatAction$$b implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction f56814a;

    public /* synthetic */ FlutterSendMusicToChatPigeon$FlutterSendMusicToChatAction$$b(FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction flutterSendMusicToChatAction) {
        this.f56814a = flutterSendMusicToChatAction;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction.lambda$setup$1(this.f56814a, obj, reply);
    }
}
