package b63;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.security.PublicKey;
import javax.crypto.Cipher;
import p823sg.C90195n;

/* renamed from: b63.q */
public class C79673q {

    /* renamed from: b */
    public static C79673q f233582b;

    /* renamed from: a */
    public PublicKey f233583a = null;

    /* renamed from: a */
    public String mo109800a(byte[] bArr) {
        try {
            this.f233583a = C90195n.m112883a(MMApplicationContext.getContext(), "lbs_rsa_public_key.pem");
            Log.m105924i("MicroMsg.LocationEncrypt", "getPemPublickKeyFromAsset23 done2");
            PublicKey publicKey = this.f233583a;
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, publicKey);
            return new String(Base64.encode(instance.doFinal(bArr), 0));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.LocationEncrypt", "encry publicKey error %s", e.getMessage());
            return "";
        }
    }
}
