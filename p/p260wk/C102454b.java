package p260wk;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import k60.C99102f;
import m60.C99789a;
import n60.C100075f;
import p823sg.C90193h;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;
import z04.C119027c;
import z51.C39315g;

/* renamed from: wk.b */
public final class C102454b extends C99789a<C102453a> {

    /* renamed from: b */
    public static final C15421a f301709b = new C15421a((C8480h) null);

    /* renamed from: wk.b$a */
    public static final class C15421a {
        public C15421a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo14215a(String str, String str2, String str3) {
            String str4;
            C87412m.m108594g(str, "rootPath");
            C87412m.m108594g(str2, "productId");
            C87412m.m108594g(str3, "url");
            if (!Util.isNullOrNil(str2) || !Util.isNullOrNil(str3)) {
                if (Util.isNullOrNil(str2) && Util.isNullOrNil(str3)) {
                    Log.m105920e("MicroMsg.EmojiGroupDiskCache", "[cpan] product id and url are null.");
                    str4 = null;
                } else if (Util.isNullOrNil(str3)) {
                    byte[] bytes = str2.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    str4 = C90193h.m112878f(bytes);
                } else {
                    byte[] bytes2 = str3.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
                    str4 = C90193h.m112878f(bytes2);
                }
                if (Util.isNullOrNil(str4)) {
                    return null;
                }
                if (Util.isNullOrNil(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    C87412m.m108591d(str4);
                    sb.append(str4);
                    return sb.toString();
                }
                return str + str2 + XVFSFile.SEPARATOR_CHAR + str4;
            }
            Log.m105928w("MicroMsg.EmojiGroupDiskCache", "[cpan] get icon path failed. productid and url are null.");
            return null;
        }
    }

    /* renamed from: a */
    public String mo137106a(C102564a<C102453a> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        StringBuilder sb = new StringBuilder();
        String str = ((C102453a) aVar.f301995a).f301708d.field_productID;
        C87412m.m108593f(str, "url.value().groupInfo.productID");
        sb.append(f301709b.mo14215a(((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138015b() + "emoji/", str, ""));
        sb.append("_panel_enable");
        return sb.toString();
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C102453a> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        StringBuilder sb = new StringBuilder();
        String str = ((C102453a) aVar.f301995a).f301708d.field_productID;
        C87412m.m108593f(str, "url.value().groupInfo.productID");
        sb.append(f301709b.mo14215a(((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138015b() + "emoji/", str, ""));
        sb.append("_panel_enable");
        String sb4 = sb.toString();
        if (C86013q1.m106450k(sb4)) {
            return C102802a.m135853b(sb4, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C102453a> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C102453a> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }
}
