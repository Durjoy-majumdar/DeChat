package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.ndk.FitScLibraryLoader;
import gy3.C87412m;
import java.nio.ByteBuffer;
import js0.C9514m;
import p206nj.C88957l;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c1 */
public final class C84949c1 {

    /* renamed from: a */
    public static final C84949c1 f247602a = new C84949c1();

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c1$a */
    public static final class C29704a implements FitScLibraryLoader.ILoader {

        /* renamed from: a */
        public static final C29704a f80682a = new C29704a();

        public final void loadLibrary(String str) {
            Log.m105918d("MicroMsg.AppBrand.FitRelativeLogic", "loadLibrary, libName: " + str);
            C88957l.m111078n(str);
        }
    }

    static {
        FitScLibraryLoader.setLoader(C29704a.f80682a);
    }

    /* renamed from: a */
    public final String mo117811a(C82381f fVar, String str) {
        C87412m.m108594g(fVar, "env");
        C87412m.m108594g(str, "certPath");
        C9514m mVar = new C9514m();
        C81415h0 fileSystem = fVar.getFileSystem();
        C81410b0 readFile = fileSystem != null ? fileSystem.readFile(str, mVar) : null;
        if (readFile == null) {
            Log.m105920e("MicroMsg.AppBrand.FitRelativeLogic", "readCertPem, opResult is null");
            throw new C68716d1("env error");
        } else if (C81410b0.OK == readFile) {
            T t = mVar.f29691a;
            C87412m.m108593f(t, "byteBufRef.value");
            ByteBuffer byteBuffer = (ByteBuffer) t;
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new String(bArr, C119027c.f356488a);
        } else {
            Log.m105920e("MicroMsg.AppBrand.FitRelativeLogic", "getEncryptedData, opResult: " + readFile);
            throw new C68716d1("certPath is illegal");
        }
    }
}
