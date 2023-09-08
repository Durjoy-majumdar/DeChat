package com.tencent.p014mm.plugin.appbrand.appcache.pkg;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import fi0.C86867a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgBaseImpl */
public abstract class WxaPkgBaseImpl implements C86867a {

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgBaseImpl$Info */
    public static class Info extends WxaPkg.Info {
        public Info(String str, String str2, int i, int i2) {
            super(str, str2, i, i2);
        }
    }

    /* renamed from: a */
    public static int m99703a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        wrap.order(ByteOrder.BIG_ENDIAN);
        if (i2 == 4) {
            return wrap.getInt();
        }
        byte[] bArr2 = new byte[i2];
        wrap.get(bArr2);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 |= bArr2[i4] << (((i2 - i4) - 1) * 8);
        }
        return i3;
    }
}
