package hb2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: hb2.a */
public final class C8503a {

    /* renamed from: e */
    public static final C8504a f27529e;

    /* renamed from: f */
    public static final LinkedHashMap<String, C8503a> f27530f = new LinkedHashMap<>();

    /* renamed from: a */
    public final String f27531a;

    /* renamed from: b */
    public final JSONObject f27532b;

    /* renamed from: c */
    public final String f27533c;

    /* renamed from: d */
    public String f27534d;

    /* renamed from: hb2.a$a */
    public static final class C8504a {
        public C8504a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo9421a(String str) {
            C87412m.m108594g(str, "folder");
            try {
                JSONArray jSONArray = new JSONArray(C86013q1.m106432N(new C86009m1(new C86009m1(str), "config.conf").mo119971i()));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("id");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("name");
                        String str2 = str + XVFSFile.SEPARATOR_CHAR + optString + ".pag";
                        String str3 = null;
                        if (!C86013q1.m106450k(str2)) {
                            str2 = null;
                        }
                        String str4 = "";
                        String str5 = str2 == null ? str4 : str2;
                        String str6 = str + XVFSFile.SEPARATOR_CHAR + optString + ".wxam";
                        if (C86013q1.m106450k(str6)) {
                            str3 = str6;
                        }
                        if (str3 != null) {
                            str4 = str3;
                        }
                        boolean z = optJSONObject.optInt("is_show_in_panel", 0) == 1;
                        if (!(optString == null || optJSONObject2 == null)) {
                            C8503a.f27529e.getClass();
                            C8503a put = C8503a.f27530f.put(optString, new C8503a(optString, optJSONObject2, str4, str5, z));
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Mv.DefaultPagInfo", e, "fillPagInfoList", new Object[0]);
            }
        }
    }

    static {
        C8504a aVar = new C8504a((C8480h) null);
        f27529e = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251806d + "music/cover/");
        sb.append("mv_transition/");
        String sb4 = sb.toString();
        if (C86013q1.m106450k(sb4)) {
            aVar.mo9421a(sb4);
        }
    }

    public C8503a(String str, JSONObject jSONObject, String str2, String str3, boolean z) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(jSONObject, "nameObj");
        C87412m.m108594g(str2, "wxamPath");
        C87412m.m108594g(str3, "pagPath");
        this.f27531a = str;
        this.f27532b = jSONObject;
        this.f27533c = str2;
        this.f27534d = str3;
    }
}
