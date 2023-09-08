package cl1;

import bi1.C0283d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import kotlin.Result;
import o40.C61937h;
import ob0.C89132b;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49530g82;
import te3.C51897wz0;
import wx3.C15601d;

/* renamed from: cl1.w0 */
public final class C39987w0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C15601d<C47465a> f107212a;

    /* renamed from: b */
    public final /* synthetic */ Class<C47465a> f107213b;

    /* renamed from: c */
    public final /* synthetic */ String f107214c;

    public C39987w0(C15601d<C47465a> dVar, Class<C47465a> cls, String str) {
        this.f107212a = dVar;
        this.f107213b = cls;
        this.f107214c = str;
    }

    public Object call(Object obj) {
        C13598b0 b0Var;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (C0283d.m246d(cVar)) {
            LinkedList<C49530g82> linkedList = ((C51897wz0) cVar.f256796d).f144363d;
            C87412m.m108593f(linkedList, "it.resp.get_resp_list");
            C49530g82 g822 = (C49530g82) C110818d0.m150916N(linkedList);
            if (g822 != null) {
                Class<C47465a> cls = this.f107213b;
                String str = this.f107214c;
                C15601d<C47465a> dVar = this.f107212a;
                C47465a newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                C89349b bVar = g822.f133926f;
                byte[] f = bVar != null ? bVar.mo123703f() : null;
                if (f != null) {
                    try {
                        newInstance.parseFrom(f);
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("queryLotteryClaimInfo result(");
                sb.append(cls.getCanonicalName());
                sb.append(") = ");
                C87412m.m108593f(newInstance, "result");
                sb.append(C61937h.m72703b(newInstance));
                Log.m105924i(str, sb.toString());
                dVar.resumeWith(Result.m168114constructorimpl(newInstance));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f107212a.resumeWith(Result.m168114constructorimpl((Object) null));
            }
        } else {
            this.f107212a.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        return C13598b0.f38549a;
    }
}
