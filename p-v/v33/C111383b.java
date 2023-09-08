package v33;

import android.util.Size;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import h43.C108077f0;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import l33.C109246a;
import l33.C109247e;
import p156gj.C107835h0;
import u33.C111130b;
import z04.C112550d0;

/* renamed from: v33.b */
public final class C111383b {

    /* renamed from: a */
    public int f333441a;

    /* renamed from: b */
    public final C54219z<Integer> f333442b = new C54219z<>(Integer.valueOf(this.f333441a));

    /* renamed from: c */
    public int f333443c;

    /* renamed from: d */
    public long f333444d;

    /* renamed from: e */
    public String f333445e = "";

    /* renamed from: f */
    public boolean f333446f;

    /* renamed from: g */
    public final C54219z<Boolean> f333447g = new C54219z<>(Boolean.valueOf(this.f333446f));

    /* renamed from: h */
    public int f333448h;

    /* renamed from: i */
    public int f333449i;

    /* renamed from: j */
    public Boolean f333450j;

    /* renamed from: k */
    public boolean f333451k;

    /* renamed from: l */
    public boolean f333452l;

    /* renamed from: m */
    public ConcurrentHashMap<Integer, C111130b> f333453m = new ConcurrentHashMap<>();

    /* renamed from: n */
    public String f333454n;

    /* renamed from: o */
    public boolean f333455o;

    /* renamed from: p */
    public Size f333456p;

    /* renamed from: q */
    public Size f333457q;

    /* renamed from: r */
    public long f333458r;

    /* renamed from: s */
    public long f333459s;

    /* renamed from: t */
    public int f333460t;

    /* renamed from: u */
    public long f333461u;

    /* renamed from: a */
    public final C111130b mo163047a(int i) {
        return this.f333453m.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo163048b(int i, C111130b bVar) {
        C87412m.m108594g(bVar, "thread");
        this.f333453m.put(Integer.valueOf(i), bVar);
    }

    /* renamed from: c */
    public final boolean mo163049c() {
        return (C107835h0.f322845b.f322806e == 1 && this.f333459s == 0) || C87412m.m108589b(this.f333450j, Boolean.TRUE) || this.f333451k;
    }

    /* renamed from: d */
    public final boolean mo163050d() {
        long j = this.f333444d;
        if (671097088 <= j && j < 805306368) {
            return true;
        }
        String str = this.f333445e;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (C112550d0.m153801u(lowerCase, "iphone", false)) {
            return true;
        }
        String lowerCase2 = this.f333445e.toLowerCase(locale);
        C87412m.m108593f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C112550d0.m153801u(lowerCase2, "ipad", false);
    }

    /* renamed from: e */
    public final void mo163051e() {
        C108077f0 T;
        C108077f0 T2;
        this.f333443c = 0;
        this.f333456p = null;
        this.f333457q = null;
        this.f333458r = 0;
        this.f333449i = 0;
        this.f333459s = 0;
        this.f333441a = 0;
        if (MMHandlerThread.isMainThread()) {
            this.f333442b.setValue(0);
        } else {
            this.f333442b.postValue(0);
        }
        this.f333451k = false;
        this.f333444d = 0;
        C109246a aVar = C109247e.xx0().f317333b;
        if (!(aVar == null || (T2 = aVar.mo152447T()) == null)) {
            T2.mo158496k(C109247e.vx0().f333441a);
        }
        this.f333445e = "";
        C109246a aVar2 = C109247e.xx0().f317333b;
        if (aVar2 != null && (T = aVar2.mo152447T()) != null) {
            T.mo158496k(C109247e.vx0().f333441a);
        }
    }
}
