package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p1042u.C111055b;
import p1042u.C111059i;
import qq0.C89816t;

/* renamed from: com.tencent.mm.plugin.appbrand.q1 */
public final class C84072q1 {

    /* renamed from: s */
    public static final Map<String, C84072q1> f245455s = new C111055b();

    /* renamed from: t */
    public static final C84072q1 f245456t = new C84072q1();

    /* renamed from: a */
    public volatile String f245457a;

    /* renamed from: b */
    public final AtomicInteger f245458b = new AtomicInteger();

    /* renamed from: c */
    public C89816t.C89818b f245459c;

    /* renamed from: d */
    public volatile String f245460d;

    /* renamed from: e */
    public volatile String f245461e;

    /* renamed from: f */
    public volatile boolean f245462f;

    /* renamed from: g */
    public volatile boolean f245463g;

    /* renamed from: h */
    public volatile boolean f245464h;

    /* renamed from: i */
    public volatile String f245465i;

    /* renamed from: j */
    public volatile int f245466j;

    /* renamed from: k */
    public volatile boolean f245467k;

    /* renamed from: l */
    public volatile boolean f245468l;

    /* renamed from: m */
    public volatile boolean f245469m;

    /* renamed from: n */
    public volatile long f245470n;

    /* renamed from: o */
    public volatile boolean f245471o;

    /* renamed from: p */
    public volatile int f245472p;

    /* renamed from: q */
    public volatile int f245473q;

    /* renamed from: r */
    public volatile boolean f245474r;

    public C84072q1() {
        new AtomicBoolean(false);
        this.f245459c = null;
        this.f245467k = false;
        this.f245468l = false;
        this.f245469m = false;
        this.f245471o = false;
        this.f245472p = -1;
        this.f245473q = 0;
        this.f245474r = false;
    }

    /* renamed from: a */
    public static C84072q1 m103586a(String str) {
        C84072q1 q1Var;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Map<String, C84072q1> map = f245455s;
        synchronized (map) {
            q1Var = (C84072q1) ((C111059i) map).getOrDefault(str, null);
            if (q1Var == null) {
                q1Var = new C84072q1();
                ((C111059i) map).put(str, q1Var);
            }
        }
        return q1Var;
    }

    /* renamed from: b */
    public static C84072q1 m103587b(String str) {
        C84072q1 q1Var;
        if (Util.isNullOrNil(str)) {
            q1Var = null;
        } else {
            Map<String, C84072q1> map = f245455s;
            synchronized (map) {
                q1Var = (C84072q1) ((C111059i) map).get(str);
            }
        }
        return q1Var == null ? f245456t : q1Var;
    }
}
