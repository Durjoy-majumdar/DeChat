package ni0;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import junit.framework.Assert;
import p1039tb.C90388a;
import p224ra.C89909e;
import z04.C112551y;
import z04.C119027c;

/* renamed from: ni0.a */
public final class C88943a {

    /* renamed from: a */
    public static final C88943a f256519a = new C88943a();

    /* renamed from: a */
    public final String mo123331a(String str, int i) {
        C87412m.m108594g(str, "appId");
        Assert.assertTrue(MMApplicationContext.isMainProcess());
        C34850b IV = ((C90388a) C89909e.m112436a(C90388a.class)).mo56834IV();
        String str2 = "";
        if (IV == null) {
            return str2;
        }
        String qq = IV.mo59762qq(str);
        byte[] bytes = (str + i + qq).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bytes);
            str2 = Base64.encodeToString(instance.digest(), 0);
        } catch (NoSuchAlgorithmException unused) {
        }
        if (str2 == null || C112551y.m153811k(str2)) {
            Log.m105924i("MicroMsg.SecretMMKVStorage.AppBrandStorageSecretKeyManager", "gen secret key fail, use default instead");
            byte[] bArr = new byte[32];
            byte[] bytes2 = "1d3ac09f244e11bc134df5ec87f44e41fcc820ec2238244b8d183fa1cd7a6743".getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            for (int i2 = 0; i2 < 32; i2++) {
                int i3 = i2 * 2;
                byte b = bytes2[i3];
                byte b2 = bytes2[i3 + 1];
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                Charset charset = C119027c.f356488a;
                sb.append(new String(new byte[]{b}, charset));
                bArr[i2] = (byte) (((char) Byte.decode("0x" + new String(new byte[]{b2}, charset)).byteValue()) ^ ((char) (((char) Byte.decode(sb.toString()).byteValue()) << 4)));
            }
            str2 = Base64.encodeToString(bArr, 0);
        }
        C87412m.m108593f(str2, "try {\n            val md…t\n            }\n        }");
        return str2;
    }
}
