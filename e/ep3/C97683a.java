package ep3;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vending.base.Vending;
import fp3.C97946a;
import gp3.C87314a;
import gp3.C87315b;
import gp3.C87316c;
import ip3.C76369a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jp3.C46566c;
import jp3.C9486a;
import jp3.C9487b;
import kp3.C88253a;
import mp3.C88819d;
import op3.C117876a;
import op3.C117882j;

/* renamed from: ep3.a */
public abstract class C97683a implements C9487b {

    /* renamed from: d */
    public C46566c f286517d = new C46566c();

    /* renamed from: e */
    public C46566c<Vending> f286518e = new C46566c<>();

    /* renamed from: f */
    public Map<Class, C75649d> f286519f = new ConcurrentHashMap();

    /* renamed from: g */
    public byte[] f286520g = new byte[0];

    /* renamed from: h */
    public C97946a<Object> f286521h = new C75648a();

    /* renamed from: i */
    public AtomicBoolean f286522i = new AtomicBoolean(false);

    /* renamed from: j */
    public volatile boolean f286523j = false;

    /* renamed from: n */
    public Map<Class, C87316c<C75650e>> f286524n = new HashMap();

    /* renamed from: o */
    public C76369a f286525o;

    /* renamed from: p */
    public Context f286526p;

    /* renamed from: ep3.a$a */
    public class C75648a extends C97946a<Object> {
        public C75648a() {
        }

        public Object resolveAsynchronous(Object obj) {
            C75649d dVar = (C75649d) ((ConcurrentHashMap) C97683a.this.f286519f).get((Class) obj);
            if (dVar != null) {
                return dVar.mo91385a();
            }
            return null;
        }
    }

    /* renamed from: ep3.a$d */
    public abstract class C75649d<_Struct> {
        public C75649d(C97683a aVar) {
        }

        /* renamed from: a */
        public abstract _Struct mo91385a();
    }

    /* renamed from: ep3.a$e */
    public interface C75650e<_Struct> {
        /* renamed from: a */
        void mo93771a(_Struct _struct);
    }

    /* renamed from: ep3.a$b */
    public class C97684b implements Vending.C97303m {
        public C97684b() {
        }

        /* renamed from: a */
        public void mo136387a(Object obj) {
            Class cls = (Class) obj;
            C87316c cVar = (C87316c) ((HashMap) C97683a.this.f286524n).get(cls);
            if (cVar != null) {
                C117876a b = C117882j.m166283b(C97683a.this.f286521h.get(cls));
                synchronized (cVar) {
                    cVar.mo121711n(b);
                }
            }
        }
    }

    /* renamed from: ep3.a$c */
    public class C97685c extends C87316c<C75650e> {
        public C97685c(C97683a aVar, C88819d dVar) {
            super(dVar);
        }

        /* renamed from: o */
        public void mo121712o(Object obj, C117882j jVar) {
            ((C75650e) obj).mo93771a(jVar.mo182596a(0));
        }
    }

    public C97683a() {
        this.f286518e.keep(this.f286521h);
        this.f286521h.addVendingDataResolvedCallback(new C97684b());
    }

    /* renamed from: a */
    public <_Struct> void mo136931a(Class<_Struct> cls, C75650e<_Struct> eVar) {
        C87314a aVar = (C87316c) ((HashMap) this.f286524n).get(cls);
        if (aVar == null) {
            aVar = new C97685c(this, C88819d.f256219UI);
            ((HashMap) this.f286524n).put(cls, aVar);
        }
        aVar.add(new C87315b(eVar, aVar));
        _Struct peek = this.f286521h.peek(cls);
        if (peek != null) {
            eVar.mo93771a(peek);
        }
    }

    /* renamed from: b */
    public final void mo136932b() {
        if (Looper.myLooper() == this.f286521h.getLooper() && !this.f286522i.get()) {
            C88253a.m109902a("Vending.Interactor", "This interactor has not call onCreate() yet! Interactor : %s", this);
        }
    }

    /* renamed from: c */
    public <_Struct> _Struct mo136933c(Class<_Struct> cls) {
        mo136932b();
        if (Looper.myLooper() == Looper.getMainLooper() && !this.f286523j) {
            synchronized (this.f286520g) {
                if (!this.f286523j) {
                    try {
                        this.f286520g.wait();
                    } catch (InterruptedException e) {
                        Object[] objArr = new Object[0];
                        if (C88253a.f255069a != null) {
                            Log.printErrStackTrace("Vending.Interactor", e, "", objArr);
                        }
                    }
                }
            }
        }
        return this.f286521h.get(cls);
    }

    /* renamed from: d */
    public void mo67526d() {
        this.f286522i.set(true);
    }

    /* renamed from: e */
    public void mo67531e() {
        this.f286517d.dead();
        this.f286518e.dead();
    }

    /* renamed from: f */
    public void mo136934f(Class<?> cls) {
        mo136932b();
        this.f286521h.request(cls);
    }

    /* renamed from: g */
    public void mo136935g(Context context) {
        this.f286526p = context;
    }

    /* renamed from: h */
    public void mo136936h(Intent intent) {
        this.f286525o = new C76369a(intent);
    }

    public void keep(C9486a aVar) {
        this.f286517d.keep(aVar);
    }
}
