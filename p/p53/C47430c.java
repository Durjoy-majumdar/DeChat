package p53;

import android.text.TextUtils;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.charset.StandardCharsets;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C90420iq;
import te3.fq4;
import te3.gq4;

/* renamed from: p53.c */
public class C47430c extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f127231d = null;

    /* renamed from: e */
    public C11385n f127232e = null;

    public C47430c() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fq4();
        bVar.f127067b = new gq4();
        bVar.f127069d = 5249;
        bVar.f127068c = "/cgi-bin/micromsg-bin/verifysignaturetest";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f127231d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127232e = nVar;
        fq4 fq4 = (fq4) this.f127231d.f127055a.f127080a;
        String c = C114766b.f344135e.mo174418c("TestSignData");
        byte[] bytes = c.getBytes(StandardCharsets.ISO_8859_1);
        int i = -1;
        if (!TextUtils.isEmpty(c)) {
            Log.m105924i("MMVerifyCgiSignatureTest", "after sign data length " + c.length() + " byte length " + bytes.length);
            fq4.f133639e = new C89349b(bytes, 0, bytes.length);
            fq4.f133638d = new C89349b("TestSignData".getBytes());
            C114766b bVar = C114766b.f344135e;
            bVar.getClass();
            try {
                i = UtilsJni.ecdsaVerifyWithOctKey(bVar.f344138c.getBytes(StandardCharsets.ISO_8859_1), "TestSignData".getBytes(StandardCharsets.ISO_8859_1), c.getBytes(StandardCharsets.ISO_8859_1));
                Log.m105918d("CgiSignerPublicAndPrivateKey", "verify result " + i);
            } catch (Exception e) {
                Log.m105920e("CgiSignerPublicAndPrivateKey", "verify failed " + e.getLocalizedMessage());
            }
            Log.m105918d("MMVerifyCgiSignatureTest", "zyzhang verify result " + i);
            return dispatch(gVar, this.f127231d, this);
        }
        Log.m105920e("MMVerifyCgiSignatureTest", "sign failed");
        return -1;
    }

    public int getType() {
        return 5249;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MMVerifyCgiSignatureTest", "receive response " + i2 + " code " + i3 + " message " + str + " code " + uVar.getRespObj().getRetCode());
        gq4 gq4 = (gq4) this.f127231d.f127056b.f127083a;
        C90420iq profile = uVar.getRespObj().getProfile();
        if (profile != null) {
            Log.m105918d("MMVerifyCgiSignatureTest", "profile " + profile.f259600d + " " + profile.f259606j + " " + profile.f259607n + " " + profile.f259602f + " " + profile.f259603g);
        } else {
            Log.m105918d("MMVerifyCgiSignatureTest", "profile is null");
        }
        if (gq4 == null || gq4.BaseResponse == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("response or BaseResponse is null ");
            sb.append(gq4 == null);
            Log.m105920e("MMVerifyCgiSignatureTest", sb.toString());
        } else {
            Log.m105918d("MMVerifyCgiSignatureTest", "response ret " + gq4.BaseResponse.f135955d);
        }
        this.f127232e.onSceneEnd(i2, i3, str, this);
    }
}
