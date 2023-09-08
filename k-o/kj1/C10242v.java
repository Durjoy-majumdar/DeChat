package kj1;

import ak1.C54067f0;
import ak1.C54108o;
import al1.C54130j;
import android.content.Context;
import android.os.Bundle;
import c50.C54655b;
import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C45389s0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import java.util.List;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import nj3.C76912y0;
import o40.C61926c;
import rx3.C13598b0;
import te3.C51239sg1;
import te3.C64510l21;

/* renamed from: kj1.v */
public final class C10242v extends C10538e {

    /* renamed from: h */
    public final int f31261h;

    /* renamed from: i */
    public final String f31262i = "anchorlive.more.pauselive";

    /* renamed from: kj1.v$a */
    public static final class C10243a implements C45389s0.C45390a {

        /* renamed from: a */
        public final /* synthetic */ C10125e1 f31263a;

        /* renamed from: kj1.v$a$a */
        public static final class C10244a extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C10125e1 f31264d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10244a(C10125e1 e1Var) {
                super(2);
                this.f31264d = e1Var;
            }

            public Object invoke(Object obj, Object obj2) {
                C10125e1.C10126a aVar;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Number) obj2).intValue();
                if (booleanValue) {
                    C10125e1.C10127b bVar = this.f31264d.f30988g;
                    if (!(bVar == null || (aVar = bVar.f31008a) == null)) {
                        aVar.mo10545e();
                    }
                    this.f31264d.mo10539g(C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null);
                    ((C54108o) C86312j.m106911c(C54108o.class)).Jx0(1, 0);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: kj1.v$a$b */
        public static final class C10245b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C10125e1 f31265d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10245b(C10125e1 e1Var) {
                super(0);
                this.f31265d = e1Var;
            }

            public Object invoke() {
                C76912y0.makeText((Context) this.f31265d.f30985d, (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.e1n), 0).show();
                return C13598b0.f38549a;
            }
        }

        public C10243a(C10125e1 e1Var) {
            this.f31263a = e1Var;
        }

        /* renamed from: a */
        public void mo10574a(int i, int i2, String str, C51239sg1 sg12) {
            C87412m.m108594g(sg12, "resp");
            if (i == 0 && i2 == 0) {
                C64510l21 l212 = new C64510l21();
                l212.f184023d = 2;
                l212.f184025f = 0;
                ((C54991o) this.f31263a.mo10534b(C54991o.class)).mo75978P4(l212, false, new C10244a(this.f31263a));
                return;
            }
            C61926c.m72668M(new C10245b(this.f31263a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10242v(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31261h = e1Var.f31000s;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31262i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        if (!((C54991o) this.f31809a.mo10534b(C54991o.class)).f154305d3) {
            if (C54655b.f153178f1 != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int i = this.f31261h;
        String string = e1Var.f30985d.getResources().getString(C0966R.string.e1x);
        C87412m.m108593f(string, "context.resources.getStr…g.finder_live_pause_tips)");
        mo10807m(e0Var, i, string, C0966R.raw.finder_icons_filled_pause);
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.PAUSE_OPEN, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31261h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        C10125e1.C10126a aVar;
        C56032b h;
        Class cls = C54963d0.class;
        Class cls2 = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C7335d c = C86312j.m106911c(cls2);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.PAUSE_OPEN, ((C54108o) C86312j.m106911c(cls2)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        if (finderLiveService.mo77626b() == null) {
            Log.m105920e(e1Var.f30980a, "pauseLive wasn't anchor!");
            return;
        }
        List<C54130j> list = ((C54963d0) e1Var.mo10534b(cls)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        if ((!list.isEmpty()) || ((C54963d0) e1Var.mo10534b(cls)).f154073p != null) {
            Log.m105924i(e1Var.f30980a, "pauseLive mick linking!");
            MMActivity mMActivity = e1Var.f30985d;
            C10125e1.C10127b bVar = e1Var.f30988g;
            if (bVar != null && (aVar = bVar.f31008a) != null && (h = aVar.mo10549h()) != null) {
                C56032b.showAlertDialog$default(h, mMActivity, "", MMApplicationContext.getContext().getResources().getString(C0966R.string.e1t), "", false, 16, (Object) null);
                return;
            }
            return;
        }
        finderLiveService.getClass();
        C54795n5 n5Var = FinderLiveService.f159396y;
        if (n5Var != null) {
            n5Var.mo75727c(1, 0, new C10243a(e1Var));
        }
    }
}
