package rs1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.wcdb.FileUtils;
import gy3.C87412m;
import ht1.C8792p1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lf1.C10500a;
import org.json.JSONObject;
import rs1.C13383r;
import sx3.C64197v;

@C113200q(initialMode = 2)
/* renamed from: rs1.t */
public final class C13448t extends UIComponent implements C8792p1 {

    /* renamed from: d */
    public final Map<Long, List<C13449a>> f38118d = new LinkedHashMap();

    /* renamed from: e */
    public final Map<Long, Boolean> f38119e = new LinkedHashMap();

    /* renamed from: rs1.t$a */
    public static final class C13449a {

        /* renamed from: a */
        public final long f38120a;

        /* renamed from: b */
        public final String f38121b;

        /* renamed from: c */
        public final JSONObject f38122c;

        /* renamed from: d */
        public final long f38123d;

        public C13449a(long j, String str, JSONObject jSONObject, long j2) {
            C87412m.m108594g(str, TPReportKeys.Common.COMMON_STEP);
            C87412m.m108594g(jSONObject, "extraData");
            this.f38120a = j;
            this.f38121b = str;
            this.f38122c = jSONObject;
            this.f38123d = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13449a)) {
                return false;
            }
            C13449a aVar = (C13449a) obj;
            return this.f38120a == aVar.f38120a && C87412m.m108589b(this.f38121b, aVar.f38121b) && C87412m.m108589b(this.f38122c, aVar.f38122c) && this.f38123d == aVar.f38123d;
        }

        public int hashCode() {
            long j = this.f38120a;
            long j2 = this.f38123d;
            return (((((((int) (j ^ (j >>> 32))) * 31) + this.f38121b.hashCode()) * 31) + this.f38122c.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "Trace(feedId=" + this.f38120a + ", step=" + this.f38121b + ", extraData=" + this.f38122c + ", aid=" + this.f38123d + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13448t(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo12876c3(long j, String str, JSONObject jSONObject, long j2) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        C87412m.m108594g(str, TPReportKeys.Common.COMMON_STEP);
        C87412m.m108594g(jSONObject, "extraData");
        StringBuilder sb = new StringBuilder();
        sb.append("recordTrace feedId=");
        long j3 = j;
        sb.append(j);
        sb.append(" step=");
        sb.append(str);
        sb.append(" extraData=");
        sb.append(jSONObject);
        Log.m105924i("Finder.AdTraceUIC", sb.toString());
        Map<Long, List<C13449a>> map = this.f38118d;
        Long valueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(valueOf, obj);
        }
        ((List) obj).add(new C13449a(j, str, jSONObject, j2));
    }

    /* renamed from: d3 */
    public final void mo12877d3(long j) {
        String str;
        List remove = this.f38118d.remove(Long.valueOf(j));
        if (remove != null && !Util.isNullOrNil(remove)) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
            int i = 0;
            int i2 = f != null ? f.f38096i : 0;
            JSONObject jSONObject = new JSONObject();
            C13383r.C13386c cVar = C13383r.f37907d.mo12791a().f37910a.get(new C13383r.C13387d(j, i2));
            int i3 = cVar != null ? cVar.f37919f : 0;
            if (i3 == 0) {
                str = "None";
            } else if (i3 == 1) {
                str = "Dispatched";
            } else if (i3 == 2) {
                str = "Consumed";
            } else if (i3 == 3) {
                str = "Focused";
            } else if (i3 != 4) {
                str = "Unknown#" + i3;
            } else {
                str = "UnFocused";
            }
            jSONObject.put("status", str);
            long j2 = 0;
            for (Object next : remove) {
                int i4 = i + 1;
                if (i >= 0) {
                    C13449a aVar = (C13449a) next;
                    long j3 = aVar.f38123d;
                    if (j3 != 0) {
                        aVar.f38122c.put(TPReportKeys.Common.COMMON_STEP, i4);
                        jSONObject.put(aVar.f38121b, aVar.f38122c);
                        j2 = j3;
                    }
                    i = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            C10500a aVar2 = C10500a.f31736a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObj.toString()");
            C10500a.m10435a(aVar2, 2, j, i2, j2, false, "", 0, 0, false, jSONObject2, FileUtils.S_IRWXU, (Object) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        HashMap hashMap = new HashMap(this.f38118d);
        for (Map.Entry key : hashMap.entrySet()) {
            Long l = (Long) key.getKey();
            if (l == null || l.longValue() != 0) {
                C87412m.m108593f(l, "feedId");
                mo12877d3(l.longValue());
            }
        }
        hashMap.clear();
    }
}
