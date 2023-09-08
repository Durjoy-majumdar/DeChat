package wg1;

import bi1.C0283d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import kotlin.Result;
import o40.C61937h;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C51778w31;
import wx3.C15601d;

/* renamed from: wg1.i2 */
public final class C15308i2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15601d<Boolean> f41617a;

    public C15308i2(C15601d<? super Boolean> dVar) {
        this.f41617a = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (C0283d.m246d(cVar)) {
            Iterator<C50542nh0> it = ((C51778w31) cVar.f256796d).f143843d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    C15601d<Boolean> dVar = this.f41617a;
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    break;
                }
                C50542nh0 next = it.next();
                StringBuilder sb = new StringBuilder();
                sb.append("#cgiModNoticeInfo ret:");
                C87412m.m108593f(next, "finderCmdRet");
                sb.append(C61937h.m72709h(next));
                Log.m105924i("FinderLiveNoticeQRCodeUIC", sb.toString());
                if (next.f138602d == 10) {
                    if (next.f138603e == 0) {
                        C15601d<Boolean> dVar2 = this.f41617a;
                        Result.Companion companion2 = Result.Companion;
                        dVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                    } else {
                        C15601d<Boolean> dVar3 = this.f41617a;
                        Result.Companion companion3 = Result.Companion;
                        dVar3.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    }
                }
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("#cgiModNoticeInfo errType ");
            String str = null;
            sb4.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
            sb4.append(",errCode:");
            sb4.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
            sb4.append(",errMsg:");
            if (cVar != null) {
                str = cVar.f256795c;
            }
            sb4.append(str);
            Log.m105920e("FinderLiveNoticeQRCodeUIC", sb4.toString());
            C15601d<Boolean> dVar4 = this.f41617a;
            Result.Companion companion4 = Result.Companion;
            dVar4.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        return C13598b0.f38549a;
    }
}
