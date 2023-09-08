package cs0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import rx3.C13598b0;
import te3.bp4;
import te3.i55;
import wx3.C15601d;

/* renamed from: cs0.h */
public final class C45167h implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C15601d<C13598b0> f122470d;

    public C45167h(C15601d<? super C13598b0> dVar) {
        this.f122470d = dVar;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105924i("MicroMsg.AppBrand.CgiRevokeUserInfoAuthorize", "callback, errType: " + i + ", errCode: " + i2 + ", errMsg: " + str);
        if (i == 0 && i2 == 0) {
            C47465a aVar = cVar.f127056b.f127083a;
            i55 i55 = aVar instanceof i55 ? (i55) aVar : null;
            if (i55 == null) {
                C15601d<C13598b0> dVar = this.f122470d;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("Client Framework Error(resp is null)"))));
                return 0;
            }
            bp4 bp4 = i55.f135122d;
            int i3 = bp4.f131249d;
            String str2 = bp4.f131250e;
            Log.m105924i("MicroMsg.AppBrand.CgiRevokeUserInfoAuthorize", "callback, logicErrCode: " + i3 + ", logicErrMsg: " + str2);
            if (i3 != 0) {
                C15601d<C13598b0> dVar2 = this.f122470d;
                Result.Companion companion2 = Result.Companion;
                dVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("Server Logic Error(logicErrCode: " + i3 + ", logicErrMsg: " + str2 + ')'))));
                return 0;
            }
            C15601d<C13598b0> dVar3 = this.f122470d;
            Result.Companion companion3 = Result.Companion;
            dVar3.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
            return 0;
        }
        C15601d<C13598b0> dVar4 = this.f122470d;
        Result.Companion companion4 = Result.Companion;
        dVar4.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("Server Framework Error(errType: " + i + ", errCode: " + i2 + ", errMsg: " + str + ')'))));
        return 0;
    }
}
