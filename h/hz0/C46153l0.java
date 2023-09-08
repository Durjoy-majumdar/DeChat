package hz0;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.card.p031ui.C40856b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gz0.C20867d;
import gz0.C32626c;
import gz0.C45985e;
import gz0.C45987f;
import gz0.C45988h;
import gz0.C45991n;
import gz0.C45995o;
import gz0.C45998p;
import gz0.C46000r;
import java.util.ArrayList;
import oz0.C35342a;
import oz0.C35344d;
import pz0.C35746n;
import pz0.C47721j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: hz0.l0 */
public class C46153l0 extends C86301e {

    /* renamed from: d */
    public C32626c f124391d;

    /* renamed from: e */
    public C46141c f124392e;

    /* renamed from: f */
    public C33159k0 f124393f;

    /* renamed from: g */
    public C46150g f124394g;

    /* renamed from: h */
    public C46000r f124395h;

    /* renamed from: i */
    public C35342a f124396i;

    /* renamed from: j */
    public C47721j f124397j;

    /* renamed from: n */
    public C35746n f124398n;

    /* renamed from: o */
    public C35344d f124399o;

    /* renamed from: p */
    public C45995o f124400p = null;

    /* renamed from: q */
    public C45987f f124401q = null;

    /* renamed from: r */
    public C45998p f124402r = null;

    /* renamed from: s */
    public C45985e f124403s = null;

    /* renamed from: t */
    public C45991n f124404t = null;

    /* renamed from: u */
    public C20867d f124405u;

    /* renamed from: v */
    public C45988h f124406v;

    /* renamed from: w */
    public C33158k f124407w;

    /* renamed from: x */
    public C33155i f124408x;

    /* renamed from: y */
    public MMHandler f124409y = new MMHandler(Looper.getMainLooper());

    /* renamed from: z */
    public C40856b f124410z = new C40856b();

    public C46153l0() {
        Uri n = C116299g2.m163858n(C76251l.f223366b);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        Uri n2 = C116299g2.m163858n(C76251l.f223367c);
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
        if (!(l3.mo177810a() ? l3.f348991a.mo119948x(l3.f348992b) : z)) {
            C116281f0.C116288h l4 = C116281f0.C116289i.f348994a.mo177799l(n2, l3);
            if (l4.mo177810a()) {
                l4.f348991a.mo119937g(l4.f348992b);
            }
        }
    }

    public static C45991n Ax0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124404t == null) {
            Hx0().f124404t = new C45991n();
        }
        return Hx0().f124404t;
    }

    public static C45995o Bx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124400p == null) {
            Hx0().f124400p = new C45995o();
        }
        return Hx0().f124400p;
    }

    public static C46150g Cx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124394g == null) {
            Hx0().f124394g = new C46150g(C86709a0.m107535s().f251811i);
        }
        return Hx0().f124394g;
    }

    public static C33155i Dx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124408x == null) {
            Hx0().f124408x = new C33155i(C86709a0.m107535s().f251811i);
        }
        return Hx0().f124408x;
    }

    public static C33158k Ex0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124407w == null) {
            Hx0().f124407w = new C33158k(C86709a0.m107535s().f251811i);
        }
        return Hx0().f124407w;
    }

    public static C46000r Fx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124395h == null) {
            Hx0().f124395h = new C46000r();
        }
        return Hx0().f124395h;
    }

    public static C46141c Gx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124392e == null) {
            Hx0().f124392e = new C46141c(C86709a0.m107535s().f251811i);
        }
        return Hx0().f124392e;
    }

    public static C46153l0 Hx0() {
        return (C46153l0) C86312j.m106911c(C46153l0.class);
    }

    public static C33159k0 Ix0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124393f == null) {
            Hx0().f124393f = new C33159k0(C86709a0.m107535s().f251811i);
        }
        return Hx0().f124393f;
    }

    public static C45998p Jx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124402r == null) {
            Hx0().f124402r = new C45998p();
        }
        return Hx0().f124402r;
    }

    public static C35342a Kx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124396i == null) {
            Hx0().f124396i = new C35342a();
        }
        return Hx0().f124396i;
    }

    public static C47721j Lx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124397j == null) {
            Hx0().f124397j = new C47721j(C86709a0.m107535s().f251811i);
        }
        return Hx0().f124397j;
    }

    public static C35746n Mx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124398n == null) {
            Hx0().f124398n = new C35746n(C86709a0.m107535s().f251811i);
        }
        return Hx0().f124398n;
    }

    public static C32626c vx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124391d == null) {
            Hx0().f124391d = new C32626c();
        }
        return Hx0().f124391d;
    }

    public static C20867d wx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124405u == null) {
            Hx0().f124405u = new C20867d();
        }
        return Hx0().f124405u;
    }

    public static C45985e xx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124403s == null) {
            Hx0().f124403s = new C45985e();
        }
        return Hx0().f124403s;
    }

    public static C45987f yx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124401q == null) {
            Hx0().f124401q = new C45987f();
        }
        return Hx0().f124401q;
    }

    public static C45988h zx0() {
        C86709a0.m107523b().mo121108c();
        if (Hx0().f124406v == null) {
            Hx0().f124406v = new C45988h();
        }
        return Hx0().f124406v;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        Log.m105924i("MicroMsg.SubCoreCard", "onAccountPostReset, updated = %b");
        C40856b bVar = this.f124410z;
        bVar.getClass();
        ((Application) MMApplicationContext.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(bVar);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        if (Hx0().f124391d != null) {
            C32626c cVar = Hx0().f124391d;
            ((ArrayList) cVar.f86605e).clear();
            ((ArrayList) cVar.f86606f).clear();
            if (cVar.f86607g != null) {
                C86709a0.m107529k().f251779b.mo123458d(cVar.f86607g);
            }
            C86709a0.m107529k().f251779b.mo123470p(1074, cVar);
        }
        C40856b bVar = this.f124410z;
        bVar.getClass();
        ((Application) MMApplicationContext.getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(bVar);
    }
}
