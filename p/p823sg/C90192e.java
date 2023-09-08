package p823sg;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: sg.e */
public class C90192e {

    /* renamed from: a */
    public Cipher f258963a;

    public C90192e(String str) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes("UTF8")));
            IvParameterSpec ivParameterSpec = new IvParameterSpec("manifest".getBytes("UTF8"));
            Cipher.getInstance("DES/CBC/PKCS5Padding").init(1, generateSecret, ivParameterSpec);
            Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
            this.f258963a = instance;
            instance.init(2, generateSecret, ivParameterSpec);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.DESUtil", e, "", new Object[0]);
        }
    }

    /* renamed from: a */
    public String mo124436a(String str) {
        try {
            return new String(this.f258963a.doFinal(Base64.decode(str, 0)), "UTF8");
        } catch (Exception e) {
            return "[des]" + str + "|" + e.toString();
        }
    }
}
