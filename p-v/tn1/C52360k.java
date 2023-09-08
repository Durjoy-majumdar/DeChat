package tn1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32230s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import nr3.C89059e;
import rx3.C13598b0;
import sn1.C48432d;
import te3.C50638o60;

/* renamed from: tn1.k */
public final class C52360k {

    /* renamed from: a */
    public final MMActivity f146337a;

    /* renamed from: b */
    public int f146338b;

    /* renamed from: c */
    public final int f146339c;

    /* renamed from: d */
    public final C32230s<Integer, Integer, C50638o60, Integer, Integer, C13598b0> f146340d;

    /* renamed from: e */
    public final String f146341e;

    /* renamed from: f */
    public final String f146342f = "Finder.OrderSearchFeedLoader";

    /* renamed from: g */
    public C48432d f146343g;

    /* renamed from: h */
    public final ArrayList<C14051a> f146344h = new ArrayList<>();

    /* renamed from: i */
    public String f146345i = "";

    public C52360k(MMActivity mMActivity, int i, int i2, C32230s<? super Integer, ? super Integer, ? super C50638o60, ? super Integer, ? super Integer, C13598b0> sVar, String str) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(sVar, "callback");
        C87412m.m108594g(str, "appId");
        this.f146337a = mMActivity;
        this.f146338b = i;
        this.f146339c = i2;
        this.f146340d = sVar;
        this.f146341e = str;
    }

    /* renamed from: a */
    public static final void m58604a(C52360k kVar) {
        kVar.getClass();
        C48432d dVar = new C48432d(kVar.f146345i, kVar.f146338b, kVar.f146339c, false, kVar.f146341e, 8, (C8480h) null);
        kVar.f146343g = dVar;
        C89059e i = dVar.mo9225i();
        i.mo11397F(kVar.f146337a);
        i.mo123420E(new C52357h(kVar));
    }
}
