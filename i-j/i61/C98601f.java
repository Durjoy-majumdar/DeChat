package i61;

import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import hc0.C20937c;
import u61.C101964h;

/* renamed from: i61.f */
public class C98601f {

    /* renamed from: a */
    public static final /* synthetic */ int f289098a = 0;

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59345a = true;
        bVar.f59353i = 1;
        bVar.f59363s = false;
        bVar.mo32666a();
    }

    /* renamed from: a */
    public static C20937c m128136a(String str, String str2, int i, Object... objArr) {
        if (!Util.isNullOrNil(str2)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            bVar.f59350f = str2;
            bVar.f59355k = i;
            bVar.f59354j = i;
            bVar.f59368x = objArr;
            return bVar.mo32666a();
        }
        Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
        return null;
    }

    /* renamed from: b */
    public static C20937c m128137b(String str, String str2) {
        String p = EmojiLogic.m117485p(C101964h.m134224f(), str, str2);
        if (!Util.isNullOrNil(p)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = true;
            bVar.f59346b = true;
            bVar.f59350f = p;
            bVar.f59364t = true;
            return bVar.mo32666a();
        }
        Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
        return null;
    }

    /* renamed from: c */
    public static C20937c m128138c(String str, String str2) {
        String p = EmojiLogic.m117485p(C101964h.m134224f(), str, str2);
        if (!Util.isNullOrNil(p)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = true;
            bVar.f59346b = true;
            bVar.f59350f = p;
            bVar.f59364t = false;
            return bVar.mo32666a();
        }
        Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
        return null;
    }

    /* renamed from: d */
    public static C20937c m128139d(String str, String str2) {
        Object[] objArr = new Object[0];
        String p = EmojiLogic.m117485p(C101964h.m134224f(), str, str2);
        if (!Util.isNullOrNil(p)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = true;
            bVar.f59346b = true;
            bVar.f59350f = p;
            bVar.f59368x = objArr;
            return bVar.mo32666a();
        }
        Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
        return null;
    }

    /* renamed from: e */
    public static C20937c m128140e(String str, String str2, boolean z, Object... objArr) {
        String str3 = C86709a0.m107535s().f251806d;
        String p = EmojiLogic.m117485p(C101964h.m134224f(), str, str2);
        if (!Util.isNullOrNil(p)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = true;
            bVar.f59346b = true;
            bVar.f59350f = p;
            bVar.f59351g = str3;
            bVar.f59368x = objArr;
            return bVar.mo32666a();
        }
        Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
        return null;
    }

    /* renamed from: f */
    public static C20937c m128141f(String str, String str2, Object... objArr) {
        String p = EmojiLogic.m117485p(C101964h.m134224f(), str, str2);
        if (!Util.isNullOrNil(p)) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = false;
            bVar.f59346b = true;
            bVar.f59350f = p;
            bVar.f59368x = objArr;
            return bVar.mo32666a();
        }
        Log.m105928w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
        return null;
    }
}
