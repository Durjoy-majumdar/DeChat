package qj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import qs1.C63325a;
import rx3.C13598b0;
import te3.C64780vo2;

/* renamed from: qj1.lf */
public final class C12508lf extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64780vo2 f35963d;

    /* renamed from: e */
    public final /* synthetic */ boolean f35964e;

    /* renamed from: f */
    public final /* synthetic */ C12399ff f35965f;

    /* renamed from: g */
    public final /* synthetic */ C63325a f35966g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12508lf(C64780vo2 vo22, boolean z, C12399ff ffVar, C63325a aVar) {
        super(0);
        this.f35963d = vo22;
        this.f35964e = z;
        this.f35965f = ffVar;
        this.f35966g = aVar;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("updateAvatarDecoration loadDecorationRes:");
        C64780vo2 vo22 = this.f35963d;
        sb.append(vo22 != null ? vo22.f185964e : null);
        sb.append(" result:");
        sb.append(this.f35964e);
        Log.m105924i("FinderLiveTitlePlugin", sb.toString());
        if (this.f35964e) {
            this.f35965f.f35747v.setPath(this.f35966g.mo88226c3(this.f35963d));
            this.f35965f.f35747v.setRepeatCount(-1);
            this.f35965f.f35747v.play();
            this.f35966g.f179685f = this.f35963d;
        }
        return C13598b0.f38549a;
    }
}
