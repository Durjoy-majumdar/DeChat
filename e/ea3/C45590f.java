package ea3;

import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
import te3.C52115yg3;
import z04.C112550d0;
import z04.C112551y;
import z04.C53732l;
import z04.C66716g;
import z04.C66717h;

/* renamed from: ea3.f */
public final class C45590f {
    /* renamed from: a */
    public static final String m50641a(String str, C52115yg3 yg32) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(yg32, "session");
        if (!C112550d0.m153801u(str, "" + WeChatHosts.domainString(C0966R.string.f360885fm3) + "", false)) {
            return str;
        }
        boolean z = yg32.f145286o;
        if (yg32.f145287p) {
            z |= true;
        }
        if (yg32.f145288q) {
            z |= true;
        }
        if (yg32.f145289r) {
            z |= true;
        }
        if (yg32.f145290s) {
            z |= true;
        }
        if (yg32.f145292u) {
            z |= true;
        }
        String b = m50642b(m50642b(m50642b(m50642b(m50642b(str, "sessionid", String.valueOf(yg32.f145278d)), "subscene", String.valueOf(yg32.f145283i)), TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, String.valueOf(yg32.f145282h)), "ascene", String.valueOf(yg32.f145284j)), "fasttmpl_type", String.valueOf(yg32.f145281g));
        String str2 = yg32.f145285n;
        C87412m.m108593f(str2, "session.uid");
        return m50642b(m50642b(m50642b(b, "fasttmpl_fullversion", str2), "fasttmpl_flag", String.valueOf(z ? 1 : 0)), "realreporttime", String.valueOf(MMSlotKt.now()));
    }

    /* renamed from: b */
    public static final String m50642b(String str, String str2, String str3) {
        String str4;
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "param");
        C87412m.m108594g(str3, "value");
        List U = C112550d0.m153785U(str, new String[]{"#"}, false, 0, 6, (Object) null);
        String str5 = (String) U.get(0);
        if (!C112550d0.m153803w(str5, "?", false, 2, (Object) null)) {
            str5 = str5 + '?';
        }
        if (C112550d0.m153803w(str5, str2 + '=', false, 2, (Object) null)) {
            String str6 = "(?<=" + str2 + "=).+?(?=&)";
            C87412m.m108594g(str6, "pattern");
            Pattern compile = Pattern.compile(str6);
            C87412m.m108593f(compile, "compile(pattern)");
            str4 = compile.matcher(str5).replaceFirst(str3);
            C87412m.m108593f(str4, "nativePattern.matcher(in…replaceFirst(replacement)");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(C112551y.m153808h(str5, "?", false, 2, (Object) null) ? "" : "&");
            sb.append(str2);
            sb.append('=');
            sb.append(str3);
            str4 = sb.toString();
        }
        if (U.size() <= 1) {
            return str4;
        }
        return str4 + '#' + ((String) U.get(1));
    }

    /* renamed from: c */
    public static final String m50643c(String str, boolean z) {
        C87412m.m108594g(str, "rawUrl");
        String str2 = "";
        if (z) {
            String a0 = C112550d0.m153791a0(str, "#", str2);
            if (a0.length() > 0) {
                str2 = '#' + a0;
            }
        }
        String e = m50645e(str, "sessionid", "subscene", TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "ascene", "enterid", "clicktime", "fasttmpl_type", "fasttmpl_fullversion", "fasttmpl_flag", "realreporttime", "reporttime", "from");
        return C112550d0.m153800j0(e, '?', '&') + str2;
    }

    /* renamed from: d */
    public static String m50644d(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
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

    /* renamed from: e */
    public static final String m50645e(String str, String... strArr) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(strArr, "param");
        try {
            Uri parse = Uri.parse(str);
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
            for (String str2 : n0) {
                arrayList2.add(str2 + '=' + parse.getQueryParameter(str2));
            }
            str = parse.getScheme() + "://" + parse.getHost() + parse.getPath() + '?' + C110818d0.m150921S(arrayList2, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        } catch (Exception e) {
            Log.m105920e("String", "clearUrlParams:" + e.getMessage() + ", " + strArr + ", " + str);
        }
        C87412m.m108592e(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    /* renamed from: f */
    public static final String m50646f(String str, String str2) {
        C87412m.m108594g(str, "<this>");
        C87412m.m108594g(str2, "param");
        String str3 = "(?<=" + str2 + "=).+?(?=&)";
        C87412m.m108594g(str3, "pattern");
        Pattern compile = Pattern.compile(str3);
        C87412m.m108593f(compile, "compile(pattern)");
        Matcher matcher = compile.matcher(str);
        C87412m.m108593f(matcher, "nativePattern.matcher(input)");
        C66716g a = C53732l.m60231a(matcher, 0, str);
        if (a != null) {
            return ((C66717h) a).getValue();
        }
        return null;
    }

    /* renamed from: g */
    public static final String m50647g(String str) {
        C87412m.m108594g(str, "<this>");
        if (C112551y.m153819s(str, "http", false)) {
            return str;
        }
        if (C112550d0.m153801u(str, "view.inews.qq.com", false)) {
            return HttpWrapperBase.PROTOCAL_HTTPS + str;
        }
        return HttpWrapperBase.PROTOCAL_HTTP + str;
    }

    /* renamed from: h */
    public static final boolean m50648h(String str) {
        C87412m.m108594g(str, "<this>");
        if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + XVFSFile.SEPARATOR_CHAR, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(HttpWrapperBase.PROTOCAL_HTTP);
            sb.append(WeChatHosts.domainString(C0966R.string.flk));
            sb.append(XVFSFile.SEPARATOR_CHAR);
            return C112551y.m153819s(str, sb.toString(), false);
        }
    }

    /* renamed from: i */
    public static final boolean m50649i(String str) {
        C87412m.m108594g(str, "<this>");
        if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/appmsgalbum?", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(HttpWrapperBase.PROTOCAL_HTTP);
            sb.append(WeChatHosts.domainString(C0966R.string.f360885fm3));
            sb.append("/mp/appmsgalbum?");
            return C112551y.m153819s(str, sb.toString(), false);
        }
    }

    /* renamed from: j */
    public static final boolean m50650j(String str) {
        C87412m.m108594g(str, "<this>");
        if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/s?", false)) {
            if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/s?", false)) {
                if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/s/", false)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(HttpWrapperBase.PROTOCAL_HTTP);
                    sb.append(WeChatHosts.domainString(C0966R.string.f360885fm3));
                    sb.append("/s/");
                    return C112551y.m153819s(str, sb.toString(), false);
                }
            }
        }
    }

    /* renamed from: k */
    public static final boolean m50651k(String str) {
        C87412m.m108594g(str, "<this>");
        if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/recweb/clientjump?", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(HttpWrapperBase.PROTOCAL_HTTP);
            sb.append(WeChatHosts.domainString(C0966R.string.f360885fm3));
            sb.append("/recweb/clientjump?");
            return C112551y.m153819s(str, sb.toString(), false);
        }
    }

    /* renamed from: l */
    public static final boolean m50652l(String str) {
        C87412m.m108594g(str, "<this>");
        if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/tp/", false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(HttpWrapperBase.PROTOCAL_HTTP);
            sb.append(WeChatHosts.domainString(C0966R.string.f360885fm3));
            sb.append("/tp/");
            return C112551y.m153819s(str, sb.toString(), false);
        }
    }

    /* renamed from: m */
    public static final boolean m50653m(String str) {
        C87412m.m108594g(str, "<this>");
        if (!C112551y.m153819s(str, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + XVFSFile.SEPARATOR_CHAR, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append(HttpWrapperBase.PROTOCAL_HTTP);
            sb.append(WeChatHosts.domainString(C0966R.string.f360885fm3));
            sb.append(XVFSFile.SEPARATOR_CHAR);
            return C112551y.m153819s(str, sb.toString(), false);
        }
    }
}
