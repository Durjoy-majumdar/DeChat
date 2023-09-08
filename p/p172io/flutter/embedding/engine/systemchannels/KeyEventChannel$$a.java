package p172io.flutter.embedding.engine.systemchannels;

import p172io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import p172io.flutter.plugin.common.BasicMessageChannel;

/* renamed from: io.flutter.embedding.engine.systemchannels.KeyEventChannel$$a */
public final /* synthetic */ class KeyEventChannel$$a implements BasicMessageChannel.Reply {

    /* renamed from: a */
    public final /* synthetic */ KeyEventChannel.EventResponseHandler f324799a;

    public /* synthetic */ KeyEventChannel$$a(KeyEventChannel.EventResponseHandler eventResponseHandler) {
        this.f324799a = eventResponseHandler;
    }

    public final void reply(Object obj) {
        KeyEventChannel.lambda$createReplyHandler$0(this.f324799a, obj);
    }
}
