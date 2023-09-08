package f80;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: f80.d */
public abstract class C107489d<T> {

    /* renamed from: a */
    public final HashMap<String, C107490e<T>> f321598a = new HashMap<>();

    /* renamed from: a */
    public abstract T mo157911a();

    /* renamed from: b */
    public final C107490e<T> mo157913b(String str, C107491f fVar) {
        Log.m105924i("MicroMsg.Camera.Preload", mo157912c() + " getPreload key:" + str + " status:" + fVar);
        if (!TextUtils.isEmpty(str)) {
            return this.f321598a.get(str);
        }
        if (fVar != null) {
            for (Map.Entry<String, C107490e<T>> value : this.f321598a.entrySet()) {
                C107490e<T> eVar = (C107490e) value.getValue();
                if (eVar.f321600b == fVar) {
                    Log.m105924i("MicroMsg.Camera.Preload", mo157912c() + "finder select status");
                    return eVar;
                }
            }
            return null;
        }
        Iterator<Map.Entry<String, C107490e<T>>> it = this.f321598a.entrySet().iterator();
        if (it.hasNext()) {
            return (C107490e) it.next().getValue();
        }
        return null;
    }

    /* renamed from: c */
    public abstract String mo157912c();

    /* renamed from: d */
    public final T mo157914d(String str) {
        C87412m.m108594g(str, "key");
        C107490e eVar = this.f321598a.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append(mo157912c());
        sb.append(" preload size:");
        sb.append(this.f321598a.size());
        sb.append(" key:");
        sb.append(str);
        sb.append(" status:");
        sb.append(eVar != null ? eVar.f321600b : null);
        Log.printInfoStack("MicroMsg.Camera.Preload", sb.toString(), new Object[0]);
        if ((eVar != null ? eVar.f321600b : null) == C107491f.Created) {
            return eVar.f321599a;
        }
        Log.m105924i("MicroMsg.Camera.Preload", mo157912c() + " create new instance");
        T a = mo157911a();
        this.f321598a.put(str, new C107490e(a, (C107491f) null, 2, (C8480h) null));
        return a;
    }

    /* renamed from: e */
    public final void mo157915e(String str) {
        C87412m.m108594g(str, "key");
        C107490e remove = this.f321598a.remove(str);
        StringBuilder sb = new StringBuilder();
        sb.append(mo157912c());
        sb.append(" remove size:");
        sb.append(this.f321598a.size());
        sb.append(" key:");
        sb.append(str);
        sb.append(" status:");
        sb.append(remove != null ? remove.f321600b : null);
        Log.printInfoStack("MicroMsg.Camera.Preload", sb.toString(), new Object[0]);
    }
}
