package w80;

import android.media.MediaFormat;
import gy3.C87412m;

/* renamed from: w80.g */
public final class C111749g {
    /* renamed from: a */
    public static final int m152381a(MediaFormat mediaFormat, String str, int i) {
        C87412m.m108594g(mediaFormat, "<this>");
        C87412m.m108594g(str, "key");
        try {
            return mediaFormat.getInteger(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
