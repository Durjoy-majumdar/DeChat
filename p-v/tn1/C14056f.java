package tn1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32230s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import nr3.C89059e;
import rx3.C13598b0;
import sn1.C13738c;
import te3.C50085k60;

/* renamed from: tn1.f */
public final class C14056f {

    /* renamed from: a */
    public final MMActivity f39423a;

    /* renamed from: b */
    public final int f39424b;

    /* renamed from: c */
    public String f39425c;

    /* renamed from: d */
    public final int f39426d;

    /* renamed from: e */
    public final C32230s<Integer, Integer, C50085k60, Integer, Integer, C13598b0> f39427e;

    /* renamed from: f */
    public final String f39428f = "Finder.OrderFeedLoader";

    /* renamed from: g */
    public C13738c f39429g;

    /* renamed from: h */
    public final ArrayList<C14051a> f39430h = new ArrayList<>();

    /* renamed from: i */
    public String f39431i = "";

    public C14056f(MMActivity mMActivity, int i, String str, int i2, C32230s<? super Integer, ? super Integer, ? super C50085k60, ? super Integer, ? super Integer, C13598b0> sVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "lastBuffer");
        C87412m.m108594g(sVar, "callback");
        this.f39423a = mMActivity;
        this.f39424b = i;
        this.f39425c = str;
        this.f39426d = i2;
        this.f39427e = sVar;
    }

    /* renamed from: a */
    public static final void m13408a(C14056f fVar) {
        fVar.getClass();
        C13738c cVar = new C13738c(fVar.f39424b, fVar.f39425c, fVar.f39426d, false, fVar.f39431i, 8, (C8480h) null);
        fVar.f39429g = cVar;
        C89059e i = cVar.mo9225i();
        i.mo11397F(fVar.f39423a);
        i.mo123420E(new C14053c(fVar));
    }
}
