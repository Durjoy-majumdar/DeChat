package com.tencent.p014mm.plugin.messenger.foundation;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C30771q3;
import com.tencent.p014mm.storage.C30778t3;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44658g2;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72982l3;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.p014mm.storage.C72987n3;
import com.tencent.p014mm.storage.C72990p1;
import com.tencent.p014mm.storage.C72992v4;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32327i;
import g62.C45882k;
import g62.C45888s;
import g62.C75871e;
import g62.C75873h;
import g62.C75874j;
import g62.C75881q;
import g62.C75882t;
import g62.C8231f;
import g62.C8232g;
import g62.C8233m;
import g62.C8235p;
import p261wl.C38166b;
import p727vq.C37801b;
import q90.C101062d;
import tc0.C48622c;
import tc0.C77885p;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.messenger.foundation.t */
public class C69843t extends C86301e implements C75700k0 {

    /* renamed from: d */
    public volatile C44658g2 f201500d;

    /* renamed from: e */
    public volatile C44651a5 f201501e;

    /* renamed from: f */
    public volatile C30771q3 f201502f;

    /* renamed from: g */
    public volatile C72972g4 f201503g;

    /* renamed from: h */
    public volatile C44660i2 f201504h;

    /* renamed from: i */
    public volatile C48622c f201505i;

    /* renamed from: j */
    public volatile C44667s4 f201506j;

    /* renamed from: n */
    public volatile C72986n2 f201507n;

    /* renamed from: o */
    public volatile C72987n3 f201508o;

    /* renamed from: p */
    public volatile C72982l3 f201509p;

    /* renamed from: q */
    public volatile C72957c4 f201510q;

    /* renamed from: r */
    public volatile C72992v4 f201511r;

    /* renamed from: s */
    public volatile C72990p1 f201512s;

    /* renamed from: t */
    public volatile C30778t3 f201513t;

    public C75881q Cc0() {
        if (this.f201511r == null && C86709a0.m107522a()) {
            synchronized (C72992v4.class) {
                if (this.f201511r == null) {
                    this.f201511r = new C72992v4(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201511r;
    }

    /* renamed from: DX */
    public C8231f mo96093DX() {
        if (this.f201507n == null && C86709a0.m107522a()) {
            synchronized (C72986n2.class) {
                if (this.f201507n == null) {
                    this.f201507n = new C72986n2(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201507n;
    }

    /* renamed from: M5 */
    public C8232g mo96096M5() {
        if (this.f201509p == null && C86709a0.m107522a()) {
            synchronized (C72982l3.class) {
                if (this.f201509p == null) {
                    this.f201509p = new C72982l3(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201509p;
    }

    public C8235p V50() {
        if (this.f201506j == null && C86709a0.m107522a()) {
            synchronized (C44667s4.class) {
                if (this.f201506j == null) {
                    this.f201506j = new C44667s4(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201506j;
    }

    /* renamed from: XB */
    public C75874j mo96099XB() {
        if (this.f201510q == null && C86709a0.m107522a()) {
            synchronized (C72957c4.class) {
                if (this.f201510q == null) {
                    this.f201510q = new C72957c4(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201510q;
    }

    /* renamed from: XW */
    public C8233m mo96100XW() {
        if (!C86709a0.m107522a()) {
            return null;
        }
        return C77885p.C37009c.f98122a;
    }

    /* renamed from: cU */
    public C75871e mo96101cU() {
        if (this.f201512s == null && C86709a0.m107522a()) {
            synchronized (C75871e.class) {
                if (this.f201512s == null) {
                    this.f201512s = new C72990p1(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201512s;
    }

    /* renamed from: mC */
    public C75882t mo96102mC() {
        if (this.f201513t == null && C86709a0.m107522a()) {
            synchronized (C30778t3.class) {
                if (this.f201513t == null) {
                    this.f201513t = new C30778t3(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201513t;
    }

    public C45888s mm0() {
        if (this.f201501e == null && C86709a0.m107522a()) {
            synchronized (C44651a5.class) {
                if (this.f201501e == null) {
                    this.f201501e = new C44651a5(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201501e;
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        if (this.f201500d != null) {
            C44658g2 g2Var = this.f201500d;
            ((C101062d) g2Var.f121070d).clear();
            ((C101062d) g2Var.f121071e).clear();
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C86709a0.m107532n(C75700k0.class, this);
    }

    /* renamed from: vj */
    public C75873h mo96104vj() {
        if (this.f201508o == null && C86709a0.m107522a()) {
            synchronized (C72987n3.class) {
                if (this.f201508o == null) {
                    this.f201508o = new C72987n3(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201508o;
    }

    /* renamed from: vx0 */
    public C44658g2 mo96097Ni() {
        if (this.f201500d == null && C86709a0.m107522a()) {
            synchronized (C44658g2.class) {
                if (this.f201500d == null) {
                    this.f201500d = new C44658g2(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201500d;
    }

    /* renamed from: wx0 */
    public C44660i2 mo96094Ku() {
        if (this.f201504h == null && C86709a0.m107522a()) {
            synchronized (C44660i2.class) {
                if (this.f201504h == null) {
                    this.f201504h = new C44660i2(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201504h;
    }

    /* renamed from: x4 */
    public C32327i mo96107x4() {
        if (this.f201502f == null && C86709a0.m107522a()) {
            synchronized (C30771q3.class) {
                if (this.f201502f == null) {
                    this.f201502f = new C30771q3(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f201502f;
    }

    public C45882k x90() {
        if (this.f201505i == null && C86709a0.m107522a()) {
            synchronized (C45882k.class) {
                if (this.f201505i == null) {
                    this.f201505i = new C48622c();
                }
            }
        }
        return this.f201505i;
    }

    /* renamed from: xx0 */
    public C72972g4 mo96095LE() {
        if (this.f201503g == null && C86709a0.m107522a()) {
            C44658g2 vx02 = mo96097Ni();
            C44660i2 wx02 = mo96094Ku();
            boolean z = false;
            synchronized (C72972g4.class) {
                if (this.f201503g == null) {
                    this.f201503g = new C72972g4(C86709a0.m107535s().f251811i, vx02, wx02);
                    z = true;
                }
            }
            if (z) {
                C38166b.m41755b(C37801b.class, new t$$a(this));
            }
        }
        return this.f201503g;
    }
}
