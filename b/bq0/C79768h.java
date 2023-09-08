package bq0;

import android.webkit.JavascriptInterface;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq0.C86088a;
import cq0.C86089b;
import cq0.C86091c;
import cq0.C86092d;
import cq0.C86093e;
import fq0.C87071a;
import fq0.C87074b;
import fq0.C87078c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lu3.C88656g;
import zt3.C119157j;

/* renamed from: bq0.h */
public class C79768h implements C86093e.C86094a, C86089b.C86090a {

    /* renamed from: a */
    public final C81925i2 f233770a;

    /* renamed from: b */
    public final C83165i f233771b;

    /* renamed from: c */
    public final Map<Integer, Integer> f233772c = new ConcurrentHashMap();

    /* renamed from: d */
    public final C79770i f233773d;

    /* renamed from: bq0.h$a */
    public class C79769a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ int f233774d;

        /* renamed from: e */
        public final /* synthetic */ C86089b f233775e;

        /* renamed from: f */
        public final /* synthetic */ String f233776f;

        public C79769a(int i, C86089b bVar, String str) {
            this.f233774d = i;
            this.f233775e = bVar;
            this.f233776f = str;
        }

        public String getKey() {
            return "MicroMsg.NodeJavaBroker~CMD~" + this.f233775e.mo120512a();
        }

        public void run() {
            C79768h hVar = C79768h.this;
            C86091c cVar = new C86091c(hVar.f233770a, this.f233774d, hVar);
            C86089b bVar = this.f233775e;
            String str = this.f233776f;
            bVar.getClass();
            try {
                bVar.mo120513b(new C104289g(str), cVar);
            } catch (C79923f unused) {
                cVar.mo120515b(2);
            }
        }
    }

    public C79768h(C81925i2 i2Var, C83165i iVar) {
        this.f233770a = i2Var;
        this.f233771b = iVar;
        C79770i iVar2 = new C79770i();
        ((HashMap) iVar2.f233778a).put(1, new C87071a(this, i2Var));
        ((HashMap) iVar2.f233778a).put(2, new C87078c(this, i2Var));
        ((HashMap) iVar2.f233778a).put(3, new C87074b(this, i2Var));
        this.f233773d = iVar2;
    }

    @JavascriptInterface
    public void listen(int i, int i2) {
        boolean z;
        C86093e eVar = (C86093e) ((HashMap) this.f233773d.f233778a).get(Integer.valueOf(i));
        if (eVar == null) {
            Log.m105920e("MicroMsg.NodeJavaBroker", "listen listenerProxy null");
            return;
        }
        synchronized (eVar) {
            z = !(eVar.f250579c.size() <= 0);
            eVar.f250579c.put(i2, 1);
        }
        if (!z) {
            eVar.mo120519b();
        }
        ((ConcurrentHashMap) this.f233772c).put(Integer.valueOf(i2), Integer.valueOf(i));
    }

    @JavascriptInterface
    public void req(int i, String str, int i2) {
        Log.m105927v("MicroMsg.NodeJavaBroker", "req: cmd:%d args:%s respId:%d", Integer.valueOf(i), str, Integer.valueOf(i2));
        C86088a aVar = (C86088a) ((HashMap) C79767f.f233769a).get(Integer.valueOf(i));
        if (aVar instanceof C86089b) {
            C86089b bVar = (C86089b) aVar;
            C79769a aVar2 = new C79769a(i2, bVar, str);
            bVar.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(aVar2);
            return;
        }
        throw new IllegalStateException("req asynchronously, but target cmd not async!");
    }

    @JavascriptInterface
    public String reqSync(int i, String str) {
        Log.m105927v("MicroMsg.NodeJavaBroker", "reqSync: cmd:%d args:%s", Integer.valueOf(i), str);
        C86088a aVar = (C86088a) ((HashMap) C79767f.f233769a).get(Integer.valueOf(i));
        if (aVar instanceof C86092d) {
            C86092d dVar = (C86092d) aVar;
            C86091c cVar = new C86091c(this.f233770a);
            dVar.getClass();
            try {
                return dVar.mo120517b(new C104289g(str), cVar);
            } catch (C79923f unused) {
                return cVar.mo120515b(2);
            }
        } else {
            throw new IllegalStateException("req synchronously, but target cmd not sync!");
        }
    }

    @JavascriptInterface
    public void unListen(int i) {
        Integer num = (Integer) ((ConcurrentHashMap) this.f233772c).get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            boolean z = false;
            Log.m105927v("MicroMsg.NodeJavaBroker", "unListen: listenerType:%d listenerId:%d", Integer.valueOf(intValue), Integer.valueOf(i));
            C86093e eVar = (C86093e) ((HashMap) this.f233773d.f233778a).get(Integer.valueOf(intValue));
            if (eVar == null) {
                Log.m105920e("MicroMsg.NodeJavaBroker", "unListen listenerProxy null");
                return;
            }
            synchronized (eVar) {
                int indexOfKey = eVar.f250579c.indexOfKey(i);
                if (indexOfKey >= 0) {
                    eVar.f250579c.removeAt(indexOfKey);
                }
                if (eVar.f250579c.size() <= 0) {
                    z = true;
                }
                if (z) {
                    eVar.mo120518a();
                }
            }
            ((ConcurrentHashMap) this.f233772c).remove(Integer.valueOf(i));
        }
    }
}
