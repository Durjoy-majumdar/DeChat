package ke1;

import android.content.Context;
import cm1.C0716c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.plugin.finder.life.SupportLifecycle;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import je1.C9306f0;
import je1.C9360p1;
import jp3.C46566c;
import jp3.C9486a;
import o40.C61926c;
import p910lj.C76701a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: ke1.n */
public final class C9595n extends SupportLifecycle {

    /* renamed from: g */
    public final int f29843g;

    /* renamed from: h */
    public final C49712hj1 f29844h;

    /* renamed from: i */
    public final C9597b f29845i;

    /* renamed from: j */
    public C46566c<C9486a> f29846j = new C46566c<>();

    /* renamed from: n */
    public volatile boolean f29847n;

    /* renamed from: o */
    public boolean f29848o = true;

    /* renamed from: p */
    public boolean f29849p = true;

    /* renamed from: ke1.n$a */
    public interface C9596a {
        /* renamed from: a */
        void mo2927a(FinderLbsLoader.C2698a aVar);
    }

    /* renamed from: ke1.n$b */
    public static final class C9597b {

        /* renamed from: a */
        public int f29850a = 1;

        /* renamed from: b */
        public C89349b f29851b;

        /* renamed from: c */
        public C89349b f29852c;

        /* renamed from: d */
        public LinkedList<C0716c> f29853d = new LinkedList<>();

        public C9597b(int i) {
        }
    }

    /* renamed from: ke1.n$c */
    public static final class C9598c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f29854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9598c(String str) {
            super(0);
            this.f29854d = str;
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C76701a.makeText(context, (CharSequence) "debug info " + this.f29854d, 1).show();
            return C13598b0.f38549a;
        }
    }

    public C9595n(int i, C49712hj1 hj12) {
        this.f29843g = i;
        this.f29844h = hj12;
        this.f29845i = new C9597b(i);
    }

    /* renamed from: y1 */
    public static void m9271y1(C9595n nVar, C9360p1.C9361a aVar, boolean z, int i, List list, boolean z2, boolean z3, C9360p1.C9362b bVar, int i2, Object obj) {
        C9595n nVar2 = nVar;
        boolean z4 = (i2 & 2) != 0 ? false : z;
        List list2 = (i2 & 8) != 0 ? null : list;
        boolean z5 = (i2 & 16) != 0 ? false : z2;
        C9360p1.C9362b bVar2 = (i2 & 64) != 0 ? null : bVar;
        nVar.getClass();
        new C9306f0(i, nVar2.f29843g, new C9600p(list2, nVar, i, z5, z4, aVar), bVar2, nVar2.f29845i.f29852c, false, nVar2.f29844h).mo9225i().mo11397F(nVar2.f29846j);
    }

    /* renamed from: z1 */
    public final void mo10271z1(String str) {
        Log.m105920e("Finder.FinderLbsFeedFetcher", str);
        if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
            C61926c.m72668M(new C9598c(str));
        }
    }
}
