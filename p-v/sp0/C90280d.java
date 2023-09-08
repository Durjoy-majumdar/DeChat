package sp0;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.SSLContext;
import org.json.JSONObject;
import tp0.C90567d;

/* renamed from: sp0.d */
public class C90280d {

    /* renamed from: a */
    public int f259165a;

    /* renamed from: b */
    public String f259166b = (C112760b.m154247s() + "appbrand/");

    /* renamed from: c */
    public boolean f259167c = false;

    /* renamed from: d */
    public SSLContext f259168d;

    /* renamed from: e */
    public final String f259169e;

    /* renamed from: f */
    public final ArrayList<String> f259170f = new ArrayList<>();

    /* renamed from: g */
    public C82381f f259171g;

    /* renamed from: h */
    public final Map<String, ConcurrentLinkedQueue<Runnable>> f259172h;

    /* renamed from: i */
    public final ArrayList<C90567d> f259173i = new ArrayList<>();

    /* renamed from: sp0.d$a */
    public interface C90281a {
        /* renamed from: a */
        void mo114287a(JSONObject jSONObject);

        /* renamed from: b */
        void mo114288b(int i, String str, int i2);

        /* renamed from: c */
        void mo114289c(int i, long j, long j2);

        /* renamed from: d */
        void mo114290d(int i, String str, String str2, int i2, long j, Map map);
    }

    /* renamed from: sp0.d$b */
    public interface C90282b {
    }

    public C90280d(C82381f fVar, boolean z) {
        this.f259171g = fVar;
        C90272a aVar = (C90272a) fVar.mo109671p(C90272a.class);
        this.f259165a = aVar.f259136p;
        this.f259169e = aVar.f259120B;
        this.f259168d = C90309m.m113081p(aVar);
        this.f259172h = new Hashtable(10);
        this.f259167c = z;
    }

    /* renamed from: a */
    public final void mo124501a(String str) {
        if (str != null) {
            synchronized (this.f259173i) {
                Iterator<C90567d> it = this.f259173i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C90567d next = it.next();
                    if (str.equals(next.f260220v)) {
                        this.f259173i.remove(next);
                        break;
                    }
                }
            }
        }
    }
}
