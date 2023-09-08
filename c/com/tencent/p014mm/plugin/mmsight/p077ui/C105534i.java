package com.tencent.p014mm.plugin.mmsight.p077ui;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.i */
public final class C105534i {

    /* renamed from: a */
    public final float f313932a;

    /* renamed from: b */
    public final float f313933b;

    /* renamed from: c */
    public final C0000n0 f313934c = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));

    /* renamed from: d */
    public C53973z1 f313935d;

    /* renamed from: e */
    public boolean f313936e;

    /* renamed from: f */
    public float f313937f;

    /* renamed from: g */
    public long f313938g;

    /* renamed from: h */
    public long f313939h;

    /* renamed from: i */
    public float f313940i;

    /* renamed from: j */
    public boolean f313941j;

    /* renamed from: k */
    public C105516a f313942k;

    public C105534i(float f, float f2) {
        this.f313932a = f;
        this.f313933b = f2;
        Log.m105924i("MicroMsg.ImproveProgressHandlerAnimator", "init >> " + f + ", " + f2);
        if (f2 > 35000.0f) {
            this.f313936e = true;
        }
    }
}
