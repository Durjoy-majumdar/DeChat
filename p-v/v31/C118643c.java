package v31;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p31.C117924b;
import q31.C118148a;

/* renamed from: v31.c */
public class C118643c {

    /* renamed from: a */
    public String f355023a;

    /* renamed from: b */
    public String f355024b;

    /* renamed from: c */
    public Map<String, Object> f355025c = new ConcurrentHashMap();

    /* renamed from: d */
    public Map<String, Map<String, Object>> f355026d = new ConcurrentHashMap();

    /* renamed from: e */
    public WeakReference<View> f355027e;

    /* renamed from: f */
    public List<C118148a> f355028f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public Map<String, Object> f355029g = new ConcurrentHashMap();

    /* renamed from: h */
    public Map<Integer, List<C117924b>> f355030h = new ConcurrentHashMap();

    /* renamed from: i */
    public Map<String, Long> f355031i = new ConcurrentHashMap();

    /* renamed from: j */
    public Map<String, Long> f355032j = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo183368a() {
        this.f355023a = null;
        this.f355024b = null;
        ((ConcurrentHashMap) this.f355025c).clear();
        ((ConcurrentHashMap) this.f355026d).clear();
        this.f355027e = null;
        ((CopyOnWriteArrayList) this.f355028f).clear();
        ((ConcurrentHashMap) this.f355029g).clear();
        ((ConcurrentHashMap) this.f355030h).clear();
        ((ConcurrentHashMap) this.f355031i).clear();
        ((ConcurrentHashMap) this.f355032j).clear();
    }

    public String toString() {
        return "ViewDataEntity{viewId='" + this.f355023a + '\'' + ", viewUniqueId='" + this.f355024b + '\'' + ", lastReportTimes='" + this.f355032j + '\'' + ", reportIntervals='" + this.f355031i + '\'' + ", viewParams=" + this.f355025c + '\'' + ", viewEventParams=" + this.f355026d + '\'' + ", innerProperty='" + this.f355029g + '}';
    }
}
