package qt1;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: qt1.c */
public class C12932c {

    /* renamed from: a */
    public final String f36954a;

    /* renamed from: b */
    public final ConcurrentHashMap<String, Long> f36955b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public int f36956c = 1;

    /* renamed from: d */
    public long f36957d;

    public C12932c(String str) {
        C87412m.m108594g(str, "traceName");
        this.f36954a = str;
    }

    /* renamed from: a */
    public final void mo12481a(String str) {
        C87412m.m108594g(str, "node");
        this.f36955b.clear();
        this.f36955b.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        this.f36956c = 1;
    }

    /* renamed from: b */
    public void mo11310b(String str) {
        C87412m.m108594g(str, "node");
        if (this.f36956c != 3) {
            this.f36955b.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            Iterator<Map.Entry<String, Long>> it = this.f36955b.entrySet().iterator();
            Map.Entry entry = null;
            while (it.hasNext()) {
                entry = it.next();
            }
            long j = 0;
            long longValue = entry != null ? ((Number) entry.getValue()).longValue() : 0;
            Map.Entry next = this.f36955b.entrySet().iterator().next();
            if (next != null) {
                j = ((Number) next.getValue()).longValue();
            }
            this.f36957d = longValue - j;
            StringBuilder sb = new StringBuilder();
            sb.append("TimeConsumingTrace " + this.f36954a + " total:" + this.f36957d + 10);
            Iterator<Map.Entry<String, Long>> it4 = this.f36955b.entrySet().iterator();
            Map.Entry next2 = it4.next();
            while (it4.hasNext()) {
                Map.Entry next3 = it4.next();
                sb.append((String) next2.getKey());
                sb.append("-->");
                sb.append((String) next3.getKey());
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(((Number) next3.getValue()).longValue() - ((Number) next2.getValue()).longValue());
                sb.append("\n");
                next2 = next3;
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "traceBuilder.toString()");
            this.f36956c = 3;
            Log.m105924i("TimeConsumingTrace", sb4);
        }
    }

    /* renamed from: c */
    public final void mo12482c(String str) {
        C87412m.m108594g(str, "node");
        if (this.f36956c != 3) {
            if (this.f36955b.get(str) == null) {
                this.f36955b.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            }
            this.f36956c = 2;
        }
    }

    /* renamed from: d */
    public final JSONObject mo12483d() {
        Iterator<Map.Entry<String, Long>> it = this.f36955b.entrySet().iterator();
        Map.Entry entry = null;
        while (it.hasNext()) {
            entry = it.next();
        }
        long j = 0;
        long longValue = entry != null ? ((Number) entry.getValue()).longValue() : 0;
        Map.Entry next = this.f36955b.entrySet().iterator().next();
        if (next != null) {
            j = ((Number) next.getValue()).longValue();
        }
        long j2 = longValue - j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("traceName", this.f36954a);
        jSONObject.put("totalTime", j2);
        Iterator<Map.Entry<String, Long>> it4 = this.f36955b.entrySet().iterator();
        Map.Entry next2 = it4.next();
        while (it4.hasNext()) {
            Map.Entry next3 = it4.next();
            jSONObject.put(((String) next2.getKey()) + "->" + ((String) next3.getKey()), ((Number) next3.getValue()).longValue() - ((Number) next2.getValue()).longValue());
            next2 = next3;
        }
        return jSONObject;
    }
}
