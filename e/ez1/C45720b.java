package ez1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import di3.C86312j;
import rx3.C36570n;
import wy1.C53224d;
import x60.C15627c;

/* renamed from: ez1.b */
public final class C45720b implements C15627c {

    /* renamed from: d */
    public final String f123551d;

    /* renamed from: e */
    public final String f123552e;

    public C45720b(String str) {
        this.f123551d = str;
        this.f123552e = MD5Util.getMD5String(str == null ? "" : str);
    }

    /* renamed from: b */
    public String mo11841b() {
        return "gamelife_avatar_" + this.f123552e;
    }

    public final String getPath() {
        return ((String) ((C36570n) ((C53224d) C86312j.m106911c(C53224d.class)).f148477f).getValue()) + mo11841b();
    }
}
