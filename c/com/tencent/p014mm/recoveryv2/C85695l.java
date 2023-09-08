package com.tencent.p014mm.recoveryv2;

import android.app.Application;
import android.content.Context;
import com.tencent.p014mm.recoveryv2.C85678f;
import com.tencent.p014mm.recoveryv2.C85689j;
import com.tencent.p014mm.recoveryv2.C85692k;
import df3.C86274c;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.recoveryv2.l */
public class C85695l {

    /* renamed from: d */
    public static volatile C85695l f249696d;

    /* renamed from: a */
    public Context f249697a;

    /* renamed from: b */
    public C85678f f249698b;

    /* renamed from: c */
    public final Map<String, C86274c> f249699c = new HashMap();

    /* renamed from: a */
    public static C85695l m105842a() {
        if (f249696d == null) {
            synchronized (C85695l.class) {
                if (f249696d == null) {
                    f249696d = new C85695l();
                }
            }
        }
        return f249696d;
    }

    /* renamed from: b */
    public Context mo119281b() {
        if (this.f249697a == null) {
            if (C85689j.C85690a.f249687a == null) {
                Application application = null;
                try {
                    Method declaredMethod = Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", new Class[0]);
                    declaredMethod.setAccessible(true);
                    application = (Application) declaredMethod.invoke((Object) null, new Object[0]);
                } catch (Exception unused) {
                    try {
                        Method declaredMethod2 = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]);
                        declaredMethod2.setAccessible(true);
                        application = (Application) declaredMethod2.invoke((Object) null, new Object[0]);
                    } catch (Exception unused2) {
                    }
                }
                C85689j.C85690a.f249687a = application;
            }
            Context applicationContext = C85689j.C85690a.f249687a.getApplicationContext();
            this.f249697a = applicationContext;
            if (applicationContext == null) {
                throw new RuntimeException("Context should not be null");
            }
        }
        return this.f249697a;
    }

    /* renamed from: c */
    public void mo119282c(int i) {
        if (!C85689j.m105830d(mo119281b(), "")) {
            C85692k.C85693a.m105840a(4, "MicroMsg.recovery", "not main proc, skip");
            return;
        }
        C85678f fVar = this.f249698b;
        if (fVar instanceof C85678f.C85683e) {
            ((C85678f.C85683e) fVar).mo119277j(i);
        } else if (fVar instanceof C85678f.C85680b) {
            C85678f.C85680b bVar = (C85678f.C85680b) fVar;
            synchronized (bVar) {
                if (bVar.f249674m == null) {
                    bVar.f249674m = bVar.mo119273k();
                }
                bVar.f249674m.mo119277j(i);
            }
        } else {
            new C85678f.C85683e(mo119281b()).mo119277j(i);
        }
    }

    /* renamed from: d */
    public void mo119283d(String str, C86274c cVar) {
        try {
            if (!((HashMap) this.f249699c).containsKey(str)) {
                cVar.mo14948b();
                ((HashMap) this.f249699c).put(str, cVar);
                return;
            }
            throw new IllegalArgumentException(str + " has been registered! target = " + ((HashMap) this.f249699c).get(str));
        } catch (Throwable th) {
            C85692k.m105839a("MicroMsg.recovery", "register actions fail", th);
        }
    }
}
