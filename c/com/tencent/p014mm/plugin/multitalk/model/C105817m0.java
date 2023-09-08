package com.tencent.p014mm.plugin.multitalk.model;

import android.text.TextUtils;
import as3.C103896q0;
import c92.C104329g;
import c92.C104331h;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.pluginsdk.platformtools.C6665b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ds3.C107066f;
import gy3.C87412m;
import h81.C32735h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import nw3.C109779e;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.multitalk.model.m0 */
public final class C105817m0 extends C105792d {

    /* renamed from: b */
    public final C105818a[] f314676b = {new C105818a()};

    /* renamed from: c */
    public volatile boolean f314677c;

    /* renamed from: d */
    public volatile boolean f314678d;

    /* renamed from: e */
    public volatile int f314679e = -1;

    /* renamed from: f */
    public volatile String f314680f = "";

    /* renamed from: g */
    public volatile C105819b f314681g;

    /* renamed from: h */
    public final C6665b f314682h = new C6665b("multitalk_network");

    /* renamed from: com.tencent.mm.plugin.multitalk.model.m0$a */
    public final class C105818a implements Runnable {

        /* renamed from: d */
        public int[] f314683d = new int[1];

        /* renamed from: e */
        public volatile boolean f314684e;

        public C105818a() {
        }

