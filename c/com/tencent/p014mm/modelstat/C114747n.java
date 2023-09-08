package com.tencent.p014mm.modelstat;

import android.database.Cursor;

/* renamed from: com.tencent.mm.modelstat.n */
public class C114747n {

    /* renamed from: A */
    public long f344019A = 0;

    /* renamed from: B */
    public long f344020B = 0;

    /* renamed from: C */
    public long f344021C = 0;

    /* renamed from: D */
    public long f344022D = 0;

    /* renamed from: E */
    public long f344023E = 0;

    /* renamed from: a */
    public int f344024a = -2;

    /* renamed from: b */
    public int f344025b = 0;

    /* renamed from: c */
    public int f344026c = 0;

    /* renamed from: d */
    public int f344027d = 0;

    /* renamed from: e */
    public long f344028e = 0;

    /* renamed from: f */
    public int f344029f = 0;

    /* renamed from: g */
    public long f344030g = 0;

    /* renamed from: h */
    public int f344031h = 0;

    /* renamed from: i */
    public long f344032i = 0;

    /* renamed from: j */
    public int f344033j = 0;

    /* renamed from: k */
    public long f344034k = 0;

    /* renamed from: l */
    public long f344035l = 0;

    /* renamed from: m */
    public long f344036m = 0;

    /* renamed from: n */
    public long f344037n = 0;

    /* renamed from: o */
    public long f344038o = 0;

    /* renamed from: p */
    public int f344039p = 0;

    /* renamed from: q */
    public long f344040q = 0;

    /* renamed from: r */
    public int f344041r = 0;

    /* renamed from: s */
    public long f344042s = 0;

    /* renamed from: t */
    public int f344043t = 0;

    /* renamed from: u */
    public long f344044u = 0;

    /* renamed from: v */
    public int f344045v = 0;

    /* renamed from: w */
    public long f344046w = 0;

    /* renamed from: x */
    public long f344047x = 0;

    /* renamed from: y */
    public long f344048y = 0;

    /* renamed from: z */
    public long f344049z = 0;

    /* renamed from: a */
    public boolean mo174381a(C114747n nVar) {
        this.f344024a = nVar.f344024a | 1;
        long j = nVar.f344028e;
        this.f344027d = (int) (((long) this.f344027d) + j);
        this.f344028e += j;
        long j2 = nVar.f344030g;
        this.f344029f = (int) (((long) this.f344029f) + j2);
        this.f344030g += j2;
        this.f344031h += nVar.f344031h;
        this.f344032i += nVar.f344032i;
        this.f344033j += nVar.f344033j;
        this.f344034k += nVar.f344034k;
        long j3 = this.f344035l + nVar.f344035l;
        this.f344035l = j3;
        long j4 = this.f344036m + nVar.f344036m;
        this.f344036m = j4;
        this.f344037n += nVar.f344037n;
        this.f344038o += nVar.f344038o;
        long j5 = nVar.f344040q;
        this.f344039p = (int) (((long) this.f344039p) + j5);
        this.f344040q += j5;
        long j6 = nVar.f344042s;
        this.f344041r = (int) (((long) this.f344041r) + j6);
        this.f344042s += j6;
        this.f344043t += nVar.f344043t;
        this.f344044u += nVar.f344044u;
        this.f344045v += nVar.f344045v;
        this.f344046w += nVar.f344046w;
        long j7 = this.f344047x + nVar.f344047x;
        this.f344047x = j7;
        long j8 = this.f344048y + nVar.f344048y;
        this.f344048y = j8;
        this.f344049z += nVar.f344049z;
        this.f344019A += nVar.f344019A;
        this.f344020B += nVar.f344020B;
        this.f344021C += nVar.f344021C;
        this.f344022D += nVar.f344022D;
        this.f344023E += nVar.f344023E;
        return j3 > 4096 || j4 > 4096 || j7 > 4096 || j8 > 4096;
    }

    /* renamed from: b */
    public void mo174382b(Cursor cursor) {
        this.f344025b = cursor.getInt(0);
        this.f344026c = cursor.getInt(1);
        this.f344027d = cursor.getInt(2);
        this.f344028e = cursor.getLong(3);
        this.f344029f = cursor.getInt(4);
        this.f344030g = cursor.getLong(5);
        this.f344031h = cursor.getInt(6);
        this.f344032i = cursor.getLong(7);
        this.f344033j = cursor.getInt(8);
        this.f344034k = cursor.getLong(9);
        this.f344035l = cursor.getLong(10);
        this.f344036m = cursor.getLong(11);
        this.f344037n = cursor.getLong(12);
        this.f344038o = cursor.getLong(13);
        this.f344039p = cursor.getInt(14);
        this.f344040q = cursor.getLong(15);
        this.f344041r = cursor.getInt(16);
        this.f344042s = cursor.getLong(17);
        this.f344043t = cursor.getInt(18);
        this.f344044u = cursor.getLong(19);
        this.f344045v = cursor.getInt(20);
        this.f344046w = cursor.getLong(21);
        this.f344047x = cursor.getLong(22);
        this.f344048y = cursor.getLong(23);
        this.f344049z = cursor.getLong(24);
        this.f344019A = cursor.getLong(25);
        this.f344020B = cursor.getLong(26);
        this.f344021C = cursor.getLong(27);
        this.f344022D = cursor.getLong(28);
        this.f344023E = cursor.getLong(29);
    }

    /* renamed from: c */
    public int mo174383c() {
        return this.f344024a;
    }

    /* renamed from: d */
    public int mo174384d() {
        return this.f344025b;
    }

    /* renamed from: e */
    public int mo174385e() {
        return this.f344026c;
    }

    /* renamed from: f */
    public void mo174386f(int i) {
        this.f344024a = i;
    }

    /* renamed from: g */
    public void mo174387g(int i) {
        this.f344025b = i;
    }

    /* renamed from: h */
    public void mo174388h(int i) {
        this.f344026c = i;
    }

    public String toString() {
        return String.format("NetStatInfo:[mobile in=%dB/%dB/%dB, out=%dB/%dB/%dB][wifi in=%dB/%dB/%dB, out=%dB/%dB/%dB][text in=%d/%dB, out=%d/%dB][image in=%d/%dB, out=%d/%dB][voice in=%d/%dB, out=%d/%dB][video in=%d/%dB, out=%d/%dB]", new Object[]{Long.valueOf(this.f344035l), Long.valueOf(this.f344020B), Long.valueOf(this.f344037n), Long.valueOf(this.f344047x), Long.valueOf(this.f344022D), Long.valueOf(this.f344049z), Long.valueOf(this.f344036m), Long.valueOf(this.f344021C), Long.valueOf(this.f344038o), Long.valueOf(this.f344048y), Long.valueOf(this.f344023E), Long.valueOf(this.f344019A), Integer.valueOf(this.f344027d), Long.valueOf(this.f344028e), Integer.valueOf(this.f344039p), Long.valueOf(this.f344040q), Integer.valueOf(this.f344029f), Long.valueOf(this.f344030g), Integer.valueOf(this.f344041r), Long.valueOf(this.f344042s), Integer.valueOf(this.f344031h), Long.valueOf(this.f344032i), Integer.valueOf(this.f344043t), Long.valueOf(this.f344044u), Integer.valueOf(this.f344033j), Long.valueOf(this.f344034k), Integer.valueOf(this.f344045v), Long.valueOf(this.f344046w)});
    }
}
