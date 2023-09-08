package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    public static class C16600a extends AudioAttributesImplApi21.C16599a {
        /* renamed from: a */
        public AudioAttributesImpl.C16598a mo16918a(int i) {
            this.f44664a.setUsage(i);
            return this;
        }

        /* renamed from: b */
        public AudioAttributesImplApi21.C16599a mo16923b(int i) {
            this.f44664a.setUsage(i);
            return this;
        }

        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.f44664a.build());
        }
    }

    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
