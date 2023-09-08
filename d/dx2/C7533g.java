package dx2;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import p671qy.C63344h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: dx2.g */
public final class C7533g {

    /* renamed from: a */
    public static final C7533g f25793a = new C7533g();

    /* renamed from: b */
    public static final C13601g f25794b = C36568h.m40985a(C7534a.f25795d);

    /* renamed from: dx2.g$a */
    public static final class C7534a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C7534a f25795d = new C7534a();

        public C7534a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_surface_download_pkg_use_predownload, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public final boolean mo8658a(String str) {
        C87412m.m108594g(str, "libAppId");
        if (((Boolean) ((C36570n) f25794b).getValue()).booleanValue()) {
            if (C87412m.m108589b(str, "")) {
                C31343d dVar = C31343d.f83890a;
                str = ((C63344h) C86312j.m106911c(C63344h.class)).mo88249xp();
            }
            C31343d.f83890a.mo58076a(str);
            Log.m105924i("MicroMsg.SurfaceApp.SurfacePublicLibChecker", "download public lib use pre download downloadAppId:" + str + '.');
            return true;
        }
        Log.m105924i("MicroMsg.SurfaceApp.SurfacePublicLibChecker", "check(" + str + "), !usePreDownload is not supported");
        return false;
    }
}
