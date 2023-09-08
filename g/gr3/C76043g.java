package gr3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.android.wechat.TenpaySecureEditText;
import eb0.C31543z5;
import yq3.C79144b;

/* renamed from: gr3.g */
public class C76043g {
    /* renamed from: a */
    public static String m91346a(int i, TenpaySecureEditText tenpaySecureEditText, long j, String str, String str2) {
        Log.m105924i("MicroMsg.IEncryptDelegate", "is tenpay. encrypt with tenpay");
        if (j == 0) {
            j = C31543z5.m39451a() / 1000;
        }
        long j2 = j;
        Log.m105927v("MicroMsg.IEncryptDelegate", "encryptType:%d", Integer.valueOf(i));
        switch (i) {
            case 0:
                C79144b.m95773a().mo109091f();
                return tenpaySecureEditText.getEncryptDataWithHash(false, true);
            case 1:
                C79144b.m95773a().mo109091f();
                return tenpaySecureEditText.getEncryptDataWithHash(true, true);
            case 2:
                return tenpaySecureEditText.get3DesEncrptData();
            case 3:
                return tenpaySecureEditText.get3DesVerifyCode();
            case 4:
                return tenpaySecureEditText.getEncryptPassword(TenpaySecureEditText.EncryptMode.SM2_WITH_MD5, j2, str);
            case 5:
                return tenpaySecureEditText.getEncryptPassword(TenpaySecureEditText.EncryptMode.SM2_WITH_PBKDF2, j2, str);
            case 6:
                return tenpaySecureEditText.getHKSoftEncryptPassword(TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5, j2, str, str2);
            case 7:
                return tenpaySecureEditText.getHKSoftEncryptPassword(TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2, j2, str, str2);
            default:
                return tenpaySecureEditText.getText().toString() == null ? "" : tenpaySecureEditText.getText().toString();
        }
    }
}
