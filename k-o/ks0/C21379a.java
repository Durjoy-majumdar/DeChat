package ks0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.utils.C84749i0;
import java.util.concurrent.atomic.AtomicBoolean;
import ks0.C21380b;

/* renamed from: ks0.a */
public enum C21379a implements C21385e, C84749i0.C84750a {
    INST;
    

    /* renamed from: g */
    public static final C21383c f60480g = null;

    /* renamed from: d */
    public final C21385e f60482d;

    /* renamed from: e */
    public final AtomicBoolean f60483e;

    /* access modifiers changed from: public */
    static {
        f60480g = new C21383c();
    }

    /* renamed from: a */
    public void mo33476a(Context context) {
        C21380b bVar = (C21380b) this.f60482d;
        synchronized (bVar) {
            Context context2 = bVar.f60484d;
            if (context2 != null) {
                C21380b.C21382b bVar2 = bVar.f60489i;
                if (bVar2 != null) {
                    context2.unregisterReceiver(bVar2);
                }
                bVar.f60484d = null;
            }
        }
    }

    /* renamed from: b */
    public void mo33477b(Context context) {
        if (!this.f60483e.getAndSet(true)) {
            C21380b bVar = (C21380b) this.f60482d;
            synchronized (bVar) {
                bVar.f60487g = null;
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.f60484d = context;
            }
        }
    }
}
