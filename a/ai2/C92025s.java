package ai2;

import android.graphics.Matrix;
import ci2.C28565b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import pe3.C47465a;
import te3.xf4;

/* renamed from: ai2.s */
public final class C92025s extends C92007a implements C103373k {

    /* renamed from: g */
    public CharSequence f263526g;

    /* renamed from: h */
    public int f263527h;

    /* renamed from: i */
    public int f263528i;

    /* renamed from: j */
    public int f263529j;

    /* renamed from: k */
    public String f263530k;

    /* renamed from: l */
    public final C28565b f263531l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92025s(CharSequence charSequence, int i, int i2, int i3, Matrix matrix) {
        super(C92011d.TEXT);
        C87412m.m108594g(matrix, "matrix");
        this.f263530k = "";
        this.f263531l = new C28565b((String) null, 0, 3, (C8480h) null);
        this.f263526g = charSequence;
        this.f263527h = i;
        this.f263528i = i2;
        this.f263529j = i3;
        this.f263407f.set(matrix);
        Log.m105924i("MicroMsg.TextItem", toString());
    }

    /* renamed from: a */
    public boolean mo125979a() {
        return mo125980b().f78428a.length() > 0;
    }

    /* renamed from: b */
    public C28565b mo125980b() {
        return this.f263531l;
    }

    /* renamed from: c */
    public void mo125981c(String str, long j) {
        C87412m.m108594g(str, "path");
        C28565b bVar = this.f263531l;
        bVar.getClass();
        bVar.f78428a = str;
        this.f263531l.f78429b = j;
    }

    public C47465a toProtoBuf() {
        xf4 xf4 = new xf4();
        xf4.f299886d = String.valueOf(this.f263526g);
        xf4.f299889g = mo125864f(this.f263407f);
        xf4.f299888f = this.f263528i;
        xf4.f299887e = this.f263527h;
        xf4.f299892j = this.f263530k;
        xf4.f299891i = mo125863e();
        return xf4;
    }

    public String toString() {
        return '[' + hashCode() + "]text:" + this.f263526g + " color:" + this.f263527h + " bgColor:" + this.f263528i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92025s(CharSequence charSequence, int i, int i2, String str, int i3, Matrix matrix, int i4, C8480h hVar) {
        super(C92011d.TEXT);
        i3 = (i4 & 16) != 0 ? 0 : i3;
        matrix = (i4 & 32) != 0 ? new Matrix() : matrix;
        C87412m.m108594g(str, "font");
        C87412m.m108594g(matrix, "matrix");
        this.f263530k = "";
        this.f263531l = new C28565b((String) null, 0, 3, (C8480h) null);
        this.f263526g = charSequence;
        this.f263527h = i;
        this.f263528i = i2;
        this.f263530k = str;
        this.f263529j = i3;
        this.f263407f.set(matrix);
        Log.m105924i("MicroMsg.TextItem", toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[Catch:{ IOException -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92025s(te3.C64339ea r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.TextItem"
            java.lang.String r1 = "proto"
            gy3.C87412m.m108594g(r10, r1)
            ai2.d r1 = ai2.C92011d.TEXT
            r9.<init>(r1)
            java.lang.String r1 = ""
            r9.f263530k = r1
            ci2.b r8 = new ci2.b
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r6, r7)
            r9.f263531l = r8
            r2 = 0
            te3.xf4 r3 = new te3.xf4     // Catch:{ IOException -> 0x0081 }
            r3.<init>()     // Catch:{ IOException -> 0x0081 }
            te3.qv3 r10 = r10.f182948e     // Catch:{ IOException -> 0x0081 }
            pe3.b r10 = r10.f140574f     // Catch:{ IOException -> 0x0081 }
            byte[] r10 = r10.f257327a     // Catch:{ IOException -> 0x0081 }
            r4 = 0
            if (r10 != 0) goto L_0x002e
            goto L_0x003e
        L_0x002e:
            r3.parseFrom(r10)     // Catch:{ Exception -> 0x0032 }
            goto L_0x003f
        L_0x0032:
            r10 = move-exception
            java.lang.String r3 = "safeParser"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0081 }
            r5[r2] = r10     // Catch:{ IOException -> 0x0081 }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r1, r5)     // Catch:{ IOException -> 0x0081 }
        L_0x003e:
            r3 = r4
        L_0x003f:
            if (r3 == 0) goto L_0x0089
            java.lang.String r10 = r3.f299886d     // Catch:{ IOException -> 0x0081 }
            r9.f263526g = r10     // Catch:{ IOException -> 0x0081 }
            int r10 = r3.f299887e     // Catch:{ IOException -> 0x0081 }
            r9.f263527h = r10     // Catch:{ IOException -> 0x0081 }
            int r10 = r3.f299888f     // Catch:{ IOException -> 0x0081 }
            r9.f263528i = r10     // Catch:{ IOException -> 0x0081 }
            int r10 = r3.f299890h     // Catch:{ IOException -> 0x0081 }
            r9.f263529j = r10     // Catch:{ IOException -> 0x0081 }
            android.graphics.Matrix r10 = r9.f263407f     // Catch:{ IOException -> 0x0081 }
            te3.wr4 r1 = r3.f299889g     // Catch:{ IOException -> 0x0081 }
            java.lang.String r4 = "it.matrix"
            gy3.C87412m.m108593f(r1, r4)     // Catch:{ IOException -> 0x0081 }
            float[] r1 = r9.mo125865g(r1)     // Catch:{ IOException -> 0x0081 }
            r10.setValues(r1)     // Catch:{ IOException -> 0x0081 }
            java.lang.String r10 = r3.f299892j     // Catch:{ IOException -> 0x0081 }
            java.lang.String r1 = "it.font"
            gy3.C87412m.m108593f(r10, r1)     // Catch:{ IOException -> 0x0081 }
            r9.f263530k = r10     // Catch:{ IOException -> 0x0081 }
            te3.d70 r10 = r3.f299891i     // Catch:{ IOException -> 0x0081 }
            if (r10 == 0) goto L_0x0079
            ci2.d r1 = r9.f263404c     // Catch:{ IOException -> 0x0081 }
            long r3 = r10.f298084d     // Catch:{ IOException -> 0x0081 }
            long r5 = r10.f298085e     // Catch:{ IOException -> 0x0081 }
            r1.mo146050d(r3, r5)     // Catch:{ IOException -> 0x0081 }
        L_0x0079:
            java.lang.String r10 = r9.toString()     // Catch:{ IOException -> 0x0081 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)     // Catch:{ IOException -> 0x0081 }
            goto L_0x0089
        L_0x0081:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "LocationItem parse error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r10, r2, r1)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai2.C92025s.<init>(te3.ea):void");
    }
}
