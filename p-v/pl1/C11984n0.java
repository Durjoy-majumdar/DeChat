package pl1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import er1.C58741j5;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60216z4;
import up1.C27696y;

/* renamed from: pl1.n0 */
public class C11984n0 extends C11976a {

    /* renamed from: e */
    public final String f34975e;

    /* renamed from: f */
    public final C27696y f34976f;

    /* renamed from: g */
    public final String f34977g;

    public C11984n0(String str, C27696y yVar) {
        String str2;
        C60216z4 l7;
        C87412m.m108594g(yVar, "mediaType");
        this.f34975e = str;
        this.f34976f = yVar;
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        String str3 = "";
        if (t1Var == null || (l7 = t1Var.mo76861l7()) == null) {
            str2 = null;
        } else {
            str2 = l7.mo83792j6(str == null ? str3 : str, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        }
        this.f34977g = MD5Util.getMD5String(str2 != null ? str2 : str3);
    }

    /* renamed from: b */
    public String mo11841b() {
        return this.f34976f.f76715d + "_finder_" + this.f34977g;
    }

    public String getDecodeKey() {
        return "";
    }

    public C27696y getMediaType() {
        return this.f34976f;
    }

    public String getPath() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168188e + mo11841b();
    }

    public String getThumbUrl() {
        String str = this.f34975e;
        return str == null ? "" : str;
    }

    public String getThumbUrlToken() {
        return "";
    }

    public String getUrl() {
        String str = this.f34975e;
        return str == null ? "" : str;
    }

    public String getUrlToken() {
        return "";
    }
}
