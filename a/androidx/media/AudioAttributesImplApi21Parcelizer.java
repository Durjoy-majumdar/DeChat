package androidx.media;

import android.media.AudioAttributes;
import p584k4.C108881b;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C108881b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f44662a = (AudioAttributes) bVar.mo160007m(audioAttributesImplApi21.f44662a, 1);
        audioAttributesImplApi21.f44663b = bVar.mo160005k(audioAttributesImplApi21.f44663b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C108881b bVar) {
        bVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f44662a;
        bVar.mo160010p(1);
        bVar.mo160016v(audioAttributes);
        bVar.mo160015u(audioAttributesImplApi21.f44663b, 2);
    }
}
