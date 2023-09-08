package androidx.media;

import android.media.AudioAttributes;
import p584k4.C108881b;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C108881b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f44662a = (AudioAttributes) bVar.mo160007m(audioAttributesImplApi26.f44662a, 1);
        audioAttributesImplApi26.f44663b = bVar.mo160005k(audioAttributesImplApi26.f44663b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C108881b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f44662a;
        bVar.mo160010p(1);
        bVar.mo160016v(audioAttributes);
        bVar.mo160015u(audioAttributesImplApi26.f44663b, 2);
    }
}
