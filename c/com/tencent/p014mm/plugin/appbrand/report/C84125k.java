package com.tencent.p014mm.plugin.appbrand.report;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import lp3.C88631d;
import p156gj.C87203t;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C90447wr3;
import te3.c55;
import te3.d55;
import te3.j55;
import zp0.C16377l;

/* renamed from: com.tencent.mm.plugin.appbrand.report.k */
public final class C84125k implements C84134l0 {

    /* renamed from: a */
    public static final C84125k f245593a = new C84125k();

    /* renamed from: b */
    public static final long f245594b = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: c */
    public static final LinkedList<j55> f245595c = new LinkedList<>();

    /* renamed from: d */
    public static MTimerHandler f245596d;

    /* renamed from: e */
    public static final Object f245597e = new Object();

    /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a */
    public static final class C1954a {

        /* renamed from: a */
        public static final C13601g f11863a = C36568h.m40985a(C1955a.f11867d);

        /* renamed from: b */
        public static final C13601g f11864b = C36568h.m40985a(C1956b.f11868d);

        /* renamed from: c */
        public static final C13601g f11865c = C36568h.m40985a(C1961g.f11873d);

        /* renamed from: d */
        public static final C13601g f11866d = C36568h.m40985a(C1959e.f11871d);

        /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a$a */
        public static final class C1955a extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C1955a f11867d = new C1955a();

            public C1955a() {
                super(0);
            }

