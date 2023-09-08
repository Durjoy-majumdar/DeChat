package mx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49090d34;
import wx3.C15601d;

/* renamed from: mx0.k */
public final class C34678k<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C47117l f93238a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<C49090d34> f93239b;

    public C34678k(C47117l lVar, C15601d<? super C49090d34> dVar) {
        this.f93238a = lVar;
        this.f93239b = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        C49090d34 d342 = (C49090d34) cVar.f256796d;
        this.f93238a.getClass();
        Log.m105924i("BizPCSettingCgiServe", "runSetCgi: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            this.f93239b.resumeWith(Result.m168114constructorimpl(d342));
        } else {
            this.f93239b.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
