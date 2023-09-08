package hl1;

import al1.C54127h;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import b50.C54408d;
import cj1.C28593v5;
import cl1.C54943a1;
import cl1.C54951d;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fy3.C32224a;
import gh1.C59447j;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87413o;
import o40.C61926c;
import p50.C62197e;
import r50.C63367f;
import rx3.C13598b0;
import vk1.C65762c;
import zt3.C119157j;

/* renamed from: hl1.r3 */
public final class C60027r3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59988k f171326d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Boolean> f171327e;

    /* renamed from: f */
    public final /* synthetic */ int f171328f;

    /* renamed from: g */
    public final /* synthetic */ C8477a0 f171329g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60027r3(C59988k kVar, C8479f0<Boolean> f0Var, int i, C8477a0 a0Var) {
        super(0);
        this.f171326d = kVar;
        this.f171327e = f0Var;
        this.f171328f = i;
        this.f171329g = a0Var;
    }

    public Object invoke() {
        FrameLayout frameLayout;
        ImageView imageView;
        C54127h data;
        LiveRoomControllerStore liveRoomControllerStore;
        C62197e liveCore;
        Class cls = C54991o.class;
        ((C119157j) C119157j.f356862d).mo183876g(C28593v5.f78481d, "Finder.LiveExceptionMonitor");
        C65762c cVar = this.f171326d.f166848f;
        if (!(cVar == null || (liveCore = cVar.getLiveCore()) == null)) {
            AppCompatActivity appCompatActivity = this.f171326d.f166847e;
            Boolean bool = (Boolean) this.f171327e.f27484d;
            C54408d.C54409a.m61121a(liveCore, appCompatActivity, bool != null ? bool.booleanValue() : true, false, this.f171328f, 0, ((C54991o) this.f171326d.mo83051g(cls)).f154254S2, this.f171329g.f27482d, ((C54951d) this.f171326d.mo83051g(C54951d.class)).mo75868d3(), 16, (Object) null);
        }
        C65762c cVar2 = this.f171326d.f166848f;
        if (!(cVar2 == null || (data = cVar2.getData()) == null || (liveRoomControllerStore = data.f151979f) == null)) {
            C59447j.f169870a.mo84550b(liveRoomControllerStore);
        }
        C65762c cVar3 = this.f171326d.f166848f;
        Drawable drawable = (cVar3 == null || (imageView = (ImageView) cVar3.findViewById(C0966R.C0970id.fv6)) == null) ? null : imageView.getDrawable();
        C63367f c = this.f171326d.mo84888c();
        if (!(c == null || (frameLayout = c.f179748h) == null)) {
            frameLayout.setBackgroundDrawable(drawable);
        }
        if (C61926c.m72696u(((C54991o) this.f171326d.mo83051g(cls)).f154291a1, 524288)) {
            FinderLiveService.f159376d.mo77611N();
        }
        FinderLiveService.f159376d.mo77606G();
        ((C54943a1) this.f171326d.mo83051g(C54943a1.class)).mo75855c3();
        return C13598b0.f38549a;
    }
}
