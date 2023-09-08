package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import js0.C88024r;
import p1042u.C111055b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c0 */
public enum C84947c0 {
    ;
    

    /* renamed from: d */
    public static final Map<String, Integer> f247596d = null;

    /* renamed from: e */
    public static final Set<String> f247597e = null;

    /* renamed from: f */
    public static final C111055b<C83780d1, C104863f1> f247598f = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.c0$a */
    public class C84948a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83780d1 f247600d;

        /* renamed from: e */
        public final /* synthetic */ C104863f1 f247601e;

        public C84948a(C83780d1 d1Var, C104863f1 f1Var) {
            this.f247600d = d1Var;
            this.f247601e = f1Var;
        }

        public void run() {
            C84947c0.m104720i(this.f247600d, this.f247601e);
        }
    }

    /* access modifiers changed from: public */
    static {
        HashSet hashSet = new HashSet();
        hashSet.add(MimeTypes.BASE_TYPE_TEXT);
        hashSet.add("emoji");
        hashSet.add("number");
        hashSet.add("digit");
        hashSet.add("idcard");
        hashSet.add("safe-password");
        hashSet.add("encrypt-text");
        hashSet.add("encrypt-number");
        hashSet.add("encrypt-digit");
        hashSet.add("encrypt-idcard");
        hashSet.add("encrypt-bankcard");
        f247597e = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap(3);
        hashMap.put("digit", 2);
        hashMap.put("encrypt-digit", 2);
        hashMap.put("number", 0);
        hashMap.put("encrypt-number", 0);
        hashMap.put("idcard", 1);
        hashMap.put("encrypt-idcard", 1);
        hashMap.put("encrypt-bankcard", 0);
        f247596d = Collections.unmodifiableMap(hashMap);
        f247598f = new C111055b<>();
    }

    /* renamed from: a */
    public static C84954e1<?> m104713a(C83780d1 d1Var, int i) {
        Set<C84954e1<?>> d;
        if (d1Var == null || (d = C84955f.f247608a.mo122463d(d1Var)) == null) {
            return null;
        }
        for (C84954e1 next : d) {
            if (next != null) {
                if (next.mo117825h() != null && ((C104863f1) next.mo117825h()).getInputId() == i) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C84954e1<?> m104714b(C83780d1 d1Var) {
        C104863f1 orDefault;
        if (d1Var == null || (orDefault = f247598f.getOrDefault(d1Var, null)) == null) {
            return null;
        }
        return m104713a(d1Var, orDefault.getInputId());
    }

    /* renamed from: c */
    public static boolean m104715c(C83780d1 d1Var, Integer num) {
        if (num == null) {
            try {
                C104863f1 orDefault = f247598f.getOrDefault(d1Var, null);
                if (orDefault == null) {
                    return false;
                }
                num = Integer.valueOf(orDefault.getInputId());
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.AppBrandInputService", th, "[NOT CRASH]", new Object[0]);
                return false;
            }
        }
        C84954e1<?> a = m104713a(d1Var, num.intValue());
        return a != null && a.hideKeyboard();
    }

    /* renamed from: e */
    public static boolean m104716e(String str) {
        return "encrypt-digit".equalsIgnoreCase(str) || "encrypt-number".equalsIgnoreCase(str) || "encrypt-idcard".equalsIgnoreCase(str) || "encrypt-bankcard".equalsIgnoreCase(str);
    }

    /* renamed from: f */
    public static boolean m104717f(String str) {
        return ("digit".equalsIgnoreCase(str) || "number".equalsIgnoreCase(str) || "idcard".equalsIgnoreCase(str)) || m104716e(str);
    }

    /* renamed from: g */
    public static boolean m104718g(String str) {
        return MimeTypes.BASE_TYPE_TEXT.equalsIgnoreCase(str) || "encrypt-text".equalsIgnoreCase(str);
    }

    /* renamed from: h */
    public static void m104719h(C83780d1 d1Var, C84954e1<?> e1Var) {
        C84955f.f247608a.mo122464e(d1Var, e1Var);
    }

    /* renamed from: i */
    public static void m104720i(C83780d1 d1Var, C104863f1 f1Var) {
        if (d1Var != null && f1Var != null) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                C88024r.m109572b(new C84948a(d1Var, f1Var));
                return;
            }
            C111055b<C83780d1, C104863f1> bVar = f247598f;
            if (bVar.getOrDefault(d1Var, null) == f1Var) {
                bVar.remove(d1Var);
            }
        }
    }
}
