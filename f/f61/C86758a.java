package f61;

import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p225rc.C48016e;
import rx3.C13598b0;

/* renamed from: f61.a */
public final class C86758a extends C82926s {
    public static final int CTRL_INDEX = -2;
    public static final String NAME = "UnityEvent";

    /* renamed from: i */
    public final C86759a f251843i;

    /* renamed from: f61.a$a */
    public interface C86759a {
        /* renamed from: a */
        Map<String, Object> mo121166a();

        String getName();
    }

    /* renamed from: f61.a$b */
    public static final class C86760b implements C86759a {

        /* renamed from: a */
        public final String f251844a;

        /* renamed from: b */
        public final String f251845b;

        /* renamed from: c */
        public final String f251846c;

        /* renamed from: d */
        public final int f251847d;

        public C86760b(String str, String str2, String str3, int i) {
            C87412m.m108594g(str, "eggKey");
            C87412m.m108594g(str2, "eggId");
            C87412m.m108594g(str3, "sceneId");
            this.f251844a = str;
            this.f251845b = str2;
            this.f251846c = str3;
            this.f251847d = i;
        }

        /* renamed from: a */
        public Map mo121166a() {
            HashMap hashMap = new HashMap();
            hashMap.put("eggKey", this.f251844a);
            hashMap.put("eggId", this.f251845b);
            hashMap.put("sceneId", this.f251846c);
            hashMap.put("stopReason", Integer.valueOf(this.f251847d));
            return hashMap;
        }

        public String getName() {
            return "onEasterEggForceStop";
        }
    }

    /* renamed from: f61.a$c */
    public static final class C86761c implements C86759a {

        /* renamed from: a */
        public final String f251848a;

        /* renamed from: b */
        public final String f251849b;

        /* renamed from: c */
        public final String f251850c;

        public C86761c(String str, String str2, String str3) {
            C87412m.m108594g(str, "eggKey");
            C87412m.m108594g(str2, "eggId");
            C87412m.m108594g(str3, "sceneId");
            this.f251848a = str;
            this.f251849b = str2;
            this.f251850c = str3;
        }

        /* renamed from: a */
        public Map mo121166a() {
            HashMap hashMap = new HashMap();
            hashMap.put("eggKey", this.f251848a);
            hashMap.put("eggId", this.f251849b);
            hashMap.put("sceneId", this.f251850c);
            return hashMap;
        }

        public String getName() {
            return "onEasterEggGiftClick";
        }
    }

    /* renamed from: f61.a$d */
    public static final class C86762d implements C86759a {

        /* renamed from: a */
        public final String f251851a;

        /* renamed from: b */
        public final String f251852b;

        /* renamed from: c */
        public final String f251853c;

        /* renamed from: d */
        public final boolean f251854d;

        /* renamed from: e */
        public final String f251855e;

        /* renamed from: f */
        public final long f251856f;

        public C86762d(String str, String str2, String str3, boolean z, String str4, long j) {
            C87412m.m108594g(str, "eggKey");
            C87412m.m108594g(str2, "eggId");
            C87412m.m108594g(str3, "sceneId");
            C87412m.m108594g(str4, "keyword");
            this.f251851a = str;
            this.f251852b = str2;
            this.f251853c = str3;
            this.f251854d = z;
            this.f251855e = str4;
            this.f251856f = j;
        }

        /* renamed from: a */
        public Map mo121166a() {
            HashMap hashMap = new HashMap();
            hashMap.put("eggKey", this.f251851a);
            hashMap.put("eggId", this.f251852b);
            hashMap.put("sceneId", this.f251853c);
            hashMap.put("animationType", Integer.valueOf(this.f251854d ? 2 : 1));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("keyword", this.f251855e);
            hashMap2.put("messageLocalId", Long.valueOf(this.f251856f));
            C13598b0 b0Var = C13598b0.f38549a;
            hashMap.put("extString", new C104289g((Map) hashMap2).toString());
            return hashMap;
        }

        public String getName() {
            return "onEasterEggPlayAnimation";
        }
    }

    static {
        new HashMap();
    }

    public C86758a(C86759a aVar) {
        C87412m.m108594g(aVar, "event");
        this.f251843i = aVar;
    }

    /* renamed from: s */
    public final String mo121165s() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", this.f251843i.getName());
        hashMap.put("param", this.f251843i.mo121166a());
        C48016e.m53378d(hashMap);
        String gVar = new C104289g((Map) hashMap).toString();
        C87412m.m108593f(gVar, "JSONObject(map).toString()");
        return gVar;
    }
}
