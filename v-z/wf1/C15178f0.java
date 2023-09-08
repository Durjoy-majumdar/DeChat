package wf1;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50427mo0;
import te3.C51909x11;

/* renamed from: wf1.f0 */
public final class C15178f0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15193l f41332a;

    public C15178f0(C15193l lVar) {
        this.f41332a = lVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        String str = this.f41332a.f41381d;
        Log.m105924i(str, "doGetGiftList errType:" + i + ", errCode:" + i2);
        if (i == 0 && i2 == 0) {
            C15193l lVar = this.f41332a;
            C51909x11 x112 = ((C50427mo0) cVar.f256796d).f138129h;
            lVar.f41379L = (x112 != null ? x112.f144398d : C15193l.f41362N) + 1;
            lVar.mo14135l3((Integer) null);
        }
        C15193l.m14281f3(this.f41332a, "initView");
        return C13598b0.f38549a;
    }
}
