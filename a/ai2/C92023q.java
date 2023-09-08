package ai2;

import android.graphics.Matrix;
import android.graphics.RectF;
import ci2.C28565b;
import gy3.C8480h;
import gy3.C87412m;
import pe3.C47465a;
import te3.C101774ea3;

/* renamed from: ai2.q */
public final class C92023q extends C92007a implements C103373k {

    /* renamed from: g */
    public final String f263508g;

    /* renamed from: h */
    public long f263509h;

    /* renamed from: i */
    public String f263510i;

    /* renamed from: j */
    public int f263511j;

    /* renamed from: k */
    public int f263512k;

    /* renamed from: l */
    public float f263513l;

    /* renamed from: m */
    public float f263514m;

    /* renamed from: n */
    public float f263515n;

    /* renamed from: o */
    public float f263516o;

    /* renamed from: p */
    public final RectF f263517p;

    /* renamed from: q */
    public final C28565b f263518q;

    /* renamed from: r */
    public C92018l f263519r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92023q(String str, Matrix matrix, int i, C8480h hVar) {
        super(C92011d.PAG_STICKER);
        matrix = (i & 2) != 0 ? new Matrix() : matrix;
        C87412m.m108594g(str, "pagPath");
        C87412m.m108594g(matrix, "matrix");
        this.f263510i = "";
        this.f263511j = 160;
        this.f263512k = 160;
        this.f263515n = 1.0f;
        this.f263517p = new RectF();
        this.f263518q = new C28565b((String) null, 0, 3, (C8480h) null);
        this.f263508g = str;
        this.f263407f.set(matrix);
    }

    /* renamed from: a */
    public boolean mo125979a() {
        return mo125980b().f78428a.length() > 0;
    }

    /* renamed from: b */
    public C28565b mo125980b() {
        return this.f263518q;
    }

    /* renamed from: c */
    public void mo125981c(String str, long j) {
        C87412m.m108594g(str, "path");
        C28565b bVar = this.f263518q;
        bVar.getClass();
        bVar.f78428a = str;
        this.f263518q.f78429b = j;
    }

    /* renamed from: i */
    public final float mo125982i() {
        return this.f263513l;
    }

    /* renamed from: j */
    public final float mo125983j() {
        return this.f263514m;
    }

    /* renamed from: k */
    public final RectF mo125984k() {
        return this.f263517p;
    }

    /* renamed from: l */
    public final long mo125985l() {
        return this.f263509h;
    }

    /* renamed from: m */
    public final float mo125986m() {
        return this.f263516o;
    }

    /* renamed from: n */
    public final float mo125987n() {
        return this.f263515n;
    }

    /* renamed from: o */
    public final String mo125988o() {
        return this.f263510i;
    }

    /* renamed from: p */
    public final void mo125989p(C92018l lVar) {
        this.f263519r = lVar;
    }

    /* renamed from: q */
    public final void mo125990q(long j) {
        this.f263509h = j;
    }

    /* renamed from: r */
    public final void mo125991r(int i) {
        this.f263512k = i;
    }

    /* renamed from: s */
    public final void mo125992s(float f) {
        this.f263515n = f;
    }

    /* renamed from: t */
    public final void mo125993t(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f263510i = str;
    }

    public C47465a toProtoBuf() {
        C101774ea3 ea32 = new C101774ea3();
        ea32.f298199d = this.f263508g;
        ea32.f298200e = this.f263510i;
        ea32.f298201f = mo125864f(this.f263407f);
        ea32.f298202g = mo125863e();
        return ea32;
    }

    /* renamed from: u */
    public final void mo125994u(int i) {
        this.f263511j = i;
    }

    /* renamed from: v */
    public final void mo125995v(Matrix matrix) {
        C87412m.m108594g(matrix, "matrix");
        float[] fArr = {0.0f, 0.0f};
        matrix.mapPoints(fArr, new float[]{((float) this.f263511j) / 2.0f, ((float) this.f263512k) / 2.0f});
        this.f263513l = fArr[0];
        this.f263514m = fArr[1] - this.f263517p.top;
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        double d = (double) fArr2[0];
        double d2 = (double) fArr2[3];
        double d3 = (double) fArr2[4];
        this.f263515n = (float) Math.sqrt((d * d) + (d2 * d2));
        float atan2 = (float) Math.atan2(d2, d3);
        this.f263516o = atan2;
        C92018l lVar = this.f263519r;
        if (lVar != null) {
            lVar.mo125918c(this.f263513l, this.f263514m, this.f263515n, atan2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92023q(te3.C64339ea r9) {
        /*
            r8 = this;
            java.lang.String r0 = "proto"
            gy3.C87412m.m108594g(r9, r0)
            ai2.d r0 = ai2.C92011d.PAG_STICKER
            r8.<init>(r0)
            java.lang.String r0 = ""
            r8.f263510i = r0
            r1 = 160(0xa0, float:2.24E-43)
            r8.f263511j = r1
            r8.f263512k = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.f263515n = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r8.f263517p = r1
            ci2.b r1 = new ci2.b
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r2 = r1
            r2.<init>(r3, r4, r6, r7)
            r8.f263518q = r1
            te3.ea3 r1 = new te3.ea3
            r1.<init>()
            te3.qv3 r9 = r9.f182948e
            pe3.b r9 = r9.f140574f
            byte[] r9 = r9.f257327a
            if (r9 != 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            r1.parseFrom(r9)     // Catch:{ Exception -> 0x003f }
            goto L_0x004d
        L_0x003f:
            r9 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            java.lang.String r9 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r0, r1)
        L_0x004c:
            r1 = 0
        L_0x004d:
            if (r1 == 0) goto L_0x0084
            java.lang.String r0 = r1.f298199d
            java.lang.String r9 = "it.pagPath"
            gy3.C87412m.m108593f(r0, r9)
            java.lang.String r9 = r1.f298200e
            java.lang.String r2 = "it.text"
            gy3.C87412m.m108593f(r9, r2)
            r8.f263510i = r9
            android.graphics.Matrix r9 = r8.f263407f
            te3.wr4 r2 = r1.f298201f
            java.lang.String r3 = "it.matrix"
            gy3.C87412m.m108593f(r2, r3)
            float[] r2 = r8.mo125865g(r2)
            r9.setValues(r2)
            android.graphics.Matrix r9 = r8.f263407f
            r8.mo125995v(r9)
            te3.d70 r9 = r1.f298202g
            if (r9 == 0) goto L_0x0084
            ci2.d r1 = r8.f263404c
            long r2 = r9.f298084d
            long r4 = r9.f298085e
            r1.mo146050d(r2, r4)
        L_0x0084:
            r8.f263508g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai2.C92023q.<init>(te3.ea):void");
    }
}
