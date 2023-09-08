package sf0;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.os.Handler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: sf0.b0 */
public final class C13663b0 {

    /* renamed from: sf0.b0$a */
    public interface C13664a {
    }

    /* renamed from: a */
    public static boolean m12964a(Context context, String str) {
        Account[] b = m12965b(context);
        if (!(b == null || b.length == 0)) {
            for (Account account : b) {
                if (account.name.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Account[] m12965b(Context context) {
        try {
            return AccountManager.get(context).getAccountsByType("com.tencent.mm.account");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMAccountManager", "get all accounts failed");
            Log.printErrStackTrace("MicroMsg.MMAccountManager", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static String m12966c(Context context) {
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.MMAccountManager", "getCurrentAccountName MMCore.acc Not Ready");
            return "";
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
        if (Util.isNullOrNil(str)) {
            str = C75592q0.m90773c();
            if (Util.isNullOrNil(str)) {
                str = C75592q0.m90789s();
                if (Util.isNullOrNil(str) || C72996z1.m85802I4(str)) {
                    str = "";
                }
            }
        }
        try {
            return Pattern.compile("[`~!@#$%^&*()+=|{}':;',//[//].<>/?~！@#¥￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(str).replaceAll("_").trim();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMAccountManager", "stringFilter failed, %s, %s", str, e.getMessage());
            Log.printErrStackTrace("MicroMsg.MMAccountManager", e, "", new Object[0]);
            return str;
        }
    }

    /* renamed from: d */
    public static boolean m12967d(Context context) {
        boolean isNullOrNil = Util.isNullOrNil((String) null);
        Log.m105926v("MicroMsg.MMAccountManager", "remove account : null");
        if (context == null) {
            Log.m105920e("MicroMsg.MMAccountManager", "null context");
        } else {
            try {
                Account[] b = m12965b(context);
                if (b != null) {
                    if (b.length != 0) {
                        AccountManager accountManager = AccountManager.get(context);
                        for (Account account : b) {
                            if (isNullOrNil) {
                                accountManager.removeAccount(account, (AccountManagerCallback) null, (Handler) null);
                            } else if (account.name.equals((Object) null)) {
                                accountManager.removeAccount(account, (AccountManagerCallback) null, (Handler) null);
                                Log.m105924i("MicroMsg.MMAccountManager", "remove account success: null");
                            }
                        }
                        return true;
                    }
                }
                Log.m105918d("MicroMsg.MMAccountManager", "get account info is null or nil");
                return true;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MMAccountManager", e, "", new Object[0]);
                Log.m105920e("MicroMsg.MMAccountManager", "exception in removeAccount() " + e.getMessage());
            }
        }
        return false;
    }
}