            public Object invoke() {
                return Build.BRAND;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a$b */
        public static final class C1956b extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C1956b f11868d = new C1956b();

            public C1956b() {
                super(0);
            }

            public Object invoke() {
                return C87203t.m108275k() + Build.CPU_ABI;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a$c */
        public static final class C1957c extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C1957c f11869d = new C1957c();

            public C1957c() {
                super(0);
            }

            public Object invoke() {
                return Build.MANUFACTURER + '-' + C87203t.m108275k();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a$d */
        public static final class C1958d extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C1958d f11870d = new C1958d();

            public C1958d() {
                super(0);
            }

            public Object invoke() {
                return "android-" + Build.VERSION.SDK_INT;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a$e */
        public static final class C1959e extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C1959e f11871d = new C1959e();

            public C1959e() {
                super(0);
            }

            public Object invoke() {
                return "android-" + Build.MANUFACTURER;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a$f */
        public static final class C1960f extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C1960f f11872d = new C1960f();

            public C1960f() {
                super(0);
            }

            public Object invoke() {
                return "android-" + Build.VERSION.SDK_INT;
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.report.k$a$g */
        public static final class C1961g extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C1961g f11873d = new C1961g();

            public C1961g() {
                super(0);
            }

            public Object invoke() {
                return "" + Build.VERSION.SDK_INT;
            }
        }

        static {
            C36568h.m40985a(C1958d.f11870d);
            C36568h.m40985a(C1957c.f11869d);
            C36568h.m40985a(C1960f.f11872d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.k$b */
    public static final class C84126b<T> implements C88631d.C88632b {

        /* renamed from: a */
        public final /* synthetic */ String f245598a;

        /* renamed from: b */
        public final /* synthetic */ LinkedList<j55> f245599b;

        public C84126b(String str, LinkedList<j55> linkedList) {
            this.f245598a = str;
            this.f245599b = linkedList;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            d55 d55 = (d55) obj;
            Log.m105924i("Luggage.AppBrandIDKeyBatchReportNew", "reportNow, reason=" + this.f245598a + ", reportList.size=" + this.f245599b.size() + ", cgi back ok");
            this.f245599b.clear();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.report.k$c */
    public static final class C84127c<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ String f245600a;

        /* renamed from: b */
        public final /* synthetic */ LinkedList<j55> f245601b;

        public C84127c(String str, LinkedList<j55> linkedList) {
            this.f245600a = str;
            this.f245601b = linkedList;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("reportNow, reason=");
            sb.append(this.f245600a);
            sb.append(", reportList.size=");
            sb.append(this.f245601b.size());
            sb.append(", cgi error ");
            sb.append(obj != null ? obj.toString() : null);
            Log.m105920e("Luggage.AppBrandIDKeyBatchReportNew", sb.toString());
            LinkedList<j55> linkedList = C84125k.f245595c;
            LinkedList<j55> linkedList2 = this.f245601b;
            synchronized (linkedList) {
                linkedList.addAll(linkedList2);
            }
            this.f245601b.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r2 != false) goto L_0x0044;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo116790a(te3.j55 r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "Luggage.AppBrandIDKeyBatchReportNew"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "writeIDKeyData type:"
            r1.append(r2)
            int r2 = r5.f259611d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.LinkedList<te3.j55> r0 = f245595c
            monitor-enter(r0)
            r0.addLast(r5)     // Catch:{ all -> 0x005e }
            int r5 = r0.size()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)
            r0 = 50
            r1 = 1
            if (r5 < r0) goto L_0x0033
            java.lang.String r5 = "writeIDKeyData"
            r4.mo116792c(r5, r1)
            goto L_0x005a
        L_0x0033:
            java.lang.Object r5 = f245597e
            monitor-enter(r5)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = f245596d     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0044
            r2 = 0
            boolean r0 = r0.stopped()     // Catch:{ all -> 0x005b }
            if (r0 != r1) goto L_0x0042
            r2 = 1
        L_0x0042:
            if (r2 == 0) goto L_0x0057
        L_0x0044:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler     // Catch:{ all -> 0x005b }
            java.lang.String r2 = "Luggage.AppBrandIDKeyBatchReportNew"
            com.tencent.mm.plugin.appbrand.report.l r3 = new com.tencent.mm.plugin.appbrand.report.l     // Catch:{ all -> 0x005b }
            r3.<init>()     // Catch:{ all -> 0x005b }
            r0.<init>((java.lang.String) r2, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r3, (boolean) r1)     // Catch:{ all -> 0x005b }
            long r1 = f245594b     // Catch:{ all -> 0x005b }
            r0.startTimer(r1, r1)     // Catch:{ all -> 0x005b }
            f245596d = r0     // Catch:{ all -> 0x005b }
        L_0x0057:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005b }
            monitor-exit(r5)
        L_0x005a:
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x005e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.report.C84125k.mo116790a(te3.j55):void");
    }

    /* renamed from: b */
    public void mo116791b(String str, int i) {
    }

    /* renamed from: c */
    public final boolean mo116792c(String str, boolean z) {
        LinkedList linkedList;
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (z) {
            synchronized (f245597e) {
                MTimerHandler mTimerHandler = f245596d;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                }
                f245596d = null;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        LinkedList<j55> linkedList2 = f245595c;
        synchronized (linkedList2) {
            linkedList = new LinkedList(linkedList2);
            linkedList2.clear();
        }
        Log.m105924i("Luggage.AppBrandIDKeyBatchReportNew", "reportNow, reason=" + str + ", reportList.size=" + linkedList.size());
        if (linkedList.isEmpty()) {
            return false;
        }
        c55 c55 = new c55();
        C90447wr3 wr32 = new C90447wr3();
        wr32.f259934d = Build.MANUFACTURER;
        wr32.f259935e = 2;
        C13601g gVar = C1954a.f11863a;
        wr32.f259936f = (String) ((C36570n) C1954a.f11864b).getValue();
        Object value = ((C36570n) C1954a.f11863a).getValue();
        C87412m.m108593f(value, "<get-DEVICE_BRAND>(...)");
        wr32.f259937g = (String) value;
        wr32.f259938h = MMApplicationContext.getResources().getDisplayMetrics().widthPixels;
        wr32.f259939i = MMApplicationContext.getResources().getDisplayMetrics().heightPixels;
        wr32.f259940j = (String) ((C36570n) C1954a.f11866d).getValue();
        wr32.f259941n = (String) ((C36570n) C1954a.f11865c).getValue();
        wr32.f259942o = MMApplicationContext.getResources().getConfiguration().locale.getLanguage();
        c55.f259440e = wr32;
        c55.f259439d.addAll(linkedList);
        ((C16377l) C89909e.m112436a(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxausrevent/wxaappidkeybatchreport", (String) null, c55, d55.class).mo114038a(new C84126b(str, linkedList)).mo123065b(new C84127c(str, linkedList));
        return true;
    }
}
