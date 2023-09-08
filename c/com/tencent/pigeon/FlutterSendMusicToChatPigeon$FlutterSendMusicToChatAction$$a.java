package com.tencent.pigeon;

import com.tencent.pigeon.FlutterSendMusicToChatPigeon;
import p172io.flutter.plugin.common.BasicMessageChannel;

public final /* synthetic */ class FlutterSendMusicToChatPigeon$FlutterSendMusicToChatAction$$a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a */
    public final /* synthetic */ FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction f56813a;

    public /* synthetic */ FlutterSendMusicToChatPigeon$FlutterSendMusicToChatAction$$a(FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction flutterSendMusicToChatAction) {
        this.f56813a = flutterSendMusicToChatAction;
    }

    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        FlutterSendMusicToChatPigeon.FlutterSendMusicToChatAction.lambda$setup$0(this.f56813a, obj, reply);
    }
}
