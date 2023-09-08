package com.tencent.liteav.videoconsumer.decoder;

import com.tencent.liteav.base.util.LiteavLog;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.p */
public final class C17358p {

    /* renamed from: a */
    private boolean f47050a = false;

    /* renamed from: a */
    public static byte[] m17309a(byte[] bArr) {
        byte b;
        byte[] bArr2 = new byte[((bArr.length * 3) / 2)];
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            if (i < bArr.length - 2 && (b = bArr[i]) == 0) {
                int i3 = i + 1;
                if (bArr[i3] == 0) {
                    int i4 = i + 2;
                    if (bArr[i4] <= 3) {
                        int i5 = i2 + 1;
                        bArr2[i2] = b;
                        int i6 = i5 + 1;
                        bArr2[i5] = bArr[i3];
                        bArr2[i6] = 3;
                        i2 = i6 + 1;
                        i = i4;
                    }
                }
            }
            bArr2[i2] = bArr[i];
            i++;
            i2++;
        }
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr2, 0, bArr3, 0, i2);
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo20435a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17357o oVar = new C17357o(inputStream, byteArrayOutputStream);
        oVar.mo20428b(8);
        int a = (int) oVar.mo20424a();
        oVar.mo20428b(8);
        oVar.mo20424a();
        oVar.mo20432d();
        boolean z = false;
        if (a == 100 || a == 110 || a == 122 || a == 144) {
            if (oVar.mo20430c() == 3) {
                oVar.mo20428b(1);
            }
            oVar.mo20432d();
            oVar.mo20432d();
            oVar.mo20428b(1);
            if (oVar.mo20426a(true)) {
                for (int i = 0; i < 8; i++) {
                    if (oVar.mo20426a(true)) {
                        if (i < 6) {
                            oVar.mo20431c(16);
                        } else {
                            oVar.mo20431c(64);
                        }
                    }
                }
            }
        }
        oVar.mo20432d();
        int c = oVar.mo20430c();
        if (c == 0) {
            oVar.mo20432d();
        } else if (c == 1) {
            oVar.mo20428b(1);
            oVar.mo20432d();
            oVar.mo20432d();
            int c2 = oVar.mo20430c();
            for (int i2 = 0; i2 < c2; i2++) {
                oVar.mo20432d();
            }
        }
        oVar.mo20430c();
        oVar.mo20428b(1);
        oVar.mo20432d();
        oVar.mo20432d();
        if (!oVar.mo20426a(true)) {
            oVar.mo20428b(1);
        }
        oVar.mo20428b(1);
        if (oVar.mo20426a(true)) {
            oVar.mo20432d();
            oVar.mo20432d();
            oVar.mo20432d();
            oVar.mo20432d();
        }
        if (oVar.mo20426a(false)) {
            oVar.mo20429b(true);
            if (oVar.mo20426a(true) && ((int) oVar.mo20424a()) == 255) {
                oVar.mo20428b(16);
                oVar.mo20428b(16);
            }
            if (oVar.mo20426a(true)) {
                oVar.mo20428b(1);
            }
            if (oVar.mo20426a(true)) {
                oVar.mo20428b(3);
                oVar.mo20428b(1);
                if (oVar.mo20426a(true)) {
                    oVar.mo20428b(8);
                    oVar.mo20428b(8);
                    oVar.mo20428b(8);
                }
            }
            if (oVar.mo20426a(true)) {
                oVar.mo20432d();
                oVar.mo20432d();
            }
            if (oVar.mo20426a(true)) {
                oVar.mo20428b(32);
                oVar.mo20428b(32);
                oVar.mo20428b(1);
            }
            boolean a2 = oVar.mo20426a(true);
            if (a2) {
                m17308a(oVar);
            }
            boolean a3 = oVar.mo20426a(true);
            if (a3) {
                m17308a(oVar);
            }
            if (a2 || a3) {
                oVar.mo20428b(1);
            }
            oVar.mo20428b(1);
            if (oVar.mo20426a(false)) {
                oVar.mo20429b(true);
                oVar.mo20426a(true);
                oVar.mo20432d();
                oVar.mo20432d();
                oVar.mo20432d();
                oVar.mo20432d();
                oVar.mo20432d();
                if (!this.f47050a) {
                    LiteavLog.m16905w("H264SPSModifier", "decode: do not add max_dec_frame_buffering when it is ".concat(String.valueOf(oVar.mo20427b())));
                    this.f47050a = true;
                }
            } else {
                oVar.mo20429b(true);
                oVar.mo20429b(true);
                oVar.mo20433d(0);
                oVar.mo20433d(0);
                oVar.mo20433d(10);
                oVar.mo20433d(10);
                oVar.mo20433d(0);
                oVar.mo20433d(1);
                if (!this.f47050a) {
                    LiteavLog.m16905w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when it is no exist");
                    this.f47050a = true;
                }
                z = true;
            }
            if (!z) {
                return null;
            }
        } else {
            oVar.mo20429b(true);
            oVar.mo20429b(false);
            oVar.mo20429b(false);
            oVar.mo20429b(false);
            oVar.mo20429b(false);
            oVar.mo20429b(false);
            oVar.mo20429b(false);
            oVar.mo20429b(false);
            oVar.mo20429b(false);
            oVar.mo20429b(true);
            oVar.mo20429b(true);
            oVar.mo20433d(0);
            oVar.mo20433d(0);
            oVar.mo20433d(10);
            oVar.mo20433d(10);
            oVar.mo20433d(0);
            oVar.mo20433d(1);
            if (!this.f47050a) {
                LiteavLog.m16905w("H264SPSModifier", "decode: add max_dec_frame_buffering 1 when vui is no exist");
                this.f47050a = true;
            }
        }
        oVar.mo20434e();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    private static void m17308a(C17357o oVar) {
        int c = oVar.mo20430c();
        oVar.mo20425a(4);
        oVar.mo20425a(4);
        for (int i = 0; i <= c; i++) {
            oVar.mo20432d();
            oVar.mo20432d();
            oVar.mo20425a(1);
        }
        oVar.mo20425a(5);
        oVar.mo20425a(5);
        oVar.mo20425a(5);
        oVar.mo20425a(5);
    }
}
