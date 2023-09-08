package p828wa;

import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p822sa.C48307d;
import p822sa.C48309f;
import p822sa.C48314k;
import p822sa.C48315l;
import p822sa.C48319p;
import p829xa.C53311a;
import p829xa.C53314b;
import p829xa.C53315c;

/* renamed from: wa.q */
public abstract class C53127q implements C53098c {

    /* renamed from: d */
    public final ConcurrentHashMap<String, Class<? extends C53096b>> f148229d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public C53311a f148230e;

    /* renamed from: wa.q$a */
    public class C53128a implements C48315l {

        /* renamed from: a */
        public final /* synthetic */ C53096b f148231a;

        public C53128a(C53096b bVar) {
            this.f148231a = bVar;
        }

        /* renamed from: a */
        public void mo73013a(C48314k kVar) {
            C53127q qVar = C53127q.this;
            C53096b bVar = this.f148231a;
            qVar.getClass();
            C53131r rVar = new C53131r(qVar, bVar, kVar);
            C53311a aVar = qVar.f148230e;
            if (aVar == null) {
                aVar = C53311a.f148909a;
            }
            aVar.mo68000b(bVar.mo5382b(), rVar);
        }
    }

    /* renamed from: wa.q$b */
    public class C53129b implements C53315c {

        /* renamed from: a */
        public final /* synthetic */ C53099d f148233a;

        public C53129b(C53099d dVar) {
            this.f148233a = dVar;
        }

        /* renamed from: a */
        public void mo73817a(C53314b bVar) {
            if (this.f148233a == null) {
                Log.m105920e("Luggage.LuggageRuntime", "Null Event, Ignore");
            } else if (bVar == C53314b.PASS) {
                C48319p c = C53127q.this.mo73584c();
                String b = this.f148233a.mo14702b();
                JSONObject a = this.f148233a.mo14701a();
                c.getClass();
                C48307d dVar = new C48307d(b, a);
                C48309f fVar = c.f129379c;
                synchronized (fVar) {
                    if (fVar.f129362c) {
                        fVar.f129360a.evaluateJavascript(String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", new Object[]{dVar.toString()}), (ValueCallback<String>) null);
                    } else {
                        fVar.f129361b.add(dVar);
                    }
                }
            }
        }
    }

    /* renamed from: wa.q$c */
    public class C53130c implements C53315c {

        /* renamed from: a */
        public final /* synthetic */ String f148235a;

        /* renamed from: b */
        public final /* synthetic */ JSONObject f148236b;

        public C53130c(String str, JSONObject jSONObject) {
            this.f148235a = str;
            this.f148236b = jSONObject;
        }

        /* renamed from: a */
        public void mo73817a(C53314b bVar) {
            if (bVar == C53314b.PASS) {
                C48319p c = C53127q.this.mo73584c();
                String str = this.f148235a;
                JSONObject jSONObject = this.f148236b;
                c.getClass();
                C48307d dVar = new C48307d(str, jSONObject);
                C48309f fVar = c.f129379c;
                synchronized (fVar) {
                    if (fVar.f129362c) {
                        fVar.f129360a.evaluateJavascript(String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", new Object[]{dVar.toString()}), (ValueCallback<String>) null);
                    } else {
                        fVar.f129361b.add(dVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo73814a(String str, JSONObject jSONObject) {
        C53130c cVar = new C53130c(str, jSONObject);
        C53311a aVar = this.f148230e;
        if (aVar == null) {
            aVar = C53311a.f148909a;
        }
        aVar.mo67999a(str, cVar);
    }

    /* renamed from: b */
    public void mo73815b(C53099d dVar) {
        C53129b bVar = new C53129b(dVar);
        C53311a aVar = this.f148230e;
        if (aVar == null) {
            aVar = C53311a.f148909a;
        }
        aVar.mo67999a(dVar.mo14702b(), bVar);
    }

    /* renamed from: c */
    public abstract C48319p mo73584c();

    /* renamed from: d */
    public abstract String mo73585d();

    /* renamed from: e */
    public void mo73816e(Class<? extends C53096b> cls, C53098c cVar) {
        try {
            C53096b bVar = (C53096b) cls.newInstance();
            if (cVar == null) {
                cVar = this;
            }
            try {
                bVar.f148188d = cVar;
                this.f148229d.put(bVar.mo5382b(), cls);
                C48319p c = mo73584c();
                c.f129381e.put(bVar.mo5382b(), new C53128a(bVar));
            } catch (Exception e) {
                Log.m105920e("Luggage.LuggageRuntime", "registerJsApi: " + e);
            }
        } catch (Exception e2) {
            Log.m105921e("Luggage.LuggageRuntime", "JsApi Initialize failed, %s, %s", cls.getName(), e2);
        }
    }
}
