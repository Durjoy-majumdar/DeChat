package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.BrotliJNI;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import js0.C9514m;
import org.json.JSONObject;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.UnitReadCompressedFile */
public class UnitReadCompressedFile extends C82430g {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.UnitReadCompressedFile$BrotliJNILibrary */
    public enum BrotliJNILibrary {
        INST;

        /* access modifiers changed from: public */
        static {
            C88957l.m111079o("appbrandcommon", BrotliJNILibrary.class.getClassLoader());
        }

        public void ensureNativeLibraryLoaded() {
        }
    }

    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        if (fVar.getFileSystem() == null) {
            return new C82446i("fail no file system", new Object[0]);
        }
        String optString = jSONObject.optString("compressionAlgorithm");
        Log.m105925i("MicroMsg.AppBrand.UnitReadCompressedFile", "call, path %s, compressionAlgorithm %s", str, optString);
        C9514m mVar = new C9514m();
        C81410b0 readFile = fVar.getFileSystem().readFile(str, mVar);
        if (readFile == C81410b0.OK) {
            ByteBuffer byteBuffer = (ByteBuffer) mVar.f29691a;
            if (optString.equals("br")) {
                BrotliJNILibrary.INST.ensureNativeLibraryLoaded();
                byte[] decompress = BrotliJNI.decompress((ByteBuffer) mVar.f29691a);
                if (decompress == null) {
                    return new C82446i("fail brotli decompress file \"%s\"", str);
                }
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(decompress.length);
                allocateDirect.put(decompress);
                C82446i iVar = new C82446i("ok", new Object[0]);
                ((HashMap) iVar.f242316a).put("data", allocateDirect);
                return iVar;
            }
            return new C82446i("fail invalid compressionAlgorithm \"%s\"", optString);
        }
        int ordinal = readFile.ordinal();
        if (ordinal == 4) {
            return new C82446i("fail permission denied, open \"%s\"", str);
        } else if (ordinal == 6) {
            return new C82446i("fail no such file \"%s\"", str);
        } else if (ordinal != 10) {
            return new C82446i("fail " + readFile.name(), new Object[0]);
        } else {
            return new C82446i("fail \"%s\" is not a regular file", str);
        }
    }
}
