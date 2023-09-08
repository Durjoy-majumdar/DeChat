package dp1;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderChatListStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dp1.C58363h;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import sx3.C48501y0;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: dp1.e2 */
public final class C45431e2 {

    /* renamed from: a */
    public boolean f122957a;

    /* renamed from: b */
    public final C58363h.C45433a f122958b = new C58363h.C45433a();

    /* renamed from: c */
    public final Set<String> f122959c = new HashSet();

    /* renamed from: d */
    public final HashMap<String, Integer> f122960d = new HashMap<>();

    /* renamed from: e */
    public final Set<String> f122961e = new HashSet();

    /* renamed from: f */
    public final HashMap<String, Integer> f122962f = new HashMap<>();

    /* renamed from: g */
    public long f122963g;

    /* renamed from: a */
    public final long mo70923a(int i) {
        Collection<Integer> values = (i == 1 ? this.f122960d : this.f122962f).values();
        C87412m.m108593f(values, "getMapContainer(type).values");
        long j = 0;
        for (Integer num : values) {
            C87412m.m108593f(num, LocaleUtil.ITALIAN);
            j += (long) num.intValue();
        }
        return j;
    }

    /* renamed from: b */
    public final void mo70924b(String str, int i) {
        if (!Util.isNullOrNil(str)) {
            HashMap<String, Integer> hashMap = i == 1 ? this.f122960d : this.f122962f;
            if (hashMap.containsKey(str)) {
                Integer num = hashMap.get(str);
                if (num != null) {
                    Integer put = hashMap.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                return;
            }
            hashMap.put(str, 1);
        }
    }

    /* renamed from: c */
    public final void mo70925c(long j, long j2, String str) {
        C87412m.m108594g(str, "finderUsername");
        C58363h.C45433a aVar = this.f122958b;
        aVar.f122966a = 0;
        aVar.f122967b = "";
        aVar.f122968c = 0;
        aVar.f122969d = 0;
        this.f122957a = false;
        this.f122963g = 0;
        ((HashSet) this.f122959c).clear();
        ((HashSet) this.f122961e).clear();
        this.f122960d.clear();
        this.f122962f.clear();
        C58363h.C45433a aVar2 = this.f122958b;
        aVar2.f122966a = j;
        aVar2.f122969d = j2;
        long c = C31543z5.m39453c();
        aVar2.f122968c = c;
        String valueOf = String.valueOf(c);
        C87412m.m108594g(valueOf, "<set-?>");
        aVar2.f122967b = valueOf;
        aVar2.f122970e = str;
        this.f122957a = true;
    }

    /* renamed from: d */
    public final void mo70926d(C49712hj1 hj12) {
        FinderChatListStruct finderChatListStruct = new FinderChatListStruct();
        C58363h.C45433a aVar = this.f122958b;
        finderChatListStruct.f107882d = aVar.f122966a;
        finderChatListStruct.f107883e = aVar.f122969d;
        finderChatListStruct.f107885g = finderChatListStruct.mo86045b("chatlistSessionid", aVar.f122967b, true);
        finderChatListStruct.f107886h = (long) this.f122960d.size();
        finderChatListStruct.f107887i = mo70923a(1);
        finderChatListStruct.f107888j = mo70923a(2);
        finderChatListStruct.f107889k = (long) this.f122962f.size();
        finderChatListStruct.f107890l = this.f122963g;
        finderChatListStruct.f107892n = 0;
        long currentTimeMillis = System.currentTimeMillis();
        C58363h.C45433a aVar2 = this.f122958b;
        finderChatListStruct.f107891m = currentTimeMillis - aVar2.f122968c;
        if (hj12 != null) {
            finderChatListStruct.f107884f = (long) hj12.f134677n;
        }
        if (aVar2.f122970e.length() > 0) {
            finderChatListStruct.f107893o = finderChatListStruct.mo86045b("finderusername", this.f122958b.f122970e, true);
        }
        finderChatListStruct.mo86054n();
        C58363h hVar = C58363h.f167137a;
        StringBuilder sb = new StringBuilder();
        sb.append("report");
        sb.append(20688);
        sb.append(' ');
        String q = finderChatListStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        Log.m105924i("FinderChatReporter", sb.toString());
        this.f122957a = false;
    }

    /* renamed from: e */
    public final void mo70927e(Set<String> set) {
        C87412m.m108594g(set, "curRecordSet");
        Set<String> set2 = this.f122959c;
        if (this.f122957a) {
            Set<T> f = C48501y0.m53871f(set, set2);
            Log.m105924i("RecordFinderChatList", "latestExposeRecords" + f + "，size:" + f.size());
            if (!f.isEmpty()) {
                for (T b : f) {
                    mo70924b(b, 1);
                }
            }
            Set<String> set3 = this.f122959c;
            set3.clear();
            for (String add : set) {
                set3.add(add);
            }
            Log.m105924i("RecordFinderChatList", "pvCount:" + mo70923a(1) + ": uvCount:" + ((long) this.f122960d.size()));
        }
    }
}
