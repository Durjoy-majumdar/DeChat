package b24;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: b24.p */
public class C113110p extends C113107m0 {

    /* renamed from: f */
    public int f338500f = 0;

    public C113110p() {
        this.f338498e = 282;
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        int i = this.f338496c;
        if (i < 5) {
            return Boolean.FALSE;
        }
        byte b = this.f338497d[8] & ExifInterface.MARKER;
        if (i < b + 5) {
            return Boolean.FALSE;
        }
        this.f338500f = b;
        return Boolean.TRUE;
    }
}
