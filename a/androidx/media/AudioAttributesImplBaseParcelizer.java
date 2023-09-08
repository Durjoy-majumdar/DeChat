package androidx.media;

import p584k4.C108881b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C108881b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f306547a = bVar.mo160005k(audioAttributesImplBase.f306547a, 1);
        audioAttributesImplBase.f306548b = bVar.mo160005k(audioAttributesImplBase.f306548b, 2);
        audioAttributesImplBase.f306549c = bVar.mo160005k(audioAttributesImplBase.f306549c, 3);
        audioAttributesImplBase.f306550d = bVar.mo160005k(audioAttributesImplBase.f306550d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C108881b bVar) {
        bVar.getClass();
        bVar.mo160015u(audioAttributesImplBase.f306547a, 1);
        bVar.mo160015u(audioAttributesImplBase.f306548b, 2);
        bVar.mo160015u(audioAttributesImplBase.f306549c, 3);
        bVar.mo160015u(audioAttributesImplBase.f306550d, 4);
    }
}
