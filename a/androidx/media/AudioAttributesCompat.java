package androidx.media;

import android.util.SparseIntArray;
import p584k4.C108883d;

public class AudioAttributesCompat implements C108883d {

    /* renamed from: b */
    public static final /* synthetic */ int f306545b = 0;

    /* renamed from: a */
    public AudioAttributesImpl f306546a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    /* renamed from: c */
    public static int m138181c(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f306546a;
        return audioAttributesImpl == null ? audioAttributesCompat.f306546a == null : audioAttributesImpl.equals(audioAttributesCompat.f306546a);
    }

    public int hashCode() {
        return this.f306546a.hashCode();
    }

    public String toString() {
        return this.f306546a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f306546a = audioAttributesImpl;
    }
}
