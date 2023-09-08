package vu0;

import a70.C112760b;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import f62.C75700k0;
import p910lj.C76701a;
import yc3.C38992a;

/* renamed from: vu0.c */
public class C52992c implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        Class cls = C75700k0.class;
        if (strArr.length <= 1) {
            return false;
        }
        Log.m105925i("MicroMsg.AvatarCommand", "processCommand: %s", TextUtils.join(" ", strArr));
        if (strArr[1].equals("pull")) {
            if (strArr.length <= 2) {
                return false;
            }
            String str2 = strArr[2];
            String username = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(str2).getUsername();
            String str3 = C112760b.m154195C() + "/tencent/MicroMsg/avatar/";
            C86013q1.m106461v(str3);
            String g = C68102u.wx0().mo93558g(username, false, false);
            C86013q1.m106442c(g, str3 + str2 + "-s." + C86013q1.m106454o(g));
            String g2 = C68102u.wx0().mo93558g(username, true, false);
            C86013q1.m106442c(g2, str3 + str2 + "-b." + C86013q1.m106454o(g2));
            Context context2 = MMApplicationContext.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append("pull to ");
            sb.append(str3);
            C76701a.makeText(context2, (CharSequence) sb.toString(), 0).show();
            return true;
        } else if (strArr[1].equals("dump")) {
            if (strArr.length <= 2) {
                return false;
            }
            C68097n Lo = C68102u.zx0().mo93607Lo(((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(strArr[2]).getUsername());
            Log.m105925i("MicroMsg.AvatarCommand", "dump: %s, %s, %s, %s", Lo.mo93594c(), Lo.mo93597f(), Integer.valueOf(Lo.f195730c), Integer.valueOf(Lo.f195729b));
            return true;
        } else if (strArr[1].equals("clean")) {
            if (strArr.length <= 2) {
                return false;
            }
            String username2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(strArr[2]).getUsername();
            C68102u.wx0().mo93566o(username2, false);
            C68102u.wx0().mo93566o(username2, true);
            return true;
        } else if (strArr[1].equals("cleanAll")) {
            C86013q1.m106445f("wcf://avatar/");
            return true;
        } else if (!strArr[1].equals("decrypt") || strArr.length <= 2) {
            return false;
        } else {
            String str4 = strArr[2];
            byte[] DecryptAvatar = UtilsJni.DecryptAvatar(C86013q1.m106433O(str4, 0, -1));
            if (DecryptAvatar == null) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "error", 0).show();
            } else {
                C86013q1.m106438T(str4 + ".d", DecryptAvatar, 0, DecryptAvatar.length);
            }
            return true;
        }
    }
}
