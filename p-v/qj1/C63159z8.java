package qj1;

import android.os.Bundle;
import cj1.C0548h5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87413o;
import hl1.C59988k;
import nj3.C76912y0;
import rx3.C13598b0;
import te3.C64273c21;
import vk1.C65762c;

/* renamed from: qj1.z8 */
public final class C63159z8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f179208d;

    /* renamed from: e */
    public final /* synthetic */ int f179209e;

    /* renamed from: f */
    public final /* synthetic */ C62949r8 f179210f;

    /* renamed from: g */
    public final /* synthetic */ String f179211g;

    /* renamed from: h */
    public final /* synthetic */ String f179212h;

    /* renamed from: i */
    public final /* synthetic */ C32224a<C13598b0> f179213i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63159z8(int i, int i2, C62949r8 r8Var, String str, String str2, C32224a<C13598b0> aVar) {
        super(0);
        this.f179208d = i;
        this.f179209e = i2;
        this.f179210f = r8Var;
        this.f179211g = str;
        this.f179212h = str2;
        this.f179213i = aVar;
    }

    public Object invoke() {
        C32224a<C13598b0> aVar;
        C59988k startUIC;
        Class cls = C54991o.class;
        int i = this.f179208d;
        if (i == 0 && this.f179209e == 0) {
            C64273c21 c212 = ((C55001u) this.f179210f.mo87696x0(C55001u.class)).f154420q;
            if (c212 != null) {
                C0548h5.m491b(C0548h5.f1327a, this.f179210f.f178641p, c212.f182392d, C0548h5.C0550b.POI, false, 8, (Object) null);
            }
        } else {
            int i2 = this.f179209e;
            boolean z = false;
            if (i2 == -200016) {
                this.f179210f.f178630J = this.f179211g;
                Bundle bundle = new Bundle();
                bundle.putString("PARAM_FINDER_LIVE_URL", this.f179212h);
                bundle.putString("PARAM_FINDER_LIVE_COMMENT", this.f179211g);
                this.f179210f.f178641p.statusChange(C58124b.C58125b.FINDER_LIVE_COMMENT_REAL_NAME, bundle);
                String str = this.f179212h;
                if (str == null || str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    if (this.f179210f.mo82893g0()) {
                        this.f179210f.mo14484z0().forceScreenToPortrait();
                        this.f179210f.mo14484z0().post(new C63127y8(this.f179210f, this.f179212h));
                    } else {
                        C56032b z0 = this.f179210f.mo14484z0();
                        C65762c cVar = z0 instanceof C65762c ? (C65762c) z0 : null;
                        if (!(cVar == null || (startUIC = cVar.getStartUIC()) == null)) {
                            startUIC.mo84882Q(this.f179212h);
                        }
                    }
                }
            } else if (i2 == -200014) {
                ((C54991o) this.f179210f.mo87696x0(cls)).f154362s = false;
                Bundle bundle2 = new Bundle();
                bundle2.putString("PARAM_FINDER_LIVE_COMMENT", this.f179211g);
                this.f179210f.f178641p.statusChange(C58124b.C58125b.FINDER_LIVE_COMMENT_BACKOFF, bundle2);
                C76912y0.makeText(this.f179210f.f166287d.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.e6l), 0).show();
            } else if (i2 == -200031) {
                ((C54991o) this.f179210f.mo87696x0(cls)).f154370u = false;
            } else if (i2 == -200015 || i2 == -200018) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("PARAM_FINDER_LIVE_COMMENT", this.f179211g);
                this.f179210f.f178641p.statusChange(C58124b.C58125b.FINDER_LIVE_COMMENT_BACKOFF, bundle3);
            } else if (!(i == 0 || (aVar = this.f179213i) == null)) {
                aVar.invoke();
            }
        }
        return C13598b0.f38549a;
    }
}
