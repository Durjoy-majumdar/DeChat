package yq0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Locale;
import js0.C88021l;
import p963fc.C86812g;
import te3.C49014ck2;
import te3.C49158dk2;
import te3.C49713hj2;
import te3.C90411fk2;
import te3.C90437rw3;
import wq0.C91084u;
import yq0.C91545c;
import zp0.C16377l;

/* renamed from: yq0.e */
public class C91548e {

    /* renamed from: d */
    public static C91552d f262376d = C91552d.f262383a;

    /* renamed from: e */
    public static final C91550b f262377e = new C91550b((C91549a) null);

    /* renamed from: a */
    public final C91554e f262378a;

    /* renamed from: b */
    public final C91572m f262379b;

    /* renamed from: c */
    public final int f262380c;

    /* renamed from: yq0.e$a */
    public class C91549a extends C91551c {

        /* renamed from: b */
        public final /* synthetic */ C91572m f262381b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91549a(C91548e eVar, C91554e eVar2, C91572m mVar) {
            super(eVar2);
            this.f262381b = mVar;
        }

        /* renamed from: a */
        public void mo115867a() {
            super.mo115867a();
            Log.m105924i("MicroMsg.AppBrandJsApiUserAuth", "onConfirm " + mo125449c());
        }

        /* renamed from: b */
        public void mo115868b(String str) {
            super.mo115868b(str);
            Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "onDeny reason[%s] %s", str, mo125449c());
        }

        /* renamed from: c */
        public final String mo125449c() {
            C91572m mVar = this.f262381b;
            C81879g gVar = mVar.f262419a;
            String str = mVar.f262420b;
            return String.format(Locale.ENGLISH, "component[%s %d], api[%s] callbackId[%d]", new Object[]{gVar.getAppId(), Integer.valueOf(gVar.getComponentId()), str, Integer.valueOf(this.f262381b.f262422d)});
        }

