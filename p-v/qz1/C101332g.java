package qz1;

import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Arrays;

/* renamed from: qz1.g */
public class C101332g implements C101324a {

    /* renamed from: a */
    public long f296870a = 0;

    /* renamed from: b */
    public String f296871b;

    /* renamed from: c */
    public int f296872c;

    /* renamed from: d */
    public int f296873d;

    /* renamed from: e */
    public long f296874e;

    public C101332g(String str, int i, int i2, long j) {
        this.f296871b = str;
        this.f296872c = i;
        this.f296873d = i2;
        this.f296874e = j;
        Log.m105925i("MicroMsg.MMGifEncoder", "create MMGifEncoder, width: %s, height: %s, frameDurationMs: %s, outputPath: %s", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), str);
    }

    /* renamed from: a */
    public boolean mo140810a(byte[] bArr, long j) {
        if (this.f296870a != 0 && !Util.isNullOrNil(bArr)) {
            int length = bArr.length;
            int i = this.f296872c;
            int i2 = this.f296873d;
            if (length == i * i2 * 4) {
                int nativeAddGifEncodeRgbaFrame = MMWXGFJNI.nativeAddGifEncodeRgbaFrame(this.f296870a, i, i2, bArr, j >= 0 ? j : this.f296874e);
                if (nativeAddGifEncodeRgbaFrame >= 0) {
                    return true;
                }
                Log.m105921e("MicroMsg.MMGifEncoder", "add rgba frame failed: %s", Integer.valueOf(nativeAddGifEncodeRgbaFrame));
                return false;
            }
        }
        Log.m105924i("MicroMsg.MMGifEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
        return false;
    }

    /* renamed from: b */
    public boolean mo140811b() {
        long j = this.f296870a;
        if (j != 0) {
            byte[] nativeFinishGifEncode = MMWXGFJNI.nativeFinishGifEncode(j);
            if (nativeFinishGifEncode == null || nativeFinishGifEncode.length <= 0) {
                Log.m105925i("MicroMsg.MMGifEncoder", "finish encode error, buf: %s", Arrays.toString(nativeFinishGifEncode));
            } else {
                Log.m105925i("MicroMsg.MMGifEncoder", "encoder buffer size: %s", Integer.valueOf(nativeFinishGifEncode.length));
                if (!Util.isNullOrNil(this.f296871b)) {
                    C86013q1.m106438T(this.f296871b, nativeFinishGifEncode, 0, nativeFinishGifEncode.length);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean init() {
        long nativeInitGifEncode = MMWXGFJNI.nativeInitGifEncode(this.f296872c, this.f296873d, this.f296874e);
        this.f296870a = nativeInitGifEncode;
        if (nativeInitGifEncode == 0) {
            C115669n.INSTANCE.mo175911u(852, 11);
            Log.m105921e("MicroMsg.MMGifEncoder", "init gif encoder failed! %s", Long.valueOf(this.f296870a));
            return false;
        }
        Log.m105925i("MicroMsg.MMGifEncoder", "successfully init wxam encoder: %s", Long.valueOf(nativeInitGifEncode));
        return true;
    }
}
