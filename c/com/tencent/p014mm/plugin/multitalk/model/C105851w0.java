package com.tencent.p014mm.plugin.multitalk.model;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import eb0.C86482a6;
import ei3.C86522b;
import f40.C86709a0;
import java.util.HashMap;
import java.util.HashSet;
import s82.C36639c;
import s82.C77624a;
import v82.C111425d1;
import v82.C111452h1;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.multitalk.model.w0 */
public class C105851w0 extends C86301e {

    /* renamed from: d */
    public volatile C105845w f314813d;

    /* renamed from: e */
    public volatile MultiTalkManager f314814e;

    /* renamed from: f */
    public volatile C111425d1 f314815f;

    /* renamed from: g */
    public volatile C105825p f314816g;

    /* renamed from: h */
    public volatile C105804h0 f314817h;

    /* renamed from: i */
    public volatile C77624a f314818i;

    /* renamed from: j */
    public volatile C36639c f314819j;

    /* renamed from: n */
    public volatile C105780a0 f314820n;

    /* renamed from: o */
    public C86482a6.C86483a f314821o = new C105852a();

    /* renamed from: com.tencent.mm.plugin.multitalk.model.w0$a */
    public class C105852a implements C86482a6.C86483a {
        public C105852a() {
        }

        /* renamed from: a */
        public boolean mo120943a() {
            Log.m105928w("MicroMsg.SubCoreMultiTalk", "HERE UninitForUEH is called! multitalk");
            if (C105851w0.this.f314814e != null) {
                C105851w0.this.f314814e.mo150656d(true);
                if (C105851w0.this.f314814e.f314506t != null) {
                    Log.m105925i("MicroMsg.SubCoreMultiTalk", "dump multiTalkGroup: %s", C105806i0.m142149b(C105851w0.this.f314814e.f314506t));
                }
            }
            return true;
        }
    }

    public static C36639c Ax0() {
        C105851w0 wx02 = wx0();
        if (wx02.f314819j == null && C86709a0.m107522a()) {
            synchronized (MultiTalkManager.class) {
                if (wx02.f314819j == null) {
                    wx02.f314819j = new C36639c(C86709a0.m107535s().f251811i);
                }
            }
        }
        return wx02.f314819j;
    }

    public static C105795e0 Bx0() {
        return (C105795e0) C86312j.m106911c(C69856h.class);
    }

    public static C111425d1 Cx0() {
        C105851w0 wx02 = wx0();
        if (wx02.f314815f == null && C86709a0.m107522a()) {
            synchronized (MultiTalkManager.class) {
                if (wx02.f314815f == null) {
                    wx02.f314815f = new C111425d1();
                }
            }
        }
        return wx02.f314815f;
    }

    public static C105804h0 Dx0() {
        C105851w0 wx02 = wx0();
        if (wx02.f314817h == null && C86709a0.m107522a()) {
            synchronized (MultiTalkManager.class) {
                if (wx02.f314817h == null) {
                    wx02.f314817h = new C105804h0();
                }
            }
        }
        return wx02.f314817h;
    }

    public static C105825p vx0() {
        C105851w0 wx02 = wx0();
        if (wx02.f314816g == null && C86709a0.m107522a()) {
            synchronized (MultiTalkManager.class) {
                if (wx02.f314816g == null) {
                    wx02.f314816g = new C105825p();
                }
            }
        }
        return wx02.f314816g;
    }

    public static C105851w0 wx0() {
        return (C105851w0) C86312j.m106911c(C105851w0.class);
    }

    public static C105845w xx0() {
        C105851w0 wx02 = wx0();
        if (wx02.f314813d == null && C86709a0.m107522a()) {
            synchronized (MultiTalkManager.class) {
                if (wx02.f314813d == null) {
                    wx02.f314813d = new C105845w();
                }
            }
        }
        return wx02.f314813d;
    }

    public static C77624a yx0() {
        C105851w0 wx02 = wx0();
        if (wx02.f314818i == null && C86709a0.m107522a()) {
            synchronized (MultiTalkManager.class) {
                if (wx02.f314818i == null) {
                    wx02.f314818i = new C77624a(C86709a0.m107535s().f251811i);
                }
            }
        }
        return wx02.f314818i;
    }

    public static MultiTalkManager zx0() {
        C105851w0 wx02 = wx0();
        if (wx02.f314814e == null && C86709a0.m107522a()) {
            synchronized (MultiTalkManager.class) {
                if (wx02.f314814e == null) {
                    wx02.f314814e = new MultiTalkManager();
                }
            }
        }
        return wx02.f314814e;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C86482a6 f = C86709a0.m107526f();
        C86482a6.C86483a aVar = this.f314821o;
        if (f.f251307a) {
            Log.m105920e("MicroMsg.UninitForUEH", "add , is running , forbid add");
        } else {
            ((HashSet) f.f251308b).add(aVar);
        }
        Bx0().Bx0();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.SubCoreMultiTalk", "onAccountReleased: ");
        if (this.f314813d != null) {
            C105845w wVar = this.f314813d;
            wVar.getClass();
            C86709a0.m107524d().mo123470p(1918, wVar);
            C86709a0.m107524d().mo123470p(1919, wVar);
            C86709a0.m107524d().mo123470p(1927, wVar);
            C86709a0.m107524d().mo123470p(1928, wVar);
            C86709a0.m107524d().mo123470p(1929, wVar);
            C86709a0.m107524d().mo123470p(1931, wVar);
            C86709a0.m107524d().mo123470p(1932, wVar);
            C86709a0.m107524d().mo123470p(1933, wVar);
            C86709a0.m107524d().mo123470p(1935, wVar);
            C86709a0.m107524d().mo123470p(1937, wVar);
            C86709a0.m107524d().mo123470p(1938, wVar);
            C86709a0.m107524d().mo123470p(1939, wVar);
            wVar.mo150829i();
            this.f314813d = null;
        }
        if (this.f314814e != null) {
            MultiTalkManager multiTalkManager = this.f314814e;
            multiTalkManager.getClass();
            Log.m105924i("MicroMsg.MT.MultiTalkManager", "close: ");
            try {
                MMApplicationContext.getContext().unregisterReceiver(multiTalkManager.f314485V0);
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.MT.MultiTalkManager", th, "unregister phoneStatusReceiver failed.", new Object[0]);
            }
            multiTalkManager.f314489X0.dead();
            multiTalkManager.f314501p = false;
            if (multiTalkManager.f314505s != C111452h1.Init) {
                multiTalkManager.mo150660f(false, false);
                Log.m105924i("MicroMsg.MT.MultiTalkManager", "steve: account release. uninit ilink so");
                C105724z zVar = C105724z.INSTANCE;
                zVar.mo150614x(zVar.f314348C1);
            }
            HashMap<String, Integer> hashMap = multiTalkManager.f314484V;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f314814e = null;
        }
        if (this.f314817h != null) {
            C105804h0 h0Var = this.f314817h;
            h0Var.f314624b = false;
            h0Var.f314623a = false;
            this.f314817h = null;
        }
        C86482a6 f = C86709a0.m107526f();
        C86482a6.C86483a aVar = this.f314821o;
        if (f.f251307a) {
            Log.m105920e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
        } else {
            ((HashSet) f.f251308b).remove(aVar);
        }
    }
}
