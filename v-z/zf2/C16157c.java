package zf2;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: zf2.c */
public class C16157c implements C80916r<IPCVoid, IPCString> {
    public Object invoke(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, (Object) null);
        Log.m105925i("MicroMsg.GetBindMailTask", "last bind xmail %s", str);
        int i = C86709a0.m107535s().mo121142i().mo119688i(9, 0);
        Log.m105925i("MicroMsg.GetBindMailTask", "bindXMail %s, bindQQ %d, extUserStatus %d", str, Integer.valueOf(i), Integer.valueOf(C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EXT_USER_STATUS_INT_SYNC, 0)));
        if (Util.isNullOrNil(str)) {
            if (i != 0) {
                str = i + "@qq.com";
            } else {
                str = "";
            }
        }
        return new IPCString(str);
    }
}
