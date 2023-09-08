package com.tencent.p014mm.plugin.appbrand;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import js0.C88021l;

/* renamed from: com.tencent.mm.plugin.appbrand.l */
public class C83231l {

    /* renamed from: a */
    public static final Iterator<C83234d> f243081a = new C40487a();

    /* renamed from: b */
    public static final Map<String, C83233c> f243082b = new HashMap();

    /* renamed from: c */
    public static final Map<String, C83235e> f243083c = new HashMap();

    /* renamed from: d */
    public static final C88021l<String, C83234d> f243084d = new C88021l<>();

    /* renamed from: e */
    public static final C88021l<String, C83232b> f243085e = new C88021l<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.l$a */
    public class C40487a implements Iterator<C83234d> {
        public boolean hasNext() {
            return false;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.l$b */
    public interface C83232b {
        boolean onNewIntent(Intent intent);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.l$c */
    public enum C83233c {
        INIT,
        ON_CREATE,
        ON_RESUME,
        ON_PAUSE,
        ON_DESTROY
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.l$d */
    public static abstract class C83234d {
        /* renamed from: b */
        public void mo109496b() {
        }

        /* renamed from: c */
        public void mo109497c() {
        }

        /* renamed from: d */
        public void mo74048d() {
        }

        /* renamed from: e */
        public void mo74049e(C83235e eVar) {
        }

        /* renamed from: f */
        public void mo109498f() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.l$e */
    public enum C83235e {
        CLOSE,
        BACK,
        HIDE,
        HANG,
        HOME_PRESSED,
        RECENT_APPS_PRESSED,
        LAUNCH_NATIVE_PAGE,
        LAUNCH_MINI_PROGRAM
    }

    /* renamed from: a */
    public static void m102140a(String str, C83234d dVar) {
        if (!TextUtils.isEmpty(str) && dVar != null) {
            f243084d.mo122464e(str, dVar);
        }
    }

    /* renamed from: b */
    public static C83233c m102141b(String str) {
        C83233c cVar = (C83233c) ((HashMap) f243082b).get(str);
        return cVar == null ? C83233c.INIT : cVar;
    }

    /* renamed from: c */
    public static Iterator<C83234d> m102142c(String str) {
        Set<C83234d> d = f243084d.mo122463d(str);
        return d != null ? d.iterator() : f243081a;
    }

    /* renamed from: d */
    public static C83235e m102143d(String str) {
        C83235e eVar = (C83235e) ((HashMap) f243083c).get(str);
        return eVar == null ? C83235e.HIDE : eVar;
    }

    /* renamed from: e */
    public static void m102144e(String str, C83234d dVar) {
        if (dVar != null && !TextUtils.isEmpty(str)) {
            f243084d.mo122465f(str, dVar);
        }
    }

    /* renamed from: f */
    public static void m102145f(String str, C83233c cVar) {
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) f243082b).put(str, cVar);
        }
    }

    /* renamed from: g */
    public static void m102146g(String str, C83235e eVar) {
        if (!TextUtils.isEmpty(str)) {
            Log.m105925i("MicroMsg.AppBrandLifeCycle", "setPauseType, appId: %s, type: %s", str, eVar);
            ((HashMap) f243083c).put(str, eVar);
        }
    }
}
