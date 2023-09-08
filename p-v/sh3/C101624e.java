package sh3;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sticker.loader.StickerLoadInfo;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import rh3.C101383g;
import sx3.C64175a0;
import sx3.C77813z;
import te3.C101814mn2;
import te3.C64613on2;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: sh3.e */
public final class C101624e {

    /* renamed from: a */
    public static final C101624e f297484a = new C101624e();

    /* renamed from: b */
    public static final String f297485b;

    /* renamed from: c */
    public static final String f297486c;

    /* renamed from: d */
    public static final String f297487d;

    /* renamed from: e */
    public static final String f297488e;

    /* renamed from: f */
    public static final int f297489f = 50;

    /* renamed from: g */
    public static final C65222f<C101630j> f297490g;

    /* renamed from: h */
    public static final HashMap<String, C101630j> f297491h = new HashMap<>();

    /* renamed from: sh3.e$a */
    public static final class C101625a implements C65231j<C101630j> {
        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C101630j jVar = (C101630j) dVar;
            C87412m.m108594g(jVar, "task");
            C87412m.m108594g(nVar, "status");
            String a = jVar.f297495f.mo135558a();
            boolean z = nVar == C65234n.OK;
            C101624e eVar = C101624e.f297484a;
            Log.m105924i("MicroMsg.StickerFileManager", "onLoaderFin: " + a + ", " + z);
            if (C101624e.f297491h.remove(a) != null && C86709a0.m107531m().mo58407a().mo71804b()) {
                new Intent();
            }
        }
    }

    static {
        String str = MMApplicationContext.getContext().getCacheDir().getAbsolutePath() + "/sticker/";
        f297485b = str;
        f297486c = str + "package/";
        f297487d = str + "temp/";
        f297488e = str + "thumb/";
        C65222f<C101630j> fVar = new C65222f<>(new C102156f(new C102152a(Integer.MAX_VALUE, Integer.MAX_VALUE), new C102157g(1, 5), 1, "StickerTask"));
        f297490g = fVar;
        C101625a aVar = new C101625a();
        C86013q1.m106461v(str);
        C86013q1.m106460u(str);
        fVar.mo89353f(aVar);
    }

    /* renamed from: a */
    public static final void m133476a(C101624e eVar, String str, int i) {
        eVar.getClass();
        LinkedList linkedList = new LinkedList();
        Iterable<C86001b0> t = C86013q1.m106459t(str, false);
        if (t != null) {
            C64175a0.m75508p(linkedList, t);
            int size = linkedList.size();
            Log.m105924i("MicroMsg.StickerFileManager", "cleanFile: " + str + " count is " + size);
            if (size > i) {
                if (linkedList.size() > 1) {
                    C77813z.m93909o(linkedList, new C36671f());
                }
                List<C86001b0> subList = linkedList.subList(i, size);
                C87412m.m108593f(subList, "lists.subList(maxCount, count)");
                for (C86001b0 b0Var : subList) {
                    if (b0Var.f250476f) {
                        C86013q1.m106445f(str + b0Var.f250472b);
                    } else {
                        C86013q1.m106447h(str + b0Var.f250472b);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo141085b(String str) {
        C87412m.m108594g(str, "lensId");
        return f297486c + str + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: c */
    public final C65234n mo141086c(C101814mn2 mn22) {
        C87412m.m108594g(mn22, "lensInfo");
        Log.m105924i("MicroMsg.StickerFileManager", "loadByFileId: " + mn22.f298862d);
        if (Util.isNullOrNil(mn22.f298862d)) {
            return C65234n.Fail;
        }
        String str = mn22.f298862d;
        C87412m.m108593f(str, "lensInfo.LensId");
        if (C101383g.f296975l.mo140867a(mo141085b(str))) {
            return C65234n.OK;
        }
        int i = 0;
        String str2 = null;
        StickerLoadInfo stickerLoadInfo = new StickerLoadInfo(0, 1, (C8480h) null);
        String str3 = mn22.f298862d;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        stickerLoadInfo.f284101e = str3;
        C64613on2 on22 = mn22.f298866h;
        String str5 = on22 != null ? on22.f184679d : null;
        if (str5 == null) {
            str5 = str4;
        }
        stickerLoadInfo.f284102f = str5;
        if (on22 != null) {
            str2 = on22.f184680e;
        }
        if (str2 != null) {
            str4 = str2;
        }
        stickerLoadInfo.f284103g = str4;
        if (on22 != null) {
            i = on22.f184681f;
        }
        stickerLoadInfo.f284104h = i;
        mo141087d(stickerLoadInfo);
        return C65234n.Running;
    }

    /* renamed from: d */
    public final void mo141087d(StickerLoadInfo stickerLoadInfo) {
        C65220d dVar;
        C87412m.m108594g(stickerLoadInfo, "info");
        HashMap<String, C101630j> hashMap = f297491h;
        if (hashMap.containsKey(stickerLoadInfo.mo135558a())) {
            Log.m105924i("MicroMsg.StickerFileManager", "loadByInfo: " + stickerLoadInfo.mo135558a() + " waiting in queue");
            return;
        }
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            dVar = stickerLoadInfo.f284100d == 1 ? new C101632l(stickerLoadInfo) : new C101622d(stickerLoadInfo);
        } else {
            C101627i iVar = new C101627i(stickerLoadInfo);
            hashMap.put(stickerLoadInfo.mo135558a(), iVar);
            dVar = iVar;
        }
        f297490g.mo89348b(dVar);
    }

    /* renamed from: e */
    public final void mo141088e(C65231j<C101630j> jVar) {
        C87412m.m108594g(jVar, "callback");
        f297490g.mo89353f(jVar);
    }

    /* renamed from: f */
    public final void mo141089f(C65231j<C101630j> jVar) {
        C87412m.m108594g(jVar, "callback");
        f297490g.mo89354g(jVar);
    }
}
