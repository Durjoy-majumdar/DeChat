package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gv0.C20842c;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import mv0.C99990k;
import nv0.C100216b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p823sg.C90193h;

/* renamed from: mv0.g */
public class C99984g implements C47355o {

    /* renamed from: d */
    public Object f292941d = new Object();

    /* renamed from: e */
    public Random f292942e = new Random();

    /* renamed from: f */
    public boolean f292943f = false;

    /* renamed from: g */
    public boolean f292944g = false;

    /* renamed from: h */
    public List<String> f292945h = new LinkedList();

    /* renamed from: i */
    public HashSet<String> f292946i = new HashSet<>();

    /* renamed from: j */
    public C99990k.C99994d f292947j;

    /* renamed from: n */
    public C11385n f292948n;

    /* renamed from: o */
    public boolean f292949o = false;

    /* renamed from: p */
    public int f292950p = 0;

    /* renamed from: c */
    public static String m130652c(Random random) {
        return C90193h.m112878f(("" + Util.currentTicks() + random.nextDouble()).getBytes());
    }

    /* renamed from: a */
    public void mo139325a() {
        Log.m105924i("MicroMsg.BakPCServer", "cancel");
        this.f292944g = true;
        C20842c.m22884u1(5, this.f292948n);
        this.f292947j = null;
        this.f292949o = false;
        synchronized (this.f292941d) {
            this.f292941d.notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo139326b() {
        if (this.f292949o && !this.f292944g) {
            synchronized (this.f292941d) {
                if (this.f292946i.isEmpty()) {
                    C99980a.m130643h().mo139322k().f292969q = 4;
                    C99980a.m130643h().mo139322k().f292970r = 3;
                    C20842c.m22884u1(5, this.f292948n);
                    new C100216b(5).mo32547o1();
                    C99980a.m130643h().mo139321j().f292935d++;
                    C99990k.C99994d dVar = this.f292947j;
                    if (dVar != null) {
                        dVar.mo127336W2();
                    } else {
                        Log.m105924i("MicroMsg.BakPCServer", "operatorCallback is null");
                    }
                    mo139325a();
                    Log.m105924i("MicroMsg.BakPCServer", "send backup finish cmd");
                }
            }
        }
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
    }
}
