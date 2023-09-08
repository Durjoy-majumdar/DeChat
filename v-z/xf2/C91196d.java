package xf2;

import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xf2.d */
public abstract class C91196d {

    /* renamed from: xf2.d$a */
    public static abstract class C91197a {
        /* renamed from: a */
        public void mo66935a() {
        }

        /* renamed from: b */
        public abstract void mo66936b(int i, String str);

        /* renamed from: c */
        public boolean mo66937c() {
            return true;
        }

        /* renamed from: d */
        public abstract void mo66938d(String str, Map<String, String> map);
    }

    /* renamed from: xf2.d$b */
    public static class C91198b {

        /* renamed from: a */
        public boolean f261465a = false;

        /* renamed from: b */
        public boolean f261466b = true;

        /* renamed from: c */
        public boolean f261467c = true;
    }

    /* renamed from: xf2.d$c */
    public static class C91199c {

        /* renamed from: a */
        public long f261468a = System.currentTimeMillis();

        /* renamed from: b */
        public String f261469b;

        /* renamed from: c */
        public C91198b f261470c;

        /* renamed from: d */
        public C91201e f261471d;

        /* renamed from: e */
        public C91202f f261472e;

        /* renamed from: f */
        public Map<String, String> f261473f;

        /* renamed from: g */
        public C91197a f261474g;

        public C91199c(String str, C91201e eVar, C91197a aVar) {
            this.f261469b = str;
            this.f261471d = eVar;
            this.f261474g = aVar;
        }
    }

    /* renamed from: xf2.d$d */
    public interface C91200d {
    }

    /* renamed from: xf2.d$e */
    public static class C91201e {

        /* renamed from: a */
        public int f261475a;

        /* renamed from: b */
        public Map<String, String> f261476b;

        /* renamed from: c */
        public Map<String, String> f261477c;

        public C91201e(int i, Map<String, String> map, Map<String, String> map2, C91203g gVar) {
            this.f261475a = i;
            this.f261476b = map;
            this.f261477c = map2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Request method:");
            sb.append(this.f261475a);
            sb.append(", params:");
            Object obj = this.f261476b;
            Object obj2 = "";
            if (obj == null) {
                obj = obj2;
            }
            sb.append(obj);
            sb.append(", cookie:");
            Object obj3 = this.f261477c;
            if (obj3 != null) {
                obj2 = obj3;
            }
            sb.append(obj2);
            return sb.toString();
        }
    }

    /* renamed from: xf2.d$f */
    public static class C91202f {

        /* renamed from: a */
        public int f261478a;

        /* renamed from: b */
        public Map<String, String> f261479b;

        /* renamed from: c */
        public String f261480c;

        public C91202f(int i, Map<String, String> map, String str) {
            this.f261478a = i;
            this.f261479b = map;
            this.f261480c = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Response status:");
            sb.append(this.f261478a);
            sb.append(", cookie:");
            Object obj = this.f261479b;
            if (obj == null) {
                obj = "";
            }
            sb.append(obj);
            sb.append(", content length :");
            String str = this.f261480c;
            sb.append(str != null ? str.length() : 0);
            return sb.toString();
        }
    }

    /* renamed from: xf2.d$g */
    public static class C91203g {
    }

    /* renamed from: b */
    public static String m114462b(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String next : map.keySet()) {
            sb.append(URLEncoder.encode(next, "utf-8"));
            sb.append('=');
            sb.append(URLEncoder.encode(map.get(next), "utf-8"));
            i++;
            if (map.size() > i) {
                sb.append("; ");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m114463c(String str, String str2, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        if (!str2.startsWith(HttpWrapperBase.PROTOCAL_HTTP) && !str2.startsWith(HttpWrapperBase.PROTOCAL_HTTPS)) {
            sb.append(str + "");
        }
        sb.append(str2);
        if (map == null) {
            return sb.toString();
        }
        sb.append('?');
        boolean z = true;
        for (String next : map.keySet()) {
            String str3 = map.get(next);
            sb.append(z ? "" : "&");
            sb.append(URLEncoder.encode(next, "utf-8"));
            sb.append('=');
            sb.append(URLEncoder.encode(Util.nullAsNil(str3), "utf-8"));
            z = false;
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static Map<String, String> m114464d(String str) {
        HashMap hashMap = new HashMap();
        if (!(str == null || str.length() == 0)) {
            for (String split : str.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public abstract void mo125254a();
}
