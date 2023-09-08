package p31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: p31.a */
public class C117921a {

    /* renamed from: a */
    public final Object f352453a;

    /* renamed from: b */
    public final String f352454b;

    /* renamed from: c */
    public final Map<String, Object> f352455c;

    /* renamed from: d */
    public final List<C117924b> f352456d;

    /* renamed from: e */
    public final boolean f352457e;

    /* renamed from: p31.a$b */
    public static final class C117923b {

        /* renamed from: a */
        public Object f352458a;

        /* renamed from: b */
        public String f352459b;

        /* renamed from: c */
        public Map<String, Object> f352460c = new HashMap();

        /* renamed from: d */
        public List<C117924b> f352461d = new ArrayList();

        /* renamed from: e */
        public boolean f352462e;

        public C117923b(C117922a aVar) {
        }

        /* renamed from: a */
        public C117921a mo182704a() {
            return new C117921a(this.f352458a, this.f352459b, this.f352460c, this.f352461d, this.f352462e);
        }

        /* renamed from: b */
        public C117923b mo182705b(Map<String, Object> map) {
            if (map != null && map.size() > 0) {
                ((HashMap) this.f352460c).putAll(map);
            }
            return this;
        }

        /* renamed from: c */
        public C117923b mo182706c(List<C117924b> list) {
            if (list != null && list.size() > 0) {
                ((ArrayList) this.f352461d).addAll(list);
            }
            return this;
        }
    }

    public C117921a(Object obj, String str, Map<String, Object> map, List<C117924b> list, boolean z) {
        this.f352453a = obj;
        this.f352454b = str;
        this.f352455c = map;
        this.f352456d = list;
        this.f352457e = z;
    }

    /* renamed from: a */
    public static C117923b m166309a() {
        return new C117923b((C117922a) null);
    }

    public String toString() {
        return "EventData{target=" + this.f352453a + ", eventId='" + this.f352454b + '\'' + ", mRouteRule='" + this.f352456d + '\'' + ", params=" + this.f352455c + '}';
    }
}
