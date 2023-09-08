package v31;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p31.C117924b;
import q31.C118148a;

/* renamed from: v31.b */
public class C118642b {

    /* renamed from: a */
    public int f355006a;

    /* renamed from: b */
    public String f355007b;

    /* renamed from: c */
    public int f355008c;

    /* renamed from: d */
    public Map<String, Object> f355009d = new ConcurrentHashMap();

    /* renamed from: e */
    public C118642b f355010e;

    /* renamed from: f */
    public C118642b f355011f;

    /* renamed from: g */
    public Map<String, Map<String, Object>> f355012g = new ConcurrentHashMap();

    /* renamed from: h */
    public List<WeakReference<C118148a>> f355013h = new CopyOnWriteArrayList();

    /* renamed from: i */
    public List<C118148a> f355014i = new CopyOnWriteArrayList();

    /* renamed from: j */
    public Map<String, Object> f355015j = new ConcurrentHashMap();

    /* renamed from: k */
    public Map<Integer, List<C117924b>> f355016k = new ConcurrentHashMap();

    /* renamed from: l */
    public Map<String, Long> f355017l = new ConcurrentHashMap();

    /* renamed from: m */
    public Map<String, Long> f355018m = new ConcurrentHashMap();

    /* renamed from: n */
    public int f355019n = -1;

    /* renamed from: o */
    public long f355020o;

    /* renamed from: p */
    public long f355021p;

    /* renamed from: q */
    public String f355022q;

    /* renamed from: a */
    public void mo183366a() {
        this.f355006a = 0;
        this.f355008c = 0;
        this.f355007b = null;
        ((ConcurrentHashMap) this.f355017l).clear();
        ((ConcurrentHashMap) this.f355018m).clear();
        ((ConcurrentHashMap) this.f355009d).clear();
        this.f355010e = null;
        this.f355011f = null;
        ((ConcurrentHashMap) this.f355012g).clear();
        ((CopyOnWriteArrayList) this.f355013h).clear();
        ((CopyOnWriteArrayList) this.f355014i).clear();
        ((ConcurrentHashMap) this.f355015j).clear();
        ((ConcurrentHashMap) this.f355016k).clear();
        this.f355019n = -1;
        this.f355020o = 0;
        this.f355021p = 0;
        this.f355022q = null;
    }

    public String toString() {
        return "PageDataEntity{pageId='" + this.f355006a + '\'' + ", bizGroupId='" + this.f355008c + '\'' + ", pageName='" + this.f355007b + '\'' + ", pageStep='" + this.f355019n + '\'' + ", lastReportTimes='" + this.f355018m + '\'' + ", reportIntervals='" + this.f355017l + '\'' + ", pageInTime='" + this.f355020o + '\'' + ", sessionInTime='" + this.f355021p + '\'' + ", innerProperty='" + this.f355015j + '\'' + ", pageEventParams='" + this.f355012g + '\'' + ", sourceViewId='" + this.f355022q + '\'' + ", pageParams=" + this.f355009d + '}';
    }
}
