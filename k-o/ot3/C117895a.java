package ot3;

import android.util.Base64;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: ot3.a */
public class C117895a {
    /* renamed from: a */
    public static void m166294a(X509Certificate x509Certificate, C117897l lVar) {
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new Exception("Couldn't find the keystore attestation extension data.");
        }
        byte b = "{".getBytes()[0];
        byte b2 = "}".getBytes()[0];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < extensionValue.length; i3++) {
            byte b3 = extensionValue[i3];
            if (b3 == b) {
                i = i3;
            } else if (b3 == b2) {
                i2 = i3;
            }
        }
        if (i > 0 && i < i2) {
            int i4 = (i2 - i) + 1;
            if (extensionValue[i - 1] != i4) {
                C21881e.m25087f("Soter.CertUtil", "read extension lenght error", new Object[0]);
            }
            byte[] bArr = new byte[i4];
            System.arraycopy(extensionValue, i, bArr, 0, i4);
            String str = new String(bArr);
            C21881e.m25084c("Soter.CertUtil", "soter: challenge json in attestation certificate " + str, new Object[0]);
            JSONObject jSONObject = new JSONObject(str);
            lVar.f352426c = jSONObject.getString("cpu_id");
            lVar.f352425b = jSONObject.getInt("uid");
            lVar.f352424a = jSONObject.getLong("counter");
        }
    }

    /* renamed from: b */
    public static String m166295b(Certificate certificate) {
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        bufferedWriter.write("-----BEGIN CERTIFICATE-----");
        bufferedWriter.write("\n");
        byte[] encode = Base64.encode(certificate.getEncoded(), 2);
        char[] cArr = new char[64];
        for (int i = 0; i < encode.length; i += 64) {
            int i2 = 0;
            while (i2 != 64) {
                int i3 = i + i2;
                if (i3 >= encode.length) {
                    break;
                }
                cArr[i2] = (char) encode[i3];
                i2++;
            }
            bufferedWriter.write(cArr, 0, i2);
            bufferedWriter.write("\n");
        }
        bufferedWriter.write("-----END CERTIFICATE-----");
        bufferedWriter.write("\n");
        bufferedWriter.close();
        return stringWriter.toString();
    }
}
