package mx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C48976ca2;
import wx3.C15601d;

/* renamed from: mx0.j */
public final class C34677j<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C47117l f93236a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<C48976ca2> f93237b;

    public C34677j(C47117l lVar, C15601d<? super C48976ca2> dVar) {
        this.f93236a = lVar;
        this.f93237b = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        C48976ca2 ca22 = (C48976ca2) cVar.f256796d;
        this.f93236a.getClass();
        Log.m105924i("BizPCSettingCgiServe", "runGetCgi: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            this.f93237b.resumeWith(Result.m168114constructorimpl(ca22));
        } else {
            this.f93237b.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
