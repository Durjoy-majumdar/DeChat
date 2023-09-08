package androidx.media;

import p584k4.C108881b;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C108881b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f306546a;
        if (bVar.mo160003i(1)) {
            obj = bVar.mo160009o();
        }
        audioAttributesCompat.f306546a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C108881b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f306546a;
        bVar.mo160010p(1);
        bVar.mo160018x(audioAttributesImpl);
    }
}
