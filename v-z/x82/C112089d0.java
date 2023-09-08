package x82;

import android.os.Bundle;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x82.C112075a;

/* renamed from: x82.d0 */
public final class C112089d0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C112091e0 f335586d;

    public C112089d0(C112091e0 e0Var) {
        this.f335586d = e0Var;
    }

    public final boolean onTimerExpired() {
        C112091e0 e0Var = this.f335586d;
        synchronized (e0Var) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Integer> key : e0Var.f335590c.entrySet()) {
                arrayList.add((String) key.getKey());
            }
            HashMap<String, Integer> hashMap = new HashMap<>();
            ArrayList arrayList2 = new ArrayList();
            List<String> p = C105851w0.zx0().mo150675p();
            if (p != null) {
                for (String next : p) {
                    if (!arrayList.contains(next)) {
                        C87412m.m108593f(next, "tempSpeaker");
                        hashMap.put(next, 0);
                    }
                }
                Iterator it = arrayList.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (p.contains(str)) {
                        Integer num = e0Var.f335590c.get(str);
                        if (num == null) {
                            num = 0;
                        }
                        if (num.intValue() > 30) {
                            arrayList2.add(str);
                            z = true;
                        } else {
                            hashMap.put(str, Integer.valueOf(num.intValue() + 1));
                        }
                    } else if (e0Var.f335590c.get(str) != null) {
                        hashMap.put(str, 0);
                    }
                }
                e0Var.f335590c = hashMap;
                if (z && !e0Var.f335588a.mo163774e()) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("avatar_available_speaker", arrayList2);
                    e0Var.f335588a.mo163772c(C112075a.C112077b.AVATAR_READY, bundle);
                }
            }
        }
        return true;
    }
}
