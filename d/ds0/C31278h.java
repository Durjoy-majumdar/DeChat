package ds0;

import a14.C53921m;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import java.lang.ref.WeakReference;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import te3.a55;
import te3.z45;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: ds0.h */
public final class C31278h {

    /* renamed from: a */
    public static final C31278h f83758a = new C31278h();

    /* renamed from: ds0.h$a */
    public static final class C31279a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C32230s f83759d;

        public C31279a(C32230s sVar) {
            this.f83759d = sVar;
        }

        /* renamed from: a */
        public final /* synthetic */ int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            return ((Number) this.f83759d.mo237D(Integer.valueOf(i), Integer.valueOf(i2), str, cVar, yVar)).intValue();
        }
    }

    /* renamed from: a */
    public static Object m39349a(C31278h hVar, String str, int i, int i2, C15601d dVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 4) != 0) {
            i2 = 32;
        }
        hVar.getClass();
        Log.m105924i("MicroMsg.CgiWxaAppGetPrivacyUseRecord", "doFetch, appUsername: " + str + ", updateTime: " + i + ", maxFetchCount: " + i2);
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        WeakReference weakReference = new WeakReference(mVar);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp_getwxauseuserinforecordlist";
        bVar.f127069d = 2690;
        z45 z45 = new z45();
        z45.f145694d = str;
        z45.f145695e = i;
        z45.f145696f = i2;
        bVar.f127066a = z45;
        bVar.f127067b = new a55();
        mVar.mo74599v(new C31277f(C89144l0.m111430f(bVar.mo72403a(), new C31279a(new C7514g(weakReference)), false, (C9487b) null)));
        return mVar.mo74608o();
    }
}
