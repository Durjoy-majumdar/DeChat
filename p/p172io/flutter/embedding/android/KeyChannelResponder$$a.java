package p172io.flutter.embedding.android;

import p172io.flutter.embedding.android.KeyboardManager;
import p172io.flutter.embedding.engine.systemchannels.KeyEventChannel;

/* renamed from: io.flutter.embedding.android.KeyChannelResponder$$a */
public final /* synthetic */ class KeyChannelResponder$$a implements KeyEventChannel.EventResponseHandler {

    /* renamed from: a */
    public final /* synthetic */ KeyboardManager.Responder.OnKeyEventHandledCallback f324796a;

    public /* synthetic */ KeyChannelResponder$$a(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.f324796a = onKeyEventHandledCallback;
    }

    public final void onFrameworkResponse(boolean z) {
        this.f324796a.onKeyEventHandled(Boolean.valueOf(z));
    }
}
