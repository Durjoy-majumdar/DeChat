package com.tencent.p014mm.plugin.webview.core;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import i93.C46206e;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import rx3.C13601g;

/* renamed from: com.tencent.mm.plugin.webview.core.e0 */
public final class C43510e0 {

    /* renamed from: a */
    public static final C43510e0 f117642a = new C43510e0();

    /* renamed from: b */
    public static final Map<String, LinkedList<C43511a>> f117643b = new HashMap();

    /* renamed from: c */
    public static final int f117644c = 3;

    /* renamed from: com.tencent.mm.plugin.webview.core.e0$a */
    public static final class C43511a implements ServiceConnection {

        /* renamed from: d */
        public final boolean f117645d;

        /* renamed from: e */
        public final Class<? extends Service> f117646e;

        /* renamed from: f */
        public C43514j f117647f;

        /* renamed from: g */
        public C43791l f117648g;

        public C43511a(boolean z, Class<? extends Service> cls) {
            C87412m.m108594g(cls, "stubService");
            this.f117645d = z;
            this.f117646e = cls;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C43514j jVar;
            C43510e0 e0Var = C43510e0.f117642a;
            Log.m105924i("MicroMsg.WebViewUIConnectionPool", "connected:" + componentName);
            C43791l a = C43791l.C43792a.m47732a(iBinder);
            this.f117648g = a;
            if (a != null && (jVar = this.f117647f) != null) {
                jVar.mo10772d(new C43509d0(this));
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C43510e0 e0Var = C43510e0.f117642a;
            Log.m105924i("MicroMsg.WebViewUIConnectionPool", "disconnected:" + componentName);
            this.f117648g = null;
            C43514j jVar = this.f117647f;
            if (jVar != null && jVar.mo10771c()) {
                C43510e0.f117642a.mo67793a(this.f117645d, this.f117646e, jVar);
            }
            this.f117647f = null;
            C43510e0.f117642a.mo67794b(this.f117646e).remove(this);
        }
    }

    /* renamed from: a */
    public final void mo67793a(boolean z, Class<? extends Service> cls, C43514j jVar) {
        C43511a aVar;
        C87412m.m108594g(cls, "stubService");
        C87412m.m108594g(jVar, "binder");
        if (!z || !(!mo67794b(cls).isEmpty())) {
            C43511a aVar2 = new C43511a(z, cls);
            Context context = MMApplicationContext.getContext();
            context.bindService(new Intent(context, cls), aVar2, 1);
            if (z) {
                C13601g gVar = C46206e.f124554a;
                C115669n.INSTANCE.mo175913w(1200, 101, 1);
            }
            Log.m105924i("MicroMsg.WebViewUIConnectionPool", "bind new service");
            aVar = aVar2;
        } else {
            aVar = mo67794b(cls).pop();
            C13601g gVar2 = C46206e.f124554a;
            C115669n.INSTANCE.mo175913w(1200, 102, 1);
            Log.m105924i("MicroMsg.WebViewUIConnectionPool", "reuse service");
        }
        aVar.getClass();
        aVar.f117647f = jVar;
        if (aVar.f117648g != null) {
            jVar.mo10772d(new C43509d0(aVar));
        }
        Log.m105924i("MicroMsg.WebViewUIConnectionPool", "attach service");
    }

    /* renamed from: b */
    public final LinkedList<C43511a> mo67794b(Class<? extends Service> cls) {
        String canonicalName = cls.getCanonicalName();
        C87412m.m108591d(canonicalName);
        Map<String, LinkedList<C43511a>> map = f117643b;
        LinkedList<C43511a> linkedList = (LinkedList) ((HashMap) map).get(canonicalName);
        if (linkedList != null) {
            return linkedList;
        }
        LinkedList<C43511a> linkedList2 = new LinkedList<>();
        ((HashMap) map).put(canonicalName, linkedList2);
        return linkedList2;
    }
}
