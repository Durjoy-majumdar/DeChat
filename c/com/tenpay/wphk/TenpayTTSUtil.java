package com.tenpay.wphk;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import java.util.HashMap;

public class TenpayTTSUtil {
    private static boolean sEnabled = true;
    private static TextToSpeech sTts;

    public static void destroy() {
        TextToSpeech textToSpeech = sTts;
        if (textToSpeech != null) {
            textToSpeech.stop();
            sTts.shutdown();
            sTts = null;
        }
    }

    public static void init(Context context) {
        if (sTts == null) {
            sTts = new TextToSpeech(context.getApplicationContext(), (TextToSpeech.OnInitListener) null);
        }
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    public static void speak(String str) {
        if (sEnabled && sTts != null && !TextUtils.isEmpty(str)) {
            sTts.speak(str, 1, (HashMap) null);
        }
    }

    public static void stop() {
        TextToSpeech textToSpeech = sTts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    public static void speak(CharSequence charSequence) {
        if (sEnabled && sTts != null && !TextUtils.isEmpty(charSequence)) {
            sTts.speak(charSequence.toString(), 1, (HashMap) null);
        }
    }
}