        public void run() {
            boolean z;
            this.f314684e = true;
            while (C105817m0.this.f314677c && this.f314684e) {
                C105817m0.this.f314682h.mo7583a("_total");
                Boolean valueOf = Boolean.valueOf(this.f314684e);
                C105817m0 m0Var = C105817m0.this;
                synchronized (valueOf) {
                    if (this.f314684e) {
                        int b = C105817m0.m142181b(m0Var, this.f314683d);
                        z = b >= 0;
                        if (b > 0) {
                            if (this.f314683d.length < b) {
                                Log.m105924i("NetworkDataSource", "realloc buffer, new size: " + b + ", cur size: " + this.f314683d.length);
                                this.f314683d = new int[b];
                            } else {
                                Log.m105920e("NetworkDataSource", "decode ret -100, but array size is enough");
                                z = false;
                            }
                        }
                    } else {
                        z = true;
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                if (!z) {
                    C105817m0.this.f314682h.mo7583a("_fail");
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException unused) {
                        C105817m0.this.f314677c = false;
                    }
                } else {
                    C105817m0.this.f314682h.mo7583a("_success");
                }
            }
            this.f314684e = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.model.m0$b */
    public final class C105819b implements Runnable {

        /* renamed from: d */
        public int[] f314686d = new int[1];

        /* renamed from: e */
        public volatile boolean f314687e;

        public C105819b() {
        }

        public void run() {
            boolean z;
            this.f314687e = true;
            while (C105817m0.this.f314678d) {
                if (!(C105817m0.this.f314679e >= 0) || !this.f314687e) {
                    break;
                }
                Boolean valueOf = Boolean.valueOf(this.f314687e);
                C105817m0 m0Var = C105817m0.this;
                synchronized (valueOf) {
                    if (this.f314687e) {
                        int a = C105817m0.m142180a(m0Var, this.f314686d);
                        z = a >= 0;
                        if (a > 0) {
                            if (this.f314686d.length < a) {
                                Log.m105924i("NetworkDataSource", "realloc buffer, new size: " + a + ", cur size: " + this.f314686d.length);
                                this.f314686d = new int[a];
                            } else {
                                Log.m105920e("NetworkDataSource", "decode ret -100, but array size is enough");
                                z = false;
                            }
                        }
                    } else {
                        z = true;
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                if (!z) {
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException unused) {
                        C105817m0.this.f314678d = false;
                    }
                }
            }
            this.f314687e = false;
            int i = C104329g.f308837i;
            if (i == 1) {
                long currentTimeMillis = System.currentTimeMillis() - C104329g.f308833e;
                C104329g.f308835g += currentTimeMillis;
                C104329g.f308834f += currentTimeMillis;
            } else if (i == 2) {
                long currentTimeMillis2 = System.currentTimeMillis() - C104329g.f308833e;
                C104329g.f308836h += currentTimeMillis2;
                C104329g.f308834f += currentTimeMillis2;
            }
            C105855y0 y0Var = C105817m0.this.f314596a;
            if (y0Var != null) {
                ((C105857z0) y0Var).mo150837a();
            }
        }
    }

    /* renamed from: a */
    public static final int m142180a(C105817m0 m0Var, int[] iArr) {
        C105855y0 y0Var = m0Var.f314596a;
        if (y0Var == null) {
            return -1;
        }
        long currentTicks = Util.currentTicks();
        Integer num = null;
        C107066f e = ((C109779e) C105851w0.xx0().f314798d).mo161034e((byte[]) null, iArr, m0Var.f314679e);
        int i = e.f320479g;
        if (i == -100) {
            return e.f320475c * e.f320476d;
        }
        if (!(i > 0 && !TextUtils.isEmpty(e.f320478f) && C87412m.m108589b(e.f320478f, m0Var.f314680f))) {
            e = null;
        }
        if (e == null) {
            return -1;
        }
        int i2 = e.f320475c * e.f320476d;
        int[] iArr2 = e.f320473a;
        if (i2 < (iArr2 != null ? iArr2.length : 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("image buffer size is ");
            int[] iArr3 = e.f320473a;
            if (iArr3 != null) {
                num = Integer.valueOf(iArr3.length);
            }
            sb.append(num);
            Log.m105924i("NetworkDataSource", sb.toString());
            return -1;
        }
        C104329g gVar = C104329g.f308829a;
        gVar.mo146028b(1);
        gVar.mo146027a(1, Util.ticksToNow(currentTicks));
        String str = e.f320478f;
        C87412m.m108593f(str, "decodeInfo.usrName");
        int[] iArr4 = e.f320473a;
        C87412m.m108593f(iArr4, "decodeInfo.imgBuffer");
        ((C105857z0) y0Var).mo150838b(str, iArr4, e.f320475c, e.f320476d, 0, e.f320480h);
        return 0;
    }

    /* renamed from: b */
    public static final int m142181b(C105817m0 m0Var, int[] iArr) {
        C105855y0 y0Var = m0Var.f314596a;
        if (y0Var == null) {
            return -1;
        }
        long currentTicks = Util.currentTicks();
        C107066f f = ((C109779e) C105851w0.xx0().f314798d).mo161035f(iArr);
        int i = f.f320479g;
        if (i == -100) {
            return f.f320475c * f.f320476d;
        }
        Integer num = null;
        if (!(i > 0 && !TextUtils.isEmpty(f.f320478f) && f.f320475c > 0 && f.f320476d > 0)) {
            f = null;
        }
        if (f == null) {
            return -1;
        }
        C104329g.f308829a.mo146027a(0, Util.ticksToNow(currentTicks));
        int i2 = f.f320475c * f.f320476d;
        int[] iArr2 = f.f320473a;
        if (i2 < (iArr2 != null ? iArr2.length : 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("image buffer size is ");
            int[] iArr3 = f.f320473a;
            if (iArr3 != null) {
                num = Integer.valueOf(iArr3.length);
            }
            sb.append(num);
            Log.m105924i("NetworkDataSource", sb.toString());
            return -1;
        }
        String str = f.f320478f;
        C87412m.m108593f(str, "decodeInfo.usrName");
        int[] iArr4 = f.f320473a;
        C87412m.m108593f(iArr4, "decodeInfo.imgBuffer");
        int i3 = f.f320475c;
        int i4 = f.f320476d;
        int i5 = OpenGlRender.f318118B;
        ((C105857z0) y0Var).mo150840d(str, iArr4, i3, i4, 0, 4);
        return 0;
    }

    /* renamed from: c */
    public final void mo150790c(String str) {
        C87412m.m108594g(str, "userName");
        int c = C104331h.m139311c(str);
        if (c != -1) {
            boolean z = true;
            boolean z2 = false;
            if (!(this.f314679e >= 0) && !this.f314678d) {
                this.f314678d = true;
                this.f314679e = c;
                ArrayList arrayList = new ArrayList();
                C103896q0 q0Var = new C103896q0();
                q0Var.f307131b = c;
                arrayList.add(q0Var);
                ByteBuffer allocate = ByteBuffer.allocate(4);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder).putInt(c);
                ((C109779e) C105851w0.xx0().f314798d).mo161038i(55, allocate.array(), 4);
                ((C109779e) C105851w0.xx0().f314798d).mo161041l(arrayList);
                this.f314680f = str;
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_screen_cast_use_hw_decode, 0) != 1) {
                    z = false;
                }
                if (!z) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(6);
                    allocate2.order(byteOrder);
                    allocate2.putShort(0);
                    allocate2.putShort((short) 8);
                    allocate2.putShort(0);
                    if (C105851w0.zx0().f314506t != null) {
                        z2 = C105851w0.zx0().mo150681w(C105851w0.zx0().f314506t.f320042d);
                    }
                    if (z2) {
                        C105724z zVar = C105724z.INSTANCE;
                        byte[] array = allocate2.array();
                        zVar.getClass();
                        C105714w.m141918c(39, array, 6);
                    } else {
                        ((C109779e) C105851w0.xx0().f314798d).mo161038i(39, allocate2.array(), 6);
                    }
                }
                C105819b bVar = new C105819b();
                new Thread(bVar).start();
                this.f314681g = bVar;
            }
        }
    }

    /* renamed from: d */
    public final void mo150791d() {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN).putInt(-1);
        ((C109779e) C105851w0.xx0().f314798d).mo161038i(55, allocate.array(), 4);
        ((C109779e) C105851w0.xx0().f314798d).mo161041l(new ArrayList());
        this.f314679e = -1;
        this.f314678d = false;
        if (!this.f314677c) {
            this.f314596a = null;
        }
        C105819b bVar = this.f314681g;
        if (bVar != null) {
            synchronized (Boolean.valueOf(bVar.f314687e)) {
                bVar.f314687e = false;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        this.f314681g = null;
    }

    /* renamed from: e */
    public final void mo150792e() {
        this.f314677c = false;
        if (!this.f314678d) {
            this.f314596a = null;
        }
        for (C105818a aVar : this.f314676b) {
            synchronized (Boolean.valueOf(aVar.f314684e)) {
                aVar.f314684e = false;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }
}
