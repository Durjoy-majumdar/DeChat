package mx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50318lw1;
import wx3.C15601d;

/* renamed from: mx0.c */
public final class C11095c<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C47110d f32872a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<C50318lw1> f32873b;

    public C11095c(C47110d dVar, C15601d<? super C50318lw1> dVar2) {
        this.f32872a = dVar;
        this.f32873b = dVar2;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        C50318lw1 lw12 = (C50318lw1) cVar.f256796d;
        this.f32872a.getClass();
        Log.m105924i("BizPCRecentReadCgiServe", "runGetDataCgi: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            this.f32873b.resumeWith(Result.m168114constructorimpl(lw12));
        } else {
            this.f32873b.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