        public void onCancel() {
            super.onCancel();
            Log.m105924i("MicroMsg.AppBrandJsApiUserAuth", "onCancel " + mo125449c());
        }
    }

    /* renamed from: yq0.e$b */
    public static final class C91550b extends C88021l<String, String> {
        public C91550b(C91549a aVar) {
        }
    }

    /* renamed from: yq0.e$c */
    public static class C91551c implements C91554e {

        /* renamed from: a */
        public final C91554e f262382a;

        public C91551c(C91554e eVar) {
            this.f262382a = eVar;
        }

        /* renamed from: a */
        public void mo115867a() {
            C91554e eVar = this.f262382a;
            if (eVar != null) {
                eVar.mo115867a();
            }
        }

        /* renamed from: b */
        public void mo115868b(String str) {
            C91554e eVar = this.f262382a;
            if (eVar != null) {
                eVar.mo115868b(str);
            }
        }

        public void onCancel() {
            C91554e eVar = this.f262382a;
            if (eVar != null) {
                eVar.onCancel();
            }
        }
    }

    /* renamed from: yq0.e$d */
    public interface C91552d {

        /* renamed from: a */
        public static final C91552d f262383a = new C91553a();

        /* renamed from: yq0.e$d$a */
        public class C91553a implements C91552d {
            /* renamed from: a */
            public C91548e mo113353a(C91554e eVar, C91572m mVar) {
                return new C91548e(eVar, mVar);
            }
        }

        /* renamed from: a */
        C91548e mo113353a(C91554e eVar, C91572m mVar);
    }

    /* renamed from: yq0.e$e */
    public interface C91554e {
        /* renamed from: a */
        void mo115867a();

        /* renamed from: b */
        void mo115868b(String str);

        void onCancel();
    }

    /* renamed from: yq0.e$f */
    public interface C91555f {
        void callback();
    }

    public C91548e(C91554e eVar, C91572m mVar) {
        this.f262378a = new C91549a(this, eVar, mVar);
        this.f262379b = mVar;
        this.f262380c = mVar.f262419a.getRuntime().f238149o.f239365g;
    }

    /* renamed from: a */
    public static void m114885a(C91548e eVar, C16377l lVar, C90411fk2 fk22) {
        C91548e eVar2 = eVar;
        C90411fk2 fk23 = fk22;
        C81879g gVar = eVar2.f262379b.f262419a;
        String appId = gVar.getAppId();
        String str = eVar2.f262379b.f262420b;
        AppBrandRuntime runtime = gVar.getRuntime();
        Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, appId %s, api %s, checkAuth Response.errcode %d", appId, str, Integer.valueOf(fk23.f259514d.f134688d));
        C49713hj2 hj22 = fk23.f259514d;
        int i = hj22.f134688d;
        if (i == 0) {
            f262377e.mo122464e(appId, str);
            ((C91549a) eVar2.f262378a).mo115867a();
        } else if (i != -12000) {
            ((C91549a) eVar2.f262378a).mo115868b(hj22.f134689e);
        } else {
            C90437rw3 rw32 = fk23.f259515e.get(0);
            if (rw32 == null) {
                ((C91549a) eVar2.f262378a).mo115868b((String) null);
            } else if (!(runtime instanceof C86812g) || !((C86812g) runtime).mo121250f1()) {
                String str2 = fk23.f259520j;
                String str3 = fk23.f259519i;
                String str4 = fk23.f259518h;
                String str5 = rw32.f259822d;
                boolean b = C91084u.m114265b(str5, runtime.mo113051d0());
                String a = C91084u.m114264a(str5, runtime);
                if (!b || !TextUtils.isEmpty(a)) {
                    C91560j jVar = r0;
                    C91560j jVar2 = new C91560j(eVar, runtime, gVar, str5, fk22, appId, str, lVar, str2, rw32, str4, str3, b, a);
                    gVar.mo109673t(jVar);
                    return;
                }
                ((C91549a) eVar2.f262378a).mo115868b("fail:require permission desc");
                Log.m105924i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user confirm, error = fail:require permission desc");
            } else {
                Log.m105924i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, is headless mode");
                ((C91549a) eVar2.f262378a).onCancel();
            }
        }
    }

    /* renamed from: b */
    public static void m114886b(C91548e eVar, C16377l lVar, String str, int i, boolean z, boolean z2, C91555f fVar) {
        eVar.getClass();
        C49014ck2 ck22 = new C49014ck2();
        ck22.f131795d = eVar.f262379b.f262419a.getAppId();
        ck22.f131796e.add(str);
        ck22.f131797f = i;
        ck22.f131800i = z2;
        String appId = eVar.f262379b.f262419a.getAppId();
        lVar.mo14840YQ("/cgi-bin/mmbiz-bin/js-authorize-confirm", appId, ck22, C49158dk2.class).mo123061d(new C91556f(eVar, i, appId, eVar.f262379b.f262420b, str, z, fVar));
    }

    /* renamed from: d */
    public static void m114887d(C91572m mVar, C91554e eVar) {
        if (!Util.isNullOrNil(mVar.f262419a.getAppId()) && !Util.isNullOrNil(mVar.f262420b)) {
            C81879g gVar = mVar.f262419a;
            HashMap<AppBrandRuntime, C91545c> hashMap = C91545c.f262370h;
            C87412m.m108594g(gVar, "component");
            AppBrandRuntime runtime = gVar.getRuntime();
            C91545c cVar = null;
            if (runtime != null) {
                HashMap<AppBrandRuntime, C91545c> hashMap2 = C91545c.f262370h;
                synchronized (hashMap2) {
                    C91545c cVar2 = hashMap2.get(runtime);
                    if (cVar2 == null) {
                        cVar2 = new C91545c(runtime, (C8480h) null);
                        hashMap2.put(runtime, cVar2);
                    }
                    cVar = cVar2;
                }
            }
            if (cVar != null) {
                cVar.getClass();
                String str = "name[" + mVar.f262420b + "], callbackId[" + mVar.f262422d + "], appId[" + mVar.f262419a.getAppId() + "], component[" + mVar.f262419a.getComponentId() + ']';
                Log.m105924i("MicroMsg.AppBrandJSApiUserAuthExecutor", "execute " + str);
                cVar.mo117441d(new C91545c.C91546a(mVar, eVar, str));
            }
        }
    }

    /* renamed from: c */
    public boolean mo113354c(AppBrandRuntime appBrandRuntime) {
        return false;
    }
}
