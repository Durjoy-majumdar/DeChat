package com.tencent.p014mm.p136ui.tools;

import android.media.AudioManager;
import android.speech.tts.TextToSpeech;

/* renamed from: com.tencent.mm.ui.tools.m */
public class C19843m {

    /* renamed from: a */
    public static TextToSpeech f56474a;

    /* renamed from: b */
    public static AudioManager f56475b;

    /* renamed from: a */
    public static void m21550a() {
        TextToSpeech textToSpeech = f56474a;
        if (textToSpeech != null) {
            textToSpeech.stop();
            f56474a.shutdown();
            f56474a = null;
        }
        AudioManager audioManager = f56475b;
        if (audioManager != null) {
            audioManager.setSpeakerphoneOn(true);
            f56475b.setMode(0);
        }
    }
}
