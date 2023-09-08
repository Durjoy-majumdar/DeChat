package w50;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import ht1.C8802s1;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import ob0.C89132b;
import p1028re.C89928a;
import p1028re.C89931d;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C50329lz0;
import te3.C50469mz0;
import te3.C51133ro;
import z04.C112550d0;

/* renamed from: w50.a */
public final class C53075a {

    /* renamed from: a */
    public static final C53075a f148139a = new C53075a();

    /* renamed from: b */
    public static LinkedList<C51133ro> f148140b;

    /* renamed from: c */
    public static boolean f148141c;

    /* renamed from: w50.a$a */
    public static final class C53076a implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            C53075a.f148139a.mo73765e("systemTrim");
        }

        /* renamed from: b */
        public void mo392b() {
            C53075a.f148139a.mo73765e("backgroundTrim");
        }
    }

    /* renamed from: w50.a$b */
    public static final class C53077b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public static final C53077b<_Ret, _Var> f148142a = new C53077b<>();

        public Object call(Object obj) {
            String str;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            boolean z = false;
            C53075a.f148141c = false;
            StringBuilder sb = new StringBuilder();
            sb.append("GetCdnIpReq errType:");
            sb.append(cVar.f256793a);
            sb.append(", errCode:");
            sb.append(cVar.f256794b);
            sb.append(",errMsg:");
            sb.append(cVar.f256795c);
            sb.append(',');
            LinkedList<C51133ro> linkedList = ((C50469mz0) cVar.f256796d).f138291d;
            if (linkedList == null || linkedList.isEmpty()) {
                z = true;
            }
            if (z) {
                str = "[NULL]";
            } else {
                StringBuilder sb4 = new StringBuilder();
                for (C51133ro roVar : linkedList) {
                    sb4.append("[");
                    sb4.append(roVar.f141056d);
                    sb4.append(XVFSFile.PATH_SEPARATOR);
                    sb4.append(roVar.f141057e);
                    sb4.append("]");
                }
                str = sb4.toString();
                C87412m.m108593f(str, "{\n            val sb = S…  sb.toString()\n        }");
            }
            sb.append(str);
            Log.m105924i("LiveBackUpUtil", sb.toString());
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C53075a aVar = C53075a.f148139a;
                C53075a.f148140b = ((C50469mz0) cVar.f256796d).f138291d;
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C89931d.f258426c.mo124253c(new C53076a());
    }

    /* renamed from: c */
    public static final String m59426c(String str, String str2, boolean z) {
        int E = C112550d0.m153769E(str, str2, 0, false, 6, (Object) null);
        if (E == -1) {
            return str;
        }
        if (z) {
            String substring = str.substring(0, E);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        int length = E + str2.length();
        if (length >= str.length()) {
            return str;
        }
        String substring2 = str.substring(length, str.length());
        C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring2;
    }

    /* renamed from: d */
    public static final String m59427d(List<String> list, String str) {
        if (str.length() == 0) {
            String str2 = (String) C110818d0.m150916N(list);
            return str2 == null ? "" : str2;
        }
        int indexOf = list.indexOf(str);
        return (indexOf <= -1 || indexOf >= list.size() - 1) ? "" : list.get(indexOf + 1);
    }

    /* renamed from: a */
    public final void mo73763a() {
        Log.m105924i("LiveBackUpUtil", "fetchCdnIp");
        f148141c = true;
        C50329lz0 lz02 = new C50329lz0();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 8260;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetcdnip";
        bVar.f127066a = lz02;
        bVar.f127067b = new C50469mz0();
        C47350c a = bVar.mo72403a();
        C89132b ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        ui.mo9225i().mo123420E(C53077b.f148142a);
    }

    /* renamed from: b */
    public final List<String> mo73764b(String str) {
        boolean z = true;
        String c = m59426c(str, "?", true);
        if (!(c.length() > 0)) {
            c = null;
        }
        if (c == null) {
            return null;
        }
        String c2 = m59426c(c, "://", false);
        if (c2.length() <= 0) {
            z = false;
        }
        String str2 = z ? c2 : null;
        if (str2 == null) {
            return null;
        }
        return C112550d0.m153785U(str2, new String[]{"/"}, false, 0, 6, (Object) null);
    }

    /* renamed from: e */
    public final void mo73765e(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("LiveBackUpUtil", "resetCdnIp " + str);
        LinkedList<C51133ro> linkedList = f148140b;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    /* renamed from: f */
    public final void mo73766f() {
        if (!f148141c) {
            LinkedList<C51133ro> linkedList = f148140b;
            if (linkedList == null || linkedList.isEmpty()) {
                mo73763a();
            }
        }
    }
}
