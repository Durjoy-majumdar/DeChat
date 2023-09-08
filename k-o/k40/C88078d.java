package k40;

import com.tencent.p014mm.plugin.appbrand.C84250s2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Modifier;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k40.d */
public class C88078d {

    /* renamed from: a */
    public ConcurrentHashMap<Class<? extends C9562a>, C88077c> f254733a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public C88079a f254734b = null;

    /* renamed from: k40.d$a */
    public interface C88079a {
    }

    static {
        new C88078d();
    }

    /* renamed from: a */
    public <T extends C9562a, N extends T> void mo122504a(Class<T> cls, C88077c<N> cVar) {
        this.f254733a.put(cls, cVar);
        if (cVar instanceof C88076b) {
            ((C88076b) cVar).mo109767b();
        }
        C88079a aVar = this.f254734b;
        if (aVar != null) {
            C84250s2.C84251a aVar2 = (C84250s2.C84251a) aVar;
            C84250s2.this.f246089c.add(cls);
            C84250s2.this.getClass();
        }
        Log.m105925i("MicroMsg.ServiceHub", "register service %s %s", cls, cVar);
    }

    /* renamed from: b */
    public <T extends C9562a> T mo122505b(Class<T> cls) {
        boolean z;
        C88077c cVar = this.f254733a.get(cls);
        if (cls.isInterface() || !Modifier.isAbstract(cls.getModifiers())) {
            z = false;
        } else {
            Log.m105928w("MicroMsg.ServiceHub", "Did you call service by using the service implementation class ?? Use interface class instead!! Carl is warning u!");
            z = true;
        }
        T t = null;
        if (cVar != null) {
            t = cVar.get();
        } else {
            Log.m105921e("MicroMsg.ServiceHub", "Service(%s) not found!!! ", cls);
            if (z) {
                Log.m105920e("MicroMsg.ServiceHub", "This error must cause by using implementation class to call service! Use interface instead! Understand?");
            }
        }
        C88079a aVar = this.f254734b;
        if (aVar != null) {
            C84250s2.this.getClass();
        }
        return t;
    }

    /* renamed from: c */
    public void mo122506c(Class<? extends C9562a> cls) {
        C88077c remove = this.f254733a.remove(cls);
        if (remove instanceof C88076b) {
            ((C88076b) remove).mo109766a();
        }
        C88079a aVar = this.f254734b;
        if (aVar != null) {
            C84250s2.this.getClass();
        }
    }
}
