package vl2;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;

/* renamed from: vl2.z */
public final class C102223z {

    /* renamed from: a */
    public static final C102223z f301005a = new C102223z();

    static {
        String str = C86709a0.m107535s().f251806d + "scan_product_tmp/";
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
    }

    /* renamed from: a */
    public static byte[] m134694a(byte[] bArr, int i, Point point, int i2, Rect rect, int i3, Object obj) {
        Point point2 = point;
        Rect rect2 = (i3 & 16) != 0 ? null : rect;
        byte[] bArr2 = bArr;
        C87412m.m108594g(bArr, "yuv");
        C87412m.m108594g(point2, "targetSize");
        long currentTimeMillis = System.currentTimeMillis();
        if (rect2 == null) {
            rect2 = new Rect(0, 0, point2.x, point2.y);
        }
        YuvImage yuvImage = new YuvImage(bArr, i, point2.x, point2.y, (int[]) null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            yuvImage.compressToJpeg(rect2, i2, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Log.m105919d("MicroMsg.ScanYuvUtils", "convertYUVToJpeg cost: %s ms, jpgSize: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(byteArray.length));
            return byteArray;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanYuvUtils", e, "convertYUVToJpeg exception %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final String mo141781b(String str) {
        return C86709a0.m107535s().f251806d + "scan_product_tmp/" + str;
    }
}
