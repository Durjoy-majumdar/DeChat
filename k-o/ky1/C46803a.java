package ky1;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.webview.luggage.C43626k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j00.C46392g;
import java.util.Iterator;
import java.util.LinkedList;
import js0.C88016e;
import kb3.C46668d;
import org.json.JSONObject;
import p828wa.C53096b;
import p828wa.C53099d;
import p828wa.C53101f;
import p828wa.C53132s;
import p828wa.C53133t;
import p828wa.C53138x;

/* renamed from: ky1.a */
public class C46803a extends C53132s {

    /* renamed from: j */
    public static LinkedList<C46803a> f125929j = new LinkedList<>();

    /* renamed from: f */
    public C46815l f125930f;

    /* renamed from: g */
    public C53101f f125931g;

    /* renamed from: h */
    public C46807c f125932h = C46807c.none;

    /* renamed from: i */
    public MTimerHandler f125933i;

    /* renamed from: ky1.a$a */
    public class C46804a implements C46392g.C46393a {

        /* renamed from: ky1.a$a$a */
        public class C46805a implements ValueCallback<String> {
            public C46805a() {
            }

            public void onReceiveValue(Object obj) {
                String str = (String) obj;
                C46803a aVar = C46803a.this;
                aVar.f125932h = C46807c.inited;
                C46815l lVar = aVar.f125930f;
                lVar.getClass();
                Log.m105924i("MicroMsg.Page2JsCoreMsgDispatch", "ready");
                if (!lVar.f125952c) {
                    lVar.f125951b = true;
                    Log.m105924i("MicroMsg.Page2JsCoreMsgDispatch", "flush");
                    Iterator<C53099d> it = lVar.f125953d.iterator();
                    while (it.hasNext()) {
                        C53099d next = it.next();
                        Log.m105925i("MicroMsg.Page2JsCoreMsgDispatch", "flush event name: %s, data: %s", next.mo14702b(), next.mo14701a());
                        lVar.f125950a.mo73815b(next);
                    }
                    lVar.f125953d.clear();
                    Iterator<C46816m> it4 = lVar.f125954e.iterator();
                    while (it4.hasNext()) {
                        C46816m next2 = it4.next();
                        lVar.f125950a.mo73781f(String.format("WxGameJsCoreBridge.invokeEvent(%s,\"%s\")", new Object[]{next2.f125955a, next2.f125956b.toString()}), (ValueCallback<String>) null);
                    }
                    lVar.f125954e.clear();
                }
                C46803a.this.mo72024b("inited");
            }
        }

        public C46804a() {
        }

        /* renamed from: a */
        public void mo71798a(String str) {
            C46668d.f125639b.mo71929h(false);
            if (Util.isNullOrNil(str)) {
                str = C88016e.m109548e("gamecenter_jscore.js");
            }
            C46803a.this.f125931g.mo73781f(str, new C46805a());
        }
    }

    /* renamed from: ky1.a$b */
    public class C46806b extends C53099d {
        public C46806b(C46803a aVar) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            return null;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onJsCoreReady";
        }
    }

    /* renamed from: ky1.a$c */
    public enum C46807c {
        none,
        initing,
        inited,
        stopped,
        destroyed
    }

    public C46803a() {
        super(MMApplicationContext.getContext(), C88329k.class);
        LinkedList<Class<? extends C53096b>> linkedList;
        C53101f fVar = (C53101f) this.f148241e;
        this.f125931g = fVar;
        this.f125930f = new C46815l(fVar);
        C53101f fVar2 = this.f125931g;
        synchronized (C10427g.class) {
            C10427g.f31646a = new LinkedList<>();
            C10427g.m10362b();
            linkedList = C10427g.f31646a;
        }
        fVar2.getClass();
        for (Class<? extends C53096b> e : linkedList) {
            fVar2.mo73816e(e, this);
        }
        ((C46392g) C86312j.m106911c(C46392g.class)).mo71796IE(new C46804a());
        mo72024b("initing");
        Log.m105924i("MicroMsg.GameJsCore", "JS CORE CREATE");
    }

    /* renamed from: d */
    public static C46803a m52100d() {
        return f125929j.peek();
    }

    /* renamed from: a */
    public synchronized void mo72023a() {
        Log.m105924i("MicroMsg.GameJsCore", "destroyDirectly");
        if (this.f125932h == C46807c.destroyed) {
            MTimerHandler mTimerHandler = this.f125933i;
            if (mTimerHandler != null && !mTimerHandler.stopped()) {
                this.f125933i.stopTimer();
            }
            C46815l lVar = this.f125930f;
            lVar.f125952c = true;
            lVar.f125953d.clear();
            lVar.f125954e.clear();
            this.f125931g.f148193g.destroy();
            f125929j.remove(this);
        }
    }

    /* renamed from: b */
    public final void mo72024b(String str) {
        Iterator<C53138x> it = C43626k0.m47360b().iterator();
        while (it.hasNext()) {
            C53138x next = it.next();
            next.f148259i.mo73815b(new C46806b(this));
            C53133t tVar = next.f148259i;
            tVar.f148245i.evaluateJavascript(String.format("window.__jscore_state__='%s';", new Object[]{str}), (ValueCallback<String>) null);
        }
    }

    /* renamed from: c */
    public void mo72025c(C46816m mVar) {
        C46815l lVar = this.f125930f;
        Log.m105925i("MicroMsg.Page2JsCoreMsgDispatch", "evaluateMessage, hasDestroyed = %b, hasReady = %b", Boolean.valueOf(lVar.f125952c), Boolean.valueOf(lVar.f125951b));
        if (!lVar.f125952c) {
            if (!lVar.f125951b) {
                lVar.f125954e.add(mVar);
                return;
            }
            lVar.f125950a.mo73781f(String.format("WxGameJsCoreBridge.invokeEvent(%s,\"%s\")", new Object[]{mVar.f125956b.toString(), mVar.f125955a}), (ValueCallback<String>) null);
        }
    }
}
