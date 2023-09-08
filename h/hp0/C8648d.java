package hp0;

import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.OutputStream;
import p213oh.C89209a;

/* renamed from: hp0.d */
public class C8648d {
    /* renamed from: a */
    public static String m8495a(C82381f fVar, String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.Audio.WxaAudioUtils", "getLocalFilePathFromWxaPkg src is empty");
            return str;
        } else if (fVar.getFileSystem() == null) {
            Log.m105920e("MicroMsg.Audio.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]service.getFileSystem() is null");
            return str;
        } else {
            C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(str);
            if (absoluteFile == null || !absoluteFile.mo119967g()) {
                Log.m105920e("MicroMsg.Audio.WxaAudioUtils", "[getLocalFilePathFromWxaPkg]localFile is null");
                return str;
            }
            String i = absoluteFile.mo119971i();
            Log.m105925i("MicroMsg.Audio.WxaAudioUtils", "getLocalFilePathFromWxaPkg:path:%s", i);
            return i;
        }
    }

    /* renamed from: b */
    public static String m8496b(String str) {
        byte[] bArr;
        C86009m1 m1Var = new C86009m1(C89209a.m111502d(), "base64" + str.hashCode());
        if (m1Var.mo119967g()) {
            Log.m105924i("MicroMsg.Audio.WxaAudioUtils", "base64 file exist!");
            return m1Var.mo119971i();
        }
        OutputStream outputStream = null;
        try {
            bArr = Base64.decode(str, 0);
        } catch (Exception e) {
            Log.printErrStackTrace("", e, "writeToFile", new Object[0]);
            bArr = null;
        }
        if (!(bArr == null || bArr.length == 0)) {
            try {
                outputStream = C86013q1.m106426H(m1Var);
                outputStream.write(bArr);
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
                return m1Var.mo119971i();
            } catch (Exception unused2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
        return "";
    }
}
