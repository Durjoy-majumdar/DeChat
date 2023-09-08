package androidx.compose.p002ui.platform;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.a */
public abstract class C103605a implements C103621f {

    /* renamed from: a */
    public String f306049a;

    /* renamed from: b */
    public final int[] f306050b = new int[2];

    /* renamed from: c */
    public final int[] mo144707c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f306050b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* renamed from: d */
    public final String mo144708d() {
        String str = this.f306049a;
        if (str != null) {
            return str;
        }
        C87412m.m108603p(MimeTypes.BASE_TYPE_TEXT);
        throw null;
    }
}
