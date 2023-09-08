package ep1;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Application;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f14.C58901s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ep1.c */
public final class C58661c {

    /* renamed from: f */
    public static final C58661c f167935f = C58662a.f167941a;

    /* renamed from: a */
    public final C0000n0 f167936a;

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, Integer> f167937b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public final ConcurrentHashMap<Integer, C58659a> f167938c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final HashMap<Integer, C58664e> f167939d = new HashMap<>();

    /* renamed from: e */
    public int f167940e;

    /* renamed from: ep1.c$a */
    public static final class C58662a {

        /* renamed from: a */
        public static final C58661c f167941a = new C58661c((C8480h) null);
    }

    public C58661c(C8480h hVar) {
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        this.f167936a = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a));
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        C87412m.m108592e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C58660b(this));
    }
}
