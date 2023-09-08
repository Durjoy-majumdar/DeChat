package ag2;

import android.util.Base64;
import com.p013qq.taf.jce.HexUtil;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.AESUtil;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: ag2.v */
public class C79545v extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f233223d;

    /* renamed from: e */
    public C11385n f233224e;

    /* renamed from: f */
    public String f233225f;

    /* renamed from: g */
    public String f233226g;

    /* renamed from: h */
    public String f233227h;

    public C79545v(int i, String str, String str2, String str3, String str4) {
        String str5;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 586;
        this.f233225f = str;
        this.f233226g = str2;
        this.f233227h = str3;
        C39574e eVar = new C39574e();
        eVar.f106230d = i;
        if (!Util.isNullOrNil(str4)) {
            try {
                byte[] hexStrToBytesr = AESUtil.hexStrToBytesr(str3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(hexStrToBytesr, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(1, secretKeySpec, new IvParameterSpec(hexStrToBytesr));
                byte[] bytes = MD5Util.getMD5String(str4).getBytes("UTF-8");
                byte[] doFinal = instance.doFinal(bytes);
                Log.m105919d("MicroMsg.NetSceneBindXmail", "key %s, pwd %s, encrypt %s", HexUtil.bytes2HexStr(hexStrToBytesr), HexUtil.bytes2HexStr(bytes), HexUtil.bytes2HexStr(doFinal));
                str5 = Base64.encodeToString(doFinal, 2);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NetSceneBindXmail", e, "bind xmail encrypt second pwd error", new Object[0]);
                str5 = "";
            }
            eVar.f106234h = str5;
        }
        eVar.f106232f = str;
        eVar.f106233g = str2;
        bVar.f127066a = eVar;
        bVar.f127067b = new C39577f();
        bVar.f127068c = "/cgi-bin/micromsg-bin/commitbindxmail";
        this.f233223d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f233224e = nVar;
        return dispatch(gVar, this.f233223d, this);
    }

    public int getType() {
        return 586;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f233224e.onSceneEnd(i2, i3, str, this);
    }
}
