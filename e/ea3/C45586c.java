package ea3;

import android.net.Uri;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ex0.C45696d;
import f40.C86709a0;
import f40.C86718e;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
import sx3.C90364q0;
import z04.C112550d0;
import z04.C112551y;
import z04.C53732l;
import z04.C66713a;
import z04.C66716g;
import z04.C66717h;

/* renamed from: ea3.c */
public final class C45586c {

    /* renamed from: a */
    public static final C45586c f123303a = new C45586c();

    /* renamed from: b */
    public static ConcurrentHashMap<String, String> f123304b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static ConcurrentHashMap<String, ConcurrentLinkedDeque<String>> f123305c = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static String m50628b(C45586c cVar, String str, boolean z, int i, Object obj) {
        String str2;
        int i2;
        String str3 = str;
        boolean z2 = (i & 2) != 0 ? false : z;
        cVar.getClass();
        C87412m.m108594g(str3, "url");
        String e0 = C112550d0.m153795e0(str3, "#", str3);
        String[] strArr = {"from", "isappinstalled", "pass_ticket", "exportKey"};
        try {
            Uri parse = Uri.parse(e0);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            C87412m.m108593f(queryParameterNames, "uri.queryParameterNames");
            ArrayList arrayList = new ArrayList();
            for (T next : queryParameterNames) {
                if (!C110823p.m151009y(strArr, (String) next)) {
                    arrayList.add(next);
                }
            }
            List<String> n0 = C110818d0.m150942n0(arrayList);
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(n0, 10));
            for (String str4 : n0) {
                arrayList2.add(str4 + '=' + parse.getQueryParameter(str4));
            }
            e0 = parse.getScheme() + "://" + parse.getHost() + parse.getPath() + '?' + C110818d0.m150921S(arrayList2, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        } catch (Exception e) {
            Log.m105920e("String", "clearUrlParams:" + e.getMessage() + ", " + strArr + ", " + e0);
        }
        C87412m.m108592e(e0, "null cannot be cast to non-null type kotlin.String");
        String str5 = e0 + '-' + z2;
        synchronized (C45586c.class) {
            if (f123304b.containsKey(str5)) {
                str2 = (String) C90364q0.m113145d(f123304b, str5);
            } else {
                C13598b0 b0Var = C13598b0.f38549a;
                String str6 = "unknow";
                try {
                    String host = Uri.parse(cVar.mo71110d(e0)).getHost();
                    if (host != null) {
                        str6 = host;
                    }
                } catch (Exception unused) {
                }
                String str7 = "_domain_" + "" + str6.hashCode();
                StringBuilder sb = new StringBuilder("");
                String[] strArr2 = {"__biz", "mid", "idx"};
                int i3 = 0;
                while (true) {
                    if (i3 < 3) {
                        String str8 = strArr2[i3];
                        f123303a.getClass();
                        C87412m.m108594g(str8, "param");
                        String str9 = "(?<=" + str8 + "=).+?(?=&)";
                        C87412m.m108594g(str9, "pattern");
                        Pattern compile = Pattern.compile(str9);
                        C87412m.m108593f(compile, "compile(pattern)");
                        Matcher matcher = compile.matcher(e0);
                        C87412m.m108593f(matcher, "nativePattern.matcher(input)");
                        C66716g a = C53732l.m60231a(matcher, 0, e0);
                        String value = a != null ? ((C66717h) a).getValue() : null;
                        if (value == null) {
                            String[] strArr3 = {"sessionid", "subscene", TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "ascene", "enterid", "clicktime", "fasttmpl_type", "fasttmpl_fullversion", "fasttmpl_flag", "realreporttime", "reporttime"};
                            String str10 = e0;
                            for (int i4 = 0; i4 < 11; i4++) {
                                str10 = f123303a.mo71108a(str10, strArr3[i4], false);
                            }
                            String j0 = C112550d0.m153800j0(str10, '?', '&');
                            f123303a.getClass();
                            C87412m.m108594g(j0, "url");
                            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mpRelateData_" + (MMApplicationContext.isMainProcess() ? C86709a0.m107523b().mo121110g() : C86718e.m107549h()), 2);
                            C87412m.m108593f(mmkv, "getMMKV(\"${BizConstants.…sMMKV.MULTI_PROCESS_MODE)");
                            str2 = mmkv.decodeString("short_url_" + j0, "");
                            C87412m.m108593f(str2, "mpDataMmkv().decodeString(\"short_url_$url\", \"\")");
                            if (!Util.isNullOrNil(str2)) {
                                f123304b.put(e0, str2);
                            } else {
                                try {
                                    i2 = Uri.parse(j0).toString().hashCode();
                                } catch (Exception e2) {
                                    Log.printErrStackTrace("hashUrl", e2, "hash url %s", j0);
                                    i2 = 0;
                                }
                                int hashCode = ("not_matched_" + i2).hashCode();
                                C66713a.m78712a(16);
                                str2 = Integer.toString(hashCode, 16);
                                C87412m.m108593f(str2, "toString(this, checkRadix(radix))");
                                if (z2) {
                                    if (!f123305c.containsKey(str7)) {
                                        f123305c.put(str7, new ConcurrentLinkedDeque());
                                    }
                                    ConcurrentLinkedDeque<String> concurrentLinkedDeque = f123305c.get(str7);
                                    C87412m.m108591d(concurrentLinkedDeque);
                                    concurrentLinkedDeque.add(str5);
                                    f123304b.put(str5, str2);
                                    Log.m105919d("AppMsgContextEx", '#' + str2 + " hash from:%s", e0);
                                }
                            }
                        } else {
                            if (str8.equals("idx")) {
                                sb.append(str8 + '=' + value);
                            } else {
                                sb.append(str8 + '=' + value + '|');
                            }
                            i3++;
                        }
                    } else {
                        str2 = sb.toString();
                        C87412m.m108593f(str2, "key.toString()");
                        if (!f123305c.containsKey(str7)) {
                            f123305c.put(str7, new ConcurrentLinkedDeque());
                        }
                        ConcurrentLinkedDeque<String> concurrentLinkedDeque2 = f123305c.get(str7);
                        C87412m.m108591d(concurrentLinkedDeque2);
                        concurrentLinkedDeque2.add(str5);
                        f123304b.put(str5, str2);
                    }
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public final String mo71108a(String str, String str2, boolean z) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "param");
        if (!z) {
            str = (String) C112550d0.m153785U(str, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
        }
        String str3 = "(?<=[?|&])" + str2 + "=.+?(?:&|$)";
        C87412m.m108594g(str3, "pattern");
        Pattern compile = Pattern.compile(str3);
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(str, "input");
        String replaceFirst = compile.matcher(str).replaceFirst("");
        C87412m.m108593f(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        if (!C112551y.m153808h(replaceFirst, "&", false, 2, (Object) null) || C112551y.m153808h(str, "&", false, 2, (Object) null)) {
            return replaceFirst;
        }
        return C112550d0.m153800j0(replaceFirst, '&');
    }

    /* renamed from: c */
    public final String mo71109c(String str) {
        if (str == null || C112551y.m153811k(str)) {
            return "";
        }
        C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
        if ((dVar != null && dVar.mo70989eQ(str)) && C112550d0.m153801u(str, "__biz", true) && C112550d0.m153801u(str, "mid", true) && C112550d0.m153801u(str, "idx", true)) {
            return m50628b(this, str, false, 2, (Object) null);
        }
        String mD5String = MD5Util.getMD5String(str);
        C87412m.m108593f(mD5String, "{\n            MD5Util.getMD5String(url)\n        }");
        return mD5String;
    }

    /* renamed from: d */
    public final String mo71110d(String str) {
        C87412m.m108594g(str, "<this>");
        if (C112551y.m153819s(str, "http", false)) {
            return str;
        }
        if (C112550d0.m153801u(str, "view.inews.qq.com", false)) {
            return HttpWrapperBase.PROTOCAL_HTTPS + str;
        }
        return HttpWrapperBase.PROTOCAL_HTTP + str;
    }
}
