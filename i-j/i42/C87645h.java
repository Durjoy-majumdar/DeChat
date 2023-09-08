package i42;

import com.tencent.p014mm.plugin.magicbrush.C85270j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: i42.h */
public final class C87645h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87609c<C7594e> f253846d;

    /* renamed from: e */
    public final /* synthetic */ String f253847e;

    /* renamed from: f */
    public final /* synthetic */ int f253848f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87645h(C87609c<C7594e> cVar, String str, int i) {
        super(0);
        this.f253846d = cVar;
        this.f253847e = str;
        this.f253848f = i;
    }

    public Object invoke() {
        C87609c<C7594e> cVar = this.f253846d;
        C85270j0 j0Var = cVar.f253747u;
        if (j0Var != null) {
            String str = cVar.f253746t;
            Log.m105918d(str, "onJsApiCallback with result: " + this.f253847e);
            j0Var.t20(this.f253846d.f253728b, this.f253848f, this.f253847e);
        } else {
            Log.m105920e(cVar.f253746t, "bug: onJsApiCallback without service !!!");
        }
        return C13598b0.f38549a;
    }
}
