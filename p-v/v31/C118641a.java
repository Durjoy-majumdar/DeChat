package v31;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p31.C117924b;
import q31.C118148a;

/* renamed from: v31.a */
public class C118641a {

    /* renamed from: a */
    public Map<String, Object> f355000a = new ConcurrentHashMap();

    /* renamed from: b */
    public Map<String, Map<String, Object>> f355001b = new ConcurrentHashMap();

    /* renamed from: c */
    public List<C118148a> f355002c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public Map<Integer, List<C117924b>> f355003d = new ConcurrentHashMap();

    /* renamed from: e */
    public Map<String, Long> f355004e = new ConcurrentHashMap();

    /* renamed from: f */
    public Map<String, Long> f355005f = new ConcurrentHashMap();

    public String toString() {
        return "ObjectDataEntity{objectParams=" + this.f355000a + '\'' + ", objectEventParams='" + this.f355001b + '\'' + ", lastReportTimes='" + this.f355005f + '\'' + ", reportIntervals='" + this.f355004e + '}';
    }
}
