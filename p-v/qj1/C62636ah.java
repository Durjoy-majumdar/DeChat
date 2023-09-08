package qj1;

import ak1.C54116w;
import android.content.Intent;
import bd1.C39758f;
import bd1.C39759i;
import cj1.C54795n5;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49747hs1;
import te3.C49890is1;
import te3.C51284sq2;
import zc1.C66785b;

/* renamed from: qj1.ah */
public final class C62636ah<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C63176zg f177887a;

    /* renamed from: b */
    public final /* synthetic */ boolean f177888b;

    /* renamed from: c */
    public final /* synthetic */ C49747hs1 f177889c;

    public C62636ah(C63176zg zgVar, boolean z, C49747hs1 hs12) {
        this.f177887a = zgVar;
        this.f177888b = z;
        this.f177889c = hs12;
    }

    public Object call(Object obj) {
        LinkedList<C49747hs1> linkedList;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Class cls = C54116w.class;
        this.f177887a.mo88100a1();
        String str = "";
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C63176zg zgVar = this.f177887a;
            C49890is1 is12 = zgVar.f179262w;
            if (!(is12 == null || (linkedList = is12.f135633d) == null)) {
                C49747hs1 hs12 = this.f177889c;
                boolean z = this.f177888b;
                for (C49747hs1 hs13 : linkedList) {
                    if (C87412m.m108589b(hs13.f134839d, hs12.f134839d)) {
                        hs13.f134841f = z ? 1 : 0;
                        String str2 = zgVar.f179256q + "_set";
                        C87412m.m108594g(str2, "TAG");
                        Log.m105924i(str2, "GameRankSwitch appid:" + hs13.f134839d + ", name:" + hs13.f134840e + ", enable:" + hs13.f134841f);
                        C66785b bVar = C66785b.f191882e;
                        C39758f fVar = new C39758f();
                        C51284sq2 d = fVar.mo62398d();
                        C49890is1 is13 = new C49890is1();
                        C49890is1 is14 = zgVar.f179262w;
                        is13.parseFrom(is14 != null ? is14.toByteArray() : null);
                        d.f141686r = is13;
                        bVar.mo90665S0(fVar, C39759i.JOIN_LIVE);
                    }
                }
            }
            if (this.f177888b) {
                C76912y0.m92768g(this.f177887a.f166287d.getContext(), this.f177887a.f166287d.getContext().getString(C0966R.string.m79));
            }
            C54795n5 D0 = this.f177887a.mo14476D0();
            if (D0 != null) {
                D0.mo75703G((Intent) null);
            }
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w wVar = (C54116w) c;
            String str3 = this.f177889c.f134839d;
            C54116w.dy0(wVar, 5, str3 == null ? str : str3, 0, 4, (Object) null);
        } else {
            String str4 = this.f177887a.f179256q;
            StringBuilder sb = new StringBuilder();
            sb.append("CgiFinderLiveModBasicInfo failed, reset ");
            String str5 = this.f177889c.f134839d;
            if (str5 == null) {
                str5 = str;
            }
            sb.append(str5);
            sb.append(", ");
            sb.append(this.f177889c.f134841f);
            Log.m105924i(str4, sb.toString());
            C54116w wVar2 = (C54116w) C86312j.m106911c(cls);
            String str6 = this.f177889c.f134839d;
            if (str6 != null) {
                str = str6;
            }
            wVar2.cy0(6, str, cVar.f256794b);
        }
        return C13598b0.f38549a;
    }
}
