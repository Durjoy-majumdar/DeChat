package vv1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import jp3.C9487b;
import nr3.C89059e;
import ob0.C47350c;
import ob0.C89132b;
import p523fp.C32147e;
import te3.C48690ab3;
import te3.C64875za3;
import u73.C101987v0;
import uv1.C65479a;
import uv1.C65480b;
import uv1.C65482d;
import yb2.C15946a;

/* renamed from: vv1.f */
public final class C65896f extends C15946a {

    /* renamed from: d */
    public final String f189455d = "MicroMsg.FTS.FTSPardusUIC";

    /* renamed from: e */
    public long f189456e;

    /* renamed from: f */
    public final long f189457f = 60;

    /* renamed from: g */
    public C89132b<C48690ab3> f189458g;

    /* renamed from: vv1.f$a */
    public static final class C65897a<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C65896f f189459d;

        public C65897a(C65896f fVar) {
            this.f189459d = fVar;
        }

        public void onChanged(Object obj) {
            C65479a aVar = (C65479a) obj;
            Class cls = C32147e.class;
            C87412m.m108594g(aVar, "state");
            if (((C65480b) aVar.checkAction(C65480b.class)) != null) {
                C65896f.m77640g3(this.f189459d);
                ((C32147e) C86312j.m106911c(cls)).Yi0(66);
                ((C32147e) C86312j.m106911c(cls)).Yi0(79);
                ((C32147e) C86312j.m106911c(cls)).Yi0(33);
                ((C32147e) C86312j.m106911c(cls)).Yi0(95);
                ((C32147e) C86312j.m106911c(cls)).Yi0(27);
            }
            C65482d dVar = (C65482d) aVar.checkAction(C65482d.class);
            if (dVar != null) {
                C65896f fVar = this.f189459d;
                if (dVar.f188435a) {
                    C65896f.m77640g3(fVar);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65896f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final void m77640g3(C65896f fVar) {
        fVar.getClass();
        if (System.currentTimeMillis() - fVar.f189456e > fVar.f189457f * ((long) 1000) && !C101987v0.m134276j()) {
            C89132b<C48690ab3> bVar = fVar.f189458g;
            if (bVar != null) {
                bVar.mo85581g();
            }
            C64875za3 za32 = new C64875za3();
            za32.f186649d = C101987v0.m134273g();
            za32.f186650e = C101987v0.m134272f();
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127069d = 1417;
            bVar2.f127068c = "/cgi-bin/mmsearch-bin/parduspresearch";
            bVar2.f127066a = za32;
            bVar2.f127067b = new C48690ab3();
            C47350c a = bVar2.mo72403a();
            C89132b<C48690ab3> bVar3 = new C89132b<>();
            bVar3.mo123453j(a);
            fVar.f189458g = bVar3;
            C89059e<C89132b.C89134c<C48690ab3>> i = bVar3.mo9225i();
            if (i != null) {
                AppCompatActivity activity = fVar.getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.vending.lifecycle.ILifeCycleKeeper<*>");
                i.mo11397F((C9487b) activity);
                i.mo123064p(new C37847g(fVar));
            }
            fVar.f189456e = C31543z5.m39453c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C65897a(this));
        }
    }
}
