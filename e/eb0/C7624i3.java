package eb0;

import a70.C0014c;
import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;

/* renamed from: eb0.i3 */
public class C7624i3 extends C0014c {

    /* renamed from: c */
    public static C7624i3 f25910c = new C7624i3(C0014c.f14b);

    /* renamed from: d */
    public static final String f25911d = (C112760b.m154225d() + "last_avatar_dir");

    public C7624i3(C0014c cVar) {
        super(cVar.f15a);
    }

    /* renamed from: b */
    public void mo8754b(String str) {
        Log.m105924i("MicroMsg.LastLoginInfo", "Save last avatar: " + str);
        if (!Util.isNullOrNil(str)) {
            String substring = str.substring(str.lastIndexOf(47) + 1);
            if (!Util.isNullOrNil(substring)) {
                StringBuilder sb = new StringBuilder();
                String str2 = f25911d;
                sb.append(str2);
                sb.append("/");
                sb.append(substring);
                String sb4 = sb.toString();
                C86013q1.m106461v(str2);
                Log.m105925i("MicroMsg.LastLoginInfo", "delete old avatar path[%s], ret[%b]", sb4, Boolean.valueOf(C86013q1.m106447h(sb4)));
                C86013q1.m106442c(str, sb4);
                mo8756d("last_avatar_path", sb4);
                if (C86709a0.m107522a()) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LAST_LOGIN_AVATAR_PATH_STRING, sb4);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo8755c(String str, int i, String str2) {
        int i2;
        if (i != 0) {
            i2 = 1;
            mo8756d("last_login_bind_qq", String.valueOf(i));
        } else {
            i2 = 0;
        }
        if (!Util.isNullOrNil(str2)) {
            i2 |= 2;
            mo8756d("last_login_bind_email", String.valueOf(str2));
        }
        if (!Util.isNullOrNil(str)) {
            i2 |= 4;
            mo8756d("last_login_bind_mobile", str);
        }
        mo8756d("last_bind_info", i2 + "");
    }

    /* renamed from: d */
    public void mo8756d(String str, String str2) {
        Log.m105925i("MicroMsg.LastLoginInfo", "save key : %s value : %s", str, str2);
        this.f15a.edit().putString(str, str2).commit();
        if (str.equals("login_weixin_username")) {
            MMApplicationContext.getContext().getSharedPreferences("notify_key_pref_no_account", 4).edit().putString("login_weixin_username", str2).commit();
        }
    }
}
