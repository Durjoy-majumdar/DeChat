package wg1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import kotlin.Result;
import nj3.C76912y0;
import o40.C61937h;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50542nh0;
import te3.C51778w31;
import wx3.C15601d;

/* renamed from: wg1.h2 */
public final class C15301h2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15370z1 f41604a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<Boolean> f41605b;

    public C15301h2(C15370z1 z1Var, C15601d<? super Boolean> dVar) {
        this.f41604a = z1Var;
        this.f41605b = dVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        boolean z = false;
        if ((cVar != null && cVar.f256793a == 0) && cVar.f256793a == 0) {
            Iterator<C50542nh0> it = ((C51778w31) cVar.f256796d).f143843d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C50542nh0 next = it.next();
                StringBuilder sb = new StringBuilder();
                sb.append("setCoverImage ret:");
                C87412m.m108593f(next, "finderCmdRet");
                sb.append(C61937h.m72709h(next));
                Log.m105924i("FinderLiveNoticeQRCodeUIC", sb.toString());
                if (next.f138602d == 11) {
                    if (next.f138603e != 0) {
                        String str = next.f138604f;
                        C15370z1 z1Var = this.f41604a;
                        if (str == null || str.length() == 0) {
                            z = true;
                        }
                        if (z) {
                            str = z1Var.getContext().getResources().getString(C0966R.string.f8098a3);
                        }
                        C76912y0.m92769h(this.f41604a.getContext(), str, C0966R.raw.icons_filled_close);
                        C15601d<Boolean> dVar = this.f41605b;
                        Result.Companion companion = Result.Companion;
                        dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    } else {
                        C15601d<Boolean> dVar2 = this.f41605b;
                        Result.Companion companion2 = Result.Companion;
                        dVar2.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                    }
                }
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("mod cover image errType ");
            String str2 = null;
            sb4.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
            sb4.append(",errCode:");
            sb4.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
            sb4.append(",errMsg:");
            if (cVar != null) {
                str2 = cVar.f256795c;
            }
            sb4.append(str2);
            Log.m105920e("FinderLiveNoticeQRCodeUIC", sb4.toString());
            C76912y0.m92769h(this.f41604a.getContext(), this.f41604a.getContext().getResources().getString(C0966R.string.f8098a3), C0966R.raw.icons_filled_close);
        }
        C15601d<Boolean> dVar3 = this.f41605b;
        Result.Companion companion3 = Result.Companion;
        dVar3.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        return C13598b0.f38549a;
    }
}
