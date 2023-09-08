package vi1;

import a14.C53872d1;
import a14.C53934p0;
import al1.C39611s;
import android.os.Bundle;
import android.view.ViewGroup;
import cj1.C54795n5;
import cl1.C39981t0;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.micintercom.widget.LiveMicIntercomWidget;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import nk1.C11207i;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C49712hj1;
import ui1.C52578a;
import ui1.C52581e;
import wi1.C53175a;
import wi1.C53176b;
import wi1.C53177i;
import wx3.C15601d;

/* renamed from: vi1.n */
public final class C52931n extends C62660c {

    /* renamed from: p */
    public final C58124b f147782p;

    /* renamed from: q */
    public final C52578a f147783q = new C52581e(this);

    /* renamed from: r */
    public final LiveMicIntercomWidget f147784r;

    /* renamed from: vi1.n$a */
    public static final class C52932a extends C87413o implements C32226l<C53177i, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C52931n f147785d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f147786e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52932a(C52931n nVar, ViewGroup viewGroup) {
            super(1);
            this.f147785d = nVar;
            this.f147786e = viewGroup;
        }

        public Object invoke(Object obj) {
            C54795n5 D0;
            C53177i iVar = (C53177i) obj;
            C87412m.m108594g(iVar, LocaleUtil.ITALIAN);
            if (iVar instanceof C53176b) {
                C52931n nVar = this.f147785d;
                C39611s sVar = iVar.f148359a;
                nVar.getClass();
                C11207i.m11072h(nVar, C53872d1.f151119c, (C53934p0) null, new C52924i(nVar, true, sVar, (C15601d<? super C52924i>) null), 2, (Object) null);
            } else if ((iVar instanceof C53175a) && (D0 = this.f147785d.mo14476D0()) != null) {
                String str = iVar.f148359a.f106359c;
                if (str == null) {
                    str = "";
                }
                D0.mo75742j0(str, new C52930m(this.f147785d, this.f147786e, iVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52931n(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f147782p = bVar;
        this.f147784r = new LiveMicIntercomWidget(viewGroup, this, mo87684A0(), new C52932a(this, viewGroup));
        mo10792g(8);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            Class cls = C39981t0.class;
            ((C39981t0) mo87696x0(cls)).f107202q.observe(this, new C52927j(this));
            ((C39981t0) mo87696x0(cls)).f107197i.observe(this, new C52928k(this));
            ((C39981t0) mo87696x0(cls)).f107200o.observe(this, new C52929l(this));
        } else if (ordinal == 27 || ordinal == 28) {
            mo10792g(8);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f147784r.f111613g.clear();
    }
}
