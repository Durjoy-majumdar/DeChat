package p747xb;

import android.content.Context;
import android.content.res.Configuration;
import br0.C79774c;
import bt0.C79808b;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83817h4;
import com.tencent.p014mm.plugin.appbrand.page.C83905r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import java.util.Map;
import p1044ub.C90626a;
import p1044ub.C90630c;
import p194lc.C88453o;
import p963fc.C86812g;
import rq0.C90084c;

/* renamed from: xb.a */
public abstract class C91145a<PAGE extends C90630c> extends C90626a.C90627a<PAGE> implements C83905r1 {
    public C91145a(PAGE page) {
        super(page);
    }

    /* renamed from: K */
    public void mo111244K() {
        for (Object next : mo124763Y()) {
            if (next instanceof C90084c) {
                ((C90084c) next).mo116449b();
            }
        }
    }

    /* renamed from: O */
    public void mo116487O(C79774c cVar) {
    }

    /* renamed from: R */
    public void mo116488R(Configuration configuration) {
        for (Object next : mo124763Y()) {
            if (next instanceof C90084c) {
                ((C90084c) next).onConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: S */
    public void mo116489S(Map<String, Object> map, C83817h4 h4Var) {
    }

    /* renamed from: T */
    public void mo111246T() {
    }

    /* renamed from: b */
    public void mo111250b() {
        for (Object next : mo124763Y()) {
            if (next instanceof C90084c) {
                ((C90084c) next).onDestroy();
            }
        }
        synchronized (this.f260368e) {
            ((HashMap) this.f260368e).clear();
        }
        synchronized (this) {
            this.f260367d = null;
        }
    }

    /* renamed from: b0 */
    public final String mo125215b0() {
        C82381f Z = mo124764Z();
        if (Z != null) {
            return Z.getAppId();
        }
        Log.printErrStackTrace("Luggage.AbstractPageViewRenderer", new Throwable(), "getAppId", new Object[0]);
        return null;
    }

    /* renamed from: c0 */
    public Context mo125216c0() {
        Context context = ((C90630c) mo124764Z()).getContext();
        return context == null ? MMApplicationContext.getContext() : context;
    }

    /* renamed from: d */
    public boolean mo116490d() {
        return this instanceof C88453o;
    }

    /* renamed from: d0 */
    public C86812g mo116498d0() {
        C90630c cVar = (C90630c) mo124764Z();
        if (cVar == null) {
            return null;
        }
        return cVar.getRuntime();
    }

    /* renamed from: k */
    public void mo111264k() {
        for (Object next : mo124763Y()) {
            if (next instanceof C90084c) {
                ((C90084c) next).mo116450c();
            }
        }
    }

    /* renamed from: x */
    public void mo111272x(C79808b bVar) {
        for (Object next : mo124763Y()) {
            if (next instanceof C90084c) {
                ((C90084c) next).mo116451h(bVar);
            }
        }
    }
}
