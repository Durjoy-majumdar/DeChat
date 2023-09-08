package pa1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import h81.C32735h;
import java.util.HashSet;
import oa1.C117731d;

/* renamed from: pa1.c */
public class C35418c {

    /* renamed from: a */
    public static C35418c f94784a;

    /* renamed from: b */
    public static HashSet<String> f94785b = new HashSet<>();

    static {
        long currentTicks = Util.currentTicks();
        for (C32735h.C32737c name : C32735h.C32737c.values()) {
            f94785b.add(name.name());
        }
        Log.m105925i("MicroMsg.ExptMMKV", "get mulit expt enum cost time [%d]", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: b */
    public static C35418c m40699b() {
        if (f94784a == null) {
            f94784a = new C35418c();
        }
        return f94784a;
    }

    /* renamed from: a */
    public final boolean mo60250a() {
        if (MMApplicationContext.isMMProcess()) {
            return true;
        }
        Log.printInfoStack("MicroMsg.ExptMMKV", "%s only mm process can write expt info", mo60252d());
        return false;
    }

    /* renamed from: c */
    public String mo60251c(C32735h.C32737c cVar, String str, boolean z) {
        return C117731d.m166007c().mo182444f(cVar.name(), str, z, true);
    }

    /* renamed from: d */
    public final String mo60252d() {
        return hashCode() + "";
    }
}
