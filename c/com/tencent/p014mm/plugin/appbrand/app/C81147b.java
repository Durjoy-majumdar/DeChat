package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.plugin.appbrand.appcache.C29182a4;
import com.tencent.p014mm.plugin.appbrand.appcache.C29188c;
import com.tencent.p014mm.plugin.appbrand.appcache.C29207e;
import com.tencent.p014mm.plugin.appbrand.appcache.C29228n3;
import com.tencent.p014mm.plugin.appbrand.appcache.C29229o1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29232p1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29301t1;
import com.tencent.p014mm.plugin.appbrand.appcache.C29309v1;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29324f;
import com.tencent.p014mm.plugin.appbrand.appusage.C29384r;
import com.tencent.p014mm.plugin.appbrand.appusage.C29391u;
import com.tencent.p014mm.plugin.appbrand.appusage.C81477d0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29421f;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29430k;
import com.tencent.p014mm.plugin.appbrand.device_discovery.bluetooth.C81774b0;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.plugin.appbrand.launching.C29583l3;
import com.tencent.p014mm.plugin.appbrand.launching.C29592y2;
import com.tencent.p014mm.plugin.appbrand.v8_snapshot.C84878x0;
import gs0.C87324b;
import java.util.HashMap;
import java.util.Map;
import ji0.C87966b;
import junit.framework.Assert;
import ki0.C33909b;
import ki0.C33910e;
import ki0.C33915j;
import ki0.C88154d;
import ni0.C34850b;
import oi0.C89212b;
import pq0.C35613b;
import vq0.C37802b;
import wi0.C90975b0;
import wi0.C91000y;
import xi0.C38727a;

/* renamed from: com.tencent.mm.plugin.appbrand.app.b */
public final class C81147b {

    /* renamed from: a */
    public static final Map<b$$h0, String[]> f238457a = new HashMap();

    /* renamed from: b */
    public static final Map<Class, Object> f238458b = new HashMap();

    static {
        m99394b(new b$$m(), C29567d1.f80484d);
        m99394b(new b$$x(), C29583l3.f80511d);
        m99394b(new b$$a0(), C29229o1.f79884e);
        m99394b(new b$$b0(), C29391u.f80181e);
        m99394b(new b$$c0(), C33910e.f91603e);
        m99394b(new b$$d0(), C29309v1.f80028e);
        m99394b(new b$$e0(), C29384r.f80172e);
        m99394b(new b$$f0(), C81477d0.f239069e);
        m99394b(new b$$g0(), C33915j.f91609d);
        m99394b(new b$$c(), C88154d.f254939f);
        m99394b(new b$$d(), C29301t1.f80013f);
        m99394b(new b$$e(), C33909b.f91601e);
        m99394b(new b$$f(), C89212b.f257057e);
        m99394b(new b$$g(), C81500i0.f239100f);
        m99394b(new b$$h(), C29421f.f80239d);
        m99394b(new b$$i(), C29430k.f80252d);
        m99394b(new b$$j(), C87966b.f254559f);
        m99394b(new b$$k(), C29232p1.f79891e);
        m99394b(new b$$l(), C29324f.f80064e);
        m99394b(new b$$n(), C29592y2.f80519d);
        m99394b(new b$$o(), C37802b.f100122B);
        m99394b(new b$$p(), C29228n3.f79883t);
        m99394b(new b$$q(), C29188c.f79823s);
        m99394b(new b$$r(), C29207e.f79851s);
        m99394b(new b$$s(), C38727a.f104495s);
        m99394b(new b$$t(), C87324b.f253069g);
        m99394b(C90975b0.C90976a.f261052a, C90975b0.f261050f);
        m99394b(new b$$u(), C29182a4.f79813e);
        m99394b(new b$$v(), WxaSyncCmdPersistentStorage.f79981d);
        m99394b(new b$$w(), C34850b.f93629e);
        m99394b(new b$$y(), C81774b0.f239968f);
        m99394b(new b$$z(), C35613b.f95197d);
        m99394b(new b$$a(), C84878x0.f247395e);
        m99394b(new b$$b(), C91000y.f261084e);
    }

    /* renamed from: a */
    public static <T> T m99393a(Class<T> cls) {
        T t;
        Assert.assertTrue("Cant pass Null class here", cls != null);
        C81161g2.vx0().requireAndWaitForAccountInitialized();
        Map<Class, Object> map = f238458b;
        synchronized (map) {
            t = ((HashMap) map).get(cls);
        }
        return t;
    }

    /* renamed from: b */
    public static void m99394b(b$$h0 b__h0, String[] strArr) {
        f238457a.put(b__h0, strArr);
    }
}
