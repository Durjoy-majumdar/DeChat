package f40;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.plugin.PluginLifecycleRegistry;
import gy3.C87412m;
import i40.C46168h;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: f40.a */
public final class C45747a implements C0123n0, C0125s {

    /* renamed from: d */
    public final C39630m0 f123610d = new C39630m0();

    /* renamed from: e */
    public LifecycleScope f123611e;

    /* renamed from: f */
    public final C45748a f123612f = new C45748a(this);

    /* renamed from: f40.a$a */
    public final class C45748a extends C46168h {
        public C45748a(C45747a aVar) {
        }

        public void addObserver(C0124r rVar) {
            C87412m.m108594g(rVar, "observer");
            super.addObserver(rVar);
            StringBuilder sb = new StringBuilder();
            sb.append("addObserver totalCount:");
            ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.f124456b;
            sb.append(concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null);
            sb.append(" observer:");
            sb.append(rVar);
            Log.m105924i(PluginLifecycleRegistry.TAG, sb.toString());
        }

        public void removeObserver(C0124r rVar) {
            C87412m.m108594g(rVar, "observer");
            super.removeObserver(rVar);
            StringBuilder sb = new StringBuilder();
            sb.append("removeObserver totalCount:");
            ConcurrentHashMap<Integer, C0124r> concurrentHashMap = this.f124456b;
            sb.append(concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null);
            sb.append(" observer:");
            sb.append(rVar);
            Log.m105924i(PluginLifecycleRegistry.TAG, sb.toString());
        }
    }

    public C39623j getLifecycle() {
        return this.f123612f;
    }

    public C39630m0 getViewModelStore() {
        return this.f123610d;
    }
}
