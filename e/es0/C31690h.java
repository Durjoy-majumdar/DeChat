package es0;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import java.util.concurrent.TimeUnit;
import kr0.C88262c1;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: es0.h */
public final class C31690h {

    /* renamed from: a */
    public static final C31690h f84637a = new C31690h();

    /* renamed from: b */
    public static final C13601g f84638b = C36568h.m40985a(C31691a.f84639d);

    /* renamed from: es0.h$a */
    public static final class C31691a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C31691a f84639d = new C31691a();

        public C31691a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("__appbrand_recommend_fakenative_pkg_predownload_preriod_limit__");
        }
    }

    /* renamed from: a */
    public final void mo58306a() {
        Class cls = C32735h.class;
        if (C31689g.m39501b()) {
            boolean z = true;
            if (!C31689g.m39500a() && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_recommend_use_fake_native, -1) == 1) {
                C13601g gVar = f84638b;
                if (Util.nowMilliSecond() - ((MultiProcessMMKV) ((C36570n) gVar).getValue()).getLong("KEY_LAST_CHECK_TIMESTAMP", 0) > TimeUnit.MINUTES.toMillis(((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_android_appbrand_recommend_plugin_pkg_prefetch_interval, 60))) {
                    z = false;
                }
                if (!z) {
                    ((MultiProcessMMKV) ((C36570n) gVar).getValue()).putLong("KEY_LAST_CHECK_TIMESTAMP", Util.nowMilliSecond());
                    ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113580Dm("gh_b489f391e008@app", 0);
                }
            }
        }
    }
}
