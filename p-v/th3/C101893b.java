package th3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C101814mn2;
import te3.C50567nn2;
import z04.C112551y;

/* renamed from: th3.b */
public final class C101893b {

    /* renamed from: a */
    public static final C101893b f300042a;

    /* renamed from: b */
    public static final String f300043b;

    /* renamed from: c */
    public static final String f300044c;

    /* renamed from: d */
    public static final String f300045d;

    /* renamed from: e */
    public static final C50567nn2 f300046e;

    /* renamed from: f */
    public static final C50567nn2 f300047f = new C50567nn2();

    /* renamed from: g */
    public static int f300048g;

    /* renamed from: h */
    public static C32224a<C13598b0> f300049h;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lth3/b$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sticker_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: th3.b$a */
    public static final class C101894a implements C80916r<Bundle, Bundle> {
        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Bundle bundle2 = new Bundle();
            bundle2.putString("data", C101893b.f300042a.mo141389a());
            return bundle2;
        }
    }

    static {
        String str;
        C101893b bVar = new C101893b();
        f300042a = bVar;
        if (MMApplicationContext.isMainProcess()) {
            str = bVar.mo141389a();
        } else {
            Bundle bundle = (Bundle) C80907o.m98783f(MMApplicationContext.getPackageName(), null, C101894a.class);
            str = bundle != null ? bundle.getString("data") : null;
            if (str == null) {
                str = "";
            }
        }
        f300043b = str;
        String str2 = str + "recommend.proto";
        f300044c = str2;
        f300045d = str + "history.proto";
        C50567nn2 nn22 = new C50567nn2();
        f300046e = nn22;
        byte[] O = C86013q1.m106433O(str2, 0, -1);
        if (O != null) {
            if (!(O.length == 0)) {
                try {
                    nn22.parseFrom(O);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.LensInfoUserCache", e, "", new Object[0]);
                }
                Log.m105924i("MicroMsg.LensInfoUserCache", "parseRecommend: " + f300044c + ' ' + f300046e.f138692d.size());
            }
        }
        byte[] O2 = C86013q1.m106433O(f300045d, 0, -1);
        if (O2 != null) {
            if (!(O2.length == 0)) {
                try {
                    f300047f.parseFrom(O2);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.LensInfoUserCache", e2, "", new Object[0]);
                }
                LinkedList<C101814mn2> linkedList = f300047f.f138692d;
                C87412m.m108593f(linkedList, "historyList.lensInfoList");
                ArrayList arrayList = new ArrayList();
                for (T next : linkedList) {
                    String str3 = ((C101814mn2) next).f298862d;
                    if (!(str3 == null || C112551y.m153811k(str3))) {
                        arrayList.add(next);
                    }
                }
                C50567nn2 nn23 = f300047f;
                nn23.f138692d.clear();
                nn23.f138692d.addAll(arrayList);
                Log.m105924i("MicroMsg.LensInfoUserCache", "parseHistory: " + f300045d + ' ' + nn23.f138692d.size());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo141389a() {
        /*
            r4 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STICKER_USER_CACHE_DIR_STRING
            r2 = 0
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x0016
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "lens_"
            r0.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r1, r2)
        L_0x003d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154231g()
            r0.append(r1)
            java.lang.String r1 = "sticker/data/"
            r0.append(r1)
            r0.append(r2)
            r1 = 47
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th3.C101893b.mo141389a():java.lang.String");
    }

    /* renamed from: b */
    public final void mo141390b() {
        C32224a<C13598b0> aVar = f300049h;
        if (aVar != null) {
            aVar.invoke();
        }
        C50567nn2 nn22 = f300047f;
        byte[] byteArray = nn22.toByteArray();
        C86013q1.m106461v(f300043b);
        C86013q1.m106437S(f300045d, byteArray);
        Log.m105924i("MicroMsg.LensInfoUserCache", "saveHistory: " + nn22.f138692d.size());
    }

    /* renamed from: c */
    public final void mo141391c(List<? extends C101814mn2> list) {
        C87412m.m108594g(list, "list");
        C50567nn2 nn22 = f300046e;
        nn22.f138692d.clear();
        nn22.f138692d.addAll(list);
        byte[] byteArray = nn22.toByteArray();
        C86013q1.m106461v(f300043b);
        C86013q1.m106437S(f300044c, byteArray);
        Log.m105924i("MicroMsg.LensInfoUserCache", "saveRecommend: " + nn22.f138692d.size());
    }
}
