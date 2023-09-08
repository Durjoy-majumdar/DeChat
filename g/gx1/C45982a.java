package gx1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import f40.C86709a0;
import x60.C15627c;
import yw1.C53609m;

/* renamed from: gx1.a */
public final class C45982a implements C15627c {

    /* renamed from: d */
    public final String f123998d;

    /* renamed from: e */
    public final String f123999e;

    public C45982a(String str) {
        this.f123998d = str;
        this.f123999e = MD5Util.getMD5String(str == null ? "" : str);
    }

    /* renamed from: b */
    public String mo11841b() {
        return "gamechatroom_avatar_" + this.f123999e;
    }

    public final String getPath() {
        StringBuilder sb = new StringBuilder();
        C53609m mVar = (C53609m) C86312j.m106911c(C53609m.class);
        if (mVar.f150642d == null && C86709a0.m107522a()) {
            mVar.f150642d = C86709a0.m107535s().f251806d + "gamechatroom" + "/" + "avatar" + "/";
        }
        sb.append(mVar.f150642d);
        sb.append(mo11841b());
        return sb.toString();
    }
}
