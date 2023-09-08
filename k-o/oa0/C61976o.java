package oa0;

import ca0.C54683f0;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55302j;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import p175j0.C60690y0;
import rx3.C13598b0;

/* renamed from: oa0.o */
public final class C61976o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54683f0 f176173d;

    /* renamed from: e */
    public final /* synthetic */ C55302j f176174e;

    /* renamed from: f */
    public final /* synthetic */ C60690y0<C61949a> f176175f;

    /* renamed from: g */
    public final /* synthetic */ C60690y0<Boolean> f176176g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61976o(C54683f0 f0Var, C55302j jVar, C60690y0<C61949a> y0Var, C60690y0<Boolean> y0Var2) {
        super(0);
        this.f176173d = f0Var;
        this.f176174e = jVar;
        this.f176175f = y0Var;
        this.f176176g = y0Var2;
    }

    public Object invoke() {
        Log.m105924i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: on search btn clicked");
        this.f176175f.setValue(C61949a.MusicSearch);
        this.f176176g.setValue(Boolean.valueOf(this.f176173d.f153252d.getValue().booleanValue()));
        this.f176174e.mo76611b();
        return C13598b0.f38549a;
    }
}
