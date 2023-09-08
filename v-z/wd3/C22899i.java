package wd3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wd3.i */
public final class C22899i {

    /* renamed from: a */
    public static final C22899i f65833a = new C22899i();

    /* renamed from: a */
    public final void mo36071a(int i, boolean z) {
        int i2 = i;
        Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportDownloadResult imageType: %d, success: %b", Integer.valueOf(i), Boolean.valueOf(z));
        if (i2 == 0) {
            C115669n.INSTANCE.mo175913w(1111, z ? 3 : 4, 1);
        } else if (i2 == 1) {
            C115669n.INSTANCE.mo175913w(1111, z ? 5 : 6, 1);
        } else if (i2 == 2) {
            C115669n.INSTANCE.mo175913w(1111, z ? 32 : 33, 1);
        }
    }

    /* renamed from: b */
    public final void mo36072b(String str, boolean z) {
        String str2 = str;
        int c = C118762j.f355306a.mo183490c(str2);
        Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportImageDecodeResult contentType: %s, imageType: %d, success: %b", str2, Integer.valueOf(c), Boolean.valueOf(z));
        if (c == 0) {
            C115669n.INSTANCE.mo175913w(1111, z ? 48 : 49, 1);
        } else if (c == 1) {
            C115669n.INSTANCE.mo175913w(1111, z ? 12 : 13, 1);
        } else if (c == 2) {
            C115669n.INSTANCE.mo175913w(1111, z ? 44 : 45, 1);
        }
    }

    /* renamed from: c */
    public final void mo36073c(int i, boolean z) {
        int i2 = i;
        Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo requestImageRequestResult imageType: %d, success: %b", Integer.valueOf(i), Boolean.valueOf(z));
        if (i2 == 0) {
            C115669n.INSTANCE.mo175913w(1111, z ? 26 : 28, 1);
        } else if (i2 == 1) {
            C115669n.INSTANCE.mo175913w(1111, z ? 27 : 29, 1);
        } else if (i2 == 2) {
            C115669n.INSTANCE.mo175913w(1111, z ? 38 : 39, 1);
        }
    }

    /* renamed from: d */
    public final void mo36074d(int i, boolean z, long j) {
        int i2 = i;
        Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo requestImageRequestTime imageType: %d, success: %b, requestTime: %d", Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j));
        if (i2 == 0) {
            C115669n.INSTANCE.mo175913w(1111, z ? 15 : 24, j);
        } else if (i2 == 1) {
            C115669n.INSTANCE.mo175913w(1111, z ? 16 : 25, j);
        } else if (i2 == 2) {
            C115669n.INSTANCE.mo175913w(1111, z ? 34 : 35, j);
        }
    }

    /* renamed from: e */
    public final void mo36075e(int i, boolean z) {
        int i2 = i;
        Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportRequestNormalResultAfterGetWxPicFailed requestImageType: %d, success: %b", Integer.valueOf(i), Boolean.valueOf(z));
        if (i2 == 0) {
            C115669n.INSTANCE.mo175913w(1111, z ? 22 : 23, 1);
        } else if (i2 == 2) {
            C115669n.INSTANCE.mo175913w(1111, z ? 41 : 42, 1);
        }
    }

    /* renamed from: f */
    public final void mo36076f(String str, int i, int i2, int i3) {
        if (!(str == null || str.length() == 0)) {
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                Log.m105927v("MicroMsg.BizImageDownloadReporter", "alvinluo reportWxPicDecodeFailed type: %d, errCode: %d, fromScene: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                C115669n.INSTANCE.mo160131h(17492, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }
    }
}
