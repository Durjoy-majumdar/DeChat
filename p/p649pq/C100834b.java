package p649pq;

import android.view.View;
import com.tencent.p014mm.feature.expt.forward.C92688a;
import com.tencent.p014mm.feature.expt.forward.ForwardReport;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l31.C61212e;
import p185kq.C76622f;

@C86522b
/* renamed from: pq.b */
public final class C100834b extends C86301e implements C76622f {
    public void N80(List<String> list, List<Long> list2) {
        ForwardReport.C92685a aVar = ForwardReport.f266735a;
        if (list2 != null) {
            for (Number longValue : list2) {
                long longValue2 = longValue.longValue();
                if (list != null) {
                    for (String str : list) {
                        if (ForwardReport.f266737c.containsKey(longValue2 + str)) {
                            ForwardReport.f266735a.mo126747d(longValue2, -1, str, true);
                        }
                    }
                }
            }
        }
        aVar.mo126744a();
    }

    /* renamed from: hL */
    public void mo106872hL(View view, List<String> list, List<C72963f4> list2, boolean z, boolean z2) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(list2, "msgInfos");
        ForwardReport.C92685a aVar = ForwardReport.f266735a;
        long currentTimeMillis = System.currentTimeMillis();
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(view, "forward_send").mo86149PM(view, aVar.mo126746c(z, currentTimeMillis)).r80(view, 8, C92688a.f266747a);
        boolean z3 = true;
        if (list2.size() <= 1) {
            z3 = false;
        }
        if (!z2) {
            for (C72963f4 f4Var : list2) {
                if (list != null) {
                    for (String str : list) {
                        if (z3) {
                            Long valueOf = Long.valueOf(currentTimeMillis);
                            ConcurrentHashMap<String, Long> concurrentHashMap = ForwardReport.f266737c;
                            concurrentHashMap.put(f4Var.getMsgId() + str, valueOf);
                        } else {
                            ForwardReport.f266737c.put(str, Long.valueOf(currentTimeMillis));
                        }
                    }
                }
            }
        } else if (list != null) {
            for (String put : list) {
                Long valueOf2 = Long.valueOf(currentTimeMillis);
                ForwardReport.f266737c.put(put, valueOf2);
            }
        }
    }

    /* renamed from: io */
    public void mo106873io(long j, String str, boolean z, int i) {
        C87412m.m108594g(str, "toUserName");
        ForwardReport.C92685a aVar = ForwardReport.f266735a;
        ConcurrentHashMap<String, Long> concurrentHashMap = ForwardReport.f266737c;
        if (concurrentHashMap.containsKey(str)) {
            ForwardReport.C92685a.C92687b bVar = ForwardReport.f266736b.get(concurrentHashMap.get(str));
            if (bVar != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("forward_message_type", Integer.valueOf(i));
                linkedHashMap.put("forward_to_usr", str);
                linkedHashMap.put("forward_result", Integer.valueOf(z ? 1 : 0));
                int i2 = 1;
                if (C72996z1.m85820U5(str) || C72996z1.m85847r5(str)) {
                    i2 = 2;
                }
                linkedHashMap.put("forward_to_type", Integer.valueOf(i2));
                bVar.mo126749a(linkedHashMap);
                ((C61212e) C86312j.m106911c(C61212e.class)).oh0(bVar.f266743a, bVar.f266744b, bVar.f266745c, 27921, false);
            }
            concurrentHashMap.remove(str);
        }
        aVar.mo126744a();
    }

    /* renamed from: nK */
    public void mo106874nK(View view, String str, boolean z) {
        C87412m.m108594g(view, "target");
        C87412m.m108594g(str, "toUsers");
        ForwardReport.C92685a aVar = ForwardReport.f266735a;
        long currentTimeMillis = System.currentTimeMillis();
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(view, "forward_send").mo86149PM(view, aVar.mo126746c(z, currentTimeMillis)).r80(view, 8, C92688a.f266747a);
        ForwardReport.f266737c.put(str, Long.valueOf(currentTimeMillis));
    }
}
