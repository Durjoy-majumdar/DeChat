package com.tencent.p014mm.plugin.finder.live.viewmodel;

import ak1.C54116w;
import bd1.C39758f;
import bd1.C39759i;
import bl3.C54492n;
import com.tencent.p014mm.plugin.finder.live.viewmodel.FinderLiveVisitorGameRankSwitchUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49747hs1;
import te3.C49890is1;
import te3.C51284sq2;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.live.viewmodel.c */
public final class C56122c<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC f160009a;

    /* renamed from: b */
    public final /* synthetic */ boolean f160010b;

    /* renamed from: c */
    public final /* synthetic */ FinderLiveVisitorGameRankSwitchUIC.C56117b f160011c;

    public C56122c(FinderLiveVisitorGameRankSwitchUIC finderLiveVisitorGameRankSwitchUIC, boolean z, FinderLiveVisitorGameRankSwitchUIC.C56117b bVar) {
        this.f160009a = finderLiveVisitorGameRankSwitchUIC;
        this.f160010b = z;
        this.f160011c = bVar;
    }

    public Object call(Object obj) {
        LinkedList<C49747hs1> linkedList;
        LinkedList<C49747hs1> linkedList2;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Class cls = C54116w.class;
        C61926c.m72668M(new C56121b(this.f160009a));
        String str = "";
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            FinderLiveVisitorGameRankSwitchUIC finderLiveVisitorGameRankSwitchUIC = this.f160009a;
            C49890is1 is12 = finderLiveVisitorGameRankSwitchUIC.f159990g;
            if (!(is12 == null || (linkedList = is12.f135633d) == null)) {
                FinderLiveVisitorGameRankSwitchUIC.C56117b bVar = this.f160011c;
                for (C49747hs1 hs12 : linkedList) {
                    if (C87412m.m108589b(hs12.f134839d, bVar.f159997d.f134839d)) {
                        hs12.f134841f = bVar.f159997d.f134841f;
                        C49890is1 is13 = finderLiveVisitorGameRankSwitchUIC.f159990g;
                        if (!(is13 == null || (linkedList2 = is13.f135633d) == null)) {
                            for (C49747hs1 hs13 : linkedList2) {
                                if (hs13 != null) {
                                    Log.m105924i("SimpleUIComponent_set", "GameRankSwitch appid:" + hs13.f134839d + ", name:" + hs13.f134840e + ", enable:" + hs13.f134841f);
                                }
                            }
                        }
                        C66785b bVar2 = C66785b.f191882e;
                        C39758f fVar = new C39758f();
                        C51284sq2 d = fVar.mo62398d();
                        C49890is1 is14 = new C49890is1();
                        C49890is1 is15 = finderLiveVisitorGameRankSwitchUIC.f159990g;
                        is14.parseFrom(is15 != null ? is15.toByteArray() : null);
                        d.f141686r = is14;
                        bVar2.mo90665S0(fVar, C39759i.JOIN_LIVE);
                    }
                }
            }
            if (this.f160009a.f159994n) {
                if (this.f160010b) {
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w wVar = (C54116w) c;
                    String str2 = this.f160011c.f159997d.f134839d;
                    C54116w.dy0(wVar, 5, str2 == null ? str : str2, 0, 4, (Object) null);
                } else {
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w wVar2 = (C54116w) c2;
                    String str3 = this.f160011c.f159997d.f134839d;
                    C54116w.dy0(wVar2, 7, str3 == null ? str : str3, 0, 4, (Object) null);
                }
            }
        } else {
            this.f160011c.f159997d.f134841f = this.f160010b ^ true ? 1 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("CgiFinderLiveModBasicInfo failed, reset ");
            String str4 = this.f160011c.f159997d.f134839d;
            if (str4 == null) {
                str4 = str;
            }
            sb.append(str4);
            sb.append(", ");
            sb.append(this.f160011c.f159997d.f134841f);
            Log.m105924i(C54492n.TAG, sb.toString());
            if (this.f160009a.f159994n && this.f160010b) {
                C54116w wVar3 = (C54116w) C86312j.m106911c(cls);
                String str5 = this.f160011c.f159997d.f134839d;
                if (str5 != null) {
                    str = str5;
                }
                wVar3.cy0(6, str, cVar.f256794b);
            }
        }
        return C13598b0.f38549a;
    }
}
