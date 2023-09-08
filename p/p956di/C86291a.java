package p956di;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;

/* renamed from: di.a */
public class C86291a {
    /* renamed from: a */
    public static String m106893a(String str) {
        if (!LocaleUtil.isLanguageSupported(str)) {
            return "words-en.json";
        }
        if (str.equals(LocaleUtil.INDONESIAN_NEWNAME)) {
            str = "id";
        }
        return "words-" + str + ".json";
    }

    /* renamed from: b */
    public static String m106894b() {
        String str;
        String str2 = WeChatBrands.AppInfo.lang;
        if (!m106895c()) {
            str = "brand/1/" + m106893a(str2);
        } else {
            str = "brand/2/" + m106893a(str2);
        }
        Log.m105925i("MicroMsg.XAgreementResManager", "getDefWordsTablePath:  targetLang:%s, isWeChatUser:%s, wordPath:%s ", str2, String.valueOf(m106895c()), str);
        return str;
    }

    /* renamed from: c */
    public static boolean m106895c() {
        int decodeInt;
        if ((MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).decodeInt("repairer_separation_use_default_agreement", 1) != 1) && (decodeInt = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).decodeInt("repairer_separation_agreement", -1)) != -1) {
            if (decodeInt == 0) {
                return false;
            }
            if (decodeInt == 1) {
                return true;
            }
        }
        String decodeString = MultiProcessMMKV.getMMKV("mmkv_crossprocess_infos").decodeString("mmkv_key_user_reg_ic", (String) null);
        return TextUtils.isEmpty(decodeString) ? !WeChatBrands.AppInfo.lang.equals("zh_CN") : !"CN".equalsIgnoreCase(decodeString);
    }
}
