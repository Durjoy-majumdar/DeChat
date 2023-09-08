package zq3;

import android.util.Base64;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tenpay.android.wechat.PayuSecureEncrypt;

/* renamed from: zq3.a */
public class C79429a extends PayuSecureEncrypt {
    public C79429a(int i) {
        this.mEncrptType = i;
    }

    /* renamed from: a */
    public final String mo109401a(String str, String str2) {
        int i = this.mEncrptType;
        if (!(i == 40 || i == -20)) {
            str = str.replaceAll(" ", "");
        }
        int i2 = this.mEncrptType;
        if (!(i2 == -20 || i2 == -10)) {
            if (i2 == 20 || i2 == 30 || i2 == 40 || i2 == 50) {
                return mo109402b(false, str, str2);
            }
            if (i2 != 60) {
                return str;
            }
        }
        return mo109402b(true, str, str2);
    }

    /* renamed from: b */
    public final String mo109402b(boolean z, String str, String str2) {
        int i = this.mEncrptType;
        int i2 = -20 == i ? 40 : -10 == i ? 20 : i;
        String str3 = (i == -10 || i == -20 || i == 60) ? PayuSecureEncrypt.ENCRYPT_VERSION_HASH : PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append("|");
        sb.append(str3);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        if (z) {
            sb.append(MD5Util.getMD5String(str));
        } else {
            sb.append(str);
        }
        try {
            byte[] bytes = sb.toString().getBytes();
            PByteArray pByteArray = new PByteArray();
            if (!MMProtocalJni.rsaPublicEncrypt(bytes, pByteArray, getRsaEKey().getBytes("UTF-8"), getRsaNKey().getBytes("UTF-8"))) {
                Log.m105920e("MicroMsg.WxPayuSecureEncrypt", "MMProtocalJni encrypt failed!");
            }
            return "01" + Base64.encodeToString(pByteArray.value, 2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WxPayuSecureEncrypt", e, "", new Object[0]);
            return null;
        }
    }

    public String desedeEncode(String str, String str2) {
        return mo109401a(str, str2);
    }

    public String desedeVerifyCode(String str, String str2) {
        return mo109401a(str, str2);
    }

    public String encryptPasswd(boolean z, String str, String str2) {
        return mo109401a(str, str2);
    }
}
