package ds0;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32230s;
import gy3.C87413o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.ResultKt;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.a55;

/* renamed from: ds0.g */
public final class C7514g extends C87413o implements C32230s<Integer, Integer, String, C47350c, C117747y, Integer> {

    /* renamed from: d */
    public final /* synthetic */ WeakReference<C53916l<a55>> f25776d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7514g(WeakReference<C53916l<a55>> weakReference) {
        super(5);
        this.f25776d = weakReference;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        C47350c cVar = (C47350c) obj4;
        C117747y yVar = (C117747y) obj5;
        Log.m105924i("MicroMsg.CgiWxaAppGetPrivacyUseRecord", "callback, errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + str);
        if (intValue == 0 && intValue2 == 0) {
            a55 a55 = null;
            C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
            if (aVar instanceof a55) {
                a55 = (a55) aVar;
            }
            if (a55 == null) {
                C53916l lVar = this.f25776d.get();
                if (lVar != null) {
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("Client Framework Error(resp is null)"))));
                }
            } else {
                C53916l lVar2 = this.f25776d.get();
                if (lVar2 != null) {
                    lVar2.resumeWith(Result.m168114constructorimpl(a55));
                }
            }
        } else {
            C53916l lVar3 = this.f25776d.get();
            if (lVar3 != null) {
                Result.Companion companion2 = Result.Companion;
                lVar3.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new IOException("Server Framework Error(errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + str + ')'))));
            }
        }
        return 0;
    }
}
