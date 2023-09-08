package p379r3;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: r3.b */
public final class C101337b {

    /* renamed from: r3.b$a */
    public static class C101338a {
        /* renamed from: a */
        public static int m132967a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        /* renamed from: b */
        public static int m132968b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    /* renamed from: a */
    public static int m132965a(AudioManager audioManager, C22198a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (aVar != null) {
            return Build.VERSION.SDK_INT >= 26 ? C101338a.m132967a(audioManager, (AudioFocusRequest) aVar.f62841f) : audioManager.abandonAudioFocus(aVar.f62837b);
        } else {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
    }

    /* renamed from: b */
    public static int m132966b(AudioManager audioManager, C22198a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        } else if (aVar != null) {
            return Build.VERSION.SDK_INT >= 26 ? C101338a.m132968b(audioManager, (AudioFocusRequest) aVar.f62841f) : audioManager.requestAudioFocus(aVar.f62837b, aVar.f62839d.f306546a.mo16916a(), aVar.f62836a);
        } else {
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
    }
}
