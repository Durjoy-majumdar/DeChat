package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f44662a;

    /* renamed from: b */
    public int f44663b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    public static class C16599a implements AudioAttributesImpl.C16598a {

        /* renamed from: a */
        public final AudioAttributes.Builder f44664a = new AudioAttributes.Builder();

        /* renamed from: b */
        public C16599a mo16918a(int i) {
            if (i == 16) {
                i = 12;
            }
            this.f44664a.setUsage(i);
            return this;
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f44664a.build(), -1);
        }
    }

    public AudioAttributesImplApi21() {
        this.f44663b = -1;
    }

    /* renamed from: a */
    public int mo16916a() {
        int i = this.f44663b;
        return i != -1 ? i : AudioAttributesCompat.m138181c(false, this.f44662a.getFlags(), this.f44662a.getUsage());
    }

    /* renamed from: b */
    public Object mo16917b() {
        return this.f44662a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f44662a.equals(((AudioAttributesImplApi21) obj).f44662a);
    }

    public int hashCode() {
        return this.f44662a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f44662a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f44662a = audioAttributes;
        this.f44663b = i;
    }
}
