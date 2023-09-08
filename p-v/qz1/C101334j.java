package qz1;

import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Arrays;

/* renamed from: qz1.j */
public class C101334j implements C101324a {

    /* renamed from: a */
    public long f296875a = 0;

    /* renamed from: b */
    public String f296876b;

    /* renamed from: c */
    public int f296877c;

    /* renamed from: d */
    public int f296878d;

    /* renamed from: e */
    public long f296879e;

    public C101334j(String str, int i, int i2, long j, int i3) {
        this.f296876b = str;
        this.f296877c = i;
        this.f296878d = i2;
        this.f296879e = j;
        Log.m105925i("MicroMsg.MMWxAMEncoder", "create MMWxAMEncoder, width: %s, height: %s, frameDurationMs: %s, qp: %s, outputPath: %s", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i3), str);
    }

    /* renamed from: a */
    public boolean mo140810a(byte[] bArr, long j) {
        if (this.f296875a != 0 && !Util.isNullOrNil(bArr)) {
            int length = bArr.length;
            int i = this.f296877c;
            int i2 = this.f296878d;
            if (length == i * i2 * 4) {
                int nativeAddWxAMEncodeRgbaFrame = MMWXGFJNI.nativeAddWxAMEncodeRgbaFrame(this.f296875a, i, i2, bArr, j >= 0 ? j : this.f296879e);
                if (nativeAddWxAMEncodeRgbaFrame >= 0) {
                    return true;
                }
                Log.m105921e("MicroMsg.MMWxAMEncoder", "add rgba frame failed: %s", Integer.valueOf(nativeAddWxAMEncodeRgbaFrame));
                return false;
            }
        }
        Log.m105924i("MicroMsg.MMWxAMEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
        return false;
    }

    /* renamed from: b */
    public boolean mo140811b() {
        long j = this.f296875a;
        if (j != 0) {
            byte[] nativeFinishWxAMEncode = MMWXGFJNI.nativeFinishWxAMEncode(j);
            if (nativeFinishWxAMEncode == null || nativeFinishWxAMEncode.length <= 0) {
                Log.m105925i("MicroMsg.MMWxAMEncoder", "finish encode error, buf: %s", Arrays.toString(nativeFinishWxAMEncode));
            } else {
                Log.m105925i("MicroMsg.MMWxAMEncoder", "encoder buffer size: %s", Integer.valueOf(nativeFinishWxAMEncode.length));
                if (!Util.isNullOrNil(this.f296876b)) {
                    C86013q1.m106438T(this.f296876b, nativeFinishWxAMEncode, 0, nativeFinishWxAMEncode.length);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean init() {
        long nativeInitWxAMEncoder = MMWXGFJNI.nativeInitWxAMEncoder(this.f296877c, this.f296878d, this.f296879e, 20);
        this.f296875a = nativeInitWxAMEncoder;
        if (nativeInitWxAMEncoder == 0) {
            C115669n.INSTANCE.mo175911u(852, 12);
            Log.m105921e("MicroMsg.MMWxAMEncoder", "init wxam encoder failed! %s", Long.valueOf(this.f296875a));
            return false;
        }
        Log.m105925i("MicroMsg.MMWxAMEncoder", "successfully init wxam encoder: %s", Long.valueOf(nativeInitWxAMEncoder));
        return true;
    }
}
