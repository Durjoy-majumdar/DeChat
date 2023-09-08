package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Arrays;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.voip.model.z */
public class C106401z {

    /* renamed from: A */
    public int f317746A;

    /* renamed from: B */
    public long f317747B;

    /* renamed from: C */
    public long f317748C;

    /* renamed from: D */
    public long f317749D;

    /* renamed from: E */
    public long f317750E;

    /* renamed from: F */
    public long f317751F;

    /* renamed from: G */
    public long f317752G;

    /* renamed from: H */
    public long f317753H;

    /* renamed from: I */
    public long f317754I;

    /* renamed from: J */
    public long f317755J;

    /* renamed from: K */
    public long f317756K;

    /* renamed from: L */
    public long f317757L;

    /* renamed from: M */
    public long f317758M;

    /* renamed from: N */
    public long f317759N;

    /* renamed from: O */
    public long f317760O;

    /* renamed from: P */
    public long f317761P;

    /* renamed from: Q */
    public long f317762Q;

    /* renamed from: R */
    public long f317763R;

    /* renamed from: S */
    public long f317764S;

    /* renamed from: T */
    public long f317765T;

    /* renamed from: U */
    public long[] f317766U = new long[6];

    /* renamed from: V */
    public long f317767V;

    /* renamed from: W */
    public long f317768W = 0;

    /* renamed from: X */
    public long f317769X = 0;

    /* renamed from: Y */
    public int f317770Y = 0;

    /* renamed from: Z */
    public String f317771Z;

    /* renamed from: a */
    public int f317772a;

    /* renamed from: b */
    public int f317773b;

    /* renamed from: c */
    public int f317774c;

    /* renamed from: d */
    public int f317775d;

    /* renamed from: e */
    public byte f317776e;

    /* renamed from: f */
    public byte f317777f;

    /* renamed from: g */
    public byte f317778g;

    /* renamed from: h */
    public byte f317779h;

    /* renamed from: i */
    public byte f317780i;

    /* renamed from: j */
    public byte f317781j;

    /* renamed from: k */
    public int f317782k;

    /* renamed from: l */
    public long f317783l = 0;

    /* renamed from: m */
    public int f317784m;

    /* renamed from: n */
    public int f317785n;

    /* renamed from: o */
    public int f317786o;

    /* renamed from: p */
    public int f317787p;

    /* renamed from: q */
    public int f317788q;

    /* renamed from: r */
    public int f317789r;

    /* renamed from: s */
    public int f317790s;

    /* renamed from: t */
    public int f317791t;

    /* renamed from: u */
    public int f317792u;

    /* renamed from: v */
    public int f317793v;

    /* renamed from: w */
    public int f317794w;

    /* renamed from: x */
    public int f317795x;

    /* renamed from: y */
    public int f317796y;

    /* renamed from: z */
    public int f317797z;

    public C106401z() {
        mo152873e();
    }

    /* renamed from: a */
    public void mo152869a() {
        if (this.f317754I == 0) {
            this.f317794w = 0;
        } else {
            this.f317794w = (int) (System.currentTimeMillis() - this.f317754I);
        }
        C112597j.m153938c("MicroMsg.VoipDailReport", "devin:answerInvite current:" + System.currentTimeMillis());
        C112597j.m153938c("MicroMsg.VoipDailReport", "devin:answerInvite:" + this.f317794w);
    }

    /* renamed from: b */
    public void mo152870b() {
        this.f317747B = System.currentTimeMillis();
        C112597j.m153938c("MicroMsg.VoipDailReport", "devin:beginTalk:" + this.f317747B);
    }

    /* renamed from: c */
    public void mo152871c() {
        if (this.f317783l == 0) {
            this.f317791t = 0;
        } else {
            this.f317791t = (int) (System.currentTimeMillis() - this.f317783l);
        }
        C112597j.m153938c("MicroMsg.VoipDailReport", "devin:beginTime:" + this.f317783l + ", CurrentTime: " + System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append("devin:endNewDial:");
        sb.append(this.f317791t);
        C112597j.m153938c("MicroMsg.VoipDailReport", sb.toString());
    }

    /* renamed from: d */
    public String mo152872d() {
        return "," + this.f317781j;
    }

    /* renamed from: e */
    public void mo152873e() {
        this.f317747B = 0;
        this.f317752G = 0;
        this.f317753H = 0;
        this.f317754I = 0;
        this.f317763R = 0;
        this.f317764S = 0;
        this.f317765T = 0;
        this.f317748C = 0;
        this.f317749D = 0;
        this.f317750E = 0;
        this.f317751F = 0;
        this.f317755J = 0;
        this.f317756K = 0;
        this.f317757L = 0;
        this.f317758M = 0;
        this.f317759N = 0;
        this.f317760O = 0;
        this.f317761P = 0;
        this.f317762Q = 0;
        this.f317784m = 0;
        this.f317785n = 0;
        this.f317786o = 0;
        this.f317787p = 0;
        this.f317788q = 0;
        this.f317789r = 0;
        this.f317790s = 0;
        this.f317791t = 0;
        this.f317792u = 0;
        this.f317793v = 0;
        this.f317794w = 0;
        this.f317795x = 0;
        this.f317796y = 0;
        this.f317797z = 0;
        this.f317746A = 0;
        Arrays.fill(this.f317766U, 0);
    }

    /* renamed from: f */
    public void mo152874f(long j) {
        Log.m105919d("MicroMsg.VoipDailReport", "danialguo set cgirtt %d", Long.valueOf(j));
        if (j <= 800000000) {
            if (0 <= j && j <= 500) {
                long[] jArr = this.f317766U;
                jArr[0] = jArr[0] + 1;
            } else if (500 < j && j <= 1000) {
                long[] jArr2 = this.f317766U;
                jArr2[1] = jArr2[1] + 1;
            } else if (1000 < j && j <= 2000) {
                long[] jArr3 = this.f317766U;
                jArr3[2] = jArr3[2] + 1;
            } else if (2000 < j && j <= 4000) {
                long[] jArr4 = this.f317766U;
                jArr4[3] = jArr4[3] + 1;
            } else if (4000 >= j || j > 8000) {
                long[] jArr5 = this.f317766U;
                jArr5[5] = jArr5[5] + 1;
            } else {
                long[] jArr6 = this.f317766U;
                jArr6[4] = jArr6[4] + 1;
            }
        }
    }
}
