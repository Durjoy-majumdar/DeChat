package dp1;

import android.util.ArrayMap;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Collection;
import java.util.LinkedList;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import p213oh.C11412b;
import te3.db4;
import te3.op4;

/* renamed from: dp1.a1 */
public final class C7419a1 {

    /* renamed from: a */
    public static final C7419a1 f25592a = new C7419a1();

    /* renamed from: b */
    public static final ArrayMap<Long, C7420a> f25593b = new ArrayMap<>();

    /* renamed from: c */
    public static C58378j1 f25594c;

    /* renamed from: dp1.a1$a */
    public static final class C7420a {

        /* renamed from: a */
        public final String f25595a;

        /* renamed from: b */
        public long f25596b;

        /* renamed from: c */
        public final long f25597c;

        public C7420a(String str, long j, long j2) {
            C87412m.m108594g(str, "feedId");
            this.f25595a = str;
            this.f25596b = j;
            this.f25597c = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7420a)) {
                return false;
            }
            C7420a aVar = (C7420a) obj;
            return C87412m.m108589b(this.f25595a, aVar.f25595a) && this.f25596b == aVar.f25596b && this.f25597c == aVar.f25597c;
        }

        public int hashCode() {
            long j = this.f25596b;
            long j2 = this.f25597c;
            return (((this.f25595a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "FinderSearchFeedInfo(feedId=" + this.f25595a + ", stayTimeInMs=" + this.f25596b + ", startPlayTime=" + this.f25597c + ')';
        }
    }

    /* renamed from: a */
    public final synchronized void mo8552a(LinkedList<db4> linkedList) {
        C87412m.m108594g(linkedList, "status");
        long c = C31543z5.m39453c();
        for (db4 db4 : linkedList) {
            op4 op4 = db4.f182678f;
            long j = op4 != null ? op4.f184689f : 0;
            long j2 = op4 != null ? op4.f184693j : 0;
            if (j == 0 && j2 > 0) {
                j = c - j2;
            }
            long j3 = j;
            long j4 = db4.f182676d;
            String p = C61926c.m72691p(j4);
            int i = C11412b.f33577a;
            Log.m105925i("Finder.SearchFeedInfoCollector", "stayTimeMs:" + j3 + " id:" + p, (Object[]) null);
            ArrayMap<Long, C7420a> arrayMap = f25593b;
            C7420a aVar = arrayMap.get(Long.valueOf(j4));
            if (aVar != null) {
                aVar.f25596b += j3;
            } else {
                C7420a put = arrayMap.put(Long.valueOf(j4), new C7420a(p, j3, j2));
            }
        }
    }

    /* renamed from: b */
    public final JSONArray mo8553b(Collection<C7420a> collection) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C7420a aVar : collection) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("feed_id", aVar.f25595a);
                jSONObject.put("start_play_time_ms", aVar.f25597c);
                jSONObject.put("stay_time_ms", aVar.f25596b);
                jSONArray.put(jSONObject);
            }
        } catch (Exception e) {
            int i = C11412b.f33577a;
            Log.printErrStackTrace("Finder.SearchFeedInfoCollector", e, "report", new Object[0]);
        }
        int i2 = C11412b.f33577a;
        Log.m105925i("Finder.SearchFeedInfoCollector", "report:" + jSONArray, (Object[]) null);
        return jSONArray;
    }
}
