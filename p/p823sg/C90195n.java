package p823sg;

import android.content.Context;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: sg.n */
public class C90195n {
    /* renamed from: a */
    public static PublicKey m112883a(Context context, String str) {
        InputStream inputStream = null;
        try {
            inputStream = context.getResources().getAssets().open(str);
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            inputStream.close();
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new String(bArr).replace("\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", ""), 0)));
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
