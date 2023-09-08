package zf2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: zf2.e */
public class C16159e implements C80883e<IPCVoid, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Class cls = C10485b.class;
        boolean z = true;
        String a = ((C10485b) C86709a0.m107533q(cls)).g50().mo72508a(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
        String a2 = ((C10485b) C86709a0.m107533q(cls)).g50().mo72508a(1, "MailApp", "MailAppRedirectUrAndroid");
        if (ChannelUtil.channelId == 1 || Util.getInt(((C10485b) C86709a0.m107533q(cls)).g50().mo72508a(1, "MailApp", "ShowMailAppRecommend"), 0) != 1) {
            z = false;
        }
        Bundle bundle = new Bundle();
        if (!Util.isNullOrNil(a)) {
            a = a.replace("http:", "https:");
        }
        if (!Util.isNullOrNil(a2)) {
            a2 = a2.replace("http:", "https:");
        }
        bundle.putString("mail_app_enter_url", a);
        bundle.putString("mail_app_download_url", a2);
        bundle.putBoolean("mail_app_show_recommend", z);
        gVar.mo894a(bundle);
    }
}
