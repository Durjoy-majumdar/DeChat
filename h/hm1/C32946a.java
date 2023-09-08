package hm1;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import os3.C62180a;
import pe1.C35464c;
import pe1.C35469d;
import rx3.C13598b0;
import se1.C36665a;
import sx3.C64197v;

/* renamed from: hm1.a */
public final class C32946a {

    /* renamed from: a */
    public static final C32946a f89535a = new C32946a();

    /* renamed from: b */
    public static final C35464c<Integer> f89536b;

    /* renamed from: hm1.a$a */
    public static final class C32947a extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C32947a f89537d = new C32947a();

        public C32947a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C62180a.f176786a.mo87241f(C62180a.C35301b.FIND_NEARBY_INDEPENDENT_LIVE_ROOM);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hm1.a$b */
    public static final class C32948b extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C32948b f89538d = new C32948b();

        public C32948b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C62180a.f176786a.mo87241f(C62180a.C35301b.FIND_NEARBY_INDEPENDENT_LIVE_SQUARE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hm1.a$c */
    public static final class C32949c extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C32949c f89539d = new C32949c();

        public C32949c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C62180a.f176786a.mo87241f(C62180a.C35301b.FIND_NEARBY_LIVE_ROOM);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hm1.a$d */
    public static final class C32950d extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C32950d f89540d = new C32950d();

        public C32950d() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C62180a.f176786a.mo87241f(C62180a.C35301b.FIND_NEARBY_LIVE_SQUARE);
            return C13598b0.f38549a;
        }
    }

    static {
        new C35469d("生成 - 直播入口 - 直达直播间红点", C32947a.f89537d);
        new C35469d("生成 - 直播入口 - 直达直播广场红点", C32948b.f89538d);
        new C35469d("生成 - 附近直播 - 直达直播间红点", C32949c.f89539d);
        new C35469d("生成 - 附近直播 - 直达直播广场红点", C32950d.f89540d);
        C36665a aVar = new C36665a(0, "直播广场是否开启声音", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        aVar.mo60268b("FIND_NEARBY_LIVE_SQUARE_ENABLE_VOICE", C64197v.m75537f(0, 1), C64197v.m75537f("默认", "开启"));
        f89536b = aVar;
    }

    /* renamed from: a */
    public final void mo58884a(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "block");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || CrashReportFactory.hasDebuger()) {
            aVar.invoke();
        }
    }
}
