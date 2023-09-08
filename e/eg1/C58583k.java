package eg1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32224a;
import gy3.C87413o;
import ls3.C10649f;
import rx3.C13598b0;
import sx3.C26236u;
import te3.C64279c90;

/* renamed from: eg1.k */
public final class C58583k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C58572h f167718d;

    /* renamed from: e */
    public final /* synthetic */ Context f167719e;

    /* renamed from: f */
    public final /* synthetic */ Intent f167720f;

    /* renamed from: g */
    public final /* synthetic */ FinderObject f167721g;

    /* renamed from: h */
    public final /* synthetic */ C64279c90 f167722h;

    /* renamed from: i */
    public final /* synthetic */ C10649f.C10650a f167723i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58583k(C58572h hVar, Context context, Intent intent, FinderObject finderObject, C64279c90 c902, C10649f.C10650a aVar) {
        super(0);
        this.f167718d = hVar;
        this.f167719e = context;
        this.f167720f = intent;
        this.f167721g = finderObject;
        this.f167722h = c902;
        this.f167723i = aVar;
    }

    public Object invoke() {
        this.f167718d.mo10913cP(this.f167719e, this.f167720f, C26236u.m33719b(this.f167721g), 0, this.f167722h, this.f167723i);
        return C13598b0.f38549a;
    }
}
