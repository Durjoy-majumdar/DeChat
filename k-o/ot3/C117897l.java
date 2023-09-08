package ot3;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ot3.l */
public class C117897l {

    /* renamed from: a */
    public long f352424a;

    /* renamed from: b */
    public int f352425b;

    /* renamed from: c */
    public String f352426c;

    /* renamed from: d */
    public String f352427d;

    /* renamed from: e */
    public String f352428e;

    /* renamed from: f */
    public ArrayList<String> f352429f;

    /* renamed from: g */
    public String f352430g;

    public C117897l(String str, String str2) {
        this.f352424a = -1;
        this.f352425b = -1;
        this.f352426c = "";
        this.f352427d = "";
        this.f352429f = null;
        this.f352430g = "";
        this.f352428e = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("certs")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("certs");
                if (optJSONArray.length() < 2) {
                    C21881e.m25083b("Soter.SoterPubKeyModel", "certificates train not enough", new Object[0]);
                }
                C21881e.m25084c("Soter.SoterPubKeyModel", "certs size: [%d]", Integer.valueOf(optJSONArray.length()));
                this.f352429f = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f352429f.add(optJSONArray.getString(i));
                }
                try {
                    C117895a.m166294a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(this.f352429f.get(0).getBytes())), this);
                } catch (Exception e) {
                    C21881e.m25085d("Soter.SoterPubKeyModel", e, "soter: loadDeviceInfo from attestationCert failed");
                }
                jSONObject.put("cpu_id", this.f352426c);
                jSONObject.put("uid", this.f352425b);
                jSONObject.put("counter", this.f352424a);
                this.f352428e = jSONObject.toString();
            } else {
                this.f352424a = jSONObject.optLong("counter");
                this.f352425b = jSONObject.optInt("uid");
                this.f352426c = jSONObject.optString("cpu_id");
                this.f352427d = jSONObject.optString("pub_key");
            }
        } catch (Exception unused) {
            C21881e.m25083b("Soter.SoterPubKeyModel", "soter: pub key model failed", new Object[0]);
        }
        this.f352430g = str2;
    }

    public String toString() {
        return "SoterPubKeyModel{counter=" + this.f352424a + ", uid=" + this.f352425b + ", cpu_id='" + this.f352426c + '\'' + ", pub_key_in_x509='" + this.f352427d + '\'' + ", rawJson='" + this.f352428e + '\'' + ", signature='" + this.f352430g + '\'' + '}';
    }

    public C117897l(Certificate[] certificateArr) {
        this.f352424a = -1;
        this.f352425b = -1;
        this.f352426c = "";
        this.f352427d = "";
        this.f352428e = "";
        this.f352429f = null;
        this.f352430g = "";
        if (certificateArr != null) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < certificateArr.length; i++) {
                    X509Certificate x509Certificate = certificateArr[i];
                    Base64.encodeToString(x509Certificate.getEncoded(), 2);
                    String b = C117895a.m166295b(x509Certificate);
                    if (i == 0) {
                        try {
                            C117895a.m166294a(x509Certificate, this);
                        } catch (Exception e) {
                            C21881e.m25085d("Soter.SoterPubKeyModel", e, "soter: loadDeviceInfo from attestationCert failed");
                        }
                    }
                    jSONArray.put(b);
                    arrayList.add(b);
                }
                this.f352429f = arrayList;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("certs", jSONArray);
                jSONObject.put("cpu_id", this.f352426c);
                jSONObject.put("uid", this.f352425b);
                jSONObject.put("counter", this.f352424a);
                this.f352428e = jSONObject.toString();
            } catch (Exception unused) {
                C21881e.m25083b("Soter.SoterPubKeyModel", "soter: pub key model failed", new Object[0]);
            }
        }
    }
}
