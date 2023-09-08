package p172io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import p172io.flutter.embedding.android.KeyboardManager;
import p172io.flutter.embedding.engine.systemchannels.KeyEventChannel;

/* renamed from: io.flutter.embedding.android.KeyChannelResponder */
public class KeyChannelResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyChannelResponder";
    private int combiningCharacter;
    private final KeyEventChannel keyEventChannel;

    public KeyChannelResponder(KeyEventChannel keyEventChannel2) {
        this.keyEventChannel = keyEventChannel2;
    }

    public Character applyCombiningCharacterToBaseCharacter(int i) {
        char c = (char) i;
        if ((Integer.MIN_VALUE & i) != 0) {
            int i2 = i & Integer.MAX_VALUE;
            int i3 = this.combiningCharacter;
            if (i3 != 0) {
                this.combiningCharacter = KeyCharacterMap.getDeadChar(i3, i2);
            } else {
                this.combiningCharacter = i2;
            }
        } else {
            int i4 = this.combiningCharacter;
            if (i4 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i4, i);
                if (deadChar > 0) {
                    c = (char) deadChar;
                }
                this.combiningCharacter = 0;
            }
        }
        return Character.valueOf(c);
    }

    public void handleEvent(KeyEvent keyEvent, KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        int action = keyEvent.getAction();
        boolean z = true;
        if (action == 0 || action == 1) {
            KeyEventChannel.FlutterKeyEvent flutterKeyEvent = new KeyEventChannel.FlutterKeyEvent(keyEvent, applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()));
            if (action == 0) {
                z = false;
            }
            this.keyEventChannel.sendFlutterKeyEvent(flutterKeyEvent, z, new KeyChannelResponder$$a(onKeyEventHandledCallback));
            return;
        }
        onKeyEventHandledCallback.onKeyEventHandled(Boolean.FALSE);
    }
}
