package rv3;

import com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI;
import com.tencent.tav.core.ExportErrorStatus;

/* renamed from: rv3.d */
public class C90102d {

    /* renamed from: a */
    public static final int[] f258757a = {118, 28, 44, -104, -48, -42, -86, -20, 116, 86, -120, 116, 15, -72, 74, -76};

    /* renamed from: b */
    public static final int[] f258758b = {104, ZipJNI.UNZ_ERR_OPEN_WRITE, -82, 24, 97, -80, -13, ZipJNI.UNZ_CRCERROR, 108, 37, -93, -89, 21, 59, 9, -61, -78, -48, 72, -128};

    /* renamed from: c */
    public static final int[] f258759c = {31, -84, 34, 64, ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT, -91, 81, -125, -40, -22, 33, -67, -73, 123, -23, -93};

    /* renamed from: a */
    public static String m112732a(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        byte[] b = C90100b.m112724b(bArr, C90100b.m112727e());
        if (b == null) {
            return null;
        }
        return new String(b);
    }
}
