package p172io.flutter.plugin.editing;

import android.view.View;
import p172io.flutter.embedding.engine.systemchannels.TextInputChannel;

/* renamed from: io.flutter.plugin.editing.WxKeyboardAction */
public interface WxKeyboardAction {
    boolean hideKeyboard();

    boolean showKeyboard(View view, TextInputChannel.WxInputConfiguration wxInputConfiguration);
}
