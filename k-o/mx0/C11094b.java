package mx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50909q30;
import wx3.C15601d;

/* renamed from: mx0.b */
public final class C11094b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C47110d f32870a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<C50909q30> f32871b;

    public C11094b(C47110d dVar, C15601d<? super C50909q30> dVar2) {
        this.f32870a = dVar;
        this.f32871b = dVar2;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        C50909q30 q302 = (C50909q30) cVar.f256796d;
        this.f32870a.getClass();
        Log.m105924i("BizPCRecentReadCgiServe", "runDeleteCgi: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            this.f32871b.resumeWith(Result.m168114constructorimpl(q302));
        } else {
            this.f32871b.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
