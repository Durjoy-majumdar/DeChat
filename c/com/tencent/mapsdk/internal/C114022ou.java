package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;

/* renamed from: com.tencent.mapsdk.internal.ou */
public class C114022ou extends C114023ov implements C24211ig {

    /* renamed from: E */
    public static final int f341023E = 0;

    /* renamed from: F */
    public static final int f341024F = 1;

    /* renamed from: G */
    public static final int f341025G = 2;

    /* renamed from: I */
    public static final int f341026I = 1;

    /* renamed from: J */
    public static final int f341027J = 2;

    /* renamed from: K */
    public static final int f341028K = 3;

    /* renamed from: L */
    public static final int f341029L = 4;

    /* renamed from: H */
    public int f341030H;

    /* renamed from: M */
    public float f341031M = 1.0f;

    /* renamed from: N */
    public float f341032N = 1.0f;

    /* renamed from: O */
    public float f341033O = 1.0f;

    /* renamed from: P */
    public float f341034P = 0.0f;

    /* renamed from: Q */
    public float f341035Q = 0.0f;

    /* renamed from: R */
    public float f341036R = 0.0f;

    /* renamed from: a */
    private C104562a f341037a;

    /* renamed from: b */
    private C104563b f341038b;

    /* renamed from: com.tencent.mapsdk.internal.ou$a */
    public interface C104562a {
        /* renamed from: b */
        boolean mo147884b();

        /* renamed from: c */
        String mo147885c();

        /* renamed from: d */
        Bitmap mo147886d();
    }

    /* renamed from: com.tencent.mapsdk.internal.ou$b */
    public interface C104563b {
        /* renamed from: a */
        void mo147887a();
    }

    /* renamed from: a */
    public final synchronized void mo172594a(C104562a aVar) {
        this.f341037a = aVar;
    }

    /* renamed from: b */
    public void mo172589b(int i) {
        this.f341030H = i;
        this.f341031M = 1.0f;
        this.f341032N = 1.0f;
        this.f341033O = 1.0f;
        this.f341034P = 0.0f;
        this.f341035Q = 0.0f;
    }

    /* renamed from: a */
    private int mo172582a() {
        return this.f341030H;
    }

    /* renamed from: a */
    public final void mo40962a(int i, Object obj) {
        if (i == 1) {
            this.f341031M = ((Number) obj).floatValue();
        } else if (i == 2) {
            C113732fo foVar = (C113732fo) obj;
            this.f341032N = (float) foVar.f340215a;
            this.f341033O = (float) foVar.f340216b;
        } else if (i == 3) {
            C113732fo foVar2 = (C113732fo) obj;
            this.f341034P = (float) foVar2.f340215a;
            this.f341035Q = (float) foVar2.f340216b;
        } else if (i == 4) {
            this.f341036R = ((Number) obj).floatValue();
        }
    }
}
