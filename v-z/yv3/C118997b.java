package yv3;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import aw3.C113080a;
import cw3.C116544b;
import cw3.C116545c;
import cw3.C116548f;
import ew3.C116791a;
import gw3.C117003g;
import gw3.C117005i;
import iw3.C117281a;
import iw3.C117287c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jw3.C117367a;
import kw3.C117428b;
import ov3.C117899b;
import qv3.C118212a;
import qv3.C47885b;
import rv3.C118244g;
import rv3.C118245h;
import uv3.C118615e;
import uv3.C118616f;
import vv3.C118700b;
import vv3.C118702d;

/* renamed from: yv3.b */
public abstract class C118997b extends C118700b implements C116544b, C117428b, C116545c, C116548f {

    /* renamed from: c */
    public C118702d f356432c;

    /* renamed from: d */
    public C118616f f356433d;

    /* renamed from: e */
    public C118999c f356434e;

    /* renamed from: f */
    public C116791a f356435f;

    /* renamed from: yv3.b$a */
    public class C118998a {

        /* renamed from: a */
        public Object[] f356436a;

        public C118998a(C118997b bVar, Object... objArr) {
            this.f356436a = objArr;
        }
    }

    public C118997b(String str, C118702d dVar, C118999c cVar) {
        super(str);
        this.f356432c = dVar;
        this.f356434e = cVar;
    }

    /* renamed from: a */
    public void mo180528a(C117005i iVar) {
        C118245h.m166799a("sensor_AbsEngine", "[method: onTouchEventCallBack ] ");
        mo183458e(3, 11, iVar);
    }

    /* renamed from: b */
    public void mo180527b(List<C117003g> list) {
        mo183458e(3, 1, list);
    }

    /* renamed from: c */
    public void mo183457c(Throwable th) {
        C117899b bVar;
        C118702d dVar = this.f356432c;
        if (dVar != null && (bVar = dVar.f355208d) != null) {
            ((C113080a) bVar).mo165608b(th, "turing_engine");
        }
    }

    /* renamed from: f */
    public void mo183686f() {
        Map<String, C117287c> map;
        Map<Integer, Set<C47885b>> map2;
        Application application;
        C118245h.m166799a("sensor_AbsEngine", "[method: unMonitorView ] ");
        C118616f fVar = this.f356433d;
        if (fVar != null) {
            if (fVar.f354958f != null) {
                C118245h.m166799a("sensor_AbsEngine", "[method: unMonitorView ] MonitorActivity");
                C117281a b = C117281a.m165349b();
                Activity activity = this.f356433d.f354958f;
                if (activity != null) {
                    Map<String, C117287c> map3 = b.f351140a;
                    if (map3 != null) {
                        ((HashMap) map3).remove(activity.getClass().getName());
                    }
                    C117367a aVar = b.f351141b;
                    if (!(aVar == null || (application = activity.getApplication()) == null)) {
                        application.unregisterActivityLifecycleCallbacks(aVar);
                    }
                }
            } else if (fVar.f354959g != null) {
                C118245h.m166799a("sensor_AbsEngine", "[method: unMonitorView ] MonitorView");
                C117281a b2 = C117281a.m165349b();
                View view = this.f356433d.f354959g;
                if (view != null) {
                    Map<String, C117287c> map4 = b2.f351140a;
                    if (map4 != null) {
                        ((HashMap) map4).remove(String.valueOf(view.hashCode()));
                    }
                    C118244g<C118212a> gVar = C118212a.f353358b;
                    T t = gVar.f353422a;
                    if (t == null) {
                        synchronized (gVar) {
                            t = gVar.f353422a;
                            if (t == null) {
                                t = gVar.mo181965a();
                                gVar.f353422a = t;
                            }
                        }
                    }
                    C118212a aVar2 = (C118212a) t;
                    C47885b bVar = b2.f351144e;
                    if (!(bVar == null || (map2 = aVar2.f353359a) == null || ((HashMap) map2).isEmpty())) {
                        Set set = (Set) ((HashMap) aVar2.f353359a).get(Integer.valueOf(view.hashCode()));
                        if (set != null && !set.isEmpty()) {
                            Iterator it = set.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C47885b bVar2 = (C47885b) it.next();
                                    if (bVar2 == bVar) {
                                        set.remove(bVar2);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (set.isEmpty()) {
                                ((HashMap) aVar2.f353359a).remove(Integer.valueOf(view.hashCode()));
                            }
                        }
                    }
                }
            } else if (fVar.f354960h != null) {
                C118245h.m166799a("sensor_AbsEngine", "[method: unMonitorView ] MonitorTouchWrapper");
                C117281a b3 = C117281a.m165349b();
                C118615e eVar = this.f356433d.f354960h;
                if (!(eVar == null || (map = b3.f351140a) == null)) {
                    ((HashMap) map).remove(String.valueOf(eVar.hashCode()));
                }
            }
            C118616f fVar2 = this.f356433d;
            fVar2.f354958f = null;
            fVar2.f354959g = null;
            fVar2.f354960h = null;
        }
    }
}
