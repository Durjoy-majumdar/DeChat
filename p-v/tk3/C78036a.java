package tk3;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import p158gt.C98201k;
import z04.C112551y;

/* renamed from: tk3.a */
public final class C78036a {

    /* renamed from: a */
    public static final C78036a f228782a = new C78036a();

    /* renamed from: a */
    public final String mo108023a(C72963f4 f4Var) {
        String str;
        C87412m.m108594g(f4Var, "msg");
        Log.m105924i("MicroMsg.FTSMultiUtil", "getMidImagePathByMsgInfo");
        boolean z = false;
        String c402 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).c40(f4Var.mo108765s2(), false, false);
        String str2 = null;
        if (!Util.isNullOrNil(c402)) {
            C87412m.m108591d(c402);
            if (!C112551y.m153808h(c402, "hd", false, 2, (Object) null)) {
                if (C86013q1.m106450k(c402 + "hd")) {
                    c402 = c402 + "hd";
                }
            }
        }
        if (!f4Var.mo100961A3()) {
            return c402;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        if (!(u == null || (str = u.f195606o) == null)) {
            C87412m.m108593f(str, "content.attachid");
            if (str.length() > 0) {
                z = true;
            }
            if (z) {
                C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
                C87412m.m108593f(qq, "getAppAttachInfoStg().ge…MediaId(content.attachid)");
                str2 = qq.field_fileFullPath;
            }
        }
        return str2 == null ? c402 : str2;
    }
}
