package in0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.InputStream;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;

/* renamed from: in0.b */
public final class C87758b {

    /* renamed from: a */
    public static final C87758b f254077a = new C87758b();

    /* renamed from: a */
    public final boolean mo122162a(InputStream inputStream) {
        C87412m.m108594g(inputStream, "inputStream");
        byte[] bArr = new byte[32768];
        int read = inputStream.read(bArr, 0, 1024);
        int i = 0;
        boolean z = false;
        while (-1 != read) {
            i += read;
            String str = new String(bArr, 0, i, C119027c.f356488a);
            if (!z) {
                if (!C112551y.m153819s(str, "#EXTM3U", false)) {
                    Log.m105924i("MicroMsg.AppBrand.ContainerFormatInferCommons", "isHls, magicChecked fail");
                    return false;
                }
                z = true;
            }
            if (C112550d0.m153801u(str, "#EXT-X-STREAM-INF:", false) || C112550d0.m153801u(str, "#EXT-X-TARGETDURATION:", false) || C112550d0.m153801u(str, "#EXT-X-MEDIA-SEQUENCE:", false)) {
                Log.m105924i("MicroMsg.AppBrand.ContainerFormatInferCommons", "isHls, infer done, hadReadLen: " + i);
                return true;
            }
            int i2 = 32768 - i;
            if (i2 > 1024) {
                i2 = 1024;
            }
            if (i2 <= 0) {
                break;
            }
            read = inputStream.read(bArr, i, i2);
        }
        Log.m105924i("MicroMsg.AppBrand.ContainerFormatInferCommons", "isHls, infer done, hadReadLen: " + i + ", curReadLen: " + read);
        return false;
    }
}
