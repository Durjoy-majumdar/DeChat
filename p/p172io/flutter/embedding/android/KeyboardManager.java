package p172io.flutter.embedding.android;

import android.view.KeyEvent;
import android.view.View;
import java.util.HashSet;
import p172io.flutter.Log;
import p172io.flutter.plugin.editing.TextInputPlugin;

/* renamed from: io.flutter.embedding.android.KeyboardManager */
public class KeyboardManager {
    private static final String TAG = "KeyboardManager";
    private final HashSet<KeyEvent> redispatchedEvents = new HashSet<>();
    public final Responder[] responders;
    private final TextInputPlugin textInputPlugin;
    private final View view;

    /* renamed from: io.flutter.embedding.android.KeyboardManager$PerEventCallbackBuilder */
    public class PerEventCallbackBuilder {
        public boolean isEventHandled = false;
        public final KeyEvent keyEvent;
        public int unrepliedCount;

        /* renamed from: io.flutter.embedding.android.KeyboardManager$PerEventCallbackBuilder$Callback */
        public class Callback implements Responder.OnKeyEventHandledCallback {
            public boolean isCalled;

            private Callback() {
                this.isCalled = false;
            }

            public void onKeyEventHandled(Boolean bool) {
                if (!this.isCalled) {
                    this.isCalled = true;
                    PerEventCallbackBuilder perEventCallbackBuilder = PerEventCallbackBuilder.this;
                    perEventCallbackBuilder.unrepliedCount--;
                    perEventCallbackBuilder.isEventHandled = bool.booleanValue() | perEventCallbackBuilder.isEventHandled;
                    PerEventCallbackBuilder perEventCallbackBuilder2 = PerEventCallbackBuilder.this;
                    if (perEventCallbackBuilder2.unrepliedCount == 0 && !perEventCallbackBuilder2.isEventHandled) {
                        KeyboardManager.this.onUnhandled(perEventCallbackBuilder2.keyEvent);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        public PerEventCallbackBuilder(KeyEvent keyEvent2) {
            this.unrepliedCount = KeyboardManager.this.responders.length;
            this.keyEvent = keyEvent2;
        }

        public Responder.OnKeyEventHandledCallback buildCallback() {
            return new Callback();
        }
    }

    /* renamed from: io.flutter.embedding.android.KeyboardManager$Responder */
    public interface Responder {

        /* renamed from: io.flutter.embedding.android.KeyboardManager$Responder$OnKeyEventHandledCallback */
        public interface OnKeyEventHandledCallback {
            void onKeyEventHandled(Boolean bool);
        }

        void handleEvent(KeyEvent keyEvent, OnKeyEventHandledCallback onKeyEventHandledCallback);
    }

    public KeyboardManager(View view2, TextInputPlugin textInputPlugin2, Responder[] responderArr) {
        this.view = view2;
        this.textInputPlugin = textInputPlugin2;
        this.responders = responderArr;
    }

    /* access modifiers changed from: private */
    public void onUnhandled(KeyEvent keyEvent) {
        if (!this.textInputPlugin.handleKeyEvent(keyEvent) && this.view != null) {
            this.redispatchedEvents.add(keyEvent);
            this.view.getRootView().dispatchKeyEvent(keyEvent);
            if (this.redispatchedEvents.remove(keyEvent)) {
                Log.m165292w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void destroy() {
        int size = this.redispatchedEvents.size();
        if (size > 0) {
            Log.m165292w(TAG, "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public boolean handleEvent(KeyEvent keyEvent) {
        if (this.redispatchedEvents.remove(keyEvent)) {
            return false;
        }
        if (this.responders.length > 0) {
            PerEventCallbackBuilder perEventCallbackBuilder = new PerEventCallbackBuilder(keyEvent);
            for (Responder handleEvent : this.responders) {
                handleEvent.handleEvent(keyEvent, perEventCallbackBuilder.buildCallback());
            }
            return true;
        }
        onUnhandled(keyEvent);
        return true;
    }
}
