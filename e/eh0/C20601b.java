package eh0;

import a14.C53916l;
import com.google.protobuf.C16994k;
import com.tencent.wechat.aff.common.CommonProto;
import hp3.C87581a;
import kotlin.Result;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: eh0.b */
public final class C20601b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C53916l<CommonProto.AffCgiResponse> f58000a;

    public C20601b(C53916l<? super CommonProto.AffCgiResponse> lVar) {
        this.f58000a = lVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        CommonProto.AffCgiResponse.Builder errorType = CommonProto.AffCgiResponse.newBuilder().setErrorCode(cVar.f256794b).setErrorType(cVar.f256793a);
        byte[] byteArray = cVar.f256796d.toByteArray();
        C16994k kVar = C16994k.f46000e;
        cVar.f256798f.dead();
        this.f58000a.resumeWith(Result.m168114constructorimpl((CommonProto.AffCgiResponse) errorType.setData(C16994k.m16790i(byteArray, 0, byteArray.length)).build()));
        return C13598b0.f38549a;
    }
}
