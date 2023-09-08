package bh3;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;
import hh3.C117092b;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: bh3.w */
public final class C113192w {

    /* renamed from: a */
    public static final C113192w f338695a = new C113192w();

    /* renamed from: a */
    public final String mo165722a(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            Charset charset = StandardCharsets.UTF_8;
            C87412m.m108593f(charset, "UTF_8");
            String str2 = new String(bArr, charset);
            try {
                inputStream.close();
                return str2;
            } catch (Exception e) {
                Log.printErrStackTrace("SensitiveUtils", e, "close", new Object[0]);
                return str2;
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("SensitiveUtils", e2, "getFromAssets", new Object[0]);
            C117092b bVar = C117092b.f350860a;
            bVar.mo181043b("SensitiveUtils-getFromAssets", "[getFromAssets] catch: " + e2.getCause());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    Log.printErrStackTrace("SensitiveUtils", e3, "close", new Object[0]);
                }
            }
            return "";
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    Log.printErrStackTrace("SensitiveUtils", e4, "close", new Object[0]);
                }
            }
            throw th;
        }
    }
}
