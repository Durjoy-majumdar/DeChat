package dt2;

import a14.C53916l;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import dt2.C45450b;
import hp3.C87581a;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49335eu3;

/* renamed from: dt2.d */
public final class C45453d<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C45450b<C49335eu3> f123024a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<C49335eu3> f123025b;

    public C45453d(C45450b<C49335eu3> bVar, C53916l<C49335eu3> lVar) {
        this.f123024a = bVar;
        this.f123025b = lVar;
    }

    public Object call(Object obj) {
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        C45450b<C49335eu3> bVar = this.f123024a;
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
        String str = bVar.f123021i;
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi");
        Log.m105924i(str, "scene:" + this.f123024a.f256789f.f127057c + " errType:" + cVar.f256793a + " errCode:" + cVar.f256794b);
        if (cVar.f256793a == 0 && cVar.f256794b == 0 && cVar.f256796d != null) {
            cVar.f256798f.dead();
            C53916l<C49335eu3> lVar = this.f123025b;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(cVar.f256796d));
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        } else {
            C53916l<C49335eu3> lVar2 = this.f123025b;
            Result.Companion companion2 = Result.Companion;
            lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C45450b.C45451a(cVar.f256793a, cVar.f256794b, cVar.f256795c))));
            cVar.f256798f.dead();
            SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.storage.cover.cgi.SnsCgi$await$2$cgi$1");
        return b0Var;
    }
}
