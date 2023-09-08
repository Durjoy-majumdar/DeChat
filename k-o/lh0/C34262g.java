package lh0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.HashMap;
import sf0.C90189z;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: lh0.g */
public class C34262g extends C86301e {

    /* renamed from: o */
    public static HashMap<Integer, C91753f.C66827b> f92365o;

    /* renamed from: d */
    public C90189z.C90190a f92366d;

    /* renamed from: e */
    public C34271k f92367e;

    /* renamed from: f */
    public C34273m f92368f;

    /* renamed from: g */
    public C34275o f92369g;

    /* renamed from: h */
    public C34261e f92370h;

    /* renamed from: i */
    public C21436f f92371i;

    /* renamed from: j */
    public String f92372j = null;

    /* renamed from: n */
    public String f92373n = null;

    /* renamed from: lh0.g$a */
    public class C34263a implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C34271k.f92382e;
        }
    }

    /* renamed from: lh0.g$b */
    public class C34264b implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C34273m.f92385e;
        }
    }

    /* renamed from: lh0.g$c */
    public class C34265c implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C34275o.f92388e;
        }
    }

    /* renamed from: lh0.g$d */
    public class C34266d implements C91753f.C66827b {
        /* renamed from: a */
        public String[] mo6410a() {
            return C34261e.f92362f;
        }
    }

    static {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        f92365o = hashMap;
        hashMap.put(-1048710619, new C34263a());
        f92365o.put(1145122568, new C34264b());
        f92365o.put(1657416115, new C34265c());
        f92365o.put(628593827, new C34266d());
    }

    public static C34262g vx0() {
        return (C34262g) C86312j.m106911c(C34262g.class);
    }

    public void onAccountInitialized(Context context) {
        Log.m105925i("MicroMsg.AiStorageLogic", "init  [%s] [%s]", C86709a0.m107535s().f251807e, C86709a0.m107535s().f251806d);
        this.f92372j = C86709a0.m107535s().f251806d + "aimodel" + "/";
        String str = this.f92372j + "aifinder" + "/";
        this.f92373n = str;
        String[] strArr = {this.f92372j, str};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            C86013q1.m106461v(str2);
            C86013q1.m106460u(str2);
        }
        long currentTicks = Util.currentTicks();
        C90189z.C90190a aVar = this.f92366d;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo124435t(hashCode());
            }
            this.f92366d = null;
        }
        C90189z.C90190a a = C90189z.m112866a(hashCode(), C86709a0.m107535s().f251807e + "WxExptAi.db", f92365o, true);
        this.f92366d = a;
        this.f92367e = new C34271k(a);
        this.f92368f = new C34273m(a);
        this.f92369g = new C34275o(a);
        this.f92370h = new C34261e(a);
        this.f92371i = new C21436f();
        Log.m105925i("MicroMsg.AiStorageLogic", "[%d] init DB finish cost[%d]", Integer.valueOf(hashCode()), Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    public void onAccountReleased(Context context) {
        C90189z.C90190a aVar = this.f92366d;
        if (aVar != null) {
            aVar.mo124435t(hashCode());
        }
        this.f92366d = null;
    }
}
