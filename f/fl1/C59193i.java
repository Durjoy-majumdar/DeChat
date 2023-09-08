package fl1;

import android.os.Bundle;
import android.text.TextUtils;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import er1.C58704c5;
import er1.C58713e5;
import er1.C58739j4;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87413o;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C48779ay0;
import te3.C49291ej0;
import te3.C64889zo2;
import vk1.C65760a;

/* renamed from: fl1.i */
public final class C59193i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169306d;

    /* renamed from: e */
    public final /* synthetic */ boolean f169307e;

    /* renamed from: f */
    public final /* synthetic */ int f169308f;

    /* renamed from: g */
    public final /* synthetic */ boolean f169309g;

    /* renamed from: h */
    public final /* synthetic */ String f169310h;

    /* renamed from: i */
    public final /* synthetic */ C49291ej0 f169311i;

    /* renamed from: j */
    public final /* synthetic */ int f169312j;

    /* renamed from: n */
    public final /* synthetic */ String f169313n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59193i(C59161f fVar, boolean z, int i, boolean z2, String str, C49291ej0 ej02, int i2, String str2) {
        super(0);
        this.f169306d = fVar;
        this.f169307e = z;
        this.f169308f = i;
        this.f169309g = z2;
        this.f169310h = str;
        this.f169311i = ej02;
        this.f169312j = i2;
        this.f169313n = str2;
    }

    public Object invoke() {
        Class cls = C54991o.class;
        String str = this.f169306d.f169228i;
        Log.m105924i(str, "createLive success:" + this.f169307e + ", errCode:" + this.f169308f);
        if (this.f169307e) {
            C58961d.C58963b bVar = C58961d.f168673a;
            C58969q b = bVar.mo84155b(((C54991o) this.f169306d.f166851d.mo71262a(cls)).f154345o);
            if (b != null) {
                b.field_liveRoomImg = ((C54991o) this.f169306d.f166851d.mo71262a(cls)).mo75973N3();
                bVar.mo84163k(b);
            }
            C65760a aVar = this.f169306d.f166837f;
            if (aVar != null) {
                C58124b.C7172a.m7372a(aVar, C58124b.C58125b.LIVE_STATUS_JOIN_LIVE, (Bundle) null, 2, (Object) null);
            }
            this.f169306d.mo84376L(1);
        } else if (this.f169309g) {
            Bundle bundle = new Bundle();
            bundle.putString("PARAM_FINDER_LIVE_USERNAME", TextUtils.isEmpty(((C54991o) this.f169306d.mo83051g(cls)).f154345o) ? ((C54991o) this.f169306d.mo83051g(cls)).f154345o : ((C54991o) this.f169306d.mo83051g(cls)).f154345o);
            bundle.putString("PARAM_FINDER_LIVE_FACE_VERIFY_URL", this.f169310h);
            C48779ay0 ay02 = this.f169311i.f132952f;
            if (ay02 != null) {
                bundle.putByteArray("PARAM_FINDER_LIVE_ERROR_PAGE", ay02.toByteArray());
            }
            C65760a aVar2 = this.f169306d.f166837f;
            if (aVar2 != null) {
                aVar2.statusChange(C58124b.C58125b.FINDER_LIVE_FACE_VERIFY, bundle);
            }
            C58704c5.m68184a(C58704c5.f168044a, C58713e5.f168094v.f168101b, (C89349b) null, false, false, 14, (Object) null);
            this.f169306d.mo84376L(4);
        } else {
            C58704c5 c5Var = C58704c5.f168044a;
            String str2 = C58713e5.f168093u.f168101b;
            C58739j4 j4Var = C58739j4.f168176a;
            C64889zo2 zo22 = new C64889zo2();
            int i = this.f169308f;
            String str3 = this.f169313n;
            zo22.f186779e = i;
            zo22.f186780f = str3;
            C13598b0 b0Var = C13598b0.f38549a;
            C58704c5.m68184a(c5Var, str2, j4Var.mo83710g0(zo22), false, true, 4, (Object) null);
            C59161f.m69118y(this.f169306d, this.f169312j, this.f169308f, this.f169313n, this.f169311i, (C48779ay0) null, 16, (Object) null);
            this.f169306d.mo84376L(2);
        }
        return C13598b0.f38549a;
    }
}
